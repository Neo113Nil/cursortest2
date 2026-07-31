package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.support.api.entity.auth.AuthCode;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.yandex.mobile.ads.impl.InterfaceC1852cd;
import com.yandex.mobile.ads.impl.InterfaceC2023jh;
import com.yandex.mobile.ads.impl.dw0;
import com.yandex.mobile.ads.impl.hz;
import com.yandex.mobile.ads.impl.o72;
import com.yandex.mobile.ads.impl.q62;
import com.yandex.mobile.ads.impl.rv0;
import com.yandex.mobile.ads.impl.uu0;
import com.yandex.mobile.ads.impl.v30;
import com.yandex.mobile.ads.impl.wa0;
import com.yandex.mobile.ads.impl.x42;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class vv0 implements InterfaceC1852cd, wh1 {

    /* renamed from: A, reason: collision with root package name */
    private boolean f33774A;

    /* renamed from: a, reason: collision with root package name */
    private final Context f33775a;

    /* renamed from: b, reason: collision with root package name */
    private final zz f33776b;

    /* renamed from: c, reason: collision with root package name */
    private final PlaybackSession f33777c;

    /* renamed from: i, reason: collision with root package name */
    private String f33783i;

    /* renamed from: j, reason: collision with root package name */
    private PlaybackMetrics.Builder f33784j;

    /* renamed from: k, reason: collision with root package name */
    private int f33785k;

    /* renamed from: n, reason: collision with root package name */
    private qh1 f33788n;

    /* renamed from: o, reason: collision with root package name */
    private b f33789o;

    /* renamed from: p, reason: collision with root package name */
    private b f33790p;

    /* renamed from: q, reason: collision with root package name */
    private b f33791q;

    /* renamed from: r, reason: collision with root package name */
    private yb0 f33792r;

    /* renamed from: s, reason: collision with root package name */
    private yb0 f33793s;

    /* renamed from: t, reason: collision with root package name */
    private yb0 f33794t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f33795u;

    /* renamed from: v, reason: collision with root package name */
    private int f33796v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f33797w;

    /* renamed from: x, reason: collision with root package name */
    private int f33798x;

    /* renamed from: y, reason: collision with root package name */
    private int f33799y;

    /* renamed from: z, reason: collision with root package name */
    private int f33800z;

    /* renamed from: e, reason: collision with root package name */
    private final x42.d f33779e = new x42.d();

    /* renamed from: f, reason: collision with root package name */
    private final x42.b f33780f = new x42.b();

    /* renamed from: h, reason: collision with root package name */
    private final HashMap<String, Long> f33782h = new HashMap<>();

    /* renamed from: g, reason: collision with root package name */
    private final HashMap<String, Long> f33781g = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private final long f33778d = SystemClock.elapsedRealtime();

    /* renamed from: l, reason: collision with root package name */
    private int f33786l = 0;

    /* renamed from: m, reason: collision with root package name */
    private int f33787m = 0;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f33801a;

        /* renamed from: b, reason: collision with root package name */
        public final int f33802b;

        public a(int i4, int i5) {
            this.f33801a = i4;
            this.f33802b = i5;
        }
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final yb0 f33803a;

        /* renamed from: b, reason: collision with root package name */
        public final int f33804b;

        /* renamed from: c, reason: collision with root package name */
        public final String f33805c;

        public b(yb0 yb0Var, int i4, String str) {
            this.f33803a = yb0Var;
            this.f33804b = i4;
            this.f33805c = str;
        }
    }

    private vv0(Context context, PlaybackSession playbackSession) {
        this.f33775a = context.getApplicationContext();
        this.f33777c = playbackSession;
        zz zzVar = new zz();
        this.f33776b = zzVar;
        zzVar.a(this);
    }

    public static vv0 a(Context context) {
        PlaybackSession createPlaybackSession;
        MediaMetricsManager a4 = Qi.a(context.getSystemService("media_metrics"));
        if (a4 == null) {
            return null;
        }
        createPlaybackSession = a4.createPlaybackSession();
        return new vv0(context, createPlaybackSession);
    }

    public final LogSessionId b() {
        LogSessionId sessionId;
        sessionId = this.f33777c.getSessionId();
        return sessionId;
    }

    public final void b(InterfaceC1852cd.a aVar, String str) {
        dw0.b bVar = aVar.f24175d;
        if ((bVar == null || !bVar.a()) && str.equals(this.f33783i)) {
            a();
        }
        this.f33781g.remove(str);
        this.f33782h.remove(str);
    }

    private void a() {
        PlaybackMetrics build;
        PlaybackMetrics.Builder builder = this.f33784j;
        if (builder != null && this.f33774A) {
            builder.setAudioUnderrunCount(this.f33800z);
            this.f33784j.setVideoFramesDropped(this.f33798x);
            this.f33784j.setVideoFramesPlayed(this.f33799y);
            Long l4 = this.f33781g.get(this.f33783i);
            this.f33784j.setNetworkTransferDurationMillis(l4 == null ? 0L : l4.longValue());
            Long l5 = this.f33782h.get(this.f33783i);
            this.f33784j.setNetworkBytesRead(l5 == null ? 0L : l5.longValue());
            this.f33784j.setStreamSource((l5 == null || l5.longValue() <= 0) ? 0 : 1);
            PlaybackSession playbackSession = this.f33777c;
            build = this.f33784j.build();
            playbackSession.reportPlaybackMetrics(build);
        }
        this.f33784j = null;
        this.f33783i = null;
        this.f33800z = 0;
        this.f33798x = 0;
        this.f33799y = 0;
        this.f33792r = null;
        this.f33793s = null;
        this.f33794t = null;
        this.f33774A = false;
    }

    private void a(x42 x42Var, dw0.b bVar) {
        int a4;
        PlaybackMetrics.Builder builder = this.f33784j;
        if (bVar == null || (a4 = x42Var.a(bVar.f35792a)) == -1) {
            return;
        }
        int i4 = 0;
        x42Var.a(a4, this.f33780f, false);
        x42Var.a(this.f33780f.f34405d, this.f33779e, 0L);
        rv0.g gVar = this.f33779e.f34420d.f31379c;
        if (gVar != null) {
            int a5 = u82.a(gVar.f31427a, gVar.f31428b);
            i4 = a5 != 0 ? a5 != 1 ? a5 != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i4);
        x42.d dVar = this.f33779e;
        if (dVar.f34431o != -9223372036854775807L && !dVar.f34429m && !dVar.f34426j && !dVar.a()) {
            builder.setMediaDurationMillis(u82.b(this.f33779e.f34431o));
        }
        builder.setPlaybackType(this.f33779e.a() ? 2 : 1);
        this.f33774A = true;
    }

    public final void a(InterfaceC1852cd.a aVar, int i4, long j4) {
        dw0.b bVar = aVar.f24175d;
        if (bVar != null) {
            String a4 = this.f33776b.a(aVar.f24173b, bVar);
            Long l4 = this.f33782h.get(a4);
            Long l5 = this.f33781g.get(a4);
            this.f33782h.put(a4, Long.valueOf((l4 == null ? 0L : l4.longValue()) + j4));
            this.f33781g.put(a4, Long.valueOf((l5 != null ? l5.longValue() : 0L) + i4));
        }
    }

    public final void a(InterfaceC1852cd.a aVar, tv0 tv0Var) {
        if (aVar.f24175d == null) {
            return;
        }
        yb0 yb0Var = tv0Var.f32706c;
        yb0Var.getClass();
        int i4 = tv0Var.f32707d;
        zz zzVar = this.f33776b;
        x42 x42Var = aVar.f24173b;
        dw0.b bVar = aVar.f24175d;
        bVar.getClass();
        b bVar2 = new b(yb0Var, i4, zzVar.a(x42Var, bVar));
        int i5 = tv0Var.f32705b;
        if (i5 != 0) {
            if (i5 == 1) {
                this.f33790p = bVar2;
                return;
            } else if (i5 != 2) {
                if (i5 != 3) {
                    return;
                }
                this.f33791q = bVar2;
                return;
            }
        }
        this.f33789o = bVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x05b6  */
    /* JADX WARN: Removed duplicated region for block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0387  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(zh1 zh1Var, InterfaceC1852cd.b bVar) {
        int i4;
        boolean z4;
        int i5;
        int i6;
        int i7;
        int i8;
        a aVar;
        int i9;
        int i10;
        PlaybackErrorEvent.Builder timeSinceCreatedMillis;
        PlaybackErrorEvent.Builder errorCode;
        PlaybackErrorEvent.Builder subErrorCode;
        PlaybackErrorEvent.Builder exception;
        PlaybackErrorEvent build;
        int i11;
        int i12;
        int i13;
        b bVar2;
        b bVar3;
        b bVar4;
        int i14;
        PlaybackStateEvent.Builder state;
        PlaybackStateEvent.Builder timeSinceCreatedMillis2;
        PlaybackStateEvent build2;
        NetworkEvent.Builder networkType;
        NetworkEvent.Builder timeSinceCreatedMillis3;
        NetworkEvent build3;
        yb0 yb0Var;
        yb0 yb0Var2;
        yb0 yb0Var3;
        u30 u30Var;
        int i15;
        if (bVar.a() == 0) {
            return;
        }
        for (int i16 = 0; i16 < bVar.a(); i16++) {
            int b4 = bVar.b(i16);
            InterfaceC1852cd.a c4 = bVar.c(b4);
            if (b4 == 0) {
                this.f33776b.d(c4);
            } else if (b4 == 11) {
                this.f33776b.a(c4, this.f33785k);
            } else {
                this.f33776b.c(c4);
            }
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (bVar.a(0)) {
            InterfaceC1852cd.a c5 = bVar.c(0);
            if (this.f33784j != null) {
                a(c5.f24173b, c5.f24175d);
            }
        }
        if (bVar.a(2) && this.f33784j != null) {
            y72<q62.a> listIterator = zh1Var.getCurrentTracks().a().listIterator(0);
            loop1: while (true) {
                if (!listIterator.hasNext()) {
                    u30Var = null;
                    break;
                }
                q62.a next = listIterator.next();
                for (int i17 = 0; i17 < next.f30691b; i17++) {
                    if (next.b(i17) && (u30Var = next.a(i17).f34994p) != null) {
                        break loop1;
                    }
                }
            }
            if (u30Var != null) {
                PlaybackMetrics.Builder builder = this.f33784j;
                int i18 = u82.f32873a;
                int i19 = 0;
                while (true) {
                    if (i19 >= u30Var.f32801e) {
                        i15 = 1;
                        break;
                    }
                    UUID uuid = u30Var.a(i19).f32803c;
                    if (uuid.equals(C1813am.f23361d)) {
                        i15 = 3;
                        break;
                    } else if (uuid.equals(C1813am.f23362e)) {
                        i15 = 2;
                        break;
                    } else {
                        if (uuid.equals(C1813am.f23360c)) {
                            i15 = 6;
                            break;
                        }
                        i19++;
                    }
                }
                builder.setDrmType(i15);
            }
        }
        if (bVar.a(1011)) {
            this.f33800z++;
        }
        qh1 qh1Var = this.f33788n;
        int i20 = 4;
        if (qh1Var == null) {
            i11 = 1;
            i7 = 8;
            i8 = 7;
            i5 = 6;
            i6 = 9;
        } else {
            Context context = this.f33775a;
            boolean z5 = this.f33796v == 4;
            if (qh1Var.f30778b == 1001) {
                aVar = new a(20, 0);
            } else {
                if (qh1Var instanceof c60) {
                    c60 c60Var = (c60) qh1Var;
                    z4 = c60Var.f24064d == 1;
                    i4 = c60Var.f24068h;
                } else {
                    i4 = 0;
                    z4 = false;
                }
                Throwable cause = qh1Var.getCause();
                cause.getClass();
                char c6 = 6004;
                int i21 = 27;
                if (!(cause instanceof IOException)) {
                    i5 = 6;
                    i6 = 9;
                    if (z4 && (i4 == 0 || i4 == 1)) {
                        aVar = new a(35, 0);
                    } else if (z4 && i4 == 3) {
                        aVar = new a(15, 0);
                    } else if (z4 && i4 == 2) {
                        aVar = new a(23, 0);
                    } else {
                        if (cause instanceof uu0.b) {
                            aVar = new a(13, u82.a(((uu0.b) cause).f33357e));
                        } else if (cause instanceof ru0) {
                            aVar = new a(14, u82.a(((ru0) cause).f31368b));
                        } else if (cause instanceof OutOfMemoryError) {
                            aVar = new a(14, 0);
                        } else if (cause instanceof InterfaceC2023jh.b) {
                            aVar = new a(17, ((InterfaceC2023jh.b) cause).f27646b);
                        } else if (cause instanceof InterfaceC2023jh.e) {
                            aVar = new a(18, ((InterfaceC2023jh.e) cause).f27649b);
                        } else {
                            if (u82.f32873a >= 16 && (cause instanceof MediaCodec.CryptoException)) {
                                int errorCode2 = ((MediaCodec.CryptoException) cause).getErrorCode();
                                if (errorCode2 == 2 || errorCode2 == 4) {
                                    i7 = 8;
                                    i8 = 7;
                                } else {
                                    if (errorCode2 != 10) {
                                        i8 = 7;
                                        i7 = 8;
                                        if (errorCode2 != 7) {
                                            if (errorCode2 != 8) {
                                                switch (errorCode2) {
                                                    case 15:
                                                        break;
                                                    case 16:
                                                    case 18:
                                                        break;
                                                    case 17:
                                                    case 19:
                                                    case 20:
                                                    case 21:
                                                    case 22:
                                                        break;
                                                    default:
                                                        switch (errorCode2) {
                                                            case 24:
                                                            case 25:
                                                            case 26:
                                                            case 27:
                                                            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                                                                c6 = 6002;
                                                                break;
                                                            default:
                                                                c6 = 6006;
                                                                break;
                                                        }
                                                }
                                            }
                                            c6 = 6003;
                                        }
                                    } else {
                                        i7 = 8;
                                        i8 = 7;
                                    }
                                    switch (c6) {
                                        case AuthCode.StatusCode.AUTH_INFO_NOT_EXIST /* 6002 */:
                                            i21 = 24;
                                            break;
                                        case AuthCode.StatusCode.CERT_FINGERPRINT_ERROR /* 6003 */:
                                            i21 = 28;
                                            break;
                                        case AuthCode.StatusCode.PERMISSION_NOT_EXIST /* 6004 */:
                                            i21 = 25;
                                            break;
                                        case AuthCode.StatusCode.PERMISSION_NOT_AUTHORIZED /* 6005 */:
                                            i21 = 26;
                                            break;
                                    }
                                    aVar = new a(i21, errorCode2);
                                }
                                c6 = 6005;
                                switch (c6) {
                                }
                                aVar = new a(i21, errorCode2);
                            } else {
                                i7 = 8;
                                i8 = 7;
                                aVar = new a(22, 0);
                            }
                            PlaybackSession playbackSession = this.f33777c;
                            timeSinceCreatedMillis = Kj.a().setTimeSinceCreatedMillis(elapsedRealtime - this.f33778d);
                            errorCode = timeSinceCreatedMillis.setErrorCode(aVar.f33801a);
                            subErrorCode = errorCode.setSubErrorCode(aVar.f33802b);
                            exception = subErrorCode.setException(qh1Var);
                            build = exception.build();
                            playbackSession.reportPlaybackErrorEvent(build);
                            i11 = 1;
                            this.f33774A = true;
                            this.f33788n = null;
                        }
                        i7 = 8;
                    }
                    i7 = 8;
                } else if (cause instanceof zg0) {
                    aVar = new a(5, ((zg0) cause).f35589e);
                } else {
                    if (!(cause instanceof yg0) && !(cause instanceof wf1)) {
                        boolean z6 = cause instanceof xg0;
                        if (!z6 && !(cause instanceof o72.a)) {
                            if (qh1Var.f30778b == 1002) {
                                aVar = new a(21, 0);
                            } else if (cause instanceof v30.a) {
                                Throwable cause2 = cause.getCause();
                                cause2.getClass();
                                int i22 = u82.f32873a;
                                if (i22 >= 21 && (cause2 instanceof MediaDrm.MediaDrmStateException)) {
                                    int a4 = u82.a(((MediaDrm.MediaDrmStateException) cause2).getDiagnosticInfo());
                                    if (a4 != 2 && a4 != 4) {
                                        if (a4 != 10) {
                                            if (a4 != 7) {
                                                if (a4 != 8) {
                                                    switch (a4) {
                                                        case 15:
                                                            break;
                                                        case 16:
                                                        case 18:
                                                            break;
                                                        case 17:
                                                        case 19:
                                                        case 20:
                                                        case 21:
                                                        case 22:
                                                            break;
                                                        default:
                                                            switch (a4) {
                                                                case 24:
                                                                case 25:
                                                                case 26:
                                                                case 27:
                                                                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                                                                    c6 = 6002;
                                                                    break;
                                                                default:
                                                                    c6 = 6006;
                                                                    break;
                                                            }
                                                    }
                                                }
                                                c6 = 6003;
                                            }
                                        }
                                        switch (c6) {
                                            case AuthCode.StatusCode.AUTH_INFO_NOT_EXIST /* 6002 */:
                                                i21 = 24;
                                                break;
                                            case AuthCode.StatusCode.CERT_FINGERPRINT_ERROR /* 6003 */:
                                                i21 = 28;
                                                break;
                                            case AuthCode.StatusCode.PERMISSION_NOT_EXIST /* 6004 */:
                                                i21 = 25;
                                                break;
                                            case AuthCode.StatusCode.PERMISSION_NOT_AUTHORIZED /* 6005 */:
                                                i21 = 26;
                                                break;
                                        }
                                        aVar = new a(i21, a4);
                                    }
                                    c6 = 6005;
                                    switch (c6) {
                                    }
                                    aVar = new a(i21, a4);
                                } else if (i22 >= 23 && (cause2 instanceof MediaDrmResetException)) {
                                    aVar = new a(27, 0);
                                } else if (i22 >= 18 && (cause2 instanceof NotProvisionedException)) {
                                    aVar = new a(24, 0);
                                } else if (i22 >= 18 && (cause2 instanceof DeniedByServerException)) {
                                    aVar = new a(29, 0);
                                } else if (cause2 instanceof a82) {
                                    aVar = new a(23, 0);
                                } else if (cause2 instanceof hz.d) {
                                    aVar = new a(28, 0);
                                } else {
                                    aVar = new a(30, 0);
                                }
                            } else if ((cause instanceof wa0.c) && (cause.getCause() instanceof FileNotFoundException)) {
                                Throwable cause3 = cause.getCause();
                                cause3.getClass();
                                Throwable cause4 = cause3.getCause();
                                if (u82.f32873a >= 21 && (cause4 instanceof ErrnoException) && ((ErrnoException) cause4).errno == OsConstants.EACCES) {
                                    aVar = new a(32, 0);
                                } else {
                                    aVar = new a(31, 0);
                                }
                            } else {
                                i9 = 9;
                                aVar = new a(9, 0);
                            }
                        } else {
                            i9 = 9;
                            if (sc1.a(context).a() == 1) {
                                aVar = new a(3, 0);
                            } else {
                                Throwable cause5 = cause.getCause();
                                if (cause5 instanceof UnknownHostException) {
                                    i10 = 6;
                                    aVar = new a(6, 0);
                                } else {
                                    i10 = 6;
                                    if (cause5 instanceof SocketTimeoutException) {
                                        aVar = new a(7, 0);
                                        i6 = 9;
                                        i8 = 7;
                                        i5 = 6;
                                        i7 = 8;
                                        PlaybackSession playbackSession2 = this.f33777c;
                                        timeSinceCreatedMillis = Kj.a().setTimeSinceCreatedMillis(elapsedRealtime - this.f33778d);
                                        errorCode = timeSinceCreatedMillis.setErrorCode(aVar.f33801a);
                                        subErrorCode = errorCode.setSubErrorCode(aVar.f33802b);
                                        exception = subErrorCode.setException(qh1Var);
                                        build = exception.build();
                                        playbackSession2.reportPlaybackErrorEvent(build);
                                        i11 = 1;
                                        this.f33774A = true;
                                        this.f33788n = null;
                                    } else if (z6 && ((xg0) cause).f34557d == 1) {
                                        aVar = new a(4, 0);
                                    } else {
                                        aVar = new a(8, 0);
                                        i6 = 9;
                                        i7 = 8;
                                        i5 = 6;
                                    }
                                }
                            }
                        }
                        i6 = i9;
                        i7 = 8;
                        i8 = 7;
                        i5 = 6;
                        PlaybackSession playbackSession22 = this.f33777c;
                        timeSinceCreatedMillis = Kj.a().setTimeSinceCreatedMillis(elapsedRealtime - this.f33778d);
                        errorCode = timeSinceCreatedMillis.setErrorCode(aVar.f33801a);
                        subErrorCode = errorCode.setSubErrorCode(aVar.f33802b);
                        exception = subErrorCode.setException(qh1Var);
                        build = exception.build();
                        playbackSession22.reportPlaybackErrorEvent(build);
                        i11 = 1;
                        this.f33774A = true;
                        this.f33788n = null;
                    } else {
                        i9 = 9;
                        i10 = 6;
                        aVar = new a(z5 ? 10 : 11, 0);
                    }
                    i6 = i9;
                    i5 = i10;
                    i7 = 8;
                }
                i8 = 7;
                PlaybackSession playbackSession222 = this.f33777c;
                timeSinceCreatedMillis = Kj.a().setTimeSinceCreatedMillis(elapsedRealtime - this.f33778d);
                errorCode = timeSinceCreatedMillis.setErrorCode(aVar.f33801a);
                subErrorCode = errorCode.setSubErrorCode(aVar.f33802b);
                exception = subErrorCode.setException(qh1Var);
                build = exception.build();
                playbackSession222.reportPlaybackErrorEvent(build);
                i11 = 1;
                this.f33774A = true;
                this.f33788n = null;
            }
            i7 = 8;
            i8 = 7;
            i5 = 6;
            i6 = 9;
            PlaybackSession playbackSession2222 = this.f33777c;
            timeSinceCreatedMillis = Kj.a().setTimeSinceCreatedMillis(elapsedRealtime - this.f33778d);
            errorCode = timeSinceCreatedMillis.setErrorCode(aVar.f33801a);
            subErrorCode = errorCode.setSubErrorCode(aVar.f33802b);
            exception = subErrorCode.setException(qh1Var);
            build = exception.build();
            playbackSession2222.reportPlaybackErrorEvent(build);
            i11 = 1;
            this.f33774A = true;
            this.f33788n = null;
        }
        if (bVar.a(2)) {
            q62 currentTracks = zh1Var.getCurrentTracks();
            boolean a5 = currentTracks.a(2);
            boolean a6 = currentTracks.a(i11);
            boolean a7 = currentTracks.a(3);
            if (a5 || a6 || a7) {
                if (a5 || u82.a(this.f33792r, (Object) null)) {
                    i12 = i8;
                    i13 = 10;
                } else {
                    int i23 = this.f33792r == null ? 1 : 0;
                    this.f33792r = null;
                    i12 = i8;
                    i13 = 10;
                    a(1, elapsedRealtime, null, i23);
                }
                if (!a6 && !u82.a(this.f33793s, (Object) null)) {
                    int i24 = this.f33793s == null ? 1 : 0;
                    this.f33793s = null;
                    a(0, elapsedRealtime, null, i24);
                }
                if (!a7 && !u82.a(this.f33794t, (Object) null)) {
                    int i25 = this.f33794t == null ? 1 : 0;
                    this.f33794t = null;
                    a(2, elapsedRealtime, null, i25);
                }
                bVar2 = this.f33789o;
                if (bVar2 != null && bVar2.f33805c.equals(this.f33776b.b())) {
                    b bVar5 = this.f33789o;
                    yb0Var3 = bVar5.f33803a;
                    if (yb0Var3.f34997s != -1) {
                        int i26 = bVar5.f33804b;
                        if (!u82.a(this.f33792r, yb0Var3)) {
                            int i27 = (this.f33792r == null && i26 == 0) ? 1 : i26;
                            this.f33792r = yb0Var3;
                            a(1, elapsedRealtime, yb0Var3, i27);
                        }
                        this.f33789o = null;
                    }
                }
                bVar3 = this.f33790p;
                if (bVar3 != null && bVar3.f33805c.equals(this.f33776b.b())) {
                    b bVar6 = this.f33790p;
                    yb0Var2 = bVar6.f33803a;
                    int i28 = bVar6.f33804b;
                    if (!u82.a(this.f33793s, yb0Var2)) {
                        int i29 = (this.f33793s == null && i28 == 0) ? 1 : i28;
                        this.f33793s = yb0Var2;
                        a(0, elapsedRealtime, yb0Var2, i29);
                    }
                    this.f33790p = null;
                }
                bVar4 = this.f33791q;
                if (bVar4 != null && bVar4.f33805c.equals(this.f33776b.b())) {
                    b bVar7 = this.f33791q;
                    yb0Var = bVar7.f33803a;
                    int i30 = bVar7.f33804b;
                    if (!u82.a(this.f33794t, yb0Var)) {
                        int i31 = (this.f33794t == null && i30 == 0) ? 1 : i30;
                        this.f33794t = yb0Var;
                        a(2, elapsedRealtime, yb0Var, i31);
                    }
                    this.f33791q = null;
                }
                switch (sc1.a(this.f33775a).a()) {
                    case 0:
                        i14 = 0;
                        break;
                    case 1:
                        i14 = i6;
                        break;
                    case 2:
                        i14 = 2;
                        break;
                    case 3:
                        i14 = 4;
                        break;
                    case 4:
                        i14 = 5;
                        break;
                    case 5:
                        i14 = i5;
                        break;
                    case 6:
                    case 8:
                    default:
                        i14 = 1;
                        break;
                    case 7:
                        i14 = 3;
                        break;
                    case 9:
                        i14 = i7;
                        break;
                    case 10:
                        i14 = i12;
                        break;
                }
                if (i14 != this.f33787m) {
                    this.f33787m = i14;
                    PlaybackSession playbackSession3 = this.f33777c;
                    networkType = Lj.a().setNetworkType(i14);
                    timeSinceCreatedMillis3 = networkType.setTimeSinceCreatedMillis(elapsedRealtime - this.f33778d);
                    build3 = timeSinceCreatedMillis3.build();
                    playbackSession3.reportNetworkEvent(build3);
                }
                if (zh1Var.getPlaybackState() != 2) {
                    this.f33795u = false;
                }
                if (zh1Var.a() != null) {
                    this.f33797w = false;
                } else if (bVar.a(i13)) {
                    this.f33797w = true;
                }
                int playbackState = zh1Var.getPlaybackState();
                if (!this.f33795u) {
                    i20 = 5;
                } else if (this.f33797w) {
                    i20 = 13;
                } else if (playbackState == 4) {
                    i20 = 11;
                } else if (playbackState == 2) {
                    int i32 = this.f33786l;
                    if (i32 == 0 || i32 == 2) {
                        i20 = 2;
                    } else if (zh1Var.getPlayWhenReady()) {
                        if (zh1Var.getPlaybackSuppressionReason() == 0) {
                            i20 = i5;
                        }
                        i20 = i13;
                    } else {
                        i20 = i12;
                    }
                } else {
                    i13 = 3;
                    if (playbackState == 3) {
                        if (zh1Var.getPlayWhenReady()) {
                            if (zh1Var.getPlaybackSuppressionReason() != 0) {
                                i20 = i6;
                            }
                            i20 = i13;
                        }
                    } else {
                        i20 = (playbackState != 1 || this.f33786l == 0) ? this.f33786l : 12;
                    }
                }
                if (this.f33786l != i20) {
                    this.f33786l = i20;
                    this.f33774A = true;
                    PlaybackSession playbackSession4 = this.f33777c;
                    state = Mj.a().setState(this.f33786l);
                    timeSinceCreatedMillis2 = state.setTimeSinceCreatedMillis(elapsedRealtime - this.f33778d);
                    build2 = timeSinceCreatedMillis2.build();
                    playbackSession4.reportPlaybackStateEvent(build2);
                }
                if (bVar.a(IronSourceError.ERROR_RV_LOAD_SUCCESS_UNEXPECTED)) {
                    return;
                }
                this.f33776b.a(bVar.c(IronSourceError.ERROR_RV_LOAD_SUCCESS_UNEXPECTED));
                return;
            }
        }
        i12 = i8;
        i13 = 10;
        bVar2 = this.f33789o;
        if (bVar2 != null) {
            b bVar52 = this.f33789o;
            yb0Var3 = bVar52.f33803a;
            if (yb0Var3.f34997s != -1) {
            }
        }
        bVar3 = this.f33790p;
        if (bVar3 != null) {
            b bVar62 = this.f33790p;
            yb0Var2 = bVar62.f33803a;
            int i282 = bVar62.f33804b;
            if (!u82.a(this.f33793s, yb0Var2)) {
            }
            this.f33790p = null;
        }
        bVar4 = this.f33791q;
        if (bVar4 != null) {
            b bVar72 = this.f33791q;
            yb0Var = bVar72.f33803a;
            int i302 = bVar72.f33804b;
            if (!u82.a(this.f33794t, yb0Var)) {
            }
            this.f33791q = null;
        }
        switch (sc1.a(this.f33775a).a()) {
        }
        if (i14 != this.f33787m) {
        }
        if (zh1Var.getPlaybackState() != 2) {
        }
        if (zh1Var.a() != null) {
        }
        int playbackState2 = zh1Var.getPlaybackState();
        if (!this.f33795u) {
        }
        if (this.f33786l != i20) {
        }
        if (bVar.a(IronSourceError.ERROR_RV_LOAD_SUCCESS_UNEXPECTED)) {
        }
    }

    public final void a(tv0 tv0Var) {
        this.f33796v = tv0Var.f32704a;
    }

    public final void a(qh1 qh1Var) {
        this.f33788n = qh1Var;
    }

    public final void a(int i4) {
        if (i4 == 1) {
            this.f33795u = true;
        }
        this.f33785k = i4;
    }

    public final void a(InterfaceC1852cd.a aVar, String str) {
        PlaybackMetrics.Builder playerName;
        PlaybackMetrics.Builder playerVersion;
        dw0.b bVar = aVar.f24175d;
        if (bVar == null || !bVar.a()) {
            a();
            this.f33783i = str;
            playerName = Oj.a().setPlayerName("ExoPlayerLib");
            playerVersion = playerName.setPlayerVersion("2.18.1");
            this.f33784j = playerVersion;
            a(aVar.f24173b, aVar.f24175d);
        }
    }

    public final void a(ey eyVar) {
        this.f33798x += eyVar.f25496g;
        this.f33799y += eyVar.f25494e;
    }

    public final void a(rf2 rf2Var) {
        b bVar = this.f33789o;
        if (bVar != null) {
            yb0 yb0Var = bVar.f33803a;
            if (yb0Var.f34997s == -1) {
                this.f33789o = new b(yb0Var.a().o(rf2Var.f31177b).f(rf2Var.f31178c).a(), bVar.f33804b, bVar.f33805c);
            }
        }
    }

    private void a(int i4, long j4, yb0 yb0Var, int i5) {
        TrackChangeEvent.Builder timeSinceCreatedMillis;
        TrackChangeEvent build;
        int i6;
        timeSinceCreatedMillis = Pj.a(i4).setTimeSinceCreatedMillis(j4 - this.f33778d);
        if (yb0Var != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i5 != 1) {
                i6 = 3;
                if (i5 != 2) {
                    i6 = i5 != 3 ? 1 : 4;
                }
            } else {
                i6 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i6);
            String str = yb0Var.f34990l;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = yb0Var.f34991m;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = yb0Var.f34988j;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i7 = yb0Var.f34987i;
            if (i7 != -1) {
                timeSinceCreatedMillis.setBitrate(i7);
            }
            int i8 = yb0Var.f34996r;
            if (i8 != -1) {
                timeSinceCreatedMillis.setWidth(i8);
            }
            int i9 = yb0Var.f34997s;
            if (i9 != -1) {
                timeSinceCreatedMillis.setHeight(i9);
            }
            int i10 = yb0Var.f35004z;
            if (i10 != -1) {
                timeSinceCreatedMillis.setChannelCount(i10);
            }
            int i11 = yb0Var.f34973A;
            if (i11 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i11);
            }
            String str4 = yb0Var.f34982d;
            if (str4 != null) {
                int i12 = u82.f32873a;
                String[] split = str4.split("-", -1);
                Pair create = Pair.create(split[0], split.length >= 2 ? split[1] : null);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                Object obj = create.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f4 = yb0Var.f34998t;
            if (f4 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f4);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.f33774A = true;
        PlaybackSession playbackSession = this.f33777c;
        build = timeSinceCreatedMillis.build();
        playbackSession.reportTrackChangeEvent(build);
    }
}
