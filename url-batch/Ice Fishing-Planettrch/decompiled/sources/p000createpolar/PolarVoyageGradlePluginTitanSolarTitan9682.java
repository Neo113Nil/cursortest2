package p000createpolar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.HashMap;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageGradlePluginTitanSolarTitan9682 extends ViewGroup {
    public final HashMap PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final HashMap PolarVoyageStrictModeLegendEpic1532;

    public PolarVoyageGradlePluginTitanSolarTitan9682(Context context) {
        super(context);
        setClipChildren(false);
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = new HashMap();
        this.PolarVoyageStrictModeLegendEpic1532 = new HashMap();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final HashMap<PolarVoyageRoomEntityCelestialCosmosPixel5838, PolarVoyageConfigurationMegaTitaniumQuantum2348> getHolderToLayoutNode() {
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485;
    }

    public final HashMap<PolarVoyageConfigurationMegaTitaniumQuantum2348, PolarVoyageRoomEntityCelestialCosmosPixel5838> getLayoutNodeToHolder() {
        return this.PolarVoyageStrictModeLegendEpic1532;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (PolarVoyageRoomEntityCelestialCosmosPixel5838 polarVoyageRoomEntityCelestialCosmosPixel5838 : this.PolarVoyageItemDecorationUltraDeltaEpic7485.keySet()) {
            polarVoyageRoomEntityCelestialCosmosPixel5838.layout(polarVoyageRoomEntityCelestialCosmosPixel5838.getLeft(), polarVoyageRoomEntityCelestialCosmosPixel5838.getTop(), polarVoyageRoomEntityCelestialCosmosPixel5838.getRight(), polarVoyageRoomEntityCelestialCosmosPixel5838.getBottom());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (!(View.MeasureSpec.getMode(i) == 1073741824)) {
            PolarVoyagePackageManagerUltraQuantumInferno5642.PolarVoyageZipVortexCelestial6185("widthMeasureSpec should be EXACTLY");
        }
        if (!(View.MeasureSpec.getMode(i2) == 1073741824)) {
            PolarVoyagePackageManagerUltraQuantumInferno5642.PolarVoyageZipVortexCelestial6185("heightMeasureSpec should be EXACTLY");
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        for (PolarVoyageRoomEntityCelestialCosmosPixel5838 polarVoyageRoomEntityCelestialCosmosPixel5838 : this.PolarVoyageItemDecorationUltraDeltaEpic7485.keySet()) {
            int i4 = polarVoyageRoomEntityCelestialCosmosPixel5838.PolarVoyageActivityInfoBetaQuantum8726;
            if (i4 != Integer.MIN_VALUE && (i3 = polarVoyageRoomEntityCelestialCosmosPixel5838.PolarVoyageLifecycleOlympianOmega3762) != Integer.MIN_VALUE) {
                polarVoyageRoomEntityCelestialCosmosPixel5838.measure(i4, i3);
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            PolarVoyageConfigurationMegaTitaniumQuantum2348 polarVoyageConfigurationMegaTitaniumQuantum2348 = (PolarVoyageConfigurationMegaTitaniumQuantum2348) this.PolarVoyageItemDecorationUltraDeltaEpic7485.get(childAt);
            if (childAt.isLayoutRequested() && polarVoyageConfigurationMegaTitaniumQuantum2348 != null) {
                PolarVoyageConfigurationMegaTitaniumQuantum2348.PolarVoyageAlertDialogNovaXCelestial4954(polarVoyageConfigurationMegaTitaniumQuantum2348, false, 7);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
    }
}
