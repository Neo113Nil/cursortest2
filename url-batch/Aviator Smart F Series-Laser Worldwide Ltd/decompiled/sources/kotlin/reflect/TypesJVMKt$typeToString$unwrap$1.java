package kotlin.reflect;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes4.dex */
/* synthetic */ class TypesJVMKt$typeToString$unwrap$1 extends FunctionReferenceImpl implements f6.l {
    public static final TypesJVMKt$typeToString$unwrap$1 INSTANCE = new TypesJVMKt$typeToString$unwrap$1();

    TypesJVMKt$typeToString$unwrap$1() {
        super(1, Class.class, "getComponentType", "getComponentType()Ljava/lang/Class;", 0);
    }

    @Override // f6.l
    public final Class<?> invoke(Class<?> p02) {
        kotlin.jvm.internal.s.checkNotNullParameter(p02, "p0");
        return p02.getComponentType();
    }
}
