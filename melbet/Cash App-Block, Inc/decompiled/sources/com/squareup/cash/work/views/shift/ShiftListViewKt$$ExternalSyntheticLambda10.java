package com.squareup.cash.work.views.shift;

import android.os.Build;
import android.view.View;
import androidx.compose.animation.core.Animatable;
import androidx.compose.material.SwipeableKt$swipeable$3$4$1;
import androidx.compose.material.pullrefresh.PullRefreshState;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.ui.text.style.BaselineShiftKt;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.address.typeahead.backend.api.LocationType;
import com.squareup.address.typeahead.views.AddressTypeaheadStateKt;
import com.squareup.cash.arcade.Haptics;
import com.squareup.cash.arcade.components.haptic.RealHapticVibrator;
import com.squareup.cash.common.composeui.animations.Shaker;
import com.squareup.cash.portfolio.graphs.RealInvestingGraphCalculator;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.work.viewmodels.FilterSelectionMode;
import com.squareup.cash.work.viewmodels.ShiftFilterType;
import com.squareup.cash.work.viewmodels.ShiftFilterViewModel;
import com.squareup.protos.cash.portfolios.BalanceTick;
import com.squareup.protos.common.countries.Country;
import com.squareup.protos.common.location.Coordinates;
import com.squareup.protos.common.location.GlobalAddress;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import com.stripe.android.financialconnections.ui.components.MultipleEventsCutterImpl;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;

