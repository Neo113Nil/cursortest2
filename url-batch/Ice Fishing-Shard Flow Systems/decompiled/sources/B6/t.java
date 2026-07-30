package B6;

import A6.AbstractC0091c;
import A6.EnumC0089a;
import java.lang.annotation.Annotation;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import z6.M;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final e f251a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0091c f252b;

    /* renamed from: c, reason: collision with root package name */
    public final x f253c;

    /* renamed from: d, reason: collision with root package name */
    public final t[] f254d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f255e;

    /* renamed from: f, reason: collision with root package name */
    public String f256f;

    public t(e composer, AbstractC0091c json, x mode, t[] tVarArr) {
        Intrinsics.checkNotNullParameter(composer, "composer");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f251a = composer;
        this.f252b = json;
        this.f253c = mode;
        this.f254d = tVarArr;
        A6.j jVar = json.f97a;
        int ordinal = mode.ordinal();
        if (tVarArr != null) {
            t tVar = tVarArr[ordinal];
            if (tVar == null && tVar == this) {
                return;
            }
            tVarArr[ordinal] = this;
        }
    }

    public final t a(x6.e descriptor) {
        t tVar;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        AbstractC0091c abstractC0091c = this.f252b;
        x i2 = m.i(abstractC0091c, descriptor);
        char c7 = i2.f272d;
        e eVar = this.f251a;
        eVar.e(c7);
        eVar.f219d = true;
        if (this.f256f != null) {
            eVar.b();
            String str = this.f256f;
            Intrinsics.b(str);
            o(str);
            eVar.e(':');
            o(descriptor.b());
            this.f256f = null;
        }
        if (this.f253c == i2) {
            return this;
        }
        t[] tVarArr = this.f254d;
        return (tVarArr == null || (tVar = tVarArr[i2.ordinal()]) == null) ? new t(eVar, abstractC0091c, i2, tVarArr) : tVar;
    }

    public final void b(boolean z7) {
        if (this.f255e) {
            o(String.valueOf(z7));
        } else {
            ((p) this.f251a.f220e).j(String.valueOf(z7));
        }
    }

    public final void c(byte b7) {
        if (this.f255e) {
            o(String.valueOf((int) b7));
        } else {
            this.f251a.d(b7);
        }
    }

    public final void d(char c7) {
        o(String.valueOf(c7));
    }

    public final void e(double d7) {
        boolean z7 = this.f255e;
        e eVar = this.f251a;
        if (z7) {
            o(String.valueOf(d7));
        } else {
            ((p) eVar.f220e).j(String.valueOf(d7));
        }
        if (Double.isInfinite(d7) || Double.isNaN(d7)) {
            throw m.a(Double.valueOf(d7), ((p) eVar.f220e).toString());
        }
    }

    public final void f(x6.e descriptor, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        int ordinal = this.f253c.ordinal();
        e eVar = this.f251a;
        boolean z7 = true;
        if (ordinal == 1) {
            if (!eVar.f219d) {
                eVar.e(',');
            }
            eVar.b();
            return;
        }
        if (ordinal == 2) {
            if (eVar.f219d) {
                this.f255e = true;
                eVar.b();
                return;
            }
            if (i2 % 2 == 0) {
                eVar.e(',');
                eVar.b();
            } else {
                eVar.e(':');
                eVar.l();
                z7 = false;
            }
            this.f255e = z7;
            return;
        }
        if (ordinal == 3) {
            if (i2 == 0) {
                this.f255e = true;
            }
            if (i2 == 1) {
                eVar.e(',');
                eVar.l();
                this.f255e = false;
                return;
            }
            return;
        }
        if (!eVar.f219d) {
            eVar.e(',');
        }
        eVar.b();
        Intrinsics.checkNotNullParameter(descriptor, "<this>");
        AbstractC0091c json = this.f252b;
        Intrinsics.checkNotNullParameter(json, "json");
        m.h(json, descriptor);
        o(descriptor.e(i2));
        eVar.e(':');
        eVar.l();
    }

    public final void g(float f7) {
        boolean z7 = this.f255e;
        e eVar = this.f251a;
        if (z7) {
            o(String.valueOf(f7));
        } else {
            ((p) eVar.f220e).j(String.valueOf(f7));
        }
        if (Float.isInfinite(f7) || Float.isNaN(f7)) {
            throw m.a(Float.valueOf(f7), ((p) eVar.f220e).toString());
        }
    }

    public final t h(x6.e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        boolean a7 = u.a(descriptor);
        x xVar = this.f253c;
        AbstractC0091c abstractC0091c = this.f252b;
        e eVar = this.f251a;
        if (a7) {
            if (!(eVar instanceof g)) {
                eVar = new g((p) eVar.f220e, this.f255e);
            }
            return new t(eVar, abstractC0091c, xVar, null);
        }
        Intrinsics.checkNotNullParameter(descriptor, "<this>");
        if (!descriptor.f() || !descriptor.equals(A6.m.f120a)) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            return this;
        }
        if (!(eVar instanceof f)) {
            eVar = new f((p) eVar.f220e, this.f255e);
        }
        return new t(eVar, abstractC0091c, xVar, null);
    }

    public final t i(M descriptor, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        f(descriptor, i2);
        return h(descriptor.i(i2));
    }

    public final void j(int i2) {
        if (this.f255e) {
            o(String.valueOf(i2));
        } else {
            this.f251a.f(i2);
        }
    }

    public final void k(long j) {
        if (this.f255e) {
            o(String.valueOf(j));
        } else {
            this.f251a.g(j);
        }
    }

    public final void l(x6.e descriptor, int i2, w6.a serializer, Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        f(descriptor, i2);
        m(serializer, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(w6.a serializer, Object obj) {
        String str;
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        AbstractC0091c json = this.f252b;
        A6.j jVar = json.f97a;
        int ordinal = ((EnumC0089a) jVar.f119g).ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                V6.b c7 = serializer.c().c();
                if (Intrinsics.a(c7, x6.i.f8442b) || Intrinsics.a(c7, x6.i.f8445e)) {
                    x6.e c8 = serializer.c();
                    Intrinsics.checkNotNullParameter(c8, "<this>");
                    Intrinsics.checkNotNullParameter(json, "json");
                    Iterator it = c8.getAnnotations().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            str = (String) jVar.f118f;
                            break;
                        }
                        Annotation annotation = (Annotation) it.next();
                        if (annotation instanceof A6.i) {
                            str = ((A6.i) annotation).discriminator();
                            break;
                        }
                    }
                    if (str != null) {
                        this.f256f = str;
                    }
                    serializer.b(this, obj);
                }
            } else if (ordinal != 2) {
                throw new R5.k();
            }
        }
        str = null;
        if (str != null) {
        }
        serializer.b(this, obj);
    }

    public final void n(short s7) {
        if (this.f255e) {
            o(String.valueOf((int) s7));
        } else {
            this.f251a.j(s7);
        }
    }

    public final void o(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f251a.k(value);
    }

    public final void p(x6.e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        e eVar = this.f251a;
        eVar.getClass();
        eVar.f219d = false;
        eVar.e(this.f253c.f273e);
    }
}
