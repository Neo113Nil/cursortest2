package d;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* compiled from: CallAdapter.java */
/* loaded from: classes2.dex */
public interface c<R, T> {
    T a(b<R> bVar);

    Type a();

    /* compiled from: CallAdapter.java */
    public static abstract class a {
        public abstract c<?, ?> a(Type type, Annotation[] annotationArr, n nVar);

        protected static Class<?> a(Type type) {
            return p.a(type);
        }
    }
}
