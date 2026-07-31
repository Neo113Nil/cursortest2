package com.iab.omid.library.startio;

import android.content.Context;
import android.webkit.WebSettings;
import com.iab.omid.library.startio.internal.i;
import com.iab.omid.library.startio.internal.k;
import com.iab.omid.library.startio.utils.e;
import com.iab.omid.library.startio.utils.g;
import java.util.concurrent.Executors;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private boolean f25a;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f26a;

        a(b bVar, Context context) {
            this.f26a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            WebSettings.getDefaultUserAgent(this.f26a);
        }
    }

    private void b(Context context) {
        g.a(context, "Application Context cannot be null");
    }

    private void c(Context context) {
        Executors.newSingleThreadExecutor().execute(new a(this, context));
    }

    String a() {
        return "1.6.0-Startio";
    }

    void a(Context context) {
        b(context);
        if (b()) {
            return;
        }
        a(true);
        i.c().a(context);
        com.iab.omid.library.startio.internal.b.g().a(context);
        com.iab.omid.library.startio.utils.a.a(context);
        com.iab.omid.library.startio.utils.c.a(context);
        e.a(context);
        com.iab.omid.library.startio.internal.g.b().a(context);
        com.iab.omid.library.startio.internal.a.a().a(context);
        k.b().a(context);
        c(context);
    }

    void a(boolean z) {
        this.f25a = z;
    }

    boolean b() {
        return this.f25a;
    }

    void c() {
        g.a();
        com.iab.omid.library.startio.internal.a.a().d();
    }
}
