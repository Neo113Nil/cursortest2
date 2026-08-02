package kotlinx.serialization.modules;

import java.util.List;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;

/* loaded from: classes3.dex */
public abstract class SerializersModule {
    public abstract void dumpTo(SerializersModuleCollector serializersModuleCollector);

    public abstract KSerializer getContextual(KClass kClass, List list);

    public abstract KSerializer getPolymorphic(KClass kClass, Object obj);
}
