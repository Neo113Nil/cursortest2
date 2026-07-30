package t0;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import u.C0934e;

/* renamed from: t0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0902a {

    /* renamed from: a, reason: collision with root package name */
    public final C0934e f7884a;

    /* renamed from: b, reason: collision with root package name */
    public final C0934e f7885b;

    /* renamed from: c, reason: collision with root package name */
    public final C0934e f7886c;

    public AbstractC0902a(C0934e c0934e, C0934e c0934e2, C0934e c0934e3) {
        this.f7884a = c0934e;
        this.f7885b = c0934e2;
        this.f7886c = c0934e3;
    }

    public abstract C0903b a();

    public final Class b(Class cls) {
        String name = cls.getName();
        C0934e c0934e = this.f7886c;
        Class cls2 = (Class) c0934e.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        c0934e.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) {
        C0934e c0934e = this.f7884a;
        Method method = (Method) c0934e.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, AbstractC0902a.class.getClassLoader()).getDeclaredMethod("read", AbstractC0902a.class);
        c0934e.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) {
        String name = cls.getName();
        C0934e c0934e = this.f7885b;
        Method method = (Method) c0934e.get(name);
        if (method != null) {
            return method;
        }
        Class b7 = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = b7.getDeclaredMethod("write", cls, AbstractC0902a.class);
        c0934e.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i2);

    public final Parcelable f(Parcelable parcelable, int i2) {
        if (!e(i2)) {
            return parcelable;
        }
        return ((C0903b) this).f7888e.readParcelable(C0903b.class.getClassLoader());
    }

    public final c g() {
        String readString = ((C0903b) this).f7888e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (c) c(readString).invoke(null, a());
        } catch (ClassNotFoundException e7) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e7);
        } catch (IllegalAccessException e8) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e8);
        } catch (NoSuchMethodException e9) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e9);
        } catch (InvocationTargetException e10) {
            if (e10.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e10.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e10);
        }
    }

    public abstract void h(int i2);

    public final void i(c cVar) {
        if (cVar == null) {
            ((C0903b) this).f7888e.writeString(null);
            return;
        }
        try {
            ((C0903b) this).f7888e.writeString(b(cVar.getClass()).getName());
            C0903b a7 = a();
            try {
                d(cVar.getClass()).invoke(null, cVar, a7);
                Parcel parcel = a7.f7888e;
                int i2 = a7.f7892i;
                if (i2 >= 0) {
                    int i5 = a7.f7887d.get(i2);
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i5);
                    parcel.writeInt(dataPosition - i5);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (ClassNotFoundException e7) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e7);
            } catch (IllegalAccessException e8) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e8);
            } catch (NoSuchMethodException e9) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e9);
            } catch (InvocationTargetException e10) {
                if (!(e10.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e10);
                }
                throw ((RuntimeException) e10.getCause());
            }
        } catch (ClassNotFoundException e11) {
            throw new RuntimeException(cVar.getClass().getSimpleName().concat(" does not have a Parcelizer"), e11);
        }
    }
}
