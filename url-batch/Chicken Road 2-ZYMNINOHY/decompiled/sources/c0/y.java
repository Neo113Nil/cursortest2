package c0;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;

/* loaded from: classes.dex */
public final class y extends AudioTrack$StreamEventCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ B1.j f5624a;

    public y(B1.j jVar) {
        this.f5624a = jVar;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i4) {
        ((z) this.f5624a.f203d).f5636i.e(-1, new b0.c(11));
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        ((z) this.f5624a.f203d).f5636i.e(-1, new b0.c(12));
    }

    public final void onTearDown(AudioTrack audioTrack) {
        ((z) this.f5624a.f203d).f5636i.e(-1, new b0.c(11));
    }
}
