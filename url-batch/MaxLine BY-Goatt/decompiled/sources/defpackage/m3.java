package defpackage;

import com.facebook.appevents.internal.ActivityLifecycleTracker;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class m3 implements Runnable {
    public final /* synthetic */ int m;
    public final /* synthetic */ long n;
    public final /* synthetic */ String o;

    public /* synthetic */ m3(String str, int i, long j) {
        this.m = i;
        this.n = j;
        this.o = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.m) {
            case 0:
                ActivityLifecycleTracker.onActivityPaused$lambda$7(this.n, this.o);
                break;
            default:
                ActivityLifecycleTracker.onActivityPaused$lambda$7$lambda$5(this.n, this.o);
                break;
        }
    }
}
