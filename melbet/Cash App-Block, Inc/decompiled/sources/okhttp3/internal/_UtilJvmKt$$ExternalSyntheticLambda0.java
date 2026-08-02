package okhttp3.internal;

import okhttp3.EventListener;
import okhttp3.internal.connection.RealCall;

/* loaded from: classes3.dex */
public final /* synthetic */ class _UtilJvmKt$$ExternalSyntheticLambda0 implements EventListener.Factory {
    public final /* synthetic */ EventListener f$0;

    public /* synthetic */ _UtilJvmKt$$ExternalSyntheticLambda0(EventListener eventListener) {
        this.f$0 = eventListener;
    }

    @Override // okhttp3.EventListener.Factory
    public final EventListener create(RealCall realCall) {
        return this.f$0;
    }
}
