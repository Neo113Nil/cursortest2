package u0;

import android.view.Choreographer;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class Q implements Choreographer.FrameCallback, Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ S f8223d;

    public Q(S s3) {
        this.f8223d = s3;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j3) {
        this.f8223d.f8236g.removeCallbacks(this);
        S.S(this.f8223d);
        S s3 = this.f8223d;
        synchronized (s3.f8237h) {
            if (s3.f8242m) {
                s3.f8242m = false;
                ArrayList arrayList = s3.f8239j;
                s3.f8239j = s3.f8240k;
                s3.f8240k = arrayList;
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((Choreographer.FrameCallback) arrayList.get(i3)).doFrame(j3);
                }
                arrayList.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        S.S(this.f8223d);
        S s3 = this.f8223d;
        synchronized (s3.f8237h) {
            if (s3.f8239j.isEmpty()) {
                s3.f8235f.removeFrameCallback(this);
                s3.f8242m = false;
            }
        }
    }
}
