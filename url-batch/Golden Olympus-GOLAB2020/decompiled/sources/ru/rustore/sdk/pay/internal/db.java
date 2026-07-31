package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.pay.model.AmountLabel;

/* loaded from: classes3.dex */
public final class db {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final i f43960a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final u4 f43961b;

    public db(@NotNull i amountLabelUiMapper, @NotNull u4 currencyFormatter) {
        Intrinsics.checkNotNullParameter(amountLabelUiMapper, "amountLabelUiMapper");
        Intrinsics.checkNotNullParameter(currencyFormatter, "currencyFormatter");
        this.f43960a = amountLabelUiMapper;
        this.f43961b = currencyFormatter;
    }

    @NotNull
    public final cb a(@NotNull u8 paymentExtras, @NotNull AmountLabel amountLabel) {
        Intrinsics.checkNotNullParameter(paymentExtras, "paymentExtras");
        Intrinsics.checkNotNullParameter(amountLabel, "amountLabel");
        z4 z4Var = paymentExtras.f45088c;
        b5 b5Var = z4Var != null ? z4Var.f45312b : null;
        if (b5Var == null) {
            this.f43960a.getClass();
            Intrinsics.checkNotNullParameter(amountLabel, "amountLabel");
            String G3 = StringsKt.G(amountLabel.getValue(), ",00", "", false, 4, null);
            return new cb(G3, null, G3, false);
        }
        u4 u4Var = this.f43961b;
        long j4 = b5Var.f43853a;
        u4Var.getClass();
        String a4 = u4.a(j4);
        StringBuilder sb = new StringBuilder("-");
        u4 u4Var2 = this.f43961b;
        long j5 = b5Var.f43855c;
        u4Var2.getClass();
        sb.append(u4.a(j5));
        String sb2 = sb.toString();
        u4 u4Var3 = this.f43961b;
        long j6 = b5Var.f43854b;
        u4Var3.getClass();
        return new cb(a4, sb2, u4.a(j6), false);
    }
}
