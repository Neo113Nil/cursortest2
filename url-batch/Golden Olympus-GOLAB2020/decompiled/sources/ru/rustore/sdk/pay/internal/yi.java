package ru.rustore.sdk.pay.internal;

import android.annotation.SuppressLint;
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
import ru.rustore.sdk.pay.internal.s9;
import ru.rustore.sdk.pay.internal.yi;

/* loaded from: classes3.dex */
public final class yi extends RecyclerView.E {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final Function1<s9, Unit> f45282a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f45283b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f45284c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f45285d;

    /* renamed from: e, reason: collision with root package name */
    public final ImageView f45286e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yi(@NotNull ViewGroup viewGroup, @NotNull da onClick) {
        super(on.a(viewGroup, R.layout.sdk_pay_saved_card_item));
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.f45282a = onClick;
        this.f45283b = (ImageView) this.itemView.findViewById(R.id.bank_logo);
        this.f45284c = (TextView) this.itemView.findViewById(R.id.card_info);
        this.f45285d = (ImageView) this.itemView.findViewById(R.id.payment_system_logo);
        this.f45286e = (ImageView) this.itemView.findViewById(R.id.selection_marker);
    }

    @SuppressLint({"SetTextI18n"})
    public final void a(@NotNull final s9.c card, boolean z4) {
        Intrinsics.checkNotNullParameter(card, "card");
        ImageView bankLogo = this.f45283b;
        Intrinsics.checkNotNullExpressionValue(bankLogo, "bankLogo");
        q6.a(bankLogo, card.f44976b.getValue(), Integer.valueOf(R.drawable.sdk_pay_ic_bank_logo), 4);
        this.f45284c.setText(card.f44979e + ' ' + card.f44977c);
        ImageView paymentSystemLogo = this.f45285d;
        Intrinsics.checkNotNullExpressionValue(paymentSystemLogo, "paymentSystemLogo");
        q6.a(paymentSystemLogo, card.f44978d.getValue(), (Integer) null, 6);
        ImageView selectionMarker = this.f45286e;
        Intrinsics.checkNotNullExpressionValue(selectionMarker, "selectionMarker");
        selectionMarker.setVisibility(z4 ? 0 : 8);
        View view = this.itemView;
        view.setBackground(androidx.core.content.a.g(view.getContext(), z4 ? R.drawable.sdk_pay_selected_payment_method_item_background : R.drawable.sdk_pay_payment_method_item_background));
        this.itemView.setOnClickListener(new View.OnClickListener() { // from class: D3.T
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                yi.a(yi.this, card, view2);
            }
        });
    }

    public static final void a(yi yiVar, s9.c cVar, View view) {
        yiVar.f45282a.invoke(cVar);
    }
}
