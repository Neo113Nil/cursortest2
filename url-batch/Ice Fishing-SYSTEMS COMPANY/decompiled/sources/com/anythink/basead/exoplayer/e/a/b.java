package com.anythink.basead.exoplayer.e.a;

import android.util.Log;
import android.util.Pair;
import com.anythink.basead.exoplayer.e.a.a;
import com.anythink.basead.exoplayer.e.a.d;
import com.anythink.basead.exoplayer.g.a;
import com.anythink.basead.exoplayer.k.C0544a;
import com.anythink.basead.exoplayer.k.af;
import com.anythink.basead.exoplayer.k.o;
import com.anythink.basead.exoplayer.k.p;
import com.anythink.basead.exoplayer.k.s;
import com.anythink.basead.exoplayer.t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f7101a = "AtomParsers";

    /* renamed from: b, reason: collision with root package name */
    private static final int f7102b = af.f("vide");

    /* renamed from: c, reason: collision with root package name */
    private static final int f7103c = af.f("soun");

    /* renamed from: d, reason: collision with root package name */
    private static final int f7104d = af.f(o.f8603c);

    /* renamed from: e, reason: collision with root package name */
    private static final int f7105e = af.f("sbtl");

    /* renamed from: f, reason: collision with root package name */
    private static final int f7106f = af.f("subt");

    /* renamed from: g, reason: collision with root package name */
    private static final int f7107g = af.f("clcp");

    /* renamed from: h, reason: collision with root package name */
    private static final int f7108h = af.f("meta");
    private static final int i = 3;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f7109a;

        /* renamed from: b, reason: collision with root package name */
        public int f7110b;

        /* renamed from: c, reason: collision with root package name */
        public int f7111c;

        /* renamed from: d, reason: collision with root package name */
        public long f7112d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f7113e;

        /* renamed from: f, reason: collision with root package name */
        private final s f7114f;

        /* renamed from: g, reason: collision with root package name */
        private final s f7115g;

        /* renamed from: h, reason: collision with root package name */
        private int f7116h;
        private int i;

        public a(s sVar, s sVar2, boolean z8) {
            this.f7115g = sVar;
            this.f7114f = sVar2;
            this.f7113e = z8;
            sVar2.c(12);
            this.f7109a = sVar2.m();
            sVar.c(12);
            this.i = sVar.m();
            C0544a.b(sVar.i() == 1, "first_chunk must be 1");
            this.f7110b = -1;
        }

        public final boolean a() {
            int i = this.f7110b + 1;
            this.f7110b = i;
            if (i == this.f7109a) {
                return false;
            }
            this.f7112d = this.f7113e ? this.f7114f.n() : this.f7114f.h();
            if (this.f7110b == this.f7116h) {
                this.f7111c = this.f7115g.m();
                this.f7115g.d(4);
                int i4 = this.i - 1;
                this.i = i4;
                this.f7116h = i4 > 0 ? this.f7115g.m() - 1 : -1;
            }
            return true;
        }
    }

    /* renamed from: com.anythink.basead.exoplayer.e.a.b$b, reason: collision with other inner class name */
    public interface InterfaceC0021b {
        int a();

        int b();

        boolean c();
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public static final int f7117a = 8;

        /* renamed from: b, reason: collision with root package name */
        public final k[] f7118b;

        /* renamed from: c, reason: collision with root package name */
        public com.anythink.basead.exoplayer.m f7119c;

        /* renamed from: d, reason: collision with root package name */
        public int f7120d;

        /* renamed from: e, reason: collision with root package name */
        public int f7121e = 0;

        public c(int i) {
            this.f7118b = new k[i];
        }
    }

    public static final class d implements InterfaceC0021b {

        /* renamed from: a, reason: collision with root package name */
        private final int f7122a;

        /* renamed from: b, reason: collision with root package name */
        private final int f7123b;

        /* renamed from: c, reason: collision with root package name */
        private final s f7124c;

        public d(a.b bVar) {
            s sVar = bVar.aV;
            this.f7124c = sVar;
            sVar.c(12);
            this.f7122a = sVar.m();
            this.f7123b = sVar.m();
        }

        @Override // com.anythink.basead.exoplayer.e.a.b.InterfaceC0021b
        public final int a() {
            return this.f7123b;
        }

        @Override // com.anythink.basead.exoplayer.e.a.b.InterfaceC0021b
        public final int b() {
            int i = this.f7122a;
            return i == 0 ? this.f7124c.m() : i;
        }

        @Override // com.anythink.basead.exoplayer.e.a.b.InterfaceC0021b
        public final boolean c() {
            return this.f7122a != 0;
        }
    }

    public static final class e implements InterfaceC0021b {

        /* renamed from: a, reason: collision with root package name */
        private final s f7125a;

        /* renamed from: b, reason: collision with root package name */
        private final int f7126b;

        /* renamed from: c, reason: collision with root package name */
        private final int f7127c;

        /* renamed from: d, reason: collision with root package name */
        private int f7128d;

        /* renamed from: e, reason: collision with root package name */
        private int f7129e;

        public e(a.b bVar) {
            s sVar = bVar.aV;
            this.f7125a = sVar;
            sVar.c(12);
            this.f7127c = sVar.m() & p.f8630b;
            this.f7126b = sVar.m();
        }

        @Override // com.anythink.basead.exoplayer.e.a.b.InterfaceC0021b
        public final int a() {
            return this.f7126b;
        }

        @Override // com.anythink.basead.exoplayer.e.a.b.InterfaceC0021b
        public final int b() {
            int i = this.f7127c;
            if (i == 8) {
                return this.f7125a.d();
            }
            if (i == 16) {
                return this.f7125a.e();
            }
            int i4 = this.f7128d;
            this.f7128d = i4 + 1;
            if (i4 % 2 != 0) {
                return this.f7129e & 15;
            }
            int d2 = this.f7125a.d();
            this.f7129e = d2;
            return (d2 & 240) >> 4;
        }

        @Override // com.anythink.basead.exoplayer.e.a.b.InterfaceC0021b
        public final boolean c() {
            return false;
        }
    }

    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        private final int f7130a;

        /* renamed from: b, reason: collision with root package name */
        private final long f7131b;

        /* renamed from: c, reason: collision with root package name */
        private final int f7132c;

        public f(int i, long j9, int i4) {
            this.f7130a = i;
            this.f7131b = j9;
            this.f7132c = i4;
        }
    }

    public static final class g extends t {
    }

    private b() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0096, code lost:
    
        if (r11 == 0) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0046 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static j a(a.C0020a c0020a, a.b bVar, long j9, com.anythink.basead.exoplayer.d.e eVar, boolean z8, boolean z9) {
        int i4;
        int i9;
        long j10;
        j jVar;
        long j11;
        long[] jArr;
        long[] jArr2;
        a.C0020a e6 = c0020a.e(com.anythink.basead.exoplayer.e.a.a.J);
        s sVar = e6.d(com.anythink.basead.exoplayer.e.a.a.f7074X).aV;
        sVar.c(16);
        int i10 = sVar.i();
        if (i10 == f7103c) {
            i4 = 1;
        } else if (i10 == f7102b) {
            i4 = 2;
        } else {
            if (i10 != f7104d && i10 != f7105e && i10 != f7106f && i10 != f7107g) {
                i9 = i10 == f7108h ? 4 : -1;
                j jVar2 = null;
                if (i9 != -1) {
                    return null;
                }
                s sVar2 = c0020a.d(com.anythink.basead.exoplayer.e.a.a.f7070T).aV;
                sVar2.c(8);
                int a9 = com.anythink.basead.exoplayer.e.a.a.a(sVar2.i());
                sVar2.d(a9 == 0 ? 8 : 16);
                int i11 = sVar2.i();
                sVar2.d(4);
                int c4 = sVar2.c();
                int i12 = a9 == 0 ? 4 : 8;
                int i13 = 0;
                int i14 = 0;
                while (true) {
                    j10 = com.anythink.basead.exoplayer.b.f6539b;
                    if (i14 >= i12) {
                        jVar = jVar2;
                        sVar2.d(i12);
                        break;
                    }
                    jVar = jVar2;
                    if (sVar2.f8659a[c4 + i14] != -1) {
                        j11 = a9 == 0 ? sVar2.h() : sVar2.n();
                    } else {
                        i14++;
                        jVar2 = jVar;
                    }
                }
                j11 = -9223372036854775807L;
                sVar2.d(16);
                int i15 = sVar2.i();
                int i16 = sVar2.i();
                sVar2.d(4);
                int i17 = sVar2.i();
                int i18 = sVar2.i();
                if (i15 == 0 && i16 == 65536 && i17 == -65536 && i18 == 0) {
                    i13 = 90;
                } else if (i15 == 0 && i16 == -65536 && i17 == 65536 && i18 == 0) {
                    i13 = 270;
                } else if (i15 == -65536 && i16 == 0 && i17 == 0 && i18 == -65536) {
                    i13 = 180;
                }
                f fVar = new f(i11, j11, i13);
                long j12 = j9 == com.anythink.basead.exoplayer.b.f6539b ? fVar.f7131b : j9;
                s sVar3 = bVar.aV;
                sVar3.c(8);
                sVar3.d(com.anythink.basead.exoplayer.e.a.a.a(sVar3.i()) == 0 ? 8 : 16);
                long h9 = sVar3.h();
                if (j12 != com.anythink.basead.exoplayer.b.f6539b) {
                    j10 = af.a(j12, 1000000L, h9);
                }
                long j13 = j10;
                a.C0020a e9 = e6.e(com.anythink.basead.exoplayer.e.a.a.f7061K).e(com.anythink.basead.exoplayer.e.a.a.f7062L);
                s sVar4 = e6.d(com.anythink.basead.exoplayer.e.a.a.f7073W).aV;
                sVar4.c(8);
                int a10 = com.anythink.basead.exoplayer.e.a.a.a(sVar4.i());
                sVar4.d(a10 == 0 ? 8 : 16);
                long h10 = sVar4.h();
                sVar4.d(a10 != 0 ? 8 : 4);
                int e10 = sVar4.e();
                StringBuilder sb = new StringBuilder();
                sb.append((char) (((e10 >> 10) & 31) + 96));
                sb.append((char) (((e10 >> 5) & 31) + 96));
                sb.append((char) ((e10 & 31) + 96));
                Pair create = Pair.create(Long.valueOf(h10), sb.toString());
                c a11 = a(e9.d(com.anythink.basead.exoplayer.e.a.a.Y).aV, fVar.f7130a, fVar.f7132c, (String) create.second, eVar, z9);
                if (z8) {
                    j jVar3 = jVar;
                    jArr = jVar3;
                    jArr2 = jVar3;
                } else {
                    Pair<long[], long[]> a12 = a(c0020a.e(com.anythink.basead.exoplayer.e.a.a.f7071U));
                    long[] jArr3 = (long[]) a12.first;
                    jArr = (long[]) a12.second;
                    jArr2 = jArr3;
                }
                return a11.f7119c == null ? jVar : new j(fVar.f7130a, i9, ((Long) create.first).longValue(), h9, j13, a11.f7119c, a11.f7121e, a11.f7118b, a11.f7120d, jArr2, jArr);
            }
            i4 = 3;
        }
        i9 = i4;
        j jVar22 = null;
        if (i9 != -1) {
        }
    }

    private static com.anythink.basead.exoplayer.g.a b(s sVar, int i4) {
        sVar.d(8);
        ArrayList arrayList = new ArrayList();
        while (sVar.c() < i4) {
            a.InterfaceC0024a a9 = com.anythink.basead.exoplayer.e.a.f.a(sVar);
            if (a9 != null) {
                arrayList.add(a9);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new com.anythink.basead.exoplayer.g.a(arrayList);
    }

    private static int c(s sVar) {
        sVar.c(16);
        int i4 = sVar.i();
        if (i4 == f7103c) {
            return 1;
        }
        if (i4 == f7102b) {
            return 2;
        }
        if (i4 == f7104d || i4 == f7105e || i4 == f7106f || i4 == f7107g) {
            return 3;
        }
        return i4 == f7108h ? 4 : -1;
    }

    private static Pair<Long, String> d(s sVar) {
        sVar.c(8);
        int a9 = com.anythink.basead.exoplayer.e.a.a.a(sVar.i());
        sVar.d(a9 == 0 ? 8 : 16);
        long h9 = sVar.h();
        sVar.d(a9 == 0 ? 4 : 8);
        int e6 = sVar.e();
        StringBuilder sb = new StringBuilder();
        sb.append((char) (((e6 >> 10) & 31) + 96));
        sb.append((char) (((e6 >> 5) & 31) + 96));
        sb.append((char) ((e6 & 31) + 96));
        return Pair.create(Long.valueOf(h9), sb.toString());
    }

    private static int e(s sVar) {
        int d2 = sVar.d();
        int i4 = d2 & com.anythink.expressad.video.module.a.a.f21886R;
        while ((d2 & 128) == 128) {
            d2 = sVar.d();
            i4 = (i4 << 7) | (d2 & com.anythink.expressad.video.module.a.a.f21886R);
        }
        return i4;
    }

    private static f b(s sVar) {
        long j9;
        sVar.c(8);
        int a9 = com.anythink.basead.exoplayer.e.a.a.a(sVar.i());
        sVar.d(a9 == 0 ? 8 : 16);
        int i4 = sVar.i();
        sVar.d(4);
        int c4 = sVar.c();
        int i9 = a9 == 0 ? 4 : 8;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            j9 = com.anythink.basead.exoplayer.b.f6539b;
            if (i11 < i9) {
                if (sVar.f8659a[c4 + i11] != -1) {
                    long h9 = a9 == 0 ? sVar.h() : sVar.n();
                    if (h9 != 0) {
                        j9 = h9;
                    }
                } else {
                    i11++;
                }
            } else {
                sVar.d(i9);
                break;
            }
        }
        sVar.d(16);
        int i12 = sVar.i();
        int i13 = sVar.i();
        sVar.d(4);
        int i14 = sVar.i();
        int i15 = sVar.i();
        if (i12 == 0 && i13 == 65536 && i14 == -65536 && i15 == 0) {
            i10 = 90;
        } else if (i12 == 0 && i13 == -65536 && i14 == 65536 && i15 == 0) {
            i10 = 270;
        } else if (i12 == -65536 && i13 == 0 && i14 == 0 && i15 == -65536) {
            i10 = 180;
        }
        return new f(i4, j9, i10);
    }

    private static float c(s sVar, int i4) {
        sVar.c(i4 + 8);
        return sVar.m() / sVar.m();
    }

    private static Pair<Integer, k> c(s sVar, int i4, int i9) {
        int i10 = i4 + 8;
        int i11 = -1;
        int i12 = 0;
        String str = null;
        Integer num = null;
        while (i10 - i4 < i9) {
            sVar.c(i10);
            int i13 = sVar.i();
            int i14 = sVar.i();
            if (i14 == com.anythink.basead.exoplayer.e.a.a.ag) {
                num = Integer.valueOf(sVar.i());
            } else if (i14 == com.anythink.basead.exoplayer.e.a.a.ab) {
                sVar.d(4);
                str = sVar.o();
            } else if (i14 == com.anythink.basead.exoplayer.e.a.a.ac) {
                i11 = i10;
                i12 = i13;
            }
            i10 += i13;
        }
        if (!com.anythink.basead.exoplayer.b.bd.equals(str) && !com.anythink.basead.exoplayer.b.be.equals(str) && !com.anythink.basead.exoplayer.b.bf.equals(str) && !com.anythink.basead.exoplayer.b.bg.equals(str)) {
            return null;
        }
        C0544a.a(num != null, "frma atom is mandatory");
        C0544a.a(i11 != -1, "schi atom is mandatory");
        k a9 = a(sVar, i11, i12, str);
        C0544a.a(a9 != null, "tenc atom is mandatory");
        return Pair.create(num, a9);
    }

    private static Pair<String, byte[]> d(s sVar, int i4) {
        sVar.c(i4 + 12);
        sVar.d(1);
        e(sVar);
        sVar.d(2);
        int d2 = sVar.d();
        if ((d2 & 128) != 0) {
            sVar.d(2);
        }
        if ((d2 & 64) != 0) {
            sVar.d(sVar.e());
        }
        if ((d2 & 32) != 0) {
            sVar.d(2);
        }
        sVar.d(1);
        e(sVar);
        String a9 = o.a(sVar.d());
        if (!o.f8619t.equals(a9) && !o.f8580D.equals(a9) && !o.f8581E.equals(a9)) {
            sVar.d(12);
            sVar.d(1);
            int e6 = e(sVar);
            byte[] bArr = new byte[e6];
            sVar.a(bArr, 0, e6);
            return Pair.create(a9, bArr);
        }
        return Pair.create(a9, null);
    }

    private static Pair<Integer, k> b(s sVar, int i4, int i9) {
        Pair<Integer, k> c4;
        int c9 = sVar.c();
        while (c9 - i4 < i9) {
            sVar.c(c9);
            int i10 = sVar.i();
            C0544a.a(i10 > 0, "childAtomSize should be positive");
            if (sVar.i() == com.anythink.basead.exoplayer.e.a.a.aa && (c4 = c(sVar, c9, i10)) != null) {
                return c4;
            }
            c9 += i10;
        }
        return null;
    }

    private static byte[] d(s sVar, int i4, int i9) {
        int i10 = i4 + 8;
        while (i10 - i4 < i9) {
            sVar.c(i10);
            int i11 = sVar.i();
            if (sVar.i() == com.anythink.basead.exoplayer.e.a.a.aO) {
                return Arrays.copyOfRange(sVar.f8659a, i10, i11 + i10);
            }
            i10 += i11;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:205:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x022a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static m a(j jVar, a.C0020a c0020a, com.anythink.basead.exoplayer.e.i iVar) {
        InterfaceC0021b eVar;
        boolean z8;
        int i4;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        long[] jArr;
        int[] iArr;
        long[] jArr2;
        int[] iArr2;
        long j9;
        int i15;
        long a9;
        int[] iArr3;
        long[] jArr3;
        String str;
        long j10;
        int[] iArr4;
        int i16;
        String str2;
        a.b d2 = c0020a.d(com.anythink.basead.exoplayer.e.a.a.av);
        if (d2 != null) {
            eVar = new d(d2);
        } else {
            a.b d3 = c0020a.d(com.anythink.basead.exoplayer.e.a.a.aw);
            if (d3 != null) {
                eVar = new e(d3);
            } else {
                throw new t("Track has no sample table size information");
            }
        }
        int a10 = eVar.a();
        if (a10 == 0) {
            return new m(jVar, new long[0], new int[0], 0, new long[0], new int[0], com.anythink.basead.exoplayer.b.f6539b);
        }
        a.b d9 = c0020a.d(com.anythink.basead.exoplayer.e.a.a.ax);
        if (d9 == null) {
            d9 = c0020a.d(com.anythink.basead.exoplayer.e.a.a.ay);
            z8 = true;
        } else {
            z8 = false;
        }
        s sVar = d9.aV;
        s sVar2 = c0020a.d(com.anythink.basead.exoplayer.e.a.a.au).aV;
        s sVar3 = c0020a.d(com.anythink.basead.exoplayer.e.a.a.ar).aV;
        a.b d10 = c0020a.d(com.anythink.basead.exoplayer.e.a.a.as);
        s sVar4 = null;
        s sVar5 = d10 != null ? d10.aV : null;
        a.b d11 = c0020a.d(com.anythink.basead.exoplayer.e.a.a.at);
        s sVar6 = d11 != null ? d11.aV : null;
        a aVar = new a(sVar2, sVar, z8);
        sVar3.c(12);
        int m8 = sVar3.m() - 1;
        int m9 = sVar3.m();
        int m10 = sVar3.m();
        if (sVar6 != null) {
            sVar6.c(12);
            i4 = sVar6.m();
        } else {
            i4 = 0;
        }
        if (sVar5 != null) {
            sVar5.c(12);
            i9 = sVar5.m();
            r16 = i9 > 0 ? sVar5.m() - 1 : -1;
            if (eVar.c()) {
                i10 = 0;
            } else {
                i10 = 0;
                if (o.f8622w.equals(jVar.f7274h.f8822h) && m8 == 0 && i4 == 0 && i9 == 0) {
                    i11 = 1;
                    String str3 = f7101a;
                    if (i11 == 0) {
                        long[] jArr4 = new long[a10];
                        i13 = 1;
                        int[] iArr5 = new int[a10];
                        s sVar7 = sVar6;
                        long[] jArr5 = new long[a10];
                        int[] iArr6 = new int[a10];
                        int i17 = r16;
                        InterfaceC0021b interfaceC0021b = eVar;
                        int i18 = i10;
                        int i19 = i18;
                        int i20 = i19;
                        i14 = i20;
                        int i21 = i14;
                        long j11 = 0;
                        long j12 = 0;
                        while (i18 < a10) {
                            while (i20 == 0) {
                                C0544a.b(aVar.a());
                                long j13 = aVar.f7112d;
                                i20 = aVar.f7111c;
                                j12 = j13;
                                a10 = a10;
                            }
                            int i22 = a10;
                            if (sVar7 != null) {
                                while (i21 == 0 && i4 > 0) {
                                    i21 = sVar7.m();
                                    i19 = sVar7.i();
                                    i4--;
                                }
                                i21--;
                            }
                            jArr4[i18] = j12;
                            int b9 = interfaceC0021b.b();
                            iArr5[i18] = b9;
                            if (b9 > i14) {
                                i14 = b9;
                            }
                            jArr5[i18] = j11 + i19;
                            iArr6[i18] = sVar4 == null ? 1 : i10;
                            if (i18 == i17) {
                                iArr6[i18] = 1;
                                i9--;
                                if (i9 > 0) {
                                    i17 = sVar4.m() - 1;
                                }
                            }
                            j11 += m10;
                            m9--;
                            if (m9 == 0 && m8 > 0) {
                                m8--;
                                m9 = sVar3.m();
                                m10 = sVar3.i();
                            }
                            j12 += iArr5[i18];
                            i20--;
                            i18++;
                            a10 = i22;
                        }
                        i12 = a10;
                        long j14 = j11 + i19;
                        C0544a.a(i21 == 0 ? 1 : i10);
                        while (i4 > 0) {
                            C0544a.a(sVar7.m() == 0 ? 1 : i10);
                            sVar7.i();
                            i4--;
                        }
                        if (i9 != 0 || m9 != 0 || i20 != 0 || m8 != 0) {
                            Log.w(f7101a, "Inconsistent stbl box for track " + jVar.f7269c + ": remainingSynchronizationSamples " + i9 + ", remainingSamplesAtTimestampDelta " + m9 + ", remainingSamplesInChunk " + i20 + ", remainingTimestampDeltaChanges " + m8);
                        }
                        iArr = iArr6;
                        jArr = jArr5;
                        jArr2 = jArr4;
                        iArr2 = iArr5;
                        j9 = j14;
                    } else {
                        i12 = a10;
                        i13 = 1;
                        int i23 = aVar.f7109a;
                        long[] jArr6 = new long[i23];
                        int[] iArr7 = new int[i23];
                        while (aVar.a()) {
                            int i24 = aVar.f7110b;
                            jArr6[i24] = aVar.f7112d;
                            iArr7[i24] = aVar.f7111c;
                        }
                        com.anythink.basead.exoplayer.m mVar = jVar.f7274h;
                        d.a a11 = com.anythink.basead.exoplayer.e.a.d.a(af.b(mVar.f8836w, mVar.f8834u), jArr6, iArr7, m10);
                        long[] jArr7 = a11.f7138a;
                        int[] iArr8 = a11.f7139b;
                        i14 = a11.f7140c;
                        long[] jArr8 = a11.f7141d;
                        int[] iArr9 = a11.f7142e;
                        long j15 = a11.f7143f;
                        jArr = jArr8;
                        iArr = iArr9;
                        jArr2 = jArr7;
                        iArr2 = iArr8;
                        j9 = j15;
                    }
                    i15 = i14;
                    a9 = af.a(j9, 1000000L, jVar.f7271e);
                    if (jVar.f7275j == null && !iVar.a()) {
                        long[] jArr9 = jVar.f7275j;
                        int i25 = i13;
                        if (jArr9.length == i25 && jVar.f7270d == i25 && jArr.length >= 2) {
                            long j16 = jVar.f7276k[i10];
                            long a12 = af.a(jArr9[i10], jVar.f7271e, jVar.f7272f) + j16;
                            int length = jArr.length - 1;
                            int i26 = i10;
                            int a13 = af.a(3, i26, length);
                            int a14 = af.a(jArr.length - 3, i26, length);
                            long j17 = jArr[i26];
                            if (j17 <= j16 && j16 < jArr[a13] && jArr[a14] < a12 && a12 <= j9) {
                                long j18 = j9 - a12;
                                long a15 = af.a(j16 - j17, jVar.f7274h.f8835v, jVar.f7271e);
                                long a16 = af.a(j18, jVar.f7274h.f8835v, jVar.f7271e);
                                if ((a15 != 0 || a16 != 0) && a15 <= 2147483647L && a16 <= 2147483647L) {
                                    iVar.f7330b = (int) a15;
                                    iVar.f7331c = (int) a16;
                                    af.a(jArr, jVar.f7271e);
                                    return new m(jVar, jArr2, iArr2, i15, jArr, iArr, a9);
                                }
                            }
                        }
                        long[] jArr10 = jArr;
                        long[] jArr11 = jVar.f7275j;
                        if (jArr11.length == 1 && jArr11[0] == 0) {
                            long j19 = jVar.f7276k[0];
                            for (int i27 = 0; i27 < jArr10.length; i27++) {
                                jArr10[i27] = af.a(jArr10[i27] - j19, 1000000L, jVar.f7271e);
                            }
                            return new m(jVar, jArr2, iArr2, i15, jArr10, iArr, af.a(j9 - j19, 1000000L, jVar.f7271e));
                        }
                        boolean z9 = jVar.f7270d == 1;
                        boolean z10 = false;
                        int i28 = 0;
                        int i29 = 0;
                        int i30 = 0;
                        while (true) {
                            long[] jArr12 = jVar.f7275j;
                            if (i30 >= jArr12.length) {
                                break;
                            }
                            long j20 = jVar.f7276k[i30];
                            if (j20 != -1) {
                                long j21 = jArr12[i30];
                                str2 = str3;
                                long a17 = af.a(j21, jVar.f7271e, jVar.f7272f);
                                boolean z11 = z10;
                                i16 = i15;
                                int a18 = af.a(jArr10, j20, true, true);
                                int a19 = af.a(jArr10, j20 + a17, z9, false);
                                i28 = (a19 - a18) + i28;
                                z10 = z11 | (i29 != a18);
                                i29 = a19;
                            } else {
                                i16 = i15;
                                str2 = str3;
                            }
                            i30++;
                            str3 = str2;
                            i15 = i16;
                        }
                        int i31 = i15;
                        String str4 = str3;
                        boolean z12 = z10 | (i28 != i12);
                        long[] jArr13 = z12 ? new long[i28] : jArr2;
                        int[] iArr10 = z12 ? new int[i28] : iArr2;
                        if (z12) {
                            i31 = 0;
                        }
                        int[] iArr11 = z12 ? new int[i28] : iArr;
                        long[] jArr14 = new long[i28];
                        int i32 = i31;
                        int i33 = 0;
                        int i34 = 0;
                        long j22 = 0;
                        while (true) {
                            long[] jArr15 = jVar.f7275j;
                            boolean z13 = z12;
                            if (i34 < jArr15.length) {
                                int i35 = i32;
                                long j23 = jVar.f7276k[i34];
                                long j24 = jArr15[i34];
                                if (j23 != -1) {
                                    int[] iArr12 = iArr;
                                    jArr3 = jArr14;
                                    j10 = j24;
                                    long a20 = af.a(j24, jVar.f7271e, jVar.f7272f) + j23;
                                    String str5 = str4;
                                    int a21 = af.a(jArr10, j23, true, true);
                                    int a22 = af.a(jArr10, a20, z9, false);
                                    if (z13) {
                                        int i36 = a22 - a21;
                                        System.arraycopy(jArr2, a21, jArr13, i33, i36);
                                        System.arraycopy(iArr2, a21, iArr10, i33, i36);
                                        iArr4 = iArr12;
                                        System.arraycopy(iArr4, a21, iArr11, i33, i36);
                                    } else {
                                        iArr4 = iArr12;
                                    }
                                    if (a21 < a22 && (iArr11[i33] & 1) == 0) {
                                        Log.w(str5, "Ignoring edit list: edit does not start with a sync sample.");
                                        throw new g();
                                    }
                                    str = str5;
                                    iArr3 = iArr4;
                                    int i37 = i35;
                                    while (a21 < a22) {
                                        long[] jArr16 = jArr2;
                                        int[] iArr13 = iArr2;
                                        jArr3[i33] = af.a(j22, 1000000L, jVar.f7272f) + af.a(jArr10[a21] - j23, 1000000L, jVar.f7271e);
                                        if (z13 && iArr10[i33] > i37) {
                                            i37 = iArr13[a21];
                                        }
                                        i33++;
                                        a21++;
                                        jArr2 = jArr16;
                                        iArr2 = iArr13;
                                    }
                                    i32 = i37;
                                } else {
                                    iArr3 = iArr;
                                    jArr3 = jArr14;
                                    str = str4;
                                    j10 = j24;
                                    i32 = i35;
                                }
                                j22 += j10;
                                i34++;
                                str4 = str;
                                z12 = z13;
                                jArr14 = jArr3;
                                iArr = iArr3;
                                jArr2 = jArr2;
                                iArr2 = iArr2;
                            } else {
                                return new m(jVar, jArr13, iArr10, i32, jArr14, iArr11, af.a(j22, 1000000L, jVar.f7271e));
                            }
                        }
                    } else {
                        long[] jArr17 = jArr2;
                        int[] iArr14 = iArr2;
                        int[] iArr15 = iArr;
                        long[] jArr18 = jArr;
                        af.a(jArr18, jVar.f7271e);
                        return new m(jVar, jArr17, iArr14, i15, jArr18, iArr15, a9);
                    }
                }
            }
            i11 = i10;
            String str32 = f7101a;
            if (i11 == 0) {
            }
            i15 = i14;
            a9 = af.a(j9, 1000000L, jVar.f7271e);
            if (jVar.f7275j == null) {
            }
            long[] jArr172 = jArr2;
            int[] iArr142 = iArr2;
            int[] iArr152 = iArr;
            long[] jArr182 = jArr;
            af.a(jArr182, jVar.f7271e);
            return new m(jVar, jArr172, iArr142, i15, jArr182, iArr152, a9);
        }
        i9 = 0;
        sVar4 = sVar5;
        if (eVar.c()) {
        }
        i11 = i10;
        String str322 = f7101a;
        if (i11 == 0) {
        }
        i15 = i14;
        a9 = af.a(j9, 1000000L, jVar.f7271e);
        if (jVar.f7275j == null) {
        }
        long[] jArr1722 = jArr2;
        int[] iArr1422 = iArr2;
        int[] iArr1522 = iArr;
        long[] jArr1822 = jArr;
        af.a(jArr1822, jVar.f7271e);
        return new m(jVar, jArr1722, iArr1422, i15, jArr1822, iArr1522, a9);
    }

    public static com.anythink.basead.exoplayer.g.a a(a.b bVar, boolean z8) {
        if (z8) {
            return null;
        }
        s sVar = bVar.aV;
        sVar.c(8);
        while (sVar.a() >= 8) {
            int c4 = sVar.c();
            int i4 = sVar.i();
            if (sVar.i() == com.anythink.basead.exoplayer.e.a.a.aG) {
                sVar.c(c4);
                int i9 = c4 + i4;
                sVar.d(12);
                while (true) {
                    if (sVar.c() >= i9) {
                        break;
                    }
                    int c9 = sVar.c();
                    int i10 = sVar.i();
                    if (sVar.i() == com.anythink.basead.exoplayer.e.a.a.aH) {
                        sVar.c(c9);
                        int i11 = c9 + i10;
                        sVar.d(8);
                        ArrayList arrayList = new ArrayList();
                        while (sVar.c() < i11) {
                            a.InterfaceC0024a a9 = com.anythink.basead.exoplayer.e.a.f.a(sVar);
                            if (a9 != null) {
                                arrayList.add(a9);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            return new com.anythink.basead.exoplayer.g.a(arrayList);
                        }
                    } else {
                        sVar.d(i10 - 8);
                    }
                }
                return null;
            }
            sVar.d(i4 - 8);
        }
        return null;
    }

    private static com.anythink.basead.exoplayer.g.a a(s sVar, int i4) {
        sVar.d(12);
        while (sVar.c() < i4) {
            int c4 = sVar.c();
            int i9 = sVar.i();
            if (sVar.i() == com.anythink.basead.exoplayer.e.a.a.aH) {
                sVar.c(c4);
                int i10 = c4 + i9;
                sVar.d(8);
                ArrayList arrayList = new ArrayList();
                while (sVar.c() < i10) {
                    a.InterfaceC0024a a9 = com.anythink.basead.exoplayer.e.a.f.a(sVar);
                    if (a9 != null) {
                        arrayList.add(a9);
                    }
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new com.anythink.basead.exoplayer.g.a(arrayList);
            }
            sVar.d(i9 - 8);
        }
        return null;
    }

    private static long a(s sVar) {
        sVar.c(8);
        sVar.d(com.anythink.basead.exoplayer.e.a.a.a(sVar.i()) != 0 ? 16 : 8);
        return sVar.h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static c a(s sVar, int i4, int i9, String str, com.anythink.basead.exoplayer.d.e eVar, boolean z8) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        com.anythink.basead.exoplayer.d.e eVar2;
        byte[] bArr;
        String str2;
        List<byte[]> list;
        String str3;
        com.anythink.basead.exoplayer.d.e eVar3;
        int i15;
        int k6;
        int i16;
        com.anythink.basead.exoplayer.d.e eVar4;
        String str4;
        int i17;
        String str5;
        String str6;
        int i18;
        int i19;
        List list2;
        int i20;
        String str7;
        int c4;
        String str8;
        String str9;
        char c9;
        com.anythink.basead.exoplayer.d.e eVar5 = eVar;
        sVar.c(12);
        int i21 = sVar.i();
        c cVar = new c(i21);
        int i22 = 0;
        int i23 = 0;
        while (i23 < i21) {
            int c10 = sVar.c();
            int i24 = sVar.i();
            boolean z9 = true;
            C0544a.a(i24 > 0 ? 1 : i22, "childAtomSize should be positive");
            int i25 = sVar.i();
            List list3 = null;
            if (i25 != com.anythink.basead.exoplayer.e.a.a.f7082g && i25 != com.anythink.basead.exoplayer.e.a.a.f7083h && i25 != com.anythink.basead.exoplayer.e.a.a.ae && i25 != com.anythink.basead.exoplayer.e.a.a.aq && i25 != com.anythink.basead.exoplayer.e.a.a.i && i25 != com.anythink.basead.exoplayer.e.a.a.f7084j && i25 != com.anythink.basead.exoplayer.e.a.a.f7085k && i25 != com.anythink.basead.exoplayer.e.a.a.aP && i25 != com.anythink.basead.exoplayer.e.a.a.aQ) {
                if (i25 != com.anythink.basead.exoplayer.e.a.a.f7088n && i25 != com.anythink.basead.exoplayer.e.a.a.af && i25 != com.anythink.basead.exoplayer.e.a.a.f7093s && i25 != com.anythink.basead.exoplayer.e.a.a.f7095u && i25 != com.anythink.basead.exoplayer.e.a.a.f7097w && i25 != com.anythink.basead.exoplayer.e.a.a.f7100z && i25 != com.anythink.basead.exoplayer.e.a.a.f7098x && i25 != com.anythink.basead.exoplayer.e.a.a.f7099y && i25 != com.anythink.basead.exoplayer.e.a.a.aD && i25 != com.anythink.basead.exoplayer.e.a.a.aE && i25 != com.anythink.basead.exoplayer.e.a.a.f7091q && i25 != com.anythink.basead.exoplayer.e.a.a.f7092r && i25 != com.anythink.basead.exoplayer.e.a.a.f7089o && i25 != com.anythink.basead.exoplayer.e.a.a.aT) {
                    int i26 = com.anythink.basead.exoplayer.e.a.a.ao;
                    if (i25 != i26 && i25 != com.anythink.basead.exoplayer.e.a.a.az && i25 != com.anythink.basead.exoplayer.e.a.a.aA && i25 != com.anythink.basead.exoplayer.e.a.a.aB && i25 != com.anythink.basead.exoplayer.e.a.a.aC) {
                        if (i25 == com.anythink.basead.exoplayer.e.a.a.aS) {
                            cVar.f7119c = com.anythink.basead.exoplayer.m.a(Integer.toString(i4), o.ah, (String) null, (com.anythink.basead.exoplayer.d.e) null);
                        }
                        i10 = i23;
                        i11 = i21;
                        i12 = i22;
                        i13 = c10;
                        i14 = i24;
                    } else {
                        sVar.c(c10 + 16);
                        String str10 = o.f8600Z;
                        long j9 = Long.MAX_VALUE;
                        if (i25 != i26) {
                            if (i25 == com.anythink.basead.exoplayer.e.a.a.az) {
                                int i27 = i24 - 16;
                                byte[] bArr2 = new byte[i27];
                                sVar.a(bArr2, i22, i27);
                                list3 = Collections.singletonList(bArr2);
                                str10 = o.aa;
                            } else if (i25 == com.anythink.basead.exoplayer.e.a.a.aA) {
                                str10 = o.ab;
                            } else if (i25 == com.anythink.basead.exoplayer.e.a.a.aB) {
                                j9 = 0;
                            } else if (i25 == com.anythink.basead.exoplayer.e.a.a.aC) {
                                cVar.f7121e = 1;
                                str10 = o.ac;
                            } else {
                                throw new IllegalStateException();
                            }
                        }
                        i10 = i23;
                        i13 = c10;
                        i11 = i21;
                        i14 = i24;
                        cVar.f7119c = com.anythink.basead.exoplayer.m.a(Integer.toString(i4), str10, (String) null, -1, 0, str, -1, (com.anythink.basead.exoplayer.d.e) null, j9, (List<byte[]>) list3);
                        i12 = 0;
                    }
                } else {
                    i10 = i23;
                    i13 = c10;
                    i11 = i21;
                    String str11 = str;
                    i14 = i24;
                    sVar.c(i13 + 16);
                    if (z8) {
                        i15 = sVar.e();
                        sVar.d(6);
                    } else {
                        sVar.d(8);
                        i15 = 0;
                    }
                    if (i15 == 0 || i15 == 1) {
                        int e6 = sVar.e();
                        sVar.d(6);
                        k6 = sVar.k();
                        if (i15 == 1) {
                            sVar.d(16);
                        }
                        i16 = e6;
                    } else {
                        if (i15 == 2) {
                            sVar.d(16);
                            k6 = (int) Math.round(Double.longBitsToDouble(sVar.j()));
                            i16 = sVar.m();
                            sVar.d(20);
                        }
                        i12 = 0;
                    }
                    int c11 = sVar.c();
                    if (i25 == com.anythink.basead.exoplayer.e.a.a.af) {
                        Pair<Integer, k> b9 = b(sVar, i13, i14);
                        if (b9 != null) {
                            i25 = ((Integer) b9.first).intValue();
                            eVar4 = eVar5 == null ? null : eVar5.a(((k) b9.second).f7281b);
                            cVar.f7118b[i10] = (k) b9.second;
                        } else {
                            eVar4 = eVar5;
                        }
                        sVar.c(c11);
                    } else {
                        eVar4 = eVar5;
                    }
                    int i28 = com.anythink.basead.exoplayer.e.a.a.f7093s;
                    String str12 = o.f8622w;
                    if (i25 == i28) {
                        str4 = o.f8625z;
                    } else if (i25 == com.anythink.basead.exoplayer.e.a.a.f7095u) {
                        str4 = o.f8577A;
                    } else if (i25 == com.anythink.basead.exoplayer.e.a.a.f7097w) {
                        str4 = o.f8580D;
                    } else if (i25 != com.anythink.basead.exoplayer.e.a.a.f7098x && i25 != com.anythink.basead.exoplayer.e.a.a.f7099y) {
                        if (i25 == com.anythink.basead.exoplayer.e.a.a.f7100z) {
                            str4 = o.f8582F;
                        } else if (i25 == com.anythink.basead.exoplayer.e.a.a.aD) {
                            str4 = o.f8585I;
                        } else if (i25 == com.anythink.basead.exoplayer.e.a.a.aE) {
                            str4 = o.J;
                        } else if (i25 == com.anythink.basead.exoplayer.e.a.a.f7091q || i25 == com.anythink.basead.exoplayer.e.a.a.f7092r) {
                            str4 = o.f8622w;
                        } else if (i25 == com.anythink.basead.exoplayer.e.a.a.f7089o) {
                            str4 = o.f8619t;
                        } else {
                            str4 = i25 == com.anythink.basead.exoplayer.e.a.a.aT ? o.f8587L : null;
                        }
                    } else {
                        str4 = o.f8581E;
                    }
                    int i29 = k6;
                    int i30 = c11;
                    int i31 = i16;
                    byte[] bArr3 = null;
                    while (i30 - i13 < i14) {
                        sVar.c(i30);
                        int i32 = sVar.i();
                        C0544a.a(i32 > 0 ? z9 : false, "childAtomSize should be positive");
                        int i33 = sVar.i();
                        int i34 = com.anythink.basead.exoplayer.e.a.a.f7065O;
                        if (i33 != i34) {
                            int i35 = i30;
                            if (z8 && i33 == com.anythink.basead.exoplayer.e.a.a.f7090p) {
                                i17 = i35;
                                str5 = str4;
                                str6 = str12;
                                i19 = -1;
                                list2 = null;
                                i18 = i14;
                            } else {
                                if (i33 == com.anythink.basead.exoplayer.e.a.a.f7094t) {
                                    sVar.c(i35 + 8);
                                    cVar.f7119c = com.anythink.basead.exoplayer.b.a.a(sVar, Integer.toString(i4), str11, eVar4);
                                } else if (i33 == com.anythink.basead.exoplayer.e.a.a.f7096v) {
                                    sVar.c(i35 + 8);
                                    cVar.f7119c = com.anythink.basead.exoplayer.b.a.b(sVar, Integer.toString(i4), str11, eVar4);
                                } else {
                                    if (i33 == com.anythink.basead.exoplayer.e.a.a.f7052A) {
                                        str7 = str4;
                                        i17 = i35;
                                        c9 = 65535;
                                        list2 = null;
                                        i18 = i14;
                                        i20 = i32;
                                        str9 = str12;
                                        cVar.f7119c = com.anythink.basead.exoplayer.m.a(Integer.toString(i4), str7, null, -1, i31, i29, null, eVar4, str);
                                    } else {
                                        str7 = str4;
                                        str9 = str12;
                                        i17 = i35;
                                        c9 = 65535;
                                        list2 = null;
                                        i18 = i14;
                                        i20 = i32;
                                        if (i33 == com.anythink.basead.exoplayer.e.a.a.aT) {
                                            byte[] bArr4 = new byte[i20];
                                            sVar.c(i17);
                                            sVar.a(bArr4, 0, i20);
                                            bArr3 = bArr4;
                                            str6 = str9;
                                            i30 = i17 + i20;
                                            str12 = str6;
                                            list3 = list2;
                                            i14 = i18;
                                            z9 = true;
                                            str4 = str7;
                                            str11 = str;
                                        }
                                    }
                                    str6 = str9;
                                    i30 = i17 + i20;
                                    str12 = str6;
                                    list3 = list2;
                                    i14 = i18;
                                    z9 = true;
                                    str4 = str7;
                                    str11 = str;
                                }
                                str7 = str4;
                                str9 = str12;
                                i17 = i35;
                                c9 = 65535;
                                list2 = null;
                                i18 = i14;
                                i20 = i32;
                                str6 = str9;
                                i30 = i17 + i20;
                                str12 = str6;
                                list3 = list2;
                                i14 = i18;
                                z9 = true;
                                str4 = str7;
                                str11 = str;
                            }
                        } else {
                            i17 = i30;
                            str5 = str4;
                            str6 = str12;
                            i18 = i14;
                            i19 = -1;
                            list2 = null;
                        }
                        i20 = i32;
                        boolean z10 = false;
                        if (i33 != i34) {
                            c4 = sVar.c();
                            while (true) {
                                if (c4 - i17 >= i20) {
                                    c4 = i19;
                                    break;
                                }
                                sVar.c(c4);
                                int i36 = sVar.i();
                                if (i36 > 0) {
                                    z10 = true;
                                }
                                C0544a.a(z10, "childAtomSize should be positive");
                                if (sVar.i() == com.anythink.basead.exoplayer.e.a.a.f7065O) {
                                    break;
                                }
                                c4 += i36;
                                z10 = false;
                            }
                        } else {
                            c4 = i17;
                        }
                        if (c4 != i19) {
                            Pair<String, byte[]> d2 = d(sVar, c4);
                            str8 = (String) d2.first;
                            bArr3 = (byte[]) d2.second;
                            if (o.f8617r.equals(str8)) {
                                Pair<Integer, Integer> a9 = com.anythink.basead.exoplayer.k.d.a(bArr3);
                                i29 = ((Integer) a9.first).intValue();
                                i31 = ((Integer) a9.second).intValue();
                            }
                        } else {
                            str8 = str5;
                        }
                        str7 = str8;
                        i30 = i17 + i20;
                        str12 = str6;
                        list3 = list2;
                        i14 = i18;
                        z9 = true;
                        str4 = str7;
                        str11 = str;
                    }
                    String str13 = str4;
                    String str14 = str12;
                    List list4 = list3;
                    int i37 = i14;
                    if (cVar.f7119c != null || str13 == null) {
                        i12 = 0;
                    } else {
                        i12 = 0;
                        cVar.f7119c = com.anythink.basead.exoplayer.m.a(Integer.toString(i4), str13, (String) null, -1, i31, i29, str14.equals(str13) ? 2 : -1, (List<byte[]>) (bArr3 == null ? list4 : Collections.singletonList(bArr3)), eVar4, str);
                    }
                    eVar5 = eVar;
                    i14 = i37;
                }
            } else {
                i10 = i23;
                i11 = i21;
                i12 = i22;
                i13 = c10;
                sVar.c(i13 + 16);
                sVar.d(16);
                int e9 = sVar.e();
                int e10 = sVar.e();
                sVar.d(50);
                int c12 = sVar.c();
                if (i25 == com.anythink.basead.exoplayer.e.a.a.ae) {
                    i14 = i24;
                    Pair<Integer, k> b10 = b(sVar, i13, i14);
                    if (b10 != null) {
                        i25 = ((Integer) b10.first).intValue();
                        if (eVar == null) {
                            eVar5 = eVar;
                            eVar3 = null;
                        } else {
                            eVar5 = eVar;
                            eVar3 = eVar5.a(((k) b10.second).f7281b);
                        }
                        cVar.f7118b[i10] = (k) b10.second;
                    } else {
                        eVar5 = eVar;
                        eVar3 = eVar5;
                    }
                    sVar.c(c12);
                    eVar2 = eVar3;
                } else {
                    eVar5 = eVar;
                    i14 = i24;
                    eVar2 = eVar5;
                }
                int i38 = -1;
                float f6 = 1.0f;
                int i39 = i12;
                String str15 = null;
                List<byte[]> list5 = null;
                byte[] bArr5 = null;
                while (c12 - i13 < i14) {
                    sVar.c(c12);
                    int c13 = sVar.c();
                    int i40 = sVar.i();
                    if (i40 == 0 && sVar.c() - i13 == i14) {
                        break;
                    }
                    C0544a.a(i40 > 0 ? 1 : i12, "childAtomSize should be positive");
                    int i41 = sVar.i();
                    if (i41 == com.anythink.basead.exoplayer.e.a.a.f7063M) {
                        C0544a.b(str15 == null ? 1 : i12);
                        sVar.c(c13 + 8);
                        com.anythink.basead.exoplayer.l.a a10 = com.anythink.basead.exoplayer.l.a.a(sVar);
                        list = a10.f8701a;
                        cVar.f7120d = a10.f8702b;
                        if (i39 == 0) {
                            f6 = a10.f8705e;
                        }
                        str3 = o.f8608h;
                    } else if (i41 == com.anythink.basead.exoplayer.e.a.a.f7064N) {
                        C0544a.b(str15 == null ? 1 : i12);
                        sVar.c(c13 + 8);
                        com.anythink.basead.exoplayer.l.d a11 = com.anythink.basead.exoplayer.l.d.a(sVar);
                        list = a11.f8726a;
                        cVar.f7120d = a11.f8727b;
                        str3 = o.i;
                    } else {
                        if (i41 == com.anythink.basead.exoplayer.e.a.a.aR) {
                            C0544a.b(str15 == null ? 1 : i12);
                            str2 = i25 == com.anythink.basead.exoplayer.e.a.a.aP ? o.f8609j : o.f8610k;
                        } else if (i41 == com.anythink.basead.exoplayer.e.a.a.f7086l) {
                            C0544a.b(str15 == null ? 1 : i12);
                            str2 = o.f8607g;
                        } else {
                            if (i41 == com.anythink.basead.exoplayer.e.a.a.f7065O) {
                                C0544a.b(str15 == null ? 1 : i12);
                                Pair<String, byte[]> d3 = d(sVar, c13);
                                String str16 = (String) d3.first;
                                list5 = Collections.singletonList((byte[]) d3.second);
                                str15 = str16;
                            } else if (i41 == com.anythink.basead.exoplayer.e.a.a.an) {
                                sVar.c(c13 + 8);
                                f6 = sVar.m() / sVar.m();
                                i39 = 1;
                            } else if (i41 == com.anythink.basead.exoplayer.e.a.a.aN) {
                                int i42 = c13 + 8;
                                while (true) {
                                    if (i42 - c13 >= i40) {
                                        bArr = null;
                                        break;
                                    }
                                    sVar.c(i42);
                                    int i43 = sVar.i();
                                    if (sVar.i() == com.anythink.basead.exoplayer.e.a.a.aO) {
                                        bArr = Arrays.copyOfRange(sVar.f8659a, i42, i43 + i42);
                                        break;
                                    }
                                    i42 += i43;
                                }
                                bArr5 = bArr;
                            } else if (i41 == com.anythink.basead.exoplayer.e.a.a.aM) {
                                int d9 = sVar.d();
                                sVar.d(3);
                                if (d9 == 0) {
                                    int d10 = sVar.d();
                                    if (d10 == 0) {
                                        i38 = i12;
                                    } else if (d10 == 1) {
                                        i38 = 1;
                                    } else if (d10 == 2) {
                                        i38 = 2;
                                    } else if (d10 == 3) {
                                        i38 = 3;
                                    }
                                    c12 += i40;
                                }
                            }
                            c12 += i40;
                        }
                        str15 = str2;
                        c12 += i40;
                    }
                    str15 = str3;
                    list5 = list;
                    c12 += i40;
                }
                if (str15 != null) {
                    cVar.f7119c = com.anythink.basead.exoplayer.m.a(Integer.toString(i4), str15, null, -1, -1, e9, e10, -1.0f, list5, i9, f6, bArr5, i38, null, eVar2);
                }
            }
            sVar.c(i13 + i14);
            i23 = i10 + 1;
            i22 = i12;
            i21 = i11;
        }
        return cVar;
    }

    private static void a(s sVar, int i4, int i9, int i10, int i11, String str, c cVar) {
        sVar.c(i9 + 16);
        int i12 = com.anythink.basead.exoplayer.e.a.a.ao;
        String str2 = o.f8600Z;
        List list = null;
        long j9 = Long.MAX_VALUE;
        if (i4 != i12) {
            if (i4 == com.anythink.basead.exoplayer.e.a.a.az) {
                int i13 = i10 - 16;
                byte[] bArr = new byte[i13];
                sVar.a(bArr, 0, i13);
                list = Collections.singletonList(bArr);
                str2 = o.aa;
            } else if (i4 == com.anythink.basead.exoplayer.e.a.a.aA) {
                str2 = o.ab;
            } else if (i4 == com.anythink.basead.exoplayer.e.a.a.aB) {
                j9 = 0;
            } else if (i4 == com.anythink.basead.exoplayer.e.a.a.aC) {
                cVar.f7121e = 1;
                str2 = o.ac;
            } else {
                throw new IllegalStateException();
            }
        }
        cVar.f7119c = com.anythink.basead.exoplayer.m.a(Integer.toString(i11), str2, (String) null, -1, 0, str, -1, (com.anythink.basead.exoplayer.d.e) null, j9, (List<byte[]>) list);
    }

    private static void a(s sVar, int i4, int i9, int i10, int i11, int i12, com.anythink.basead.exoplayer.d.e eVar, c cVar, int i13) {
        int i14 = i9;
        com.anythink.basead.exoplayer.d.e eVar2 = eVar;
        sVar.c(i14 + 16);
        sVar.d(16);
        int e6 = sVar.e();
        int e9 = sVar.e();
        sVar.d(50);
        int c4 = sVar.c();
        String str = null;
        int i15 = i4;
        if (i15 == com.anythink.basead.exoplayer.e.a.a.ae) {
            Pair<Integer, k> b9 = b(sVar, i14, i10);
            if (b9 != null) {
                i15 = ((Integer) b9.first).intValue();
                eVar2 = eVar2 == null ? null : eVar2.a(((k) b9.second).f7281b);
                cVar.f7118b[i13] = (k) b9.second;
            }
            sVar.c(c4);
        }
        com.anythink.basead.exoplayer.d.e eVar3 = eVar2;
        float f6 = 1.0f;
        List<byte[]> list = null;
        byte[] bArr = null;
        int i16 = -1;
        boolean z8 = false;
        while (c4 - i14 < i10) {
            sVar.c(c4);
            int c9 = sVar.c();
            int i17 = sVar.i();
            if (i17 == 0 && sVar.c() - i14 == i10) {
                break;
            }
            C0544a.a(i17 > 0, "childAtomSize should be positive");
            int i18 = sVar.i();
            if (i18 == com.anythink.basead.exoplayer.e.a.a.f7063M) {
                C0544a.b(str == null);
                sVar.c(c9 + 8);
                com.anythink.basead.exoplayer.l.a a9 = com.anythink.basead.exoplayer.l.a.a(sVar);
                list = a9.f8701a;
                cVar.f7120d = a9.f8702b;
                if (!z8) {
                    f6 = a9.f8705e;
                }
                str = o.f8608h;
            } else if (i18 == com.anythink.basead.exoplayer.e.a.a.f7064N) {
                C0544a.b(str == null);
                sVar.c(c9 + 8);
                com.anythink.basead.exoplayer.l.d a10 = com.anythink.basead.exoplayer.l.d.a(sVar);
                list = a10.f8726a;
                cVar.f7120d = a10.f8727b;
                str = o.i;
            } else if (i18 == com.anythink.basead.exoplayer.e.a.a.aR) {
                C0544a.b(str == null);
                str = i15 == com.anythink.basead.exoplayer.e.a.a.aP ? o.f8609j : o.f8610k;
            } else if (i18 == com.anythink.basead.exoplayer.e.a.a.f7086l) {
                C0544a.b(str == null);
                str = o.f8607g;
            } else if (i18 == com.anythink.basead.exoplayer.e.a.a.f7065O) {
                C0544a.b(str == null);
                Pair<String, byte[]> d2 = d(sVar, c9);
                str = (String) d2.first;
                list = Collections.singletonList((byte[]) d2.second);
            } else if (i18 == com.anythink.basead.exoplayer.e.a.a.an) {
                sVar.c(c9 + 8);
                f6 = sVar.m() / sVar.m();
                z8 = true;
            } else if (i18 == com.anythink.basead.exoplayer.e.a.a.aN) {
                int i19 = c9 + 8;
                while (true) {
                    if (i19 - c9 >= i17) {
                        bArr = null;
                        break;
                    }
                    sVar.c(i19);
                    int i20 = sVar.i();
                    if (sVar.i() == com.anythink.basead.exoplayer.e.a.a.aO) {
                        bArr = Arrays.copyOfRange(sVar.f8659a, i19, i20 + i19);
                        break;
                    }
                    i19 += i20;
                }
            } else if (i18 == com.anythink.basead.exoplayer.e.a.a.aM) {
                int d3 = sVar.d();
                sVar.d(3);
                if (d3 == 0) {
                    int d9 = sVar.d();
                    if (d9 == 0) {
                        i16 = 0;
                    } else if (d9 == 1) {
                        i16 = 1;
                    } else if (d9 == 2) {
                        i16 = 2;
                    } else if (d9 == 3) {
                        i16 = 3;
                    }
                }
            }
            c4 += i17;
            i14 = i9;
        }
        if (str == null) {
            return;
        }
        cVar.f7119c = com.anythink.basead.exoplayer.m.a(Integer.toString(i11), str, null, -1, -1, e6, e9, -1.0f, list, i12, f6, bArr, i16, null, eVar3);
    }

    private static Pair<long[], long[]> a(a.C0020a c0020a) {
        a.b d2;
        if (c0020a != null && (d2 = c0020a.d(com.anythink.basead.exoplayer.e.a.a.f7072V)) != null) {
            s sVar = d2.aV;
            sVar.c(8);
            int a9 = com.anythink.basead.exoplayer.e.a.a.a(sVar.i());
            int m8 = sVar.m();
            long[] jArr = new long[m8];
            long[] jArr2 = new long[m8];
            for (int i4 = 0; i4 < m8; i4++) {
                jArr[i4] = a9 == 1 ? sVar.n() : sVar.h();
                jArr2[i4] = a9 == 1 ? sVar.j() : sVar.i();
                if (sVar.f() == 1) {
                    sVar.d(2);
                } else {
                    throw new IllegalArgumentException("Unsupported media rate.");
                }
            }
            return Pair.create(jArr, jArr2);
        }
        return Pair.create(null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01c7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(s sVar, int i4, int i9, int i10, int i11, String str, boolean z8, com.anythink.basead.exoplayer.d.e eVar, c cVar, int i12) {
        int i13;
        int k6;
        int i14;
        String str2;
        int i15;
        String str3;
        int i16;
        int i17;
        int c4;
        int i18;
        String str4;
        String str5 = str;
        com.anythink.basead.exoplayer.d.e eVar2 = eVar;
        sVar.c(i9 + 16);
        if (z8) {
            i13 = sVar.e();
            sVar.d(6);
        } else {
            sVar.d(8);
            i13 = 0;
        }
        boolean z9 = true;
        if (i13 == 0 || i13 == 1) {
            int e6 = sVar.e();
            sVar.d(6);
            k6 = sVar.k();
            if (i13 == 1) {
                sVar.d(16);
            }
            i14 = e6;
        } else {
            if (i13 != 2) {
                return;
            }
            sVar.d(16);
            k6 = (int) Math.round(Double.longBitsToDouble(sVar.j()));
            i14 = sVar.m();
            sVar.d(20);
        }
        int c9 = sVar.c();
        int i19 = i4;
        if (i19 == com.anythink.basead.exoplayer.e.a.a.af) {
            Pair<Integer, k> b9 = b(sVar, i9, i10);
            if (b9 != null) {
                i19 = ((Integer) b9.first).intValue();
                eVar2 = eVar2 == null ? null : eVar2.a(((k) b9.second).f7281b);
                cVar.f7118b[i12] = (k) b9.second;
            }
            sVar.c(c9);
        }
        com.anythink.basead.exoplayer.d.e eVar3 = eVar2;
        int i20 = com.anythink.basead.exoplayer.e.a.a.f7093s;
        String str6 = o.f8622w;
        if (i19 == i20) {
            str2 = o.f8625z;
        } else if (i19 == com.anythink.basead.exoplayer.e.a.a.f7095u) {
            str2 = o.f8577A;
        } else if (i19 == com.anythink.basead.exoplayer.e.a.a.f7097w) {
            str2 = o.f8580D;
        } else if (i19 != com.anythink.basead.exoplayer.e.a.a.f7098x && i19 != com.anythink.basead.exoplayer.e.a.a.f7099y) {
            if (i19 == com.anythink.basead.exoplayer.e.a.a.f7100z) {
                str2 = o.f8582F;
            } else if (i19 == com.anythink.basead.exoplayer.e.a.a.aD) {
                str2 = o.f8585I;
            } else if (i19 == com.anythink.basead.exoplayer.e.a.a.aE) {
                str2 = o.J;
            } else if (i19 == com.anythink.basead.exoplayer.e.a.a.f7091q || i19 == com.anythink.basead.exoplayer.e.a.a.f7092r) {
                str2 = o.f8622w;
            } else if (i19 == com.anythink.basead.exoplayer.e.a.a.f7089o) {
                str2 = o.f8619t;
            } else {
                str2 = i19 == com.anythink.basead.exoplayer.e.a.a.aT ? o.f8587L : null;
            }
        } else {
            str2 = o.f8581E;
        }
        int i21 = k6;
        byte[] bArr = null;
        String str7 = str2;
        int i22 = c9;
        while (i22 - i9 < i10) {
            sVar.c(i22);
            int i23 = sVar.i();
            C0544a.a(i23 > 0 ? z9 : false, "childAtomSize should be positive");
            int i24 = sVar.i();
            int i25 = com.anythink.basead.exoplayer.e.a.a.f7065O;
            if (i24 == i25 || (z8 && i24 == com.anythink.basead.exoplayer.e.a.a.f7090p)) {
                String str8 = str6;
                i15 = i14;
                str3 = str8;
                i16 = i22;
                i17 = i23;
                boolean z10 = false;
                if (i24 == i25) {
                    c4 = i16;
                } else {
                    c4 = sVar.c();
                    while (c4 - i16 < i17) {
                        sVar.c(c4);
                        int i26 = sVar.i();
                        C0544a.a(i26 > 0 ? true : z10, "childAtomSize should be positive");
                        if (sVar.i() != com.anythink.basead.exoplayer.e.a.a.f7065O) {
                            c4 += i26;
                            z10 = false;
                        }
                    }
                    i18 = -1;
                    c4 = -1;
                    if (c4 == i18) {
                        Pair<String, byte[]> d2 = d(sVar, c4);
                        String str9 = (String) d2.first;
                        bArr = (byte[]) d2.second;
                        if (o.f8617r.equals(str9)) {
                            Pair<Integer, Integer> a9 = com.anythink.basead.exoplayer.k.d.a(bArr);
                            i21 = ((Integer) a9.first).intValue();
                            i15 = ((Integer) a9.second).intValue();
                        }
                        str7 = str9;
                    }
                }
                i18 = -1;
                if (c4 == i18) {
                }
            } else {
                if (i24 == com.anythink.basead.exoplayer.e.a.a.f7094t) {
                    sVar.c(i22 + 8);
                    cVar.f7119c = com.anythink.basead.exoplayer.b.a.a(sVar, Integer.toString(i11), str5, eVar3);
                } else if (i24 == com.anythink.basead.exoplayer.e.a.a.f7096v) {
                    sVar.c(i22 + 8);
                    cVar.f7119c = com.anythink.basead.exoplayer.b.a.b(sVar, Integer.toString(i11), str5, eVar3);
                } else {
                    if (i24 == com.anythink.basead.exoplayer.e.a.a.f7052A) {
                        String str10 = str6;
                        i15 = i14;
                        str4 = str10;
                        i16 = i22;
                        cVar.f7119c = com.anythink.basead.exoplayer.m.a(Integer.toString(i11), str7, null, -1, i15, i21, null, eVar3, str);
                        i17 = i23;
                    } else {
                        i16 = i22;
                        i17 = i23;
                        str4 = str6;
                        i15 = i14;
                        if (i24 == com.anythink.basead.exoplayer.e.a.a.aT) {
                            byte[] bArr2 = new byte[i17];
                            sVar.c(i16);
                            sVar.a(bArr2, 0, i17);
                            bArr = bArr2;
                            str3 = str4;
                        }
                    }
                    str3 = str4;
                }
                i16 = i22;
                i17 = i23;
                str4 = str6;
                i15 = i14;
                str3 = str4;
            }
            i22 = i17 + i16;
            int i27 = i15;
            str6 = str3;
            i14 = i27;
            str5 = str;
            z9 = true;
        }
        String str11 = str6;
        int i28 = i14;
        if (cVar.f7119c != null || str7 == null) {
            return;
        }
        cVar.f7119c = com.anythink.basead.exoplayer.m.a(Integer.toString(i11), str7, (String) null, -1, i28, i21, str11.equals(str7) ? 2 : -1, (List<byte[]>) (bArr != null ? Collections.singletonList(bArr) : null), eVar3, str);
    }

    private static int a(s sVar, int i4, int i9) {
        int c4 = sVar.c();
        while (c4 - i4 < i9) {
            sVar.c(c4);
            int i10 = sVar.i();
            C0544a.a(i10 > 0, "childAtomSize should be positive");
            if (sVar.i() == com.anythink.basead.exoplayer.e.a.a.f7065O) {
                return c4;
            }
            c4 += i10;
        }
        return -1;
    }

    private static k a(s sVar, int i4, int i9, String str) {
        int i10;
        int i11;
        int i12 = i4 + 8;
        while (true) {
            byte[] bArr = null;
            if (i12 - i4 >= i9) {
                return null;
            }
            sVar.c(i12);
            int i13 = sVar.i();
            if (sVar.i() == com.anythink.basead.exoplayer.e.a.a.ad) {
                int a9 = com.anythink.basead.exoplayer.e.a.a.a(sVar.i());
                sVar.d(1);
                if (a9 == 0) {
                    sVar.d(1);
                    i11 = 0;
                    i10 = 0;
                } else {
                    int d2 = sVar.d();
                    i10 = d2 & 15;
                    i11 = (d2 & 240) >> 4;
                }
                boolean z8 = sVar.d() == 1;
                int d3 = sVar.d();
                byte[] bArr2 = new byte[16];
                sVar.a(bArr2, 0, 16);
                if (z8 && d3 == 0) {
                    int d9 = sVar.d();
                    bArr = new byte[d9];
                    sVar.a(bArr, 0, d9);
                }
                return new k(z8, str, d3, bArr2, i11, i10, bArr);
            }
            i12 += i13;
        }
    }

    private static boolean a(long[] jArr, long j9, long j10, long j11) {
        int length = jArr.length - 1;
        return jArr[0] <= j10 && j10 < jArr[af.a(3, 0, length)] && jArr[af.a(jArr.length - 3, 0, length)] < j11 && j11 <= j9;
    }
}
