package kotlin.reflect.jvm.internal.impl.types;

import android.text.SpannableString;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.StateListIterator;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.directoryui.viewmodels.DirectoryAnalyticsData;
import app.cash.directoryui.viewmodels.DirectoryListItem;
import app.cash.local.backend.CartBuilder;
import app.cash.local.backend.real.RealCartBuilder;
import app.cash.local.presenters.LocalCashBalancePresenter;
import app.cash.local.presenters.brand.checkout.LocalBrandLocationCheckoutPresenter;
import app.cash.local.presenters.cart.LocalBrandLocationCartPresenter;
import app.cash.local.primitives.BrandSpot;
import app.cash.local.primitives.Cart;
import app.cash.local.primitives.CartEntryWithQuantity;
import app.cash.local.primitives.FulfillmentConfiguration;
import app.cash.local.primitives.Line;
import app.cash.local.primitives.Location;
import app.cash.local.primitives.MenuItemToken;
import app.cash.local.screens.app.LocalSchedulingDayTimePickerScreen;
import app.cash.molecule.PlatformKt;
import com.bugsnag.android.MarshalledEventSource;
import com.google.android.libraries.places.api.model.zzde;
import com.google.android.libraries.places.api.net.zzl;
import com.squareup.address.typeahead.backend.api.AddressSearcher$AddressTypeFilter;
import com.squareup.address.typeahead.backend.api.AddressSearcher$SearchResult;
import com.squareup.address.typeahead.backend.real.PlacesAddressSearcher;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.paychecks.PaychecksManageDistributionSetAllocationAmountWithATMButton;
import com.squareup.cash.cdf.paychecks.PaychecksManageDistributionSetAllocationAmountWithWheelDrag;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.paychecks.backend.api.model.EditDistributionConfiguration;
import com.squareup.cash.paychecks.presenters.util.UtilsKt;
import com.squareup.cash.paychecks.viewmodels.EditDistributionViewEvent;
import com.squareup.cash.shopping.viewmodels.SearchResultsViewEvent;
import com.squareup.protos.common.countries.Country;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawSubstitution;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;
import kotlinx.coroutines.CancellableContinuationImpl;

