package androidx.versionedparcelable;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import m0.InterfaceC3256a;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    protected final androidx.collection.a f13198a;

    /* renamed from: b, reason: collision with root package name */
    protected final androidx.collection.a f13199b;

    /* renamed from: c, reason: collision with root package name */
    protected final androidx.collection.a f13200c;

    public a(androidx.collection.a aVar, androidx.collection.a aVar2, androidx.collection.a aVar3) {
        this.f13198a = aVar;
        this.f13199b = aVar2;
        this.f13200c = aVar3;
    }

    private void N(InterfaceC3256a interfaceC3256a) {
        try {
            I(c(interfaceC3256a.getClass()).getName());
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException(interfaceC3256a.getClass().getSimpleName() + " does not have a Parcelizer", e4);
        }
    }

    private Class c(Class cls) {
        Class cls2 = (Class) this.f13200c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        this.f13200c.put(cls.getName(), cls3);
        return cls3;
    }

    private Method d(String str) {
        Method method = (Method) this.f13198a.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, a.class.getClassLoader()).getDeclaredMethod("read", a.class);
        this.f13198a.put(str, declaredMethod);
        return declaredMethod;
    }

    private Method e(Class cls) {
        Method method = (Method) this.f13199b.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class c4 = c(cls);
        System.currentTimeMillis();
        Method declaredMethod = c4.getDeclaredMethod("write", cls, a.class);
        this.f13199b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    protected abstract void A(byte[] bArr);

    public void B(byte[] bArr, int i4) {
        w(i4);
        A(bArr);
    }

    protected abstract void C(CharSequence charSequence);

    public void D(CharSequence charSequence, int i4) {
        w(i4);
        C(charSequence);
    }

    protected abstract void E(int i4);

    public void F(int i4, int i5) {
        w(i5);
        E(i4);
    }

    protected abstract void G(Parcelable parcelable);

    public void H(Parcelable parcelable, int i4) {
        w(i4);
        G(parcelable);
    }

    protected abstract void I(String str);

    public void J(String str, int i4) {
        w(i4);
        I(str);
    }

    protected void K(InterfaceC3256a interfaceC3256a, a aVar) {
        try {
            e(interfaceC3256a.getClass()).invoke(null, interfaceC3256a, aVar);
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
    }

    protected void L(InterfaceC3256a interfaceC3256a) {
        if (interfaceC3256a == null) {
            I(null);
            return;
        }
        N(interfaceC3256a);
        a b4 = b();
        K(interfaceC3256a, b4);
        b4.a();
    }

    public void M(InterfaceC3256a interfaceC3256a, int i4) {
        w(i4);
        L(interfaceC3256a);
    }

    protected abstract void a();

    protected abstract a b();

    public boolean f() {
        return false;
    }

    protected abstract boolean g();

    public boolean h(boolean z4, int i4) {
        return !m(i4) ? z4 : g();
    }

    protected abstract byte[] i();

    public byte[] j(byte[] bArr, int i4) {
        return !m(i4) ? bArr : i();
    }

    protected abstract CharSequence k();

    public CharSequence l(CharSequence charSequence, int i4) {
        return !m(i4) ? charSequence : k();
    }

    protected abstract boolean m(int i4);

    protected InterfaceC3256a n(String str, a aVar) {
        try {
            return (InterfaceC3256a) d(str).invoke(null, aVar);
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

    protected abstract int o();

    public int p(int i4, int i5) {
        return !m(i5) ? i4 : o();
    }

    protected abstract Parcelable q();

    public Parcelable r(Parcelable parcelable, int i4) {
        return !m(i4) ? parcelable : q();
    }

    protected abstract String s();

    public String t(String str, int i4) {
        return !m(i4) ? str : s();
    }

    protected InterfaceC3256a u() {
        String s4 = s();
        if (s4 == null) {
            return null;
        }
        return n(s4, b());
    }

    public InterfaceC3256a v(InterfaceC3256a interfaceC3256a, int i4) {
        return !m(i4) ? interfaceC3256a : u();
    }

    protected abstract void w(int i4);

    public void x(boolean z4, boolean z5) {
    }

    protected abstract void y(boolean z4);

    public void z(boolean z4, int i4) {
        w(i4);
        y(z4);
    }
}
