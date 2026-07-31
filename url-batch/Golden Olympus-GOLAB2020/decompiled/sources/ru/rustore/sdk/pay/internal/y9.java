package ru.rustore.sdk.pay.internal;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.pay.internal.s9;

/* loaded from: classes3.dex */
public final class y9 extends RecyclerView.h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final ed f45264a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final androidx.recyclerview.widget.d f45265b;

    public y9(@NotNull ed onPaymentMethodClick) {
        Intrinsics.checkNotNullParameter(onPaymentMethodClick, "onPaymentMethodClick");
        this.f45264a = onPaymentMethodClick;
        this.f45265b = new androidx.recyclerview.widget.d(this, new u9());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f45265b.b().size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i4) {
        tm tmVar = (tm) this.f45265b.b().get(i4);
        if (tmVar == null) {
            throw new IllegalStateException("Invalid payment method item");
        }
        s9 s9Var = tmVar.f45048a;
        if (s9Var instanceof s9.b) {
            return 1;
        }
        if (s9Var instanceof s9.c) {
            return 3;
        }
        if (s9Var instanceof s9.e) {
            return 2;
        }
        if (s9Var instanceof s9.d) {
            return 4;
        }
        if (s9Var instanceof s9.a) {
            return 5;
        }
        if (s9Var instanceof s9.f) {
            throw new IllegalStateException("Invalid payment method");
        }
        throw new W1.m();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(@NotNull RecyclerView.E viewHolder, int i4) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        tm tmVar = (tm) this.f45265b.b().get(i4);
        s9 s9Var = tmVar != null ? tmVar.f45048a : null;
        if ((viewHolder instanceof hj) && (s9Var instanceof s9.e)) {
            ((hj) viewHolder).a((s9.e) s9Var, tmVar.f45049b);
            return;
        }
        if ((viewHolder instanceof w7) && (s9Var instanceof s9.b)) {
            ((w7) viewHolder).a((s9.b) s9Var, tmVar.f45049b);
            return;
        }
        if ((viewHolder instanceof dj) && (s9Var instanceof s9.c)) {
            ((dj) viewHolder).a((s9.c) s9Var, tmVar.f45049b);
            return;
        }
        if ((viewHolder instanceof fj) && (s9Var instanceof s9.d)) {
            ((fj) viewHolder).a((s9.d) s9Var, tmVar.f45049b);
        } else if ((viewHolder instanceof k7) && (s9Var instanceof s9.a)) {
            ((k7) viewHolder).a((s9.a) s9Var, tmVar.f45049b);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NotNull
    public final RecyclerView.E onCreateViewHolder(@NotNull ViewGroup viewGroup, int i4) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        if (i4 == 1) {
            return new w7(viewGroup, this.f45264a);
        }
        if (i4 == 2) {
            return new hj(viewGroup, this.f45264a);
        }
        if (i4 == 3) {
            return new dj(viewGroup, this.f45264a);
        }
        if (i4 == 4) {
            return new fj(viewGroup, this.f45264a);
        }
        if (i4 == 5) {
            return new k7(viewGroup, this.f45264a);
        }
        throw new IllegalStateException("Invalid view type");
    }
}
