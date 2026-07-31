package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class c31 extends RecyclerView.h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<ej0> f24036a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final z21 f24037b;

    public c31(@NotNull zi0 imageProvider, @NotNull List<ej0> imageValues, @NotNull C2360y7<?> adResponse) {
        Intrinsics.checkNotNullParameter(imageProvider, "imageProvider");
        Intrinsics.checkNotNullParameter(imageValues, "imageValues");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        this.f24036a = imageValues;
        this.f24037b = new z21(imageProvider, adResponse);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f24036a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.E e4, int i4) {
        y21 holderImage = (y21) e4;
        Intrinsics.checkNotNullParameter(holderImage, "holderImage");
        holderImage.a(this.f24036a.get(i4));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.E onCreateViewHolder(ViewGroup parent, int i4) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return this.f24037b.a(parent);
    }
}
