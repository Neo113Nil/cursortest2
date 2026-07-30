package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class bn1 {
    public final s9 a;
    public final s9 b;
    public final s9 c;

    public bn1(s9 s9Var, s9 s9Var2, s9 s9Var3) {
        this.a = s9Var;
        this.b = s9Var2;
        this.c = s9Var3;
    }

    public abstract cn1 a();

    public final Class b(Class cls) {
        String name = cls.getName();
        s9 s9Var = this.c;
        Class cls2 = (Class) s9Var.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        s9Var.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) {
        s9 s9Var = this.a;
        Method method = (Method) s9Var.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, bn1.class.getClassLoader()).getDeclaredMethod("read", bn1.class);
        s9Var.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) {
        String name = cls.getName();
        s9 s9Var = this.b;
        Method method = (Method) s9Var.get(name);
        if (method != null) {
            return method;
        }
        Class b = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = b.getDeclaredMethod("write", cls, bn1.class);
        s9Var.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i);

    public final Parcelable f(Parcelable parcelable, int i) {
        if (!e(i)) {
            return parcelable;
        }
        return ((cn1) this).e.readParcelable(cn1.class.getClassLoader());
    }

    public final dn1 g() {
        String readString = ((cn1) this).e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (dn1) c(readString).invoke(null, a());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    public abstract void h(int i);

    public final void i(dn1 dn1Var) {
        if (dn1Var == null) {
            ((cn1) this).e.writeString(null);
            return;
        }
        try {
            ((cn1) this).e.writeString(b(dn1Var.getClass()).getName());
            cn1 a = a();
            try {
                d(dn1Var.getClass()).invoke(null, dn1Var, a);
                Parcel parcel = a.e;
                int i = a.i;
                if (i >= 0) {
                    int i2 = a.d.get(i);
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(dataPosition - i2);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (!(e4.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
                }
                throw ((RuntimeException) e4.getCause());
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(dn1Var.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
