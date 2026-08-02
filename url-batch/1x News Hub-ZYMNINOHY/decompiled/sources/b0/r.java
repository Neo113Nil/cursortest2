package b0;

import android.content.Intent;
import android.os.ResultReceiver;
import android.view.View;
import android.webkit.WebView;
import b2.C0195i;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.internal.play_billing.AbstractC0248o0;
import com.google.android.gms.internal.play_billing.C;
import d2.InterfaceC0300c;
import e.C0304a;
import e.InterfaceC0305b;
import e2.EnumC0317a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import k.InterfaceC1070o;
import k.MenuC1065j;
import k.SubMenuC1075t;
import l.C1087i;
import l.InterfaceC1090l;
import n0.C1157s;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import org.json.JSONObject;
import x0.InterfaceC1239b;
import y1.InterfaceC1255c;

/* loaded from: classes.dex */
public final class r implements q, io.flutter.plugin.editing.b, InterfaceC1070o, InterfaceC1090l, InterfaceC0305b, w2.d, InterfaceC1239b, InterfaceC1255c {

    /* renamed from: a, reason: collision with root package name */
    public Object f2543a;

    public /* synthetic */ r(Object obj) {
        this.f2543a = obj;
    }

    @Override // k.InterfaceC1070o
    public void a(MenuC1065j menuC1065j, boolean z) {
        if (menuC1065j instanceof SubMenuC1075t) {
            ((SubMenuC1075t) menuC1065j).f9669w.j().c(false);
        }
        InterfaceC1070o interfaceC1070o = ((C1087i) this.f2543a).f9821e;
        if (interfaceC1070o != null) {
            interfaceC1070o.a(menuC1065j, z);
        }
    }

    @Override // b0.q
    public String[] b() {
        return ((WebViewProviderFactoryBoundaryInterface) this.f2543a).getSupportedFeatures();
    }

    @Override // e.InterfaceC0305b
    public void c(Object obj) {
        C0304a c0304a = (C0304a) obj;
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f2543a;
        proxyBillingActivityV2.getClass();
        Intent intent = c0304a.f4953b;
        int i3 = AbstractC0248o0.d(intent, "ProxyBillingActivityV2").f10092a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.v;
        if (resultReceiver != null) {
            resultReceiver.send(i3, intent == null ? null : intent.getExtras());
        }
        int i4 = c0304a.f4952a;
        if (i4 != -1 || i3 != 0) {
            AbstractC0248o0.g("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i4 + " and billing's responseCode: " + i3);
        }
        proxyBillingActivityV2.finish();
    }

    @Override // b0.q
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) C2.b.e(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f2543a).createWebView(webView));
    }

    @Override // k.InterfaceC1070o
    public boolean d(SubMenuC1075t subMenuC1075t) {
        if (subMenuC1075t == null) {
            return false;
        }
        subMenuC1075t.f9670x.getClass();
        C1087i c1087i = (C1087i) this.f2543a;
        c1087i.getClass();
        InterfaceC1070o interfaceC1070o = c1087i.f9821e;
        if (interfaceC1070o != null) {
            return interfaceC1070o.d(subMenuC1075t);
        }
        return false;
    }

    @Override // y1.InterfaceC1255c
    public void e(Serializable serializable) {
        ((P1.n) this.f2543a).success(serializable);
    }

    @Override // y1.InterfaceC1255c
    public void f(String str, HashMap hashMap) {
        ((P1.n) this.f2543a).b("sqlite_error", str, hashMap);
    }

    public JSONObject g(View view) {
        if (view == null) {
            return r1.b.a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        int[] iArr = (int[]) this.f2543a;
        view.getLocationOnScreen(iArr);
        return r1.b.a(iArr[0], iArr[1], width, height);
    }

    @Override // a2.InterfaceC0133a
    public Object get() {
        return this.f2543a;
    }

    @Override // b0.q
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) C2.b.e(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f2543a).getStatics());
    }

    @Override // b0.q
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) C2.b.e(WebkitToCompatConverterBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f2543a).getWebkitToCompatConverter());
    }

    public s h() {
        if (((C) this.f2543a) == null) {
            throw new IllegalArgumentException("Product list must be set to a non empty list.");
        }
        s sVar = new s();
        sVar.f2544a = (C) this.f2543a;
        return sVar;
    }

    public void j(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("Product list cannot be empty.");
        }
        HashSet hashSet = new HashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C1157s c1157s = (C1157s) it.next();
            if (!"play_pass_subs".equals(c1157s.f10122b)) {
                hashSet.add(c1157s.f10122b);
            }
        }
        if (hashSet.size() > 1) {
            throw new IllegalArgumentException("All products should be of the same product type.");
        }
        this.f2543a = C.k(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r7v4, types: [f2.i, l2.p] */
    @Override // w2.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(w2.e eVar, InterfaceC0300c interfaceC0300c) {
        w2.a aVar;
        int i3;
        Throwable th;
        x2.m mVar;
        if (interfaceC0300c instanceof w2.a) {
            aVar = (w2.a) interfaceC0300c;
            int i4 = aVar.f10641g;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                aVar.f10641g = i4 - Integer.MIN_VALUE;
                Object obj = aVar.f10640e;
                EnumC0317a enumC0317a = EnumC0317a.f4969a;
                i3 = aVar.f10641g;
                C0195i c0195i = C0195i.f2555a;
                if (i3 != 0) {
                    android.support.v4.media.session.a.T(obj);
                    d2.h hVar = aVar.f4981b;
                    kotlin.jvm.internal.j.b(hVar);
                    x2.m mVar2 = new x2.m(eVar, hVar);
                    try {
                        aVar.f10639d = mVar2;
                        aVar.f10641g = 1;
                        Object invoke = ((f2.i) this.f2543a).invoke(mVar2, aVar);
                        if (invoke != enumC0317a) {
                            invoke = c0195i;
                        }
                        if (invoke == enumC0317a) {
                            return enumC0317a;
                        }
                        mVar = mVar2;
                    } catch (Throwable th2) {
                        th = th2;
                        mVar = mVar2;
                        mVar.h();
                        throw th;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mVar = aVar.f10639d;
                    try {
                        android.support.v4.media.session.a.T(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        mVar.h();
                        throw th;
                    }
                }
                mVar.h();
                return c0195i;
            }
        }
        aVar = new w2.a(this, interfaceC0300c);
        Object obj2 = aVar.f10640e;
        EnumC0317a enumC0317a2 = EnumC0317a.f4969a;
        i3 = aVar.f10641g;
        C0195i c0195i2 = C0195i.f2555a;
        if (i3 != 0) {
        }
        mVar.h();
        return c0195i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r(l2.p pVar) {
        this.f2543a = (f2.i) pVar;
    }
}
