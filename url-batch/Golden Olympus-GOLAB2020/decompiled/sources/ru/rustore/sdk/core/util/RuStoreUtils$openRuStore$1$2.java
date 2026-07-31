package ru.rustore.sdk.core.util;

import android.content.Context;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

@Metadata
/* loaded from: classes3.dex */
final class RuStoreUtils$openRuStore$1$2 extends s implements Function0<Unit> {
    final /* synthetic */ Context $this_with;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RuStoreUtils$openRuStore$1$2(Context context) {
        super(0);
        this.$this_with = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m269invoke();
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m269invoke() {
        RuStoreUtils.INSTANCE.showOpenAppError(this.$this_with);
    }
}
