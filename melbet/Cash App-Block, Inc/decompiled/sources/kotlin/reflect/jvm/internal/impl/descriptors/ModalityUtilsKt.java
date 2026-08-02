package kotlin.reflect.jvm.internal.impl.descriptors;

/* loaded from: classes9.dex */
public final class ModalityUtilsKt {
    public static final boolean isFinalClass(ClassDescriptor classDescriptor) {
        classDescriptor.getClass();
        return classDescriptor.getModality() == Modality.FINAL && classDescriptor.getKind() != ClassKind.ENUM_CLASS;
    }
}
