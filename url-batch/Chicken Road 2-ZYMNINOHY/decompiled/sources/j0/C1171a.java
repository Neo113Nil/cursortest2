package j0;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Handler;
import android.os.Message;

/* renamed from: j0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1171a implements MediaCodec.OnFrameRenderedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13722a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w0.j f13723b;

    public /* synthetic */ C1171a(l lVar, w0.j jVar, int i4) {
        this.f13722a = i4;
        this.f13723b = jVar;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j4, long j5) {
        switch (this.f13722a) {
            case 0:
                w0.j jVar = this.f13723b;
                Handler handler = jVar.f15809a;
                if (Build.VERSION.SDK_INT >= 30) {
                    jVar.a(j4);
                    break;
                } else {
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j4 >> 32), (int) j4));
                    break;
                }
            default:
                w0.j jVar2 = this.f13723b;
                Handler handler2 = jVar2.f15809a;
                if (Build.VERSION.SDK_INT >= 30) {
                    jVar2.a(j4);
                    break;
                } else {
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j4 >> 32), (int) j4));
                    break;
                }
        }
    }
}
