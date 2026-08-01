package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public abstract class qb0 {
    public final x6 a;
    public final x6 b;
    public final x6 c;

    public qb0(x6 x6Var, x6 x6Var2, x6 x6Var3) {
        this.a = x6Var;
        this.b = x6Var2;
        this.c = x6Var3;
    }

    public abstract rb0 a();

    public final Class b(Class cls) {
        String name = cls.getName();
        x6 x6Var = this.c;
        Class cls2 = (Class) x6Var.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        x6Var.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) {
        x6 x6Var = this.a;
        Method method = (Method) x6Var.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, qb0.class.getClassLoader()).getDeclaredMethod("read", qb0.class);
        x6Var.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) {
        String name = cls.getName();
        x6 x6Var = this.b;
        Method method = (Method) x6Var.get(name);
        if (method != null) {
            return method;
        }
        Class b = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = b.getDeclaredMethod("write", cls, qb0.class);
        x6Var.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i);

    public final Parcelable f(Parcelable parcelable, int i) {
        if (!e(i)) {
            return parcelable;
        }
        return ((rb0) this).e.readParcelable(rb0.class.getClassLoader());
    }

    public final sb0 g() {
        String readString = ((rb0) this).e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (sb0) c(readString).invoke(null, a());
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

    public final void i(sb0 sb0Var) {
        if (sb0Var == null) {
            ((rb0) this).e.writeString(null);
            return;
        }
        try {
            ((rb0) this).e.writeString(b(sb0Var.getClass()).getName());
            rb0 a = a();
            try {
                d(sb0Var.getClass()).invoke(null, sb0Var, a);
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
            throw new RuntimeException(sb0Var.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
