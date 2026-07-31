package ru.rustore.sdk.pay.internal;

import android.widget.ImageView;
import kotlin.jvm.functions.Function0;
import ru.rustore.sdk.pay.R;

/* loaded from: classes3.dex */
public final class aj extends kotlin.jvm.internal.s implements Function0<ImageView> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dj f43823a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj(dj djVar) {
        super(0);
        this.f43823a = djVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return (ImageView) this.f43823a.itemView.findViewById(R.id.card_bank_icon);
    }
}
