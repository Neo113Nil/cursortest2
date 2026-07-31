package ru.rustore.sdk.pay.internal;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class o1 extends RecyclerView.h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final ArrayList f44717a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final v1 f44718b;

    public o1(@NotNull ArrayList bankApps, @NotNull v1 onBankAppClick) {
        Intrinsics.checkNotNullParameter(bankApps, "bankApps");
        Intrinsics.checkNotNullParameter(onBankAppClick, "onBankAppClick");
        this.f44717a = bankApps;
        this.f44718b = onBankAppClick;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f44717a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.E e4, int i4) {
        n1 viewHolder = (n1) e4;
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        viewHolder.a((h1) this.f44717a.get(i4));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.E onCreateViewHolder(ViewGroup viewGroup, int i4) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        return new n1(viewGroup, this.f44718b);
    }
}
