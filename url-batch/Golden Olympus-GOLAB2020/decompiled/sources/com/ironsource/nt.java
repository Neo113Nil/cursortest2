package com.ironsource;

import com.ironsource.gf;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class nt implements gf, gf.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final q9 f18426a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final fi f18427b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Map<String, kt> f18428c;

    @Metadata
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private int f18429a;

        /* renamed from: b, reason: collision with root package name */
        private long f18430b;

        /* renamed from: c, reason: collision with root package name */
        @Nullable
        private Long f18431c;

        public a(int i4, long j4, @Nullable Long l4) {
            this.f18429a = i4;
            this.f18430b = j4;
            this.f18431c = l4;
        }

        public final int a() {
            return this.f18429a;
        }

        public final long b() {
            return this.f18430b;
        }

        @Nullable
        public final Long c() {
            return this.f18431c;
        }

        public final int d() {
            return this.f18429a;
        }

        public final long e() {
            return this.f18430b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f18429a == aVar.f18429a && this.f18430b == aVar.f18430b && Intrinsics.areEqual(this.f18431c, aVar.f18431c);
        }

        @Nullable
        public final Long f() {
            return this.f18431c;
        }

        public int hashCode() {
            int hashCode = ((Integer.hashCode(this.f18429a) * 31) + Long.hashCode(this.f18430b)) * 31;
            Long l4 = this.f18431c;
            return hashCode + (l4 == null ? 0 : l4.hashCode());
        }

        @NotNull
        public String toString() {
            return "ShowCountCappingInfo(currentNumberOfShows=" + this.f18429a + ", currentTime=" + this.f18430b + ", currentTimeThreshold=" + this.f18431c + ')';
        }

        @NotNull
        public final a a(int i4, long j4, @Nullable Long l4) {
            return new a(i4, j4, l4);
        }

        public static /* synthetic */ a a(a aVar, int i4, long j4, Long l4, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                i4 = aVar.f18429a;
            }
            if ((i5 & 2) != 0) {
                j4 = aVar.f18430b;
            }
            if ((i5 & 4) != 0) {
                l4 = aVar.f18431c;
            }
            return aVar.a(i4, j4, l4);
        }

        public final void a(int i4) {
            this.f18429a = i4;
        }

        public final void a(long j4) {
            this.f18430b = j4;
        }

        public final void a(@Nullable Long l4) {
            this.f18431c = l4;
        }
    }

    public nt(@NotNull q9 currentTimeProvider, @NotNull fi serviceDataRepository) {
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        Intrinsics.checkNotNullParameter(serviceDataRepository, "serviceDataRepository");
        this.f18426a = currentTimeProvider;
        this.f18427b = serviceDataRepository;
        this.f18428c = new LinkedHashMap();
    }

    private final a c(String str) {
        return new a(this.f18427b.a(str), this.f18426a.a(), this.f18427b.b(str));
    }

    @Override // com.ironsource.gf
    @NotNull
    public l8 a(@NotNull String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        kt ktVar = this.f18428c.get(identifier);
        if (ktVar != null && a(ktVar, identifier)) {
            return new l8(true, n8.ShowCount);
        }
        return new l8(false, null, 2, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        if (r4 >= (r2 != null ? r2.longValue() : 0)) goto L13;
     */
    @Override // com.ironsource.gf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(@NotNull String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        kt ktVar = this.f18428c.get(identifier);
        if (ktVar == null) {
            return;
        }
        a c4 = c(identifier);
        if (c4.d() != 0) {
            long e4 = c4.e();
            Long f4 = c4.f();
        }
        this.f18427b.a(c4.e() + m8.a(ktVar.b(), null, 1, null), identifier);
        c4.a(0);
        c4.a(c4.d() + 1);
        this.f18427b.a(c4.d(), identifier);
    }

    @Override // com.ironsource.gf.a
    @NotNull
    public Object a(@NotNull String identifier, @NotNull n8 cappingType, @NotNull ef cappingConfig) {
        Object createFailure;
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(cappingType, "cappingType");
        Intrinsics.checkNotNullParameter(cappingConfig, "cappingConfig");
        Object c4 = cappingConfig.c();
        if (Result.f(c4)) {
            kt ktVar = (kt) c4;
            if (ktVar != null) {
                this.f18428c.put(identifier, ktVar);
            }
        } else {
            Throwable d4 = Result.d(c4);
            if (d4 != null) {
                createFailure = ResultKt.createFailure(d4);
                return Result.m243constructorimpl(createFailure);
            }
        }
        createFailure = Unit.f41027a;
        return Result.m243constructorimpl(createFailure);
    }

    @NotNull
    public final Map<String, kt> a() {
        return this.f18428c;
    }

    private final boolean a(kt ktVar, String str) {
        a c4 = c(str);
        Long f4 = c4.f();
        if (f4 != null) {
            long longValue = f4.longValue();
            if (c4.d() >= ktVar.a() && this.f18426a.a() < longValue) {
                return true;
            }
        }
        return false;
    }
}
