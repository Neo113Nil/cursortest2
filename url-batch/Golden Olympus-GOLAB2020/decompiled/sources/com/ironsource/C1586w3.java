package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.w3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1586w3 extends hp {

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f20148f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private static final String f20149g = "AppLifecycleTrigger";

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final com.ironsource.lifecycle.b f20150d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final ok f20151e;

    @Metadata
    /* renamed from: com.ironsource.w3$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata
    /* renamed from: com.ironsource.w3$b */
    public static final class b implements ok {
        b() {
        }

        @Override // com.ironsource.ok
        public void a() {
            C1586w3.this.a(false);
        }

        @Override // com.ironsource.ok
        public void b() {
        }

        @Override // com.ironsource.ok
        public void c() {
        }

        @Override // com.ironsource.ok
        public void d() {
            C1586w3.this.a(true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1586w3(@NotNull com.ironsource.lifecycle.b lifeCycleObserver) {
        super(false, 1, null);
        Intrinsics.checkNotNullParameter(lifeCycleObserver, "lifeCycleObserver");
        this.f20150d = lifeCycleObserver;
        b bVar = new b();
        this.f20151e = bVar;
        lifeCycleObserver.a(bVar);
        a(lifeCycleObserver.e());
    }

    @Override // com.ironsource.hp
    @NotNull
    public String b() {
        return f20149g;
    }

    public final void e() {
        this.f20150d.b(this.f20151e);
    }
}
