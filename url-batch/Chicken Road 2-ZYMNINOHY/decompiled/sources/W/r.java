package W;

import T.C0086d;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioDeviceInfo;
import c0.C0270c;

/* loaded from: classes.dex */
public final class r extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3334a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3335b;

    public /* synthetic */ r(int i4, Object obj) {
        this.f3334a = i4;
        this.f3335b = obj;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.f3334a) {
            case 0:
                ((s) this.f3335b).f3337a.execute(new R1.e(this, 6, context));
                break;
            default:
                if (!isInitialStickyBroadcast()) {
                    O2.d dVar = (O2.d) this.f3335b;
                    dVar.a(C0270c.c(context, intent, (C0086d) dVar.f2055j, (AudioDeviceInfo) dVar.f2054i));
                    break;
                }
                break;
        }
    }
}
