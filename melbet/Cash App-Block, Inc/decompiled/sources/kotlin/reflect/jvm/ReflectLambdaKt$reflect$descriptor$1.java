package kotlin.reflect.jvm;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;

/* loaded from: classes9.dex */
public final /* synthetic */ class ReflectLambdaKt$reflect$descriptor$1 extends FunctionReferenceImpl implements Function2 {
    public static final ReflectLambdaKt$reflect$descriptor$1 INSTANCE = new ReflectLambdaKt$reflect$descriptor$1(2, MemberDeserializer.class, "loadFunction", "loadFunction(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Function;)Lorg/jetbrains/kotlin/descriptors/SimpleFunctionDescriptor;", 0);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        MemberDeserializer memberDeserializer = (MemberDeserializer) obj;
        ProtoBuf.Function function = (ProtoBuf.Function) obj2;
        memberDeserializer.getClass();
        function.getClass();
        return memberDeserializer.loadFunction(function);
    }
}
