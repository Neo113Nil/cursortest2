package defpackage;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final /* synthetic */ class uy1 implements ae0 {
    public final /* synthetic */ Object OPXfSBeufaJ8;
    public final /* synthetic */ int rtx2ld2ELZv4;

    public /* synthetic */ uy1(int i, Object obj) {
        this.rtx2ld2ELZv4 = i;
        this.OPXfSBeufaJ8 = obj;
    }

    @Override // defpackage.ae0
    public final Object PxuCJdSBwIXG() {
        ae0 ae0Var;
        Object obj;
        int i;
        PendingIntent actionIntent;
        ActivityOptions pendingIntentBackgroundActivityStartMode;
        int i2 = this.rtx2ld2ELZv4;
        boolean z = true;
        int i3 = 1;
        Object obj2 = this.OPXfSBeufaJ8;
        switch (i2) {
            case 0:
                vy1 vy1Var = (vy1) obj2;
                tz1 tz1Var = vy1Var.rtx2ld2ELZv4;
                Object obj3 = vy1Var.dgRBjINgWbAK;
                if (obj3 != null) {
                    return tz1Var.a92UlCVFR9N8(vy1Var, obj3);
                }
                u9.XL4ISE6Oc65B("Value should be initialized");
                return null;
            case 1:
                nz1 nz1Var = ((cz1) obj2).wdg6QnbFHrFF;
                if (nz1Var == null) {
                    return null;
                }
                Bundle ZbWwgt3aGe7A = mm2.ZbWwgt3aGe7A((vi1[]) Arrays.copyOf(new vi1[0], 0));
                nz1Var.TSizfFm2Yiuu(ZbWwgt3aGe7A);
                if (ZbWwgt3aGe7A.isEmpty()) {
                    return null;
                }
                return ZbWwgt3aGe7A;
            case 2:
                return mm2.POWyO8hTM6YC((pr2) obj2);
            case 3:
                qz1 qz1Var = (qz1) obj2;
                qz1Var.rtx2ld2ELZv4().PxuCJdSBwIXG(new ot1(qz1Var));
                return no2.PxuCJdSBwIXG;
            case 4:
                s02 s02Var = (s02) obj2;
                l3 l3Var = (l3) f2.QrzZRwfaDlRX(s02Var, bi1.PxuCJdSBwIXG);
                s02Var.ozEBbv0hFTAB = l3Var;
                s02Var.tmVwIGCQF4zR = l3Var != null ? new k3(l3Var.PxuCJdSBwIXG, l3Var.lS5Rgt96tfkO, l3Var.TSizfFm2Yiuu, l3Var.Y1f8riQaR6yg) : null;
                return no2.PxuCJdSBwIXG;
            case 5:
                x12 x12Var = (x12) obj2;
                gl2 gl2Var = x12Var.e9gEMXR7LXtO;
                x12Var.a92UlCVFR9N8 = gl2Var != null ? ((Number) gl2Var.x50lh2ztY7Y5.getValue()).longValue() : 0L;
                return no2.PxuCJdSBwIXG;
            case 6:
                return obj2;
            case 7:
                d42 d42Var = (d42) obj2;
                return Integer.valueOf(ki0.nLZGh9p8gVSu(d42Var, d42Var.dgRBjINgWbAK));
            case 8:
                return ((mu0) ((ju0) ((ArrayList) obj2).get(0))).lS5Rgt96tfkO();
            case 9:
                u42 u42Var = (u42) obj2;
                mj1 mj1Var = u42Var.wdg6QnbFHrFF;
                if (((a62) mj1Var.getValue()).PxuCJdSBwIXG == 9205357640488583168L || a62.TSizfFm2Yiuu(((a62) mj1Var.getValue()).PxuCJdSBwIXG)) {
                    return null;
                }
                vf vfVar = u42Var.rtx2ld2ELZv4;
                long j = ((a62) mj1Var.getValue()).PxuCJdSBwIXG;
                return vfVar.TSizfFm2Yiuu;
            case 10:
                y62 y62Var = (y62) obj2;
                if (!((Boolean) y62Var.cpQdD2nAriOS.getValue()).booleanValue() && (ae0Var = y62Var.PxuCJdSBwIXG) != null) {
                    ae0Var.PxuCJdSBwIXG();
                }
                return no2.PxuCJdSBwIXG;
            case 11:
                f82 f82Var = (f82) obj2;
                while (true) {
                    Object obj4 = f82Var.RAsUl2FVSrh6;
                    synchronized (obj4) {
                        try {
                            if (f82Var.TSizfFm2Yiuu) {
                                obj = obj4;
                            } else {
                                f82Var.TSizfFm2Yiuu = z;
                                try {
                                    f91 f91Var = f82Var.a92UlCVFR9N8;
                                    Object[] objArr = f91Var.rtx2ld2ELZv4;
                                    int i4 = f91Var.wdg6QnbFHrFF;
                                    int i5 = 0;
                                    while (i5 < i4) {
                                        e82 e82Var = (e82) objArr[i5];
                                        w81 w81Var = e82Var.RAsUl2FVSrh6;
                                        le0 le0Var = e82Var.PxuCJdSBwIXG;
                                        Object[] objArr2 = w81Var.lS5Rgt96tfkO;
                                        long[] jArr = w81Var.PxuCJdSBwIXG;
                                        int length = jArr.length - 2;
                                        if (length >= 0) {
                                            int i6 = 0;
                                            while (true) {
                                                long j2 = jArr[i6];
                                                obj = obj4;
                                                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i7 = 8 - ((~(i6 - length)) >>> 31);
                                                    for (int i8 = 0; i8 < i7; i8++) {
                                                        if ((j2 & 255) < 128) {
                                                            try {
                                                                le0Var.OPXfSBeufaJ8(objArr2[(i6 << 3) + i8]);
                                                            } catch (Throwable th) {
                                                                th = th;
                                                                f82Var.TSizfFm2Yiuu = false;
                                                                throw th;
                                                            }
                                                        }
                                                        j2 >>= 8;
                                                    }
                                                    if (i7 != 8) {
                                                    }
                                                }
                                                if (i6 != length) {
                                                    i6++;
                                                    obj4 = obj;
                                                }
                                            }
                                        } else {
                                            obj = obj4;
                                        }
                                        w81Var.lS5Rgt96tfkO();
                                        i5++;
                                        obj4 = obj;
                                    }
                                    obj = obj4;
                                    try {
                                        f82Var.TSizfFm2Yiuu = false;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    obj = obj4;
                                }
                            }
                            if (!f82Var.TSizfFm2Yiuu()) {
                                return no2.PxuCJdSBwIXG;
                            }
                            z = true;
                        } catch (Throwable th4) {
                            th = th4;
                            obj = obj4;
                        }
                    }
                }
            case 12:
                Context context = ((q3) obj2).PxuCJdSBwIXG;
                q qVar = q.OPXfSBeufaJ8;
                if (qVar == null) {
                    synchronized (q.rtx2ld2ELZv4) {
                        try {
                            qVar = q.OPXfSBeufaJ8;
                            if (qVar == null) {
                                Log.d("AdvertisingIdClient", "Creating AdvertisingIdClient");
                                qVar = new q(context);
                                q.OPXfSBeufaJ8 = qVar;
                            }
                        } finally {
                        }
                    }
                }
                Log.d("AdvertisingIdClient", "AdvertisingIdClient already created.");
                if (ex2.TSizfFm2Yiuu == null) {
                    synchronized (ex2.Y1f8riQaR6yg) {
                        try {
                            if (ex2.TSizfFm2Yiuu == null) {
                                ex2.TSizfFm2Yiuu = new ex2(context);
                            }
                        } finally {
                        }
                    }
                }
                ex2 ex2Var = ex2.TSizfFm2Yiuu;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                try {
                    p e9gEMXR7LXtO = qVar.e9gEMXR7LXtO();
                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    q.Y1f8riQaR6yg(e9gEMXR7LXtO, elapsedRealtime2, null);
                    ex2Var.PxuCJdSBwIXG(0, (int) (SystemClock.elapsedRealtime() - elapsedRealtime), elapsedRealtime, System.currentTimeMillis());
                    Log.i("AdvertisingIdClient", "GetInfoInternal elapse " + elapsedRealtime2 + "ms");
                    String str = e9gEMXR7LXtO.TSizfFm2Yiuu;
                    return str == null ? "" : str;
                } catch (Throwable th5) {
                    q.Y1f8riQaR6yg(null, -1L, th5);
                    if (!(th5 instanceof IOException)) {
                        if (th5 instanceof gh0) {
                            i3 = 9;
                        } else {
                            if (th5 instanceof IllegalStateException) {
                                i = 8;
                                ex2Var.PxuCJdSBwIXG(i, (int) (SystemClock.elapsedRealtime() - elapsedRealtime), elapsedRealtime, System.currentTimeMillis());
                                throw th5;
                            }
                            i3 = -1;
                        }
                    }
                    i = i3;
                    ex2Var.PxuCJdSBwIXG(i, (int) (SystemClock.elapsedRealtime() - elapsedRealtime), elapsedRealtime, System.currentTimeMillis());
                    throw th5;
                }
            case 13:
                actionIntent = ((RemoteAction) obj2).getActionIntent();
                if (Build.VERSION.SDK_INT >= 34) {
                    try {
                        pendingIntentBackgroundActivityStartMode = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1);
                        actionIntent.send(pendingIntentBackgroundActivityStartMode.toBundle());
                    } catch (PendingIntent.CanceledException e) {
                        Log.e("TextClassification", "error sending pendingIntent: " + actionIntent + " error: " + e);
                    }
                } else {
                    actionIntent.send();
                }
                return no2.PxuCJdSBwIXG;
            case 14:
                gf2 gf2Var = (gf2) obj2;
                if (gf2Var.S9EYkSpbGuxq) {
                    return sj0.gPXPFXrUH4XX(gf2Var);
                }
                pe2.Companion.getClass();
                return pe2.lS5Rgt96tfkO;
            case 15:
                return new k10(ni0.rZjpSjn4zoMv(24.0f, 16.0f, ((cg2) obj2).PxuCJdSBwIXG()));
            default:
                bj2 bj2Var = (bj2) obj2;
                bj2Var.BjEWd04qc7Mw = null;
                th0.S2OOm9zPNm0h(bj2Var);
                ng0.e6tOsSdd2EFb(bj2Var);
                fx1.IXK6ba3ucyzm(bj2Var);
                return Boolean.TRUE;
        }
    }
}
