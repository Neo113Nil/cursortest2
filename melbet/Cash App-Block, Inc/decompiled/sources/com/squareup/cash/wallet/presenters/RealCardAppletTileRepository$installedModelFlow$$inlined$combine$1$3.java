package com.squareup.cash.wallet.presenters;

import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.broadway.ui.LifecyclesKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsc;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.featureflags.AmplitudeExperiments$MobilePrepurchaseCashCardPilot;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.wallet.db.CardTabHeroState;
import com.squareup.cash.wallet.db.IssuedCardFactory;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import com.squareup.lending.sync_values.ToggleEntryPointData;
import com.squareup.protos.cash.postcard.CardModule;
import com.squareup.protos.cash.postcard.CardRenderingInfo;
import com.squareup.protos.cash.postcard.CardScheme;
import com.squareup.protos.cash.postcard.CashAppCard;
import com.squareup.protos.franklin.cards.CardTheme;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class RealCardAppletTileRepository$installedModelFlow$$inlined$combine$1$3 extends SuspendLambda implements Function3 {
    public final /* synthetic */ IssuedCardFactory.IssuedCard $issuedCard$inlined;
    public int I$1;
    public /* synthetic */ FlowCollector L$0;
    public /* synthetic */ Object[] L$1;
    public CardTheme L$11;
    public FlowCollector L$2;
    public CardScheme L$5;
    public String L$6;
    public ToggleEntryPointData L$8;
    public CashAppCard.PhysicalCardOrderState L$9;
    public int label;
    public final /* synthetic */ RealCardAppletTileRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealCardAppletTileRepository$installedModelFlow$$inlined$combine$1$3(Continuation continuation, RealCardAppletTileRepository realCardAppletTileRepository, IssuedCardFactory.IssuedCard issuedCard) {
        super(3, continuation);
        this.this$0 = realCardAppletTileRepository;
        this.$issuedCard$inlined = issuedCard;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        RealCardAppletTileRepository$installedModelFlow$$inlined$combine$1$3 realCardAppletTileRepository$installedModelFlow$$inlined$combine$1$3 = new RealCardAppletTileRepository$installedModelFlow$$inlined$combine$1$3((Continuation) obj3, this.this$0, this.$issuedCard$inlined);
        realCardAppletTileRepository$installedModelFlow$$inlined$combine$1$3.L$0 = (FlowCollector) obj;
        realCardAppletTileRepository$installedModelFlow$$inlined$combine$1$3.L$1 = (Object[]) obj2;
        return realCardAppletTileRepository$installedModelFlow$$inlined$combine$1$3.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x023a, code lost:
    
        if (r1.emit(r5, r29) == r3) goto L140;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00eb A[EDGE_INSN: B:113:0x00eb->B:114:0x00eb BREAK  A[LOOP:1: B:102:0x00c9->B:119:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[LOOP:1: B:102:0x00c9->B:119:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00a2 A[LOOP:2: B:126:0x007f->B:136:0x00a2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00a6 A[EDGE_INSN: B:137:0x00a6->B:138:0x00a6 BREAK  A[LOOP:2: B:126:0x007f->B:136:0x00a2], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0162 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[LOOP:0: B:67:0x0142->B:80:?, LOOP_END, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CardScheme cardScheme;
        int intValue;
        String str;
        CashAppCard.PhysicalCardOrderState physicalCardOrderState;
        ToggleEntryPointData toggleEntryPointData;
        CardModule.HeroIssuedCardModule heroIssuedCardModule;
        CardTheme cardTheme;
        CardDetailsModel cardDetailsModel;
        CardRenderingInfo cardRenderingInfo;
        CardModule.HeroIssuedCardModule heroIssuedCardModule2;
        String str2;
        CardRenderingInfo cardRenderingInfo2;
        byte[] bArr;
        Object firstOrNull;
        FlowCollector flowCollector;
        int i;
        ToggleEntryPointData toggleEntryPointData2;
        CardTheme cardTheme2;
        CardRenderingInfo cardRenderingInfo3;
        CardRenderingInfo cardRenderingInfo4;
        List list;
        Iterator it;
        CardModule.DeliveryStatusModule deliveryStatusModule;
        boolean z;
        CashAppCard.ExternalIssuingAccountState externalIssuingAccountState;
        zzsc cardDetailsModel$CardPillModel$Installed$WithCardInfo;
        FlowCollector flowCollector2 = this.L$0;
        Object[] objArr = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        IssuedCardFactory.IssuedCard issuedCard = this.$issuedCard$inlined;
        RealCardAppletTileRepository realCardAppletTileRepository = this.this$0;
        if (i2 == 0) {
            SafeTrace.throwOnFailure(obj);
            Object obj2 = objArr[0];
            obj2.getClass();
            cardScheme = (CardScheme) obj2;
            List list2 = cardScheme.modules;
            Object obj3 = objArr[1];
            obj3.getClass();
            intValue = ((Integer) obj3).intValue();
            Object obj4 = objArr[2];
            obj4.getClass();
            str = (String) obj4;
            CardTabHeroState cardTabHeroState = (CardTabHeroState) objArr[3];
            Object obj5 = objArr[4];
            obj5.getClass();
            physicalCardOrderState = (CashAppCard.PhysicalCardOrderState) obj5;
            toggleEntryPointData = (ToggleEntryPointData) objArr[5];
            if (cardTabHeroState == null || (cardRenderingInfo4 = cardTabHeroState.rendering_info) == null || (cardTheme = cardRenderingInfo4.card_theme) == null) {
                Iterator it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        heroIssuedCardModule = null;
                        break;
                    }
                    CardModule.Type type2 = ((CardModule) it2.next()).f1328type;
                    if (type2 != null) {
                        CardModule.Type.HeroIssuedCard heroIssuedCard = type2 instanceof CardModule.Type.HeroIssuedCard ? (CardModule.Type.HeroIssuedCard) type2 : null;
                        if (heroIssuedCard != null) {
                            heroIssuedCardModule = heroIssuedCard.value;
                            if (heroIssuedCardModule == null) {
                                break;
                            }
                        }
                    }
                    heroIssuedCardModule = null;
                    if (heroIssuedCardModule == null) {
                    }
                }
                cardTheme = (heroIssuedCardModule == null || (cardRenderingInfo = heroIssuedCardModule.card_rendering_info) == null) ? null : cardRenderingInfo.card_theme;
                if (cardTheme == null && (cardTheme = issuedCard.cardTheme) == null) {
                    cardDetailsModel = null;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.L$8 = null;
                    this.L$9 = null;
                    this.L$11 = null;
                    this.label = 2;
                }
            }
            if (cardTabHeroState == null || (cardRenderingInfo3 = cardTabHeroState.rendering_info) == null || (str2 = cardRenderingInfo3.customization_image_path) == null) {
                Iterator it3 = list2.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        heroIssuedCardModule2 = null;
                        break;
                    }
                    CardModule.Type type3 = ((CardModule) it3.next()).f1328type;
                    if (type3 != null) {
                        CardModule.Type.HeroIssuedCard heroIssuedCard2 = type3 instanceof CardModule.Type.HeroIssuedCard ? (CardModule.Type.HeroIssuedCard) type3 : null;
                        if (heroIssuedCard2 != null) {
                            heroIssuedCardModule2 = heroIssuedCard2.value;
                            if (heroIssuedCardModule2 == null) {
                                break;
                            }
                        }
                    }
                    heroIssuedCardModule2 = null;
                    if (heroIssuedCardModule2 == null) {
                    }
                }
                str2 = (heroIssuedCardModule2 == null || (cardRenderingInfo2 = heroIssuedCardModule2.card_rendering_info) == null) ? null : cardRenderingInfo2.customization_image_path;
            }
            if (str2 != null) {
                FinishSetupTileBadgeCounter customizationFor = realCardAppletTileRepository.cardCustomizationRepository.getCustomizationFor(str2);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = flowCollector2;
                this.L$5 = cardScheme;
                this.L$6 = str;
                this.L$8 = toggleEntryPointData;
                this.L$9 = physicalCardOrderState;
                this.L$11 = cardTheme;
                this.I$1 = intValue;
                this.label = 1;
                firstOrNull = FlowKt.firstOrNull(customizationFor, this);
                if (firstOrNull != coroutineSingletons) {
                    flowCollector = flowCollector2;
                    i = intValue;
                    toggleEntryPointData2 = toggleEntryPointData;
                    cardTheme2 = cardTheme;
                }
                return coroutineSingletons;
            }
            bArr = null;
            list = cardScheme.modules;
            if ((list instanceof Collection) || !list.isEmpty()) {
                it = list.iterator();
                while (it.hasNext()) {
                    CardModule.Type type4 = ((CardModule) it.next()).f1328type;
                    if (type4 != null) {
                        CardModule.Type.DeliveryStatus deliveryStatus = type4 instanceof CardModule.Type.DeliveryStatus ? (CardModule.Type.DeliveryStatus) type4 : null;
                        if (deliveryStatus != null) {
                            deliveryStatusModule = deliveryStatus.value;
                            if (deliveryStatusModule == null) {
                                z = true;
                                break;
                            }
                        }
                    }
                    deliveryStatusModule = null;
                    if (deliveryStatusModule == null) {
                    }
                }
            }
            z = false;
            CardSchemeViewModel.Module.HeroCardDetails cardDetails$default = LifecyclesKt.toCardDetails$default(this.$issuedCard$inlined, cardTheme, bArr, (bArr == null || !z || cardTheme.id == CardTheme.Identifier.BRAT_ID) ? null : str, true, true, false, new CardSchemeViewModel.Module.CardAnimation.None(true, true), null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE);
            final String str3 = issuedCard.lastFour;
            boolean z2 = issuedCard.enabled;
            externalIssuingAccountState = issuedCard.externalIssuingAccountState;
            if (externalIssuingAccountState == null && externalIssuingAccountState == CashAppCard.ExternalIssuingAccountState.SUSPENDED) {
                cardDetailsModel$CardPillModel$Installed$WithCardInfo = new zzsc(str3) { // from class: com.squareup.cash.wallet.presenters.CardDetailsModel$CardPillModel$Installed$Suspended
                    public final String lastFour;

                    {
                        str3.getClass();
                        this.lastFour = str3;
                    }

                    public final boolean equals(Object obj6) {
                        if (this == obj6) {
                            return true;
                        }
                        return (obj6 instanceof CardDetailsModel$CardPillModel$Installed$Suspended) && Intrinsics.areEqual(this.lastFour, ((CardDetailsModel$CardPillModel$Installed$Suspended) obj6).lastFour);
                    }

                    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzsc
                    public final String getLastFour() {
                        return this.lastFour;
                    }

                    public final int hashCode() {
                        return this.lastFour.hashCode();
                    }

                    public final String toString() {
                        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Suspended(lastFour=", this.lastFour, ")");
                    }
                };
            } else if (!issuedCard.isExpired) {
                cardDetailsModel$CardPillModel$Installed$WithCardInfo = new zzsc(str3) { // from class: com.squareup.cash.wallet.presenters.CardDetailsModel$CardPillModel$Installed$Expired
                    public final String lastFour;

                    {
                        str3.getClass();
                        this.lastFour = str3;
                    }

                    public final boolean equals(Object obj6) {
                        if (this == obj6) {
                            return true;
                        }
                        return (obj6 instanceof CardDetailsModel$CardPillModel$Installed$Expired) && Intrinsics.areEqual(this.lastFour, ((CardDetailsModel$CardPillModel$Installed$Expired) obj6).lastFour);
                    }

                    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzsc
                    public final String getLastFour() {
                        return this.lastFour;
                    }

                    public final int hashCode() {
                        return this.lastFour.hashCode();
                    }

                    public final String toString() {
                        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Expired(lastFour=", this.lastFour, ")");
                    }
                };
            } else if (physicalCardOrderState != CashAppCard.PhysicalCardOrderState.NO_CARD && !issuedCard.activated) {
                cardDetailsModel$CardPillModel$Installed$WithCardInfo = z ? new zzsc(str3) { // from class: com.squareup.cash.wallet.presenters.CardDetailsModel$CardPillModel$Installed$PendingActivation
                    public final String lastFour;

                    {
                        str3.getClass();
                        this.lastFour = str3;
                    }

                    public final boolean equals(Object obj6) {
                        if (this == obj6) {
                            return true;
                        }
                        return (obj6 instanceof CardDetailsModel$CardPillModel$Installed$PendingActivation) && Intrinsics.areEqual(this.lastFour, ((CardDetailsModel$CardPillModel$Installed$PendingActivation) obj6).lastFour);
                    }

                    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzsc
                    public final String getLastFour() {
                        return this.lastFour;
                    }

                    public final int hashCode() {
                        return this.lastFour.hashCode();
                    }

                    public final String toString() {
                        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PendingActivation(lastFour=", this.lastFour, ")");
                    }
                } : !z2 ? new zzsc(str3) { // from class: com.squareup.cash.wallet.presenters.CardDetailsModel$CardPillModel$Installed$Locked
                    public final String lastFour;

                    {
                        str3.getClass();
                        this.lastFour = str3;
                    }

                    public final boolean equals(Object obj6) {
                        if (this == obj6) {
                            return true;
                        }
                        return (obj6 instanceof CardDetailsModel$CardPillModel$Installed$Locked) && Intrinsics.areEqual(this.lastFour, ((CardDetailsModel$CardPillModel$Installed$Locked) obj6).lastFour);
                    }

                    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzsc
                    public final String getLastFour() {
                        return this.lastFour;
                    }

                    public final int hashCode() {
                        return this.lastFour.hashCode();
                    }

                    public final String toString() {
                        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Locked(lastFour=", this.lastFour, ")");
                    }
                } : new CardDetailsModel$CardPillModel$Installed$WithCardInfo(str3);
            } else if (z2) {
                if (((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) realCardAppletTileRepository.featureFlagManager).peekCurrentValue(AmplitudeExperiments$MobilePrepurchaseCashCardPilot.INSTANCE)).enabled()) {
                    if ((toggleEntryPointData != null ? toggleEntryPointData.toggle_state : null) == ToggleEntryPointData.ToggleState.TURNED_ON) {
                        cardDetailsModel$CardPillModel$Installed$WithCardInfo = new zzsc(str3) { // from class: com.squareup.cash.wallet.presenters.CardDetailsModel$CardPillModel$Installed$WithPrepurchaseEnabled
                            public final String lastFour;

                            {
                                str3.getClass();
                                this.lastFour = str3;
                            }

                            public final boolean equals(Object obj6) {
                                if (this == obj6) {
                                    return true;
                                }
                                return (obj6 instanceof CardDetailsModel$CardPillModel$Installed$WithPrepurchaseEnabled) && Intrinsics.areEqual(this.lastFour, ((CardDetailsModel$CardPillModel$Installed$WithPrepurchaseEnabled) obj6).lastFour);
                            }

                            @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzsc
                            public final String getLastFour() {
                                return this.lastFour;
                            }

                            public final int hashCode() {
                                return this.lastFour.hashCode();
                            }

                            public final String toString() {
                                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("WithPrepurchaseEnabled(lastFour=", this.lastFour, ")");
                            }
                        };
                    }
                }
                if (intValue > 0) {
                    cardDetailsModel$CardPillModel$Installed$WithCardInfo = new CardDetailsModel$CardPillModel$Installed$WithActiveOffer(str3, intValue);
                } else {
                    CashAppCard.PhysicalCardOrderState physicalCardOrderState2 = issuedCard.physicalCardOrderState;
                    if (physicalCardOrderState2 != null) {
                        int ordinal = physicalCardOrderState2.ordinal();
                        if (ordinal == 2) {
                            cardDetailsModel$CardPillModel$Installed$WithCardInfo = new zzsc(str3) { // from class: com.squareup.cash.wallet.presenters.CardDetailsModel$CardPillModel$Installed$Preparing
                                public final String lastFour;

                                {
                                    str3.getClass();
                                    this.lastFour = str3;
                                }

                                public final boolean equals(Object obj6) {
                                    if (this == obj6) {
                                        return true;
                                    }
                                    return (obj6 instanceof CardDetailsModel$CardPillModel$Installed$Preparing) && Intrinsics.areEqual(this.lastFour, ((CardDetailsModel$CardPillModel$Installed$Preparing) obj6).lastFour);
                                }

                                @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzsc
                                public final String getLastFour() {
                                    return this.lastFour;
                                }

                                public final int hashCode() {
                                    return this.lastFour.hashCode();
                                }

                                public final String toString() {
                                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Preparing(lastFour=", this.lastFour, ")");
                                }
                            };
                        } else if (ordinal == 3) {
                            cardDetailsModel$CardPillModel$Installed$WithCardInfo = new zzsc(str3) { // from class: com.squareup.cash.wallet.presenters.CardDetailsModel$CardPillModel$Installed$Shipped
                                public final String lastFour;

                                {
                                    str3.getClass();
                                    this.lastFour = str3;
                                }

                                public final boolean equals(Object obj6) {
                                    if (this == obj6) {
                                        return true;
                                    }
                                    return (obj6 instanceof CardDetailsModel$CardPillModel$Installed$Shipped) && Intrinsics.areEqual(this.lastFour, ((CardDetailsModel$CardPillModel$Installed$Shipped) obj6).lastFour);
                                }

                                @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzsc
                                public final String getLastFour() {
                                    return this.lastFour;
                                }

                                public final int hashCode() {
                                    return this.lastFour.hashCode();
                                }

                                public final String toString() {
                                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Shipped(lastFour=", this.lastFour, ")");
                                }
                            };
                        }
                    }
                    cardDetailsModel$CardPillModel$Installed$WithCardInfo = new CardDetailsModel$CardPillModel$Installed$WithCardInfo(str3);
                }
            } else {
                cardDetailsModel$CardPillModel$Installed$WithCardInfo = new zzsc(str3) { // from class: com.squareup.cash.wallet.presenters.CardDetailsModel$CardPillModel$Installed$Locked
                    public final String lastFour;

                    {
                        str3.getClass();
                        this.lastFour = str3;
                    }

                    public final boolean equals(Object obj6) {
                        if (this == obj6) {
                            return true;
                        }
                        return (obj6 instanceof CardDetailsModel$CardPillModel$Installed$Locked) && Intrinsics.areEqual(this.lastFour, ((CardDetailsModel$CardPillModel$Installed$Locked) obj6).lastFour);
                    }

                    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzsc
                    public final String getLastFour() {
                        return this.lastFour;
                    }

                    public final int hashCode() {
                        return this.lastFour.hashCode();
                    }

                    public final String toString() {
                        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Locked(lastFour=", this.lastFour, ")");
                    }
                };
            }
            cardDetailsModel = new CardDetailsModel(cardDetails$default, cardDetailsModel$CardPillModel$Installed$WithCardInfo);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$5 = null;
            this.L$6 = null;
            this.L$8 = null;
            this.L$9 = null;
            this.L$11 = null;
            this.label = 2;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    SafeTrace.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.I$1;
            cardTheme2 = this.L$11;
            CashAppCard.PhysicalCardOrderState physicalCardOrderState3 = this.L$9;
            toggleEntryPointData2 = this.L$8;
            str = this.L$6;
            cardScheme = this.L$5;
            flowCollector = this.L$2;
            SafeTrace.throwOnFailure(obj);
            physicalCardOrderState = physicalCardOrderState3;
            firstOrNull = obj;
        }
        cardTheme = cardTheme2;
        bArr = (byte[]) firstOrNull;
        toggleEntryPointData = toggleEntryPointData2;
        intValue = i;
        flowCollector2 = flowCollector;
        list = cardScheme.modules;
        if (list instanceof Collection) {
        }
        it = list.iterator();
        while (it.hasNext()) {
        }
        z = false;
        CardSchemeViewModel.Module.HeroCardDetails cardDetails$default2 = LifecyclesKt.toCardDetails$default(this.$issuedCard$inlined, cardTheme, bArr, (bArr == null || !z || cardTheme.id == CardTheme.Identifier.BRAT_ID) ? null : str, true, true, false, new CardSchemeViewModel.Module.CardAnimation.None(true, true), null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE);
        final String str32 = issuedCard.lastFour;
        boolean z22 = issuedCard.enabled;
        externalIssuingAccountState = issuedCard.externalIssuingAccountState;
        if (externalIssuingAccountState == null) {
        }
        if (!issuedCard.isExpired) {
        }
        cardDetailsModel = new CardDetailsModel(cardDetails$default2, cardDetailsModel$CardPillModel$Installed$WithCardInfo);
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$5 = null;
        this.L$6 = null;
        this.L$8 = null;
        this.L$9 = null;
        this.L$11 = null;
        this.label = 2;
    }
}
