package ru.rustore.sdk.pay.internal;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.pay.R;
import ru.rustore.sdk.pay.internal.dj;
import ru.rustore.sdk.pay.internal.s9;

/* loaded from: classes3.dex */
public final class dj extends RecyclerView.E {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final Function1<s9, Unit> f43973a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final W1.h f43974b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final W1.h f43975c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final W1.h f43976d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dj(@NotNull ViewGroup viewGroup, @NotNull ed onClick) {
        super(on.a(viewGroup, R.layout.sdk_pay_payment_method_saved_card_item));
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.f43973a = onClick;
        this.f43974b = W1.i.b(new aj(this));
        this.f43975c = W1.i.b(new bj(this));
        this.f43976d = W1.i.b(new cj(this));
    }

    public final void a(@NotNull final s9.c method, boolean z4) {
        Intrinsics.checkNotNullParameter(method, "method");
        View view = this.itemView;
        view.setOnClickListener(new View.OnClickListener() { // from class: D3.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                dj.a(dj.this, method, view2);
            }
        });
        view.setBackground(androidx.core.content.a.g(this.itemView.getContext(), z4 ? R.drawable.sdk_pay_selected_payment_method_background : R.drawable.sdk_pay_payment_method_background));
        Object value = this.f43974b.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-bankIcon>(...)");
        q6.a((ImageView) value, method.f44976b.getValue(), Integer.valueOf(R.drawable.sdk_pay_ic_bank_logo), 4);
        Object value2 = this.f43975c.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "<get-cardNumber>(...)");
        ((TextView) value2).setText(method.f44977c);
        Object value3 = this.f43976d.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "<get-paymentSystem>(...)");
        q6.a((ImageView) value3, method.f44978d.getValue(), (Integer) null, 6);
    }

    public static final void a(dj djVar, s9.c cVar, View view) {
        djVar.f43973a.invoke(cVar);
    }
}
