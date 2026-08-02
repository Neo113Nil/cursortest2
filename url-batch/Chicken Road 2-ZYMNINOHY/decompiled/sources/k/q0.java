package k;

import android.content.Context;
import android.webkit.WebView;
import b3.InterfaceC0264a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class q0 implements N1.b {

    /* renamed from: a, reason: collision with root package name */
    public Object f14082a;

    /* renamed from: b, reason: collision with root package name */
    public Object f14083b;

    /* renamed from: c, reason: collision with root package name */
    public Object f14084c;

    /* renamed from: d, reason: collision with root package name */
    public Object f14085d;

    /* renamed from: e, reason: collision with root package name */
    public Object f14086e;

    /* renamed from: f, reason: collision with root package name */
    public Object f14087f;

    /* renamed from: g, reason: collision with root package name */
    public Object f14088g;

    public q0(a2.i iVar, WebView webView, String str, ArrayList arrayList, F2.c cVar) {
        ArrayList arrayList2 = new ArrayList();
        this.f14084c = arrayList2;
        this.f14085d = new HashMap();
        this.f14082a = iVar;
        this.f14083b = webView;
        this.f14086e = str;
        this.f14088g = cVar;
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                String uuid = UUID.randomUUID().toString();
                ((HashMap) this.f14085d).put(uuid, (F2.h) obj);
            }
        }
        this.f14087f = "";
    }

    @Override // b3.InterfaceC0264a
    public Object get() {
        return new R1.m((Context) ((InterfaceC0264a) this.f14082a).get(), (M1.e) ((InterfaceC0264a) this.f14083b).get(), (S1.d) ((InterfaceC0264a) this.f14084c).get(), (R1.d) ((B1.j) this.f14085d).get(), (Executor) ((InterfaceC0264a) this.f14086e).get(), (T1.c) ((InterfaceC0264a) this.f14087f).get(), new a2.i(25), new a2.i(24), (S1.c) ((InterfaceC0264a) this.f14088g).get());
    }
}
