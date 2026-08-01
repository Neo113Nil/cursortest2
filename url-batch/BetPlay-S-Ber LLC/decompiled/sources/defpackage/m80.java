package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public abstract class m80 {
    public final e7 a;
    public final e7 b;
    public final e7 c;

    public m80(e7 e7Var, e7 e7Var2, e7 e7Var3) {
        this.a = e7Var;
        this.b = e7Var2;
        this.c = e7Var3;
    }

    public abstract n80 a();

    public final Class b(Class cls) {
        String name = cls.getName();
        e7 e7Var = this.c;
        Class cls2 = (Class) e7Var.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        e7Var.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) {
        e7 e7Var = this.a;
        Method method = (Method) e7Var.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, m80.class.getClassLoader()).getDeclaredMethod("read", m80.class);
        e7Var.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) {
        String name = cls.getName();
        e7 e7Var = this.b;
        Method method = (Method) e7Var.get(name);
        if (method != null) {
            return method;
        }
        Class b = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = b.getDeclaredMethod("write", cls, m80.class);
        e7Var.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i);

    public final Parcelable f(Parcelable parcelable, int i) {
        if (!e(i)) {
            return parcelable;
        }
        return ((n80) this).e.readParcelable(n80.class.getClassLoader());
    }

    public final o80 g() {
        String readString = ((n80) this).e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (o80) c(readString).invoke(null, a());
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

    public final void i(o80 o80Var) {
        if (o80Var == null) {
            ((n80) this).e.writeString(null);
            return;
        }
        try {
            ((n80) this).e.writeString(b(o80Var.getClass()).getName());
            n80 a = a();
            try {
                d(o80Var.getClass()).invoke(null, o80Var, a);
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
            throw new RuntimeException(o80Var.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
