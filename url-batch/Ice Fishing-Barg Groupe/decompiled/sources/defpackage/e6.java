package defpackage;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import android.view.textclassifier.TextClassification;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final /* synthetic */ class e6 implements ae0 {
    public final /* synthetic */ Object OPXfSBeufaJ8;
    public final /* synthetic */ int rtx2ld2ELZv4;
    public final /* synthetic */ Object wdg6QnbFHrFF;

    public /* synthetic */ e6(ll0 ll0Var, zt1 zt1Var) {
        this.rtx2ld2ELZv4 = 13;
        this.wdg6QnbFHrFF = ll0Var;
        this.OPXfSBeufaJ8 = zt1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:268:0x056d  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x058a  */
    /* JADX WARN: Type inference failed for: r9v0, types: [bt] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v3, types: [qe1] */
    @Override // defpackage.ae0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object PxuCJdSBwIXG() {
        qe1 qe1Var;
        List list;
        long PxuCJdSBwIXG;
        String[] names;
        String text;
        Intent intent;
        ActivityOptions pendingIntentBackgroundActivityStartMode;
        long j;
        long j2;
        ki2 Y1f8riQaR6yg;
        v8 v8Var;
        ?? r9 = 0;
        r9 = null;
        vl0[] vl0VarArr = null;
        switch (this.rtx2ld2ELZv4) {
            case 0:
                ((zt1) this.OPXfSBeufaJ8).rtx2ld2ELZv4 = ((ae0) this.wdg6QnbFHrFF).PxuCJdSBwIXG();
                return no2.PxuCJdSBwIXG;
            case 1:
                ((ui) this.OPXfSBeufaJ8).Y1f8riQaR6yg((hl) this.wdg6QnbFHrFF);
                return no2.PxuCJdSBwIXG;
            case 2:
                ((zn) this.OPXfSBeufaJ8).TSizfFm2Yiuu = (ae0) this.wdg6QnbFHrFF;
                return no2.PxuCJdSBwIXG;
            case 3:
                lc lcVar = (lc) this.OPXfSBeufaJ8;
                xw0 xw0Var = (xw0) this.wdg6QnbFHrFF;
                lcVar.jyegZNwi31qc = lcVar.S2OOm9zPNm0h.PxuCJdSBwIXG(xw0Var.rtx2ld2ELZv4.Y1f8riQaR6yg(), xw0Var.getLayoutDirection(), xw0Var);
                return no2.PxuCJdSBwIXG;
            case 4:
                oh2 oh2Var = (oh2) this.OPXfSBeufaJ8;
                d91 d91Var = (d91) this.wdg6QnbFHrFF;
                if (!vi2.lS5Rgt96tfkO(oh2Var.lS5Rgt96tfkO, ((oh2) d91Var.getValue()).lS5Rgt96tfkO) || !cs0.wdg6QnbFHrFF(oh2Var.TSizfFm2Yiuu, ((oh2) d91Var.getValue()).TSizfFm2Yiuu)) {
                    d91Var.setValue(oh2Var);
                }
                return no2.PxuCJdSBwIXG;
            case 5:
                xp xpVar = (xp) this.OPXfSBeufaJ8;
                Object obj = this.wdg6QnbFHrFF;
                tf0 tf0Var = xpVar.rtx2ld2ELZv4;
                a72 a72Var = tf0Var.TSizfFm2Yiuu;
                z62 TSizfFm2Yiuu = a72Var.TSizfFm2Yiuu();
                int i = 0;
                while (i < a72Var.OPXfSBeufaJ8) {
                    try {
                        if (TSizfFm2Yiuu.x50lh2ztY7Y5(i)) {
                            Object r3s1LDPKFs1S = TSizfFm2Yiuu.r3s1LDPKFs1S(i);
                            if (r3s1LDPKFs1S != obj) {
                                yf0 yf0Var = r3s1LDPKFs1S instanceof yf0 ? (yf0) r3s1LDPKFs1S : null;
                                if ((yf0Var != null ? yf0Var.PxuCJdSBwIXG : null) == obj) {
                                }
                            }
                            qe1 qe1Var2 = new qe1(i, null);
                            TSizfFm2Yiuu.TSizfFm2Yiuu();
                            qe1Var = qe1Var2;
                            if (qe1Var != null) {
                                int i2 = qe1Var.PxuCJdSBwIXG;
                                Integer num = qe1Var.lS5Rgt96tfkO;
                                z62 TSizfFm2Yiuu2 = a72Var.TSizfFm2Yiuu();
                                try {
                                    ArrayList KUoIVIumpKat = b51.KUoIVIumpKat(TSizfFm2Yiuu2, i2, num);
                                    TSizfFm2Yiuu2.TSizfFm2Yiuu();
                                    list = zk.wcHq2YQJmeHg(KUoIVIumpKat, tf0Var.rZjpSjn4zoMv());
                                } finally {
                                }
                            } else {
                                list = p50.rtx2ld2ELZv4;
                            }
                            return new so(list, tf0Var.aF05bpZJlKEP);
                        }
                        int[] iArr = TSizfFm2Yiuu.lS5Rgt96tfkO;
                        int i3 = i + 1;
                        int lS5Rgt96tfkO = (i3 < TSizfFm2Yiuu.TSizfFm2Yiuu ? iArr[(i3 * 5) + 4] : TSizfFm2Yiuu.e9gEMXR7LXtO) - c72.lS5Rgt96tfkO(iArr, i);
                        for (int i4 = 0; i4 < lS5Rgt96tfkO; i4++) {
                            Object rtx2ld2ELZv4 = TSizfFm2Yiuu.rtx2ld2ELZv4(i, i4);
                            if (rtx2ld2ELZv4 != obj) {
                                yf0 yf0Var2 = rtx2ld2ELZv4 instanceof yf0 ? (yf0) rtx2ld2ELZv4 : null;
                                if ((yf0Var2 != null ? yf0Var2.PxuCJdSBwIXG : null) != obj) {
                                }
                            }
                            r9 = new qe1(i, Integer.valueOf(i4));
                            if (qe1Var != null) {
                            }
                            return new so(list, tf0Var.aF05bpZJlKEP);
                        }
                        i = i3;
                    } finally {
                    }
                }
                if (qe1Var != null) {
                }
                return new so(list, tf0Var.aF05bpZJlKEP);
            case 6:
                return new wq0(vi0.wLFCmsViZrNT(((qe2) this.OPXfSBeufaJ8).OPXfSBeufaJ8((bw0) ((ae0) this.wdg6QnbFHrFF).PxuCJdSBwIXG())));
            case 7:
                ((ye2) this.OPXfSBeufaJ8).Y1f8riQaR6yg.OPXfSBeufaJ8((df2) this.wdg6QnbFHrFF);
                return no2.PxuCJdSBwIXG;
            case 8:
                ((wz) this.OPXfSBeufaJ8).e9gEMXR7LXtO((x91) this.wdg6QnbFHrFF, false);
                return no2.PxuCJdSBwIXG;
            case 9:
                m60 m60Var = (m60) this.OPXfSBeufaJ8;
                String str = (String) this.wdg6QnbFHrFF;
                Enum[] enumArr = m60Var.PxuCJdSBwIXG;
                j60 j60Var = new j60(str, enumArr.length);
                for (Enum r0 : enumArr) {
                    j60Var.x50lh2ztY7Y5(r0.name(), false);
                }
                return j60Var;
            case 10:
                ((zt1) this.OPXfSBeufaJ8).rtx2ld2ELZv4 = f2.QrzZRwfaDlRX((hb0) this.wdg6QnbFHrFF, cm1.PxuCJdSBwIXG);
                return no2.PxuCJdSBwIXG;
            case 11:
                ll0 ll0Var = (ll0) this.OPXfSBeufaJ8;
                vl0 vl0Var = (vl0) this.wdg6QnbFHrFF;
                try {
                    ll0Var.rtx2ld2ELZv4.TSizfFm2Yiuu(vl0Var);
                } catch (IOException e) {
                    km1.Companion.getClass();
                    km1.PxuCJdSBwIXG.OPXfSBeufaJ8("Http2Connection.Listener failure for " + ll0Var.wdg6QnbFHrFF, 4, e);
                    try {
                        vl0Var.TSizfFm2Yiuu(o60.wdg6QnbFHrFF, e);
                    } catch (IOException unused) {
                    }
                }
                return no2.PxuCJdSBwIXG;
            case 12:
                kl0 kl0Var = (kl0) this.OPXfSBeufaJ8;
                t42 t42Var = (t42) this.wdg6QnbFHrFF;
                zt1 zt1Var = new zt1();
                ll0 ll0Var2 = kl0Var.OPXfSBeufaJ8;
                synchronized (ll0Var2.rZjpSjn4zoMv) {
                    synchronized (ll0Var2) {
                        try {
                            t42 t42Var2 = ll0Var2.IAToe7bXGz4N;
                            t42 t42Var3 = new t42();
                            t42Var2.getClass();
                            for (int i5 = 0; i5 < 10; i5++) {
                                if (((1 << i5) & t42Var2.PxuCJdSBwIXG) != 0) {
                                    t42Var3.lS5Rgt96tfkO(i5, t42Var2.lS5Rgt96tfkO[i5]);
                                }
                            }
                            for (int i6 = 0; i6 < 10; i6++) {
                                if (((1 << i6) & t42Var.PxuCJdSBwIXG) != 0) {
                                    t42Var3.lS5Rgt96tfkO(i6, t42Var.lS5Rgt96tfkO[i6]);
                                }
                            }
                            zt1Var.rtx2ld2ELZv4 = t42Var3;
                            PxuCJdSBwIXG = t42Var3.PxuCJdSBwIXG() - t42Var2.PxuCJdSBwIXG();
                            if (PxuCJdSBwIXG != 0 && !ll0Var2.OPXfSBeufaJ8.isEmpty()) {
                                vl0VarArr = (vl0[]) ll0Var2.OPXfSBeufaJ8.values().toArray(new vl0[0]);
                            }
                            t42 t42Var4 = (t42) zt1Var.rtx2ld2ELZv4;
                            t42Var4.getClass();
                            ll0Var2.IAToe7bXGz4N = t42Var4;
                            zd2.lS5Rgt96tfkO(ll0Var2.BRwzKIf41E4i, ll0Var2.wdg6QnbFHrFF + " onSettings", 0L, new e6(ll0Var2, zt1Var), 6);
                        } finally {
                        }
                    }
                    try {
                        ll0Var2.rZjpSjn4zoMv.lS5Rgt96tfkO((t42) zt1Var.rtx2ld2ELZv4);
                    } catch (IOException e2) {
                        o60 o60Var = o60.wdg6QnbFHrFF;
                        ll0Var2.lS5Rgt96tfkO(o60Var, o60Var, e2);
                    }
                }
                if (vl0VarArr != null) {
                    int length = vl0VarArr.length;
                    while (r10 < length) {
                        vl0 vl0Var2 = vl0VarArr[r10];
                        synchronized (vl0Var2) {
                            vl0Var2.x50lh2ztY7Y5 += PxuCJdSBwIXG;
                            if (PxuCJdSBwIXG > 0) {
                                vl0Var2.notifyAll();
                            }
                        }
                        r10++;
                    }
                }
                return no2.PxuCJdSBwIXG;
            case 13:
                ll0 ll0Var3 = (ll0) this.wdg6QnbFHrFF;
                ll0Var3.rtx2ld2ELZv4.PxuCJdSBwIXG(ll0Var3, (t42) ((zt1) this.OPXfSBeufaJ8).rtx2ld2ELZv4);
                return no2.PxuCJdSBwIXG;
            case 14:
                ((lb1) this.OPXfSBeufaJ8).lS5Rgt96tfkO(this.wdg6QnbFHrFF, new wnqUPcAvl7HT(17));
                return no2.PxuCJdSBwIXG;
            case 15:
                SerialDescriptor serialDescriptor = (SerialDescriptor) this.OPXfSBeufaJ8;
                ht0 ht0Var = (ht0) this.wdg6QnbFHrFF;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                lt0 lt0Var = ht0Var.PxuCJdSBwIXG;
                zv.xfACYKDMU6Dj(ht0Var, serialDescriptor);
                int Y1f8riQaR6yg2 = serialDescriptor.Y1f8riQaR6yg();
                for (int i7 = 0; i7 < Y1f8riQaR6yg2; i7++) {
                    List OPXfSBeufaJ8 = serialDescriptor.OPXfSBeufaJ8(i7);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : OPXfSBeufaJ8) {
                        if (obj2 instanceof wt0) {
                            arrayList.add(obj2);
                        }
                    }
                    wt0 wt0Var = (wt0) (arrayList.size() == 1 ? arrayList.get(0) : null);
                    if (wt0Var != null && (names = wt0Var.names()) != null) {
                        for (String str2 : names) {
                            String str3 = cs0.wdg6QnbFHrFF(serialDescriptor.TSizfFm2Yiuu(), f42.e9gEMXR7LXtO) ? "enum value" : "property";
                            if (linkedHashMap.containsKey(str2)) {
                                throw new nt0(vi0.EcgxDIVH5in8(-1, "The suggested name '" + str2 + "' for " + str3 + ' ' + serialDescriptor.e9gEMXR7LXtO(i7) + " is already one of the names for " + str3 + ' ' + serialDescriptor.e9gEMXR7LXtO(((Number) w41.POWyO8hTM6YC(str2, linkedHashMap)).intValue()) + " in " + serialDescriptor, null, null, null));
                            }
                            linkedHashMap.put(str2, Integer.valueOf(i7));
                        }
                    }
                }
                return linkedHashMap.isEmpty() ? q50.rtx2ld2ELZv4 : linkedHashMap;
            case 16:
                return new nz0((zy1) this.OPXfSBeufaJ8, q50.rtx2ld2ELZv4, (wy1) this.wdg6QnbFHrFF);
            case 17:
                fa1 fa1Var = (fa1) this.OPXfSBeufaJ8;
                x91 x91Var = (x91) this.wdg6QnbFHrFF;
                x91Var.getClass();
                synchronized (fa1Var.PxuCJdSBwIXG) {
                    try {
                        l92 l92Var = fa1Var.lS5Rgt96tfkO;
                        Iterable iterable = (Iterable) l92Var.getValue();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj3 : iterable) {
                            if (cs0.wdg6QnbFHrFF((x91) obj3, x91Var)) {
                                l92Var.OPXfSBeufaJ8(null, arrayList2);
                            } else {
                                arrayList2.add(obj3);
                            }
                        }
                        l92Var.OPXfSBeufaJ8(null, arrayList2);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return no2.PxuCJdSBwIXG;
            case 18:
                m9 m9Var = (m9) this.OPXfSBeufaJ8;
                at1 at1Var = (at1) this.wdg6QnbFHrFF;
                if (((bb) m9Var.OPXfSBeufaJ8).get() == 0) {
                    at1Var.PxuCJdSBwIXG();
                }
                return no2.PxuCJdSBwIXG;
            case 19:
                return kj0.x50lh2ztY7Y5((String) this.OPXfSBeufaJ8, wa2.rtx2ld2ELZv4, new SerialDescriptor[0], new r3s1LDPKFs1S(24, (re1) this.wdg6QnbFHrFF));
            case 20:
                ((mo) this.OPXfSBeufaJ8).Y1f8riQaR6yg = (pe0) this.wdg6QnbFHrFF;
                return no2.PxuCJdSBwIXG;
            case 21:
                wr1 wr1Var = (wr1) this.OPXfSBeufaJ8;
                String str4 = (String) this.wdg6QnbFHrFF;
                str4.getClass();
                l92 l92Var2 = wr1Var.e9gEMXR7LXtO;
                l92Var2.getClass();
                l92Var2.OPXfSBeufaJ8(null, str4);
                return no2.PxuCJdSBwIXG;
            case 22:
                w81 w81Var = (w81) this.OPXfSBeufaJ8;
                zp zpVar = (zp) this.wdg6QnbFHrFF;
                Object[] objArr = w81Var.lS5Rgt96tfkO;
                long[] jArr = w81Var.PxuCJdSBwIXG;
                int length2 = jArr.length - 2;
                if (length2 >= 0) {
                    int i8 = 0;
                    while (true) {
                        long j3 = jArr[i8];
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i9 = 8 - ((~(i8 - length2)) >>> 31);
                            for (int i10 = 0; i10 < i9; i10++) {
                                if ((255 & j3) < 128) {
                                    zpVar.IAToe7bXGz4N(objArr[(i8 << 3) + i10]);
                                }
                                j3 >>= 8;
                            }
                            if (i9 != 8) {
                            }
                        }
                        if (i8 != length2) {
                            i8++;
                        }
                    }
                }
                return no2.PxuCJdSBwIXG;
            case 23:
                Context context = (Context) this.OPXfSBeufaJ8;
                TextClassification textClassification = (TextClassification) this.wdg6QnbFHrFF;
                text = textClassification.getText();
                r10 = text != null ? text.hashCode() : 0;
                intent = textClassification.getIntent();
                PendingIntent activity = PendingIntent.getActivity(context, r10, intent, 201326592);
                if (Build.VERSION.SDK_INT >= 34) {
                    try {
                        pendingIntentBackgroundActivityStartMode = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1);
                        activity.send(pendingIntentBackgroundActivityStartMode.toBundle());
                    } catch (PendingIntent.CanceledException e3) {
                        Log.e("TextClassification", "error sending pendingIntent: " + activity + " error: " + e3);
                    }
                } else {
                    activity.send();
                }
                return no2.PxuCJdSBwIXG;
            case 24:
                fx1.KUoIVIumpKat((ru) this.OPXfSBeufaJ8, null, new ew((le0) this.wdg6QnbFHrFF, r9, 14), 1);
                return no2.PxuCJdSBwIXG;
            default:
                eh2 eh2Var = (eh2) this.OPXfSBeufaJ8;
                long j4 = ((ir0) ((d91) this.wdg6QnbFHrFF).getValue()).PxuCJdSBwIXG;
                bf1 OPXfSBeufaJ82 = eh2Var.OPXfSBeufaJ8();
                if (OPXfSBeufaJ82 != null) {
                    long j5 = OPXfSBeufaJ82.PxuCJdSBwIXG;
                    v8 cpQdD2nAriOS = eh2Var.cpQdD2nAriOS();
                    if (cpQdD2nAriOS == null || cpQdD2nAriOS.OPXfSBeufaJ8.length() == 0) {
                        bf1.Companion.getClass();
                    } else {
                        ji0 ji0Var = (ji0) eh2Var.BRwzKIf41E4i.getValue();
                        int i11 = ji0Var == null ? -1 : gh2.PxuCJdSBwIXG[ji0Var.ordinal()];
                        if (i11 != -1) {
                            if (i11 == 1 || i11 == 2) {
                                long j6 = eh2Var.r3s1LDPKFs1S().lS5Rgt96tfkO;
                                ui2 ui2Var = vi2.Companion;
                                j2 = j6 >> 32;
                            } else {
                                if (i11 != 3) {
                                    u9.gPXPFXrUH4XX();
                                    return null;
                                }
                                long j7 = eh2Var.r3s1LDPKFs1S().lS5Rgt96tfkO;
                                ui2 ui2Var2 = vi2.Companion;
                                j2 = j7 & 4294967295L;
                            }
                            int i12 = (int) j2;
                            yz0 yz0Var = eh2Var.Y1f8riQaR6yg;
                            if (yz0Var == null || (Y1f8riQaR6yg = yz0Var.Y1f8riQaR6yg()) == null) {
                                bf1.Companion.getClass();
                            } else {
                                yz0 yz0Var2 = eh2Var.Y1f8riQaR6yg;
                                if (yz0Var2 == null || (v8Var = yz0Var2.PxuCJdSBwIXG.PxuCJdSBwIXG) == null) {
                                    bf1.Companion.getClass();
                                } else {
                                    int wdg6QnbFHrFF = ng0.wdg6QnbFHrFF(eh2Var.lS5Rgt96tfkO.lS5Rgt96tfkO(i12), 0, v8Var.OPXfSBeufaJ8.length());
                                    float intBitsToFloat = Float.intBitsToFloat((int) (Y1f8riQaR6yg.Y1f8riQaR6yg(j5) >> 32));
                                    ji2 ji2Var = Y1f8riQaR6yg.PxuCJdSBwIXG;
                                    r71 r71Var = ji2Var.lS5Rgt96tfkO;
                                    int Y1f8riQaR6yg3 = r71Var.Y1f8riQaR6yg(wdg6QnbFHrFF);
                                    float Y1f8riQaR6yg4 = ji2Var.Y1f8riQaR6yg(Y1f8riQaR6yg3);
                                    float e9gEMXR7LXtO = ji2Var.e9gEMXR7LXtO(Y1f8riQaR6yg3);
                                    float OPXfSBeufaJ83 = ng0.OPXfSBeufaJ8(intBitsToFloat, Math.min(Y1f8riQaR6yg4, e9gEMXR7LXtO), Math.max(Y1f8riQaR6yg4, e9gEMXR7LXtO));
                                    ir0.Companion.getClass();
                                    if (ir0.PxuCJdSBwIXG(j4, 0L) || Math.abs(intBitsToFloat - OPXfSBeufaJ83) <= ((int) (j4 >> 32)) / 2) {
                                        float a92UlCVFR9N8 = r71Var.a92UlCVFR9N8(Y1f8riQaR6yg3);
                                        j = (Float.floatToRawIntBits(OPXfSBeufaJ83) << 32) | (Float.floatToRawIntBits(((r71Var.lS5Rgt96tfkO(Y1f8riQaR6yg3) - a92UlCVFR9N8) / 2.0f) + a92UlCVFR9N8) & 4294967295L);
                                        return new bf1(j);
                                    }
                                    bf1.Companion.getClass();
                                }
                            }
                        } else {
                            bf1.Companion.getClass();
                        }
                    }
                } else {
                    bf1.Companion.getClass();
                }
                j = 9205357640488583168L;
                return new bf1(j);
        }
    }

    public /* synthetic */ e6(int i, Object obj, Object obj2) {
        this.rtx2ld2ELZv4 = i;
        this.OPXfSBeufaJ8 = obj;
        this.wdg6QnbFHrFF = obj2;
    }

    public /* synthetic */ e6(fa1 fa1Var, x91 x91Var, boolean z) {
        this.rtx2ld2ELZv4 = 17;
        this.OPXfSBeufaJ8 = fa1Var;
        this.wdg6QnbFHrFF = x91Var;
    }
}
