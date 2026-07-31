package androidx.compose.ui.focus;

import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FocusOrderModifier.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a)\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\t"}, d2 = {"Landroidx/compose/ui/focus/FocusModifier;", "Landroidx/compose/ui/focus/FocusDirection;", "focusDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/focus/FocusRequester;", "customFocusSearch--OM-vw8", "(Landroidx/compose/ui/focus/FocusModifier;ILandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/focus/FocusRequester;", "customFocusSearch", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FocusOrderModifierKt {

    /* compiled from: FocusOrderModifier.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            iArr[LayoutDirection.Ltr.ordinal()] = 1;
            iArr[LayoutDirection.Rtl.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: customFocusSearch--OM-vw8, reason: not valid java name */
    public static final FocusRequester m1264customFocusSearchOMvw8(FocusModifier customFocusSearch, int i, LayoutDirection layoutDirection) {
        FocusRequester end;
        Intrinsics.checkNotNullParameter(customFocusSearch, "$this$customFocusSearch");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.m1247equalsimpl0(i, companion.m1254getNextdhqQ8s())) {
            return customFocusSearch.getFocusProperties().getNext();
        }
        if (FocusDirection.m1247equalsimpl0(i, companion.m1256getPreviousdhqQ8s())) {
            return customFocusSearch.getFocusProperties().getPrevious();
        }
        if (FocusDirection.m1247equalsimpl0(i, companion.m1258getUpdhqQ8s())) {
            return customFocusSearch.getFocusProperties().getUp();
        }
        if (FocusDirection.m1247equalsimpl0(i, companion.m1251getDowndhqQ8s())) {
            return customFocusSearch.getFocusProperties().getDown();
        }
        if (FocusDirection.m1247equalsimpl0(i, companion.m1253getLeftdhqQ8s())) {
            int i2 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i2 == 1) {
                end = customFocusSearch.getFocusProperties().getStart();
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                end = customFocusSearch.getFocusProperties().getEnd();
            }
            if (Intrinsics.areEqual(end, FocusRequester.INSTANCE.getDefault())) {
                end = null;
            }
            if (end == null) {
                return customFocusSearch.getFocusProperties().getLeft();
            }
        } else if (FocusDirection.m1247equalsimpl0(i, companion.m1257getRightdhqQ8s())) {
            int i3 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i3 == 1) {
                end = customFocusSearch.getFocusProperties().getEnd();
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                end = customFocusSearch.getFocusProperties().getStart();
            }
            if (Intrinsics.areEqual(end, FocusRequester.INSTANCE.getDefault())) {
                end = null;
            }
            if (end == null) {
                return customFocusSearch.getFocusProperties().getRight();
            }
        } else {
            if (FocusDirection.m1247equalsimpl0(i, companion.m1252getIndhqQ8s())) {
                return FocusRequester.INSTANCE.getDefault();
            }
            if (FocusDirection.m1247equalsimpl0(i, companion.m1255getOutdhqQ8s())) {
                return FocusRequester.INSTANCE.getDefault();
            }
            throw new IllegalStateException("invalid FocusDirection");
        }
        return end;
    }
}
