package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class st1 extends y93 implements b01 {
    public final Object h;

    public st1(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper");
        this.h = obj;
    }

    public static b01 I(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        return queryLocalInterface instanceof b01 ? (b01) queryLocalInterface : new ad3(iBinder, "com.google.android.gms.dynamic.IObjectWrapper", 1);
    }

    public static Object J(b01 b01Var) {
        if (b01Var instanceof st1) {
            return ((st1) b01Var).h;
        }
        IBinder asBinder = b01Var.asBinder();
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
            lh.e(in1.k(declaredFields.length, "Unexpected number of IObjectWrapper declared fields: "));
            return null;
        }
        ll3.v(field);
        if (field.isAccessible()) {
            lh.e("IObjectWrapper declared field not private!");
            return null;
        }
        field.setAccessible(true);
        try {
            return field.get(asBinder);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
        } catch (NullPointerException e2) {
            throw new IllegalArgumentException("Binder object is null.", e2);
        }
    }
}
