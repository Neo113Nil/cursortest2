package kotlin.reflect.jvm.internal.impl.types.error;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.builtins.DefaultBuiltIns;

/* loaded from: classes9.dex */
public final class ErrorModuleDescriptor$$Lambda$0 implements Function0 {
    public static final ErrorModuleDescriptor$$Lambda$0 INSTANCE = new ErrorModuleDescriptor$$Lambda$0();

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ErrorModuleDescriptor errorModuleDescriptor = ErrorModuleDescriptor.INSTANCE;
        return DefaultBuiltIns.Companion.getInstance();
    }
}
