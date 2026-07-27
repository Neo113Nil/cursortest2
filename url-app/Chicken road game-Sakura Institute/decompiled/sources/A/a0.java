package A;

import A0.C0031b;
import A0.C0033d;
import A0.C0034e;
import A0.C0036g;
import G.C0192d;
import G.C0205j0;
import Z.C0323u;
import a.AbstractC0345a;
import android.content.ClipData;
import android.content.ClipDescription;
import android.os.Parcel;
import android.text.Annotation;
import android.text.Spanned;
import android.util.Base64;
import android.view.ActionMode;
import h0.C0647b;
import h0.InterfaceC0646a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p0.InterfaceC0980p;
import s0.C1145h;
import s0.InterfaceC1138d0;
import s0.M0;
import s0.N0;
import u0.C1216a;
import w.EnumC1257F;
import w.o0;
import w.p0;
import w2.C1294c;
import y2.y;
import z2.C1439w;
import z2.C1441y;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final p0 f84a;

    /* renamed from: b, reason: collision with root package name */
    public G0.s f85b = w.M.f11039c;

    /* renamed from: c, reason: collision with root package name */
    public M2.p f86c = H.f26j;

    /* renamed from: d, reason: collision with root package name */
    public w.P f87d;

    /* renamed from: e, reason: collision with root package name */
    public final C0205j0 f88e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC1138d0 f89f;

    /* renamed from: g, reason: collision with root package name */
    public M0 f90g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC0646a f91h;

    /* renamed from: i, reason: collision with root package name */
    public X.p f92i;

    /* renamed from: j, reason: collision with root package name */
    public final C0205j0 f93j;

    /* renamed from: k, reason: collision with root package name */
    public final C0205j0 f94k;

    /* renamed from: l, reason: collision with root package name */
    public long f95l;

    /* renamed from: m, reason: collision with root package name */
    public Integer f96m;

    /* renamed from: n, reason: collision with root package name */
    public long f97n;

    /* renamed from: o, reason: collision with root package name */
    public final C0205j0 f98o;

    /* renamed from: p, reason: collision with root package name */
    public final C0205j0 f99p;

    /* renamed from: q, reason: collision with root package name */
    public int f100q;

    /* renamed from: r, reason: collision with root package name */
    public G0.y f101r;

    /* renamed from: s, reason: collision with root package name */
    public V f102s;

    /* renamed from: t, reason: collision with root package name */
    public final X f103t;

    /* renamed from: u, reason: collision with root package name */
    public final C1294c f104u;

    public a0(p0 p0Var) {
        this.f84a = p0Var;
        G0.y yVar = new G0.y(7, 0L, (String) null);
        G.W w4 = G.W.f2779l;
        this.f88e = C0192d.K(yVar, w4);
        Boolean bool = Boolean.TRUE;
        this.f93j = C0192d.K(bool, w4);
        this.f94k = C0192d.K(bool, w4);
        this.f95l = 0L;
        this.f97n = 0L;
        this.f98o = C0192d.K(null, w4);
        this.f99p = C0192d.K(null, w4);
        this.f100q = -1;
        this.f101r = new G0.y(7, 0L, (String) null);
        this.f103t = new X(this, 1);
        this.f104u = new C1294c(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x0137, code lost:
    
        if (r4.f177b == r3.f177b) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x013a  */
    /* JADX WARN: Type inference failed for: r4v5, types: [M2.p, kotlin.jvm.functions.Function1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long a(a0 a0Var, G0.y yVar, long j4, boolean z4, boolean z5, C0022s c0022s, boolean z6) {
        o0 d4;
        o0 o0Var;
        int i2;
        long j5;
        V v4;
        int i4;
        int i5;
        r rVar;
        r rVar2;
        G0.y yVar2;
        boolean z7;
        boolean z8;
        boolean z9;
        InterfaceC0646a interfaceC0646a;
        C0021q l4;
        C0021q c0021q;
        V v5;
        boolean z10;
        C0021q c0021q2;
        C0021q c0021q3;
        r a4;
        int i6;
        w.P p4 = a0Var.f87d;
        if (p4 == null || (d4 = p4.d()) == null) {
            return A0.K.f299b;
        }
        G0.s sVar = a0Var.f85b;
        long j6 = yVar.f3094b;
        int i7 = A0.K.f300c;
        int b4 = sVar.b((int) (j6 >> 32));
        G0.s sVar2 = a0Var.f85b;
        long j7 = yVar.f3094b;
        long j8 = M1.a.j(b4, sVar2.b((int) (j7 & 4294967295L)));
        int b5 = d4.b(j4, false);
        if (z5 || z4) {
            o0Var = d4;
            i2 = b5;
        } else {
            o0Var = d4;
            i2 = (int) (j8 >> 32);
        }
        int i8 = (!z5 || z4) ? b5 : (int) (j8 & 4294967295L);
        V v6 = a0Var.f102s;
        int i9 = -1;
        if (!z4 && v6 != null && (i6 = a0Var.f100q) != -1) {
            i9 = i6;
        }
        A0.I i10 = o0Var.f11290a;
        if (z4) {
            i5 = i9;
            v4 = v6;
            j5 = j7;
            rVar = null;
            i4 = i2;
        } else {
            j5 = j7;
            int i11 = (int) (j8 >> 32);
            v4 = v6;
            int i12 = (int) (j8 & 4294967295L);
            i4 = i2;
            i5 = i9;
            rVar = new r(new C0021q(u3.l.l0(i10, i11), i11, 1L), new C0021q(u3.l.l0(i10, i12), i12, 1L), A0.K.f(j8));
        }
        int i13 = i4;
        V v7 = new V(z5, rVar, new C0020p(i13, i8, i5, i10));
        Object obj = v7.f62c;
        if (rVar != null && v4 != null) {
            V v8 = v4;
            if (z5 == v8.f61b) {
                C0020p c0020p = (C0020p) v8.f63d;
                if (i13 == c0020p.f172b && i8 == c0020p.f173c) {
                    return j5;
                }
            }
        }
        a0Var.f102s = v7;
        a0Var.f100q = b5;
        switch (c0022s.f182a) {
            case 0:
                C0020p c0020p2 = (C0020p) v7.f63d;
                rVar2 = new r(c0020p2.a(c0020p2.f172b), c0020p2.a(c0020p2.f173c), v7.d() == 1);
                break;
            case 1:
                rVar2 = j0.c.j(v7, C0023t.f184c);
                break;
            case 2:
                rVar2 = j0.c.j(v7, C0023t.f183b);
                break;
            default:
                r rVar3 = (r) obj;
                if (rVar3 != null) {
                    C0020p c0020p3 = (C0020p) v7.f63d;
                    boolean z11 = v7.f61b;
                    C0021q c0021q4 = rVar3.f180b;
                    C0021q c0021q5 = rVar3.f179a;
                    if (z11) {
                        l4 = j0.c.l(v7, c0020p3, c0021q5);
                        c0021q = c0021q4;
                        c0021q4 = c0021q5;
                        c0021q5 = l4;
                    } else {
                        l4 = j0.c.l(v7, c0020p3, c0021q4);
                        c0021q = l4;
                    }
                    if (!Intrinsics.a(l4, c0021q4)) {
                        if (v7.d() != 1) {
                            v5 = v7;
                            if (v5.d() != 3 || c0021q5.f177b <= c0021q.f177b) {
                                z10 = false;
                                r rVar4 = new r(c0021q5, c0021q, z10);
                                c0021q2 = rVar4.f180b;
                                c0021q3 = rVar4.f179a;
                                C0020p c0020p4 = (C0020p) v5.f63d;
                                if (c0021q3.f178c != c0021q2.f178c) {
                                    break;
                                } else {
                                    boolean z12 = rVar4.f181c;
                                    if ((z12 ? c0021q3 : c0021q2).f177b == 0) {
                                        if (((A0.I) c0020p4.f175e).f289a.f279a.f328a.length() == (z12 ? c0021q2 : c0021q3).f177b) {
                                            new M2.A().f3576d = true;
                                            String str = ((A0.I) c0020p4.f175e).f289a.f279a.f328a;
                                            r rVar5 = (r) obj;
                                            if (rVar5 != null && str.length() != 0) {
                                                String str2 = ((A0.I) c0020p4.f175e).f289a.f279a.f328a;
                                                int length = str2.length();
                                                boolean z13 = v5.f61b;
                                                int i14 = c0020p4.f172b;
                                                if (i14 == 0) {
                                                    int m4 = w.M.m(0, str2);
                                                    a4 = z13 ? r.a(rVar4, j0.c.r(c0021q3, c0020p4, m4), null, true, 2) : r.a(rVar4, null, j0.c.r(c0021q2, c0020p4, m4), false, 1);
                                                } else if (i14 == length) {
                                                    int p5 = w.M.p(length, str2);
                                                    a4 = z13 ? r.a(rVar4, j0.c.r(c0021q3, c0020p4, p5), null, false, 2) : r.a(rVar4, null, j0.c.r(c0021q2, c0020p4, p5), true, 1);
                                                } else {
                                                    boolean z14 = rVar5.f181c;
                                                    int p6 = z13 ^ z14 ? w.M.p(i14, str2) : w.M.m(i14, str2);
                                                    a4 = z13 ? r.a(rVar4, j0.c.r(c0021q3, c0020p4, p6), null, z14, 2) : r.a(rVar4, null, j0.c.r(c0021q2, c0020p4, p6), z14, 1);
                                                }
                                                rVar3 = a4;
                                            }
                                        }
                                    }
                                    rVar3 = rVar4;
                                }
                            }
                        } else {
                            v5 = v7;
                        }
                        z10 = true;
                        r rVar42 = new r(c0021q5, c0021q, z10);
                        c0021q2 = rVar42.f180b;
                        c0021q3 = rVar42.f179a;
                        C0020p c0020p42 = (C0020p) v5.f63d;
                        if (c0021q3.f178c != c0021q2.f178c) {
                        }
                    }
                    rVar2 = rVar3;
                    break;
                } else {
                    rVar2 = j0.c.j(v7, C0023t.f184c);
                    break;
                }
                break;
        }
        long j9 = M1.a.j(a0Var.f85b.a(rVar2.f179a.f177b), a0Var.f85b.a(rVar2.f180b.f177b));
        long j10 = j5;
        if (A0.K.a(j9, j10)) {
            return j10;
        }
        boolean z15 = A0.K.f(j9) != A0.K.f(j10) && A0.K.a(M1.a.j((int) (4294967295L & j9), (int) (j9 >> 32)), j10);
        if (A0.K.b(j9) && A0.K.b(j10)) {
            yVar2 = yVar;
            z7 = true;
        } else {
            yVar2 = yVar;
            z7 = false;
        }
        C0036g c0036g = yVar2.f3093a;
        if (z6 && c0036g.f328a.length() > 0 && !z15 && !z7 && (interfaceC0646a = a0Var.f91h) != null) {
            ((C0647b) interfaceC0646a).a();
        }
        a0Var.f86c.invoke(c(c0036g, j9));
        if (!z6) {
            a0Var.p(!A0.K.b(j9));
        }
        w.P p7 = a0Var.f87d;
        if (p7 != null) {
            p7.f11070q.setValue(Boolean.valueOf(z6));
        }
        w.P p8 = a0Var.f87d;
        if (p8 != null) {
            p8.f11066m.setValue(Boolean.valueOf(!A0.K.b(j9) && j0.c.D(a0Var, true)));
        }
        w.P p9 = a0Var.f87d;
        if (p9 == null) {
            z8 = false;
        } else {
            if (A0.K.b(j9)) {
                z8 = false;
            } else {
                z8 = false;
                if (j0.c.D(a0Var, false)) {
                    z9 = true;
                    p9.f11067n.setValue(Boolean.valueOf(z9));
                }
            }
            z9 = z8;
            p9.f11067n.setValue(Boolean.valueOf(z9));
        }
        w.P p10 = a0Var.f87d;
        if (p10 != null) {
            if (A0.K.b(j9) && j0.c.D(a0Var, true)) {
                z8 = true;
            }
            p10.f11068o.setValue(Boolean.valueOf(z8));
        }
        return j9;
    }

    public static G0.y c(C0036g c0036g, long j4) {
        return new G0.y(c0036g, j4, (A0.K) null);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [M2.p, kotlin.jvm.functions.Function1] */
    public final void b(boolean z4) {
        if (A0.K.b(j().f3094b)) {
            return;
        }
        InterfaceC1138d0 interfaceC1138d0 = this.f89f;
        if (interfaceC1138d0 != null) {
            ((C1145h) interfaceC1138d0).a(u3.d.G(j()));
        }
        if (z4) {
            int d4 = A0.K.d(j().f3094b);
            this.f86c.invoke(c(j().f3093a, M1.a.j(d4, d4)));
            n(EnumC1257F.f11023d);
        }
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [M2.p, kotlin.jvm.functions.Function1] */
    public final void d() {
        if (A0.K.b(j().f3094b)) {
            return;
        }
        InterfaceC1138d0 interfaceC1138d0 = this.f89f;
        if (interfaceC1138d0 != null) {
            ((C1145h) interfaceC1138d0).a(u3.d.G(j()));
        }
        C0036g I3 = u3.d.I(j(), j().f3093a.f328a.length());
        C0036g H3 = u3.d.H(j(), j().f3093a.f328a.length());
        C0033d c0033d = new C0033d(I3);
        c0033d.b(H3);
        C0036g c4 = c0033d.c();
        int e4 = A0.K.e(j().f3094b);
        this.f86c.invoke(c(c4, M1.a.j(e4, e4)));
        n(EnumC1257F.f11023d);
        this.f84a.f11317f = true;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [M2.p, kotlin.jvm.functions.Function1] */
    public final void e(Y.c cVar) {
        if (!A0.K.b(j().f3094b)) {
            w.P p4 = this.f87d;
            o0 d4 = p4 != null ? p4.d() : null;
            int d5 = (cVar == null || d4 == null) ? A0.K.d(j().f3094b) : this.f85b.a(d4.b(cVar.f4372a, true));
            this.f86c.invoke(G0.y.a(j(), null, M1.a.j(d5, d5), 5));
        }
        n((cVar == null || j().f3093a.f328a.length() <= 0) ? EnumC1257F.f11023d : EnumC1257F.f11025i);
        p(false);
    }

    public final void f(boolean z4) {
        X.p pVar;
        w.P p4 = this.f87d;
        if (p4 != null && !p4.b() && (pVar = this.f92i) != null) {
            pVar.a(X.i.f4327k);
        }
        this.f101r = j();
        p(z4);
        n(EnumC1257F.f11024e);
    }

    public final Y.c g() {
        return (Y.c) this.f99p.getValue();
    }

    public final boolean h() {
        return ((Boolean) this.f94k.getValue()).booleanValue();
    }

    public final long i(boolean z4) {
        o0 d4;
        long j4;
        w.P p4 = this.f87d;
        if (p4 == null || (d4 = p4.d()) == null) {
            return 9205357640488583168L;
        }
        A0.I i2 = d4.f11290a;
        w.P p5 = this.f87d;
        C0036g c0036g = p5 != null ? p5.f11054a.f11118a : null;
        if (c0036g == null) {
            return 9205357640488583168L;
        }
        if (!Intrinsics.a(c0036g.f328a, i2.f289a.f279a.f328a)) {
            return 9205357640488583168L;
        }
        G0.y j5 = j();
        if (z4) {
            long j6 = j5.f3094b;
            int i4 = A0.K.f300c;
            j4 = j6 >> 32;
        } else {
            long j7 = j5.f3094b;
            int i5 = A0.K.f300c;
            j4 = j7 & 4294967295L;
        }
        int b4 = this.f85b.b((int) j4);
        boolean f4 = A0.K.f(j().f3094b);
        int e4 = i2.e(b4);
        A0.o oVar = i2.f290b;
        if (e4 >= oVar.f355f) {
            return 9205357640488583168L;
        }
        boolean z5 = i2.a(((!z4 || f4) && (z4 || !f4)) ? Math.max(b4 + (-1), 0) : b4) == i2.i(b4);
        oVar.j(b4);
        int length = ((C0036g) oVar.f350a.f362c).f328a.length();
        ArrayList arrayList = oVar.f357h;
        A0.r rVar = (A0.r) arrayList.get(b4 == length ? C1441y.d(arrayList) : u3.d.x(b4, arrayList));
        C0031b c0031b = rVar.f366a;
        int b5 = rVar.b(b4);
        B0.F f5 = c0031b.f313d;
        float h4 = z5 ? f5.h(b5, false) : f5.i(b5, false);
        long j8 = i2.f291c;
        return AbstractC0345a.c(kotlin.ranges.b.d(h4, 0.0f, (int) (j8 >> 32)), kotlin.ranges.b.d(oVar.b(e4), 0.0f, (int) (j8 & 4294967295L)));
    }

    public final G0.y j() {
        return (G0.y) this.f88e.getValue();
    }

    public final void k() {
        M0 m02 = this.f90g;
        if ((m02 != null ? ((s0.S) m02).f10135d : 0) != 1 || m02 == null) {
            return;
        }
        s0.S s4 = (s0.S) m02;
        s4.f10135d = 2;
        ActionMode actionMode = s4.f10133b;
        if (actionMode != null) {
            actionMode.finish();
        }
        s4.f10133b = null;
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [M2.p, kotlin.jvm.functions.Function1] */
    public final void l() {
        int i2;
        Spanned spanned;
        byte b4 = 2;
        byte b5 = 1;
        InterfaceC1138d0 interfaceC1138d0 = this.f89f;
        if (interfaceC1138d0 != null) {
            ClipData primaryClip = ((C1145h) interfaceC1138d0).f10234a.getPrimaryClip();
            C0036g c0036g = null;
            if (primaryClip == null || primaryClip.getItemCount() <= 0) {
                c0036g = null;
            } else {
                int i4 = 0;
                ClipData.Item itemAt = primaryClip.getItemAt(0);
                CharSequence text = itemAt != null ? itemAt.getText() : null;
                if (text != null) {
                    if (text instanceof Spanned) {
                        Spanned spanned2 = (Spanned) text;
                        Annotation[] annotationArr = (Annotation[]) spanned2.getSpans(0, text.length(), Annotation.class);
                        ArrayList arrayList = new ArrayList();
                        int u4 = C1439w.u(annotationArr);
                        if (u4 >= 0) {
                            int i5 = 0;
                            while (true) {
                                Annotation annotation = annotationArr[i5];
                                if (Intrinsics.a(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                                    int spanStart = spanned2.getSpanStart(annotation);
                                    int spanEnd = spanned2.getSpanEnd(annotation);
                                    String value = annotation.getValue();
                                    Parcel obtain = Parcel.obtain();
                                    byte[] decode = Base64.decode(value, i4);
                                    obtain.unmarshall(decode, i4, decode.length);
                                    obtain.setDataPosition(i4);
                                    long j4 = C0323u.f4547g;
                                    long j5 = j4;
                                    long j6 = M0.m.f3560c;
                                    long j7 = j6;
                                    F0.k kVar = null;
                                    F0.i iVar = null;
                                    F0.j jVar = null;
                                    String str = null;
                                    L0.a aVar = null;
                                    L0.o oVar = null;
                                    L0.j jVar2 = null;
                                    Z.O o4 = null;
                                    while (obtain.dataAvail() > b5) {
                                        byte readByte = obtain.readByte();
                                        if (readByte != b5) {
                                            spanned = spanned2;
                                            if (readByte != b4) {
                                                int i6 = 3;
                                                if (readByte != 3) {
                                                    if (readByte == 4) {
                                                        b5 = 1;
                                                        if (obtain.dataAvail() >= 1) {
                                                            byte readByte2 = obtain.readByte();
                                                            iVar = new F0.i((readByte2 != 0 && readByte2 == 1) ? 1 : 0);
                                                            spanned2 = spanned;
                                                            b4 = 2;
                                                            i4 = 0;
                                                        }
                                                    } else if (readByte != 5) {
                                                        if (readByte == 6) {
                                                            str = obtain.readString();
                                                        } else if (readByte == 7) {
                                                            if (obtain.dataAvail() >= 5) {
                                                                byte readByte3 = obtain.readByte();
                                                                long j8 = readByte3 == 1 ? 4294967296L : readByte3 == 2 ? 8589934592L : 0L;
                                                                j7 = M0.n.a(j8, 0L) ? M0.m.f3560c : u3.l.p0(obtain.readFloat(), j8);
                                                            }
                                                        } else if (readByte == 8) {
                                                            if (obtain.dataAvail() >= 4) {
                                                                aVar = new L0.a(obtain.readFloat());
                                                            }
                                                        } else if (readByte == 9) {
                                                            if (obtain.dataAvail() >= 8) {
                                                                oVar = new L0.o(obtain.readFloat(), obtain.readFloat());
                                                            }
                                                        } else if (readByte != 10) {
                                                            if (readByte != 11) {
                                                                i2 = 0;
                                                                if (readByte == 12) {
                                                                    if (obtain.dataAvail() < 20) {
                                                                        break;
                                                                    }
                                                                    long readLong = obtain.readLong();
                                                                    y.a aVar2 = y2.y.f11688e;
                                                                    int i7 = C0323u.f4548h;
                                                                    o4 = new Z.O(readLong, AbstractC0345a.c(obtain.readFloat(), obtain.readFloat()), obtain.readFloat());
                                                                }
                                                            } else if (obtain.dataAvail() >= 4) {
                                                                int readInt = obtain.readInt();
                                                                boolean z4 = (readInt & 2) != 0;
                                                                boolean z5 = (readInt & 1) != 0;
                                                                L0.j jVar3 = L0.j.f3512d;
                                                                L0.j jVar4 = L0.j.f3511c;
                                                                if (z4 && z5) {
                                                                    List e4 = C1441y.e(jVar3, jVar4);
                                                                    i2 = 0;
                                                                    Integer num = 0;
                                                                    int size = e4.size();
                                                                    for (int i8 = 0; i8 < size; i8++) {
                                                                        num = Integer.valueOf(((L0.j) e4.get(i8)).f3513a | num.intValue());
                                                                    }
                                                                    jVar2 = new L0.j(num.intValue());
                                                                } else {
                                                                    i2 = 0;
                                                                    jVar2 = z4 ? jVar3 : z5 ? jVar4 : L0.j.f3510b;
                                                                }
                                                            }
                                                            i4 = i2;
                                                            spanned2 = spanned;
                                                            b4 = 2;
                                                            b5 = 1;
                                                        } else if (obtain.dataAvail() >= 8) {
                                                            j5 = obtain.readLong();
                                                            y.a aVar3 = y2.y.f11688e;
                                                            int i9 = C0323u.f4548h;
                                                        }
                                                        spanned2 = spanned;
                                                        b4 = 2;
                                                        b5 = 1;
                                                        i4 = 0;
                                                    } else if (obtain.dataAvail() >= 1) {
                                                        byte readByte4 = obtain.readByte();
                                                        if (readByte4 != 0) {
                                                            if (readByte4 == 1) {
                                                                i6 = 1;
                                                            } else if (readByte4 != 3) {
                                                                if (readByte4 == 2) {
                                                                    i6 = 2;
                                                                }
                                                            }
                                                            jVar = new F0.j(i6);
                                                            spanned2 = spanned;
                                                            b4 = 2;
                                                            b5 = 1;
                                                            i4 = 0;
                                                        }
                                                        i6 = 0;
                                                        jVar = new F0.j(i6);
                                                        spanned2 = spanned;
                                                        b4 = 2;
                                                        b5 = 1;
                                                        i4 = 0;
                                                    }
                                                    i2 = 0;
                                                    break;
                                                }
                                                if (obtain.dataAvail() < 4) {
                                                    i2 = 0;
                                                    break;
                                                }
                                                kVar = new F0.k(obtain.readInt());
                                                spanned2 = spanned;
                                                b4 = 2;
                                                b5 = 1;
                                                i4 = 0;
                                            } else {
                                                if (obtain.dataAvail() < 5) {
                                                    i2 = 0;
                                                    break;
                                                }
                                                byte readByte5 = obtain.readByte();
                                                long j9 = readByte5 == b5 ? 4294967296L : readByte5 == b4 ? 8589934592L : 0L;
                                                j6 = M0.n.a(j9, 0L) ? M0.m.f3560c : u3.l.p0(obtain.readFloat(), j9);
                                                spanned2 = spanned;
                                                b4 = 2;
                                                b5 = 1;
                                                i4 = 0;
                                            }
                                        } else {
                                            if (obtain.dataAvail() < 8) {
                                                break;
                                            }
                                            j4 = obtain.readLong();
                                            y.a aVar4 = y2.y.f11688e;
                                            int i10 = C0323u.f4548h;
                                        }
                                    }
                                    i2 = i4;
                                    spanned = spanned2;
                                    arrayList.add(new C0034e(spanStart, spanEnd, new A0.D(j4, j6, kVar, iVar, jVar, null, str, j7, aVar, oVar, null, j5, jVar2, o4, 49152)));
                                } else {
                                    i2 = i4;
                                    spanned = spanned2;
                                }
                                if (i5 == u4) {
                                    break;
                                }
                                i5++;
                                b5 = 1;
                                i4 = i2;
                                spanned2 = spanned;
                                b4 = 2;
                            }
                        }
                        c0036g = new C0036g(text.toString(), arrayList, 4);
                    } else {
                        c0036g = new C0036g(text.toString(), null, 6);
                    }
                }
            }
            if (c0036g == null) {
                return;
            }
            C0033d c0033d = new C0033d(u3.d.I(j(), j().f3093a.f328a.length()));
            c0033d.b(c0036g);
            C0036g c4 = c0033d.c();
            C0036g H3 = u3.d.H(j(), j().f3093a.f328a.length());
            C0033d c0033d2 = new C0033d(c4);
            c0033d2.b(H3);
            C0036g c5 = c0033d2.c();
            int length = c0036g.f328a.length() + A0.K.e(j().f3094b);
            this.f86c.invoke(c(c5, M1.a.j(length, length)));
            n(EnumC1257F.f11023d);
            this.f84a.f11317f = true;
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [M2.p, kotlin.jvm.functions.Function1] */
    public final void m() {
        G0.y c4 = c(j().f3093a, M1.a.j(0, j().f3093a.f328a.length()));
        this.f86c.invoke(c4);
        this.f101r = G0.y.a(this.f101r, null, c4.f3094b, 5);
        f(true);
    }

    public final void n(EnumC1257F enumC1257F) {
        w.P p4 = this.f87d;
        if (p4 != null) {
            if (p4.a() == enumC1257F) {
                p4 = null;
            }
            if (p4 != null) {
                p4.f11064k.setValue(enumC1257F);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o() {
        Z z4;
        M0 m02;
        Z z5;
        Y.d dVar;
        ActionMode actionMode;
        float f4;
        InterfaceC0980p c4;
        InterfaceC0980p c5;
        float f5;
        InterfaceC0980p c6;
        InterfaceC0980p c7;
        InterfaceC1138d0 interfaceC1138d0;
        if (!h()) {
            return;
        }
        w.P p4 = this.f87d;
        if (p4 != null && !((Boolean) p4.f11070q.getValue()).booleanValue()) {
            return;
        }
        Z z6 = !A0.K.b(j().f3094b) ? new Z(this, 0) : null;
        boolean b4 = A0.K.b(j().f3094b);
        C0205j0 c0205j0 = this.f93j;
        Z z7 = (b4 || !((Boolean) c0205j0.getValue()).booleanValue()) ? null : new Z(this, 1);
        if (((Boolean) c0205j0.getValue()).booleanValue() && (interfaceC1138d0 = this.f89f) != null) {
            ClipDescription primaryClipDescription = ((C1145h) interfaceC1138d0).f10234a.getPrimaryClipDescription();
            if (primaryClipDescription != null ? primaryClipDescription.hasMimeType("text/*") : false) {
                z4 = new Z(this, 2);
                Z z8 = A0.K.c(j().f3094b) == j().f3093a.f328a.length() ? new Z(this, 3) : null;
                m02 = this.f90g;
                if (m02 != null) {
                    return;
                }
                w.P p5 = this.f87d;
                if (p5 != null) {
                    w.P p6 = p5.f11069p ? null : p5;
                    if (p6 != null) {
                        int b5 = this.f85b.b((int) (j().f3094b >> 32));
                        int b6 = this.f85b.b((int) (j().f3094b & 4294967295L));
                        w.P p7 = this.f87d;
                        long j4 = 0;
                        long Q3 = (p7 == null || (c7 = p7.c()) == null) ? 0L : c7.Q(i(true));
                        w.P p8 = this.f87d;
                        if (p8 != null && (c6 = p8.c()) != null) {
                            j4 = c6.Q(i(false));
                        }
                        w.P p9 = this.f87d;
                        float f6 = 0.0f;
                        if (p9 == null || (c5 = p9.c()) == null) {
                            z5 = z8;
                            f4 = 0.0f;
                        } else {
                            o0 d4 = p6.d();
                            if (d4 != null) {
                                f5 = d4.f11290a.c(b5).f4375b;
                                z5 = z8;
                            } else {
                                z5 = z8;
                                f5 = 0.0f;
                            }
                            f4 = Y.c.e(c5.Q(AbstractC0345a.c(0.0f, f5)));
                        }
                        w.P p10 = this.f87d;
                        if (p10 != null && (c4 = p10.c()) != null) {
                            o0 d5 = p6.d();
                            f6 = Y.c.e(c4.Q(AbstractC0345a.c(0.0f, d5 != null ? d5.f11290a.c(b6).f4375b : 0.0f)));
                        }
                        dVar = new Y.d(Math.min(Y.c.d(Q3), Y.c.d(j4)), Math.min(f4, f6), Math.max(Y.c.d(Q3), Y.c.d(j4)), (p6.f11054a.f11124g.e() * 25) + Math.max(Y.c.e(Q3), Y.c.e(j4)));
                        s0.S s4 = (s0.S) m02;
                        Z1.v vVar = s4.f10134c;
                        vVar.f4605b = dVar;
                        vVar.f4606c = z6;
                        vVar.f4608e = z7;
                        vVar.f4607d = z4;
                        vVar.f4609f = z5;
                        actionMode = s4.f10133b;
                        if (actionMode == null) {
                            actionMode.invalidate();
                            return;
                        } else {
                            s4.f10135d = 1;
                            s4.f10133b = N0.f10101a.b(s4.f10132a, new C1216a(vVar), 1);
                            return;
                        }
                    }
                }
                z5 = z8;
                dVar = Y.d.f4373e;
                s0.S s42 = (s0.S) m02;
                Z1.v vVar2 = s42.f10134c;
                vVar2.f4605b = dVar;
                vVar2.f4606c = z6;
                vVar2.f4608e = z7;
                vVar2.f4607d = z4;
                vVar2.f4609f = z5;
                actionMode = s42.f10133b;
                if (actionMode == null) {
                }
            }
        }
        z4 = null;
        if (A0.K.c(j().f3094b) == j().f3093a.f328a.length()) {
        }
        m02 = this.f90g;
        if (m02 != null) {
        }
    }

    public final void p(boolean z4) {
        w.P p4 = this.f87d;
        if (p4 != null) {
            p4.f11065l.setValue(Boolean.valueOf(z4));
        }
        if (z4) {
            o();
        } else {
            k();
        }
    }
}
