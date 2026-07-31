package ru.rustore.sdk.pay.internal;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.pay.R;
import ru.rustore.sdk.pay.internal.hj;
import ru.rustore.sdk.pay.internal.s9;

/* loaded from: classes3.dex */
public final class hj extends RecyclerView.E {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final Function1<s9, Unit> f44289a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hj(@NotNull ViewGroup viewGroup, @NotNull ed onClick) {
        super(on.a(viewGroup, R.layout.sdk_pay_payment_method_sbp_item));
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.f44289a = onClick;
    }

    public final void a(@NotNull final s9.e method, boolean z4) {
        Intrinsics.checkNotNullParameter(method, "method");
        this.itemView.setOnClickListener(new View.OnClickListener() { // from class: D3.x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hj.a(hj.this, method, view);
            }
        });
        View view = this.itemView;
        view.setBackground(androidx.core.content.a.g(view.getContext(), z4 ? R.drawable.sdk_pay_selected_payment_method_background : R.drawable.sdk_pay_payment_method_background));
    }

    public static final void a(hj hjVar, s9.e eVar, View view) {
        hjVar.f44289a.invoke(eVar);
    }
}
