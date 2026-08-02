package kotlinx.serialization.modules;

import kotlin.collections.EmptyMap;

/* loaded from: classes3.dex */
public abstract class SerializersModuleKt {
    public static final SerialModuleImpl EmptySerializersModule;

    static {
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        EmptySerializersModule = new SerialModuleImpl(emptyMap, emptyMap, emptyMap, emptyMap, emptyMap, false);
    }
}
