package kotlinx.serialization.internal;

import java.lang.ref.SoftReference;

/* loaded from: classes9.dex */
public final class ClassValueReferences extends ClassValue {
    @Override // java.lang.ClassValue
    public final Object computeValue(Class cls) {
        cls.getClass();
        MutableSoftReference mutableSoftReference = new MutableSoftReference();
        mutableSoftReference.reference = new SoftReference(null);
        return mutableSoftReference;
    }
}
