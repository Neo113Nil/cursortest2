package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqs {
    final qy a;
    final qy b;
    final qy c;
    public final Parcel d;
    private final SparseIntArray e;
    private final int f;
    private final int g;
    private final String h;
    private int i;
    private int j;
    private int k;

    public aqs(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new qy(0), new qy(0), new qy(0));
    }

    private final Class v(Class cls) {
        qy qyVar = this.c;
        Class cls2 = (Class) qyVar.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        qyVar.put(cls.getName(), cls3);
        return cls3;
    }

    public final int a(int i, int i2) {
        return !s(i2) ? i : this.d.readInt();
    }

    public final Parcelable b(Parcelable parcelable, int i) {
        if (!s(i)) {
            return parcelable;
        }
        return this.d.readParcelable(getClass().getClassLoader());
    }

    public final aqt c() {
        String n = n();
        if (n == null) {
            return null;
        }
        aqs m = m();
        try {
            qy qyVar = this.a;
            Method method = (Method) qyVar.get(n);
            if (method == null) {
                method = Class.forName(n, false, aqs.class.getClassLoader()).getDeclaredMethod("read", aqs.class);
                qyVar.put(n, method);
            }
            return (aqt) method.invoke(null, m);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException(e3);
        } catch (InvocationTargetException e4) {
            Throwable cause = e4.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(e4);
        }
    }

    public final CharSequence d(CharSequence charSequence, int i) {
        if (!s(i)) {
            return charSequence;
        }
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.d);
    }

    public final String e(String str, int i) {
        return !s(i) ? str : n();
    }

    public final void f(boolean z, int i) {
        p(i);
        this.d.writeInt(z ? 1 : 0);
    }

    public final void g(CharSequence charSequence, int i) {
        p(i);
        TextUtils.writeToParcel(charSequence, this.d, 0);
    }

    public final void h(int i, int i2) {
        p(i2);
        q(i);
    }

    public final void i(Parcelable parcelable, int i) {
        p(i);
        this.d.writeParcelable(parcelable, 0);
    }

    public final void j(String str, int i) {
        p(i);
        r(str);
    }

    public final void k(aqt aqtVar) {
        if (aqtVar == null) {
            r(null);
            return;
        }
        try {
            r(v(aqtVar.getClass()).getName());
            aqs m = m();
            try {
                Class<?> cls = aqtVar.getClass();
                qy qyVar = this.b;
                Method method = (Method) qyVar.get(cls.getName());
                if (method == null) {
                    method = v(cls).getDeclaredMethod("write", cls, aqs.class);
                    qyVar.put(cls.getName(), method);
                }
                method.invoke(null, aqtVar, m);
                m.o();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException(e3);
            } catch (InvocationTargetException e4) {
                Throwable cause = e4.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                if (!(cause instanceof Error)) {
                    throw new RuntimeException(e4);
                }
                throw ((Error) cause);
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(String.valueOf(aqtVar.getClass().getSimpleName()).concat(" does not have a Parcelizer"), e5);
        }
    }

    public final boolean l(boolean z, int i) {
        return s(i) ? this.d.readInt() != 0 : z;
    }

    protected final aqs m() {
        Parcel parcel = this.d;
        int dataPosition = parcel.dataPosition();
        int i = this.j;
        if (i == this.f) {
            i = this.g;
        }
        String str = this.h;
        return new aqs(parcel, dataPosition, i, str.concat("  "), this.a, this.b, this.c);
    }

    public final String n() {
        return this.d.readString();
    }

    public final void o() {
        int i = this.i;
        if (i >= 0) {
            SparseIntArray sparseIntArray = this.e;
            Parcel parcel = this.d;
            int i2 = sparseIntArray.get(i);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i2);
            parcel.writeInt(dataPosition - i2);
            parcel.setDataPosition(dataPosition);
        }
    }

    public final void p(int i) {
        o();
        this.i = i;
        this.e.put(i, this.d.dataPosition());
        q(0);
        q(i);
    }

    public final void q(int i) {
        this.d.writeInt(i);
    }

    public final void r(String str) {
        this.d.writeString(str);
    }

    public final boolean s(int i) {
        while (true) {
            int i2 = this.j;
            int i3 = this.g;
            int i4 = this.k;
            if (i2 >= i3) {
                return i4 == i;
            }
            if (i4 == i) {
                return true;
            }
            if (String.valueOf(i4).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            Parcel parcel = this.d;
            parcel.setDataPosition(this.j);
            int readInt = parcel.readInt();
            this.k = parcel.readInt();
            this.j += readInt;
        }
    }

    public final aqt t(aqt aqtVar) {
        return !s(1) ? aqtVar : c();
    }

    public final void u(aqt aqtVar) {
        p(1);
        k(aqtVar);
    }

    private aqs(Parcel parcel, int i, int i2, String str, qy qyVar, qy qyVar2, qy qyVar3) {
        this.a = qyVar;
        this.b = qyVar2;
        this.c = qyVar3;
        this.e = new SparseIntArray();
        this.i = -1;
        this.k = -1;
        this.d = parcel;
        this.f = i;
        this.g = i2;
        this.j = i;
        this.h = str;
    }
}