/* loaded from: classes6.dex */
public final /* synthetic */ class ShiftListViewKt$$ExternalSyntheticLambda10 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ boolean f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;

    public /* synthetic */ ShiftListViewKt$$ExternalSyntheticLambda10(ShiftFilterViewModel.Section section, boolean z, Set set, ShiftFilterViewModel.Option option, MutableState mutableState) {
        this.$r8$classId = 0;
        this.f$1 = z;
        this.f$2 = set;
        this.f$3 = option;
        this.f$4 = mutableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r7v4 */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Pair pair;
        Coordinates coordinates;
        Coordinates coordinates2;
        int i = this.$r8$classId;
        boolean z = false;
        float f = RecyclerView.DECELERATION_RATE;
        int i2 = 2;
        Double d = 0;
        d = 0;
        boolean z2 = this.f$1;
        Object obj = this.f$4;
        Object obj2 = this.f$3;
        Object obj3 = this.f$2;
        switch (i) {
            case 0:
                Set set = (Set) obj3;
                MutableState mutableState = (MutableState) obj;
                FilterSelectionMode filterSelectionMode = FilterSelectionMode.MULTI;
                String str = ((ShiftFilterViewModel.Option) obj2).id;
                mutableState.setValue(MapsKt__MapsKt.plus((Map) mutableState.getValue(), new Pair(ShiftFilterType.LOCATION, z2 ? SetsKt___SetsKt.minus(set, str) : SetsKt___SetsKt.plus(set, str))));
                break;
            case 1:
                PullRefreshState pullRefreshState = (PullRefreshState) obj3;
                Ref$FloatRef ref$FloatRef = (Ref$FloatRef) obj2;
                Ref$FloatRef ref$FloatRef2 = (Ref$FloatRef) obj;
                boolean z3 = pullRefreshState.get_refreshing();
                CoroutineScope coroutineScope = pullRefreshState.animationScope;
                ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = pullRefreshState._refreshingOffset$delegate;
                if (z3 != z2) {
                    pullRefreshState._refreshing$delegate.setValue(Boolean.valueOf(z2));
                    pullRefreshState.distancePulled$delegate.setFloatValue(RecyclerView.DECELERATION_RATE);
                    if (z2) {
                        f = parcelableSnapshotMutableFloatState.getFloatValue();
                    }
                    JobKt.launch$default(coroutineScope, null, null, new SwipeableKt$swipeable$3$4$1.AnonymousClass1(pullRefreshState, f, d, i2), 3);
                }
                pullRefreshState._threshold$delegate.setFloatValue(ref$FloatRef.element);
                float f2 = ref$FloatRef2.element;
                if (parcelableSnapshotMutableFloatState.getFloatValue() != f2) {
                    parcelableSnapshotMutableFloatState.setFloatValue(f2);
                    if (pullRefreshState.get_refreshing()) {
                        JobKt.launch$default(coroutineScope, null, null, new SwipeableKt$swipeable$3$4$1.AnonymousClass1(pullRefreshState, f2, d, i2), 3);
                    }
                }
                break;
            case 2:
                LocationType locationType = (LocationType) obj3;
                Country country = (Country) obj2;
                GlobalAddress globalAddress = (GlobalAddress) obj;
                LocationType locationType2 = LocationType.City;
                if (locationType == locationType2) {
                    if (country != Country.US) {
                        locationType2 = LocationType.Address;
                    }
                    pair = new Pair(null, locationType2);
                } else {
                    pair = new Pair(globalAddress, locationType);
                }
                GlobalAddress globalAddress2 = (GlobalAddress) pair.first;
                LocationType locationType3 = (LocationType) pair.second;
                locationType3.getClass();
                country.getClass();
                boolean z4 = globalAddress2 != null;
                String str2 = globalAddress2 != null ? globalAddress2.address_line_1 : null;
                if (!AddressTypeaheadStateKt.access$getUsesAddressLine1Field(locationType3)) {
                    str2 = null;
                }
                String str3 = str2 == null ? "" : str2;
                String str4 = globalAddress2 != null ? globalAddress2.address_line_2 : null;
                int ordinal = locationType3.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1 && ordinal != 2 && ordinal != 3) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        str4 = null;
                    }
                }
                String str5 = str4 == null ? "" : str4;
                String str6 = globalAddress2 != null ? globalAddress2.locality : null;
                int ordinal2 = locationType3.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1 && ordinal2 != 2 && ordinal2 != 3) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        str6 = null;
                    }
                }
                String str7 = str6 == null ? "" : str6;
                String str8 = globalAddress2 != null ? globalAddress2.administrative_district_level_1 : null;
                int ordinal3 = locationType3.ordinal();
                if (ordinal3 != 0) {
                    if (ordinal3 != 1 && ordinal3 != 2 && ordinal3 != 3) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        str8 = null;
                    }
                }
                String str9 = str8 == null ? "" : str8;
                String str10 = globalAddress2 != null ? globalAddress2.postal_code : null;
                int ordinal4 = locationType3.ordinal();
                if (ordinal4 != 0) {
                    if (ordinal4 == 1) {
                        str10 = null;
                    } else if (ordinal4 != 2 && ordinal4 != 3) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    }
                }
                String str11 = str10 == null ? "" : str10;
                Double d2 = (globalAddress2 == null || (coordinates2 = globalAddress2.address_coordinates) == null) ? null : coordinates2.latitude;
                if (globalAddress2 != null && (coordinates = globalAddress2.address_coordinates) != null) {
                    d = coordinates.longitude;
                }
                break;
            case 3:
                RealHapticVibrator realHapticVibrator = (RealHapticVibrator) obj3;
                Haptics haptics = (Haptics) obj2;
                Function0 function0 = (Function0) obj;
                if (z2) {
                    realHapticVibrator.vibrate(haptics.input.standard);
                    function0.invoke();
                }
                break;
            case 4:
                RealCashVibrator realCashVibrator = (RealCashVibrator) obj3;
                Shaker shaker = (Shaker) obj2;
                Function0 function02 = (Function0) obj;
                if (z2) {
                    if (realCashVibrator != null) {
                        realCashVibrator.error();
                    }
                    shaker.shake();
                } else {
                    function02.invoke();
                }
                break;
            case 5:
                BalanceTick balanceTick = (BalanceTick) obj2;
                RealInvestingGraphCalculator realInvestingGraphCalculator = (RealInvestingGraphCalculator) obj;
                Long l = balanceTick.time_sec;
                l.getClass();
                String formattedTime = BaselineShiftKt.formattedTime((HistoricalRange) obj3, l.longValue(), TimeUnit.SECONDS, realInvestingGraphCalculator.clock, realInvestingGraphCalculator.dateFormatManager);
                if (!z2) {
                    String str12 = balanceTick.display_text;
                    if (str12 != null) {
                        break;
                    }
                } else {
                    break;
                }
                break;
            case 6:
                Animatable animatable = (Animatable) obj3;
                MutableState mutableState2 = (MutableState) obj;
                MutableFloatState mutableFloatState = (MutableFloatState) obj2;
                if (z2) {
                    ?? r0 = ((Boolean) mutableState2.getValue()).booleanValue() && ((Number) animatable.getValue()).floatValue() > RecyclerView.DECELERATION_RATE;
                    if (((ParcelableSnapshotMutableFloatState) mutableFloatState).getFloatValue() > RecyclerView.DECELERATION_RATE || r0 != false) {
                        z = true;
                    }
                }
                break;
            case 7:
                Function0 function03 = (Function0) obj3;
                Function1 function1 = (Function1) obj2;
                Throwable th = (Throwable) obj;
                if (z2) {
                    function03.invoke();
                } else {
                    function1.invoke(th);
                }
                break;
            default:
                MultipleEventsCutterImpl multipleEventsCutterImpl = (MultipleEventsCutterImpl) obj3;
                View view = (View) obj2;
                Function0 function04 = (Function0) obj;
                multipleEventsCutterImpl.getClass();
                if (System.currentTimeMillis() - multipleEventsCutterImpl.lastEventTimeMs >= 500 && !z2) {
                    if (Build.VERSION.SDK_INT >= 30) {
                        view.performHapticFeedback(16);
                    }
                    function04.invoke();
                }
                multipleEventsCutterImpl.lastEventTimeMs = System.currentTimeMillis();
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ ShiftListViewKt$$ExternalSyntheticLambda10(Enum r1, Serializable serializable, Object obj, boolean z, int i) {
        this.$r8$classId = i;
        this.f$2 = r1;
        this.f$3 = serializable;
        this.f$4 = obj;
        this.f$1 = z;
    }

    public /* synthetic */ ShiftListViewKt$$ExternalSyntheticLambda10(Object obj, boolean z, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$2 = obj;
        this.f$1 = z;
        this.f$3 = obj2;
        this.f$4 = obj3;
    }

    public /* synthetic */ ShiftListViewKt$$ExternalSyntheticLambda10(boolean z, Animatable animatable, MutableState mutableState, MutableFloatState mutableFloatState) {
        this.$r8$classId = 6;
        this.f$1 = z;
        this.f$2 = animatable;
        this.f$4 = mutableState;
        this.f$3 = mutableFloatState;
    }

    public /* synthetic */ ShiftListViewKt$$ExternalSyntheticLambda10(boolean z, Object obj, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$1 = z;
        this.f$2 = obj;
        this.f$3 = obj2;
        this.f$4 = obj3;
    }
}
