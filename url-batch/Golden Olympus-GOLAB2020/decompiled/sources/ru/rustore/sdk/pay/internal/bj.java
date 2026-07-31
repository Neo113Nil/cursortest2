package ru.rustore.sdk.pay.internal;

import android.widget.TextView;
import kotlin.jvm.functions.Function0;
import ru.rustore.sdk.pay.R;

/* loaded from: classes3.dex */
public final class bj extends kotlin.jvm.internal.s implements Function0<TextView> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dj f43874a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bj(dj djVar) {
        super(0);
        this.f43874a = djVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return (TextView) this.f43874a.itemView.findViewById(R.id.card_number);
    }
}
