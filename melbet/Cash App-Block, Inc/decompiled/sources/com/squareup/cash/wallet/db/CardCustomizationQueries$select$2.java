package com.squareup.cash.wallet.db;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes7.dex */
public final /* synthetic */ class CardCustomizationQueries$select$2 extends FunctionReferenceImpl implements Function2 {
    public static final CardCustomizationQueries$select$2 INSTANCE = new CardCustomizationQueries$select$2(2, CardCustomization.class, "<init>", "<init>(Ljava/lang/String;[B)V", 0);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        str.getClass();
        return new CardCustomization(str, (byte[]) obj2);
    }
}
