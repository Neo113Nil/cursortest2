package kotlin.reflect.jvm.internal.impl.types;

import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;

/* loaded from: classes9.dex */
public interface TypeAttributeTranslator {

    public static final class DefaultImpls {
        public static /* synthetic */ TypeAttributes toAttributes$default(TypeAttributeTranslator typeAttributeTranslator, Annotations annotations, TypeConstructor typeConstructor, DeclarationDescriptor declarationDescriptor, int i, Object obj) {
            if (obj != null) {
                a$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: toAttributes");
                return null;
            }
            if ((i & 2) != 0) {
                typeConstructor = null;
            }
            if ((i & 4) != 0) {
                declarationDescriptor = null;
            }
            return typeAttributeTranslator.toAttributes(annotations, typeConstructor, declarationDescriptor);
        }
    }

    TypeAttributes toAttributes(Annotations annotations, TypeConstructor typeConstructor, DeclarationDescriptor declarationDescriptor);
}
