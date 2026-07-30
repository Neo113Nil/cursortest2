package defpackage;

import android.app.ActivityManager;
import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.appevents.AppEventsConstants;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ot2 implements k93, td, e43, in, jn, xq3, io3 {
    public final /* synthetic */ int m;
    public Object n;

    public ot2(int i) {
        this.m = i;
        switch (i) {
            case 15:
                this.n = new EnumMap(vk3.class);
                break;
            case 19:
                this.n = new HashMap();
                break;
            default:
                this.n = new af0(0);
                break;
        }
    }

    public static ot2 u(String str) {
        return new ot2(16, (TextUtils.isEmpty(str) || str.length() > 1) ? sk3.UNINITIALIZED : xk3.e(str.charAt(0)));
    }

    @Override // defpackage.e43, defpackage.c43
    public boolean a() {
        ((js0) this.n).getClass();
        return false;
    }

    @Override // defpackage.in
    public void b(int i) {
        ((uv0) this.n).b(i);
    }

    @Override // defpackage.jn
    public void c(c10 c10Var) {
        ((vv0) this.n).c(c10Var);
    }

    @Override // defpackage.in
    public void d() {
        ((uv0) this.n).d();
    }

    @Override // defpackage.c43
    public long e(sd sdVar, sd sdVar2, sd sdVar3) {
        return ((js0) this.n).e(sdVar, sdVar2, sdVar3);
    }

    @Override // defpackage.k93
    public eo f(String str, int i, EnumMap enumMap) {
        if (i == 15) {
            return ((af0) this.n).f(AppEventsConstants.EVENT_PARAM_VALUE_NO.concat(String.valueOf(str)), 8, enumMap);
        }
        lh.e("Can only encode UPC-A, but got ".concat(q40.v(i)));
        return null;
    }

    @Override // defpackage.td
    public tm0 get(int i) {
        switch (this.m) {
            case 6:
                return (um0) this.n;
            default:
                return (tm0) this.n;
        }
    }

    @Override // defpackage.io3
    public boolean h(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (((io3[]) this.n)[i].h(cls)) {
                return true;
            }
        }
        return false;
    }

    public void i(nv2 nv2Var, long j, boolean z, dh2 dh2Var) {
        gv2 gv2Var = (gv2) this.n;
        gv2Var.n(jw2.b(gv2.a(gv2Var, nv2Var, j, z, false, dh2Var, false)) ? zw0.o : zw0.n);
    }

    public Object j() {
        dl3 dl3Var = (dl3) this.n;
        ContentResolver contentResolver = dl3Var.a;
        Uri uri = dl3Var.b;
        ContentProviderClient acquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
        try {
            if (acquireUnstableContentProviderClient == null) {
                Log.w("ConfigurationContentLdr", "Unable to acquire ContentProviderClient, using default values");
                return Collections.EMPTY_MAP;
            }
            try {
                Cursor query = acquireUnstableContentProviderClient.query(uri, dl3.j, null, null, null);
                try {
                    if (query == null) {
                        Log.w("ConfigurationContentLdr", "ContentProvider query returned null cursor, using default values");
                        Map map = Collections.EMPTY_MAP;
                        acquireUnstableContentProviderClient.release();
                        return map;
                    }
                    int count = query.getCount();
                    if (count == 0) {
                        Map map2 = Collections.EMPTY_MAP;
                        query.close();
                        acquireUnstableContentProviderClient.release();
                        return map2;
                    }
                    Map hiVar = count <= 256 ? new hi(count) : new HashMap(count, 1.0f);
                    while (query.moveToNext()) {
                        hiVar.put(query.getString(0), query.getString(1));
                    }
                    if (query.isAfterLast()) {
                        query.close();
                        acquireUnstableContentProviderClient.release();
                        return hiVar;
                    }
                    Log.w("ConfigurationContentLdr", "Cursor read incomplete (ContentProvider dead?), using default values");
                    Map map3 = Collections.EMPTY_MAP;
                    query.close();
                    acquireUnstableContentProviderClient.release();
                    return map3;
                } finally {
                }
            } catch (RemoteException e) {
                Log.w("ConfigurationContentLdr", "ContentProvider query failed, using default values", e);
                Map map4 = Collections.EMPTY_MAP;
                acquireUnstableContentProviderClient.release();
                return map4;
            }
        } catch (Throwable th) {
            acquireUnstableContentProviderClient.release();
            throw th;
        }
    }

    @Override // defpackage.c43
    public sd l(long j, sd sdVar, sd sdVar2, sd sdVar3) {
        return ((js0) this.n).l(j, sdVar, sdVar2, sdVar3);
    }

    @Override // defpackage.c43
    public sd n(long j, sd sdVar, sd sdVar2, sd sdVar3) {
        return ((js0) this.n).n(j, sdVar, sdVar2, sdVar3);
    }

    @Override // defpackage.c43
    public sd o(sd sdVar, sd sdVar2, sd sdVar3) {
        return ((js0) this.n).o(sdVar, sdVar2, sdVar3);
    }

    @Override // defpackage.io3
    public wo3 p(Class cls) {
        for (int i = 0; i < 2; i++) {
            io3 io3Var = ((io3[]) this.n)[i];
            if (io3Var.h(cls)) {
                return io3Var.p(cls);
            }
        }
        ch2.h("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    public void q() {
        ep3 ep3Var = (ep3) this.n;
        ep3Var.v();
        pj3 pj3Var = (pj3) ep3Var.m;
        qi3 qi3Var = pj3Var.q;
        pj3.k(qi3Var);
        pj3Var.w.getClass();
        if (qi3Var.G(System.currentTimeMillis())) {
            qi3 qi3Var2 = pj3Var.q;
            pj3.k(qi3Var2);
            qi3Var2.x.b(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                vh3 vh3Var = pj3Var.r;
                pj3.m(vh3Var);
                vh3Var.z.b("Detected application was in foreground");
                v(System.currentTimeMillis());
            }
        }
    }

    public void r(int i, String str, List list, boolean z, boolean z2) {
        g10 g10Var;
        dj3 dj3Var = (dj3) this.n;
        int i2 = i - 1;
        if (i2 == 0) {
            vh3 vh3Var = ((pj3) dj3Var.m).r;
            pj3.m(vh3Var);
            g10Var = vh3Var.y;
        } else if (i2 != 1) {
            if (i2 == 3) {
                vh3 vh3Var2 = ((pj3) dj3Var.m).r;
                pj3.m(vh3Var2);
                g10Var = vh3Var2.z;
            } else if (i2 != 4) {
                vh3 vh3Var3 = ((pj3) dj3Var.m).r;
                pj3.m(vh3Var3);
                g10Var = vh3Var3.x;
            } else if (z) {
                vh3 vh3Var4 = ((pj3) dj3Var.m).r;
                pj3.m(vh3Var4);
                g10Var = vh3Var4.v;
            } else if (z2) {
                vh3 vh3Var5 = ((pj3) dj3Var.m).r;
                pj3.m(vh3Var5);
                g10Var = vh3Var5.u;
            } else {
                vh3 vh3Var6 = ((pj3) dj3Var.m).r;
                pj3.m(vh3Var6);
                g10Var = vh3Var6.w;
            }
        } else if (z) {
            vh3 vh3Var7 = ((pj3) dj3Var.m).r;
            pj3.m(vh3Var7);
            g10Var = vh3Var7.s;
        } else if (z2) {
            vh3 vh3Var8 = ((pj3) dj3Var.m).r;
            pj3.m(vh3Var8);
            g10Var = vh3Var8.r;
        } else {
            vh3 vh3Var9 = ((pj3) dj3Var.m).r;
            pj3.m(vh3Var9);
            g10Var = vh3Var9.t;
        }
        int size = list.size();
        if (size == 1) {
            g10Var.c(list.get(0), str);
            return;
        }
        if (size == 2) {
            g10Var.d(list.get(0), list.get(1), str);
        } else if (size != 3) {
            g10Var.b(str);
        } else {
            g10Var.e(str, list.get(0), list.get(1), list.get(2));
        }
    }

    public void s(long j) {
        ep3 ep3Var = (ep3) this.n;
        ep3Var.v();
        ep3Var.A();
        pj3 pj3Var = (pj3) ep3Var.m;
        qi3 qi3Var = pj3Var.q;
        pj3.k(qi3Var);
        if (qi3Var.G(j)) {
            pj3.k(qi3Var);
            qi3Var.x.b(true);
            pj3Var.r().B();
        }
        pj3.k(qi3Var);
        qi3Var.B.b(j);
        if (qi3Var.x.a()) {
            v(j);
        }
    }

    public void t(vk3 vk3Var, int i) {
        gc3 gc3Var;
        if (i != -30) {
            if (i != -20) {
                if (i == -10) {
                    gc3Var = gc3.MANIFEST;
                } else if (i != 0) {
                    gc3Var = i != 30 ? gc3.UNSET : gc3.INITIALIZATION;
                }
            }
            gc3Var = gc3.API;
        } else {
            gc3Var = gc3.TCF;
        }
        ((EnumMap) this.n).put((EnumMap) vk3Var, (vk3) gc3Var);
    }

    public String toString() {
        switch (this.m) {
            case 15:
                StringBuilder sb = new StringBuilder(AppEventsConstants.EVENT_PARAM_VALUE_YES);
                for (vk3 vk3Var : vk3.values()) {
                    gc3 gc3Var = (gc3) ((EnumMap) this.n).get(vk3Var);
                    if (gc3Var == null) {
                        gc3Var = gc3.UNSET;
                    }
                    sb.append(gc3Var.m);
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public void v(long j) {
        ep3 ep3Var = (ep3) this.n;
        ep3Var.v();
        pj3 pj3Var = (pj3) ep3Var.m;
        if (pj3Var.b()) {
            qi3 qi3Var = pj3Var.q;
            pj3.k(qi3Var);
            qi3Var.B.b(j);
            pj3Var.w.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            vh3 vh3Var = pj3Var.r;
            pj3.m(vh3Var);
            vh3Var.z.c(Long.valueOf(elapsedRealtime), "Session started, time");
            long j2 = j / 1000;
            Long valueOf = Long.valueOf(j2);
            jm3 jm3Var = pj3Var.y;
            pj3.l(jm3Var);
            jm3Var.H(j, valueOf, "auto", "_sid");
            pj3.k(qi3Var);
            qi3Var.C.b(j2);
            qi3Var.x.b(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j2);
            pj3.l(jm3Var);
            jm3Var.E("auto", "_s", bundle, j);
            String d = qi3Var.H.d();
            if (TextUtils.isEmpty(d)) {
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_ffr", d);
            pj3.l(jm3Var);
            jm3Var.E("auto", "_ssr", bundle2, j);
        }
    }

    public void w(vk3 vk3Var, gc3 gc3Var) {
        ((EnumMap) this.n).put((EnumMap) vk3Var, (vk3) gc3Var);
    }

    public void x(int i, Object obj, yo3 yo3Var) {
        zl3 zl3Var = (zl3) obj;
        lm3 lm3Var = (lm3) this.n;
        lm3Var.l((i << 3) | 2);
        lm3Var.l(zl3Var.b(yo3Var));
        yo3Var.b(zl3Var, lm3Var.a);
    }

    public void y(int i, Object obj, yo3 yo3Var) {
        lm3 lm3Var = (lm3) this.n;
        lm3Var.c(i, 3);
        yo3Var.b((zl3) obj, lm3Var.a);
        lm3Var.c(i, 4);
    }

    @Override // defpackage.xq3
    public void zza(String str, String str2, Bundle bundle) {
        boolean isEmpty = TextUtils.isEmpty(str);
        jm3 jm3Var = (jm3) this.n;
        if (isEmpty) {
            ((pj3) jm3Var.m).w.getClass();
            jm3Var.B("auto", "_err", bundle, true, true, System.currentTimeMillis());
        } else {
            jm3Var.getClass();
            lh.g("Unexpected call on client side");
        }
    }

    public void g() {
    }

    public /* synthetic */ ot2(int i, boolean z) {
        this.m = i;
    }

    public ot2(lm3 lm3Var) {
        this.m = 22;
        Charset charset = sn3.a;
        this.n = lm3Var;
        lm3Var.a = this;
    }

    public ot2(EnumMap enumMap) {
        this.m = 15;
        EnumMap enumMap2 = new EnumMap(vk3.class);
        this.n = enumMap2;
        enumMap2.putAll(enumMap);
    }

    public /* synthetic */ ot2(int i, Object obj) {
        this.m = i;
        this.n = obj;
    }

    public ot2(m33 m33Var) {
        this.m = 0;
        this.n = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), m33Var);
    }

    public ot2(float f, float f2, sd sdVar) {
        Object ot2Var;
        this.m = 8;
        if (sdVar != null) {
            ot2Var = new lx0(f, f2, sdVar);
        } else {
            ot2Var = new ot2(f, f2);
        }
        this.n = new js0(ot2Var);
    }

    public ot2(float f, float f2) {
        this.m = 6;
        this.n = new um0(f, f2, 0.01f);
    }
}
