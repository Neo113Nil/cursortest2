package defpackage;

import android.os.IBinder;
import java.lang.reflect.Field;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cst extends bms implements csu {
    private final Object a;

    public cst(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper");
        this.a = obj;
    }

    public static Object b(csu csuVar) {
        if (csuVar instanceof cst) {
            return ((cst) csuVar).a;
        }
        IBinder asBinder = csuVar.asBinder();
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
            throw new IllegalArgumentException("Unexpected number of IObjectWrapper declared fields: " + declaredFields.length);
        }
        oy.at(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
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

    public cst() {
        throw null;
    }
}
