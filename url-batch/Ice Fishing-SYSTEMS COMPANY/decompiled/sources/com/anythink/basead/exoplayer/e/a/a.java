package com.anythink.basead.exoplayer.e.a;

import com.anythink.basead.exoplayer.k.af;
import com.anythink.basead.exoplayer.k.p;
import com.anythink.basead.exoplayer.k.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f7076a = 8;

    /* renamed from: b, reason: collision with root package name */
    public static final int f7077b = 12;

    /* renamed from: c, reason: collision with root package name */
    public static final int f7078c = 16;

    /* renamed from: d, reason: collision with root package name */
    public static final int f7079d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f7080e = 0;
    public final int aU;

    /* renamed from: f, reason: collision with root package name */
    public static final int f7081f = af.f("ftyp");

    /* renamed from: g, reason: collision with root package name */
    public static final int f7082g = af.f("avc1");

    /* renamed from: h, reason: collision with root package name */
    public static final int f7083h = af.f("avc3");
    public static final int i = af.f("hvc1");

    /* renamed from: j, reason: collision with root package name */
    public static final int f7084j = af.f("hev1");

    /* renamed from: k, reason: collision with root package name */
    public static final int f7085k = af.f("s263");

    /* renamed from: l, reason: collision with root package name */
    public static final int f7086l = af.f("d263");

    /* renamed from: m, reason: collision with root package name */
    public static final int f7087m = af.f("mdat");

    /* renamed from: n, reason: collision with root package name */
    public static final int f7088n = af.f("mp4a");

    /* renamed from: o, reason: collision with root package name */
    public static final int f7089o = af.f(".mp3");

    /* renamed from: p, reason: collision with root package name */
    public static final int f7090p = af.f("wave");

    /* renamed from: q, reason: collision with root package name */
    public static final int f7091q = af.f("lpcm");

    /* renamed from: r, reason: collision with root package name */
    public static final int f7092r = af.f("sowt");

    /* renamed from: s, reason: collision with root package name */
    public static final int f7093s = af.f("ac-3");

    /* renamed from: t, reason: collision with root package name */
    public static final int f7094t = af.f("dac3");

    /* renamed from: u, reason: collision with root package name */
    public static final int f7095u = af.f("ec-3");

    /* renamed from: v, reason: collision with root package name */
    public static final int f7096v = af.f("dec3");

    /* renamed from: w, reason: collision with root package name */
    public static final int f7097w = af.f("dtsc");

    /* renamed from: x, reason: collision with root package name */
    public static final int f7098x = af.f("dtsh");

    /* renamed from: y, reason: collision with root package name */
    public static final int f7099y = af.f("dtsl");

    /* renamed from: z, reason: collision with root package name */
    public static final int f7100z = af.f("dtse");

    /* renamed from: A, reason: collision with root package name */
    public static final int f7052A = af.f("ddts");

    /* renamed from: B, reason: collision with root package name */
    public static final int f7053B = af.f("tfdt");

    /* renamed from: C, reason: collision with root package name */
    public static final int f7054C = af.f("tfhd");

    /* renamed from: D, reason: collision with root package name */
    public static final int f7055D = af.f("trex");

    /* renamed from: E, reason: collision with root package name */
    public static final int f7056E = af.f("trun");

    /* renamed from: F, reason: collision with root package name */
    public static final int f7057F = af.f("sidx");

    /* renamed from: G, reason: collision with root package name */
    public static final int f7058G = af.f("moov");

    /* renamed from: H, reason: collision with root package name */
    public static final int f7059H = af.f("mvhd");

    /* renamed from: I, reason: collision with root package name */
    public static final int f7060I = af.f("trak");
    public static final int J = af.f("mdia");

    /* renamed from: K, reason: collision with root package name */
    public static final int f7061K = af.f("minf");

    /* renamed from: L, reason: collision with root package name */
    public static final int f7062L = af.f("stbl");

    /* renamed from: M, reason: collision with root package name */
    public static final int f7063M = af.f("avcC");

    /* renamed from: N, reason: collision with root package name */
    public static final int f7064N = af.f("hvcC");

    /* renamed from: O, reason: collision with root package name */
    public static final int f7065O = af.f("esds");

    /* renamed from: P, reason: collision with root package name */
    public static final int f7066P = af.f("moof");

    /* renamed from: Q, reason: collision with root package name */
    public static final int f7067Q = af.f("traf");

    /* renamed from: R, reason: collision with root package name */
    public static final int f7068R = af.f("mvex");

    /* renamed from: S, reason: collision with root package name */
    public static final int f7069S = af.f("mehd");

    /* renamed from: T, reason: collision with root package name */
    public static final int f7070T = af.f("tkhd");

    /* renamed from: U, reason: collision with root package name */
    public static final int f7071U = af.f("edts");

    /* renamed from: V, reason: collision with root package name */
    public static final int f7072V = af.f("elst");

    /* renamed from: W, reason: collision with root package name */
    public static final int f7073W = af.f("mdhd");

    /* renamed from: X, reason: collision with root package name */
    public static final int f7074X = af.f("hdlr");
    public static final int Y = af.f("stsd");

    /* renamed from: Z, reason: collision with root package name */
    public static final int f7075Z = af.f("pssh");
    public static final int aa = af.f("sinf");
    public static final int ab = af.f("schm");
    public static final int ac = af.f("schi");
    public static final int ad = af.f("tenc");
    public static final int ae = af.f("encv");
    public static final int af = af.f("enca");
    public static final int ag = af.f("frma");
    public static final int ah = af.f("saiz");
    public static final int ai = af.f("saio");
    public static final int aj = af.f("sbgp");
    public static final int ak = af.f("sgpd");
    public static final int al = af.f("uuid");
    public static final int am = af.f("senc");
    public static final int an = af.f("pasp");
    public static final int ao = af.f("TTML");
    public static final int ap = af.f("vmhd");
    public static final int aq = af.f("mp4v");
    public static final int ar = af.f("stts");
    public static final int as = af.f("stss");
    public static final int at = af.f("ctts");
    public static final int au = af.f("stsc");
    public static final int av = af.f("stsz");
    public static final int aw = af.f("stz2");
    public static final int ax = af.f("stco");
    public static final int ay = af.f("co64");
    public static final int az = af.f("tx3g");
    public static final int aA = af.f("wvtt");
    public static final int aB = af.f("stpp");
    public static final int aC = af.f("c608");
    public static final int aD = af.f("samr");
    public static final int aE = af.f("sawb");
    public static final int aF = af.f("udta");
    public static final int aG = af.f("meta");
    public static final int aH = af.f("ilst");
    public static final int aI = af.f("mean");
    public static final int aJ = af.f("name");
    public static final int aK = af.f("data");
    public static final int aL = af.f("emsg");
    public static final int aM = af.f("st3d");
    public static final int aN = af.f("sv3d");
    public static final int aO = af.f("proj");
    public static final int aP = af.f("vp08");
    public static final int aQ = af.f("vp09");
    public static final int aR = af.f("vpcC");
    public static final int aS = af.f("camm");
    public static final int aT = af.f("alac");

    /* renamed from: com.anythink.basead.exoplayer.e.a.a$a, reason: collision with other inner class name */
    public static final class C0020a extends a {
        public final long aV;
        public final List<b> aW;
        public final List<C0020a> aX;

        public C0020a(int i, long j9) {
            super(i);
            this.aV = j9;
            this.aW = new ArrayList();
            this.aX = new ArrayList();
        }

        private int f(int i) {
            int size = this.aW.size();
            int i4 = 0;
            for (int i9 = 0; i9 < size; i9++) {
                if (this.aW.get(i9).aU == i) {
                    i4++;
                }
            }
            int size2 = this.aX.size();
            for (int i10 = 0; i10 < size2; i10++) {
                if (this.aX.get(i10).aU == i) {
                    i4++;
                }
            }
            return i4;
        }

        public final void a(b bVar) {
            this.aW.add(bVar);
        }

        public final b d(int i) {
            int size = this.aW.size();
            for (int i4 = 0; i4 < size; i4++) {
                b bVar = this.aW.get(i4);
                if (bVar.aU == i) {
                    return bVar;
                }
            }
            return null;
        }

        public final C0020a e(int i) {
            int size = this.aX.size();
            for (int i4 = 0; i4 < size; i4++) {
                C0020a c0020a = this.aX.get(i4);
                if (c0020a.aU == i) {
                    return c0020a;
                }
            }
            return null;
        }

        @Override // com.anythink.basead.exoplayer.e.a.a
        public final String toString() {
            return a.c(this.aU) + " leaves: " + Arrays.toString(this.aW.toArray()) + " containers: " + Arrays.toString(this.aX.toArray());
        }

        public final void a(C0020a c0020a) {
            this.aX.add(c0020a);
        }
    }

    public static final class b extends a {
        public final s aV;

        public b(int i, s sVar) {
            super(i);
            this.aV = sVar;
        }
    }

    public a(int i4) {
        this.aU = i4;
    }

    public static int a(int i4) {
        return (i4 >> 24) & p.f8630b;
    }

    public static int b(int i4) {
        return i4 & 16777215;
    }

    public static String c(int i4) {
        StringBuilder sb = new StringBuilder();
        sb.append((char) ((i4 >> 24) & p.f8630b));
        sb.append((char) ((i4 >> 16) & p.f8630b));
        sb.append((char) ((i4 >> 8) & p.f8630b));
        sb.append((char) (i4 & p.f8630b));
        return sb.toString();
    }

    public String toString() {
        return c(this.aU);
    }
}
