package androidx.activity;

import kotlin.jvm.internal.FunctionReferenceImpl;
import y5.w;

/* loaded from: classes.dex */
/* synthetic */ class OnBackPressedDispatcher$addCallback$1 extends FunctionReferenceImpl implements f6.a {
    OnBackPressedDispatcher$addCallback$1(Object obj) {
        super(0, obj, OnBackPressedDispatcher.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
    }

    @Override // f6.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m3invoke();
        return w.INSTANCE;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m3invoke() {
        ((OnBackPressedDispatcher) this.receiver).updateEnabledCallbacks();
    }
}
