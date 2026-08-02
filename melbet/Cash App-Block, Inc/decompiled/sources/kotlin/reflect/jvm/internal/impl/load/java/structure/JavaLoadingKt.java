package kotlin.reflect.jvm.internal.impl.load.java.structure;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* loaded from: classes9.dex */
public final class JavaLoadingKt {
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
    
        if (r0.equals("hashCode") == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0088, code lost:
    
        r5 = r5.getValueParameters().isEmpty();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0086, code lost:
    
        if (r0.equals("toString") != false) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean isObjectMethodInInterface(JavaMember javaMember) {
        boolean z;
        FqName fqName;
        javaMember.getClass();
        if (javaMember.getContainingClass().isInterface() && (javaMember instanceof JavaMethod)) {
            JavaMethod javaMethod = (JavaMethod) javaMember;
            String asString = javaMethod.getName().asString();
            int hashCode = asString.hashCode();
            if (hashCode != -1776922004) {
                if (hashCode != -1295482945) {
                    if (hashCode == 147696667) {
                    }
                } else if (asString.equals("equals")) {
                    JavaValueParameter javaValueParameter = (JavaValueParameter) CollectionsKt.singleOrNull((List) javaMethod.getValueParameters());
                    JavaType type2 = javaValueParameter != null ? javaValueParameter.getType() : null;
                    JavaClassifierType javaClassifierType = type2 instanceof JavaClassifierType ? (JavaClassifierType) type2 : null;
                    if (javaClassifierType != null) {
                        JavaClassifier classifier = javaClassifierType.getClassifier();
                        if ((classifier instanceof JavaClass) && (fqName = ((JavaClass) classifier).getFqName()) != null && Intrinsics.areEqual(fqName.asString(), "java.lang.Object")) {
                            z = true;
                        }
                    }
                }
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }
}
