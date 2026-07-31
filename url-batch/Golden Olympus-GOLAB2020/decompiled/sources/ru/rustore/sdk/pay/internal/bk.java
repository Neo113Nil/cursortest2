package ru.rustore.sdk.pay.internal;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.reactive.single.Single;
import ru.rustore.sdk.reactive.single.SingleFlatMapKt;
import ru.rustore.sdk.reactive.single.SingleMapKt;

/* loaded from: classes3.dex */
public final class bk {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final fi f43875a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final di f43876b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final ji f43877c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final h f43878d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public final n2 f43879e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    public final s2 f43880f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    public final AtomicReference<Single<a>> f43881g;

    public static abstract class a {

        /* renamed from: ru.rustore.sdk.pay.internal.bk$a$a, reason: collision with other inner class name */
        public static final class C0256a extends a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0256a f43882a = new C0256a();
        }

        public static final class b extends a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public final ak f43883a;

            public b(@NotNull ak session) {
                Intrinsics.checkNotNullParameter(session, "session");
                this.f43883a = session;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && Intrinsics.areEqual(this.f43883a, ((b) obj).f43883a);
            }

            public final int hashCode() {
                return this.f43883a.hashCode();
            }

            @NotNull
            public final String toString() {
                return "Success(session=" + this.f43883a + ')';
            }
        }
    }

    public static final class b extends kotlin.jvm.internal.s implements Function1<a, ak> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f43884a = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            a result = (a) obj;
            Intrinsics.checkNotNullParameter(result, "result");
            if (result instanceof a.b) {
                return ((a.b) result).f43883a;
            }
            if (result instanceof a.C0256a) {
                throw new IllegalStateException("Unexpected initial state");
            }
            throw new W1.m();
        }
    }

    public static final class c extends kotlin.jvm.internal.s implements Function1<a, Single<a>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.s f43885a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Function0<? extends Single<ak>> function0) {
            super(1);
            this.f43885a = (kotlin.jvm.internal.s) function0;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.s] */
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            a it = (a) obj;
            Intrinsics.checkNotNullParameter(it, "it");
            return SingleMapKt.map((Single) this.f43885a.invoke(), ik.f44348a);
        }
    }

    public static final class d extends kotlin.jvm.internal.s implements Function0<a> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f43886a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return a.C0256a.f43882a;
        }
    }

    public bk(@NotNull fi remoteAuthorizedSessionDataSource, @NotNull di remoteAnonymousSessionDataSource, @NotNull ji remoteUserProfileDataSource, @NotNull h activeSessionDataSource, @NotNull n2 cachedAnonymousSessionDataSource, @NotNull s2 cachedWebSessionDataSource) {
        Intrinsics.checkNotNullParameter(remoteAuthorizedSessionDataSource, "remoteAuthorizedSessionDataSource");
        Intrinsics.checkNotNullParameter(remoteAnonymousSessionDataSource, "remoteAnonymousSessionDataSource");
        Intrinsics.checkNotNullParameter(remoteUserProfileDataSource, "remoteUserProfileDataSource");
        Intrinsics.checkNotNullParameter(activeSessionDataSource, "activeSessionDataSource");
        Intrinsics.checkNotNullParameter(cachedAnonymousSessionDataSource, "cachedAnonymousSessionDataSource");
        Intrinsics.checkNotNullParameter(cachedWebSessionDataSource, "cachedWebSessionDataSource");
        this.f43875a = remoteAuthorizedSessionDataSource;
        this.f43876b = remoteAnonymousSessionDataSource;
        this.f43877c = remoteUserProfileDataSource;
        this.f43878d = activeSessionDataSource;
        this.f43879e = cachedAnonymousSessionDataSource;
        this.f43880f = cachedWebSessionDataSource;
        this.f43881g = new AtomicReference<>(Single.Companion.from(d.f43886a));
    }

    public final Single<ak> a(Function0<? extends Single<ak>> function0) {
        Single<a> current;
        Single flatMap;
        do {
            current = this.f43881g.get();
            Intrinsics.checkNotNullExpressionValue(current, "current");
            flatMap = SingleFlatMapKt.flatMap(current, new c(function0));
        } while (!androidx.lifecycle.r.a(this.f43881g, current, flatMap));
        return SingleMapKt.map(flatMap, b.f43884a);
    }
}
