package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class n43 {
    public final hi a;
    public final hi b;
    public final hi c;

    public n43(hi hiVar, hi hiVar2, hi hiVar3) {
        this.a = hiVar;
        this.b = hiVar2;
        this.c = hiVar3;
    }

    public abstract o43 a();

    public final Class b(Class cls) {
        String name = cls.getName();
        hi hiVar = this.c;
        Class cls2 = (Class) hiVar.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        hiVar.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) {
        hi hiVar = this.a;
        Method method = (Method) hiVar.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, n43.class.getClassLoader()).getDeclaredMethod("read", n43.class);
        hiVar.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) {
        String name = cls.getName();
        hi hiVar = this.b;
        Method method = (Method) hiVar.get(name);
        if (method != null) {
            return method;
        }
        Class b = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = b.getDeclaredMethod("write", cls, n43.class);
        hiVar.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i);

    public final int f(int i, int i2) {
        return !e(i2) ? i : ((o43) this).e.readInt();
    }

    public final Parcelable g(Parcelable parcelable, int i) {
        if (!e(i)) {
            return parcelable;
        }
        return ((o43) this).e.readParcelable(o43.class.getClassLoader());
    }

    public final p43 h() {
        String readString = ((o43) this).e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (p43) c(readString).invoke(null, a());
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

    public abstract void i(int i);

    public final void j(int i, int i2) {
        i(i2);
        ((o43) this).e.writeInt(i);
    }

    public final void k(p43 p43Var) {
        if (p43Var == null) {
            ((o43) this).e.writeString(null);
            return;
        }
        try {
            ((o43) this).e.writeString(b(p43Var.getClass()).getName());
            o43 a = a();
            try {
                d(p43Var.getClass()).invoke(null, p43Var, a);
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
            throw new RuntimeException(p43Var.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
