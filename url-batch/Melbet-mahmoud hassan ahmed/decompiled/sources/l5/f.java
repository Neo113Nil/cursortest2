package l5;

import android.os.Build;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import m5.k;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final m5.k f18645a;

    /* renamed from: b, reason: collision with root package name */
    private b f18646b;

    /* renamed from: c, reason: collision with root package name */
    public final k.c f18647c;

    class a implements k.c {
        a() {
        }

        @Override // m5.k.c
        public void C(m5.j jVar, k.d dVar) {
            if (f.this.f18646b == null) {
                return;
            }
            String str = jVar.f19247a;
            str.hashCode();
            if (!str.equals("Localization.getStringResource")) {
                dVar.c();
                return;
            }
            JSONObject jSONObject = (JSONObject) jVar.b();
            try {
                dVar.a(f.this.f18646b.a(jSONObject.getString("key"), jSONObject.has("locale") ? jSONObject.getString("locale") : null));
            } catch (JSONException e7) {
                dVar.b("error", e7.getMessage(), null);
            }
        }
    }

    public interface b {
        String a(String str, String str2);
    }

    public f(a5.a aVar) {
        a aVar2 = new a();
        this.f18647c = aVar2;
        m5.k kVar = new m5.k(aVar, "flutter/localization", m5.g.f19246a);
        this.f18645a = kVar;
        kVar.e(aVar2);
    }

    public void b(List<Locale> list) {
        z4.b.e("LocalizationChannel", "Sending Locales to Flutter.");
        ArrayList arrayList = new ArrayList();
        for (Locale locale : list) {
            z4.b.e("LocalizationChannel", "Locale (Language: " + locale.getLanguage() + ", Country: " + locale.getCountry() + ", Variant: " + locale.getVariant() + ")");
            arrayList.add(locale.getLanguage());
            arrayList.add(locale.getCountry());
            arrayList.add(Build.VERSION.SDK_INT >= 21 ? locale.getScript() : "");
            arrayList.add(locale.getVariant());
        }
        this.f18645a.c("setLocale", arrayList);
    }

    public void c(b bVar) {
        this.f18646b = bVar;
    }
}
