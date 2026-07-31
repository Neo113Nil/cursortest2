package a;

import A2.j;
import A2.v;
import B0.C;
import B0.l;
import B2.c;
import C0.B;
import C0.D;
import D0.d;
import F.H0;
import F.J;
import F.L;
import F.U0;
import F.X0;
import F.a1;
import F.b1;
import F2.h;
import G1.k;
import H1.y;
import H2.AbstractC0080b;
import I.C0089d;
import I.C0113p;
import I.C0119s0;
import I.InterfaceC0088c0;
import I.InterfaceC0110n0;
import I.Y0;
import M0.b;
import M0.m;
import N2.C0147c;
import N2.C0148d;
import N2.C0150f;
import N2.E;
import N2.F;
import N2.t;
import N2.z;
import Q.f;
import Q0.g;
import Z1.i;
import a1.AbstractC0182u;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.Process;
import android.text.Layout;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.util.Size;
import android.util.SizeF;
import android.view.View;
import android.view.Window;
import b0.AbstractC0259J;
import b0.C0288u;
import e2.AbstractC0381e;
import h0.C0425f;
import h2.AbstractC0439a;
import h2.AbstractC0447i;
import h2.AbstractC0454p;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.net.IDN;
import java.net.InetAddress;
import java.net.ProtocolException;
import java.net.Socket;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import r.AbstractC0801M;
import r.AbstractC0813j;
import r.AbstractC0821s;
import r.C0802N;
import r.C0807d;
import r.C0810g;
import r.C0823u;
import t0.C0900h;
import t0.C0901i;
import t0.C0906n;
import t0.InterfaceC0902j;
import x.C1050d;
import x.e;

