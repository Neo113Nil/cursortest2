package com.my.tracker.obfuscated;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.my.tracker.obfuscated.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1638h {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f21345a = new AtomicReference();

    /* renamed from: b, reason: collision with root package name */
    protected boolean f21346b = false;

    /* renamed from: com.my.tracker.obfuscated.h$a */
    protected static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final boolean f21347a;

        static {
            boolean z4 = false;
            try {
                if (AppSet.class.equals(AppSet.class) && AppSetIdClient.class.equals(AppSetIdClient.class)) {
                    if (AppSetIdInfo.class.equals(AppSetIdInfo.class)) {
                        z4 = true;
                    }
                }
            } catch (Throwable th) {
                AbstractC1708y2.a("AppSetIdProvider: error occurred while working with App Set library classes", th);
            }
            f21347a = z4;
        }
    }

    private void b(Context context) {
        final C1676q1 a4 = C1676q1.a(context);
        final String d4 = a4.d();
        final long e4 = a4.e();
        if (!TextUtils.isEmpty(d4)) {
            this.f21345a.set(new C1634g(d4, e4));
        }
        if (!a.f21347a) {
            AbstractC1708y2.a("AppSetIdProvider: app set library is not available");
            return;
        }
        try {
            AppSet.getClient(context).getAppSetIdInfo().addOnSuccessListener(AbstractC1658m.f21418c, new OnSuccessListener() { // from class: com.my.tracker.obfuscated.M2
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    C1638h.this.a(e4, a4, d4, (AppSetIdInfo) obj);
                }
            });
        } catch (Throwable th) {
            AbstractC1708y2.a("AppSetIdProvider: error occurred while trying to access app set id info", th);
        }
        a();
    }

    private void a() {
        String str;
        try {
            C1634g c1634g = (C1634g) this.f21345a.get();
            if (c1634g != null) {
                str = "AppSetIdProvider: app set id has been collected, value: " + c1634g.f21319a;
            } else {
                synchronized (this.f21345a) {
                    this.f21345a.wait(300L);
                }
                str = "AppSetIdProvider: timeout for collecting id has exceeded";
            }
            AbstractC1708y2.a(str);
        } catch (Throwable th) {
            AbstractC1708y2.a("AppSetIdProvider: attempt to block thread retrieving app set id finished unsuccessfully", th);
        }
    }

    public C1634g a(Context context) {
        if (!this.f21346b) {
            b(context);
            this.f21346b = true;
        }
        return (C1634g) this.f21345a.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(long j4, C1676q1 c1676q1, String str, AppSetIdInfo appSetIdInfo) {
        int scope = appSetIdInfo.getScope();
        long j5 = scope;
        if (j5 != j4) {
            c1676q1.a(scope);
        }
        String id = appSetIdInfo.getId();
        if (!id.equals(str)) {
            c1676q1.f(id);
            AbstractC1708y2.a("AppSetIdProvider: new id value has been received: " + id);
        }
        if (TextUtils.isEmpty(id) || scope == -1) {
            this.f21345a.set(null);
        } else {
            this.f21345a.set(new C1634g(id, j5));
        }
        synchronized (this.f21345a) {
            this.f21345a.notify();
        }
    }
}
