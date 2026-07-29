package com.facebook.ads.internal.q.c;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.ads.internal.p.a.n;
import com.facebook.ads.internal.p.a.p;
import com.facebook.ads.internal.q.a.j;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class e extends AsyncTask<String, Void, f> {

    /* renamed from: a, reason: collision with root package name */
    private static final String f5465a = "e";

    /* renamed from: b, reason: collision with root package name */
    private static final Set<String> f5466b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    private Context f5467c;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, String> f5468d;
    private Map<String, String> e;
    private n f;
    private a g;

    public interface a {
        void a();

        void a(f fVar);
    }

    static {
        f5466b.add("#");
        f5466b.add("null");
    }

    public e(Context context) {
        this(context, null, null);
    }

    public e(Context context, Map<String, String> map) {
        this(context, map, null);
    }

    public e(Context context, Map<String, String> map, Map<String, String> map2) {
        this.f5467c = context;
        this.f5468d = map != null ? new HashMap(map) : null;
        this.e = map2 != null ? new HashMap(map2) : null;
    }

    private String a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return str;
        }
        return str + (str.contains("?") ? "&" : "?") + str2 + "=" + URLEncoder.encode(str3);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f A[Catch: Exception -> 0x003b, TRY_LEAVE, TryCatch #0 {Exception -> 0x003b, blocks: (B:3:0x0007, B:5:0x000b, B:8:0x0014, B:9:0x0022, B:10:0x002b, B:12:0x002f, B:20:0x0025), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean a(String str) {
        n a2;
        com.facebook.ads.internal.p.a.a a3 = d.a(this.f5467c);
        try {
            if (this.e != null && this.e.size() != 0) {
                p pVar = new p();
                pVar.a((Map<? extends String, ? extends String>) this.e);
                a2 = a3.b(str, pVar);
                this.f = a2;
                if (this.f == null) {
                    return this.f.a() == 200;
                }
                return false;
            }
            a2 = a3.a(str, (p) null);
            this.f = a2;
            if (this.f == null) {
            }
        } catch (Exception e) {
            Log.e(f5465a, "Error opening url: " + str, e);
            return false;
        }
    }

    private String b(String str) {
        try {
            return a(str, "analog", j.a(com.facebook.ads.internal.g.a.a()));
        } catch (Exception unused) {
            return str;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public f doInBackground(String... strArr) {
        String str = strArr[0];
        if (!TextUtils.isEmpty(str) && !f5466b.contains(str)) {
            String b2 = b(str);
            if (this.f5468d != null && !this.f5468d.isEmpty()) {
                for (Map.Entry<String, String> entry : this.f5468d.entrySet()) {
                    b2 = a(b2, entry.getKey(), entry.getValue());
                }
            }
            int i = 1;
            while (true) {
                int i2 = i + 1;
                if (i > 2) {
                    break;
                }
                if (a(b2)) {
                    return new f(this.f);
                }
                i = i2;
            }
        }
        return null;
    }

    public void a(a aVar) {
        this.g = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(f fVar) {
        if (this.g != null) {
            this.g.a(fVar);
        }
    }

    @Override // android.os.AsyncTask
    protected void onCancelled() {
        if (this.g != null) {
            this.g.a();
        }
    }
}
