package com.stripe.android.financialconnections.model.serializer;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.stripe.android.financialconnections.model.Entry;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.KeyValueSerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;

/* loaded from: classes8.dex */
public final class EntrySerializer extends KeyValueSerializer {
    public static final EntrySerializer INSTANCE = new EntrySerializer(Reflection.factory.getOrCreateKotlinClass(Entry.class));

    @Override // kotlinx.serialization.internal.KeyValueSerializer
    public final KSerializer selectDeserializer(JsonElement jsonElement) {
        KSerializer serializer;
        jsonElement.getClass();
        JsonElement jsonElement2 = (JsonElement) JsonElementKt.getJsonObject(jsonElement).get("type");
        String content = jsonElement2 != null ? JsonElementKt.getJsonPrimitive(jsonElement2).getContent() : null;
        if (Intrinsics.areEqual(content, "text")) {
            serializer = Entry.Text.Companion.serializer();
        } else {
            if (!Intrinsics.areEqual(content, "image")) {
                JsonElement jsonElement3 = (JsonElement) JsonElementKt.getJsonObject(jsonElement).get("type");
                throw new IllegalArgumentException(Recorder$$ExternalSyntheticOutline2.m("Unknown type! ", jsonElement3 != null ? JsonElementKt.getJsonPrimitive(jsonElement3).getContent() : null));
            }
            serializer = Entry.Image.Companion.serializer();
        }
        return serializer;
    }
}
