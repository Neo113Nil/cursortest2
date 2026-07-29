package com.tencent.bugly.proguard;

import android.content.Context;
import android.os.Process;
import android.support.v4.media.session.PlaybackStateCompat;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* compiled from: BUGLY */
/* loaded from: classes2.dex */
public final class v implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private int f8795a;

    /* renamed from: b, reason: collision with root package name */
    private int f8796b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f8797c;

    /* renamed from: d, reason: collision with root package name */
    private final int f8798d;
    private final byte[] e;
    private final com.tencent.bugly.crashreport.common.info.a f;
    private final com.tencent.bugly.crashreport.common.strategy.a g;
    private final s h;
    private final u i;
    private final int j;
    private final t k;
    private final t l;
    private String m;
    private final String n;
    private final Map<String, String> o;
    private int p;
    private long q;
    private long r;
    private boolean s;
    private boolean t;

    public v(Context context, int i, int i2, byte[] bArr, String str, String str2, t tVar, boolean z, boolean z2) {
        this(context, i, i2, bArr, str, str2, tVar, z, 2, 30000, z2, null);
    }

    public v(Context context, int i, int i2, byte[] bArr, String str, String str2, t tVar, boolean z, int i3, int i4, boolean z2, Map<String, String> map) {
        this.f8795a = 2;
        this.f8796b = 30000;
        this.m = null;
        this.p = 0;
        this.q = 0L;
        this.r = 0L;
        this.s = true;
        this.t = false;
        this.f8797c = context;
        this.f = com.tencent.bugly.crashreport.common.info.a.a(context);
        this.e = bArr;
        this.g = com.tencent.bugly.crashreport.common.strategy.a.a();
        this.h = s.a(context);
        this.i = u.a();
        this.j = i;
        this.m = str;
        this.n = str2;
        this.k = tVar;
        u uVar = this.i;
        this.l = null;
        this.s = z;
        this.f8798d = i2;
        if (i3 > 0) {
            this.f8795a = i3;
        }
        if (i4 > 0) {
            this.f8796b = i4;
        }
        this.t = z2;
        this.o = map;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(an anVar, boolean z, int i, String str, int i2) {
        String str2;
        int i3 = this.f8798d;
        if (i3 != 630) {
            if (i3 != 640) {
                if (i3 != 830) {
                    if (i3 != 840) {
                        str2 = String.valueOf(this.f8798d);
                        if (z) {
                            x.a("[Upload] Success: %s", str2);
                        } else {
                            x.e("[Upload] Failed to upload(%d) %s: %s", Integer.valueOf(i), str2, str);
                            if (this.s) {
                                this.i.a(i2, (an) null);
                            }
                        }
                        if (this.q + this.r > 0) {
                            this.i.a(this.i.a(this.t) + this.q + this.r, this.t);
                        }
                        if (this.k != null) {
                            t tVar = this.k;
                            int i4 = this.f8798d;
                            long j = this.q;
                            long j2 = this.r;
                            tVar.a(z);
                        }
                        if (this.l != null) {
                            t tVar2 = this.l;
                            int i5 = this.f8798d;
                            long j3 = this.q;
                            long j4 = this.r;
                            tVar2.a(z);
                            return;
                        }
                        return;
                    }
                }
            }
            str2 = "userinfo";
            if (z) {
            }
            if (this.q + this.r > 0) {
            }
            if (this.k != null) {
            }
            if (this.l != null) {
            }
        }
        str2 = "crash";
        if (z) {
        }
        if (this.q + this.r > 0) {
        }
        if (this.k != null) {
        }
        if (this.l != null) {
        }
    }

    private static boolean a(an anVar, com.tencent.bugly.crashreport.common.info.a aVar, com.tencent.bugly.crashreport.common.strategy.a aVar2) {
        if (anVar == null) {
            x.d("resp == null!", new Object[0]);
            return false;
        }
        if (anVar.f8720a != 0) {
            x.e("resp result error %d", Byte.valueOf(anVar.f8720a));
            return false;
        }
        try {
            if (!z.a(anVar.f8723d) && !com.tencent.bugly.crashreport.common.info.a.b().i().equals(anVar.f8723d)) {
                p.a().a(com.tencent.bugly.crashreport.common.strategy.a.f8608a, "key_ip", anVar.f8723d.getBytes("UTF-8"), (o) null, true);
                aVar.d(anVar.f8723d);
            }
            if (!z.a(anVar.f) && !com.tencent.bugly.crashreport.common.info.a.b().j().equals(anVar.f)) {
                p.a().a(com.tencent.bugly.crashreport.common.strategy.a.f8608a, "key_imei", anVar.f.getBytes("UTF-8"), (o) null, true);
                aVar.e(anVar.f);
            }
        } catch (Throwable th) {
            x.a(th);
        }
        aVar.i = anVar.e;
        if (anVar.f8721b == 510) {
            if (anVar.f8722c == null) {
                x.e("[Upload] Strategy data is null. Response cmd: %d", Integer.valueOf(anVar.f8721b));
                return false;
            }
            ap apVar = (ap) a.a(anVar.f8722c, ap.class);
            if (apVar == null) {
                x.e("[Upload] Failed to decode strategy from server. Response cmd: %d", Integer.valueOf(anVar.f8721b));
                return false;
            }
            aVar2.a(apVar);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x0245 A[Catch: Throwable -> 0x0477, TryCatch #2 {Throwable -> 0x0477, blocks: (B:3:0x0003, B:5:0x0015, B:9:0x0023, B:12:0x0028, B:14:0x003c, B:16:0x006e, B:18:0x0081, B:20:0x0085, B:22:0x0089, B:25:0x008f, B:27:0x0097, B:29:0x00a3, B:31:0x00c9, B:32:0x00ce, B:34:0x00d2, B:36:0x0105, B:38:0x0111, B:40:0x0117, B:42:0x0123, B:44:0x012b, B:46:0x0137, B:48:0x0146, B:49:0x014a, B:51:0x014e, B:52:0x0152, B:53:0x0159, B:56:0x0161, B:58:0x0178, B:59:0x0185, B:61:0x0197, B:62:0x019c, B:64:0x01cb, B:67:0x01e0, B:70:0x01ea, B:73:0x01f1, B:75:0x01f9, B:76:0x0201, B:79:0x0245, B:81:0x0273, B:82:0x027b, B:84:0x0281, B:86:0x02a1, B:97:0x02de, B:99:0x02ea, B:100:0x0301, B:102:0x0344, B:142:0x0364, B:146:0x0205, B:148:0x020d, B:149:0x0216, B:151:0x0226, B:152:0x0230, B:153:0x023b, B:105:0x0389, B:107:0x039b, B:109:0x039e, B:110:0x03a6, B:112:0x03ac, B:114:0x03c6, B:116:0x03d2, B:118:0x03da, B:120:0x03e6, B:122:0x03ec, B:124:0x03f8, B:126:0x0400, B:128:0x040c, B:130:0x0410, B:131:0x0415, B:134:0x0429, B:136:0x043c, B:138:0x0447, B:140:0x0426, B:156:0x0452, B:158:0x045f, B:160:0x046b), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        byte[] a2;
        Map<String, String> map;
        boolean z;
        long j;
        String str;
        Object[] objArr;
        int i = 0;
        try {
            this.p = 0;
            this.q = 0L;
            this.r = 0L;
            byte[] bArr = this.e;
            if (com.tencent.bugly.crashreport.common.info.b.e(this.f8797c) == null) {
                a(null, false, 0, "network is not available", 0);
                return;
            }
            if (bArr != null && bArr.length != 0) {
                long a3 = this.i.a(this.t);
                if (bArr.length + a3 >= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) {
                    x.e("[Upload] Upload too much data, try next time: %d/%d", Long.valueOf(a3), Long.valueOf(PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE));
                    a(null, false, 0, "over net consume: " + PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH + "K", 0);
                    return;
                }
                x.c("[Upload] Run upload task with cmd: %d", Integer.valueOf(this.f8798d));
                if (this.f8797c != null && this.f != null && this.g != null && this.h != null) {
                    StrategyBean c2 = this.g.c();
                    if (c2 == null) {
                        a(null, false, 0, "illegal local strategy", 0);
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("prodId", this.f.f());
                    hashMap.put("bundleId", this.f.f8600c);
                    hashMap.put("appVer", this.f.j);
                    if (this.o != null) {
                        hashMap.putAll(this.o);
                    }
                    if (this.s) {
                        hashMap.put("cmd", Integer.toString(this.f8798d));
                        hashMap.put("platformId", Byte.toString((byte) 1));
                        this.f.getClass();
                        hashMap.put("sdkVer", "2.6.5");
                        hashMap.put("strategylastUpdateTime", Long.toString(c2.p));
                        if (!this.i.a(hashMap)) {
                            a(null, false, 0, "failed to add security info to HTTP headers", 0);
                            return;
                        }
                        byte[] a4 = z.a(bArr, 2);
                        if (a4 == null) {
                            a(null, false, 0, "failed to zip request body", 0);
                            return;
                        }
                        bArr = this.i.a(a4);
                        if (bArr == null) {
                            a(null, false, 0, "failed to encrypt request body", 0);
                            return;
                        }
                    }
                    this.i.a(this.j, System.currentTimeMillis());
                    if (this.k != null) {
                        t tVar = this.k;
                        int i2 = this.f8798d;
                    }
                    if (this.l != null) {
                        t tVar2 = this.l;
                        int i3 = this.f8798d;
                    }
                    String str2 = this.m;
                    int i4 = 0;
                    int i5 = 0;
                    int i6 = -1;
                    while (true) {
                        int i7 = i4 + 1;
                        if (i4 < this.f8795a) {
                            if (i7 > 1) {
                                x.d("[Upload] Failed to upload last time, wait and try(%d) again.", Integer.valueOf(i7));
                                z.b(this.f8796b);
                                if (i7 == this.f8795a) {
                                    x.d("[Upload] Use the back-up url at the last time: %s", this.n);
                                    str2 = this.n;
                                }
                            }
                            x.c("[Upload] Send %d bytes", Integer.valueOf(bArr.length));
                            if (this.s) {
                                str2 = a(str2);
                            }
                            x.c("[Upload] Upload to %s with cmd %d (pid=%d | tid=%d).", str2, Integer.valueOf(this.f8798d), Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
                            a2 = this.h.a(str2, bArr, this, hashMap);
                            if (a2 == null) {
                                x.e("[Upload] Failed to upload(%d): %s", 1, "Failed to upload for no response!");
                                i4 = i7;
                            } else {
                                map = this.h.f8781a;
                                if (!this.s) {
                                    break;
                                }
                                if (map != null && map.size() != 0) {
                                    if (!map.containsKey("status")) {
                                        str = "[Upload] Headers does not contain %s";
                                        objArr = new Object[]{"status"};
                                    } else if (map.containsKey("Bugly-Version")) {
                                        String str3 = map.get("Bugly-Version");
                                        if (str3.contains("bugly")) {
                                            x.c("[Upload] Bugly version from headers is: %s", str3);
                                            z = true;
                                            if (z) {
                                            }
                                        } else {
                                            x.d("[Upload] Bugly version is not valid: %s", str3);
                                            z = false;
                                            if (z) {
                                                x.c("[Upload] Headers from server is not valid, just try again (pid=%d | tid=%d).", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
                                                x.e("[Upload] Failed to upload(%d): %s", 1, "[Upload] Failed to upload for no status header.");
                                                if (map != null) {
                                                    for (Map.Entry<String, String> entry : map.entrySet()) {
                                                        x.c(String.format("[key]: %s, [value]: %s", entry.getKey(), entry.getValue()), new Object[0]);
                                                    }
                                                }
                                                x.c("[Upload] Failed to upload for no status header.", new Object[0]);
                                                i4 = i7;
                                            } else {
                                                try {
                                                    int parseInt = Integer.parseInt(map.get("status"));
                                                    try {
                                                        x.c("[Upload] Status from server is %d (pid=%d | tid=%d).", Integer.valueOf(parseInt), Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
                                                        if (parseInt != 0) {
                                                            if (parseInt == 2) {
                                                                if (this.q + this.r > 0) {
                                                                    this.i.a(this.i.a(this.t) + this.q + this.r, this.t);
                                                                }
                                                                this.i.a(parseInt, (an) null);
                                                                x.a("[Upload] Session ID is invalid, will try again immediately (pid=%d | tid=%d).", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
                                                                this.i.a(this.j, this.f8798d, this.e, this.m, this.n, this.k, this.f8795a, this.f8796b, true, this.o);
                                                                return;
                                                            }
                                                            a(null, false, 1, "status of server is " + parseInt, parseInt);
                                                            return;
                                                        }
                                                        i6 = parseInt;
                                                    } catch (Throwable unused) {
                                                        j = 0;
                                                        i6 = parseInt;
                                                        x.e("[Upload] Failed to upload(%d): %s", 1, "[Upload] Failed to upload for format of status header is invalid: " + Integer.toString(i6));
                                                        i4 = i7;
                                                        i5 = 1;
                                                    }
                                                } catch (Throwable unused2) {
                                                    j = 0;
                                                }
                                            }
                                        }
                                    } else {
                                        str = "[Upload] Headers does not contain %s";
                                        objArr = new Object[]{"Bugly-Version"};
                                    }
                                    x.d(str, objArr);
                                    z = false;
                                    if (z) {
                                    }
                                }
                                x.d("[Upload] Headers is empty.", new Object[0]);
                                z = false;
                                if (z) {
                                }
                            }
                            i5 = 1;
                        } else {
                            a(null, false, i5, "failed after many attempts", 0);
                            return;
                        }
                    }
                    x.c("[Upload] Received %d bytes", Integer.valueOf(a2.length));
                    if (this.s) {
                        if (a2.length == 0) {
                            for (Map.Entry<String, String> entry2 : map.entrySet()) {
                                x.c("[Upload] HTTP headers from server: key = %s, value = %s", entry2.getKey(), entry2.getValue());
                            }
                            a(null, false, 1, "response data from server is empty", 0);
                            return;
                        }
                        byte[] b2 = this.i.b(a2);
                        if (b2 == null) {
                            a(null, false, 1, "failed to decrypt response from server", 0);
                            return;
                        }
                        a2 = z.b(b2, 2);
                        if (a2 == null) {
                            a(null, false, 1, "failed unzip(Gzip) response from server", 0);
                            return;
                        }
                    }
                    an a5 = a.a(a2, this.s);
                    if (a5 == null) {
                        a(null, false, 1, "failed to decode response package", 0);
                        return;
                    }
                    if (this.s) {
                        this.i.a(i6, a5);
                    }
                    Object[] objArr2 = new Object[2];
                    objArr2[0] = Integer.valueOf(a5.f8721b);
                    if (a5.f8722c != null) {
                        i = a5.f8722c.length;
                    }
                    objArr2[1] = Integer.valueOf(i);
                    x.c("[Upload] Response cmd is: %d, length of sBuffer is: %d", objArr2);
                    if (!a(a5, this.f, this.g)) {
                        a(a5, false, 2, "failed to process response package", 0);
                        return;
                    } else {
                        a(a5, true, 2, "successfully uploaded", 0);
                        return;
                    }
                }
                a(null, false, 0, "illegal access error", 0);
                return;
            }
            a(null, false, 0, "request package is empty!", 0);
        } catch (Throwable th) {
            if (x.a(th)) {
                return;
            }
            th.printStackTrace();
        }
    }

    public final void a(long j) {
        this.p++;
        this.q += j;
    }

    public final void b(long j) {
        this.r += j;
    }

    private static String a(String str) {
        if (z.a(str)) {
            return str;
        }
        try {
            return String.format("%s?aid=%s", str, UUID.randomUUID().toString());
        } catch (Throwable th) {
            x.a(th);
            return str;
        }
    }
}
