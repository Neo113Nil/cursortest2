package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public abstract class i7 {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f16690c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final b f16691a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final j6 f16692b;

    @Metadata
    public static final class a {

        @Metadata
        /* renamed from: com.ironsource.i7$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0148a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f16693a;

            static {
                int[] iArr = new int[c.values().length];
                try {
                    iArr[c.TIMED_LOAD.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[c.TIMED_SHOW.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f16693a = iArr;
            }
        }

        private a() {
        }

        @NotNull
        public final i7 a(@NotNull C1525o1 adTools, @NotNull w6 bannerContainer, @NotNull b config, @NotNull j6 bannerAdProperties, @NotNull j7 bannerStrategyListener, @NotNull n6 createBannerAdUnitFactory) {
            Intrinsics.checkNotNullParameter(adTools, "adTools");
            Intrinsics.checkNotNullParameter(bannerContainer, "bannerContainer");
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(bannerAdProperties, "bannerAdProperties");
            Intrinsics.checkNotNullParameter(bannerStrategyListener, "bannerStrategyListener");
            Intrinsics.checkNotNullParameter(createBannerAdUnitFactory, "createBannerAdUnitFactory");
            int i4 = C0148a.f16693a[config.e().ordinal()];
            if (i4 == 1) {
                return new wu(adTools, bannerContainer, config, bannerAdProperties, bannerStrategyListener, createBannerAdUnitFactory);
            }
            if (i4 == 2) {
                return new xu(adTools, bannerContainer, config, bannerAdProperties, bannerStrategyListener, createBannerAdUnitFactory);
            }
            throw new W1.m();
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final c f16694a;

        /* renamed from: b, reason: collision with root package name */
        private final long f16695b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f16696c;

        public b(@NotNull c strategyType, long j4, boolean z4) {
            Intrinsics.checkNotNullParameter(strategyType, "strategyType");
            this.f16694a = strategyType;
            this.f16695b = j4;
            this.f16696c = z4;
        }

        public static /* synthetic */ b a(b bVar, c cVar, long j4, boolean z4, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                cVar = bVar.f16694a;
            }
            if ((i4 & 2) != 0) {
                j4 = bVar.f16695b;
            }
            if ((i4 & 4) != 0) {
                z4 = bVar.f16696c;
            }
            return bVar.a(cVar, j4, z4);
        }

        public final long b() {
            return this.f16695b;
        }

        public final boolean c() {
            return this.f16696c;
        }

        public final long d() {
            return this.f16695b;
        }

        @NotNull
        public final c e() {
            return this.f16694a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f16694a == bVar.f16694a && this.f16695b == bVar.f16695b && this.f16696c == bVar.f16696c;
        }

        public final boolean f() {
            return this.f16696c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = ((this.f16694a.hashCode() * 31) + Long.hashCode(this.f16695b)) * 31;
            boolean z4 = this.f16696c;
            int i4 = z4;
            if (z4 != 0) {
                i4 = 1;
            }
            return hashCode + i4;
        }

        @NotNull
        public String toString() {
            return "Config(strategyType=" + this.f16694a + ", refreshInterval=" + this.f16695b + ", isAutoRefreshEnabled=" + this.f16696c + ')';
        }

        @NotNull
        public final b a(@NotNull c strategyType, long j4, boolean z4) {
            Intrinsics.checkNotNullParameter(strategyType, "strategyType");
            return new b(strategyType, j4, z4);
        }

        @NotNull
        public final c a() {
            return this.f16694a;
        }
    }

    @Metadata
    public enum c {
        TIMED_LOAD,
        TIMED_SHOW
    }

    public i7(@NotNull b config, @NotNull j6 bannerAdProperties) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(bannerAdProperties, "bannerAdProperties");
        this.f16691a = config;
        this.f16692b = bannerAdProperties;
    }

    public abstract void c();

    protected final long d() {
        Long i4 = this.f16692b.i();
        return i4 != null ? i4.longValue() : this.f16691a.d();
    }

    protected final boolean e() {
        Boolean h4 = this.f16692b.h();
        return h4 != null ? h4.booleanValue() : this.f16691a.f();
    }

    public abstract void f();

    public abstract void g();

    public abstract void h();
}
