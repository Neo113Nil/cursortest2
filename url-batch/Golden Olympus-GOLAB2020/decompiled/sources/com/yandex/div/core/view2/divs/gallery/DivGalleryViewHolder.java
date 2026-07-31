package com.yandex.div.core.view2.divs.gallery;

import O1.Z;
import com.yandex.div.R$id;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.divs.DivCollectionViewHolder;
import com.yandex.div.core.widget.DivViewWrapper;
import com.yandex.div.internal.KLog;
import com.yandex.div.logging.Severity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class DivGalleryViewHolder extends DivCollectionViewHolder {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final DivBinder divBinder;

    @NotNull
    private final DivViewWrapper rootView;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivGalleryViewHolder(@NotNull BindingContext parentContext, @NotNull DivViewWrapper rootView, @NotNull DivBinder divBinder, @NotNull DivViewCreator viewCreator, @NotNull DivStatePath path) {
        super(rootView, parentContext, divBinder, viewCreator, path);
        Intrinsics.checkNotNullParameter(parentContext, "parentContext");
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(divBinder, "divBinder");
        Intrinsics.checkNotNullParameter(viewCreator, "viewCreator");
        Intrinsics.checkNotNullParameter(path, "path");
        this.rootView = rootView;
        this.divBinder = divBinder;
    }

    public final void bind(@NotNull BindingContext bindingContext, @NotNull Z div, int i4, int i5) {
        Intrinsics.checkNotNullParameter(bindingContext, "bindingContext");
        Intrinsics.checkNotNullParameter(div, "div");
        bind(bindingContext, div, i5);
        this.rootView.setTag(R$id.div_gallery_item_index, Integer.valueOf(i4));
        this.divBinder.attachIndicators$div_release();
    }

    @Override // com.yandex.div.core.view2.divs.DivCollectionViewHolder
    protected void logReuseError() {
        KLog kLog = KLog.INSTANCE;
        if (kLog.isAtLeast(Severity.DEBUG)) {
            kLog.print(3, "DivGalleryViewHolder", "Gallery holder reuse failed");
        }
    }
}
