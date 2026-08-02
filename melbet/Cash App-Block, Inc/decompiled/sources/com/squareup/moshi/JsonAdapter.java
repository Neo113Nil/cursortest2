package com.squareup.moshi;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.work.webview.views.WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.adapters.PolymorphicJsonAdapterFactory;
import com.squareup.moshi.internal.NonNullJsonAdapter;
import com.squareup.moshi.internal.NullSafeJsonAdapter;
import com.squareup.moshi.internal.Util;
import com.squareup.wire.AnyMessage;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.internal.JsonFormatter;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Utf8;
import papa.PapaEvent;

/* loaded from: classes.dex */
public abstract class JsonAdapter {

    /* renamed from: com.squareup.moshi.JsonAdapter$1, reason: invalid class name */
    /* loaded from: classes9.dex */
    public final class AnonymousClass1 extends JsonAdapter {
        public final /* synthetic */ int $r8$classId;
        public final Object val$delegate;

        public /* synthetic */ AnonymousClass1(Object obj, int i) {
            this.$r8$classId = i;
            this.val$delegate = obj;
        }

        @Override // com.squareup.moshi.JsonAdapter
        public final Object fromJson(JsonReader jsonReader) {
            int i = this.$r8$classId;
            Object obj = this.val$delegate;
            switch (i) {
                case 0:
                    return ((JsonAdapter) obj).fromJson(jsonReader);
                case 1:
                    boolean z = jsonReader.lenient;
                    jsonReader.lenient = true;
                    try {
                        return ((JsonAdapter) obj).fromJson(jsonReader);
                    } finally {
                        jsonReader.lenient = z;
                    }
                case 2:
                    boolean z2 = jsonReader.failOnUnknown;
                    jsonReader.failOnUnknown = true;
                    try {
                        return ((JsonAdapter) obj).fromJson(jsonReader);
                    } finally {
                        jsonReader.failOnUnknown = z2;
                    }
                default:
                    jsonReader.getClass();
                    String nextString = jsonReader.nextString();
                    try {
                        nextString.getClass();
                        return ((JsonFormatter) obj).fromString(nextString);
                    } catch (RuntimeException unused) {
                        StringBuilder m3m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("decode failed: ", nextString, " at path ");
                        m3m.append(jsonReader.getPath());
                        throw new JsonDataException(m3m.toString());
                    }
            }
        }

        @Override // com.squareup.moshi.JsonAdapter
        public boolean isLenient() {
            int i = this.$r8$classId;
            Object obj = this.val$delegate;
            switch (i) {
                case 0:
                    return ((JsonAdapter) obj).isLenient();
                case 1:
                    return true;
                case 2:
                    return ((JsonAdapter) obj).isLenient();
                default:
                    return super.isLenient();
            }
        }

        @Override // com.squareup.moshi.JsonAdapter
        public final void toJson(JsonWriter jsonWriter, Object obj) {
            int i = this.$r8$classId;
            Object obj2 = this.val$delegate;
            switch (i) {
                case 0:
                    boolean z = jsonWriter.serializeNulls;
                    jsonWriter.serializeNulls = true;
                    try {
                        ((JsonAdapter) obj2).toJson(jsonWriter, obj);
                        return;
                    } finally {
                        jsonWriter.serializeNulls = z;
                    }
                case 1:
                    boolean z2 = jsonWriter.lenient;
                    jsonWriter.lenient = true;
                    try {
                        ((JsonAdapter) obj2).toJson(jsonWriter, obj);
                        return;
                    } finally {
                        jsonWriter.lenient = z2;
                    }
                case 2:
                    ((JsonAdapter) obj2).toJson(jsonWriter, obj);
                    return;
                default:
                    jsonWriter.getClass();
                    obj.getClass();
                    Object stringOrNumber = ((JsonFormatter) obj2).toStringOrNumber(obj);
                    if (stringOrNumber instanceof Number) {
                        jsonWriter.value((Number) stringOrNumber);
                        return;
                    } else {
                        stringOrNumber.getClass();
                        jsonWriter.value((String) stringOrNumber);
                        return;
                    }
            }
        }

        public String toString() {
            int i = this.$r8$classId;
            Object obj = this.val$delegate;
            switch (i) {
                case 0:
                    return ((JsonAdapter) obj) + ".serializeNulls()";
                case 1:
                    return ((JsonAdapter) obj) + ".lenient()";
                case 2:
                    return ((JsonAdapter) obj) + ".failOnUnknown()";
                default:
                    return super.toString();
            }
        }
    }

    public interface Factory {
        JsonAdapter create(Type type2, Set set, Moshi moshi);
    }

