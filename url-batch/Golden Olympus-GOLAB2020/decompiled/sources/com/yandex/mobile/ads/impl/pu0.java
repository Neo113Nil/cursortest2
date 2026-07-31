package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.util.Base64;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.yandex.mobile.ads.impl.InterfaceC1999ih;
import com.yandex.mobile.ads.impl.InterfaceC2023jh;
import com.yandex.mobile.ads.impl.ou0;
import com.yandex.mobile.ads.impl.sj0;
import com.yandex.mobile.ads.impl.so1;
import com.yandex.mobile.ads.impl.yb0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes3.dex */
public final class pu0 extends uu0 implements nu0 {

    /* renamed from: S0, reason: collision with root package name */
    private static final qu0 f30566S0 = hm1.d();

    /* renamed from: H0, reason: collision with root package name */
    private final Context f30567H0;

    /* renamed from: I0, reason: collision with root package name */
    private final InterfaceC1999ih.a f30568I0;

    /* renamed from: J0, reason: collision with root package name */
    private final InterfaceC2023jh f30569J0;

    /* renamed from: K0, reason: collision with root package name */
    private int f30570K0;

    /* renamed from: L0, reason: collision with root package name */
    private boolean f30571L0;

    /* renamed from: M0, reason: collision with root package name */
    private yb0 f30572M0;

    /* renamed from: N0, reason: collision with root package name */
    private long f30573N0;

    /* renamed from: O0, reason: collision with root package name */
    private boolean f30574O0;

    /* renamed from: P0, reason: collision with root package name */
    private boolean f30575P0;

    /* renamed from: Q0, reason: collision with root package name */
    private boolean f30576Q0;

    /* renamed from: R0, reason: collision with root package name */
    private so1.a f30577R0;

    /* JADX INFO: Access modifiers changed from: private */
    final class a implements InterfaceC2023jh.c {
        public final void a(Exception exc) {
            ms0.a("MediaCodecAudioRenderer", "Audio sink error", exc);
            pu0.this.f30568I0.b(exc);
        }

        public final void b() {
            so1.a aVar = pu0.this.f30577R0;
            if (aVar != null) {
                aVar.a();
            }
        }

        public final void c() {
            pu0.this.f30575P0 = true;
        }

        private a() {
        }

        public final void a() {
            so1.a aVar = pu0.this.f30577R0;
            if (aVar != null) {
                aVar.b();
            }
        }

        public final void a(long j4) {
            pu0.this.f30568I0.b(j4);
        }

        public final void a(boolean z4) {
            pu0.this.f30568I0.b(z4);
        }

        public final void a(int i4, long j4, long j5) {
            pu0.this.f30568I0.b(i4, j4, j5);
        }
    }

    public pu0(Context context, uz uzVar, wu0 wu0Var, Handler handler, InterfaceC1999ih interfaceC1999ih, wy wyVar) {
        super(1, uzVar, wu0Var, 44100.0f);
        this.f30567H0 = context.getApplicationContext();
        this.f30569J0 = wyVar;
        this.f30568I0 = new InterfaceC1999ih.a(handler, interfaceC1999ih);
        wyVar.a(new a());
    }

    @Override // com.yandex.mobile.ads.impl.uu0
    protected final void L() {
        this.f30569J0.g();
    }

    @Override // com.yandex.mobile.ads.impl.uu0
    protected final void O() {
        try {
            this.f30569J0.d();
        } catch (InterfaceC2023jh.e e4) {
            throw a(IronSourceConstants.errorCode_isReadyException, e4.f27651d, e4, e4.f27650c);
        }
    }

    @Override // com.yandex.mobile.ads.impl.uu0
    protected final iy a(su0 su0Var, yb0 yb0Var, yb0 yb0Var2) {
        iy a4 = su0Var.a(yb0Var, yb0Var2);
        int i4 = a4.f27420e;
        if (a(yb0Var2, su0Var) > this.f30570K0) {
            i4 |= 64;
        }
        int i5 = i4;
        return new iy(su0Var.f31947a, yb0Var, yb0Var2, i5 != 0 ? 0 : a4.f27419d, i5);
    }

