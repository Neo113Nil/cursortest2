package ru.rustore.sdk.imaging.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.LruCache;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public final class k {

    /* renamed from: m, reason: collision with root package name */
    public static volatile k f43663m;

    /* renamed from: f, reason: collision with root package name */
    public final W1.h f43669f;

    /* renamed from: i, reason: collision with root package name */
    public final W1.h f43672i;

    /* renamed from: a, reason: collision with root package name */
    public final W1.h f43664a = W1.i.b(j.f43685a);

    /* renamed from: b, reason: collision with root package name */
    public final W1.h f43665b = W1.i.b(l.f43687a);

    /* renamed from: c, reason: collision with root package name */
    public final W1.h f43666c = W1.i.b(f.f43680a);

    /* renamed from: d, reason: collision with root package name */
    public final W1.h f43667d = W1.i.b(b.f43676a);

    /* renamed from: e, reason: collision with root package name */
    public final W1.h f43668e = W1.i.b(new C0254k());

    /* renamed from: g, reason: collision with root package name */
    public final W1.h f43670g = W1.i.b(new e());

    /* renamed from: h, reason: collision with root package name */
    public final W1.h f43671h = W1.i.b(new c());

    /* renamed from: j, reason: collision with root package name */
    public final W1.h f43673j = W1.i.b(i.f43684a);

    /* renamed from: k, reason: collision with root package name */
    public final W1.h f43674k = W1.i.b(m.f43688a);

    /* renamed from: l, reason: collision with root package name */
    public final W1.h f43675l = W1.i.b(new g());

    public static final class a {
    }

    public static final class b extends s implements Function0<ru.rustore.sdk.imaging.internal.b> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f43676a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new ru.rustore.sdk.imaging.internal.b();
        }
    }

    public static final class c extends s implements Function0<ru.rustore.sdk.imaging.internal.c> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new ru.rustore.sdk.imaging.internal.c((ru.rustore.sdk.imaging.internal.i) k.this.f43668e.getValue(), (ru.rustore.sdk.imaging.internal.e) k.this.f43670g.getValue(), (ru.rustore.sdk.imaging.internal.j) k.this.f43674k.getValue());
        }
    }

    public static final class d extends s implements Function0<ru.rustore.sdk.imaging.internal.d> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f43678a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context) {
            super(0);
            this.f43678a = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new ru.rustore.sdk.imaging.internal.d(this.f43678a);
        }
    }

    public static final class e extends s implements Function0<ru.rustore.sdk.imaging.internal.e> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new ru.rustore.sdk.imaging.internal.e((ru.rustore.sdk.imaging.internal.d) k.this.f43669f.getValue());
        }
    }

    public static final class f extends s implements Function0<ThreadPoolExecutor> {

        /* renamed from: a, reason: collision with root package name */
        public static final f f43680a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int availableProcessors = Runtime.getRuntime().availableProcessors();
            return new ThreadPoolExecutor(availableProcessors + 1, (availableProcessors * 2) + 2, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        }
    }

    public static final class g extends s implements Function0<ru.rustore.sdk.imaging.internal.f> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new ru.rustore.sdk.imaging.internal.f((ThreadPoolExecutor) k.this.f43666c.getValue(), (ru.rustore.sdk.imaging.internal.b) k.this.f43667d.getValue(), (ru.rustore.sdk.imaging.internal.c) k.this.f43671h.getValue(), (ru.rustore.sdk.imaging.internal.g) k.this.f43672i.getValue(), (ru.rustore.sdk.imaging.internal.h) k.this.f43673j.getValue());
        }
    }

    public static final class h extends s implements Function0<ru.rustore.sdk.imaging.internal.g> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f43682a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k f43683b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Context context, k kVar) {
            super(0);
            this.f43682a = context;
            this.f43683b = kVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new ru.rustore.sdk.imaging.internal.g(this.f43682a, (Handler) this.f43683b.f43664a.getValue());
        }
    }

    public static final class i extends s implements Function0<ru.rustore.sdk.imaging.internal.h> {

        /* renamed from: a, reason: collision with root package name */
        public static final i f43684a = new i();

        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new ru.rustore.sdk.imaging.internal.h();
        }
    }

    public static final class j extends s implements Function0<Handler> {

        /* renamed from: a, reason: collision with root package name */
        public static final j f43685a = new j();

        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    /* renamed from: ru.rustore.sdk.imaging.internal.k$k, reason: collision with other inner class name */
    public static final class C0254k extends s implements Function0<ru.rustore.sdk.imaging.internal.i> {
        public C0254k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new ru.rustore.sdk.imaging.internal.i(k.a(k.this));
        }
    }

    public static final class l extends s implements Function0<ru.rustore.sdk.imaging.internal.l> {

        /* renamed from: a, reason: collision with root package name */
        public static final l f43687a = new l();

        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new ru.rustore.sdk.imaging.internal.l(((int) (Runtime.getRuntime().maxMemory() / 1024)) / 3);
        }
    }

    public static final class m extends s implements Function0<ru.rustore.sdk.imaging.internal.j> {

        /* renamed from: a, reason: collision with root package name */
        public static final m f43688a = new m();

        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new ru.rustore.sdk.imaging.internal.j();
        }
    }

    public k(Context context) {
        this.f43669f = W1.i.b(new d(context));
        this.f43672i = W1.i.b(new h(context, this));
    }

    public static final LruCache a(k kVar) {
        return (LruCache) kVar.f43665b.getValue();
    }
}
