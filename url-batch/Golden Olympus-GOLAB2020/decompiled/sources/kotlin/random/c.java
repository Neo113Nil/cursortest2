package kotlin.random;

import java.util.Random;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
final class c extends Random {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final a f41167d = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private final e f41168b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f41169c;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public c(e impl) {
        Intrinsics.checkNotNullParameter(impl, "impl");
        this.f41168b = impl;
    }

    @Override // java.util.Random
    protected int next(int i4) {
        return this.f41168b.d(i4);
    }

    @Override // java.util.Random
    public boolean nextBoolean() {
        return this.f41168b.e();
    }

    @Override // java.util.Random
    public void nextBytes(byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        this.f41168b.f(bytes);
    }

    @Override // java.util.Random
    public double nextDouble() {
        return this.f41168b.h();
    }

    @Override // java.util.Random
    public float nextFloat() {
        return this.f41168b.i();
    }

    @Override // java.util.Random
    public int nextInt() {
        return this.f41168b.j();
    }

    @Override // java.util.Random
    public long nextLong() {
        return this.f41168b.m();
    }

    @Override // java.util.Random
    public void setSeed(long j4) {
        if (this.f41169c) {
            throw new UnsupportedOperationException("Setting seed is not supported.");
        }
        this.f41169c = true;
    }

    @Override // java.util.Random
    public int nextInt(int i4) {
        return this.f41168b.k(i4);
    }
}
