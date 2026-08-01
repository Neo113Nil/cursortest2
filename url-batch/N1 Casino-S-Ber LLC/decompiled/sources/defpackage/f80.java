package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public abstract class f80 {
    public final n6 a;
    public final n6 b;
    public final n6 c;

    public f80(n6 n6Var, n6 n6Var2, n6 n6Var3) {
        this.a = n6Var;
        this.b = n6Var2;
        this.c = n6Var3;
    }

    public abstract g80 a();

    public final Class b(Class cls) {
        String name = cls.getName();
        n6 n6Var = this.c;
        Class cls2 = (Class) n6Var.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        n6Var.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) {
        n6 n6Var = this.a;
        Method method = (Method) n6Var.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, f80.class.getClassLoader()).getDeclaredMethod("read", f80.class);
        n6Var.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) {
        String name = cls.getName();
        n6 n6Var = this.b;
        Method method = (Method) n6Var.get(name);
        if (method != null) {
            return method;
        }
        Class b = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = b.getDeclaredMethod("write", cls, f80.class);
        n6Var.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i);

    public final Parcelable f(Parcelable parcelable, int i) {
        if (!e(i)) {
            return parcelable;
        }
        return ((g80) this).e.readParcelable(g80.class.getClassLoader());
    }

    public final h80 g() {
        String readString = ((g80) this).e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (h80) c(readString).invoke(null, a());
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

    public final void i(h80 h80Var) {
        if (h80Var == null) {
            ((g80) this).e.writeString(null);
            return;
        }
        try {
            ((g80) this).e.writeString(b(h80Var.getClass()).getName());
            g80 a = a();
            try {
                d(h80Var.getClass()).invoke(null, h80Var, a);
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
            throw new RuntimeException(h80Var.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
