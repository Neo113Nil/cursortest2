package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import kotlin.jvm.functions.Function1;

/* loaded from: classes9.dex */
public final class RawTypeImpl$$Lambda$0 implements Function1 {
    public static final RawTypeImpl$$Lambda$0 INSTANCE = new RawTypeImpl$$Lambda$0();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str = (String) obj;
        str.getClass();
        return "(raw) ".concat(str);
    }
}
