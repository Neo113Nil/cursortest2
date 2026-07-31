package androidx.compose.material;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: Menu.kt */
@Immutable
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B6\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u001a\b\u0002\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ5\u0010\u0015\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\rH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010&R)\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b(\u0010)\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006*"}, d2 = {"Landroidx/compose/material/DropdownMenuPositionProvider;", "Landroidx/compose/ui/window/PopupPositionProvider;", "Landroidx/compose/ui/unit/DpOffset;", "contentOffset", "Landroidx/compose/ui/unit/Density;", "density", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/IntRect;", "", "onPositionCalculated", "<init>", "(JLandroidx/compose/ui/unit/Density;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "anchorBounds", "Landroidx/compose/ui/unit/IntSize;", "windowSize", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "popupContentSize", "Landroidx/compose/ui/unit/IntOffset;", "calculatePosition-llwVHH4", "(Landroidx/compose/ui/unit/IntRect;JLandroidx/compose/ui/unit/LayoutDirection;J)J", "calculatePosition", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getContentOffset-RKDOV3M", "()J", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "Lkotlin/jvm/functions/Function2;", "getOnPositionCalculated", "()Lkotlin/jvm/functions/Function2;", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DropdownMenuPositionProvider implements PopupPositionProvider {
    private final long contentOffset;
    private final Density density;
    private final Function2 onPositionCalculated;

    public /* synthetic */ DropdownMenuPositionProvider(long j, Density density, Function2 function2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, density, function2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DropdownMenuPositionProvider)) {
            return false;
        }
        DropdownMenuPositionProvider dropdownMenuPositionProvider = (DropdownMenuPositionProvider) other;
        return DpOffset.m2521equalsimpl0(this.contentOffset, dropdownMenuPositionProvider.contentOffset) && Intrinsics.areEqual(this.density, dropdownMenuPositionProvider.density) && Intrinsics.areEqual(this.onPositionCalculated, dropdownMenuPositionProvider.onPositionCalculated);
    }

    public int hashCode() {
        return (((DpOffset.m2524hashCodeimpl(this.contentOffset) * 31) + this.density.hashCode()) * 31) + this.onPositionCalculated.hashCode();
    }

    public String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) DpOffset.m2525toStringimpl(this.contentOffset)) + ", density=" + this.density + ", onPositionCalculated=" + this.onPositionCalculated + ')';
    }

    private DropdownMenuPositionProvider(long j, Density density, Function2 function2) {
        this.contentOffset = j;
        this.density = density;
        this.onPositionCalculated = function2;
    }

    /* compiled from: Menu.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroidx/compose/ui/unit/IntRect;", "<anonymous parameter 1>", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: androidx.compose.material.DropdownMenuPositionProvider$1, reason: invalid class name */
    final class AnonymousClass1 extends Lambda implements Function2 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(2);
        }

        public final void invoke(@NotNull IntRect intRect, @NotNull IntRect intRect2) {
            Intrinsics.checkNotNullParameter(intRect, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(intRect2, "<anonymous parameter 1>");
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((IntRect) obj, (IntRect) obj2);
            return Unit.INSTANCE;
        }
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    /* renamed from: calculatePosition-llwVHH4 */
    public long mo612calculatePositionllwVHH4(IntRect anchorBounds, long windowSize, LayoutDirection layoutDirection, long popupContentSize) {
        Sequence sequenceOf;
        Object obj;
        Object obj2;
        Intrinsics.checkNotNullParameter(anchorBounds, "anchorBounds");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        int mo265roundToPx0680j_4 = this.density.mo265roundToPx0680j_4(MenuKt.getMenuVerticalMargin());
        int mo265roundToPx0680j_42 = this.density.mo265roundToPx0680j_4(DpOffset.m2522getXD9Ej5fM(this.contentOffset));
        int mo265roundToPx0680j_43 = this.density.mo265roundToPx0680j_4(DpOffset.m2523getYD9Ej5fM(this.contentOffset));
        int left = anchorBounds.getLeft() + mo265roundToPx0680j_42;
        int right = (anchorBounds.getRight() - mo265roundToPx0680j_42) - IntSize.m2567getWidthimpl(popupContentSize);
        int m2567getWidthimpl = IntSize.m2567getWidthimpl(windowSize) - IntSize.m2567getWidthimpl(popupContentSize);
        if (layoutDirection == LayoutDirection.Ltr) {
            Integer valueOf = Integer.valueOf(left);
            Integer valueOf2 = Integer.valueOf(right);
            if (anchorBounds.getLeft() < 0) {
                m2567getWidthimpl = 0;
            }
            sequenceOf = SequencesKt.sequenceOf(valueOf, valueOf2, Integer.valueOf(m2567getWidthimpl));
        } else {
            Integer valueOf3 = Integer.valueOf(right);
            Integer valueOf4 = Integer.valueOf(left);
            if (anchorBounds.getRight() <= IntSize.m2567getWidthimpl(windowSize)) {
                m2567getWidthimpl = 0;
            }
            sequenceOf = SequencesKt.sequenceOf(valueOf3, valueOf4, Integer.valueOf(m2567getWidthimpl));
        }
        Iterator it = sequenceOf.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            int intValue = ((Number) obj2).intValue();
            if (intValue >= 0 && intValue + IntSize.m2567getWidthimpl(popupContentSize) <= IntSize.m2567getWidthimpl(windowSize)) {
                break;
            }
        }
        Integer num = (Integer) obj2;
        if (num != null) {
            right = num.intValue();
        }
        int max = Math.max(anchorBounds.getBottom() + mo265roundToPx0680j_43, mo265roundToPx0680j_4);
        int top = (anchorBounds.getTop() - mo265roundToPx0680j_43) - IntSize.m2566getHeightimpl(popupContentSize);
        Iterator it2 = SequencesKt.sequenceOf(Integer.valueOf(max), Integer.valueOf(top), Integer.valueOf(anchorBounds.getTop() - (IntSize.m2566getHeightimpl(popupContentSize) / 2)), Integer.valueOf((IntSize.m2566getHeightimpl(windowSize) - IntSize.m2566getHeightimpl(popupContentSize)) - mo265roundToPx0680j_4)).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            int intValue2 = ((Number) next).intValue();
            if (intValue2 >= mo265roundToPx0680j_4 && intValue2 + IntSize.m2566getHeightimpl(popupContentSize) <= IntSize.m2566getHeightimpl(windowSize) - mo265roundToPx0680j_4) {
                obj = next;
                break;
            }
        }
        Integer num2 = (Integer) obj;
        if (num2 != null) {
            top = num2.intValue();
        }
        this.onPositionCalculated.invoke(anchorBounds, new IntRect(right, top, IntSize.m2567getWidthimpl(popupContentSize) + right, IntSize.m2566getHeightimpl(popupContentSize) + top));
        return IntOffsetKt.IntOffset(right, top);
    }
}
