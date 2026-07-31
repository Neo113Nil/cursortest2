package B;

import C0.C0026b;
import C0.C0028d;
import C0.C0029e;
import C0.C0031g;
import I.C0143d;
import I.C0156j0;
import a.AbstractC0235a;
import a0.C0238c;
import a0.C0239d;
import android.content.ClipData;
import android.content.ClipDescription;
import android.os.Parcel;
import android.text.Annotation;
import android.text.Spanned;
import android.util.Base64;
import android.view.ActionMode;
import b0.C0352v;
import j0.C0554b;
import j0.InterfaceC0553a;
import java.util.ArrayList;
import java.util.List;
import r0.InterfaceC0919p;
import u0.C1102h;
import u0.InterfaceC1095d0;
import u0.L0;
import u0.M0;
import w0.C1173a;
import x.p0;
import x.q0;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final q0 f342a;

    /* renamed from: b, reason: collision with root package name */
    public I0.t f343b = x.N.f9960c;

    /* renamed from: c, reason: collision with root package name */
    public f2.k f344c = G.f283h;

    /* renamed from: d, reason: collision with root package name */
    public x.Q f345d;

    /* renamed from: e, reason: collision with root package name */
    public final C0156j0 f346e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC1095d0 f347f;

    /* renamed from: g, reason: collision with root package name */
    public L0 f348g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC0553a f349h;

    /* renamed from: i, reason: collision with root package name */
    public Z.p f350i;

    /* renamed from: j, reason: collision with root package name */
    public final C0156j0 f351j;

    /* renamed from: k, reason: collision with root package name */
    public final C0156j0 f352k;

    /* renamed from: l, reason: collision with root package name */
    public long f353l;

    /* renamed from: m, reason: collision with root package name */
    public Integer f354m;

    /* renamed from: n, reason: collision with root package name */
    public long f355n;

    /* renamed from: o, reason: collision with root package name */
    public final C0156j0 f356o;

    /* renamed from: p, reason: collision with root package name */
    public final C0156j0 f357p;

    /* renamed from: q, reason: collision with root package name */
    public int f358q;

    /* renamed from: r, reason: collision with root package name */
    public I0.z f359r;

    /* renamed from: s, reason: collision with root package name */
    public U f360s;

    /* renamed from: t, reason: collision with root package name */
    public final W f361t;

    /* renamed from: u, reason: collision with root package name */
    public final Y f362u;

    public a0(q0 q0Var) {
        this.f342a = q0Var;
        I0.z zVar = new I0.z((String) null, 0L, 7);
        I.W w2 = I.W.f2783i;
        this.f346e = C0143d.K(zVar, w2);
        Boolean bool = Boolean.TRUE;
        this.f351j = C0143d.K(bool, w2);
        this.f352k = C0143d.K(bool, w2);
        this.f353l = 0L;
        this.f355n = 0L;
        this.f356o = C0143d.K(null, w2);
        this.f357p = C0143d.K(null, w2);
        this.f358q = -1;
        this.f359r = new I0.z((String) null, 0L, 7);
        this.f361t = new W(this, 1);
        this.f362u = new Y(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x0136, code lost:
    
        if (r5.f433b == r4.f433b) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x015f, code lost:
    
        r7 = ((C0.H) r3.f431e).f557a.f547a.f596a;
        r1 = (B.C0016q) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x016b, code lost:
    
        if (r1 == null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0171, code lost:
    
        if (r7.length() != 0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0174, code lost:
    
        r7 = ((C0.H) r3.f431e).f557a.f547a.f596a;
        r8 = r7.length();
        r2 = r2.f318b;
        r11 = r3.f428b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0187, code lost:
    
        if (r11 != 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0189, code lost:
    
        r1 = x.N.m(r7, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x018e, code lost:
    
        if (r2 == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0190, code lost:
    
        r1 = B.C0016q.a(r6, O2.d.s(r5, r3, r1), null, true, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01ed, code lost:
    
        r2 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x019b, code lost:
    
        r1 = B.C0016q.a(r6, null, O2.d.s(r4, r3, r1), false, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x01a9, code lost:
    
        if (r11 != r8) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x01ab, code lost:
    
        r1 = x.N.p(r7, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x01af, code lost:
    
        if (r2 == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x01b1, code lost:
    
        r1 = B.C0016q.a(r6, O2.d.s(r5, r3, r1), null, false, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x01ba, code lost:
    
        r1 = B.C0016q.a(r6, null, O2.d.s(r4, r3, r1), true, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x01c5, code lost:
    
        if (r1.f437c != true) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x01c7, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x01cc, code lost:
    
        if ((r2 ^ r1) == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x01ce, code lost:
    
        r7 = x.N.p(r7, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x01d7, code lost:
    
        if (r2 == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x01d9, code lost:
    
        r1 = B.C0016q.a(r6, O2.d.s(r5, r3, r7), null, r1, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x01e3, code lost:
    
        r1 = B.C0016q.a(r6, null, O2.d.s(r4, r3, r7), r1, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x01d3, code lost:
    
        r7 = x.N.m(r7, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x01c9, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x015a, code lost:
    
        if (((C0.H) r3.f431e).f557a.f547a.f596a.length() != (r7 ? r4 : r5).f433b) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0139  */
    /* JADX WARN: Type inference failed for: r4v5, types: [e2.c, f2.k] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long a(a0 a0Var, I0.z zVar, long j3, boolean z3, boolean z4, r rVar, boolean z5) {
        p0 d3;
        p0 p0Var;
        int i3;
        long j4;
        U u3;
        int i4;
        int i5;
        C0016q c0016q;
        C0016q c0016q2;
        I0.z zVar2;
        boolean z6;
        boolean z7;
        boolean z8;
        InterfaceC0553a interfaceC0553a;
        C0015p o3;
        C0015p c0015p;
        U u4;
        boolean z9;
        C0015p c0015p2;
        C0015p c0015p3;
        int i6;
        x.Q q3 = a0Var.f345d;
        if (q3 == null || (d3 = q3.d()) == null) {
            return C0.J.f567b;
        }
        I0.t tVar = a0Var.f343b;
        long j5 = zVar.f3098b;
        int i7 = C0.J.f568c;
        int b3 = tVar.b((int) (j5 >> 32));
        I0.t tVar2 = a0Var.f343b;
        long j6 = zVar.f3098b;
        long J3 = O2.l.J(b3, tVar2.b((int) (j6 & 4294967295L)));
        int b4 = d3.b(j3, false);
        if (z4 || z3) {
            p0Var = d3;
            i3 = b4;
        } else {
            p0Var = d3;
            i3 = (int) (J3 >> 32);
        }
        int i8 = (!z4 || z3) ? b4 : (int) (J3 & 4294967295L);
        U u5 = a0Var.f360s;
        int i9 = -1;
        if (!z3 && u5 != null && (i6 = a0Var.f358q) != -1) {
            i9 = i6;
        }
        C0.H h3 = p0Var.f10230a;
        if (z3) {
            i5 = i9;
            u3 = u5;
            j4 = j6;
            c0016q = null;
            i4 = i3;
        } else {
            j4 = j6;
            int i10 = (int) (J3 >> 32);
            u3 = u5;
            int i11 = (int) (J3 & 4294967295L);
            i4 = i3;
            i5 = i9;
            c0016q = new C0016q(new C0015p(AbstractC0235a.C(h3, i10), i10, 1L), new C0015p(AbstractC0235a.C(h3, i11), i11, 1L), C0.J.f(J3));
        }
        int i12 = i4;
        U u6 = new U(z4, c0016q, new C0014o(i12, i8, i5, h3));
        Object obj = u6.f319c;
        Object obj2 = u6.f320d;
        if (c0016q != null && u3 != null) {
            U u7 = u3;
            if (z4 == u7.f318b) {
                C0014o c0014o = (C0014o) u7.f320d;
                if (i12 == c0014o.f428b && i8 == c0014o.f429c) {
                    return j4;
                }
            }
        }
        a0Var.f360s = u6;
        a0Var.f358q = b4;
        switch (rVar.f438a) {
            case 0:
                C0014o c0014o2 = (C0014o) obj2;
                c0016q2 = new C0016q(c0014o2.a(c0014o2.f428b), c0014o2.a(c0014o2.f429c), u6.d() == 1);
                break;
            case 1:
                c0016q2 = O2.d.j(u6, C0017s.f440c);
                break;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                c0016q2 = O2.d.j(u6, C0017s.f439b);
                break;
            default:
                C0016q c0016q3 = (C0016q) obj;
                if (c0016q3 != null) {
                    C0014o c0014o3 = (C0014o) obj2;
                    boolean z10 = u6.f318b;
                    C0015p c0015p4 = c0016q3.f436b;
                    C0015p c0015p5 = c0016q3.f435a;
                    if (z10) {
                        o3 = O2.d.o(u6, c0014o3, c0015p5);
                        c0015p = c0015p4;
                        c0015p4 = c0015p5;
                        c0015p5 = o3;
                    } else {
                        o3 = O2.d.o(u6, c0014o3, c0015p4);
                        c0015p = o3;
                    }
                    if (!f2.j.a(o3, c0015p4)) {
                        if (u6.d() != 1) {
                            u4 = u6;
                            if (u4.d() != 3 || c0015p5.f433b <= c0015p.f433b) {
                                z9 = false;
                                C0016q c0016q4 = new C0016q(c0015p5, c0015p, z9);
                                c0015p2 = c0016q4.f436b;
                                c0015p3 = c0016q4.f435a;
                                C0014o c0014o4 = (C0014o) obj2;
                                if (c0015p3.f434c != c0015p2.f434c) {
                                    break;
                                } else {
                                    boolean z11 = c0016q4.f437c;
                                    if ((z11 ? c0015p3 : c0015p2).f433b == 0) {
                                        break;
                                    }
                                    c0016q3 = c0016q4;
                                }
                            }
                        } else {
                            u4 = u6;
                        }
                        z9 = true;
                        C0016q c0016q42 = new C0016q(c0015p5, c0015p, z9);
                        c0015p2 = c0016q42.f436b;
                        c0015p3 = c0016q42.f435a;
                        C0014o c0014o42 = (C0014o) obj2;
                        if (c0015p3.f434c != c0015p2.f434c) {
                        }
                    }
                    c0016q2 = c0016q3;
                    break;
                } else {
                    c0016q2 = O2.d.j(u6, C0017s.f440c);
                    break;
                }
                break;
        }
        long J4 = O2.l.J(a0Var.f343b.a(c0016q2.f435a.f433b), a0Var.f343b.a(c0016q2.f436b.f433b));
        long j7 = j4;
        if (C0.J.a(J4, j7)) {
            return j7;
        }
        boolean z12 = C0.J.f(J4) != C0.J.f(j7) && C0.J.a(O2.l.J((int) (4294967295L & J4), (int) (J4 >> 32)), j7);
        if (C0.J.b(J4) && C0.J.b(j7)) {
            zVar2 = zVar;
            z6 = true;
        } else {
            zVar2 = zVar;
            z6 = false;
        }
        C0031g c0031g = zVar2.f3097a;
        if (z5 && c0031g.f596a.length() > 0 && !z12 && !z6 && (interfaceC0553a = a0Var.f349h) != null) {
            ((C0554b) interfaceC0553a).a();
        }
        a0Var.f344c.n(c(c0031g, J4));
        if (!z5) {
            a0Var.p(!C0.J.b(J4));
        }
        x.Q q4 = a0Var.f345d;
        if (q4 != null) {
            q4.f9991q.setValue(Boolean.valueOf(z5));
        }
        x.Q q5 = a0Var.f345d;
        if (q5 != null) {
            q5.f9987m.setValue(Boolean.valueOf(!C0.J.b(J4) && O2.d.W(a0Var, true)));
        }
        x.Q q6 = a0Var.f345d;
        if (q6 == null) {
            z7 = false;
        } else {
            if (C0.J.b(J4)) {
                z7 = false;
            } else {
                z7 = false;
                if (O2.d.W(a0Var, false)) {
                    z8 = true;
                    q6.f9988n.setValue(Boolean.valueOf(z8));
                }
            }
            z8 = z7;
            q6.f9988n.setValue(Boolean.valueOf(z8));
        }
        x.Q q7 = a0Var.f345d;
        if (q7 != null) {
            if (C0.J.b(J4) && O2.d.W(a0Var, true)) {
                z7 = true;
            }
            q7.f9989o.setValue(Boolean.valueOf(z7));
        }
        return J4;
    }

    public static I0.z c(C0031g c0031g, long j3) {
        return new I0.z(c0031g, j3, (C0.J) null);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [e2.c, f2.k] */
    public final void b(boolean z3) {
        if (C0.J.b(j().f3098b)) {
            return;
        }
        InterfaceC1095d0 interfaceC1095d0 = this.f347f;
        if (interfaceC1095d0 != null) {
            ((C1102h) interfaceC1095d0).a(O2.d.S(j()));
        }
        if (z3) {
            int d3 = C0.J.d(j().f3098b);
            this.f344c.n(c(j().f3097a, O2.l.J(d3, d3)));
            n(x.F.f9944d);
        }
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [e2.c, f2.k] */
    public final void d() {
        if (C0.J.b(j().f3098b)) {
            return;
        }
        InterfaceC1095d0 interfaceC1095d0 = this.f347f;
        if (interfaceC1095d0 != null) {
            ((C1102h) interfaceC1095d0).a(O2.d.S(j()));
        }
        C0031g V2 = O2.d.V(j(), j().f3097a.f596a.length());
        C0031g U3 = O2.d.U(j(), j().f3097a.f596a.length());
        C0028d c0028d = new C0028d(V2);
        c0028d.b(U3);
        C0031g c2 = c0028d.c();
        int e3 = C0.J.e(j().f3098b);
        this.f344c.n(c(c2, O2.l.J(e3, e3)));
        n(x.F.f9944d);
        this.f342a.f10240f = true;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [e2.c, f2.k] */
    public final void e(C0238c c0238c) {
        if (!C0.J.b(j().f3098b)) {
            x.Q q3 = this.f345d;
            p0 d3 = q3 != null ? q3.d() : null;
            int d4 = (c0238c == null || d3 == null) ? C0.J.d(j().f3098b) : this.f343b.a(d3.b(c0238c.f4722a, true));
            this.f344c.n(I0.z.a(j(), null, O2.l.J(d4, d4), 5));
        }
        n((c0238c == null || j().f3097a.f596a.length() <= 0) ? x.F.f9944d : x.F.f9946f);
        p(false);
    }

    public final void f(boolean z3) {
        Z.p pVar;
        x.Q q3 = this.f345d;
        if (q3 != null && !q3.b() && (pVar = this.f350i) != null) {
            pVar.a(Z.i.f4681i);
        }
        this.f359r = j();
        p(z3);
        n(x.F.f9945e);
    }

    public final C0238c g() {
        return (C0238c) this.f357p.getValue();
    }

    public final boolean h() {
        return ((Boolean) this.f352k.getValue()).booleanValue();
    }

    public final long i(boolean z3) {
        p0 d3;
        long j3;
        x.Q q3 = this.f345d;
        if (q3 == null || (d3 = q3.d()) == null) {
            return 9205357640488583168L;
        }
        C0.H h3 = d3.f10230a;
        x.Q q4 = this.f345d;
        C0031g c0031g = q4 != null ? q4.f9975a.f10039a : null;
        if (c0031g == null) {
            return 9205357640488583168L;
        }
        if (!f2.j.a(c0031g.f596a, h3.f557a.f547a.f596a)) {
            return 9205357640488583168L;
        }
        I0.z j4 = j();
        if (z3) {
            long j5 = j4.f3098b;
            int i3 = C0.J.f568c;
            j3 = j5 >> 32;
        } else {
            long j6 = j4.f3098b;
            int i4 = C0.J.f568c;
            j3 = j6 & 4294967295L;
        }
        int b3 = this.f343b.b((int) j3);
        boolean f3 = C0.J.f(j().f3098b);
        int e3 = h3.e(b3);
        C0.o oVar = h3.f558b;
        if (e3 >= oVar.f623f) {
            return 9205357640488583168L;
        }
        boolean z4 = h3.a(((!z3 || f3) && (z3 || !f3)) ? Math.max(b3 + (-1), 0) : b3) == h3.i(b3);
        oVar.j(b3);
        int length = ((C0031g) oVar.f618a.f630c).f596a.length();
        ArrayList arrayList = oVar.f625h;
        C0.r rVar = (C0.r) arrayList.get(b3 == length ? S1.m.z0(arrayList) : l0.c.t(b3, arrayList));
        C0026b c0026b = rVar.f634a;
        int b4 = rVar.b(b3);
        D0.G g3 = c0026b.f581d;
        float h4 = z4 ? g3.h(b4, false) : g3.i(b4, false);
        long j7 = h3.f559c;
        return l0.c.e(O2.d.x(h4, 0.0f, (int) (j7 >> 32)), O2.d.x(oVar.b(e3), 0.0f, (int) (j7 & 4294967295L)));
    }

    public final I0.z j() {
        return (I0.z) this.f346e.getValue();
    }

    public final void k() {
        L0 l02 = this.f348g;
        if ((l02 != null ? ((u0.T) l02).f9273d : 0) != 1 || l02 == null) {
            return;
        }
        u0.T t3 = (u0.T) l02;
        t3.f9273d = 2;
        ActionMode actionMode = t3.f9271b;
        if (actionMode != null) {
            actionMode.finish();
        }
        t3.f9271b = null;
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [e2.c, f2.k] */
    public final void l() {
        int i3;
        Spanned spanned;
        byte b3 = 2;
        byte b4 = 1;
        InterfaceC1095d0 interfaceC1095d0 = this.f347f;
        if (interfaceC1095d0 != null) {
            ClipData primaryClip = ((C1102h) interfaceC1095d0).f9370a.getPrimaryClip();
            C0031g c0031g = null;
            if (primaryClip == null || primaryClip.getItemCount() <= 0) {
                c0031g = null;
            } else {
                int i4 = 0;
                ClipData.Item itemAt = primaryClip.getItemAt(0);
                CharSequence text = itemAt != null ? itemAt.getText() : null;
                if (text != null) {
                    if (text instanceof Spanned) {
                        Spanned spanned2 = (Spanned) text;
                        Annotation[] annotationArr = (Annotation[]) spanned2.getSpans(0, text.length(), Annotation.class);
                        ArrayList arrayList = new ArrayList();
                        f2.j.f(annotationArr, "<this>");
                        int length = annotationArr.length - 1;
                        if (length >= 0) {
                            int i5 = 0;
                            while (true) {
                                Annotation annotation = annotationArr[i5];
                                if (f2.j.a(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                                    int spanStart = spanned2.getSpanStart(annotation);
                                    int spanEnd = spanned2.getSpanEnd(annotation);
                                    String value = annotation.getValue();
                                    Parcel obtain = Parcel.obtain();
                                    byte[] decode = Base64.decode(value, i4);
                                    obtain.unmarshall(decode, i4, decode.length);
                                    obtain.setDataPosition(i4);
                                    long j3 = C0352v.f5439g;
                                    long j4 = j3;
                                    long j5 = O0.m.f3746c;
                                    long j6 = j5;
                                    H0.k kVar = null;
                                    H0.i iVar = null;
                                    H0.j jVar = null;
                                    String str = null;
                                    N0.a aVar = null;
                                    N0.n nVar = null;
                                    N0.j jVar2 = null;
                                    b0.P p3 = null;
                                    while (obtain.dataAvail() > b4) {
                                        byte readByte = obtain.readByte();
                                        if (readByte != b4) {
                                            spanned = spanned2;
                                            if (readByte != b3) {
                                                int i6 = 3;
                                                if (readByte != 3) {
                                                    if (readByte == 4) {
                                                        b4 = 1;
                                                        if (obtain.dataAvail() >= 1) {
                                                            byte readByte2 = obtain.readByte();
                                                            iVar = new H0.i((readByte2 != 0 && readByte2 == 1) ? 1 : 0);
                                                            spanned2 = spanned;
                                                            b3 = 2;
                                                            i4 = 0;
                                                        }
                                                    } else if (readByte != 5) {
                                                        if (readByte == 6) {
                                                            str = obtain.readString();
                                                        } else if (readByte == 7) {
                                                            if (obtain.dataAvail() >= 5) {
                                                                byte readByte3 = obtain.readByte();
                                                                long j7 = readByte3 == 1 ? 4294967296L : readByte3 == 2 ? 8589934592L : 0L;
                                                                j6 = O0.n.a(j7, 0L) ? O0.m.f3746c : O2.l.q0(j7, obtain.readFloat());
                                                            }
                                                        } else if (readByte == 8) {
                                                            if (obtain.dataAvail() >= 4) {
                                                                aVar = new N0.a(obtain.readFloat());
                                                            }
                                                        } else if (readByte == 9) {
                                                            if (obtain.dataAvail() >= 8) {
                                                                nVar = new N0.n(obtain.readFloat(), obtain.readFloat());
                                                            }
                                                        } else if (readByte != 10) {
                                                            if (readByte != 11) {
                                                                i3 = 0;
                                                                if (readByte == 12) {
                                                                    if (obtain.dataAvail() < 20) {
                                                                        break;
                                                                    }
                                                                    long readLong = obtain.readLong();
                                                                    int i7 = C0352v.f5440h;
                                                                    p3 = new b0.P(readLong, l0.c.e(obtain.readFloat(), obtain.readFloat()), obtain.readFloat());
                                                                }
                                                            } else if (obtain.dataAvail() >= 4) {
                                                                int readInt = obtain.readInt();
                                                                boolean z3 = (readInt & 2) != 0;
                                                                boolean z4 = (readInt & 1) != 0;
                                                                N0.j jVar3 = N0.j.f3550d;
                                                                N0.j jVar4 = N0.j.f3549c;
                                                                if (z3 && z4) {
                                                                    List A02 = S1.m.A0(jVar3, jVar4);
                                                                    i3 = 0;
                                                                    Integer num = 0;
                                                                    int size = A02.size();
                                                                    for (int i8 = 0; i8 < size; i8++) {
                                                                        num = Integer.valueOf(((N0.j) A02.get(i8)).f3551a | num.intValue());
                                                                    }
                                                                    jVar2 = new N0.j(num.intValue());
                                                                } else {
                                                                    i3 = 0;
                                                                    jVar2 = z3 ? jVar3 : z4 ? jVar4 : N0.j.f3548b;
                                                                }
                                                            }
                                                            i4 = i3;
                                                            spanned2 = spanned;
                                                            b3 = 2;
                                                            b4 = 1;
                                                        } else if (obtain.dataAvail() >= 8) {
                                                            j4 = obtain.readLong();
                                                            int i9 = C0352v.f5440h;
                                                        }
                                                        spanned2 = spanned;
                                                        b3 = 2;
                                                        b4 = 1;
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
                                                            jVar = new H0.j(i6);
                                                            spanned2 = spanned;
                                                            b3 = 2;
                                                            b4 = 1;
                                                            i4 = 0;
                                                        }
                                                        i6 = 0;
                                                        jVar = new H0.j(i6);
                                                        spanned2 = spanned;
                                                        b3 = 2;
                                                        b4 = 1;
                                                        i4 = 0;
                                                    }
                                                    i3 = 0;
                                                    break;
                                                }
                                                if (obtain.dataAvail() < 4) {
                                                    i3 = 0;
                                                    break;
                                                }
                                                kVar = new H0.k(obtain.readInt());
                                                spanned2 = spanned;
                                                b3 = 2;
                                                b4 = 1;
                                                i4 = 0;
                                            } else {
                                                if (obtain.dataAvail() < 5) {
                                                    i3 = 0;
                                                    break;
                                                }
                                                byte readByte5 = obtain.readByte();
                                                long j8 = readByte5 == b4 ? 4294967296L : readByte5 == b3 ? 8589934592L : 0L;
                                                j5 = O0.n.a(j8, 0L) ? O0.m.f3746c : O2.l.q0(j8, obtain.readFloat());
                                                spanned2 = spanned;
                                                b3 = 2;
                                                b4 = 1;
                                                i4 = 0;
                                            }
                                        } else {
                                            if (obtain.dataAvail() < 8) {
                                                break;
                                            }
                                            j3 = obtain.readLong();
                                            int i10 = C0352v.f5440h;
                                        }
                                    }
                                    i3 = i4;
                                    spanned = spanned2;
                                    arrayList.add(new C0029e(spanStart, spanEnd, new C0.D(j3, j5, kVar, iVar, jVar, null, str, j6, aVar, nVar, null, j4, jVar2, p3, 49152)));
                                } else {
                                    i3 = i4;
                                    spanned = spanned2;
                                }
                                if (i5 == length) {
                                    break;
                                }
                                i5++;
                                b4 = 1;
                                i4 = i3;
                                spanned2 = spanned;
                                b3 = 2;
                            }
                        }
                        c0031g = new C0031g(text.toString(), arrayList, 4);
                    } else {
                        c0031g = new C0031g(text.toString(), null, 6);
                    }
                }
            }
            if (c0031g == null) {
                return;
            }
            C0028d c0028d = new C0028d(O2.d.V(j(), j().f3097a.f596a.length()));
            c0028d.b(c0031g);
            C0031g c2 = c0028d.c();
            C0031g U3 = O2.d.U(j(), j().f3097a.f596a.length());
            C0028d c0028d2 = new C0028d(c2);
            c0028d2.b(U3);
            C0031g c3 = c0028d2.c();
            int length2 = c0031g.f596a.length() + C0.J.e(j().f3098b);
            this.f344c.n(c(c3, O2.l.J(length2, length2)));
            n(x.F.f9944d);
            this.f342a.f10240f = true;
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [e2.c, f2.k] */
    public final void m() {
        I0.z c2 = c(j().f3097a, O2.l.J(0, j().f3097a.f596a.length()));
        this.f344c.n(c2);
        this.f359r = I0.z.a(this.f359r, null, c2.f3098b, 5);
        f(true);
    }

    public final void n(x.F f3) {
        x.Q q3 = this.f345d;
        if (q3 != null) {
            if (q3.a() == f3) {
                q3 = null;
            }
            if (q3 != null) {
                q3.f9985k.setValue(f3);
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
        Z z3;
        L0 l02;
        Z z4;
        C0239d c0239d;
        ActionMode actionMode;
        float f3;
        InterfaceC0919p c2;
        InterfaceC0919p c3;
        float f4;
        InterfaceC0919p c4;
        InterfaceC0919p c5;
        InterfaceC1095d0 interfaceC1095d0;
        if (!h()) {
            return;
        }
        x.Q q3 = this.f345d;
        if (q3 != null && !((Boolean) q3.f9991q.getValue()).booleanValue()) {
            return;
        }
        Z z5 = !C0.J.b(j().f3098b) ? new Z(this, 0) : null;
        boolean b3 = C0.J.b(j().f3098b);
        C0156j0 c0156j0 = this.f351j;
        Z z6 = (b3 || !((Boolean) c0156j0.getValue()).booleanValue()) ? null : new Z(this, 1);
        if (((Boolean) c0156j0.getValue()).booleanValue() && (interfaceC1095d0 = this.f347f) != null) {
            ClipDescription primaryClipDescription = ((C1102h) interfaceC1095d0).f9370a.getPrimaryClipDescription();
            if (primaryClipDescription != null ? primaryClipDescription.hasMimeType("text/*") : false) {
                z3 = new Z(this, 2);
                Z z7 = C0.J.c(j().f3098b) == j().f3097a.f596a.length() ? new Z(this, 3) : null;
                l02 = this.f348g;
                if (l02 != null) {
                    return;
                }
                x.Q q4 = this.f345d;
                if (q4 != null) {
                    x.Q q5 = q4.f9990p ? null : q4;
                    if (q5 != null) {
                        int b4 = this.f343b.b((int) (j().f3098b >> 32));
                        int b5 = this.f343b.b((int) (j().f3098b & 4294967295L));
                        x.Q q6 = this.f345d;
                        long j3 = 0;
                        long N3 = (q6 == null || (c5 = q6.c()) == null) ? 0L : c5.N(i(true));
                        x.Q q7 = this.f345d;
                        if (q7 != null && (c4 = q7.c()) != null) {
                            j3 = c4.N(i(false));
                        }
                        x.Q q8 = this.f345d;
                        float f5 = 0.0f;
                        if (q8 == null || (c3 = q8.c()) == null) {
                            z4 = z7;
                            f3 = 0.0f;
                        } else {
                            p0 d3 = q5.d();
                            if (d3 != null) {
                                f4 = d3.f10230a.c(b4).f4725b;
                                z4 = z7;
                            } else {
                                z4 = z7;
                                f4 = 0.0f;
                            }
                            f3 = C0238c.e(c3.N(l0.c.e(0.0f, f4)));
                        }
                        x.Q q9 = this.f345d;
                        if (q9 != null && (c2 = q9.c()) != null) {
                            p0 d4 = q5.d();
                            f5 = C0238c.e(c2.N(l0.c.e(0.0f, d4 != null ? d4.f10230a.c(b5).f4725b : 0.0f)));
                        }
                        c0239d = new C0239d(Math.min(C0238c.d(N3), C0238c.d(j3)), Math.min(f3, f5), Math.max(C0238c.d(N3), C0238c.d(j3)), (q5.f9975a.f10045g.a() * 25) + Math.max(C0238c.e(N3), C0238c.e(j3)));
                        u0.T t3 = (u0.T) l02;
                        N2.g gVar = t3.f9272c;
                        gVar.f3612b = c0239d;
                        gVar.f3613c = z5;
                        gVar.f3615e = z6;
                        gVar.f3614d = z3;
                        gVar.f3616f = z4;
                        actionMode = t3.f9271b;
                        if (actionMode == null) {
                            actionMode.invalidate();
                            return;
                        } else {
                            t3.f9273d = 1;
                            t3.f9271b = M0.f9235a.b(t3.f9270a, new C1173a(gVar), 1);
                            return;
                        }
                    }
                }
                z4 = z7;
                c0239d = C0239d.f4723e;
                u0.T t32 = (u0.T) l02;
                N2.g gVar2 = t32.f9272c;
                gVar2.f3612b = c0239d;
                gVar2.f3613c = z5;
                gVar2.f3615e = z6;
                gVar2.f3614d = z3;
                gVar2.f3616f = z4;
                actionMode = t32.f9271b;
                if (actionMode == null) {
                }
            }
        }
        z3 = null;
        if (C0.J.c(j().f3098b) == j().f3097a.f596a.length()) {
        }
        l02 = this.f348g;
        if (l02 != null) {
        }
    }

    public final void p(boolean z3) {
        x.Q q3 = this.f345d;
        if (q3 != null) {
            q3.f9986l.setValue(Boolean.valueOf(z3));
        }
        if (z3) {
            o();
        } else {
            k();
        }
    }
}
