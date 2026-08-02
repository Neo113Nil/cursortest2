package defpackage;

import android.os.StrictMode;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class enk implements Thread.UncaughtExceptionHandler {
    final /* synthetic */ enl a;
    private final Thread.UncaughtExceptionHandler b;

    public enk(enl enlVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.a = enlVar;
        this.b = uncaughtExceptionHandler;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x049e A[Catch: all -> 0x0544, Exception -> 0x0548, TryCatch #1 {Exception -> 0x0548, blocks: (B:3:0x0006, B:5:0x002a, B:6:0x002d, B:8:0x0041, B:10:0x0047, B:11:0x004a, B:14:0x0057, B:16:0x006d, B:17:0x0070, B:19:0x0086, B:20:0x0089, B:22:0x00ba, B:24:0x00c8, B:26:0x00ce, B:28:0x00db, B:29:0x00eb, B:31:0x00f1, B:33:0x00ff, B:34:0x0101, B:36:0x0107, B:38:0x0113, B:40:0x011f, B:41:0x0122, B:43:0x0141, B:44:0x0144, B:45:0x0156, B:48:0x0161, B:50:0x016a, B:52:0x0172, B:54:0x017e, B:55:0x0180, B:57:0x0186, B:60:0x0196, B:61:0x019a, B:63:0x01aa, B:64:0x01ad, B:66:0x01cc, B:67:0x01cf, B:69:0x01ec, B:70:0x01ef, B:72:0x0203, B:79:0x0210, B:81:0x021e, B:82:0x0221, B:86:0x0166, B:88:0x0231, B:90:0x023d, B:92:0x024f, B:94:0x025b, B:96:0x0267, B:97:0x026a, B:99:0x0287, B:100:0x028a, B:102:0x0299, B:108:0x02a2, B:110:0x02ad, B:111:0x02b0, B:114:0x02ea, B:116:0x02f2, B:117:0x02f5, B:119:0x030a, B:120:0x030d, B:122:0x032a, B:123:0x032d, B:125:0x0340, B:127:0x034c, B:129:0x0352, B:130:0x037a, B:132:0x0380, B:189:0x0384, B:191:0x0397, B:192:0x039a, B:149:0x041a, B:152:0x0422, B:153:0x0429, B:155:0x0430, B:157:0x0449, B:158:0x044c, B:160:0x045a, B:162:0x0460, B:165:0x0468, B:167:0x0470, B:168:0x0473, B:170:0x0481, B:171:0x0487, B:172:0x048c, B:174:0x049e, B:175:0x04a1, B:177:0x04ad, B:178:0x04b3, B:180:0x04ba, B:182:0x04c8, B:183:0x04cb, B:184:0x04da, B:186:0x04e8, B:187:0x04eb, B:134:0x03a9, B:144:0x03be, B:146:0x03d1, B:147:0x03d4, B:136:0x03e1, B:138:0x03e7, B:141:0x0406, B:195:0x04fa, B:197:0x0506, B:198:0x053a, B:206:0x0509, B:208:0x0517, B:209:0x051a, B:211:0x0520, B:212:0x0523, B:214:0x052f, B:215:0x0532, B:216:0x02c9, B:219:0x02d4, B:222:0x02de, B:230:0x00a2), top: B:2:0x0006, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x04ad A[Catch: all -> 0x0544, Exception -> 0x0548, TryCatch #1 {Exception -> 0x0548, blocks: (B:3:0x0006, B:5:0x002a, B:6:0x002d, B:8:0x0041, B:10:0x0047, B:11:0x004a, B:14:0x0057, B:16:0x006d, B:17:0x0070, B:19:0x0086, B:20:0x0089, B:22:0x00ba, B:24:0x00c8, B:26:0x00ce, B:28:0x00db, B:29:0x00eb, B:31:0x00f1, B:33:0x00ff, B:34:0x0101, B:36:0x0107, B:38:0x0113, B:40:0x011f, B:41:0x0122, B:43:0x0141, B:44:0x0144, B:45:0x0156, B:48:0x0161, B:50:0x016a, B:52:0x0172, B:54:0x017e, B:55:0x0180, B:57:0x0186, B:60:0x0196, B:61:0x019a, B:63:0x01aa, B:64:0x01ad, B:66:0x01cc, B:67:0x01cf, B:69:0x01ec, B:70:0x01ef, B:72:0x0203, B:79:0x0210, B:81:0x021e, B:82:0x0221, B:86:0x0166, B:88:0x0231, B:90:0x023d, B:92:0x024f, B:94:0x025b, B:96:0x0267, B:97:0x026a, B:99:0x0287, B:100:0x028a, B:102:0x0299, B:108:0x02a2, B:110:0x02ad, B:111:0x02b0, B:114:0x02ea, B:116:0x02f2, B:117:0x02f5, B:119:0x030a, B:120:0x030d, B:122:0x032a, B:123:0x032d, B:125:0x0340, B:127:0x034c, B:129:0x0352, B:130:0x037a, B:132:0x0380, B:189:0x0384, B:191:0x0397, B:192:0x039a, B:149:0x041a, B:152:0x0422, B:153:0x0429, B:155:0x0430, B:157:0x0449, B:158:0x044c, B:160:0x045a, B:162:0x0460, B:165:0x0468, B:167:0x0470, B:168:0x0473, B:170:0x0481, B:171:0x0487, B:172:0x048c, B:174:0x049e, B:175:0x04a1, B:177:0x04ad, B:178:0x04b3, B:180:0x04ba, B:182:0x04c8, B:183:0x04cb, B:184:0x04da, B:186:0x04e8, B:187:0x04eb, B:134:0x03a9, B:144:0x03be, B:146:0x03d1, B:147:0x03d4, B:136:0x03e1, B:138:0x03e7, B:141:0x0406, B:195:0x04fa, B:197:0x0506, B:198:0x053a, B:206:0x0509, B:208:0x0517, B:209:0x051a, B:211:0x0520, B:212:0x0523, B:214:0x052f, B:215:0x0532, B:216:0x02c9, B:219:0x02d4, B:222:0x02de, B:230:0x00a2), top: B:2:0x0006, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x04ba A[Catch: all -> 0x0544, Exception -> 0x0548, TryCatch #1 {Exception -> 0x0548, blocks: (B:3:0x0006, B:5:0x002a, B:6:0x002d, B:8:0x0041, B:10:0x0047, B:11:0x004a, B:14:0x0057, B:16:0x006d, B:17:0x0070, B:19:0x0086, B:20:0x0089, B:22:0x00ba, B:24:0x00c8, B:26:0x00ce, B:28:0x00db, B:29:0x00eb, B:31:0x00f1, B:33:0x00ff, B:34:0x0101, B:36:0x0107, B:38:0x0113, B:40:0x011f, B:41:0x0122, B:43:0x0141, B:44:0x0144, B:45:0x0156, B:48:0x0161, B:50:0x016a, B:52:0x0172, B:54:0x017e, B:55:0x0180, B:57:0x0186, B:60:0x0196, B:61:0x019a, B:63:0x01aa, B:64:0x01ad, B:66:0x01cc, B:67:0x01cf, B:69:0x01ec, B:70:0x01ef, B:72:0x0203, B:79:0x0210, B:81:0x021e, B:82:0x0221, B:86:0x0166, B:88:0x0231, B:90:0x023d, B:92:0x024f, B:94:0x025b, B:96:0x0267, B:97:0x026a, B:99:0x0287, B:100:0x028a, B:102:0x0299, B:108:0x02a2, B:110:0x02ad, B:111:0x02b0, B:114:0x02ea, B:116:0x02f2, B:117:0x02f5, B:119:0x030a, B:120:0x030d, B:122:0x032a, B:123:0x032d, B:125:0x0340, B:127:0x034c, B:129:0x0352, B:130:0x037a, B:132:0x0380, B:189:0x0384, B:191:0x0397, B:192:0x039a, B:149:0x041a, B:152:0x0422, B:153:0x0429, B:155:0x0430, B:157:0x0449, B:158:0x044c, B:160:0x045a, B:162:0x0460, B:165:0x0468, B:167:0x0470, B:168:0x0473, B:170:0x0481, B:171:0x0487, B:172:0x048c, B:174:0x049e, B:175:0x04a1, B:177:0x04ad, B:178:0x04b3, B:180:0x04ba, B:182:0x04c8, B:183:0x04cb, B:184:0x04da, B:186:0x04e8, B:187:0x04eb, B:134:0x03a9, B:144:0x03be, B:146:0x03d1, B:147:0x03d4, B:136:0x03e1, B:138:0x03e7, B:141:0x0406, B:195:0x04fa, B:197:0x0506, B:198:0x053a, B:206:0x0509, B:208:0x0517, B:209:0x051a, B:211:0x0520, B:212:0x0523, B:214:0x052f, B:215:0x0532, B:216:0x02c9, B:219:0x02d4, B:222:0x02de, B:230:0x00a2), top: B:2:0x0006, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x04e8 A[Catch: all -> 0x0544, Exception -> 0x0548, TryCatch #1 {Exception -> 0x0548, blocks: (B:3:0x0006, B:5:0x002a, B:6:0x002d, B:8:0x0041, B:10:0x0047, B:11:0x004a, B:14:0x0057, B:16:0x006d, B:17:0x0070, B:19:0x0086, B:20:0x0089, B:22:0x00ba, B:24:0x00c8, B:26:0x00ce, B:28:0x00db, B:29:0x00eb, B:31:0x00f1, B:33:0x00ff, B:34:0x0101, B:36:0x0107, B:38:0x0113, B:40:0x011f, B:41:0x0122, B:43:0x0141, B:44:0x0144, B:45:0x0156, B:48:0x0161, B:50:0x016a, B:52:0x0172, B:54:0x017e, B:55:0x0180, B:57:0x0186, B:60:0x0196, B:61:0x019a, B:63:0x01aa, B:64:0x01ad, B:66:0x01cc, B:67:0x01cf, B:69:0x01ec, B:70:0x01ef, B:72:0x0203, B:79:0x0210, B:81:0x021e, B:82:0x0221, B:86:0x0166, B:88:0x0231, B:90:0x023d, B:92:0x024f, B:94:0x025b, B:96:0x0267, B:97:0x026a, B:99:0x0287, B:100:0x028a, B:102:0x0299, B:108:0x02a2, B:110:0x02ad, B:111:0x02b0, B:114:0x02ea, B:116:0x02f2, B:117:0x02f5, B:119:0x030a, B:120:0x030d, B:122:0x032a, B:123:0x032d, B:125:0x0340, B:127:0x034c, B:129:0x0352, B:130:0x037a, B:132:0x0380, B:189:0x0384, B:191:0x0397, B:192:0x039a, B:149:0x041a, B:152:0x0422, B:153:0x0429, B:155:0x0430, B:157:0x0449, B:158:0x044c, B:160:0x045a, B:162:0x0460, B:165:0x0468, B:167:0x0470, B:168:0x0473, B:170:0x0481, B:171:0x0487, B:172:0x048c, B:174:0x049e, B:175:0x04a1, B:177:0x04ad, B:178:0x04b3, B:180:0x04ba, B:182:0x04c8, B:183:0x04cb, B:184:0x04da, B:186:0x04e8, B:187:0x04eb, B:134:0x03a9, B:144:0x03be, B:146:0x03d1, B:147:0x03d4, B:136:0x03e1, B:138:0x03e7, B:141:0x0406, B:195:0x04fa, B:197:0x0506, B:198:0x053a, B:206:0x0509, B:208:0x0517, B:209:0x051a, B:211:0x0520, B:212:0x0523, B:214:0x052f, B:215:0x0532, B:216:0x02c9, B:219:0x02d4, B:222:0x02de, B:230:0x00a2), top: B:2:0x0006, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x022e  */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20, types: [int] */
    /* JADX WARN: Type inference failed for: r2v32, types: [java.lang.Object, koe] */
    /* JADX WARN: Type inference failed for: r2v68 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, jpt] */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void uncaughtException(Thread thread, Throwable th) {
        boolean z;
        gzp g;
        brn d;
        int i;
        jkj jkjVar;
        jkj k;
        jkx jkxVar;
        List list;
        boolean z2;
        int i2;
        Iterator it;
        hrk hrkVar;
        Iterator it2;
        try {
            try {
                enl enlVar = this.a;
                String name = thread.getName();
                StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
                StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                erj erjVar = enlVar.f;
                eik eikVar = enlVar.a;
                jkj k2 = lgk.a.k();
                if (!k2.b.M()) {
                    k2.t();
                }
                jkp jkpVar = k2.b;
                lgk lgkVar = (lgk) jkpVar;
                lgkVar.b |= 1;
                lgkVar.c = true;
                String b = eik.b(eikVar);
                if (b != null) {
                    if (!jkpVar.M()) {
                        k2.t();
                    }
                    lgk lgkVar2 = (lgk) k2.b;
                    lgkVar2.b |= 4;
                    lgkVar2.e = b;
                }
                try {
                    jkj k3 = lfz.a.k();
                    lfy r = ((fwm) erjVar.a).r();
                    if (!k3.b.M()) {
                        k3.t();
                    }
                    lfz lfzVar = (lfz) k3.b;
                    r.getClass();
                    lfzVar.c = r;
                    lfzVar.b |= 1;
                    if (!k2.b.M()) {
                        k2.t();
                    }
                    lgk lgkVar3 = (lgk) k2.b;
                    lfz lfzVar2 = (lfz) k3.q();
                    lfzVar2.getClass();
                    lgkVar3.d = lfzVar2;
                    lgkVar3.b |= 2;
                    z = true;
                } catch (RuntimeException e) {
                    z = true;
                    ((hkf) ((hkf) ((hkf) eiu.a.g()).h(e)).i("com/google/android/libraries/performance/primes/metrics/crash/CrashMetricFactory", "newCrash", 'W', "CrashMetricFactory.java")).s("Failed to get process stats.");
                }
                String name2 = th.getClass().getName();
                for (Throwable cause = th.getCause(); cause != null && cause != cause.getCause(); cause = cause.getCause()) {
                    name2 = cause.getClass().getName();
                }
                jkj n = hoq.n(th, z);
                Iterator it3 = ((Set) erjVar.b.b()).iterator();
                while (it3.hasNext()) {
                    enr enrVar = (enr) it3.next();
                    hrj hrjVar = ((hrm) n.b).e;
                    if (hrjVar == null) {
                        hrjVar = hrj.a;
                    }
                    if ((hrjVar.b & 2) != 0) {
                        String str = hrjVar.d;
                        String b2 = enrVar.b();
                        if (!str.equals(b2)) {
                            jkj C = hrjVar.C();
                            if (!C.b.M()) {
                                C.t();
                            }
                            hrj hrjVar2 = (hrj) C.b;
                            b2.getClass();
                            z2 = z;
                            hrjVar2.b |= 2;
                            hrjVar2.d = b2;
                            hrj hrjVar3 = (hrj) C.q();
                            if (!n.b.M()) {
                                n.t();
                            }
                            hrm hrmVar = (hrm) n.b;
                            hrjVar3.getClass();
                            hrmVar.e = hrjVar3;
                            hrmVar.b |= 1;
                            hrm hrmVar2 = (hrm) n.b;
                            i2 = hrmVar2.c;
                            if (i2 != 4) {
                                hrk hrkVar2 = i2 == 4 ? (hrk) hrmVar2.d : hrk.a;
                                jkj jkjVar2 = null;
                                int i3 = 0;
                                while (i3 < hrkVar2.b.size()) {
                                    hrl hrlVar = (hrl) hrkVar2.b.get(i3);
                                    hrj hrjVar4 = hrlVar.c;
                                    if (hrjVar4 == null) {
                                        hrjVar4 = hrj.a;
                                    }
                                    if ((hrjVar4.b & 2) != 0) {
                                        String str2 = hrjVar4.d;
                                        hrkVar = hrkVar2;
                                        String b3 = enrVar.b();
                                        if (!str2.equals(b3)) {
                                            if (jkjVar2 == null) {
                                                jkjVar2 = hrkVar.C();
                                            }
                                            jkj C2 = hrlVar.C();
                                            jkj C3 = hrjVar4.C();
                                            if (!C3.b.M()) {
                                                C3.t();
                                            }
                                            hrj hrjVar5 = (hrj) C3.b;
                                            b3.getClass();
                                            it2 = it3;
                                            hrjVar5.b |= 2;
                                            hrjVar5.d = b3;
                                            hrj hrjVar6 = (hrj) C3.q();
                                            if (!C2.b.M()) {
                                                C2.t();
                                            }
                                            hrl hrlVar2 = (hrl) C2.b;
                                            hrjVar6.getClass();
                                            hrlVar2.c = hrjVar6;
                                            hrlVar2.b |= 1;
                                            hrl hrlVar3 = (hrl) C2.q();
                                            if (!jkjVar2.b.M()) {
                                                jkjVar2.t();
                                            }
                                            hrk hrkVar3 = (hrk) jkjVar2.b;
                                            hrlVar3.getClass();
                                            hrkVar3.b();
                                            hrkVar3.b.set(i3, hrlVar3);
                                            i3++;
                                            hrkVar2 = hrkVar;
                                            it3 = it2;
                                        }
                                    } else {
                                        hrkVar = hrkVar2;
                                    }
                                    it2 = it3;
                                    i3++;
                                    hrkVar2 = hrkVar;
                                    it3 = it2;
                                }
                                it = it3;
                                if (jkjVar2 != null) {
                                    hrk hrkVar4 = (hrk) jkjVar2.q();
                                    if (!n.b.M()) {
                                        n.t();
                                    }
                                    hrm hrmVar3 = (hrm) n.b;
                                    hrkVar4.getClass();
                                    hrmVar3.d = hrkVar4;
                                    hrmVar3.c = 4;
                                }
                            } else {
                                it = it3;
                                for (int i4 = 0; i4 < ((hrm) n.b).f.size(); i4++) {
                                    hrj hrjVar7 = (hrj) ((hrm) n.b).f.get(i4);
                                    if ((hrjVar7.b & 2) != 0) {
                                        String str3 = hrjVar7.d;
                                        String b4 = enrVar.b();
                                        if (!str3.equals(b4)) {
                                            jkj C4 = hrjVar7.C();
                                            if (!C4.b.M()) {
                                                C4.t();
                                            }
                                            hrj hrjVar8 = (hrj) C4.b;
                                            b4.getClass();
                                            hrjVar8.b |= 2;
                                            hrjVar8.d = b4;
                                            hrj hrjVar9 = (hrj) C4.q();
                                            if (!n.b.M()) {
                                                n.t();
                                            }
                                            hrm hrmVar4 = (hrm) n.b;
                                            hrjVar9.getClass();
                                            hrmVar4.b();
                                            hrmVar4.f.set(i4, hrjVar9);
                                        }
                                    }
                                }
                            }
                            z = z2;
                            it3 = it;
                        }
                    }
                    z2 = z;
                    hrm hrmVar22 = (hrm) n.b;
                    i2 = hrmVar22.c;
                    if (i2 != 4) {
                    }
                    z = z2;
                    it3 = it;
                }
                boolean z3 = z;
                if (!k2.b.M()) {
                    k2.t();
                }
                lgk lgkVar4 = (lgk) k2.b;
                name.getClass();
                lgkVar4.b |= 8;
                lgkVar4.f = name;
                Class<?> cls = th.getClass();
                ?? r2 = cls == OutOfMemoryError.class ? 3 : NullPointerException.class.isAssignableFrom(cls) ? 2 : RuntimeException.class.isAssignableFrom(cls) ? 4 : Error.class.isAssignableFrom(cls) ? 5 : z3;
                if (!k2.b.M()) {
                    k2.t();
                }
                jkp jkpVar2 = k2.b;
                lgk lgkVar5 = (lgk) jkpVar2;
                lgkVar5.g = r2 - 1;
                lgkVar5.b |= 16;
                if (!jkpVar2.M()) {
                    k2.t();
                }
                lgk lgkVar6 = (lgk) k2.b;
                name2.getClass();
                lgkVar6.b |= 128;
                lgkVar6.h = name2;
                hrm hrmVar5 = (hrm) n.q();
                if (!k2.b.M()) {
                    k2.t();
                }
                lgk lgkVar7 = (lgk) k2.b;
                hrmVar5.getClass();
                lgkVar7.i = hrmVar5;
                lgkVar7.b |= 256;
                if (gsv.a) {
                    eno enoVar = (eno) enlVar.d.b();
                    if (enoVar.b && (d = gsv.d(th)) != null) {
                        hel helVar = ((gvi) d.a).a;
                        int i5 = enoVar.c;
                        int i6 = enoVar.d;
                        int i7 = enoVar.e;
                        List F = hnu.F(helVar);
                        ArrayList E = hnu.E(Math.min(((his) helVar).c, i6));
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int i8 = 0;
                        int i9 = 0;
                        while (i8 < F.size()) {
                            int i10 = i8 + 1;
                            if (i10 > i6) {
                                jkjVar = lgi.a.k();
                                int size = F.size() - i8;
                                if (!jkjVar.b.M()) {
                                    jkjVar.t();
                                }
                                lgi lgiVar = (lgi) jkjVar.b;
                                lgiVar.b |= 1;
                                lgiVar.c = size;
                            } else {
                                String str4 = (String) F.get(i8);
                                int i11 = i6;
                                if (Math.min(str4.length(), i5) + i9 > i7) {
                                    jkjVar = lgi.a.k();
                                    int size2 = F.size() - i8;
                                    if (!jkjVar.b.M()) {
                                        jkjVar.t();
                                    }
                                    lgi lgiVar2 = (lgi) jkjVar.b;
                                    lgiVar2.b |= 2;
                                    lgiVar2.d = size2;
                                } else {
                                    if (str4.length() > i5) {
                                        list = F;
                                        E.add(str4.substring(0, i5));
                                        arrayList.add(Integer.valueOf(i8));
                                        arrayList2.add(Integer.valueOf(str4.length() - i5));
                                        i9 += i5;
                                    } else {
                                        list = F;
                                        E.add(str4);
                                        i9 += str4.length();
                                    }
                                    i8 = i10;
                                    i6 = i11;
                                    F = list;
                                }
                            }
                            i = 0;
                            if (!arrayList.isEmpty()) {
                                if (jkjVar == null) {
                                    jkjVar = lgi.a.k();
                                }
                                int size3 = arrayList.size();
                                for (int i12 = i; i12 < size3; i12++) {
                                    int size4 = (E.size() - ((Integer) arrayList.get(i12)).intValue()) - 1;
                                    if (!jkjVar.b.M()) {
                                        jkjVar.t();
                                    }
                                    lgi lgiVar3 = (lgi) jkjVar.b;
                                    lgi lgiVar4 = lgi.a;
                                    jkt jktVar = lgiVar3.e;
                                    if (!jktVar.c()) {
                                        lgiVar3.e = jkp.y(jktVar);
                                    }
                                    lgiVar3.e.g(size4);
                                }
                                if (!jkjVar.b.M()) {
                                    jkjVar.t();
                                }
                                lgi lgiVar5 = (lgi) jkjVar.b;
                                lgi lgiVar6 = lgi.a;
                                jkt jktVar2 = lgiVar5.f;
                                if (!jktVar2.c()) {
                                    lgiVar5.f = jkp.y(jktVar2);
                                }
                                jiz.f(arrayList2, lgiVar5.f);
                            }
                            k = lgj.a.k();
                            List F2 = hnu.F(E);
                            if (!k.b.M()) {
                                k.t();
                            }
                            lgj lgjVar = (lgj) k.b;
                            jkxVar = lgjVar.c;
                            if (!jkxVar.c()) {
                                lgjVar.c = jkp.A(jkxVar);
                            }
                            jiz.f(F2, lgjVar.c);
                            if (jkjVar != null) {
                                lgi lgiVar7 = (lgi) jkjVar.q();
                                if (!k.b.M()) {
                                    k.t();
                                }
                                lgj lgjVar2 = (lgj) k.b;
                                lgiVar7.getClass();
                                lgjVar2.d = lgiVar7;
                                lgjVar2.b |= 1;
                            }
                            lgj lgjVar3 = (lgj) k.q();
                            if (!k2.b.M()) {
                                k2.t();
                            }
                            lgk lgkVar8 = (lgk) k2.b;
                            lgjVar3.getClass();
                            lgkVar8.j = lgjVar3;
                            lgkVar8.b |= 1024;
                        }
                        i = 0;
                        jkjVar = null;
                        if (!arrayList.isEmpty()) {
                        }
                        k = lgj.a.k();
                        List F22 = hnu.F(E);
                        if (!k.b.M()) {
                        }
                        lgj lgjVar4 = (lgj) k.b;
                        jkxVar = lgjVar4.c;
                        if (!jkxVar.c()) {
                        }
                        jiz.f(F22, lgjVar4.c);
                        if (jkjVar != null) {
                        }
                        lgj lgjVar32 = (lgj) k.q();
                        if (!k2.b.M()) {
                        }
                        lgk lgkVar82 = (lgk) k2.b;
                        lgjVar32.getClass();
                        lgkVar82.j = lgjVar32;
                        lgkVar82.b |= 1024;
                    }
                }
                lgk lgkVar9 = (lgk) k2.q();
                bry bryVar = enlVar.h;
                if (!gsv.a) {
                    g = gyf.a;
                } else if (((Boolean) bryVar.a.b()).booleanValue()) {
                    brn d2 = gsv.d(th);
                    if (d2 == null) {
                        g = gyf.a;
                    } else {
                        eog b5 = eog.b(((gvi) d2.a).b);
                        g = b5 == null ? gyf.a : gzp.g(b5.a());
                    }
                } else {
                    g = gyf.a;
                }
                enlVar.m(lgkVar9, (eoc) g.e());
            } catch (Exception e2) {
                ((hkf) ((hkf) ((hkf) eiu.a.g()).h(e2)).i("com/google/android/libraries/performance/primes/metrics/crash/CrashMetricServiceImpl$PrimesUncaughtExceptionHandler", "uncaughtException", 180, "CrashMetricServiceImpl.java")).s("Failed to record crash.");
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.b;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        } catch (Throwable th2) {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.b;
            if (uncaughtExceptionHandler2 != null) {
                uncaughtExceptionHandler2.uncaughtException(thread, th);
            }
            throw th2;
        }
    }
}
