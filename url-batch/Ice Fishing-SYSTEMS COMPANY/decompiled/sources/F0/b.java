package F0;

import android.os.Parcel;
import android.os.Parcelable;
import com.anythink.core.common.d.j;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final s.b f941a;

    /* renamed from: b, reason: collision with root package name */
    public final s.b f942b;

    /* renamed from: c, reason: collision with root package name */
    public final s.b f943c;

    public b(s.b bVar, s.b bVar2, s.b bVar3) {
        this.f941a = bVar;
        this.f942b = bVar2;
        this.f943c = bVar3;
    }

    public abstract c a();

    public final Class b(Class cls) {
        String name = cls.getName();
        s.b bVar = this.f943c;
        Class cls2 = (Class) bVar.getOrDefault(name, null);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + j.f12535z + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        bVar.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) {
        s.b bVar = this.f941a;
        Method method = (Method) bVar.getOrDefault(str, null);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, b.class.getClassLoader()).getDeclaredMethod("read", b.class);
        bVar.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) {
        String name = cls.getName();
        s.b bVar = this.f942b;
        Method method = (Method) bVar.getOrDefault(name, null);
        if (method != null) {
            return method;
        }
        Class b9 = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = b9.getDeclaredMethod("write", cls, b.class);
        bVar.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i);

    public final Parcelable f(Parcelable parcelable, int i) {
        if (!e(i)) {
            return parcelable;
        }
        return ((c) this).f945e.readParcelable(c.class.getClassLoader());
    }

    public final d g() {
        String readString = ((c) this).f945e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (d) c(readString).invoke(null, a());
        } catch (ClassNotFoundException e6) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e6);
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
            ((c) this).f945e.writeString(null);
            return;
        }
        try {
            ((c) this).f945e.writeString(b(dVar.getClass()).getName());
            c a9 = a();
            try {
                d(dVar.getClass()).invoke(null, dVar, a9);
                int i = a9.i;
                if (i >= 0) {
                    int i4 = a9.f944d.get(i);
                    Parcel parcel = a9.f945e;
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i4);
                    parcel.writeInt(dataPosition - i4);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (ClassNotFoundException e6) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e6);
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
