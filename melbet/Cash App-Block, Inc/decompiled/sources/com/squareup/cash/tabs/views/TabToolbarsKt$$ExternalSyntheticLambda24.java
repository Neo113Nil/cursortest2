package com.squareup.cash.tabs.views;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.ValueInsets;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.RangesKt___RangesKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes7.dex */
public final /* synthetic */ class TabToolbarsKt$$ExternalSyntheticLambda24 implements Function1 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ SharedToolbarSwipeGeometry f$0;
    public final /* synthetic */ SharedToolbarSwipeScope f$1;
    public final /* synthetic */ SwipeToolbarCorner f$2;

    public /* synthetic */ TabToolbarsKt$$ExternalSyntheticLambda24(SharedToolbarSwipeGeometry sharedToolbarSwipeGeometry, SharedToolbarSwipeScope sharedToolbarSwipeScope, SwipeToolbarCorner swipeToolbarCorner) {
        this.f$0 = sharedToolbarSwipeGeometry;
        this.f$1 = sharedToolbarSwipeScope;
        this.f$2 = swipeToolbarCorner;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ea  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        EntryPointMorphTransform entryPointMorphTransform;
        int i = this.$r8$classId;
        SwipeToolbarCorner swipeToolbarCorner = this.f$2;
        SharedToolbarSwipeGeometry sharedToolbarSwipeGeometry = this.f$0;
        SharedToolbarSwipeScope sharedToolbarSwipeScope = this.f$1;
        switch (i) {
            case 0:
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj;
                layoutCoordinates.getClass();
                boolean z = sharedToolbarSwipeScope.isMoneybotToolbar;
                Rect localBoundingBoxOf = ValueInsets.findRootCoordinates(layoutCoordinates).localBoundingBoxOf(layoutCoordinates, true);
                sharedToolbarSwipeGeometry.getClass();
                swipeToolbarCorner.getClass();
                int ordinal = swipeToolbarCorner.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else if (z) {
                        sharedToolbarSwipeGeometry.moneybotTrailingBounds$delegate.setValue(localBoundingBoxOf);
                    } else {
                        sharedToolbarSwipeGeometry.tabsTrailingBounds$delegate.setValue(localBoundingBoxOf);
                    }
                } else if (z) {
                    sharedToolbarSwipeGeometry.moneybotLeadingBounds$delegate.setValue(localBoundingBoxOf);
                } else {
                    sharedToolbarSwipeGeometry.tabsLeadingBounds$delegate.setValue(localBoundingBoxOf);
                }
                break;
            default:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope.getClass();
                Function0 function0 = sharedToolbarSwipeScope.transitionProgress;
                boolean z2 = sharedToolbarSwipeScope.isMoneybotToolbar;
                float ramp = TabToolbarsKt.ramp(RangesKt___RangesKt.coerceIn(((Number) function0.invoke()).floatValue(), RecyclerView.DECELERATION_RATE, 1.0f), 0.7f, 1.0f);
                if (!((Boolean) sharedToolbarSwipeScope.isSourceToolbar.invoke()).booleanValue()) {
                    ramp = 1.0f - ramp;
                }
                Rect ownBounds = sharedToolbarSwipeGeometry.ownBounds(z2, swipeToolbarCorner);
                Rect ownBounds2 = sharedToolbarSwipeGeometry.ownBounds(!z2, swipeToolbarCorner);
                boolean z3 = swipeToolbarCorner == SwipeToolbarCorner.Leading;
                float f = 1.0f - ramp;
                if (ownBounds != null) {
                    float f2 = ownBounds.top;
                    float f3 = ownBounds.bottom;
                    float f4 = ownBounds.left;
                    float f5 = ownBounds.right;
                    if (ownBounds2 != null) {
                        float f6 = f5 - f4;
                        if (f6 > RecyclerView.DECELERATION_RATE) {
                            float f7 = f3 - f2;
                            if (f7 > RecyclerView.DECELERATION_RATE) {
                                entryPointMorphTransform = new EntryPointMorphTransform((Float.intBitsToFloat((int) (ownBounds2.m633getCenterF1C5BW0() >> 32)) - Float.intBitsToFloat((int) (ownBounds.m633getCenterF1C5BW0() >> 32))) * ramp, (Float.intBitsToFloat((int) (ownBounds2.m633getCenterF1C5BW0() & BodyPartID.bodyIdMax)) - Float.intBitsToFloat((int) (ownBounds.m633getCenterF1C5BW0() & BodyPartID.bodyIdMax))) * ramp, z3 ? ((((ownBounds2.right - ownBounds2.left) / f6) - 1.0f) * ramp) + 1.0f : 1.0f, z3 ? 1.0f + ((((ownBounds2.bottom - ownBounds2.top) / f7) - 1.0f) * ramp) : 1.0f, f);
                                reusableGraphicsLayerScope.setTranslationX(entryPointMorphTransform.translationX);
                                reusableGraphicsLayerScope.setTranslationY(entryPointMorphTransform.translationY);
                                reusableGraphicsLayerScope.setScaleX(entryPointMorphTransform.scaleX);
                                reusableGraphicsLayerScope.setScaleY(entryPointMorphTransform.scaleY);
                                reusableGraphicsLayerScope.setAlpha(entryPointMorphTransform.alpha);
                                reusableGraphicsLayerScope.m709setCompositingStrategyaDBOjCE(swipeToolbarCorner == SwipeToolbarCorner.Trailing ? 2 : 0);
                                break;
                            }
                        }
                    }
                }
                entryPointMorphTransform = new EntryPointMorphTransform(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 1.0f, 1.0f, f);
                reusableGraphicsLayerScope.setTranslationX(entryPointMorphTransform.translationX);
                reusableGraphicsLayerScope.setTranslationY(entryPointMorphTransform.translationY);
                reusableGraphicsLayerScope.setScaleX(entryPointMorphTransform.scaleX);
                reusableGraphicsLayerScope.setScaleY(entryPointMorphTransform.scaleY);
                reusableGraphicsLayerScope.setAlpha(entryPointMorphTransform.alpha);
                reusableGraphicsLayerScope.m709setCompositingStrategyaDBOjCE(swipeToolbarCorner == SwipeToolbarCorner.Trailing ? 2 : 0);
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ TabToolbarsKt$$ExternalSyntheticLambda24(SharedToolbarSwipeScope sharedToolbarSwipeScope, SharedToolbarSwipeGeometry sharedToolbarSwipeGeometry, SwipeToolbarCorner swipeToolbarCorner) {
        this.f$1 = sharedToolbarSwipeScope;
        this.f$0 = sharedToolbarSwipeGeometry;
        this.f$2 = swipeToolbarCorner;
    }
}
