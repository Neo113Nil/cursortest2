package com.squareup.cash.treehouse.flows;

import app.cash.zipline.ZiplineService;
import app.cash.zipline.internal.bridge.SuspendingZiplineFunction;
import com.google.android.gms.internal.mlkit_genai_prompt.zzmo;
import com.squareup.cash.treehouse.activity.ActivityPaymentManager2;
import com.squareup.cash.treehouse.activity.OffersRepositoryService;
import com.squareup.cash.treehouse.activity.ShareSheet;
import com.squareup.cash.treehouse.badging.RawBadgingService;
import com.squareup.cash.treehouse.biometrics.BiometricsService;
import com.squareup.cash.treehouse.discover.DiscoverDataBridge$Companion$Adapter$GeneratedOutboundService;
import com.squareup.cash.treehouse.financialservices.FinancialServicesBridge;
import com.squareup.cash.treehouse.navigation.ClientRouteUrl;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.serialization.KSerializer;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class RawFlowService$Companion$Adapter$ZiplineFunction0 extends SuspendingZiplineFunction {
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RawFlowService$Companion$Adapter$ZiplineFunction0(String str, String str2, List list, KSerializer kSerializer, KSerializer kSerializer2, int i) {
        super(str, str2, list, kSerializer, kSerializer2);
        this.$r8$classId = i;
    }

    @Override // app.cash.zipline.internal.bridge.SuspendingZiplineFunction
    public final Object callSuspending(ZiplineService ziplineService, List list, zzmo zzmoVar) {
        switch (this.$r8$classId) {
            case 0:
                Object obj = list.get(0);
                obj.getClass();
                return ((RawFlowService) ziplineService).produceRequestContext((List) obj, zzmoVar);
            case 1:
                Object obj2 = list.get(0);
                obj2.getClass();
                Object obj3 = list.get(1);
                obj3.getClass();
                Object obj4 = list.get(2);
                obj4.getClass();
                Object cancelInvestmentOrder = ((ActivityPaymentManager2) ziplineService).cancelInvestmentOrder((String) obj2, (String) obj3, (String) obj4, zzmoVar);
                return cancelInvestmentOrder == CoroutineSingletons.COROUTINE_SUSPENDED ? cancelInvestmentOrder : Unit.INSTANCE;
            case 2:
                Object obj5 = list.get(0);
                obj5.getClass();
                Object obj6 = list.get(1);
                obj6.getClass();
                Object obj7 = list.get(2);
                obj7.getClass();
                Object cancelCryptoOrder = ((ActivityPaymentManager2) ziplineService).cancelCryptoOrder((String) obj5, (String) obj6, (String) obj7, zzmoVar);
                return cancelCryptoOrder == CoroutineSingletons.COROUTINE_SUSPENDED ? cancelCryptoOrder : Unit.INSTANCE;
            case 3:
                Object obj8 = list.get(0);
                obj8.getClass();
                Object obj9 = list.get(1);
                obj9.getClass();
                Object confirm = ((ActivityPaymentManager2) ziplineService).confirm((String) obj8, (String) obj9, zzmoVar);
                return confirm == CoroutineSingletons.COROUTINE_SUSPENDED ? confirm : Unit.INSTANCE;
            case 4:
                ActivityPaymentManager2 activityPaymentManager2 = (ActivityPaymentManager2) ziplineService;
                String str = (String) list.get(0);
                Object obj10 = list.get(1);
                obj10.getClass();
                String str2 = (String) obj10;
                Object obj11 = list.get(2);
                obj11.getClass();
                Object obj12 = list.get(3);
                obj12.getClass();
                Object startSupportFlow = activityPaymentManager2.startSupportFlow((ClientRouteUrl) obj11, str, str2, (String) obj12, zzmoVar);
                return startSupportFlow == CoroutineSingletons.COROUTINE_SUSPENDED ? startSupportFlow : Unit.INSTANCE;
            case 5:
                Object obj13 = list.get(0);
                obj13.getClass();
                Object obj14 = list.get(1);
                obj14.getClass();
                String str3 = (String) list.get(2);
                Object obj15 = list.get(3);
                obj15.getClass();
                Object makeLoanPayment = ((ActivityPaymentManager2) ziplineService).makeLoanPayment((String) obj13, (ByteString) obj14, str3, (String) obj15, zzmoVar);
                return makeLoanPayment == CoroutineSingletons.COROUTINE_SUSPENDED ? makeLoanPayment : Unit.INSTANCE;
            case 6:
                Object obj16 = list.get(0);
                obj16.getClass();
                Object obj17 = list.get(1);
                obj17.getClass();
                Object skipLoanPayment = ((ActivityPaymentManager2) ziplineService).skipLoanPayment((String) obj16, (String) obj17, zzmoVar);
                return skipLoanPayment == CoroutineSingletons.COROUTINE_SUSPENDED ? skipLoanPayment : Unit.INSTANCE;
            case 7:
                Object obj18 = list.get(0);
                obj18.getClass();
                Object obj19 = list.get(1);
                obj19.getClass();
                Object acceptCryptoPayment = ((ActivityPaymentManager2) ziplineService).acceptCryptoPayment((String) obj18, (String) obj19, zzmoVar);
                return acceptCryptoPayment == CoroutineSingletons.COROUTINE_SUSPENDED ? acceptCryptoPayment : Unit.INSTANCE;
            case 8:
                Object obj20 = list.get(0);
                obj20.getClass();
                Object obj21 = list.get(1);
                obj21.getClass();
                Object obj22 = list.get(2);
                obj22.getClass();
                Object obj23 = list.get(3);
                obj23.getClass();
                String str4 = (String) list.get(4);
                Object obj24 = list.get(5);
                obj24.getClass();
                Object cancelRecurringPurchase = ((ActivityPaymentManager2) ziplineService).cancelRecurringPurchase((String) obj20, (ByteString) obj21, (ByteString) obj22, (ByteString) obj23, str4, (String) obj24, zzmoVar);
                return cancelRecurringPurchase == CoroutineSingletons.COROUTINE_SUSPENDED ? cancelRecurringPurchase : Unit.INSTANCE;
            case 9:
                Object obj25 = list.get(0);
                obj25.getClass();
                Object obj26 = list.get(1);
                obj26.getClass();
                Object showPaymentDetailView = ((ActivityPaymentManager2) ziplineService).showPaymentDetailView((String) obj25, (String) obj26, zzmoVar);
                return showPaymentDetailView == CoroutineSingletons.COROUTINE_SUSPENDED ? showPaymentDetailView : Unit.INSTANCE;
            case 10:
                Object obj27 = list.get(0);
                obj27.getClass();
                Object showBnpl = ((ActivityPaymentManager2) ziplineService).showBnpl((String) obj27, zzmoVar);
                return showBnpl == CoroutineSingletons.COROUTINE_SUSPENDED ? showBnpl : Unit.INSTANCE;
            case 11:
                Object obj28 = list.get(0);
                obj28.getClass();
                String str5 = (String) list.get(1);
                Object obj29 = list.get(2);
                obj29.getClass();
                Object showProfile = ((ActivityPaymentManager2) ziplineService).showProfile((String) obj28, str5, (String) obj29, zzmoVar);
                return showProfile == CoroutineSingletons.COROUTINE_SUSPENDED ? showProfile : Unit.INSTANCE;
            case 12:
                Object obj30 = list.get(0);
                obj30.getClass();
                Object obj31 = list.get(1);
                obj31.getClass();
                Object showThread = ((ActivityPaymentManager2) ziplineService).showThread((String) obj30, (String) obj31, zzmoVar);
                return showThread == CoroutineSingletons.COROUTINE_SUSPENDED ? showThread : Unit.INSTANCE;
            case 13:
                Object obj32 = list.get(0);
                obj32.getClass();
                Object obj33 = list.get(1);
                obj33.getClass();
                Object showContact = ((ActivityPaymentManager2) ziplineService).showContact((String) obj32, (String) obj33, zzmoVar);
                return showContact == CoroutineSingletons.COROUTINE_SUSPENDED ? showContact : Unit.INSTANCE;
            case 14:
                Object obj34 = list.get(0);
                obj34.getClass();
                Object obj35 = list.get(1);
                obj35.getClass();
                String str6 = (String) list.get(2);
                String str7 = (String) list.get(3);
                Object obj36 = list.get(4);
                obj36.getClass();
                Object cancel = ((ActivityPaymentManager2) ziplineService).cancel((String) obj34, (ByteString) obj35, str6, str7, (String) obj36, zzmoVar);
                return cancel == CoroutineSingletons.COROUTINE_SUSPENDED ? cancel : Unit.INSTANCE;
            case 15:
                Object obj37 = list.get(0);
                obj37.getClass();
                Object obj38 = list.get(1);
                obj38.getClass();
                Object openShareSheet = ((ActivityPaymentManager2) ziplineService).openShareSheet((String) obj37, (ShareSheet) obj38, zzmoVar);
                return openShareSheet == CoroutineSingletons.COROUTINE_SUSPENDED ? openShareSheet : Unit.INSTANCE;
            case 16:
                Object obj39 = list.get(0);
                obj39.getClass();
                Object obj40 = list.get(1);
                obj40.getClass();
                Object passcode = ((ActivityPaymentManager2) ziplineService).passcode((String) obj39, (String) obj40, zzmoVar);
                return passcode == CoroutineSingletons.COROUTINE_SUSPENDED ? passcode : Unit.INSTANCE;
            case 17:
                Object obj41 = list.get(0);
                obj41.getClass();
                Object obj42 = list.get(1);
                obj42.getClass();
                Object linkCard = ((ActivityPaymentManager2) ziplineService).linkCard((String) obj41, (String) obj42, zzmoVar);
                return linkCard == CoroutineSingletons.COROUTINE_SUSPENDED ? linkCard : Unit.INSTANCE;
            case 18:
                Object obj43 = list.get(0);
                obj43.getClass();
                Object obj44 = list.get(1);
                obj44.getClass();
                Object openUrl = ((ActivityPaymentManager2) ziplineService).openUrl((ClientRouteUrl) list.get(2), (String) obj43, (String) obj44, zzmoVar);
                return openUrl == CoroutineSingletons.COROUTINE_SUSPENDED ? openUrl : Unit.INSTANCE;
            case 19:
                Object obj45 = list.get(0);
                obj45.getClass();
                Object obj46 = list.get(1);
                obj46.getClass();
                String str8 = (String) obj46;
                String str9 = (String) list.get(2);
                Object obj47 = list.get(3);
                obj47.getClass();
                Object reportProblem = ((ActivityPaymentManager2) ziplineService).reportProblem((ClientRouteUrl) obj47, (String) obj45, str8, str9, zzmoVar);
                return reportProblem == CoroutineSingletons.COROUTINE_SUSPENDED ? reportProblem : Unit.INSTANCE;
            case 20:
                Object obj48 = list.get(0);
                obj48.getClass();
                Object obj49 = list.get(1);
                obj49.getClass();
                Object callNumber = ((ActivityPaymentManager2) ziplineService).callNumber((String) obj48, (String) obj49, zzmoVar);
                return callNumber == CoroutineSingletons.COROUTINE_SUSPENDED ? callNumber : Unit.INSTANCE;
            case 21:
                Object obj50 = list.get(0);
                obj50.getClass();
                String str10 = (String) list.get(1);
                String str11 = (String) list.get(2);
                Object obj51 = list.get(3);
                obj51.getClass();
                Object verifyIdentity = ((ActivityPaymentManager2) ziplineService).verifyIdentity((String) obj50, str10, str11, (String) obj51, zzmoVar);
                return verifyIdentity == CoroutineSingletons.COROUTINE_SUSPENDED ? verifyIdentity : Unit.INSTANCE;
            case 22:
                Object obj52 = list.get(0);
                obj52.getClass();
                String str12 = (String) list.get(1);
                String str13 = (String) list.get(2);
                Object obj53 = list.get(3);
                obj53.getClass();
                Object completeScenarioPlan = ((ActivityPaymentManager2) ziplineService).completeScenarioPlan((String) obj52, str12, str13, (String) obj53, zzmoVar);
                return completeScenarioPlan == CoroutineSingletons.COROUTINE_SUSPENDED ? completeScenarioPlan : Unit.INSTANCE;
            case 23:
                Object obj54 = list.get(0);
                obj54.getClass();
                Object saveSheetPreload = ((OffersRepositoryService) ziplineService).saveSheetPreload((ByteString) obj54, zzmoVar);
                return saveSheetPreload == CoroutineSingletons.COROUTINE_SUSPENDED ? saveSheetPreload : Unit.INSTANCE;
            case 24:
                return ((OffersRepositoryService) ziplineService).getActiveOfferMerchantTokens(zzmoVar);
            case 25:
                Object obj55 = list.get(0);
                obj55.getClass();
                Object updateBadgeCounts = ((RawBadgingService) ziplineService).updateBadgeCounts((ByteString) obj55, zzmoVar);
                return updateBadgeCounts == CoroutineSingletons.COROUTINE_SUSPENDED ? updateBadgeCounts : Unit.INSTANCE;
            case 26:
                Object obj56 = list.get(0);
                obj56.getClass();
                return ((BiometricsService) ziplineService).write((String) obj56, (String) list.get(1), zzmoVar);
            case 27:
                Object obj57 = list.get(0);
                obj57.getClass();
                return ((BiometricsService) ziplineService).hasStoredValue((String) obj57, zzmoVar);
            case 28:
                Object obj58 = list.get(0);
                obj58.getClass();
                return ((DiscoverDataBridge$Companion$Adapter$GeneratedOutboundService) ziplineService).getDetailsPage((String) obj58, zzmoVar);
            default:
                Object obj59 = list.get(0);
                obj59.getClass();
                return ((FinancialServicesBridge) ziplineService).saveUserViewedDirectDepositUpsell((ByteString) obj59, zzmoVar);
        }
    }
}
