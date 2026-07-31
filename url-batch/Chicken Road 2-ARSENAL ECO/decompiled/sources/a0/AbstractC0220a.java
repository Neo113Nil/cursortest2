package a0;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import q.C0582b;

/* renamed from: a0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0220a {

    /* renamed from: a, reason: collision with root package name */
    public final C0582b f3113a;

    /* renamed from: b, reason: collision with root package name */
    public final C0582b f3114b;

    /* renamed from: c, reason: collision with root package name */
    public final C0582b f3115c;

    public AbstractC0220a(C0582b c0582b, C0582b c0582b2, C0582b c0582b3) {
        this.f3113a = c0582b;
        this.f3114b = c0582b2;
        this.f3115c = c0582b3;
    }

    public abstract C0221b a();

    public final Class b(Class cls) {
        String name = cls.getName();
        C0582b c0582b = this.f3115c;
        Class cls2 = (Class) c0582b.getOrDefault(name, null);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        c0582b.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) {
        C0582b c0582b = this.f3113a;
        Method method = (Method) c0582b.getOrDefault(str, null);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, AbstractC0220a.class.getClassLoader()).getDeclaredMethod("read", AbstractC0220a.class);
        c0582b.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) {
        String name = cls.getName();
        C0582b c0582b = this.f3114b;
        Method method = (Method) c0582b.getOrDefault(name, null);
        if (method != null) {
            return method;
        }
        Class b7 = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = b7.getDeclaredMethod("write", cls, AbstractC0220a.class);
        c0582b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i7);

    public final Parcelable f(Parcelable parcelable, int i7) {
        if (!e(i7)) {
            return parcelable;
        }
        return ((C0221b) this).f3117e.readParcelable(C0221b.class.getClassLoader());
    }

    public final InterfaceC0222c g() {
        String readString = ((C0221b) this).f3117e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (InterfaceC0222c) c(readString).invoke(null, a());
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        } catch (IllegalAccessException e7) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e7);
        } catch (NoSuchMethodException e8) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e8);
        } catch (InvocationTargetException e9) {
            if (e9.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e9.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e9);
        }
    }

    public abstract void h(int i7);

    public final void i(InterfaceC0222c interfaceC0222c) {
        if (interfaceC0222c == null) {
            ((C0221b) this).f3117e.writeString(null);
            return;
        }
        try {
            ((C0221b) this).f3117e.writeString(b(interfaceC0222c.getClass()).getName());
            C0221b a7 = a();
            try {
                d(interfaceC0222c.getClass()).invoke(null, interfaceC0222c, a7);
                Parcel parcel = a7.f3117e;
                int i7 = a7.f3121i;
                if (i7 >= 0) {
                    int i8 = a7.f3116d.get(i7);
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i8);
                    parcel.writeInt(dataPosition - i8);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (ClassNotFoundException e4) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
            } catch (IllegalAccessException e7) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e7);
            } catch (NoSuchMethodException e8) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e8);
            } catch (InvocationTargetException e9) {
                if (!(e9.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e9);
                }
                throw ((RuntimeException) e9.getCause());
            }
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException(interfaceC0222c.getClass().getSimpleName().concat(" does not have a Parcelizer"), e10);
        }
    }
}
