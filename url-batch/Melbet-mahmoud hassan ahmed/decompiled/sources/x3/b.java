package x3;

import android.os.IBinder;
import androidx.annotation.RecentlyNonNull;
import java.lang.reflect.Field;
import r3.o;
import x3.a;

/* loaded from: classes.dex */
public final class b<T> extends a.AbstractBinderC0153a {

    /* renamed from: f, reason: collision with root package name */
    private final T f23186f;

    private b(T t6) {
        this.f23186f = t6;
    }

    @RecentlyNonNull
    public static <T> a B3(@RecentlyNonNull T t6) {
        return new b(t6);
    }

    @RecentlyNonNull
    public static <T> T O0(@RecentlyNonNull a aVar) {
        if (aVar instanceof b) {
            return ((b) aVar).f23186f;
        }
        IBinder asBinder = aVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i7 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i7++;
                field = field2;
            }
        }
        if (i7 != 1) {
            int length = declaredFields.length;
            StringBuilder sb = new StringBuilder(64);
            sb.append("Unexpected number of IObjectWrapper declared fields: ");
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        }
        o.i(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return (T) field.get(asBinder);
        } catch (IllegalAccessException e7) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e7);
        } catch (NullPointerException e8) {
            throw new IllegalArgumentException("Binder object is null.", e8);
        }
    }
}
