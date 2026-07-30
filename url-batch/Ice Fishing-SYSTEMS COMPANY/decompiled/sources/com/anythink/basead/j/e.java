package com.anythink.basead.j;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import com.anythink.basead.b.c.i;
import com.anythink.basead.ui.BaseATView;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.v.ac;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    w f9261a;

    /* renamed from: b, reason: collision with root package name */
    x f9262b;

    /* renamed from: c, reason: collision with root package name */
    b f9263c;

    /* renamed from: d, reason: collision with root package name */
    a f9264d;

    /* renamed from: e, reason: collision with root package name */
    d f9265e;

    /* renamed from: f, reason: collision with root package name */
    float f9266f;

    /* renamed from: g, reason: collision with root package name */
    float f9267g;

    /* renamed from: m, reason: collision with root package name */
    private boolean f9272m;

    /* renamed from: n, reason: collision with root package name */
    private WeakReference<View> f9273n;

    /* renamed from: o, reason: collision with root package name */
    private List<WeakReference<View>> f9274o;

    /* renamed from: j, reason: collision with root package name */
    private final String f9269j = "e";

    /* renamed from: k, reason: collision with root package name */
    private boolean f9270k = false;

    /* renamed from: l, reason: collision with root package name */
    private boolean f9271l = false;

    /* renamed from: h, reason: collision with root package name */
    boolean f9268h = false;
    boolean i = false;

    public e(w wVar, x xVar) {
        this.f9261a = wVar;
        this.f9262b = xVar;
        ac.a();
        boolean d2 = ac.d();
        this.f9272m = d2;
        if (d2) {
            return;
        }
        t.b().F();
    }

    public static /* synthetic */ boolean e(e eVar) {
        eVar.f9271l = true;
        return true;
    }

    private static boolean c() {
        return f.a().b();
    }

    public final void a(final int i, final View view) {
        if (this.f9270k || !this.f9272m || !f.a().b() || this.f9268h || this.i || TextUtils.isEmpty(this.f9261a.av())) {
            return;
        }
        t.b().b(new Runnable() { // from class: com.anythink.basead.j.e.1
            @Override // java.lang.Runnable
            public final void run() {
                e eVar;
                b bVar;
                View view2;
                View view3;
                e eVar2 = e.this;
                if (eVar2.f9268h || eVar2.i) {
                    return;
                }
                Context g9 = t.b().g();
                if (g9 == null) {
                    g9 = com.anythink.basead.c.a().f();
                }
                if (g9 == null && (view3 = view) != null && (g9 = view3.getContext()) != null) {
                    g9 = g9.getApplicationContext();
                }
                String unused = e.this.f9269j;
                int i4 = i;
                try {
                    switch (i4) {
                        case 112:
                            e eVar3 = e.this;
                            b bVar2 = eVar3.f9263c;
                            if (bVar2 != null) {
                                eVar3.i = true;
                                bVar2.b();
                                e.this.f9263c = null;
                                break;
                            }
                            break;
                        case 113:
                            e eVar4 = e.this;
                            d dVar = eVar4.f9265e;
                            if (dVar != null && eVar4.f9263c != null) {
                                dVar.j();
                                break;
                            }
                            break;
                        case 114:
                            if (!e.this.f9271l) {
                                e.e(e.this);
                                if (!e.this.a()) {
                                    boolean isEmpty = TextUtils.isEmpty(e.this.f9261a.E());
                                    boolean z8 = !isEmpty;
                                    e eVar5 = e.this;
                                    b bVar3 = eVar5.f9263c;
                                    if (bVar3 != null && eVar5.f9264d == null) {
                                        eVar5.f9264d = bVar3.c();
                                    }
                                    e eVar6 = e.this;
                                    a aVar = eVar6.f9264d;
                                    if (aVar != null) {
                                        aVar.a(z8);
                                        e.this.f9264d.a();
                                    } else {
                                        x xVar = eVar6.f9262b;
                                        String str = xVar != null ? xVar.f14315d : "";
                                        w wVar = eVar6.f9261a;
                                        r3 = wVar != null ? wVar.ao() : 0;
                                        String unused2 = e.this.f9269j;
                                        com.anythink.core.common.u.e.b("Omsdk Exception", "create omsdkAdEvent fail:is empty,requestId:" + str + ",offerResourceType:" + r3, t.b().r());
                                    }
                                    if (!isEmpty && (bVar = (eVar = e.this).f9263c) != null && eVar.f9265e == null) {
                                        eVar.f9265e = bVar.d();
                                        break;
                                    }
                                }
                            } else {
                                break;
                            }
                            break;
                        default:
                            switch (i4) {
                                case BaseATView.a.f9961z /* 201 */:
                                    if (view != null) {
                                        if (!e.this.a()) {
                                            boolean z9 = !TextUtils.isEmpty(e.this.f9261a.E());
                                            e eVar7 = e.this;
                                            f a9 = f.a();
                                            e eVar8 = e.this;
                                            eVar7.f9263c = a9.a(g9, z9, eVar8.f9261a, eVar8.f9262b);
                                        } else if (!(view instanceof WebView) || g9 == null) {
                                            e.a(e.this, "2", "omsdkMeasureView is not webview");
                                        } else if (!TextUtils.isEmpty(e.this.f9261a.o())) {
                                            e eVar9 = e.this;
                                            f a10 = f.a();
                                            WebView webView = (WebView) view;
                                            e eVar10 = e.this;
                                            eVar9.f9263c = a10.a(g9, webView, eVar10.f9261a, eVar10.f9262b);
                                        }
                                        e eVar11 = e.this;
                                        b bVar4 = eVar11.f9263c;
                                        if (bVar4 == null) {
                                            eVar11.f9268h = true;
                                            break;
                                        } else {
                                            bVar4.a(view);
                                            if (e.this.f9273n != null && (view2 = (View) e.this.f9273n.get()) != null) {
                                                e.this.f9263c.b(view2);
                                            }
                                            if (e.this.f9274o != null && !e.this.f9274o.isEmpty()) {
                                                ArrayList arrayList = new ArrayList();
                                                while (r3 < e.this.f9274o.size()) {
                                                    View view4 = (View) ((WeakReference) e.this.f9274o.get(r3)).get();
                                                    if (view4 != null) {
                                                        arrayList.add(view4);
                                                    }
                                                    r3++;
                                                }
                                                e.this.f9263c.a(arrayList);
                                            }
                                            e.this.f9263c.a();
                                            break;
                                        }
                                    } else {
                                        e.a(e.this, "2", "omsdkMeasureView is empty");
                                        e.this.f9268h = true;
                                        break;
                                    }
                                    break;
                                case 202:
                                    e eVar12 = e.this;
                                    d dVar2 = eVar12.f9265e;
                                    if (dVar2 != null && eVar12.f9263c != null) {
                                        dVar2.a(eVar12.f9266f, eVar12.f9267g);
                                        break;
                                    }
                                    break;
                                case BaseATView.a.f9923B /* 203 */:
                                    e eVar13 = e.this;
                                    d dVar3 = eVar13.f9265e;
                                    if (dVar3 != null && eVar13.f9263c != null) {
                                        dVar3.a();
                                        break;
                                    }
                                    break;
                                case BaseATView.a.f9924C /* 204 */:
                                    e eVar14 = e.this;
                                    d dVar4 = eVar14.f9265e;
                                    if (dVar4 != null && eVar14.f9263c != null) {
                                        dVar4.b();
                                        break;
                                    }
                                    break;
                                case BaseATView.a.f9925D /* 205 */:
                                    e eVar15 = e.this;
                                    d dVar5 = eVar15.f9265e;
                                    if (dVar5 != null && eVar15.f9263c != null) {
                                        dVar5.c();
                                        break;
                                    }
                                    break;
                                case BaseATView.a.f9926E /* 206 */:
                                    e eVar16 = e.this;
                                    d dVar6 = eVar16.f9265e;
                                    if (dVar6 != null && eVar16.f9263c != null) {
                                        dVar6.d();
                                        break;
                                    }
                                    break;
                                case BaseATView.a.f9927F /* 207 */:
                                    e eVar17 = e.this;
                                    d dVar7 = eVar17.f9265e;
                                    if (dVar7 != null && eVar17.f9263c != null) {
                                        dVar7.e();
                                        break;
                                    }
                                    break;
                                case BaseATView.a.f9928G /* 208 */:
                                    e eVar18 = e.this;
                                    d dVar8 = eVar18.f9265e;
                                    if (dVar8 != null && eVar18.f9263c != null) {
                                        dVar8.f();
                                        break;
                                    }
                                    break;
                                case BaseATView.a.f9929H /* 209 */:
                                    e eVar19 = e.this;
                                    d dVar9 = eVar19.f9265e;
                                    if (dVar9 != null && eVar19.f9263c != null) {
                                        dVar9.g();
                                        break;
                                    }
                                    break;
                                case BaseATView.a.f9930I /* 210 */:
                                    e eVar20 = e.this;
                                    d dVar10 = eVar20.f9265e;
                                    if (dVar10 != null && eVar20.f9263c != null) {
                                        dVar10.h();
                                        break;
                                    }
                                    break;
                                case BaseATView.a.J /* 211 */:
                                    e eVar21 = e.this;
                                    d dVar11 = eVar21.f9265e;
                                    if (dVar11 != null && eVar21.f9263c != null) {
                                        dVar11.i();
                                        break;
                                    }
                                    break;
                                case BaseATView.a.f9931K /* 212 */:
                                    e eVar22 = e.this;
                                    d dVar12 = eVar22.f9265e;
                                    if (dVar12 != null && eVar22.f9263c != null) {
                                        dVar12.a(eVar22.f9267g);
                                        break;
                                    }
                                    break;
                            }
                    }
                } catch (Throwable th) {
                    if (t.b().F()) {
                        th.printStackTrace();
                    }
                    String unused3 = e.this.f9269j;
                    th.getMessage();
                    i.v("Omsdk Exception", "handle:" + i + " with throwable:" + th.getMessage());
                }
            }
        });
    }

    public final void b(View view) {
        if (view != null) {
            if (this.f9274o == null) {
                this.f9274o = new ArrayList();
            }
            this.f9274o.add(new WeakReference<>(view));
        }
    }

    public final void b() {
        this.f9270k = true;
    }

    private void a(String str, String str2) {
        String str3;
        if (!a()) {
            if (!TextUtils.isEmpty(this.f9261a.E())) {
                str3 = "3";
            } else {
                str3 = "2";
            }
        } else {
            str3 = "1";
        }
        com.anythink.core.common.u.e.a(this.f9262b, this.f9261a, f.a().c(), str3, false, str, str2);
    }

    public final boolean a() {
        return !com.anythink.basead.b.e.a(this.f9261a, this.f9262b) && this.f9261a.n();
    }

    public final void a(boolean z8) {
        if (z8) {
            this.f9267g = 0.0f;
        } else {
            this.f9267g = 1.0f;
        }
    }

    public final void a(long j9) {
        this.f9266f = j9;
    }

    public final void a(View view) {
        if (view != null) {
            this.f9273n = new WeakReference<>(view);
        }
    }

    public static /* synthetic */ void a(e eVar, String str, String str2) {
        String str3;
        if (!eVar.a()) {
            if (!TextUtils.isEmpty(eVar.f9261a.E())) {
                str3 = "3";
            } else {
                str3 = "2";
            }
        } else {
            str3 = "1";
        }
        com.anythink.core.common.u.e.a(eVar.f9262b, eVar.f9261a, f.a().c(), str3, false, str, str2);
    }
}
