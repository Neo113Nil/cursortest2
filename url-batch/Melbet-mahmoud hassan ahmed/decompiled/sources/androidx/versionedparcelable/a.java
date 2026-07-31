package androidx.versionedparcelable;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import c4.w0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    protected final h.a<String, Method> f1370a;

    /* renamed from: b, reason: collision with root package name */
    protected final h.a<String, Method> f1371b;

    /* renamed from: c, reason: collision with root package name */
    protected final h.a<String, Class> f1372c;

    /* renamed from: androidx.versionedparcelable.a$a, reason: collision with other inner class name */
    class C0027a extends ObjectInputStream {
        C0027a(InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.ObjectInputStream
        protected Class<?> resolveClass(ObjectStreamClass objectStreamClass) {
            Class<?> cls = Class.forName(objectStreamClass.getName(), false, getClass().getClassLoader());
            return cls != null ? cls : super.resolveClass(objectStreamClass);
        }
    }

    public a(h.a<String, Method> aVar, h.a<String, Method> aVar2, h.a<String, Class> aVar3) {
        this.f1370a = aVar;
        this.f1371b = aVar2;
        this.f1372c = aVar3;
    }

    private <T> void T(Collection<T> collection) {
        if (collection == null) {
            X(-1);
        }
        int size = collection.size();
        X(size);
        if (size > 0) {
            int e7 = e(collection.iterator().next());
            X(e7);
            switch (e7) {
                case 1:
                    Iterator<T> it = collection.iterator();
                    while (it.hasNext()) {
                        l0((a0.b) it.next());
                    }
                    break;
                case 2:
                    Iterator<T> it2 = collection.iterator();
                    while (it2.hasNext()) {
                        c0((Parcelable) it2.next());
                    }
                    break;
                case 3:
                    Iterator<T> it3 = collection.iterator();
                    while (it3.hasNext()) {
                        e0((Serializable) it3.next());
                    }
                    break;
                case 4:
                    Iterator<T> it4 = collection.iterator();
                    while (it4.hasNext()) {
                        g0((String) it4.next());
                    }
                    break;
                case 5:
                    Iterator<T> it5 = collection.iterator();
                    while (it5.hasNext()) {
                        i0((IBinder) it5.next());
                    }
                    break;
                case w0.f2149o /* 7 */:
                    Iterator<T> it6 = collection.iterator();
                    while (it6.hasNext()) {
                        X(((Integer) it6.next()).intValue());
                    }
                    break;
                case w0.f2150p /* 8 */:
                    Iterator<T> it7 = collection.iterator();
                    while (it7.hasNext()) {
                        V(((Float) it7.next()).floatValue());
                    }
                    break;
            }
        }
    }

    private <T> void U(Collection<T> collection, int i7) {
        J(i7);
        T(collection);
    }

    private Class c(Class<? extends a0.b> cls) {
        Class cls2 = this.f1372c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        this.f1372c.put(cls.getName(), cls3);
        return cls3;
    }

    private Method d(String str) {
        Method method = this.f1370a.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, a.class.getClassLoader()).getDeclaredMethod("read", a.class);
        this.f1370a.put(str, declaredMethod);
        return declaredMethod;
    }

    private <T> int e(T t6) {
        if (t6 instanceof String) {
            return 4;
        }
        if (t6 instanceof Parcelable) {
            return 2;
        }
        if (t6 instanceof a0.b) {
            return 1;
        }
        if (t6 instanceof Serializable) {
            return 3;
        }
        if (t6 instanceof IBinder) {
            return 5;
        }
        if (t6 instanceof Integer) {
            return 7;
        }
        if (t6 instanceof Float) {
            return 8;
        }
        throw new IllegalArgumentException(t6.getClass().getName() + " cannot be VersionedParcelled");
    }

    private void e0(Serializable serializable) {
        if (serializable == null) {
            g0(null);
            return;
        }
        String name = serializable.getClass().getName();
        g0(name);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(serializable);
            objectOutputStream.close();
            P(byteArrayOutputStream.toByteArray());
        } catch (IOException e7) {
            throw new RuntimeException("VersionedParcelable encountered IOException writing serializable object (name = " + name + ")", e7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Method f(Class cls) {
        Method method = this.f1371b.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class c7 = c(cls);
        System.currentTimeMillis();
        Method declaredMethod = c7.getDeclaredMethod("write", cls, a.class);
        this.f1371b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void n0(a0.b bVar) {
        try {
            g0(c(bVar.getClass()).getName());
        } catch (ClassNotFoundException e7) {
            throw new RuntimeException(bVar.getClass().getSimpleName() + " does not have a Parcelizer", e7);
        }
    }

    private <T, S extends Collection<T>> S p(S s7) {
        int u6 = u();
        if (u6 < 0) {
            return null;
        }
        if (u6 != 0) {
            int u7 = u();
            if (u6 < 0) {
                return null;
            }
            if (u7 == 1) {
                while (u6 > 0) {
                    s7.add(H());
                    u6--;
                }
            } else if (u7 == 2) {
                while (u6 > 0) {
                    s7.add(z());
                    u6--;
                }
            } else if (u7 == 3) {
                while (u6 > 0) {
                    s7.add(B());
                    u6--;
                }
            } else if (u7 == 4) {
                while (u6 > 0) {
                    s7.add(D());
                    u6--;
                }
            } else if (u7 == 5) {
                while (u6 > 0) {
                    s7.add(F());
                    u6--;
                }
            }
        }
        return s7;
    }

    public <T extends Parcelable> T A(T t6, int i7) {
        return !q(i7) ? t6 : (T) z();
    }

    protected Serializable B() {
        String D = D();
        if (D == null) {
            return null;
        }
        try {
            return (Serializable) new C0027a(new ByteArrayInputStream(l())).readObject();
        } catch (IOException e7) {
            throw new RuntimeException("VersionedParcelable encountered IOException reading a Serializable object (name = " + D + ")", e7);
        } catch (ClassNotFoundException e8) {
            throw new RuntimeException("VersionedParcelable encountered ClassNotFoundException reading a Serializable object (name = " + D + ")", e8);
        }
    }

    public <T> Set<T> C(Set<T> set, int i7) {
        return !q(i7) ? set : (Set) p(new h.b());
    }

    protected abstract String D();

    public String E(String str, int i7) {
        return !q(i7) ? str : D();
    }

    protected abstract IBinder F();

    public IBinder G(IBinder iBinder, int i7) {
        return !q(i7) ? iBinder : F();
    }

    protected <T extends a0.b> T H() {
        String D = D();
        if (D == null) {
            return null;
        }
        return (T) t(D, b());
    }

    public <T extends a0.b> T I(T t6, int i7) {
        return !q(i7) ? t6 : (T) H();
    }

    protected abstract void J(int i7);

    public void K(boolean z6, boolean z7) {
    }

    protected abstract void L(boolean z6);

    public void M(boolean z6, int i7) {
        J(i7);
        L(z6);
    }

    protected abstract void N(Bundle bundle);

    public void O(Bundle bundle, int i7) {
        J(i7);
        N(bundle);
    }

    protected abstract void P(byte[] bArr);

    public void Q(byte[] bArr, int i7) {
        J(i7);
        P(bArr);
    }

    protected abstract void R(CharSequence charSequence);

    public void S(CharSequence charSequence, int i7) {
        J(i7);
        R(charSequence);
    }

    protected abstract void V(float f7);

    public void W(float f7, int i7) {
        J(i7);
        V(f7);
    }

    protected abstract void X(int i7);

    public void Y(int i7, int i8) {
        J(i8);
        X(i7);
    }

    public <T> void Z(List<T> list, int i7) {
        U(list, i7);
    }

    protected abstract void a();

    protected abstract void a0(long j7);

    protected abstract a b();

    public void b0(long j7, int i7) {
        J(i7);
        a0(j7);
    }

    protected abstract void c0(Parcelable parcelable);

    public void d0(Parcelable parcelable, int i7) {
        J(i7);
        c0(parcelable);
    }

    public <T> void f0(Set<T> set, int i7) {
        U(set, i7);
    }

    public boolean g() {
        return false;
    }

    protected abstract void g0(String str);

    protected abstract boolean h();

    public void h0(String str, int i7) {
        J(i7);
        g0(str);
    }

    public boolean i(boolean z6, int i7) {
        return !q(i7) ? z6 : h();
    }

    protected abstract void i0(IBinder iBinder);

    protected abstract Bundle j();

    public void j0(IBinder iBinder, int i7) {
        J(i7);
        i0(iBinder);
    }

    public Bundle k(Bundle bundle, int i7) {
        return !q(i7) ? bundle : j();
    }

    protected <T extends a0.b> void k0(T t6, a aVar) {
        try {
            f(t6.getClass()).invoke(null, t6, aVar);
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
    }

    protected abstract byte[] l();

    protected void l0(a0.b bVar) {
        if (bVar == null) {
            g0(null);
            return;
        }
        n0(bVar);
        a b7 = b();
        k0(bVar, b7);
        b7.a();
    }

    public byte[] m(byte[] bArr, int i7) {
        return !q(i7) ? bArr : l();
    }

    public void m0(a0.b bVar, int i7) {
        J(i7);
        l0(bVar);
    }

    protected abstract CharSequence n();

    public CharSequence o(CharSequence charSequence, int i7) {
        return !q(i7) ? charSequence : n();
    }

    protected abstract boolean q(int i7);

    protected abstract float r();

    public float s(float f7, int i7) {
        return !q(i7) ? f7 : r();
    }

    protected <T extends a0.b> T t(String str, a aVar) {
        try {
            return (T) d(str).invoke(null, aVar);
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

    protected abstract int u();

    public int v(int i7, int i8) {
        return !q(i8) ? i7 : u();
    }

    public <T> List<T> w(List<T> list, int i7) {
        return !q(i7) ? list : (List) p(new ArrayList());
    }

    protected abstract long x();

    public long y(long j7, int i7) {
        return !q(i7) ? j7 : x();
    }

    protected abstract <T extends Parcelable> T z();
}
