package androidx.activity;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: OnBackPressedDispatcher.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
/* synthetic */ class OnBackPressedDispatcher$addCallback$1 extends FunctionReferenceImpl implements Function0 {
    OnBackPressedDispatcher$addCallback$1(Object obj) {
        super(0, obj, OnBackPressedDispatcher.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Object mo4828invoke() {
        m10invoke();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m10invoke() {
        ((OnBackPressedDispatcher) this.receiver).updateEnabledCallbacks();
    }
}
