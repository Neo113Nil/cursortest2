package l5;

import m5.k;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public final m5.k f18757a;

    /* renamed from: b, reason: collision with root package name */
    private b f18758b;

    /* renamed from: c, reason: collision with root package name */
    public final k.c f18759c;

    class a implements k.c {
        a() {
        }

        @Override // m5.k.c
        public void C(m5.j jVar, k.d dVar) {
            if (n.this.f18758b == null) {
                z4.b.e("SpellCheckChannel", "No SpellCheckeMethodHandler registered, call not forwarded to spell check API.");
                return;
            }
            String str = jVar.f19247a;
            Object obj = jVar.f19248b;
            z4.b.e("SpellCheckChannel", "Received '" + str + "' message.");
            str.hashCode();
            if (!str.equals("SpellCheck.initiateSpellCheck")) {
                dVar.c();
                return;
            }
            try {
                JSONArray jSONArray = (JSONArray) obj;
                n.this.f18758b.a(jSONArray.getString(0), jSONArray.getString(1), dVar);
            } catch (JSONException e7) {
                dVar.b("error", e7.getMessage(), null);
            }
        }
    }

    public interface b {
        void a(String str, String str2, k.d dVar);
    }

    public n(a5.a aVar) {
        a aVar2 = new a();
        this.f18759c = aVar2;
        m5.k kVar = new m5.k(aVar, "flutter/spellcheck", m5.g.f19246a);
        this.f18757a = kVar;
        kVar.e(aVar2);
    }

    public void b(b bVar) {
        this.f18758b = bVar;
    }
}
