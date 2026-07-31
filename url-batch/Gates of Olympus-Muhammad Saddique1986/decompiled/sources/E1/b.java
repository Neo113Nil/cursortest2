package E1;

import android.os.Parcel;
import android.os.Parcelable;
import j.C0531e;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final C0531e f1033a;

    /* renamed from: b, reason: collision with root package name */
    public final C0531e f1034b;

    /* renamed from: c, reason: collision with root package name */
    public final C0531e f1035c;

    public b(C0531e c0531e, C0531e c0531e2, C0531e c0531e3) {
        this.f1033a = c0531e;
        this.f1034b = c0531e2;
        this.f1035c = c0531e3;
    }

    public abstract c a();

    public final Class b(Class cls) {
        String name = cls.getName();
        C0531e c0531e = this.f1035c;
        Class cls2 = (Class) c0531e.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        c0531e.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) {
        C0531e c0531e = this.f1033a;
        Method method = (Method) c0531e.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, b.class.getClassLoader()).getDeclaredMethod("read", b.class);
        c0531e.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) {
        String name = cls.getName();
        C0531e c0531e = this.f1034b;
        Method method = (Method) c0531e.get(name);
        if (method != null) {
            return method;
        }
        Class b3 = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = b3.getDeclaredMethod("write", cls, b.class);
        c0531e.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i3);

    public final Parcelable f(Parcelable parcelable, int i3) {
        if (!e(i3)) {
            return parcelable;
        }
        return ((c) this).f1037e.readParcelable(c.class.getClassLoader());
    }

    public final d g() {
        String readString = ((c) this).f1037e.readString();
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
            ((c) this).f1037e.writeString(null);
            return;
        }
        try {
            ((c) this).f1037e.writeString(b(dVar.getClass()).getName());
            c a3 = a();
            try {
                d(dVar.getClass()).invoke(null, dVar, a3);
                int i3 = a3.f1041i;
                if (i3 >= 0) {
                    int i4 = a3.f1036d.get(i3);
                    Parcel parcel = a3.f1037e;
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
