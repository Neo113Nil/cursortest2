package d4;

import android.os.Parcel;
import android.os.Parcelable;
import i.e;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final e f2594a;

    /* renamed from: b, reason: collision with root package name */
    public final e f2595b;

    /* renamed from: c, reason: collision with root package name */
    public final e f2596c;

    public b(e eVar, e eVar2, e eVar3) {
        this.f2594a = eVar;
        this.f2595b = eVar2;
        this.f2596c = eVar3;
    }

    public abstract c a();

    public final Class b(Class cls) {
        String name = cls.getName();
        e eVar = this.f2596c;
        Class cls2 = (Class) eVar.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        eVar.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) {
        e eVar = this.f2594a;
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
        e eVar = this.f2595b;
        Method method = (Method) eVar.get(name);
        if (method != null) {
            return method;
        }
        Class b9 = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = b9.getDeclaredMethod("write", cls, b.class);
        eVar.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i7);

    public final Parcelable f(Parcelable parcelable, int i7) {
        if (!e(i7)) {
            return parcelable;
        }
        return ((c) this).f2598e.readParcelable(c.class.getClassLoader());
    }

    public final d g() {
        String readString = ((c) this).f2598e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (d) c(readString).invoke(null, a());
        } catch (ClassNotFoundException e9) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e9);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e10);
        } catch (NoSuchMethodException e11) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e11);
        } catch (InvocationTargetException e12) {
            if (e12.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e12.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e12);
        }
    }

    public abstract void h(int i7);

    public final void i(d dVar) {
        if (dVar == null) {
            ((c) this).f2598e.writeString(null);
            return;
        }
        try {
            ((c) this).f2598e.writeString(b(dVar.getClass()).getName());
            c a3 = a();
            try {
                d(dVar.getClass()).invoke(null, dVar, a3);
                Parcel parcel = a3.f2598e;
                int i7 = a3.f2602i;
                if (i7 >= 0) {
                    int i8 = a3.f2597d.get(i7);
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i8);
                    parcel.writeInt(dataPosition - i8);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (ClassNotFoundException e9) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e9);
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e10);
            } catch (NoSuchMethodException e11) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e11);
            } catch (InvocationTargetException e12) {
                if (!(e12.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e12);
                }
                throw ((RuntimeException) e12.getCause());
            }
        } catch (ClassNotFoundException e13) {
            throw new RuntimeException(dVar.getClass().getSimpleName().concat(" does not have a Parcelizer"), e13);
        }
    }
}
