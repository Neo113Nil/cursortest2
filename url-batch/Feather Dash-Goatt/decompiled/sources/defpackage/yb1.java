package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.provider.Settings;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class yb1 extends sf1 implements Function2 {
    public final /* synthetic */ int i = 1;
    public int j;
    public Object k;
    public Object l;
    public Object m;
    public Object n;
    public Object o;
    public /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yb1(ContentResolver contentResolver, Uri uri, up1 up1Var, we weVar, Context context, dn dnVar) {
        super(2, dnVar);
        this.m = contentResolver;
        this.n = uri;
        this.o = up1Var;
        this.p = weVar;
        this.q = context;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object b(Object obj, Object obj2) {
        d00 d00Var = (d00) obj;
        dn dnVar = (dn) obj2;
        switch (this.i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((yb1) h(dnVar, d00Var)).k(Unit.a);
                return tn.d;
            default:
                return ((yb1) h(dnVar, d00Var)).k(Unit.a);
        }
    }

    @Override // defpackage.yc
    public final dn h(dn dnVar, Object obj) {
        int i = this.i;
        Object obj2 = this.q;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                yb1 yb1Var = new yb1((i6) obj2, dnVar);
                yb1Var.p = obj;
                return yb1Var;
            default:
                yb1 yb1Var2 = new yb1((ContentResolver) this.m, (Uri) this.n, (up1) this.o, (we) this.p, (Context) obj2, dnVar);
                yb1Var2.k = obj;
                return yb1Var2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0090, code lost:
    
        if (r4.e(r9, r21) == r7) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0241, code lost:
    
        r8 = r22;
        r2 = 3;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006e A[Catch: all -> 0x002a, TRY_LEAVE, TryCatch #8 {all -> 0x002a, blocks: (B:9:0x0025, B:11:0x0059, B:17:0x0066, B:19:0x006e, B:27:0x003b, B:30:0x0050), top: B:4:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x025e A[LOOP:0: B:51:0x018b->B:59:0x025e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0202 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x018d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0090 -> B:11:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x0240 -> B:41:0x0241). Please report as a decompilation issue!!! */
    @Override // defpackage.yc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        m2 m2Var;
        d00 d00Var;
        wn0 wn0Var;
        Function1 lVar;
        fg i;
        ib1 u;
        ib1 j;
        Object obj2;
        Object obj3;
        Set set;
        boolean z;
        m2 m2Var2;
        long j2;
        Object q;
        char c;
        d00 d00Var2;
        ve veVar;
        Object obj4;
        boolean z2 = false;
        int i2 = 2;
        switch (this.i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                tn tnVar = tn.d;
                int i3 = this.j;
                try {
                    if (i3 == 0) {
                        ca0.v(obj);
                        d00Var = (d00) this.p;
                        wn0Var = new wn0();
                        lVar = new l(21, wn0Var);
                        i = yr1.i(Integer.MAX_VALUE, 6, null);
                        jl jlVar = new jl(9, i);
                        pb1.e(pb1.a);
                        synchronized (pb1.c) {
                            pb1.h = CollectionsKt.v(pb1.h, jlVar);
                        }
                        m2Var = new m2(2, jlVar);
                        u = pb1.j().u(lVar);
                        i6 i6Var = (i6) this.q;
                        try {
                            j = u.j();
                            try {
                                Object invoke = i6Var.invoke();
                                u.c();
                                this.p = d00Var;
                                this.l = wn0Var;
                                this.m = lVar;
                                this.n = i;
                                this.o = m2Var;
                                this.k = invoke;
                                this.j = 1;
                                if (d00Var.e(invoke, this) == tnVar) {
                                    return tnVar;
                                }
                                obj2 = invoke;
                            } finally {
                                ib1.q(j);
                            }
                        } finally {
                            u.c();
                        }
                    } else if (i3 == 1) {
                        obj2 = this.k;
                        m2Var = (m2) this.o;
                        i = (fg) this.n;
                        lVar = (Function1) this.m;
                        wn0Var = (wn0) this.l;
                        d00Var = (d00) this.p;
                        ca0.v(obj);
                    } else if (i3 == 2) {
                        obj2 = this.k;
                        m2Var = (m2) this.o;
                        i = (fg) this.n;
                        lVar = (Function1) this.m;
                        wn0Var = (wn0) this.l;
                        d00Var = (d00) this.p;
                        ca0.v(obj);
                        obj3 = obj;
                        set = (Set) obj3;
                        z = z2;
                        while (true) {
                            if (z) {
                                try {
                                    Object[] objArr = wn0Var.b;
                                    long[] jArr = wn0Var.a;
                                    int length = jArr.length - i2;
                                    if (length >= 0) {
                                        int i4 = 0;
                                        while (true) {
                                            long j3 = jArr[i4];
                                            m2Var2 = m2Var;
                                            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i5 = 8 - ((~(i4 - length)) >>> 31);
                                                for (int i6 = 0; i6 < i5; i6++) {
                                                    if ((j3 & 255) < 128) {
                                                        j2 = j3;
                                                        try {
                                                            if (set.contains(objArr[(i4 << 3) + i6])) {
                                                            }
                                                        } catch (Throwable th) {
                                                            th = th;
                                                            m2Var = m2Var2;
                                                            m2Var.c();
                                                            throw th;
                                                        }
                                                    } else {
                                                        j2 = j3;
                                                    }
                                                    j3 = j2 >> 8;
                                                }
                                                if (i5 != 8) {
                                                }
                                            }
                                            if (i4 != length) {
                                                i4++;
                                                m2Var = m2Var2;
                                            }
                                        }
                                    } else {
                                        m2Var2 = m2Var;
                                    }
                                    z = false;
                                    q = i.q();
                                    if (q instanceof og) {
                                        q = null;
                                    }
                                    set = (Set) q;
                                    if (set != null) {
                                        m2Var = m2Var2;
                                        i2 = 2;
                                    } else {
                                        if (z) {
                                            wn0Var.b();
                                            u = pb1.j().u(lVar);
                                            i6 i6Var2 = (i6) this.q;
                                            try {
                                                try {
                                                    Object invoke2 = i6Var2.invoke();
                                                    u.c();
                                                    if (!invoke2.equals(obj2)) {
                                                        this.p = d00Var;
                                                        this.l = wn0Var;
                                                        this.m = lVar;
                                                        this.n = i;
                                                        m2Var = m2Var2;
                                                        this.o = m2Var;
                                                        this.k = invoke2;
                                                        c = 3;
                                                        this.j = 3;
                                                        if (d00Var.e(invoke2, this) != tnVar) {
                                                            obj2 = invoke2;
                                                        }
                                                        return tnVar;
                                                    }
                                                    z2 = false;
                                                    i2 = 2;
                                                } catch (Throwable th2) {
                                                    try {
                                                        throw th2;
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        throw th;
                                                    }
                                                }
                                                j = u.j();
                                            } catch (Throwable th4) {
                                                th = th4;
                                            }
                                        }
                                        m2Var = m2Var2;
                                        c = 3;
                                        z2 = false;
                                        i2 = 2;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    m2Var2 = m2Var;
                                }
                            } else {
                                m2Var2 = m2Var;
                            }
                            z = true;
                            q = i.q();
                            if (q instanceof og) {
                            }
                            set = (Set) q;
                            if (set != null) {
                            }
                        }
                    } else {
                        if (i3 != 3) {
                            dd0.j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj2 = this.k;
                        m2Var = (m2) this.o;
                        i = (fg) this.n;
                        lVar = (Function1) this.m;
                        wn0Var = (wn0) this.l;
                        d00Var = (d00) this.p;
                        ca0.v(obj);
                        c = 3;
                        z2 = false;
                        i2 = 2;
                    }
                    this.p = d00Var;
                    this.l = wn0Var;
                    this.m = lVar;
                    this.n = i;
                    this.o = m2Var;
                    this.k = obj2;
                    this.j = i2;
                    obj3 = i.m(this);
                    if (obj3 == tnVar) {
                        return tnVar;
                    }
                    set = (Set) obj3;
                    z = z2;
                    while (true) {
                        if (z) {
                        }
                        z = true;
                        q = i.q();
                        if (q instanceof og) {
                        }
                        set = (Set) q;
                        if (set != null) {
                        }
                        m2Var = m2Var2;
                        i2 = 2;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    m2Var.c();
                    throw th;
                }
                break;
            default:
                up1 up1Var = (up1) this.o;
                ContentResolver contentResolver = (ContentResolver) this.m;
                tn tnVar2 = tn.d;
                int i7 = this.j;
                try {
                    if (i7 == 0) {
                        ca0.v(obj);
                        d00Var2 = (d00) this.k;
                        contentResolver.registerContentObserver((Uri) this.n, false, up1Var);
                        veVar = new ve((we) this.p);
                    } else if (i7 == 1) {
                        ve veVar2 = (ve) this.l;
                        d00Var2 = (d00) this.k;
                        ca0.v(obj);
                        veVar = veVar2;
                        obj4 = obj;
                        if (((Boolean) obj4).booleanValue()) {
                            contentResolver.unregisterContentObserver(up1Var);
                            return Unit.a;
                        }
                        veVar.c();
                        Float f = new Float(Settings.Global.getFloat(((Context) this.q).getContentResolver(), "animator_duration_scale", 1.0f));
                        this.k = d00Var2;
                        this.l = veVar;
                        this.j = 2;
                        break;
                    } else {
                        if (i7 != 2) {
                            dd0.j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ve veVar3 = (ve) this.l;
                        d00Var2 = (d00) this.k;
                        ca0.v(obj);
                        veVar = veVar3;
                    }
                    this.k = d00Var2;
                    this.l = veVar;
                    this.j = 1;
                    obj4 = veVar.b(this);
                    if (obj4 == tnVar2) {
                        return tnVar2;
                    }
                    if (((Boolean) obj4).booleanValue()) {
                    }
                } catch (Throwable th7) {
                    contentResolver.unregisterContentObserver(up1Var);
                    throw th7;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yb1(i6 i6Var, dn dnVar) {
        super(2, dnVar);
        this.q = i6Var;
    }
}
