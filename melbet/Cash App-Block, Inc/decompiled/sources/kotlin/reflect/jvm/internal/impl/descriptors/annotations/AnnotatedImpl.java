package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

/* loaded from: classes9.dex */
public class AnnotatedImpl implements Annotated {
    public final Annotations annotations;

    public static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = i != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 1 ? 3 : 2];
        if (i != 1) {
            objArr[0] = "annotations";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        }
        if (i != 1) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        } else {
            objArr[1] = "getAnnotations";
        }
        if (i != 1) {
            objArr[2] = "<init>";
        }
        String format2 = String.format(str, objArr);
        if (i == 1) {
            throw new IllegalStateException(format2);
        }
    }

    public AnnotatedImpl(Annotations annotations) {
        if (annotations != null) {
            this.annotations = annotations;
        } else {
            $$$reportNull$$$0(0);
            throw null;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public Annotations getAnnotations() {
        Annotations annotations = this.annotations;
        if (annotations != null) {
            return annotations;
        }
        $$$reportNull$$$0(1);
        throw null;
    }
}
