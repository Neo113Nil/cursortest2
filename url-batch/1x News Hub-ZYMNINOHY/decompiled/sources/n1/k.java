package n1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public final class k extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10166a;

    public /* synthetic */ k(int i3) {
        this.f10166a = i3;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        boolean z;
        boolean z2;
        switch (this.f10166a) {
            case 0:
                boolean equals = intent.getAction().equals("android.intent.action.SCREEN_OFF");
                l lVar = l.f10167d;
                if (equals) {
                    z = lVar.f10170c;
                    z2 = true;
                } else if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                    z = lVar.f10170c;
                    z2 = false;
                }
                lVar.a(z2, z);
                lVar.f10169b = z2;
                break;
            default:
                if (intent.getAction() == "android.media.action.HDMI_AUDIO_PLUG") {
                    int intExtra = intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", -1);
                    if (intExtra != 0) {
                        if (intExtra == 1) {
                            S0.a.f1332h = 2;
                            break;
                        }
                    } else {
                        S0.a.f1332h = 1;
                        break;
                    }
                }
                break;
        }
    }
}
