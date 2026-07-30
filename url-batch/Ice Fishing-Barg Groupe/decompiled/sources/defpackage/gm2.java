package defpackage;

import com.ice.fishing.grenza.data.db.AppDatabase_Impl;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class gm2 {
    public static final xl2 Companion = new xl2();
    public static final String[] x50lh2ztY7Y5 = {"INSERT", "UPDATE", "DELETE"};
    public final i2 OPXfSBeufaJ8;
    public final AppDatabase_Impl PxuCJdSBwIXG;
    public final String[] RAsUl2FVSrh6;
    public final LinkedHashMap TSizfFm2Yiuu;
    public final boolean Y1f8riQaR6yg;
    public final RAsUl2FVSrh6 e9gEMXR7LXtO;
    public final LinkedHashMap lS5Rgt96tfkO;
    public final ue1 rtx2ld2ELZv4;
    public final AtomicBoolean wdg6QnbFHrFF = new AtomicBoolean(false);
    public ae0 dgRBjINgWbAK = new j21(21);
    public final LinkedHashMap a92UlCVFR9N8 = new LinkedHashMap();

    public gm2(AppDatabase_Impl appDatabase_Impl, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, String[] strArr, boolean z, RAsUl2FVSrh6 rAsUl2FVSrh6) {
        String str;
        this.PxuCJdSBwIXG = appDatabase_Impl;
        this.lS5Rgt96tfkO = linkedHashMap;
        this.TSizfFm2Yiuu = linkedHashMap2;
        this.Y1f8riQaR6yg = z;
        this.e9gEMXR7LXtO = rAsUl2FVSrh6;
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            String str2 = strArr[i];
            Locale locale = Locale.ROOT;
            String lowerCase = str2.toLowerCase(locale);
            lowerCase.getClass();
            this.a92UlCVFR9N8.put(lowerCase, Integer.valueOf(i));
            String str3 = (String) this.lS5Rgt96tfkO.get(strArr[i]);
            if (str3 != null) {
                str = str3.toLowerCase(locale);
                str.getClass();
            } else {
                str = null;
            }
            if (str != null) {
                lowerCase = str;
            }
            strArr2[i] = lowerCase;
        }
        this.RAsUl2FVSrh6 = strArr2;
        for (Map.Entry entry : this.lS5Rgt96tfkO.entrySet()) {
            String str4 = (String) entry.getValue();
            Locale locale2 = Locale.ROOT;
            String lowerCase2 = str4.toLowerCase(locale2);
            lowerCase2.getClass();
            if (this.a92UlCVFR9N8.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(locale2);
                lowerCase3.getClass();
                LinkedHashMap linkedHashMap3 = this.a92UlCVFR9N8;
                linkedHashMap3.put(lowerCase3, w41.POWyO8hTM6YC(lowerCase2, linkedHashMap3));
            }
        }
        this.rtx2ld2ELZv4 = new ue1(this.RAsUl2FVSrh6.length);
        this.OPXfSBeufaJ8 = new i2(this.RAsUl2FVSrh6.length);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0052, code lost:
    
        if (r4 == r3) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object PxuCJdSBwIXG(gm2 gm2Var, oo1 oo1Var, ct ctVar) {
        yl2 yl2Var;
        int i;
        Set set;
        gm2Var.getClass();
        if (ctVar instanceof yl2) {
            yl2Var = (yl2) ctVar;
            int i2 = yl2Var.r3s1LDPKFs1S;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yl2Var.r3s1LDPKFs1S = i2 - Integer.MIN_VALUE;
                Object obj = yl2Var.x50lh2ztY7Y5;
                i = yl2Var.r3s1LDPKFs1S;
                int i3 = 2;
                su suVar = su.rtx2ld2ELZv4;
                if (i != 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    uk2 uk2Var = new uk2(i3);
                    yl2Var.dgRBjINgWbAK = oo1Var;
                    yl2Var.r3s1LDPKFs1S = 1;
                    obj = oo1Var.Y1f8riQaR6yg("SELECT * FROM room_table_modification_log WHERE invalidated = 1", uk2Var, yl2Var);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Set set2 = (Set) yl2Var.dgRBjINgWbAK;
                        ng0.tmVwIGCQF4zR(obj);
                        return set2;
                    }
                    oo1Var = (oo1) yl2Var.dgRBjINgWbAK;
                    ng0.tmVwIGCQF4zR(obj);
                }
                set = (Set) obj;
                if (!set.isEmpty()) {
                    yl2Var.dgRBjINgWbAK = set;
                    yl2Var.r3s1LDPKFs1S = 2;
                    if (ng0.XL4ISE6Oc65B(oo1Var, "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1", yl2Var) == suVar) {
                        return suVar;
                    }
                }
                return set;
            }
        }
        yl2Var = new yl2(gm2Var, ctVar);
        Object obj2 = yl2Var.x50lh2ztY7Y5;
        i = yl2Var.r3s1LDPKFs1S;
        int i32 = 2;
        su suVar2 = su.rtx2ld2ELZv4;
        if (i != 0) {
        }
        set = (Set) obj2;
        if (!set.isEmpty()) {
        }
        return set;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00e9, code lost:
    
        if (defpackage.ng0.XL4ISE6Oc65B(r7, r15, r0) == r4) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00eb, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0069, code lost:
    
        if (r15 == r4) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r13v5, types: [oo1] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00e9 -> B:11:0x00ec). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object TSizfFm2Yiuu(gm2 gm2Var, tk2 tk2Var, int i, ct ctVar) {
        cm2 cm2Var;
        int i2;
        tk2 tk2Var2;
        int i3;
        int i4;
        String[] strArr;
        oo1 oo1Var;
        int i5;
        String str;
        gm2Var.getClass();
        if (ctVar instanceof cm2) {
            cm2Var = (cm2) ctVar;
            int i6 = cm2Var.RfyTYNmI9Srp;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                cm2Var.RfyTYNmI9Srp = i6 - Integer.MIN_VALUE;
                Object obj = cm2Var.BRwzKIf41E4i;
                i2 = cm2Var.RfyTYNmI9Srp;
                su suVar = su.rtx2ld2ELZv4;
                if (i2 != 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    cm2Var.dgRBjINgWbAK = tk2Var;
                    cm2Var.r3s1LDPKFs1S = i;
                    cm2Var.RfyTYNmI9Srp = 1;
                    Object XL4ISE6Oc65B = ng0.XL4ISE6Oc65B(tk2Var, "INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i + ", 0)", cm2Var);
                    tk2Var2 = tk2Var;
                } else if (i2 == 1) {
                    i = cm2Var.r3s1LDPKFs1S;
                    ?? r13 = cm2Var.dgRBjINgWbAK;
                    ng0.tmVwIGCQF4zR(obj);
                    tk2Var2 = r13;
                } else {
                    if (i2 != 2) {
                        u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i5 = cm2Var.gPXPFXrUH4XX;
                    i4 = cm2Var.QrzZRwfaDlRX;
                    i3 = cm2Var.r3s1LDPKFs1S;
                    strArr = cm2Var.cpQdD2nAriOS;
                    str = cm2Var.x50lh2ztY7Y5;
                    oo1Var = cm2Var.dgRBjINgWbAK;
                    ng0.tmVwIGCQF4zR(obj);
                    i4++;
                    if (i4 >= i5) {
                        return no2.PxuCJdSBwIXG;
                    }
                    String str2 = strArr[i4];
                    String str3 = gm2Var.Y1f8riQaR6yg ? "TEMP" : "";
                    Companion.getClass();
                    String str4 = "CREATE " + str3 + " TRIGGER IF NOT EXISTS `" + ("room_table_modification_trigger_" + str + '_' + str2) + "` AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + i3 + " AND invalidated = 0; END";
                    cm2Var.dgRBjINgWbAK = oo1Var;
                    cm2Var.x50lh2ztY7Y5 = str;
                    cm2Var.cpQdD2nAriOS = strArr;
                    cm2Var.r3s1LDPKFs1S = i3;
                    cm2Var.QrzZRwfaDlRX = i4;
                    cm2Var.gPXPFXrUH4XX = i5;
                    cm2Var.RfyTYNmI9Srp = 2;
                }
                String str5 = gm2Var.RAsUl2FVSrh6[i];
                i3 = i;
                i4 = 0;
                strArr = x50lh2ztY7Y5;
                oo1Var = tk2Var2;
                i5 = 3;
                str = str5;
                if (i4 >= i5) {
                }
            }
        }
        cm2Var = new cm2(gm2Var, ctVar);
        Object obj2 = cm2Var.BRwzKIf41E4i;
        i2 = cm2Var.RfyTYNmI9Srp;
        su suVar2 = su.rtx2ld2ELZv4;
        if (i2 != 0) {
        }
        String str52 = gm2Var.RAsUl2FVSrh6[i];
        i3 = i;
        i4 = 0;
        strArr = x50lh2ztY7Y5;
        oo1Var = tk2Var2;
        i5 = 3;
        str = str52;
        if (i4 >= i5) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r3v4, types: [oo1] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0086 -> B:10:0x0089). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Y1f8riQaR6yg(gm2 gm2Var, tk2 tk2Var, int i, ct ctVar) {
        dm2 dm2Var;
        int i2;
        String str;
        int i3;
        tk2 tk2Var2;
        int i4;
        String[] strArr;
        gm2Var.getClass();
        if (ctVar instanceof dm2) {
            dm2Var = (dm2) ctVar;
            int i5 = dm2Var.XL4ISE6Oc65B;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                dm2Var.XL4ISE6Oc65B = i5 - Integer.MIN_VALUE;
                Object obj = dm2Var.gPXPFXrUH4XX;
                i2 = dm2Var.XL4ISE6Oc65B;
                if (i2 != 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    str = gm2Var.RAsUl2FVSrh6[i];
                    i3 = 3;
                    tk2Var2 = tk2Var;
                    i4 = 0;
                    strArr = x50lh2ztY7Y5;
                    if (i4 < i3) {
                    }
                } else {
                    if (i2 != 1) {
                        u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i3 = dm2Var.QrzZRwfaDlRX;
                    i4 = dm2Var.r3s1LDPKFs1S;
                    String[] strArr2 = dm2Var.cpQdD2nAriOS;
                    str = dm2Var.x50lh2ztY7Y5;
                    ?? r3 = dm2Var.dgRBjINgWbAK;
                    ng0.tmVwIGCQF4zR(obj);
                    strArr = strArr2;
                    tk2Var2 = r3;
                    i4++;
                    if (i4 < i3) {
                        String str2 = strArr[i4];
                        Companion.getClass();
                        String dgRBjINgWbAK = o0.dgRBjINgWbAK("DROP TRIGGER IF EXISTS `", "room_table_modification_trigger_" + str + '_' + str2, '`');
                        dm2Var.dgRBjINgWbAK = tk2Var2;
                        dm2Var.x50lh2ztY7Y5 = str;
                        dm2Var.cpQdD2nAriOS = strArr;
                        dm2Var.r3s1LDPKFs1S = i4;
                        dm2Var.QrzZRwfaDlRX = i3;
                        dm2Var.XL4ISE6Oc65B = 1;
                        Object XL4ISE6Oc65B = ng0.XL4ISE6Oc65B(tk2Var2, dgRBjINgWbAK, dm2Var);
                        su suVar = su.rtx2ld2ELZv4;
                        if (XL4ISE6Oc65B == suVar) {
                            return suVar;
                        }
                        i4++;
                        if (i4 < i3) {
                            return no2.PxuCJdSBwIXG;
                        }
                    }
                }
            }
        }
        dm2Var = new dm2(gm2Var, ctVar);
        Object obj2 = dm2Var.gPXPFXrUH4XX;
        i2 = dm2Var.XL4ISE6Oc65B;
        if (i2 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007f A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:11:0x0027, B:12:0x0074, B:14:0x007f, B:17:0x00bf, B:19:0x008e, B:20:0x0092, B:22:0x009f, B:24:0x00a9, B:26:0x00af, B:27:0x00ad, B:30:0x00b4, B:33:0x00b9), top: B:10:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object lS5Rgt96tfkO(gm2 gm2Var, ct ctVar) {
        am2 am2Var;
        int i;
        op0 op0Var;
        Set set;
        Object value;
        int[] iArr;
        AppDatabase_Impl appDatabase_Impl = gm2Var.PxuCJdSBwIXG;
        if (ctVar instanceof am2) {
            am2Var = (am2) ctVar;
            int i2 = am2Var.r3s1LDPKFs1S;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                am2Var.r3s1LDPKFs1S = i2 - Integer.MIN_VALUE;
                Object obj = am2Var.x50lh2ztY7Y5;
                i = am2Var.r3s1LDPKFs1S;
                bt btVar = null;
                int i3 = 1;
                if (i != 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    op0 op0Var2 = appDatabase_Impl.RAsUl2FVSrh6;
                    boolean x50lh2ztY7Y52 = op0Var2.x50lh2ztY7Y5();
                    t50 t50Var = t50.rtx2ld2ELZv4;
                    if (!x50lh2ztY7Y52) {
                        return t50Var;
                    }
                    try {
                        if (!gm2Var.wdg6QnbFHrFF.compareAndSet(true, false)) {
                            op0Var2.VhhvGxCb8gfr();
                            return t50Var;
                        }
                        if (!((Boolean) gm2Var.dgRBjINgWbAK.PxuCJdSBwIXG()).booleanValue()) {
                            op0Var2.VhhvGxCb8gfr();
                            return t50Var;
                        }
                        bm2 bm2Var = new bm2(gm2Var, btVar, i3);
                        am2Var.dgRBjINgWbAK = op0Var2;
                        am2Var.r3s1LDPKFs1S = 1;
                        Object wdg6QnbFHrFF = appDatabase_Impl.wdg6QnbFHrFF(false, bm2Var, am2Var);
                        su suVar = su.rtx2ld2ELZv4;
                        if (wdg6QnbFHrFF == suVar) {
                            return suVar;
                        }
                        op0Var = op0Var2;
                        obj = wdg6QnbFHrFF;
                    } catch (Throwable th) {
                        th = th;
                        op0Var = op0Var2;
                        op0Var.VhhvGxCb8gfr();
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    op0Var = am2Var.dgRBjINgWbAK;
                    try {
                        ng0.tmVwIGCQF4zR(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        op0Var.VhhvGxCb8gfr();
                        throw th;
                    }
                }
                set = (Set) obj;
                if (!set.isEmpty()) {
                    i2 i2Var = gm2Var.OPXfSBeufaJ8;
                    i2Var.getClass();
                    set.getClass();
                    if (!set.isEmpty()) {
                        l92 l92Var = (l92) i2Var.OPXfSBeufaJ8;
                        do {
                            value = l92Var.getValue();
                            int[] iArr2 = (int[]) value;
                            int length = iArr2.length;
                            iArr = new int[length];
                            for (int i4 = 0; i4 < length; i4++) {
                                iArr[i4] = set.contains(Integer.valueOf(i4)) ? iArr2[i4] + 1 : iArr2[i4];
                            }
                            f50 f50Var = fx1.a92UlCVFR9N8;
                            if (value == null) {
                                value = f50Var;
                            }
                        } while (!l92Var.OPXfSBeufaJ8(value, iArr));
                    }
                    gm2Var.e9gEMXR7LXtO.OPXfSBeufaJ8(set);
                }
                op0Var.VhhvGxCb8gfr();
                return set;
            }
        }
        am2Var = new am2(gm2Var, ctVar);
        Object obj2 = am2Var.x50lh2ztY7Y5;
        i = am2Var.r3s1LDPKFs1S;
        bt btVar2 = null;
        int i32 = 1;
        if (i != 0) {
        }
        set = (Set) obj2;
        if (!set.isEmpty()) {
        }
        op0Var.VhhvGxCb8gfr();
        return set;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e9gEMXR7LXtO(ct ctVar) {
        em2 em2Var;
        int i;
        op0 op0Var;
        if (ctVar instanceof em2) {
            em2Var = (em2) ctVar;
            int i2 = em2Var.r3s1LDPKFs1S;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                em2Var.r3s1LDPKFs1S = i2 - Integer.MIN_VALUE;
                Object obj = em2Var.x50lh2ztY7Y5;
                i = em2Var.r3s1LDPKFs1S;
                bt btVar = null;
                if (i != 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    AppDatabase_Impl appDatabase_Impl = this.PxuCJdSBwIXG;
                    op0 op0Var2 = appDatabase_Impl.RAsUl2FVSrh6;
                    if (op0Var2.x50lh2ztY7Y5()) {
                        try {
                            rtx2ld2ELZv4 rtx2ld2elzv4 = new rtx2ld2ELZv4(this, btVar, 23);
                            em2Var.dgRBjINgWbAK = op0Var2;
                            em2Var.r3s1LDPKFs1S = 1;
                            Object wdg6QnbFHrFF = appDatabase_Impl.wdg6QnbFHrFF(false, rtx2ld2elzv4, em2Var);
                            su suVar = su.rtx2ld2ELZv4;
                            if (wdg6QnbFHrFF == suVar) {
                                return suVar;
                            }
                            op0Var = op0Var2;
                        } catch (Throwable th) {
                            th = th;
                            op0Var = op0Var2;
                            op0Var.VhhvGxCb8gfr();
                            throw th;
                        }
                    }
                    return no2.PxuCJdSBwIXG;
                }
                if (i != 1) {
                    u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                op0Var = em2Var.dgRBjINgWbAK;
                try {
                    ng0.tmVwIGCQF4zR(obj);
                } catch (Throwable th2) {
                    th = th2;
                    op0Var.VhhvGxCb8gfr();
                    throw th;
                }
                op0Var.VhhvGxCb8gfr();
                return no2.PxuCJdSBwIXG;
            }
        }
        em2Var = new em2(this, ctVar);
        Object obj2 = em2Var.x50lh2ztY7Y5;
        i = em2Var.r3s1LDPKFs1S;
        bt btVar2 = null;
        if (i != 0) {
        }
        op0Var.VhhvGxCb8gfr();
        return no2.PxuCJdSBwIXG;
    }
}
