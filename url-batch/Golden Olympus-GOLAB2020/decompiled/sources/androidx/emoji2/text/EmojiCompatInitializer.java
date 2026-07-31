package androidx.emoji2.text;

import android.content.Context;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.emoji2.text.f;
import androidx.lifecycle.AbstractC1346l;
import androidx.lifecycle.InterfaceC1339e;
import androidx.lifecycle.InterfaceC1354u;
import androidx.lifecycle.ProcessLifecycleInitializer;
import i0.InterfaceC2469a;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements InterfaceC2469a {

    class a implements InterfaceC1339e {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC1346l f12121b;

        a(AbstractC1346l abstractC1346l) {
            this.f12121b = abstractC1346l;
        }

        @Override // androidx.lifecycle.InterfaceC1339e
        public void onResume(InterfaceC1354u interfaceC1354u) {
            EmojiCompatInitializer.this.e();
            this.f12121b.removeObserver(this);
        }
    }

    static class b extends f.c {
        protected b(Context context) {
            super(new c(context));
            b(1);
        }
    }

    static class c implements f.h {

        /* renamed from: a, reason: collision with root package name */
        private final Context f12123a;

        class a extends f.i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ f.i f12124a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ThreadPoolExecutor f12125b;

            a(f.i iVar, ThreadPoolExecutor threadPoolExecutor) {
                this.f12124a = iVar;
                this.f12125b = threadPoolExecutor;
            }

            @Override // androidx.emoji2.text.f.i
            public void a(Throwable th) {
                try {
                    this.f12124a.a(th);
                } finally {
                    this.f12125b.shutdown();
                }
            }

            @Override // androidx.emoji2.text.f.i
            public void b(n nVar) {
                try {
                    this.f12124a.b(nVar);
                } finally {
                    this.f12125b.shutdown();
                }
            }
        }

        c(Context context) {
            this.f12123a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.f.h
        public void a(final f.i iVar) {
            final ThreadPoolExecutor b4 = androidx.emoji2.text.c.b("EmojiCompatInitializer");
            b4.execute(new Runnable() { // from class: androidx.emoji2.text.g
                @Override // java.lang.Runnable
                public final void run() {
                    EmojiCompatInitializer.c.this.c(iVar, b4);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void c(f.i iVar, ThreadPoolExecutor threadPoolExecutor) {
            try {
                k a4 = androidx.emoji2.text.d.a(this.f12123a);
                if (a4 == null) {
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                }
                a4.c(threadPoolExecutor);
                a4.a().a(new a(iVar, threadPoolExecutor));
            } catch (Throwable th) {
                iVar.a(th);
                threadPoolExecutor.shutdown();
            }
        }
    }

    static class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                androidx.core.os.n.a("EmojiCompat.EmojiCompatInitializer.run");
                if (f.i()) {
                    f.c().l();
                }
            } finally {
                androidx.core.os.n.b();
            }
        }
    }

    @Override // i0.InterfaceC2469a
    public List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // i0.InterfaceC2469a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Boolean b(Context context) {
        f.h(new b(context));
        d(context);
        return Boolean.TRUE;
    }

    void d(Context context) {
        AbstractC1346l lifecycle = ((InterfaceC1354u) androidx.startup.a.e(context).f(ProcessLifecycleInitializer.class)).getLifecycle();
        lifecycle.addObserver(new a(lifecycle));
    }

    void e() {
        androidx.emoji2.text.c.c().postDelayed(new d(), 500L);
    }
}
