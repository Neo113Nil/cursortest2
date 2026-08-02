package com.squareup.util.coroutines;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import com.fillr.browsersdk.model.FillrWidgetVersion;
import com.fillr.e;
import com.google.mlkit.common.internal.zzd;
import com.miteksystems.misnap.camera.a.b;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Emojis;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientrouting.data.FeatureContext;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.clientrouting.routers.offers.OffersRouter;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.data.profile.RealProfileNotificationsRepository;
import com.squareup.cash.data.profile.documents.DocumentsManager$DocumentSection;
import com.squareup.cash.data.profile.documents.RealDocumentsManager;
import com.squareup.cash.data.profile.documents.RealDocumentsManager$documents$1$WhenMappings;
import com.squareup.cash.data.profile.observability.ScenarioPlanNotFoundError;
import com.squareup.cash.db2.profile.ScenarioPlan;
import com.squareup.cash.db2.profile.documents.Document;
import com.squareup.cash.family.profileselection.api.FamilyProfile;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$SavingsAppletMultipleGoals;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.money.applets.common.viewmodels.PromotedAppletTileViewModel;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.notifications.NotificationChannelToggleState;
import com.squareup.cash.notifications.NotificationToggleState;
import com.squareup.cash.notifications.channels.NotificationChannelId;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.offers.backend.real.RealOffersAnalyticsV2;
import com.squareup.cash.offers.screens.OffersScreen$OffersDetailsScreenV2;
import com.squareup.cash.offers.screens.OffersScreen$OffersGreenStatusScreen;
import com.squareup.cash.pools.presenters.PoolsListPresenter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.savings.applets.presenters.SavingsRepositoryModel;
import com.squareup.cash.savings.applets.viewmodels.SavingsAppletTileViewModel;
import com.squareup.cash.savings.backend.api.model.SavingsApplet;
import com.squareup.cash.savings.backend.api.model.SavingsFolder;
import com.squareup.protos.cash.moneymap.app.RetailerType;
import com.squareup.protos.cash.notificationsettings.clientsync.v1.UiCategoryNotificationPreference;
import com.squareup.protos.cash.notificationsettings.clientsync.v1.UiNotificationSettings;
import com.squareup.protos.cash.notificationsettings.common.v1.ClientChannelState;
import com.squareup.protos.cash.notificationsettings.common.v1.NotificationCategory;
import com.squareup.protos.common.Money;
import com.squareup.protos.document.DocumentCategoryEntity;
import com.squareup.protos.franklin.api.ClientScenario;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.time.Instant;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import okio.ByteString;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class FlowExtensionsKt$doOnFirst$2 extends SuspendLambda implements Function3 {
    public final /* synthetic */ Object $onNext;
    public final /* synthetic */ Object $pred;
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FlowExtensionsKt$doOnFirst$2(Object obj, Object obj2, Continuation continuation, int i) {
        super(3, continuation);
        this.$r8$classId = i;
        this.$pred = obj;
        this.$onNext = obj2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        Object obj4 = this.$onNext;
        Object obj5 = this.$pred;
        switch (i) {
            case 0:
                FlowExtensionsKt$doOnFirst$2 flowExtensionsKt$doOnFirst$2 = new FlowExtensionsKt$doOnFirst$2((Function1) obj5, (Function1) obj4, (Continuation) obj3, 0);
                flowExtensionsKt$doOnFirst$2.L$0 = (Pair) obj;
                flowExtensionsKt$doOnFirst$2.L$1 = obj2;
                return flowExtensionsKt$doOnFirst$2.invokeSuspend(Unit.INSTANCE);
            case 1:
                FlowExtensionsKt$doOnFirst$2 flowExtensionsKt$doOnFirst$22 = new FlowExtensionsKt$doOnFirst$2((OffersRouter) obj5, (RoutingParams) obj4, (Continuation) obj3, 1);
                flowExtensionsKt$doOnFirst$22.L$0 = (String) obj;
                flowExtensionsKt$doOnFirst$22.L$1 = (Set) obj2;
                return flowExtensionsKt$doOnFirst$22.invokeSuspend(Unit.INSTANCE);
            case 2:
                FlowExtensionsKt$doOnFirst$2 flowExtensionsKt$doOnFirst$23 = new FlowExtensionsKt$doOnFirst$2((RealProfileManager) obj5, (ClientScenario) obj4, (Continuation) obj3, 2);
                flowExtensionsKt$doOnFirst$23.L$0 = (ScenarioPlan) obj;
                flowExtensionsKt$doOnFirst$23.L$1 = (ScenarioPlan) obj2;
                return flowExtensionsKt$doOnFirst$23.invokeSuspend(Unit.INSTANCE);
            case 3:
                FlowExtensionsKt$doOnFirst$2 flowExtensionsKt$doOnFirst$24 = new FlowExtensionsKt$doOnFirst$2((RealProfileNotificationsRepository) obj5, (UiNotificationSettings) obj4, (Continuation) obj3, 3);
                flowExtensionsKt$doOnFirst$24.L$0 = (NotificationToggleState) obj;
                flowExtensionsKt$doOnFirst$24.L$1 = (Map) obj2;
                return flowExtensionsKt$doOnFirst$24.invokeSuspend(Unit.INSTANCE);
            case 4:
                FlowExtensionsKt$doOnFirst$2 flowExtensionsKt$doOnFirst$25 = new FlowExtensionsKt$doOnFirst$2((String) obj5, (RealDocumentsManager) obj4, (Continuation) obj3, 4);
                flowExtensionsKt$doOnFirst$25.L$0 = (DocumentCategoryEntity.RenderStyle) obj;
                flowExtensionsKt$doOnFirst$25.L$1 = (List) obj2;
                return flowExtensionsKt$doOnFirst$25.invokeSuspend(Unit.INSTANCE);
            default:
                FlowExtensionsKt$doOnFirst$2 flowExtensionsKt$doOnFirst$26 = new FlowExtensionsKt$doOnFirst$2((PoolsListPresenter) obj5, (PromotedAppletTileViewModel) obj4, (Continuation) obj3, 5);
                flowExtensionsKt$doOnFirst$26.L$0 = (SavingsRepositoryModel) obj;
                flowExtensionsKt$doOnFirst$26.L$1 = (FamilyProfile) obj2;
                return flowExtensionsKt$doOnFirst$26.invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        String str;
        SavingsAppletTileViewModel.Installed.NoGoalSet noGoalSet;
        String format2;
        int i = this.$r8$classId;
        Object obj3 = this.$pred;
        Object obj4 = this.$onNext;
        switch (i) {
            case 0:
                Pair pair = (Pair) this.L$0;
                Object obj5 = this.L$1;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Boolean bool = (Boolean) pair.first;
                if (bool.booleanValue()) {
                    return new Pair(bool, obj5);
                }
                if (!((Boolean) ((Function1) obj3).invoke(obj5)).booleanValue()) {
                    return new Pair(Boolean.FALSE, obj5);
                }
                ((Function1) obj4).invoke(obj5);
                return new Pair(Boolean.TRUE, obj5);
            case 1:
                String str2 = (String) this.L$0;
                Set set = (Set) this.L$1;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (str2 == null) {
                    return null;
                }
                RoutingParams routingParams = (RoutingParams) obj4;
                boolean contains = set.contains(str2);
                RealOffersAnalyticsV2 realOffersAnalyticsV2 = ((OffersRouter) obj3).offersAnalytics;
                if (contains) {
                    realOffersAnalyticsV2.trackOffersLockedOfferUpsellOpen(str2);
                    return new OffersScreen$OffersGreenStatusScreen(str2);
                }
                realOffersAnalyticsV2.trackOffersDetailsOpenViewOfferDetails(str2);
                FeatureContext featureContext = routingParams.featureContext;
                FeatureContext.MoneybotChatContext moneybotChatContext = featureContext instanceof FeatureContext.MoneybotChatContext ? (FeatureContext.MoneybotChatContext) featureContext : null;
                return new OffersScreen$OffersDetailsScreenV2(str2, moneybotChatContext != null ? new BlockersData.MoneybotContext(moneybotChatContext.sessionId, moneybotChatContext.toolRequestId) : null);
            case 2:
                ScenarioPlan scenarioPlan = (ScenarioPlan) this.L$0;
                ScenarioPlan scenarioPlan2 = (ScenarioPlan) this.L$1;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (scenarioPlan2 != null) {
                    scenarioPlan = scenarioPlan2;
                }
                ((RealProfileManager) obj3).errorReporter.report(new ScenarioPlanNotFoundError((ClientScenario) obj4), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
                return scenarioPlan;
            case 3:
                UiNotificationSettings uiNotificationSettings = (UiNotificationSettings) obj4;
                NotificationToggleState notificationToggleState = (NotificationToggleState) this.L$0;
                Map map = (Map) this.L$1;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                int ordinal = notificationToggleState.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    List list = RealProfileNotificationsRepository.TYPE_ORDER;
                    List<UiCategoryNotificationPreference> list2 = uiNotificationSettings.category_preferences;
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                    for (UiCategoryNotificationPreference uiCategoryNotificationPreference : list2) {
                        if (uiCategoryNotificationPreference.push_channel_state == ClientChannelState.CLIENT_CHANNEL_STATE_SWITCHED_ON_ENABLED) {
                            RetailerType.Companion companion = ClientChannelState.Companion;
                            uiCategoryNotificationPreference = UiCategoryNotificationPreference.copy$default(uiCategoryNotificationPreference, null, null, 503);
                        }
                        arrayList.add(uiCategoryNotificationPreference);
                    }
                    ByteString unknownFields = uiNotificationSettings.unknownFields();
                    unknownFields.getClass();
                    return new UiNotificationSettings(arrayList, unknownFields);
                }
                List list3 = RealProfileNotificationsRepository.TYPE_ORDER;
                List<UiCategoryNotificationPreference> list4 = uiNotificationSettings.category_preferences;
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
                for (UiCategoryNotificationPreference uiCategoryNotificationPreference2 : list4) {
                    Iterator it = NotificationChannelId.$ENTRIES.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            String str3 = ((NotificationChannelId) obj2).id;
                            NotificationCategory notificationCategory = uiCategoryNotificationPreference2.category;
                            if (str3.equals(notificationCategory != null ? notificationCategory.name() : null)) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    NotificationChannelId notificationChannelId = (NotificationChannelId) obj2;
                    NotificationChannelToggleState notificationChannelToggleState = notificationChannelId != null ? (NotificationChannelToggleState) map.get(notificationChannelId) : null;
                    int i2 = notificationChannelToggleState == null ? -1 : RealProfileNotificationsRepository.WhenMappings.$EnumSwitchMapping$0[notificationChannelToggleState.ordinal()];
                    if (i2 == 1 || i2 == 2) {
                        RetailerType.Companion companion2 = ClientChannelState.Companion;
                        uiCategoryNotificationPreference2 = UiCategoryNotificationPreference.copy$default(uiCategoryNotificationPreference2, null, null, 503);
                    }
                    arrayList2.add(uiCategoryNotificationPreference2);
                }
                ByteString unknownFields2 = uiNotificationSettings.unknownFields();
                unknownFields2.getClass();
                return new UiNotificationSettings(arrayList2, unknownFields2);
            case 4:
                String str4 = (String) obj3;
                DocumentCategoryEntity.RenderStyle renderStyle = (DocumentCategoryEntity.RenderStyle) this.L$0;
                List list5 = (List) this.L$1;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (list5.isEmpty()) {
                    return EmptyList.INSTANCE;
                }
                RealDocumentsManager realDocumentsManager = (RealDocumentsManager) obj4;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj6 : list5) {
                    if (FillrWidgetVersion.allowed(((Document) obj6).version_data, realDocumentsManager.currentVersion)) {
                        arrayList3.add(obj6);
                    }
                }
                List sortedWith = CollectionsKt.sortedWith(arrayList3, new b.C0008b(9));
                if (RealDocumentsManager$documents$1$WhenMappings.$EnumSwitchMapping$0[renderStyle.ordinal()] != 1) {
                    return CollectionsKt__CollectionsJVMKt.listOf(new DocumentsManager$DocumentSection(str4, sortedWith));
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj7 : sortedWith) {
                    Long l = ((Document) obj7).display_date;
                    Integer num = l != null ? new Integer(Instant.ofEpochMilli(l.longValue()).atZone(ZoneId.systemDefault()).getYear()) : null;
                    Object obj8 = linkedHashMap.get(num);
                    if (obj8 == null) {
                        obj8 = new ArrayList();
                        linkedHashMap.put(num, obj8);
                    }
                    ((List) obj8).add(obj7);
                }
                ArrayList arrayList4 = new ArrayList(linkedHashMap.size());
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    Integer num2 = (Integer) entry.getKey();
                    List list6 = (List) entry.getValue();
                    if (num2 == null || (str = String.valueOf(num2.intValue())) == null) {
                        str = str4;
                    }
                    arrayList4.add(new DocumentsManager$DocumentSection(str, list6));
                }
                return arrayList4;
            default:
                PoolsListPresenter poolsListPresenter = (PoolsListPresenter) obj3;
                AndroidStringManager androidStringManager = (AndroidStringManager) poolsListPresenter.stringManager;
                MoneyFormatter moneyFormatter = (MoneyFormatter) poolsListPresenter.moneyFormatter;
                String str5 = (String) poolsListPresenter.flowToken;
                SavingsRepositoryModel savingsRepositoryModel = (SavingsRepositoryModel) this.L$0;
                FamilyProfile familyProfile = (FamilyProfile) this.L$1;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (savingsRepositoryModel instanceof SavingsRepositoryModel.Uninstalled) {
                    SavingsRepositoryModel.Uninstalled uninstalled = (SavingsRepositoryModel.Uninstalled) savingsRepositoryModel;
                    SavingsApplet savingsApplet = uninstalled.applet;
                    String str6 = savingsApplet.title;
                    if (str6.length() == 0) {
                        str6 = null;
                    }
                    String str7 = str6 == null ? str5 : str6;
                    String str8 = savingsApplet.subtitle;
                    if (str8.length() == 0) {
                        str8 = null;
                    }
                    String str9 = str8 == null ? "" : str8;
                    FamilyProfile.ManagedAccount managedAccount = familyProfile instanceof FamilyProfile.ManagedAccount ? (FamilyProfile.ManagedAccount) familyProfile : null;
                    String str10 = managedAccount != null ? managedAccount.firstName : null;
                    zzd zzdVar = Icons.Companion;
                    PromotedAppletTileViewModel promotedAppletTileViewModel = (PromotedAppletTileViewModel) obj4;
                    return new SavingsAppletTileViewModel.Uninstalled(str7, str9, str10, uninstalled.isFullWidth, uninstalled.clientRoute, promotedAppletTileViewModel instanceof PromotedAppletTileViewModel.Loaded ? (PromotedAppletTileViewModel.Loaded) promotedAppletTileViewModel : null);
                }
                if (savingsRepositoryModel instanceof SavingsRepositoryModel.NoGoalSet) {
                    SavingsRepositoryModel.NoGoalSet noGoalSet2 = (SavingsRepositoryModel.NoGoalSet) savingsRepositoryModel;
                    Money money = noGoalSet2.savingsBalance;
                    SavingsApplet savingsApplet2 = noGoalSet2.applet;
                    String str11 = savingsApplet2.title;
                    if (str11.length() == 0) {
                        str11 = null;
                    }
                    String str12 = str11 == null ? str5 : str11;
                    String str13 = savingsApplet2.subtitle;
                    String str14 = str13.length() != 0 ? str13 : null;
                    String str15 = str14 == null ? "" : str14;
                    String format3 = moneyFormatter.format(money);
                    Long l2 = money.amount;
                    long longValue = l2 != null ? l2.longValue() : 0L;
                    ClientRoute clientRoute = noGoalSet2.clientRoute;
                    if (clientRoute == null) {
                        clientRoute = new ClientRoute.ViewSavingsHome();
                    }
                    noGoalSet = new SavingsAppletTileViewModel.Installed.NoGoalSet(str12, str15, clientRoute, format3, longValue);
                } else {
                    if (!(savingsRepositoryModel instanceof SavingsRepositoryModel.GoalSet)) {
                        if (savingsRepositoryModel == null) {
                            return new SavingsAppletTileViewModel.Loading(str5);
                        }
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    if (((RealFeatureFlagManager) ((FeatureFlagManager) poolsListPresenter.localeAssetProvider)).peekCurrentValue(LaunchDarklyFeatureFlags$SavingsAppletMultipleGoals.INSTANCE) == FeatureFlag$EnabledDisabledFeatureFlag$Options.Enabled) {
                        SavingsRepositoryModel.GoalSet goalSet = (SavingsRepositoryModel.GoalSet) savingsRepositoryModel;
                        SavingsApplet savingsApplet3 = goalSet.applet;
                        boolean z = goalSet.shouldIncludeGeneralSavings;
                        List list7 = goalSet.goals;
                        Money money2 = goalSet.savingsBalance;
                        String str16 = savingsApplet3.title;
                        if (str16.length() == 0) {
                            str16 = null;
                        }
                        String str17 = str16 == null ? str5 : str16;
                        String str18 = savingsApplet3.subtitle;
                        String str19 = str18.length() != 0 ? str18 : null;
                        String str20 = str19 == null ? "" : str19;
                        String format4 = moneyFormatter.format(money2);
                        Long l3 = money2.amount;
                        long longValue2 = l3 != null ? l3.longValue() : 0L;
                        ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                        List list8 = list7;
                        ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list8, 10));
                        Iterator it2 = list8.iterator();
                        while (it2.hasNext()) {
                            arrayList5.add(((SavingsFolder.GoalFolder) it2.next()).iconId);
                        }
                        createListBuilder.addAll(arrayList5);
                        if (z) {
                            e eVar = Emojis.Companion;
                            createListBuilder.add("extra_cash");
                        }
                        ListBuilder build = CollectionsKt__CollectionsJVMKt.build(createListBuilder);
                        ListBuilder createListBuilder2 = CollectionsKt__CollectionsJVMKt.createListBuilder();
                        ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list8, 10));
                        Iterator it3 = list8.iterator();
                        while (it3.hasNext()) {
                            arrayList6.add(((SavingsFolder.GoalFolder) it3.next()).label);
                        }
                        createListBuilder2.addAll(arrayList6);
                        if (z) {
                            Object obj9 = goalSet.generalSavingsLabel;
                            if (obj9 == null) {
                                obj9 = androidStringManager.get(R.string.savings_tile_default_general_savings_accessibility_label);
                            }
                            createListBuilder2.add(obj9);
                        }
                        ListBuilder build2 = CollectionsKt__CollectionsJVMKt.build(createListBuilder2);
                        Resources resources = androidStringManager.resources;
                        if (build2.getSize() <= 2) {
                            Object[] objArr = {CollectionsKt.joinToString$default(build2, ", ", null, null, 0, null, null, 62)};
                            resources.getClass();
                            format2 = new MessageFormat(resources.getString(R.string.savings_tile_multi_goal_icon_content_description)).format(objArr);
                            format2.getClass();
                        } else {
                            Object[] objArr2 = {CollectionsKt.joinToString$default(CollectionsKt.take(build2, 1), ", ", null, null, 0, null, null, 62), Integer.valueOf(build2.size() - 1)};
                            resources.getClass();
                            format2 = new MessageFormat(resources.getString(R.string.savings_tile_multi_goal_icon_with_overflow_content_description)).format(objArr2);
                            format2.getClass();
                        }
                        String str21 = format2;
                        ClientRoute clientRoute2 = goalSet.clientRoute;
                        if (clientRoute2 == null) {
                            clientRoute2 = new ClientRoute.ViewSavingsHome();
                        }
                        return new SavingsAppletTileViewModel.Installed.GoalSet(str17, str20, format4, longValue2, clientRoute2, build, str21);
                    }
                    SavingsRepositoryModel.GoalSet goalSet2 = (SavingsRepositoryModel.GoalSet) savingsRepositoryModel;
                    SavingsApplet savingsApplet4 = goalSet2.applet;
                    Money money3 = goalSet2.savingsBalance;
                    String str22 = savingsApplet4.title;
                    if (str22.length() == 0) {
                        str22 = null;
                    }
                    String str23 = str22 == null ? str5 : str22;
                    String str24 = savingsApplet4.subtitle;
                    String str25 = str24.length() != 0 ? str24 : null;
                    String str26 = str25 == null ? "" : str25;
                    String format5 = moneyFormatter.format(money3);
                    Long l4 = money3.amount;
                    long longValue3 = l4 != null ? l4.longValue() : 0L;
                    ClientRoute clientRoute3 = goalSet2.clientRoute;
                    if (clientRoute3 == null) {
                        clientRoute3 = new ClientRoute.ViewSavingsHome();
                    }
                    noGoalSet = new SavingsAppletTileViewModel.Installed.NoGoalSet(str23, str26, clientRoute3, format5, longValue3);
                }
                return noGoalSet;
        }
    }
}
