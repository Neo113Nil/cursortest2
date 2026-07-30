package g0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class s1 extends j6.i implements q6.f {

    /* renamed from: g, reason: collision with root package name */
    public List f3879g;

    /* renamed from: h, reason: collision with root package name */
    public List f3880h;

    /* renamed from: i, reason: collision with root package name */
    public List f3881i;

    /* renamed from: j, reason: collision with root package name */
    public i.b0 f3882j;

    /* renamed from: k, reason: collision with root package name */
    public i.b0 f3883k;

    /* renamed from: l, reason: collision with root package name */
    public i.b0 f3884l;

    /* renamed from: m, reason: collision with root package name */
    public Set f3885m;

    /* renamed from: n, reason: collision with root package name */
    public i.b0 f3886n;

    /* renamed from: o, reason: collision with root package name */
    public int f3887o;

    /* renamed from: p, reason: collision with root package name */
    public /* synthetic */ u0 f3888p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ t1 f3889q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(t1 t1Var, h6.d dVar) {
        super(3, dVar);
        this.f3889q = t1Var;
    }

    public static final void m(t1 t1Var, List list, List list2, List list3, i.b0 b0Var, i.b0 b0Var2, i.b0 b0Var3, i.b0 b0Var4) {
        char c4;
        long j8;
        long j9;
        synchronized (t1Var.f3908b) {
            try {
                list.clear();
                list2.clear();
                int size = list3.size();
                for (int i7 = 0; i7 < size; i7++) {
                    u uVar = (u) list3.get(i7);
                    uVar.a();
                    t1Var.A(uVar);
                }
                list3.clear();
                Object[] objArr = b0Var.f4722b;
                long[] jArr = b0Var.f4721a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i8 = 0;
                    j8 = 255;
                    while (true) {
                        long j10 = jArr[i8];
                        c4 = 7;
                        j9 = -9187201950435737472L;
                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i9 = 8 - ((~(i8 - length)) >>> 31);
                            for (int i10 = 0; i10 < i9; i10++) {
                                if ((j10 & 255) < 128) {
                                    u uVar2 = (u) objArr[(i8 << 3) + i10];
                                    uVar2.a();
                                    t1Var.A(uVar2);
                                }
                                j10 >>= 8;
                            }
                            if (i9 != 8) {
                                break;
                            }
                        }
                        if (i8 == length) {
                            break;
                        } else {
                            i8++;
                        }
                    }
                } else {
                    c4 = 7;
                    j8 = 255;
                    j9 = -9187201950435737472L;
                }
                b0Var.b();
                Object[] objArr2 = b0Var2.f4722b;
                long[] jArr2 = b0Var2.f4721a;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i11 = 0;
                    while (true) {
                        long j11 = jArr2[i11];
                        if ((((~j11) << c4) & j11 & j9) != j9) {
                            int i12 = 8 - ((~(i11 - length2)) >>> 31);
                            for (int i13 = 0; i13 < i12; i13++) {
                                if ((j11 & j8) < 128) {
                                    ((u) objArr2[(i11 << 3) + i13]).g();
                                }
                                j11 >>= 8;
                            }
                            if (i12 != 8) {
                                break;
                            }
                        }
                        if (i11 == length2) {
                            break;
                        } else {
                            i11++;
                        }
                    }
                }
                b0Var2.b();
                b0Var3.b();
                Object[] objArr3 = b0Var4.f4722b;
                long[] jArr3 = b0Var4.f4721a;
                int length3 = jArr3.length - 2;
                if (length3 >= 0) {
                    int i14 = 0;
                    while (true) {
                        long j12 = jArr3[i14];
                        if ((((~j12) << c4) & j12 & j9) != j9) {
                            int i15 = 8 - ((~(i14 - length3)) >>> 31);
                            for (int i16 = 0; i16 < i15; i16++) {
                                if ((j12 & j8) < 128) {
                                    u uVar3 = (u) objArr3[(i14 << 3) + i16];
                                    uVar3.a();
                                    t1Var.A(uVar3);
                                }
                                j12 >>= 8;
                            }
                            if (i15 != 8) {
                                break;
                            }
                        }
                        if (i14 == length3) {
                            break;
                        } else {
                            i14++;
                        }
                    }
                }
                b0Var4.b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void n(List list, t1 t1Var) {
        list.clear();
        synchronized (t1Var.f3908b) {
            try {
                ArrayList arrayList = t1Var.f3916j;
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    list.add((x0) arrayList.get(i7));
                }
                t1Var.f3916j.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // q6.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        s1 s1Var = new s1(this.f3889q, (h6.d) obj3);
        s1Var.f3888p = (u0) obj2;
        s1Var.invokeSuspend(d6.z.f2639a);
        return i6.a.f4956f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0099 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0130 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0123 -> B:6:0x012b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x01d2 -> B:24:0x0094). Please report as a decompilation issue!!! */
    @Override // j6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u0 u0Var;
        i.b0 b0Var;
        i.b0 b0Var2;
        List list;
        Set set;
        List list2;
        i.b0 b0Var3;
        List list3;
        i.b0 b0Var4;
        List list4;
        i.b0 b0Var5;
        List list5;
        i.b0 b0Var6;
        Object obj2;
        c7.h hVar;
        i6.a aVar;
        u0 u0Var2;
        e6.u uVar;
        s1 s1Var = this;
        i6.a aVar2 = i6.a.f4956f;
        int i7 = s1Var.f3887o;
        int i8 = 2;
        int i9 = 1;
        if (i7 == 0) {
            d6.a.e(obj);
            u0Var = s1Var.f3888p;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int i10 = i.f0.f4740a;
            b0Var = new i.b0();
            i.b0 b0Var7 = new i.b0();
            i.b0 b0Var8 = new i.b0();
            i0.f fVar = new i0.f(b0Var8);
            b0Var2 = new i.b0();
            list = arrayList;
            set = fVar;
            list2 = arrayList2;
            b0Var3 = b0Var8;
            list3 = arrayList3;
            b0Var4 = b0Var7;
            synchronized (s1Var.f3889q.f3908b) {
            }
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i.b0 b0Var9 = s1Var.f3886n;
                set = s1Var.f3885m;
                b0Var3 = s1Var.f3884l;
                b0Var4 = s1Var.f3883k;
                b0Var = s1Var.f3882j;
                list3 = s1Var.f3881i;
                list2 = s1Var.f3880h;
                list = s1Var.f3879g;
                u0 u0Var3 = s1Var.f3888p;
                d6.a.e(obj);
                b0Var2 = b0Var9;
                u0Var = u0Var3;
                t1 t1Var = s1Var.f3889q;
                synchronized (t1Var.f3908b) {
                    try {
                        if (t1Var.f3917k.isEmpty()) {
                            aVar = aVar2;
                            u0Var2 = u0Var;
                            uVar = e6.u.f2826f;
                        } else {
                            Collection values = t1Var.f3917k.values();
                            r6.k.f(values, "<this>");
                            ArrayList arrayList4 = new ArrayList();
                            Iterator it = values.iterator();
                            while (it.hasNext()) {
                                e6.r.c0((Iterable) it.next(), arrayList4);
                            }
                            t1Var.f3917k.clear();
                            ArrayList arrayList5 = new ArrayList(arrayList4.size());
                            int size = arrayList4.size();
                            aVar = aVar2;
                            int i11 = 0;
                            while (i11 < size) {
                                int i12 = i11;
                                x0 x0Var = (x0) arrayList4.get(i11);
                                arrayList5.add(new d6.j(x0Var, t1Var.f3918l.get(x0Var)));
                                i11 = i12 + 1;
                                u0Var = u0Var;
                            }
                            u0Var2 = u0Var;
                            t1Var.f3918l.clear();
                            uVar = arrayList5;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                int size2 = uVar.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    d6.j jVar = (d6.j) uVar.get(i13);
                }
                i8 = 2;
                i9 = 1;
                s1Var = this;
                aVar2 = aVar;
                u0Var = u0Var2;
                synchronized (s1Var.f3889q.f3908b) {
                }
                t1 t1Var2 = s1Var.f3889q;
                s1Var.f3888p = u0Var;
                s1Var.f3879g = list;
                s1Var.f3880h = list2;
                s1Var.f3881i = list3;
                s1Var.f3882j = b0Var;
                s1Var.f3883k = b0Var4;
                s1Var.f3884l = b0Var3;
                s1Var.f3885m = set;
                s1Var.f3886n = b0Var2;
                s1Var.f3887o = i9;
                if (t1Var2.v()) {
                    obj2 = d6.z.f2639a;
                } else {
                    c7.h hVar2 = new c7.h(i9, a8.m.A(s1Var));
                    hVar2.r();
                    synchronized (t1Var2.f3908b) {
                        if (t1Var2.v()) {
                            hVar = hVar2;
                        } else {
                            t1Var2.f3921o = hVar2;
                            hVar = null;
                        }
                    }
                    if (hVar != null) {
                        hVar.resumeWith(d6.z.f2639a);
                    }
                    obj2 = hVar2.q();
                    if (obj2 != i6.a.f4956f) {
                        obj2 = d6.z.f2639a;
                    }
                }
                if (obj2 != aVar2) {
                    List list6 = list;
                    b0Var5 = b0Var;
                    b0Var6 = b0Var2;
                    list4 = list3;
                    list5 = list6;
                    Set set2 = set;
                    i.b0 b0Var10 = b0Var4;
                    i.b0 b0Var11 = b0Var3;
                    if (t1.q(s1Var.f3889q)) {
                        List list7 = list4;
                        b0Var2 = b0Var6;
                        b0Var = b0Var5;
                        list = list5;
                        list3 = list7;
                        s1Var = this;
                        b0Var3 = b0Var11;
                        b0Var4 = b0Var10;
                        set = set2;
                        synchronized (s1Var.f3889q.f3908b) {
                        }
                    } else {
                        r1 r1Var = new r1(s1Var.f3889q, b0Var11, b0Var6, list5, list2, b0Var5, list4, b0Var10, set2);
                        s1Var.f3888p = u0Var;
                        s1Var.f3879g = list5;
                        s1Var.f3880h = list2;
                        s1Var.f3881i = list4;
                        s1Var.f3882j = b0Var5;
                        s1Var.f3883k = b0Var10;
                        s1Var.f3884l = b0Var11;
                        s1Var.f3885m = set2;
                        s1Var.f3886n = b0Var6;
                        s1Var.f3887o = i8;
                        if (u0Var.t(r1Var, s1Var) != aVar2) {
                            List list8 = list4;
                            b0Var2 = b0Var6;
                            b0Var = b0Var5;
                            list = list5;
                            list3 = list8;
                            b0Var3 = b0Var11;
                            b0Var4 = b0Var10;
                            set = set2;
                            t1 t1Var3 = s1Var.f3889q;
                            synchronized (t1Var3.f3908b) {
                            }
                        }
                    }
                }
                return aVar2;
            }
            i.b0 b0Var12 = s1Var.f3886n;
            set = s1Var.f3885m;
            b0Var3 = s1Var.f3884l;
            b0Var4 = s1Var.f3883k;
            i.b0 b0Var13 = s1Var.f3882j;
            List list9 = s1Var.f3881i;
            list2 = s1Var.f3880h;
            List list10 = s1Var.f3879g;
            u0 u0Var4 = s1Var.f3888p;
            d6.a.e(obj);
            b0Var6 = b0Var12;
            u0Var = u0Var4;
            list4 = list9;
            list5 = list10;
            b0Var5 = b0Var13;
            Set set22 = set;
            i.b0 b0Var102 = b0Var4;
            i.b0 b0Var112 = b0Var3;
            if (t1.q(s1Var.f3889q)) {
            }
        }
    }
}
