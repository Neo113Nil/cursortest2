package ru.rustore.sdk.pay.internal;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.pay.internal.qm;
import ru.rustore.sdk.pay.internal.s9;

/* loaded from: classes3.dex */
public final class w9 extends RecyclerView.h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final ca f45158a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final da f45159b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final androidx.recyclerview.widget.d f45160c;

    public w9(@NotNull ca onNewCardClick, @NotNull da onMethodClick) {
        Intrinsics.checkNotNullParameter(onNewCardClick, "onNewCardClick");
        Intrinsics.checkNotNullParameter(onMethodClick, "onMethodClick");
        this.f45158a = onNewCardClick;
        this.f45159b = onMethodClick;
        this.f45160c = new androidx.recyclerview.widget.d(this, new rm());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f45160c.b().size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i4) {
        qm qmVar = (qm) this.f45160c.b().get(i4);
        if (Intrinsics.areEqual(qmVar, qm.b.f44857a)) {
            return 0;
        }
        if (!(qmVar instanceof qm.a)) {
            throw new W1.m();
        }
        s9 s9Var = ((qm.a) qmVar).f44855a;
        if (s9Var instanceof s9.e) {
            return 2;
        }
        if (s9Var instanceof s9.c) {
            return 1;
        }
        if (s9Var instanceof s9.d) {
            return 3;
        }
        if (s9Var instanceof s9.a) {
            return 4;
        }
        if (s9Var instanceof s9.b) {
            throw new IllegalStateException("New card is not expected as payment method with selection");
        }
        if (s9Var instanceof s9.f) {
            throw new IllegalStateException("Unsupported payment method");
        }
        throw new W1.m();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(@NotNull RecyclerView.E holder, int i4) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        qm qmVar = (qm) this.f45160c.b().get(i4);
        if ((holder instanceof yi) && (qmVar instanceof qm.a)) {
            qm.a aVar = (qm.a) qmVar;
            s9 s9Var = aVar.f44855a;
            if (s9Var instanceof s9.c) {
                ((yi) holder).a((s9.c) s9Var, aVar.f44856b);
                return;
            }
        }
        if ((holder instanceof gj) && (qmVar instanceof qm.a)) {
            qm.a aVar2 = (qm.a) qmVar;
            s9 s9Var2 = aVar2.f44855a;
            if (s9Var2 instanceof s9.e) {
                ((gj) holder).a((s9.e) s9Var2, aVar2.f44856b);
                return;
            }
        }
        if ((holder instanceof ej) && (qmVar instanceof qm.a)) {
            qm.a aVar3 = (qm.a) qmVar;
            s9 s9Var3 = aVar3.f44855a;
            if (s9Var3 instanceof s9.d) {
                ((ej) holder).a((s9.d) s9Var3, aVar3.f44856b);
                return;
            }
        }
        if ((holder instanceof i7) && (qmVar instanceof qm.a)) {
            qm.a aVar4 = (qm.a) qmVar;
            s9 s9Var4 = aVar4.f44855a;
            if (s9Var4 instanceof s9.a) {
                ((i7) holder).a((s9.a) s9Var4, aVar4.f44856b);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NotNull
    public final RecyclerView.E onCreateViewHolder(@NotNull ViewGroup parent, int i4) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (i4 == 0) {
            return new v7(parent, this.f45158a);
        }
        if (i4 == 1) {
            return new yi(parent, this.f45159b);
        }
        if (i4 == 2) {
            return new gj(parent, this.f45159b);
        }
        if (i4 == 3) {
            return new ej(parent, this.f45159b);
        }
        if (i4 == 4) {
            return new i7(parent, this.f45159b);
        }
        throw new IllegalStateException("Invalid view type");
    }
}
