package y2;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.fj2;
import com.google.android.gms.internal.ads.io0;
import com.google.android.gms.internal.ads.kv;
import com.google.android.gms.internal.ads.po0;
import com.google.android.gms.internal.ads.r20;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
final class r {

    /* renamed from: a, reason: collision with root package name */
    private final Context f23426a;

    /* renamed from: b, reason: collision with root package name */
    private final String f23427b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, String> f23428c = new TreeMap();

    /* renamed from: d, reason: collision with root package name */
    private String f23429d;

    /* renamed from: e, reason: collision with root package name */
    private String f23430e;

    /* renamed from: f, reason: collision with root package name */
    private final String f23431f;

    public r(Context context, String str) {
        String concat;
        this.f23426a = context.getApplicationContext();
        this.f23427b = str;
        String packageName = context.getPackageName();
        try {
            String str2 = w3.c.a(context).f(context.getPackageName(), 0).versionName;
            StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 1 + String.valueOf(str2).length());
            sb.append(packageName);
            sb.append("-");
            sb.append(str2);
            concat = sb.toString();
        } catch (PackageManager.NameNotFoundException e7) {
            io0.e("Unable to get package version name for reporting", e7);
            concat = String.valueOf(packageName).concat("-missing");
        }
        this.f23431f = concat;
    }

    public final String a() {
        return this.f23431f;
    }

    public final String b() {
        return this.f23430e;
    }

    public final String c() {
        return this.f23427b;
    }

    public final String d() {
        return this.f23429d;
    }

    public final Map<String, String> e() {
        return this.f23428c;
    }

    public final void f(kv kvVar, po0 po0Var) {
        this.f23429d = kvVar.f7652o.f9964f;
        Bundle bundle = kvVar.f7655r;
        Bundle bundle2 = bundle != null ? bundle.getBundle(AdMobAdapter.class.getName()) : null;
        if (bundle2 == null) {
            return;
        }
        String e7 = r20.f10994c.e();
        for (String str : bundle2.keySet()) {
            if (e7.equals(str)) {
                this.f23430e = bundle2.getString(str);
            } else if (str.startsWith("csa_")) {
                this.f23428c.put(str.substring(4), bundle2.getString(str));
            }
        }
        this.f23428c.put("SDKVersion", po0Var.f10301f);
        if (r20.f10992a.e().booleanValue()) {
            try {
                Bundle b7 = fj2.b(this.f23426a, new JSONArray(r20.f10993b.e()));
                for (String str2 : b7.keySet()) {
                    this.f23428c.put(str2, b7.get(str2).toString());
                }
            } catch (JSONException e8) {
                io0.e("Flag gads:afs:csa_tcf_data_to_collect not a valid JSON array", e8);
            }
        }
    }
}
