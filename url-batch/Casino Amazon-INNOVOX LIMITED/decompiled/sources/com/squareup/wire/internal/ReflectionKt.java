package com.squareup.wire.internal;

import com.squareup.wire.KotlinConstructorBuilder;
import com.squareup.wire.Message;
import com.squareup.wire.OneOf;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* compiled from: reflection.kt */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001at\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0014\b\u0000\u0010\u0002*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0004\"\u0014\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u001aF\u0010\u0010\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00120\u0011\"\u0014\b\u0000\u0010\u0002*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0004\"\u0014\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00052\u0006\u0010\u0013\u001a\u00020\u0014H\u0002\u001a`\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0014\b\u0000\u0010\u0002*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0004\"\u0014\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u001aH\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0007\"\u0014\b\u0000\u0010\u0002*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0004\"\u0014\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0007H\u0002¨\u0006\u0016"}, d2 = {"createRuntimeMessageAdapter", "Lcom/squareup/wire/internal/RuntimeMessageAdapter;", "M", "B", "Lcom/squareup/wire/Message;", "Lcom/squareup/wire/Message$Builder;", "messageType", "Ljava/lang/Class;", "typeUrl", "", "syntax", "Lcom/squareup/wire/Syntax;", "classLoader", "Ljava/lang/ClassLoader;", "writeIdentityValues", "", "getKeys", "", "Lcom/squareup/wire/OneOf$Key;", "messageField", "Ljava/lang/reflect/Field;", "getBuilderType", "wire-runtime"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ReflectionKt {
    public static /* synthetic */ RuntimeMessageAdapter createRuntimeMessageAdapter$default(Class cls, String str, Syntax syntax, ClassLoader classLoader, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            classLoader = cls.getClassLoader();
        }
        if ((i & 16) != 0) {
            z = false;
        }
        return createRuntimeMessageAdapter(cls, str, syntax, classLoader, z);
    }

    public static final <M extends Message<M, B>, B extends Message.Builder<M, B>> RuntimeMessageAdapter<M, B> createRuntimeMessageAdapter(final Class<M> messageType, String str, Syntax syntax, ClassLoader classLoader, boolean z) {
        Intrinsics.checkNotNullParameter(messageType, "messageType");
        Intrinsics.checkNotNullParameter(syntax, "syntax");
        final Class builderType = getBuilderType(messageType);
        Function0 function0 = new Function0() { // from class: com.squareup.wire.internal.ReflectionKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Message.Builder createRuntimeMessageAdapter$lambda$0;
                createRuntimeMessageAdapter$lambda$0 = ReflectionKt.createRuntimeMessageAdapter$lambda$0(builderType, messageType);
                return createRuntimeMessageAdapter$lambda$0;
            }
        };
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = ArrayIteratorKt.iterator(messageType.getDeclaredFields());
        while (it.hasNext()) {
            Field field = (Field) it.next();
            WireField wireField = (WireField) field.getAnnotation(WireField.class);
            if (wireField != null) {
                Integer valueOf = Integer.valueOf(wireField.tag());
                Intrinsics.checkNotNull(field);
                Class cls = builderType;
                builderType = cls;
                linkedHashMap.put(valueOf, new FieldBinding(wireField, messageType, field, cls, z, classLoader));
            } else if (Intrinsics.areEqual(field.getType(), OneOf.class)) {
                Intrinsics.checkNotNull(field);
                for (OneOf.Key<?> key : getKeys(field)) {
                    linkedHashMap.put(Integer.valueOf(key.getTag()), new OneOfBinding(field, builderType, key, z));
                }
            }
        }
        KClass kotlinClass = JvmClassMappingKt.getKotlinClass(messageType);
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "unmodifiableMap(...)");
        return new RuntimeMessageAdapter<>(new RuntimeMessageBinding(kotlinClass, builderType, function0, unmodifiableMap, str, syntax));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Message.Builder createRuntimeMessageAdapter$lambda$0(Class cls, Class cls2) {
        if (cls.isAssignableFrom(KotlinConstructorBuilder.class)) {
            return new KotlinConstructorBuilder(cls2);
        }
        Object newInstance = cls.newInstance();
        Intrinsics.checkNotNull(newInstance);
        return (Message.Builder) newInstance;
    }

    private static final <M extends Message<M, B>, B extends Message.Builder<M, B>> Set<OneOf.Key<?>> getKeys(Field field) {
        Class<?> declaringClass = field.getDeclaringClass();
        String name = field.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        Field declaredField = declaringClass.getDeclaredField(Internal.boxedOneOfKeysFieldName(name));
        declaredField.setAccessible(true);
        Object obj = declaredField.get(null);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.Set<com.squareup.wire.OneOf.Key<*>>");
        return (Set) obj;
    }

    public static /* synthetic */ RuntimeMessageAdapter createRuntimeMessageAdapter$default(Class cls, boolean z, ClassLoader classLoader, int i, Object obj) {
        if ((i & 4) != 0) {
            classLoader = cls.getClassLoader();
        }
        return createRuntimeMessageAdapter(cls, z, classLoader);
    }

    public static final <M extends Message<M, B>, B extends Message.Builder<M, B>> RuntimeMessageAdapter<M, B> createRuntimeMessageAdapter(Class<M> messageType, boolean z, ClassLoader classLoader) {
        Intrinsics.checkNotNullParameter(messageType, "messageType");
        ProtoAdapter protoAdapter = ProtoAdapter.INSTANCE.get(messageType);
        return createRuntimeMessageAdapter(messageType, protoAdapter.getTypeUrl(), protoAdapter.getSyntax(), classLoader, z);
    }

    private static final <M extends Message<M, B>, B extends Message.Builder<M, B>> Class<B> getBuilderType(Class<M> cls) {
        Object m3984constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            Class<?> cls2 = Class.forName(cls.getName() + "$Builder", false, cls.getClassLoader());
            Intrinsics.checkNotNull(cls2, "null cannot be cast to non-null type java.lang.Class<B of com.squareup.wire.internal.ReflectionKt.getBuilderType>");
            m3984constructorimpl = Result.m3984constructorimpl(cls2);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m3984constructorimpl = Result.m3984constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m3990isFailureimpl(m3984constructorimpl)) {
            m3984constructorimpl = null;
        }
        Class<B> cls3 = (Class) m3984constructorimpl;
        return cls3 == null ? KotlinConstructorBuilder.class : cls3;
    }
}
