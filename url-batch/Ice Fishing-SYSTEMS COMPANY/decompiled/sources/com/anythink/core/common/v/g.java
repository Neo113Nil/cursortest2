package com.anythink.core.common.v;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.anythink.core.api.AdError;
import com.anythink.core.common.d.u;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class g {

    /* renamed from: d, reason: collision with root package name */
    private static volatile g f16905d;

    /* renamed from: g, reason: collision with root package name */
    private String f16911g;
    private File i;

    /* renamed from: l, reason: collision with root package name */
    private String f16915l;

    /* renamed from: m, reason: collision with root package name */
    private String f16916m;

    /* renamed from: c, reason: collision with root package name */
    private final String f16908c = getClass().getSimpleName();

    /* renamed from: e, reason: collision with root package name */
    private final String f16909e = k.b("aHR0cHM6Ly9tb3Jlcy5hbnl0aGlua3RlY2guY29tL3RpbmlmeS90YWt1X2FkeF9leHRfcmVzX2pzb24udHh0");

    /* renamed from: f, reason: collision with root package name */
    private final String f16910f = "adx_optional_res.txt";

    /* renamed from: h, reason: collision with root package name */
    private final String f16912h = "anythink_optres/";

    /* renamed from: a, reason: collision with root package name */
    boolean f16906a = false;

    /* renamed from: b, reason: collision with root package name */
    final String f16907b = "adx_optional_res_url";

    /* renamed from: j, reason: collision with root package name */
    private final Object f16913j = new Object();

    /* renamed from: k, reason: collision with root package name */
    private Map<String, String> f16914k = new HashMap();

    /* renamed from: com.anythink.core.common.v.g$3, reason: invalid class name */
    public class AnonymousClass3 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f16921a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f16922b;

        public AnonymousClass3(String str, String str2) {
            this.f16921a = str;
            this.f16922b = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (g.this.f16913j) {
                try {
                    if (!g.this.i.exists()) {
                        g.this.i.mkdirs();
                    }
                    File file = new File(g.this.i, this.f16921a);
                    if (file.exists()) {
                        file.delete();
                    }
                    w.a(this.f16922b.getBytes(), file);
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized Map<String, String> e(String str) {
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(str)) {
            return hashMap;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.optString(next));
            }
        } catch (Throwable unused) {
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized Map<String, String> d(String str) {
        Map<String, String> e6;
        synchronized (this.f16913j) {
            String str2 = "";
            try {
                File file = new File(this.i, str);
                if (file.exists() && file.canRead()) {
                    str2 = w.a(file);
                }
            } catch (Throwable unused) {
            }
            e6 = e(str2);
        }
        return e6;
    }

    public final boolean b(Context context) {
        String str;
        if (this.f16906a) {
            return false;
        }
        com.anythink.core.d.b k6 = com.anythink.basead.b.c.i.k(com.anythink.core.d.d.a(context));
        if (k6 != null && !k6.S()) {
            str = k6.aa();
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            str = this.f16909e;
        }
        if (TextUtils.isEmpty(str) || TextUtils.equals(this.f16916m, str)) {
            return false;
        }
        String b9 = b();
        if (!TextUtils.isEmpty(b9) && TextUtils.equals(b9, str)) {
            if (this.f16914k.isEmpty()) {
                this.f16914k = d("adx_optional_res.txt");
            }
            return false;
        }
        this.f16911g = str;
        return true;
    }

    public final void c(final Context context) {
        if (b(context)) {
            String str = this.f16911g;
            this.f16906a = true;
            try {
                new com.anythink.core.common.m.h(str).a(1, new com.anythink.core.common.m.q() { // from class: com.anythink.core.common.v.g.2
                    @Override // com.anythink.core.common.m.q
                    public final void onLoadCanceled(int i) {
                        g.this.f16906a = false;
                    }

                    @Override // com.anythink.core.common.m.q
                    public final void onLoadError(int i, String str2, AdError adError) {
                        g gVar = g.this;
                        gVar.f16916m = gVar.f16911g;
                        g gVar2 = g.this;
                        gVar2.f16906a = false;
                        com.anythink.core.common.u.e.a(3, gVar2.f16911g, adError != null ? adError.printStackTrace() : "");
                    }

                    @Override // com.anythink.core.common.m.q
                    public final void onLoadFinish(int i, Object obj) {
                        String obj2 = obj != null ? obj.toString() : "";
                        String unused = g.this.f16908c;
                        String unused2 = g.this.f16911g;
                        obj2.length();
                        if (!TextUtils.isEmpty(obj2)) {
                            g gVar = g.this;
                            gVar.a(context, gVar.f16911g);
                            g gVar2 = g.this;
                            gVar2.f16914k = gVar2.e(obj2);
                            g.a(g.this, obj2, "adx_optional_res.txt");
                        }
                        g.this.f16906a = false;
                    }

                    @Override // com.anythink.core.common.m.q
                    public final void onLoadStart(int i) {
                    }
                });
            } catch (Throwable unused) {
                this.f16906a = false;
            }
        }
    }

    public static g a() {
        if (f16905d == null) {
            synchronized (g.class) {
                try {
                    if (f16905d == null) {
                        f16905d = new g();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f16905d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void d(Context context) {
        if (context == null) {
            try {
                context = com.anythink.core.common.d.t.b().g();
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f16915l = af.c(context, u.b.f13004a, "adx_optional_res_url", "");
    }

    public final Bitmap c(String str) {
        Map<String, String> map = this.f16914k;
        if (map == null || map.isEmpty()) {
            return null;
        }
        String str2 = this.f16914k.get(str);
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        return D.y.f().b(new com.anythink.core.common.res.e(3, str2), 0, 0);
    }

    public final void a(final Context context) {
        try {
            this.i = new File(com.anythink.core.common.d.t.b().g().getFilesDir().getAbsoluteFile().getAbsolutePath() + "/anythink_optres/");
        } catch (Throwable unused) {
        }
        com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.core.common.v.g.1
            @Override // java.lang.Runnable
            public final void run() {
                g.this.d(context);
                g gVar = g.this;
                gVar.f16914k = gVar.d("adx_optional_res.txt");
            }
        }, 2);
    }

    private void a(String str, String str2) {
        com.anythink.core.common.v.b.b.a().b(new AnonymousClass3(str2, str), 2);
    }

    public final String a(String str) {
        Map<String, String> map = this.f16914k;
        if (map != null && !map.isEmpty()) {
            return this.f16914k.get(str);
        }
        return "";
    }

    private void a(List<String> list, String str) {
        if (list == null) {
            return;
        }
        String a9 = a(str);
        if (TextUtils.isEmpty(a9)) {
            return;
        }
        list.add(a9);
    }

    public final boolean b(String str) {
        Map<String, String> map = this.f16914k;
        if (map != null && !map.isEmpty()) {
            String str2 = this.f16914k.get(str);
            if (!TextUtils.isEmpty(str2) && D.y.f().b(new com.anythink.core.common.res.e(3, str2), 0, 0) != null) {
                return true;
            }
        }
        return false;
    }

    public final void a(Set<String> set, String str) {
        String a9 = a(str);
        if (TextUtils.isEmpty(a9)) {
            return;
        }
        set.add(a9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(Context context, String str) {
        this.f16915l = str;
        af.b(context, u.b.f13004a, "adx_optional_res_url", str);
    }

    public static /* synthetic */ void a(g gVar, String str, String str2) {
        com.anythink.core.common.v.b.b.a().b(gVar.new AnonymousClass3(str2, str), 2);
    }

    private synchronized String b() {
        return this.f16915l;
    }
}
