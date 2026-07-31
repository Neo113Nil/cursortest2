package ru.rustore.sdk.pay.internal;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.pay.R;
import ru.rustore.sdk.pay.internal.fj;
import ru.rustore.sdk.pay.internal.s9;

/* loaded from: classes3.dex */
public final class fj extends RecyclerView.E {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final Function1<s9, Unit> f44132a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fj(@NotNull ViewGroup viewGroup, @NotNull ed onClick) {
        super(on.a(viewGroup, R.layout.sdk_pay_payment_method_sber_pay_item));
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.f44132a = onClick;
    }

    public final void a(@NotNull final s9.d method, boolean z4) {
        Intrinsics.checkNotNullParameter(method, "method");
        this.itemView.setOnClickListener(new View.OnClickListener() { // from class: D3.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                fj.a(fj.this, method, view);
            }
        });
        View view = this.itemView;
        view.setBackground(androidx.core.content.a.g(view.getContext(), z4 ? R.drawable.sdk_pay_selected_payment_method_background : R.drawable.sdk_pay_payment_method_background));
    }

    public static final void a(fj fjVar, s9.d dVar, View view) {
        fjVar.f44132a.invoke(dVar);
    }
}
