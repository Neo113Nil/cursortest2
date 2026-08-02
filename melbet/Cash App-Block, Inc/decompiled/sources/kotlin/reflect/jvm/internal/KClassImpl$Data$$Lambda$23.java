package kotlin.reflect.jvm.internal;

import android.net.Uri;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.broadway.screen.Screen;
import com.fillr.browsersdk.model.FillrCartInformationExtraction$FillrCartInformation;
import com.squareup.address.typeahead.backend.api.SearchLocation;
import com.squareup.cash.R;
import com.squareup.cash.arcade.components.SearchBarKeyboardState;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.presenters.FilesetUploadPresenter;
import com.squareup.cash.blockers.presenters.FilesetUploadPresenter$models$2$6$photoUri$1;
import com.squareup.cash.blockers.presenters.SetPinPresenter;
import com.squareup.cash.cdf.document.DocumentUploadOpenCamera;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.deposits.physical.viewmodels.address.AddressSearchViewModel;
import com.squareup.cash.deposits.physical.viewmodels.address.PhysicalDepositAddressEntryEvent;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.investing.viewmodels.StockContentModel;
import com.squareup.cash.investing.viewmodels.search.InvestingSearchViewEvent;
import com.squareup.cash.investing.viewmodels.search.SearchResult;
import com.squareup.cash.moneybot.viewmodels.MoneybotChatHistoryViewEvent;
import com.squareup.cash.moneybot.viewmodels.MoneybotChatHistoryViewModel;
import com.squareup.cash.moneybot.viewmodels.MoneybotOverflowMenuViewEvent;
import com.squareup.cash.moneybot.viewmodels.RecentChatHistoryViewModel$Loaded;
import com.squareup.cash.offers.viewmodels.itemviewmodels.OffersCommonOfferRowViewModel;
import com.squareup.cash.offers.viewmodels.viewevents.OfferItemClicked;
import com.squareup.cash.paymentpad.viewmodels.MainPaymentPadViewEvent;
import com.squareup.cash.paymentpad.viewmodels.MainPaymentPadViewModel;
import com.squareup.cash.paymentpad.views.MainPaymentPadViewKt;
import com.squareup.cash.pools.viewmodels.PoolInvitePeopleListViewEvent;
import com.squareup.cash.pools.viewmodels.PoolListSection;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.sharesheet.ShareSheetPresenter;
import com.squareup.cash.shopping.presenters.ShoppingWebPresenter;
import com.squareup.cash.shopping.screens.ShoppingWebScreen;
import com.squareup.cash.storage.RealStorage;
import com.squareup.cash.storage.UtilsKt;
import com.squareup.cash.work.viewmodels.ToastState;
import com.squareup.cash.work.viewmodels.ToastType;
import com.squareup.protos.cash.plasma.flows.Flow$Type;
import java.lang.reflect.Type;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0;
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.PropertyReference0;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.text.MatcherMatchResult;
import kotlin.text.MatcherMatchResult$groupValues$1;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import okio.Path;

