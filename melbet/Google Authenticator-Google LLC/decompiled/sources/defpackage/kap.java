package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kap {
    private final boolean a;
    private final int b;
    private final int c;
    private final jzm d;

    public kap(boolean z, int i, int i2, jzm jzmVar) {
        this.a = z;
        this.b = i;
        this.c = i2;
        jzmVar.getClass();
        this.d = jzmVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0085 A[Catch: all -> 0x012c, RuntimeException -> 0x013f, TryCatch #2 {RuntimeException -> 0x013f, all -> 0x012c, blocks: (B:3:0x0004, B:6:0x001c, B:10:0x0028, B:13:0x0031, B:16:0x004d, B:19:0x0059, B:20:0x0068, B:23:0x007d, B:25:0x0085, B:26:0x0126, B:29:0x008e, B:30:0x0097, B:32:0x009d, B:34:0x00b0, B:41:0x00b6, B:42:0x00ba, B:44:0x00c0, B:46:0x00da, B:49:0x00e9, B:53:0x00f0, B:55:0x00f6, B:57:0x0105, B:62:0x0120, B:63:0x0077, B:67:0x000f, B:69:0x0013, B:71:0x0019), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e A[Catch: all -> 0x012c, RuntimeException -> 0x013f, TryCatch #2 {RuntimeException -> 0x013f, all -> 0x012c, blocks: (B:3:0x0004, B:6:0x001c, B:10:0x0028, B:13:0x0031, B:16:0x004d, B:19:0x0059, B:20:0x0068, B:23:0x007d, B:25:0x0085, B:26:0x0126, B:29:0x008e, B:30:0x0097, B:32:0x009d, B:34:0x00b0, B:41:0x00b6, B:42:0x00ba, B:44:0x00c0, B:46:0x00da, B:49:0x00e9, B:53:0x00f0, B:55:0x00f6, B:57:0x0105, B:62:0x0120, B:63:0x0077, B:67:0x000f, B:69:0x0013, B:71:0x0019), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0077 A[Catch: all -> 0x012c, RuntimeException -> 0x013f, TryCatch #2 {RuntimeException -> 0x013f, all -> 0x012c, blocks: (B:3:0x0004, B:6:0x001c, B:10:0x0028, B:13:0x0031, B:16:0x004d, B:19:0x0059, B:20:0x0068, B:23:0x007d, B:25:0x0085, B:26:0x0126, B:29:0x008e, B:30:0x0097, B:32:0x009d, B:34:0x00b0, B:41:0x00b6, B:42:0x00ba, B:44:0x00c0, B:46:0x00da, B:49:0x00e9, B:53:0x00f0, B:55:0x00f6, B:57:0x0105, B:62:0x0120, B:63:0x0077, B:67:0x000f, B:69:0x0013, B:71:0x0019), top: B:2:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final kam a(Map map) {
        Object obj;
        kkx kkxVar;
        boolean z;
        List<Map> g;
        kiz kizVar;
        Map i;
        try {
            kam b = this.d.b(map);
            kix kixVar = null;
            if (b == null) {
                obj = null;
            } else {
                kbq kbqVar = b.a;
                if (kbqVar != null) {
                    return new kam(kbqVar);
                }
                obj = b.b;
            }
            boolean z2 = this.a;
            int i2 = this.b;
            int i3 = this.c;
            if (z2 && map != null && (i = ixb.i(map, "retryThrottling")) != null) {
                float floatValue = ixb.b(i, "maxTokens").floatValue();
                float floatValue2 = ixb.b(i, "tokenRatio").floatValue();
                hoq.I(floatValue > 0.0f, "maxToken should be greater than zero");
                hoq.I(floatValue2 > 0.0f, "tokenRatio should be greater than zero");
                kkx kkxVar2 = new kkx(floatValue, floatValue2);
                z = true;
                kkxVar = kkxVar2;
                HashMap hashMap = new HashMap();
                boolean z3 = z;
                HashMap hashMap2 = new HashMap();
                Map i4 = map != null ? null : ixb.i(map, "healthCheckConfig");
                g = ixb.g(map, "methodConfig");
                if (g != null) {
                    kizVar = new kiz(null, hashMap, hashMap2, kkxVar, obj, i4);
                } else {
                    Map map2 = i4;
                    boolean z4 = z3;
                    for (Map map3 : g) {
                        kix kixVar2 = new kix(map3, z2, i2, i3);
                        List<Map> g2 = ixb.g(map3, "name");
                        if (g2 == null || g2.isEmpty()) {
                            z4 = z4;
                        } else {
                            for (Map map4 : g2) {
                                String e = ixb.e(map4, "service");
                                boolean z5 = z4;
                                String e2 = ixb.e(map4, "method");
                                if (hoq.S(e)) {
                                    hoq.C(hoq.S(e2), "missing service name for method %s", e2);
                                    hoq.C(kixVar == null ? z5 : false, "Duplicate default method config in service config %s", map);
                                    kixVar = kixVar2;
                                } else if (hoq.S(e2)) {
                                    hoq.C(!hashMap2.containsKey(e), "Duplicate service %s", e);
                                    hashMap2.put(e, kixVar2);
                                } else {
                                    String b2 = kae.b(e, e2);
                                    hoq.C(!hashMap.containsKey(b2), "Duplicate method name %s", b2);
                                    hashMap.put(b2, kixVar2);
                                }
                                z4 = z5;
                            }
                        }
                    }
                    kizVar = new kiz(kixVar, hashMap, hashMap2, kkxVar, obj, map2);
                }
                return new kam(kizVar);
            }
            kkxVar = null;
            z = true;
            HashMap hashMap3 = new HashMap();
            boolean z32 = z;
            HashMap hashMap22 = new HashMap();
            if (map != null) {
            }
            g = ixb.g(map, "methodConfig");
            if (g != null) {
            }
            return new kam(kizVar);
        } catch (RuntimeException e3) {
            return new kam(kbq.d.e("failed to parse service config").d(e3));
        } catch (Throwable th) {
            return new kam(kbq.k.e("Unexpected error parsing service config").d(th));
        }
    }
}
