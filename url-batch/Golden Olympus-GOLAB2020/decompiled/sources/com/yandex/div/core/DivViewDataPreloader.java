package com.yandex.div.core;

import O1.Mf;
import O1.Z;
import com.yandex.div.core.DivPreloader;
import com.yandex.div.core.extension.DivExtensionController;
import com.yandex.div.core.images.LoadReference;
import com.yandex.div.core.player.DivPlayerPreloader;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.DivImagePreloader;
import com.yandex.div.internal.core.DivTreeVisitor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public class DivViewDataPreloader {

    @NotNull
    private final DivCustomContainerViewAdapter customContainerViewAdapter;

    @NotNull
    private final DivExtensionController extensionController;

    @Nullable
    private final DivImagePreloader imagePreloader;

    @NotNull
    private final DivPreloader.PreloadFilter preloadFilter;

    @NotNull
    private final DivPlayerPreloader videoPreloader;

    @Metadata
    private final class PreloadVisitor extends DivTreeVisitor<Unit> {

        @NotNull
        private final DivPreloader.Callback callback;

        @NotNull
        private final DivPreloader.DownloadCallback downloadCallback;

        @NotNull
        private final DivPreloader.PreloadFilter preloadFilter;
        final /* synthetic */ DivViewDataPreloader this$0;

        @NotNull
        private final DivPreloader.TicketImpl ticket;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public PreloadVisitor(@NotNull DivViewDataPreloader divViewDataPreloader, @NotNull DivPreloader.DownloadCallback downloadCallback, @NotNull DivPreloader.Callback callback, DivPreloader.PreloadFilter preloadFilter) {
            super(null, 1, 0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(downloadCallback, "downloadCallback");
            Intrinsics.checkNotNullParameter(callback, "callback");
            Intrinsics.checkNotNullParameter(preloadFilter, "preloadFilter");
            this.this$0 = divViewDataPreloader;
            this.downloadCallback = downloadCallback;
            this.callback = callback;
            this.preloadFilter = preloadFilter;
            this.ticket = new DivPreloader.TicketImpl();
        }

        @Override // com.yandex.div.internal.core.DivTreeVisitor
        public /* bridge */ /* synthetic */ Unit defaultVisit(Z z4, BindingContext bindingContext, DivStatePath divStatePath) {
            defaultVisit2(z4, bindingContext, divStatePath);
            return Unit.f41027a;
        }

        @NotNull
        public final DivPreloader.Ticket preload(@NotNull Z div, @NotNull BindingContext context, @NotNull DivStatePath path) {
            Intrinsics.checkNotNullParameter(div, "div");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(path, "path");
            visit(div, context, path);
            return this.ticket;
        }

        @Override // com.yandex.div.internal.core.DivTreeVisitor
        public /* bridge */ /* synthetic */ Unit visit(Z.d dVar, BindingContext bindingContext, DivStatePath divStatePath) {
            visit2(dVar, bindingContext, divStatePath);
            return Unit.f41027a;
        }

        /* renamed from: defaultVisit, reason: avoid collision after fix types in other method */
        protected void defaultVisit2(@NotNull Z data, @NotNull BindingContext context, @NotNull DivStatePath path) {
            List<LoadReference> preloadImage;
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(path, "path");
            DivImagePreloader divImagePreloader = this.this$0.imagePreloader;
            if (divImagePreloader != null && (preloadImage = divImagePreloader.preloadImage(data, context.getExpressionResolver(), this.preloadFilter, this.downloadCallback)) != null) {
                Iterator<T> it = preloadImage.iterator();
                while (it.hasNext()) {
                    this.ticket.addImageReference((LoadReference) it.next());
                }
            }
            this.this$0.extensionController.preprocessExtensions(data.b(), context.getExpressionResolver());
        }

        @Override // com.yandex.div.internal.core.DivTreeVisitor
        public /* bridge */ /* synthetic */ Unit visit(Z.s sVar, BindingContext bindingContext, DivStatePath divStatePath) {
            visit2(sVar, bindingContext, divStatePath);
            return Unit.f41027a;
        }

        /* renamed from: visit, reason: avoid collision after fix types in other method */
        protected void visit2(@NotNull Z.d data, @NotNull BindingContext context, @NotNull DivStatePath path) {
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(path, "path");
            super.visit(data, context, path);
            this.ticket.addReference(this.this$0.customContainerViewAdapter.preload(data.c(), this.callback));
        }

        /* renamed from: visit, reason: avoid collision after fix types in other method */
        protected void visit2(@NotNull Z.s data, @NotNull BindingContext context, @NotNull DivStatePath path) {
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(path, "path");
            defaultVisit2((Z) data, context, path);
            if (this.preloadFilter.shouldPreloadContent(data, context.getExpressionResolver())) {
                ArrayList arrayList = new ArrayList();
                Iterator it = data.c().f2666Q.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Mf) it.next()).f4060d.evaluate(context.getExpressionResolver()));
                }
                this.ticket.addReference(this.this$0.videoPreloader.preloadVideo(arrayList));
            }
        }
    }

    public DivViewDataPreloader(@Nullable DivImagePreloader divImagePreloader, @NotNull DivCustomContainerViewAdapter customContainerViewAdapter, @NotNull DivExtensionController extensionController, @NotNull DivPlayerPreloader videoPreloader, @NotNull DivPreloader.PreloadFilter preloadFilter) {
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

    public static /* synthetic */ DivPreloader.Ticket preload$default(DivViewDataPreloader divViewDataPreloader, Z z4, BindingContext bindingContext, DivStatePath divStatePath, DivPreloader.Callback callback, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: preload");
        }
        if ((i4 & 8) != 0) {
            callback = DivPreloader.Companion.getNO_CALLBACK$div_release();
        }
        return divViewDataPreloader.preload(z4, bindingContext, divStatePath, callback);
    }

    @NotNull
    public DivPreloader.Ticket preload(@NotNull Z div, @NotNull BindingContext context, @NotNull DivStatePath path, @NotNull DivPreloader.Callback callback) {
        Intrinsics.checkNotNullParameter(div, "div");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(callback, "callback");
        DivPreloader.DownloadCallback downloadCallback = new DivPreloader.DownloadCallback(callback);
        DivPreloader.Ticket preload = new PreloadVisitor(this, downloadCallback, callback, this.preloadFilter).preload(div, context, path);
        downloadCallback.onFullPreloadStarted();
        return preload;
    }
}
