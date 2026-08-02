package l;

import U1.C0080a;
import a2.InterfaceC0133a;
import android.content.Context;
import android.webkit.WebView;
import j1.EnumC1054c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.Executor;
import x0.InterfaceC1239b;

/* loaded from: classes.dex */
public final class t0 implements InterfaceC1239b {

    /* renamed from: a, reason: collision with root package name */
    public Object f9909a;

    /* renamed from: b, reason: collision with root package name */
    public Object f9910b;

    /* renamed from: c, reason: collision with root package name */
    public Object f9911c;

    /* renamed from: d, reason: collision with root package name */
    public Object f9912d;

    /* renamed from: e, reason: collision with root package name */
    public Object f9913e;
    public Object f;

    /* renamed from: g, reason: collision with root package name */
    public Object f9914g;

    public t0(C0080a c0080a, WebView webView, String str, ArrayList arrayList, EnumC1054c enumC1054c) {
        ArrayList arrayList2 = new ArrayList();
        this.f9911c = arrayList2;
        this.f9912d = new HashMap();
        this.f9909a = c0080a;
        this.f9910b = webView;
        this.f9913e = str;
        this.f9914g = enumC1054c;
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                j1.h hVar = (j1.h) it.next();
                ((HashMap) this.f9912d).put(UUID.randomUUID().toString(), hVar);
            }
        }
        this.f = "";
    }

    @Override // a2.InterfaceC0133a
    public Object get() {
        return new B0.m((Context) ((b0.r) this.f9909a).f2543a, (w0.f) ((InterfaceC0133a) this.f9910b).get(), (C0.d) ((InterfaceC0133a) this.f9911c).get(), (B0.d) ((A0.f) this.f9912d).get(), (Executor) ((InterfaceC0133a) this.f9913e).get(), (D0.c) ((InterfaceC0133a) this.f).get(), new K0.j(4), new K0.j(3), (C0.c) ((InterfaceC0133a) this.f9914g).get());
    }
}
