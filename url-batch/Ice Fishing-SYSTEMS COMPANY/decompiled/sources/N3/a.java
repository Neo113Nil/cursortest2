package N3;

import android.text.TextUtils;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.A3;
import com.google.android.gms.internal.ads.AbstractC2655Lg;
import com.google.android.gms.internal.ads.C3330hq;
import com.google.android.gms.internal.ads.C3431jl;
import com.google.android.gms.internal.ads.C3582ma;
import com.google.android.gms.internal.ads.EnumC3010bw;
import com.google.android.gms.internal.ads.InterfaceC3222fq;
import com.google.android.gms.internal.ads.Vv;
import com.google.android.gms.internal.ads.Wv;
import com.google.android.gms.internal.ads.Xv;
import com.google.android.gms.internal.ads.Zw;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashSet;
import java.util.UUID;
import t2.C;

/* loaded from: classes2.dex */
public final class a implements InterfaceC3222fq {

    /* renamed from: n, reason: collision with root package name */
    public String f2147n;

    /* renamed from: u, reason: collision with root package name */
    public int f2148u;

    /* renamed from: v, reason: collision with root package name */
    public final int f2149v;

    /* renamed from: w, reason: collision with root package name */
    public final Serializable f2150w;

    /* renamed from: x, reason: collision with root package name */
    public final Serializable f2151x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f2152y;

    /* renamed from: z, reason: collision with root package name */
    public Object f2153z;

    public /* synthetic */ a(String str, String str2, String str3, int i, WebView webView, String str4, int i4) {
        this.f2147n = str;
        this.f2150w = str2;
        this.f2151x = str3;
        this.f2148u = i;
        this.f2152y = webView;
        this.f2153z = str4;
        this.f2149v = i4;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3222fq
    public Object a() {
        String str = this.f2147n;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Name is null or empty");
        }
        String str2 = (String) this.f2150w;
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("Version is null or empty");
        }
        C3582ma c3582ma = new C3582ma(str, str2, 3);
        EnumC3010bw m8 = C3431jl.m("javascript");
        String str3 = (String) this.f2151x;
        EnumC3010bw m9 = C3431jl.m(str3);
        int i = this.f2148u;
        Xv o9 = C3431jl.o(com.anythink.basead.b.c.i.b(i));
        EnumC3010bw enumC3010bw = EnumC3010bw.NONE;
        if (m8 == enumC3010bw) {
            int i4 = C.f40822b;
            u2.i.f("Omid js session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (o9 == null) {
            String z8 = com.anythink.basead.b.c.i.z(i);
            int i9 = C.f40822b;
            u2.i.f("Omid js session error; Unable to parse creative type: ".concat(z8));
            return null;
        }
        if (o9 == Xv.VIDEO && m9 == enumC3010bw) {
            String valueOf = String.valueOf(str3);
            int i10 = C.f40822b;
            u2.i.f("Omid js session error; Video events owner unknown for video creative: ".concat(valueOf));
            return null;
        }
        A3 a32 = new A3(c3582ma, (WebView) this.f2152y, (String) this.f2153z, "", Vv.JAVASCRIPT);
        Zw a9 = Zw.a(o9, C3431jl.n(com.anythink.basead.b.c.i.c(this.f2149v)), m8, m9, true);
        if (AbstractC2655Lg.f26175K.f26640u) {
            return new C3330hq(new Wv(a9, a32, UUID.randomUUID().toString()), a32);
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }

    public void b(j jVar) {
        if (((HashSet) this.f2150w).contains(jVar.f2177a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        ((HashSet) this.f2151x).add(jVar);
    }

    public b c() {
        if (((e) this.f2153z) != null) {
            return new b(this.f2147n, new HashSet((HashSet) this.f2150w), new HashSet((HashSet) this.f2151x), this.f2148u, this.f2149v, (e) this.f2153z, (HashSet) this.f2152y);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public a(Class cls, Class[] clsArr) {
        this.f2147n = null;
        HashSet hashSet = new HashSet();
        this.f2150w = hashSet;
        this.f2151x = new HashSet();
        this.f2148u = 0;
        this.f2149v = 0;
        this.f2152y = new HashSet();
        hashSet.add(r.a(cls));
        for (Class cls2 : clsArr) {
            Z5.c.b(cls2, "Null interface");
            ((HashSet) this.f2150w).add(r.a(cls2));
        }
    }

    public a(r rVar, r[] rVarArr) {
        this.f2147n = null;
        HashSet hashSet = new HashSet();
        this.f2150w = hashSet;
        this.f2151x = new HashSet();
        this.f2148u = 0;
        this.f2149v = 0;
        this.f2152y = new HashSet();
        hashSet.add(rVar);
        for (r rVar2 : rVarArr) {
            Z5.c.b(rVar2, "Null interface");
        }
        Collections.addAll((HashSet) this.f2150w, rVarArr);
    }
}
