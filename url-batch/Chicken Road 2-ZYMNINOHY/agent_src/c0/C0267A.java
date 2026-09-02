package c0;

import T.C0086d;
import T.C0097o;
import a.AbstractC0124a;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import com.google.android.gms.internal.play_billing.AbstractC0347t0;
import java.math.RoundingMode;
import java.util.Objects;
import y0.AbstractC1569a;

/* renamed from: c0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0267A {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5398a;

    /* renamed from: b, reason: collision with root package name */
    public final J f5399b;

    /* renamed from: c, reason: collision with root package name */
    public final l2.e f5400c;

    /* renamed from: d, reason: collision with root package name */
    public final t1.h f5401d;

    /* renamed from: e, reason: collision with root package name */
    public W.n f5402e;

    /* renamed from: f, reason: collision with root package name */
    public W.D f5403f;

    /* renamed from: g, reason: collision with root package name */
    public C0270c f5404g;

    /* renamed from: h, reason: collision with root package name */
    public O2.d f5405h;

    /* renamed from: i, reason: collision with root package name */
    public Looper f5406i;

    /* renamed from: j, reason: collision with root package name */
    public Context f5407j;

    public C0267A(G1.c cVar) {
        Context context = (Context) cVar.f835b;
        this.f5398a = context;
        l2.e eVar = (l2.e) cVar.f836c;
        eVar.getClass();
        this.f5400c = eVar;
        this.f5399b = (J) cVar.f837d;
        this.f5404g = (C0270c) cVar.f838e;
        this.f5401d = context == null ? null : new t1.h(27, this);
        this.f5403f = W.D.f3254a;
    }

    public final z a(C0281n c0281n) {
        Context context;
        Context context2;
        Context createDeviceContext;
        int deviceId;
        try {
            int i4 = c0281n.f5591h;
            int i5 = c0281n.f5592i;
            if (i5 == -1 || (context2 = this.f5398a) == null || Build.VERSION.SDK_INT < 34) {
                context = null;
            } else {
                Context context3 = this.f5407j;
                if (context3 != null) {
                    deviceId = context3.getDeviceId();
                    if (deviceId != i5) {
                    }
                    context = this.f5407j;
                    i4 = 0;
                }
                createDeviceContext = context2.createDeviceContext(i5);
                this.f5407j = createDeviceContext;
                context = this.f5407j;
                i4 = 0;
            }
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(c0281n.f5587d ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : c0281n.f5590g.a()).setAudioFormat(new AudioFormat.Builder().setSampleRate(c0281n.f5585b).setChannelMask(c0281n.f5586c).setEncoding(c0281n.f5584a).build()).setTransferMode(1).setBufferSizeInBytes(c0281n.f5589f).setSessionId(i4);
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 29) {
                sessionId.setOffloadedPlayback(c0281n.f5588e);
            }
            if (i6 >= 34 && context != null) {
                sessionId.setContext(context);
            }
            AudioTrack build = sessionId.build();
            if (build.getState() == 1) {
                return new z(build, c0281n, this.f5401d, this.f5403f);
            }
            try {
                build.release();
            } catch (Exception unused) {
            }
            throw new C0279l();
        } catch (IllegalArgumentException e4) {
            e = e4;
            throw new C0279l(e);
        } catch (UnsupportedOperationException e5) {
            e = e5;
            throw new C0279l(e);
        }
    }

    public final C0278k b(C0276i c0276i) {
        e(c0276i);
        C0097o c0097o = c0276i.f5557a;
        C0086d c0086d = c0276i.f5558b;
        C0273f q4 = this.f5400c.q(c0097o, c0086d);
        C0277j c0277j = new C0277j();
        String str = c0097o.n;
        int i4 = c0097o.f2848H;
        int i5 = 0;
        if (!Objects.equals(str, "audio/raw") ? this.f5404g.d(c0097o, c0086d) != null : i4 == 2) {
            i5 = 2;
        }
        c0277j.f5568d = i5;
        c0277j.f5565a = q4.f5552a;
        c0277j.f5566b = q4.f5553b;
        c0277j.f5567c = q4.f5554c;
        return c0277j.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0281n c(C0276i c0276i) {
        int intValue;
        boolean z;
        int i4;
        boolean z4;
        boolean z5;
        boolean z6;
        int i5;
        int i6;
        boolean z7;
        boolean z8;
        int i7;
        int j4;
        int m4;
        C0097o c0097o = c0276i.f5557a;
        boolean z9 = c0276i.f5560d;
        C0086d c0086d = c0276i.f5558b;
        e(c0276i);
        String str = c0097o.n;
        int i8 = c0097o.f2847G;
        int i9 = c0097o.f2848H;
        int i10 = c0097o.f2846F;
        if (Objects.equals(str, "audio/raw")) {
            AbstractC0124a.h(W.J.H(i9));
            intValue = W.J.r(i10);
            i4 = W.J.s(i9) * i10;
            z4 = false;
            z = false;
        } else {
            C0273f q4 = z9 ? this.f5400c.q(c0097o, c0086d) : C0273f.f5551d;
            if (z9 && q4.f5552a) {
                str.getClass();
                int c4 = T.F.c(str, c0097o.f2866k);
                int r4 = W.J.r(i10);
                boolean z10 = q4.f5553b;
                i9 = c4;
                intValue = r4;
                z4 = z10;
                i4 = -1;
                z5 = 1;
                z6 = true;
                i5 = c0097o.f2865j;
                if (Objects.equals(str, "audio/vnd.dts.hd;profile=lbr") && i5 == -1) {
                    i5 = 768000;
                }
                i6 = c0276i.f5564h;
                if (i6 == -1) {
                    z7 = true;
                    z8 = z5;
                } else {
                    int minBufferSize = AudioTrack.getMinBufferSize(i8, intValue, i9);
                    AbstractC0124a.t(minBufferSize != -2);
                    if (i4 == -1) {
                        i4 = 1;
                    }
                    double d4 = z6 ? 8.0d : 1.0d;
                    this.f5399b.getClass();
                    if (z5 != 0) {
                        if (z5 == 1) {
                            z7 = true;
                            int m5 = AbstractC1569a.m(i9);
                            AbstractC0124a.t(m5 != -2147483647);
                            j4 = O3.d.g((50000000 * m5) / 1000000);
                        } else {
                            if (z5 != 2) {
                                throw new IllegalArgumentException();
                            }
                            z7 = true;
                            int i11 = i9 == 5 ? 500000 : i9 == 8 ? 1000000 : 250000;
                            if (i5 != -1) {
                                RoundingMode roundingMode = RoundingMode.CEILING;
                                m4 = AbstractC0124a.v(i5, 8);
                            } else {
                                m4 = AbstractC1569a.m(i9);
                                AbstractC0124a.t(m4 != -2147483647);
                            }
                            j4 = O3.d.g((i11 * m4) / 1000000);
                        }
                        i7 = i4;
                        z8 = z5;
                    } else {
                        z7 = true;
                        z8 = z5;
                        long j5 = i8;
                        long j6 = i4;
                        i7 = i4;
                        j4 = W.J.j(minBufferSize * 4, O3.d.g(((250000 * j5) * j6) / 1000000), O3.d.g(((750000 * j5) * j6) / 1000000));
                    }
                    i6 = (((Math.max(minBufferSize, (int) (j4 * d4)) + i7) - 1) / i7) * i7;
                }
                C0280m c0280m = new C0280m();
                C0086d c0086d2 = C0086d.f2771c;
                c0280m.f5581i = -1;
                c0280m.f5574b = i8;
                c0280m.f5575c = intValue;
                c0280m.f5573a = i9;
                c0280m.f5578f = i6;
                c0280m.f5580h = c0276i.f5561e;
                c0280m.f5579g = c0086d;
                boolean z11 = z7;
                c0280m.f5577e = z8 != z11 ? z11 : false;
                c0280m.f5576d = c0276i.f5563g;
                c0280m.f5582j = z6;
                c0280m.f5583k = z4;
                c0280m.f5581i = c0276i.f5562f;
                return new C0281n(c0280m);
            }
            Pair d5 = this.f5404g.d(c0097o, c0086d);
            if (d5 == null) {
                String str2 = "Unable to configure passthrough for: " + c0097o;
                str2.getClass();
                throw new C0275h(str2);
            }
            i9 = ((Integer) d5.first).intValue();
            intValue = ((Integer) d5.second).intValue();
            z = 2;
            i4 = -1;
            z4 = false;
        }
        z6 = false;
        z5 = z;
        i5 = c0097o.f2865j;
        if (Objects.equals(str, "audio/vnd.dts.hd;profile=lbr")) {
            i5 = 768000;
        }
        i6 = c0276i.f5564h;
        if (i6 == -1) {
        }
        C0280m c0280m2 = new C0280m();
        C0086d c0086d22 = C0086d.f2771c;
        c0280m2.f5581i = -1;
        c0280m2.f5574b = i8;
        c0280m2.f5575c = intValue;
        c0280m2.f5573a = i9;
        c0280m2.f5578f = i6;
        c0280m2.f5580h = c0276i.f5561e;
        c0280m2.f5579g = c0086d;
        boolean z112 = z7;
        c0280m2.f5577e = z8 != z112 ? z112 : false;
        c0280m2.f5576d = c0276i.f5563g;
        c0280m2.f5582j = z6;
        c0280m2.f5583k = z4;
        c0280m2.f5581i = c0276i.f5562f;
        return new C0281n(c0280m2);
    }

    public final void d() {
        W.n nVar = this.f5402e;
        if (nVar != null) {
            nVar.d();
        }
        O2.d dVar = this.f5405h;
        if (dVar != null) {
            Context context = (Context) dVar.f2047b;
            if (dVar.f2046a) {
                dVar.f2053h = null;
                U.i.j(context).unregisterAudioDeviceCallback((C0271d) dVar.f2050e);
                context.unregisterReceiver((W.r) dVar.f2051f);
                C0272e c0272e = (C0272e) dVar.f2052g;
                if (c0272e != null) {
                    c0272e.f5548a.unregisterContentObserver(c0272e);
                }
                dVar.f2046a = false;
            }
        }
    }

    public final void e(C0276i c0276i) {
        Context context;
        C0270c c4;
        AudioDeviceInfo audioDeviceInfo = c0276i.f5559c;
        C0086d c0086d = c0276i.f5558b;
        f();
        O2.d dVar = this.f5405h;
        if (dVar == null && (context = this.f5398a) != null) {
            O2.d dVar2 = new O2.d(context, new D0.a(22, this), c0086d, audioDeviceInfo);
            this.f5405h = dVar2;
            Handler handler = (Handler) dVar2.f2049d;
            Context context2 = (Context) dVar2.f2047b;
            if (dVar2.f2046a) {
                c4 = (C0270c) dVar2.f2053h;
                c4.getClass();
            } else {
                dVar2.f2046a = true;
                C0272e c0272e = (C0272e) dVar2.f2052g;
                if (c0272e != null) {
                    c0272e.f5548a.registerContentObserver(c0272e.f5549b, false, c0272e);
                }
                U.i.j(context2).registerAudioDeviceCallback((C0271d) dVar2.f2050e, handler);
                c4 = C0270c.c(context2, context2.registerReceiver((W.r) dVar2.f2051f, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), (C0086d) dVar2.f2055j, (AudioDeviceInfo) dVar2.f2054i);
                dVar2.f2053h = c4;
            }
            this.f5404g = c4;
        } else if (dVar != null) {
            if (audioDeviceInfo != null && !audioDeviceInfo.equals((AudioDeviceInfo) dVar.f2054i)) {
                dVar.f2054i = audioDeviceInfo;
                dVar.a(C0270c.b((Context) dVar.f2047b, (C0086d) dVar.f2055j, audioDeviceInfo));
            }
            O2.d dVar3 = this.f5405h;
            if (!Objects.equals(c0086d, (C0086d) dVar3.f2055j)) {
                dVar3.f2055j = c0086d;
                dVar3.a(C0270c.b((Context) dVar3.f2047b, c0086d, (AudioDeviceInfo) dVar3.f2054i));
            }
        }
        this.f5404g.getClass();
    }

    public final void f() {
        if (this.f5398a == null) {
            return;
        }
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f5406i;
        boolean z = looper == null || looper == myLooper;
        String name = looper == null ? "null" : looper.getThread().getName();
        String name2 = myLooper != null ? myLooper.getThread().getName() : "null";
        if (!z) {
            throw new IllegalStateException(AbstractC0347t0.n("AudioTrackAudioOutputProvider accessed on multiple threads: %s and %s", name, name2));
        }
        this.f5406i = myLooper;
    }
}
