package defpackage;

import android.content.ClipData;
import android.content.ClipDescription;
import android.os.Parcel;
import android.text.Annotation;
import android.text.Spanned;
import android.util.Base64;
import android.view.ActionMode;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.d;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class gv2 {
    public final z13 a;
    public sc1 d;
    public vu f;
    public qw2 g;
    public hx0 h;
    public to0 i;
    public final lz1 j;
    public final lz1 k;
    public long l;
    public Integer m;
    public long n;
    public final lz1 o;
    public final lz1 p;
    public int q;
    public nv2 r;
    public kl3 s;
    public final ev2 t;
    public final ot2 u;
    public cu1 b = z71.y;
    public Function1 c = cv2.o;
    public final lz1 e = ij2.j(new nv2((String) null, 7, 0));

    public gv2(z13 z13Var) {
        this.a = z13Var;
        Boolean bool = Boolean.TRUE;
        this.j = ij2.j(bool);
        this.k = ij2.j(bool);
        this.l = 0L;
        this.n = 0L;
        this.o = ij2.j(null);
        this.p = ij2.j(null);
        this.q = -1;
        this.r = new nv2((String) null, 7, 0L);
        int i = 1;
        this.t = new ev2(this, i);
        this.u = new ot2(i, this);
    }

    public static final long a(gv2 gv2Var, nv2 nv2Var, long j, boolean z, boolean z2, dh2 dh2Var, boolean z3) {
        cw2 d;
        long j2;
        bh2 bh2Var;
        long j3;
        yd ydVar;
        boolean z4;
        boolean z5;
        hx0 hx0Var;
        sc1 sc1Var = gv2Var.d;
        if (sc1Var == null || (d = sc1Var.d()) == null) {
            return jw2.b;
        }
        cu1 cu1Var = gv2Var.b;
        long j4 = nv2Var.b;
        yd ydVar2 = nv2Var.a;
        int i = jw2.c;
        long a = th2.a(cu1Var.g((int) (j4 >> 32)), gv2Var.b.g((int) (j4 & 4294967295L)));
        int b = d.b(false, j);
        int i2 = (z2 || z) ? b : (int) (a >> 32);
        int i3 = (!z2 || z) ? b : (int) (a & 4294967295L);
        kl3 kl3Var = gv2Var.s;
        int i4 = -1;
        if (z || kl3Var == null) {
            j2 = 4294967295L;
        } else {
            j2 = 4294967295L;
            int i5 = gv2Var.q;
            if (i5 != -1) {
                i4 = i5;
            }
        }
        bw2 bw2Var = d.a;
        if (z) {
            bh2Var = null;
            ydVar = ydVar2;
            j3 = j4;
        } else {
            int i6 = (int) (a >> 32);
            j3 = j4;
            int i7 = (int) (a & j2);
            ydVar = ydVar2;
            bh2Var = new bh2(new ah2(mh2.j(bw2Var, i6), i6, 1L), new ah2(mh2.j(bw2Var, i7), i7, 1L), jw2.f(a));
        }
        kl3 kl3Var2 = new kl3(2, bh2Var, new gn(i2, i3, i4, bw2Var), z2);
        if (bh2Var != null && kl3Var != null && z2 == kl3Var.b) {
            gn gnVar = (gn) kl3Var.d;
            if (i2 == gnVar.b && i3 == gnVar.c) {
                return j3;
            }
        }
        gv2Var.s = kl3Var2;
        gv2Var.q = b;
        bh2 c = dh2Var.c(kl3Var2);
        long a2 = th2.a(gv2Var.b.b(c.a.b), gv2Var.b.b(c.b.b));
        long j5 = j3;
        if (jw2.a(a2, j5)) {
            return j5;
        }
        boolean z6 = jw2.f(a2) != jw2.f(j5) && jw2.a(th2.a((int) (a2 & j2), (int) (a2 >> 32)), j5);
        boolean z7 = jw2.b(a2) && jw2.b(j5);
        if (z3 && ydVar.n.length() > 0 && !z6 && !z7 && (hx0Var = gv2Var.h) != null) {
            hx0Var.a();
        }
        gv2Var.c.invoke(c(ydVar, a2));
        if (!z3) {
            gv2Var.p(!jw2.b(a2));
        }
        sc1 sc1Var2 = gv2Var.d;
        if (sc1Var2 != null) {
            sc1Var2.q.setValue(Boolean.valueOf(z3));
        }
        sc1 sc1Var3 = gv2Var.d;
        if (sc1Var3 != null) {
            sc1Var3.m.setValue(Boolean.valueOf(!jw2.b(a2) && nk2.l(gv2Var, true)));
        }
        sc1 sc1Var4 = gv2Var.d;
        if (sc1Var4 == null) {
            z4 = false;
        } else {
            if (jw2.b(a2)) {
                z4 = false;
            } else {
                z4 = false;
                if (nk2.l(gv2Var, false)) {
                    z5 = true;
                    sc1Var4.n.setValue(Boolean.valueOf(z5));
                }
            }
            z5 = z4;
            sc1Var4.n.setValue(Boolean.valueOf(z5));
        }
        sc1 sc1Var5 = gv2Var.d;
        if (sc1Var5 == null) {
            return a2;
        }
        if (jw2.b(a2) && nk2.l(gv2Var, true)) {
            z4 = true;
        }
        sc1Var5.o.setValue(Boolean.valueOf(z4));
        return a2;
    }

    public static nv2 c(yd ydVar, long j) {
        return new nv2(ydVar, j, (jw2) null);
    }

    public final void b(boolean z) {
        if (jw2.b(j().b)) {
            return;
        }
        vu vuVar = this.f;
        if (vuVar != null) {
            ((d7) vuVar).a(hl2.f(j()));
        }
        if (z) {
            int d = jw2.d(j().b);
            this.c.invoke(c(j().a, th2.a(d, d)));
            n(zw0.m);
        }
    }

    public final void d() {
        if (jw2.b(j().b)) {
            return;
        }
        vu vuVar = this.f;
        if (vuVar != null) {
            ((d7) vuVar).a(hl2.f(j()));
        }
        yd i = hl2.i(j(), j().a.n.length());
        yd h = hl2.h(j(), j().a.n.length());
        wd wdVar = new wd(i);
        wdVar.a(h);
        yd b = wdVar.b();
        int e = jw2.e(j().b);
        this.c.invoke(c(b, th2.a(e, e)));
        n(zw0.m);
        this.a.e = true;
    }

    public final void e(au1 au1Var) {
        if (!jw2.b(j().b)) {
            sc1 sc1Var = this.d;
            cw2 d = sc1Var != null ? sc1Var.d() : null;
            int d2 = (au1Var == null || d == null) ? jw2.d(j().b) : this.b.b(d.b(true, au1Var.a));
            this.c.invoke(nv2.a(j(), null, th2.a(d2, d2), 5));
        }
        n((au1Var == null || j().a.n.length() <= 0) ? zw0.m : zw0.o);
        p(false);
    }

    public final void f(boolean z) {
        to0 to0Var;
        sc1 sc1Var = this.d;
        if (sc1Var != null && !sc1Var.b() && (to0Var = this.i) != null) {
            to0Var.a(new cv2(1, 26));
        }
        this.r = j();
        p(z);
        n(zw0.n);
    }

    public final au1 g() {
        return (au1) this.p.getValue();
    }

    public final boolean h() {
        return ((Boolean) this.k.getValue()).booleanValue();
    }

    public final long i(boolean z) {
        cw2 d;
        long j;
        sc1 sc1Var = this.d;
        if (sc1Var == null || (d = sc1Var.d()) == null) {
            return 9205357640488583168L;
        }
        bw2 bw2Var = d.a;
        sc1 sc1Var2 = this.d;
        yd ydVar = sc1Var2 != null ? sc1Var2.a.a : null;
        if (ydVar == null) {
            return 9205357640488583168L;
        }
        if (!Intrinsics.b(ydVar.n, bw2Var.a.a.n)) {
            return 9205357640488583168L;
        }
        nv2 j2 = j();
        if (z) {
            long j3 = j2.b;
            int i = jw2.c;
            j = j3 >> 32;
        } else {
            long j4 = j2.b;
            int i2 = jw2.c;
            j = j4 & 4294967295L;
        }
        int g = this.b.g((int) j);
        boolean f = jw2.f(j().b);
        int e = bw2Var.e(g);
        long j5 = bw2Var.c;
        sm1 sm1Var = bw2Var.b;
        if (e >= sm1Var.f) {
            return 9205357640488583168L;
        }
        boolean z2 = bw2Var.a(((!z || f) && (z || !f)) ? Math.max(g + (-1), 0) : g) == bw2Var.i(g);
        sm1Var.i(g);
        int length = ((yd) sm1Var.a.o).n.length();
        ArrayList arrayList = sm1Var.h;
        az1 az1Var = (az1) arrayList.get(g == length ? qv.f(arrayList) : s03.m(g, arrayList));
        ja jaVar = az1Var.a;
        int d2 = az1Var.d(g);
        zv2 zv2Var = jaVar.d;
        return ap.i(d.b(z2 ? zv2Var.h(d2, false) : zv2Var.i(d2, false), 0.0f, (int) (j5 >> 32)), d.b(sm1Var.b(e), 0.0f, (int) (4294967295L & j5)));
    }

    public final nv2 j() {
        return (nv2) this.e.getValue();
    }

    public final void k() {
        qw2 qw2Var = this.g;
        if ((qw2Var != null ? ((tb) qw2Var).d : null) != rw2.m || qw2Var == null) {
            return;
        }
        tb tbVar = (tb) qw2Var;
        tbVar.d = rw2.n;
        ActionMode actionMode = tbVar.b;
        if (actionMode != null) {
            actionMode.finish();
        }
        tbVar.b = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l() {
        yd ydVar;
        CharSequence charSequence;
        byte b;
        byte b2;
        vu vuVar = this.f;
        if (vuVar == null) {
            return;
        }
        ClipData primaryClip = ((d7) vuVar).a.getPrimaryClip();
        byte b3 = 1;
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            byte b4 = 0;
            ClipData.Item itemAt = primaryClip.getItemAt(0);
            CharSequence text = itemAt != null ? itemAt.getText() : null;
            if (text != null) {
                if (text instanceof Spanned) {
                    Spanned spanned = (Spanned) text;
                    Annotation[] annotationArr = (Annotation[]) spanned.getSpans(0, spanned.length(), Annotation.class);
                    ArrayList arrayList = new ArrayList();
                    int s = oi.s(annotationArr);
                    byte b5 = 4;
                    if (s >= 0) {
                        int i = 0;
                        while (true) {
                            Annotation annotation = annotationArr[i];
                            if (Intrinsics.b(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                                int spanStart = spanned.getSpanStart(annotation);
                                int spanEnd = spanned.getSpanEnd(annotation);
                                String value = annotation.getValue();
                                r70 r70Var = new r70();
                                Parcel obtain = Parcel.obtain();
                                r70Var.a = obtain;
                                byte[] decode = Base64.decode(value, b4);
                                obtain.unmarshall(decode, b4, decode.length);
                                obtain.setDataPosition(b4);
                                Parcel parcel = r70Var.a;
                                long j = aw.g;
                                long j2 = j;
                                long j3 = sw2.c;
                                long j4 = j3;
                                jq0 jq0Var = null;
                                fq0 fq0Var = null;
                                gq0 gq0Var = null;
                                String str = null;
                                nn nnVar = null;
                                qv2 qv2Var = null;
                                xt2 xt2Var = null;
                                dk2 dk2Var = null;
                                while (parcel.dataAvail() > b3) {
                                    byte readByte = parcel.readByte();
                                    if (readByte != b3) {
                                        b = b4;
                                        if (readByte == 2) {
                                            if (parcel.dataAvail() < 5) {
                                                charSequence = text;
                                                break;
                                            } else {
                                                j3 = r70Var.b();
                                                b4 = b;
                                            }
                                        } else if (readByte == 3) {
                                            if (parcel.dataAvail() < b5) {
                                                charSequence = text;
                                                break;
                                            } else {
                                                jq0Var = new jq0(parcel.readInt());
                                                b4 = b;
                                            }
                                        } else if (readByte == b5) {
                                            if (parcel.dataAvail() < b3) {
                                                charSequence = text;
                                                break;
                                            } else {
                                                byte readByte2 = parcel.readByte();
                                                fq0Var = new fq0((readByte2 != 0 && readByte2 == b3) ? b3 : b);
                                                b4 = b;
                                            }
                                        } else if (readByte != 5) {
                                            if (readByte == 6) {
                                                str = parcel.readString();
                                            } else if (readByte == 7) {
                                                if (parcel.dataAvail() < 5) {
                                                    charSequence = text;
                                                    break;
                                                }
                                                j4 = r70Var.b();
                                            } else if (readByte != 8) {
                                                if (readByte != 9) {
                                                    if (readByte == 10) {
                                                        if (parcel.dataAvail() >= 8) {
                                                            j2 = r70Var.a();
                                                        }
                                                    } else if (readByte != 11) {
                                                        if (readByte == 12) {
                                                            if (parcel.dataAvail() >= 20) {
                                                                text = text;
                                                                b4 = b;
                                                                dk2Var = new dk2(parcel.readFloat(), r70Var.a(), (Float.floatToRawIntBits(parcel.readFloat()) << 32) | (Float.floatToRawIntBits(parcel.readFloat()) & 4294967295L));
                                                                b3 = 1;
                                                                b5 = 4;
                                                            }
                                                        }
                                                        b4 = b;
                                                        b3 = 1;
                                                        b5 = 4;
                                                    } else if (parcel.dataAvail() >= b5) {
                                                        int readInt = parcel.readInt();
                                                        byte b6 = (readInt & 2) != 0 ? b3 : b;
                                                        byte b7 = (readInt & 1) != 0 ? b3 : b;
                                                        xt2 xt2Var2 = xt2.d;
                                                        xt2 xt2Var3 = xt2.c;
                                                        if (b6 != 0 && b7 != 0) {
                                                            List g = qv.g(xt2Var2, xt2Var3);
                                                            Integer valueOf = Integer.valueOf(b);
                                                            int size = g.size();
                                                            for (int i2 = b; i2 < size; i2++) {
                                                                valueOf = Integer.valueOf(valueOf.intValue() | ((xt2) g.get(i2)).a);
                                                            }
                                                            xt2Var = new xt2(valueOf.intValue());
                                                        } else if (b6 != 0) {
                                                            xt2Var = xt2Var2;
                                                        } else {
                                                            if (b7 == 0) {
                                                                xt2Var3 = xt2.b;
                                                            }
                                                            xt2Var = xt2Var3;
                                                        }
                                                        b4 = b;
                                                        b3 = 1;
                                                        b5 = 4;
                                                    }
                                                    charSequence = text;
                                                    break;
                                                }
                                                if (parcel.dataAvail() < 8) {
                                                    charSequence = text;
                                                    break;
                                                }
                                                qv2Var = new qv2(parcel.readFloat(), parcel.readFloat());
                                            } else {
                                                if (parcel.dataAvail() < b5) {
                                                    charSequence = text;
                                                    break;
                                                }
                                                nnVar = new nn(parcel.readFloat());
                                            }
                                            b4 = b;
                                        } else {
                                            if (parcel.dataAvail() < b3) {
                                                charSequence = text;
                                                break;
                                            }
                                            byte readByte3 = parcel.readByte();
                                            if (readByte3 != 0) {
                                                if (readByte3 == b3) {
                                                    b2 = 65535;
                                                } else if (readByte3 == 3) {
                                                    b2 = 2;
                                                } else if (readByte3 == 2) {
                                                    b2 = b3;
                                                }
                                                gq0Var = new gq0(b2);
                                                b4 = b;
                                            }
                                            b2 = b;
                                            gq0Var = new gq0(b2);
                                            b4 = b;
                                        }
                                    } else if (parcel.dataAvail() < 8) {
                                        break;
                                    } else {
                                        j = r70Var.a();
                                    }
                                }
                                charSequence = text;
                                b = b4;
                                arrayList.add(new xd(spanStart, spanEnd, new un2(j, j3, jq0Var, fq0Var, gq0Var, (ip0) null, str, j4, nnVar, qv2Var, (sf1) null, j2, xt2Var, dk2Var, 49152)));
                            } else {
                                charSequence = text;
                                b = b4;
                            }
                            if (i == s) {
                                break;
                            }
                            i++;
                            text = charSequence;
                            b4 = b;
                            b3 = 1;
                            b5 = 4;
                        }
                    } else {
                        charSequence = text;
                    }
                    ydVar = new yd(4, charSequence.toString(), arrayList);
                } else {
                    ydVar = new yd(text.toString());
                }
                if (ydVar != null) {
                    return;
                }
                wd wdVar = new wd(hl2.i(j(), j().a.n.length()));
                wdVar.a(ydVar);
                yd b8 = wdVar.b();
                yd h = hl2.h(j(), j().a.n.length());
                wd wdVar2 = new wd(b8);
                wdVar2.a(h);
                yd b9 = wdVar2.b();
                int length = ydVar.n.length() + jw2.e(j().b);
                this.c.invoke(c(b9, th2.a(length, length)));
                n(zw0.m);
                this.a.e = true;
                return;
            }
        }
        ydVar = null;
        if (ydVar != null) {
        }
    }

    public final void m() {
        nv2 c = c(j().a, th2.a(0, j().a.n.length()));
        this.c.invoke(c);
        this.r = nv2.a(this.r, null, c.b, 5);
        f(true);
    }

    public final void n(zw0 zw0Var) {
        sc1 sc1Var = this.d;
        if (sc1Var != null) {
            if (sc1Var.a() == zw0Var) {
                sc1Var = null;
            }
            if (sc1Var != null) {
                sc1Var.k.setValue(zw0Var);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o() {
        h40 h40Var;
        qw2 qw2Var;
        qw2 qw2Var2;
        w72 w72Var;
        ActionMode actionMode;
        float f;
        t81 c;
        t81 c2;
        t81 c3;
        t81 c4;
        vu vuVar;
        if (!h()) {
            return;
        }
        sc1 sc1Var = this.d;
        if (sc1Var != null && !((Boolean) sc1Var.q.getValue()).booleanValue()) {
            return;
        }
        h40 h40Var2 = !jw2.b(j().b) ? new h40(this, 4) : null;
        boolean b = jw2.b(j().b);
        lz1 lz1Var = this.j;
        h40 h40Var3 = (b || !((Boolean) lz1Var.getValue()).booleanValue()) ? null : new h40(this, 5);
        if (((Boolean) lz1Var.getValue()).booleanValue() && (vuVar = this.f) != null) {
            ClipDescription primaryClipDescription = ((d7) vuVar).a.getPrimaryClipDescription();
            if (primaryClipDescription != null ? primaryClipDescription.hasMimeType("text/*") : false) {
                h40Var = new h40(this, 6);
                h40 h40Var4 = jw2.c(j().b) == j().a.n.length() ? new h40(this, 7) : null;
                qw2Var = this.g;
                if (qw2Var != null) {
                    return;
                }
                sc1 sc1Var2 = this.d;
                if (sc1Var2 != null) {
                    sc1 sc1Var3 = sc1Var2.p ? null : sc1Var2;
                    if (sc1Var3 != null) {
                        int g = this.b.g((int) (j().b >> 32));
                        int g2 = this.b.g((int) (j().b & 4294967295L));
                        sc1 sc1Var4 = this.d;
                        long j = 0;
                        long T = (sc1Var4 == null || (c4 = sc1Var4.c()) == null) ? 0L : c4.T(i(true));
                        sc1 sc1Var5 = this.d;
                        if (sc1Var5 != null && (c3 = sc1Var5.c()) != null) {
                            j = c3.T(i(false));
                        }
                        sc1 sc1Var6 = this.d;
                        float f2 = 0.0f;
                        if (sc1Var6 == null || (c2 = sc1Var6.c()) == null) {
                            qw2Var2 = qw2Var;
                            f = 0.0f;
                        } else {
                            cw2 d = sc1Var3.d();
                            qw2Var2 = qw2Var;
                            f = au1.e(c2.T(ap.i(0.0f, d != null ? d.a.c(g).b : 0.0f)));
                        }
                        sc1 sc1Var7 = this.d;
                        if (sc1Var7 != null && (c = sc1Var7.c()) != null) {
                            cw2 d2 = sc1Var3.d();
                            f2 = au1.e(c.T(ap.i(0.0f, d2 != null ? d2.a.c(g2).b : 0.0f)));
                        }
                        w72Var = new w72(Math.min(au1.d(T), au1.d(j)), Math.min(f, f2), Math.max(au1.d(T), au1.d(j)), (sc1Var3.a.g.d() * 25.0f) + Math.max(au1.e(T), au1.e(j)));
                        tb tbVar = (tb) qw2Var2;
                        sf sfVar = tbVar.c;
                        sfVar.b = w72Var;
                        sfVar.c = h40Var2;
                        sfVar.e = h40Var3;
                        sfVar.d = h40Var;
                        sfVar.f = h40Var4;
                        actionMode = tbVar.b;
                        if (actionMode == null) {
                            actionMode.invalidate();
                            return;
                        } else {
                            tbVar.d = rw2.m;
                            tbVar.b = tbVar.a.startActionMode(new wm0(sfVar), 1);
                            return;
                        }
                    }
                }
                qw2Var2 = qw2Var;
                w72Var = w72.e;
                tb tbVar2 = (tb) qw2Var2;
                sf sfVar2 = tbVar2.c;
                sfVar2.b = w72Var;
                sfVar2.c = h40Var2;
                sfVar2.e = h40Var3;
                sfVar2.d = h40Var;
                sfVar2.f = h40Var4;
                actionMode = tbVar2.b;
                if (actionMode == null) {
                }
            }
        }
        h40Var = null;
        if (jw2.c(j().b) == j().a.n.length()) {
        }
        qw2Var = this.g;
        if (qw2Var != null) {
        }
    }

    public final void p(boolean z) {
        sc1 sc1Var = this.d;
        if (sc1Var != null) {
            sc1Var.l.setValue(Boolean.valueOf(z));
        }
        if (z) {
            o();
        } else {
            k();
        }
    }
}