/* renamed from: a.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0157a {

    /* renamed from: a, reason: collision with root package name */
    public static C0425f f3482a;

    public AbstractC0157a() {
        new ConcurrentHashMap();
    }

    public static final int A(int i3, List list) {
        int size = list.size() - 1;
        int i4 = 0;
        while (i4 <= size) {
            int i5 = (i4 + size) >>> 1;
            l lVar = (l) list.get(i5);
            char c3 = lVar.f279b > i3 ? (char) 1 : lVar.f280c <= i3 ? (char) 65535 : (char) 0;
            if (c3 < 0) {
                i4 = i5 + 1;
            } else {
                if (c3 <= 0) {
                    return i5;
                }
                size = i5 - 1;
            }
        }
        return -(i4 + 1);
    }

    public static final int B(int i3, List list) {
        int size = list.size() - 1;
        int i4 = 0;
        while (i4 <= size) {
            int i5 = (i4 + size) >>> 1;
            l lVar = (l) list.get(i5);
            char c3 = lVar.f281d > i3 ? (char) 1 : lVar.f282e <= i3 ? (char) 65535 : (char) 0;
            if (c3 < 0) {
                i4 = i5 + 1;
            } else {
                if (c3 <= 0) {
                    return i5;
                }
                size = i5 - 1;
            }
        }
        return -(i4 + 1);
    }

    public static v C(String str) {
        if (str.equals("http/1.0")) {
            return v.HTTP_1_0;
        }
        if (str.equals("http/1.1")) {
            return v.HTTP_1_1;
        }
        if (str.equals("h2_prior_knowledge")) {
            return v.H2_PRIOR_KNOWLEDGE;
        }
        if (str.equals("h2")) {
            return v.HTTP_2;
        }
        if (str.equals("spdy/3.1")) {
            return v.SPDY_3;
        }
        if (str.equals("quic")) {
            return v.QUIC;
        }
        throw new IOException("Unexpected protocol: ".concat(str));
    }

    public static final float D(Layout layout, int i3, Paint paint) {
        float abs;
        float width;
        float lineLeft = layout.getLineLeft(i3);
        B b2 = D.f440a;
        if (layout.getEllipsisCount(i3) <= 0 || layout.getParagraphDirection(i3) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float measureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i3) + layout.getLineStart(i3)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i3);
        if ((paragraphAlignment == null ? -1 : d.f490a[paragraphAlignment.ordinal()]) == 1) {
            abs = Math.abs(lineLeft);
            width = (layout.getWidth() - measureText) / 2.0f;
        } else {
            abs = Math.abs(lineLeft);
            width = layout.getWidth() - measureText;
        }
        return width + abs;
    }

    public static final float E(Layout layout, int i3, Paint paint) {
        float width;
        float width2;
        B b2 = D.f440a;
        if (layout.getEllipsisCount(i3) <= 0) {
            return 0.0f;
        }
        if (layout.getParagraphDirection(i3) != -1 || layout.getWidth() >= layout.getLineRight(i3)) {
            return 0.0f;
        }
        float measureText = paint.measureText("…") + (layout.getLineRight(i3) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i3) + layout.getLineStart(i3)));
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i3);
        if ((paragraphAlignment != null ? d.f490a[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i3);
            width2 = (layout.getWidth() - measureText) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i3);
            width2 = layout.getWidth() - measureText;
        }
        return width - width2;
    }

    public static Intent F(Context context, ComponentName componentName) {
        String G3 = G(context, componentName);
        if (G3 == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), G3);
        return G(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public static String G(Context context, ComponentName componentName) {
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

    public static final long H(double d3) {
        return N(4294967296L, (float) d3);
    }

    public static final long I(int i3) {
        return N(4294967296L, i3);
    }

    public static final int J(int i3, int i4) {
        return (i3 >> i4) & 31;
    }

    public static final boolean K(AssertionError assertionError) {
        Logger logger = t.f2963a;
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        return message != null ? AbstractC0447i.l0(message, "getsockname failed") : false;
    }

    public static final boolean L(long j3) {
        m[] mVarArr = M0.l.f2779b;
        return (j3 & 1095216660480L) == 0;
    }

    public static List M(Object obj) {
        List singletonList = Collections.singletonList(obj);
        i.e(singletonList, "singletonList(...)");
        return singletonList;
    }

    public static final long N(long j3, float f3) {
        long floatToIntBits = j3 | (Float.floatToIntBits(f3) & 4294967295L);
        m[] mVarArr = M0.l.f2779b;
        return floatToIntBits;
    }

    public static h O(String str) {
        int i3;
        String str2;
        i.f(str, "statusLine");
        boolean i02 = AbstractC0454p.i0(str, "HTTP/1.");
        v vVar = v.HTTP_1_0;
        if (i02) {
            i3 = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int charAt = str.charAt(7) - '0';
            if (charAt != 0) {
                if (charAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                vVar = v.HTTP_1_1;
            }
        } else {
            if (!AbstractC0454p.i0(str, "ICY ")) {
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
            i.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            int parseInt = Integer.parseInt(substring);
            if (str.length() <= i4) {
                str2 = "";
            } else {
                if (str.charAt(i4) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                str2 = str.substring(i3 + 4);
                i.e(str2, "this as java.lang.String).substring(startIndex)");
            }
            return new h(vVar, parseInt, str2);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }

    public static long P(String str, int i3) {
        int u3 = u(str, 0, i3, false);
        Matcher matcher = j.f97m.matcher(str);
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        int i9 = -1;
        while (u3 < i3) {
            int u4 = u(str, u3 + 1, i3, true);
            matcher.region(u3, u4);
            if (i5 == -1 && matcher.usePattern(j.f97m).matches()) {
                String group = matcher.group(1);
                i.e(group, "matcher.group(1)");
                i5 = Integer.parseInt(group);
                String group2 = matcher.group(2);
                i.e(group2, "matcher.group(2)");
                i8 = Integer.parseInt(group2);
                String group3 = matcher.group(3);
                i.e(group3, "matcher.group(3)");
                i9 = Integer.parseInt(group3);
            } else if (i6 == -1 && matcher.usePattern(j.f96l).matches()) {
                String group4 = matcher.group(1);
                i.e(group4, "matcher.group(1)");
                i6 = Integer.parseInt(group4);
            } else {
                if (i7 == -1) {
                    Pattern pattern = j.f95k;
                    if (matcher.usePattern(pattern).matches()) {
                        String group5 = matcher.group(1);
                        i.e(group5, "matcher.group(1)");
                        Locale locale = Locale.US;
                        i.e(locale, "US");
                        String lowerCase = group5.toLowerCase(locale);
                        i.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                        String pattern2 = pattern.pattern();
                        i.e(pattern2, "MONTH_PATTERN.pattern()");
                        i7 = AbstractC0447i.r0(pattern2, lowerCase, 0, false, 6) / 4;
                    }
                }
                if (i4 == -1 && matcher.usePattern(j.f94j).matches()) {
                    String group6 = matcher.group(1);
                    i.e(group6, "matcher.group(1)");
                    i4 = Integer.parseInt(group6);
                }
            }
            u3 = u(str, u4 + 1, i3, false);
        }
        if (70 <= i4 && i4 < 100) {
            i4 += 1900;
        }
        if (i4 >= 0 && i4 < 70) {
            i4 += 2000;
        }
        if (i4 < 1601) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i7 == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (1 > i6 || i6 >= 32) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i5 < 0 || i5 >= 24) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i8 < 0 || i8 >= 60) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i9 < 0 || i9 >= 60) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(c.f419e);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i4);
        gregorianCalendar.set(2, i7 - 1);
        gregorianCalendar.set(5, i6);
        gregorianCalendar.set(11, i5);
        gregorianCalendar.set(12, i8);
        gregorianCalendar.set(13, i9);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    public static final void S(Spannable spannable, long j3, int i3, int i4) {
        if (j3 != 16) {
            spannable.setSpan(new ForegroundColorSpan(AbstractC0259J.E(j3)), i3, i4, 33);
        }
    }

    public static void T(Window window, boolean z3) {
        if (Build.VERSION.SDK_INT >= 30) {
            AbstractC0182u.a(window, z3);
            return;
        }
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z3 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
    }

    public static final void U(Spannable spannable, long j3, b bVar, int i3, int i4) {
        long b2 = M0.l.b(j3);
        if (m.a(b2, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(M1.B.M(bVar.G(j3)), false), i3, i4, 33);
        } else if (m.a(b2, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(M0.l.c(j3)), i3, i4, 33);
        }
    }

    public static final C0147c V(Socket socket) {
        Logger logger = t.f2963a;
        E e3 = new E(socket);
        OutputStream outputStream = socket.getOutputStream();
        i.e(outputStream, "getOutputStream(...)");
        return new C0147c(e3, new C0147c(outputStream, e3));
    }

    public static final C0148d W(Socket socket) {
        Logger logger = t.f2963a;
        E e3 = new E(socket);
        InputStream inputStream = socket.getInputStream();
        i.e(inputStream, "getInputStream(...)");
        return new C0148d(e3, 0, new C0148d(inputStream, 1, e3));
    }

    public static final String X(String str) {
        i.f(str, "<this>");
        int i3 = 0;
        int i4 = -1;
        if (!AbstractC0447i.l0(str, ":")) {
            try {
                String ascii = IDN.toASCII(str);
                i.e(ascii, "toASCII(host)");
                Locale locale = Locale.US;
                i.e(locale, "US");
                String lowerCase = ascii.toLowerCase(locale);
                i.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (lowerCase.length() == 0) {
                    return null;
                }
                int length = lowerCase.length();
                for (int i5 = 0; i5 < length; i5++) {
                    char charAt = lowerCase.charAt(i5);
                    if (i.g(charAt, 31) <= 0 || i.g(charAt, 127) >= 0 || AbstractC0447i.q0(" #%/:?@[\\]", charAt, 0, false, 6) != -1) {
                        return null;
                    }
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress v3 = (AbstractC0454p.i0(str, "[") && AbstractC0454p.c0(str, "]", false)) ? v(1, str.length() - 1, str) : v(0, str.length(), str);
        if (v3 == null) {
            return null;
        }
        byte[] address = v3.getAddress();
        if (address.length != 16) {
            if (address.length == 4) {
                return v3.getHostAddress();
            }
            throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
        }
        int i6 = 0;
        int i7 = 0;
        while (i6 < address.length) {
            int i8 = i6;
            while (i8 < 16 && address[i8] == 0 && address[i8 + 1] == 0) {
                i8 += 2;
            }
            int i9 = i8 - i6;
            if (i9 > i7 && i9 >= 4) {
                i4 = i6;
                i7 = i9;
            }
            i6 = i8 + 2;
        }
        C0150f c0150f = new C0150f();
        while (i3 < address.length) {
            if (i3 == i4) {
                c0150f.Q(58);
                i3 += i7;
                if (i3 == 16) {
                    c0150f.Q(58);
                }
            } else {
                if (i3 > 0) {
                    c0150f.Q(58);
                }
                byte b2 = address[i3];
                byte[] bArr = c.f415a;
                c0150f.R(((b2 & 255) << 8) | (address[i3 + 1] & 255));
                i3 += 2;
            }
        }
        return c0150f.u(c0150f.f2929e, AbstractC0439a.f5056a);
    }

    public static final double Y(long j3) {
        return ((j3 >>> 11) * 2048) + (j3 & 2047);
    }

    public static M0.c a() {
        return new M0.c(1.0f, 1.0f);
    }

    public static final void b(String str, C0113p c0113p, int i3) {
        int i4;
        U.l g3;
        c0113p.S(-387523252);
        if ((i3 & 6) == 0) {
            i4 = (c0113p.f("Bench tip") ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0113p.f(str) ? 32 : 16;
        }
        if ((i4 & 19) == 18 && c0113p.x()) {
            c0113p.L();
        } else {
            long b2 = C0288u.b(((J) c0113p.k(L.f1045a)).f997f, 0.14f);
            C1050d a3 = e.a(14);
            g3 = androidx.compose.foundation.layout.a.g(U.i.f3302a, 1.0f);
            U0.a(g3, a3, b2, 0L, 0.0f, 0.0f, null, f.b(-1049963033, new k(1, str), c0113p), c0113p, 12582918, 120);
        }
        C0119s0 r3 = c0113p.r();
        if (r3 != null) {
            r3.f2347d = new H1.e(str, i3, 0);
        }
    }

    public static final void c(String str, String str2, C0113p c0113p, int i3) {
        int i4;
        int i5;
        c0113p.S(-399587870);
        if ((i3 & 6) == 0) {
            i4 = (c0113p.f(str) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0113p.f(str2) ? 32 : 16;
        }
        int i6 = i4;
        if ((i6 & 19) == 18 && c0113p.x()) {
            c0113p.L();
            i5 = 1;
        } else {
            C0807d c0807d = AbstractC0813j.f7061a;
            C0810g c0810g = new C0810g(4);
            U.i iVar = U.i.f3302a;
            C0823u a3 = AbstractC0821s.a(c0810g, U.a.f3291o, c0113p, 6);
            int i7 = c0113p.f2306P;
            InterfaceC0110n0 m3 = c0113p.m();
            U.l c3 = U.m.c(c0113p, iVar);
            InterfaceC0902j.f7933c.getClass();
            C0906n c0906n = C0901i.f7920b;
            c0113p.U();
            if (c0113p.f2305O) {
                c0113p.l(c0906n);
            } else {
                c0113p.d0();
            }
            C0089d.Q(c0113p, C0901i.f7923e, a3);
            C0089d.Q(c0113p, C0901i.f7922d, m3);
            C0900h c0900h = C0901i.f7924f;
            if (c0113p.f2305O || !i.a(c0113p.G(), Integer.valueOf(i7))) {
                AbstractC0080b.p(i7, c0113p, i7, c0900h);
            }
            C0089d.Q(c0113p, C0901i.f7921c, c3);
            Y0 y02 = b1.f1200a;
            C c4 = ((a1) c0113p.k(y02)).f1192i;
            F0.l lVar = F0.l.f1457i;
            Y0 y03 = L.f1045a;
            X0.b(str, null, ((J) c0113p.k(y03)).f992a, 0L, null, lVar, null, 0L, null, null, 0L, 0, false, 0, 0, null, c4, c0113p, (i6 & 14) | 196608, 0, 65498);
            X0.b(str2, null, ((J) c0113p.k(y03)).f1006o, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((a1) c0113p.k(y02)).f1194k, c0113p, (i6 >> 3) & 14, 0, 65530);
            i5 = 1;
            c0113p.p(true);
        }
        C0119s0 r3 = c0113p.r();
        if (r3 != null) {
            r3.f2347d = new G1.i(i3, i5, str, str2);
        }
    }

    public static final void d(String str, y yVar, Y1.a aVar, C0113p c0113p, int i3) {
        int i4;
        Object obj;
        i.f(aVar, "onBack");
        c0113p.S(-1722006372);
        if ((i3 & 6) == 0) {
            i4 = (c0113p.f(str) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0113p.h(yVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= c0113p.h(aVar) ? 256 : 128;
        }
        if ((i4 & 147) == 146 && c0113p.x()) {
            c0113p.L();
        } else {
            InterfaceC0088c0 u3 = AbstractC0381e.u(yVar.f1920d, c0113p);
            Iterator it = ((H1.v) u3.getValue()).f1910a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (i.a(((com.gates.olympus.miruv.data.b) obj).getId(), str)) {
                        break;
                    }
                }
            }
            com.gates.olympus.miruv.data.b bVar = (com.gates.olympus.miruv.data.b) obj;
            H0.a(null, f.b(-1996063648, new H1.i(bVar, aVar, yVar, ((H1.v) u3.getValue()).f1912c.contains(str)), c0113p), null, null, null, 0, 0L, 0L, null, f.b(-1951985813, new G1.l(bVar, 2), c0113p), c0113p, 805306416, 509);
        }
        C0119s0 r3 = c0113p.r();
        if (r3 != null) {
            r3.f2347d = new H1.d(str, yVar, aVar, i3, 0);
        }
    }

    public static final void e(String str, C0113p c0113p, int i3) {
        int i4;
        U.l g3;
        int i5;
        c0113p.S(-781516418);
        if ((i3 & 6) == 0) {
            i4 = (c0113p.f("Family") ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0113p.f(str) ? 32 : 16;
        }
        if ((i4 & 19) == 18 && c0113p.x()) {
            c0113p.L();
            i5 = 1;
        } else {
            g3 = androidx.compose.foundation.layout.a.g(U.i.f3302a, 1.0f);
            C0807d c0807d = AbstractC0813j.f7061a;
            C0802N a3 = AbstractC0801M.a(new C0810g(8), U.a.f3289m, c0113p, 6);
            int i6 = c0113p.f2306P;
            InterfaceC0110n0 m3 = c0113p.m();
            U.l c3 = U.m.c(c0113p, g3);
            InterfaceC0902j.f7933c.getClass();
            C0906n c0906n = C0901i.f7920b;
            c0113p.U();
            if (c0113p.f2305O) {
                c0113p.l(c0906n);
            } else {
                c0113p.d0();
            }
            C0089d.Q(c0113p, C0901i.f7923e, a3);
            C0089d.Q(c0113p, C0901i.f7922d, m3);
            C0900h c0900h = C0901i.f7924f;
            if (c0113p.f2305O || !i.a(c0113p.G(), Integer.valueOf(i6))) {
                AbstractC0080b.p(i6, c0113p, i6, c0900h);
            }
            C0089d.Q(c0113p, C0901i.f7921c, c3);
            Y0 y02 = b1.f1200a;
            C c4 = ((a1) c0113p.k(y02)).f1197n;
            Y0 y03 = L.f1045a;
            X0.b("Family", null, ((J) c0113p.k(y03)).f1009s, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c4, c0113p, i4 & 14, 0, 65530);
            X0.b(str, null, ((J) c0113p.k(y03)).f1007q, 0L, null, F0.l.f1456h, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((a1) c0113p.k(y02)).f1194k, c0113p, ((i4 >> 3) & 14) | 196608, 0, 65498);
            i5 = 1;
            c0113p.p(true);
        }
        C0119s0 r3 = c0113p.r();
        if (r3 != null) {
            r3.f2347d = new H1.e(str, i3, i5);
        }
    }

    public static final a0.d f(long j3, long j4) {
        return new a0.d(a0.c.d(j3), a0.c.e(j3), a0.f.d(j4) + a0.c.d(j3), a0.f.b(j4) + a0.c.e(j3));
    }

    public static final Object[] g(Object[] objArr, int i3, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        M1.k.Z(objArr, objArr2, 0, i3, 6);
        M1.k.X(objArr, objArr2, i3 + 2, i3, objArr.length);
        objArr2[i3] = obj;
        objArr2[i3 + 1] = obj2;
        return objArr2;
    }

    public static final Object[] h(Object[] objArr, int i3) {
        Object[] objArr2 = new Object[objArr.length - 2];
        M1.k.Z(objArr, objArr2, 0, i3, 6);
        M1.k.X(objArr, objArr2, i3, i3 + 2, objArr.length);
        return objArr2;
    }

    public static final Object[] i(Object[] objArr, int i3) {
        Object[] objArr2 = new Object[objArr.length - 1];
        M1.k.Z(objArr, objArr2, 0, i3, 6);
        M1.k.X(objArr, objArr2, i3, i3 + 1, objArr.length);
        return objArr2;
    }

    public static final z j(F f3) {
        i.f(f3, "<this>");
        return new z(f3);
    }

    public static N1.c k(N1.c cVar) {
        cVar.k();
        cVar.f2867f = true;
        return cVar.f2866e > 0 ? cVar : N1.c.f2864g;
    }

    public static final Bundle l(L1.j... jVarArr) {
        Bundle bundle = new Bundle(jVarArr.length);
        for (L1.j jVar : jVarArr) {
            String str = (String) jVar.f2708d;
            Object obj = jVar.f2709e;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                i.c(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                X0.a.a(bundle, str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + '\"');
                }
                X0.a.b(bundle, str, (SizeF) obj);
            }
        }
        return bundle;
    }

    public static void p(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int q(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static final F0.f r(Context context) {
        F0.a aVar = new F0.a(0);
        context.getApplicationContext();
        return new F0.f(aVar, new F0.b(Build.VERSION.SDK_INT >= 31 ? F0.m.f1459a.a(context) : 0));
    }

    public static int u(String str, int i3, int i4, boolean z3) {
        while (i3 < i4) {
            char charAt = str.charAt(i3);
            if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || ('0' <= charAt && charAt < ':') || (('a' <= charAt && charAt < '{') || (('A' <= charAt && charAt < '[') || charAt == ':'))) == (!z3)) {
                return i3;
            }
            i3++;
        }
        return i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d5, code lost:
    
        if (r7 == r0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d7, code lost:
    
        if (r8 != (-1)) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d9, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00da, code lost:
    
        r1 = r7 - r8;
        java.lang.System.arraycopy(r3, r8, r3, 16 - r1, r1);
        java.util.Arrays.fill(r3, r8, (16 - r7) + r8, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ec, code lost:
    
        return java.net.InetAddress.getByAddress(r3);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a7  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [int] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final InetAddress v(int i3, int i4, String str) {
        int i5;
        int i6;
        int i7;
        int i8 = 16;
        byte[] bArr = new byte[16];
        boolean z3 = false;
        int i9 = i3;
        int i10 = 0;
        int i11 = -1;
        int i12 = -1;
        while (true) {
            if (i9 >= i4) {
                i5 = i8;
                break;
            }
            if (i10 != i8) {
                int i13 = i9 + 2;
                if (i13 <= i4 && AbstractC0454p.h0(str, "::", i9, z3)) {
                    if (i11 == -1) {
                        i10 += 2;
                        if (i13 != i4) {
                            i11 = i10;
                            i12 = i13;
                            i9 = i12;
                            int i14 = 0;
                            while (i9 < i4) {
                            }
                            i7 = i9 - i12;
                            if (i7 == 0) {
                                break;
                            }
                            break;
                        }
                        i5 = i8;
                        i11 = i10;
                        break;
                    }
                    return null;
                }
                if (i10 != 0) {
                    if (!AbstractC0454p.h0(str, ":", i9, z3)) {
                        if (AbstractC0454p.h0(str, ".", i9, z3)) {
                            int i15 = i10 - 2;
                            int i16 = i15;
                            loop2: while (true) {
                                if (i12 < i4) {
                                    if (i16 == i8) {
                                        break;
                                    }
                                    if (i16 != i15) {
                                        if (str.charAt(i12) != '.') {
                                            break;
                                        }
                                        i12++;
                                    }
                                    ?? r14 = z3;
                                    int i17 = i12;
                                    while (i17 < i4) {
                                        char charAt = str.charAt(i17);
                                        if (i.g(charAt, 48) < 0 || i.g(charAt, 57) > 0) {
                                            break;
                                        }
                                        if ((r14 == 0 && i12 != i17) || (i6 = ((r14 * 10) + charAt) - 48) > 255) {
                                            break loop2;
                                        }
                                        i17++;
                                        r14 = i6;
                                    }
                                    if (i17 - i12 == 0) {
                                        break;
                                    }
                                    bArr[i16] = (byte) r14;
                                    i16++;
                                    i12 = i17;
                                    i8 = 16;
                                    z3 = false;
                                } else if (i16 == i10 + 2) {
                                    i10 += 2;
                                    i5 = 16;
                                }
                            }
                        }
                        return null;
                    }
                    i9++;
                }
                i12 = i9;
                i9 = i12;
                int i142 = 0;
                while (i9 < i4) {
                    int q2 = c.q(str.charAt(i9));
                    if (q2 == -1) {
                        break;
                    }
                    i142 = (i142 << 4) + q2;
                    i9++;
                }
                i7 = i9 - i12;
                if (i7 == 0 || i7 > 4) {
                    break;
                }
                int i18 = i10 + 1;
                bArr[i10] = (byte) ((i142 >>> 8) & 255);
                i10 += 2;
                bArr[i18] = (byte) (i142 & 255);
                i8 = 16;
                z3 = false;
            } else {
                return null;
            }
        }
        return null;
    }

    public static final boolean w(int i3, int i4) {
        return i3 == i4;
    }

    public static final boolean x(int i3, int i4) {
        return i3 == i4;
    }

    public static final boolean y(int i3, int i4) {
        return i3 == i4;
    }

    public abstract void Q(Q0.f fVar, Q0.f fVar2);

    public abstract void R(Q0.f fVar, Thread thread);

    public abstract boolean m(g gVar, Q0.c cVar);

    public abstract boolean n(g gVar, Object obj, Object obj2);

    public abstract boolean o(g gVar, Q0.f fVar, Q0.f fVar2);

    public abstract Typeface s(Context context, Y0.b[] bVarArr);

    public Typeface t(Context context, InputStream inputStream) {
        File file;
        File cacheDir = context.getCacheDir();
        if (cacheDir != null) {
            String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
            for (int i3 = 0; i3 < 100; i3++) {
                file = new File(cacheDir, str + i3);
                if (file.createNewFile()) {
                    break;
                }
            }
        }
        file = null;
        if (file == null) {
            return null;
        }
        try {
            if (M1.B.u(file, inputStream)) {
                return Typeface.createFromFile(file.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            file.delete();
        }
    }

    public Y0.b z(Y0.b[] bVarArr) {
        Y0.b bVar = null;
        int i3 = Integer.MAX_VALUE;
        for (Y0.b bVar2 : bVarArr) {
            int abs = (bVar2.f3412d ? 1 : 0) + (Math.abs(bVar2.f3411c - 400) * 2);
            if (bVar == null || i3 > abs) {
                bVar = bVar2;
                i3 = abs;
            }
        }
        return bVar;
    }
}
