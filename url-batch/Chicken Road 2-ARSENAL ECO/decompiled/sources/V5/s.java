package V5;

import D3.B;
import T5.M;
import U5.AbstractC0216c;
import U5.EnumC0214a;
import java.lang.annotation.Annotation;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final B f2760a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0216c f2761b;

    /* renamed from: c, reason: collision with root package name */
    public final w f2762c;

    /* renamed from: d, reason: collision with root package name */
    public final s[] f2763d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2764e;

    /* renamed from: f, reason: collision with root package name */
    public String f2765f;

    public s(B composer, AbstractC0216c abstractC0216c, w wVar, s[] sVarArr) {
        kotlin.jvm.internal.i.e(composer, "composer");
        this.f2760a = composer;
        this.f2761b = abstractC0216c;
        this.f2762c = wVar;
        this.f2763d = sVarArr;
        N3.k kVar = abstractC0216c.f2635a;
        int ordinal = wVar.ordinal();
        if (sVarArr != null) {
            s sVar = sVarArr[ordinal];
            if (sVar == null && sVar == this) {
                return;
            }
            sVarArr[ordinal] = this;
        }
    }

    public final s a(R5.e descriptor) {
        s sVar;
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        AbstractC0216c abstractC0216c = this.f2761b;
        w h7 = n.h(descriptor, abstractC0216c);
        char c7 = h7.f2781f;
        B b7 = this.f2760a;
        b7.d(c7);
        b7.f385a = true;
        if (this.f2765f != null) {
            b7.a();
            String str = this.f2765f;
            kotlin.jvm.internal.i.b(str);
            o(str);
            b7.d(':');
            o(descriptor.b());
            this.f2765f = null;
        }
        if (this.f2762c == h7) {
            return this;
        }
        s[] sVarArr = this.f2763d;
        return (sVarArr == null || (sVar = sVarArr[h7.ordinal()]) == null) ? new s(b7, abstractC0216c, h7, sVarArr) : sVar;
    }

    public final void b(boolean z5) {
        if (this.f2764e) {
            o(String.valueOf(z5));
        } else {
            ((A.j) this.f2760a.f386b).i(String.valueOf(z5));
        }
    }

    public final void c(byte b7) {
        if (this.f2764e) {
            o(String.valueOf((int) b7));
        } else {
            this.f2760a.c(b7);
        }
    }

    public final void d(char c7) {
        o(String.valueOf(c7));
    }

    public final void e(double d7) {
        boolean z5 = this.f2764e;
        B b7 = this.f2760a;
        if (z5) {
            o(String.valueOf(d7));
        } else {
            ((A.j) b7.f386b).i(String.valueOf(d7));
        }
        if (Double.isInfinite(d7) || Double.isNaN(d7)) {
            throw n.a(Double.valueOf(d7), ((A.j) b7.f386b).toString());
        }
    }

    public final void f(R5.e descriptor, int i7) {
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        int ordinal = this.f2762c.ordinal();
        B b7 = this.f2760a;
        boolean z5 = true;
        if (ordinal == 1) {
            if (!b7.f385a) {
                b7.d(',');
            }
            b7.a();
            return;
        }
        if (ordinal == 2) {
            if (b7.f385a) {
                this.f2764e = true;
                b7.a();
                return;
            }
            if (i7 % 2 == 0) {
                b7.d(',');
                b7.a();
            } else {
                b7.d(':');
                b7.j();
                z5 = false;
            }
            this.f2764e = z5;
            return;
        }
        if (ordinal != 3) {
            if (!b7.f385a) {
                b7.d(',');
            }
            b7.a();
            n.g(descriptor, this.f2761b);
            o(descriptor.e(i7));
            b7.d(':');
            b7.j();
            return;
        }
        if (i7 == 0) {
            this.f2764e = true;
        }
        if (i7 == 1) {
            b7.d(',');
            b7.j();
            this.f2764e = false;
        }
    }

    public final void g(float f7) {
        boolean z5 = this.f2764e;
        B b7 = this.f2760a;
        if (z5) {
            o(String.valueOf(f7));
        } else {
            ((A.j) b7.f386b).i(String.valueOf(f7));
        }
        if (Float.isInfinite(f7) || Float.isNaN(f7)) {
            throw n.a(Float.valueOf(f7), ((A.j) b7.f386b).toString());
        }
    }

    public final s h(R5.e descriptor) {
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        boolean a7 = t.a(descriptor);
        w wVar = this.f2762c;
        AbstractC0216c abstractC0216c = this.f2761b;
        B b7 = this.f2760a;
        if (a7) {
            if (!(b7 instanceof f)) {
                b7 = new f((A.j) b7.f386b, this.f2764e);
            }
            return new s(b7, abstractC0216c, wVar, null);
        }
        if (!descriptor.isInline() || !descriptor.equals(U5.l.f2651a)) {
            return this;
        }
        if (!(b7 instanceof e)) {
            b7 = new e((A.j) b7.f386b, this.f2764e);
        }
        return new s(b7, abstractC0216c, wVar, null);
    }

    public final s i(M descriptor, int i7) {
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        f(descriptor, i7);
        return h(descriptor.h(i7));
    }

    public final void j(int i7) {
        if (this.f2764e) {
            o(String.valueOf(i7));
        } else {
            this.f2760a.e(i7);
        }
    }

    public final void k(long j4) {
        if (this.f2764e) {
            o(String.valueOf(j4));
        } else {
            this.f2760a.f(j4);
        }
    }

    public final void l(R5.e descriptor, int i7, Q5.a serializer, Object obj) {
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        kotlin.jvm.internal.i.e(serializer, "serializer");
        f(descriptor, i7);
        m(serializer, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(Q5.a serializer, Object obj) {
        String str;
        kotlin.jvm.internal.i.e(serializer, "serializer");
        N3.k kVar = this.f2761b.f2635a;
        int ordinal = ((EnumC0214a) kVar.f1726g).ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                A3.c c7 = serializer.c().c();
                if (kotlin.jvm.internal.i.a(c7, R5.i.f2172b) || kotlin.jvm.internal.i.a(c7, R5.i.f2175e)) {
                    R5.e c8 = serializer.c();
                    kotlin.jvm.internal.i.e(c8, "<this>");
                    Iterator it = c8.getAnnotations().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            str = (String) kVar.f1725f;
                            break;
                        }
                        Annotation annotation = (Annotation) it.next();
                        if (annotation instanceof U5.i) {
                            str = ((U5.i) annotation).discriminator();
                            break;
                        }
                    }
                    if (str != null) {
                        this.f2765f = str;
                    }
                    serializer.a(this, obj);
                }
            } else if (ordinal != 2) {
                throw new H5.r();
            }
        }
        str = null;
        if (str != null) {
        }
        serializer.a(this, obj);
    }

    public final void n(short s6) {
        if (this.f2764e) {
            o(String.valueOf((int) s6));
        } else {
            this.f2760a.h(s6);
        }
    }

    public final void o(String value) {
        kotlin.jvm.internal.i.e(value, "value");
        this.f2760a.i(value);
    }

    public final void p(R5.e descriptor) {
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        B b7 = this.f2760a;
        b7.getClass();
        b7.f385a = false;
        b7.d(this.f2762c.f2782g);
    }
}
