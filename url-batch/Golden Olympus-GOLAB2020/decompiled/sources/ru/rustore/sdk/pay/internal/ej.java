package ru.rustore.sdk.pay.internal;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.pay.R;
import ru.rustore.sdk.pay.internal.ej;
import ru.rustore.sdk.pay.internal.s9;

/* loaded from: classes3.dex */
public final class ej extends RecyclerView.E {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final Function1<s9, Unit> f44042a;

    /* renamed from: b, reason: collision with root package name */
    public final LinearLayout f44043b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f44044c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ej(@NotNull ViewGroup viewGroup, @NotNull da onClick) {
        super(on.a(viewGroup, R.layout.sdk_pay_sber_pay_item));
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.f44042a = onClick;
        this.f44043b = (LinearLayout) this.itemView.findViewById(R.id.sber_pay_item_content_layout);
        this.f44044c = (ImageView) this.itemView.findViewById(R.id.selection_marker);
    }

    public final void a(@NotNull final s9.d method, boolean z4) {
        Intrinsics.checkNotNullParameter(method, "method");
        ImageView selectionMarker = this.f44044c;
        Intrinsics.checkNotNullExpressionValue(selectionMarker, "selectionMarker");
        selectionMarker.setVisibility(z4 ? 0 : 8);
        this.f44043b.setBackground(androidx.core.content.a.g(this.itemView.getContext(), z4 ? R.drawable.sdk_pay_selected_payment_method_item_background : R.drawable.sdk_pay_payment_method_item_background));
        this.f44043b.setOnClickListener(new View.OnClickListener() { // from class: D3.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ej.a(ej.this, method, view);
            }
        });
    }

    public static final void a(ej ejVar, s9.d dVar, View view) {
        ejVar.f44042a.invoke(dVar);
    }
}
