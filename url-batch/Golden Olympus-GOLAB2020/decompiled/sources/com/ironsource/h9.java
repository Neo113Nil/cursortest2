package com.ironsource;

import com.ironsource.re;
import com.ironsource.ue;
import com.ironsource.yu;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public interface h9 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c f16575a = c.f16582a;

    @Metadata
    public static final class a implements h9 {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final qe f16576b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final yu f16577c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final AtomicBoolean f16578d;

        @Metadata
        /* renamed from: com.ironsource.h9$a$a, reason: collision with other inner class name */
        public static final class C0147a implements yu.a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f16579a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ a f16580b;

            C0147a(d dVar, a aVar) {
                this.f16579a = dVar;
                this.f16580b = aVar;
            }

            @Override // com.ironsource.yu.a
            public void a() {
                this.f16579a.a(new ue.a(new re.a(this.f16580b.f16576b.b())));
                this.f16580b.f16578d.set(false);
            }
        }

        public a(@NotNull qe config, @NotNull yu timer) {
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(timer, "timer");
            this.f16576b = config;
            this.f16577c = timer;
            this.f16578d = new AtomicBoolean(false);
        }

        @Override // com.ironsource.h9
        public synchronized void a() {
            this.f16577c.cancel();
            this.f16578d.set(false);
        }

        @Override // com.ironsource.h9
        public synchronized void a(@NotNull d callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            if (this.f16578d.compareAndSet(false, true)) {
                this.f16577c.a(new C0147a(callback, this));
            }
        }
    }

    @Metadata
    public static final class b implements h9 {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public static final b f16581b = new b();

        private b() {
        }

        @Override // com.ironsource.h9
        public void a() {
        }

        @Override // com.ironsource.h9
        public void a(@NotNull d callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
        }
    }

    @Metadata
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ c f16582a = new c();

        private c() {
        }

        @NotNull
        public final h9 a() {
            return b.f16581b;
        }

        @NotNull
        public final h9 a(@NotNull se featureFlag) {
            Intrinsics.checkNotNullParameter(featureFlag, "featureFlag");
            if (!featureFlag.c()) {
                return b.f16581b;
            }
            pe peVar = new pe(featureFlag);
            yu.b bVar = new yu.b();
            bVar.b(peVar.a());
            bVar.a(peVar.a());
            return new a(peVar, new yu.d().a(bVar));
        }
    }

    @Metadata
    public interface d {
        void a(@NotNull ue ueVar);
    }

    @NotNull
    static h9 a(@NotNull se seVar) {
        return f16575a.a(seVar);
    }

    void a();

    void a(@NotNull d dVar);
}
