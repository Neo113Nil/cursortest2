package com.anythink.basead.exoplayer.b;

import android.content.Context;
import android.content.pm.PackageManager;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.view.Surface;
import com.anythink.basead.exoplayer.b.g;
import com.anythink.basead.exoplayer.b.h;
import com.anythink.basead.exoplayer.k.af;
import com.anythink.basead.exoplayer.v;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class o extends com.anythink.basead.exoplayer.f.b implements com.anythink.basead.exoplayer.k.n {

    /* renamed from: A, reason: collision with root package name */
    private int f6754A;

    /* renamed from: B, reason: collision with root package name */
    private int f6755B;

    /* renamed from: C, reason: collision with root package name */
    private long f6756C;

    /* renamed from: D, reason: collision with root package name */
    private boolean f6757D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f6758E;

    /* renamed from: r, reason: collision with root package name */
    private final Context f6759r;

    /* renamed from: s, reason: collision with root package name */
    private final g.a f6760s;

    /* renamed from: t, reason: collision with root package name */
    private final h f6761t;

    /* renamed from: u, reason: collision with root package name */
    private int f6762u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f6763v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f6764w;

    /* renamed from: x, reason: collision with root package name */
    private MediaFormat f6765x;

    /* renamed from: y, reason: collision with root package name */
    private int f6766y;

    /* renamed from: z, reason: collision with root package name */
    private int f6767z;

    public final class a implements h.c {
        private a() {
        }

        @Override // com.anythink.basead.exoplayer.b.h.c
        public final void a(int i) {
            o.this.f6760s.a(i);
        }

        public /* synthetic */ a(o oVar, byte b9) {
            this();
        }

        @Override // com.anythink.basead.exoplayer.b.h.c
        public final void a() {
            o.b(o.this);
        }

        @Override // com.anythink.basead.exoplayer.b.h.c
        public final void a(int i, long j9, long j10) {
            o.this.f6760s.a(i, j9, j10);
        }
    }

    private o(Context context, com.anythink.basead.exoplayer.f.c cVar) {
        this(context, cVar, null);
    }

    private static void C() {
    }

    private static void D() {
    }

    private static void E() {
    }

    private void F() {
        long a9 = this.f6761t.a(v());
        if (a9 != Long.MIN_VALUE) {
            if (!this.f6758E) {
                a9 = Math.max(this.f6756C, a9);
            }
            this.f6756C = a9;
            this.f6758E = false;
        }
    }

    public static /* synthetic */ boolean b(o oVar) {
        oVar.f6758E = true;
        return true;
    }

    @Override // com.anythink.basead.exoplayer.f.b
    public final int a(com.anythink.basead.exoplayer.f.a aVar, com.anythink.basead.exoplayer.m mVar, com.anythink.basead.exoplayer.m mVar2) {
        return 0;
    }

    @Override // com.anythink.basead.exoplayer.a, com.anythink.basead.exoplayer.y
    public final com.anythink.basead.exoplayer.k.n c() {
        return this;
    }

    @Override // com.anythink.basead.exoplayer.k.n
    public final long d() {
        if (a_() == 2) {
            F();
        }
        return this.f6756C;
    }

    @Override // com.anythink.basead.exoplayer.k.n
    public final v e() {
        return this.f6761t.f();
    }

    @Override // com.anythink.basead.exoplayer.f.b, com.anythink.basead.exoplayer.a
    public final void n() {
        super.n();
        this.f6761t.a();
    }

    @Override // com.anythink.basead.exoplayer.f.b, com.anythink.basead.exoplayer.a
    public final void o() {
        F();
        this.f6761t.h();
        super.o();
    }

    @Override // com.anythink.basead.exoplayer.f.b, com.anythink.basead.exoplayer.a
    public final void p() {
        try {
            this.f6761t.j();
            try {
                super.p();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.p();
                throw th;
            } finally {
            }
        }
    }

    @Override // com.anythink.basead.exoplayer.f.b, com.anythink.basead.exoplayer.y
    public final boolean u() {
        return this.f6761t.e() || super.u();
    }

    @Override // com.anythink.basead.exoplayer.f.b, com.anythink.basead.exoplayer.y
    public final boolean v() {
        return super.v() && this.f6761t.d();
    }

    @Override // com.anythink.basead.exoplayer.f.b
    public final void w() {
        try {
            this.f6761t.c();
        } catch (h.d e6) {
            throw com.anythink.basead.exoplayer.g.a(e6, s());
        }
    }

    private o(Context context, com.anythink.basead.exoplayer.f.c cVar, com.anythink.basead.exoplayer.d.g<com.anythink.basead.exoplayer.d.k> gVar) {
        this(context, cVar, gVar, null, null);
    }

    @Override // com.anythink.basead.exoplayer.f.b
    public final void b(com.anythink.basead.exoplayer.m mVar) {
        super.b(mVar);
        this.f6760s.a(mVar);
        this.f6766y = com.anythink.basead.exoplayer.k.o.f8622w.equals(mVar.f8822h) ? mVar.f8836w : 2;
        this.f6767z = mVar.f8834u;
        this.f6754A = mVar.f8837x;
        this.f6755B = mVar.f8838y;
    }

    private o(Context context, com.anythink.basead.exoplayer.f.c cVar, Handler handler, g gVar) {
        this(context, cVar, null, handler, gVar);
    }

    @Override // com.anythink.basead.exoplayer.f.b
    public final int a(com.anythink.basead.exoplayer.f.c cVar, com.anythink.basead.exoplayer.d.g<com.anythink.basead.exoplayer.d.k> gVar, com.anythink.basead.exoplayer.m mVar) {
        boolean z8;
        int i;
        int i4;
        String str = mVar.f8822h;
        if (!com.anythink.basead.exoplayer.k.o.a(str)) {
            return 0;
        }
        int i9 = af.f8503a >= 21 ? 32 : 0;
        boolean a9 = com.anythink.basead.exoplayer.a.a(gVar, mVar.f8824k);
        if (a9 && a(str) && cVar.a() != null) {
            return i9 | 12;
        }
        if ((com.anythink.basead.exoplayer.k.o.f8622w.equals(str) && !this.f6761t.a(mVar.f8836w)) || !this.f6761t.a(2)) {
            return 1;
        }
        com.anythink.basead.exoplayer.d.e eVar = mVar.f8824k;
        if (eVar != null) {
            z8 = false;
            for (int i10 = 0; i10 < eVar.f7002b; i10++) {
                z8 |= eVar.a(i10).f7008d;
            }
        } else {
            z8 = false;
        }
        com.anythink.basead.exoplayer.f.a a10 = cVar.a(str, z8);
        if (a10 == null) {
            return (!z8 || cVar.a(str, false) == null) ? 1 : 2;
        }
        if (a9) {
            return ((af.f8503a < 21 || (((i = mVar.f8835v) == -1 || a10.a(i)) && ((i4 = mVar.f8834u) == -1 || a10.b(i4)))) ? 4 : 3) | i9 | 8;
        }
        return 2;
    }

    private o(Context context, com.anythink.basead.exoplayer.f.c cVar, com.anythink.basead.exoplayer.d.g<com.anythink.basead.exoplayer.d.k> gVar, Handler handler, g gVar2) {
        this(context, cVar, gVar, handler, gVar2, null, new f[0]);
    }

    public o(Context context, com.anythink.basead.exoplayer.f.c cVar, com.anythink.basead.exoplayer.d.g<com.anythink.basead.exoplayer.d.k> gVar, Handler handler, g gVar2, c cVar2, f... fVarArr) {
        this(context, cVar, gVar, handler, gVar2, new l(cVar2, fVarArr));
    }

    private o(Context context, com.anythink.basead.exoplayer.f.c cVar, com.anythink.basead.exoplayer.d.g<com.anythink.basead.exoplayer.d.k> gVar, Handler handler, g gVar2, h hVar) {
        super(1, cVar, gVar, false);
        this.f6759r = context.getApplicationContext();
        this.f6761t = hVar;
        this.f6760s = new g.a(handler, gVar2);
        hVar.a(new a(this, (byte) 0));
    }

    private int b(com.anythink.basead.exoplayer.f.a aVar, com.anythink.basead.exoplayer.m mVar) {
        PackageManager packageManager;
        int i = af.f8503a;
        if (i >= 24 || !"OMX.google.raw.decoder".equals(aVar.f7355c) || (i == 23 && (packageManager = this.f6759r.getPackageManager()) != null && packageManager.hasSystemFeature("android.software.leanback"))) {
            return mVar.i;
        }
        return -1;
    }

    private static boolean b(String str) {
        if (af.f8503a >= 24 || !"OMX.SEC.aac.dec".equals(str) || !"samsung".equals(af.f8505c)) {
            return false;
        }
        String str2 = af.f8504b;
        return str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte");
    }

    @Override // com.anythink.basead.exoplayer.f.b
    public final com.anythink.basead.exoplayer.f.a a(com.anythink.basead.exoplayer.f.c cVar, com.anythink.basead.exoplayer.m mVar, boolean z8) {
        com.anythink.basead.exoplayer.f.a a9;
        return (!a(mVar.f8822h) || (a9 = cVar.a()) == null) ? super.a(cVar, mVar, z8) : a9;
    }

    private boolean a(String str) {
        int e6 = com.anythink.basead.exoplayer.k.o.e(str);
        return e6 != 0 && this.f6761t.a(e6);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a9  */
    @Override // com.anythink.basead.exoplayer.f.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(com.anythink.basead.exoplayer.f.a aVar, MediaCodec mediaCodec, com.anythink.basead.exoplayer.m mVar, MediaCrypto mediaCrypto) {
        boolean z8;
        String str;
        PackageManager packageManager;
        q();
        int i = af.f8503a;
        this.f6762u = (i >= 24 || !"OMX.google.raw.decoder".equals(aVar.f7355c) || (i == 23 && (packageManager = this.f6759r.getPackageManager()) != null && packageManager.hasSystemFeature("android.software.leanback"))) ? mVar.i : -1;
        String str2 = aVar.f7355c;
        if (i < 24 && "OMX.SEC.aac.dec".equals(str2) && "samsung".equals(af.f8505c)) {
            String str3 = af.f8504b;
            if (str3.startsWith("zeroflte") || str3.startsWith("herolte") || str3.startsWith("heroqlte")) {
                z8 = true;
                this.f6764w = z8;
                this.f6763v = aVar.i;
                str = aVar.f7356d;
                if (str == null) {
                    str = com.anythink.basead.exoplayer.k.o.f8622w;
                }
                int i4 = this.f6762u;
                MediaFormat mediaFormat = new MediaFormat();
                mediaFormat.setString("mime", str);
                mediaFormat.setInteger("channel-count", mVar.f8834u);
                mediaFormat.setInteger("sample-rate", mVar.f8835v);
                com.anythink.basead.exoplayer.f.e.a(mediaFormat, mVar.f8823j);
                com.anythink.basead.exoplayer.f.e.a(mediaFormat, "max-input-size", i4);
                if (i >= 23) {
                    mediaFormat.setInteger("priority", 0);
                }
                mediaCodec.configure(mediaFormat, (Surface) null, mediaCrypto, 0);
                if (!this.f6763v) {
                    this.f6765x = mediaFormat;
                    mediaFormat.setString("mime", mVar.f8822h);
                    return;
                } else {
                    this.f6765x = null;
                    return;
                }
            }
        }
        z8 = false;
        this.f6764w = z8;
        this.f6763v = aVar.i;
        str = aVar.f7356d;
        if (str == null) {
        }
        int i42 = this.f6762u;
        MediaFormat mediaFormat2 = new MediaFormat();
        mediaFormat2.setString("mime", str);
        mediaFormat2.setInteger("channel-count", mVar.f8834u);
        mediaFormat2.setInteger("sample-rate", mVar.f8835v);
        com.anythink.basead.exoplayer.f.e.a(mediaFormat2, mVar.f8823j);
        com.anythink.basead.exoplayer.f.e.a(mediaFormat2, "max-input-size", i42);
        if (i >= 23) {
        }
        mediaCodec.configure(mediaFormat2, (Surface) null, mediaCrypto, 0);
        if (!this.f6763v) {
        }
    }

    @Override // com.anythink.basead.exoplayer.f.b
    public final void a(String str, long j9, long j10) {
        this.f6760s.a(str, j9, j10);
    }

    @Override // com.anythink.basead.exoplayer.f.b
    public final void a(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int i;
        int[] iArr;
        int i4;
        MediaFormat mediaFormat2 = this.f6765x;
        if (mediaFormat2 != null) {
            i = com.anythink.basead.exoplayer.k.o.e(mediaFormat2.getString("mime"));
            mediaFormat = this.f6765x;
        } else {
            i = this.f6766y;
        }
        int i9 = i;
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("sample-rate");
        if (this.f6764w && integer == 6 && (i4 = this.f6767z) < 6) {
            iArr = new int[i4];
            for (int i10 = 0; i10 < this.f6767z; i10++) {
                iArr[i10] = i10;
            }
        } else {
            iArr = null;
        }
        try {
            this.f6761t.a(i9, integer, integer2, iArr, this.f6754A, this.f6755B);
        } catch (h.a e6) {
            throw com.anythink.basead.exoplayer.g.a(e6, s());
        }
    }

    @Override // com.anythink.basead.exoplayer.f.b, com.anythink.basead.exoplayer.a
    public final void a(boolean z8) {
        super.a(z8);
        this.f6760s.a(((com.anythink.basead.exoplayer.f.b) this).f7397q);
        int i = r().f6467b;
        if (i != 0) {
            this.f6761t.c(i);
        } else {
            this.f6761t.g();
        }
    }

    @Override // com.anythink.basead.exoplayer.f.b, com.anythink.basead.exoplayer.a
    public final void a(long j9, boolean z8) {
        super.a(j9, z8);
        this.f6761t.i();
        this.f6756C = j9;
        this.f6757D = true;
        this.f6758E = true;
    }

    @Override // com.anythink.basead.exoplayer.k.n
    public final v a(v vVar) {
        return this.f6761t.a(vVar);
    }

    @Override // com.anythink.basead.exoplayer.f.b
    public final void a(com.anythink.basead.exoplayer.c.e eVar) {
        if (!this.f6757D || eVar.b()) {
            return;
        }
        if (Math.abs(eVar.f6900f - this.f6756C) > 500000) {
            this.f6756C = eVar.f6900f;
        }
        this.f6757D = false;
    }

    @Override // com.anythink.basead.exoplayer.f.b
    public final boolean a(long j9, long j10, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i4, long j11, boolean z8) {
        if (this.f6763v && (i4 & 2) != 0) {
            mediaCodec.releaseOutputBuffer(i, false);
            return true;
        }
        if (z8) {
            mediaCodec.releaseOutputBuffer(i, false);
            ((com.anythink.basead.exoplayer.f.b) this).f7397q.f6892f++;
            this.f6761t.b();
            return true;
        }
        try {
            if (!this.f6761t.a(byteBuffer, j11)) {
                return false;
            }
            mediaCodec.releaseOutputBuffer(i, false);
            ((com.anythink.basead.exoplayer.f.b) this).f7397q.f6891e++;
            return true;
        } catch (h.b | h.d e6) {
            throw com.anythink.basead.exoplayer.g.a(e6, s());
        }
    }

    @Override // com.anythink.basead.exoplayer.a, com.anythink.basead.exoplayer.x.b
    public final void a(int i, Object obj) {
        if (i == 2) {
            this.f6761t.a(((Float) obj).floatValue());
        } else if (i != 3) {
            super.a(i, obj);
        } else {
            this.f6761t.a((b) obj);
        }
    }

    private static MediaFormat a(com.anythink.basead.exoplayer.m mVar, String str, int i) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", mVar.f8834u);
        mediaFormat.setInteger("sample-rate", mVar.f8835v);
        com.anythink.basead.exoplayer.f.e.a(mediaFormat, mVar.f8823j);
        com.anythink.basead.exoplayer.f.e.a(mediaFormat, "max-input-size", i);
        if (af.f8503a >= 23) {
            mediaFormat.setInteger("priority", 0);
        }
        return mediaFormat;
    }

    private static boolean a(com.anythink.basead.exoplayer.m mVar, com.anythink.basead.exoplayer.m mVar2) {
        return mVar.f8822h.equals(mVar2.f8822h) && mVar.f8834u == mVar2.f8834u && mVar.f8835v == mVar2.f8835v && mVar.f8837x == 0 && mVar.f8838y == 0 && mVar2.f8837x == 0 && mVar2.f8838y == 0 && mVar.b(mVar2);
    }

    private int a(com.anythink.basead.exoplayer.f.a aVar, com.anythink.basead.exoplayer.m mVar) {
        PackageManager packageManager;
        int i = af.f8503a;
        if (i >= 24 || !"OMX.google.raw.decoder".equals(aVar.f7355c) || (i == 23 && (packageManager = this.f6759r.getPackageManager()) != null && packageManager.hasSystemFeature("android.software.leanback"))) {
            return mVar.i;
        }
        return -1;
    }
}
