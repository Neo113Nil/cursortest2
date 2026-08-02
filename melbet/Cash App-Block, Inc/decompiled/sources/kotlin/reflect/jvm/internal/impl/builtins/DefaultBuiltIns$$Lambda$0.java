package kotlin.reflect.jvm.internal.impl.builtins;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.ServiceLoader;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader;

/* loaded from: classes9.dex */
public final class DefaultBuiltIns$$Lambda$0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public static final DefaultBuiltIns$$Lambda$0 INSTANCE$1 = new DefaultBuiltIns$$Lambda$0(1);
    public static final DefaultBuiltIns$$Lambda$0 INSTANCE = new DefaultBuiltIns$$Lambda$0(0);

    public /* synthetic */ DefaultBuiltIns$$Lambda$0(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$r8$classId) {
            case 0:
                return new DefaultBuiltIns(false, 1, null);
            default:
                BuiltInsLoader.Companion companion = BuiltInsLoader.Companion.$$INSTANCE;
                ServiceLoader load = ServiceLoader.load(BuiltInsLoader.class, BuiltInsLoader.class.getClassLoader());
                load.getClass();
                BuiltInsLoader builtInsLoader = (BuiltInsLoader) CollectionsKt.firstOrNull(load);
                if (builtInsLoader != null) {
                    return builtInsLoader;
                }
                a$$ExternalSyntheticBUOutline0.m$1("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
                return null;
        }
    }
}
