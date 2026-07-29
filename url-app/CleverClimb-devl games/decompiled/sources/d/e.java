package d;

import b.ab;
import b.ad;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* compiled from: Converter.java */
/* loaded from: classes2.dex */
public interface e<F, T> {

    /* compiled from: Converter.java */
    public static abstract class a {
        public e<ad, ?> a(Type type, Annotation[] annotationArr, n nVar) {
            return null;
        }

        public e<?, ab> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, n nVar) {
            return null;
        }

        public e<?, String> b(Type type, Annotation[] annotationArr, n nVar) {
            return null;
        }
    }

    T a(F f) throws IOException;
}
