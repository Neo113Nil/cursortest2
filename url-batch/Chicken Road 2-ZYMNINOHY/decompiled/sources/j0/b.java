package j0;

import android.os.HandlerThread;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements u2.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13724a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13725b;

    public /* synthetic */ b(int i4, int i5) {
        this.f13724a = i5;
        this.f13725b = i4;
    }

    @Override // u2.m
    public final Object get() {
        switch (this.f13724a) {
            case 0:
                return new HandlerThread(c.d(this.f13725b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(c.d(this.f13725b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
