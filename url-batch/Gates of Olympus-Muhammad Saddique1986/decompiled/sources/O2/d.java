package O2;

import B.C0006g;
import B.C0011l;
import B.C0014o;
import B.C0015p;
import B.C0016q;
import B.C0018t;
import B.C0019u;
import B.C0022x;
import B.InterfaceC0010k;
import B.InterfaceC0013n;
import B.U;
import B.X;
import B.a0;
import B.b0;
import B.c0;
import C0.C0026b;
import C0.C0031g;
import C0.H;
import C0.J;
import C0.K;
import C2.V;
import F.A1;
import F.B1;
import F.M;
import F.O;
import F.x1;
import G2.p;
import I.C0143d;
import I.C0159l;
import I.C0167p;
import I.C0173s0;
import I.C0184y;
import I.C0186z;
import I.InterfaceC0142c0;
import I.InterfaceC0164n0;
import I.X0;
import I0.z;
import R1.y;
import S1.u;
import U.q;
import a.AbstractC0235a;
import a0.C0238c;
import a0.C0239d;
import a0.C0241f;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.InterfaceC0292v;
import b.C0303G;
import b.InterfaceC0302F;
import b0.C0352v;
import b0.T;
import e2.InterfaceC0424c;
import e2.InterfaceC0426e;
import f2.v;
import h0.AbstractC0454G;
import h0.C0462e;
import h0.C0463f;
import h0.C0469l;
import h2.AbstractC0508a;
import java.io.Closeable;
import java.lang.reflect.InvocationTargetException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import k2.C0570b;
import k2.C0572d;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import l2.InterfaceC0601b;
import m1.C0645c;
import m1.r;
import m1.s;
import n.AbstractC0695v;
import n0.w;
import n2.AbstractC0737q;
import r.AbstractC0864k;
import r.AbstractC0868o;
import r.AbstractC0871s;
import r.C0850L;
import r.C0855b;
import r.C0861h;
import r.C0873u;
import r.P;
import r0.InterfaceC0885G;
import r0.InterfaceC0919p;
import s.C0937f;
import t0.AbstractC0993f;
import t0.C0995h;
import t0.C0996i;
import t0.C1001n;
import t0.C1006t;
import t0.InterfaceC0997j;
import x.N;
import x.Q;
import x.Z;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static C0463f f3890a;

    public static final long A(long j3, long j4) {
        return d(y((int) (j4 >> 32), O0.a.j(j3), O0.a.h(j3)), y((int) (j4 & 4294967295L), O0.a.i(j3), O0.a.g(j3)));
    }

    public static final long B(long j3, long j4) {
        return a(y(O0.a.j(j4), O0.a.j(j3), O0.a.h(j3)), y(O0.a.h(j4), O0.a.j(j3), O0.a.h(j3)), y(O0.a.i(j4), O0.a.i(j3), O0.a.g(j3)), y(O0.a.g(j4), O0.a.i(j3), O0.a.g(j3)));
    }

    public static final int C(long j3, int i3) {
        return y(i3, O0.a.i(j3), O0.a.g(j3));
    }

    public static final int D(long j3, int i3) {
        return y(i3, O0.a.j(j3), O0.a.h(j3));
    }

    public static final void E(int i3, int i4) {
        if (i3 <= i4) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i3 + ") is greater than size (" + i4 + ").");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static s F(Context context) {
        ProviderInfo providerInfo;
        G1.g gVar;
        ApplicationInfo applicationInfo;
        A1.i c0645c = Build.VERSION.SDK_INT >= 28 ? new C0645c(27, false) : new A1.i(27, false);
        PackageManager packageManager = context.getPackageManager();
        l0.c.m(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo != null) {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] n3 = c0645c.n(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : n3) {
                    arrayList.add(signature.toByteArray());
                }
                gVar = new G1.g(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e3) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e3);
            }
            if (gVar != null) {
                return null;
            }
            return new s(new r(context, gVar));
        }
        gVar = null;
        if (gVar != null) {
        }
    }

    public static Handler G(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Z0.c.a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException e3) {
            e = e3;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InstantiationException e4) {
            e = e4;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (NoSuchMethodException e5) {
            e = e5;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InvocationTargetException e6) {
            Throwable cause = e6.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static final long H(int i3, int i4, int i5, int i6) {
        int i7 = i6 == Integer.MAX_VALUE ? i5 : i6;
        int r3 = r(i7);
        int i8 = i4 == Integer.MAX_VALUE ? i3 : i4;
        int r4 = r(i8);
        if (r3 + r4 > 31) {
            throw new IllegalArgumentException("Can't represent a width of " + i8 + " and height of " + i7 + " in Constraints");
        }
        int i9 = i4 + 1;
        int i10 = i9 & (~(i9 >> 31));
        int i11 = i6 + 1;
        int i12 = i11 & (~(i11 >> 31));
        int i13 = 0;
        if (r4 != 13) {
            if (r4 == 18) {
                i13 = 3;
            } else if (r4 == 15) {
                i13 = 1;
            } else if (r4 == 16) {
                i13 = 2;
            }
        }
        int i14 = (((i13 & 2) >> 1) * 3) + ((i13 & 1) << 1);
        return (i10 << 33) | i13 | (i3 << 2) | (i5 << (i14 + 15)) | (i12 << (i14 + 46));
    }

    public static final H0.e I(Context context) {
        A1.i iVar = new A1.i(2, false);
        context.getApplicationContext();
        return new H0.e(iVar, new H0.a(Build.VERSION.SDK_INT >= 31 ? H0.l.f2602a.a(context) : 0));
    }

    public static final boolean K(int i3, int i4) {
        return i3 == i4;
    }

    public static final long L(long j3, boolean z3, int i3, float f3) {
        int h3 = ((z3 || AbstractC0235a.v(i3, 2)) && O0.a.d(j3)) ? O0.a.h(j3) : Integer.MAX_VALUE;
        if (O0.a.j(j3) != h3) {
            h3 = y(N.k(f3), O0.a.j(j3), h3);
        }
        int g3 = O0.a.g(j3);
        int min = Math.min(0, 262142);
        int min2 = h3 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(h3, 262142);
        int l3 = l(min2 == Integer.MAX_VALUE ? min : min2);
        return a(min, min2, Math.min(l3, 0), g3 != Integer.MAX_VALUE ? Math.min(l3, g3) : Integer.MAX_VALUE);
    }

    public static final String M(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static p N(String str) {
        f2.j.f(str, "<this>");
        Matcher matcher = p.f2224c.matcher(str);
        if (!matcher.lookingAt()) {
            throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
        }
        String group = matcher.group(1);
        f2.j.e(group, "typeSubtype.group(1)");
        Locale locale = Locale.US;
        f2.j.e(locale, "US");
        f2.j.e(group.toLowerCase(locale), "this as java.lang.String).toLowerCase(locale)");
        String group2 = matcher.group(2);
        f2.j.e(group2, "typeSubtype.group(2)");
        f2.j.e(group2.toLowerCase(locale), "this as java.lang.String).toLowerCase(locale)");
        ArrayList arrayList = new ArrayList();
        Matcher matcher2 = p.f2225d.matcher(str);
        int end = matcher.end();
        while (end < str.length()) {
            matcher2.region(end, str.length());
            if (!matcher2.lookingAt()) {
                StringBuilder sb = new StringBuilder("Parameter is not formatted correctly: \"");
                String substring = str.substring(end);
                f2.j.e(substring, "this as java.lang.String).substring(startIndex)");
                sb.append(substring);
                sb.append("\" for: \"");
                sb.append(str);
                sb.append('\"');
                throw new IllegalArgumentException(sb.toString().toString());
            }
            String group3 = matcher2.group(1);
            if (group3 == null) {
                end = matcher2.end();
            } else {
                String group4 = matcher2.group(2);
                if (group4 == null) {
                    group4 = matcher2.group(3);
                } else if (AbstractC0737q.z(group4, "'") && AbstractC0737q.r(group4, "'", false) && group4.length() > 2) {
                    group4 = group4.substring(1, group4.length() - 1);
                    f2.j.e(group4, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                arrayList.add(group3);
                arrayList.add(group4);
                end = matcher2.end();
            }
        }
        return new p(str, (String[]) arrayList.toArray(new String[0]));
    }

    public static final InterfaceC0601b O(SerialDescriptor serialDescriptor) {
        f2.j.f(serialDescriptor, "<this>");
        if (serialDescriptor instanceof A2.b) {
            ((A2.b) serialDescriptor).getClass();
            return null;
        }
        if (serialDescriptor instanceof V) {
            return O(((V) serialDescriptor).f725a);
        }
        return null;
    }

    public static final C0463f P() {
        C0463f c0463f = f3890a;
        if (c0463f != null) {
            return c0463f;
        }
        C0462e c0462e = new C0462e("Filled.Delete", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i3 = AbstractC0454G.f5881a;
        T t3 = new T(C0352v.f5434b);
        G2.k kVar = new G2.k(2);
        kVar.i(6.0f, 19.0f);
        kVar.e(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        kVar.f(8.0f);
        kVar.e(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        kVar.k(7.0f);
        ArrayList arrayList = kVar.f2203d;
        arrayList.add(new C0469l(6.0f));
        kVar.l(12.0f);
        kVar.c();
        kVar.i(19.0f, 4.0f);
        kVar.f(-3.5f);
        kVar.h(-1.0f, -1.0f);
        kVar.f(-5.0f);
        kVar.h(-1.0f, 1.0f);
        arrayList.add(new C0469l(5.0f));
        kVar.l(2.0f);
        kVar.f(14.0f);
        kVar.k(4.0f);
        kVar.c();
        C0462e.a(c0462e, arrayList, t3);
        C0463f b3 = c0462e.b();
        f3890a = b3;
        return b3;
    }

    public static Intent Q(Context context, ComponentName componentName) {
        String R2 = R(context, componentName);
        if (R2 == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), R2);
        return R(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public static String R(Context context, ComponentName componentName) {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    public static final C0031g S(z zVar) {
        C0031g c0031g = zVar.f3097a;
        c0031g.getClass();
        long j3 = zVar.f3098b;
        return c0031g.subSequence(J.e(j3), J.d(j3));
    }

    public static final C0031g U(z zVar, int i3) {
        C0031g c0031g = zVar.f3097a;
        long j3 = zVar.f3098b;
        return c0031g.subSequence(J.d(j3), Math.min(J.d(j3) + i3, zVar.f3097a.f596a.length()));
    }

    public static final C0031g V(z zVar, int i3) {
        C0031g c0031g = zVar.f3097a;
        long j3 = zVar.f3098b;
        return c0031g.subSequence(Math.max(0, J.e(j3) - i3), J.e(j3));
    }

    public static final boolean W(a0 a0Var, boolean z3) {
        InterfaceC0919p c2;
        Q q3 = a0Var.f345d;
        if (q3 == null || (c2 = q3.c()) == null) {
            return false;
        }
        C0239d a02 = AbstractC0508a.a0(c2);
        long i3 = a0Var.i(z3);
        float d3 = C0238c.d(i3);
        if (a02.f4724a > d3 || d3 > a02.f4726c) {
            return false;
        }
        float e3 = C0238c.e(i3);
        return a02.f4725b <= e3 && e3 <= a02.f4727d;
    }

    public static boolean X() {
        return e.f3891d;
    }

    public static final long Y(int i3, int i4, long j3) {
        int j4 = O0.a.j(j3) + i3;
        if (j4 < 0) {
            j4 = 0;
        }
        int h3 = O0.a.h(j3);
        if (h3 != Integer.MAX_VALUE && (h3 = h3 + i3) < 0) {
            h3 = 0;
        }
        int i5 = O0.a.i(j3) + i4;
        if (i5 < 0) {
            i5 = 0;
        }
        int g3 = O0.a.g(j3);
        if (g3 != Integer.MAX_VALUE) {
            int i6 = g3 + i4;
            g3 = i6 >= 0 ? i6 : 0;
        }
        return a(j4, h3, i5, g3);
    }

    public static /* synthetic */ long Z(long j3, int i3, int i4, int i5) {
        if ((i5 & 1) != 0) {
            i3 = 0;
        }
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        return Y(i3, i4, j3);
    }

    public static final long a(int i3, int i4, int i5, int i6) {
        boolean z3 = false;
        if (!(i4 >= i3)) {
            AbstractC0508a.X("maxWidth(" + i4 + ") must be >= than minWidth(" + i3 + ')');
            throw null;
        }
        if (!(i6 >= i5)) {
            AbstractC0508a.X("maxHeight(" + i6 + ") must be >= than minHeight(" + i5 + ')');
            throw null;
        }
        if (i3 >= 0 && i5 >= 0) {
            z3 = true;
        }
        if (z3) {
            return H(i3, i4, i5, i6);
        }
        AbstractC0508a.X("minWidth(" + i3 + ") and minHeight(" + i5 + ") must be >= 0");
        throw null;
    }

    public static C0011l a0(String str) {
        int i3;
        String str2;
        f2.j.f(str, "statusLine");
        boolean z3 = AbstractC0737q.z(str, "HTTP/1.");
        G2.s sVar = G2.s.f2273e;
        if (z3) {
            i3 = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int charAt = str.charAt(7) - '0';
            if (charAt != 0) {
                if (charAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                sVar = G2.s.f2274f;
            }
        } else {
            if (!AbstractC0737q.z(str, "ICY ")) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            i3 = 4;
        }
        int i4 = i3 + 3;
        if (str.length() < i4) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        try {
            String substring = str.substring(i3, i4);
            f2.j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            int parseInt = Integer.parseInt(substring);
            if (str.length() <= i4) {
                str2 = "";
            } else {
                if (str.charAt(i4) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                str2 = str.substring(i3 + 4);
                f2.j.e(str2, "this as java.lang.String).substring(startIndex)");
            }
            return new C0011l(sVar, parseInt, str2);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }

    public static /* synthetic */ long b(int i3, int i4, int i5) {
        if ((i5 & 2) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        if ((i5 & 8) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        return a(0, i3, 0, i4);
    }

    public static final void c(Q1.g gVar, C0167p c0167p, int i3) {
        int i4;
        Double valueOf;
        final double d3;
        Object z3;
        boolean z4;
        boolean z5;
        Object G3;
        int i5 = 4;
        c0167p.S(678453656);
        if ((i3 & 6) == 0) {
            i4 = (c0167p.h(gVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i4 & 3) == 2 && c0167p.x()) {
            c0167p.L();
        } else {
            final InterfaceC0142c0 i6 = AbstractC0695v.i(gVar.f3978b, c0167p);
            Iterator it = ((J1.c) i6.getValue()).f3174h.iterator();
            if (it.hasNext()) {
                double d4 = ((J1.e) it.next()).f3184c;
                while (it.hasNext()) {
                    d4 = Math.max(d4, ((J1.e) it.next()).f3184c);
                }
                valueOf = Double.valueOf(d4);
            } else {
                valueOf = null;
            }
            if (valueOf != null) {
                Double d5 = valueOf.doubleValue() > 0.0d ? valueOf : null;
                if (d5 != null) {
                    d3 = d5.doubleValue();
                    q c2 = androidx.compose.foundation.layout.c.c(U.n.f4488a, 1.0f);
                    float f3 = 16;
                    C0850L c0850l = new C0850L(f3, f3, f3, f3);
                    C0855b c0855b = AbstractC0864k.f8051a;
                    C0861h c0861h = new C0861h(12);
                    c0167p.Q(751196604);
                    boolean f4 = c0167p.f(i6);
                    z3 = c0167p.z();
                    if ((z3 instanceof Double) || d3 != ((Number) z3).doubleValue()) {
                        c0167p.b0(Double.valueOf(d3));
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    z5 = f4 | z4;
                    G3 = c0167p.G();
                    if (!z5 || G3 == C0159l.f2829a) {
                        G3 = new InterfaceC0424c() { // from class: O1.v
                            @Override // e2.InterfaceC0424c
                            public final Object n(Object obj) {
                                C0937f c0937f = (C0937f) obj;
                                f2.j.f(c0937f, "$this$LazyColumn");
                                InterfaceC0142c0 interfaceC0142c0 = InterfaceC0142c0.this;
                                C0937f.a(c0937f, new Q.a(1839760172, new x(interfaceC0142c0, 0), true));
                                C0937f.a(c0937f, new Q.a(-1631077981, new x(interfaceC0142c0, 1), true));
                                C0937f.a(c0937f, new Q.a(840702052, new x(interfaceC0142c0, 3), true));
                                C0937f.a(c0937f, r.f3852a);
                                if (((J1.c) interfaceC0142c0.getValue()).f3174h.isEmpty()) {
                                    C0937f.a(c0937f, r.f3853b);
                                } else {
                                    List list = ((J1.c) interfaceC0142c0.getValue()).f3174h;
                                    A2.i iVar = new A2.i(6);
                                    c0937f.f8229a.a(list.size(), new G1.m(new C0022x(iVar, 13, list), new l(2, list), new Q.a(-632812321, new y(list, d3), true)));
                                }
                                return R1.y.f4171a;
                            }
                        };
                        c0167p.a0(G3);
                    }
                    c0167p.p(false);
                    AbstractC0695v.a(c2, null, c0850l, false, c0861h, null, null, false, (InterfaceC0424c) G3, c0167p, 24966);
                }
            }
            d3 = 1.0d;
            q c22 = androidx.compose.foundation.layout.c.c(U.n.f4488a, 1.0f);
            float f32 = 16;
            C0850L c0850l2 = new C0850L(f32, f32, f32, f32);
            C0855b c0855b2 = AbstractC0864k.f8051a;
            C0861h c0861h2 = new C0861h(12);
            c0167p.Q(751196604);
            boolean f42 = c0167p.f(i6);
            z3 = c0167p.z();
            if (z3 instanceof Double) {
            }
            c0167p.b0(Double.valueOf(d3));
            z4 = true;
            z5 = f42 | z4;
            G3 = c0167p.G();
            if (!z5) {
            }
            G3 = new InterfaceC0424c() { // from class: O1.v
                @Override // e2.InterfaceC0424c
                public final Object n(Object obj) {
                    C0937f c0937f = (C0937f) obj;
                    f2.j.f(c0937f, "$this$LazyColumn");
                    InterfaceC0142c0 interfaceC0142c0 = InterfaceC0142c0.this;
                    C0937f.a(c0937f, new Q.a(1839760172, new x(interfaceC0142c0, 0), true));
                    C0937f.a(c0937f, new Q.a(-1631077981, new x(interfaceC0142c0, 1), true));
                    C0937f.a(c0937f, new Q.a(840702052, new x(interfaceC0142c0, 3), true));
                    C0937f.a(c0937f, r.f3852a);
                    if (((J1.c) interfaceC0142c0.getValue()).f3174h.isEmpty()) {
                        C0937f.a(c0937f, r.f3853b);
                    } else {
                        List list = ((J1.c) interfaceC0142c0.getValue()).f3174h;
                        A2.i iVar = new A2.i(6);
                        c0937f.f8229a.a(list.size(), new G1.m(new C0022x(iVar, 13, list), new l(2, list), new Q.a(-632812321, new y(list, d3), true)));
                    }
                    return R1.y.f4171a;
                }
            };
            c0167p.a0(G3);
            c0167p.p(false);
            AbstractC0695v.a(c22, null, c0850l2, false, c0861h2, null, null, false, (InterfaceC0424c) G3, c0167p, 24966);
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new M1.c(i3, i5, gVar);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v0 ??, still in use, count: 1, list:
          (r8v0 ?? I:java.lang.Object) from 0x004f: INVOKE (r12v0 ?? I:I.p), (r8v0 ?? I:java.lang.Object) VIRTUAL call: I.p.a0(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:80)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public static final java.lang.Object c0(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v0 ??, still in use, count: 1, list:
          (r8v0 ?? I:java.lang.Object) from 0x004f: INVOKE (r12v0 ?? I:I.p), (r8v0 ?? I:java.lang.Object) VIRTUAL call: I.p.a0(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:80)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r9v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    public static final long d(int i3, int i4) {
        return (i4 & 4294967295L) | (i3 << 32);
    }

    public static final void d0(Object[] objArr, int i3, int i4) {
        f2.j.f(objArr, "<this>");
        while (i3 < i4) {
            objArr[i3] = null;
            i3++;
        }
    }

    public static C0026b e(String str, K k3, long j3, O0.b bVar, H0.d dVar, u uVar, int i3, int i4) {
        int i5 = i4 & 32;
        u uVar2 = u.f4320d;
        return new C0026b(new K0.c(str, k3, i5 != 0 ? uVar2 : uVar, uVar2, dVar, bVar), i3, false, j3);
    }

    public static C0570b e0(C0572d c0572d, int i3) {
        f2.j.f(c0572d, "<this>");
        boolean z3 = i3 > 0;
        Integer valueOf = Integer.valueOf(i3);
        if (z3) {
            if (c0572d.f6421f <= 0) {
                i3 = -i3;
            }
            return new C0570b(c0572d.f6419d, c0572d.f6420e, i3);
        }
        throw new IllegalArgumentException("Step must be positive, was: " + valueOf + '.');
    }

    public static final void f(boolean z3, InterfaceC0426e interfaceC0426e, C0167p c0167p, int i3) {
        int i4;
        c0167p.S(-642000585);
        if ((i3 & 6) == 0) {
            i4 = (c0167p.g(z3) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0167p.f(interfaceC0426e) ? 32 : 16;
        }
        if ((i4 & 19) == 18 && c0167p.x()) {
            c0167p.L();
        } else {
            InterfaceC0142c0 N3 = C0143d.N(interfaceC0426e, c0167p);
            c0167p.R(-723524056);
            c0167p.R(-3687241);
            Object G3 = c0167p.G();
            Object obj = C0159l.f2829a;
            if (G3 == obj) {
                Object c0184y = new C0184y(C0143d.z(c0167p));
                c0167p.a0(c0184y);
                G3 = c0184y;
            }
            c0167p.p(false);
            v2.c cVar = ((C0184y) G3).f2968d;
            c0167p.p(false);
            c0167p.R(-1071578902);
            Object G4 = c0167p.G();
            Object obj2 = G4;
            if (G4 == obj) {
                InterfaceC0426e interfaceC0426e2 = (InterfaceC0426e) N3.getValue();
                c.f fVar = new c.f(z3);
                fVar.f5455d = cVar;
                fVar.f5456e = interfaceC0426e2;
                c0167p.a0(fVar);
                obj2 = fVar;
            }
            c.f fVar2 = (c.f) obj2;
            c0167p.p(false);
            Object obj3 = (InterfaceC0426e) N3.getValue();
            c0167p.R(-1071578713);
            boolean f3 = c0167p.f(obj3) | c0167p.f(cVar);
            Object G5 = c0167p.G();
            if (f3 || G5 == obj) {
                fVar2.f5456e = (InterfaceC0426e) N3.getValue();
                fVar2.f5455d = cVar;
                c0167p.a0(y.f4171a);
            }
            c0167p.p(false);
            Boolean valueOf = Boolean.valueOf(z3);
            c0167p.R(-1071578541);
            boolean f4 = c0167p.f(fVar2) | c0167p.g(z3);
            Object G6 = c0167p.G();
            Object obj4 = null;
            if (f4 || G6 == obj) {
                G6 = new c.g(fVar2, z3, null);
                c0167p.a0(G6);
            }
            c0167p.p(false);
            C0143d.e(c0167p, (InterfaceC0426e) G6, valueOf);
            C0186z c0186z = c.c.f5447a;
            c0167p.R(-2068013981);
            InterfaceC0302F interfaceC0302F = (InterfaceC0302F) c0167p.k(c.c.f5447a);
            c0167p.R(1680121597);
            if (interfaceC0302F == null) {
                View view = (View) c0167p.k(AndroidCompositionLocals_androidKt.f4942f);
                f2.j.f(view, "<this>");
                interfaceC0302F = (InterfaceC0302F) m2.h.S(m2.h.U(m2.h.T(view, C0303G.f5275g), C0303G.f5276h));
            }
            c0167p.p(false);
            if (interfaceC0302F == null) {
                Context context = (Context) c0167p.k(AndroidCompositionLocals_androidKt.f4938b);
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    }
                    if (context instanceof InterfaceC0302F) {
                        obj4 = context;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                }
                interfaceC0302F = (InterfaceC0302F) obj4;
            }
            c0167p.p(false);
            if (interfaceC0302F == null) {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
            }
            Object b3 = interfaceC0302F.b();
            Object obj5 = (InterfaceC0292v) c0167p.k(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            c0167p.R(-1071578150);
            boolean f5 = c0167p.f(b3) | c0167p.f(obj5) | c0167p.f(fVar2);
            Object G7 = c0167p.G();
            if (f5 || G7 == obj) {
                G7 = new R.h(b3, obj5, fVar2, 3);
                c0167p.a0(G7);
            }
            c0167p.p(false);
            C0143d.d(obj5, b3, (InterfaceC0424c) G7, c0167p);
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new c.h(z3, interfaceC0426e, i3);
        }
    }

    public static final long f0(long j3) {
        return AbstractC0235a.e((int) (j3 >> 32), (int) (j3 & 4294967295L));
    }

    public static final C0239d g(long j3, long j4) {
        return new C0239d(C0238c.d(j3), C0238c.e(j3), C0241f.d(j4) + C0238c.d(j3), C0241f.b(j4) + C0238c.e(j3));
    }

    public static C0572d g0(int i3, int i4) {
        if (i4 > Integer.MIN_VALUE) {
            return new C0572d(i3, i4 - 1, 1);
        }
        C0572d c0572d = C0572d.f6426g;
        return C0572d.f6426g;
    }

    public static final void h(final J1.e eVar, final double d3, C0167p c0167p, final int i3) {
        int i4;
        int i5;
        c0167p.S(1873784284);
        if ((i3 & 6) == 0) {
            i4 = (c0167p.f(eVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            Object z3 = c0167p.z();
            if ((z3 instanceof Double) && d3 == ((Number) z3).doubleValue()) {
                i5 = 16;
            } else {
                c0167p.b0(Double.valueOf(d3));
                i5 = 32;
            }
            i4 |= i5;
        }
        if ((i4 & 19) == 18 && c0167p.x()) {
            c0167p.L();
        } else {
            U.n nVar = U.n.f4488a;
            q c2 = androidx.compose.foundation.layout.c.c(nVar, 1.0f);
            C0873u a3 = AbstractC0871s.a(AbstractC0864k.f8053c, c0167p, 0);
            int i6 = c0167p.f2864P;
            InterfaceC0164n0 m3 = c0167p.m();
            q d4 = U.a.d(c0167p, c2);
            InterfaceC0997j.f8759c.getClass();
            C1001n c1001n = C0996i.f8754b;
            c0167p.U();
            if (c0167p.f2863O) {
                c0167p.l(c1001n);
            } else {
                c0167p.d0();
            }
            C0995h c0995h = C0996i.f8757e;
            C0143d.R(c0167p, c0995h, a3);
            C0995h c0995h2 = C0996i.f8756d;
            C0143d.R(c0167p, c0995h2, m3);
            C0995h c0995h3 = C0996i.f8758f;
            if (c0167p.f2863O || !f2.j.a(c0167p.G(), Integer.valueOf(i6))) {
                A.k.o(i6, c0167p, i6, c0995h3);
            }
            C0995h c0995h4 = C0996i.f8755c;
            C0143d.R(c0167p, c0995h4, d4);
            q c3 = androidx.compose.foundation.layout.c.c(nVar, 1.0f);
            r.Q a4 = P.a(AbstractC0864k.f8056f, U.b.f4470m, c0167p, 6);
            int i7 = c0167p.f2864P;
            InterfaceC0164n0 m4 = c0167p.m();
            q d5 = U.a.d(c0167p, c3);
            c0167p.U();
            if (c0167p.f2863O) {
                c0167p.l(c1001n);
            } else {
                c0167p.d0();
            }
            C0143d.R(c0167p, c0995h, a4);
            C0143d.R(c0167p, c0995h2, m4);
            if (c0167p.f2863O || !f2.j.a(c0167p.G(), Integer.valueOf(i7))) {
                A.k.o(i7, c0167p, i7, c0995h3);
            }
            C0143d.R(c0167p, c0995h4, d5);
            String str = eVar.f3182a + " (" + eVar.f3183b + ")";
            X0 x02 = B1.f1124a;
            x1.b(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((A1) c0167p.k(x02)).f1110k, c0167p, 0, 0, 65534);
            double d6 = eVar.f3184c;
            x1.b(M1.b.a(d6), null, 0L, 0L, null, H0.k.f2599h, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((A1) c0167p.k(x02)).f1110k, c0167p, 196608, 0, 65502);
            c0167p.p(true);
            float f3 = 8;
            float f4 = 4;
            q u3 = AbstractC0508a.u(androidx.compose.foundation.layout.b.i(androidx.compose.foundation.layout.c.d(androidx.compose.foundation.layout.c.c(nVar, 1.0f), f3), 0.0f, 2, 0.0f, 13), w.e.a(f4));
            X0 x03 = O.f1301a;
            long j3 = ((M) c0167p.k(x03)).f1255r;
            A1.i iVar = b0.M.f5355a;
            q a5 = androidx.compose.foundation.a.a(u3, j3, iVar);
            InterfaceC0885G e3 = AbstractC0868o.e(U.b.f4461d, false);
            int i8 = c0167p.f2864P;
            InterfaceC0164n0 m5 = c0167p.m();
            q d7 = U.a.d(c0167p, a5);
            c0167p.U();
            if (c0167p.f2863O) {
                c0167p.l(c1001n);
            } else {
                c0167p.d0();
            }
            C0143d.R(c0167p, c0995h, e3);
            C0143d.R(c0167p, c0995h2, m5);
            if (c0167p.f2863O || !f2.j.a(c0167p.G(), Integer.valueOf(i8))) {
                A.k.o(i8, c0167p, i8, c0995h3);
            }
            C0143d.R(c0167p, c0995h4, d7);
            AbstractC0868o.a(androidx.compose.foundation.a.a(AbstractC0508a.u(androidx.compose.foundation.layout.c.d(androidx.compose.foundation.layout.c.c(nVar, x((float) (d6 / d3), 0.02f, 1.0f)), f3), w.e.a(f4)), ((M) c0167p.k(x03)).f1238a, iVar), c0167p, 0);
            c0167p.p(true);
            c0167p.p(true);
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new InterfaceC0426e() { // from class: O1.w
                @Override // e2.InterfaceC0426e
                public final Object h(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int U3 = C0143d.U(i3 | 1);
                    O2.d.h(J1.e.this, d3, (C0167p) obj, U3);
                    return R1.y.f4171a;
                }
            };
        }
    }

    public static final void i(boolean z3, N0.h hVar, a0 a0Var, C0167p c0167p, int i3) {
        int i4;
        c0167p.S(-1344558920);
        if ((i3 & 6) == 0) {
            i4 = (c0167p.g(z3) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0167p.f(hVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= c0167p.h(a0Var) ? 256 : 128;
        }
        if ((i4 & 147) == 146 && c0167p.x()) {
            c0167p.L();
        } else {
            int i5 = i4 & 14;
            boolean f3 = (i5 == 4) | c0167p.f(a0Var);
            Object G3 = c0167p.G();
            Object obj = C0159l.f2829a;
            if (f3 || G3 == obj) {
                G3 = new X(a0Var, z3);
                c0167p.a0(G3);
            }
            Z z4 = (Z) G3;
            boolean h3 = c0167p.h(a0Var) | (i5 == 4);
            Object G4 = c0167p.G();
            if (h3 || G4 == obj) {
                G4 = new b0(a0Var, z3);
                c0167p.a0(G4);
            }
            InterfaceC0013n interfaceC0013n = (InterfaceC0013n) G4;
            boolean f4 = J.f(a0Var.j().f3098b);
            U.n nVar = U.n.f4488a;
            boolean h4 = c0167p.h(z4);
            Object G5 = c0167p.G();
            if (h4 || G5 == obj) {
                G5 = new c0(z4, null);
                c0167p.a0(G5);
            }
            AbstractC0508a.h(interfaceC0013n, z3, hVar, f4, 0L, w.a(nVar, z4, (InterfaceC0426e) G5), c0167p, (i4 << 3) & 1008);
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new C0006g(z3, hVar, a0Var, i3);
        }
    }

    public static final C0016q j(U u3, InterfaceC0010k interfaceC0010k) {
        boolean z3 = u3.d() == 1;
        C0014o c0014o = (C0014o) u3.f320d;
        return new C0016q(p(c0014o, z3, true, interfaceC0010k), p(c0014o, z3, false, interfaceC0010k), z3);
    }

    public static final boolean k(X.e eVar, long j3) {
        if (!eVar.f4489d.f4501p) {
            return false;
        }
        C1006t c1006t = (C1006t) AbstractC0993f.t(eVar).f8561y.f2912c;
        if (!c1006t.f8789M.f4501p) {
            return false;
        }
        long j4 = c1006t.f8128f;
        long N3 = c1006t.N(0L);
        float d3 = C0238c.d(N3);
        float e3 = C0238c.e(N3);
        float f3 = ((int) (j4 >> 32)) + d3;
        float f4 = ((int) (j4 & 4294967295L)) + e3;
        float d4 = C0238c.d(j3);
        if (d3 > d4 || d4 > f3) {
            return false;
        }
        float e4 = C0238c.e(j3);
        return e3 <= e4 && e4 <= f4;
    }

    public static final int l(int i3) {
        if (i3 < 8191) {
            return 262142;
        }
        if (i3 < 32767) {
            return 65534;
        }
        if (i3 < 65535) {
            return 32766;
        }
        if (i3 < 262143) {
            return 8190;
        }
        throw new IllegalArgumentException(A.k.g(i3, "Can't represent a size of ", " in Constraints"));
    }

    public static final boolean m(Object[] objArr, int i3, int i4, List list) {
        if (i4 != list.size()) {
            return false;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            if (!f2.j.a(objArr[i3 + i5], list.get(i5))) {
                return false;
            }
        }
        return true;
    }

    public static final String n(Object[] objArr, int i3, int i4, S1.f fVar) {
        StringBuilder sb = new StringBuilder((i4 * 3) + 2);
        sb.append("[");
        for (int i5 = 0; i5 < i4; i5++) {
            if (i5 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i3 + i5];
            if (obj == fVar) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        String sb2 = sb.toString();
        f2.j.e(sb2, "toString(...)");
        return sb2;
    }

    public static final C0015p o(U u3, C0014o c0014o, C0015p c0015p) {
        boolean z3 = u3.f318b;
        int i3 = c0014o.f429c;
        int i4 = c0014o.f428b;
        int i5 = z3 ? i4 : i3;
        R1.g gVar = R1.g.f4148e;
        R1.f c2 = R1.a.c(gVar, new C0019u(c0014o, i5));
        R1.f c3 = R1.a.c(gVar, new C0018t(c0014o, i5, z3 ? i3 : i4, u3, c2));
        if (1 != c0015p.f434c) {
            return (C0015p) c3.getValue();
        }
        int i6 = c0014o.f430d;
        if (i5 == i6) {
            return c0015p;
        }
        H h3 = (H) c0014o.f431e;
        if (((Number) c2.getValue()).intValue() != h3.e(i6)) {
            return (C0015p) c3.getValue();
        }
        int i7 = c0015p.f433b;
        long k3 = h3.k(i7);
        if (i6 != -1) {
            if (i5 != i6) {
                if (!(z3 ^ (i4 >= i3 && i4 > i3))) {
                }
            }
            return c0014o.a(i5);
        }
        int i8 = J.f568c;
        return (i7 == ((int) (k3 >> 32)) || i7 == ((int) (4294967295L & k3))) ? (C0015p) c3.getValue() : c0014o.a(i5);
    }

    public static final C0015p p(C0014o c0014o, boolean z3, boolean z4, InterfaceC0010k interfaceC0010k) {
        long j3;
        long a3 = interfaceC0010k.a(c0014o, z4 ? c0014o.f428b : c0014o.f429c);
        if (z3 ^ z4) {
            int i3 = J.f568c;
            j3 = a3 >> 32;
        } else {
            int i4 = J.f568c;
            j3 = 4294967295L & a3;
        }
        return c0014o.a((int) j3);
    }

    public static final E2.m q(Decoder decoder) {
        f2.j.f(decoder, "<this>");
        E2.m mVar = decoder instanceof E2.m ? (E2.m) decoder : null;
        if (mVar != null) {
            return mVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + v.a(decoder.getClass()));
    }

    public static final int r(int i3) {
        if (i3 < 8191) {
            return 13;
        }
        if (i3 < 32767) {
            return 15;
        }
        if (i3 < 65535) {
            return 16;
        }
        return i3 < 262143 ? 18 : 255;
    }

    public static final C0015p s(C0015p c0015p, C0014o c0014o, int i3) {
        return new C0015p(((H) c0014o.f431e).a(i3), i3, c0015p.f434c);
    }

    public static final void t(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                R1.a.a(th, th2);
            }
        }
    }

    public static float u(float f3, float f4) {
        return f3 < f4 ? f4 : f3;
    }

    public static float v(float f3, float f4) {
        return f3 > f4 ? f4 : f3;
    }

    public static double w(double d3, double d4, double d5) {
        if (d4 <= d5) {
            return d3 < d4 ? d4 : d3 > d5 ? d5 : d3;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d5 + " is less than minimum " + d4 + '.');
    }

    public static float x(float f3, float f4, float f5) {
        if (f4 <= f5) {
            return f3 < f4 ? f4 : f3 > f5 ? f5 : f3;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f5 + " is less than minimum " + f4 + '.');
    }

    public static int y(int i3, int i4, int i5) {
        if (i4 <= i5) {
            return i3 < i4 ? i4 : i3 > i5 ? i5 : i3;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i5 + " is less than minimum " + i4 + '.');
    }

    public static long z(long j3, long j4, long j5) {
        if (j4 <= j5) {
            return j3 < j4 ? j4 : j3 > j5 ? j5 : j3;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j5 + " is less than minimum " + j4 + '.');
    }

    public abstract Intent J(Context context, Object obj);

    public A1.i T(Context context, Object obj) {
        f2.j.f(context, "context");
        return null;
    }

    public abstract Object b0(Intent intent, int i3);
}
