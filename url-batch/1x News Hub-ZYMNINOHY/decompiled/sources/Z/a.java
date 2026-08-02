package Z;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p.C1169e;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final C1169e f1905a;

    /* renamed from: b, reason: collision with root package name */
    public final C1169e f1906b;

    /* renamed from: c, reason: collision with root package name */
    public final C1169e f1907c;

    public a(C1169e c1169e, C1169e c1169e2, C1169e c1169e3) {
        this.f1905a = c1169e;
        this.f1906b = c1169e2;
        this.f1907c = c1169e3;
    }

    public abstract b a();

    public final Class b(Class cls) {
        String name = cls.getName();
        C1169e c1169e = this.f1907c;
        Class cls2 = (Class) c1169e.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        c1169e.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) {
        C1169e c1169e = this.f1905a;
        Method method = (Method) c1169e.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, a.class.getClassLoader()).getDeclaredMethod("read", a.class);
        c1169e.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) {
        String name = cls.getName();
        C1169e c1169e = this.f1906b;
        Method method = (Method) c1169e.get(name);
        if (method != null) {
            return method;
        }
        Class b3 = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = b3.getDeclaredMethod("write", cls, a.class);
        c1169e.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i3);

    public final int f(int i3, int i4) {
        return !e(i4) ? i3 : ((b) this).f1909e.readInt();
    }

    public final Parcelable g(Parcelable parcelable, int i3) {
        if (!e(i3)) {
            return parcelable;
        }
        return ((b) this).f1909e.readParcelable(b.class.getClassLoader());
    }

    public final c h() {
        String readString = ((b) this).f1909e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (c) c(readString).invoke(null, a());
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

    public abstract void i(int i3);

    public final void j(int i3, int i4) {
        i(i4);
        ((b) this).f1909e.writeInt(i3);
    }

    public final void k(c cVar) {
        if (cVar == null) {
            ((b) this).f1909e.writeString(null);
            return;
        }
        try {
            ((b) this).f1909e.writeString(b(cVar.getClass()).getName());
            b a3 = a();
            try {
                d(cVar.getClass()).invoke(null, cVar, a3);
                int i3 = a3.f1912i;
                if (i3 >= 0) {
                    int i4 = a3.f1908d.get(i3);
                    Parcel parcel = a3.f1909e;
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
            throw new RuntimeException(cVar.getClass().getSimpleName().concat(" does not have a Parcelizer"), e7);
        }
    }
}
