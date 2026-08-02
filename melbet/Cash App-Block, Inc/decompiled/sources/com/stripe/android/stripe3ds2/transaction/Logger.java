package com.stripe.android.stripe3ds2.transaction;

import android.util.Log;
import com.google.android.libraries.places.api.model.zzco;
import com.squareup.cash.family.familyhub.backend.api.DependentControlStatus;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlInfo;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlRowState$Enabled;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlRowState$Gone;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class Logger {

    /* loaded from: classes8.dex */
    public final class Noop extends Logger {
        public static final Noop INSTANCE = new Noop(0);
        public static final Noop INSTANCE$1 = new Noop(1);
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ Noop(int i) {
            this.$r8$classId = i;
        }

        private final void error$com$stripe$android$stripe3ds2$transaction$Logger$Noop(String str, Throwable th) {
        }

        private final void info$com$stripe$android$stripe3ds2$transaction$Logger$Noop() {
        }

        @Override // com.stripe.android.stripe3ds2.transaction.Logger
        public final void error(String str, Throwable th) {
            switch (this.$r8$classId) {
                case 0:
                    break;
                default:
                    Log.e("StripeSdk", str, th);
                    break;
            }
        }

        @Override // com.stripe.android.stripe3ds2.transaction.Logger
        public final void info() {
            switch (this.$r8$classId) {
                case 0:
                    break;
                default:
                    Log.i("StripeSdk", "Make initial challenge request.");
                    break;
            }
        }
    }

    public static final zzco toDependentControlRowState$toRowState(DependentControlStatus.Loaded loaded, String str, String str2, String str3, String str4) {
        String str5 = loaded.getControlEnabled() ? str : str2;
        if (loaded instanceof DependentControlStatus.Loaded.LoadedNonLimitControl) {
            DependentControlStatus.Loaded.LoadedNonLimitControl loadedNonLimitControl = (DependentControlStatus.Loaded.LoadedNonLimitControl) loaded;
            if (!Intrinsics.areEqual(loadedNonLimitControl.isActivated, Boolean.FALSE)) {
                return new DependentControlRowState$Enabled(loadedNonLimitControl.controlEnabled, str5, str3, (DependentControlInfo) null, false, 52);
            }
        } else {
            if (loaded instanceof DependentControlStatus.Loaded.LoadedStockControl) {
                DependentControlStatus.Loaded.LoadedStockControl loadedStockControl = (DependentControlStatus.Loaded.LoadedStockControl) loaded;
                return new DependentControlRowState$Enabled(loadedStockControl.controlEnabled, str5, str3, DependentControlInfo.Stock, loadedStockControl.isOnboarded && loadedStockControl.isMonthlyFrequency, 4);
            }
            if (loaded instanceof DependentControlStatus.Loaded.LoadedBitcoinControl) {
                DependentControlStatus.Loaded.LoadedBitcoinControl loadedBitcoinControl = (DependentControlStatus.Loaded.LoadedBitcoinControl) loaded;
                return new DependentControlRowState$Enabled(loadedBitcoinControl.controlEnabled, str5, str3, DependentControlInfo.Bitcoin, loadedBitcoinControl.isOnboarded && loadedBitcoinControl.isMonthlyFrequency, 4);
            }
            if (loaded instanceof DependentControlStatus.Loaded.LoadedP2PControl) {
                return new DependentControlRowState$Enabled(((DependentControlStatus.Loaded.LoadedP2PControl) loaded).controlEnabled, str5, str3, DependentControlInfo.P2P, true, 4);
            }
            if (loaded instanceof DependentControlStatus.Loaded.LoadedCardControl) {
                DependentControlStatus.Loaded.LoadedCardControl loadedCardControl = (DependentControlStatus.Loaded.LoadedCardControl) loaded;
                if (loadedCardControl.isActivated) {
                    return new DependentControlRowState$Enabled(loadedCardControl.controlEnabled, str5, str4, str3, DependentControlInfo.Card, true);
                }
            } else {
                if (!(loaded instanceof DependentControlStatus.Loaded.LoadedPromotionControl)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                DependentControlStatus.Loaded.LoadedPromotionControl loadedPromotionControl = (DependentControlStatus.Loaded.LoadedPromotionControl) loaded;
                if (loadedPromotionControl.controlVisible) {
                    return new DependentControlRowState$Enabled(loadedPromotionControl.controlEnabled, str5, str3, (DependentControlInfo) null, false, 52);
                }
            }
        }
        return DependentControlRowState$Gone.INSTANCE;
    }

    public static boolean zza(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public abstract void error(String str, Throwable th);

    public abstract void info();
}
