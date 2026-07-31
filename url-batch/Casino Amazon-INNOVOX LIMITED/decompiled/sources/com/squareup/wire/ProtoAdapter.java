package com.squareup.wire;

import com.google.firebase.messaging.Constants;
import com.onesignal.inAppMessages.internal.display.impl.WebViewManager;
import com.squareup.wire.Message;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.ReflectionKt;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;

/* compiled from: ProtoAdapter.kt */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b&\u0018\u0000 g*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002fgBG\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00018\u0000\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\r\u0010\u000eB\u001d\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u000f¢\u0006\u0004\b\r\u0010\u0010B'\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u000f\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\r\u0010\u0011B/\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u000f\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u0012B9\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u000f\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\r\u0010\u0013B\u001f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006¢\u0006\u0004\b\r\u0010\u0014B)\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\r\u0010\u0015B1\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u0016B;\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\r\u0010\u0017BC\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u000f\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00018\u0000\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\r\u0010\u0018J\u0015\u0010+\u001a\u00028\u00002\u0006\u0010,\u001a\u00028\u0000H&¢\u0006\u0002\u0010-J\u0015\u0010.\u001a\u00020/2\u0006\u0010,\u001a\u00028\u0000H&¢\u0006\u0002\u00100J\u001f\u00101\u001a\u00020/2\u0006\u00102\u001a\u00020/2\b\u0010,\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u00103J\u001d\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u0010,\u001a\u00028\u0000H&¢\u0006\u0002\u00108J\u001d\u00104\u001a\u0002052\u0006\u00106\u001a\u0002092\u0006\u0010,\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010:J'\u0010;\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00102\u001a\u00020/2\b\u0010,\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010<J'\u0010;\u001a\u0002052\u0006\u00106\u001a\u0002092\u0006\u00102\u001a\u00020/2\b\u0010,\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010=J\u001b\u00104\u001a\u0002052\u0006\u0010>\u001a\u00020?2\u0006\u0010,\u001a\u00028\u0000¢\u0006\u0002\u0010@J\u0013\u00104\u001a\u00020A2\u0006\u0010,\u001a\u00028\u0000¢\u0006\u0002\u0010BJ\u0013\u0010C\u001a\u00020D2\u0006\u0010,\u001a\u00028\u0000¢\u0006\u0002\u0010EJ\u001b\u00104\u001a\u0002052\u0006\u0010F\u001a\u00020G2\u0006\u0010,\u001a\u00028\u0000¢\u0006\u0002\u0010HJ\u0015\u0010I\u001a\u00028\u00002\u0006\u0010J\u001a\u00020KH&¢\u0006\u0002\u0010LJ\u0015\u0010I\u001a\u00028\u00002\u0006\u0010J\u001a\u00020MH\u0016¢\u0006\u0002\u0010NJ\u0013\u0010I\u001a\u00028\u00002\u0006\u0010O\u001a\u00020A¢\u0006\u0002\u0010PJ\u0013\u0010I\u001a\u00028\u00002\u0006\u0010O\u001a\u00020D¢\u0006\u0002\u0010QJ\u0013\u0010I\u001a\u00028\u00002\u0006\u0010R\u001a\u00020S¢\u0006\u0002\u0010TJ\u001c\u0010U\u001a\u0002052\u0006\u0010J\u001a\u00020K2\f\u0010V\u001a\b\u0012\u0004\u0012\u00028\u00000WJ\u001c\u0010U\u001a\u0002052\u0006\u0010J\u001a\u00020M2\f\u0010V\u001a\b\u0012\u0004\u0012\u00028\u00000WJ\u0013\u0010I\u001a\u00028\u00002\u0006\u0010F\u001a\u00020X¢\u0006\u0002\u0010YJ\u0015\u0010Z\u001a\u00020\b2\u0006\u0010,\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010[J\u0019\u0010\\\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010]\u001a\u00020^H\u0000¢\u0006\u0002\b_J\u0012\u0010`\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000&0\u0000J\u0012\u0010a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000&0\u0000R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0015\u0010\u000b\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u0013\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001eR\"\u0010%\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000&\u0018\u00010\u0000X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\"\u0010)\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000&\u0018\u00010\u0000X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010(R\u0014\u0010b\u001a\u00020c8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bd\u0010e¨\u0006h"}, d2 = {"Lcom/squareup/wire/ProtoAdapter;", "E", "", "fieldEncoding", "Lcom/squareup/wire/FieldEncoding;", WebViewManager.EVENT_TYPE_KEY, "Lkotlin/reflect/KClass;", "typeUrl", "", "syntax", "Lcom/squareup/wire/Syntax;", "identity", "sourceFile", "<init>", "(Lcom/squareup/wire/FieldEncoding;Lkotlin/reflect/KClass;Ljava/lang/String;Lcom/squareup/wire/Syntax;Ljava/lang/Object;Ljava/lang/String;)V", "Ljava/lang/Class;", "(Lcom/squareup/wire/FieldEncoding;Ljava/lang/Class;)V", "(Lcom/squareup/wire/FieldEncoding;Ljava/lang/Class;Ljava/lang/String;)V", "(Lcom/squareup/wire/FieldEncoding;Ljava/lang/Class;Ljava/lang/String;Lcom/squareup/wire/Syntax;)V", "(Lcom/squareup/wire/FieldEncoding;Ljava/lang/Class;Ljava/lang/String;Lcom/squareup/wire/Syntax;Ljava/lang/Object;)V", "(Lcom/squareup/wire/FieldEncoding;Lkotlin/reflect/KClass;)V", "(Lcom/squareup/wire/FieldEncoding;Lkotlin/reflect/KClass;Ljava/lang/String;)V", "(Lcom/squareup/wire/FieldEncoding;Lkotlin/reflect/KClass;Ljava/lang/String;Lcom/squareup/wire/Syntax;)V", "(Lcom/squareup/wire/FieldEncoding;Lkotlin/reflect/KClass;Ljava/lang/String;Lcom/squareup/wire/Syntax;Ljava/lang/Object;)V", "(Lcom/squareup/wire/FieldEncoding;Ljava/lang/Class;Ljava/lang/String;Lcom/squareup/wire/Syntax;Ljava/lang/Object;Ljava/lang/String;)V", "getFieldEncoding$wire_runtime", "()Lcom/squareup/wire/FieldEncoding;", "getType", "()Lkotlin/reflect/KClass;", "getTypeUrl", "()Ljava/lang/String;", "getSyntax", "()Lcom/squareup/wire/Syntax;", "getIdentity", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getSourceFile", "packedAdapter", "", "getPackedAdapter$wire_runtime", "()Lcom/squareup/wire/ProtoAdapter;", "repeatedAdapter", "getRepeatedAdapter$wire_runtime", "redact", "value", "(Ljava/lang/Object;)Ljava/lang/Object;", "encodedSize", "", "(Ljava/lang/Object;)I", "encodedSizeWithTag", "tag", "(ILjava/lang/Object;)I", "encode", "", "writer", "Lcom/squareup/wire/ProtoWriter;", "(Lcom/squareup/wire/ProtoWriter;Ljava/lang/Object;)V", "Lcom/squareup/wire/ReverseProtoWriter;", "(Lcom/squareup/wire/ReverseProtoWriter;Ljava/lang/Object;)V", "encodeWithTag", "(Lcom/squareup/wire/ProtoWriter;ILjava/lang/Object;)V", "(Lcom/squareup/wire/ReverseProtoWriter;ILjava/lang/Object;)V", "sink", "Lokio/BufferedSink;", "(Lokio/BufferedSink;Ljava/lang/Object;)V", "", "(Ljava/lang/Object;)[B", "encodeByteString", "Lokio/ByteString;", "(Ljava/lang/Object;)Lokio/ByteString;", "stream", "Ljava/io/OutputStream;", "(Ljava/io/OutputStream;Ljava/lang/Object;)V", "decode", "reader", "Lcom/squareup/wire/ProtoReader;", "(Lcom/squareup/wire/ProtoReader;)Ljava/lang/Object;", "Lcom/squareup/wire/ProtoReader32;", "(Lcom/squareup/wire/ProtoReader32;)Ljava/lang/Object;", "bytes", "([B)Ljava/lang/Object;", "(Lokio/ByteString;)Ljava/lang/Object;", "source", "Lokio/BufferedSource;", "(Lokio/BufferedSource;)Ljava/lang/Object;", "tryDecode", "destination", "", "Ljava/io/InputStream;", "(Ljava/io/InputStream;)Ljava/lang/Object;", "toString", "(Ljava/lang/Object;)Ljava/lang/String;", "withLabel", Constants.ScionAnalytics.PARAM_LABEL, "Lcom/squareup/wire/WireField$Label;", "withLabel$wire_runtime", "asPacked", "asRepeated", "isStruct", "", "isStruct$wire_runtime", "()Z", "EnumConstantNotFoundException", "Companion", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class ProtoAdapter<E> {
    public static final ProtoAdapter<Boolean> BOOL;
    public static final ProtoAdapter<Boolean> BOOL_VALUE;
    public static final ProtoAdapter<ByteString> BYTES;
    public static final ProtoAdapter<ByteString> BYTES_VALUE;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final ProtoAdapter<Double> DOUBLE;
    public static final ProtoAdapter<double[]> DOUBLE_ARRAY;
    public static final ProtoAdapter<Double> DOUBLE_VALUE;
    public static final ProtoAdapter<Duration> DURATION;
    public static final ProtoAdapter<Unit> EMPTY;
    public static final ProtoAdapter<Integer> FIXED32;
    public static final ProtoAdapter<int[]> FIXED32_ARRAY;
    public static final ProtoAdapter<Long> FIXED64;
    public static final ProtoAdapter<long[]> FIXED64_ARRAY;
    public static final ProtoAdapter<Float> FLOAT;
    public static final ProtoAdapter<float[]> FLOAT_ARRAY;
    public static final ProtoAdapter<Float> FLOAT_VALUE;
    public static final ProtoAdapter<Instant> INSTANT;
    public static final ProtoAdapter<Integer> INT32;
    public static final ProtoAdapter<int[]> INT32_ARRAY;
    public static final ProtoAdapter<Integer> INT32_VALUE;
    public static final ProtoAdapter<Long> INT64;
    public static final ProtoAdapter<long[]> INT64_ARRAY;
    public static final ProtoAdapter<Long> INT64_VALUE;
    public static final ProtoAdapter<Integer> SFIXED32;
    public static final ProtoAdapter<int[]> SFIXED32_ARRAY;
    public static final ProtoAdapter<Long> SFIXED64;
    public static final ProtoAdapter<long[]> SFIXED64_ARRAY;
    public static final ProtoAdapter<Integer> SINT32;
    public static final ProtoAdapter<int[]> SINT32_ARRAY;
    public static final ProtoAdapter<Long> SINT64;
    public static final ProtoAdapter<long[]> SINT64_ARRAY;
    public static final ProtoAdapter<String> STRING;
    public static final ProtoAdapter<String> STRING_VALUE;
    public static final ProtoAdapter<List<?>> STRUCT_LIST;
    public static final ProtoAdapter<Map<String, ?>> STRUCT_MAP;
    public static final ProtoAdapter STRUCT_NULL;
    public static final ProtoAdapter<Object> STRUCT_VALUE;
    public static final ProtoAdapter<Integer> UINT32;
    public static final ProtoAdapter<int[]> UINT32_ARRAY;
    public static final ProtoAdapter<Integer> UINT32_VALUE;
    public static final ProtoAdapter<Long> UINT64;
    public static final ProtoAdapter<long[]> UINT64_ARRAY;
    public static final ProtoAdapter<Long> UINT64_VALUE;
    private final FieldEncoding fieldEncoding;
    private final E identity;
    private final ProtoAdapter<List<E>> packedAdapter;
    private final ProtoAdapter<List<E>> repeatedAdapter;
    private final String sourceFile;
    private final Syntax syntax;
    private final KClass<?> type;
    private final String typeUrl;

    @JvmStatic
    public static final <M extends Message<?, ?>> ProtoAdapter<M> get(M m) {
        return INSTANCE.get((Companion) m);
    }

    @JvmStatic
    public static final <M> ProtoAdapter<M> get(Class<M> cls) {
        return INSTANCE.get(cls);
    }

    @JvmStatic
    public static final ProtoAdapter<?> get(String str) {
        return INSTANCE.get(str);
    }

    @JvmStatic
    public static final ProtoAdapter<?> get(String str, ClassLoader classLoader) {
        return INSTANCE.get(str, classLoader);
    }

    @JvmStatic
    public static final <E extends WireEnum> EnumAdapter<E> newEnumAdapter(Class<E> cls) {
        return INSTANCE.newEnumAdapter(cls);
    }

    @JvmStatic
    public static final <K, V> ProtoAdapter<Map<K, V>> newMapAdapter(ProtoAdapter<K> protoAdapter, ProtoAdapter<V> protoAdapter2) {
        return INSTANCE.newMapAdapter(protoAdapter, protoAdapter2);
    }

    @JvmStatic
    public static final <M extends Message<M, B>, B extends Message.Builder<M, B>> ProtoAdapter<M> newMessageAdapter(Class<M> cls) {
        return INSTANCE.newMessageAdapter(cls);
    }

    @JvmStatic
    public static final <M extends Message<M, B>, B extends Message.Builder<M, B>> ProtoAdapter<M> newMessageAdapter(Class<M> cls, String str) {
        return INSTANCE.newMessageAdapter(cls, str);
    }

    @JvmStatic
    public static final <M extends Message<M, B>, B extends Message.Builder<M, B>> ProtoAdapter<M> newMessageAdapter(Class<M> cls, String str, Syntax syntax) {
        return INSTANCE.newMessageAdapter(cls, str, syntax);
    }

    @JvmStatic
    public static final <M extends Message<M, B>, B extends Message.Builder<M, B>> ProtoAdapter<M> newMessageAdapter(Class<M> cls, String str, Syntax syntax, ClassLoader classLoader) {
        return INSTANCE.newMessageAdapter(cls, str, syntax, classLoader);
    }

    public abstract E decode(ProtoReader reader) throws IOException;

    public abstract void encode(ProtoWriter writer, E value) throws IOException;

    public abstract int encodedSize(E value);

    public abstract E redact(E value);

    public ProtoAdapter(FieldEncoding fieldEncoding, KClass<?> kClass, String str, Syntax syntax, E e, String str2) {
        PackedProtoAdapter packedProtoAdapter;
        Intrinsics.checkNotNullParameter(fieldEncoding, "fieldEncoding");
        Intrinsics.checkNotNullParameter(syntax, "syntax");
        this.fieldEncoding = fieldEncoding;
        this.type = kClass;
        this.typeUrl = str;
        this.syntax = syntax;
        this.identity = e;
        this.sourceFile = str2;
        boolean z = this instanceof PackedProtoAdapter;
        RepeatedProtoAdapter repeatedProtoAdapter = null;
        if (z || (this instanceof RepeatedProtoAdapter) || fieldEncoding == FieldEncoding.LENGTH_DELIMITED) {
            packedProtoAdapter = null;
        } else {
            if (getFieldEncoding() == FieldEncoding.LENGTH_DELIMITED) {
                throw new IllegalArgumentException("Unable to pack a length-delimited type.".toString());
            }
            packedProtoAdapter = new PackedProtoAdapter(this);
        }
        this.packedAdapter = packedProtoAdapter;
        if (!(this instanceof RepeatedProtoAdapter) && !z) {
            repeatedProtoAdapter = new RepeatedProtoAdapter(this);
        }
        this.repeatedAdapter = repeatedProtoAdapter;
    }

    public /* synthetic */ ProtoAdapter(FieldEncoding fieldEncoding, KClass kClass, String str, Syntax syntax, Object obj, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(fieldEncoding, (KClass<?>) kClass, str, syntax, (i & 16) != 0 ? null : obj, (i & 32) != 0 ? null : str2);
    }

    /* renamed from: getFieldEncoding$wire_runtime, reason: from getter */
    public final FieldEncoding getFieldEncoding() {
        return this.fieldEncoding;
    }

    public final KClass<?> getType() {
        return this.type;
    }

    public final String getTypeUrl() {
        return this.typeUrl;
    }

    public final Syntax getSyntax() {
        return this.syntax;
    }

    public final E getIdentity() {
        return this.identity;
    }

    public final String getSourceFile() {
        return this.sourceFile;
    }

    public final ProtoAdapter<List<E>> getPackedAdapter$wire_runtime() {
        return this.packedAdapter;
    }

    public final ProtoAdapter<List<E>> getRepeatedAdapter$wire_runtime() {
        return this.repeatedAdapter;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProtoAdapter(FieldEncoding fieldEncoding, Class<?> type) {
        this(fieldEncoding, (KClass<?>) JvmClassMappingKt.getKotlinClass(type));
        Intrinsics.checkNotNullParameter(fieldEncoding, "fieldEncoding");
        Intrinsics.checkNotNullParameter(type, "type");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProtoAdapter(FieldEncoding fieldEncoding, Class<?> type, String str) {
        this(fieldEncoding, (KClass<?>) JvmClassMappingKt.getKotlinClass(type), str, Syntax.PROTO_2);
        Intrinsics.checkNotNullParameter(fieldEncoding, "fieldEncoding");
        Intrinsics.checkNotNullParameter(type, "type");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProtoAdapter(FieldEncoding fieldEncoding, Class<?> type, String str, Syntax syntax) {
        this(fieldEncoding, (KClass<?>) JvmClassMappingKt.getKotlinClass(type), str, syntax);
        Intrinsics.checkNotNullParameter(fieldEncoding, "fieldEncoding");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(syntax, "syntax");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProtoAdapter(FieldEncoding fieldEncoding, Class<?> type, String str, Syntax syntax, E e) {
        this(fieldEncoding, (KClass<?>) JvmClassMappingKt.getKotlinClass(type), str, syntax, e, (String) null);
        Intrinsics.checkNotNullParameter(fieldEncoding, "fieldEncoding");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(syntax, "syntax");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProtoAdapter(FieldEncoding fieldEncoding, KClass<?> kClass) {
        this(fieldEncoding, kClass, (String) null, Syntax.PROTO_2);
        Intrinsics.checkNotNullParameter(fieldEncoding, "fieldEncoding");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProtoAdapter(FieldEncoding fieldEncoding, KClass<?> kClass, String str) {
        this(fieldEncoding, kClass, str, Syntax.PROTO_2);
        Intrinsics.checkNotNullParameter(fieldEncoding, "fieldEncoding");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProtoAdapter(FieldEncoding fieldEncoding, KClass<?> kClass, String str, Syntax syntax) {
        this(fieldEncoding, kClass, str, syntax, (Object) null);
        Intrinsics.checkNotNullParameter(fieldEncoding, "fieldEncoding");
        Intrinsics.checkNotNullParameter(syntax, "syntax");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProtoAdapter(FieldEncoding fieldEncoding, KClass<?> kClass, String str, Syntax syntax, E e) {
        this(fieldEncoding, kClass, str, syntax, e, (String) null);
        Intrinsics.checkNotNullParameter(fieldEncoding, "fieldEncoding");
        Intrinsics.checkNotNullParameter(syntax, "syntax");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProtoAdapter(FieldEncoding fieldEncoding, Class<?> type, String str, Syntax syntax, E e, String str2) {
        this(fieldEncoding, (KClass<?>) JvmClassMappingKt.getKotlinClass(type), str, syntax, e, str2);
        Intrinsics.checkNotNullParameter(fieldEncoding, "fieldEncoding");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(syntax, "syntax");
    }

    public final void encode(OutputStream stream, E value) throws IOException {
        Intrinsics.checkNotNullParameter(stream, "stream");
        BufferedSink buffer = Okio.buffer(Okio.sink(stream));
        encode(buffer, (BufferedSink) value);
        buffer.emit();
    }

    public E decode(ProtoReader32 reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        return decode(reader.asProtoReader());
    }

    public final E decode(InputStream stream) throws IOException {
        Intrinsics.checkNotNullParameter(stream, "stream");
        return decode(Okio.buffer(Okio.source(stream)));
    }

    public final ProtoAdapter<List<E>> asPacked() {
        if (this.fieldEncoding == FieldEncoding.LENGTH_DELIMITED) {
            throw new IllegalArgumentException("Unable to pack a length-delimited type.".toString());
        }
        ProtoAdapter<List<E>> protoAdapter = this.packedAdapter;
        if (protoAdapter != null) {
            return protoAdapter;
        }
        throw new UnsupportedOperationException("Can't create a packed adapter from a packed or repeated adapter.");
    }

    public final ProtoAdapter<List<E>> asRepeated() {
        ProtoAdapter<List<E>> protoAdapter = this.repeatedAdapter;
        if (protoAdapter != null) {
            return protoAdapter;
        }
        throw new UnsupportedOperationException("Can't create a repeated adapter from a repeated or packed adapter.");
    }

    public final boolean isStruct$wire_runtime() {
        return Intrinsics.areEqual(this, STRUCT_MAP) || Intrinsics.areEqual(this, STRUCT_LIST) || Intrinsics.areEqual(this, STRUCT_VALUE) || Intrinsics.areEqual(this, STRUCT_NULL);
    }

    /* compiled from: ProtoAdapter.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001d\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\t¢\u0006\u0004\b\u0007\u0010\nR\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/squareup/wire/ProtoAdapter$EnumConstantNotFoundException;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "value", "", WebViewManager.EVENT_TYPE_KEY, "Lkotlin/reflect/KClass;", "<init>", "(ILkotlin/reflect/KClass;)V", "Ljava/lang/Class;", "(ILjava/lang/Class;)V", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class EnumConstantNotFoundException extends IllegalArgumentException {
        public final int value;

        public EnumConstantNotFoundException(int i, KClass<?> kClass) {
            super("Unknown enum tag " + i + " for " + ((kClass == null || (r4 = JvmClassMappingKt.getJavaClass((KClass) kClass)) == null) ? null : r4.getName()));
            Class javaClass;
            this.value = i;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public EnumConstantNotFoundException(int i, Class<?> type) {
            this(i, (KClass<?>) JvmClassMappingKt.getKotlinClass(type));
            Intrinsics.checkNotNullParameter(type, "type");
        }
    }

    /* compiled from: ProtoAdapter.kt */
    @Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\t\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0016\n\u0002\b\t\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0001\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\\B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JB\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b0\u00060\u0005\"\u0004\b\u0001\u0010\u0007\"\u0004\b\u0002\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\u0005H\u0007JH\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\f0\u0005\"\u0014\b\u0001\u0010\f*\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\u000e0\r\"\u0014\b\u0002\u0010\u000e*\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\u000e0\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\f0\u0011H\u0007JP\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\f0\u0005\"\u0014\b\u0001\u0010\f*\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\u000e0\r\"\u0014\b\u0002\u0010\u000e*\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\u000e0\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\f0\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0007JX\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\f0\u0005\"\u0014\b\u0001\u0010\f*\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\u000e0\r\"\u0014\b\u0002\u0010\u000e*\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\u000e0\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\f0\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0007Jb\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\f0\u0005\"\u0014\b\u0001\u0010\f*\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\u000e0\r\"\u0014\b\u0002\u0010\u000e*\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\u000e0\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\f0\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0007J&\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u001a0\u0019\"\b\b\u0001\u0010\u001a*\u00020\u001b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u001a0\u0011H\u0007J-\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\f0\u0005\"\u0010\b\u0001\u0010\f*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\r2\u0006\u0010\u001d\u001a\u0002H\fH\u0007¢\u0006\u0002\u0010\u001eJ\"\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\f0\u0005\"\u0004\b\u0001\u0010\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\f0\u0011H\u0007J\u0014\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u001f\u001a\u00020\u0013H\u0007J\u001e\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u001f\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0007R\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020#0\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020%0\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020#0\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020%0\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010*\u001a\b\u0012\u0004\u0012\u00020#0\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010+\u001a\b\u0012\u0004\u0012\u00020%0\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010,\u001a\b\u0012\u0004\u0012\u00020#0\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010-\u001a\b\u0012\u0004\u0012\u00020%0\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u00100\u001a\b\u0012\u0004\u0012\u0002010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u00102\u001a\b\u0012\u0004\u0012\u00020/0\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u00103\u001a\b\u0012\u0004\u0012\u0002010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u00104\u001a\b\u0012\u0004\u0012\u00020/0\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u00105\u001a\b\u0012\u0004\u0012\u0002010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u00106\u001a\b\u0012\u0004\u0012\u00020/0\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u00107\u001a\b\u0012\u0004\u0012\u0002010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u00108\u001a\b\u0012\u0004\u0012\u00020/0\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u00109\u001a\b\u0012\u0004\u0012\u0002010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010:\u001a\b\u0012\u0004\u0012\u00020;0\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010<\u001a\b\u0012\u0004\u0012\u00020=0\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010>\u001a\b\u0012\u0004\u0012\u00020?0\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010@\u001a\b\u0012\u0004\u0012\u00020A0\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010B\u001a\b\u0012\u0004\u0012\u00020C0\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00130\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010E\u001a\b\u0012\u0004\u0012\u00020F0\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010G\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0002\b\u0003\u0018\u00010\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001c\u0010H\u001a\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010I0\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010J\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010K0\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010L\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010M\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010?0\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010N\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010;0\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010O\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010/0\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010P\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010/0\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010Q\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010R\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010S\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010T\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010U\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010C0\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001a\u0010V\u001a\f\u0012\b\u0012\u00060Wj\u0002`X0\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001a\u0010Y\u001a\f\u0012\b\u0012\u00060Zj\u0002`[0\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006]"}, d2 = {"Lcom/squareup/wire/ProtoAdapter$Companion;", "", "<init>", "()V", "newMapAdapter", "Lcom/squareup/wire/ProtoAdapter;", "", "K", "V", "keyAdapter", "valueAdapter", "newMessageAdapter", "M", "Lcom/squareup/wire/Message;", "B", "Lcom/squareup/wire/Message$Builder;", WebViewManager.EVENT_TYPE_KEY, "Ljava/lang/Class;", "typeUrl", "", "syntax", "Lcom/squareup/wire/Syntax;", "classLoader", "Ljava/lang/ClassLoader;", "newEnumAdapter", "Lcom/squareup/wire/EnumAdapter;", "E", "Lcom/squareup/wire/WireEnum;", "get", "message", "(Lcom/squareup/wire/Message;)Lcom/squareup/wire/ProtoAdapter;", "adapterString", "BOOL", "", "INT32", "", "INT32_ARRAY", "", "UINT32", "UINT32_ARRAY", "SINT32", "SINT32_ARRAY", "FIXED32", "FIXED32_ARRAY", "SFIXED32", "SFIXED32_ARRAY", "INT64", "", "INT64_ARRAY", "", "UINT64", "UINT64_ARRAY", "SINT64", "SINT64_ARRAY", "FIXED64", "FIXED64_ARRAY", "SFIXED64", "SFIXED64_ARRAY", "FLOAT", "", "FLOAT_ARRAY", "", "DOUBLE", "", "DOUBLE_ARRAY", "", "BYTES", "Lokio/ByteString;", "STRING", "EMPTY", "", "STRUCT_MAP", "STRUCT_LIST", "", "STRUCT_NULL", "", "STRUCT_VALUE", "DOUBLE_VALUE", "FLOAT_VALUE", "INT64_VALUE", "UINT64_VALUE", "INT32_VALUE", "UINT32_VALUE", "BOOL_VALUE", "STRING_VALUE", "BYTES_VALUE", "DURATION", "Ljava/time/Duration;", "Lcom/squareup/wire/Duration;", "INSTANT", "Ljava/time/Instant;", "Lcom/squareup/wire/Instant;", "UnsupportedTypeProtoAdapter", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final <M extends Message<M, B>, B extends Message.Builder<M, B>> ProtoAdapter<M> newMessageAdapter(Class<M> type) {
            Intrinsics.checkNotNullParameter(type, "type");
            return ReflectionKt.createRuntimeMessageAdapter$default(type, null, Syntax.PROTO_2, null, false, 24, null);
        }

        @JvmStatic
        public final <M extends Message<M, B>, B extends Message.Builder<M, B>> ProtoAdapter<M> newMessageAdapter(Class<M> type, String typeUrl) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(typeUrl, "typeUrl");
            return ReflectionKt.createRuntimeMessageAdapter$default(type, typeUrl, Syntax.PROTO_2, null, false, 24, null);
        }

        @JvmStatic
        public final <M extends Message<M, B>, B extends Message.Builder<M, B>> ProtoAdapter<M> newMessageAdapter(Class<M> type, String typeUrl, Syntax syntax) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(typeUrl, "typeUrl");
            Intrinsics.checkNotNullParameter(syntax, "syntax");
            return ReflectionKt.createRuntimeMessageAdapter$default(type, typeUrl, syntax, null, false, 24, null);
        }

        @JvmStatic
        public final <M extends Message<M, B>, B extends Message.Builder<M, B>> ProtoAdapter<M> newMessageAdapter(Class<M> type, String typeUrl, Syntax syntax, ClassLoader classLoader) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(typeUrl, "typeUrl");
            Intrinsics.checkNotNullParameter(syntax, "syntax");
            return ReflectionKt.createRuntimeMessageAdapter$default(type, typeUrl, syntax, classLoader, false, 16, null);
        }

        @JvmStatic
        public final <E extends WireEnum> EnumAdapter<E> newEnumAdapter(Class<E> type) {
            Intrinsics.checkNotNullParameter(type, "type");
            return new RuntimeEnumAdapter(type);
        }

        @JvmStatic
        public final <M extends Message<?, ?>> ProtoAdapter<M> get(M message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return get(message.getClass());
        }

        @JvmStatic
        public final <M> ProtoAdapter<M> get(Class<M> type) {
            Intrinsics.checkNotNullParameter(type, "type");
            try {
                Object obj = type.getField("ADAPTER").get(null);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<M of com.squareup.wire.ProtoAdapter.Companion.get>");
                return (ProtoAdapter) obj;
            } catch (IllegalAccessException e) {
                throw new IllegalArgumentException("failed to access " + type.getName() + "#ADAPTER", e);
            } catch (NoSuchFieldException e2) {
                throw new IllegalArgumentException("failed to access " + type.getName() + "#ADAPTER", e2);
            }
        }

        @JvmStatic
        public final ProtoAdapter<?> get(String adapterString) {
            Intrinsics.checkNotNullParameter(adapterString, "adapterString");
            return get(adapterString, ProtoAdapter.class.getClassLoader());
        }

        @JvmStatic
        public final ProtoAdapter<?> get(String adapterString, ClassLoader classLoader) {
            Intrinsics.checkNotNullParameter(adapterString, "adapterString");
            try {
                int indexOf$default = StringsKt.indexOf$default((CharSequence) adapterString, '#', 0, false, 6, (Object) null);
                String substring = adapterString.substring(0, indexOf$default);
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                String substring2 = adapterString.substring(indexOf$default + 1);
                Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                Object obj = Class.forName(substring, true, classLoader).getField(substring2).get(null);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<kotlin.Any>");
                return (ProtoAdapter) obj;
            } catch (ClassNotFoundException e) {
                throw new IllegalArgumentException("failed to access " + adapterString, e);
            } catch (IllegalAccessException e2) {
                throw new IllegalArgumentException("failed to access " + adapterString, e2);
            } catch (NoSuchFieldException e3) {
                throw new IllegalArgumentException("failed to access " + adapterString, e3);
            }
        }

        /* compiled from: ProtoAdapter.kt */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000fH\u0016¨\u0006\u0010"}, d2 = {"Lcom/squareup/wire/ProtoAdapter$Companion$UnsupportedTypeProtoAdapter;", "Lcom/squareup/wire/ProtoAdapter;", "", "<init>", "()V", "redact", "value", "encodedSize", "encode", "writer", "Lcom/squareup/wire/ProtoWriter;", "Lcom/squareup/wire/ReverseProtoWriter;", "decode", "reader", "Lcom/squareup/wire/ProtoReader;", "Lcom/squareup/wire/ProtoReader32;", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class UnsupportedTypeProtoAdapter extends ProtoAdapter {
            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ int encodedSize(Object obj) {
                return ((Number) encodedSize((Void) obj)).intValue();
            }

            public UnsupportedTypeProtoAdapter() {
                super(FieldEncoding.LENGTH_DELIMITED, (KClass<?>) Reflection.getOrCreateKotlinClass(Void.class));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Void redact(Void value) {
                Intrinsics.checkNotNullParameter(value, "value");
                throw new IllegalStateException("Operation not supported.");
            }

            public Void encodedSize(Void value) {
                Intrinsics.checkNotNullParameter(value, "value");
                throw new IllegalStateException("Operation not supported.");
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Void encode(ProtoWriter writer, Void value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                throw new IllegalStateException("Operation not supported.");
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Void encode(ReverseProtoWriter writer, Void value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                throw new IllegalStateException("Operation not supported.");
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Void decode(ProtoReader reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                throw new IllegalStateException("Operation not supported.");
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Void decode(ProtoReader32 reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                throw new IllegalStateException("Operation not supported.");
            }
        }

        @JvmStatic
        public final <K, V> ProtoAdapter<Map<K, V>> newMapAdapter(ProtoAdapter<K> keyAdapter, ProtoAdapter<V> valueAdapter) {
            Intrinsics.checkNotNullParameter(keyAdapter, "keyAdapter");
            Intrinsics.checkNotNullParameter(valueAdapter, "valueAdapter");
            return new MapProtoAdapter(keyAdapter, valueAdapter);
        }
    }

    static {
        Companion.UnsupportedTypeProtoAdapter unsupportedTypeProtoAdapter;
        Companion.UnsupportedTypeProtoAdapter unsupportedTypeProtoAdapter2;
        ProtoAdapter<Boolean> commonBool = ProtoAdapterKt.commonBool();
        BOOL = commonBool;
        ProtoAdapter<Integer> commonInt32 = ProtoAdapterKt.commonInt32();
        INT32 = commonInt32;
        INT32_ARRAY = new IntArrayProtoAdapter(commonInt32);
        ProtoAdapter<Integer> commonUint32 = ProtoAdapterKt.commonUint32();
        UINT32 = commonUint32;
        UINT32_ARRAY = new IntArrayProtoAdapter(commonUint32);
        ProtoAdapter<Integer> commonSint32 = ProtoAdapterKt.commonSint32();
        SINT32 = commonSint32;
        SINT32_ARRAY = new IntArrayProtoAdapter(commonSint32);
        ProtoAdapter<Integer> commonFixed32 = ProtoAdapterKt.commonFixed32();
        FIXED32 = commonFixed32;
        FIXED32_ARRAY = new IntArrayProtoAdapter(commonFixed32);
        ProtoAdapter<Integer> commonSfixed32 = ProtoAdapterKt.commonSfixed32();
        SFIXED32 = commonSfixed32;
        SFIXED32_ARRAY = new IntArrayProtoAdapter(commonSfixed32);
        ProtoAdapter<Long> commonInt64 = ProtoAdapterKt.commonInt64();
        INT64 = commonInt64;
        INT64_ARRAY = new LongArrayProtoAdapter(commonInt64);
        ProtoAdapter<Long> commonUint64 = ProtoAdapterKt.commonUint64();
        UINT64 = commonUint64;
        UINT64_ARRAY = new LongArrayProtoAdapter(commonUint64);
        ProtoAdapter<Long> commonSint64 = ProtoAdapterKt.commonSint64();
        SINT64 = commonSint64;
        SINT64_ARRAY = new LongArrayProtoAdapter(commonSint64);
        ProtoAdapter<Long> commonFixed64 = ProtoAdapterKt.commonFixed64();
        FIXED64 = commonFixed64;
        FIXED64_ARRAY = new LongArrayProtoAdapter(commonFixed64);
        ProtoAdapter<Long> commonSfixed64 = ProtoAdapterKt.commonSfixed64();
        SFIXED64 = commonSfixed64;
        SFIXED64_ARRAY = new LongArrayProtoAdapter(commonSfixed64);
        FloatProtoAdapter commonFloat = ProtoAdapterKt.commonFloat();
        FLOAT = commonFloat;
        FLOAT_ARRAY = new FloatArrayProtoAdapter(commonFloat);
        DoubleProtoAdapter commonDouble = ProtoAdapterKt.commonDouble();
        DOUBLE = commonDouble;
        DOUBLE_ARRAY = new DoubleArrayProtoAdapter(commonDouble);
        ProtoAdapter<ByteString> commonBytes = ProtoAdapterKt.commonBytes();
        BYTES = commonBytes;
        ProtoAdapter<String> commonString = ProtoAdapterKt.commonString();
        STRING = commonString;
        EMPTY = ProtoAdapterKt.commonEmpty();
        STRUCT_MAP = ProtoAdapterKt.commonStructMap();
        STRUCT_LIST = ProtoAdapterKt.commonStructList();
        STRUCT_NULL = ProtoAdapterKt.commonStructNull();
        STRUCT_VALUE = ProtoAdapterKt.commonStructValue();
        DOUBLE_VALUE = ProtoAdapterKt.commonWrapper(commonDouble, "type.googleapis.com/google.protobuf.DoubleValue");
        FLOAT_VALUE = ProtoAdapterKt.commonWrapper(commonFloat, "type.googleapis.com/google.protobuf.FloatValue");
        INT64_VALUE = ProtoAdapterKt.commonWrapper(commonInt64, "type.googleapis.com/google.protobuf.Int64Value");
        UINT64_VALUE = ProtoAdapterKt.commonWrapper(commonUint64, "type.googleapis.com/google.protobuf.UInt64Value");
        INT32_VALUE = ProtoAdapterKt.commonWrapper(commonInt32, "type.googleapis.com/google.protobuf.Int32Value");
        UINT32_VALUE = ProtoAdapterKt.commonWrapper(commonUint32, "type.googleapis.com/google.protobuf.UInt32Value");
        BOOL_VALUE = ProtoAdapterKt.commonWrapper(commonBool, "type.googleapis.com/google.protobuf.BoolValue");
        STRING_VALUE = ProtoAdapterKt.commonWrapper(commonString, "type.googleapis.com/google.protobuf.StringValue");
        BYTES_VALUE = ProtoAdapterKt.commonWrapper(commonBytes, "type.googleapis.com/google.protobuf.BytesValue");
        try {
            unsupportedTypeProtoAdapter = ProtoAdapterKt.commonDuration();
        } catch (NoClassDefFoundError unused) {
            unsupportedTypeProtoAdapter = new Companion.UnsupportedTypeProtoAdapter();
        }
        DURATION = unsupportedTypeProtoAdapter;
        try {
            unsupportedTypeProtoAdapter2 = ProtoAdapterKt.commonInstant();
        } catch (NoClassDefFoundError unused2) {
            unsupportedTypeProtoAdapter2 = new Companion.UnsupportedTypeProtoAdapter();
        }
        INSTANT = unsupportedTypeProtoAdapter2;
    }

    public int encodedSizeWithTag(int tag, E value) {
        if (value == null) {
            return 0;
        }
        int encodedSize = encodedSize(value);
        if (getFieldEncoding() == FieldEncoding.LENGTH_DELIMITED) {
            encodedSize += ProtoWriter.INSTANCE.varint32Size$wire_runtime(encodedSize);
        }
        return encodedSize + ProtoWriter.INSTANCE.tagSize$wire_runtime(tag);
    }

    public void encode(ReverseProtoWriter writer, E value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        writer.writeForward$wire_runtime(new ProtoAdapterKt$delegateEncode$1(this, value));
    }

    public void encodeWithTag(ProtoWriter writer, int tag, E value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value != null) {
            writer.writeTag(tag, getFieldEncoding());
            if (getFieldEncoding() == FieldEncoding.LENGTH_DELIMITED) {
                writer.writeVarint32(encodedSize(value));
            }
            encode(writer, (ProtoWriter) value);
        }
    }

    public void encodeWithTag(ReverseProtoWriter writer, int tag, E value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value != null) {
            if (getFieldEncoding() == FieldEncoding.LENGTH_DELIMITED) {
                int byteCount = writer.getByteCount();
                encode(writer, (ReverseProtoWriter) value);
                writer.writeVarint32(writer.getByteCount() - byteCount);
            } else {
                encode(writer, (ReverseProtoWriter) value);
            }
            writer.writeTag(tag, getFieldEncoding());
        }
    }

    public final void encode(BufferedSink sink, E value) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        ReverseProtoWriter reverseProtoWriter = new ReverseProtoWriter();
        encode(reverseProtoWriter, (ReverseProtoWriter) value);
        reverseProtoWriter.writeTo(sink);
    }

    public final byte[] encode(E value) {
        Buffer buffer = new Buffer();
        encode((BufferedSink) buffer, (Buffer) value);
        return buffer.readByteArray();
    }

    public final ByteString encodeByteString(E value) {
        Buffer buffer = new Buffer();
        encode((BufferedSink) buffer, (Buffer) value);
        return buffer.readByteString();
    }

    public final E decode(byte[] bytes) throws IOException {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return decode(ProtoReader32Kt.ProtoReader32$default(bytes, 0, 0, 6, (Object) null));
    }

    public final E decode(ByteString bytes) throws IOException {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return decode(ProtoReader32Kt.ProtoReader32$default(bytes, 0, 0, 6, (Object) null));
    }

    public final E decode(BufferedSource source) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        return decode(new ProtoReader(source));
    }

    public final void tryDecode(ProtoReader reader, List<E> destination) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (reader.beforePossiblyPackedScalar$wire_runtime()) {
            destination.add(decode(reader));
        }
    }

    public final void tryDecode(ProtoReader32 reader, List<E> destination) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (reader.beforePossiblyPackedScalar()) {
            destination.add(decode(reader));
        }
    }

    public String toString(E value) {
        return String.valueOf(value);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ProtoAdapter<?> withLabel$wire_runtime(WireField.Label label) {
        Intrinsics.checkNotNullParameter(label, "label");
        return label.isRepeated() ? label.isPacked() ? asPacked() : asRepeated() : this;
    }
}
