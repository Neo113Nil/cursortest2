package A1;

import android.os.Parcel;
import android.os.Parcelable;
import j.C0487e;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final C0487e f12a;

    /* renamed from: b, reason: collision with root package name */
    public final C0487e f13b;

    /* renamed from: c, reason: collision with root package name */
    public final C0487e f14c;

    public b(C0487e c0487e, C0487e c0487e2, C0487e c0487e3) {
        this.f12a = c0487e;
        this.f13b = c0487e2;
        this.f14c = c0487e3;
    }

    public abstract c a();

    public final Class b(Class cls) {
        String name = cls.getName();
        C0487e c0487e = this.f14c;
        Class cls2 = (Class) c0487e.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        c0487e.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) {
        C0487e c0487e = this.f12a;
        Method method = (Method) c0487e.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, b.class.getClassLoader()).getDeclaredMethod("read", b.class);
        c0487e.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) {
        String name = cls.getName();
        C0487e c0487e = this.f13b;
        Method method = (Method) c0487e.get(name);
        if (method != null) {
            return method;
        }
        Class b2 = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = b2.getDeclaredMethod("write", cls, b.class);
        c0487e.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i3);

    public final Parcelable f(Parcelable parcelable, int i3) {
        if (!e(i3)) {
            return parcelable;
        }
        return ((c) this).f16e.readParcelable(c.class.getClassLoader());
    }

    public final d g() {
        String readString = ((c) this).f16e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (d) c(readString).invoke(null, a());
        } catch (ClassNotFoundException e3) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e3);
        } catch (IllegalAccessException e4) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e4);
        } catch (NoSuchMethodException e5) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e5);
        } catch (InvocationTargetException e6) {
            if (e6.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e6.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e6);
        }
    }

    public abstract void h(int i3);

    public final void i(d dVar) {
        if (dVar == null) {
            ((c) this).f16e.writeString(null);
            return;
        }
        try {
            ((c) this).f16e.writeString(b(dVar.getClass()).getName());
            c a3 = a();
            try {
                d(dVar.getClass()).invoke(null, dVar, a3);
                int i3 = a3.f20i;
                if (i3 >= 0) {
                    int i4 = a3.f15d.get(i3);
                    Parcel parcel = a3.f16e;
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i4);
                    parcel.writeInt(dataPosition - i4);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (ClassNotFoundException e3) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e3);
            } catch (IllegalAccessException e4) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e4);
            } catch (NoSuchMethodException e5) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e5);
            } catch (InvocationTargetException e6) {
                if (!(e6.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e6);
                }
                throw ((RuntimeException) e6.getCause());
            }
        } catch (ClassNotFoundException e7) {
            throw new RuntimeException(dVar.getClass().getSimpleName().concat(" does not have a Parcelizer"), e7);
        }
    }
}
