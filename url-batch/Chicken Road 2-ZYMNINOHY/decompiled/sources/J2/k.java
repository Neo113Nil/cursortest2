package J2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public final class k extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1191a;

    public /* synthetic */ k(int i4) {
        this.f1191a = i4;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        boolean z;
        boolean z4;
        switch (this.f1191a) {
            case 0:
                l lVar = l.f1192d;
                if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
                    z = lVar.f1195c;
                    z4 = true;
                } else if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                    z = lVar.f1195c;
                    z4 = false;
                }
                lVar.a(z4, z);
                lVar.f1194b = z4;
                break;
            default:
                if (intent.getAction() == "android.media.action.HDMI_AUDIO_PLUG") {
                    int intExtra = intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", -1);
                    if (intExtra != 0) {
                        if (intExtra == 1) {
                            U.i.f3045b = 2;
                            break;
                        }
                    } else {
                        U.i.f3045b = 1;
                        break;
                    }
                }
                break;
        }
    }
}
