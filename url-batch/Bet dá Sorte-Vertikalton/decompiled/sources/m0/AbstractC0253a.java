package m0;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: m0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0253a {

    /* renamed from: a, reason: collision with root package name */
    public final o.b f3140a;

    /* renamed from: b, reason: collision with root package name */
    public final o.b f3141b;

    /* renamed from: c, reason: collision with root package name */
    public final o.b f3142c;

    public AbstractC0253a(o.b bVar, o.b bVar2, o.b bVar3) {
        this.f3140a = bVar;
        this.f3141b = bVar2;
        this.f3142c = bVar3;
    }

    public abstract C0254b a();

    public final Class b(Class cls) {
        String name = cls.getName();
        o.b bVar = this.f3142c;
        Class cls2 = (Class) bVar.getOrDefault(name, null);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        bVar.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) {
        o.b bVar = this.f3140a;
        Method method = (Method) bVar.getOrDefault(str, null);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, AbstractC0253a.class.getClassLoader()).getDeclaredMethod("read", AbstractC0253a.class);
        bVar.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) {
        String name = cls.getName();
        o.b bVar = this.f3141b;
        Method method = (Method) bVar.getOrDefault(name, null);
        if (method != null) {
            return method;
        }
        Class b2 = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = b2.getDeclaredMethod("write", cls, AbstractC0253a.class);
        bVar.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i);

    public final Parcelable f(Parcelable parcelable, int i) {
        if (!e(i)) {
            return parcelable;
        }
        return ((C0254b) this).f3143e.readParcelable(C0254b.class.getClassLoader());
    }

    public final InterfaceC0255c g() {
        String readString = ((C0254b) this).f3143e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (InterfaceC0255c) c(readString).invoke(null, a());
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e2);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e3);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e4);
        } catch (InvocationTargetException e5) {
            if (e5.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e5.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e5);
        }
    }

    public abstract void h(int i);

    public final void i(InterfaceC0255c interfaceC0255c) {
        if (interfaceC0255c == null) {
            ((C0254b) this).f3143e.writeString(null);
            return;
        }
        try {
            ((C0254b) this).f3143e.writeString(b(interfaceC0255c.getClass()).getName());
            C0254b a2 = a();
            try {
                d(interfaceC0255c.getClass()).invoke(null, interfaceC0255c, a2);
                int i = a2.i;
                if (i >= 0) {
                    int i2 = a2.d.get(i);
                    Parcel parcel = a2.f3143e;
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(dataPosition - i2);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (ClassNotFoundException e2) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e2);
            } catch (IllegalAccessException e3) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e3);
            } catch (NoSuchMethodException e4) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e4);
            } catch (InvocationTargetException e5) {
                if (!(e5.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e5);
                }
                throw ((RuntimeException) e5.getCause());
            }
        } catch (ClassNotFoundException e6) {
            throw new RuntimeException(interfaceC0255c.getClass().getSimpleName().concat(" does not have a Parcelizer"), e6);
        }
    }
}
