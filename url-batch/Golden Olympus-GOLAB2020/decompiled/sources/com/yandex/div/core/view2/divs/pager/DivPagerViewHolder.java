package com.yandex.div.core.view2.divs.pager;

import O1.E9;
import O1.EnumC1091v2;
import O1.EnumC1109w2;
import O1.InterfaceC0752c3;
import O1.Z;
import android.view.View;
import com.yandex.div.R$id;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.DivVisibilityActionTracker;
import com.yandex.div.core.view2.divs.DivCollectionViewHolder;
import com.yandex.div.internal.KLog;
import com.yandex.div.internal.widget.DivLayoutParams;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.logging.Severity;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class DivPagerViewHolder extends DivCollectionViewHolder {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private final boolean accessibilityEnabled;

    @NotNull
    private final Function0<E9.c> crossAxisAlignment;

    @NotNull
    private final Function0<Boolean> isHorizontal;

    @NotNull
    private final DivPagerPageLayout pageLayout;

    @NotNull
    private final BindingContext parentContext;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v2, types: [android.view.View$OnAttachStateChangeListener, com.yandex.div.core.view2.divs.pager.DivPagerViewHolder$special$$inlined$doOnEveryDetach$1] */
    public DivPagerViewHolder(@NotNull BindingContext parentContext, @NotNull DivPagerPageLayout pageLayout, @NotNull DivBinder divBinder, @NotNull DivViewCreator viewCreator, @NotNull DivStatePath path, boolean z4, @NotNull Function0<Boolean> isHorizontal, @NotNull Function0<? extends E9.c> crossAxisAlignment) {
        super(pageLayout, parentContext, divBinder, viewCreator, path);
        Intrinsics.checkNotNullParameter(parentContext, "parentContext");
        Intrinsics.checkNotNullParameter(pageLayout, "pageLayout");
        Intrinsics.checkNotNullParameter(divBinder, "divBinder");
        Intrinsics.checkNotNullParameter(viewCreator, "viewCreator");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(isHorizontal, "isHorizontal");
        Intrinsics.checkNotNullParameter(crossAxisAlignment, "crossAxisAlignment");
        this.parentContext = parentContext;
        this.pageLayout = pageLayout;
        this.accessibilityEnabled = z4;
        this.isHorizontal = isHorizontal;
        this.crossAxisAlignment = crossAxisAlignment;
        final View itemView = this.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        final ?? r9 = new View.OnAttachStateChangeListener() { // from class: com.yandex.div.core.view2.divs.pager.DivPagerViewHolder$special$$inlined$doOnEveryDetach$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(@NotNull View view) {
                Intrinsics.checkNotNullParameter(view, "view");
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(@NotNull View view) {
                Z oldDiv;
                BindingContext bindingContext;
                BindingContext bindingContext2;
                Intrinsics.checkNotNullParameter(view, "view");
                oldDiv = DivPagerViewHolder.this.getOldDiv();
                if (oldDiv == null) {
                    return;
                }
                bindingContext = DivPagerViewHolder.this.parentContext;
                DivVisibilityActionTracker visibilityActionTracker = bindingContext.getDivView().getDiv2Component$div_release().getVisibilityActionTracker();
                bindingContext2 = DivPagerViewHolder.this.parentContext;
                visibilityActionTracker.startTrackingViewsHierarchy(bindingContext2, view, oldDiv);
            }
        };
        itemView.addOnAttachStateChangeListener(r9);
        new Disposable() { // from class: com.yandex.div.core.view2.divs.pager.DivPagerViewHolder$special$$inlined$doOnEveryDetach$2
            @Override // com.yandex.div.core.Disposable, java.lang.AutoCloseable, java.io.Closeable
            public final void close() {
                itemView.removeOnAttachStateChangeListener(r9);
            }
        };
    }

    private final void setCrossAxisAlignment(DivLayoutParams divLayoutParams, InterfaceC0752c3 interfaceC0752c3, ExpressionResolver expressionResolver) {
        Enum r32;
        Expression s4 = ((Boolean) this.isHorizontal.invoke()).booleanValue() ? interfaceC0752c3.s() : interfaceC0752c3.l();
        if (s4 == null || (r32 = (Enum) s4.evaluate(expressionResolver)) == null) {
            r32 = (Enum) this.crossAxisAlignment.invoke();
        }
        int i4 = 17;
        if (((Boolean) this.isHorizontal.invoke()).booleanValue()) {
            if (r32 != E9.c.CENTER && r32 != EnumC1109w2.CENTER) {
                i4 = (r32 == E9.c.END || r32 == EnumC1109w2.BOTTOM) ? 80 : 48;
            }
        } else if (r32 != E9.c.CENTER && r32 != EnumC1091v2.CENTER) {
            i4 = (r32 == E9.c.END || r32 == EnumC1091v2.END) ? 8388613 : r32 == EnumC1091v2.LEFT ? 3 : r32 == EnumC1091v2.RIGHT ? 5 : 8388611;
        }
        divLayoutParams.setGravity(i4);
        this.pageLayout.requestLayout();
    }

    public final void bind(@NotNull BindingContext bindingContext, @NotNull Z div, int i4, int i5) {
        Intrinsics.checkNotNullParameter(bindingContext, "bindingContext");
        Intrinsics.checkNotNullParameter(div, "div");
        bind(bindingContext, div, i5);
        View child = this.pageLayout.getChild();
        Object layoutParams = child != null ? child.getLayoutParams() : null;
        DivLayoutParams divLayoutParams = layoutParams instanceof DivLayoutParams ? (DivLayoutParams) layoutParams : null;
        if (divLayoutParams != null) {
            setCrossAxisAlignment(divLayoutParams, div.b(), bindingContext.getExpressionResolver());
        }
        if (this.accessibilityEnabled) {
            this.pageLayout.setTag(R$id.div_pager_item_clip_id, Integer.valueOf(i4));
        }
    }

    @Override // com.yandex.div.core.view2.divs.DivCollectionViewHolder
    protected void logReuseError() {
        KLog kLog = KLog.INSTANCE;
        if (kLog.isAtLeast(Severity.DEBUG)) {
            kLog.print(3, "DivPagerViewHolder", "Pager holder reuse failed");
        }
    }
}
