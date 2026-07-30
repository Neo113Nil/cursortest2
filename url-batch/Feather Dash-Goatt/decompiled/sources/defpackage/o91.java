package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class o91 implements dc, su0, tm1, tw {
    public static o91 i;
    public Object d;
    public Object e;
    public Object g;
    public Object h;

    public o91(Typeface typeface, sl0 sl0Var) {
        int i2;
        int i3;
        int i4;
        int i5;
        this.h = typeface;
        this.d = sl0Var;
        this.g = new tl0(1024);
        int a = sl0Var.a(6);
        if (a != 0) {
            int i6 = a + sl0Var.d;
            i2 = ((ByteBuffer) sl0Var.h).getInt(((ByteBuffer) sl0Var.h).getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        this.e = new char[i2 * 2];
        int a2 = sl0Var.a(6);
        if (a2 != 0) {
            int i7 = a2 + sl0Var.d;
            i3 = ((ByteBuffer) sl0Var.h).getInt(((ByteBuffer) sl0Var.h).getInt(i7) + i7);
        } else {
            i3 = 0;
        }
        for (int i8 = 0; i8 < i3; i8++) {
            yj1 yj1Var = new yj1(this, i8);
            rl0 b = yj1Var.b();
            int a3 = b.a(4);
            Character.toChars(a3 != 0 ? ((ByteBuffer) b.h).getInt(a3 + b.d) : 0, (char[]) this.e, i8 * 2);
            rl0 b2 = yj1Var.b();
            int a4 = b2.a(16);
            if (a4 != 0) {
                int i9 = a4 + b2.d;
                i4 = ((ByteBuffer) b2.h).getInt(((ByteBuffer) b2.h).getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            if (!(i4 > 0)) {
                dd0.e("invalid metadata codepoint length");
                throw null;
            }
            tl0 tl0Var = (tl0) this.g;
            rl0 b3 = yj1Var.b();
            int a5 = b3.a(16);
            if (a5 != 0) {
                int i10 = a5 + b3.d;
                i5 = ((ByteBuffer) b3.h).getInt(((ByteBuffer) b3.h).getInt(i10) + i10);
            } else {
                i5 = 0;
            }
            tl0Var.a(yj1Var, 0, i5 - 1);
        }
    }

    public static synchronized o91 i() {
        o91 o91Var;
        synchronized (o91.class) {
            try {
                if (i == null) {
                    o91 o91Var2 = new o91();
                    o91Var2.d = null;
                    o91Var2.e = null;
                    o91Var2.g = null;
                    o91Var2.h = new ArrayDeque();
                    i = o91Var2;
                }
                o91Var = i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return o91Var;
    }

    @Override // defpackage.qm1
    public long b(v7 v7Var, v7 v7Var2, v7 v7Var3) {
        int b = v7Var.b();
        long j = 0;
        for (int i2 = 0; i2 < b; i2++) {
            j = Math.max(j, ((nq0) this.d).q(i2).e(v7Var.a(i2), v7Var2.a(i2), v7Var3.a(i2)));
        }
        return j;
    }

    @Override // defpackage.su0
    public boolean c() {
        ArrayList arrayList = (ArrayList) this.h;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((ru0) arrayList.get(i2)).a.c()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.su0
    public float d() {
        return ((Number) ((ae0) this.g).getValue()).floatValue();
    }

    public void e(mx0 mx0Var, boolean z) {
        xx0 xx0Var = (xx0) this.h;
        List list = mx0Var.a;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((qx0) list.get(i2)).b()) {
                r(mx0Var);
                return;
            }
        }
        uc0 uc0Var = (uc0) this.d;
        if (uc0Var == null) {
            dd0.j("layoutCoordinates not set");
            return;
        }
        gb0.N(mx0Var, uc0Var.M(0L), new t4(this, 5, xx0Var), false);
        if (((vx0) this.e) == vx0.e) {
            if (z) {
                int size2 = list.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    ((qx0) list.get(i3)).a();
                }
            }
            e30 e30Var = mx0Var.b;
            if (e30Var != null) {
                e30Var.a = !xx0Var.c;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
    
        if (r8 == r2) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        if (r8 == r2) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object f(fn fnVar) {
        so soVar;
        int i2;
        ko koVar;
        mp mpVar = (mp) this.h;
        if (fnVar instanceof so) {
            soVar = (so) fnVar;
            int i3 = soVar.k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                soVar.k = i3 - Integer.MIN_VALUE;
                Object obj = soVar.i;
                tn tnVar = tn.d;
                i2 = soVar.k;
                if (i2 != 0) {
                    ca0.v(obj);
                    List list = (List) this.g;
                    if (list == null || list.isEmpty()) {
                        soVar.h = this;
                        soVar.k = 1;
                        obj = mp.f(mpVar, false, soVar);
                    } else {
                        ua1 g = mpVar.g();
                        vo voVar = new vo(mpVar, this, null);
                        soVar.h = this;
                        soVar.k = 2;
                        obj = g.b(voVar, soVar);
                    }
                    return tnVar;
                }
                if (i2 == 1) {
                    this = soVar.h;
                    ca0.v(obj);
                    koVar = (ko) obj;
                } else {
                    if (i2 != 2) {
                        dd0.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = soVar.h;
                    ca0.v(obj);
                    koVar = (ko) obj;
                }
                ((mp) this.h).l.B(koVar);
                return Unit.a;
            }
        }
        soVar = new so(this, fnVar);
        Object obj2 = soVar.i;
        tn tnVar2 = tn.d;
        i2 = soVar.k;
        if (i2 != 0) {
        }
        ((mp) this.h).l.B(koVar);
        return Unit.a;
    }

    @Override // defpackage.o01
    public Object get() {
        return new o91((Executor) ((o01) this.d).get(), (b51) ((o01) this.e).get(), (i8) ((i8) this.g).get(), (b51) ((o01) this.h).get());
    }

    @Override // defpackage.qm1
    public v7 h(long j, v7 v7Var, v7 v7Var2, v7 v7Var3) {
        if (((v7) this.g) == null) {
            this.g = v7Var3.c();
        }
        v7 v7Var4 = (v7) this.g;
        if (v7Var4 == null) {
            Intrinsics.e("velocityVector");
            throw null;
        }
        int b = v7Var4.b();
        int i2 = 0;
        while (true) {
            v7 v7Var5 = (v7) this.g;
            if (i2 >= b) {
                if (v7Var5 != null) {
                    return v7Var5;
                }
                Intrinsics.e("velocityVector");
                throw null;
            }
            if (v7Var5 == null) {
                Intrinsics.e("velocityVector");
                throw null;
            }
            v7Var5.e(((nq0) this.d).q(i2).c(j, v7Var.a(i2), v7Var2.a(i2), v7Var3.a(i2)), i2);
            i2++;
        }
    }

    public v7 j(long j, v7 v7Var, v7 v7Var2) {
        if (((v7) this.g) == null) {
            this.g = v7Var.c();
        }
        v7 v7Var3 = (v7) this.g;
        if (v7Var3 == null) {
            Intrinsics.e("velocityVector");
            throw null;
        }
        int b = v7Var3.b();
        int i2 = 0;
        while (true) {
            v7 v7Var4 = (v7) this.g;
            if (i2 >= b) {
                if (v7Var4 != null) {
                    return v7Var4;
                }
                Intrinsics.e("velocityVector");
                throw null;
            }
            if (v7Var4 == null) {
                Intrinsics.e("velocityVector");
                throw null;
            }
            nq0 nq0Var = (nq0) this.d;
            v7Var.getClass();
            long j2 = j / 1000000;
            uz a = ((vz) nq0Var.e).a(v7Var2.a(i2));
            long j3 = a.c;
            v7Var4.e((((Math.signum(a.a) * n5.a(j3 > 0 ? j2 / j3 : 1.0f).b) * a.b) / j3) * 1000.0f, i2);
            i2++;
        }
    }

    public tn1 k(yg ygVar, String str) {
        tn1 tn1Var;
        boolean isInstance;
        tn1 a;
        synchronized (((tc1) this.h)) {
            try {
                mj0 mj0Var = (mj0) this.d;
                mj0Var.getClass();
                tn1Var = (tn1) mj0Var.a.get(str);
                xg xgVar = yg.b;
                Class cls = ygVar.a;
                xgVar.getClass();
                cls.getClass();
                Map map = yg.c;
                map.getClass();
                Integer num = (Integer) map.get(cls);
                if (num != null) {
                    isInstance = tj1.c(num.intValue(), tn1Var);
                } else {
                    if (cls.isPrimitive()) {
                        cls = y90.s(a21.a(cls));
                    }
                    isInstance = cls.isInstance(tn1Var);
                }
                if (isInstance) {
                    wn1 wn1Var = (wn1) this.e;
                    if (wn1Var instanceof f61) {
                        f61 f61Var = (f61) wn1Var;
                        tn1Var.getClass();
                        xg0 xg0Var = f61Var.d;
                        if (xg0Var != null) {
                            c51 c51Var = f61Var.e;
                            c51Var.getClass();
                            xa0.i(tn1Var, c51Var, xg0Var);
                        }
                    }
                    tn1Var.getClass();
                } else {
                    bn0 bn0Var = new bn0((bo) this.g);
                    bn0Var.a.put(s40.k, str);
                    wn1 wn1Var2 = (wn1) this.e;
                    wn1Var2.getClass();
                    try {
                        try {
                            a = wn1Var2.c(ygVar, bn0Var);
                        } catch (AbstractMethodError unused) {
                            Class cls2 = ygVar.a;
                            cls2.getClass();
                            a = wn1Var2.a(cls2);
                        }
                    } catch (AbstractMethodError unused2) {
                        Class cls3 = ygVar.a;
                        cls3.getClass();
                        a = wn1Var2.b(cls3, bn0Var);
                    }
                    tn1Var = a;
                    mj0 mj0Var2 = (mj0) this.d;
                    mj0Var2.getClass();
                    tn1Var.getClass();
                    tn1 tn1Var2 = (tn1) mj0Var2.a.put(str, tn1Var);
                    if (tn1Var2 != null) {
                        tn1Var2.b();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return tn1Var;
    }

    @Override // defpackage.qm1
    public v7 m(long j, v7 v7Var, v7 v7Var2, v7 v7Var3) {
        if (((v7) this.e) == null) {
            this.e = v7Var.c();
        }
        v7 v7Var4 = (v7) this.e;
        if (v7Var4 == null) {
            Intrinsics.e("valueVector");
            throw null;
        }
        int b = v7Var4.b();
        int i2 = 0;
        while (true) {
            v7 v7Var5 = (v7) this.e;
            if (i2 >= b) {
                if (v7Var5 != null) {
                    return v7Var5;
                }
                Intrinsics.e("valueVector");
                throw null;
            }
            if (v7Var5 == null) {
                Intrinsics.e("valueVector");
                throw null;
            }
            v7Var5.e(((nq0) this.d).q(i2).b(j, v7Var.a(i2), v7Var2.a(i2), v7Var3.a(i2)), i2);
            i2++;
        }
    }

    @Override // defpackage.qm1
    public v7 n(v7 v7Var, v7 v7Var2, v7 v7Var3) {
        if (((v7) this.h) == null) {
            this.h = v7Var3.c();
        }
        v7 v7Var4 = (v7) this.h;
        if (v7Var4 == null) {
            Intrinsics.e("endVelocityVector");
            throw null;
        }
        int b = v7Var4.b();
        int i2 = 0;
        while (true) {
            v7 v7Var5 = (v7) this.h;
            if (i2 >= b) {
                if (v7Var5 != null) {
                    return v7Var5;
                }
                Intrinsics.e("endVelocityVector");
                throw null;
            }
            if (v7Var5 == null) {
                Intrinsics.e("endVelocityVector");
                throw null;
            }
            v7Var5.e(((nq0) this.d).q(i2).j(v7Var.a(i2), v7Var2.a(i2), v7Var3.a(i2)), i2);
            i2++;
        }
    }

    public boolean o(Context context) {
        if (((Boolean) this.g) == null) {
            this.g = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!((Boolean) this.e).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.g).booleanValue();
    }

    public boolean p(Context context) {
        if (((Boolean) this.e) == null) {
            this.e = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!((Boolean) this.e).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.e).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x005f, code lost:
    
        if (r8.e(r0) == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006c A[Catch: all -> 0x0072, TRY_LEAVE, TryCatch #0 {all -> 0x0072, blocks: (B:25:0x0062, B:27:0x006c, B:30:0x0077), top: B:24:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0077 A[Catch: all -> 0x0072, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0072, blocks: (B:25:0x0062, B:27:0x006c, B:30:0x0077), top: B:24:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object q(fn fnVar) {
        v41 v41Var;
        int i2;
        oo0 oo0Var;
        Throwable th;
        oo0 oo0Var2;
        o91 o91Var;
        try {
            if (fnVar instanceof v41) {
                v41Var = (v41) fnVar;
                int i3 = v41Var.l;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    v41Var.l = i3 - Integer.MIN_VALUE;
                    Object obj = v41Var.j;
                    tn tnVar = tn.d;
                    i2 = v41Var.l;
                    if (i2 != 0) {
                        ca0.v(obj);
                        if (((ej) this.e).W()) {
                            return Unit.a;
                        }
                        oo0Var = (oo0) this.d;
                        v41Var.h = this;
                        v41Var.i = oo0Var;
                        v41Var.l = 1;
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                dd0.j("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            oo0Var2 = v41Var.i;
                            o91Var = v41Var.h;
                            try {
                                ca0.v(obj);
                                ej ejVar = (ej) o91Var.e;
                                Unit unit = Unit.a;
                                ejVar.Y(unit);
                                oo0Var2.h(null);
                                return unit;
                            } catch (Throwable th2) {
                                th = th2;
                                oo0Var2.h(null);
                                throw th;
                            }
                        }
                        oo0 oo0Var3 = v41Var.i;
                        o91 o91Var2 = v41Var.h;
                        ca0.v(obj);
                        oo0Var = oo0Var3;
                        this = o91Var2;
                    }
                    if (!((ej) this.e).W()) {
                        Unit unit2 = Unit.a;
                        oo0Var.h(null);
                        return unit2;
                    }
                    v41Var.h = this;
                    v41Var.i = oo0Var;
                    v41Var.l = 2;
                    if (this.f(v41Var) != tnVar) {
                        o91Var = this;
                        oo0Var2 = oo0Var;
                        ej ejVar2 = (ej) o91Var.e;
                        Unit unit3 = Unit.a;
                        ejVar2.Y(unit3);
                        oo0Var2.h(null);
                        return unit3;
                    }
                    return tnVar;
                }
            }
            if (!((ej) this.e).W()) {
            }
        } catch (Throwable th3) {
            oo0 oo0Var4 = oo0Var;
            th = th3;
            oo0Var2 = oo0Var4;
            oo0Var2.h(null);
            throw th;
        }
        v41Var = new v41(this, fnVar);
        Object obj2 = v41Var.j;
        tn tnVar2 = tn.d;
        i2 = v41Var.l;
        if (i2 != 0) {
        }
    }

    public void r(mx0 mx0Var) {
        if (((vx0) this.e) == vx0.e) {
            uc0 uc0Var = (uc0) this.d;
            if (uc0Var == null) {
                dd0.j("layoutCoordinates not set");
                return;
            }
            gb0.N(mx0Var, uc0Var.M(0L), new wx0((xx0) this.h, 1), true);
        }
        this.e = vx0.g;
    }

    public /* synthetic */ o91(Object obj, Object obj2, Object obj3, Object obj4) {
        this.d = obj;
        this.e = obj2;
        this.g = obj3;
        this.h = obj4;
    }

    public /* synthetic */ o91(Object obj) {
        this.d = obj;
    }

    public o91(zz zzVar) {
        this(new nq0(18, zzVar));
    }
}
