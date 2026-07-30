package a0;

import android.content.ClipData;
import android.content.ClipDescription;
import android.os.Parcel;
import android.text.Annotation;
import android.text.Spanned;
import android.util.Base64;
import android.view.ActionMode;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.List;
import s1.i2;
import s1.j2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public final w.a1 f175a;

    /* renamed from: b, reason: collision with root package name */
    public g2.q f176b = w.g0.f9240c;

    /* renamed from: c, reason: collision with root package name */
    public q6.c f177c = h0.f81j;

    /* renamed from: d, reason: collision with root package name */
    public w.j0 f178d;

    /* renamed from: e, reason: collision with root package name */
    public final g0.g1 f179e;

    /* renamed from: f, reason: collision with root package name */
    public s1.b1 f180f;

    /* renamed from: g, reason: collision with root package name */
    public i2 f181g;

    /* renamed from: h, reason: collision with root package name */
    public h1.a f182h;

    /* renamed from: i, reason: collision with root package name */
    public x0.n f183i;

    /* renamed from: j, reason: collision with root package name */
    public final g0.g1 f184j;

    /* renamed from: k, reason: collision with root package name */
    public final g0.g1 f185k;

    /* renamed from: l, reason: collision with root package name */
    public long f186l;

    /* renamed from: m, reason: collision with root package name */
    public Integer f187m;

    /* renamed from: n, reason: collision with root package name */
    public long f188n;

    /* renamed from: o, reason: collision with root package name */
    public final g0.g1 f189o;

    /* renamed from: p, reason: collision with root package name */
    public final g0.g1 f190p;

    /* renamed from: q, reason: collision with root package name */
    public int f191q;

    /* renamed from: r, reason: collision with root package name */
    public g2.w f192r;

    /* renamed from: s, reason: collision with root package name */
    public s0 f193s;

    /* renamed from: t, reason: collision with root package name */
    public final u0 f194t;

    /* renamed from: u, reason: collision with root package name */
    public final b6.c f195u;

    public x0(w.a1 a1Var) {
        this.f175a = a1Var;
        g2.w wVar = new g2.w(7, 0L, (String) null);
        g0.t0 t0Var = g0.t0.f3903k;
        this.f179e = g0.d.J(wVar, t0Var);
        Boolean bool = Boolean.TRUE;
        this.f184j = g0.d.J(bool, t0Var);
        this.f185k = g0.d.J(bool, t0Var);
        this.f186l = 0L;
        this.f188n = 0L;
        this.f189o = g0.d.J(null, t0Var);
        this.f190p = g0.d.J(null, t0Var);
        this.f191q = -1;
        this.f192r = new g2.w(7, 0L, (String) null);
        int i7 = 1;
        this.f194t = new u0(this, i7);
        this.f195u = new b6.c(i7, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x0129, code lost:
    
        if (r5.f125b == r8.f125b) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0152, code lost:
    
        r6 = ((a2.h0) r3.f121e).f388a.f377a.f373f;
        r1 = (a0.r) r1;
        r7 = r9.f136b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0160, code lost:
    
        if (r1 == null) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0166, code lost:
    
        if (r6.length() != 0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x016a, code lost:
    
        r6 = ((a2.h0) r3.f121e).f388a.f377a.f373f;
        r9 = r3.f118b;
        r10 = r6.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x017b, code lost:
    
        if (r9 != 0) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x017d, code lost:
    
        r1 = w.g0.m(r6, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0182, code lost:
    
        if (r7 == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0184, code lost:
    
        r1 = a0.r.a(r4, a8.m.m(r5, r3, r1), null, true, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x018d, code lost:
    
        r3 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0190, code lost:
    
        r1 = a0.r.a(r4, null, a8.m.m(r8, r3, r1), false, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x019c, code lost:
    
        if (r9 != r10) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x019e, code lost:
    
        r1 = w.g0.p(r6, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x01a2, code lost:
    
        if (r7 == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x01a4, code lost:
    
        r1 = a0.r.a(r4, a8.m.m(r5, r3, r1), null, false, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x01ad, code lost:
    
        r1 = a0.r.a(r4, null, a8.m.m(r8, r3, r1), true, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x01b8, code lost:
    
        if (r1.f130c != true) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x01ba, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x01bf, code lost:
    
        if ((r7 ^ r13) == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x01c1, code lost:
    
        r1 = w.g0.p(r6, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x01ca, code lost:
    
        if (r7 == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x01cc, code lost:
    
        r1 = a0.r.a(r4, a8.m.m(r5, r3, r1), null, r13, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x01d6, code lost:
    
        r1 = a0.r.a(r4, null, a8.m.m(r8, r3, r1), r13, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x01c6, code lost:
    
        r1 = w.g0.m(r6, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x01bc, code lost:
    
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x014e, code lost:
    
        if (((a2.h0) r3.f121e).f388a.f377a.f373f.length() != (r6 ? r8 : r5).f125b) goto L109;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long a(x0 x0Var, g2.w wVar, long j8, boolean z8, boolean z9, s sVar, boolean z10) {
        w.z0 d8;
        long j9;
        r rVar;
        long j10;
        a2.g gVar;
        r rVar2;
        boolean z11;
        h1.a aVar;
        q h3;
        q qVar;
        w.j0 j0Var = x0Var.f178d;
        if (j0Var == null || (d8 = j0Var.d()) == null) {
            return a2.j0.f406b;
        }
        g2.q qVar2 = x0Var.f176b;
        long j11 = wVar.f4066b;
        a2.g gVar2 = wVar.f4065a;
        int i7 = a2.j0.f407c;
        long h8 = r4.a.h(qVar2.b((int) (j11 >> 32)), x0Var.f176b.b((int) (j11 & 4294967295L)));
        int b9 = d8.b(j8, false);
        int i8 = (z9 || z8) ? b9 : (int) (h8 >> 32);
        int i9 = (!z9 || z8) ? b9 : (int) (h8 & 4294967295L);
        s0 s0Var = x0Var.f193s;
        int i10 = -1;
        if (z8 || s0Var == null) {
            j9 = 4294967295L;
        } else {
            j9 = 4294967295L;
            int i11 = x0Var.f191q;
            if (i11 != -1) {
                i10 = i11;
            }
        }
        a2.h0 h0Var = d8.f9471a;
        if (z8) {
            gVar = gVar2;
            j10 = j11;
            rVar = null;
        } else {
            int i12 = (int) (h8 >> 32);
            j10 = j11;
            int i13 = (int) (h8 & j9);
            gVar = gVar2;
            rVar = new r(new q(r4.a.J(h0Var, i12), i12, 1L), new q(r4.a.J(h0Var, i13), i13, 1L), a2.j0.f(h8));
        }
        s0 s0Var2 = new s0(z9, rVar, new p(i8, i9, i10, h0Var));
        if (rVar != null && s0Var != null && z9 == s0Var.f136b) {
            p pVar = (p) s0Var.f138d;
            if (i8 == pVar.f118b && i9 == pVar.f119c) {
                return j10;
            }
        }
        x0Var.f193s = s0Var2;
        x0Var.f191q = b9;
        switch (sVar.f134a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                p pVar2 = (p) s0Var2.f138d;
                rVar2 = new r(pVar2.a(pVar2.f118b), pVar2.a(pVar2.f119c), s0Var2.e() == 1);
                break;
            case 1:
                rVar2 = a8.m.g(s0Var2, t.f140c);
                break;
            case 2:
                rVar2 = a8.m.g(s0Var2, t.f139b);
                break;
            default:
                Object obj = s0Var2.f137c;
                rVar2 = (r) obj;
                if (rVar2 != null) {
                    q qVar3 = rVar2.f129b;
                    q qVar4 = rVar2.f128a;
                    p pVar3 = (p) s0Var2.f138d;
                    if (s0Var2.f136b) {
                        qVar = a8.m.h(s0Var2, pVar3, qVar4);
                        h3 = qVar3;
                        qVar3 = qVar4;
                        qVar4 = qVar;
                    } else {
                        h3 = a8.m.h(s0Var2, pVar3, qVar3);
                        qVar = h3;
                    }
                    if (!r6.k.a(qVar, qVar3)) {
                        r rVar3 = new r(qVar4, h3, s0Var2.e() == 1 || (s0Var2.e() == 3 && qVar4.f125b > h3.f125b));
                        p pVar4 = (p) s0Var2.f138d;
                        q qVar5 = rVar3.f128a;
                        long j12 = qVar5.f126c;
                        q qVar6 = rVar3.f129b;
                        if (j12 != qVar6.f126c) {
                            boolean z12 = rVar3.f130c;
                            if ((z12 ? qVar5 : qVar6).f125b == 0) {
                                break;
                            }
                            rVar2 = rVar3;
                            break;
                        } else {
                            break;
                        }
                    }
                } else {
                    rVar2 = a8.m.g(s0Var2, t.f140c);
                    break;
                }
                break;
        }
        long h9 = r4.a.h(x0Var.f176b.a(rVar2.f128a.f125b), x0Var.f176b.a(rVar2.f129b.f125b));
        long j13 = j10;
        if (a2.j0.a(h9, j13)) {
            return j13;
        }
        boolean z13 = a2.j0.f(h9) != a2.j0.f(j13) && a2.j0.a(r4.a.h((int) (h9 & j9), (int) (h9 >> 32)), j13);
        boolean z14 = a2.j0.b(h9) && a2.j0.b(j13);
        if (z10 && gVar.f373f.length() > 0 && !z13 && !z14 && (aVar = x0Var.f182h) != null) {
            ((h1.b) aVar).a();
        }
        x0Var.f177c.f(c(gVar, h9));
        if (!z10) {
            x0Var.p(!a2.j0.b(h9));
        }
        w.j0 j0Var2 = x0Var.f178d;
        if (j0Var2 != null) {
            j0Var2.f9271q.setValue(Boolean.valueOf(z10));
        }
        w.j0 j0Var3 = x0Var.f178d;
        if (j0Var3 != null) {
            j0Var3.f9267m.setValue(Boolean.valueOf(!a2.j0.b(h9) && a8.d.M(x0Var, true)));
        }
        w.j0 j0Var4 = x0Var.f178d;
        if (j0Var4 == null) {
            z11 = false;
        } else {
            z11 = false;
            j0Var4.f9268n.setValue(Boolean.valueOf(!a2.j0.b(h9) && a8.d.M(x0Var, false)));
        }
        w.j0 j0Var5 = x0Var.f178d;
        if (j0Var5 == null) {
            return h9;
        }
        if (a2.j0.b(h9) && a8.d.M(x0Var, true)) {
            z11 = true;
        }
        j0Var5.f9269o.setValue(Boolean.valueOf(z11));
        return h9;
    }

    public static g2.w c(a2.g gVar, long j8) {
        return new g2.w(gVar, j8, (a2.j0) null);
    }

    public final void b(boolean z8) {
        if (a2.j0.b(j().f4066b)) {
            return;
        }
        s1.b1 b1Var = this.f180f;
        if (b1Var != null) {
            ((s1.h) b1Var).a(j1.c.b0(j()));
        }
        if (z8) {
            int d8 = a2.j0.d(j().f4066b);
            this.f177c.f(c(j().f4065a, r4.a.h(d8, d8)));
            n(w.a0.f9183f);
        }
    }

    public final void d() {
        if (a2.j0.b(j().f4066b)) {
            return;
        }
        s1.b1 b1Var = this.f180f;
        if (b1Var != null) {
            ((s1.h) b1Var).a(j1.c.b0(j()));
        }
        a2.g d02 = j1.c.d0(j(), j().f4065a.f373f.length());
        a2.g c02 = j1.c.c0(j(), j().f4065a.f373f.length());
        a2.d dVar = new a2.d(d02);
        dVar.b(c02);
        a2.g c4 = dVar.c();
        int e9 = a2.j0.e(j().f4066b);
        this.f177c.f(c(c4, r4.a.h(e9, e9)));
        n(w.a0.f9183f);
        this.f175a.f9191e = true;
    }

    public final void e(y0.c cVar) {
        if (!a2.j0.b(j().f4066b)) {
            w.j0 j0Var = this.f178d;
            w.z0 d8 = j0Var != null ? j0Var.d() : null;
            int d9 = (cVar == null || d8 == null) ? a2.j0.d(j().f4066b) : this.f176b.a(d8.b(cVar.f9778a, true));
            this.f177c.f(g2.w.a(j(), null, r4.a.h(d9, d9), 5));
        }
        n((cVar == null || j().f4065a.f373f.length() <= 0) ? w.a0.f9183f : w.a0.f9185h);
        p(false);
    }

    public final void f(boolean z8) {
        x0.n nVar;
        w.j0 j0Var = this.f178d;
        if (j0Var != null && !j0Var.b() && (nVar = this.f183i) != null) {
            nVar.a(x0.h.f9609k);
        }
        this.f192r = j();
        p(z8);
        n(w.a0.f9184g);
    }

    public final y0.c g() {
        return (y0.c) this.f190p.getValue();
    }

    public final boolean h() {
        return ((Boolean) this.f185k.getValue()).booleanValue();
    }

    public final long i(boolean z8) {
        w.z0 d8;
        long j8;
        w.j0 j0Var = this.f178d;
        if (j0Var == null || (d8 = j0Var.d()) == null) {
            return 9205357640488583168L;
        }
        a2.h0 h0Var = d8.f9471a;
        w.j0 j0Var2 = this.f178d;
        a2.g gVar = j0Var2 != null ? j0Var2.f9255a.f9329a : null;
        if (gVar == null) {
            return 9205357640488583168L;
        }
        if (!r6.k.a(gVar.f373f, h0Var.f388a.f377a.f373f)) {
            return 9205357640488583168L;
        }
        g2.w j9 = j();
        if (z8) {
            long j10 = j9.f4066b;
            int i7 = a2.j0.f407c;
            j8 = j10 >> 32;
        } else {
            long j11 = j9.f4066b;
            int i8 = a2.j0.f407c;
            j8 = j11 & 4294967295L;
        }
        int b9 = this.f176b.b((int) j8);
        boolean f9 = a2.j0.f(j().f4066b);
        int e9 = h0Var.e(b9);
        long j12 = h0Var.f390c;
        a2.o oVar = h0Var.f389b;
        if (e9 >= oVar.f429f) {
            return 9205357640488583168L;
        }
        boolean z9 = h0Var.a(((!z8 || f9) && (z8 || !f9)) ? Math.max(b9 + (-1), 0) : b9) == h0Var.i(b9);
        ArrayList arrayList = oVar.f431h;
        oVar.i(b9);
        a2.r rVar = (a2.r) arrayList.get(b9 == ((a2.g) oVar.f424a.f436c).f373f.length() ? e6.m.W(arrayList) : a8.m.v(b9, arrayList));
        a2.b bVar = rVar.f440a;
        int b10 = rVar.b(b9);
        b2.d0 d0Var = bVar.f314d;
        return u3.r.a(v1.g.d(z9 ? d0Var.h(b10, false) : d0Var.i(b10, false), 0.0f, (int) (j12 >> 32)), v1.g.d(oVar.b(e9), 0.0f, (int) (4294967295L & j12)));
    }

    public final g2.w j() {
        return (g2.w) this.f179e.getValue();
    }

    public final void k() {
        i2 i2Var = this.f181g;
        if ((i2Var != null ? ((s1.q0) i2Var).f8356d : 0) != 1 || i2Var == null) {
            return;
        }
        s1.q0 q0Var = (s1.q0) i2Var;
        q0Var.f8356d = 2;
        ActionMode actionMode = q0Var.f8354b;
        if (actionMode != null) {
            actionMode.finish();
        }
        q0Var.f8354b = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x0167, code lost:
    
        if (r2 == 2) goto L76;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l() {
        int i7;
        Spanned spanned;
        char c4;
        int i8;
        int i9;
        long j8;
        s1.b1 b1Var = this.f180f;
        if (b1Var != null) {
            ClipData primaryClip = ((s1.h) b1Var).f8238a.getPrimaryClip();
            a2.g gVar = null;
            if (primaryClip == null || primaryClip.getItemCount() <= 0) {
                gVar = null;
            } else {
                int i10 = 0;
                ClipData.Item itemAt = primaryClip.getItemAt(0);
                CharSequence text = itemAt != null ? itemAt.getText() : null;
                if (text != null) {
                    char c6 = 6;
                    if (text instanceof Spanned) {
                        Spanned spanned2 = (Spanned) text;
                        Annotation[] annotationArr = (Annotation[]) spanned2.getSpans(0, text.length(), Annotation.class);
                        ArrayList arrayList = new ArrayList();
                        r6.k.f(annotationArr, "<this>");
                        int length = annotationArr.length - 1;
                        if (length >= 0) {
                            int i11 = 0;
                            while (true) {
                                Annotation annotation = annotationArr[i11];
                                if (r6.k.a(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                                    int spanStart = spanned2.getSpanStart(annotation);
                                    int spanEnd = spanned2.getSpanEnd(annotation);
                                    String value = annotation.getValue();
                                    Parcel obtain = Parcel.obtain();
                                    byte[] decode = Base64.decode(value, i10);
                                    obtain.unmarshall(decode, i10, decode.length);
                                    obtain.setDataPosition(i10);
                                    long j9 = z0.u.f10057g;
                                    long j10 = j9;
                                    long j11 = m2.m.f6327c;
                                    long j12 = j11;
                                    f2.k kVar = null;
                                    f2.i iVar = null;
                                    f2.j jVar = null;
                                    String str = null;
                                    l2.a aVar = null;
                                    l2.n nVar = null;
                                    l2.j jVar2 = null;
                                    z0.o0 o0Var = null;
                                    while (obtain.dataAvail() > 1) {
                                        byte readByte = obtain.readByte();
                                        if (readByte != 1) {
                                            i7 = i10;
                                            spanned = spanned2;
                                            int i12 = 2;
                                            if (readByte != 2) {
                                                i8 = i11;
                                                if (readByte == 3) {
                                                    if (obtain.dataAvail() < 4) {
                                                        c4 = 6;
                                                        break;
                                                    }
                                                    kVar = new f2.k(obtain.readInt());
                                                    i10 = i7;
                                                    spanned2 = spanned;
                                                    i11 = i8;
                                                    c6 = 6;
                                                } else if (readByte == 4) {
                                                    if (obtain.dataAvail() < 1) {
                                                        c4 = 6;
                                                        break;
                                                    }
                                                    byte readByte2 = obtain.readByte();
                                                    iVar = new f2.i((readByte2 != 0 && readByte2 == 1) ? 1 : i7);
                                                    i10 = i7;
                                                    spanned2 = spanned;
                                                    i11 = i8;
                                                    c6 = 6;
                                                } else if (readByte != 5) {
                                                    c4 = 6;
                                                    if (readByte == 6) {
                                                        str = obtain.readString();
                                                    } else if (readByte == 7) {
                                                        if (obtain.dataAvail() < 5) {
                                                            break;
                                                        }
                                                        byte readByte3 = obtain.readByte();
                                                        long j13 = readByte3 == 1 ? 4294967296L : readByte3 == 2 ? 8589934592L : 0L;
                                                        j12 = m2.n.a(j13, 0L) ? m2.m.f6327c : r4.a.O(j13, obtain.readFloat());
                                                    } else if (readByte == 8) {
                                                        if (obtain.dataAvail() < 4) {
                                                            break;
                                                        } else {
                                                            aVar = new l2.a(obtain.readFloat());
                                                        }
                                                    } else if (readByte == 9) {
                                                        if (obtain.dataAvail() < 8) {
                                                            break;
                                                        } else {
                                                            nVar = new l2.n(obtain.readFloat(), obtain.readFloat());
                                                        }
                                                    } else if (readByte == 10) {
                                                        if (obtain.dataAvail() < 8) {
                                                            break;
                                                        }
                                                        j10 = obtain.readLong();
                                                        int i13 = z0.u.f10058h;
                                                    } else if (readByte == 11) {
                                                        if (obtain.dataAvail() < 4) {
                                                            break;
                                                        }
                                                        int readInt = obtain.readInt();
                                                        int i14 = (readInt & 2) != 0 ? 1 : i7;
                                                        int i15 = (readInt & 1) != 0 ? 1 : i7;
                                                        l2.j jVar3 = l2.j.f5879d;
                                                        l2.j jVar4 = l2.j.f5878c;
                                                        if (i14 == 0 || i15 == 0) {
                                                            jVar2 = i14 != 0 ? jVar3 : i15 != 0 ? jVar4 : l2.j.f5877b;
                                                        } else {
                                                            List X = e6.m.X(jVar3, jVar4);
                                                            Integer valueOf = Integer.valueOf(i7);
                                                            int size = X.size();
                                                            for (int i16 = i7; i16 < size; i16++) {
                                                                valueOf = Integer.valueOf(valueOf.intValue() | ((l2.j) X.get(i16)).f5880a);
                                                            }
                                                            jVar2 = new l2.j(valueOf.intValue());
                                                        }
                                                    } else if (readByte == 12) {
                                                        if (obtain.dataAvail() < 20) {
                                                            break;
                                                        }
                                                        long readLong = obtain.readLong();
                                                        int i17 = z0.u.f10058h;
                                                        c6 = 6;
                                                        i10 = i7;
                                                        spanned2 = spanned;
                                                        i11 = i8;
                                                        o0Var = new z0.o0(obtain.readFloat(), readLong, u3.r.a(obtain.readFloat(), obtain.readFloat()));
                                                    }
                                                    c6 = 6;
                                                    i10 = i7;
                                                    spanned2 = spanned;
                                                    i11 = i8;
                                                } else {
                                                    if (obtain.dataAvail() < 1) {
                                                        c4 = 6;
                                                        break;
                                                    }
                                                    byte readByte4 = obtain.readByte();
                                                    if (readByte4 != 0) {
                                                        if (readByte4 == 1) {
                                                            i12 = 1;
                                                        } else if (readByte4 == 3) {
                                                            i12 = 3;
                                                        }
                                                        jVar = new f2.j(i12);
                                                        i10 = i7;
                                                        spanned2 = spanned;
                                                        i11 = i8;
                                                        c6 = 6;
                                                    }
                                                    i12 = i7;
                                                    jVar = new f2.j(i12);
                                                    i10 = i7;
                                                    spanned2 = spanned;
                                                    i11 = i8;
                                                    c6 = 6;
                                                }
                                            } else {
                                                if (obtain.dataAvail() < 5) {
                                                    i8 = i11;
                                                    c4 = 6;
                                                    break;
                                                }
                                                byte readByte5 = obtain.readByte();
                                                if (readByte5 == 1) {
                                                    i8 = i11;
                                                    j8 = 4294967296L;
                                                } else if (readByte5 == 2) {
                                                    i8 = i11;
                                                    j8 = 8589934592L;
                                                } else {
                                                    i8 = i11;
                                                    j8 = 0;
                                                }
                                                j11 = m2.n.a(j8, 0L) ? m2.m.f6327c : r4.a.O(j8, obtain.readFloat());
                                                i10 = i7;
                                                spanned2 = spanned;
                                                i11 = i8;
                                                c6 = 6;
                                            }
                                        } else {
                                            if (obtain.dataAvail() < 8) {
                                                break;
                                            }
                                            j9 = obtain.readLong();
                                            int i18 = z0.u.f10058h;
                                        }
                                    }
                                    i7 = i10;
                                    spanned = spanned2;
                                    c4 = c6;
                                    i8 = i11;
                                    arrayList.add(new a2.e(spanStart, spanEnd, new a2.d0(j9, j11, kVar, iVar, jVar, (f2.q) null, str, j12, aVar, nVar, (h2.b) null, j10, jVar2, o0Var, 49152)));
                                    i9 = i8;
                                } else {
                                    i7 = i10;
                                    spanned = spanned2;
                                    c4 = c6;
                                    i9 = i11;
                                }
                                if (i9 == length) {
                                    break;
                                }
                                i11 = i9 + 1;
                                c6 = c4;
                                i10 = i7;
                                spanned2 = spanned;
                            }
                        }
                        gVar = new a2.g(text.toString(), arrayList, 4);
                    } else {
                        gVar = new a2.g(text.toString(), null, 6);
                    }
                }
            }
            if (gVar == null) {
                return;
            }
            a2.d dVar = new a2.d(j1.c.d0(j(), j().f4065a.f373f.length()));
            dVar.b(gVar);
            a2.g c9 = dVar.c();
            a2.g c02 = j1.c.c0(j(), j().f4065a.f373f.length());
            a2.d dVar2 = new a2.d(c9);
            dVar2.b(c02);
            a2.g c10 = dVar2.c();
            int length2 = gVar.f373f.length() + a2.j0.e(j().f4066b);
            this.f177c.f(c(c10, r4.a.h(length2, length2)));
            n(w.a0.f9183f);
            this.f175a.f9191e = true;
        }
    }

    public final void m() {
        g2.w c4 = c(j().f4065a, r4.a.h(0, j().f4065a.f373f.length()));
        this.f177c.f(c4);
        this.f192r = g2.w.a(this.f192r, null, c4.f4066b, 5);
        f(true);
    }

    public final void n(w.a0 a0Var) {
        w.j0 j0Var = this.f178d;
        if (j0Var != null) {
            if (j0Var.a() == a0Var) {
                j0Var = null;
            }
            if (j0Var != null) {
                j0Var.f9265k.setValue(a0Var);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o() {
        w0 w0Var;
        i2 i2Var;
        i2 i2Var2;
        y0.d dVar;
        ActionMode actionMode;
        float f9;
        p1.p c4;
        p1.p c6;
        p1.p c9;
        p1.p c10;
        s1.b1 b1Var;
        if (!h()) {
            return;
        }
        w.j0 j0Var = this.f178d;
        if (j0Var != null && !((Boolean) j0Var.f9271q.getValue()).booleanValue()) {
            return;
        }
        w0 w0Var2 = !a2.j0.b(j().f4066b) ? new w0(this, 0) : null;
        boolean b9 = a2.j0.b(j().f4066b);
        g0.g1 g1Var = this.f184j;
        w0 w0Var3 = (b9 || !((Boolean) g1Var.getValue()).booleanValue()) ? null : new w0(this, 1);
        if (((Boolean) g1Var.getValue()).booleanValue() && (b1Var = this.f180f) != null) {
            ClipDescription primaryClipDescription = ((s1.h) b1Var).f8238a.getPrimaryClipDescription();
            if (primaryClipDescription != null ? primaryClipDescription.hasMimeType("text/*") : false) {
                w0Var = new w0(this, 2);
                w0 w0Var4 = a2.j0.c(j().f4066b) == j().f4065a.f373f.length() ? new w0(this, 3) : null;
                i2Var = this.f181g;
                if (i2Var != null) {
                    return;
                }
                w.j0 j0Var2 = this.f178d;
                if (j0Var2 != null) {
                    w.j0 j0Var3 = j0Var2.f9270p ? null : j0Var2;
                    if (j0Var3 != null) {
                        int b10 = this.f176b.b((int) (j().f4066b >> 32));
                        int b11 = this.f176b.b((int) (j().f4066b & 4294967295L));
                        w.j0 j0Var4 = this.f178d;
                        long j8 = 0;
                        long W = (j0Var4 == null || (c10 = j0Var4.c()) == null) ? 0L : c10.W(i(true));
                        w.j0 j0Var5 = this.f178d;
                        if (j0Var5 != null && (c9 = j0Var5.c()) != null) {
                            j8 = c9.W(i(false));
                        }
                        w.j0 j0Var6 = this.f178d;
                        float f10 = 0.0f;
                        if (j0Var6 == null || (c6 = j0Var6.c()) == null) {
                            i2Var2 = i2Var;
                            f9 = 0.0f;
                        } else {
                            w.z0 d8 = j0Var3.d();
                            i2Var2 = i2Var;
                            f9 = y0.c.e(c6.W(u3.r.a(0.0f, d8 != null ? d8.f9471a.c(b10).f9781b : 0.0f)));
                        }
                        w.j0 j0Var7 = this.f178d;
                        if (j0Var7 != null && (c4 = j0Var7.c()) != null) {
                            w.z0 d9 = j0Var3.d();
                            f10 = y0.c.e(c4.W(u3.r.a(0.0f, d9 != null ? d9.f9471a.c(b11).f9781b : 0.0f)));
                        }
                        dVar = new y0.d(Math.min(y0.c.d(W), y0.c.d(j8)), Math.min(f9, f10), Math.max(y0.c.d(W), y0.c.d(j8)), (j0Var3.f9255a.f9335g.a() * 25) + Math.max(y0.c.e(W), y0.c.e(j8)));
                        s1.q0 q0Var = (s1.q0) i2Var2;
                        e5.v vVar = q0Var.f8355c;
                        vVar.f2801b = dVar;
                        vVar.f2802c = w0Var2;
                        vVar.f2804e = w0Var3;
                        vVar.f2803d = w0Var;
                        vVar.f2805f = w0Var4;
                        actionMode = q0Var.f8354b;
                        if (actionMode == null) {
                            actionMode.invalidate();
                            return;
                        } else {
                            q0Var.f8356d = 1;
                            q0Var.f8354b = j2.f8250a.b(q0Var.f8353a, new u1.a(vVar), 1);
                            return;
                        }
                    }
                }
                i2Var2 = i2Var;
                dVar = y0.d.f9779e;
                s1.q0 q0Var2 = (s1.q0) i2Var2;
                e5.v vVar2 = q0Var2.f8355c;
                vVar2.f2801b = dVar;
                vVar2.f2802c = w0Var2;
                vVar2.f2804e = w0Var3;
                vVar2.f2803d = w0Var;
                vVar2.f2805f = w0Var4;
                actionMode = q0Var2.f8354b;
                if (actionMode == null) {
                }
            }
        }
        w0Var = null;
        if (a2.j0.c(j().f4066b) == j().f4065a.f373f.length()) {
        }
        i2Var = this.f181g;
        if (i2Var != null) {
        }
    }

    public final void p(boolean z8) {
        w.j0 j0Var = this.f178d;
        if (j0Var != null) {
            j0Var.f9266l.setValue(Boolean.valueOf(z8));
        }
        if (z8) {
            o();
        } else {
            k();
        }
    }
}
