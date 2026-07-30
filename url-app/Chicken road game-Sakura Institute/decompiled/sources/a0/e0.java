package a0;

import android.view.View;
import com.android.installreferrer.R;
import com.android.installreferrer.api.InstallReferrerClient;
import d0.i1;
import g0.t1;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import s1.o1;
import s1.p1;
import s1.s1;
import s1.z2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e0 extends j6.i implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f51g;

    /* renamed from: h, reason: collision with root package name */
    public int f52h;

    /* renamed from: i, reason: collision with root package name */
    public Object f53i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f54j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(Object obj, h6.d dVar, int i7) {
        super(2, dVar);
        this.f51g = i7;
        this.f54j = obj;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [j6.i, q6.e] */
    @Override // j6.a
    public final h6.d create(Object obj, h6.d dVar) {
        switch (this.f51g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                e0 e0Var = new e0((q6.c) this.f54j, dVar, 0);
                e0Var.f53i = obj;
                return e0Var;
            case 1:
                e0 e0Var2 = new e0((w.n0) this.f54j, dVar, 1);
                e0Var2.f53i = obj;
                return e0Var2;
            case 2:
                e0 e0Var3 = new e0((q6.e) this.f54j, dVar, 2);
                e0Var3.f53i = obj;
                return e0Var3;
            case 3:
                e0 e0Var4 = new e0((c0.q) this.f54j, dVar, 3);
                e0Var4.f53i = obj;
                return e0Var4;
            case 4:
                return new e0((c0.w) this.f53i, (l.k) this.f54j, dVar, 4);
            case 5:
                return new e0((p.i) this.f53i, (q0.q) this.f54j, dVar, 5);
            case 6:
                return new e0((i1) this.f53i, (d0.f1) this.f54j, dVar, 6);
            case j3.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return new e0((i1) this.f53i, (p.h) this.f54j, dVar, 7);
            case 8:
                e0 e0Var5 = new e0((List) this.f54j, dVar, 8);
                e0Var5.f53i = obj;
                return e0Var5;
            case q.c.f7259c /* 9 */:
                return new e0((q6.e) this.f53i, (g3.c) this.f54j, dVar);
            case q.c.f7261e /* 10 */:
                return new e0((g3.k) this.f54j, dVar, 10);
            case 11:
                return new e0((g4.j0) this.f53i, (String) this.f54j, dVar, 11);
            case 12:
                e0 e0Var6 = new e0((g7.e) this.f54j, dVar, 12);
                e0Var6.f53i = obj;
                return e0Var6;
            case 13:
                e0 e0Var7 = new e0((g7.f) this.f54j, dVar, 13);
                e0Var7.f53i = obj;
                return e0Var7;
            case 14:
                e0 e0Var8 = new e0((f7.g) this.f54j, dVar, 14);
                e0Var8.f53i = obj;
                return e0Var8;
            case q.c.f7263g /* 15 */:
                return new e0((p.j) this.f53i, (p.f) this.f54j, dVar, 15);
            case 16:
                return new e0((p.j) this.f53i, (p.g) this.f54j, dVar, 16);
            case 17:
                e0 e0Var9 = new e0((m.q) this.f54j, dVar, 17);
                e0Var9.f53i = obj;
                return e0Var9;
            case 18:
                e0 e0Var10 = new e0((m.f) this.f54j, dVar, 18);
                e0Var10.f53i = obj;
                return e0Var10;
            case 19:
                e0 e0Var11 = new e0((n.j) this.f54j, dVar, 19);
                e0Var11.f53i = obj;
                return e0Var11;
            case 20:
                e0 e0Var12 = new e0((o.x0) this.f54j, dVar, 20);
                e0Var12.f53i = obj;
                return e0Var12;
            case 21:
                return new e0((p.i) this.f53i, (g0.z0) this.f54j, dVar, 21);
            case 22:
                e0 e0Var13 = new e0((p2.v) this.f54j, dVar, 22);
                e0Var13.f53i = obj;
                return e0Var13;
            case 23:
                e0 e0Var14 = new e0((s1.p0) this.f54j, dVar, 23);
                e0Var14.f53i = obj;
                return e0Var14;
            case 24:
                return new e0((t1) this.f53i, (View) this.f54j, dVar, 24);
            case 25:
                return new e0((f7.o0) this.f53i, (s1) this.f54j, dVar, 25);
            case 26:
                return new e0((t.g) this.f53i, (m.h) this.f54j, dVar, 26);
            case 27:
                return new e0((l1.d0) this.f53i, (x0) this.f54j, dVar, 27);
            case 28:
                e0 e0Var15 = new e0((x.a) this.f54j, dVar, 28);
                e0Var15.f53i = obj;
                return e0Var15;
            default:
                return new e0((x1.e) this.f53i, (Runnable) this.f54j, dVar, 29);
        }
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        switch (this.f51g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((e0) create((l1.d0) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
            case 1:
                return ((e0) create((l1.d0) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
            case 2:
                return ((e0) create((c7.x) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
            case 3:
                return ((e0) create((c7.x) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
            case 4:
                return ((e0) create((c7.x) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
            case 5:
                return ((e0) create((c7.x) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
            case 6:
                return ((e0) create((c7.x) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
            case j3.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((e0) create((c7.x) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
            case 8:
                return ((e0) create((g3.i) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
            case q.c.f7259c /* 9 */:
                return ((e0) create((c7.x) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
            case q.c.f7261e /* 10 */:
                return ((e0) create((c7.x) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
            case 11:
                return ((e0) create((c7.x) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
            case 12:
                return ((e0) create((e7.r) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
            case 13:
                return ((e0) create((f7.g) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
            case 14:
                return ((e0) create(obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
            case q.c.f7263g /* 15 */:
                return ((e0) create((c7.x) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
            case 16:
                return ((e0) create((c7.x) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
            case 17:
                return ((e0) create((l1.d0) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
            case 18:
                return ((e0) create((l1.d0) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
            case 19:
                return ((e0) create((l1.d0) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
            case 20:
                return ((e0) create((l1.d0) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
            case 21:
                return ((e0) create((c7.x) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
            case 22:
                return ((e0) create((c7.x) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
            case 23:
                ((e0) create((p1) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
                return i6.a.f4956f;
            case 24:
                return ((e0) create((c7.x) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
            case 25:
                ((e0) create((c7.x) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
                return i6.a.f4956f;
            case 26:
                return ((e0) create((c7.x) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
            case 27:
                return ((e0) create((c7.x) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
            case 28:
                return ((e0) create((l1.d0) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
            default:
                return ((e0) create((c7.x) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:282:0x0466, code lost:
    
        if (r1 != r10) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x0471, code lost:
    
        if (r0.d(r1, r21) == r10) goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x0483, code lost:
    
        return r10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x021d A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Type inference failed for: r0v55, types: [j6.i, q6.e] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:115:0x01f9 -> B:106:0x01fd). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:250:0x0471 -> B:245:0x0475). Please report as a decompilation issue!!! */
    @Override // j6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        g3.o oVar;
        c7.x xVar;
        int i7 = this.f51g;
        int i8 = 5;
        int i9 = 0;
        int i10 = 2;
        t.a aVar = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        d6.z zVar = d6.z.f2639a;
        Object obj3 = this.f54j;
        i6.a aVar2 = i6.a.f4956f;
        int i11 = 1;
        switch (i7) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i12 = this.f52h;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                    return zVar;
                }
                d6.a.e(obj);
                l1.d0 d0Var = (l1.d0) this.f53i;
                d0 d0Var2 = new d0((q6.c) obj3, objArr == true ? 1 : 0, i9);
                this.f52h = 1;
                return d0Var.A0(d0Var2, this) == aVar2 ? aVar2 : zVar;
            case 1:
                int i13 = this.f52h;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                    return zVar;
                }
                d6.a.e(obj);
                this.f52h = 1;
                Object d8 = c7.a0.d(new u3.l((l1.d0) this.f53i, (w.n0) obj3, null), this);
                if (d8 != aVar2) {
                    d8 = zVar;
                }
                return d8 == aVar2 ? aVar2 : zVar;
            case 2:
                int i14 = this.f52h;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                    return zVar;
                }
                d6.a.e(obj);
                c7.x xVar2 = (c7.x) this.f53i;
                this.f52h = 1;
                return ((q6.e) obj3).d(xVar2, this) == aVar2 ? aVar2 : zVar;
            case 3:
                c0.q qVar = (c0.q) obj3;
                int i15 = this.f52h;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                    return zVar;
                }
                d6.a.e(obj);
                c7.x xVar3 = (c7.x) this.f53i;
                f7.f a3 = qVar.f1495s.a();
                l0 l0Var = new l0(qVar, i10, xVar3);
                this.f52h = 1;
                return a3.b(l0Var, this) == aVar2 ? aVar2 : zVar;
            case 4:
                int i16 = this.f52h;
                if (i16 == 0) {
                    d6.a.e(obj);
                    this.f52h = 1;
                    return l.d.c((l.d) ((c0.w) this.f53i).f1515c, new Float(0.0f), (l.k) obj3, null, this, 12) == aVar2 ? aVar2 : zVar;
                }
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d6.a.e(obj);
                return zVar;
            case 5:
                int i17 = this.f52h;
                if (i17 != 0) {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                    return zVar;
                }
                d6.a.e(obj);
                f7.f a9 = ((p.i) this.f53i).a();
                d0.y yVar = new d0.y(i9, (q0.q) obj3);
                this.f52h = 1;
                return a9.b(yVar, this) == aVar2 ? aVar2 : zVar;
            case 6:
                int i18 = this.f52h;
                if (i18 != 0) {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                    return zVar;
                }
                d6.a.e(obj);
                i1 i1Var = (i1) this.f53i;
                d0.f1 f1Var = (d0.f1) obj3;
                float f9 = f1Var.f1947a;
                float f10 = f1Var.f1948b;
                float f11 = f1Var.f1950d;
                float f12 = f1Var.f1949c;
                this.f52h = 1;
                i1Var.f2035a = f9;
                i1Var.f2036b = f10;
                i1Var.f2037c = f11;
                i1Var.f2038d = f12;
                Object b9 = i1Var.b(this);
                if (b9 != aVar2) {
                    b9 = zVar;
                }
                return b9 == aVar2 ? aVar2 : zVar;
            case j3.i.DOUBLE_FIELD_NUMBER /* 7 */:
                int i19 = this.f52h;
                if (i19 == 0) {
                    d6.a.e(obj);
                    this.f52h = 1;
                    return ((i1) this.f53i).a((p.h) obj3, this) == aVar2 ? aVar2 : zVar;
                }
                if (i19 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d6.a.e(obj);
                return zVar;
            case 8:
                int i20 = this.f52h;
                if (i20 != 0) {
                    if (i20 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                    return zVar;
                }
                d6.a.e(obj);
                g3.i iVar = (g3.i) this.f53i;
                this.f52h = 1;
                return r4.a.m((List) obj3, iVar, this) == aVar2 ? aVar2 : zVar;
            case q.c.f7259c /* 9 */:
                int i21 = this.f52h;
                if (i21 != 0) {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                    return obj;
                }
                d6.a.e(obj);
                ?? r02 = (j6.i) this.f53i;
                Object obj4 = ((g3.c) obj3).f4101b;
                this.f52h = 1;
                Object d9 = r02.d(obj4, this);
                return d9 == aVar2 ? aVar2 : d9;
            case q.c.f7261e /* 10 */:
                g3.k kVar = (g3.k) obj3;
                int i22 = this.f52h;
                if (i22 == 0) {
                    d6.a.e(obj);
                    if (((AtomicInteger) ((b6.c) kVar.f4163j).f1394g).get() <= 0) {
                        throw new IllegalStateException("Check failed.");
                    }
                    c7.a0.f(((c7.x) kVar.f4160g).k());
                    oVar = (g3.o) kVar.f4161h;
                    e7.e eVar = (e7.e) kVar.f4162i;
                    this.f53i = oVar;
                    this.f52h = 1;
                    obj2 = eVar.a(this);
                } else if (i22 == 1) {
                    oVar = (g3.o) this.f53i;
                    d6.a.e(obj);
                    obj2 = obj;
                    this.f53i = null;
                    this.f52h = 2;
                    break;
                } else {
                    if (i22 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                    if (((AtomicInteger) ((b6.c) kVar.f4163j).f1394g).decrementAndGet() == 0) {
                        return zVar;
                    }
                    c7.a0.f(((c7.x) kVar.f4160g).k());
                    oVar = (g3.o) kVar.f4161h;
                    e7.e eVar2 = (e7.e) kVar.f4162i;
                    this.f53i = oVar;
                    this.f52h = 1;
                    obj2 = eVar2.a(this);
                    break;
                }
            case 11:
                int i23 = this.f52h;
                if (i23 == 0) {
                    d6.a.e(obj);
                    this.f52h = 1;
                    return ((g4.j0) this.f53i).f4322b.addGrocery((String) obj3, this) == aVar2 ? aVar2 : zVar;
                }
                if (i23 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d6.a.e(obj);
                return zVar;
            case 12:
                int i24 = this.f52h;
                if (i24 != 0) {
                    if (i24 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                    return zVar;
                }
                d6.a.e(obj);
                e7.r rVar = (e7.r) this.f53i;
                this.f52h = 1;
                return ((g7.e) obj3).d(rVar, this) == aVar2 ? aVar2 : zVar;
            case 13:
                int i25 = this.f52h;
                if (i25 != 0) {
                    if (i25 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                    return zVar;
                }
                d6.a.e(obj);
                f7.g gVar = (f7.g) this.f53i;
                this.f52h = 1;
                return ((g7.f) obj3).j(gVar, this) == aVar2 ? aVar2 : zVar;
            case 14:
                int i26 = this.f52h;
                if (i26 != 0) {
                    if (i26 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                    return zVar;
                }
                d6.a.e(obj);
                Object obj5 = this.f53i;
                this.f52h = 1;
                return ((f7.g) obj3).k(obj5, this) == aVar2 ? aVar2 : zVar;
            case q.c.f7263g /* 15 */:
                int i27 = this.f52h;
                if (i27 == 0) {
                    d6.a.e(obj);
                    this.f52h = 1;
                    return ((p.j) this.f53i).b((p.f) obj3, this) == aVar2 ? aVar2 : zVar;
                }
                if (i27 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d6.a.e(obj);
                return zVar;
            case 16:
                int i28 = this.f52h;
                if (i28 == 0) {
                    d6.a.e(obj);
                    this.f52h = 1;
                    return ((p.j) this.f53i).b((p.g) obj3, this) == aVar2 ? aVar2 : zVar;
                }
                if (i28 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d6.a.e(obj);
                return zVar;
            case 17:
                int i29 = this.f52h;
                if (i29 != 0) {
                    if (i29 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                    return zVar;
                }
                d6.a.e(obj);
                l1.d0 d0Var3 = (l1.d0) this.f53i;
                m.q qVar2 = (m.q) obj3;
                this.f52h = 1;
                m.p pVar = new m.p(qVar2, null);
                c1.a aVar3 = new c1.a(17, qVar2);
                o.f0 f0Var = o.p1.f6716a;
                Object d10 = c7.a0.d(new androidx.room.d(d0Var3, pVar, aVar3, new o.m0(d0Var3), null), this);
                if (d10 != aVar2) {
                    d10 = zVar;
                }
                if (d10 != aVar2) {
                    d10 = zVar;
                }
                return d10 == aVar2 ? aVar2 : zVar;
            case 18:
                int i30 = this.f52h;
                if (i30 != 0) {
                    if (i30 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                    return zVar;
                }
                d6.a.e(obj);
                l1.d0 d0Var4 = (l1.d0) this.f53i;
                d0 d0Var5 = new d0((m.f) obj3, objArr2 == true ? 1 : 0, i11);
                this.f52h = 1;
                return t6.a.r(d0Var4, d0Var5, this) == aVar2 ? aVar2 : zVar;
            case 19:
                int i31 = this.f52h;
                if (i31 != 0) {
                    if (i31 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                    return zVar;
                }
                d6.a.e(obj);
                l1.d0 d0Var6 = (l1.d0) this.f53i;
                c1.a aVar4 = new c1.a(19, (n.j) obj3);
                this.f52h = 1;
                Object r8 = t6.a.r(d0Var6, new d0(aVar4, objArr3 == true ? 1 : 0, i10), this);
                if (r8 != aVar2) {
                    r8 = zVar;
                }
                return r8 == aVar2 ? aVar2 : zVar;
            case 20:
                int i32 = this.f52h;
                if (i32 != 0) {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                    return zVar;
                }
                d6.a.e(obj);
                l1.d0 d0Var7 = (l1.d0) this.f53i;
                m1.c cVar = new m1.c();
                o.x0 x0Var = (o.x0) obj3;
                o.z zVar2 = new o.z(x0Var, d0Var7, new j0(x0Var, 4, cVar), new y(cVar, 26, x0Var), new o.a0(x0Var, i9), new o.a0(x0Var, i11), new d0.b0(cVar, 9, x0Var), null);
                this.f52h = 1;
                return c7.a0.d(zVar2, this) == aVar2 ? aVar2 : zVar;
            case 21:
                int i33 = this.f52h;
                if (i33 != 0) {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                    return zVar;
                }
                d6.a.e(obj);
                ArrayList arrayList = new ArrayList();
                f7.f a10 = ((p.i) this.f53i).a();
                l0 l0Var2 = new l0(arrayList, 7, (g0.z0) obj3);
                this.f52h = 1;
                return a10.b(l0Var2, this) == aVar2 ? aVar2 : zVar;
            case 22:
                int i34 = this.f52h;
                if (i34 == 0) {
                    d6.a.e(obj);
                    xVar = (c7.x) this.f53i;
                    if (c7.a0.n(xVar)) {
                    }
                } else {
                    if (i34 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    xVar = (c7.x) this.f53i;
                    d6.a.e(obj);
                    p2.v vVar = (p2.v) obj3;
                    int[] iArr = vVar.F;
                    int i35 = iArr[0];
                    int i36 = iArr[1];
                    vVar.f7181q.getLocationOnScreen(iArr);
                    if (i35 == iArr[0] || i36 != iArr[1]) {
                        vVar.j();
                    }
                    if (c7.a0.n(xVar)) {
                        p2.b bVar = p2.b.f7117i;
                        this.f53i = xVar;
                        this.f52h = 1;
                        if (getContext().u(o1.f8336f) != null) {
                            throw new ClassCastException();
                        }
                        if (g0.d.E(getContext()).t(bVar, this) == aVar2) {
                            return aVar2;
                        }
                        p2.v vVar2 = (p2.v) obj3;
                        int[] iArr2 = vVar2.F;
                        int i352 = iArr2[0];
                        int i362 = iArr2[1];
                        vVar2.f7181q.getLocationOnScreen(iArr2);
                        if (i352 == iArr2[0]) {
                        }
                        vVar2.j();
                        if (c7.a0.n(xVar)) {
                            return zVar;
                        }
                    }
                }
            case 23:
                int i37 = this.f52h;
                if (i37 == 0) {
                    d6.a.e(obj);
                    p1 p1Var = (p1) this.f53i;
                    s1.p0 p0Var = (s1.p0) obj3;
                    this.f53i = p1Var;
                    this.f52h = 1;
                    c7.h hVar = new c7.h(1, a8.m.A(this));
                    hVar.r();
                    g2.x xVar4 = p0Var.f8341g;
                    g2.r rVar2 = xVar4.f4068a;
                    rVar2.e();
                    xVar4.f4069b.set(new g2.c0(xVar4, rVar2));
                    hVar.t(new q.t0(p1Var, i8, p0Var));
                    if (hVar.q() == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i37 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                }
                throw new b4.c();
            case 24:
                t1 t1Var = (t1) this.f53i;
                View view = (View) obj3;
                int i38 = this.f52h;
                try {
                    if (i38 == 0) {
                        d6.a.e(obj);
                        this.f52h = 1;
                        Object k8 = f7.f0.k(t1Var.f3924r, new f7.m0(2, null, 1), this);
                        if (k8 != aVar2) {
                            k8 = zVar;
                        }
                        if (k8 == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i38 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        d6.a.e(obj);
                    }
                    if (z2.b(view) != t1Var) {
                        return zVar;
                    }
                    view.setTag(R.id.androidx_compose_ui_view_composition_context, null);
                    return zVar;
                } finally {
                    if (z2.b(view) == t1Var) {
                        view.setTag(R.id.androidx_compose_ui_view_composition_context, null);
                    }
                }
            case 25:
                int i39 = this.f52h;
                if (i39 == 0) {
                    d6.a.e(obj);
                    f7.o0 o0Var = (f7.o0) this.f53i;
                    d0.y yVar2 = new d0.y(i8, (s1) obj3);
                    this.f52h = 1;
                    if (o0Var.b(yVar2, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i39 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                }
                throw new b4.c();
            case 26:
                t.g gVar2 = (t.g) this.f53i;
                int i40 = this.f52h;
                if (i40 != 0) {
                    if (i40 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                    return zVar;
                }
                d6.a.e(obj);
                if (!gVar2.f8116r) {
                    return zVar;
                }
                if (gVar2.f8104f.f8116r && (aVar = (t.a) r1.f.j(gVar2, t.g.f8725u)) == null) {
                    aVar = new t.h(gVar2);
                }
                if (aVar == null) {
                    return zVar;
                }
                this.f52h = 1;
                return aVar.f0(r1.f.s(gVar2), (m.h) obj3, this) == aVar2 ? aVar2 : zVar;
            case 27:
                int i41 = this.f52h;
                if (i41 != 0) {
                    if (i41 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                    return zVar;
                }
                d6.a.e(obj);
                l1.d0 d0Var8 = (l1.d0) this.f53i;
                w.j jVar = new w.j((x0) obj3, i11);
                this.f52h = 1;
                Object d11 = c7.a0.d(new androidx.lifecycle.g0(d0Var8, o.p1.f6716a, jVar, (h6.d) null, 9), this);
                if (d11 != aVar2) {
                    d11 = zVar;
                }
                return d11 == aVar2 ? aVar2 : zVar;
            case 28:
                int i42 = this.f52h;
                if (i42 != 0) {
                    if (i42 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                    return zVar;
                }
                d6.a.e(obj);
                l1.d0 d0Var9 = (l1.d0) this.f53i;
                z zVar3 = new z((x.a) obj3, null);
                this.f52h = 1;
                return t6.a.r(d0Var9, zVar3, this) == aVar2 ? aVar2 : zVar;
            default:
                x1.e eVar3 = (x1.e) this.f53i;
                int i43 = this.f52h;
                if (i43 == 0) {
                    d6.a.e(obj);
                    b2.o oVar2 = eVar3.f9657e;
                    this.f52h = 1;
                    Object b10 = oVar2.b(0.0f - oVar2.f1290b, this);
                    if (b10 != aVar2) {
                        b10 = zVar;
                    }
                    if (b10 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                }
                eVar3.f9655c.f9666a.setValue(Boolean.FALSE);
                ((Runnable) obj3).run();
                return zVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(Object obj, Object obj2, h6.d dVar, int i7) {
        super(2, dVar);
        this.f51g = i7;
        this.f53i = obj;
        this.f54j = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e0(q6.e eVar, g3.c cVar, h6.d dVar) {
        super(2, dVar);
        this.f51g = 9;
        this.f53i = (j6.i) eVar;
        this.f54j = cVar;
    }
}
