package com.ironsource;

import com.ironsource.C1511m3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.j3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC1490j3 {

    @Metadata
    /* renamed from: com.ironsource.j3$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C0150a f16785a = new C0150a(null);

        @Metadata
        /* renamed from: com.ironsource.j3$a$a, reason: collision with other inner class name */
        public static final class C0150a {
            private C0150a() {
            }

            @NotNull
            public final InterfaceC1490j3 a() {
                return new b(b.f16791f, new ArrayList());
            }

            @NotNull
            public final InterfaceC1490j3 b(@NotNull InterfaceC1520n3... entity) {
                Intrinsics.checkNotNullParameter(entity, "entity");
                return new b(b.f16789d, CollectionsKt.mutableListOf(Arrays.copyOf(entity, entity.length)));
            }

            @NotNull
            public final InterfaceC1490j3 c(@NotNull InterfaceC1520n3... entity) {
                Intrinsics.checkNotNullParameter(entity, "entity");
                return new b(b.f16794i, CollectionsKt.mutableListOf(Arrays.copyOf(entity, entity.length)));
            }

            @NotNull
            public final InterfaceC1490j3 d(@NotNull InterfaceC1520n3... entity) {
                Intrinsics.checkNotNullParameter(entity, "entity");
                return new b(b.f16787b, CollectionsKt.mutableListOf(Arrays.copyOf(entity, entity.length)));
            }

            @NotNull
            public final InterfaceC1490j3 e(@NotNull InterfaceC1520n3... entity) {
                Intrinsics.checkNotNullParameter(entity, "entity");
                return new b(b.f16793h, CollectionsKt.mutableListOf(Arrays.copyOf(entity, entity.length)));
            }

            @NotNull
            public final InterfaceC1490j3 f(@NotNull InterfaceC1520n3... entity) {
                Intrinsics.checkNotNullParameter(entity, "entity");
                return new b(b.f16790e, CollectionsKt.mutableListOf(Arrays.copyOf(entity, entity.length)));
            }

            public /* synthetic */ C0150a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final InterfaceC1490j3 a(@NotNull C1511m3.j errorCode, @NotNull C1511m3.k errorReason) {
                Intrinsics.checkNotNullParameter(errorCode, "errorCode");
                Intrinsics.checkNotNullParameter(errorReason, "errorReason");
                return new b(b.f16788c, CollectionsKt.mutableListOf(errorCode, errorReason));
            }

            @NotNull
            public final InterfaceC1490j3 a(boolean z4) {
                return z4 ? new b(b.f16795j, new ArrayList()) : new b(b.f16796k, new ArrayList());
            }

            @NotNull
            public final InterfaceC1490j3 a(@NotNull InterfaceC1520n3... entity) {
                Intrinsics.checkNotNullParameter(entity, "entity");
                return new b(b.f16792g, CollectionsKt.mutableListOf(Arrays.copyOf(entity, entity.length)));
            }
        }

        @Metadata
        /* renamed from: com.ironsource.j3$a$b */
        public static final class b {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final b f16786a = new b();

            /* renamed from: b, reason: collision with root package name */
            public static final int f16787b = 401;

            /* renamed from: c, reason: collision with root package name */
            public static final int f16788c = 403;

            /* renamed from: d, reason: collision with root package name */
            public static final int f16789d = 404;

            /* renamed from: e, reason: collision with root package name */
            public static final int f16790e = 405;

            /* renamed from: f, reason: collision with root package name */
            public static final int f16791f = 406;

            /* renamed from: g, reason: collision with root package name */
            public static final int f16792g = 407;

            /* renamed from: h, reason: collision with root package name */
            public static final int f16793h = 408;

            /* renamed from: i, reason: collision with root package name */
            public static final int f16794i = 409;

            /* renamed from: j, reason: collision with root package name */
            public static final int f16795j = 410;

            /* renamed from: k, reason: collision with root package name */
            public static final int f16796k = 411;

            private b() {
            }
        }

        @NotNull
        public static final InterfaceC1490j3 a() {
            return f16785a.a();
        }

        @NotNull
        public static final InterfaceC1490j3 b(@NotNull InterfaceC1520n3... interfaceC1520n3Arr) {
            return f16785a.b(interfaceC1520n3Arr);
        }

        @NotNull
        public static final InterfaceC1490j3 c(@NotNull InterfaceC1520n3... interfaceC1520n3Arr) {
            return f16785a.c(interfaceC1520n3Arr);
        }

        @NotNull
        public static final InterfaceC1490j3 d(@NotNull InterfaceC1520n3... interfaceC1520n3Arr) {
            return f16785a.d(interfaceC1520n3Arr);
        }

        @NotNull
        public static final InterfaceC1490j3 e(@NotNull InterfaceC1520n3... interfaceC1520n3Arr) {
            return f16785a.e(interfaceC1520n3Arr);
        }

        @NotNull
        public static final InterfaceC1490j3 f(@NotNull InterfaceC1520n3... interfaceC1520n3Arr) {
            return f16785a.f(interfaceC1520n3Arr);
        }

        @NotNull
        public static final InterfaceC1490j3 a(@NotNull C1511m3.j jVar, @NotNull C1511m3.k kVar) {
            return f16785a.a(jVar, kVar);
        }

        @NotNull
        public static final InterfaceC1490j3 a(boolean z4) {
            return f16785a.a(z4);
        }

        @NotNull
        public static final InterfaceC1490j3 a(@NotNull InterfaceC1520n3... interfaceC1520n3Arr) {
            return f16785a.a(interfaceC1520n3Arr);
        }
    }

    @Metadata
    /* renamed from: com.ironsource.j3$b */
    public static final class b implements InterfaceC1490j3 {

        /* renamed from: a, reason: collision with root package name */
        private final int f16797a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final List<InterfaceC1520n3> f16798b;

        public b(int i4, @NotNull List<InterfaceC1520n3> arrayList) {
            Intrinsics.checkNotNullParameter(arrayList, "arrayList");
            this.f16797a = i4;
            this.f16798b = arrayList;
        }

        @Override // com.ironsource.InterfaceC1490j3
        public void a(@NotNull InterfaceC1541q3 analytics) {
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            analytics.a(this.f16797a, this.f16798b);
        }
    }

    @Metadata
    /* renamed from: com.ironsource.j3$c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f16799a = new a(null);

        @Metadata
        /* renamed from: com.ironsource.j3$c$a */
        public static final class a {
            private a() {
            }

            @NotNull
            public final InterfaceC1490j3 a() {
                return new b(b.f16801b, new ArrayList());
            }

            @NotNull
            public final InterfaceC1490j3 b() {
                return new b(b.f16806g, new ArrayList());
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final InterfaceC1490j3 a(@NotNull C1511m3.j errorCode, @NotNull C1511m3.k errorReason, @NotNull C1511m3.f duration) {
                Intrinsics.checkNotNullParameter(errorCode, "errorCode");
                Intrinsics.checkNotNullParameter(errorReason, "errorReason");
                Intrinsics.checkNotNullParameter(duration, "duration");
                return new b(b.f16803d, CollectionsKt.mutableListOf(errorCode, errorReason, duration));
            }

            @NotNull
            public final InterfaceC1490j3 a(@NotNull C1511m3.l ext1) {
                Intrinsics.checkNotNullParameter(ext1, "ext1");
                return new b(b.f16807h, CollectionsKt.mutableListOf(ext1));
            }

            @NotNull
            public final InterfaceC1490j3 a(@NotNull InterfaceC1520n3 duration) {
                Intrinsics.checkNotNullParameter(duration, "duration");
                return new b(b.f16802c, CollectionsKt.mutableListOf(duration));
            }

            @NotNull
            public final InterfaceC1490j3 a(@NotNull InterfaceC1520n3... entity) {
                Intrinsics.checkNotNullParameter(entity, "entity");
                return new b(b.f16804e, CollectionsKt.mutableListOf(Arrays.copyOf(entity, entity.length)));
            }
        }

        @Metadata
        /* renamed from: com.ironsource.j3$c$b */
        public static final class b {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final b f16800a = new b();

            /* renamed from: b, reason: collision with root package name */
            public static final int f16801b = 201;

            /* renamed from: c, reason: collision with root package name */
            public static final int f16802c = 202;

            /* renamed from: d, reason: collision with root package name */
            public static final int f16803d = 203;

            /* renamed from: e, reason: collision with root package name */
            public static final int f16804e = 204;

            /* renamed from: f, reason: collision with root package name */
            public static final int f16805f = 205;

            /* renamed from: g, reason: collision with root package name */
            public static final int f16806g = 206;

            /* renamed from: h, reason: collision with root package name */
            public static final int f16807h = 207;

            private b() {
            }
        }

        @NotNull
        public static final InterfaceC1490j3 a() {
            return f16799a.a();
        }

        @NotNull
        public static final InterfaceC1490j3 b() {
            return f16799a.b();
        }

        @NotNull
        public static final InterfaceC1490j3 a(@NotNull C1511m3.j jVar, @NotNull C1511m3.k kVar, @NotNull C1511m3.f fVar) {
            return f16799a.a(jVar, kVar, fVar);
        }

        @NotNull
        public static final InterfaceC1490j3 a(@NotNull C1511m3.l lVar) {
            return f16799a.a(lVar);
        }

        @NotNull
        public static final InterfaceC1490j3 a(@NotNull InterfaceC1520n3 interfaceC1520n3) {
            return f16799a.a(interfaceC1520n3);
        }

        @NotNull
        public static final InterfaceC1490j3 a(@NotNull InterfaceC1520n3... interfaceC1520n3Arr) {
            return f16799a.a(interfaceC1520n3Arr);
        }
    }

    @Metadata
    /* renamed from: com.ironsource.j3$d */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f16808a = new a(null);

        @Metadata
        /* renamed from: com.ironsource.j3$d$a */
        public static final class a {
            private a() {
            }

            @NotNull
            public final InterfaceC1490j3 a() {
                return new b(b.f16810b, new ArrayList());
            }

            @NotNull
            public final InterfaceC1490j3 b() {
                return new b(b.f16818j, new ArrayList());
            }

            @NotNull
            public final b c() {
                return new b(105, new ArrayList());
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final InterfaceC1490j3 a(@NotNull C1511m3.f duration) {
                Intrinsics.checkNotNullParameter(duration, "duration");
                return new b(b.f16812d, CollectionsKt.mutableListOf(duration));
            }

            @NotNull
            public final InterfaceC1490j3 b(@NotNull InterfaceC1520n3... entity) {
                Intrinsics.checkNotNullParameter(entity, "entity");
                return new b(b.f16816h, CollectionsKt.mutableListOf(Arrays.copyOf(entity, entity.length)));
            }

            @NotNull
            public final InterfaceC1490j3 a(@NotNull C1511m3.j errorCode, @NotNull C1511m3.k errorReason) {
                Intrinsics.checkNotNullParameter(errorCode, "errorCode");
                Intrinsics.checkNotNullParameter(errorReason, "errorReason");
                return new b(b.f16815g, CollectionsKt.mutableListOf(errorCode, errorReason));
            }

            @NotNull
            public final InterfaceC1490j3 a(@NotNull C1511m3.j errorCode, @NotNull C1511m3.k errorReason, @NotNull C1511m3.f duration, @NotNull C1511m3.l loaderState) {
                Intrinsics.checkNotNullParameter(errorCode, "errorCode");
                Intrinsics.checkNotNullParameter(errorReason, "errorReason");
                Intrinsics.checkNotNullParameter(duration, "duration");
                Intrinsics.checkNotNullParameter(loaderState, "loaderState");
                return new b(104, CollectionsKt.mutableListOf(errorCode, errorReason, duration, loaderState));
            }

            @NotNull
            public final InterfaceC1490j3 a(@NotNull InterfaceC1520n3 ext1) {
                Intrinsics.checkNotNullParameter(ext1, "ext1");
                return new b(b.f16817i, CollectionsKt.mutableListOf(ext1));
            }

            @NotNull
            public final InterfaceC1490j3 a(@NotNull InterfaceC1520n3... entity) {
                Intrinsics.checkNotNullParameter(entity, "entity");
                return new b(102, CollectionsKt.mutableListOf(Arrays.copyOf(entity, entity.length)));
            }
        }

        @Metadata
        /* renamed from: com.ironsource.j3$d$b */
        public static final class b {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final b f16809a = new b();

            /* renamed from: b, reason: collision with root package name */
            public static final int f16810b = 101;

            /* renamed from: c, reason: collision with root package name */
            public static final int f16811c = 102;

            /* renamed from: d, reason: collision with root package name */
            public static final int f16812d = 103;

            /* renamed from: e, reason: collision with root package name */
            public static final int f16813e = 104;

            /* renamed from: f, reason: collision with root package name */
            public static final int f16814f = 105;

            /* renamed from: g, reason: collision with root package name */
            public static final int f16815g = 109;

            /* renamed from: h, reason: collision with root package name */
            public static final int f16816h = 110;

            /* renamed from: i, reason: collision with root package name */
            public static final int f16817i = 111;

            /* renamed from: j, reason: collision with root package name */
            public static final int f16818j = 112;

            private b() {
            }
        }

        @NotNull
        public static final InterfaceC1490j3 a() {
            return f16808a.a();
        }

        @NotNull
        public static final InterfaceC1490j3 b() {
            return f16808a.b();
        }

        @NotNull
        public static final b c() {
            return f16808a.c();
        }

        @NotNull
        public static final InterfaceC1490j3 a(@NotNull C1511m3.f fVar) {
            return f16808a.a(fVar);
        }

        @NotNull
        public static final InterfaceC1490j3 b(@NotNull InterfaceC1520n3... interfaceC1520n3Arr) {
            return f16808a.b(interfaceC1520n3Arr);
        }

        @NotNull
        public static final InterfaceC1490j3 a(@NotNull C1511m3.j jVar, @NotNull C1511m3.k kVar) {
            return f16808a.a(jVar, kVar);
        }

        @NotNull
        public static final InterfaceC1490j3 a(@NotNull C1511m3.j jVar, @NotNull C1511m3.k kVar, @NotNull C1511m3.f fVar, @NotNull C1511m3.l lVar) {
            return f16808a.a(jVar, kVar, fVar, lVar);
        }

        @NotNull
        public static final InterfaceC1490j3 a(@NotNull InterfaceC1520n3 interfaceC1520n3) {
            return f16808a.a(interfaceC1520n3);
        }

        @NotNull
        public static final InterfaceC1490j3 a(@NotNull InterfaceC1520n3... interfaceC1520n3Arr) {
            return f16808a.a(interfaceC1520n3Arr);
        }
    }

    void a(@NotNull InterfaceC1541q3 interfaceC1541q3);
}
