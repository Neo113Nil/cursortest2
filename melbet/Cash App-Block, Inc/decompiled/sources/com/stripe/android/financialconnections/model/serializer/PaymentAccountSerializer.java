package com.stripe.android.financialconnections.model.serializer;

import com.stripe.android.financialconnections.model.BankAccount;
import com.stripe.android.financialconnections.model.FinancialConnectionsAccount;
import com.stripe.android.financialconnections.model.PaymentAccount;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.KeyValueSerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;

/* loaded from: classes8.dex */
public final class PaymentAccountSerializer extends KeyValueSerializer {
    public static final PaymentAccountSerializer INSTANCE = new PaymentAccountSerializer(Reflection.factory.getOrCreateKotlinClass(PaymentAccount.class));

    @Override // kotlinx.serialization.internal.KeyValueSerializer
    public final KSerializer selectDeserializer(JsonElement jsonElement) {
        jsonElement.getClass();
        JsonElement jsonElement2 = (JsonElement) JsonElementKt.getJsonObject(jsonElement).get("object");
        String content = jsonElement2 != null ? JsonElementKt.getJsonPrimitive(jsonElement2).getContent() : null;
        return (Intrinsics.areEqual(content, "linked_account") || Intrinsics.areEqual(content, "financial_connections.account")) ? FinancialConnectionsAccount.Companion.serializer() : BankAccount.Companion.serializer();
    }
}
