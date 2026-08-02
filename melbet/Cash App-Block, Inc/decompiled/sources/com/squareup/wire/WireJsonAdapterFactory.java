package com.squareup.wire;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.internal.EnumJsonFormatter;
import com.squareup.wire.internal.ReflectionKt;
import com.squareup.wire.internal.RuntimeMessageAdapter;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class WireJsonAdapterFactory implements JsonAdapter.Factory {
    public final Map typeUrlToAdapter;

    public WireJsonAdapterFactory() {
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        this.typeUrlToAdapter = emptyMap;
    }

    @Override // com.squareup.moshi.JsonAdapter.Factory
    public final JsonAdapter create(Type type2, Set set, Moshi moshi) {
        type2.getClass();
        set.getClass();
        Class rawType = Types.getRawType(type2);
        if (!set.isEmpty()) {
            return null;
        }
        if (Intrinsics.areEqual(rawType, AnyMessage.class)) {
            return new JsonAdapter.AnonymousClass4(2, moshi, this.typeUrlToAdapter);
        }
        if (Message.class.isAssignableFrom(rawType)) {
            RuntimeMessageAdapter createRuntimeMessageAdapter = ReflectionKt.createRuntimeMessageAdapter((Class) type2, rawType.getClassLoader());
            return new MessageJsonAdapter(createRuntimeMessageAdapter, MoshiJsonIntegration.jsonAdapters(createRuntimeMessageAdapter, moshi), moshi.adapter(Types.newParameterizedType(List.class, String.class))).nullSafe();
        }
        if (!WireEnum.class.isAssignableFrom(rawType)) {
            return null;
        }
        int i = RuntimeEnumAdapter.$r8$clinit;
        Class cls = (Class) type2;
        ProtoAdapter.Companion.getClass();
        return new EnumJsonAdapter(new EnumJsonFormatter(new RuntimeEnumAdapter(cls, ProtoAdapter.Companion.get(cls).getSyntax()))).nullSafe();
    }
}
