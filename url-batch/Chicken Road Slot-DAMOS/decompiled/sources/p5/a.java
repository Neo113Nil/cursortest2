package p5;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import s.e;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final e f7669a;

    /* renamed from: b, reason: collision with root package name */
    public final e f7670b;

    /* renamed from: c, reason: collision with root package name */
    public final e f7671c;

    public a(e eVar, e eVar2, e eVar3) {
        this.f7669a = eVar;
        this.f7670b = eVar2;
        this.f7671c = eVar3;
    }

    public abstract b a();

    public final Class b(Class cls) {
        String name = cls.getName();
        e eVar = this.f7671c;
        Class cls2 = (Class) eVar.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        eVar.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) {
        e eVar = this.f7669a;
        Method method = (Method) eVar.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, a.class.getClassLoader()).getDeclaredMethod("read", a.class);
        eVar.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) {
        String name = cls.getName();
        e eVar = this.f7670b;
        Method method = (Method) eVar.get(name);
        if (method != null) {
            return method;
        }
        Class b10 = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = b10.getDeclaredMethod("write", cls, a.class);
        eVar.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i3);

    public final Parcelable f(Parcelable parcelable, int i3) {
        if (!e(i3)) {
            return parcelable;
        }
        return ((b) this).f7673e.readParcelable(b.class.getClassLoader());
    }

    public final c g() {
        String readString = ((b) this).f7673e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (c) c(readString).invoke(null, a());
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e2);
        } catch (IllegalAccessException e9) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e9);
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e10);
        } catch (InvocationTargetException e11) {
            if (e11.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e11.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e11);
        }
    }

    public abstract void h(int i3);

    public final void i(c cVar) {
        if (cVar == null) {
            ((b) this).f7673e.writeString(null);
            return;
        }
        try {
            ((b) this).f7673e.writeString(b(cVar.getClass()).getName());
            b a9 = a();
            try {
                d(cVar.getClass()).invoke(null, cVar, a9);
                Parcel parcel = a9.f7673e;
                int i3 = a9.f7676i;
                if (i3 >= 0) {
                    int i10 = a9.f7672d.get(i3);
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i10);
                    parcel.writeInt(dataPosition - i10);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (ClassNotFoundException e2) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e2);
            } catch (IllegalAccessException e9) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e9);
            } catch (NoSuchMethodException e10) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e10);
            } catch (InvocationTargetException e11) {
                if (!(e11.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e11);
                }
                throw ((RuntimeException) e11.getCause());
            }
        } catch (ClassNotFoundException e12) {
            throw new RuntimeException(cVar.getClass().getSimpleName().concat(" does not have a Parcelizer"), e12);
        }
    }
}
