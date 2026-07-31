package J0;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1238f;

    public /* synthetic */ a(int i7) {
        this.f1238f = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1238f) {
            case 0:
                int i7 = AlarmManagerSchedulerBroadcastReceiver.f3839a;
                break;
            default:
                com.onesignal.common.threading.a.prewarm$lambda$2();
                break;
        }
    }
}
