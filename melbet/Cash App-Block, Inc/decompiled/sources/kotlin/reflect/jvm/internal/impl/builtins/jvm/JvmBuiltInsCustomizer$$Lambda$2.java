package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;

/* loaded from: classes9.dex */
public final class JvmBuiltInsCustomizer$$Lambda$2 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final JvmBuiltInsCustomizer arg$0;

    public /* synthetic */ JvmBuiltInsCustomizer$$Lambda$2(JvmBuiltInsCustomizer jvmBuiltInsCustomizer, int i) {
        this.$r8$classId = i;
        this.arg$0 = jvmBuiltInsCustomizer;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        boolean z = false;
        JvmBuiltInsCustomizer jvmBuiltInsCustomizer = this.arg$0;
        switch (i) {
            case 0:
                Pair pair = (Pair) obj;
                KProperty[] kPropertyArr = JvmBuiltInsCustomizer.$$delegatedProperties;
                pair.getClass();
                String str = (String) pair.first;
                String str2 = (String) pair.second;
                return Annotations.Companion.create(CollectionsKt__CollectionsJVMKt.listOf(AnnotationUtilKt.createDeprecatedAnnotation(jvmBuiltInsCustomizer.moduleDescriptor.getBuiltIns(), Boxes$$ExternalSyntheticOutline1.m("'", str, "()' member of List is redundant in Kotlin and might be removed soon. Please use '", str2, "()' stdlib extension instead"), Recorder$$ExternalSyntheticOutline2.m$1(str2, "()"), "HIDDEN", false)));
            default:
                CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) obj;
                KProperty[] kPropertyArr2 = JvmBuiltInsCustomizer.$$delegatedProperties;
                if (callableMemberDescriptor.getKind() == CallableMemberDescriptor.Kind.DECLARATION) {
                    JavaToKotlinClassMapper javaToKotlinClassMapper = jvmBuiltInsCustomizer.j2kClassMapper;
                    DeclarationDescriptor containingDeclaration = callableMemberDescriptor.getContainingDeclaration();
                    containingDeclaration.getClass();
                    if (javaToKotlinClassMapper.isMutable((ClassDescriptor) containingDeclaration)) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
        }
    }
}
