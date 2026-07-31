package ru.rustore.sdk.pay.internal;

import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class p4 extends RecyclerView.h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<m4> f44775a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final n3 f44776b;

    public p4(@NotNull List coupons, @NotNull n3 onCouponClick) {
        Intrinsics.checkNotNullParameter(coupons, "coupons");
        Intrinsics.checkNotNullParameter(onCouponClick, "onCouponClick");
        this.f44775a = coupons;
        this.f44776b = onCouponClick;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f44775a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.E e4, int i4) {
        n4 viewHolder = (n4) e4;
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        m4 coupon = this.f44775a.get(i4);
        boolean z4 = coupon.f44636f;
        viewHolder.getClass();
        Intrinsics.checkNotNullParameter(coupon, "coupon");
        viewHolder.a(coupon, z4);
        viewHolder.f44673c.setText(coupon.f44632b);
        viewHolder.f44674d.setText(coupon.f44633c);
        viewHolder.f44675e.setText(coupon.f44634d);
        ImageView selectedCheck = viewHolder.f44676f;
        Intrinsics.checkNotNullExpressionValue(selectedCheck, "selectedCheck");
        selectedCheck.setVisibility(z4 ? 0 : 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.E onCreateViewHolder(ViewGroup viewGroup, int i4) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        return new n4(viewGroup, this.f44776b);
    }
}
