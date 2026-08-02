package com.squareup.cash.storage;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.storage.StorageLink;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/cash/storage/StorageLink_SandboxedJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/cash/storage/StorageLink$Sandboxed;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class StorageLink_SandboxedJsonAdapter extends JsonAdapter {
    public volatile Constructor constructorRef;
    public final JsonAdapter longAdapter;
    public final JsonReader.Options options;

    public StorageLink_SandboxedJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("id", "signInGroupId", "createdAtMs");
        this.longAdapter = moshi.adapter(Long.TYPE, EmptySet.INSTANCE, "id");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        jsonReader.getClass();
        long j = 0L;
        jsonReader.beginObject();
        Long l = null;
        Long l2 = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                l = (Long) this.longAdapter.fromJson(jsonReader);
                if (l == null) {
                    throw Util.unexpectedNull("id", "id", jsonReader);
                }
            } else if (selectName == 1) {
                l2 = (Long) this.longAdapter.fromJson(jsonReader);
                if (l2 == null) {
                    throw Util.unexpectedNull("signInGroupId", "signInGroupId", jsonReader);
                }
            } else if (selectName == 2) {
                j = (Long) this.longAdapter.fromJson(jsonReader);
                if (j == null) {
                    throw Util.unexpectedNull("createdAtMs", "createdAtMs", jsonReader);
                }
                i = -5;
            } else {
                continue;
            }
        }
        jsonReader.endObject();
        if (i == -5) {
            Long l3 = j;
            if (l == null) {
                throw Util.missingProperty("id", "id", jsonReader);
            }
            long longValue = l.longValue();
            if (l2 != null) {
                return new StorageLink.Sandboxed(longValue, l2.longValue(), l3.longValue());
            }
            throw Util.missingProperty("signInGroupId", "signInGroupId", jsonReader);
        }
        Long l4 = j;
        Constructor constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            Class cls2 = Util.DEFAULT_CONSTRUCTOR_MARKER;
            Class cls3 = Long.TYPE;
            constructor = StorageLink.Sandboxed.class.getDeclaredConstructor(cls3, cls3, cls3, cls, cls2);
            this.constructorRef = constructor;
            constructor.getClass();
        }
        if (l == null) {
            throw Util.missingProperty("id", "id", jsonReader);
        }
        if (l2 == null) {
            throw Util.missingProperty("signInGroupId", "signInGroupId", jsonReader);
        }
        Object newInstance = constructor.newInstance(l, l2, l4, Integer.valueOf(i), null);
        newInstance.getClass();
        return (StorageLink.Sandboxed) newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        StorageLink.Sandboxed sandboxed = (StorageLink.Sandboxed) obj;
        jsonWriter.getClass();
        if (sandboxed == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("id");
        long j = sandboxed.id;
        JsonAdapter jsonAdapter = this.longAdapter;
        BalanceFeedKt$$ExternalSyntheticOutline0.m(j, jsonAdapter, jsonWriter, "signInGroupId");
        BalanceFeedKt$$ExternalSyntheticOutline0.m(sandboxed.signInGroupId, jsonAdapter, jsonWriter, "createdAtMs");
        jsonAdapter.toJson(jsonWriter, Long.valueOf(sandboxed.createdAtMs));
        jsonWriter.endObject();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(43, "GeneratedJsonAdapter(StorageLink.Sandboxed)");
    }
}
