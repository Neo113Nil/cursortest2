package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.rf, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2937rf implements InterfaceC2723j8 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final Ef f39728a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final List<C2912qf> f39729b;

    public C2937rf(@NonNull Ef ef, @NonNull List<C2912qf> list) {
        this.f39728a = ef;
        this.f39729b = list;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2723j8
    @NonNull
    public final List<C2912qf> a() {
        return this.f39729b;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2723j8
    public final Object b() {
        return this.f39728a;
    }

    public final Ef c() {
        return this.f39728a;
    }

    public final String toString() {
        return "PreloadInfoData{chosenPreloadInfo=" + this.f39728a + ", candidates=" + this.f39729b + '}';
    }
}
