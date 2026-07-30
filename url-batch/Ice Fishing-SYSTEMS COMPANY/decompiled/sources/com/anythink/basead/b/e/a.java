package com.anythink.basead.b.e;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.AdError;
import com.anythink.core.common.d.t;
import com.anythink.core.common.d.u;
import com.anythink.core.common.m.h;
import com.anythink.core.common.m.q;
import com.anythink.core.common.v.af;
import com.anythink.core.common.v.k;
import com.anythink.core.common.v.w;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    private static final String f6160c = k.b("eyJkc3BfY2xpY2tfbWFjcm9fY29uZmlnIjp7IjQ5Ijp7Im1hcHBpbmdzIjpbeyJtYWNybyI6Il9fUkVfQ19ET1dOX1hfXyIsImFjdGlvbiI6IjMiLCJ2YWx1ZSI6IiRkeCQifSx7Im1hY3JvIjoiX19SRV9DX0RPV05fWV9fIiwiYWN0aW9uIjoiMyIsInZhbHVlIjoiJGR5JCJ9LHsibWFjcm8iOiJfX1JFX0NfVVBfWF9fIiwiYWN0aW9uIjoiMyIsInZhbHVlIjoiJHV4JCJ9LHsibWFjcm8iOiJfX1JFX0NfVVBfWV9fIiwiYWN0aW9uIjoiMyIsInZhbHVlIjoiJHV5JCJ9LHsibWFjcm8iOiJfX01fWF9BQ0NfXyIsImFjdGlvbiI6IjMiLCJ2YWx1ZSI6IiR6bWEkIn0seyJtYWNybyI6Il9fTV9ZX0FDQ19fIiwiYWN0aW9uIjoiMyIsInZhbHVlIjoiJHltYSQifSx7Im1hY3JvIjoiX19NX1pfQUNDX18iLCJhY3Rpb24iOiIzIiwidmFsdWUiOiIkem1hJCJ9XX19fQ==");

    /* renamed from: a, reason: collision with root package name */
    boolean f6161a;

    /* renamed from: b, reason: collision with root package name */
    private final String f6162b;

    /* renamed from: d, reason: collision with root package name */
    private volatile String f6163d;

    /* renamed from: e, reason: collision with root package name */
    private File f6164e;

    /* renamed from: f, reason: collision with root package name */
    private final Object f6165f;

    /* renamed from: g, reason: collision with root package name */
    private final String f6166g;

    /* renamed from: h, reason: collision with root package name */
    private final String f6167h;
    private final String i;

    /* renamed from: j, reason: collision with root package name */
    private Map<String, b> f6168j;

    /* renamed from: com.anythink.basead.b.e.a$3, reason: invalid class name */
    public class AnonymousClass3 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f6173a;

        public AnonymousClass3(String str) {
            this.f6173a = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (a.this.f6165f) {
                try {
                    if (!a.this.f6164e.exists()) {
                        a.this.f6164e.mkdirs();
                    }
                    File file = new File(a.this.f6164e, "tracker_mapping.txt");
                    if (file.exists()) {
                        file.delete();
                    }
                    w.a(this.f6173a.getBytes(), file);
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: com.anythink.basead.b.e.a$a, reason: collision with other inner class name */
    public static class C0010a {

        /* renamed from: a, reason: collision with root package name */
        private static final a f6175a = new a(0);

        private C0010a() {
        }
    }

    public /* synthetic */ a(byte b9) {
        this();
    }

    private static void b() {
    }

    private a() {
        this.f6162b = "a";
        this.f6165f = new Object();
        this.f6166g = "tracker_mapping";
        this.f6167h = "anythink_tracker_mapping/";
        this.i = "tracker_mapping.txt";
        this.f6161a = false;
        try {
            this.f6164e = new File(t.b().g().getFilesDir().getAbsoluteFile().getAbsolutePath() + "/anythink_tracker_mapping/");
        } catch (Throwable unused) {
        }
        this.f6168j = new HashMap();
        com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.basead.b.e.a.1
            @Override // java.lang.Runnable
            public final void run() {
                a aVar = a.this;
                aVar.f6163d = aVar.c();
                a aVar2 = a.this;
                aVar2.b(aVar2.f6163d);
            }
        }, 2);
    }

    private void c(String str) {
        com.anythink.core.common.v.b.b.a().b(new AnonymousClass3(str), 2);
    }

    public static a a() {
        return C0010a.f6175a;
    }

    public final void b(String str) {
        JSONArray optJSONArray;
        try {
            Map<String, b> map = this.f6168j;
            if (map == null) {
                return;
            }
            map.clear();
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("dsp_click_macro_config");
            if (optJSONObject != null) {
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject(next);
                    if (optJSONObject2 != null && (optJSONArray = optJSONObject2.optJSONArray("mappings")) != null) {
                        b bVar = new b();
                        bVar.a(optJSONArray);
                        this.f6168j.put(next, bVar);
                    }
                }
            }
            Objects.toString(optJSONObject);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String c() {
        String str;
        synchronized (this.f6165f) {
            str = f6160c;
            try {
                File file = new File(this.f6164e, "tracker_mapping.txt");
                if (file.exists() && file.canRead()) {
                    str = w.a(file);
                }
            } catch (Throwable unused) {
            }
        }
        return str;
    }

    public final synchronized void a(Context context, final String str) {
        if (this.f6161a) {
            return;
        }
        if (context == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        final Context applicationContext = context.getApplicationContext();
        String c4 = af.c(applicationContext, u.b.f13004a, "tracker_mapping", "");
        if (TextUtils.isEmpty(c4) || !TextUtils.equals(c4, str)) {
            this.f6161a = true;
            try {
                new h(str).a(1, new q() { // from class: com.anythink.basead.b.e.a.2
                    @Override // com.anythink.core.common.m.q
                    public final void onLoadCanceled(int i) {
                        a.this.f6161a = false;
                    }

                    @Override // com.anythink.core.common.m.q
                    public final void onLoadError(int i, String str2, AdError adError) {
                        a aVar = a.this;
                        aVar.f6161a = false;
                        String unused = aVar.f6162b;
                    }

                    @Override // com.anythink.core.common.m.q
                    public final void onLoadFinish(int i, Object obj) {
                        String obj2 = obj != null ? obj.toString() : "";
                        if (!TextUtils.isEmpty(obj2)) {
                            String unused = a.this.f6162b;
                            a.this.f6163d = obj2;
                            a.b(a.this, obj2);
                            af.b(applicationContext, u.b.f13004a, "tracker_mapping", str);
                            a aVar = a.this;
                            aVar.b(aVar.f6163d);
                        }
                        a.this.f6161a = false;
                    }

                    @Override // com.anythink.core.common.m.q
                    public final void onLoadStart(int i) {
                    }
                });
            } catch (Throwable unused) {
                this.f6161a = false;
            }
        }
    }

    public static /* synthetic */ void b(a aVar, String str) {
        com.anythink.core.common.v.b.b.a().b(aVar.new AnonymousClass3(str), 2);
    }

    public final b a(String str) {
        Map<String, b> map = this.f6168j;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }
}
