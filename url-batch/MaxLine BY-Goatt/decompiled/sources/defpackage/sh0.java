package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Pair;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class sh0 {
    public final b72 a;
    public final fs2 b;
    public final tt1 c;
    public final at0 d;

    public sh0(b72 b72Var, fs2 fs2Var, tt1 tt1Var) {
        this.a = b72Var;
        this.b = fs2Var;
        this.c = tt1Var;
        at0 at0Var = new at0();
        at0Var.m = b72Var;
        this.d = at0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00c1 -> B:10:0x00c8). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(sh0 sh0Var, tn2 tn2Var, gy gyVar, r01 r01Var, Object obj, uw1 uw1Var, oi0 oi0Var, r30 r30Var) {
        mh0 mh0Var;
        sh0 sh0Var2;
        int i;
        r01 r01Var2;
        Object obj2;
        uw1 uw1Var2;
        oi0 oi0Var2;
        int i2;
        mh0 mh0Var2;
        tn2 tn2Var2;
        gy gyVar2;
        List list;
        Pair pair;
        sh0Var.getClass();
        if (r30Var instanceof mh0) {
            mh0Var = (mh0) r30Var;
            int i3 = mh0Var.w;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                mh0Var.w = i3 - Integer.MIN_VALUE;
                sh0Var2 = sh0Var;
                Object obj3 = mh0Var.u;
                b50 b50Var = b50.m;
                i = mh0Var.w;
                if (i != 0) {
                    ca2.b(obj3);
                    r01Var2 = r01Var;
                    obj2 = obj;
                    uw1Var2 = uw1Var;
                    oi0Var2 = oi0Var;
                    i2 = 0;
                    mh0Var2 = mh0Var;
                    tn2Var2 = tn2Var;
                    gyVar2 = gyVar;
                    b72 b72Var = sh0Var2.a;
                    list = gyVar2.e;
                    if (i2 >= list.size()) {
                    }
                    if (pair != null) {
                    }
                } else {
                    if (i != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i4 = mh0Var.t;
                    oi0 oi0Var3 = mh0Var.s;
                    uw1 uw1Var3 = mh0Var.r;
                    Object obj4 = mh0Var.q;
                    r01 r01Var3 = mh0Var.p;
                    gy gyVar3 = mh0Var.o;
                    tn2 tn2Var3 = mh0Var.n;
                    sh0 sh0Var3 = mh0Var.m;
                    ca2.b(obj3);
                    mh0 mh0Var3 = mh0Var;
                    gyVar2 = gyVar3;
                    i2 = i4;
                    sh0Var2 = sh0Var3;
                    oi0Var2 = oi0Var3;
                    r01Var2 = r01Var3;
                    uw1Var2 = uw1Var3;
                    obj2 = obj4;
                    s70 s70Var = (s70) obj3;
                    oi0Var2.getClass();
                    if (s70Var == null) {
                        BitmapDrawable bitmapDrawable = s70Var.a;
                        boolean z = s70Var.b;
                        m60 m60Var = tn2Var3.c;
                        t01 t01Var = tn2Var3.a;
                        wk0 wk0Var = t01Var instanceof wk0 ? (wk0) t01Var : null;
                        return new lh0(bitmapDrawable, z, m60Var, wk0Var != null ? wk0Var.o : null);
                    }
                    tn2Var2 = tn2Var3;
                    mh0Var2 = mh0Var3;
                    b72 b72Var2 = sh0Var2.a;
                    list = gyVar2.e;
                    if (i2 >= list.size()) {
                        go goVar = (go) list.get(i2);
                        goVar.getClass();
                        pair = new Pair(new io(tn2Var2.a, uw1Var2, goVar.b, goVar.a), Integer.valueOf(i2));
                    } else {
                        pair = null;
                    }
                    if (pair != null) {
                        b71.u(obj2, "Unable to create a decoder that supports: ");
                        return null;
                    }
                    t70 t70Var = (t70) pair.m;
                    int intValue = ((Number) pair.n).intValue() + 1;
                    oi0Var2.getClass();
                    mh0Var2.m = sh0Var2;
                    mh0Var2.n = tn2Var2;
                    mh0Var2.o = gyVar2;
                    mh0Var2.p = r01Var2;
                    mh0Var2.q = obj2;
                    mh0Var2.r = uw1Var2;
                    mh0Var2.s = oi0Var2;
                    mh0Var2.t = intValue;
                    mh0Var2.w = 1;
                    Object b = ((io) t70Var).b(mh0Var2);
                    if (b == b50Var) {
                        return b50Var;
                    }
                    mh0 mh0Var4 = mh0Var2;
                    tn2Var3 = tn2Var2;
                    obj3 = b;
                    i2 = intValue;
                    mh0Var3 = mh0Var4;
                    s70 s70Var2 = (s70) obj3;
                    oi0Var2.getClass();
                    if (s70Var2 == null) {
                    }
                }
            }
        }
        sh0Var2 = sh0Var;
        mh0Var = new mh0(sh0Var2, r30Var);
        Object obj32 = mh0Var.u;
        b50 b50Var2 = b50.m;
        i = mh0Var.w;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0178, code lost:
    
        if (r12.j == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0191, code lost:
    
        if (r1 == r7) goto L64;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00df A[Catch: all -> 0x004e, TRY_LEAVE, TryCatch #2 {all -> 0x004e, blocks: (B:26:0x0049, B:27:0x010e, B:45:0x0063, B:47:0x00d4, B:49:0x00df, B:54:0x00f2, B:67:0x011c, B:69:0x0125, B:71:0x01ab, B:72:0x01b0), top: B:8:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011c A[Catch: all -> 0x004e, TryCatch #2 {all -> 0x004e, blocks: (B:26:0x0049, B:27:0x010e, B:45:0x0063, B:47:0x00d4, B:49:0x00df, B:54:0x00f2, B:67:0x011c, B:69:0x0125, B:71:0x01ab, B:72:0x01b0), top: B:8:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0070  */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(sh0 sh0Var, r01 r01Var, Object obj, uw1 uw1Var, oi0 oi0Var, r30 r30Var) {
        nh0 nh0Var;
        c82 c82Var;
        tn2 tn2Var;
        sh0 sh0Var2;
        Object obj2;
        oi0 oi0Var2;
        c82 c82Var2;
        c82 c82Var3;
        c82 c82Var4;
        c82 c82Var5;
        r01 r01Var2;
        Object obj3;
        nk0 nk0Var;
        r01 r01Var3;
        c82 c82Var6;
        oi0 oi0Var3;
        sh0 sh0Var3;
        c82 c82Var7;
        sh0 sh0Var4;
        lh0 lh0Var;
        tn2 tn2Var2;
        List list;
        Object obj4;
        Bitmap bitmap;
        try {
            if (r30Var instanceof nh0) {
                nh0Var = (nh0) r30Var;
                int i = nh0Var.w;
                if ((i & Integer.MIN_VALUE) != 0) {
                    nh0Var.w = i - Integer.MIN_VALUE;
                    nh0 nh0Var2 = nh0Var;
                    Object obj5 = nh0Var2.u;
                    b50 b50Var = b50.m;
                    c82Var = nh0Var2.w;
                    if (c82Var != 0) {
                        ca2.b(obj5);
                        c82 c82Var8 = new c82();
                        c82Var8.m = uw1Var;
                        c82 c82Var9 = new c82();
                        c82Var9.m = sh0Var.a.f;
                        c82 c82Var10 = new c82();
                        try {
                            c82Var8.m = sh0Var.c.s((uw1) c82Var8.m);
                            r01Var.getClass();
                            gy gyVar = (gy) c82Var9.m;
                            uw1 uw1Var2 = (uw1) c82Var8.m;
                            nh0Var2.m = sh0Var;
                            nh0Var2.n = r01Var;
                            nh0Var2.o = obj;
                            nh0Var2.p = oi0Var;
                            nh0Var2.q = c82Var8;
                            nh0Var2.r = c82Var9;
                            nh0Var2.s = c82Var10;
                            nh0Var2.t = c82Var10;
                            nh0Var2.w = 1;
                            Object c = sh0Var.c(gyVar, r01Var, obj, uw1Var2, oi0Var, nh0Var2);
                            if (c != b50Var) {
                                sh0Var2 = sh0Var;
                                obj2 = obj;
                                oi0Var2 = oi0Var;
                                c82Var2 = c82Var8;
                                c82Var3 = c82Var9;
                                c82Var4 = c82Var10;
                                c82Var5 = c82Var4;
                                r01Var2 = r01Var;
                                obj3 = c;
                            }
                            return b50Var;
                        } catch (Throwable th) {
                            th = th;
                            c82Var = c82Var10;
                            Object obj6 = c82Var.m;
                            tn2Var = obj6 instanceof tn2 ? (tn2) obj6 : null;
                            if (tn2Var != null) {
                                l.a(tn2Var.a);
                            }
                            throw th;
                        }
                    }
                    if (c82Var == 1) {
                        c82Var4 = nh0Var2.t;
                        c82Var5 = nh0Var2.s;
                        c82 c82Var11 = nh0Var2.r;
                        c82 c82Var12 = nh0Var2.q;
                        oi0 oi0Var4 = (oi0) nh0Var2.p;
                        Object obj7 = nh0Var2.o;
                        r01Var2 = nh0Var2.n;
                        sh0 sh0Var5 = nh0Var2.m;
                        ca2.b(obj5);
                        c82Var3 = c82Var11;
                        c82Var2 = c82Var12;
                        oi0Var2 = oi0Var4;
                        obj2 = obj7;
                        sh0Var2 = sh0Var5;
                        obj3 = obj5;
                    } else {
                        if (c82Var != 2) {
                            if (c82Var != 3) {
                                lh.g("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            ca2.b(obj5);
                            lh0 lh0Var2 = (lh0) obj5;
                            Drawable drawable = lh0Var2.a;
                            BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
                            if (bitmapDrawable != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
                                bitmap.prepareToDraw();
                            }
                            return lh0Var2;
                        }
                        c82Var5 = nh0Var2.q;
                        c82Var7 = (c82) nh0Var2.p;
                        oi0Var3 = (oi0) nh0Var2.o;
                        r01Var3 = nh0Var2.n;
                        sh0Var4 = nh0Var2.m;
                        ca2.b(obj5);
                        obj4 = obj5;
                        c82Var6 = c82Var7;
                        sh0Var3 = sh0Var4;
                        lh0Var = (lh0) obj4;
                        oi0 oi0Var5 = oi0Var3;
                        r01 r01Var4 = r01Var3;
                        Object obj8 = c82Var5.m;
                        tn2Var2 = obj8 instanceof tn2 ? (tn2) obj8 : null;
                        if (tn2Var2 != null) {
                            l.a(tn2Var2.a);
                        }
                        uw1 uw1Var3 = (uw1) c82Var6.m;
                        nh0Var2.m = null;
                        nh0Var2.n = null;
                        nh0Var2.o = null;
                        nh0Var2.p = null;
                        nh0Var2.q = null;
                        nh0Var2.r = null;
                        nh0Var2.s = null;
                        nh0Var2.t = null;
                        nh0Var2.w = 3;
                        sh0Var3.getClass();
                        list = r01Var4.f;
                        obj5 = lh0Var;
                        if (!list.isEmpty()) {
                            if (!(lh0Var.a instanceof BitmapDrawable)) {
                                obj5 = lh0Var;
                            }
                            obj5 = z71.V(r01Var4.t, new rh0(sh0Var3, lh0Var, uw1Var3, list, oi0Var5, r01Var4, null), nh0Var2);
                        }
                    }
                    c82Var4.m = obj3;
                    Object obj9 = c82Var5.m;
                    nk0Var = (nk0) obj9;
                    if (nk0Var instanceof tn2) {
                        r01Var3 = r01Var2;
                        c82Var6 = c82Var2;
                        oi0Var3 = oi0Var2;
                        if (!(nk0Var instanceof ge0)) {
                            throw new bs1();
                        }
                        sh0Var3 = sh0Var2;
                        lh0Var = new lh0(((ge0) obj9).a, ((ge0) obj9).b, ((ge0) obj9).c, null);
                        oi0 oi0Var52 = oi0Var3;
                        r01 r01Var42 = r01Var3;
                        Object obj82 = c82Var5.m;
                        if (obj82 instanceof tn2) {
                        }
                        if (tn2Var2 != null) {
                        }
                        uw1 uw1Var32 = (uw1) c82Var6.m;
                        nh0Var2.m = null;
                        nh0Var2.n = null;
                        nh0Var2.o = null;
                        nh0Var2.p = null;
                        nh0Var2.q = null;
                        nh0Var2.r = null;
                        nh0Var2.s = null;
                        nh0Var2.t = null;
                        nh0Var2.w = 3;
                        sh0Var3.getClass();
                        list = r01Var42.f;
                        obj5 = lh0Var;
                        if (!list.isEmpty()) {
                        }
                    } else {
                        t40 t40Var = r01Var2.s;
                        c82 c82Var13 = c82Var5;
                        r01 r01Var5 = r01Var2;
                        try {
                            oh0 oh0Var = new oh0(sh0Var2, c82Var13, c82Var3, r01Var5, obj2, c82Var2, oi0Var2, (o30) null);
                            r01Var3 = r01Var5;
                            c82 c82Var14 = c82Var2;
                            oi0Var3 = oi0Var2;
                            nh0Var2.m = sh0Var2;
                            nh0Var2.n = r01Var3;
                            nh0Var2.o = oi0Var3;
                            nh0Var2.p = c82Var14;
                            nh0Var2.q = c82Var5;
                            nh0Var2.r = null;
                            nh0Var2.s = null;
                            nh0Var2.t = null;
                            nh0Var2.w = 2;
                            Object V = z71.V(t40Var, oh0Var, nh0Var2);
                            if (V == b50Var) {
                                return b50Var;
                            }
                            c82Var7 = c82Var14;
                            sh0Var4 = sh0Var2;
                            obj4 = V;
                            c82Var6 = c82Var7;
                            sh0Var3 = sh0Var4;
                            lh0Var = (lh0) obj4;
                            oi0 oi0Var522 = oi0Var3;
                            r01 r01Var422 = r01Var3;
                            Object obj822 = c82Var5.m;
                            if (obj822 instanceof tn2) {
                            }
                            if (tn2Var2 != null) {
                            }
                            uw1 uw1Var322 = (uw1) c82Var6.m;
                            nh0Var2.m = null;
                            nh0Var2.n = null;
                            nh0Var2.o = null;
                            nh0Var2.p = null;
                            nh0Var2.q = null;
                            nh0Var2.r = null;
                            nh0Var2.s = null;
                            nh0Var2.t = null;
                            nh0Var2.w = 3;
                            sh0Var3.getClass();
                            list = r01Var422.f;
                            obj5 = lh0Var;
                            if (!list.isEmpty()) {
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            c82Var = c82Var13;
                            Object obj62 = c82Var.m;
                            if (obj62 instanceof tn2) {
                            }
                            if (tn2Var != null) {
                            }
                            throw th;
                        }
                    }
                }
            }
            if (c82Var != 0) {
            }
            c82Var4.m = obj3;
            Object obj92 = c82Var5.m;
            nk0Var = (nk0) obj92;
            if (nk0Var instanceof tn2) {
            }
        } catch (Throwable th3) {
            th = th3;
        }
        nh0Var = new nh0(sh0Var, r30Var);
        nh0 nh0Var22 = nh0Var;
        Object obj52 = nh0Var22.u;
        b50 b50Var2 = b50.m;
        c82Var = nh0Var22.w;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00d0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00c1 -> B:10:0x00c8). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(gy gyVar, r01 r01Var, Object obj, uw1 uw1Var, oi0 oi0Var, r30 r30Var) {
        ph0 ph0Var;
        sh0 sh0Var;
        int i;
        Object obj2;
        uw1 uw1Var2;
        oi0 oi0Var2;
        int i2;
        ph0 ph0Var2;
        gy gyVar2;
        r01 r01Var2;
        int size;
        Pair pair;
        if (r30Var instanceof ph0) {
            ph0Var = (ph0) r30Var;
            int i3 = ph0Var.v;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ph0Var.v = i3 - Integer.MIN_VALUE;
                sh0Var = this;
                Object obj3 = ph0Var.t;
                b50 b50Var = b50.m;
                i = ph0Var.v;
                if (i != 0) {
                    ca2.b(obj3);
                    obj2 = obj;
                    uw1Var2 = uw1Var;
                    oi0Var2 = oi0Var;
                    i2 = 0;
                    ph0Var2 = ph0Var;
                    gyVar2 = gyVar;
                    r01Var2 = r01Var;
                    b72 b72Var = sh0Var.a;
                    List list = gyVar2.d;
                    size = list.size();
                    while (true) {
                        if (i2 < size) {
                        }
                        i2++;
                    }
                    if (pair != null) {
                    }
                } else {
                    if (i != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i4 = ph0Var.s;
                    oi0 oi0Var3 = ph0Var.r;
                    uw1Var2 = ph0Var.q;
                    Object obj4 = ph0Var.p;
                    r01 r01Var3 = ph0Var.o;
                    gy gyVar3 = ph0Var.n;
                    sh0 sh0Var2 = ph0Var.m;
                    ca2.b(obj3);
                    ph0 ph0Var3 = ph0Var;
                    r01Var2 = r01Var3;
                    i2 = i4;
                    sh0Var = sh0Var2;
                    oi0Var2 = oi0Var3;
                    obj2 = obj4;
                    nk0 nk0Var = (nk0) obj3;
                    try {
                        oi0Var2.getClass();
                        if (nk0Var == null) {
                            return nk0Var;
                        }
                        gyVar2 = gyVar3;
                        ph0Var2 = ph0Var3;
                        b72 b72Var2 = sh0Var.a;
                        List list2 = gyVar2.d;
                        size = list2.size();
                        while (true) {
                            if (i2 < size) {
                                pair = null;
                                break;
                            }
                            Pair pair2 = (Pair) list2.get(i2);
                            pk0 pk0Var = (pk0) pair2.m;
                            if (((Class) pair2.n).isAssignableFrom(obj2.getClass())) {
                                pk0Var.getClass();
                                qk0 a = pk0Var.a(obj2, uw1Var2);
                                if (a != null) {
                                    pair = new Pair(a, Integer.valueOf(i2));
                                    break;
                                }
                            }
                            i2++;
                        }
                        if (pair != null) {
                            b71.u(obj2, "Unable to create a fetcher that supports: ");
                            return null;
                        }
                        qk0 qk0Var = (qk0) pair.m;
                        int intValue = ((Number) pair.n).intValue() + 1;
                        oi0Var2.getClass();
                        ph0Var2.m = sh0Var;
                        ph0Var2.n = gyVar2;
                        ph0Var2.o = r01Var2;
                        ph0Var2.p = obj2;
                        ph0Var2.q = uw1Var2;
                        ph0Var2.r = oi0Var2;
                        ph0Var2.s = intValue;
                        ph0Var2.v = 1;
                        Object a2 = qk0Var.a(ph0Var2);
                        if (a2 == b50Var) {
                            return b50Var;
                        }
                        ph0 ph0Var4 = ph0Var2;
                        gyVar3 = gyVar2;
                        obj3 = a2;
                        i2 = intValue;
                        ph0Var3 = ph0Var4;
                        nk0 nk0Var2 = (nk0) obj3;
                        oi0Var2.getClass();
                        if (nk0Var2 == null) {
                        }
                    } catch (Throwable th) {
                        tn2 tn2Var = nk0Var2 instanceof tn2 ? (tn2) nk0Var2 : null;
                        if (tn2Var != null) {
                            l.a(tn2Var.a);
                        }
                        throw th;
                    }
                }
            }
        }
        sh0Var = this;
        ph0Var = new ph0(sh0Var, r30Var);
        Object obj32 = ph0Var.t;
        b50 b50Var2 = b50.m;
        i = ph0Var.v;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(d72 d72Var, r30 r30Var) {
        qh0 qh0Var;
        int i;
        sh0 sh0Var = this;
        d72 d72Var2 = d72Var;
        at0 at0Var = sh0Var.d;
        if (r30Var instanceof qh0) {
            qh0Var = (qh0) r30Var;
            int i2 = qh0Var.q;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qh0Var.q = i2 - Integer.MIN_VALUE;
                qh0 qh0Var2 = qh0Var;
                Object obj = qh0Var2.o;
                b50 b50Var = b50.m;
                i = qh0Var2.q;
                if (i != 0) {
                    ca2.b(obj);
                    try {
                        r01 r01Var = d72Var2.d;
                        Object obj2 = r01Var.b;
                        pl2 pl2Var = d72Var2.e;
                        Bitmap.Config[] configArr = l.a;
                        oi0 oi0Var = d72Var2.f;
                        uw1 r = sh0Var.c.r(r01Var, pl2Var);
                        me2 me2Var = r.e;
                        List list = sh0Var.a.f.b;
                        int size = list.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            try {
                                Pair pair = (Pair) list.get(i3);
                                xq xqVar = (xq) pair.m;
                                if (((Class) pair.n).isAssignableFrom(obj2.getClass())) {
                                    xqVar.getClass();
                                    Object a = xqVar.a(obj2, r);
                                    if (a != null) {
                                        obj2 = a;
                                    }
                                }
                            } catch (Throwable th) {
                                th = th;
                                sh0Var = this;
                            }
                        }
                        ak1 j = at0Var.j(r01Var, obj2, r, oi0Var);
                        bk1 h = j != null ? at0Var.h(r01Var, j, pl2Var, me2Var) : null;
                        if (h != null) {
                            return at0.k(d72Var2, r01Var, j, h);
                        }
                        t40 t40Var = r01Var.r;
                        sh0Var = this;
                        oh0 oh0Var = new oh0(sh0Var, r01Var, obj2, r, oi0Var, j, d72Var2, (o30) null);
                        qh0Var2.m = sh0Var;
                        qh0Var2.n = d72Var2;
                        qh0Var2.q = 1;
                        Object V = z71.V(t40Var, oh0Var, qh0Var2);
                        return V == b50Var ? b50Var : V;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else {
                    if (i != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    d72 d72Var3 = qh0Var2.n;
                    sh0 sh0Var2 = qh0Var2.m;
                    try {
                        ca2.b(obj);
                        return obj;
                    } catch (Throwable th3) {
                        th = th3;
                        d72Var2 = d72Var3;
                        sh0Var = sh0Var2;
                    }
                }
                if (!(th instanceof CancellationException)) {
                    throw th;
                }
                tt1 tt1Var = sh0Var.c;
                return tt1.n(d72Var2.d, th);
            }
        }
        qh0Var = new qh0(sh0Var, r30Var);
        qh0 qh0Var22 = qh0Var;
        Object obj3 = qh0Var22.o;
        b50 b50Var2 = b50.m;
        i = qh0Var22.q;
        if (i != 0) {
        }
        if (!(th instanceof CancellationException)) {
        }
    }
}
