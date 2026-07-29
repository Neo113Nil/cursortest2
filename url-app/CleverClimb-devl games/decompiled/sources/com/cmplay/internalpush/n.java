package com.cmplay.internalpush;

import android.content.Context;
import android.text.TextUtils;
import com.cmplay.base.util.webview.ui.WebViewActivity;
import com.cmplay.base.util.z;
import com.cmplay.internalpush.i;
import com.cmplay.internalpush.ui.OpenScreenActivity;
import com.cmplay.internalpush.ui.OpenScreenVideoActivity;

/* compiled from: OpenScreen.java */
/* loaded from: classes.dex */
public class n implements i {

    /* renamed from: a, reason: collision with root package name */
    private int f4268a;

    /* renamed from: b, reason: collision with root package name */
    private i.a f4269b;

    /* compiled from: OpenScreen.java */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private static n f4272a = new n();
    }

    public static n a() {
        return a.f4272a;
    }

    public boolean a(Context context, int i, boolean z) {
        o.a().a(1, 19, "", 0L, "", 0, 0, 0L);
        this.f4268a = i;
        boolean a2 = com.cmplay.internalpush.data.m.a(context).a(z, true);
        if (!a2) {
            com.cmplay.internalpush.data.m.a(context).d();
        }
        return a2;
    }

    public String a(Context context) {
        return com.cmplay.internalpush.data.m.a(context).b(true);
    }

    public void b(Context context) {
        String a2 = a(context);
        if (TextUtils.isEmpty(a2)) {
        }
        switch (new com.cmplay.internalpush.data.f(a2).k()) {
            case 1:
            case 3:
                OpenScreenActivity.a(context, a2);
                break;
            case 2:
                OpenScreenVideoActivity.a(context, a2);
                break;
            default:
                OpenScreenActivity.a(context, a2);
                break;
        }
    }

    public void a(Context context, final com.cmplay.internalpush.data.d dVar) {
        if (dVar == null) {
            return;
        }
        com.cmplay.base.util.h.a("internal_push", "OpenScreen.onClickAd()  proId:" + dVar.c());
        if (dVar.g() == 1) {
            com.cmplay.internalpush.a.b.a(context, dVar, new z() { // from class: com.cmplay.internalpush.n.1
                @Override // com.cmplay.base.util.z
                public void a(boolean z) {
                    if (z) {
                        o.a().a(1, 2, dVar.e(), dVar.c(), "", 1, 0, dVar.l());
                    } else {
                        o.a().a(1, 2, dVar.e(), dVar.c(), "", 2, 0, dVar.l());
                    }
                }
            });
        } else {
            com.cmplay.internalpush.a.b.a(context, dVar, null);
            o.a().a(1, 2, dVar.e(), dVar.c(), "", b(), 0, dVar.l());
        }
        com.cmplay.internalpush.data.m.a(context).a(dVar.c(), 2);
        if (this.f4269b != null) {
            this.f4269b.a();
        }
    }

    public void b(Context context, com.cmplay.internalpush.data.d dVar) {
        WebViewActivity.StartWebViewActivity(context, dVar.j(), 0);
        o.a().a(1, 15, dVar.e(), dVar.c(), "", b(), 0, dVar.l());
    }

    public boolean c(Context context, com.cmplay.internalpush.data.d dVar) {
        if (this.f4269b != null) {
            this.f4269b.a();
        }
        if (dVar == null) {
            return false;
        }
        o.a().a(1, 3, dVar.e(), dVar.c(), "", b(), 0, dVar.l());
        return false;
    }

    public void d(Context context, com.cmplay.internalpush.data.d dVar) {
        if (this.f4269b != null) {
            this.f4269b.a();
        }
        if (dVar == null) {
            return;
        }
        o.a().a(1, 3, dVar.e(), dVar.c(), "", b(), 0, dVar.l());
    }

    public void a(i.a aVar) {
        this.f4269b = aVar;
    }

    public int b() {
        return this.f4268a;
    }
}
