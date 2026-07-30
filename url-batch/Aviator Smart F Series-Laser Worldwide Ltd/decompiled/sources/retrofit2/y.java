package retrofit2;

import java.lang.annotation.Annotation;

/* loaded from: classes5.dex */
final class y implements x {
    private static final x INSTANCE = new y();

    y() {
    }

    static Annotation[] ensurePresent(Annotation[] annotationArr) {
        if (z.isAnnotationPresent(annotationArr, x.class)) {
            return annotationArr;
        }
        Annotation[] annotationArr2 = new Annotation[annotationArr.length + 1];
        annotationArr2[0] = INSTANCE;
        System.arraycopy(annotationArr, 0, annotationArr2, 1, annotationArr.length);
        return annotationArr2;
    }

    @Override // java.lang.annotation.Annotation
    public Class<? extends Annotation> annotationType() {
        return x.class;
    }

    @Override // java.lang.annotation.Annotation
    public boolean equals(Object obj) {
        return obj instanceof x;
    }

    @Override // java.lang.annotation.Annotation
    public int hashCode() {
        return 0;
    }

    @Override // java.lang.annotation.Annotation
    public String toString() {
        return "@" + x.class.getName() + "()";
    }
}
