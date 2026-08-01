package com.apm.insight.b;

import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import com.apm.insight.runtime.u;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.material.card.MaterialCardViewHelper;
import io.ktor.http.LinkHeader;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class h {
    public static boolean b = false;
    private static int t = 2;
    c a;
    private int c;
    private volatile int d;
    private int e;
    private int f;
    private f g;
    private b h;
    private long i;
    private long j;
    private int k;
    private long l;
    private String m;
    private String n;
    private com.apm.insight.b.e o;
    private volatile boolean p;
    private boolean q;
    private final u r;
    private volatile boolean s;
    private Runnable u;

    private static class a {
        long a;
        long b;
        long c;
        boolean d;
        int e;
        StackTraceElement[] f;

        private a() {
        }

        void a() {
            this.a = -1L;
            this.b = -1L;
            this.c = -1L;
            this.e = -1;
            this.f = null;
        }
    }

    private static class b {
        final int a;
        a b;
        final List<a> c;
        private int d = 0;

        public b(int i) {
            this.a = i;
            this.c = new ArrayList(i);
        }

        a a() {
            a aVar = this.b;
            if (aVar == null) {
                return new a();
            }
            this.b = null;
            return aVar;
        }

        void a(a aVar) {
            int i;
            int size = this.c.size();
            int i2 = this.a;
            if (size < i2) {
                this.c.add(aVar);
                i = this.c.size();
            } else {
                int i3 = this.d % i2;
                this.d = i3;
                a aVar2 = this.c.set(i3, aVar);
                aVar2.a();
                this.b = aVar2;
                i = this.d + 1;
            }
            this.d = i;
        }
    }

    public interface c {
    }

    public static class d {
        long a;
        long b;
        long c;
        long d;
        long e;
    }

    public static class e {
        public long a;
        long b;
        long c;
        int d;
        int e;
        long f;
        long g;
        String h;
        public String i;
        String j;
        d k;

        private void a(JSONObject jSONObject) {
            jSONObject.put("block_uuid", this.j);
            jSONObject.put("sblock_uuid", this.j);
            jSONObject.put("belong_frame", this.k != null);
            d dVar = this.k;
            if (dVar != null) {
                jSONObject.put("vsyncDelayTime", this.c - (dVar.a / 1000000));
                jSONObject.put("doFrameTime", (this.k.b / 1000000) - this.c);
                jSONObject.put("inputHandlingTime", (this.k.c / 1000000) - (this.k.b / 1000000));
                jSONObject.put("animationsTime", (this.k.d / 1000000) - (this.k.c / 1000000));
                jSONObject.put("performTraversalsTime", (this.k.e / 1000000) - (this.k.d / 1000000));
                jSONObject.put("drawTime", this.b - (this.k.e / 1000000));
            }
        }

        public JSONObject a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, h.a(this.h));
                jSONObject.put("cpuDuration", this.g);
                jSONObject.put(TypedValues.TransitionType.S_DURATION, this.f);
                jSONObject.put(LinkHeader.Parameters.Type, this.d);
                jSONObject.put("count", this.e);
                jSONObject.put("messageCount", this.e);
                jSONObject.put("lastDuration", this.b - this.c);
                jSONObject.put("start", this.a);
                jSONObject.put("end", this.b);
                a(jSONObject);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return jSONObject;
        }

        void b() {
            this.d = -1;
            this.e = -1;
            this.f = -1L;
            this.h = null;
            this.j = null;
            this.k = null;
            this.i = null;
        }
    }

    private static class f {
        int a;
        int b;
        e c;
        List<e> d = new ArrayList();

        f(int i) {
            this.a = i;
        }

        e a(int i) {
            e eVar = this.c;
            if (eVar == null) {
                e eVar2 = new e();
                eVar2.d = i;
                return eVar2;
            }
            eVar.d = i;
            e eVar3 = this.c;
            this.c = null;
            return eVar3;
        }

        List<e> a() {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            if (this.d.size() == this.a) {
                for (int i2 = this.b; i2 < this.d.size(); i2++) {
                    arrayList.add(this.d.get(i2));
                }
                while (i < this.b - 1) {
                    arrayList.add(this.d.get(i));
                    i++;
                }
            } else {
                while (i < this.d.size()) {
                    arrayList.add(this.d.get(i));
                    i++;
                }
            }
            return arrayList;
        }

        void a(e eVar) {
            int i;
            int size = this.d.size();
            int i2 = this.a;
            if (size < i2) {
                this.d.add(eVar);
                i = this.d.size();
            } else {
                int i3 = this.b % i2;
                this.b = i3;
                e eVar2 = this.d.set(i3, eVar);
                eVar2.b();
                this.c = eVar2;
                i = this.b + 1;
            }
            this.b = i;
        }
    }

    public h(int i) {
        this(i, false);
    }

    public h(int i, boolean z) {
        this.c = 0;
        this.d = 0;
        this.e = 100;
        this.f = 200;
        this.i = -1L;
        this.j = -1L;
        this.k = -1;
        this.l = -1L;
        this.p = false;
        this.q = false;
        this.s = false;
        this.u = new Runnable() { // from class: com.apm.insight.b.h.2
            private long c;
            private long b = 0;
            private int d = -1;
            private int e = 0;
            private int f = 0;

            @Override // java.lang.Runnable
            public void run() {
                long uptimeMillis = SystemClock.uptimeMillis();
                a a2 = h.this.h.a();
                if (this.d == h.this.d) {
                    this.e++;
                } else {
                    this.e = 0;
                    this.f = 0;
                    this.c = uptimeMillis;
                }
                this.d = h.this.d;
                int i2 = this.e;
                if (i2 > 0 && i2 - this.f >= h.t && this.b != 0 && uptimeMillis - this.c > 700 && h.this.s) {
                    a2.f = Looper.getMainLooper().getThread().getStackTrace();
                    this.f = this.e;
                }
                a2.d = h.this.s;
                a2.c = (uptimeMillis - this.b) - 300;
                a2.a = uptimeMillis;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                this.b = uptimeMillis2;
                a2.b = uptimeMillis2 - uptimeMillis;
                a2.e = h.this.d;
                h.this.r.a(h.this.u, 300L);
                h.this.h.a(a2);
            }
        };
        this.a = new c() { // from class: com.apm.insight.b.h.1
        };
        if (!z && !b) {
            this.r = null;
            return;
        }
        u uVar = new u("looper_monitor");
        this.r = uVar;
        uVar.b();
        this.h = new b(MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION);
        uVar.a(this.u, 300L);
    }

    private static long a(int i) {
        if (i < 0) {
            return 0L;
        }
        try {
            return com.apm.insight.runtime.g.a(i);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static String a(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return "unknown message";
        }
        try {
            String[] split = str.split(":");
            String str3 = split.length == 2 ? split[1] : "";
            if (str.contains("{") && str.contains("}")) {
                str2 = str.split("\\{")[0];
                try {
                    str = str2 + str.split("\\}")[1];
                } catch (Throwable unused) {
                    return str2;
                }
            } else {
                str2 = str;
            }
            if (str.contains("@")) {
                String[] split2 = str.split("@");
                if (split2.length > 1) {
                    str = split2[0];
                }
            }
            if (str.contains("(") && str.contains(")") && !str.endsWith(" null")) {
                String[] split3 = str.split("\\(");
                if (split3.length > 1) {
                    str = split3[1];
                }
                str = str.replace(")", "");
            }
            if (str.startsWith(" ")) {
                str = str.replace(" ", "");
            }
            return str + str3;
        } catch (Throwable unused2) {
            return str;
        }
    }

    private void a(int i, long j, String str) {
        a(i, j, str, true);
    }

    private void a(int i, long j, String str, boolean z) {
        this.q = true;
        e a2 = this.g.a(i);
        a2.f = j - this.i;
        if (z) {
            long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
            a2.g = currentThreadTimeMillis - this.l;
            this.l = currentThreadTimeMillis;
        } else {
            a2.g = -1L;
        }
        a2.e = this.c;
        a2.h = str;
        a2.i = this.m;
        a2.a = this.i;
        a2.b = j;
        a2.c = this.j;
        this.g.a(a2);
        this.c = 0;
        this.i = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z, long j) {
        h hVar;
        int i;
        String str;
        boolean z2;
        int i2 = this.d + 1;
        this.d = i2;
        this.d = i2 & 65535;
        this.q = false;
        if (this.i < 0) {
            this.i = j;
        }
        if (this.j < 0) {
            this.j = j;
        }
        if (this.k < 0) {
            this.k = Process.myTid();
            this.l = SystemClock.currentThreadTimeMillis();
        }
        long j2 = j - this.i;
        int i3 = this.f;
        if (j2 > i3) {
            long j3 = this.j;
            if (j - j3 > i3) {
                int i4 = this.c;
                if (z) {
                    if (i4 == 0) {
                        a(1, j, "no message running");
                    } else {
                        a(9, j3, this.m);
                        i = 1;
                        str = "no message running";
                        z2 = false;
                    }
                } else if (i4 == 0) {
                    i = 8;
                    str = this.n;
                    z2 = true;
                } else {
                    hVar = this;
                    hVar.a(9, j3, this.m, false);
                    i = 8;
                    str = this.n;
                    z2 = true;
                    hVar.a(i, j, str, z2);
                }
                hVar = this;
                hVar.a(i, j, str, z2);
            } else {
                a(9, j, this.n);
            }
        }
        this.j = j;
    }

    private void e() {
        this.e = 100;
        this.f = MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION;
    }

    static /* synthetic */ int f(h hVar) {
        int i = hVar.c;
        hVar.c = i + 1;
        return i;
    }

    public e a(long j) {
        e eVar = new e();
        eVar.h = this.n;
        eVar.i = this.m;
        eVar.f = j - this.j;
        eVar.g = a(this.k) - this.l;
        eVar.e = this.c;
        return eVar;
    }

    public void a() {
        if (this.p) {
            return;
        }
        this.p = true;
        e();
        this.g = new f(this.e);
        this.o = new com.apm.insight.b.e() { // from class: com.apm.insight.b.h.3
            @Override // com.apm.insight.b.e
            public void a(String str) {
                h.this.s = true;
                h.this.n = str;
                super.a(str);
                h.this.a(true, com.apm.insight.b.e.a);
            }

            @Override // com.apm.insight.b.e
            public boolean a() {
                return true;
            }

            @Override // com.apm.insight.b.e
            public void b(String str) {
                super.b(str);
                h.f(h.this);
                h.this.a(false, com.apm.insight.b.e.a);
                h hVar = h.this;
                hVar.m = hVar.n;
                h.this.n = "no message running";
                h.this.s = false;
            }
        };
        i.a();
        i.a(this.o);
        k.a(k.a());
    }

    void b() {
        a();
    }

    public JSONArray c() {
        List<e> a2;
        JSONArray jSONArray = new JSONArray();
        try {
            a2 = this.g.a();
        } catch (Throwable unused) {
        }
        if (a2 == null) {
            return jSONArray;
        }
        int i = 0;
        for (e eVar : a2) {
            if (eVar != null) {
                i++;
                jSONArray.put(eVar.a().put(FacebookMediationAdapter.KEY_ID, i));
            }
        }
        return jSONArray;
    }
}
