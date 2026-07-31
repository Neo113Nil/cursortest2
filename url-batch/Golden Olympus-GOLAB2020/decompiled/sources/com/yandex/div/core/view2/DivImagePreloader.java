package com.yandex.div.core.view2;

import O1.Bc;
import O1.C1013qd;
import O1.Kd;
import O1.X2;
import O1.Z;
import android.net.Uri;
import com.yandex.div.core.DivPreloader;
import com.yandex.div.core.DivViewFacade;
import com.yandex.div.core.images.DivImageLoader;
import com.yandex.div.core.images.LoadReference;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.internal.core.DivVisitor;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public class DivImagePreloader {

    @NotNull
    private final DivImageLoader imageLoader;

    @Metadata
    private final class PreloadVisitor extends DivVisitor<Unit> {

        @NotNull
        private final DivPreloader.DownloadCallback callback;

        @NotNull
        private final DivPreloader.PreloadFilter preloadFilter;

        @NotNull
        private final ArrayList<LoadReference> references;

        @NotNull
        private final ExpressionResolver resolver;
        final /* synthetic */ DivImagePreloader this$0;
        private final boolean visitContainers;

        public PreloadVisitor(@NotNull DivImagePreloader divImagePreloader, @NotNull DivPreloader.DownloadCallback callback, @NotNull ExpressionResolver resolver, DivPreloader.PreloadFilter preloadFilter, boolean z4) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            Intrinsics.checkNotNullParameter(preloadFilter, "preloadFilter");
            this.this$0 = divImagePreloader;
            this.callback = callback;
            this.resolver = resolver;
            this.preloadFilter = preloadFilter;
            this.visitContainers = z4;
            this.references = new ArrayList<>();
        }

        private final void visitBackground(Z z4, ExpressionResolver expressionResolver) {
            List<X2> background = z4.b().getBackground();
            if (background != null) {
                DivImagePreloader divImagePreloader = this.this$0;
                for (X2 x22 : background) {
                    if ((x22 instanceof X2.c) && this.preloadFilter.shouldPreloadBackground(x22, expressionResolver)) {
                        String uri = ((Uri) ((X2.c) x22).c().f4325e.evaluate(expressionResolver)).toString();
                        Intrinsics.checkNotNullExpressionValue(uri, "background.value.imageUr…uate(resolver).toString()");
                        divImagePreloader.preloadImage(uri, this.callback, this.references);
                    }
                }
            }
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ Unit defaultVisit(Z z4, ExpressionResolver expressionResolver) {
            defaultVisit2(z4, expressionResolver);
            return Unit.f41027a;
        }

        @NotNull
        public final List<LoadReference> preload(@NotNull Z div) {
            Intrinsics.checkNotNullParameter(div, "div");
            visit(div, this.resolver);
            return this.references;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ Unit visit(Z.c cVar, ExpressionResolver expressionResolver) {
            visit2(cVar, expressionResolver);
            return Unit.f41027a;
        }

        /* renamed from: defaultVisit, reason: avoid collision after fix types in other method */
        protected void defaultVisit2(@NotNull Z data, @NotNull ExpressionResolver resolver) {
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            visitBackground(data, resolver);
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ Unit visit(Z.e eVar, ExpressionResolver expressionResolver) {
            visit2(eVar, expressionResolver);
            return Unit.f41027a;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ Unit visit(Z.f fVar, ExpressionResolver expressionResolver) {
            visit2(fVar, expressionResolver);
            return Unit.f41027a;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ Unit visit(Z.g gVar, ExpressionResolver expressionResolver) {
            visit2(gVar, expressionResolver);
            return Unit.f41027a;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ Unit visit(Z.h hVar, ExpressionResolver expressionResolver) {
            visit2(hVar, expressionResolver);
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
        public /* bridge */ /* synthetic */ Unit visit(Z.r rVar, ExpressionResolver expressionResolver) {
            visit2(rVar, expressionResolver);
            return Unit.f41027a;
        }

        /* renamed from: visit, reason: avoid collision after fix types in other method */
        protected void visit2(@NotNull Z.r data, @NotNull ExpressionResolver resolver) {
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            defaultVisit2((Z) data, resolver);
            List list = data.c().f3455F;
            if (list != null) {
                DivImagePreloader divImagePreloader = this.this$0;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String uri = ((Uri) ((Kd.d) it.next()).f3545i.evaluate(resolver)).toString();
                    Intrinsics.checkNotNullExpressionValue(uri, "it.url.evaluate(resolver).toString()");
                    divImagePreloader.preloadImage(uri, this.callback, this.references);
                }
            }
        }

        /* renamed from: visit, reason: avoid collision after fix types in other method */
        protected void visit2(@NotNull Z.h data, @NotNull ExpressionResolver resolver) {
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            defaultVisit2((Z) data, resolver);
            if (this.preloadFilter.shouldPreloadContent(data, resolver)) {
                DivImagePreloader divImagePreloader = this.this$0;
                String uri = ((Uri) data.c().f4212B.evaluate(resolver)).toString();
                Intrinsics.checkNotNullExpressionValue(uri, "data.value.imageUrl.evaluate(resolver).toString()");
                divImagePreloader.preloadImage(uri, this.callback, this.references);
            }
        }

        /* renamed from: visit, reason: avoid collision after fix types in other method */
        protected void visit2(@NotNull Z.f data, @NotNull ExpressionResolver resolver) {
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            defaultVisit2((Z) data, resolver);
            if (this.preloadFilter.shouldPreloadContent(data, resolver)) {
                DivImagePreloader divImagePreloader = this.this$0;
                String uri = ((Uri) data.c().f8784u.evaluate(resolver)).toString();
                Intrinsics.checkNotNullExpressionValue(uri, "data.value.gifUrl.evaluate(resolver).toString()");
                divImagePreloader.preloadImageBytes(uri, this.callback, this.references);
            }
        }

        /* renamed from: visit, reason: avoid collision after fix types in other method */
        protected void visit2(@NotNull Z.c data, @NotNull ExpressionResolver resolver) {
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            defaultVisit2((Z) data, resolver);
            if (this.visitContainers) {
                for (DivItemBuilderResult divItemBuilderResult : DivCollectionExtensionsKt.buildItems(data.c(), (DivViewFacade) null, resolver)) {
                    visit(divItemBuilderResult.getDiv(), divItemBuilderResult.getExpressionResolver());
                }
            }
        }

        /* renamed from: visit, reason: avoid collision after fix types in other method */
        protected void visit2(@NotNull Z.g data, @NotNull ExpressionResolver resolver) {
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            defaultVisit2((Z) data, resolver);
            if (this.visitContainers) {
                Iterator<T> it = DivCollectionExtensionsKt.getNonNullItems(data.c()).iterator();
                while (it.hasNext()) {
                    visit((Z) it.next(), resolver);
                }
            }
        }

        /* renamed from: visit, reason: avoid collision after fix types in other method */
        protected void visit2(@NotNull Z.e data, @NotNull ExpressionResolver resolver) {
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            defaultVisit2((Z) data, resolver);
            if (this.visitContainers) {
                for (DivItemBuilderResult divItemBuilderResult : DivCollectionExtensionsKt.buildItems(data.c(), (DivViewFacade) null, resolver)) {
                    visit(divItemBuilderResult.getDiv(), divItemBuilderResult.getExpressionResolver());
                }
            }
        }

        /* renamed from: visit, reason: avoid collision after fix types in other method */
        protected void visit2(@NotNull Z.k data, @NotNull ExpressionResolver resolver) {
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            defaultVisit2((Z) data, resolver);
            if (this.visitContainers) {
                for (DivItemBuilderResult divItemBuilderResult : DivCollectionExtensionsKt.buildItems(data.c(), (DivViewFacade) null, resolver)) {
                    visit(divItemBuilderResult.getDiv(), divItemBuilderResult.getExpressionResolver());
                }
            }
        }

        /* renamed from: visit, reason: avoid collision after fix types in other method */
        protected void visit2(@NotNull Z.q data, @NotNull ExpressionResolver resolver) {
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            defaultVisit2((Z) data, resolver);
            if (this.visitContainers) {
                Iterator it = data.c().f7630q.iterator();
                while (it.hasNext()) {
                    visit(((C1013qd.c) it.next()).f7643a, resolver);
                }
            }
        }

        /* renamed from: visit, reason: avoid collision after fix types in other method */
        protected void visit2(@NotNull Z.o data, @NotNull ExpressionResolver resolver) {
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            defaultVisit2((Z) data, resolver);
            if (this.visitContainers) {
                Iterator it = data.c().f1529y.iterator();
                while (it.hasNext()) {
                    Z z4 = ((Bc.c) it.next()).f1536c;
                    if (z4 != null) {
                        visit(z4, resolver);
                    }
                }
            }
        }
    }

    public DivImagePreloader(@NotNull DivImageLoader imageLoader) {
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        this.imageLoader = imageLoader;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void preloadImageBytes(String str, DivPreloader.DownloadCallback downloadCallback, ArrayList<LoadReference> arrayList) {
        arrayList.add(this.imageLoader.loadImageBytes(str, downloadCallback, -1));
        downloadCallback.onSingleLoadingStarted();
    }

    @NotNull
    public List<LoadReference> preloadImage(@NotNull Z div, @NotNull ExpressionResolver resolver, @NotNull DivPreloader.PreloadFilter preloadFilter, @NotNull DivPreloader.DownloadCallback callback) {
        Intrinsics.checkNotNullParameter(div, "div");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(preloadFilter, "preloadFilter");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return new PreloadVisitor(this, callback, resolver, preloadFilter, false).preload(div);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void preloadImage(String str, DivPreloader.DownloadCallback downloadCallback, ArrayList<LoadReference> arrayList) {
        arrayList.add(this.imageLoader.loadImage(str, downloadCallback, -1));
        downloadCallback.onSingleLoadingStarted();
    }
}
