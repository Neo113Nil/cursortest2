package V2;

import D.y;
import O2.w;
import android.os.IBinder;
import android.os.IInterface;
import b3.g;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class b extends g implements a {

    /* renamed from: n, reason: collision with root package name */
    public final Object f3321n;

    public b(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper");
        this.f3321n = obj;
    }

    public static Object A0(a aVar) {
        if (aVar instanceof b) {
            return ((b) aVar).f3321n;
        }
        IBinder asBinder = aVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            int length = declaredFields.length;
            throw new IllegalArgumentException(y.j(length, "Unexpected number of IObjectWrapper declared fields: ", new StringBuilder(String.valueOf(length).length() + 53)));
        }
        w.h(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return field.get(asBinder);
        } catch (IllegalAccessException e6) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e6);
        } catch (NullPointerException e9) {
            throw new IllegalArgumentException("Binder object is null.", e9);
        }
    }

    public static a u0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        return queryLocalInterface instanceof a ? (a) queryLocalInterface : new d(iBinder, "com.google.android.gms.dynamic.IObjectWrapper", 1);
    }
}
