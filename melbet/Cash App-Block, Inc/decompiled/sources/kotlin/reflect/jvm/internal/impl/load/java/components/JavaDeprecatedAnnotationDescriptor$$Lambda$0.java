package kotlin.reflect.jvm.internal.impl.load.java.components;

import kotlin.Pair;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue;

/* loaded from: classes9.dex */
public final class JavaDeprecatedAnnotationDescriptor$$Lambda$0 implements Function0 {
    public static final JavaDeprecatedAnnotationDescriptor$$Lambda$0 INSTANCE = new JavaDeprecatedAnnotationDescriptor$$Lambda$0();

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        KProperty[] kPropertyArr = JavaDeprecatedAnnotationDescriptor.$$delegatedProperties;
        return MapsKt__MapsJVMKt.mapOf(new Pair(JavaAnnotationMapper.INSTANCE.getDEPRECATED_ANNOTATION_MESSAGE$descriptors_jvm(), new StringValue("Deprecated in Java")));
    }
}