/* loaded from: classes6.dex */
public final class KClassImpl$Data$$Lambda$23 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final Object arg$0;
    public final Object arg$1;
    public final Object arg$2;

    public KClassImpl$Data$$Lambda$23(AbstractTypeParameterDescriptor abstractTypeParameterDescriptor, StorageManager storageManager, SupertypeLoopChecker supertypeLoopChecker) {
        this.$r8$classId = 17;
        this.arg$2 = abstractTypeParameterDescriptor;
        this.arg$0 = storageManager;
        this.arg$1 = supertypeLoopChecker;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        Object obj = this.arg$1;
        Object obj2 = this.arg$0;
        Object obj3 = this.arg$2;
        switch (i) {
            case 0:
                KClassImpl kClassImpl = (KClassImpl) obj2;
                Class cls = (Class) obj;
                ClassId classId = (ClassId) obj3;
                Class cls2 = kClassImpl.jClass;
                if (Intrinsics.areEqual(cls2.getSuperclass(), cls)) {
                    Type genericSuperclass = cls2.getGenericSuperclass();
                    genericSuperclass.getClass();
                    return genericSuperclass;
                }
                Class<?>[] interfaces = cls2.getInterfaces();
                interfaces.getClass();
                int indexOf = ArraysKt___ArraysKt.indexOf(interfaces, cls);
                if (indexOf < 0) {
                    f$$ExternalSyntheticLambda0.m$1("No superclass of ", kClassImpl, " in Java reflection for ", classId);
                    return null;
                }
                Type type2 = cls2.getGenericInterfaces()[indexOf];
                type2.getClass();
                return type2;
            case 1:
                FilesetUploadPresenter filesetUploadPresenter = (FilesetUploadPresenter) obj2;
                Analytics analytics = filesetUploadPresenter.analytics;
                BlockersData blockersData = filesetUploadPresenter.args.blockersData;
                String valueOf = String.valueOf(blockersData.clientScenario);
                String str = blockersData.flowToken;
                DocumentUploadOpenCamera.PermissionStatus permissionStatus = DocumentUploadOpenCamera.PermissionStatus.APPROVED;
                str.getClass();
                analytics.track(new DocumentUploadOpenCamera(valueOf, str, permissionStatus), null);
                String str2 = Path.DIRECTORY_SEPARATOR;
                Uri contentUriForFileUri = filesetUploadPresenter.fileProvider.contentUriForFileUri(((RealStorage) filesetUploadPresenter.storage).getFileUri(Path.Companion.get(UtilsKt.tempFileName("CASH"), false), FilesetUploadPresenter$models$2$6$photoUri$1.INSTANCE));
                filesetUploadPresenter.cameraCapturer.tryLaunch(contentUriForFileUri);
                NavAction$$ExternalSyntheticOutline0.m(1, (ParcelableSnapshotMutableIntState) obj);
                ((MutableState) obj3).setValue(contentUriForFileUri);
                return Unit.INSTANCE;
            case 2:
                ((MutableState) obj).setValue(((SetPinPresenter) obj2).stringManager.get(R.string.set_pin_title_mismatch));
                MutableState mutableState = (MutableState) obj3;
                mutableState.setValue(Integer.valueOf(((Number) mutableState.getValue()).intValue() + 1));
                return Unit.INSTANCE;
            case 3:
                ((SearchBarKeyboardState) obj2).setOpen(false);
                ((Function1) obj).invoke(new PhysicalDepositAddressEntryEvent.AddressRecentClick((AddressSearchViewModel) obj3));
                return Unit.INSTANCE;
            case 4:
                ((SearchBarKeyboardState) obj2).setOpen(false);
                ((Function1) obj).invoke(new PhysicalDepositAddressEntryEvent.AddressSearchResultClick((SearchLocation) obj3));
                return Unit.INSTANCE;
            case 5:
                ((Function1) obj2).invoke(new InvestingSearchViewEvent.StockClicked(((StockContentModel) obj).investmentEntityToken, InvestingSearchViewEvent.StockClicked.SearchStockOrigin.CategoryDetail.INSTANCE, ((SearchResult.StockResult) obj3).symbol));
                return Unit.INSTANCE;
            case 6:
                MutableState mutableState2 = (MutableState) obj3;
                if (!((Boolean) mutableState2.getValue()).booleanValue()) {
                    mutableState2.setValue(Boolean.TRUE);
                    ((Function1) obj2).invoke(new MoneybotChatHistoryViewEvent.SwipedToDelete(((MoneybotChatHistoryViewModel.Content.Session) obj).sessionId));
                }
                return Unit.INSTANCE;
            case 7:
                MutableState mutableState3 = (MutableState) obj3;
                if (!((Boolean) mutableState3.getValue()).booleanValue()) {
                    mutableState3.setValue(Boolean.TRUE);
                    ((Function1) obj2).invoke(new MoneybotOverflowMenuViewEvent.SwipedToDelete(((RecentChatHistoryViewModel$Loaded.Session) obj).sessionId));
                }
                return Unit.INSTANCE;
            case 8:
                OffersCommonOfferRowViewModel offersCommonOfferRowViewModel = (OffersCommonOfferRowViewModel) obj;
                ((Function1) obj2).invoke(new OfferItemClicked(offersCommonOfferRowViewModel.tapActionUrl, offersCommonOfferRowViewModel.itemToken, offersCommonOfferRowViewModel.rowViewModel.tapEventSpecs));
                ((Function0) obj3).invoke();
                return Unit.INSTANCE;
            case 9:
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = MainPaymentPadViewKt.LocalElementBoundsRegistry;
                ((MutableState) obj3).setValue(Boolean.TRUE);
                if (((MainPaymentPadViewModel) obj2).showHypeAnimation) {
                    ((Function1) obj).invoke(MainPaymentPadViewEvent.HypeAnimationComplete.INSTANCE);
                }
                return Unit.INSTANCE;
            case 10:
                DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) obj2;
                if (delegatingSoftwareKeyboardController != null) {
                    delegatingSoftwareKeyboardController.hide();
                }
                ((Function1) obj).invoke(new PoolInvitePeopleListViewEvent.AddCustomerToPool(((PoolListSection.PoolListPerson) obj3).customerId));
                return Unit.INSTANCE;
            case 11:
                MutableState mutableState4 = (MutableState) obj3;
                ShoppingWebPresenter shoppingWebPresenter = (ShoppingWebPresenter) obj2;
                Set set = ShoppingWebPresenter.RESTRICTED_KEYWORDS;
                FillrCartInformationExtraction$FillrCartInformation fillrCartInformationExtraction$FillrCartInformation = (FillrCartInformationExtraction$FillrCartInformation) ((MutableState) obj).getValue();
                String str3 = fillrCartInformationExtraction$FillrCartInformation != null ? fillrCartInformationExtraction$FillrCartInformation.json : null;
                ShoppingWebPresenter.State state = (ShoppingWebPresenter.State) mutableState4.getValue();
                ShoppingWebScreen.ShoppingWebScreenV2 shoppingWebScreenV2 = (ShoppingWebScreen.ShoppingWebScreenV2) shoppingWebPresenter.args;
                String str4 = ((ShoppingWebPresenter.State) mutableState4.getValue()).currUrl;
                if (str4 == null) {
                    str4 = "";
                }
                ShoppingWebPresenter.access$openSupHalfSheet(shoppingWebPresenter, str3, state, ShoppingWebScreen.ShoppingWebScreenV2.copy$default(shoppingWebScreenV2, str4, null, 30));
                return Unit.INSTANCE;
            case 12:
                ((BetterNavigator.ScreenNavigator) obj2).goTo(FlowStarter.startPlasmaFlow$default((FlowStarter) obj, Flow$Type.POST_SIGN_IN, (Screen) obj3, null, null, 12));
                return Unit.INSTANCE;
            case 13:
                ((MutableState) obj).setValue(Boolean.FALSE);
                ((MutableState) obj3).setValue(new ToastState(((AndroidStringManager) ((ShareSheetPresenter) obj2).stringManager).get(R.string.work_shift_error_generic), Long.valueOf(System.currentTimeMillis()), ToastType.Info));
                return Unit.INSTANCE;
            case 14:
                String str5 = (String) obj2;
                KDeclarationContainerImpl kDeclarationContainerImpl = (KDeclarationContainerImpl) obj;
                PropertyReference0 propertyReference0 = (PropertyReference0) obj3;
                MatcherMatchResult matchEntire = KDeclarationContainerImpl.LOCAL_PROPERTY_SIGNATURE.matchEntire(str5);
                if (matchEntire != null) {
                    return kDeclarationContainerImpl.createLocalProperty(Integer.parseInt((String) ((MatcherMatchResult$groupValues$1) matchEntire.getGroupValues()).get(1)), str5);
                }
                if (kDeclarationContainerImpl instanceof KPackageImpl) {
                    return new KotlinKProperty0(kDeclarationContainerImpl, str5, propertyReference0.getBoundReceiver(), kDeclarationContainerImpl.findPropertyMetadata(propertyReference0.getName(), str5));
                }
                return new DescriptorKProperty0(kDeclarationContainerImpl, propertyReference0.getName(), str5, propertyReference0.getBoundReceiver());
            case 15:
                String str6 = (String) obj2;
                KDeclarationContainerImpl kDeclarationContainerImpl2 = (KDeclarationContainerImpl) obj;
                MutablePropertyReference0 mutablePropertyReference0 = (MutablePropertyReference0) obj3;
                MatcherMatchResult matchEntire2 = KDeclarationContainerImpl.LOCAL_PROPERTY_SIGNATURE.matchEntire(str6);
                if (matchEntire2 != null) {
                    return kDeclarationContainerImpl2.createLocalProperty(Integer.parseInt((String) ((MatcherMatchResult$groupValues$1) matchEntire2.getGroupValues()).get(1)), str6);
                }
                if (kDeclarationContainerImpl2 instanceof KPackageImpl) {
                    return new KotlinKMutableProperty0(kDeclarationContainerImpl2, str6, mutablePropertyReference0.getBoundReceiver(), kDeclarationContainerImpl2.findPropertyMetadata(mutablePropertyReference0.getName(), str6));
                }
                return new DescriptorKMutableProperty0(kDeclarationContainerImpl2, mutablePropertyReference0.getName(), str6, mutablePropertyReference0.getBoundReceiver());
            case 16:
                KDeclarationContainerImpl kDeclarationContainerImpl3 = (KDeclarationContainerImpl) obj2;
                MutablePropertyReference1 mutablePropertyReference1 = (MutablePropertyReference1) obj;
                String str7 = (String) obj3;
                if (kDeclarationContainerImpl3 instanceof KPackageImpl) {
                    return new KotlinKMutableProperty1(kDeclarationContainerImpl3, str7, mutablePropertyReference1.getBoundReceiver(), kDeclarationContainerImpl3.findPropertyMetadata(mutablePropertyReference1.getName(), str7));
                }
                return new DescriptorKMutableProperty1(kDeclarationContainerImpl3, mutablePropertyReference1.getName(), str7, mutablePropertyReference1.getBoundReceiver());
            default:
                return new AbstractTypeParameterDescriptor.TypeParameterTypeConstructor((AbstractTypeParameterDescriptor) obj3, (StorageManager) obj2, (SupertypeLoopChecker) obj);
        }
    }

    public /* synthetic */ KClassImpl$Data$$Lambda$23(int i, Object obj, Object obj2, Object obj3) {
        this.$r8$classId = i;
        this.arg$0 = obj;
        this.arg$1 = obj2;
        this.arg$2 = obj3;
    }
}
