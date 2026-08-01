package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class nl0 {
    public final g7 a;
    public final g7 b;
    public final g7 c;

    public nl0(g7 g7Var, g7 g7Var2, g7 g7Var3) {
        this.a = g7Var;
        this.b = g7Var2;
        this.c = g7Var3;
    }

    public abstract ol0 a();

    public final Class b(Class cls) {
        String name = cls.getName();
        g7 g7Var = this.c;
        Class cls2 = (Class) g7Var.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        g7Var.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) {
        g7 g7Var = this.a;
        Method method = (Method) g7Var.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, nl0.class.getClassLoader()).getDeclaredMethod("read", nl0.class);
        g7Var.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) {
        String name = cls.getName();
        g7 g7Var = this.b;
        Method method = (Method) g7Var.get(name);
        if (method != null) {
            return method;
        }
        Class b = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = b.getDeclaredMethod("write", cls, nl0.class);
        g7Var.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i);

    public final Parcelable f(Parcelable parcelable, int i) {
        if (!e(i)) {
            return parcelable;
        }
        return ((ol0) this).e.readParcelable(ol0.class.getClassLoader());
    }

    public final pl0 g() {
        String readString = ((ol0) this).e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (pl0) c(readString).invoke(null, a());
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

    public final void i(pl0 pl0Var) {
        if (pl0Var == null) {
            ((ol0) this).e.writeString(null);
            return;
        }
        try {
            ((ol0) this).e.writeString(b(pl0Var.getClass()).getName());
            ol0 a = a();
            try {
                d(pl0Var.getClass()).invoke(null, pl0Var, a);
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
            throw new RuntimeException(pl0Var.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
