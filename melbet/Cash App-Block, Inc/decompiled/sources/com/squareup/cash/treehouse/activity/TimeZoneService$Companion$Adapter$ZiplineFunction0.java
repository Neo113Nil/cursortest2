package com.squareup.cash.treehouse.activity;

import app.cash.zipline.ZiplineService;
import app.cash.zipline.internal.bridge.ReturningZiplineFunction;
import com.squareup.cash.treehouse.analytics.GenericEvent;
import com.squareup.cash.treehouse.analytics.RawAnalyticsService;
import com.squareup.cash.treehouse.navigation.ClientRouteUrl;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlinx.serialization.KSerializer;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class TimeZoneService$Companion$Adapter$ZiplineFunction0 extends ReturningZiplineFunction {
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TimeZoneService$Companion$Adapter$ZiplineFunction0(String str, String str2, List list, KSerializer kSerializer, int i) {
        super(str, str2, list, kSerializer);
        this.$r8$classId = i;
    }

    @Override // app.cash.zipline.internal.bridge.ReturningZiplineFunction
    public final Object call(ZiplineService ziplineService, List list) {
        switch (this.$r8$classId) {
            case 0:
                TimeZoneService timeZoneService = (TimeZoneService) ziplineService;
                timeZoneService.getClass();
                list.getClass();
                break;
            case 1:
                ActivityPaymentManager activityPaymentManager = (ActivityPaymentManager) ziplineService;
                String str = (String) SizeMode$EnumUnboxingLocalUtility.m(activityPaymentManager, list, 0);
                Object obj = list.get(1);
                obj.getClass();
                activityPaymentManager.openShareSheet(str, (ShareSheet) obj);
                break;
            case 2:
                ActivityPaymentManager activityPaymentManager2 = (ActivityPaymentManager) ziplineService;
                activityPaymentManager2.clearBadges((List) SizeMode$EnumUnboxingLocalUtility.m(activityPaymentManager2, list, 0));
                break;
            case 3:
                ActivityPaymentManager activityPaymentManager3 = (ActivityPaymentManager) ziplineService;
                activityPaymentManager3.getClass();
                list.getClass();
                activityPaymentManager3.finishedInitialRendering();
                break;
            case 4:
                ActivityPaymentManager activityPaymentManager4 = (ActivityPaymentManager) ziplineService;
                String str2 = (String) SizeMode$EnumUnboxingLocalUtility.m(activityPaymentManager4, list, 0);
                Object obj2 = list.get(1);
                obj2.getClass();
                String str3 = (String) list.get(2);
                activityPaymentManager4.cancel(str2, (Integer) list.get(3), str3, (ByteString) obj2);
                break;
            case 5:
                ActivityPaymentManager activityPaymentManager5 = (ActivityPaymentManager) ziplineService;
                activityPaymentManager5.getClass();
                list.getClass();
                break;
            case 6:
                ActivityPaymentManager activityPaymentManager6 = (ActivityPaymentManager) ziplineService;
                activityPaymentManager6.getClass();
                list.getClass();
                break;
            case 7:
                ActivityPaymentManager activityPaymentManager7 = (ActivityPaymentManager) ziplineService;
                activityPaymentManager7.getClass();
                list.getClass();
                break;
            case 8:
                ActivityPaymentManager activityPaymentManager8 = (ActivityPaymentManager) ziplineService;
                activityPaymentManager8.getClass();
                list.getClass();
                activityPaymentManager8.close();
                break;
            case 9:
                ActivityPaymentManager activityPaymentManager9 = (ActivityPaymentManager) ziplineService;
                String str4 = (String) SizeMode$EnumUnboxingLocalUtility.m(activityPaymentManager9, list, 0);
                Object obj3 = list.get(1);
                obj3.getClass();
                activityPaymentManager9.passcode(str4, (String) obj3);
                break;
            case 10:
                ActivityPaymentManager activityPaymentManager10 = (ActivityPaymentManager) ziplineService;
                activityPaymentManager10.passcode((String) SizeMode$EnumUnboxingLocalUtility.m(activityPaymentManager10, list, 0));
                break;
            case 11:
                ActivityPaymentManager activityPaymentManager11 = (ActivityPaymentManager) ziplineService;
                String str5 = (String) SizeMode$EnumUnboxingLocalUtility.m(activityPaymentManager11, list, 0);
                Object obj4 = list.get(1);
                obj4.getClass();
                activityPaymentManager11.linkCard(str5, (String) obj4);
                break;
            case 12:
                ActivityPaymentManager activityPaymentManager12 = (ActivityPaymentManager) ziplineService;
                activityPaymentManager12.linkCard((String) SizeMode$EnumUnboxingLocalUtility.m(activityPaymentManager12, list, 0));
                break;
            case 13:
                ActivityPaymentManager activityPaymentManager13 = (ActivityPaymentManager) ziplineService;
                String str6 = (String) SizeMode$EnumUnboxingLocalUtility.m(activityPaymentManager13, list, 0);
                Object obj5 = list.get(1);
                obj5.getClass();
                activityPaymentManager13.openUrl((ClientRouteUrl) list.get(2), str6, (String) obj5);
                break;
            case 14:
                ActivityPaymentManager2 activityPaymentManager22 = (ActivityPaymentManager2) ziplineService;
                activityPaymentManager22.getClass();
                list.getClass();
                Object obj6 = list.get(0);
                obj6.getClass();
                activityPaymentManager22.clearBadges((Set) obj6);
                break;
            case 15:
                ActivityPaymentManager2 activityPaymentManager23 = (ActivityPaymentManager2) ziplineService;
                activityPaymentManager23.getClass();
                list.getClass();
                activityPaymentManager23.finishedInitialRendering();
                break;
            case 16:
                ActivityPaymentManager2 activityPaymentManager24 = (ActivityPaymentManager2) ziplineService;
                activityPaymentManager24.getClass();
                list.getClass();
                break;
            case 17:
                ActivityPaymentManager2 activityPaymentManager25 = (ActivityPaymentManager2) ziplineService;
                activityPaymentManager25.getClass();
                list.getClass();
                activityPaymentManager25.requestClientSync();
                break;
            case 18:
                ActivityPaymentManager2 activityPaymentManager26 = (ActivityPaymentManager2) ziplineService;
                activityPaymentManager26.getClass();
                list.getClass();
                break;
            case 19:
                ActivityPaymentManager2 activityPaymentManager27 = (ActivityPaymentManager2) ziplineService;
                activityPaymentManager27.getClass();
                list.getClass();
                activityPaymentManager27.close();
                break;
            case 20:
                ActivityPaymentManager2 activityPaymentManager28 = (ActivityPaymentManager2) ziplineService;
                activityPaymentManager28.getClass();
                list.getClass();
                break;
            case 21:
                OffersRepositoryService offersRepositoryService = (OffersRepositoryService) ziplineService;
                offersRepositoryService.getClass();
                list.getClass();
                offersRepositoryService.close();
                break;
            case 22:
                RawOfflineActivityService rawOfflineActivityService = (RawOfflineActivityService) ziplineService;
                rawOfflineActivityService.getClass();
                list.getClass();
                break;
            case 23:
                RawOfflineActivityService rawOfflineActivityService2 = (RawOfflineActivityService) ziplineService;
                rawOfflineActivityService2.getClass();
                list.getClass();
                break;
            case 24:
                RawOfflineActivityService rawOfflineActivityService3 = (RawOfflineActivityService) ziplineService;
                rawOfflineActivityService3.getClass();
                list.getClass();
                rawOfflineActivityService3.retryPendingItems();
                break;
            case 25:
                RawOfflineActivityService rawOfflineActivityService4 = (RawOfflineActivityService) ziplineService;
                rawOfflineActivityService4.getClass();
                list.getClass();
                rawOfflineActivityService4.close();
                break;
            case 26:
                TimeZoneOffsetDatabase timeZoneOffsetDatabase = (TimeZoneOffsetDatabase) ziplineService;
                timeZoneOffsetDatabase.getClass();
                list.getClass();
                Object obj7 = list.get(0);
                obj7.getClass();
                break;
            case 27:
                TimeZoneOffsetDatabase timeZoneOffsetDatabase2 = (TimeZoneOffsetDatabase) ziplineService;
                timeZoneOffsetDatabase2.getClass();
                list.getClass();
                timeZoneOffsetDatabase2.close();
                break;
            case 28:
                TimeZoneService timeZoneService2 = (TimeZoneService) ziplineService;
                timeZoneService2.getClass();
                list.getClass();
                timeZoneService2.close();
                break;
            default:
                RawAnalyticsService rawAnalyticsService = (RawAnalyticsService) ziplineService;
                rawAnalyticsService.getClass();
                list.getClass();
                Object obj8 = list.get(0);
                obj8.getClass();
                rawAnalyticsService.track((GenericEvent) obj8);
                break;
        }
        return Unit.INSTANCE;
    }
}
