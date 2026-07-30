package com.anythink.basead.k;

import android.content.Context;
import android.webkit.WebView;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.iab.omid.library.toponad.Omid;

/* loaded from: classes.dex */
public class c implements com.anythink.basead.j.c {

    /* renamed from: b, reason: collision with root package name */
    private final String f9287b = "c";

    /* renamed from: a, reason: collision with root package name */
    boolean f9286a = false;

    @Override // com.anythink.basead.j.c
    public final com.anythink.basead.j.b a(Context context, boolean z8, w wVar, x xVar) {
        if (a()) {
            return e.a(context, z8, wVar, xVar);
        }
        return null;
    }

    @Override // com.anythink.basead.j.c
    public final String b() {
        try {
            return Omid.getVersion();
        } catch (Throwable unused) {
            return "";
        }
    }

    @Override // com.anythink.basead.j.c
    public final com.anythink.basead.j.b a(Context context, WebView webView, w wVar, x xVar) {
        if (a()) {
            return e.a(context, webView, wVar, xVar);
        }
        return null;
    }

    @Override // com.anythink.basead.j.c
    public final String a(String str, w wVar, x xVar) {
        return !a() ? str : e.a(str, wVar, xVar);
    }

    @Override // com.anythink.basead.j.c
    public final boolean a() {
        if (this.f9286a) {
            return true;
        }
        try {
            Omid.getVersion();
            this.f9286a = true;
            return true;
        } catch (Throwable th) {
            th.getMessage();
            return false;
        }
    }
}
