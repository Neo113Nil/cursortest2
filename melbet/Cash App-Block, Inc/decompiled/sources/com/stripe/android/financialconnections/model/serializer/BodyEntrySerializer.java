package com.stripe.android.financialconnections.model.serializer;

import defpackage.FinancialConnectionsGenericInfoScreen;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.KeyValueSerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;

/* loaded from: classes4.dex */
public final class BodyEntrySerializer extends KeyValueSerializer {
    public static final BodyEntrySerializer INSTANCE = new BodyEntrySerializer(Reflection.factory.getOrCreateKotlinClass(FinancialConnectionsGenericInfoScreen.Body.Entry.class));

    @Override // kotlinx.serialization.internal.KeyValueSerializer
    public final KSerializer selectDeserializer(JsonElement jsonElement) {
        jsonElement.getClass();
        JsonElement jsonElement2 = (JsonElement) JsonElementKt.getJsonObject(jsonElement).get("type");
        String content = jsonElement2 != null ? JsonElementKt.getJsonPrimitive(jsonElement2).getContent() : null;
        if (content != null) {
            int hashCode = content.hashCode();
            if (hashCode != 3556653) {
                if (hashCode != 100313435) {
                    if (hashCode == 233716657 && content.equals("bullets")) {
                        return FinancialConnectionsGenericInfoScreen.Body.Entry.Bullets.Companion.serializer();
                    }
                } else if (content.equals("image")) {
                    return FinancialConnectionsGenericInfoScreen.Body.Entry.Image.Companion.serializer();
                }
            } else if (content.equals("text")) {
                return FinancialConnectionsGenericInfoScreen.Body.Entry.Text.Companion.serializer();
            }
        }
        return FinancialConnectionsGenericInfoScreen.Body.Entry.Unknown.Companion.serializer();
    }
}
