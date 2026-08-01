package j7;

import android.os.IBinder;
import android.os.IInterface;
import c7.c0;
import java.lang.reflect.Field;
import o7.g;
import te.a1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b extends g implements a {

    /* renamed from: e, reason: collision with root package name */
    public final Object f5104e;

    public b(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper");
        this.f5104e = obj;
    }

    public static a E(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        return queryLocalInterface instanceof a ? (a) queryLocalInterface : new c(iBinder, "com.google.android.gms.dynamic.IObjectWrapper", 2);
    }

    public static Object F(a aVar) {
        if (aVar instanceof b) {
            return ((b) aVar).f5104e;
        }
        IBinder asBinder = aVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i3 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i3++;
                field = field2;
            }
        }
        if (i3 != 1) {
            int length = declaredFields.length;
            a1.e(v4.a.n(new StringBuilder(String.valueOf(length).length() + 53), "Unexpected number of IObjectWrapper declared fields: ", length));
            return null;
        }
        c0.g(field);
        if (field.isAccessible()) {
            a1.e("IObjectWrapper declared field not private!");
            return null;
        }
        field.setAccessible(true);
        try {
            return field.get(asBinder);
        } catch (IllegalAccessException e2) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e2);
        } catch (NullPointerException e9) {
            throw new IllegalArgumentException("Binder object is null.", e9);
        }
    }
}
