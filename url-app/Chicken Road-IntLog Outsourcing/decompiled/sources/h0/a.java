package h0;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import r.C1392b;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final C1392b f5760a;

    /* renamed from: b, reason: collision with root package name */
    public final C1392b f5761b;

    /* renamed from: c, reason: collision with root package name */
    public final C1392b f5762c;

    public a(C1392b c1392b, C1392b c1392b2, C1392b c1392b3) {
        this.f5760a = c1392b;
        this.f5761b = c1392b2;
        this.f5762c = c1392b3;
    }

    public abstract b a();

    public final Class b(Class cls) {
        String name = cls.getName();
        C1392b c1392b = this.f5762c;
        Class cls2 = (Class) c1392b.getOrDefault(name, null);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        c1392b.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) {
        C1392b c1392b = this.f5760a;
        Method method = (Method) c1392b.getOrDefault(str, null);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, a.class.getClassLoader()).getDeclaredMethod("read", a.class);
        c1392b.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) {
        String name = cls.getName();
        C1392b c1392b = this.f5761b;
        Method method = (Method) c1392b.getOrDefault(name, null);
        if (method != null) {
            return method;
        }
        Class b6 = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = b6.getDeclaredMethod("write", cls, a.class);
        c1392b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i2);

    public final Parcelable f(Parcelable parcelable, int i2) {
        if (!e(i2)) {
            return parcelable;
        }
        return ((b) this).f5764e.readParcelable(b.class.getClassLoader());
    }

    public final c g() {
        String readString = ((b) this).f5764e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (c) c(readString).invoke(null, a());
        } catch (ClassNotFoundException e3) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e3);
        } catch (IllegalAccessException e6) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e6);
        } catch (NoSuchMethodException e7) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e7);
        } catch (InvocationTargetException e8) {
            if (e8.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e8.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e8);
        }
    }

    public abstract void h(int i2);

    public final void i(c cVar) {
        if (cVar == null) {
            ((b) this).f5764e.writeString(null);
            return;
        }
        try {
            ((b) this).f5764e.writeString(b(cVar.getClass()).getName());
            b a6 = a();
            try {
                d(cVar.getClass()).invoke(null, cVar, a6);
                int i2 = a6.f5768i;
                if (i2 >= 0) {
                    int i3 = a6.f5763d.get(i2);
                    Parcel parcel = a6.f5764e;
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i3);
                    parcel.writeInt(dataPosition - i3);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (ClassNotFoundException e3) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e3);
            } catch (IllegalAccessException e6) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e6);
            } catch (NoSuchMethodException e7) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e7);
            } catch (InvocationTargetException e8) {
                if (!(e8.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e8);
                }
                throw ((RuntimeException) e8.getCause());
            }
        } catch (ClassNotFoundException e9) {
            throw new RuntimeException(cVar.getClass().getSimpleName().concat(" does not have a Parcelizer"), e9);
        }
    }
}
