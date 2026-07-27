package B1;

import W2.InterfaceC0302y;
import android.app.Application;
import android.content.Context;
import com.appsflyer.AppsFlyerLib;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1341p;
import y2.AbstractC1343r;
import y2.C1342q;

/* renamed from: B1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0095b extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f975k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Application f976l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f977m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0095b(Application application, String str, C2.a aVar) {
        super(2, aVar);
        this.f976l = application;
        this.f977m = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((C0095b) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        C0095b c0095b = new C0095b(this.f976l, this.f977m, aVar);
        c0095b.f975k = obj;
        return c0095b;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        Object a4;
        D2.a aVar = D2.a.f2163d;
        AbstractC1343r.b(obj);
        Context applicationContext = this.f976l.getApplicationContext();
        String str = this.f977m;
        try {
            AbstractC1341p.a aVar2 = AbstractC1341p.f11673d;
            AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
            if (!u3.d.f10941e) {
                appsFlyerLib.init(str, null, applicationContext);
                appsFlyerLib.start(applicationContext);
                u3.d.f10941e = true;
            }
            a4 = appsFlyerLib.getAppsFlyerUID(applicationContext);
        } catch (Throwable th) {
            AbstractC1341p.a aVar3 = AbstractC1341p.f11673d;
            a4 = AbstractC1343r.a(th);
        }
        if (a4 instanceof C1342q) {
            return null;
        }
        return a4;
    }
}
