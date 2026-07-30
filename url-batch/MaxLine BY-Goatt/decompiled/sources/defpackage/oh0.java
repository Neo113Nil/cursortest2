package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.provider.Settings;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class oh0 extends pr2 implements Function2 {
    public final /* synthetic */ int m = 3;
    public int n;
    public Object o;
    public /* synthetic */ Object p;
    public Object q;
    public final /* synthetic */ Object r;
    public Object s;
    public Object t;
    public Object u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oh0(sh0 sh0Var, r01 r01Var, Object obj, uw1 uw1Var, oi0 oi0Var, ak1 ak1Var, d72 d72Var, o30 o30Var) {
        super(2, o30Var);
        this.o = sh0Var;
        this.p = r01Var;
        this.q = obj;
        this.s = uw1Var;
        this.r = oi0Var;
        this.t = ak1Var;
        this.u = d72Var;
    }

    @Override // defpackage.hn
    public final o30 create(Object obj, o30 o30Var) {
        int i = this.m;
        Object obj2 = this.r;
        switch (i) {
            case 0:
                return new oh0((sh0) this.o, (c82) this.s, (c82) this.t, (r01) this.p, this.q, (c82) this.u, (oi0) obj2, o30Var);
            case 1:
                return new oh0((sh0) this.o, (r01) this.p, this.q, (uw1) this.s, (oi0) obj2, (ak1) this.t, (d72) this.u, o30Var);
            case 2:
                oh0 oh0Var = new oh0((Function0) obj2, o30Var);
                oh0Var.p = obj;
                return oh0Var;
            default:
                oh0 oh0Var2 = new oh0((ContentResolver) this.s, (Uri) this.t, (r83) this.u, (lq) this.p, (Context) obj2, o30Var);
                oh0Var2.q = obj;
                return oh0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.m) {
            case 0:
                return ((oh0) create((a50) obj, (o30) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((oh0) create((a50) obj, (o30) obj2)).invokeSuspend(Unit.a);
            case 2:
                ((oh0) create((ym0) obj, (o30) obj2)).invokeSuspend(Unit.a);
                return b50.m;
            default:
                return ((oh0) create((ym0) obj, (o30) obj2)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0077 A[Catch: all -> 0x002d, TRY_LEAVE, TryCatch #7 {all -> 0x002d, blocks: (B:9:0x0027, B:11:0x005d, B:18:0x006f, B:20:0x0077, B:29:0x003f, B:32:0x0054), top: B:4:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a3 A[Catch: all -> 0x00db, TryCatch #5 {all -> 0x00db, blocks: (B:43:0x00d1, B:46:0x0188, B:51:0x019e, B:53:0x01a3, B:56:0x01b1, B:58:0x01c2, B:60:0x01d0, B:62:0x01da, B:67:0x0203, B:72:0x0212, B:78:0x022e, B:80:0x0237, B:90:0x0261, B:91:0x0264, B:95:0x01eb, B:103:0x01f6, B:110:0x00fb, B:113:0x0118, B:120:0x0157, B:126:0x016e, B:135:0x027a, B:136:0x027d, B:122:0x0163, B:125:0x016b, B:132:0x0276, B:133:0x0279, B:124:0x0167, B:74:0x0223, B:77:0x022b, B:86:0x025d, B:87:0x0260, B:76:0x0227), top: B:37:0x00b3, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0268 A[LOOP:0: B:52:0x01a1->B:69:0x0268, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0210 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x009d -> B:11:0x005d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x024e -> B:43:0x024f). Please report as a decompilation issue!!! */
    @Override // defpackage.hn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b;
        e72 e72Var;
        Bitmap bitmap;
        boolean z;
        ym0 ym0Var;
        un1 un1Var;
        Function1 a0Var;
        gt g;
        nm2 u;
        nm2 j;
        Object obj2;
        Object obj3;
        Set set;
        int i;
        int i2;
        int i3;
        char c;
        int i4;
        ym0 ym0Var2;
        iq iqVar;
        ym0 ym0Var3;
        Object obj4;
        iq iqVar2;
        oh0 oh0Var = this;
        int i5 = 2;
        int i6 = 0;
        k4 k4Var = null;
        switch (oh0Var.m) {
            case 0:
                b50 b50Var = b50.m;
                int i7 = oh0Var.n;
                if (i7 != 0) {
                    if (i7 == 1) {
                        ca2.b(obj);
                        return obj;
                    }
                    lh.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ca2.b(obj);
                sh0 sh0Var = (sh0) oh0Var.o;
                tn2 tn2Var = (tn2) ((c82) oh0Var.s).m;
                gy gyVar = (gy) ((c82) oh0Var.t).m;
                r01 r01Var = (r01) oh0Var.p;
                Object obj5 = oh0Var.q;
                uw1 uw1Var = (uw1) ((c82) oh0Var.u).m;
                oi0 oi0Var = (oi0) oh0Var.r;
                oh0Var.n = 1;
                Object a = sh0.a(sh0Var, tn2Var, gyVar, r01Var, obj5, uw1Var, oi0Var, oh0Var);
                return a == b50Var ? b50Var : a;
            case 1:
                b50 b50Var2 = b50.m;
                int i8 = oh0Var.n;
                if (i8 == 0) {
                    ca2.b(obj);
                    sh0 sh0Var2 = (sh0) oh0Var.o;
                    r01 r01Var2 = (r01) oh0Var.p;
                    Object obj6 = oh0Var.q;
                    uw1 uw1Var2 = (uw1) oh0Var.s;
                    oi0 oi0Var2 = (oi0) oh0Var.r;
                    oh0Var.n = 1;
                    b = sh0.b(sh0Var2, r01Var2, obj6, uw1Var2, oi0Var2, oh0Var);
                    if (b == b50Var2) {
                        return b50Var2;
                    }
                } else {
                    if (i8 != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca2.b(obj);
                    b = obj;
                }
                lh0 lh0Var = (lh0) b;
                fs2 fs2Var = ((sh0) oh0Var.o).b;
                synchronized (fs2Var) {
                    try {
                        b72 b72Var = (b72) fs2Var.m.get();
                        if (b72Var == null) {
                            fs2Var.b();
                        } else if (fs2Var.n == null) {
                            Context context = b72Var.a;
                            fs2Var.n = context;
                            context.registerComponentCallbacks(fs2Var);
                        }
                    } finally {
                    }
                }
                at0 at0Var = ((sh0) oh0Var.o).d;
                ak1 ak1Var = (ak1) oh0Var.t;
                if (((r01) oh0Var.p).n.n && (e72Var = (e72) ((b72) at0Var.m).c.getValue()) != null && ak1Var != null) {
                    Drawable drawable = lh0Var.a;
                    BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
                    if (bitmapDrawable != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("coil#is_sampled", Boolean.valueOf(lh0Var.b));
                        String str = lh0Var.d;
                        if (str != null) {
                            linkedHashMap.put("coil#disk_cache_key", str);
                        }
                        e72Var.a.a(new ak1(ak1Var.m, ll3.a0(ak1Var.n)), bitmap, ll3.a0(linkedHashMap));
                        z = true;
                        Drawable drawable2 = lh0Var.a;
                        r01 r01Var3 = (r01) oh0Var.p;
                        m60 m60Var = lh0Var.c;
                        ak1 ak1Var2 = !z ? (ak1) oh0Var.t : null;
                        String str2 = lh0Var.d;
                        boolean z2 = lh0Var.b;
                        d72 d72Var = (d72) oh0Var.u;
                        Bitmap.Config[] configArr = l.a;
                        return new mq2(drawable2, r01Var3, m60Var, ak1Var2, str2, z2, d72Var == null && d72Var.g);
                    }
                }
                z = false;
                Drawable drawable22 = lh0Var.a;
                r01 r01Var32 = (r01) oh0Var.p;
                m60 m60Var2 = lh0Var.c;
                if (!z) {
                }
                String str22 = lh0Var.d;
                boolean z22 = lh0Var.b;
                d72 d72Var2 = (d72) oh0Var.u;
                Bitmap.Config[] configArr2 = l.a;
                return new mq2(drawable22, r01Var32, m60Var2, ak1Var2, str22, z22, d72Var2 == null && d72Var2.g);
            case 2:
                b50 b50Var3 = b50.m;
                int i9 = oh0Var.n;
                int i10 = 7;
                try {
                    if (i9 == 0) {
                        ca2.b(obj);
                        ym0Var = (ym0) oh0Var.p;
                        un1Var = new un1();
                        a0Var = new a0(14, un1Var);
                        g = s93.g(Integer.MAX_VALUE, 6, null);
                        ia iaVar = new ia(i10, g);
                        tm2.f(tm2.a);
                        synchronized (tm2.c) {
                            tm2.h = zv.F(tm2.h, iaVar);
                            Unit unit = Unit.a;
                        }
                        k4Var = new k4(13, iaVar);
                        u = tm2.k().u(a0Var);
                        Function0 function0 = (Function0) oh0Var.r;
                        try {
                            j = u.j();
                            try {
                                Object invoke = function0.invoke();
                                u.c();
                                oh0Var.p = ym0Var;
                                oh0Var.o = un1Var;
                                oh0Var.s = a0Var;
                                oh0Var.t = g;
                                oh0Var.u = k4Var;
                                oh0Var.q = invoke;
                                oh0Var.n = 1;
                                if (ym0Var.d(invoke, oh0Var) == b50Var3) {
                                    return b50Var3;
                                }
                                obj2 = invoke;
                            } finally {
                                nm2.q(j);
                            }
                        } finally {
                        }
                    } else if (i9 == 1) {
                        obj2 = oh0Var.q;
                        k4Var = (k4) oh0Var.u;
                        g = (gt) oh0Var.t;
                        a0Var = (Function1) oh0Var.s;
                        un1Var = (un1) oh0Var.o;
                        ym0Var = (ym0) oh0Var.p;
                        ca2.b(obj);
                    } else if (i9 == 2) {
                        obj2 = oh0Var.q;
                        k4Var = (k4) oh0Var.u;
                        g = (gt) oh0Var.t;
                        a0Var = (Function1) oh0Var.s;
                        un1Var = (un1) oh0Var.o;
                        ym0Var = (ym0) oh0Var.p;
                        ca2.b(obj);
                        obj3 = obj;
                        set = (Set) obj3;
                        i = i6;
                        while (true) {
                            if (i != 0) {
                                Object[] objArr = un1Var.b;
                                long[] jArr = un1Var.a;
                                i2 = i5;
                                int length = jArr.length - 2;
                                i3 = i10;
                                if (length >= 0) {
                                    int i11 = i6;
                                    while (true) {
                                        long j2 = jArr[i11];
                                        if ((((~j2) << i3) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i12 = 8 - ((~(i11 - length)) >>> 31);
                                            int i13 = 0;
                                            while (i13 < i12) {
                                                if ((j2 & 255) < 128) {
                                                    i4 = i13;
                                                    if (set.contains(objArr[(i11 << 3) + i13])) {
                                                    }
                                                } else {
                                                    i4 = i13;
                                                }
                                                j2 >>= 8;
                                                i13 = i4 + 1;
                                            }
                                            if (i12 != 8) {
                                            }
                                        }
                                        if (i11 != length) {
                                            i11++;
                                        }
                                    }
                                }
                                i = 0;
                                set = (Set) st.a(g.i());
                                if (set != null) {
                                    i5 = i2;
                                    i10 = i3;
                                    i6 = 0;
                                } else {
                                    if (i != 0) {
                                        un1Var.b();
                                        u = tm2.k().u(a0Var);
                                        oh0Var = this;
                                        Function0 function02 = (Function0) oh0Var.r;
                                        try {
                                            try {
                                                Object invoke2 = function02.invoke();
                                                u.c();
                                                if (!Intrinsics.b(invoke2, obj2)) {
                                                    oh0Var.p = ym0Var;
                                                    oh0Var.o = un1Var;
                                                    oh0Var.s = a0Var;
                                                    oh0Var.t = g;
                                                    oh0Var.u = k4Var;
                                                    oh0Var.q = invoke2;
                                                    c = 3;
                                                    oh0Var.n = 3;
                                                    if (ym0Var.d(invoke2, oh0Var) != b50Var3) {
                                                        obj2 = invoke2;
                                                    }
                                                    return b50Var3;
                                                }
                                                c = 3;
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                            j = u.j();
                                        } finally {
                                        }
                                    } else {
                                        oh0Var = this;
                                        c = 3;
                                    }
                                    i5 = i2;
                                    i10 = i3;
                                    i6 = 0;
                                }
                            } else {
                                i2 = i5;
                                i3 = i10;
                            }
                            i = 1;
                            set = (Set) st.a(g.i());
                            if (set != null) {
                            }
                        }
                    } else {
                        if (i9 != 3) {
                            lh.g("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj2 = oh0Var.q;
                        k4Var = (k4) oh0Var.u;
                        g = (gt) oh0Var.t;
                        a0Var = (Function1) oh0Var.s;
                        un1Var = (un1) oh0Var.o;
                        ym0Var = (ym0) oh0Var.p;
                        ca2.b(obj);
                        i2 = 2;
                        i3 = 7;
                        c = 3;
                        i5 = i2;
                        i10 = i3;
                        i6 = 0;
                    }
                    oh0Var.p = ym0Var;
                    oh0Var.o = un1Var;
                    oh0Var.s = a0Var;
                    oh0Var.t = g;
                    oh0Var.u = k4Var;
                    oh0Var.q = obj2;
                    oh0Var.n = i5;
                    obj3 = g.h(oh0Var);
                    if (obj3 == b50Var3) {
                        return b50Var3;
                    }
                    set = (Set) obj3;
                    i = i6;
                    while (true) {
                        if (i != 0) {
                        }
                        i = 1;
                        set = (Set) st.a(g.i());
                        if (set != null) {
                        }
                        i5 = i2;
                        i10 = i3;
                        i6 = 0;
                    }
                } catch (Throwable th2) {
                    k4Var.d();
                    throw th2;
                }
            default:
                r83 r83Var = (r83) oh0Var.u;
                ContentResolver contentResolver = (ContentResolver) oh0Var.s;
                b50 b50Var4 = b50.m;
                int i14 = oh0Var.n;
                try {
                    if (i14 == 0) {
                        ca2.b(obj);
                        ym0Var2 = (ym0) oh0Var.q;
                        contentResolver.registerContentObserver((Uri) oh0Var.t, false, r83Var);
                        iqVar = new iq((lq) oh0Var.p);
                    } else {
                        if (i14 == 1) {
                            iqVar2 = (iq) oh0Var.o;
                            ym0 ym0Var4 = (ym0) oh0Var.q;
                            ca2.b(obj);
                            ym0Var3 = ym0Var4;
                            obj4 = obj;
                            if (((Boolean) obj4).booleanValue()) {
                                contentResolver.unregisterContentObserver(r83Var);
                                return Unit.a;
                            }
                            iqVar2.c();
                            Float f = new Float(Settings.Global.getFloat(((Context) oh0Var.r).getContentResolver(), "animator_duration_scale", 1.0f));
                            oh0Var.q = ym0Var3;
                            oh0Var.o = iqVar2;
                            oh0Var.n = 2;
                            if (ym0Var3.d(f, oh0Var) != b50Var4) {
                                ym0 ym0Var5 = ym0Var3;
                                iqVar = iqVar2;
                                ym0Var2 = ym0Var5;
                            }
                            return b50Var4;
                        }
                        if (i14 != 2) {
                            lh.g("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        iq iqVar3 = (iq) oh0Var.o;
                        ym0 ym0Var6 = (ym0) oh0Var.q;
                        ca2.b(obj);
                        iqVar = iqVar3;
                        ym0Var2 = ym0Var6;
                    }
                    oh0Var.q = ym0Var2;
                    oh0Var.o = iqVar;
                    oh0Var.n = 1;
                    obj4 = iqVar.b(oh0Var);
                    if (obj4 == b50Var4) {
                        return b50Var4;
                    }
                    iq iqVar4 = iqVar;
                    ym0Var3 = ym0Var2;
                    iqVar2 = iqVar4;
                    if (((Boolean) obj4).booleanValue()) {
                    }
                } catch (Throwable th3) {
                    contentResolver.unregisterContentObserver(r83Var);
                    throw th3;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oh0(sh0 sh0Var, c82 c82Var, c82 c82Var2, r01 r01Var, Object obj, c82 c82Var3, oi0 oi0Var, o30 o30Var) {
        super(2, o30Var);
        this.o = sh0Var;
        this.s = c82Var;
        this.t = c82Var2;
        this.p = r01Var;
        this.q = obj;
        this.u = c82Var3;
        this.r = oi0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oh0(ContentResolver contentResolver, Uri uri, r83 r83Var, lq lqVar, Context context, o30 o30Var) {
        super(2, o30Var);
        this.s = contentResolver;
        this.t = uri;
        this.u = r83Var;
        this.p = lqVar;
        this.r = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oh0(Function0 function0, o30 o30Var) {
        super(2, o30Var);
        this.r = function0;
    }
}
