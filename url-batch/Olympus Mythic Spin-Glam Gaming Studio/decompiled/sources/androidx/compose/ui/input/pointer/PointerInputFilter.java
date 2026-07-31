package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;

/* compiled from: PointerEvent.kt */
@StabilityInferred
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000f\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH&¢\u0006\u0004\b\u000e\u0010\u0003R$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0017\u001a\u00020\u00168\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001f\u001a\u00020\b8Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001aR\u001a\u0010$\u001a\u00020\u00168WX\u0097\u0004¢\u0006\f\u0012\u0004\b#\u0010\u0003\u001a\u0004\b\"\u0010\u001a\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006%"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputFilter;", "", "<init>", "()V", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "Landroidx/compose/ui/unit/IntSize;", "bounds", "", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "onPointerEvent", "onCancel", "Landroidx/compose/ui/layout/LayoutCoordinates;", "layoutCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getLayoutCoordinates$ui_release", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "setLayoutCoordinates$ui_release", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "", "isAttached", "Z", "isAttached$ui_release", "()Z", "setAttached$ui_release", "(Z)V", "getSize-YbymL2g", "()J", "size", "getInterceptOutOfBoundsChildEvents", "interceptOutOfBoundsChildEvents", "getShareWithSiblings", "getShareWithSiblings$annotations", "shareWithSiblings", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class PointerInputFilter {
    private boolean isAttached;
    private LayoutCoordinates layoutCoordinates;

    public boolean getInterceptOutOfBoundsChildEvents() {
        return false;
    }

    public boolean getShareWithSiblings() {
        return false;
    }

    public abstract void onCancel();

    /* renamed from: onPointerEvent-H0pRuoY, reason: not valid java name */
    public abstract void mo1887onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pass, long bounds);

    /* renamed from: getLayoutCoordinates$ui_release, reason: from getter */
    public final LayoutCoordinates getLayoutCoordinates() {
        return this.layoutCoordinates;
    }

    public final void setLayoutCoordinates$ui_release(LayoutCoordinates layoutCoordinates) {
        this.layoutCoordinates = layoutCoordinates;
    }

    /* renamed from: getSize-YbymL2g, reason: not valid java name */
    public final long m1886getSizeYbymL2g() {
        LayoutCoordinates layoutCoordinates = this.layoutCoordinates;
        return layoutCoordinates != null ? layoutCoordinates.mo1946getSizeYbymL2g() : IntSize.INSTANCE.m2571getZeroYbymL2g();
    }

    /* renamed from: isAttached$ui_release, reason: from getter */
    public final boolean getIsAttached() {
        return this.isAttached;
    }

    public final void setAttached$ui_release(boolean z) {
        this.isAttached = z;
    }
}
