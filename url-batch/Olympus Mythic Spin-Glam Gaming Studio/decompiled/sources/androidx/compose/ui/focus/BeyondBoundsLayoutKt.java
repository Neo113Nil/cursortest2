package androidx.compose.ui.focus;

import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.layout.BeyondBoundsLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BeyondBoundsLayout.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a?\u0010\t\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\n"}, d2 = {"T", "Landroidx/compose/ui/focus/FocusModifier;", "Landroidx/compose/ui/focus/FocusDirection;", "direction", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/BeyondBoundsLayout$BeyondBoundsScope;", "block", "searchBeyondBounds--OM-vw8", "(Landroidx/compose/ui/focus/FocusModifier;ILkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "searchBeyondBounds", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BeyondBoundsLayoutKt {
    /* renamed from: searchBeyondBounds--OM-vw8, reason: not valid java name */
    public static final Object m1243searchBeyondBoundsOMvw8(FocusModifier searchBeyondBounds, int i, Function1 block) {
        int m1930getBeforehoxUOeE;
        Intrinsics.checkNotNullParameter(searchBeyondBounds, "$this$searchBeyondBounds");
        Intrinsics.checkNotNullParameter(block, "block");
        BeyondBoundsLayout beyondBoundsLayoutParent = searchBeyondBounds.getBeyondBoundsLayoutParent();
        if (beyondBoundsLayoutParent == null) {
            return null;
        }
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.m1247equalsimpl0(i, companion.m1258getUpdhqQ8s())) {
            m1930getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.INSTANCE.m1928getAbovehoxUOeE();
        } else if (FocusDirection.m1247equalsimpl0(i, companion.m1251getDowndhqQ8s())) {
            m1930getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.INSTANCE.m1931getBelowhoxUOeE();
        } else if (FocusDirection.m1247equalsimpl0(i, companion.m1253getLeftdhqQ8s())) {
            m1930getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.INSTANCE.m1932getLefthoxUOeE();
        } else if (FocusDirection.m1247equalsimpl0(i, companion.m1257getRightdhqQ8s())) {
            m1930getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.INSTANCE.m1933getRighthoxUOeE();
        } else if (FocusDirection.m1247equalsimpl0(i, companion.m1254getNextdhqQ8s())) {
            m1930getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.INSTANCE.m1929getAfterhoxUOeE();
        } else {
            if (!FocusDirection.m1247equalsimpl0(i, companion.m1256getPreviousdhqQ8s())) {
                throw new IllegalStateException("Unsupported direction for beyond bounds layout");
            }
            m1930getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.INSTANCE.m1930getBeforehoxUOeE();
        }
        return beyondBoundsLayoutParent.mo409layouto7g1Pn8(m1930getBeforehoxUOeE, block);
    }
}
