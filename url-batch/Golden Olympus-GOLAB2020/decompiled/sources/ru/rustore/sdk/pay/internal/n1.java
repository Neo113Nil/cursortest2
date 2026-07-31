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
import ru.rustore.sdk.pay.internal.n1;

/* loaded from: classes3.dex */
public final class n1 extends RecyclerView.E {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final Function1<h1, Unit> f44667a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f44668b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f44669c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(@NotNull ViewGroup viewGroup, @NotNull v1 onClick) {
        super(on.a(viewGroup, R.layout.sdk_pay_bank_app_item));
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.f44667a = onClick;
        this.f44668b = (ImageView) this.itemView.findViewById(R.id.bank_app_logo);
        this.f44669c = (TextView) this.itemView.findViewById(R.id.bank_app_name);
    }

    public final void a(@NotNull final h1 bankApp) {
        Intrinsics.checkNotNullParameter(bankApp, "bankApp");
        ImageView bankAppLogo = this.f44668b;
        Intrinsics.checkNotNullExpressionValue(bankAppLogo, "bankAppLogo");
        q6.a(bankAppLogo, bankApp.f44192b.getValue(), Integer.valueOf(R.drawable.sdk_pay_ic_empty_bank_logo), 4);
        this.f44669c.setText(bankApp.f44191a.f45112a);
        this.itemView.setOnClickListener(new View.OnClickListener() { // from class: D3.H
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                n1.a(n1.this, bankApp, view);
            }
        });
    }

    public static final void a(n1 n1Var, h1 h1Var, View view) {
        n1Var.f44667a.invoke(h1Var);
    }
}
