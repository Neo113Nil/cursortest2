package ru.rustore.sdk.pay.internal;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.pay.R;
import ru.rustore.sdk.pay.internal.s9;
import ru.rustore.sdk.pay.internal.w7;

/* loaded from: classes3.dex */
public final class w7 extends RecyclerView.E {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final Function1<s9, Unit> f45156a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7(@NotNull ViewGroup viewGroup, @NotNull ed onClick) {
        super(on.a(viewGroup, R.layout.sdk_pay_payment_method_new_card_item));
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.f45156a = onClick;
    }

    public final void a(@NotNull final s9.b method, boolean z4) {
        Intrinsics.checkNotNullParameter(method, "method");
        this.itemView.setOnClickListener(new View.OnClickListener() { // from class: D3.S
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w7.a(w7.this, method, view);
            }
        });
        View view = this.itemView;
        view.setBackground(androidx.core.content.a.g(view.getContext(), z4 ? R.drawable.sdk_pay_selected_payment_method_background : R.drawable.sdk_pay_payment_method_background));
    }

    public static final void a(w7 w7Var, s9.b bVar, View view) {
        w7Var.f45156a.invoke(bVar);
    }
}
