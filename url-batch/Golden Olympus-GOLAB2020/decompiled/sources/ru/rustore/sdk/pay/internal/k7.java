package ru.rustore.sdk.pay.internal;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.pay.R;
import ru.rustore.sdk.pay.internal.k7;
import ru.rustore.sdk.pay.internal.s9;

/* loaded from: classes3.dex */
public final class k7 extends RecyclerView.E {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final Function1<s9, Unit> f44421a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k7(@NotNull ViewGroup viewGroup, @NotNull ed onClick) {
        super(on.a(viewGroup, R.layout.sdk_pay_payment_method_mobile_phone_item));
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.f44421a = onClick;
    }

    public final void a(@NotNull final s9.a method, boolean z4) {
        Intrinsics.checkNotNullParameter(method, "method");
        this.itemView.setOnClickListener(new View.OnClickListener() { // from class: D3.A
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                k7.a(k7.this, method, view);
            }
        });
        View view = this.itemView;
        view.setBackground(androidx.core.content.a.g(view.getContext(), z4 ? R.drawable.sdk_pay_selected_payment_method_background : R.drawable.sdk_pay_payment_method_background));
    }

    public static final void a(k7 k7Var, s9.a aVar, View view) {
        k7Var.f44421a.invoke(aVar);
    }
}
