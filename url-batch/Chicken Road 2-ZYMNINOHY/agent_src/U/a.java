package U;

import W.F;
import a0.SurfaceHolderCallbackC0125A;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public final class a extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final SurfaceHolderCallbackC0125A f3014a;

    /* renamed from: b, reason: collision with root package name */
    public final F f3015b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f3016c;

    public a(b bVar, F f4, SurfaceHolderCallbackC0125A surfaceHolderCallbackC0125A) {
        this.f3016c = bVar;
        this.f3015b = f4;
        this.f3014a = surfaceHolderCallbackC0125A;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f3015b.c(new R1.n(2, this));
        }
    }
}
