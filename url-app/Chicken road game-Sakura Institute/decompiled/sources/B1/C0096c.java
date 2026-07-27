package B1;

import W2.InterfaceC0302y;
import W2.y0;
import android.app.Application;
import android.webkit.WebSettings;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import y2.AbstractC1341p;
import y2.AbstractC1343r;
import y2.C1342q;

/* renamed from: B1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0096c extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f978k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f979l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f980m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f981n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f982o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f983p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ String f984q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0097d f985r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0096c(String str, String str2, String str3, String str4, String str5, C0097d c0097d, C2.a aVar) {
        super(2, aVar);
        this.f980m = str;
        this.f981n = str2;
        this.f982o = str3;
        this.f983p = str4;
        this.f984q = str5;
        this.f985r = c0097d;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((C0096c) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        C0096c c0096c = new C0096c(this.f980m, this.f981n, this.f982o, this.f983p, this.f984q, this.f985r, aVar);
        c0096c.f979l = obj;
        return c0096c;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        Object a4;
        Object a5;
        C0097d c0097d = this.f985r;
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f978k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            String str = this.f980m;
            if (kotlin.text.y.x(str)) {
                return null;
            }
            if (!kotlin.text.u.h(false, str, "/")) {
                str = str.concat("/");
            }
            try {
                AbstractC1341p.a aVar2 = AbstractC1341p.f11673d;
                Intrinsics.checkNotNullParameter(str, "<this>");
                m1.k kVar = new m1.k(1);
                kVar.o(null, str);
                a4 = kVar.b();
            } catch (Throwable th) {
                AbstractC1341p.a aVar3 = AbstractC1341p.f11673d;
                a4 = AbstractC1343r.a(th);
            }
            if (a4 instanceof C1342q) {
                a4 = null;
            }
            m3.m mVar = (m3.m) a4;
            if (mVar == null) {
                return null;
            }
            m1.k f4 = mVar.f();
            f4.a("custom_user_id", this.f981n);
            f4.a("uuid", this.f982o);
            f4.a("install_referrer", this.f983p);
            String str2 = this.f984q;
            if (!kotlin.text.y.x(str2)) {
                f4.a("apps_id", str2);
            }
            m3.m url = f4.b();
            try {
                String defaultUserAgent = WebSettings.getDefaultUserAgent((Application) c0097d.f987e);
                Intrinsics.checkNotNullExpressionValue(defaultUserAgent, "getDefaultUserAgent(...)");
                a5 = kotlin.text.u.l(kotlin.text.u.l(defaultUserAgent, "; wv)", ")"), "Version/4.0 ", "");
            } catch (Throwable th2) {
                AbstractC1341p.a aVar4 = AbstractC1341p.f11673d;
                a5 = AbstractC1343r.a(th2);
            }
            if (a5 instanceof C1342q) {
                a5 = null;
            }
            String str3 = (String) a5;
            Y0.b bVar = new Y0.b(9);
            Intrinsics.checkNotNullParameter(url, "url");
            bVar.f4391j = url;
            bVar.t("Accept", "application/json");
            if (str3 != null && str3.length() != 0) {
                bVar.t("User-Agent", str3);
            }
            bVar.v("GET", null);
            com.chicken.road.kedro.laqer.village.a aVar5 = new com.chicken.road.kedro.laqer.village.a(c0097d, bVar.d(), null);
            this.f978k = 1;
            obj = y0.b(15000L, aVar5, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1343r.b(obj);
        }
        return obj;
    }
}
