package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public interface j9 {

    @Metadata
    public static final class a implements j9 {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f16831a;

        public a(boolean z4) {
            this.f16831a = z4;
        }

        @Override // com.ironsource.j9
        public void a() {
            mh.a(fr.f16296x, new hh().a(cc.f15753y, Boolean.valueOf(this.f16831a)).a());
        }
    }

    @Metadata
    public static final class b implements j9 {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f16832a;

        /* renamed from: b, reason: collision with root package name */
        private final long f16833b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final q9 f16834c;

        public b(boolean z4, long j4, @NotNull q9 currentTimeProvider) {
            Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
            this.f16832a = z4;
            this.f16833b = j4;
            this.f16834c = currentTimeProvider;
        }

        @Override // com.ironsource.j9
        public void a() {
            hh a4 = new hh().a(cc.f15753y, Boolean.valueOf(this.f16832a));
            if (this.f16833b > 0) {
                a4.a(cc.f15709B, Long.valueOf(this.f16834c.a() - this.f16833b));
            }
            mh.a(fr.f16295w, a4.a());
        }

        @NotNull
        public final q9 b() {
            return this.f16834c;
        }
    }

    void a();
}
