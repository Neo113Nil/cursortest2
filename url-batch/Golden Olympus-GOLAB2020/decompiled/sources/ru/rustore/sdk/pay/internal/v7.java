package ru.rustore.sdk.pay.internal;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.pay.R;
import ru.rustore.sdk.pay.internal.v7;

/* loaded from: classes3.dex */
public final class v7 extends RecyclerView.E {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7(@NotNull ViewGroup viewGroup, @NotNull final ca onClick) {
        super(on.a(viewGroup, R.layout.sdk_pay_new_card_item));
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.itemView.setOnClickListener(new View.OnClickListener() { // from class: D3.Q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                v7.a(Function0.this, view);
            }
        });
    }

    public static final void a(Function0 function0, View view) {
        function0.invoke();
    }
}
