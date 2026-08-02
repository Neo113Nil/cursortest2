package com.stripe.android.uicore;

import androidx.compose.ui.focus.FocusOwnerImpl;
import com.google.android.gms.internal.mlkit_vision_barcode.zzdz;
import com.squareup.cash.featureflags.AmplitudeExperiments$ProvisioningStarLocationVariant;
import com.squareup.cash.featureflags.FeatureFlag$StringAmplitudeExperiment;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.fidesmo.api.FidesmoAnimationDebugOverrides;
import com.squareup.cash.fidesmo.api.FidesmoAnimationLocationOverride;
import com.squareup.cash.fidesmo.presenters.ResolvedStarPlacement;
import com.squareup.cash.fidesmo.presenters.StarPlacementSource;
import com.squareup.cash.fidesmo.viewmodels.FidesmoScanningPulseShape;
import com.squareup.cash.fidesmo.viewmodels.ScanningStarPlacement;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public abstract class FocusManagerKtKt {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    public static final ResolvedStarPlacement applyAmplitudeStarLocationVariant(ResolvedStarPlacement resolvedStarPlacement, FeatureFlagManager featureFlagManager, Function0 function0) {
        ScanningStarPlacement scanningStarPlacement;
        String str = ((FeatureFlag$StringAmplitudeExperiment.Value) ((RealFeatureFlagManager) featureFlagManager).currentValue(AmplitudeExperiments$ProvisioningStarLocationVariant.INSTANCE)).value;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals("center")) {
                    scanningStarPlacement = ScanningStarPlacement.Companion.Center;
                    break;
                }
                break;
            case -1012429441:
                if (str.equals("top-left")) {
                    scanningStarPlacement = ScanningStarPlacement.Companion.TopLeftVariant;
                    break;
                }
                break;
            case -232428929:
                if (str.equals("bounce-animation")) {
                    scanningStarPlacement = ScanningStarPlacement.Bounce.INSTANCE;
                    break;
                }
                break;
            case 109578560:
                if (str.equals("snake")) {
                    scanningStarPlacement = ScanningStarPlacement.Snake.INSTANCE;
                    break;
                }
                break;
            case 1544803905:
                str.equals("default");
                break;
            case 1738934765:
                if (str.equals("vertical-animation")) {
                    scanningStarPlacement = ScanningStarPlacement.Unknown.INSTANCE;
                    break;
                }
                break;
            case 1854196472:
                if (str.equals("nfc-api")) {
                    scanningStarPlacement = ((ResolvedStarPlacement) function0.invoke()).placement;
                    break;
                }
                break;
        }
        return resolvedStarPlacement;
    }

    public static final ResolvedStarPlacement applyLocationOverride(FidesmoAnimationDebugOverrides fidesmoAnimationDebugOverrides, ResolvedStarPlacement resolvedStarPlacement) {
        resolvedStarPlacement.getClass();
        if (fidesmoAnimationDebugOverrides.locationOverride() == FidesmoAnimationLocationOverride.DEFAULT) {
            return resolvedStarPlacement;
        }
        ScanningStarPlacement scanningStarPlacement = resolvedStarPlacement.placement;
        scanningStarPlacement.getClass();
        int ordinal = fidesmoAnimationDebugOverrides.locationOverride().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                scanningStarPlacement = ScanningStarPlacement.Companion.Center;
            } else if (ordinal == 2) {
                scanningStarPlacement = new ScanningStarPlacement.Position(0.5f, 0.8227848f);
            } else if (ordinal == 3) {
                scanningStarPlacement = new ScanningStarPlacement.Position(0.37333333f, 0.28481013f);
            } else {
                if (ordinal != 4) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                scanningStarPlacement = ScanningStarPlacement.Unknown.INSTANCE;
            }
        }
        return new ResolvedStarPlacement(scanningStarPlacement, StarPlacementSource.DEBUG_OVERRIDE);
    }

    /* renamed from: moveFocusSafely-Mxy_nc0, reason: not valid java name */
    public static final void m4065moveFocusSafelyMxy_nc0(FocusOwnerImpl focusOwnerImpl, int i) {
        focusOwnerImpl.getClass();
        try {
            focusOwnerImpl.m597moveFocusaToIllA(i, true);
        } catch (IllegalArgumentException e) {
            e.toString();
        } catch (IllegalStateException e2) {
            e2.toString();
        }
    }

    public static final FidesmoScanningPulseShape resolveScanningPulseShape(FidesmoAnimationDebugOverrides fidesmoAnimationDebugOverrides, FidesmoScanningPulseShape fidesmoScanningPulseShape) {
        fidesmoScanningPulseShape.getClass();
        int ordinal = fidesmoAnimationDebugOverrides.shapeOverride().ordinal();
        if (ordinal == 0) {
            return fidesmoScanningPulseShape;
        }
        if (ordinal == 1) {
            return FidesmoScanningPulseShape.STAR;
        }
        if (ordinal == 2) {
            return FidesmoScanningPulseShape.HEART;
        }
        if (ordinal == 3) {
            return FidesmoScanningPulseShape.MINI_CARD;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static /* synthetic */ boolean zza(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, zzdz zzdzVar, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(zzdzVar, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(zzdzVar) != obj && atomicReferenceFieldUpdater.get(zzdzVar) != obj) {
                return false;
            }
        }
        return true;
    }
}
