package ru.rustore.sdk.pay.internal;

import android.view.View;
import android.widget.TextView;
import com.google.android.material.R$id;
import com.google.android.material.snackbar.Snackbar;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.pay.R;

/* loaded from: classes3.dex */
public final class nn {
    public static final void a(@NotNull View view, @NotNull String errorMessage) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        Snackbar make = Snackbar.make(view, errorMessage, 0);
        make.getView().setBackground(androidx.core.content.a.g(make.getView().getContext(), R.drawable.sdk_pay_bg_snack_bar));
        View findViewById = make.getView().findViewById(R$id.snackbar_text);
        Intrinsics.checkNotNullExpressionValue(findViewById, "this.view.findViewById(c…erial.R.id.snackbar_text)");
        TextView textView = (TextView) findViewById;
        textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.sdk_pay_ic_snackbar_error, 0, 0, 0);
        textView.setTextColor(-1);
        textView.setCompoundDrawablePadding(view.getResources().getDimensionPixelOffset(R.dimen.sdk_pay_spacer_xs));
        make.show();
    }
}
