package g0;

import E1.C0025a;
import E1.N;
import N3.A;
import T.C0097o;
import T.G;
import T.e0;
import W.InterfaceC0113f;
import W.J;
import a.AbstractC0124a;
import a0.C0130F;
import a0.C0136b;
import a0.C0137c;
import a0.C0158y;
import a0.SurfaceHolderCallbackC0125A;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.SparseArray;
import androidx.datastore.preferences.protobuf.C0179l;
import b0.C0255a;
import d2.C0389g;
import h0.C0446b;
import io.appmetrica.analytics.impl.C0536cd;
import io.appmetrica.analytics.impl.C0668hg;
import io.appmetrica.analytics.impl.C0693ig;
import io.appmetrica.analytics.impl.Db;
import io.appmetrica.analytics.impl.InterfaceC0952sg;
import io.appmetrica.analytics.impl.L0;
import io.appmetrica.analytics.impl.V;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m0.AbstractC1284F;
import m0.C1279A;
import m0.C1280B;
import m0.C1281C;
import m0.C1300m;
import m0.C1301n;
import m0.RunnableC1299l;
import m0.x;
import m0.z;
import q0.C1353B;
import q0.U;
import v2.F;
import v2.I;
import v2.a0;
import v2.f0;
import v2.p0;
import w0.C1496c;
import y0.y;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8921a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8922b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8923c;

    public /* synthetic */ p(Object obj, int i4, Object obj2) {
        this.f8921a = i4;
        this.f8922b = obj;
        this.f8923c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x030d A[Catch: IllegalArgumentException -> 0x01a4, G -> 0x01a7, TryCatch #0 {IllegalArgumentException -> 0x01a4, blocks: (B:48:0x0184, B:50:0x01aa, B:52:0x01ae, B:53:0x01b1, B:55:0x01b9, B:57:0x01c1, B:59:0x01cd, B:60:0x01cf, B:62:0x01eb, B:64:0x020e, B:66:0x0216, B:67:0x0221, B:69:0x021c, B:70:0x0226, B:72:0x022a, B:74:0x022e, B:77:0x0241, B:79:0x0247, B:81:0x0259, B:84:0x025c, B:87:0x0264, B:88:0x026b, B:89:0x026c, B:91:0x028c, B:92:0x028f, B:93:0x0294, B:94:0x0295, B:97:0x02a3, B:100:0x02ae, B:103:0x02c3, B:104:0x02ca, B:105:0x02cb, B:107:0x02d3, B:109:0x02da, B:111:0x02e2, B:112:0x02f2, B:117:0x0304, B:119:0x030d, B:122:0x031e, B:123:0x0326, B:126:0x02e7, B:127:0x02ee, B:128:0x02d6, B:129:0x033a, B:131:0x033f, B:135:0x0353, B:137:0x0359, B:140:0x0366, B:142:0x036e, B:144:0x0389), top: B:38:0x0172 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        String str;
        a0 a0Var;
        boolean z;
        switch (this.f8921a) {
            case 0:
                ((C0446b) ((l) ((s) this.f8922b).f8959c.f8416a).f8887b.f9057d.get(((k) this.f8923c).f8876m)).c(true);
                return;
            case 1:
                C0446b c0446b = (C0446b) this.f8922b;
                Uri uri = (Uri) this.f8923c;
                c0446b.f9050i = false;
                c0446b.d(uri);
                return;
            case 2:
                Db.a((Db) this.f8922b, (V) this.f8923c);
                return;
            case 3:
                L0.a((L0) this.f8922b, (PluginErrorDetails) this.f8923c);
                return;
            case 4:
                C0536cd.a((C0536cd) this.f8922b, (List) this.f8923c);
                return;
            case 5:
                C0668hg.a((C0693ig) this.f8922b, (InterfaceC0952sg) this.f8923c);
                return;
            case 6:
                C0693ig.b((InterfaceC0952sg) this.f8922b, (Throwable) this.f8923c);
                return;
            case 7:
                j0.c cVar = (j0.c) this.f8922b;
                p pVar = (p) this.f8923c;
                cVar.f13728c.q();
                j0.g gVar = cVar.f13727b;
                synchronized (gVar.f13746a) {
                    gVar.b();
                    pVar.run();
                }
                return;
            case 8:
                j0.r rVar = (j0.r) this.f8922b;
                rVar.f13795D.set(rVar.y((l2.e) this.f8923c, rVar.f13850x, 0));
                return;
            case 9:
                C0389g c0389g = (C0389g) this.f8922b;
                I i4 = (I) this.f8923c;
                C1300m c1300m = (C1300m) c0389g.f8265c;
                c1300m.getClass();
                L3.h hVar = c1300m.f14410g;
                SparseArray sparseArray = c1300m.f14409f;
                Pattern pattern = z.f14478b;
                if (!pattern.matcher((CharSequence) i4.get(0)).matches()) {
                    Matcher matcher = z.f14477a.matcher((CharSequence) i4.get(0));
                    AbstractC0124a.h(matcher.matches());
                    String group = matcher.group(1);
                    group.getClass();
                    z.a(group);
                    String group2 = matcher.group(2);
                    group2.getClass();
                    Uri.parse(group2);
                    int indexOf = i4.indexOf("");
                    AbstractC0124a.h(indexOf > 0);
                    List subList = i4.subList(1, indexOf);
                    e0.t tVar = new e0.t(17);
                    tVar.x(subList);
                    C1301n c1301n = new C1301n(tVar);
                    new C3.v(z.f14484h).c(i4.subList(indexOf + 1, i4.size()));
                    String b4 = c1301n.b("CSeq");
                    b4.getClass();
                    int parseInt = Integer.parseInt(b4);
                    C1300m c1300m2 = (C1300m) hVar.f1681c;
                    L3.h hVar2 = new L3.h(405, new C1301n(new e0.t(c1300m2.f14406c, c1300m2.f14414k, parseInt)), "");
                    C1301n c1301n2 = (C1301n) hVar2.f1682d;
                    int i5 = hVar2.f1680b;
                    AbstractC0124a.h(c1301n2.b("CSeq") != null);
                    F f4 = new F(4);
                    if (i5 == 200) {
                        str = "OK";
                    } else if (i5 == 461) {
                        str = "Unsupported Transport";
                    } else if (i5 == 500) {
                        str = "Internal Server Error";
                    } else if (i5 == 505) {
                        str = "RTSP Version Not Supported";
                    } else if (i5 == 301) {
                        str = "Move Permanently";
                    } else if (i5 == 302) {
                        str = "Move Temporarily";
                    } else if (i5 == 400) {
                        str = "Bad Request";
                    } else if (i5 == 401) {
                        str = "Unauthorized";
                    } else if (i5 == 404) {
                        str = "Not Found";
                    } else if (i5 != 405) {
                        switch (i5) {
                            case 454:
                                str = "Session Not Found";
                                break;
                            case 455:
                                str = "Method Not Valid In This State";
                                break;
                            case 456:
                                str = "Header Field Not Valid";
                                break;
                            case 457:
                                str = "Invalid Range";
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                    } else {
                        str = "Method Not Allowed";
                    }
                    String str2 = J.f3263a;
                    Locale locale = Locale.US;
                    f4.b("RTSP/1.0 " + i5 + " " + str);
                    v2.J j4 = c1301n2.f14421a;
                    p0 it = j4.f15572d.keySet().iterator();
                    while (it.hasNext()) {
                        String str3 = (String) it.next();
                        I g4 = j4.g(str3);
                        for (int i6 = 0; i6 < g4.size(); i6++) {
                            f4.b(String.format(Locale.US, "%s: %s", str3, g4.get(i6)));
                        }
                    }
                    f4.b("");
                    f4.b((String) hVar2.f1681c);
                    c1300m2.f14412i.b(f4.f());
                    hVar.f1680b = Math.max(hVar.f1680b, parseInt + 1);
                    return;
                }
                Matcher matcher2 = pattern.matcher((CharSequence) i4.get(0));
                AbstractC0124a.h(matcher2.matches());
                String group3 = matcher2.group(1);
                group3.getClass();
                int parseInt2 = Integer.parseInt(group3);
                int indexOf2 = i4.indexOf("");
                AbstractC0124a.h(indexOf2 > 0);
                List subList2 = i4.subList(1, indexOf2);
                e0.t tVar2 = new e0.t(17);
                tVar2.x(subList2);
                C1301n c1301n3 = new C1301n(tVar2);
                String c4 = new C3.v(z.f14484h).c(i4.subList(indexOf2 + 1, i4.size()));
                String b5 = c1301n3.b("CSeq");
                b5.getClass();
                int parseInt3 = Integer.parseInt(b5);
                d0.g gVar2 = c1300m.f14404a;
                C1279A c1279a = (C1279A) sparseArray.get(parseInt3);
                if (c1279a == null) {
                    return;
                }
                sparseArray.remove(parseInt3);
                int i7 = c1279a.f14293b;
                try {
                    try {
                        if (parseInt2 != 200) {
                            if (parseInt2 == 401) {
                                if (c1300m.f14413j == null || c1300m.f14418q) {
                                    C1300m.a(c1300m, new C0179l(z.g(i7) + " " + parseInt2));
                                    return;
                                }
                                I g5 = c1301n3.f14421a.g(C1301n.a("WWW-Authenticate"));
                                if (g5.isEmpty()) {
                                    throw G.b("Missing WWW-Authenticate header in a 401 response.", null);
                                }
                                for (int i8 = 0; i8 < g5.size(); i8++) {
                                    N e4 = z.e((String) g5.get(i8));
                                    c1300m.n = e4;
                                    if (e4.f511a == 2) {
                                        hVar.f();
                                        c1300m.f14418q = true;
                                        return;
                                    }
                                }
                                hVar.f();
                                c1300m.f14418q = true;
                                return;
                            }
                            if (parseInt2 == 461) {
                                String str4 = z.g(i7) + " " + parseInt2;
                                String b6 = c1279a.f14294c.b("Transport");
                                b6.getClass();
                                C1300m.a(c1300m, (i7 != 10 || b6.contains("TCP")) ? new C0179l(str4) : new m0.t(str4));
                                return;
                            }
                            if (parseInt2 != 301 && parseInt2 != 302) {
                                C1300m.a(c1300m, new C0179l(z.g(i7) + " " + parseInt2));
                                return;
                            }
                            if (c1300m.o != -1) {
                                c1300m.o = 0;
                            }
                            String b7 = c1301n3.b("Location");
                            if (b7 == null) {
                                gVar2.e("Redirection without new location.", null);
                                return;
                            }
                            Uri parse = Uri.parse(b7);
                            c1300m.f14411h = parse;
                            C0025a d4 = z.d(parse);
                            if (d4 != null) {
                                c1300m.f14413j = d4;
                            }
                            Uri uri2 = c1300m.f14411h;
                            String str5 = c1300m.f14414k;
                            hVar.getClass();
                            hVar.g(hVar.c(2, str5, f0.b(1, new Object[]{"Accept", "application/sdp"}, null), uri2));
                            return;
                        }
                        switch (i7) {
                            case 1:
                            case 3:
                            case 7:
                            case 8:
                            case 9:
                            case 11:
                            case 12:
                                return;
                            case 2:
                                c0389g.I(new C0389g(c1301n3, 12, AbstractC1284F.a(c4)));
                                return;
                            case 4:
                                I k4 = I.k(z.b(c1301n3.b("Public")));
                                if (c1300m.f14416m != null) {
                                    return;
                                }
                                if (!k4.isEmpty() && !k4.contains(2)) {
                                    gVar2.e("DESCRIBE not supported.", null);
                                    return;
                                }
                                Uri uri3 = c1300m.f14411h;
                                String str6 = c1300m.f14414k;
                                hVar.getClass();
                                hVar.g(hVar.c(2, str6, f0.b(1, new Object[]{"Accept", "application/sdp"}, null), uri3));
                                return;
                            case 5:
                                c0389g.J();
                                return;
                            case 6:
                                String b8 = c1301n3.b("Range");
                                C1280B a3 = b8 == null ? C1280B.f14296c : C1280B.a(b8);
                                try {
                                    String b9 = c1301n3.b("RTP-Info");
                                    if (b9 == null) {
                                        v2.G g6 = I.f15571b;
                                        a0Var = a0.f15605e;
                                    } else {
                                        a0Var = C1281C.a(c1300m.f14411h, b9);
                                    }
                                } catch (G unused) {
                                    v2.G g7 = I.f15571b;
                                    a0Var = a0.f15605e;
                                }
                                I k5 = I.k(a0Var);
                                int i9 = c1300m.o;
                                if (i9 != 1 && i9 != 2) {
                                    z = false;
                                    AbstractC0124a.t(z);
                                    c1300m.o = 2;
                                    if (c1300m.f14416m == null) {
                                        long j5 = c1300m.f14415l / 2;
                                        RunnableC1299l runnableC1299l = new RunnableC1299l(c1300m, j5);
                                        c1300m.f14416m = runnableC1299l;
                                        if (!runnableC1299l.f14402c) {
                                            runnableC1299l.f14402c = true;
                                            runnableC1299l.f14400a.postDelayed(runnableC1299l, j5);
                                        }
                                    }
                                    c1300m.f14420s = -9223372036854775807L;
                                    c1300m.f14405b.d(J.M(a3.f14298a), k5);
                                    return;
                                }
                                z = true;
                                AbstractC0124a.t(z);
                                c1300m.o = 2;
                                if (c1300m.f14416m == null) {
                                }
                                c1300m.f14420s = -9223372036854775807L;
                                c1300m.f14405b.d(J.M(a3.f14298a), k5);
                                return;
                            case 10:
                                String b10 = c1301n3.b("Session");
                                String b11 = c1301n3.b("Transport");
                                if (b10 == null || b11 == null) {
                                    throw G.b("Missing mandatory session or transport header", null);
                                }
                                G0.c c5 = z.c(b10);
                                AbstractC0124a.t(c1300m.o != -1);
                                c1300m.o = 1;
                                c1300m.f14414k = (String) c5.f829c;
                                c1300m.f14415l = c5.f828b;
                                c1300m.b();
                                return;
                            default:
                                throw new IllegalStateException();
                        }
                    } catch (IllegalArgumentException e5) {
                        e = e5;
                        C1300m.a(c1300m, new C0179l(e));
                        return;
                    }
                } catch (G e6) {
                    e = e6;
                    C1300m.a(c1300m, new C0179l(e));
                    return;
                }
            case 10:
                x xVar = (x) this.f8922b;
                byte[] bArr = (byte[]) this.f8923c;
                xVar.getClass();
                try {
                    xVar.f14467a.write(bArr);
                    return;
                } catch (Exception unused2) {
                    return;
                }
            case 11:
                ((InterfaceC0113f) this.f8922b).accept(this.f8923c);
                return;
            case 12:
                ((U) this.f8922b).E((y) this.f8923c);
                return;
            case 13:
                ((A) this.f8922b).e((Typeface) this.f8923c);
                return;
            case 14:
                ((C1496c) ((C0389g) this.f8922b).f8265c).f15782h.onVideoSizeChanged((e0) this.f8923c);
                return;
            case 15:
                c0.q qVar = (c0.q) this.f8922b;
                C0136b c0136b = (C0136b) this.f8923c;
                SurfaceHolderCallbackC0125A surfaceHolderCallbackC0125A = qVar.f5601b;
                String str7 = J.f3263a;
                l2.e.j(surfaceHolderCallbackC0125A.f3838a.f3853H, c0136b);
                return;
            case 16:
                c0.q qVar2 = (c0.q) this.f8922b;
                e0 e0Var = (e0) this.f8923c;
                SurfaceHolderCallbackC0125A surfaceHolderCallbackC0125A2 = qVar2.f5601b;
                String str8 = J.f3263a;
                C0130F c0130f = surfaceHolderCallbackC0125A2.f3838a;
                c0130f.f3882g0 = e0Var;
                c0130f.n.e(25, new C0158y(e0Var));
                return;
            case 17:
                c0.q qVar3 = (c0.q) this.f8922b;
                C0097o c0097o = (C0097o) this.f8923c;
                SurfaceHolderCallbackC0125A surfaceHolderCallbackC0125A3 = qVar3.f5601b;
                String str9 = J.f3263a;
                C0130F c0130f2 = surfaceHolderCallbackC0125A3.f3838a;
                c0130f2.f3863S = c0097o;
                b0.d dVar = c0130f2.f3897t;
                dVar.l(dVar.k(), 1017, new b0.b(22));
                return;
            default:
                c0.q qVar4 = (c0.q) this.f8922b;
                C0137c c0137c = (C0137c) this.f8923c;
                synchronized (c0137c) {
                }
                SurfaceHolderCallbackC0125A surfaceHolderCallbackC0125A4 = qVar4.f5601b;
                String str10 = J.f3263a;
                C0130F c0130f3 = surfaceHolderCallbackC0125A4.f3838a;
                b0.d dVar2 = c0130f3.f3897t;
                C0255a i10 = dVar2.i((C1353B) dVar2.f5272d.f1637e);
                dVar2.l(i10, 1020, new D0.a(i10, (Object) c0137c, 19));
                c0130f3.f3863S = null;
                return;
        }
    }

    public /* synthetic */ p(Object obj, Object obj2, Object obj3, int i4) {
        this.f8921a = i4;
        this.f8922b = obj;
        this.f8923c = obj2;
    }
}
