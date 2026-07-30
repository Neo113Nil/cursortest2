package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import com.appsflyer.internal.l;
import com.google.android.gms.common.internal.a;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public class s40 implements c00, zc, tw, li, qr0, lu, n31 {
    public static volatile s40 g;
    public static volatile s40 i;
    public final /* synthetic */ int d;
    public Object e;
    public static final Object h = new Object();
    public static final j40 j = new j40(1);
    public static final tc1 k = new tc1(5);

    public s40(int i2) {
        gl0 gl0Var;
        this.d = i2;
        switch (i2) {
            case 1:
                this.e = new ConcurrentHashMap();
                break;
            case 2:
                i01 i01Var = i01.c;
                try {
                    gl0Var = (gl0) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused) {
                    gl0Var = j;
                }
                gl0[] gl0VarArr = {j40.b, gl0Var};
                sj0 sj0Var = new sj0();
                sj0Var.a = gl0VarArr;
                Charset charset = ia0.a;
                this.e = sj0Var;
                break;
            case 4:
                this.e = new p1(this);
                break;
            case 9:
                this.e = new AtomicInteger(0);
                break;
            case 12:
                this.e = new j3();
                break;
            case 17:
                this.e = m90.c(wk1.b);
                break;
            case 18:
                break;
            case 21:
                this.e = new fc1(op.d);
                break;
            case 28:
                rj0 rj0Var = new rj0();
                this.e = rj0Var;
                if (!rj0Var.e) {
                    if (rj0Var.g) {
                        dy0.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    rj0Var.c();
                    rj0Var.g = true;
                    break;
                }
                break;
            default:
                this.e = new HashSet();
                break;
        }
    }

    public static s40 s() {
        if (i == null) {
            synchronized (h) {
                try {
                    if (i == null) {
                        i = new s40(1);
                    }
                } finally {
                }
            }
        }
        s40 s40Var = i;
        y90.i(s40Var);
        return s40Var;
    }

    public static af0 y(s40 s40Var, int i2) {
        wf0 wf0Var = (wf0) s40Var.e;
        ib1 n = ca0.n();
        Function1 e = n != null ? n.e() : null;
        ib1 s = ca0.s(n);
        try {
            rf0 rf0Var = (rf0) wf0Var.f.getValue();
            ca0.u(n, s, e);
            bf0 bf0Var = wf0Var.p;
            long j2 = rf0Var.j;
            boolean z = wf0Var.d;
            q1 q1Var = new q1(i2, rf0Var);
            nz nzVar = bf0Var.c;
            if (nzVar == null) {
                return j50.v;
            }
            i8 i8Var = bf0Var.b;
            uy0 uy0Var = (uy0) nzVar.d;
            boolean z2 = uy0Var instanceof h6;
            ty0 ty0Var = new ty0(nzVar, i2, i8Var, q1Var);
            ty0Var.h = new mm(j2);
            if (!z2) {
                uy0Var.a(ty0Var);
            } else if (z) {
                h6 h6Var = (h6) uy0Var;
                h6Var.e.add(new fz0(1, ty0Var));
                if (!h6Var.g) {
                    h6Var.g = true;
                    h6Var.d.post(h6Var);
                }
            } else {
                h6 h6Var2 = (h6) uy0Var;
                h6Var2.e.add(new fz0(0, ty0Var));
                if (!h6Var2.g) {
                    h6Var2.g = true;
                    h6Var2.d.post(h6Var2);
                }
            }
            Trace.setCounter("compose:lazy:schedule_prefetch:index", i2);
            return ty0Var;
        } catch (Throwable th) {
            ca0.u(n, s, e);
            throw th;
        }
    }

    public void A(float f, float f2) {
        ((i8) this.e).g().h(f, f2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        if (r5.a > r1.a) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void B(xd1 xd1Var) {
        Object value;
        xd1 xd1Var2;
        xd1Var.getClass();
        be1 be1Var = (be1) this.e;
        do {
            value = be1Var.getValue();
            xd1Var2 = (xd1) value;
            if (!(xd1Var2 instanceof d11 ? true : Intrinsics.a(xd1Var2, wk1.b))) {
                if (!(xd1Var2 instanceof ko)) {
                    if (!(xd1Var2 instanceof zy)) {
                        l.a();
                        return;
                    }
                }
            }
            xd1Var2 = xd1Var;
        } while (!be1Var.h(value, xd1Var2));
    }

    public void C(Context context, ServiceConnection serviceConnection) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.e;
        if ((serviceConnection instanceof su1) || !concurrentHashMap.containsKey(serviceConnection)) {
            try {
                context.unbindService(serviceConnection);
            } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
            }
        } else {
            try {
                try {
                    context.unbindService((ServiceConnection) concurrentHashMap.get(serviceConnection));
                } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused2) {
                }
            } finally {
                concurrentHashMap.remove(serviceConnection);
            }
        }
    }

    @Override // defpackage.lu, defpackage.p7
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public wm1 a(c51 c51Var) {
        int[] iArr;
        Object[] objArr;
        int[] iArr2;
        Object[] objArr2;
        int i2;
        jc0 jc0Var = (jc0) this.e;
        en0 en0Var = jc0Var.b;
        dn0 dn0Var = new dn0(en0Var.e + 2);
        en0 en0Var2 = new en0(en0Var.e);
        int[] iArr3 = en0Var.b;
        Object[] objArr3 = en0Var.c;
        long[] jArr = en0Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j2 = jArr[i3];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8;
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((255 & j2) < 128) {
                            int i7 = (i3 << 3) + i6;
                            int i8 = iArr3[i7];
                            ic0 ic0Var = (ic0) objArr3[i7];
                            dn0Var.a(i8);
                            i2 = i4;
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            en0Var2.h(i8, new vm1((v7) ((Function1) c51Var.e).invoke(ic0Var.a), ic0Var.b));
                        } else {
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            i2 = i4;
                        }
                        j2 >>= i2;
                        i6++;
                        i4 = i2;
                        iArr3 = iArr2;
                        objArr3 = objArr2;
                    }
                    iArr = iArr3;
                    objArr = objArr3;
                    if (i5 != i4) {
                        break;
                    }
                } else {
                    iArr = iArr3;
                    objArr = objArr3;
                }
                if (i3 == length) {
                    break;
                }
                i3++;
                iArr3 = iArr;
                objArr3 = objArr;
            }
        }
        if (!en0Var.a(0)) {
            int i9 = dn0Var.b;
            if (i9 < 0) {
                throw new IndexOutOfBoundsException("Index must be between 0 and size");
            }
            dn0Var.b(i9 + 1);
            int[] iArr4 = dn0Var.a;
            int i10 = dn0Var.b;
            if (i10 != 0) {
                w9.a(iArr4, iArr4, 1, 0, i10);
            }
            iArr4[0] = 0;
            dn0Var.b++;
        }
        if (!en0Var.a(jc0Var.a)) {
            dn0Var.a(jc0Var.a);
        }
        int i11 = dn0Var.b;
        if (i11 != 0) {
            int[] iArr5 = dn0Var.a;
            iArr5.getClass();
            Arrays.sort(iArr5, 0, i11);
        }
        return new wm1(dn0Var, en0Var2, jc0Var.a, qu.a);
    }

    public void E(int i2, Object obj, u61 u61Var) {
        wh whVar = (wh) this.e;
        whVar.B(i2, 3);
        u61Var.g((d0) obj, whVar.a);
        whVar.B(i2, 4);
    }

    public boolean F(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i2, Executor executor) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.e;
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((nq1.a(context).d.getPackageManager().getApplicationInfo(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (serviceConnection instanceof su1) {
            if (executor == null) {
                executor = null;
            }
            return executor != null ? context.bindService(intent, i2, executor, serviceConnection) : context.bindService(intent, serviceConnection, i2);
        }
        ServiceConnection serviceConnection2 = (ServiceConnection) concurrentHashMap.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
        }
        if (executor == null) {
            executor = null;
        }
        try {
            boolean bindService = executor != null ? context.bindService(intent, i2, executor, serviceConnection) : context.bindService(intent, serviceConnection, i2);
            if (bindService) {
                return bindService;
            }
            concurrentHashMap.remove(serviceConnection, serviceConnection);
            return false;
        } catch (Throwable th) {
            concurrentHashMap.remove(serviceConnection, serviceConnection);
            throw th;
        }
    }

    @Override // defpackage.li
    public long d() {
        jr jrVar = (jr) this.e;
        long d = jrVar.x.d();
        if (d != 16) {
            return d;
        }
        y31 y31Var = (y31) mo.k(jrVar, b41.a);
        if (y31Var != null) {
            long j2 = y31Var.a;
            if (j2 != 16) {
                return j2;
            }
        }
        return ((hi) mo.k(jrVar, rm.a)).a;
    }

    @Override // defpackage.c00
    public Object f(d00 d00Var, dn dnVar) {
        switch (this.d) {
            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                Object f = ((c00) this.e).f(new m8(d00Var, 0), dnVar);
                if (f != tn.d) {
                    break;
                }
                break;
            default:
                Object f2 = ((yw) this.e).f(new m8(d00Var, 1), dnVar);
                if (f2 != tn.d) {
                    break;
                }
                break;
        }
        return Unit.a;
    }

    @Override // defpackage.zc
    public void g(fm fmVar) {
        boolean z = fmVar.e == 0;
        a aVar = (a) this.e;
        if (z) {
            aVar.l(null, aVar.w);
            return;
        }
        nq0 nq0Var = aVar.o;
        if (nq0Var != null) {
            ((f50) nq0Var.e).b(fmVar);
        }
    }

    @Override // defpackage.o01
    public Object get() {
        return new i8((Context) ((l90) this.e).d, (Object) new me1(5), (Object) new me1(3), 7);
    }

    @Override // defpackage.qr0
    public /* synthetic */ void h(Object obj) {
        ((qz) this.e).invoke(obj);
    }

    public void k(jd0 jd0Var) {
        if (!jd0Var.F()) {
            o80.b("DepthSortedSet.add called on an unattached node");
        }
        ((fc1) this.e).add(jd0Var);
    }

    public o1 m(int i2) {
        return null;
    }

    public void n() {
        ((ml) this.e).getClass();
    }

    public o1 o(int i2) {
        return null;
    }

    public tn1 p(yg ygVar) {
        String str;
        String a;
        o91 o91Var = (o91) this.e;
        xg xgVar = yg.b;
        Class cls = ygVar.a;
        xgVar.getClass();
        cls.getClass();
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            str = null;
        } else if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            str = (!componentType.isPrimitive() || (a = xg.a(componentType.getName())) == null) ? null : a.concat("Array");
            if (str == null) {
                str = "kotlin.Array";
            }
        } else {
            str = xg.a(cls.getName());
            if (str == null) {
                str = cls.getCanonicalName();
            }
        }
        if (str != null) {
            return o91Var.k(ygVar, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(str));
        }
        dd0.e("Local and anonymous classes can not be ViewModels");
        return null;
    }

    public xd1 q() {
        return (xd1) ((be1) this.e).getValue();
    }

    public yd1 r() {
        yu a = yu.a();
        if (a.b() == 1) {
            return new k70(true);
        }
        av0 F = gb0.F(Boolean.FALSE);
        eq eqVar = new eq(F, this);
        a.a.writeLock().lock();
        try {
            if (a.c != 1 && a.c != 2) {
                a.b.add(eqVar);
                a.a.writeLock().unlock();
                return F;
            }
            a.d.post(new mf(Arrays.asList(eqVar), a.c, (Throwable) null));
            a.a.writeLock().unlock();
            return F;
        } catch (Throwable th) {
            a.a.writeLock().unlock();
            throw th;
        }
    }

    public void t(float f, float f2, float f3, float f4) {
        i8 i8Var = (i8) this.e;
        xf g2 = i8Var.g();
        float intBitsToFloat = Float.intBitsToFloat((int) (i8Var.i() >> 32)) - (f3 + f);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (i8Var.i() & 4294967295L)) - (f4 + f2);
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
        if (Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) < 0.0f || Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) < 0.0f) {
            n80.a("Width and height must be greater than or equal to zero");
        }
        i8Var.v(floatToRawIntBits);
        g2.h(f, f2);
    }

    public String toString() {
        switch (this.d) {
            case 21:
                return ((fc1) this.e).toString();
            default:
                return super.toString();
        }
    }

    public boolean u(int i2, int i3, Bundle bundle) {
        return false;
    }

    public boolean v(jd0 jd0Var) {
        if (!jd0Var.F()) {
            o80.b("DepthSortedSet.remove called on an unattached node");
        }
        return ((fc1) this.e).remove(jd0Var);
    }

    public void w(float f, long j2) {
        xf g2 = ((i8) this.e).g();
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        g2.h(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3));
        g2.c(f);
        g2.h(-Float.intBitsToFloat(i2), -Float.intBitsToFloat(i3));
    }

    public void x(float f, float f2, long j2) {
        xf g2 = ((i8) this.e).g();
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        g2.h(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3));
        g2.b(f, f2);
        g2.h(-Float.intBitsToFloat(i2), -Float.intBitsToFloat(i3));
    }

    public void z(Exception exc) {
        hr hrVar = (hr) this.e;
        if (s0.j.t(hrVar, null, new n0(exc))) {
            s0.c(hrVar);
        }
    }

    public s40(wh whVar) {
        this.d = 13;
        ia0.a(whVar, "output");
        this.e = whVar;
        whVar.a = this;
    }

    public /* synthetic */ s40(int i2, Object obj) {
        this.d = i2;
        this.e = obj;
    }

    public s40(boolean z) {
        this.d = 8;
        this.e = new AtomicBoolean(z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002b, code lost:
    
        if (r7 == r3) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0048 A[LOOP:1: B:14:0x0046->B:15:0x0048, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public s40(int[] iArr, float[] fArr, float[][] fArr2) {
        int i2;
        int length;
        int i3;
        this.d = 7;
        int i4 = 1;
        int length2 = fArr.length - 1;
        c9[][] c9VarArr = new c9[length2][];
        int i5 = 1;
        int i6 = 1;
        int i7 = 0;
        while (i7 < length2) {
            int i8 = iArr[i7];
            int i9 = 3;
            if (i8 != 0) {
                if (i8 != i4) {
                    if (i8 != 2) {
                        if (i8 != 3) {
                            i9 = 4;
                            if (i8 != 4) {
                                i9 = 5;
                                if (i8 != 5) {
                                    i2 = i6;
                                    float[] fArr3 = fArr2[i7];
                                    int i10 = i7 + 1;
                                    float[] fArr4 = fArr2[i10];
                                    float f = fArr[i7];
                                    float f2 = fArr[i10];
                                    length = (fArr3.length % 2) + (fArr3.length / 2);
                                    c9[] c9VarArr2 = new c9[length];
                                    i3 = 0;
                                    while (i3 < length) {
                                        int i11 = i3 * 2;
                                        int i12 = i3;
                                        int i13 = i11 + 1;
                                        c9VarArr2[i12] = new c9(i2, f, f2, fArr3[i11], fArr3[i13], fArr4[i11], fArr4[i13]);
                                        i3 = i12 + 1;
                                    }
                                    c9VarArr[i7] = c9VarArr2;
                                    i7 = i10;
                                    i6 = i2;
                                    i4 = 1;
                                }
                            }
                        }
                    }
                    i5 = 2;
                    i2 = i5;
                    float[] fArr32 = fArr2[i7];
                    int i102 = i7 + 1;
                    float[] fArr42 = fArr2[i102];
                    float f3 = fArr[i7];
                    float f22 = fArr[i102];
                    length = (fArr32.length % 2) + (fArr32.length / 2);
                    c9[] c9VarArr22 = new c9[length];
                    i3 = 0;
                    while (i3 < length) {
                    }
                    c9VarArr[i7] = c9VarArr22;
                    i7 = i102;
                    i6 = i2;
                    i4 = 1;
                }
                i5 = i4;
                i2 = i5;
                float[] fArr322 = fArr2[i7];
                int i1022 = i7 + 1;
                float[] fArr422 = fArr2[i1022];
                float f32 = fArr[i7];
                float f222 = fArr[i1022];
                length = (fArr322.length % 2) + (fArr322.length / 2);
                c9[] c9VarArr222 = new c9[length];
                i3 = 0;
                while (i3 < length) {
                }
                c9VarArr[i7] = c9VarArr222;
                i7 = i1022;
                i6 = i2;
                i4 = 1;
            }
            i2 = i9;
            float[] fArr3222 = fArr2[i7];
            int i10222 = i7 + 1;
            float[] fArr4222 = fArr2[i10222];
            float f322 = fArr[i7];
            float f2222 = fArr[i10222];
            length = (fArr3222.length % 2) + (fArr3222.length / 2);
            c9[] c9VarArr2222 = new c9[length];
            i3 = 0;
            while (i3 < length) {
            }
            c9VarArr[i7] = c9VarArr2222;
            i7 = i10222;
            i6 = i2;
            i4 = 1;
        }
        this.e = c9VarArr;
    }

    public s40(mj0 mj0Var, wn1 wn1Var, bo boVar) {
        this.d = 3;
        mj0Var.getClass();
        wn1Var.getClass();
        boVar.getClass();
        mj0Var.getClass();
        wn1Var.getClass();
        boVar.getClass();
        o91 o91Var = new o91();
        o91Var.d = mj0Var;
        o91Var.e = wn1Var;
        o91Var.g = boVar;
        o91Var.h = new tc1(1);
        this.e = o91Var;
    }

    public s40(e4 e4Var) {
        this.d = 29;
        this.e = new CopyOnWriteArrayList();
        new HashMap();
    }

    public void l(int i2, o1 o1Var, String str, Bundle bundle) {
    }
}
