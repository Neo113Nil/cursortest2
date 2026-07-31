package com.yandex.div.core;

import O1.Bc;
import O1.C1013qd;
import O1.Mf;
import O1.X2;
import O1.Z;
import android.graphics.drawable.PictureDrawable;
import com.yandex.div.core.DivPreloader;
import com.yandex.div.core.extension.DivExtensionController;
import com.yandex.div.core.images.CachedBitmap;
import com.yandex.div.core.images.DivImageDownloadCallback;
import com.yandex.div.core.images.LoadReference;
import com.yandex.div.core.player.DivPlayerPreloader;
import com.yandex.div.core.view2.DivImagePreloader;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.internal.core.DivVisitor;
import com.yandex.div.internal.util.UiThreadHandler;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public class DivPreloader {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final Callback NO_CALLBACK = new Callback() { // from class: m1.e
        @Override // com.yandex.div.core.DivPreloader.Callback
        public final void finish(boolean z4) {
            DivPreloader.NO_CALLBACK$lambda$0(z4);
        }
    };

    @NotNull
    private final DivCustomContainerViewAdapter customContainerViewAdapter;

    @NotNull
    private final DivExtensionController extensionController;

    @Nullable
    private final DivImagePreloader imagePreloader;

    @NotNull
    private final PreloadFilter preloadFilter;

    @NotNull
    private final DivPlayerPreloader videoPreloader;

    @Metadata
    public interface Callback {
        void finish(boolean z4);
    }

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Callback getNO_CALLBACK$div_release() {
            return DivPreloader.NO_CALLBACK;
        }

        private Companion() {
        }
    }

    @Metadata
    public static final class DownloadCallback extends DivImageDownloadCallback {

        @NotNull
        private final Callback callback;
        private int downloadsLeftCount;
        private int failures;
        private boolean started;

        public DownloadCallback(@NotNull Callback callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.callback = callback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void done() {
            if (!UiThreadHandler.isMainThread()) {
                UiThreadHandler.get().post(new Runnable() { // from class: com.yandex.div.core.DivPreloader$DownloadCallback$done$$inlined$runOnUiThread$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        DivPreloader.DownloadCallback.this.downloadsLeftCount--;
                        if (DivPreloader.DownloadCallback.this.downloadsLeftCount == 0 && DivPreloader.DownloadCallback.this.started) {
                            DivPreloader.DownloadCallback.this.callback.finish(DivPreloader.DownloadCallback.this.failures != 0);
                        }
                    }
                });
                return;
            }
            this.downloadsLeftCount--;
            if (this.downloadsLeftCount == 0 && this.started) {
                this.callback.finish(this.failures != 0);
            }
        }

        @Override // com.yandex.div.core.images.DivImageDownloadCallback
        public void onError() {
            if (!UiThreadHandler.isMainThread()) {
                UiThreadHandler.get().post(new Runnable() { // from class: com.yandex.div.core.DivPreloader$DownloadCallback$onError$$inlined$runOnUiThread$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        DivPreloader.DownloadCallback.this.failures++;
                        DivPreloader.DownloadCallback.this.done();
                    }
                });
            } else {
                this.failures++;
                done();
            }
        }

        public final void onFullPreloadStarted() {
            if (!UiThreadHandler.isMainThread()) {
                UiThreadHandler.get().post(new Runnable() { // from class: com.yandex.div.core.DivPreloader$DownloadCallback$onFullPreloadStarted$$inlined$runOnUiThread$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        DivPreloader.DownloadCallback.this.started = true;
                        if (DivPreloader.DownloadCallback.this.downloadsLeftCount == 0) {
                            DivPreloader.DownloadCallback.this.callback.finish(DivPreloader.DownloadCallback.this.failures != 0);
                        }
                    }
                });
                return;
            }
            this.started = true;
            if (this.downloadsLeftCount == 0) {
                this.callback.finish(this.failures != 0);
            }
        }

        public final void onSingleLoadingStarted() {
            if (UiThreadHandler.isMainThread()) {
                this.downloadsLeftCount++;
            } else {
                UiThreadHandler.get().post(new Runnable() { // from class: com.yandex.div.core.DivPreloader$DownloadCallback$onSingleLoadingStarted$$inlined$runOnUiThread$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        DivPreloader.DownloadCallback.this.downloadsLeftCount++;
                    }
                });
            }
        }

        @Override // com.yandex.div.core.images.DivImageDownloadCallback
        public void onSuccess(@NotNull CachedBitmap cachedBitmap) {
            Intrinsics.checkNotNullParameter(cachedBitmap, "cachedBitmap");
            done();
        }

        @Override // com.yandex.div.core.images.DivImageDownloadCallback
        public void onSuccess(@NotNull PictureDrawable pictureDrawable) {
            Intrinsics.checkNotNullParameter(pictureDrawable, "pictureDrawable");
            done();
        }
    }

    @Metadata
    public interface PreloadFilter {

        @NotNull
        public static final Companion Companion = Companion.$$INSTANCE;

        @NotNull
        public static final PreloadFilter ONLY_PRELOAD_REQUIRED_FILTER = new PreloadFilter() { // from class: com.yandex.div.core.DivPreloader$PreloadFilter$Companion$ONLY_PRELOAD_REQUIRED_FILTER$1
            @Override // com.yandex.div.core.DivPreloader.PreloadFilter
            public boolean shouldPreloadBackground(@NotNull X2 background, @NotNull ExpressionResolver resolver) {
                Intrinsics.checkNotNullParameter(background, "background");
                Intrinsics.checkNotNullParameter(resolver, "resolver");
                if (background instanceof X2.c) {
                    return ((Boolean) ((X2.c) background).c().f4326f.evaluate(resolver)).booleanValue();
                }
                return false;
            }

            @Override // com.yandex.div.core.DivPreloader.PreloadFilter
            public boolean shouldPreloadContent(@NotNull Z div, @NotNull ExpressionResolver resolver) {
                Intrinsics.checkNotNullParameter(div, "div");
                Intrinsics.checkNotNullParameter(resolver, "resolver");
                if (div instanceof Z.s) {
                    return ((Boolean) ((Z.s) div).c().f2650A.evaluate(resolver)).booleanValue();
                }
                if (div instanceof Z.h) {
                    return ((Boolean) ((Z.h) div).c().f4218H.evaluate(resolver)).booleanValue();
                }
                if (div instanceof Z.f) {
                    return ((Boolean) ((Z.f) div).c().f8743E.evaluate(resolver)).booleanValue();
                }
                return false;
            }
        };

        @NotNull
        public static final PreloadFilter PRELOAD_ALL_FILTER = new PreloadFilter() { // from class: com.yandex.div.core.DivPreloader$PreloadFilter$Companion$PRELOAD_ALL_FILTER$1
            @Override // com.yandex.div.core.DivPreloader.PreloadFilter
            public boolean shouldPreloadBackground(@NotNull X2 background, @NotNull ExpressionResolver resolver) {
                Intrinsics.checkNotNullParameter(background, "background");
                Intrinsics.checkNotNullParameter(resolver, "resolver");
                return true;
            }

            @Override // com.yandex.div.core.DivPreloader.PreloadFilter
            public boolean shouldPreloadContent(@NotNull Z div, @NotNull ExpressionResolver resolver) {
                Intrinsics.checkNotNullParameter(div, "div");
                Intrinsics.checkNotNullParameter(resolver, "resolver");
                return true;
            }
        };

        @Metadata
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }
        }

        boolean shouldPreloadBackground(@NotNull X2 x22, @NotNull ExpressionResolver expressionResolver);

        boolean shouldPreloadContent(@NotNull Z z4, @NotNull ExpressionResolver expressionResolver);
    }

    @Metadata
    public interface PreloadReference {

        @NotNull
        public static final Companion Companion = Companion.$$INSTANCE;

        @Metadata
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            @NotNull
            private static final PreloadReference EMPTY = new PreloadReference() { // from class: m1.f
                @Override // com.yandex.div.core.DivPreloader.PreloadReference
                public final void cancel() {
                    DivPreloader.PreloadReference.Companion.EMPTY$lambda$0();
                }
            };

            private Companion() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void EMPTY$lambda$0() {
            }

            @NotNull
            public final PreloadReference getEMPTY() {
                return EMPTY;
            }
        }

        void cancel();
    }

    @Metadata
    private final class PreloadVisitor extends DivVisitor<Unit> {

        @NotNull
        private final Callback callback;

        @NotNull
        private final DownloadCallback downloadCallback;

        @NotNull
        private final PreloadFilter preloadFilter;

        @NotNull
        private final ExpressionResolver resolver;
        final /* synthetic */ DivPreloader this$0;

        @NotNull
        private final TicketImpl ticket;

        public PreloadVisitor(@NotNull DivPreloader divPreloader, @NotNull DownloadCallback downloadCallback, @NotNull Callback callback, @NotNull ExpressionResolver resolver, PreloadFilter preloadFilter) {
            Intrinsics.checkNotNullParameter(downloadCallback, "downloadCallback");
            Intrinsics.checkNotNullParameter(callback, "callback");
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            Intrinsics.checkNotNullParameter(preloadFilter, "preloadFilter");
            this.this$0 = divPreloader;
            this.downloadCallback = downloadCallback;
            this.callback = callback;
            this.resolver = resolver;
            this.preloadFilter = preloadFilter;
            this.ticket = new TicketImpl();
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ Unit defaultVisit(Z z4, ExpressionResolver expressionResolver) {
            defaultVisit2(z4, expressionResolver);
            return Unit.f41027a;
        }

        @NotNull
        public final Ticket preload(@NotNull Z div) {
            Intrinsics.checkNotNullParameter(div, "div");
            visit(div, this.resolver);
            return this.ticket;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ Unit visit(Z.c cVar, ExpressionResolver expressionResolver) {
            visit2(cVar, expressionResolver);
            return Unit.f41027a;
        }

        /* renamed from: defaultVisit, reason: avoid collision after fix types in other method */
        protected void defaultVisit2(@NotNull Z data, @NotNull ExpressionResolver resolver) {
            List<LoadReference> preloadImage;
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            DivImagePreloader divImagePreloader = this.this$0.imagePreloader;
            if (divImagePreloader != null && (preloadImage = divImagePreloader.preloadImage(data, resolver, this.preloadFilter, this.downloadCallback)) != null) {
                Iterator<T> it = preloadImage.iterator();
                while (it.hasNext()) {
                    this.ticket.addImageReference((LoadReference) it.next());
                }
            }
            this.this$0.extensionController.preprocessExtensions(data.b(), resolver);
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ Unit visit(Z.d dVar, ExpressionResolver expressionResolver) {
            visit2(dVar, expressionResolver);
            return Unit.f41027a;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ Unit visit(Z.e eVar, ExpressionResolver expressionResolver) {
            visit2(eVar, expressionResolver);
            return Unit.f41027a;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ Unit visit(Z.g gVar, ExpressionResolver expressionResolver) {
            visit2(gVar, expressionResolver);
            return Unit.f41027a;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ Unit visit(Z.k kVar, ExpressionResolver expressionResolver) {
            visit2(kVar, expressionResolver);
            return Unit.f41027a;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ Unit visit(Z.o oVar, ExpressionResolver expressionResolver) {
            visit2(oVar, expressionResolver);
            return Unit.f41027a;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ Unit visit(Z.q qVar, ExpressionResolver expressionResolver) {
            visit2(qVar, expressionResolver);
            return Unit.f41027a;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ Unit visit(Z.s sVar, ExpressionResolver expressionResolver) {
            visit2(sVar, expressionResolver);
            return Unit.f41027a;
        }

        /* renamed from: visit, reason: avoid collision after fix types in other method */
        protected void visit2(@NotNull Z.c data, @NotNull ExpressionResolver resolver) {
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            for (DivItemBuilderResult divItemBuilderResult : DivCollectionExtensionsKt.buildItems(data.c(), (DivViewFacade) null, resolver)) {
                visit(divItemBuilderResult.component1(), divItemBuilderResult.component2());
            }
            defaultVisit2((Z) data, resolver);
        }

        /* renamed from: visit, reason: avoid collision after fix types in other method */
        protected void visit2(@NotNull Z.g data, @NotNull ExpressionResolver resolver) {
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            Iterator<T> it = DivCollectionExtensionsKt.getNonNullItems(data.c()).iterator();
            while (it.hasNext()) {
                visit((Z) it.next(), resolver);
            }
            defaultVisit2((Z) data, resolver);
        }

        /* renamed from: visit, reason: avoid collision after fix types in other method */
        protected void visit2(@NotNull Z.e data, @NotNull ExpressionResolver resolver) {
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            for (DivItemBuilderResult divItemBuilderResult : DivCollectionExtensionsKt.buildItems(data.c(), (DivViewFacade) null, resolver)) {
                visit(divItemBuilderResult.component1(), divItemBuilderResult.component2());
            }
            defaultVisit2((Z) data, resolver);
        }

        /* renamed from: visit, reason: avoid collision after fix types in other method */
        protected void visit2(@NotNull Z.k data, @NotNull ExpressionResolver resolver) {
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            for (DivItemBuilderResult divItemBuilderResult : DivCollectionExtensionsKt.buildItems(data.c(), (DivViewFacade) null, resolver)) {
                visit(divItemBuilderResult.component1(), divItemBuilderResult.component2());
            }
            defaultVisit2((Z) data, resolver);
        }

        /* renamed from: visit, reason: avoid collision after fix types in other method */
        protected void visit2(@NotNull Z.q data, @NotNull ExpressionResolver resolver) {
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            Iterator it = data.c().f7630q.iterator();
            while (it.hasNext()) {
                visit(((C1013qd.c) it.next()).f7643a, resolver);
            }
            defaultVisit2((Z) data, resolver);
        }

        /* renamed from: visit, reason: avoid collision after fix types in other method */
        protected void visit2(@NotNull Z.o data, @NotNull ExpressionResolver resolver) {
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            Iterator it = data.c().f1529y.iterator();
            while (it.hasNext()) {
                Z z4 = ((Bc.c) it.next()).f1536c;
                if (z4 != null) {
                    visit(z4, resolver);
                }
            }
            defaultVisit2((Z) data, resolver);
        }

        /* renamed from: visit, reason: avoid collision after fix types in other method */
        protected void visit2(@NotNull Z.d data, @NotNull ExpressionResolver resolver) {
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            List list = data.c().f7841q;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    visit((Z) it.next(), resolver);
                }
            }
            this.ticket.addReference(this.this$0.customContainerViewAdapter.preload(data.c(), this.callback));
            defaultVisit2((Z) data, resolver);
        }

        /* renamed from: visit, reason: avoid collision after fix types in other method */
        protected void visit2(@NotNull Z.s data, @NotNull ExpressionResolver resolver) {
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            defaultVisit2((Z) data, resolver);
            if (this.preloadFilter.shouldPreloadContent(data, resolver)) {
                ArrayList arrayList = new ArrayList();
                Iterator it = data.c().f2666Q.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Mf) it.next()).f4060d.evaluate(resolver));
                }
                this.ticket.addReference(this.this$0.videoPreloader.preloadVideo(arrayList));
            }
        }
    }

    @Metadata
    public interface Ticket {
        void cancel();
    }

    @Metadata
    public static final class TicketImpl implements Ticket {

        @NotNull
        private final List<PreloadReference> refs = new ArrayList();

        private final PreloadReference toPreloadReference(final LoadReference loadReference) {
            return new PreloadReference() { // from class: com.yandex.div.core.DivPreloader$TicketImpl$toPreloadReference$1
                @Override // com.yandex.div.core.DivPreloader.PreloadReference
                public void cancel() {
                    LoadReference.this.cancel();
                }
            };
        }

        public final void addImageReference(@NotNull LoadReference reference) {
            Intrinsics.checkNotNullParameter(reference, "reference");
            this.refs.add(toPreloadReference(reference));
        }

        public final void addReference(@NotNull PreloadReference reference) {
            Intrinsics.checkNotNullParameter(reference, "reference");
            this.refs.add(reference);
        }

        @Override // com.yandex.div.core.DivPreloader.Ticket
        public void cancel() {
            Iterator<T> it = this.refs.iterator();
            while (it.hasNext()) {
                ((PreloadReference) it.next()).cancel();
            }
        }
    }

    public DivPreloader(@Nullable DivImagePreloader divImagePreloader, @NotNull DivCustomContainerViewAdapter customContainerViewAdapter, @NotNull DivExtensionController extensionController, @NotNull DivPlayerPreloader videoPreloader, @NotNull PreloadFilter preloadFilter) {
        Intrinsics.checkNotNullParameter(customContainerViewAdapter, "customContainerViewAdapter");
        Intrinsics.checkNotNullParameter(extensionController, "extensionController");
        Intrinsics.checkNotNullParameter(videoPreloader, "videoPreloader");
        Intrinsics.checkNotNullParameter(preloadFilter, "preloadFilter");
        this.imagePreloader = divImagePreloader;
        this.customContainerViewAdapter = customContainerViewAdapter;
        this.extensionController = extensionController;
        this.videoPreloader = videoPreloader;
        this.preloadFilter = preloadFilter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void NO_CALLBACK$lambda$0(boolean z4) {
    }

    @NotNull
    public Ticket preload(@NotNull Z div, @NotNull ExpressionResolver resolver, @NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(div, "div");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(callback, "callback");
        DownloadCallback downloadCallback = new DownloadCallback(callback);
        Ticket preload = new PreloadVisitor(this, downloadCallback, callback, resolver, this.preloadFilter).preload(div);
        downloadCallback.onFullPreloadStarted();
        return preload;
    }
}
