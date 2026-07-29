package com.facebook.ads.internal.view.d;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.widget.LinearLayout;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.internal.adapters.ad;
import com.facebook.ads.internal.q.a.v;
import com.facebook.ads.internal.q.c.e;
import com.facebook.ads.internal.q.c.f;
import com.facebook.ads.internal.view.a;
import com.facebook.ads.internal.view.b.a;
import com.facebook.ads.internal.view.component.i;
import com.facebook.ads.internal.view.e.b.z;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f5619a = "b";

    /* renamed from: b, reason: collision with root package name */
    private static final int f5620b = (int) (v.f5438b * 4.0f);

    /* renamed from: c, reason: collision with root package name */
    private static final int f5621c = (int) (v.f5438b * 72.0f);

    /* renamed from: d, reason: collision with root package name */
    private static final int f5622d = (int) (v.f5438b * 8.0f);
    private final Context e;
    private final com.facebook.ads.internal.m.c f;
    private final ad g;
    private final String h;
    private Executor i = AsyncTask.THREAD_POOL_EXECUTOR;
    private a.InterfaceC0352a j;
    private com.facebook.ads.internal.view.b.a k;
    private a.b l;

    public enum a {
        SCREENSHOTS,
        MARKUP,
        INFO
    }

    public b(Context context, com.facebook.ads.internal.m.c cVar, ad adVar, a.InterfaceC0352a interfaceC0352a) {
        this.e = context;
        this.f = cVar;
        this.g = adVar;
        this.j = interfaceC0352a;
        this.h = com.facebook.ads.internal.j.c.a(this.g.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.j != null) {
            this.j.a(z.REWARDED_VIDEO_END_ACTIVITY.a());
        }
    }

    private View h() {
        i iVar = new i(this.e, this.g.n(), true, false, false);
        iVar.a(this.g.f(), this.g.h(), false, true);
        iVar.setAlignment(17);
        com.facebook.ads.internal.view.component.a aVar = new com.facebook.ads.internal.view.component.a(this.e, true, false, z.REWARDED_VIDEO_AD_CLICK.a(), this.g.n(), this.f, this.j);
        aVar.a(this.g.q(), this.g.p(), this.g.b(), new HashMap());
        com.facebook.ads.internal.view.component.e eVar = new com.facebook.ads.internal.view.component.e(this.e);
        eVar.setRadius(50);
        new com.facebook.ads.internal.view.b.d(eVar).a().a(this.g.i());
        LinearLayout linearLayout = new LinearLayout(this.e);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.addView(eVar, new LinearLayout.LayoutParams(f5621c, f5621c));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, f5622d, 0, f5622d);
        linearLayout.addView(iVar, layoutParams);
        linearLayout.addView(aVar, layoutParams);
        return linearLayout;
    }

    private View i() {
        RecyclerView recyclerView = new RecyclerView(this.e);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.e, 0, false));
        recyclerView.setAdapter(new c(this.g.o(), f5620b));
        return recyclerView;
    }

    private View j() {
        this.l = new a.b() { // from class: com.facebook.ads.internal.view.d.b.1
            @Override // com.facebook.ads.internal.view.b.a.b
            public void a() {
                if (b.this.k == null || TextUtils.isEmpty(b.this.g.d())) {
                    return;
                }
                b.this.k.post(new Runnable() { // from class: com.facebook.ads.internal.view.d.b.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (b.this.k == null || b.this.k.c()) {
                            Log.w(b.f5619a, "Webview already destroyed, cannot activate");
                            return;
                        }
                        b.this.k.loadUrl("javascript:" + b.this.g.d());
                    }
                });
            }

            @Override // com.facebook.ads.internal.view.b.a.b
            public void a(int i) {
            }

            @Override // com.facebook.ads.internal.view.b.a.b
            public void a(String str, Map<String, String> map) {
                Uri parse = Uri.parse(str);
                if ("fbad".equals(parse.getScheme()) && parse.getAuthority().equals("close")) {
                    b.this.g();
                    return;
                }
                if ("fbad".equals(parse.getScheme()) && com.facebook.ads.internal.a.b.a(parse.getAuthority()) && b.this.j != null) {
                    b.this.j.a(z.REWARDED_VIDEO_AD_CLICK.a());
                }
                com.facebook.ads.internal.a.a a2 = com.facebook.ads.internal.a.b.a(b.this.e, b.this.f, b.this.g.b(), parse, map);
                if (a2 != null) {
                    try {
                        a2.b();
                    } catch (Exception e) {
                        Log.e(b.f5619a, "Error executing action", e);
                    }
                }
            }

            @Override // com.facebook.ads.internal.view.b.a.b
            public void b() {
            }
        };
        this.k = new com.facebook.ads.internal.view.b.a(this.e, new WeakReference(this.l), 1);
        this.k.loadDataWithBaseURL(com.facebook.ads.internal.q.c.b.a(), this.h, AudienceNetworkActivity.WEBVIEW_MIME_TYPE, AudienceNetworkActivity.WEBVIEW_ENCODING, null);
        return this.k;
    }

    public boolean a() {
        return b() == a.MARKUP;
    }

    public a b() {
        return !this.g.o().isEmpty() ? a.SCREENSHOTS : !TextUtils.isEmpty(this.h) ? a.MARKUP : a.INFO;
    }

    public Pair<a, View> c() {
        a b2 = b();
        switch (b2) {
            case MARKUP:
                return new Pair<>(b2, j());
            case SCREENSHOTS:
                return new Pair<>(b2, i());
            default:
                return new Pair<>(b2, h());
        }
    }

    public void d() {
        if (TextUtils.isEmpty(this.g.l())) {
            return;
        }
        com.facebook.ads.internal.q.c.e eVar = new com.facebook.ads.internal.q.c.e(this.e, new HashMap());
        eVar.a(new e.a() { // from class: com.facebook.ads.internal.view.d.b.2
            @Override // com.facebook.ads.internal.q.c.e.a
            public void a() {
                if (b.this.j != null) {
                    b.this.j.a(z.REWARD_SERVER_FAILED.a());
                }
            }

            @Override // com.facebook.ads.internal.q.c.e.a
            public void a(f fVar) {
                a.InterfaceC0352a interfaceC0352a;
                z zVar;
                if (b.this.j == null) {
                    return;
                }
                if (fVar == null || !fVar.a()) {
                    interfaceC0352a = b.this.j;
                    zVar = z.REWARD_SERVER_FAILED;
                } else {
                    interfaceC0352a = b.this.j;
                    zVar = z.REWARD_SERVER_SUCCESS;
                }
                interfaceC0352a.a(zVar.a());
            }
        });
        eVar.executeOnExecutor(this.i, this.g.l());
    }

    public void e() {
        if (this.k != null) {
            this.k.destroy();
            this.k = null;
            this.l = null;
        }
    }
}
