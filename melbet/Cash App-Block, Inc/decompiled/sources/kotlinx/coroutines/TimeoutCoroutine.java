package kotlinx.coroutines;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.internal.ScopeCoroutine;

/* loaded from: classes3.dex */
public final class TimeoutCoroutine extends ScopeCoroutine implements Runnable {
    public final long time;

    public TimeoutCoroutine(long j, ContinuationImpl continuationImpl) {
        super(continuationImpl, continuationImpl.getContext());
        this.time = j;
    }

    @Override // kotlinx.coroutines.JobSupport
    public final String nameString$kotlinx_coroutines_core() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.nameString$kotlinx_coroutines_core());
        sb.append("(timeMillis=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.time, ')');
    }

    @Override // java.lang.Runnable
    public final void run() {
        CoroutineContext coroutineContext = this.context;
        JobKt.getDelay(coroutineContext);
        CoroutineName coroutineName = (CoroutineName) coroutineContext.get(CoroutineName.Key);
        String str = coroutineName != null ? coroutineName.name : null;
        String m = Boxes$$ExternalSyntheticOutline1.m(this.time, "Timed out waiting for ", " ms");
        if (str != null) {
            StringBuilder m3m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("Coroutine \"", str, "\" ");
            if (m.length() > 0) {
                m = Character.toLowerCase(m.charAt(0)) + m.substring(1);
            }
            m3m.append(m);
            m = m3m.toString();
        }
        cancelImpl$kotlinx_coroutines_core(new TimeoutCancellationException(m, this));
    }
}
