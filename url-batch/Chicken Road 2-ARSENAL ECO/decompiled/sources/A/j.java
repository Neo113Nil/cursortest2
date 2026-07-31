package A;

import U0.t;
import U5.B;
import U5.r;
import U5.x;
import V5.p;
import V5.q;
import V5.u;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import k5.AbstractC0471a;
import k5.C0472b;
import kotlin.jvm.internal.v;
import o5.InterfaceC0564d;
import p5.EnumC0580a;
import q5.AbstractC0605a;
import u0.AbstractC0676f;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25a;

    /* renamed from: b, reason: collision with root package name */
    public int f26b;

    /* renamed from: c, reason: collision with root package name */
    public Object f27c;

    public /* synthetic */ j(int i7) {
        this.f25a = i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(j jVar, C0472b c0472b, AbstractC0605a abstractC0605a) {
        q qVar;
        int i7;
        byte f7;
        LinkedHashMap linkedHashMap;
        u uVar;
        LinkedHashMap linkedHashMap2;
        j jVar2;
        byte b7;
        u uVar2 = (u) jVar.f27c;
        if (abstractC0605a instanceof q) {
            qVar = (q) abstractC0605a;
            int i8 = qVar.f2753l;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                qVar.f2753l = i8 - Integer.MIN_VALUE;
                Object obj = qVar.f2751j;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = qVar.f2753l;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    f7 = uVar2.f((byte) 6);
                    if (uVar2.p() == 4) {
                        u.m(uVar2, "Unexpected leading comma", 0, 6);
                        throw null;
                    }
                    linkedHashMap = new LinkedHashMap();
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    String str = qVar.f2750i;
                    linkedHashMap2 = qVar.f2749h;
                    jVar2 = qVar.f2748g;
                    C0472b c0472b2 = qVar.f2747f;
                    AbstractC0676f.w(obj);
                    linkedHashMap2.put(str, (U5.k) obj);
                    b7 = ((u) jVar2.f27c).e();
                    if (b7 != 4) {
                        if (b7 != 7) {
                            u.m((u) jVar2.f27c, "Expected end of the object or comma", 0, 6);
                            throw null;
                        }
                        u uVar3 = (u) jVar2.f27c;
                        if (b7 != 6) {
                            uVar3.f((byte) 7);
                        } else if (b7 == 4) {
                            V5.n.e(uVar3, "object");
                            throw null;
                        }
                        return new x(linkedHashMap2);
                    }
                    f7 = b7;
                    jVar = jVar2;
                    linkedHashMap = linkedHashMap2;
                    c0472b = c0472b2;
                }
                uVar = (u) jVar.f27c;
                if (uVar.b()) {
                    linkedHashMap2 = linkedHashMap;
                    jVar2 = jVar;
                    b7 = f7;
                    u uVar32 = (u) jVar2.f27c;
                    if (b7 != 6) {
                    }
                    return new x(linkedHashMap2);
                }
                String i9 = uVar.i();
                uVar.f((byte) 5);
                qVar.f2747f = c0472b;
                qVar.f2748g = jVar;
                qVar.f2749h = linkedHashMap;
                qVar.f2750i = i9;
                qVar.f2753l = 1;
                c0472b.getClass();
                c0472b.f5191g = qVar;
                return enumC0580a;
            }
        }
        qVar = new q(jVar, abstractC0605a);
        Object obj2 = qVar.f2751j;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = qVar.f2753l;
        if (i7 != 0) {
        }
        uVar = (u) jVar.f27c;
        if (uVar.b()) {
        }
    }

    public void b(int i7, int i8) {
        int i9 = i8 + i7;
        char[] cArr = (char[]) this.f27c;
        if (cArr.length <= i9) {
            int i10 = i7 * 2;
            if (i9 < i10) {
                i9 = i10;
            }
            char[] copyOf = Arrays.copyOf(cArr, i9);
            kotlin.jvm.internal.i.d(copyOf, "copyOf(...)");
            this.f27c = copyOf;
        }
    }

    public void c(int i7, n6.d dVar) {
        while (true) {
            int i8 = i7 >> 1;
            if (i8 == 0) {
                break;
            }
            n6.d dVar2 = ((n6.d[]) this.f27c)[i8];
            kotlin.jvm.internal.i.b(dVar2);
            if (kotlin.jvm.internal.i.h(0L, dVar.f5565c - dVar2.f5565c) <= 0) {
                break;
            }
            dVar2.f5517f = i7;
            ((n6.d[]) this.f27c)[i7] = dVar2;
            i7 = i8;
        }
        ((n6.d[]) this.f27c)[i7] = dVar;
        dVar.f5517f = i7;
    }

    public U5.k d() {
        U5.k xVar;
        Object obj;
        u uVar = (u) this.f27c;
        byte p4 = uVar.p();
        if (p4 == 1) {
            return f(true);
        }
        if (p4 == 0) {
            return f(false);
        }
        if (p4 != 6) {
            if (p4 == 8) {
                return e();
            }
            u.m(uVar, "Cannot read Json element because of unexpected ".concat(V5.n.j(p4)), 0, 6);
            throw null;
        }
        int i7 = this.f26b + 1;
        this.f26b = i7;
        if (i7 == 200) {
            p pVar = new p(this, null);
            EnumC0580a enumC0580a = AbstractC0471a.f5189a;
            C0472b c0472b = new C0472b();
            c0472b.f5190f = pVar;
            c0472b.f5191g = c0472b;
            EnumC0580a enumC0580a2 = AbstractC0471a.f5189a;
            c0472b.f5192h = enumC0580a2;
            while (true) {
                obj = c0472b.f5192h;
                InterfaceC0564d interfaceC0564d = c0472b.f5191g;
                if (interfaceC0564d == null) {
                    break;
                }
                if (kotlin.jvm.internal.i.a(enumC0580a2, obj)) {
                    try {
                        p pVar2 = c0472b.f5190f;
                        v.b(3, pVar2);
                        p pVar3 = new p(pVar2.f2746i, interfaceC0564d);
                        pVar3.f2745h = c0472b;
                        Object invokeSuspend = pVar3.invokeSuspend(k5.v.f5219a);
                        if (invokeSuspend != EnumC0580a.f5697f) {
                            interfaceC0564d.resumeWith(invokeSuspend);
                        }
                    } catch (Throwable th) {
                        interfaceC0564d.resumeWith(AbstractC0676f.f(th));
                    }
                } else {
                    c0472b.f5192h = enumC0580a2;
                    interfaceC0564d.resumeWith(obj);
                }
            }
            AbstractC0676f.w(obj);
            xVar = (U5.k) obj;
        } else {
            byte f7 = uVar.f((byte) 6);
            if (uVar.p() == 4) {
                u.m(uVar, "Unexpected leading comma", 0, 6);
                throw null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (true) {
                if (!uVar.b()) {
                    break;
                }
                String i8 = uVar.i();
                uVar.f((byte) 5);
                linkedHashMap.put(i8, d());
                f7 = uVar.e();
                if (f7 != 4) {
                    if (f7 != 7) {
                        u.m(uVar, "Expected end of the object or comma", 0, 6);
                        throw null;
                    }
                }
            }
            if (f7 == 6) {
                uVar.f((byte) 7);
            } else if (f7 == 4) {
                V5.n.e(uVar, "object");
                throw null;
            }
            xVar = new x(linkedHashMap);
        }
        this.f26b--;
        return xVar;
    }

    public U5.e e() {
        u uVar = (u) this.f27c;
        byte e4 = uVar.e();
        if (uVar.p() == 4) {
            u.m(uVar, "Unexpected leading comma", 0, 6);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        while (uVar.b()) {
            arrayList.add(d());
            e4 = uVar.e();
            if (e4 != 4) {
                boolean z5 = e4 == 9;
                int i7 = uVar.f2768b;
                if (!z5) {
                    u.m(uVar, "Expected end of the array or comma", i7, 4);
                    throw null;
                }
            }
        }
        if (e4 == 8) {
            uVar.f((byte) 9);
        } else if (e4 == 4) {
            V5.n.e(uVar, "array");
            throw null;
        }
        return new U5.e(arrayList);
    }

    public B f(boolean z5) {
        u uVar = (u) this.f27c;
        String j4 = !z5 ? uVar.j() : uVar.i();
        return (z5 || !kotlin.jvm.internal.i.a(j4, "null")) ? new r(j4, z5) : U5.u.INSTANCE;
    }

    public void g() {
        V5.b bVar = V5.b.f2726c;
        char[] array = (char[]) this.f27c;
        bVar.getClass();
        kotlin.jvm.internal.i.e(array, "array");
        synchronized (bVar) {
            int i7 = bVar.f2728b;
            if (array.length + i7 < V5.a.f2725a) {
                bVar.f2728b = i7 + array.length;
                bVar.f2727a.addLast(array);
            }
        }
    }

    public void h(n6.d dVar) {
        n6.d dVar2;
        int i7 = dVar.f5517f;
        if (i7 == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i8 = this.f26b;
        n6.d dVar3 = ((n6.d[]) this.f27c)[i8];
        kotlin.jvm.internal.i.b(dVar3);
        dVar.f5517f = -1;
        ((n6.d[]) this.f27c)[i8] = null;
        this.f26b = i8 - 1;
        if (dVar == dVar3) {
            return;
        }
        int h7 = kotlin.jvm.internal.i.h(0L, dVar3.f5565c - dVar.f5565c);
        if (h7 == 0) {
            ((n6.d[]) this.f27c)[i7] = dVar3;
            dVar3.f5517f = i7;
            return;
        }
        if (h7 >= 0) {
            c(i7, dVar3);
            return;
        }
        while (true) {
            int i9 = i7 << 1;
            int i10 = i9 + 1;
            int i11 = this.f26b;
            if (i10 > i11) {
                if (i9 > i11) {
                    break;
                }
                dVar2 = ((n6.d[]) this.f27c)[i9];
                kotlin.jvm.internal.i.b(dVar2);
            } else {
                dVar2 = ((n6.d[]) this.f27c)[i9];
                kotlin.jvm.internal.i.b(dVar2);
                n6.d dVar4 = ((n6.d[]) this.f27c)[i10];
                kotlin.jvm.internal.i.b(dVar4);
                if (kotlin.jvm.internal.i.h(0L, dVar4.f5565c - dVar2.f5565c) >= 0) {
                    dVar2 = dVar4;
                }
            }
            if (kotlin.jvm.internal.i.h(0L, dVar2.f5565c - dVar3.f5565c) <= 0) {
                break;
            }
            int i12 = dVar2.f5517f;
            dVar2.f5517f = i7;
            ((n6.d[]) this.f27c)[i7] = dVar2;
            i7 = i12;
        }
        ((n6.d[]) this.f27c)[i7] = dVar3;
        dVar3.f5517f = i7;
    }

    public void i(String text) {
        kotlin.jvm.internal.i.e(text, "text");
        int length = text.length();
        if (length == 0) {
            return;
        }
        b(this.f26b, length);
        text.getChars(0, text.length(), (char[]) this.f27c, this.f26b);
        this.f26b += length;
    }

    public String toString() {
        switch (this.f25a) {
            case 3:
                return new String((char[]) this.f27c, 0, this.f26b);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ j(int i7, int i8, Object[] objArr) {
        this.f25a = i8;
        this.f26b = i7;
        this.f27c = objArr;
    }

    public j(R0.a aVar, int i7) {
        this.f25a = 2;
        t.f(aVar);
        this.f27c = aVar;
        this.f26b = i7;
    }

    public j(N3.k kVar, u uVar) {
        this.f25a = 4;
        this.f27c = uVar;
    }

    public j(ArrayList arrayList) {
        this.f25a = 5;
        this.f27c = arrayList;
    }
}
