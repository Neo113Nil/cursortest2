package kotlin.reflect.jvm.internal.impl.km.internal.extensions;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions;

/* loaded from: classes9.dex */
public final class MetadataExtensions$Companion$$Lambda$0 implements Function0 {
    public static final MetadataExtensions$Companion$$Lambda$0 INSTANCE = new MetadataExtensions$Companion$$Lambda$0();

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        MetadataExtensions.Companion companion = MetadataExtensions.Companion.$$INSTANCE;
        ServiceLoader load = ServiceLoader.load(MetadataExtensions.class, MetadataExtensions.class.getClassLoader());
        load.getClass();
        List list = CollectionsKt.toList(load);
        if (!list.isEmpty()) {
            return list;
        }
        a$$ExternalSyntheticBUOutline0.m$1("No MetadataExtensions instances found in the classpath. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
        return null;
    }
}