    public final JsonAdapter failOnUnknown() {
        return new AnonymousClass1(this, 2);
    }

    public abstract Object fromJson(JsonReader jsonReader);

    public final Object fromJson(String str) {
        Buffer buffer = new Buffer();
        buffer.m4339writeUtf8(str);
        JsonUtf8Reader jsonUtf8Reader = new JsonUtf8Reader(buffer);
        Object fromJson = fromJson(jsonUtf8Reader);
        if (isLenient() || jsonUtf8Reader.peek() == JsonReader.Token.END_DOCUMENT) {
            return fromJson;
        }
        throw new JsonDataException("JSON document was not fully consumed.");
    }

    public final Object fromJsonValue(Object obj) {
        try {
            return fromJson(new JsonValueReader(obj));
        } catch (IOException e) {
            a$$ExternalSyntheticBUOutline0.m$1(e);
            return null;
        }
    }

    public JsonAdapter indent(String str) {
        if (str != null) {
            return new AnonymousClass4(0, this, str);
        }
        a$$ExternalSyntheticBUOutline0.m$2("indent == null");
        return null;
    }

    public boolean isLenient() {
        return false;
    }

    public final JsonAdapter lenient() {
        return new AnonymousClass1(this, 1);
    }

    public final JsonAdapter nonNull() {
        return this instanceof NonNullJsonAdapter ? this : new NonNullJsonAdapter(this);
    }

    public final JsonAdapter nullSafe() {
        return this instanceof NullSafeJsonAdapter ? this : new NullSafeJsonAdapter(this);
    }

    public final JsonAdapter serializeNulls() {
        return new AnonymousClass1(this, 0);
    }

    public final String toJson(Object obj) {
        Buffer buffer = new Buffer();
        try {
            toJson(buffer, obj);
            return buffer.readUtf8();
        } catch (IOException e) {
            a$$ExternalSyntheticBUOutline0.m$1(e);
            return null;
        }
    }

    public abstract void toJson(JsonWriter jsonWriter, Object obj);

    public final Object toJsonValue(Object obj) {
        JsonValueWriter jsonValueWriter = new JsonValueWriter();
        try {
            toJson(jsonValueWriter, obj);
            return jsonValueWriter.root();
        } catch (IOException e) {
            a$$ExternalSyntheticBUOutline0.m$1(e);
            return null;
        }
    }

    /* renamed from: com.squareup.moshi.JsonAdapter$4, reason: invalid class name */
    /* loaded from: classes9.dex */
    public final class AnonymousClass4 extends JsonAdapter {
        public final /* synthetic */ int $r8$classId;
        public final Object val$delegate;
        public final Object val$indent;

        public /* synthetic */ AnonymousClass4(int i, Object obj, Object obj2) {
            this.$r8$classId = i;
            this.val$delegate = obj;
            this.val$indent = obj2;
        }

        @Override // com.squareup.moshi.JsonAdapter
        public final Object fromJson(JsonReader jsonReader) {
            String str;
            int i = this.$r8$classId;
            Object obj = this.val$indent;
            Object obj2 = this.val$delegate;
            switch (i) {
                case 0:
                    return ((JsonAdapter) obj2).fromJson(jsonReader);
                case 1:
                    jsonReader.skipValue();
                    return obj2;
                case 2:
                    jsonReader.getClass();
                    if (jsonReader.peek() == JsonReader.Token.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    JsonReader peekJson = jsonReader.peekJson();
                    try {
                        peekJson.beginObject();
                        while (true) {
                            if (!peekJson.hasNext()) {
                                str = null;
                            } else if (Intrinsics.areEqual(peekJson.nextName(), "@type")) {
                                str = peekJson.nextString();
                            } else {
                                peekJson.skipValue();
                            }
                        }
                        peekJson.close();
                        if (str == null) {
                            throw new JsonDataException("expected @type in ".concat(jsonReader.getPath()));
                        }
                        ProtoAdapter protoAdapter = (ProtoAdapter) ((Map) obj).get(str);
                        if (protoAdapter == null) {
                            StringBuilder m3m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("Cannot resolve type: ", str, " in ");
                            m3m.append(jsonReader.getPath());
                            throw new JsonDataException(m3m.toString());
                        }
                        KClass type2 = protoAdapter.getType();
                        type2.getClass();
                        Message message = (Message) ((Moshi) obj2).adapter(PapaEvent.getJavaClass(type2), Util.NO_ANNOTATIONS, null).fromJson(jsonReader);
                        ProtoAdapter protoAdapter2 = AnyMessage.ADAPTER;
                        message.getClass();
                        String typeUrl = message.adapter().getTypeUrl();
                        if (typeUrl != null) {
                            return new AnyMessage(typeUrl, message.encodeByteString());
                        }
                        WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m("recompile ", Reflection.factory.getOrCreateKotlinClass(message.getClass()), " to use it with AnyMessage");
                        return null;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            Utf8.closeFinally(peekJson, th);
                            throw th2;
                        }
                    }
                default:
                    jsonReader.getClass();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        nextName.getClass();
                        Object fromString = ((JsonFormatter) obj).fromString(nextName);
                        fromString.getClass();
                        Object fromJson = ((JsonAdapter) obj2).fromJson(jsonReader);
                        fromJson.getClass();
                        linkedHashMap.put(fromString, fromJson);
                    }
                    jsonReader.endObject();
                    return linkedHashMap;
            }
        }

