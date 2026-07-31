package com.applovin.impl;

import androidx.media3.exoplayer.hls.offline.HlsDownloader$$ExternalSyntheticLambda0;
import com.applovin.impl.s4;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes11.dex */
public final class s4 {
    public static final Executor i = new Executor() { // from class: com.applovin.impl.s4$$ExternalSyntheticLambda4
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            AppLovinSdkUtils.runOnUiThread(runnable);
        }
    };
    public static final Executor j = new HlsDownloader$$ExternalSyntheticLambda0();
    private final String b;
    private volatile Object g;
    private volatile Object h;
    private final Object a = new Object();
    private final List c = new ArrayList();
    private volatile boolean d = false;
    private volatile boolean e = false;
    private volatile boolean f = false;

    public interface a {
        void a(Object obj);
    }

    public interface b {
        void a(boolean z, Object obj, Object obj2);
    }

    public s4(String str) {
        this.b = str;
    }

    public static s4 a(String str, Object obj) {
        return new s4(str).b(obj);
    }

    public s4 b(Object obj) {
        a(true, obj, (Object) null, false);
        return this;
    }

    public s4 c(Object obj) {
        a(false, (Object) null, obj, true);
        return this;
    }

    public boolean d() {
        return this.d;
    }

    public boolean e() {
        return this.d && !this.e;
    }

    public String toString() {
        String str;
        if (!this.d) {
            str = "Waiting";
        } else if (this.e) {
            str = "Success -> " + this.g;
        } else {
            str = "Failed -> " + this.h;
        }
        return "Promise(" + c() + ": " + str + ")";
    }

    public s4 a(Object obj) {
        a(false, (Object) null, obj, false);
        return this;
    }

    public Object b() {
        l1.a(e());
        return this.h;
    }

    public String c() {
        String str = this.b;
        return str != null ? str : super.toString();
    }

    private Runnable c(final Executor executor, final b bVar) {
        return new Runnable() { // from class: com.applovin.impl.s4$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                s4.this.b(executor, bVar);
            }
        };
    }

    public void a(Executor executor, final Runnable runnable) {
        a(executor, new b() { // from class: com.applovin.impl.s4$$ExternalSyntheticLambda3
            @Override // com.applovin.impl.s4.b
            public final void a(boolean z, Object obj, Object obj2) {
                s4.a(runnable, z, obj, obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Runnable runnable, boolean z, Object obj, Object obj2) {
        if (z) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Executor executor, final b bVar) {
        try {
            executor.execute(new Runnable() { // from class: com.applovin.impl.s4$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    s4.this.a(bVar);
                }
            });
        } catch (Throwable th) {
            a(th);
        }
    }

    public void a(Executor executor, final a aVar) {
        a(executor, new b() { // from class: com.applovin.impl.s4$$ExternalSyntheticLambda0
            @Override // com.applovin.impl.s4.b
            public final void a(boolean z, Object obj, Object obj2) {
                s4.a(s4.a.this, z, obj, obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(a aVar, boolean z, Object obj, Object obj2) {
        if (z) {
            return;
        }
        aVar.a(obj2);
    }

    public void a(Executor executor, b bVar) {
        Runnable c = c(executor, bVar);
        synchronized (this.a) {
            try {
                if (!this.d) {
                    this.c.add(c);
                } else {
                    c.run();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean a() {
        return this.d && this.f;
    }

    private void a(boolean z, Object obj, Object obj2, boolean z2) {
        synchronized (this.a) {
            try {
                if (this.d) {
                    return;
                }
                this.g = obj;
                this.h = obj2;
                this.e = z;
                this.f = z2;
                this.d = true;
                Iterator it = this.c.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                this.c.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(b bVar) {
        try {
            bVar.a(this.e, this.g, this.h);
        } catch (Throwable th) {
            a(th);
        }
    }

    private void a(Throwable th) {
        l1.a(th);
        com.applovin.impl.sdk.k kVar = com.applovin.impl.sdk.k.C0;
        if (kVar != null) {
            kVar.D().a("Promise", "PromiseCallback: " + c(), th);
        }
    }
}
