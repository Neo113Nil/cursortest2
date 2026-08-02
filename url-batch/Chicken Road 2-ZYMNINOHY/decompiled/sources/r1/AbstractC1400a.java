package r1;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p.e;

/* renamed from: r1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1400a {

    /* renamed from: a, reason: collision with root package name */
    public final e f15188a;

    /* renamed from: b, reason: collision with root package name */
    public final e f15189b;

    /* renamed from: c, reason: collision with root package name */
    public final e f15190c;

    public AbstractC1400a(e eVar, e eVar2, e eVar3) {
        this.f15188a = eVar;
        this.f15189b = eVar2;
        this.f15190c = eVar3;
    }

    public abstract C1401b a();

    public final Class b(Class cls) {
        String name = cls.getName();
        e eVar = this.f15190c;
        Class cls2 = (Class) eVar.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        eVar.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) {
        e eVar = this.f15188a;
        Method method = (Method) eVar.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, AbstractC1400a.class.getClassLoader()).getDeclaredMethod("read", AbstractC1400a.class);
        eVar.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) {
        String name = cls.getName();
        e eVar = this.f15189b;
        Method method = (Method) eVar.get(name);
        if (method != null) {
            return method;
        }
        Class b4 = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = b4.getDeclaredMethod("write", cls, AbstractC1400a.class);
        eVar.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i4);

    public final Parcelable f(Parcelable parcelable, int i4) {
        if (!e(i4)) {
            return parcelable;
        }
        return ((C1401b) this).f15192e.readParcelable(C1401b.class.getClassLoader());
    }

    public final InterfaceC1402c g() {
        String readString = ((C1401b) this).f15192e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (InterfaceC1402c) c(readString).invoke(null, a());
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

    public abstract void h(int i4);

    public final void i(InterfaceC1402c interfaceC1402c) {
        if (interfaceC1402c == null) {
            ((C1401b) this).f15192e.writeString(null);
            return;
        }
        try {
            ((C1401b) this).f15192e.writeString(b(interfaceC1402c.getClass()).getName());
            C1401b a3 = a();
            try {
                d(interfaceC1402c.getClass()).invoke(null, interfaceC1402c, a3);
                Parcel parcel = a3.f15192e;
                int i4 = a3.f15196i;
                if (i4 >= 0) {
                    int i5 = a3.f15191d.get(i4);
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i5);
                    parcel.writeInt(dataPosition - i5);
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
            throw new RuntimeException(interfaceC1402c.getClass().getSimpleName().concat(" does not have a Parcelizer"), e8);
        }
    }
}
