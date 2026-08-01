package t1;

import G1.AbstractC0001b;
import a.AbstractC0058a;
import androidx.room.C0086c;
import i1.InterfaceC0192l;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import r1.h0;

/* loaded from: classes.dex */
public final class m extends b {

    /* renamed from: m, reason: collision with root package name */
    public final int f4203m;

    public m(int i, int i2, InterfaceC0192l interfaceC0192l) {
        super(i, interfaceC0192l);
        String str;
        this.f4203m = i2;
        if (i2 != 1) {
            if (i >= 1) {
                return;
            }
            throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i + " was specified").toString());
        }
        StringBuilder sb = new StringBuilder("This implementation does not support suspension for senders, use ");
        Class cls = j1.l.a(b.class).f3178a;
        j1.h.e(cls, "jClass");
        String str2 = null;
        if (!cls.isAnonymousClass()) {
            if (cls.isLocalClass()) {
                String simpleName = cls.getSimpleName();
                Method enclosingMethod = cls.getEnclosingMethod();
                if (enclosingMethod == null) {
                    Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
                    if (enclosingConstructor == null) {
                        int y02 = q1.e.y0(simpleName, '$', 0, false, 6);
                        if (y02 == -1) {
                            str2 = simpleName;
                        } else {
                            String substring = simpleName.substring(y02 + 1, simpleName.length());
                            j1.h.d(substring, "substring(...)");
                            str2 = substring;
                        }
                    } else {
                        str2 = q1.e.I0(simpleName, enclosingConstructor.getName() + '$');
                    }
                } else {
                    str2 = q1.e.I0(simpleName, enclosingMethod.getName() + '$');
                }
            } else {
                boolean isArray = cls.isArray();
                LinkedHashMap linkedHashMap = j1.d.f3177d;
                if (isArray) {
                    Class<?> componentType = cls.getComponentType();
                    if (componentType.isPrimitive() && (str = (String) linkedHashMap.get(componentType.getName())) != null) {
                        str2 = str.concat("Array");
                    }
                    if (str2 == null) {
                        str2 = "Array";
                    }
                } else {
                    str2 = (String) linkedHashMap.get(cls.getName());
                    if (str2 == null) {
                        str2 = cls.getSimpleName();
                    }
                }
            }
        }
        throw new IllegalArgumentException(AbstractC0001b.g(sb, str2, " instead").toString());
    }

    @Override // t1.b, t1.o
    public final Object a(Object obj, C0086c c0086c) {
        W0.c b2;
        if (!(z(obj, true) instanceof g)) {
            return W0.i.f1345a;
        }
        InterfaceC0192l interfaceC0192l = this.f4180c;
        if (interfaceC0192l == null || (b2 = w1.a.b(interfaceC0192l, obj, null)) == null) {
            throw m();
        }
        AbstractC0058a.a(b2, m());
        throw b2;
    }

    @Override // t1.b, t1.o
    public final Object b(Object obj) {
        return z(W0.i.f1345a, false);
    }

    @Override // t1.b
    public final boolean q() {
        return this.f4203m == 2;
    }

    public final Object z(Object obj, boolean z2) {
        j jVar;
        InterfaceC0192l interfaceC0192l;
        W0.c b2;
        W0.i iVar = W0.i.f1345a;
        if (this.f4203m == 3) {
            Object b3 = super.b(obj);
            if (!(b3 instanceof h) || (b3 instanceof g)) {
                return b3;
            }
            if (!z2 || (interfaceC0192l = this.f4180c) == null || (b2 = w1.a.b(interfaceC0192l, obj, null)) == null) {
                return iVar;
            }
            throw b2;
        }
        V.p pVar = d.f4184d;
        j jVar2 = (j) b.f4176h.get(this);
        while (true) {
            long andIncrement = b.f4173d.getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean p2 = p(andIncrement, false);
            int i = d.f4182b;
            long j2 = i;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            if (jVar2.f4500c != j3) {
                j c2 = b.c(this, j3, jVar2);
                if (c2 != null) {
                    jVar = c2;
                } else if (p2) {
                    return new g(m());
                }
            } else {
                jVar = jVar2;
            }
            int e = b.e(this, jVar, i2, obj, j, pVar, p2);
            if (e == 0) {
                jVar.a();
                return iVar;
            }
            if (e == 1) {
                return iVar;
            }
            if (e == 2) {
                if (p2) {
                    jVar.h();
                    return new g(m());
                }
                h0 h0Var = pVar instanceof h0 ? (h0) pVar : null;
                if (h0Var != null) {
                    h0Var.a(jVar, i2 + i);
                }
                i((jVar.f4500c * j2) + i2);
                return iVar;
            }
            if (e == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (e == 4) {
                if (j < b.e.get(this)) {
                    jVar.a();
                }
                return new g(m());
            }
            if (e == 5) {
                jVar.a();
            }
            jVar2 = jVar;
        }
    }
}
