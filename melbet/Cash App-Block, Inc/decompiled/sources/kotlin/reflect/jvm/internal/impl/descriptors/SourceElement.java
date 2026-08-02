package kotlin.reflect.jvm.internal.impl.descriptors;

import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes9.dex */
public interface SourceElement {
    public static final SourceElement NO_SOURCE = new AnonymousClass1();

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.SourceElement$1, reason: invalid class name */
    public final class AnonymousClass1 implements SourceElement {
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.SourceElement
        public final SourceFile getContainingFile() {
            SourceFile sourceFile = SourceFile.NO_SOURCE_FILE;
            if (sourceFile != null) {
                return sourceFile;
            }
            a$$ExternalSyntheticBUOutline0.m$1("@NotNull method kotlin/reflect/jvm/internal/impl/descriptors/SourceElement$1.getContainingFile must not return null");
            return null;
        }

        public final String toString() {
            return "NO_SOURCE";
        }
    }

    SourceFile getContainingFile();
}
