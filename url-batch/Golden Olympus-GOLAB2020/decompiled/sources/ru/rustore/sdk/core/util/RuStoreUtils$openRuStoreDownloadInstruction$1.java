package ru.rustore.sdk.core.util;

import android.content.Context;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

@Metadata
/* loaded from: classes3.dex */
final class RuStoreUtils$openRuStoreDownloadInstruction$1 extends s implements Function0<Unit> {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RuStoreUtils$openRuStoreDownloadInstruction$1(Context context) {
        super(0);
        this.$context = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m271invoke();
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m271invoke() {
        RuStoreUtils.INSTANCE.showOpenAppError(this.$context);
    }
}
