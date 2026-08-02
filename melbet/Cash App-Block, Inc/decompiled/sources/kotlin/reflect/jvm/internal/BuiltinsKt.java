package kotlin.reflect.jvm.internal;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.km.Attributes;
import kotlin.reflect.jvm.internal.impl.km.ClassKind;
import kotlin.reflect.jvm.internal.impl.km.KmClass;
import kotlin.reflect.jvm.internal.impl.km.KmClassifier;
import kotlin.reflect.jvm.internal.impl.km.KmType;
import kotlin.reflect.jvm.internal.impl.km.KmTypeParameter;
import kotlin.reflect.jvm.internal.impl.km.KmTypeProjection;
import kotlin.reflect.jvm.internal.impl.km.KmVariance;
import kotlin.reflect.jvm.internal.impl.km.Modality;
import kotlin.reflect.jvm.internal.impl.km.Visibility;

/* loaded from: classes9.dex */
public abstract class BuiltinsKt {
    public static final KmClass createFunctionKmClass(int i) {
        KmClass kmClass = new KmClass();
        kmClass.setName("kotlin/Function" + i);
        Attributes.setKind(kmClass, ClassKind.INTERFACE);
        Attributes.setModality(kmClass, Modality.ABSTRACT);
        Attributes.setVisibility(kmClass, Visibility.PUBLIC);
        if (1 <= i) {
            int i2 = 1;
            while (true) {
                kmClass.getTypeParameters().add(new KmTypeParameter(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i2, "P"), i2, KmVariance.IN));
                if (i2 == i) {
                    break;
                }
                i2++;
            }
        }
        int i3 = i + 1;
        kmClass.getTypeParameters().add(new KmTypeParameter("R", i3, KmVariance.OUT));
        List<KmType> supertypes = kmClass.getSupertypes();
        KmType kmType = new KmType();
        kmType.setClassifier(new KmClassifier.Class("kotlin/Function"));
        List<KmTypeProjection> arguments = kmType.getArguments();
        KmVariance kmVariance = KmVariance.INVARIANT;
        KmType kmType2 = new KmType();
        kmType2.setClassifier(new KmClassifier.TypeParameter(i3));
        arguments.add(new KmTypeProjection(kmVariance, kmType2));
        supertypes.add(kmType);
        return kmClass;
    }
}
