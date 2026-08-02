package com.squareup.cash.tax.applets.presenters;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.tracing.Trace;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.eligibility.backend.real.RealFeatureEligibilityRepository;
import com.squareup.cash.family.familyhub.backend.real.RealFamilyAccountsManager;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.JsonFeatureFlags$TaxesAppletTileData;
import com.squareup.cash.tabs.views.ComposableSingletons$TabToolbarsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda28;
import com.squareup.cash.tax.backend.real.RealTaxEntryTileUserDataProvider;
import com.squareup.cash.tax.web.TaxWebAppBridge;
import com.squareup.cash.tax.web.TaxWebAppBridge$$ExternalSyntheticLambda1;
import com.squareup.protos.cash.cashtes.app.v1beta1.UserData2Response;
import com.squareup.util.coroutines.DerivedStateFlow;
import com.squareup.util.coroutines.StateFlowKt;
import kotlin.collections.EmptySet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.StartedWhileSubscribed;

/* loaded from: classes6.dex */
public final class RealTaxesAppletTileRepository implements TaxesAppletTileRepository {
    public final ReadonlyStateFlow _model;
    public final DerivedStateFlow availabilityState;
    public final DerivedStateFlow hasPassword;
    public final RealTaxEntryTileUserDataProvider taxEntryTileUserDataProvider;

    /* loaded from: classes7.dex */
    public abstract class TaxesModel {

        public final class Installed extends TaxesModel {
            public final UserData2Response taxTileData;

            public Installed(UserData2Response userData2Response) {
                this.taxTileData = userData2Response;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Installed) && Intrinsics.areEqual(this.taxTileData, ((Installed) obj).taxTileData);
            }

            public final int hashCode() {
                UserData2Response userData2Response = this.taxTileData;
                if (userData2Response == null) {
                    return 0;
                }
                return userData2Response.hashCode();
            }

            public final String toString() {
                return "Installed(taxTileData=" + this.taxTileData + ")";
            }
        }

        public final class PendingRequest extends TaxesModel {
            public final boolean installed;

            public PendingRequest(boolean z) {
                this.installed = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PendingRequest) && this.installed == ((PendingRequest) obj).installed;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.installed);
            }

            public final String toString() {
                return Fragment$5$$ExternalSyntheticOutline0.m("PendingRequest(installed=", ")", this.installed);
            }
        }

        public final class Uninstalled extends TaxesModel {
            public final UserData2Response taxTileData;

            public Uninstalled(UserData2Response userData2Response) {
                this.taxTileData = userData2Response;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Uninstalled) && Intrinsics.areEqual(this.taxTileData, ((Uninstalled) obj).taxTileData);
            }

            public final int hashCode() {
                UserData2Response userData2Response = this.taxTileData;
                if (userData2Response == null) {
                    return 0;
                }
                return userData2Response.hashCode();
            }

            public final String toString() {
                return "Uninstalled(taxTileData=" + this.taxTileData + ")";
            }
        }
    }

    public RealTaxesAppletTileRepository(FeatureFlagManager featureFlagManager, RealTaxEntryTileUserDataProvider realTaxEntryTileUserDataProvider, RealFeatureEligibilityRepository realFeatureEligibilityRepository, SyncValueReader syncValueReader, RealFamilyAccountsManager realFamilyAccountsManager, CoroutineScope coroutineScope) {
        this.taxEntryTileUserDataProvider = realTaxEntryTileUserDataProvider;
        this.availabilityState = StateFlowKt.combineState(StateFlowKt.mapState(Trace.valuesState(featureFlagManager, JsonFeatureFlags$TaxesAppletTileData.INSTANCE), new TabToolbarsKt$$ExternalSyntheticLambda28(this)), realFamilyAccountsManager.isActivelySponsored(), FlowKt.stateIn(realFeatureEligibilityRepository.currentEligibleFeatures(), coroutineScope, new StartedWhileSubscribed(0L, Long.MAX_VALUE), EmptySet.INSTANCE), new ComposableSingletons$TabToolbarsKt$$ExternalSyntheticLambda0(15));
        DerivedStateFlow mapState = StateFlowKt.mapState(syncValueReader.getSingleValue(AndroidSyncValueSpecs.PasswordInfo), new TaxWebAppBridge$$ExternalSyntheticLambda1(1));
        this.hasPassword = mapState;
        this._model = FlowKt.stateIn(new SafeFlow(new TaxWebAppBridge.AnonymousClass3(this, null, 4)), coroutineScope, new StartedWhileSubscribed(0L, Long.MAX_VALUE), new TaxesModel.PendingRequest(Intrinsics.areEqual(((Function0) mapState.getValue).invoke(), Boolean.TRUE)));
    }

    public final DerivedStateFlow getAvailabilityState() {
        return this.availabilityState;
    }
}
