package e5;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import o.e;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final e f2493a;

    /* renamed from: b, reason: collision with root package name */
    public final e f2494b;

    /* renamed from: c, reason: collision with root package name */
    public final e f2495c;

    public b(e eVar, e eVar2, e eVar3) {
        this.f2493a = eVar;
        this.f2494b = eVar2;
        this.f2495c = eVar3;
    }

    public abstract c a();

    public final Class b(Class cls) {
        String name = cls.getName();
        e eVar = this.f2495c;
        Class cls2 = (Class) eVar.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        eVar.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) {
        e eVar = this.f2493a;
        Method method = (Method) eVar.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, b.class.getClassLoader()).getDeclaredMethod("read", b.class);
        eVar.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) {
        String name = cls.getName();
        e eVar = this.f2494b;
        Method method = (Method) eVar.get(name);
        if (method != null) {
            return method;
        }
        Class b8 = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = b8.getDeclaredMethod("write", cls, b.class);
        eVar.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i);

    public final Parcelable f(Parcelable parcelable, int i) {
        if (!e(i)) {
            return parcelable;
        }
        return ((c) this).f2497e.readParcelable(c.class.getClassLoader());
    }

    public final d g() {
        String readString = ((c) this).f2497e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (d) c(readString).invoke(null, a());
        } catch (ClassNotFoundException e8) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e8);
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

    public abstract void h(int i);

    public final void i(d dVar) {
        if (dVar == null) {
            ((c) this).f2497e.writeString(null);
            return;
        }
        try {
            ((c) this).f2497e.writeString(b(dVar.getClass()).getName());
            c a8 = a();
            try {
                d(dVar.getClass()).invoke(null, dVar, a8);
                Parcel parcel = a8.f2497e;
                int i = a8.i;
                if (i >= 0) {
                    int i8 = a8.f2496d.get(i);
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i8);
                    parcel.writeInt(dataPosition - i8);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (ClassNotFoundException e8) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e8);
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
            throw new RuntimeException(dVar.getClass().getSimpleName().concat(" does not have a Parcelizer"), e12);
        }
    }
}
