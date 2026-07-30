package defpackage;

import android.graphics.Insets;
import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.WindowInsetsAnimation;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class cr1 implements tz1, c22 {
    public Object OPXfSBeufaJ8;
    public final /* synthetic */ int rtx2ld2ELZv4;
    public Object wdg6QnbFHrFF;

    public cr1(int i) {
        this.rtx2ld2ELZv4 = i;
        switch (i) {
            case 7:
                break;
            case 8:
                this.OPXfSBeufaJ8 = new ib0(18);
                this.wdg6QnbFHrFF = new b41(16);
                break;
            case 9:
            case 11:
            case 12:
            case 13:
            default:
                this.OPXfSBeufaJ8 = new LinkedHashMap();
                this.wdg6QnbFHrFF = new LinkedHashMap();
                break;
            case 10:
                this.OPXfSBeufaJ8 = new f91(new Reference[16]);
                this.wdg6QnbFHrFF = new ReferenceQueue();
                break;
            case 14:
                this.OPXfSBeufaJ8 = Collections.synchronizedMap(new WeakHashMap());
                this.wdg6QnbFHrFF = Collections.synchronizedMap(new WeakHashMap());
                break;
            case 15:
                bh0 bh0Var = bh0.Y1f8riQaR6yg;
                this.OPXfSBeufaJ8 = new SparseIntArray();
                this.wdg6QnbFHrFF = bh0Var;
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e0, code lost:
    
        if (r11 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ec, code lost:
    
        r9 = r5;
        r16 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0117, code lost:
    
        if (r13 == null) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void OPXfSBeufaJ8(js1 js1Var, nv1 nv1Var) {
        o82 XL4ISE6Oc65B;
        y52 BRwzKIf41E4i;
        int intValue;
        int i;
        hj0 hj0Var;
        int i2;
        String str;
        try {
            g82 PxuCJdSBwIXG = ((vs1) this.OPXfSBeufaJ8).PxuCJdSBwIXG(nv1Var);
            cs2 cs2Var = ds2.Companion;
            hj0 hj0Var2 = nv1Var.cpQdD2nAriOS;
            cs2Var.getClass();
            int size = hj0Var2.size();
            int i3 = 0;
            int i4 = 0;
            boolean z = 0;
            boolean z2 = 0;
            boolean z3 = 0;
            boolean z4 = 0;
            Integer num = null;
            Integer num2 = null;
            while (i4 < size) {
                int i5 = 1;
                if (hj0Var2.lS5Rgt96tfkO(i4).equalsIgnoreCase("Sec-WebSocket-Extensions")) {
                    String Y1f8riQaR6yg = hj0Var2.Y1f8riQaR6yg(i4);
                    int i6 = i3;
                    z = z;
                    z2 = z2;
                    z3 = z3;
                    z4 = z4;
                    while (i6 < Y1f8riQaR6yg.length()) {
                        int i7 = size;
                        int Y1f8riQaR6yg2 = kv2.Y1f8riQaR6yg(Y1f8riQaR6yg, ',', i6, i3, 4);
                        int TSizfFm2Yiuu = kv2.TSizfFm2Yiuu(Y1f8riQaR6yg, ';', i6, Y1f8riQaR6yg2);
                        int RAsUl2FVSrh6 = kv2.RAsUl2FVSrh6(i6, TSizfFm2Yiuu, Y1f8riQaR6yg);
                        String substring = Y1f8riQaR6yg.substring(RAsUl2FVSrh6, kv2.rtx2ld2ELZv4(RAsUl2FVSrh6, TSizfFm2Yiuu, Y1f8riQaR6yg));
                        i6 = TSizfFm2Yiuu + 1;
                        int i8 = z4;
                        if (substring.equalsIgnoreCase("permessage-deflate")) {
                            if (z != 0) {
                                i8 = i5;
                            }
                            while (i6 < Y1f8riQaR6yg2) {
                                int TSizfFm2Yiuu2 = kv2.TSizfFm2Yiuu(Y1f8riQaR6yg, ';', i6, Y1f8riQaR6yg2);
                                int TSizfFm2Yiuu3 = kv2.TSizfFm2Yiuu(Y1f8riQaR6yg, '=', i6, TSizfFm2Yiuu2);
                                int RAsUl2FVSrh62 = kv2.RAsUl2FVSrh6(i6, TSizfFm2Yiuu3, Y1f8riQaR6yg);
                                String substring2 = Y1f8riQaR6yg.substring(RAsUl2FVSrh62, kv2.rtx2ld2ELZv4(RAsUl2FVSrh62, TSizfFm2Yiuu3, Y1f8riQaR6yg));
                                if (TSizfFm2Yiuu3 < TSizfFm2Yiuu2) {
                                    int RAsUl2FVSrh63 = kv2.RAsUl2FVSrh6(TSizfFm2Yiuu3 + 1, TSizfFm2Yiuu2, Y1f8riQaR6yg);
                                    str = Y1f8riQaR6yg.substring(RAsUl2FVSrh63, kv2.rtx2ld2ELZv4(RAsUl2FVSrh63, TSizfFm2Yiuu2, Y1f8riQaR6yg));
                                    i = Y1f8riQaR6yg2;
                                    hj0Var = hj0Var2;
                                    if (str.length() < 2) {
                                        i2 = i5;
                                    } else if (pa2.yQRudnv4La6p(str, "\"", false) && ia2.PsecLrZVVK61(str, "\"")) {
                                        i2 = i5;
                                        str = str.substring(i2, str.length() - 1);
                                    } else {
                                        i2 = i5;
                                    }
                                } else {
                                    i = Y1f8riQaR6yg2;
                                    hj0Var = hj0Var2;
                                    i2 = i5;
                                    str = null;
                                }
                                int i9 = TSizfFm2Yiuu2 + 1;
                                i8 = i8;
                                if (substring2.equalsIgnoreCase("client_max_window_bits")) {
                                    if (num != null) {
                                        i8 = i2;
                                    }
                                    num = str != null ? pa2.KUoIVIumpKat(str) : null;
                                } else {
                                    i8 = i8;
                                    if (substring2.equalsIgnoreCase("client_no_context_takeover")) {
                                        if (z2 != 0) {
                                            i8 = i2;
                                        }
                                        if (str != null) {
                                            i8 = i2;
                                        }
                                        i6 = i9;
                                        z2 = i2;
                                        i5 = z2 ? 1 : 0;
                                    } else {
                                        i8 = i8;
                                        if (substring2.equalsIgnoreCase("server_max_window_bits")) {
                                            if (num2 != null) {
                                                i8 = i2;
                                            }
                                            num2 = str != null ? pa2.KUoIVIumpKat(str) : null;
                                        } else {
                                            i8 = i8;
                                            if (substring2.equalsIgnoreCase("server_no_context_takeover")) {
                                                if (z3 != 0) {
                                                    i8 = i2;
                                                }
                                                if (str != null) {
                                                    i8 = i2;
                                                }
                                                i6 = i9;
                                                z3 = i2;
                                                i5 = z3 ? 1 : 0;
                                            }
                                        }
                                        i6 = i9;
                                        i8 = i2;
                                        i5 = i8 == true ? 1 : 0;
                                    }
                                }
                                Y1f8riQaR6yg2 = i;
                                hj0Var2 = hj0Var;
                            }
                            z = i5;
                        } else {
                            i8 = i5;
                        }
                        size = i7;
                        i3 = 0;
                        z = z;
                        z2 = z2;
                        z3 = z3;
                        z4 = i8;
                    }
                }
                i4++;
                i3 = i3;
                size = size;
                hj0Var2 = hj0Var2;
                z = z;
                z2 = z2;
                z3 = z3;
                z4 = z4;
            }
            int i10 = 1;
            ((vs1) this.OPXfSBeufaJ8).Y1f8riQaR6yg = new ds2(z, num, z2, num2, z3, z4);
            if (z4 != 0 || num != null || (num2 != null && (8 > (intValue = num2.intValue()) || intValue >= 16))) {
                vs1 vs1Var = (vs1) this.OPXfSBeufaJ8;
                synchronized (vs1Var) {
                    vs1Var.gPXPFXrUH4XX.clear();
                    vs1Var.lS5Rgt96tfkO("unexpected Sec-WebSocket-Extensions in response header", 1010);
                }
            }
            String str2 = mv2.lS5Rgt96tfkO + " WebSocket " + ((gm0) ((xb) this.wdg6QnbFHrFF).lS5Rgt96tfkO).a92UlCVFR9N8();
            vs1 vs1Var2 = (vs1) this.OPXfSBeufaJ8;
            m9 m9Var = new m9(PxuCJdSBwIXG);
            ds2 ds2Var = vs1Var2.Y1f8riQaR6yg;
            ds2Var.getClass();
            synchronized (vs1Var2) {
                try {
                    vs1Var2.cpQdD2nAriOS = str2;
                    vs1Var2.r3s1LDPKFs1S = m9Var;
                    vs1Var2.dgRBjINgWbAK = new fs2((ds1) m9Var.dgRBjINgWbAK, vs1Var2.lS5Rgt96tfkO, ds2Var.PxuCJdSBwIXG, ds2Var.TSizfFm2Yiuu, vs1Var2.e9gEMXR7LXtO);
                    vs1Var2.OPXfSBeufaJ8 = new ns1(vs1Var2);
                    long j = vs1Var2.TSizfFm2Yiuu;
                    if (j != 0) {
                        long nanos = TimeUnit.MILLISECONDS.toNanos(j);
                        zd2 zd2Var = vs1Var2.x50lh2ztY7Y5;
                        String concat = str2.concat(" ping");
                        al0 al0Var = new al0(vs1Var2, nanos, i10);
                        zd2Var.getClass();
                        zd2Var.TSizfFm2Yiuu(new yd2(concat, al0Var), nanos);
                    }
                    if (!vs1Var2.gPXPFXrUH4XX.isEmpty()) {
                        vs1Var2.e9gEMXR7LXtO();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            vs1Var2.wdg6QnbFHrFF = new es2((es1) m9Var.wdg6QnbFHrFF, vs1Var2, ds2Var.PxuCJdSBwIXG, ds2Var.e9gEMXR7LXtO);
            vs1 vs1Var3 = (vs1) this.OPXfSBeufaJ8;
            try {
                vs1Var3.PxuCJdSBwIXG.S9EYkSpbGuxq(vs1Var3, nv1Var);
                while (vs1Var3.RfyTYNmI9Srp == -1) {
                    es2 es2Var = vs1Var3.wdg6QnbFHrFF;
                    es2Var.getClass();
                    es2Var.lS5Rgt96tfkO();
                }
            } catch (Exception e) {
                vs1.TSizfFm2Yiuu(vs1Var3, e, 6);
            } finally {
                vs1Var3.Y1f8riQaR6yg();
            }
        } catch (IOException e2) {
            vs1.TSizfFm2Yiuu((vs1) this.OPXfSBeufaJ8, e2, 4);
            kv2.PxuCJdSBwIXG(nv1Var);
            g82 g82Var = nv1Var.QrzZRwfaDlRX;
            if (g82Var != null && (BRwzKIf41E4i = g82Var.BRwzKIf41E4i()) != null) {
                kv2.PxuCJdSBwIXG(BRwzKIf41E4i);
            }
            g82 g82Var2 = nv1Var.QrzZRwfaDlRX;
            if (g82Var2 == null || (XL4ISE6Oc65B = g82Var2.XL4ISE6Oc65B()) == null) {
                return;
            }
            kv2.PxuCJdSBwIXG(XL4ISE6Oc65B);
        }
    }

    @Override // defpackage.c22
    public int PxuCJdSBwIXG(int i) {
        do {
            i = ((tu2) this.wdg6QnbFHrFF).OPXfSBeufaJ8(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.OPXfSBeufaJ8).charAt(i)));
        return i;
    }

    public Bundle RAsUl2FVSrh6(String str) {
        Bundle bundle;
        pz1 pz1Var = (pz1) this.OPXfSBeufaJ8;
        if (!pz1Var.RAsUl2FVSrh6) {
            u9.rtx2ld2ELZv4("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
            return null;
        }
        Bundle bundle2 = pz1Var.a92UlCVFR9N8;
        if (bundle2 == null) {
            return null;
        }
        if (bundle2.containsKey(str)) {
            bundle = bundle2.getBundle(str);
            if (bundle == null) {
                xi0.ryVscX7ZL4Ux(str);
                throw null;
            }
        } else {
            bundle = null;
        }
        bundle2.remove(str);
        if (bundle2.isEmpty()) {
            pz1Var.a92UlCVFR9N8 = null;
        }
        return bundle;
    }

    @Override // defpackage.tz1
    public Object TSizfFm2Yiuu(Object obj) {
        return ((le0) this.wdg6QnbFHrFF).OPXfSBeufaJ8(obj);
    }

    @Override // defpackage.c22
    public int Y1f8riQaR6yg(int i) {
        CharSequence charSequence = (CharSequence) this.OPXfSBeufaJ8;
        do {
            i = ((tu2) this.wdg6QnbFHrFF).rtx2ld2ELZv4(i);
            if (i == -1 || i == charSequence.length()) {
                return -1;
            }
        } while (Character.isWhitespace(charSequence.charAt(i)));
        return i;
    }

    @Override // defpackage.tz1
    public Object a92UlCVFR9N8(vy1 vy1Var, Object obj) {
        return ((pe0) this.OPXfSBeufaJ8).rtx2ld2ELZv4(vy1Var, obj);
    }

    public void dgRBjINgWbAK() {
        if (!((pz1) this.OPXfSBeufaJ8).rtx2ld2ELZv4) {
            u9.rtx2ld2ELZv4("Can not perform this action after onSaveInstanceState");
            return;
        }
        nt1 nt1Var = (nt1) this.wdg6QnbFHrFF;
        if (nt1Var == null) {
            nt1Var = new nt1(this);
        }
        this.wdg6QnbFHrFF = nt1Var;
        try {
            xz0.class.getDeclaredConstructor(null);
            nt1 nt1Var2 = (nt1) this.wdg6QnbFHrFF;
            if (nt1Var2 != null) {
                nt1Var2.PxuCJdSBwIXG.add(xz0.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + xz0.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }

    @Override // defpackage.c22
    public int e9gEMXR7LXtO(int i) {
        do {
            i = ((tu2) this.wdg6QnbFHrFF).OPXfSBeufaJ8(i);
            if (i == -1 || i == 0) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.OPXfSBeufaJ8).charAt(i - 1)));
        return i;
    }

    @Override // defpackage.c22
    public int lS5Rgt96tfkO(int i) {
        do {
            i = ((tu2) this.wdg6QnbFHrFF).rtx2ld2ELZv4(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.OPXfSBeufaJ8).charAt(i - 1)));
        return i;
    }

    public lz1 rtx2ld2ELZv4(String str) {
        lz1 lz1Var;
        pz1 pz1Var = (pz1) this.OPXfSBeufaJ8;
        synchronized (pz1Var.TSizfFm2Yiuu) {
            Iterator it = pz1Var.Y1f8riQaR6yg.entrySet().iterator();
            do {
                lz1Var = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str2 = (String) entry.getKey();
                lz1 lz1Var2 = (lz1) entry.getValue();
                if (cs0.wdg6QnbFHrFF(str2, str)) {
                    lz1Var = lz1Var2;
                }
            } while (lz1Var == null);
        }
        return lz1Var;
    }

    public String toString() {
        switch (this.rtx2ld2ELZv4) {
            case 11:
                return "Bounds{lower=" + ((wp0) this.OPXfSBeufaJ8) + " upper=" + ((wp0) this.wdg6QnbFHrFF) + "}";
            default:
                return super.toString();
        }
    }

    public void wdg6QnbFHrFF(String str, lz1 lz1Var) {
        lz1Var.getClass();
        pz1 pz1Var = (pz1) this.OPXfSBeufaJ8;
        synchronized (pz1Var.TSizfFm2Yiuu) {
            if (pz1Var.Y1f8riQaR6yg.containsKey(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            pz1Var.Y1f8riQaR6yg.put(str, lz1Var);
        }
    }

    public void x50lh2ztY7Y5(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (((Map) this.OPXfSBeufaJ8)) {
            hashMap = new HashMap((Map) this.OPXfSBeufaJ8);
        }
        synchronized (((Map) this.wdg6QnbFHrFF)) {
            hashMap2 = new HashMap((Map) this.wdg6QnbFHrFF);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                entry.getKey().getClass();
                u9.VhhvGxCb8gfr();
                return;
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((vd2) entry2.getKey()).PxuCJdSBwIXG(new i9(status));
            }
        }
    }

    public /* synthetic */ cr1(int i, Object obj, Object obj2, boolean z) {
        this.rtx2ld2ELZv4 = i;
        this.wdg6QnbFHrFF = obj;
        this.OPXfSBeufaJ8 = obj2;
    }

    public cr1(pz1 pz1Var) {
        this.rtx2ld2ELZv4 = 4;
        this.OPXfSBeufaJ8 = pz1Var;
    }

    public /* synthetic */ cr1(int i, Object obj, Object obj2) {
        this.rtx2ld2ELZv4 = i;
        this.OPXfSBeufaJ8 = obj;
        this.wdg6QnbFHrFF = obj2;
    }

    public cr1(WindowInsetsAnimation.Bounds bounds) {
        Insets lowerBound;
        Insets upperBound;
        this.rtx2ld2ELZv4 = 11;
        lowerBound = bounds.getLowerBound();
        this.OPXfSBeufaJ8 = wp0.Y1f8riQaR6yg(lowerBound);
        upperBound = bounds.getUpperBound();
        this.wdg6QnbFHrFF = wp0.Y1f8riQaR6yg(upperBound);
    }
}
