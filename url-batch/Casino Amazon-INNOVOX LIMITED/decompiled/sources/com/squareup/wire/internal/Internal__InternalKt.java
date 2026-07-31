package com.squareup.wire.internal;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoReader32;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;

/* compiled from: Internal.kt */
@Metadata(d1 = {"\u0000¼\u0001\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0016\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0013\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0012\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002\u001a\u001e\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00060\u0004\"\u0004\b\u0000\u0010\u0005\"\u0004\b\u0001\u0010\u0006\u001a,\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u000bH\u0007\u001a \u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00020\u000b\u001a>\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00060\u0004\"\u0004\b\u0000\u0010\u0005\"\u0004\b\u0001\u0010\u00062\u0006\u0010\b\u001a\u00020\t2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u0006\u0018\u00010\rH\u0007\u001a2\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00060\u0004\"\u0004\b\u0000\u0010\u0005\"\u0004\b\u0001\u0010\u00062\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00060\r\u001a(\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00020\u000b\"\u0004\b\u0000\u0010\u00022\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00020\u000b\u001a:\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00060\r\"\u0004\b\u0000\u0010\u0005\"\u0004\b\u0001\u0010\u00062\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00060\r\u001a:\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00060\r\"\u0004\b\u0000\u0010\u0005\"\u0004\b\u0001\u0010\u00062\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00060\r\u001a!\u0010\u0010\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u00022\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0011\u001a\u0002H\u0002¢\u0006\u0002\u0010\u0012\u001a1\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00020\u000b\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u000b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00020\u001aH\u0007¢\u0006\u0002\b\u001b\u001aC\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00060\r\"\u0004\b\u0000\u0010\u0005\"\u0004\b\u0001\u0010\u0006*\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00060\r2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00060\u001aH\u0007¢\u0006\u0002\b\u001b\u001a\u001a\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00152\b\u0010\u001f\u001a\u0004\u0018\u00010\u0015\u001a'\u0010 \u001a\u00060!j\u0002`\"2\u0016\u0010#\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00150$\"\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010%\u001a\u0012\u0010&\u001a\u00020'2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000b\u001a\u0016\u0010&\u001a\u00020'2\u000e\u0010\f\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\r\u001a\u001a\u0010(\u001a\u00020)2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00152\b\u0010\u001f\u001a\u0004\u0018\u00010\u0015\u001a$\u0010(\u001a\u00020)2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00152\b\u0010\u001f\u001a\u0004\u0018\u00010\u00152\b\u0010*\u001a\u0004\u0018\u00010\u0015\u001aK\u0010(\u001a\u00020)2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00152\b\u0010\u001f\u001a\u0004\u0018\u00010\u00152\b\u0010*\u001a\u0004\u0018\u00010\u00152\b\u0010+\u001a\u0004\u0018\u00010\u00152\u0016\u0010,\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00150$\"\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010-\u001a\u000e\u0010/\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t\u001a\u0014\u0010/\u001a\u00020\t2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u001a\u000e\u00101\u001a\u00020\t2\u0006\u00102\u001a\u00020\t\u001a\u0016\u00103\u001a\u00020\t2\u0006\u00102\u001a\u00020\t2\u0006\u00104\u001a\u00020\t\u001a\u000e\u00105\u001a\u00020\t2\u0006\u00102\u001a\u00020\t\u001a\u001e\u00106\u001a\u00020'2\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020)\u001a\u001e\u0010<\u001a\u00020'2\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020)\u001a\u001e\u0010=\u001a\u00020'2\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020)\u001a\u001e\u0010>\u001a\u00020'2\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020)\u001a\u001e\u0010?\u001a\u00020'2\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020)\u001a\u001e\u0010@\u001a\u00020'2\u0006\u00107\u001a\u00020A2\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020)\u001a\u001e\u0010B\u001a\u00020'2\u0006\u00107\u001a\u00020A2\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020)\u001a\u001e\u0010C\u001a\u00020'2\u0006\u00107\u001a\u00020A2\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020)\u001a\u001e\u0010D\u001a\u00020'2\u0006\u00107\u001a\u00020A2\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020)\u001a\u001e\u0010E\u001a\u00020'2\u0006\u00107\u001a\u00020A2\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020)\u001a\u001e\u0010F\u001a\u00020'2\u0006\u00107\u001a\u00020G2\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020)\u001a\u001e\u0010H\u001a\u00020'2\u0006\u00107\u001a\u00020I2\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020)\u001a\u000e\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020M\u001a\u000e\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020N\u001a\u000e\u0010O\u001a\u00020)2\u0006\u0010L\u001a\u00020M\u001a\u000e\u0010O\u001a\u00020)2\u0006\u0010L\u001a\u00020N\u001a\u000e\u0010P\u001a\u00020Q2\u0006\u0010L\u001a\u00020M\u001a\u000e\u0010P\u001a\u00020Q2\u0006\u0010L\u001a\u00020N\u001a\u000e\u0010R\u001a\u00020S2\u0006\u0010L\u001a\u00020M\u001a\u000e\u0010R\u001a\u00020S2\u0006\u0010L\u001a\u00020N\u001a\u000e\u0010T\u001a\u00020)2\u0006\u0010L\u001a\u00020M\u001a\u000e\u0010T\u001a\u00020)2\u0006\u0010L\u001a\u00020N\u001a\u000e\u0010U\u001a\u00020Q2\u0006\u0010L\u001a\u00020M\u001a\u000e\u0010U\u001a\u00020Q2\u0006\u0010L\u001a\u00020N\u001a\u000e\u0010V\u001a\u00020)2\u0006\u0010L\u001a\u00020M\u001a\u000e\u0010V\u001a\u00020)2\u0006\u0010L\u001a\u00020N\u001a\u000e\u0010W\u001a\u00020Q2\u0006\u0010L\u001a\u00020M\u001a\u000e\u0010W\u001a\u00020Q2\u0006\u0010L\u001a\u00020N\u001a\u000e\u0010X\u001a\u00020)2\u0006\u0010L\u001a\u00020M\u001a\u000e\u0010X\u001a\u00020)2\u0006\u0010L\u001a\u00020N\u001a\u000e\u0010Y\u001a\u00020Q2\u0006\u0010L\u001a\u00020M\u001a\u000e\u0010Y\u001a\u00020Q2\u0006\u0010L\u001a\u00020N\u001a\u000e\u0010Z\u001a\u00020)2\u0006\u0010L\u001a\u00020M\u001a\u000e\u0010Z\u001a\u00020)2\u0006\u0010L\u001a\u00020N\u001a\u000e\u0010[\u001a\u00020Q2\u0006\u0010L\u001a\u00020M\u001a\u000e\u0010[\u001a\u00020Q2\u0006\u0010L\u001a\u00020N\u001a\u001f\u0010\\\u001a\u00020\u001d*\u00060]j\u0002`^2\b\u0010_\u001a\u0004\u0018\u00010\u0015H\u0000¢\u0006\u0002\u0010`\u001a\u0015\u0010a\u001a\u00020)*\u00060]j\u0002`^H\u0000¢\u0006\u0002\u0010b\u001a\u001f\u0010\\\u001a\u00020\u001d*\u00060cj\u0002`d2\b\u0010_\u001a\u0004\u0018\u00010\u0015H\u0000¢\u0006\u0002\u0010e\u001a\u0015\u0010a\u001a\u00020)*\u00060cj\u0002`dH\u0000¢\u0006\u0002\u0010f\" \u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u0014*\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\"\u000e\u0010.\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006g"}, d2 = {"newMutableList", "", "T", "newMutableMap", "", "K", "V", "copyOf", "name", "", "list", "", "map", "", "immutableCopyOf", "immutableCopyOfMapWithStructValues", "immutableCopyOfStruct", "value", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "typeName", "Lkotlin/reflect/KClass;", "", "getTypeName$Internal__InternalKt", "(Ljava/lang/Object;)Lkotlin/reflect/KClass;", "redactElements", "adapter", "Lcom/squareup/wire/ProtoAdapter;", "-redactElements", "equals", "", "a", "b", "missingRequiredFields", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "args", "", "([Ljava/lang/Object;)Ljava/lang/IllegalStateException;", "checkElementsNotNull", "", "countNonNull", "", "c", "d", "rest", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)I", "ESCAPED_CHARS", "sanitize", "values", "boxedOneOfClassName", "oneOfName", "boxedOneOfKeyFieldName", "fieldName", "boxedOneOfKeysFieldName", "encodeArray_int32", "array", "", "writer", "Lcom/squareup/wire/ReverseProtoWriter;", "tag", "encodeArray_uint32", "encodeArray_sint32", "encodeArray_fixed32", "encodeArray_sfixed32", "encodeArray_int64", "", "encodeArray_uint64", "encodeArray_sint64", "encodeArray_fixed64", "encodeArray_sfixed64", "encodeArray_float", "", "encodeArray_double", "", "decodePrimitive_double", "", "reader", "Lcom/squareup/wire/ProtoReader32;", "Lcom/squareup/wire/ProtoReader;", "decodePrimitive_fixed32", "decodePrimitive_fixed64", "", "decodePrimitive_float", "", "decodePrimitive_int32", "decodePrimitive_int64", "decodePrimitive_sfixed32", "decodePrimitive_sfixed64", "decodePrimitive_sint32", "decodePrimitive_sint64", "decodePrimitive_uint32", "decodePrimitive_uint64", "commonEquals", "Ljava/time/Instant;", "Lcom/squareup/wire/Instant;", "other", "(Ljava/time/Instant;Ljava/lang/Object;)Z", "commonHashCode", "(Ljava/time/Instant;)I", "Ljava/time/Duration;", "Lcom/squareup/wire/Duration;", "(Ljava/time/Duration;Ljava/lang/Object;)Z", "(Ljava/time/Duration;)I", "wire-runtime"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "com/squareup/wire/internal/Internal")
/* loaded from: classes3.dex */
final /* synthetic */ class Internal__InternalKt {
    private static final String ESCAPED_CHARS = ",[]{}\\";

    public static final int countNonNull(Object obj, Object obj2) {
        return (obj != null ? 1 : 0) + (obj2 == null ? 0 : 1);
    }

    public static final int countNonNull(Object obj, Object obj2, Object obj3) {
        return (obj != null ? 1 : 0) + (obj2 != null ? 1 : 0) + (obj3 == null ? 0 : 1);
    }

    public static final <T> List<T> newMutableList() {
        return new MutableOnWriteList(CollectionsKt.emptyList());
    }

    public static final <K, V> Map<K, V> newMutableMap() {
        return new LinkedHashMap();
    }

    @Deprecated(message = "Please regenerate code using wire-compiler version 3.0.0 or higher.", replaceWith = @ReplaceWith(expression = "com.squareup.internal.Internal.copyOf(list)", imports = {}))
    public static final <T> List<T> copyOf(String name, List<? extends T> list) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNull(list);
        return Internal.copyOf(list);
    }

    public static final <T> List<T> copyOf(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        if (list == CollectionsKt.emptyList() || (list instanceof ImmutableList)) {
            return new MutableOnWriteList(list);
        }
        return new ArrayList(list);
    }

    @Deprecated(message = "Please regenerate code using wire-compiler version 3.0.0 or higher.", replaceWith = @ReplaceWith(expression = "com.squareup.internal.Internal.copyOf(map)", imports = {}))
    public static final <K, V> Map<K, V> copyOf(String name, Map<K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNull(map);
        return Internal.copyOf(map);
    }

    public static final <K, V> Map<K, V> copyOf(Map<K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        return new LinkedHashMap(map);
    }

    public static final <T> List<T> immutableCopyOf(String name, List<? extends T> list) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(list, "list");
        if (list instanceof MutableOnWriteList) {
            list = (List<T>) ((MutableOnWriteList) list).getMutableList$wire_runtime();
        }
        if (list == CollectionsKt.emptyList() || (list instanceof ImmutableList)) {
            return (List<T>) list;
        }
        ImmutableList immutableList = new ImmutableList(list);
        if (immutableList.contains(null)) {
            throw new IllegalArgumentException((name + ".contains(null)").toString());
        }
        return immutableList;
    }

    public static final <K, V> Map<K, V> immutableCopyOf(String name, Map<K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(map, "map");
        if (map.isEmpty()) {
            return MapsKt.emptyMap();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        Set<K> keySet = linkedHashMap.keySet();
        Intrinsics.checkNotNull(keySet, "null cannot be cast to non-null type kotlin.collections.Collection<K of com.squareup.wire.internal.Internal__InternalKt.immutableCopyOf?>");
        if (keySet.contains(null)) {
            throw new IllegalArgumentException((name + ".containsKey(null)").toString());
        }
        Collection<V> values = linkedHashMap.values();
        Intrinsics.checkNotNull(values, "null cannot be cast to non-null type kotlin.collections.Collection<V of com.squareup.wire.internal.Internal__InternalKt.immutableCopyOf?>");
        if (values.contains(null)) {
            throw new IllegalArgumentException((name + ".containsValue(null)").toString());
        }
        Map<K, V> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "unmodifiableMap(...)");
        return unmodifiableMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> immutableCopyOfMapWithStructValues(String name, Map<K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(map, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<K, ? extends V> entry : map.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();
            if (key == null) {
                throw new IllegalArgumentException((name + ".containsKey(null)").toString());
            }
            linkedHashMap.put(key, Internal.immutableCopyOfStruct(name, value));
        }
        Map<K, V> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "unmodifiableMap(...)");
        Intrinsics.checkNotNull(unmodifiableMap, "null cannot be cast to non-null type kotlin.collections.Map<K of com.squareup.wire.internal.Internal__InternalKt.immutableCopyOfMapWithStructValues, V of com.squareup.wire.internal.Internal__InternalKt.immutableCopyOfMapWithStructValues>");
        return unmodifiableMap;
    }

    public static final <T> T immutableCopyOfStruct(String name, T t) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (t == null || (t instanceof Boolean) || (t instanceof Double) || (t instanceof String)) {
            return t;
        }
        if (t instanceof List) {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) t).iterator();
            while (it.hasNext()) {
                arrayList.add(Internal.immutableCopyOfStruct(name, it.next()));
            }
            List unmodifiableList = Collections.unmodifiableList(arrayList);
            Intrinsics.checkNotNullExpressionValue(unmodifiableList, "unmodifiableList(...)");
            return (T) unmodifiableList;
        }
        if (t instanceof Map) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : ((Map) t).entrySet()) {
                linkedHashMap.put(Internal.immutableCopyOfStruct(name, entry.getKey()), Internal.immutableCopyOfStruct(name, entry.getValue()));
            }
            Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
            Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "unmodifiableMap(...)");
            return (T) unmodifiableMap;
        }
        throw new IllegalArgumentException("struct value " + name + " must be a JSON type (null, Boolean, Double, String, List, or Map) but was " + getTypeName$Internal__InternalKt(t) + ": " + t);
    }

    private static final KClass<? extends Object> getTypeName$Internal__InternalKt(Object obj) {
        return Reflection.getOrCreateKotlinClass(obj.getClass());
    }

    /* renamed from: -redactElements, reason: not valid java name */
    public static final <T> List<T> m3857redactElements(List<? extends T> list, ProtoAdapter<T> adapter) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        List<? extends T> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(adapter.redact(it.next()));
        }
        return arrayList;
    }

    public static final boolean equals(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && Intrinsics.areEqual(obj, obj2);
        }
        return true;
    }

    public static final IllegalStateException missingRequiredFields(Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(0, args.length - 1, 2);
        String str = "";
        if (progressionLastElement >= 0) {
            while (true) {
                if (args[i] == null) {
                    if (sb.length() > 0) {
                        str = "s";
                    }
                    sb.append("\n  ");
                    sb.append(args[i + 1]);
                }
                if (i == progressionLastElement) {
                    break;
                }
                i += 2;
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        throw new IllegalStateException("Required field" + str + " not set:" + sb2);
    }

    public static final void checkElementsNotNull(List<?> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i) == null) {
                throw new NullPointerException("Element at index " + i + " is null");
            }
        }
    }

    public static final void checkElementsNotNull(Map<?, ?> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (key == null) {
                throw new NullPointerException("map.containsKey(null)");
            }
            if (value == null) {
                throw new NullPointerException("Value for key " + key + " is null");
            }
        }
    }

    public static final int countNonNull(Object obj, Object obj2, Object obj3, Object obj4, Object... rest) {
        Intrinsics.checkNotNullParameter(rest, "rest");
        int i = obj != null ? 1 : 0;
        if (obj2 != null) {
            i++;
        }
        if (obj3 != null) {
            i++;
        }
        if (obj4 != null) {
            i++;
        }
        for (Object obj5 : rest) {
            if (obj5 != null) {
                i++;
            }
        }
        return i;
    }

    public static final String sanitize(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        StringBuilder sb = new StringBuilder(value.length());
        String str = value;
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (StringsKt.contains$default((CharSequence) ESCAPED_CHARS, charAt, false, 2, (Object) null)) {
                sb.append('\\');
            }
            sb.append(charAt);
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    public static final String sanitize(List<String> values) {
        Intrinsics.checkNotNullParameter(values, "values");
        return CollectionsKt.joinToString$default(values, null, "[", "]", 0, null, Internal__InternalKt$sanitize$2.INSTANCE, 25, null);
    }

    public static final String boxedOneOfClassName(String oneOfName) {
        Intrinsics.checkNotNullParameter(oneOfName, "oneOfName");
        if (oneOfName.length() <= 0) {
            return oneOfName;
        }
        StringBuilder append = new StringBuilder().append((Object) CharsKt.titlecase(oneOfName.charAt(0)));
        String substring = oneOfName.substring(1);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return append.append(substring).toString();
    }

    public static final String boxedOneOfKeyFieldName(String oneOfName, String fieldName) {
        Intrinsics.checkNotNullParameter(oneOfName, "oneOfName");
        Intrinsics.checkNotNullParameter(fieldName, "fieldName");
        String upperCase = (oneOfName + '_' + fieldName).toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    public static final String boxedOneOfKeysFieldName(String oneOfName) {
        Intrinsics.checkNotNullParameter(oneOfName, "oneOfName");
        String upperCase = (oneOfName + "_keys").toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    public static final void encodeArray_int32(int[] array, ReverseProtoWriter writer, int i) {
        Intrinsics.checkNotNullParameter(array, "array");
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (array.length == 0) {
            return;
        }
        int byteCount = writer.getByteCount();
        for (int length = array.length - 1; -1 < length; length--) {
            writer.writeSignedVarint32$wire_runtime(array[length]);
        }
        writer.writeVarint32(writer.getByteCount() - byteCount);
        writer.writeTag(i, FieldEncoding.LENGTH_DELIMITED);
    }

    public static final void encodeArray_uint32(int[] array, ReverseProtoWriter writer, int i) {
        Intrinsics.checkNotNullParameter(array, "array");
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (array.length == 0) {
            return;
        }
        int byteCount = writer.getByteCount();
        for (int length = array.length - 1; -1 < length; length--) {
            writer.writeVarint32(array[length]);
        }
        writer.writeVarint32(writer.getByteCount() - byteCount);
        writer.writeTag(i, FieldEncoding.LENGTH_DELIMITED);
    }

    public static final void encodeArray_sint32(int[] array, ReverseProtoWriter writer, int i) {
        Intrinsics.checkNotNullParameter(array, "array");
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (array.length == 0) {
            return;
        }
        int byteCount = writer.getByteCount();
        for (int length = array.length - 1; -1 < length; length--) {
            writer.writeVarint32(ProtoWriter.INSTANCE.encodeZigZag32$wire_runtime(array[length]));
        }
        writer.writeVarint32(writer.getByteCount() - byteCount);
        writer.writeTag(i, FieldEncoding.LENGTH_DELIMITED);
    }

    public static final void encodeArray_fixed32(int[] array, ReverseProtoWriter writer, int i) {
        Intrinsics.checkNotNullParameter(array, "array");
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (array.length == 0) {
            return;
        }
        int byteCount = writer.getByteCount();
        for (int length = array.length - 1; -1 < length; length--) {
            writer.writeFixed32(array[length]);
        }
        writer.writeVarint32(writer.getByteCount() - byteCount);
        writer.writeTag(i, FieldEncoding.LENGTH_DELIMITED);
    }

    public static final void encodeArray_sfixed32(int[] array, ReverseProtoWriter writer, int i) {
        Intrinsics.checkNotNullParameter(array, "array");
        Intrinsics.checkNotNullParameter(writer, "writer");
        Internal.encodeArray_fixed32(array, writer, i);
    }

    public static final void encodeArray_int64(long[] array, ReverseProtoWriter writer, int i) {
        Intrinsics.checkNotNullParameter(array, "array");
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (array.length == 0) {
            return;
        }
        int byteCount = writer.getByteCount();
        for (int length = array.length - 1; -1 < length; length--) {
            writer.writeVarint64(array[length]);
        }
        writer.writeVarint32(writer.getByteCount() - byteCount);
        writer.writeTag(i, FieldEncoding.LENGTH_DELIMITED);
    }

    public static final void encodeArray_uint64(long[] array, ReverseProtoWriter writer, int i) {
        Intrinsics.checkNotNullParameter(array, "array");
        Intrinsics.checkNotNullParameter(writer, "writer");
        Internal.encodeArray_int64(array, writer, i);
    }

    public static final void encodeArray_sint64(long[] array, ReverseProtoWriter writer, int i) {
        Intrinsics.checkNotNullParameter(array, "array");
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (array.length == 0) {
            return;
        }
        int byteCount = writer.getByteCount();
        for (int length = array.length - 1; -1 < length; length--) {
            writer.writeVarint64(ProtoWriter.INSTANCE.encodeZigZag64$wire_runtime(array[length]));
        }
        writer.writeVarint32(writer.getByteCount() - byteCount);
        writer.writeTag(i, FieldEncoding.LENGTH_DELIMITED);
    }

    public static final void encodeArray_fixed64(long[] array, ReverseProtoWriter writer, int i) {
        Intrinsics.checkNotNullParameter(array, "array");
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (array.length == 0) {
            return;
        }
        int byteCount = writer.getByteCount();
        for (int length = array.length - 1; -1 < length; length--) {
            writer.writeFixed64(array[length]);
        }
        writer.writeVarint32(writer.getByteCount() - byteCount);
        writer.writeTag(i, FieldEncoding.LENGTH_DELIMITED);
    }

    public static final void encodeArray_sfixed64(long[] array, ReverseProtoWriter writer, int i) {
        Intrinsics.checkNotNullParameter(array, "array");
        Intrinsics.checkNotNullParameter(writer, "writer");
        Internal.encodeArray_fixed64(array, writer, i);
    }

    public static final void encodeArray_float(float[] array, ReverseProtoWriter writer, int i) {
        Intrinsics.checkNotNullParameter(array, "array");
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (array.length == 0) {
            return;
        }
        int byteCount = writer.getByteCount();
        for (int length = array.length - 1; -1 < length; length--) {
            writer.writeFixed32(Float.floatToIntBits(array[length]));
        }
        writer.writeVarint32(writer.getByteCount() - byteCount);
        writer.writeTag(i, FieldEncoding.LENGTH_DELIMITED);
    }

    public static final void encodeArray_double(double[] array, ReverseProtoWriter writer, int i) {
        Intrinsics.checkNotNullParameter(array, "array");
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (array.length == 0) {
            return;
        }
        int byteCount = writer.getByteCount();
        for (int length = array.length - 1; -1 < length; length--) {
            writer.writeFixed64(Double.doubleToLongBits(array[length]));
        }
        writer.writeVarint32(writer.getByteCount() - byteCount);
        writer.writeTag(i, FieldEncoding.LENGTH_DELIMITED);
    }

    public static final double decodePrimitive_double(ProtoReader32 reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        DoubleCompanionObject doubleCompanionObject = DoubleCompanionObject.INSTANCE;
        return Double.longBitsToDouble(reader.readFixed64());
    }

    public static final double decodePrimitive_double(ProtoReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        DoubleCompanionObject doubleCompanionObject = DoubleCompanionObject.INSTANCE;
        return Double.longBitsToDouble(reader.readFixed64());
    }

    public static final int decodePrimitive_fixed32(ProtoReader32 reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        return reader.readFixed32();
    }

    public static final int decodePrimitive_fixed32(ProtoReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        return reader.readFixed32();
    }

    public static final long decodePrimitive_fixed64(ProtoReader32 reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        return reader.readFixed64();
    }

    public static final long decodePrimitive_fixed64(ProtoReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        return reader.readFixed64();
    }

    public static final float decodePrimitive_float(ProtoReader32 reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat(reader.readFixed32());
    }

    public static final float decodePrimitive_float(ProtoReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat(reader.readFixed32());
    }

    public static final int decodePrimitive_int32(ProtoReader32 reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        return reader.readVarint32();
    }

    public static final int decodePrimitive_int32(ProtoReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        return reader.readVarint32();
    }

    public static final long decodePrimitive_int64(ProtoReader32 reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        return reader.readVarint64();
    }

    public static final long decodePrimitive_int64(ProtoReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        return reader.readVarint64();
    }

    public static final int decodePrimitive_sfixed32(ProtoReader32 reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        return reader.readFixed32();
    }

    public static final int decodePrimitive_sfixed32(ProtoReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        return reader.readFixed32();
    }

    public static final long decodePrimitive_sfixed64(ProtoReader32 reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        return reader.readFixed64();
    }

    public static final long decodePrimitive_sfixed64(ProtoReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        return reader.readFixed64();
    }

    public static final int decodePrimitive_sint32(ProtoReader32 reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        return ProtoWriter.INSTANCE.decodeZigZag32$wire_runtime(reader.readVarint32());
    }

    public static final int decodePrimitive_sint32(ProtoReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        return ProtoWriter.INSTANCE.decodeZigZag32$wire_runtime(reader.readVarint32());
    }

    public static final long decodePrimitive_sint64(ProtoReader32 reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        return ProtoWriter.INSTANCE.decodeZigZag64$wire_runtime(reader.readVarint64());
    }

    public static final long decodePrimitive_sint64(ProtoReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        return ProtoWriter.INSTANCE.decodeZigZag64$wire_runtime(reader.readVarint64());
    }

    public static final int decodePrimitive_uint32(ProtoReader32 reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        return reader.readVarint32();
    }

    public static final int decodePrimitive_uint32(ProtoReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        return reader.readVarint32();
    }

    public static final long decodePrimitive_uint64(ProtoReader32 reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        return reader.readVarint64();
    }

    public static final long decodePrimitive_uint64(ProtoReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        return reader.readVarint64();
    }

    public static final boolean commonEquals(Instant instant, Object obj) {
        Intrinsics.checkNotNullParameter(instant, "<this>");
        if (instant == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Instant)) {
            return false;
        }
        Instant instant2 = (Instant) obj;
        return instant.getEpochSecond() == instant2.getEpochSecond() && instant.getNano() == instant2.getNano();
    }

    public static final int commonHashCode(Instant instant) {
        Intrinsics.checkNotNullParameter(instant, "<this>");
        return (Long.hashCode(instant.getEpochSecond()) * 31) + Integer.hashCode(instant.getNano());
    }

    public static final boolean commonEquals(Duration duration, Object obj) {
        Intrinsics.checkNotNullParameter(duration, "<this>");
        if (duration == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Duration)) {
            return false;
        }
        Duration duration2 = (Duration) obj;
        return duration.getSeconds() == duration2.getSeconds() && duration.getNano() == duration2.getNano();
    }

    public static final int commonHashCode(Duration duration) {
        Intrinsics.checkNotNullParameter(duration, "<this>");
        return (Long.hashCode(duration.getSeconds()) * 31) + Integer.hashCode(duration.getNano());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: -redactElements, reason: not valid java name */
    public static final <K, V> Map<K, V> m3858redactElements(Map<K, ? extends V> map, ProtoAdapter<V> adapter) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), adapter.redact(entry.getValue()));
        }
        return linkedHashMap;
    }
}