    @Override // com.yandex.mobile.ads.impl.uu0
    protected final void b(gy gyVar) {
        if (!this.f30574O0 || gyVar.e()) {
            return;
        }
        if (Math.abs(gyVar.f26358f - this.f30573N0) > 500000) {
            this.f30573N0 = gyVar.f26358f;
        }
        this.f30574O0 = false;
    }

    @Override // com.yandex.mobile.ads.impl.uu0, com.yandex.mobile.ads.impl.so1
    public final boolean d() {
        return this.f30569J0.e() || super.d();
    }

    @Override // com.yandex.mobile.ads.impl.so1, com.yandex.mobile.ads.impl.to1
    public final String getName() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.yandex.mobile.ads.impl.nu0
    public final th1 getPlaybackParameters() {
        return this.f30569J0.getPlaybackParameters();
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC1811ak, com.yandex.mobile.ads.impl.so1
    public final nu0 l() {
        return this;
    }

    @Override // com.yandex.mobile.ads.impl.uu0, com.yandex.mobile.ads.impl.AbstractC1811ak
    protected final void u() {
        this.f30576Q0 = true;
        try {
            this.f30569J0.flush();
            try {
                super.u();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.u();
                throw th;
            } finally {
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.uu0, com.yandex.mobile.ads.impl.AbstractC1811ak
    protected final void v() {
        try {
            super.v();
        } finally {
            if (this.f30576Q0) {
                this.f30576Q0 = false;
                this.f30569J0.b();
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC1811ak
    protected final void w() {
        this.f30569J0.play();
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC1811ak
    protected final void x() {
        long a4 = this.f30569J0.a(a());
        if (a4 != Long.MIN_VALUE) {
            if (!this.f30575P0) {
                a4 = Math.max(this.f30573N0, a4);
            }
            this.f30573N0 = a4;
            this.f30575P0 = false;
        }
        this.f30569J0.pause();
    }

    @Override // com.yandex.mobile.ads.impl.nu0
    public final long o() {
        if (getState() == 2) {
            long a4 = this.f30569J0.a(a());
            if (a4 != Long.MIN_VALUE) {
                if (!this.f30575P0) {
                    a4 = Math.max(this.f30573N0, a4);
                }
                this.f30573N0 = a4;
                this.f30575P0 = false;
            }
        }
        return this.f30573N0;
    }

    @Override // com.yandex.mobile.ads.impl.uu0
    protected final boolean b(yb0 yb0Var) {
        return this.f30569J0.a(yb0Var);
    }

    @Override // com.yandex.mobile.ads.impl.uu0
    protected final float a(float f4, yb0[] yb0VarArr) {
        int i4 = -1;
        for (yb0 yb0Var : yb0VarArr) {
            int i5 = yb0Var.f34973A;
            if (i5 != -1) {
                i4 = Math.max(i4, i5);
            }
        }
        if (i4 == -1) {
            return -1.0f;
        }
        return i4 * f4;
    }

    private static sj0 a(wu0 wu0Var, yb0 yb0Var, boolean z4, InterfaceC2023jh interfaceC2023jh) {
        String str = yb0Var.f34991m;
        if (str == null) {
            return sj0.h();
        }
        if (interfaceC2023jh.a(yb0Var)) {
            List<su0> a4 = av0.a("audio/raw", false, false);
            su0 su0Var = a4.isEmpty() ? null : a4.get(0);
            if (su0Var != null) {
                return sj0.a(su0Var);
            }
        }
        List<su0> a5 = wu0Var.a(str, z4, false);
        String a6 = av0.a(yb0Var);
        if (a6 == null) {
            return sj0.a((Collection) a5);
        }
        List<su0> a7 = wu0Var.a(a6, z4, false);
        int i4 = sj0.f31764d;
        return new sj0.a().b((List) a5).b((List) a7).a();
    }

    @Override // com.yandex.mobile.ads.impl.uu0
    protected final ArrayList a(wu0 wu0Var, yb0 yb0Var, boolean z4) {
        return av0.a(a(wu0Var, yb0Var, z4, this.f30569J0), yb0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d5, code lost:
    
        if (r0.a().equals(r7) == false) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0093 A[LOOP:1: B:26:0x008d->B:28:0x0093, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0139  */
    @Override // com.yandex.mobile.ads.impl.uu0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final ou0.a a(su0 su0Var, yb0 yb0Var, MediaCrypto mediaCrypto, float f4) {
        boolean z4;
        MediaFormat mediaFormat;
        List<byte[]> list;
        int i4;
        yb0[] s4 = s();
        int a4 = a(yb0Var, su0Var);
        if (s4.length != 1) {
            for (yb0 yb0Var2 : s4) {
                if (su0Var.a(yb0Var, yb0Var2).f27419d != 0) {
                    a4 = Math.max(a4, a(yb0Var2, su0Var));
                }
            }
        }
        this.f30570K0 = a4;
        String str = su0Var.f31947a;
        int i5 = u82.f32873a;
        if (i5 < 24) {
            qu0 qu0Var = f30566S0;
            if (qu0Var.d().equals(str) && qu0Var.f().equals(u82.f32875c)) {
                String str2 = u82.f32874b;
                if (str2.startsWith(qu0Var.h()) || str2.startsWith(qu0Var.b()) || str2.startsWith(qu0Var.c())) {
                    z4 = true;
                    this.f30571L0 = z4;
                    String str3 = su0Var.f31949c;
                    int i6 = this.f30570K0;
                    mediaFormat = new MediaFormat();
                    mediaFormat.setString("mime", str3);
                    mediaFormat.setInteger("channel-count", yb0Var.f35004z);
                    mediaFormat.setInteger("sample-rate", yb0Var.f34973A);
                    list = yb0Var.f34993o;
                    for (i4 = 0; i4 < list.size(); i4++) {
                        mediaFormat.setByteBuffer(C1877de.a("csd-", i4), ByteBuffer.wrap(list.get(i4)));
                    }
                    qv0.a(mediaFormat, "max-input-size", i6);
                    if (i5 >= 23) {
                        mediaFormat.setInteger("priority", 0);
                        if (f4 != -1.0f) {
                            if (i5 == 23) {
                                qu0 qu0Var2 = f30566S0;
                                String g4 = qu0Var2.g();
                                String str4 = u82.f32876d;
                                if (!g4.equals(str4)) {
                                }
                            }
                            mediaFormat.setFloat("operating-rate", f4);
                        }
                    }
                    if (i5 <= 28 && "audio/ac4".equals(yb0Var.f34991m)) {
                        f30566S0.getClass();
                        byte[] decode = Base64.decode("YWM0LWlzLXN5bmM=", 0);
                        Intrinsics.checkNotNullExpressionValue(decode, "decode(...)");
                        mediaFormat.setInteger(new String(decode, Charsets.UTF_8), 1);
                    }
                    if (i5 >= 24) {
                        if (this.f30569J0.b(new yb0.a().e("audio/raw").c(yb0Var.f35004z).l(yb0Var.f34973A).i(4).a()) == 2) {
                            mediaFormat.setInteger("pcm-encoding", 4);
                        }
                    }
                    if (i5 >= 32) {
                        mediaFormat.setInteger("max-output-channel-count", 99);
                    }
                    this.f30572M0 = ("audio/raw".equals(su0Var.f31948b) || "audio/raw".equals(yb0Var.f34991m)) ? null : yb0Var;
                    return ou0.a.a(su0Var, mediaFormat, yb0Var, mediaCrypto);
                }
            }
        }
        z4 = false;
        this.f30571L0 = z4;
        String str32 = su0Var.f31949c;
        int i62 = this.f30570K0;
        mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str32);
        mediaFormat.setInteger("channel-count", yb0Var.f35004z);
        mediaFormat.setInteger("sample-rate", yb0Var.f34973A);
        list = yb0Var.f34993o;
        while (i4 < list.size()) {
        }
        qv0.a(mediaFormat, "max-input-size", i62);
        if (i5 >= 23) {
        }
        if (i5 <= 28) {
            f30566S0.getClass();
            byte[] decode2 = Base64.decode("YWM0LWlzLXN5bmM=", 0);
            Intrinsics.checkNotNullExpressionValue(decode2, "decode(...)");
            mediaFormat.setInteger(new String(decode2, Charsets.UTF_8), 1);
        }
        if (i5 >= 24) {
        }
        if (i5 >= 32) {
        }
        this.f30572M0 = ("audio/raw".equals(su0Var.f31948b) || "audio/raw".equals(yb0Var.f34991m)) ? null : yb0Var;
        return ou0.a.a(su0Var, mediaFormat, yb0Var, mediaCrypto);
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC1811ak, com.yandex.mobile.ads.impl.fi1.b
    public final void a(int i4, Object obj) {
        if (i4 == 2) {
            this.f30569J0.setVolume(((Float) obj).floatValue());
            return;
        }
        if (i4 == 3) {
            this.f30569J0.a((C1856ch) obj);
            return;
        }
        if (i4 != 6) {
            switch (i4) {
                case 9:
                    this.f30569J0.b(((Boolean) obj).booleanValue());
                    break;
                case 10:
                    this.f30569J0.a(((Integer) obj).intValue());
                    break;
                case 11:
                    this.f30577R0 = (so1.a) obj;
                    break;
            }
            return;
        }
        this.f30569J0.a((C2187qh) obj);
    }

    @Override // com.yandex.mobile.ads.impl.uu0, com.yandex.mobile.ads.impl.AbstractC1811ak, com.yandex.mobile.ads.impl.so1
    public final boolean a() {
        return super.a() && this.f30569J0.a();
    }

    @Override // com.yandex.mobile.ads.impl.uu0
    protected final void a(Exception exc) {
        ms0.a("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.f30568I0.a(exc);
    }

    @Override // com.yandex.mobile.ads.impl.uu0
    protected final void a(String str, long j4, long j5) {
        this.f30568I0.a(str, j4, j5);
    }

    @Override // com.yandex.mobile.ads.impl.uu0
    protected final void a(String str) {
        this.f30568I0.a(str);
    }

    @Override // com.yandex.mobile.ads.impl.uu0, com.yandex.mobile.ads.impl.AbstractC1811ak
    protected final void a(boolean z4, boolean z5) {
        super.a(z4, z5);
        this.f30568I0.b(this.f33287B0);
        if (p().f33221a) {
            this.f30569J0.c();
        } else {
            this.f30569J0.f();
        }
        this.f30569J0.a(r());
    }

    @Override // com.yandex.mobile.ads.impl.uu0
    protected final iy a(zb0 zb0Var) {
        iy a4 = super.a(zb0Var);
        this.f30568I0.a(zb0Var.f35541b, a4);
        return a4;
    }

    @Override // com.yandex.mobile.ads.impl.uu0
    protected final void a(yb0 yb0Var, MediaFormat mediaFormat) {
        int b4;
        int i4;
        yb0 yb0Var2 = this.f30572M0;
        int[] iArr = null;
        if (yb0Var2 != null) {
            yb0Var = yb0Var2;
        } else if (E() != null) {
            if ("audio/raw".equals(yb0Var.f34991m)) {
                b4 = yb0Var.f34974B;
            } else if (u82.f32873a >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                b4 = mediaFormat.getInteger("pcm-encoding");
            } else {
                b4 = mediaFormat.containsKey("v-bits-per-sample") ? u82.b(mediaFormat.getInteger("v-bits-per-sample")) : 2;
            }
            yb0 a4 = new yb0.a().e("audio/raw").i(b4).d(yb0Var.f34975C).e(yb0Var.f34976D).c(mediaFormat.getInteger("channel-count")).l(mediaFormat.getInteger("sample-rate")).a();
            if (this.f30571L0 && a4.f35004z == 6 && (i4 = yb0Var.f35004z) < 6) {
                iArr = new int[i4];
                for (int i5 = 0; i5 < yb0Var.f35004z; i5++) {
                    iArr[i5] = i5;
                }
            }
            yb0Var = a4;
        }
        try {
            this.f30569J0.a(yb0Var, iArr);
        } catch (InterfaceC2023jh.a e4) {
            throw a(e4, e4.f27645b, IronSourceConstants.errorCode_biddingDataException);
        }
    }

    @Override // com.yandex.mobile.ads.impl.uu0, com.yandex.mobile.ads.impl.AbstractC1811ak
    protected final void a(long j4, boolean z4) {
        super.a(j4, z4);
        this.f30569J0.flush();
        this.f30573N0 = j4;
        this.f30574O0 = true;
        this.f30575P0 = true;
    }

    @Override // com.yandex.mobile.ads.impl.uu0
    protected final boolean a(long j4, long j5, ou0 ou0Var, ByteBuffer byteBuffer, int i4, int i5, int i6, long j6, boolean z4, boolean z5, yb0 yb0Var) {
        byteBuffer.getClass();
        if (this.f30572M0 != null && (i5 & 2) != 0) {
            ou0Var.getClass();
            ou0Var.a(false, i4);
            return true;
        }
        if (z4) {
            if (ou0Var != null) {
                ou0Var.a(false, i4);
            }
            this.f33287B0.f25495f += i6;
            this.f30569J0.g();
            return true;
        }
        try {
            if (!this.f30569J0.a(byteBuffer, j6, i6)) {
                return false;
            }
            if (ou0Var != null) {
                ou0Var.a(false, i4);
            }
            this.f33287B0.f25494e += i6;
            return true;
        } catch (InterfaceC2023jh.b e4) {
            throw a(IronSourceConstants.errorCode_biddingDataException, e4.f27648d, e4, e4.f27647c);
        } catch (InterfaceC2023jh.e e5) {
            throw a(IronSourceConstants.errorCode_isReadyException, yb0Var, e5, e5.f27650c);
        }
    }

    @Override // com.yandex.mobile.ads.impl.nu0
    public final void a(th1 th1Var) {
        this.f30569J0.a(th1Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        if ((r4.isEmpty() ? null : r4.get(0)) != null) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.mobile.ads.impl.uu0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final int a(wu0 wu0Var, yb0 yb0Var) {
        boolean z4;
        if (!i01.d(yb0Var.f34991m)) {
            return to1.a(0, 0, 0);
        }
        int i4 = u82.f32873a >= 21 ? 32 : 0;
        int i5 = yb0Var.f34978F;
        boolean z5 = true;
        boolean z6 = i5 != 0;
        boolean z7 = i5 == 0 || i5 == 2;
        int i6 = 8;
        if (z7 && this.f30569J0.a(yb0Var)) {
            if (z6) {
                List<su0> a4 = av0.a("audio/raw", false, false);
            }
            return to1.a(4, 8, i4);
        }
        if ("audio/raw".equals(yb0Var.f34991m) && !this.f30569J0.a(yb0Var)) {
            return to1.a(1, 0, 0);
        }
        if (!this.f30569J0.a(new yb0.a().e("audio/raw").c(yb0Var.f35004z).l(yb0Var.f34973A).i(2).a())) {
            return to1.a(1, 0, 0);
        }
        sj0 a5 = a(wu0Var, yb0Var, false, this.f30569J0);
        if (a5.isEmpty()) {
            return to1.a(1, 0, 0);
        }
        if (!z7) {
            return to1.a(2, 0, 0);
        }
        su0 su0Var = (su0) a5.get(0);
        boolean a6 = su0Var.a(yb0Var);
        if (!a6) {
            for (int i7 = 1; i7 < a5.size(); i7++) {
                su0 su0Var2 = (su0) a5.get(i7);
                if (su0Var2.a(yb0Var)) {
                    z4 = false;
                    su0Var = su0Var2;
                    break;
                }
            }
        }
        z4 = true;
        z5 = a6;
        int i8 = z5 ? 4 : 3;
        if (z5 && su0Var.b(yb0Var)) {
            i6 = 16;
        }
        return i8 | i6 | i4 | (su0Var.f31953g ? 64 : 0) | (z4 ? UserVerificationMethods.USER_VERIFY_PATTERN : 0);
    }

    private int a(yb0 yb0Var, su0 su0Var) {
        int i4;
        if (!f30566S0.e().equals(su0Var.f31947a) || (i4 = u82.f32873a) >= 24 || (i4 == 23 && u82.d(this.f30567H0))) {
            return yb0Var.f34992n;
        }
        return -1;
    }
}
