package com.squareup.cash.wallet.data;

import com.squareup.cash.wallet.db.IssuedCardFactory;
import com.squareup.protos.cash.postcard.CashAppCard;
import com.squareup.protos.franklin.cards.CardTheme;
import com.squareup.protos.franklin.cards.CardThemeDefinition;
import com.squareup.protos.franklin.cards.CardThemeDefinitions;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function4;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class RealIssuedCardManager$getIssuedCardOrNull$1 extends SuspendLambda implements Function4 {
    public /* synthetic */ CashAppCard L$0;
    public /* synthetic */ CardThemeDefinitions L$1;
    public /* synthetic */ IssuedCardFactory L$2;
    public final /* synthetic */ RealIssuedCardManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealIssuedCardManager$getIssuedCardOrNull$1(RealIssuedCardManager realIssuedCardManager, Continuation continuation) {
        super(4, continuation);
        this.this$0 = realIssuedCardManager;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        RealIssuedCardManager$getIssuedCardOrNull$1 realIssuedCardManager$getIssuedCardOrNull$1 = new RealIssuedCardManager$getIssuedCardOrNull$1(this.this$0, (Continuation) obj4);
        realIssuedCardManager$getIssuedCardOrNull$1.L$0 = (CashAppCard) obj;
        realIssuedCardManager$getIssuedCardOrNull$1.L$1 = (CardThemeDefinitions) obj2;
        realIssuedCardManager$getIssuedCardOrNull$1.L$2 = (IssuedCardFactory) obj3;
        return realIssuedCardManager$getIssuedCardOrNull$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0042, code lost:
    
        if (r8 == null) goto L13;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CardTheme cardTheme;
        CardThemeDefinition cardThemeDefinition;
        CashAppCard cashAppCard = this.L$0;
        CardThemeDefinitions cardThemeDefinitions = this.L$1;
        IssuedCardFactory issuedCardFactory = this.L$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        String str = null;
        if (cashAppCard == null) {
            return null;
        }
        String str2 = cashAppCard.card_theme_token;
        String str3 = cashAppCard.card_token;
        str3.getClass();
        Boolean bool = cashAppCard.enabled;
        bool.getClass();
        boolean booleanValue = bool.booleanValue();
        String str4 = cashAppCard.last_four;
        str4.getClass();
        Boolean bool2 = cashAppCard.activated;
        bool2.getClass();
        boolean booleanValue2 = bool2.booleanValue();
        String str5 = cashAppCard.cardholder_name;
        CardTheme cardTheme2 = RealIssuedCardManager.DEFAULT_BLACK_CARD_THEME;
        if (str2 != null) {
            CardThemeDefinition cardThemeDefinition2 = (CardThemeDefinition) cardThemeDefinitions.card_theme_definitions.get(str2);
            cardTheme = cardThemeDefinition2 != null ? cardThemeDefinition2.card_theme : null;
        }
        cardTheme = RealIssuedCardManager.DEFAULT_BLACK_CARD_THEME;
        CardTheme cardTheme3 = cardTheme;
        if (str2 != null && (cardThemeDefinition = (CardThemeDefinition) cardThemeDefinitions.card_theme_definitions.get(str2)) != null) {
            str = cardThemeDefinition.name;
        }
        String str6 = str;
        CashAppCard.PhysicalCardOrderState physicalCardOrderState = cashAppCard.physical_card_order_state;
        boolean z = cashAppCard.card_type == CashAppCard.CardType.VIRTUAL;
        CashAppCard.ExternalIssuingAccountState externalIssuingAccountState = cashAppCard.externalIssuingAccountState;
        Boolean bool3 = cashAppCard.isCardExpired;
        boolean booleanValue3 = bool3 != null ? bool3.booleanValue() : false;
        Boolean bool4 = cashAppCard.sponsor_locked;
        return new IssuedCardFactory.IssuedCard(issuedCardFactory, str3, str4, booleanValue, z, str5, booleanValue2, cardTheme3, physicalCardOrderState, externalIssuingAccountState, booleanValue3, str6, bool4 != null ? bool4.booleanValue() : false);
    }
}