        @Override // com.squareup.moshi.JsonAdapter
        public boolean isLenient() {
            switch (this.$r8$classId) {
                case 0:
                    return ((JsonAdapter) this.val$delegate).isLenient();
                default:
                    return super.isLenient();
            }
        }

        @Override // com.squareup.moshi.JsonAdapter
        public final void toJson(JsonWriter jsonWriter, Object obj) {
            int i = this.$r8$classId;
            Object obj2 = this.val$delegate;
            Object obj3 = this.val$indent;
            switch (i) {
                case 0:
                    String str = jsonWriter.indent;
                    if (str == null) {
                        str = "";
                    }
                    jsonWriter.setIndent((String) obj3);
                    try {
                        ((JsonAdapter) obj2).toJson(jsonWriter, obj);
                        return;
                    } finally {
                        jsonWriter.setIndent(str);
                    }
                case 1:
                    throw new IllegalArgumentException("Expected one of " + ((PolymorphicJsonAdapterFactory) obj3).subtypes + " but found " + obj + ", a " + obj.getClass() + ". Register this subtype.");
                case 2:
                    AnyMessage anyMessage = (AnyMessage) obj;
                    jsonWriter.getClass();
                    if (anyMessage == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    String str2 = anyMessage.typeUrl;
                    jsonWriter.beginObject();
                    jsonWriter.name("@type");
                    jsonWriter.value(str2);
                    ProtoAdapter protoAdapter = (ProtoAdapter) ((Map) obj3).get(str2);
                    if (protoAdapter == null) {
                        StringBuilder m3m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("Cannot find type for url: ", str2, " in ");
                        m3m.append(jsonWriter.getPath());
                        throw new JsonDataException(m3m.toString());
                    }
                    KClass type2 = protoAdapter.getType();
                    type2.getClass();
                    JsonAdapter adapter = ((Moshi) obj2).adapter(PapaEvent.getJavaClass(type2), Util.NO_ANNOTATIONS, null);
                    int beginFlatten = jsonWriter.beginFlatten();
                    if (!Intrinsics.areEqual(str2, protoAdapter.getTypeUrl())) {
                        StringBuilder m3m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("type mismatch: ", str2, " != ");
                        m3m2.append(protoAdapter.getTypeUrl());
                        throw new IllegalStateException(m3m2.toString().toString());
                    }
                    Object decode = protoAdapter.decode(anyMessage.value);
                    decode.getClass();
                    adapter.toJson(jsonWriter, (Message) decode);
                    jsonWriter.flattenStackSize = beginFlatten;
                    jsonWriter.endObject();
                    return;
                default:
                    Map map = (Map) obj;
                    jsonWriter.getClass();
                    jsonWriter.beginObject();
                    map.getClass();
                    for (Map.Entry entry : map.entrySet()) {
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        jsonWriter.name(((JsonFormatter) obj3).toStringOrNumber(key).toString());
                        ((JsonAdapter) obj2).toJson(jsonWriter, value);
                    }
                    jsonWriter.endObject();
                    return;
            }
        }

        public String toString() {
            switch (this.$r8$classId) {
                case 0:
                    StringBuilder sb = new StringBuilder();
                    sb.append((JsonAdapter) this.val$delegate);
                    sb.append(".indent(\"");
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, (String) this.val$indent, "\")");
                default:
                    return super.toString();
            }
        }

        public /* synthetic */ AnonymousClass4(Object obj, Object obj2, boolean z, int i) {
            this.$r8$classId = i;
            this.val$indent = obj;
            this.val$delegate = obj2;
        }
    }

    public final void toJson(BufferedSink bufferedSink, Object obj) {
        toJson(new JsonUtf8Writer(bufferedSink), obj);
    }

    public final Object fromJson(BufferedSource bufferedSource) {
        return fromJson(new JsonUtf8Reader(bufferedSource));
    }
}
