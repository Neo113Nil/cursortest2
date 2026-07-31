package ru.rustore.sdk.pay.internal;

import android.content.Context;
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
import ru.rustore.sdk.pay.internal.n4;

/* loaded from: classes3.dex */
public final class n4 extends RecyclerView.E {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final Function1<i3, Unit> f44671a;

    /* renamed from: b, reason: collision with root package name */
    public final View f44672b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f44673c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f44674d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f44675e;

    /* renamed from: f, reason: collision with root package name */
    public final ImageView f44676f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(@NotNull ViewGroup viewGroup, @NotNull n3 onClick) {
        super(on.a(viewGroup, R.layout.sdk_pay_coupon_item));
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.f44671a = onClick;
        this.f44672b = this.itemView.findViewById(R.id.coupon_item);
        this.f44673c = (TextView) this.itemView.findViewById(R.id.coupon_item_nominal);
        this.f44674d = (TextView) this.itemView.findViewById(R.id.coupon_item_description);
        this.f44675e = (TextView) this.itemView.findViewById(R.id.coupon_item_interval);
        this.f44676f = (ImageView) this.itemView.findViewById(R.id.coupon_selected_check);
    }

    public final void a(final m4 m4Var, boolean z4) {
        int i4;
        View view = this.f44672b;
        view.setOnClickListener(new View.OnClickListener() { // from class: D3.I
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                n4.a(n4.this, m4Var, view2);
            }
        });
        Context context = view.getContext();
        if (z4 && m4Var.f44635e == u3.A) {
            i4 = R.drawable.sdk_pay_bg_coupon_selected_segment_a;
        } else if (z4 && m4Var.f44635e == u3.B) {
            i4 = R.drawable.sdk_pay_bg_coupon_selected_segment_b;
        } else if (z4 && m4Var.f44635e == u3.C) {
            i4 = R.drawable.sdk_pay_bg_coupon_selected_segment_c;
        } else if (z4 && m4Var.f44635e == u3.D) {
            i4 = R.drawable.sdk_pay_bg_coupon_selected_segment_d;
        } else if (z4) {
            i4 = R.drawable.sdk_pay_bg_coupon_selected_segment_a;
        } else {
            u3 u3Var = m4Var.f44635e;
            i4 = u3Var == u3.A ? R.drawable.sdk_pay_bg_coupon_segment_a : u3Var == u3.B ? R.drawable.sdk_pay_bg_coupon_segment_b : u3Var == u3.C ? R.drawable.sdk_pay_bg_coupon_segment_c : u3Var == u3.D ? R.drawable.sdk_pay_bg_coupon_segment_d : R.drawable.sdk_pay_bg_coupon_segment_a;
        }
        view.setBackground(androidx.core.content.a.g(context, i4));
    }

    public static final void a(n4 n4Var, m4 m4Var, View view) {
        n4Var.f44671a.invoke(new i3(m4Var.f44631a));
    }
}
