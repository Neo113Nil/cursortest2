package kotlinx.coroutines.channels;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.channels.l;
import kotlinx.coroutines.h0;
import y5.w;

/* loaded from: classes5.dex */
final class i extends c implements j {
    public i(CoroutineContext coroutineContext, b bVar) {
        super(coroutineContext, bVar, true, true);
    }

    @Override // kotlinx.coroutines.channels.j
    public /* bridge */ /* synthetic */ l getChannel() {
        return getChannel();
    }

    @Override // kotlinx.coroutines.a, kotlinx.coroutines.JobSupport, kotlinx.coroutines.l1
    public boolean isActive() {
        return super.isActive();
    }

    @Override // kotlinx.coroutines.a
    protected void onCancelled(Throwable th, boolean z7) {
        if (get_channel().close(th) || z7) {
            return;
        }
        h0.handleCoroutineException(getContext(), th);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.a
    public void onCompleted(w wVar) {
        l.a.close$default(get_channel(), null, 1, null);
    }
}
