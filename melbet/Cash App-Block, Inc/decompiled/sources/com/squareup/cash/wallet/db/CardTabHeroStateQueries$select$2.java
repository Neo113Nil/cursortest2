package com.squareup.cash.wallet.db;

import com.squareup.protos.cash.postcard.CardRenderingInfo;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes7.dex */
public final /* synthetic */ class CardTabHeroStateQueries$select$2 extends FunctionReferenceImpl implements Function5 {
    public static final CardTabHeroStateQueries$select$2 INSTANCE = new CardTabHeroStateQueries$select$2(5, CardTabHeroState.class, "<init>", "<init>(JLjava/lang/String;Lcom/squareup/protos/cash/postcard/CardRenderingInfo;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", 0);

    @Override // kotlin.jvm.functions.Function5
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return new CardTabHeroState(((Number) obj).longValue(), (String) obj2, (CardRenderingInfo) obj3, (Boolean) obj4, (Boolean) obj5);
    }
}