/* loaded from: classes5.dex */
public final class AbstractTypeChecker$$Lambda$0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final Object arg$0;
    public final Object arg$1;
    public final Object arg$2;
    public final Object arg$3;

    public /* synthetic */ AbstractTypeChecker$$Lambda$0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$r8$classId = i;
        this.arg$0 = obj;
        this.arg$1 = obj2;
        this.arg$2 = obj3;
        this.arg$3 = obj4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Event event;
        ClassDescriptor findClassAcrossModuleDependencies;
        int i = this.$r8$classId;
        Object obj2 = this.arg$3;
        Object obj3 = this.arg$2;
        Object obj4 = this.arg$1;
        Object obj5 = this.arg$0;
        switch (i) {
            case 0:
                TypeCheckerState typeCheckerState = (TypeCheckerState) obj4;
                TypeSystemContext typeSystemContext = (TypeSystemContext) obj3;
                RigidTypeMarker rigidTypeMarker = (RigidTypeMarker) obj2;
                TypeCheckerState.ForkPointContext forkPointContext = (TypeCheckerState.ForkPointContext) obj;
                forkPointContext.getClass();
                Iterator it = ((AbstractCollection) obj5).iterator();
                while (it.hasNext()) {
                    forkPointContext.fork(new MarshalledEventSource(typeCheckerState, typeSystemContext, (RigidTypeMarker) it.next(), rigidTypeMarker, 4));
                }
                return Unit.INSTANCE;
            case 1:
                AskedQuestion askedQuestion = (AskedQuestion) obj;
                askedQuestion.getClass();
                LocalBrandLocationCheckoutPresenter localBrandLocationCheckoutPresenter = (LocalBrandLocationCheckoutPresenter) obj5;
                BrandSpot brandSpot = localBrandLocationCheckoutPresenter.brandSpot;
                String str = ((Location.LocationDetail) ((State) obj2).getValue()).summary.token;
                String activeAccountTokenOrNull = PlatformKt.activeAccountTokenOrNull(localBrandLocationCheckoutPresenter.sessionManager);
                List list = ((Cart) obj4).lines;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(new MenuItemToken(((Line) it2.next()).selection.menuItemToken));
                }
                return new LocalSchedulingDayTimePickerScreen(brandSpot, str, activeAccountTokenOrNull, null, arrayList, (FulfillmentConfiguration) obj3, askedQuestion);
            case 2:
                AskedQuestion askedQuestion2 = (AskedQuestion) obj;
                askedQuestion2.getClass();
                LocalBrandLocationCartPresenter localBrandLocationCartPresenter = (LocalBrandLocationCartPresenter) obj5;
                BrandSpot brandSpot2 = localBrandLocationCartPresenter.brandSpot;
                Location.LocationDetail locationDetail = (Location.LocationDetail) ((State) obj3).getValue();
                locationDetail.getClass();
                String str2 = locationDetail.summary.token;
                String activeAccountTokenOrNull2 = PlatformKt.activeAccountTokenOrNull(localBrandLocationCartPresenter.sessionManager);
                RealCartBuilder realCartBuilder = (RealCartBuilder) ((CartBuilder) obj4);
                String str3 = realCartBuilder.checkoutFlowToken;
                SnapshotStateList snapshotStateList = realCartBuilder.selections;
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(snapshotStateList, 10));
                ListIterator listIterator = snapshotStateList.listIterator();
                while (true) {
                    StateListIterator stateListIterator = (StateListIterator) listIterator;
                    if (!stateListIterator.hasNext()) {
                        FulfillmentConfiguration fulfillmentConfiguration = (FulfillmentConfiguration) ((State) obj2).getValue();
                        fulfillmentConfiguration.getClass();
                        return new LocalSchedulingDayTimePickerScreen(brandSpot2, str2, activeAccountTokenOrNull2, str3, arrayList2, fulfillmentConfiguration, askedQuestion2);
                    }
                    arrayList2.add(new MenuItemToken(((CartEntryWithQuantity) stateListIterator.next()).getCartEntry().menuItemToken));
                }
            case 3:
                List list2 = ((zzl) obj).zza;
                CancellableContinuationImpl cancellableContinuationImpl = (CancellableContinuationImpl) obj5;
                list2.getClass();
                List<zzde> list3 = list2;
                PlacesAddressSearcher placesAddressSearcher = (PlacesAddressSearcher) obj4;
                Country country = (Country) obj3;
                AddressSearcher$AddressTypeFilter addressSearcher$AddressTypeFilter = (AddressSearcher$AddressTypeFilter) obj2;
                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                for (zzde zzdeVar : list3) {
                    zzdeVar.getClass();
                    SpannableString zzg = zzde.zzg(zzdeVar.zze, zzdeVar.zzh, null);
                    SpannableString zzg2 = zzde.zzg(zzdeVar.zzf, zzdeVar.zzi, null);
                    String str4 = zzdeVar.zza;
                    str4.getClass();
                    arrayList3.add(new PlacesAddressSearcher.PlacesSearchResult(placesAddressSearcher, zzg, zzg2, str4, country, addressSearcher$AddressTypeFilter));
                }
                AddressSearcher$SearchResult.Success success = new AddressSearcher$SearchResult.Success(arrayList3);
                Result.Companion companion = Result.Companion;
                cancellableContinuationImpl.resumeWith(success);
                return Unit.INSTANCE;
            case 4:
                float floatValue = ((Number) obj).floatValue();
                EditDistributionConfiguration.DestinationUiConfiguration destinationUiConfiguration = (EditDistributionConfiguration.DestinationUiConfiguration) obj3;
                LocalCashBalancePresenter localCashBalancePresenter = (LocalCashBalancePresenter) obj4;
                BlockersData blockersData = (BlockersData) localCashBalancePresenter.store;
                ((ParcelableSnapshotMutableFloatState) ((MutableFloatState) obj2)).setFloatValue(floatValue);
                EditDistributionViewEvent editDistributionViewEvent = (EditDistributionViewEvent) obj5;
                if (editDistributionViewEvent instanceof EditDistributionViewEvent.DragWheel) {
                    event = new PaychecksManageDistributionSetAllocationAmountWithWheelDrag(blockersData.flowToken, Integer.valueOf((int) UtilsKt.getBasisPoints(floatValue)), UtilsKt.toDestinationType(destinationUiConfiguration.destination));
                } else if (editDistributionViewEvent instanceof EditDistributionViewEvent.TapATMButton) {
                    event = new PaychecksManageDistributionSetAllocationAmountWithATMButton(blockersData.flowToken, Integer.valueOf((int) UtilsKt.getBasisPoints(floatValue)), UtilsKt.toDestinationType(destinationUiConfiguration.destination));
                } else {
                    event = null;
                }
                if (event != null) {
                    ((Analytics) localCashBalancePresenter.analytics).track(event, null);
                }
                return Unit.INSTANCE;
            case 5:
                String str5 = (String) obj;
                str5.getClass();
                ((Function1) obj5).invoke(str5);
                ((Function1) obj4).invoke(new SearchResultsViewEvent.TextRowClick(str5, ((DirectoryListItem.TextRowSectionViewModel) obj3).isAutocomplete, (DirectoryAnalyticsData) obj2));
                return Unit.INSTANCE;
            default:
                ClassDescriptor classDescriptor = (ClassDescriptor) obj5;
                RawSubstitution rawSubstitution = (RawSubstitution) obj4;
                SimpleType simpleType = (SimpleType) obj3;
                JavaTypeAttributes javaTypeAttributes = (JavaTypeAttributes) obj2;
                KotlinTypeRefiner kotlinTypeRefiner = (KotlinTypeRefiner) obj;
                RawSubstitution.Companion companion2 = RawSubstitution.Companion;
                kotlinTypeRefiner.getClass();
                ClassId classId = DescriptorUtilsKt.getClassId(classDescriptor);
                if (classId == null || (findClassAcrossModuleDependencies = kotlinTypeRefiner.findClassAcrossModuleDependencies(classId)) == null || findClassAcrossModuleDependencies.equals(classDescriptor)) {
                    return null;
                }
                return (SimpleType) rawSubstitution.eraseInflexibleBasedOnClassDescriptor(simpleType, findClassAcrossModuleDependencies, javaTypeAttributes).first;
        }
    }
}
