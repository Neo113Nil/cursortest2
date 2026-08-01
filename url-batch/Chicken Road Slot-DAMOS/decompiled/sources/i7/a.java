package i7;

import a2.g0;
import a2.r;
import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.LocaleList;
import android.os.Trace;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import android.util.Log;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.u;
import b0.e1;
import b0.i;
import b0.l0;
import b0.p;
import b0.t;
import b0.w0;
import b1.h;
import c2.b1;
import c2.z;
import c2.z1;
import com.appsflyer.R;
import com.google.common.util.concurrent.ListenableFuture;
import d2.d1;
import f8.q;
import hd.d;
import i5.c;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import k7.e;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.i0;
import kotlin.collections.j0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l8.j;
import n0.k;
import n0.l;
import n0.s1;
import n0.z0;
import p2.s;
import p2.x;
import q1.f;
import te.a1;
import wd.c0;
import wd.m;
import x.g;
import x2.n;
import x2.o;
import z4.v;
import z4.w;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: b, reason: collision with root package name */
    public static Context f4662b;

    /* renamed from: c, reason: collision with root package name */
    public static Boolean f4663c;

    /* renamed from: d, reason: collision with root package name */
    public static f f4664d;

    /* renamed from: e, reason: collision with root package name */
    public static long f4665e;

    /* renamed from: f, reason: collision with root package name */
    public static Method f4666f;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4667a;

    public /* synthetic */ a(int i3) {
        this.f4667a = i3;
    }

    public static void A(Object obj, String str) {
        if (obj != null) {
            return;
        }
        r.j(str);
    }

    public static void B(int i3, int i10) {
        if (i3 < 0 || i3 > i10) {
            i0.g(m("index", i3, i10));
        }
    }

    public static final void C(int i3, int i10) {
        if (i3 < 0 || i3 > i10) {
            r.e(i3, i10, ", size: ", "index: ");
        }
    }

    public static void D(int i3, int i10, int i11) {
        if (i3 < 0 || i10 < i3 || i10 > i11) {
            throw new IndexOutOfBoundsException((i3 < 0 || i3 > i11) ? m("start index", i3, i11) : (i10 < 0 || i10 > i11) ? m("end index", i10, i11) : e.y("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i3)));
        }
    }

    public static final void E(int i3, int i10, int i11) {
        if (i3 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException("fromIndex: " + i3 + ", toIndex: " + i10 + ", size: " + i11);
        }
        if (i3 <= i10) {
            return;
        }
        throw new IllegalArgumentException("fromIndex: " + i3 + " > toIndex: " + i10);
    }

    public static void F(String str, boolean z10) {
        if (z10) {
            return;
        }
        i0.l(str);
    }

    public static final void G(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                hd.b.a(th, th2);
            }
        }
    }

    public static final int H(c cVar, String str) {
        cVar.getClass();
        int columnCount = cVar.getColumnCount();
        int i3 = 0;
        while (true) {
            if (i3 >= columnCount) {
                i3 = -1;
                break;
            }
            if (str.equals(cVar.getColumnName(i3))) {
                break;
            }
            i3++;
        }
        if (i3 >= 0) {
            return i3;
        }
        String str2 = "`" + str + '`';
        int columnCount2 = cVar.getColumnCount();
        int i10 = 0;
        while (true) {
            if (i10 >= columnCount2) {
                i10 = -1;
                break;
            }
            if (str2.equals(cVar.getColumnName(i10))) {
                break;
            }
            i10++;
        }
        if (i10 >= 0) {
            return i10;
        }
        if (Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
            int columnCount3 = cVar.getColumnCount();
            String concat = ".".concat(str);
            String str3 = "." + str + '`';
            for (int i11 = 0; i11 < columnCount3; i11++) {
                String columnName = cVar.getColumnName(i11);
                if (columnName.length() >= str.length() + 2 && (columnName.endsWith(concat) || (columnName.charAt(0) == '`' && columnName.endsWith(str3)))) {
                    return i11;
                }
            }
        }
        return -1;
    }

    public static l8.b I(String str, String str2) {
        d9.a aVar = new d9.a(str, str2);
        l8.a a9 = l8.b.a(d9.a.class);
        a9.f5896e = 1;
        a9.f5897f = new h(8, aVar);
        return a9.b();
    }

    public static final od.b J(Enum[] enumArr) {
        enumArr.getClass();
        return new od.b(enumArr);
    }

    public static l8.b K(String str, r rVar) {
        l8.a a9 = l8.b.a(d9.a.class);
        a9.f5896e = 1;
        a9.a(j.a(Context.class));
        a9.f5897f = new com.google.firebase.messaging.f(4, str, rVar);
        return a9.b();
    }

    public static final long N(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / 2.0f;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) / 2.0f;
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static final int O(c cVar, String str) {
        cVar.getClass();
        int H = H(cVar, str);
        if (H >= 0) {
            return H;
        }
        int columnCount = cVar.getColumnCount();
        ArrayList arrayList = new ArrayList(columnCount);
        for (int i3 = 0; i3 < columnCount; i3++) {
            arrayList.add(cVar.getColumnName(i3));
        }
        r.k("Column '", str, "' does not exist. Available columns: [", CollectionsKt.B(arrayList, null, null, null, null, 63), 93);
        return 0;
    }

    public static Object P(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            return arrayList.get(arrayList.size() - 1);
        }
        i0.c();
        return null;
    }

    public static int Q(int i3) {
        if (i3 == 1) {
            return 0;
        }
        if (i3 == 2) {
            return 1;
        }
        if (i3 == 4) {
            return 2;
        }
        if (i3 == 8) {
            return 3;
        }
        if (i3 == 16) {
            return 4;
        }
        if (i3 == 32) {
            return 5;
        }
        if (i3 == 64) {
            return 6;
        }
        if (i3 == 128) {
            return 7;
        }
        if (i3 == 256) {
            return 8;
        }
        if (i3 == 512) {
            return 9;
        }
        a1.e(v4.a.j(i3, "type needs to be >= FIRST and <= LAST, type="));
        return 0;
    }

    public static final int R(int i3) {
        if (i3 == 0) {
            return 1;
        }
        if (i3 == 1) {
            return 2;
        }
        a1.e(l.f(i3, "Could not convert ", " to BackoffPolicy"));
        return 0;
    }

    public static final int S(int i3) {
        if (i3 == 0) {
            return 1;
        }
        if (i3 == 1) {
            return 2;
        }
        if (i3 == 2) {
            return 3;
        }
        if (i3 == 3) {
            return 4;
        }
        if (i3 == 4) {
            return 5;
        }
        if (Build.VERSION.SDK_INT >= 30 && i3 == 5) {
            return 6;
        }
        a1.e(l.f(i3, "Could not convert ", " to NetworkType"));
        return 0;
    }

    public static final int T(int i3) {
        if (i3 == 0) {
            return 1;
        }
        if (i3 == 1) {
            return 2;
        }
        a1.e(l.f(i3, "Could not convert ", " to OutOfQuotaPolicy"));
        return 0;
    }

    public static final int U(int i3) {
        if (i3 == 0) {
            return 1;
        }
        if (i3 == 1) {
            return 2;
        }
        if (i3 == 2) {
            return 3;
        }
        if (i3 == 3) {
            return 4;
        }
        if (i3 == 4) {
            return 5;
        }
        if (i3 == 5) {
            return 6;
        }
        a1.e(l.f(i3, "Could not convert ", " to State"));
        return 0;
    }

    public static boolean V() {
        if (Build.VERSION.SDK_INT >= 29) {
            return o5.a.a();
        }
        try {
            if (f4666f == null) {
                f4665e = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f4666f = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f4666f.invoke(null, Long.valueOf(f4665e))).booleanValue();
        } catch (Exception e2) {
            if (!(e2 instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e2);
                return false;
            }
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static synchronized boolean W(Context context) {
        boolean isInstantApp;
        Boolean bool;
        synchronized (a.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = f4662b;
            if (context2 != null && (bool = f4663c) != null && context2 == applicationContext) {
                return bool.booleanValue();
            }
            f4663c = null;
            if (g7.b.b()) {
                isInstantApp = applicationContext.getPackageManager().isInstantApp();
                f4663c = Boolean.valueOf(isInstantApp);
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    f4663c = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    f4663c = Boolean.FALSE;
                }
            }
            f4662b = applicationContext;
            return f4663c.booleanValue();
        }
    }

    public static String X(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            a1.e("Invalid input received");
            return null;
        }
        StringBuilder sb2 = new StringBuilder(str2.length() + str.length());
        for (int i3 = 0; i3 < str.length(); i3++) {
            sb2.append(str.charAt(i3));
            if (str2.length() > i3) {
                sb2.append(str2.charAt(i3));
            }
        }
        return sb2.toString();
    }

    public static final void a(d1.l lVar, boolean z10, final Function0 function0, n0.i0 i0Var, int i3) {
        final int i10;
        n0.i0 i0Var2;
        final d1.l lVar2 = lVar;
        final boolean z11 = z10;
        i0Var.X(883101946);
        int i11 = i3 | (i0Var.f(lVar2) ? 4 : 2) | (i0Var.g(z11) ? 32 : 16) | (i0Var.h(function0) ? 256 : 128);
        int i12 = 1;
        if (i0Var.O(i11 & 1, (i11 & 147) != 146)) {
            Object L = i0Var.L();
            n0.e eVar = k.f6729a;
            if (L == eVar) {
                L = new z.f();
                i0Var.g0(L);
            }
            z.f fVar = (z.f) L;
            boolean z12 = (i11 & 896) == 256;
            Object L2 = i0Var.L();
            if (z12 || L2 == eVar) {
                L2 = new n9.j(i12, function0);
                i0Var.g0(L2);
            }
            d1.l d10 = g.d(lVar2, fVar, null, z11, null, (Function0) L2, 24);
            g0 d11 = p.d(d1.a.f3286s);
            int hashCode = Long.hashCode(i0Var.T);
            x0.h l10 = i0Var.l();
            d1.l C = w.C(d10, i0Var);
            c2.g.f1541a.getClass();
            z zVar = c2.f.f1533b;
            i0Var.Z();
            if (i0Var.S) {
                i0Var.k(zVar);
            } else {
                i0Var.j0();
            }
            n0.h.y(d11, c2.f.f1536e, i0Var);
            n0.h.y(l10, c2.f.f1535d, i0Var);
            n0.h.y(Integer.valueOf(hashCode), c2.f.f1537f, i0Var);
            n0.h.t(i0Var, c2.f.g);
            n0.h.y(C, c2.f.f1534c, i0Var);
            i0Var2 = i0Var;
            g.b(e.B(R.drawable.button_yel, i0Var, 0), w0.a(1.0f), null, a2.h.f98d, 0.0f, i0Var2, 25016);
            z11 = z10;
            lVar2 = lVar;
            i10 = i3;
            a.a.b(w.P(R.string.go, i0Var2), v.c(34), null, u9.a.j, u9.a.f9707i, 7.0f, null, null, null, i0Var2, 196656, 452);
            i0Var2.p(true);
        } else {
            i10 = i3;
            i0Var2 = i0Var;
            i0Var2.R();
        }
        s1 r9 = i0Var2.r();
        if (r9 != null) {
            r9.f6812d = new Function2(z11, function0, i10) { // from class: n9.o

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ boolean f7242e;

                /* renamed from: i, reason: collision with root package name */
                public final /* synthetic */ Function0 f7243i;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int z13 = n0.h.z(1);
                    i7.a.a(d1.l.this, this.f7242e, this.f7243i, (n0.i0) obj, z13);
                    return Unit.f5554a;
                }
            };
        }
    }

    public static final float a0(long j, float f3, x2.c cVar) {
        float c10;
        long b10 = n.b(j);
        if (o.a(b10, 4294967296L)) {
            if (cVar.d() <= 1.05d) {
                return cVar.I(j);
            }
            c10 = n.c(j) / n.c(cVar.N(f3));
        } else {
            if (!o.a(b10, 8589934592L)) {
                return Float.NaN;
            }
            c10 = n.c(j);
        }
        return c10 * f3;
    }

    public static final void b(j9.a aVar, Function0 function0, Function0 function02, Function0 function03, Function0 function04, n0.i0 i0Var, final int i3) {
        final j9.a aVar2;
        final Function0 function05;
        final Function0 function06;
        final Function0 function07;
        final Function0 function08;
        n0.i0 i0Var2;
        i0Var.X(906468541);
        int i10 = (i0Var.f(aVar) ? 4 : 2) | i3 | (i0Var.h(function0) ? 32 : 16) | (i0Var.h(function02) ? 256 : 128) | (i0Var.h(function03) ? 2048 : 1024) | (i0Var.h(function04) ? 16384 : 8192);
        if (i0Var.O(i10 & 1, (i10 & 9363) != 9362)) {
            aVar2 = aVar;
            function05 = function0;
            function06 = function02;
            function07 = function03;
            function08 = function04;
            i0Var2 = i0Var;
            i.a(w0.a(1.0f), null, x0.i.d(196473383, new vd.n() { // from class: n9.m
                @Override // vd.n
                public final Object a(Object obj, Object obj2, Object obj3) {
                    d1.i iVar;
                    t tVar;
                    float f3;
                    float f10;
                    boolean z10;
                    float f11;
                    boolean z11;
                    boolean z12;
                    Object obj4;
                    b0.w wVar = (b0.w) obj;
                    n0.i0 i0Var3 = (n0.i0) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    d1.d dVar = d1.a.f3282d;
                    wVar.getClass();
                    int i11 = 2;
                    if ((intValue & 6) == 0) {
                        intValue |= i0Var3.f(wVar) ? 4 : 2;
                    }
                    boolean z13 = false;
                    if (i0Var3.O(intValue & 1, (intValue & 19) != 18)) {
                        float b10 = wVar.b();
                        float a9 = wVar.a();
                        x2.c cVar = (x2.c) i0Var3.j(d1.f3384h);
                        i0Var3.W(-167633267);
                        WeakHashMap weakHashMap = e1.f818v;
                        View view = (View) i0Var3.j(AndroidCompositionLocals_androidKt.f469f);
                        e1 f12 = t.f(view);
                        boolean h10 = i0Var3.h(f12) | i0Var3.h(view);
                        Object L = i0Var3.L();
                        if (h10 || L == n0.k.f6729a) {
                            L = new l0(i11, f12, view);
                            i0Var3.g0(L);
                        }
                        n0.h.d(f12, (Function1) L, i0Var3);
                        float S = cVar.S(f12.f820b.e().f4443a);
                        i0Var3.p(false);
                        float max = x2.f.a(S, (float) 0) > 0 ? Math.max(-0.01f, (S / b10) + 0.015f) : -0.01f;
                        d1.l a10 = w0.a(1.0f);
                        g0 d10 = p.d(dVar);
                        int hashCode = Long.hashCode(i0Var3.T);
                        x0.h l10 = i0Var3.l();
                        d1.l C = w.C(a10, i0Var3);
                        c2.g.f1541a.getClass();
                        z zVar = c2.f.f1533b;
                        i0Var3.Z();
                        if (i0Var3.S) {
                            i0Var3.k(zVar);
                        } else {
                            i0Var3.j0();
                        }
                        n0.h.y(d10, c2.f.f1536e, i0Var3);
                        n0.h.y(l10, c2.f.f1535d, i0Var3);
                        n0.h.y(Integer.valueOf(hashCode), c2.f.f1537f, i0Var3);
                        n0.h.t(i0Var3, c2.f.g);
                        n0.h.y(C, c2.f.f1534c, i0Var3);
                        j9.a aVar3 = j9.a.this;
                        float f13 = aVar3.g;
                        float f14 = aVar3.g;
                        boolean z14 = aVar3.f5109b;
                        float f15 = aVar3.f5113f;
                        boolean z15 = aVar3.f5112e;
                        i7.a.j(f13, null, i0Var3, 3072);
                        i7.a.g(aVar3, a.a.e0(w0.a(1.0f), 1.0f), i0Var3, 48);
                        i0Var3.W(1247183244);
                        Iterator it = aVar3.f5116k.iterator();
                        while (true) {
                            boolean hasNext = it.hasNext();
                            iVar = d1.i.f3304a;
                            tVar = t.f900b;
                            if (!hasNext) {
                                break;
                            }
                            j9.d dVar2 = (j9.d) it.next();
                            int i12 = dVar2.f5123c;
                            int i13 = dVar2.f5122b;
                            float f16 = (i12 * 0.142f) + 0.235f + f14;
                            if (f16 <= -0.25f || f16 >= 1.25f) {
                                f3 = a9;
                                f10 = f14;
                                z10 = z14;
                                f11 = f15;
                                z11 = z15;
                                z12 = false;
                                obj4 = null;
                                i0Var3.W(-331342166);
                                i0Var3.p(false);
                            } else {
                                f3 = a9;
                                i0Var3.W(-332208027);
                                p1.b B = k7.e.B(i13, i0Var3, 0);
                                d1.l g = b0.i.g(tVar.e(b0.i.c(w0.f(a.a.e0(iVar, 2.0f), (i13 == R.drawable.big_car1 || i13 == R.drawable.big_car2) ? b10 * 0.12f : 0.08f * b10), 0.58f), dVar), f16 * b10, dVar2.f5124d * f3);
                                z10 = z14;
                                f11 = f15;
                                f10 = f14;
                                z11 = z15;
                                obj4 = null;
                                x.g.b(B, g, null, a2.h.f96b, 0.0f, i0Var3, 24632);
                                z12 = false;
                                i0Var3.p(false);
                            }
                            f14 = f10;
                            z14 = z10;
                            f15 = f11;
                            a9 = f3;
                            z15 = z11;
                            z13 = z12;
                        }
                        float f17 = a9;
                        boolean z16 = z14;
                        boolean z17 = z15;
                        boolean z18 = z13;
                        float f18 = f15;
                        i0Var3.p(z18);
                        i7.a.e(f14, null, 3.0f, i0Var3, 3072);
                        i7.a.k(aVar3, a.a.e0(w0.a(1.0f), 5.0f), i0Var3, 48);
                        d1.l e2 = tVar.e(b0.i.c(w0.f(a.a.e0(iVar, 6.0f), 0.1f * b10), 0.75f), dVar);
                        boolean z19 = aVar3.f5115i;
                        if (!z19 && z17) {
                            max = ((0.235f - max) * f18) + max;
                        } else if (z19) {
                            max = 0.235f;
                        }
                        i7.a.i(aVar3, b0.i.g(e2, max * b10, (0.43f - (z17 ? ((float) Math.sin(f18 * 3.141592653589793d)) * 0.14f : 0.0f)) * f17), i0Var3, 0);
                        float f19 = 0.055f * f17;
                        i7.a.f(b0.i.g(a.a.e0(tVar.e(w0.d(0.065f * b10), dVar), 10.0f), 0.06f * b10, f19), function06, i0Var3, 0);
                        float f20 = -(0.07f * b10);
                        i7.a.h(aVar3.f5108a, b0.i.g(tVar.e(a.a.e0(b0.i.c(w0.f(iVar, 0.13f * b10), 2.5f), 10.0f), d1.a.f3284i), f20, f19), i0Var3, 0);
                        i7.a.a(b0.i.g(a.a.e0(tVar.e(b0.i.c(w0.f(iVar, b10 * 0.16f), 2.3f), d1.a.f3290w), 10.0f), f20, -(f17 * 0.08f)), (z16 || aVar3.f5110c || z17 || aVar3.f5111d) ? false : true, function05, i0Var3, 0);
                        d1.l e02 = a.a.e0(iVar, 30.0f);
                        g0 d11 = p.d(dVar);
                        int hashCode2 = Long.hashCode(i0Var3.T);
                        x0.h l11 = i0Var3.l();
                        d1.l C2 = w.C(e02, i0Var3);
                        c2.g.f1541a.getClass();
                        z zVar2 = c2.f.f1533b;
                        i0Var3.Z();
                        if (i0Var3.S) {
                            i0Var3.k(zVar2);
                        } else {
                            i0Var3.j0();
                        }
                        n0.h.y(d11, c2.f.f1536e, i0Var3);
                        n0.h.y(l11, c2.f.f1535d, i0Var3);
                        n0.h.y(Integer.valueOf(hashCode2), c2.f.f1537f, i0Var3);
                        n0.h.t(i0Var3, c2.f.g);
                        n0.h.y(C2, c2.f.f1534c, i0Var3);
                        if (z16) {
                            i0Var3.W(-1273017784);
                            g8.b.h(function08, function07, i0Var3, 0);
                            i0Var3.p(false);
                        } else {
                            i0Var3.W(-1272864985);
                            i0Var3.p(false);
                        }
                        i0Var3.p(true);
                        i0Var3.p(true);
                    } else {
                        i0Var3.R();
                    }
                    return Unit.f5554a;
                }
            }, i0Var), i0Var2, 3078, 6);
        } else {
            aVar2 = aVar;
            function05 = function0;
            function06 = function02;
            function07 = function03;
            function08 = function04;
            i0Var2 = i0Var;
            i0Var2.R();
        }
        s1 r9 = i0Var2.r();
        if (r9 != null) {
            final j9.a aVar3 = aVar2;
            final Function0 function09 = function06;
            final Function0 function010 = function05;
            final Function0 function011 = function08;
            final Function0 function012 = function07;
            r9.f6812d = new Function2(function010, function09, function012, function011, i3) { // from class: n9.n

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ Function0 f7237e;

                /* renamed from: i, reason: collision with root package name */
                public final /* synthetic */ Function0 f7238i;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ Function0 f7239r;

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ Function0 f7240s;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int z10 = n0.h.z(1);
                    i7.a.b(j9.a.this, this.f7237e, this.f7238i, this.f7239r, this.f7240s, (n0.i0) obj, z10);
                    return Unit.f5554a;
                }
            };
        }
    }

    public static final void b0(i1.t tVar) {
        d1.k kVar;
        b1 b1Var;
        if (!tVar.f3305d.B) {
            z1.a.b("visitAncestors called on an unattached node");
        }
        d1.k kVar2 = tVar.f3305d.f3309s;
        c2.g0 u2 = c2.k.u(tVar);
        loop0: while (true) {
            kVar = null;
            if (u2 == null) {
                break;
            }
            if ((((d1.k) u2.S.g).f3308r & 1024) != 0) {
                while (kVar2 != null) {
                    if ((kVar2.f3307i & 1024) != 0) {
                        d1.k kVar3 = kVar2;
                        o0.e eVar = null;
                        while (kVar3 != null) {
                            if (kVar3 instanceof i1.t) {
                                kVar = kVar3;
                                break loop0;
                            }
                            if ((kVar3.f3307i & 1024) != 0 && (kVar3 instanceof c2.j)) {
                                int i3 = 0;
                                for (d1.k kVar4 = ((c2.j) kVar3).D; kVar4 != null; kVar4 = kVar4.f3310t) {
                                    if ((kVar4.f3307i & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            kVar3 = kVar4;
                                        } else {
                                            if (eVar == null) {
                                                eVar = new o0.e(new d1.k[16]);
                                            }
                                            if (kVar3 != null) {
                                                eVar.b(kVar3);
                                                kVar3 = null;
                                            }
                                            eVar.b(kVar4);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            kVar3 = c2.k.e(eVar);
                        }
                    }
                    kVar2 = kVar2.f3309s;
                }
            }
            u2 = u2.s();
            kVar2 = (u2 == null || (b1Var = u2.S) == null) ? null : (z1) b1Var.f1495f;
        }
        i1.t tVar2 = (i1.t) kVar;
        if (tVar2 == null) {
            tVar.L();
        } else {
            tVar2.L();
            tVar.L();
        }
    }

    public static final void c(Function0 function0, Function1 function1, n9.c cVar, n0.i0 i0Var, int i3) {
        n9.c cVar2;
        int i10;
        n9.c cVar3;
        Object obj;
        function0.getClass();
        function1.getClass();
        i0Var.X(691286382);
        int i11 = i3 | (i0Var.h(function0) ? 4 : 2) | (i0Var.h(function1) ? 32 : 16) | 128;
        if (i0Var.O(i11 & 1, (i11 & 147) != 146)) {
            i0Var.T();
            if ((i3 & 1) == 0 || i0Var.y()) {
                androidx.lifecycle.a1 a9 = l4.a.a(i0Var);
                if (a9 == null) {
                    i0.l("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    i10 = i11 & (-897);
                    cVar3 = (n9.c) w.L(c0.a(n9.c.class), a9.f(), e.n(a9), xe.b.a(i0Var));
                }
            } else {
                i0Var.R();
                i10 = i11 & (-897);
                cVar3 = cVar;
            }
            i0Var.q();
            z0 k10 = n0.h.k(cVar3.f7197d, i0Var);
            Object obj2 = (u) i0Var.j(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            Boolean valueOf = Boolean.valueOf(((j9.a) k10.getValue()).f5110c);
            boolean f3 = ((i10 & 112) == 32) | i0Var.f(k10);
            Object L = i0Var.L();
            Object obj3 = k.f6729a;
            if (f3 || L == obj3) {
                L = new a4.l(function1, k10, (ld.a) null);
                i0Var.g0(L);
            }
            n0.h.f(valueOf, (Function2) L, i0Var);
            boolean h10 = i0Var.h(cVar3) | i0Var.h(obj2);
            Object L2 = i0Var.L();
            if (h10 || L2 == obj3) {
                L2 = new l0(13, obj2, cVar3);
                i0Var.g0(L2);
            }
            n0.h.d(obj2, (Function1) L2, i0Var);
            boolean z10 = (((j9.a) k10.getValue()).f5110c || ((j9.a) k10.getValue()).f5111d) ? false : true;
            boolean f10 = i0Var.f(k10) | i0Var.h(cVar3);
            Object L3 = i0Var.L();
            if (f10 || L3 == obj3) {
                L3 = new a4.a(8, cVar3, k10);
                i0Var.g0(L3);
            }
            e.a(z10, (Function0) L3, i0Var, 0);
            j9.a aVar = (j9.a) k10.getValue();
            boolean h11 = i0Var.h(cVar3);
            Object L4 = i0Var.L();
            if (h11 || L4 == obj3) {
                obj = obj3;
                Object oVar = new d2.o(0, cVar3, n9.c.class, "onGoClick", "onGoClick()V", 0, 2);
                i0Var.g0(oVar);
                L4 = oVar;
            } else {
                obj = obj3;
            }
            Function0 function02 = (Function0) ((m) L4);
            boolean h12 = i0Var.h(cVar3);
            Object L5 = i0Var.L();
            if (h12 || L5 == obj) {
                Object oVar2 = new d2.o(0, cVar3, n9.c.class, "pauseGame", "pauseGame()V", 0, 3);
                i0Var.g0(oVar2);
                L5 = oVar2;
            }
            Function0 function03 = (Function0) ((m) L5);
            boolean h13 = i0Var.h(cVar3);
            Object L6 = i0Var.L();
            if (h13 || L6 == obj) {
                Object oVar3 = new d2.o(0, cVar3, n9.c.class, "resumeGame", "resumeGame()V", 0, 4);
                i0Var.g0(oVar3);
                L6 = oVar3;
            }
            Function0 function04 = (Function0) ((m) L6);
            boolean h14 = i0Var.h(cVar3) | ((i10 & 14) == 4);
            Object L7 = i0Var.L();
            if (h14 || L7 == obj) {
                L7 = new a4.a(9, cVar3, function0);
                i0Var.g0(L7);
            }
            b(aVar, function02, function03, function04, (Function0) L7, i0Var, 0);
            cVar2 = cVar3;
        } else {
            i0Var.R();
            cVar2 = cVar;
        }
        s1 r9 = i0Var.r();
        if (r9 != null) {
            r9.f6812d = new n9.l(function0, function1, cVar2, i3, 0);
        }
    }

    public static final void c0(Spannable spannable, long j, int i3, int i10) {
        if (j != 16) {
            spannable.setSpan(new ForegroundColorSpan(k1.v.r(j)), i3, i10, 33);
        }
    }

    public static final x2.e d(Context context) {
        float f3 = context.getResources().getConfiguration().fontScale;
        float f10 = context.getResources().getDisplayMetrics().density;
        y2.a a9 = y2.b.a(f3);
        if (a9 == null) {
            a9 = new x2.m(f3);
        }
        return new x2.e(f10, f3, a9);
    }

    public static final void d0(Spannable spannable, long j, x2.c cVar, int i3, int i10) {
        long b10 = n.b(j);
        if (o.a(b10, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(yd.c.a(cVar.I(j)), false), i3, i10, 33);
        } else if (o.a(b10, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(n.c(j)), i3, i10, 33);
        }
    }

    public static final void e(final float f3, final d1.l lVar, final float f10, n0.i0 i0Var, final int i3) {
        n0.i0 i0Var2;
        i0Var.X(-44650183);
        int i10 = (i0Var.d(R.drawable.troryar) ? 4 : 2) | i3 | (i0Var.c(f3) ? 32 : 16) | 384;
        int i11 = 1;
        if (i0Var.O(i10 & 1, (i10 & 1171) != 1170)) {
            i0Var2 = i0Var;
            i.a(a.a.e0(w0.a(1.0f), f10), null, x0.i.d(145225507, new n9.g(i11, f3), i0Var), i0Var2, 3072, 6);
            lVar = d1.i.f3304a;
        } else {
            i0Var2 = i0Var;
            i0Var2.R();
        }
        s1 r9 = i0Var2.r();
        if (r9 != null) {
            r9.f6812d = new Function2(f3, f10, i3, lVar) { // from class: n9.d

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ float f7206d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ d1.l f7207e;

                /* renamed from: i, reason: collision with root package name */
                public final /* synthetic */ float f7208i;

                {
                    this.f7207e = lVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int z10 = n0.h.z(3073);
                    i7.a.e(this.f7206d, this.f7207e, this.f7208i, (n0.i0) obj, z10);
                    return Unit.f5554a;
                }
            };
        }
    }

    public static final void e0(Spannable spannable, s2.b bVar, int i3, int i10) {
        if (bVar != null) {
            ArrayList arrayList = new ArrayList(kotlin.collections.z.j(bVar, 10));
            Iterator it = bVar.f8410d.iterator();
            while (it.hasNext()) {
                arrayList.add(((s2.a) it.next()).f8408a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            spannable.setSpan(new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length))), i3, i10, 33);
        }
    }

    public static final void f(d1.l lVar, Function0 function0, n0.i0 i0Var, int i3) {
        i0Var.X(688954409);
        int i10 = (i0Var.f(lVar) ? 4 : 2) | i3 | (i0Var.h(function0) ? 32 : 16);
        int i11 = 0;
        if (i0Var.O(i10 & 1, (i10 & 19) != 18)) {
            p1.b B = e.B(R.drawable.pause, i0Var, 0);
            Object L = i0Var.L();
            n0.e eVar = k.f6729a;
            if (L == eVar) {
                L = new z.f();
                i0Var.g0(L);
            }
            z.f fVar = (z.f) L;
            boolean z10 = (i10 & 112) == 32;
            Object L2 = i0Var.L();
            if (z10 || L2 == eVar) {
                L2 = new n9.j(i11, function0);
                i0Var.g0(L2);
            }
            g.b(B, g.d(lVar, fVar, null, false, null, (Function0) L2, 28), null, a2.h.f96b, 0.0f, i0Var, 24632);
        } else {
            i0Var.R();
        }
        s1 r9 = i0Var.r();
        if (r9 != null) {
            r9.f6812d = new n9.k(lVar, function0, i3, i11);
        }
    }

    public static void f0(c6.c cVar, float f3) {
        float f10;
        float f11;
        r.b bVar = (r.b) cVar.f1809e;
        r.a aVar = (r.a) cVar.f1810i;
        boolean useCompatPadding = aVar.getUseCompatPadding();
        boolean preventCornerOverlap = aVar.getPreventCornerOverlap();
        if (f3 != bVar.f8075e || bVar.f8076f != useCompatPadding || bVar.g != preventCornerOverlap) {
            bVar.f8075e = f3;
            bVar.f8076f = useCompatPadding;
            bVar.g = preventCornerOverlap;
            bVar.b(null);
            bVar.invalidateSelf();
        }
        if (!aVar.getUseCompatPadding()) {
            cVar.i(0, 0, 0, 0);
            return;
        }
        r.b bVar2 = (r.b) cVar.f1809e;
        float f12 = bVar2.f8075e;
        float f13 = bVar2.f8071a;
        if (aVar.getPreventCornerOverlap()) {
            f10 = (float) (((1.0d - r.c.f8080a) * f13) + f12);
        } else {
            int i3 = r.c.f8081b;
            f10 = f12;
        }
        int ceil = (int) Math.ceil(f10);
        if (aVar.getPreventCornerOverlap()) {
            f11 = (float) (((1.0d - r.c.f8080a) * f13) + (f12 * 1.5f));
        } else {
            f11 = f12 * 1.5f;
        }
        int ceil2 = (int) Math.ceil(f11);
        cVar.i(ceil, ceil2, ceil, ceil2);
    }

    public static final void g(j9.a aVar, d1.l lVar, n0.i0 i0Var, int i3) {
        d1.l lVar2;
        n0.i0 i0Var2;
        i0Var.X(370845908);
        int i10 = (i0Var.f(aVar) ? 4 : 2) | i3;
        if (i0Var.O(i10 & 1, (i10 & 19) != 18)) {
            lVar2 = lVar;
            i0Var2 = i0Var;
            i.a(lVar2, null, x0.i.d(-2013301826, new n9.e(aVar, 1), i0Var), i0Var2, 3078, 6);
        } else {
            lVar2 = lVar;
            i0Var2 = i0Var;
            i0Var2.R();
        }
        s1 r9 = i0Var2.r();
        if (r9 != null) {
            r9.f6812d = new n9.f(aVar, lVar2, i3, 1);
        }
    }

    public static final int g0(int i3) {
        if (i3 == 0) {
            throw null;
        }
        int b10 = a4.i.b(i3);
        if (b10 == 0) {
            return 0;
        }
        int i10 = 1;
        if (b10 != 1) {
            i10 = 2;
            if (b10 != 2) {
                i10 = 3;
                if (b10 != 3) {
                    i10 = 4;
                    if (b10 != 4) {
                        if (b10 == 5) {
                            return 5;
                        }
                        r.p();
                        return 0;
                    }
                }
            }
        }
        return i10;
    }

    public static final void h(int i3, d1.l lVar, n0.i0 i0Var, int i10) {
        n0.i0 i0Var2 = i0Var;
        i0Var2.X(-643989309);
        int i11 = i10 | (i0Var2.d(i3) ? 4 : 2) | (i0Var2.f(lVar) ? 32 : 16);
        if (i0Var2.O(i11 & 1, (i11 & 19) != 18)) {
            g0 d10 = p.d(d1.a.f3286s);
            int hashCode = Long.hashCode(i0Var2.T);
            x0.h l10 = i0Var2.l();
            d1.l C = w.C(lVar, i0Var);
            c2.g.f1541a.getClass();
            z zVar = c2.f.f1533b;
            i0Var2.Z();
            if (i0Var2.S) {
                i0Var2.k(zVar);
            } else {
                i0Var2.j0();
            }
            n0.h.y(d10, c2.f.f1536e, i0Var2);
            n0.h.y(l10, c2.f.f1535d, i0Var2);
            n0.h.y(Integer.valueOf(hashCode), c2.f.f1537f, i0Var2);
            n0.h.t(i0Var2, c2.f.g);
            n0.h.y(C, c2.f.f1534c, i0Var2);
            p1.b B = e.B(R.drawable.score, i0Var2, 0);
            d1.l a9 = w0.a(1.0f);
            a2.g gVar = a2.h.f98d;
            g.b(B, a9, null, gVar, 0.0f, i0Var2, 25016);
            float f3 = 30;
            g.b(e.B(R.drawable.record_icon, i0Var2, 0), i.c(i.h(-f3, 0.0f, 2, w0.a(0.2f)), 1.0f), null, gVar, 0.0f, i0Var2, 25016);
            a.a.b(String.valueOf(i3), v.c(25), i.h(f3, 0.0f, 2, d1.i.f3304a), u9.a.f9707i, u9.a.j, 4.0f, null, null, null, i0Var, 197040, 448);
            i0Var2 = i0Var;
            i0Var2.p(true);
        } else {
            i0Var2.R();
        }
        s1 r9 = i0Var2.r();
        if (r9 != null) {
            r9.f6812d = new n9.i(i3, lVar, i10, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object h0(int i3, Object obj, x xVar, s sVar, int i10) {
        Object[] objArr;
        Object[] objArr2;
        Typeface create;
        if (!(obj instanceof Typeface)) {
            return obj;
        }
        boolean z10 = false;
        int i11 = 0;
        z10 = false;
        if ((i3 & 1) != 0 && !Intrinsics.a(xVar.f7651a, sVar)) {
            s sVar2 = s.f7644r;
            if (sVar.compareTo(sVar2) >= 0 && Intrinsics.b(xVar.f7651a.f7648d, sVar2.f7648d) < 0) {
                objArr = true;
                if ((i3 & 2) != 0) {
                    xVar.getClass();
                    if (i10 != 0) {
                        objArr2 = true;
                        if (objArr2 == true && objArr != true) {
                            return obj;
                        }
                        if (Build.VERSION.SDK_INT >= 28) {
                            int i12 = objArr != false ? sVar.f7648d : xVar.f7651a.f7648d;
                            if (objArr2 != true) {
                                xVar.getClass();
                            } else if (i10 == 1) {
                                z10 = true;
                            }
                            create = Typeface.create((Typeface) obj, i12, z10);
                            return create;
                        }
                        Object[] objArr3 = objArr2 == true && i10 == 1;
                        if (objArr3 == true && objArr == true) {
                            i11 = 3;
                        } else if (objArr == true) {
                            i11 = 1;
                        } else if (objArr3 != false) {
                            i11 = 2;
                        }
                        return Typeface.create((Typeface) obj, i11);
                    }
                }
                objArr2 = false;
                if (objArr2 == true) {
                }
                if (Build.VERSION.SDK_INT >= 28) {
                }
            }
        }
        objArr = false;
        if ((i3 & 2) != 0) {
        }
        objArr2 = false;
        if (objArr2 == true) {
        }
        if (Build.VERSION.SDK_INT >= 28) {
        }
    }

    public static final void i(j9.a aVar, d1.l lVar, n0.i0 i0Var, int i3) {
        d1.l lVar2;
        n0.i0 i0Var2;
        i0Var.X(-1955868826);
        int i10 = 2;
        int i11 = (i0Var.f(aVar) ? 4 : 2) | i3 | (i0Var.f(lVar) ? 32 : 16);
        if (i0Var.O(i11 & 1, (i11 & 19) != 18)) {
            lVar2 = lVar;
            i0Var2 = i0Var;
            g.b(e.B(aVar.f5111d ? R.drawable.fall : aVar.f5112e ? R.drawable.up : R.drawable.chick, i0Var, 0), lVar2, null, a2.h.f96b, 0.0f, i0Var2, 24632 | ((i11 << 3) & 896));
        } else {
            lVar2 = lVar;
            i0Var2 = i0Var;
            i0Var2.R();
        }
        s1 r9 = i0Var2.r();
        if (r9 != null) {
            r9.f6812d = new n9.f(aVar, lVar2, i3, i10);
        }
    }

    public static final void j(float f3, d1.l lVar, n0.i0 i0Var, int i3) {
        n0.i0 i0Var2;
        i0Var.X(-1194963548);
        int i10 = (i0Var.d(R.drawable.gbg2) ? 4 : 2) | i3 | (i0Var.c(f3) ? 32 : 16) | 384;
        int i11 = 0;
        if (i0Var.O(i10 & 1, (i10 & 1171) != 1170)) {
            i0Var2 = i0Var;
            i.a(a.a.e0(w0.a(1.0f), 0.0f), null, x0.i.d(886948110, new n9.g(i11, f3), i0Var), i0Var2, 3072, 6);
            lVar = d1.i.f3304a;
        } else {
            i0Var2 = i0Var;
            i0Var2.R();
        }
        s1 r9 = i0Var2.r();
        if (r9 != null) {
            r9.f6812d = new n9.h(f3, lVar, i3, i11);
        }
    }

    public static final void k(j9.a aVar, d1.l lVar, n0.i0 i0Var, int i3) {
        d1.l lVar2;
        n0.i0 i0Var2;
        i0Var.X(-1752186082);
        int i10 = (i0Var.f(aVar) ? 4 : 2) | i3;
        if (i0Var.O(i10 & 1, (i10 & 19) != 18)) {
            lVar2 = lVar;
            i0Var2 = i0Var;
            i.a(lVar2, null, x0.i.d(-393047288, new n9.e(aVar, 0), i0Var), i0Var2, 3078, 6);
        } else {
            lVar2 = lVar;
            i0Var2 = i0Var;
            i0Var2.R();
        }
        s1 r9 = i0Var2.r();
        if (r9 != null) {
            r9.f6812d = new n9.f(aVar, lVar2, i3, 0);
        }
    }

    public static final q0.b l(q0.b bVar) {
        if (bVar == null) {
            bVar = null;
        }
        if (bVar != null) {
            return bVar;
        }
        n0.m.b("Inconsistent composition");
        throw new d();
    }

    public static String m(String str, int i3, int i10) {
        if (i3 < 0) {
            return e.y("%s (%s) must not be negative", str, Integer.valueOf(i3));
        }
        if (i10 >= 0) {
            return e.y("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i3), Integer.valueOf(i10));
        }
        StringBuilder sb2 = new StringBuilder(26);
        sb2.append("negative size: ");
        sb2.append(i10);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static void n(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    public static final LinkedHashSet o(byte[] bArr) {
        bArr.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bArr.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int readInt = objectInputStream.readInt();
                    for (int i3 = 0; i3 < readInt; i3++) {
                        Uri parse = Uri.parse(objectInputStream.readUTF());
                        boolean readBoolean = objectInputStream.readBoolean();
                        parse.getClass();
                        linkedHashSet.add(new t5.c(readBoolean, parse));
                    }
                    objectInputStream.close();
                } finally {
                }
            } catch (IOException e2) {
                e2.printStackTrace();
            }
            byteArrayInputStream.close();
            return linkedHashSet;
        } finally {
        }
    }

    public static final boolean p(ArrayList arrayList) {
        List list;
        long j;
        if (arrayList.size() >= 2) {
            if (arrayList.size() <= 1) {
                list = j0.f5574d;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Object obj = arrayList.get(0);
                int size = arrayList.size() - 1;
                int i3 = 0;
                while (i3 < size) {
                    i3++;
                    Object obj2 = arrayList.get(i3);
                    j2.m mVar = (j2.m) obj2;
                    j2.m mVar2 = (j2.m) obj;
                    float abs = Math.abs(Float.intBitsToFloat((int) (mVar2.g().a() >> 32)) - Float.intBitsToFloat((int) (mVar.g().a() >> 32)));
                    float abs2 = Math.abs(Float.intBitsToFloat((int) (mVar2.g().a() & 4294967295L)) - Float.intBitsToFloat((int) (mVar.g().a() & 4294967295L)));
                    arrayList2.add(new j1.b((Float.floatToRawIntBits(abs) << 32) | (Float.floatToRawIntBits(abs2) & 4294967295L)));
                    obj = obj2;
                }
                list = arrayList2;
            }
            if (list.size() == 1) {
                j = ((j1.b) CollectionsKt.x(list)).f4914a;
            } else {
                if (list.isEmpty()) {
                    z2.a.b("Empty collection can't be reduced.");
                }
                Object x10 = CollectionsKt.x(list);
                int size2 = list.size() - 1;
                if (1 <= size2) {
                    int i10 = 1;
                    while (true) {
                        x10 = new j1.b(j1.b.d(((j1.b) x10).f4914a, ((j1.b) list.get(i10)).f4914a));
                        if (i10 == size2) {
                            break;
                        }
                        i10++;
                    }
                }
                j = ((j1.b) x10).f4914a;
            }
            if (Float.intBitsToFloat((int) (4294967295L & j)) >= Float.intBitsToFloat((int) (j >> 32))) {
                return false;
            }
        }
        return true;
    }

    public static void t(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static void u(boolean z10, String str, Object obj) {
        if (z10) {
            return;
        }
        a1.e(e.y(str, obj));
    }

    public static void v(int i3, int i10) {
        String y3;
        if (i3 < 0 || i3 >= i10) {
            if (i3 < 0) {
                y3 = e.y("%s (%s) must not be negative", "index", Integer.valueOf(i3));
            } else {
                if (i10 < 0) {
                    StringBuilder sb2 = new StringBuilder(26);
                    sb2.append("negative size: ");
                    sb2.append(i10);
                    throw new IllegalArgumentException(sb2.toString());
                }
                y3 = e.y("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i3), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(y3);
        }
    }

    public static final void w(int i3, int i10) {
        if (i3 < 0 || i3 >= i10) {
            r.e(i3, i10, ", size: ", "index: ");
        }
    }

    public static void x(ListenableFuture listenableFuture, String str, Object obj) {
        if (listenableFuture != null) {
            return;
        }
        r.j(e.y(str, obj));
    }

    public static void y(Object obj, String str) {
        if (obj != null) {
            return;
        }
        r.j(str);
    }

    public static void z(Object obj, String str) {
        if (obj != null) {
            return;
        }
        r.j(str);
    }

    public abstract f8.f L(f8.r rVar);

    public abstract q M(f8.r rVar);

    public abstract void Y(q qVar, q qVar2);

    public abstract void Z(q qVar, Thread thread);

    public int hashCode() {
        switch (this.f4667a) {
            case 24:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    public abstract boolean q(f8.r rVar, f8.f fVar, f8.f fVar2);

    public abstract boolean r(f8.r rVar, Object obj, Object obj2);

    public abstract boolean s(f8.r rVar, q qVar, q qVar2);

    public String toString() {
        switch (this.f4667a) {
            case 24:
                String c10 = c0.a(getClass()).c();
                c10.getClass();
                return c10;
            default:
                return super.toString();
        }
    }
}
