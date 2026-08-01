package a3;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.view.View;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.R;
import com.appsflyer.attribution.RequestError;
import com.manholeroboramprush.cardestroy.KitchenDoor;
import d2.p2;
import d2.r1;
import d2.s1;
import ge.k0;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import je.h0;
import je.j0;
import kotlin.Unit;
import kotlin.collections.i0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import n0.l2;
import n0.o1;
import n0.z1;
import v.c1;
import x3.l0;
import x3.m0;
import x3.o0;
import x3.t0;
import x3.u0;
import z4.f0;
import z4.n0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class t extends nd.i implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f265d;

    /* renamed from: e, reason: collision with root package name */
    public int f266e;

    /* renamed from: i, reason: collision with root package name */
    public Object f267i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f268r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public t(Function2 function2, x3.c cVar, ld.a aVar) {
        super(2, aVar);
        this.f265d = 24;
        this.f267i = (nd.i) function2;
        this.f268r = cVar;
    }

    /* JADX WARN: Type inference failed for: r0v45, types: [kotlin.jvm.functions.Function2, nd.i] */
    /* JADX WARN: Type inference failed for: r0v8, types: [kotlin.jvm.functions.Function2, nd.i] */
    @Override // nd.a
    public final ld.a create(Object obj, ld.a aVar) {
        switch (this.f265d) {
            case 0:
                return new t((u) this.f267i, (j1.c) this.f268r, aVar, 0);
            case 1:
                return new t((Function2) this.f267i, (b5.b0) this.f268r, aVar, 1);
            case 2:
                return new t((Function2) this.f267i, (wd.b0) this.f268r, aVar, 2);
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                return new t((Function2) this.f267i, (b5.o) this.f268r, aVar);
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                return new t((j0) this.f267i, (s1) this.f268r, aVar, 4);
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                return new t((z1) this.f267i, (View) this.f268r, aVar, 5);
            case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return new t((e.h) this.f268r, aVar, 6);
            case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return new t((z4.u) this.f267i, (a1.d) this.f268r, aVar, 7);
            case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                return new t((KitchenDoor) this.f267i, (n4.x) this.f268r, aVar, 8);
            case 9:
                t tVar = new t((i0.a) this.f268r, aVar, 9);
                tVar.f267i = obj;
                return tVar;
            case 10:
                return new t((b7.h) this.f267i, (v.f) this.f268r, aVar, 10);
            case RequestError.STOP_TRACKING /* 11 */:
                t tVar2 = new t((ke.e) this.f268r, aVar, 11);
                tVar2.f267i = obj;
                return tVar2;
            case 12:
                t tVar3 = new t((ke.g) this.f268r, aVar, 12);
                tVar3.f267i = obj;
                return tVar3;
            case 13:
                t tVar4 = new t((je.f) this.f268r, aVar, 13);
                tVar4.f267i = obj;
                return tVar4;
            case 14:
                return new t((je.e) this.f267i, (o1) this.f268r, aVar, 14);
            case 15:
                return new t((n8.c) this.f267i, (Function1) this.f268r, aVar, 15);
            case 16:
                return new t((n8.c) this.f267i, (b4.c) this.f268r, aVar, 16);
            case 17:
                return new t((q9.a) this.f267i, (Context) this.f268r, aVar, 17);
            case 18:
                return new t((t9.c) this.f268r, aVar, 18);
            case 19:
                return new t((w4.a) this.f267i, (Uri) this.f268r, aVar, 19);
            case 20:
                return new t((z.f) this.f267i, (z.c) this.f268r, aVar, 20);
            case 21:
                return new t((z.f) this.f267i, (z.d) this.f268r, aVar, 21);
            case 22:
                t tVar5 = new t((List) this.f268r, aVar, 22);
                tVar5.f267i = obj;
                return tVar5;
            case 23:
                return new t((x3.z) this.f267i, (m0) this.f268r, aVar, 23);
            case 24:
                return new t((Function2) this.f267i, (x3.c) this.f268r, aVar);
            case 25:
                t tVar6 = new t((x3.z) this.f268r, aVar, 25);
                tVar6.f267i = obj;
                return tVar6;
            case 26:
                return new t((com.google.firebase.messaging.v) this.f268r, aVar, 26);
            case 27:
                t tVar7 = new t((Function1) this.f268r, aVar, 27);
                tVar7.f267i = obj;
                return tVar7;
            default:
                return new t((n0) this.f267i, (Function0) this.f268r, aVar, 28);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f265d) {
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                ((t) create((ge.x) obj, (ld.a) obj2)).invokeSuspend(Unit.f5554a);
                break;
        }
        return ((t) create((ge.x) obj, (ld.a) obj2)).invokeSuspend(Unit.f5554a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x019f, code lost:
    
        if (x3.z.e(r0, r14) == r2) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x030b, code lost:
    
        if (r8.i(t9.e.f9331a, r14) == r9) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0300, code lost:
    
        if (ge.a0.i(1052, r14) == r9) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x02b9, code lost:
    
        if (r8.i(t9.d.f9330a, r14) == r9) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x02ae, code lost:
    
        if (ge.a0.i(2000, r14) == r9) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x02e8, code lost:
    
        if (r15 == r9) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00bf, code lost:
    
        if (r15 != r0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ca, code lost:
    
        if (r1.invoke(r15, r14) == r0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Type inference failed for: r15v128, types: [kotlin.jvm.functions.Function2, nd.i] */
    /* JADX WARN: Type inference failed for: r15v131, types: [kotlin.jvm.functions.Function2, nd.i] */
    /* JADX WARN: Type inference failed for: r15v135, types: [kotlin.jvm.functions.Function2, nd.i] */
    /* JADX WARN: Type inference failed for: r15v15, types: [kotlin.jvm.functions.Function2, nd.i] */
    /* JADX WARN: Type inference failed for: r15v43, types: [hd.g, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00ca -> B:39:0x00ce). Please report as a decompilation issue!!! */
    @Override // nd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        wd.z zVar;
        t tVar;
        int i3 = this.f265d;
        int i10 = 3;
        int i11 = 0;
        int i12 = 2;
        Object obj2 = this.f268r;
        int i13 = 1;
        ld.a aVar = null;
        switch (i3) {
            case 0:
                md.a aVar2 = md.a.f6622d;
                int i14 = this.f266e;
                if (i14 == 0) {
                    cf.c.M(obj);
                    u uVar = (u) this.f267i;
                    a2.a0 a0Var = new a2.a0(i12, (j1.c) obj2);
                    this.f266e = 1;
                    if (g8.b.p(uVar, a0Var) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i14 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cf.c.M(obj);
                }
                return Unit.f5554a;
            case 1:
                md.a aVar3 = md.a.f6622d;
                int i15 = this.f266e;
                if (i15 == 0) {
                    cf.c.M(obj);
                    this.f266e = 1;
                    Object invoke = ((Function2) this.f267i).invoke((b5.b0) obj2, this);
                    return invoke == aVar3 ? aVar3 : invoke;
                }
                if (i15 == 1) {
                    cf.c.M(obj);
                    return obj;
                }
                i0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                md.a aVar4 = md.a.f6622d;
                int i16 = this.f266e;
                if (i16 != 0) {
                    if (i16 == 1) {
                        cf.c.M(obj);
                        return obj;
                    }
                    i0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cf.c.M(obj);
                Function2 function2 = (Function2) this.f267i;
                Object obj3 = ((wd.b0) obj2).f10141d;
                this.f266e = 1;
                Object invoke2 = function2.invoke(obj3, this);
                return invoke2 == aVar4 ? aVar4 : invoke2;
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                md.a aVar5 = md.a.f6622d;
                int i17 = this.f266e;
                if (i17 == 0) {
                    cf.c.M(obj);
                    this.f266e = 1;
                    Object invoke3 = ((nd.i) this.f267i).invoke((b5.o) obj2, this);
                    return invoke3 == aVar5 ? aVar5 : invoke3;
                }
                if (i17 == 1) {
                    cf.c.M(obj);
                    return obj;
                }
                i0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                md.a aVar6 = md.a.f6622d;
                int i18 = this.f266e;
                if (i18 == 0) {
                    cf.c.M(obj);
                    j0 j0Var = (j0) this.f267i;
                    r1 r1Var = new r1(i11, (s1) obj2);
                    this.f266e = 1;
                    if (j0Var.c(r1Var, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i18 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cf.c.M(obj);
                }
                throw new hd.d();
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                z1 z1Var = (z1) this.f267i;
                View view = (View) obj2;
                Object obj4 = md.a.f6622d;
                int i19 = this.f266e;
                try {
                    if (i19 == 0) {
                        cf.c.M(obj);
                        this.f266e = 1;
                        Object i20 = je.b0.i(z1Var.f6893u, new h0(i12, true ? 1 : 0, aVar), this);
                        if ((i20 == obj4 ? i20 : Unit.f5554a) == obj4) {
                            return obj4;
                        }
                    } else {
                        if (i19 != 1) {
                            i0.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        cf.c.M(obj);
                    }
                    return Unit.f5554a;
                } finally {
                    if (p2.a(view) == z1Var) {
                        view.setTag(R.id.androidx_compose_ui_view_composition_context, null);
                    }
                }
            case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                e.h hVar = (e.h) obj2;
                md.a aVar7 = md.a.f6622d;
                int i21 = this.f266e;
                if (i21 == 0) {
                    cf.c.M(obj);
                    if (hVar.d()) {
                        wd.z zVar2 = new wd.z();
                        Function2 function22 = hVar.f3748d;
                        ie.c cVar = hVar.f3749e;
                        cVar.getClass();
                        je.j jVar = new je.j(new je.b(cVar, true ? 1 : 0), new e.g(zVar2, null));
                        this.f267i = zVar2;
                        this.f266e = 1;
                        if (function22.invoke(jVar, this) == aVar7) {
                            return aVar7;
                        }
                        zVar = zVar2;
                    }
                    return Unit.f5554a;
                }
                if (i21 != 1) {
                    i0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                zVar = (wd.z) this.f267i;
                cf.c.M(obj);
                if (!zVar.f10164d) {
                    i0.l("You must collect the progress flow");
                    return null;
                }
                return Unit.f5554a;
            case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                z4.u uVar2 = (z4.u) this.f267i;
                md.a aVar8 = md.a.f6622d;
                int i22 = this.f266e;
                if (i22 != 0) {
                    if (i22 == 1) {
                        cf.c.M(obj);
                        return obj;
                    }
                    i0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cf.c.M(obj);
                e5.a aVar9 = new e5.a((uVar2.p() && uVar2.q()) ? false : true, uVar2, null, (a1.d) obj2);
                this.f266e = 1;
                Object v10 = uVar2.v(false, aVar9, this);
                return v10 == aVar8 ? aVar8 : v10;
            case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                md.a aVar10 = md.a.f6622d;
                int i23 = this.f266e;
                if (i23 == 0) {
                    cf.c.M(obj);
                    KitchenDoor kitchenDoor = (KitchenDoor) this.f267i;
                    int i24 = KitchenDoor.J;
                    je.b bVar = ((f9.a) kitchenDoor.I.getValue()).f4207d;
                    r1 r1Var2 = new r1(i13, (n4.x) obj2);
                    this.f266e = 1;
                    if (bVar.c(r1Var2, this) == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i23 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cf.c.M(obj);
                }
                return Unit.f5554a;
            case 9:
                md.a aVar11 = md.a.f6622d;
                int i25 = this.f266e;
                if (i25 != 0) {
                    if (i25 == 1) {
                        cf.c.M(obj);
                        return Unit.f5554a;
                    }
                    i0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cf.c.M(obj);
                ge.x xVar = (ge.x) this.f267i;
                i0.a aVar12 = (i0.a) obj2;
                je.a0 a0Var2 = aVar12.C.f10688a;
                i0.g gVar = new i0.g(i11, aVar12, xVar);
                this.f266e = 1;
                a0Var2.getClass();
                je.a0.k(a0Var2, gVar, this);
                return aVar11;
            case 10:
                md.a aVar13 = md.a.f6622d;
                int i26 = this.f266e;
                if (i26 == 0) {
                    cf.c.M(obj);
                    this.f266e = 1;
                    if (v.b.a((v.b) ((b7.h) this.f267i).f1294c, new Float(0.0f), (v.f) obj2, this) == aVar13) {
                        return aVar13;
                    }
                } else {
                    if (i26 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cf.c.M(obj);
                }
                return Unit.f5554a;
            case RequestError.STOP_TRACKING /* 11 */:
                ie.n nVar = (ie.n) this.f267i;
                md.a aVar14 = md.a.f6622d;
                int i27 = this.f266e;
                if (i27 == 0) {
                    cf.c.M(obj);
                    this.f267i = null;
                    this.f266e = 1;
                    if (((ke.e) obj2).d(nVar, this) == aVar14) {
                        return aVar14;
                    }
                } else {
                    if (i27 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cf.c.M(obj);
                }
                return Unit.f5554a;
            case 12:
                je.f fVar = (je.f) this.f267i;
                md.a aVar15 = md.a.f6622d;
                int i28 = this.f266e;
                if (i28 == 0) {
                    cf.c.M(obj);
                    this.f267i = null;
                    this.f266e = 1;
                    if (((ke.g) obj2).h(fVar, this) == aVar15) {
                        return aVar15;
                    }
                } else {
                    if (i28 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cf.c.M(obj);
                }
                return Unit.f5554a;
            case 13:
                Object obj5 = this.f267i;
                md.a aVar16 = md.a.f6622d;
                int i29 = this.f266e;
                if (i29 == 0) {
                    cf.c.M(obj);
                    this.f267i = null;
                    this.f266e = 1;
                    if (((je.f) obj2).b(obj5, this) == aVar16) {
                        return aVar16;
                    }
                } else {
                    if (i29 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cf.c.M(obj);
                }
                return Unit.f5554a;
            case 14:
                md.a aVar17 = md.a.f6622d;
                int i30 = this.f266e;
                if (i30 == 0) {
                    cf.c.M(obj);
                    je.e eVar = (je.e) this.f267i;
                    l2 l2Var = new l2((o1) obj2, 1);
                    this.f266e = 1;
                    if (eVar.c(l2Var, this) == aVar17) {
                        return aVar17;
                    }
                } else {
                    if (i30 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cf.c.M(obj);
                }
                return Unit.f5554a;
            case 15:
                n8.c cVar2 = (n8.c) this.f267i;
                ThreadLocal threadLocal = cVar2.f7184b;
                md.a aVar18 = md.a.f6622d;
                int i31 = this.f266e;
                try {
                    if (i31 == 0) {
                        cf.c.M(obj);
                        Object obj6 = threadLocal.get();
                        Boolean bool = Boolean.TRUE;
                        if (Intrinsics.a(obj6, bool)) {
                            i0.l("Don't call JavaDataStorage.edit() from within an existing edit() callback.\nThis causes deadlocks, and is generally indicative of a code smell.\nInstead, either pass around the initial `MutablePreferences` instance, or don't do everything in a single callback. ");
                            return null;
                        }
                        threadLocal.set(bool);
                        d9.c cVar3 = cVar2.f7185c;
                        e5.d dVar = new e5.d((Function1) obj2, (ld.a) null);
                        this.f266e = 1;
                        obj = cVar3.c(new b4.b(dVar, null, 1), this);
                        if (obj == aVar18) {
                            return aVar18;
                        }
                    } else {
                        if (i31 != 1) {
                            i0.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        cf.c.M(obj);
                    }
                    return (b4.a) obj;
                } finally {
                    threadLocal.set(Boolean.FALSE);
                }
            case 16:
                md.a aVar19 = md.a.f6622d;
                int i32 = this.f266e;
                if (i32 == 0) {
                    cf.c.M(obj);
                    je.e h10 = ((x3.f) ((n8.c) this.f267i).f7185c.f3701e).h();
                    this.f266e = 1;
                    obj = je.b0.j(h10, this);
                    if (obj == aVar19) {
                        return aVar19;
                    }
                } else {
                    if (i32 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cf.c.M(obj);
                }
                b4.a aVar20 = (b4.a) obj;
                if (aVar20 != null) {
                    b4.c cVar4 = (b4.c) obj2;
                    cVar4.getClass();
                    Object obj7 = aVar20.f1092a.get(cVar4);
                    if (obj7 instanceof byte[]) {
                        byte[] bArr = (byte[]) obj7;
                        obj7 = Arrays.copyOf(bArr, bArr.length);
                    }
                    Object obj8 = obj7;
                    if (obj8 != null) {
                        return obj8;
                    }
                }
                return -1L;
            case 17:
                md.a aVar21 = md.a.f6622d;
                int i33 = this.f266e;
                if (i33 == 0) {
                    cf.c.M(obj);
                    je.b bVar2 = ((q9.a) this.f267i).f8061d;
                    r1 r1Var3 = new r1(i10, (Context) obj2);
                    this.f266e = 1;
                    if (bVar2.c(r1Var3, this) == aVar21) {
                        return aVar21;
                    }
                } else {
                    if (i33 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cf.c.M(obj);
                }
                return Unit.f5554a;
            case 18:
                t9.c cVar5 = (t9.c) obj2;
                i9.d dVar2 = cVar5.f9327c;
                ie.c cVar6 = cVar5.f9328d;
                i9.c cVar7 = cVar5.f9326b;
                md.a aVar22 = md.a.f6622d;
                int i34 = this.f266e;
                if (i34 == 0) {
                    cf.c.M(obj);
                    if (((SharedPreferences) cVar7.f4676b.getValue()).getString("dsvjnvsd", null) == null) {
                        cVar7.getClass();
                        String appsFlyerUID = AppsFlyerLib.getInstance().getAppsFlyerUID(cVar7.f4675a);
                        if (appsFlyerUID == null) {
                            appsFlyerUID = "";
                        }
                        dVar2.getClass();
                        dVar2.f4677a = appsFlyerUID;
                        this.f267i = dVar2;
                        this.f266e = 3;
                        cVar7.getClass();
                        ne.e eVar2 = k0.f4372a;
                        obj = ge.a0.B(ne.d.f7275i, new i9.b(cVar7, aVar, i11), this);
                        break;
                    } else {
                        this.f266e = 1;
                        break;
                    }
                    return aVar22;
                }
                if (i34 == 1) {
                    cf.c.M(obj);
                    this.f266e = 2;
                    break;
                } else {
                    if (i34 == 2) {
                        cf.c.M(obj);
                        return Unit.f5554a;
                    }
                    if (i34 == 3) {
                        dVar2 = (i9.d) this.f267i;
                        cf.c.M(obj);
                        String str = (String) obj;
                        String str2 = str != null ? str : "";
                        dVar2.getClass();
                        dVar2.f4678b = str2;
                        this.f267i = null;
                        this.f266e = 4;
                        break;
                    } else if (i34 == 4) {
                        cf.c.M(obj);
                        this.f266e = 5;
                        break;
                    } else {
                        if (i34 != 5) {
                            i0.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        cf.c.M(obj);
                    }
                }
                return Unit.f5554a;
            case 19:
                md.a aVar23 = md.a.f6622d;
                int i35 = this.f266e;
                if (i35 == 0) {
                    cf.c.M(obj);
                    this.f266e = 1;
                    if (((w4.a) this.f267i).f10080a.i((Uri) obj2, this) == aVar23) {
                        return aVar23;
                    }
                } else {
                    if (i35 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cf.c.M(obj);
                }
                return Unit.f5554a;
            case 20:
                md.a aVar24 = md.a.f6622d;
                int i36 = this.f266e;
                if (i36 == 0) {
                    cf.c.M(obj);
                    this.f266e = 1;
                    if (((z.f) this.f267i).a((z.c) obj2, this) == aVar24) {
                        return aVar24;
                    }
                } else {
                    if (i36 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cf.c.M(obj);
                }
                return Unit.f5554a;
            case 21:
                md.a aVar25 = md.a.f6622d;
                int i37 = this.f266e;
                if (i37 == 0) {
                    cf.c.M(obj);
                    this.f266e = 1;
                    if (((z.f) this.f267i).a((z.d) obj2, this) == aVar25) {
                        return aVar25;
                    }
                } else {
                    if (i37 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cf.c.M(obj);
                }
                return Unit.f5554a;
            case 22:
                md.a aVar26 = md.a.f6622d;
                int i38 = this.f266e;
                if (i38 == 0) {
                    cf.c.M(obj);
                    x3.j jVar2 = (x3.j) this.f267i;
                    this.f266e = 1;
                    if (f0.a((List) obj2, jVar2, this) == aVar26) {
                        return aVar26;
                    }
                } else {
                    if (i38 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cf.c.M(obj);
                }
                return Unit.f5554a;
            case 23:
                m0 m0Var = (m0) obj2;
                x3.z zVar3 = (x3.z) this.f267i;
                md.a aVar27 = md.a.f6622d;
                int i39 = this.f266e;
                if (i39 != 0) {
                    if (i39 != 1) {
                        if (i39 == 2) {
                            cf.c.M(obj);
                            ?? r15 = m0Var.f10408a;
                            CoroutineContext coroutineContext = m0Var.f10411d;
                            this.f266e = 3;
                            Object b10 = zVar3.i().b(new x3.w(zVar3, coroutineContext, (Function2) r15, (ld.a) null), this);
                            if (b10 != aVar27) {
                                return b10;
                            }
                        } else if (i39 != 3) {
                            i0.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    cf.c.M(obj);
                    return obj;
                }
                cf.c.M(obj);
                t0 a9 = zVar3.f10502v.a();
                if (a9 instanceof x3.c) {
                    ?? r152 = m0Var.f10408a;
                    CoroutineContext coroutineContext2 = m0Var.f10411d;
                    this.f266e = 1;
                    Object b11 = zVar3.i().b(new x3.w(zVar3, coroutineContext2, (Function2) r152, (ld.a) null), this);
                    if (b11 != aVar27) {
                        return b11;
                    }
                } else {
                    if (!(a9 instanceof o0) && !(a9 instanceof u0)) {
                        if (a9 instanceof l0) {
                            throw ((l0) a9).f10404b;
                        }
                        if (a9 instanceof x3.n0) {
                            i0.l("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                        } else {
                            a2.r.p();
                        }
                        return null;
                    }
                    if (a9 != m0Var.f10410c) {
                        throw ((o0) a9).f10419b;
                    }
                    this.f266e = 2;
                    break;
                }
                return aVar27;
            case 24:
                md.a aVar28 = md.a.f6622d;
                int i40 = this.f266e;
                if (i40 != 0) {
                    if (i40 == 1) {
                        cf.c.M(obj);
                        return obj;
                    }
                    i0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cf.c.M(obj);
                ?? r153 = (nd.i) this.f267i;
                Object obj9 = ((x3.c) obj2).f10341b;
                this.f266e = 1;
                Object invoke4 = r153.invoke(obj9, this);
                return invoke4 == aVar28 ? aVar28 : invoke4;
            case 25:
                md.a aVar29 = md.a.f6622d;
                int i41 = this.f266e;
                if (i41 == 0) {
                    cf.c.M(obj);
                    m0 m0Var2 = (m0) this.f267i;
                    this.f266e = 1;
                    if (x3.z.b((x3.z) obj2, m0Var2, this) == aVar29) {
                        return aVar29;
                    }
                } else {
                    if (i41 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cf.c.M(obj);
                }
                return Unit.f5554a;
            case 26:
                com.google.firebase.messaging.v vVar = (com.google.firebase.messaging.v) obj2;
                md.a aVar30 = md.a.f6622d;
                int i42 = this.f266e;
                if (i42 == 0) {
                    cf.c.M(obj);
                    if (((AtomicInteger) ((c1) vVar.f3178r).f9767e).get() <= 0) {
                        i0.l("Check failed.");
                        return null;
                    }
                    ge.a0.j(((ge.x) vVar.f3175d).h());
                    tVar = (t) vVar.f3176e;
                    ie.c cVar8 = (ie.c) vVar.f3177i;
                    this.f267i = tVar;
                    this.f266e = 1;
                    obj = cVar8.c(this);
                } else if (i42 == 1) {
                    tVar = (t) this.f267i;
                    cf.c.M(obj);
                    this.f267i = null;
                    this.f266e = 2;
                    break;
                } else {
                    if (i42 != 2) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cf.c.M(obj);
                    if (((AtomicInteger) ((c1) vVar.f3178r).f9767e).decrementAndGet() == 0) {
                        return Unit.f5554a;
                    }
                    ge.a0.j(((ge.x) vVar.f3175d).h());
                    tVar = (t) vVar.f3176e;
                    ie.c cVar82 = (ie.c) vVar.f3177i;
                    this.f267i = tVar;
                    this.f266e = 1;
                    obj = cVar82.c(this);
                    break;
                }
            case 27:
                md.a aVar31 = md.a.f6622d;
                int i43 = this.f266e;
                if (i43 == 0) {
                    cf.c.M(obj);
                    if (((ge.x) this.f267i).h().m(z4.c0.f10729e) != null) {
                        this.f266e = 1;
                        Object invoke5 = ((Function1) obj2).invoke(this);
                        return invoke5 == aVar31 ? aVar31 : invoke5;
                    }
                    i0.l("Expected a TransactionElement in the CoroutineContext but none was found.");
                } else {
                    if (i43 == 1) {
                        cf.c.M(obj);
                        return obj;
                    }
                    i0.l("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            default:
                Function0 function0 = (Function0) obj2;
                md.a aVar32 = md.a.f6622d;
                int i44 = this.f266e;
                try {
                    if (i44 == 0) {
                        cf.c.M(obj);
                        n0 n0Var = (n0) this.f267i;
                        this.f266e = 1;
                        obj = n0.b(n0Var, this);
                        if (obj == aVar32) {
                            return aVar32;
                        }
                    } else {
                        if (i44 != 1) {
                            i0.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        cf.c.M(obj);
                    }
                    function0.invoke();
                    return Unit.f5554a;
                } catch (Throwable th) {
                    function0.invoke();
                    throw th;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(Object obj, ld.a aVar, int i3) {
        super(2, aVar);
        this.f265d = i3;
        this.f268r = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public t(Function2 function2, b5.o oVar, ld.a aVar) {
        super(2, aVar);
        this.f265d = 3;
        this.f267i = (nd.i) function2;
        this.f268r = oVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(Object obj, Object obj2, ld.a aVar, int i3) {
        super(2, aVar);
        this.f265d = i3;
        this.f267i = obj;
        this.f268r = obj2;
    }
}
