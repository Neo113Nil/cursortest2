package com.squareup.cash.work.applets.presenters;

import app.cash.local.presenters.LocalPresenterFactoryKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.data.js.ZiplineHistoryDataJavaScripter;
import com.squareup.cash.db2.ReactionConfig;
import com.squareup.cash.db2.activity.CashActivity;
import com.squareup.cash.mosaic.personalization.api.v1.Personalization;
import com.squareup.cash.payments.backend.api.RemotePersonalizedPaymentLoadingState;
import com.squareup.cash.payments.backend.real.RealPersonalizationRepository;
import com.squareup.cash.payments.presenters.MainPaymentPresenter$models$4$4;
import com.squareup.cash.reactions.api.ReactionsData;
import com.squareup.cash.work.applets.presenters.ShiftsTileState;
import com.squareup.cash.work.data.api.LoaderState;
import com.squareup.cash.work.identifiers.MerchantIdentifier;
import com.squareup.cash.work.service.api.BrandDetails;
import com.squareup.cash.work.service.api.ThemedColor;
import com.squareup.cash.work.service.api.ThemedImage;
import com.squareup.cash.work.tinygraph.models.Merchant;
import com.squareup.cash.work.tinygraph.models.MerchantKt;
import com.squareup.moshi._MoshiKotlinExtensionsKt;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.Role;
import com.squareup.protos.franklin.common.Reaction;
import com.squareup.protos.franklin.ui.PaymentHistoryData;
import com.squareup.protos.franklin.ui.PaymentHistoryReactions;
import com.squareup.protos.franklin.ui.UiCustomer;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class RealShiftsTileDataLoader$buildStateFlow$1 extends SuspendLambda implements Function4 {
    public final /* synthetic */ int $r8$classId = 1;
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public /* synthetic */ Object L$2;
    public int label;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealShiftsTileDataLoader$buildStateFlow$1(RealPersonalizationRepository realPersonalizationRepository, String str, Continuation continuation) {
        super(4, continuation);
        this.L$2 = realPersonalizationRepository;
        this.this$0 = str;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.$r8$classId;
        Object obj5 = this.this$0;
        switch (i) {
            case 0:
                RealShiftsTileDataLoader$buildStateFlow$1 realShiftsTileDataLoader$buildStateFlow$1 = new RealShiftsTileDataLoader$buildStateFlow$1((RealShiftsTileDataLoader) obj5, (Continuation) obj4);
                realShiftsTileDataLoader$buildStateFlow$1.L$0 = (List) obj;
                realShiftsTileDataLoader$buildStateFlow$1.L$1 = (Set) obj2;
                realShiftsTileDataLoader$buildStateFlow$1.L$2 = (LoaderState) obj3;
                return realShiftsTileDataLoader$buildStateFlow$1.invokeSuspend(Unit.INSTANCE);
            default:
                RealShiftsTileDataLoader$buildStateFlow$1 realShiftsTileDataLoader$buildStateFlow$12 = new RealShiftsTileDataLoader$buildStateFlow$1((RealPersonalizationRepository) this.L$2, (String) obj5, (Continuation) obj4);
                realShiftsTileDataLoader$buildStateFlow$12.L$0 = (CashActivity) obj;
                realShiftsTileDataLoader$buildStateFlow$12.L$1 = (ZiplineHistoryDataJavaScripter) obj2;
                return realShiftsTileDataLoader$buildStateFlow$12.invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x008e  */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r4v17, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v19, types: [java.util.ArrayList] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Map map;
        Object resolveShiftState;
        MerchantInfo merchantInfo;
        MerchantBranding merchantBranding;
        Merchant.Subscription subscription;
        PaymentHistoryData paymentHistoryData;
        UiCustomer uiCustomer;
        Image image;
        Money money;
        ?? r4;
        List list;
        Iterator it;
        PaymentHistoryReactions paymentHistoryReactions;
        PaymentHistoryReactions paymentHistoryReactions2;
        List<Reaction> list2;
        CurrencyCode currencyCode;
        Object withContext;
        int i = this.$r8$classId;
        Object obj2 = this.this$0;
        MerchantInfo merchantInfo2 = null;
        switch (i) {
            case 0:
                List<Merchant> list3 = (List) this.L$0;
                Set set = (Set) this.L$1;
                LoaderState loaderState = (LoaderState) this.L$2;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 != 0) {
                    if (i2 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                RealShiftsTileDataLoader realShiftsTileDataLoader = (RealShiftsTileDataLoader) obj2;
                if (loaderState instanceof LoaderState.Success) {
                    map = (Map) ((LoaderState.Success) loaderState).data;
                } else {
                    if (!(loaderState instanceof LoaderState.Loading) && !(loaderState instanceof LoaderState.Error)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    map = EmptyMap.INSTANCE;
                    map.getClass();
                }
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 1;
                if (set.isEmpty()) {
                    resolveShiftState = new ShiftsTileState.Error("No active memberships");
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (Merchant merchant : list3) {
                        MerchantIdentifier identifier = LocalPresenterFactoryKt.getIdentifier(merchant);
                        if (identifier != null && set.contains(merchant.id)) {
                            String name = MerchantKt.getName(merchant);
                            if (name == null) {
                                name = "";
                            }
                            String initials = MerchantKt.getInitials(merchant);
                            Map map2 = merchant.subscriptions;
                            boolean areEqual = (map2 == null || (subscription = (Merchant.Subscription) map2.get(Merchant.SubscriptionProduct.SHIFTS)) == null) ? false : Intrinsics.areEqual(subscription.isEnabled, Boolean.TRUE);
                            BrandDetails brandDetails = (BrandDetails) map.get(identifier.token);
                            if (brandDetails != null) {
                                ThemedColor themedColor = brandDetails.foregroundColor;
                                String str = themedColor != null ? themedColor.lightHex : null;
                                String str2 = themedColor != null ? themedColor.darkHex : null;
                                ThemedColor themedColor2 = brandDetails.backgroundColor;
                                String str3 = themedColor2 != null ? themedColor2.lightHex : null;
                                String str4 = themedColor2 != null ? themedColor2.darkHex : null;
                                ThemedColor themedColor3 = brandDetails.outlineColor;
                                String str5 = themedColor3 != null ? themedColor3.lightHex : null;
                                String str6 = themedColor3 != null ? themedColor3.darkHex : null;
                                ThemedImage themedImage = brandDetails.artworkImage;
                                merchantBranding = new MerchantBranding(str, str2, str3, str4, str5, str6, themedImage != null ? themedImage.lightUrl : null, themedImage != null ? themedImage.darkUrl : null);
                            } else {
                                merchantBranding = null;
                            }
                            merchantInfo = new MerchantInfo(identifier, name, initials, areEqual, merchantBranding);
                        } else {
                            merchantInfo = merchantInfo2;
                        }
                        if (merchantInfo != null) {
                            arrayList.add(merchantInfo);
                        }
                        merchantInfo2 = null;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        if (((MerchantInfo) next).hasShiftsEnabled) {
                            arrayList2.add(next);
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        MerchantInfo merchantInfo3 = (MerchantInfo) CollectionsKt.firstOrNull((List) arrayList);
                        MerchantIdentifier merchantIdentifier = merchantInfo3 != null ? merchantInfo3.identifier : null;
                        if (merchantIdentifier != null) {
                            realShiftsTileDataLoader.selectedMerchantSetter.selectMerchant(merchantIdentifier);
                        }
                        resolveShiftState = new ShiftsTileState.Loaded.NoShiftsFunctionality(RealShiftsTileDataLoader.toDisplayData(arrayList, merchantIdentifier));
                    } else {
                        resolveShiftState = realShiftsTileDataLoader.resolveShiftState(arrayList2, this);
                    }
                }
                return resolveShiftState == coroutineSingletons ? coroutineSingletons : resolveShiftState;
            default:
                RealPersonalizationRepository realPersonalizationRepository = (RealPersonalizationRepository) this.L$2;
                CashActivity cashActivity = (CashActivity) this.L$0;
                ZiplineHistoryDataJavaScripter ziplineHistoryDataJavaScripter = (ZiplineHistoryDataJavaScripter) this.L$1;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                ?? r13 = 0;
                try {
                    try {
                        if (i3 == 0) {
                            SafeTrace.throwOnFailure(obj);
                            CoroutineContext coroutineContext = realPersonalizationRepository.jsDispatcher;
                            MainPaymentPresenter$models$4$4 mainPaymentPresenter$models$4$4 = new MainPaymentPresenter$models$4$4(ziplineHistoryDataJavaScripter, cashActivity, (String) obj2, r13 == true ? 1 : 0, 11);
                            this.L$0 = cashActivity;
                            this.L$1 = null;
                            this.label = 1;
                            withContext = JobKt.withContext(coroutineContext, mainPaymentPresenter$models$4$4, this);
                            if (withContext == coroutineSingletons2) {
                                return coroutineSingletons2;
                            }
                        } else {
                            if (i3 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                            withContext = obj;
                        }
                        paymentHistoryData = (PaymentHistoryData) withContext;
                    } catch (CancellationException e) {
                        throw e;
                    }
                } catch (AssertionError | Exception unused) {
                    paymentHistoryData = null;
                }
                String str7 = (cashActivity != null ? cashActivity.role : null) == Role.SENDER ? cashActivity.recipient_render_data : cashActivity != null ? cashActivity.sender_render_data : null;
                if (str7 != null) {
                    try {
                        uiCustomer = (UiCustomer) _MoshiKotlinExtensionsKt.adapter(realPersonalizationRepository.moshi, Reflection.typeOf(UiCustomer.class)).fromJson(str7);
                    } catch (Exception unused2) {
                    }
                    String str8 = cashActivity == null ? cashActivity.their_id : null;
                    String str9 = str8 != null ? "" : str8;
                    String str10 = uiCustomer == null ? uiCustomer.full_name : null;
                    if (uiCustomer == null) {
                        Image image2 = uiCustomer.photo;
                        if (image2 == null) {
                            String str11 = uiCustomer.photo_url;
                            image2 = str11 != null ? new Image(str11, str11, 4) : null;
                        }
                        image = image2;
                    } else {
                        image = null;
                    }
                    if (cashActivity == null) {
                        Long l = cashActivity.amount;
                        money = (l == null || (currencyCode = cashActivity.amount_currency) == null) ? null : new Money(l, currencyCode, 4);
                    } else {
                        money = null;
                    }
                    Personalization personalization = paymentHistoryData == null ? paymentHistoryData.personalization : null;
                    com.squareup.cash.mosaic.personalization.api.v2.Personalization personalization2 = paymentHistoryData == null ? paymentHistoryData.personalization_payload : null;
                    String str12 = paymentHistoryData == null ? paymentHistoryData.notes : null;
                    boolean z = (cashActivity == null ? cashActivity.role : null) != Role.SENDER;
                    if (paymentHistoryData != null || (paymentHistoryReactions2 = paymentHistoryData.reactions) == null || (list2 = paymentHistoryReactions2.available_reactions) == null) {
                        r4 = EmptyList.INSTANCE;
                    } else {
                        List<Reaction> list4 = list2;
                        r4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
                        Iterator it3 = list4.iterator();
                        while (it3.hasNext()) {
                            String str13 = ((Reaction) it3.next()).data;
                            if (str13 == null) {
                                str13 = "";
                            }
                            r4.add(str13);
                        }
                    }
                    ReactionConfig reactionConfig = (ReactionConfig) realPersonalizationRepository.reactionsQueries.select$2().executeAsOneOrNull();
                    list = reactionConfig != null ? reactionConfig.extendedReactions : null;
                    if (list == null) {
                        list = EmptyList.INSTANCE;
                    }
                    List list5 = list;
                    ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list5, 10));
                    it = list5.iterator();
                    while (it.hasNext()) {
                        String str14 = ((Reaction) it.next()).data;
                        if (str14 == null) {
                            str14 = "";
                        }
                        arrayList3.add(str14);
                    }
                    if (paymentHistoryData != null || (paymentHistoryReactions = paymentHistoryData.reactions) == null || (r0 = paymentHistoryReactions.existing_reactions) == null) {
                        List list6 = EmptyList.INSTANCE;
                    }
                    return new RemotePersonalizedPaymentLoadingState.LocallyStoredPersonalizedPayment(str9, str10, image, money, personalization, personalization2, z, new ReactionsData(r4, list6, arrayList3), str12);
                }
                uiCustomer = null;
                if (cashActivity == null) {
                }
                if (str8 != null) {
                }
                if (uiCustomer == null) {
                }
                if (uiCustomer == null) {
                }
                if (cashActivity == null) {
                }
                if (paymentHistoryData == null) {
                }
                if (paymentHistoryData == null) {
                }
                if (paymentHistoryData == null) {
                }
                if ((cashActivity == null ? cashActivity.role : null) != Role.SENDER) {
                }
                if (paymentHistoryData != null) {
                }
                r4 = EmptyList.INSTANCE;
                ReactionConfig reactionConfig2 = (ReactionConfig) realPersonalizationRepository.reactionsQueries.select$2().executeAsOneOrNull();
                if (reactionConfig2 != null) {
                }
                if (list == null) {
                }
                List list52 = list;
                ArrayList arrayList32 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list52, 10));
                it = list52.iterator();
                while (it.hasNext()) {
                }
                if (paymentHistoryData != null) {
                }
                List list62 = EmptyList.INSTANCE;
                return new RemotePersonalizedPaymentLoadingState.LocallyStoredPersonalizedPayment(str9, str10, image, money, personalization, personalization2, z, new ReactionsData(r4, list62, arrayList32), str12);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealShiftsTileDataLoader$buildStateFlow$1(RealShiftsTileDataLoader realShiftsTileDataLoader, Continuation continuation) {
        super(4, continuation);
        this.this$0 = realShiftsTileDataLoader;
    }
}
