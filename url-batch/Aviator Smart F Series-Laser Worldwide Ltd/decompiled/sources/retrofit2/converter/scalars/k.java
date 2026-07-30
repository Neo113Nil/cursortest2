package retrofit2.converter.scalars;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import retrofit2.i;
import retrofit2.v;

/* loaded from: classes5.dex */
public final class k extends i.a {
    private k() {
    }

    public static k create() {
        return new k();
    }

    @Override // retrofit2.i.a
    @Nullable
    public retrofit2.i requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, v vVar) {
        if (type == String.class || type == Boolean.TYPE || type == Boolean.class || type == Byte.TYPE || type == Byte.class || type == Character.TYPE || type == Character.class || type == Double.TYPE || type == Double.class || type == Float.TYPE || type == Float.class || type == Integer.TYPE || type == Integer.class || type == Long.TYPE || type == Long.class || type == Short.TYPE || type == Short.class) {
            return a.INSTANCE;
        }
        return null;
    }

    @Override // retrofit2.i.a
    @Nullable
    public retrofit2.i responseBodyConverter(Type type, Annotation[] annotationArr, v vVar) {
        if (type == String.class) {
            return j.INSTANCE;
        }
        if (type == Boolean.class || type == Boolean.TYPE) {
            return b.INSTANCE;
        }
        if (type == Byte.class || type == Byte.TYPE) {
            return c.INSTANCE;
        }
        if (type == Character.class || type == Character.TYPE) {
            return d.INSTANCE;
        }
        if (type == Double.class || type == Double.TYPE) {
            return e.INSTANCE;
        }
        if (type == Float.class || type == Float.TYPE) {
            return f.INSTANCE;
        }
        if (type == Integer.class || type == Integer.TYPE) {
            return g.INSTANCE;
        }
        if (type == Long.class || type == Long.TYPE) {
            return h.INSTANCE;
        }
        if (type == Short.class || type == Short.TYPE) {
            return i.INSTANCE;
        }
        return null;
    }
}
