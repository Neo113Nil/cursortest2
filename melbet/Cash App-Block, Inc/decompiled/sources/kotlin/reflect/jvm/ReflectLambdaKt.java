package kotlin.reflect.jvm;

import kotlin.Function;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.DescriptorKFunction;
import kotlin.reflect.jvm.internal.EmptyContainerForLocal;
import kotlin.reflect.jvm.internal.UtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;

/* loaded from: classes9.dex */
public abstract class ReflectLambdaKt {
    public static final DescriptorKFunction reflect(Function function) {
        Metadata metadata = (Metadata) function.getClass().getAnnotation(Metadata.class);
        if (metadata != null) {
            String[] d1 = metadata.d1();
            if (d1.length == 0) {
                d1 = null;
            }
            if (d1 != null) {
                Pair<JvmNameResolver, ProtoBuf.Function> readFunctionDataFrom = JvmProtoBufUtil.readFunctionDataFrom(d1, metadata.d2());
                JvmNameResolver jvmNameResolver = (JvmNameResolver) readFunctionDataFrom.first;
                ProtoBuf.Function function2 = (ProtoBuf.Function) readFunctionDataFrom.second;
                MetadataVersion metadataVersion = new MetadataVersion(metadata.mv(), (metadata.xi() & 8) != 0);
                Class<?> cls = function.getClass();
                ProtoBuf.TypeTable typeTable = function2.getTypeTable();
                typeTable.getClass();
                return new DescriptorKFunction(EmptyContainerForLocal.INSTANCE, (SimpleFunctionDescriptor) UtilKt.deserializeToDescriptor(cls, ReflectedLambdaFakeContainerSource.INSTANCE, function2, jvmNameResolver, new TypeTable(typeTable), metadataVersion, ReflectLambdaKt$reflect$descriptor$1.INSTANCE));
            }
        }
        return null;
    }
}
