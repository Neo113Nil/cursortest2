package y1;

import android.os.Parcel;
import android.os.Parcelable;
import i.C0670e;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: y1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1320a {

    /* renamed from: a, reason: collision with root package name */
    public final C0670e f11643a;

    /* renamed from: b, reason: collision with root package name */
    public final C0670e f11644b;

    /* renamed from: c, reason: collision with root package name */
    public final C0670e f11645c;

    public AbstractC1320a(C0670e c0670e, C0670e c0670e2, C0670e c0670e3) {
        this.f11643a = c0670e;
        this.f11644b = c0670e2;
        this.f11645c = c0670e3;
    }

    public abstract b a();

    public final Class b(Class cls) {
        String name = cls.getName();
        C0670e c0670e = this.f11645c;
        Class cls2 = (Class) c0670e.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        c0670e.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) {
        C0670e c0670e = this.f11643a;
        Method method = (Method) c0670e.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, AbstractC1320a.class.getClassLoader()).getDeclaredMethod("read", AbstractC1320a.class);
        c0670e.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) {
        String name = cls.getName();
        C0670e c0670e = this.f11644b;
        Method method = (Method) c0670e.get(name);
        if (method != null) {
            return method;
        }
        Class b4 = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = b4.getDeclaredMethod("write", cls, AbstractC1320a.class);
        c0670e.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i2);

    public final Parcelable f(Parcelable parcelable, int i2) {
        if (!e(i2)) {
            return parcelable;
        }
        return ((b) this).f11647e.readParcelable(b.class.getClassLoader());
    }

    public final c g() {
        String readString = ((b) this).f11647e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (c) c(readString).invoke(null, a());
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        } catch (IllegalAccessException e5) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e5);
        } catch (NoSuchMethodException e6) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e6);
        } catch (InvocationTargetException e7) {
            if (e7.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e7.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e7);
        }
    }

    public abstract void h(int i2);

    public final void i(c cVar) {
        if (cVar == null) {
            ((b) this).f11647e.writeString(null);
            return;
        }
        try {
            ((b) this).f11647e.writeString(b(cVar.getClass()).getName());
            b a4 = a();
            try {
                d(cVar.getClass()).invoke(null, cVar, a4);
                int i2 = a4.f11651i;
                if (i2 >= 0) {
                    int i4 = a4.f11646d.get(i2);
                    Parcel parcel = a4.f11647e;
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i4);
                    parcel.writeInt(dataPosition - i4);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (ClassNotFoundException e4) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
            } catch (IllegalAccessException e5) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e5);
            } catch (NoSuchMethodException e6) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e6);
            } catch (InvocationTargetException e7) {
                if (!(e7.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e7);
                }
                throw ((RuntimeException) e7.getCause());
            }
        } catch (ClassNotFoundException e8) {
            throw new RuntimeException(cVar.getClass().getSimpleName().concat(" does not have a Parcelizer"), e8);
        }
    }
}
