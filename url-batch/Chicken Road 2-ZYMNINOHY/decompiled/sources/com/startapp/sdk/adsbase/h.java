package com.startapp.sdk.adsbase;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.startapp.sdk.adsbase.adlisteners.AdDisplayListener;
import com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason;
import com.startapp.sdk.internal.g0;
import com.startapp.sdk.internal.mj;
import com.startapp.sdk.internal.u;
import com.startapp.sdk.internal.v;
import com.startapp.sdk.internal.v6;
import com.startapp.sdk.internal.w;
import com.startapp.sdk.internal.wb;
import com.startapp.sdk.internal.y;

/* loaded from: classes.dex */
public final class h extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ StartAppAd f6426a;

    public h(StartAppAd startAppAd) {
        this.f6426a = startAppAd;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action == null) {
            action = "";
        }
        String stringExtra = intent.getStringExtra("dParam");
        if (action.equals("com.startapp.android.ShowFailedDisplayBroadcastListener")) {
            Bundle extras = intent.getExtras();
            if (extras == null) {
                extras = Bundle.EMPTY;
            }
            if (extras.containsKey("showFailedReason")) {
                this.f6426a.setNotDisplayedReason((NotDisplayedReason) extras.getSerializable("showFailedReason"));
            }
            StartAppAd startAppAd = this.f6426a;
            y.a(context, startAppAd.f6324j, startAppAd);
            wb.a(context).a(this);
        } else {
            if (action.equals("com.startapp.android.ShowDisplayBroadcastListener")) {
                StartAppAd startAppAd2 = this.f6426a;
                AdDisplayListener adDisplayListener = startAppAd2.f6324j;
                v6.a("onShow", adDisplayListener != null, stringExtra, null);
                g0.a(adDisplayListener != null ? new v(context, adDisplayListener, startAppAd2) : null);
            } else if (action.equals("com.startapp.android.OnClickCallback")) {
                StartAppAd startAppAd3 = this.f6426a;
                AdDisplayListener adDisplayListener2 = startAppAd3.f6324j;
                v6.a("onClicked", adDisplayListener2 != null, stringExtra, null);
                g0.a(adDisplayListener2 != null ? new w(context, adDisplayListener2, startAppAd3) : null);
            } else if (action.equals("com.startapp.android.OnVideoCompleted")) {
                com.startapp.sdk.adsbase.adlisteners.VideoListener videoListener = this.f6426a.f6323i;
                v6.a("onVideoCompleted", videoListener != null, stringExtra, null);
                g0.a(videoListener != null ? new mj(videoListener, context) : null);
            } else {
                StartAppAd startAppAd4 = this.f6426a;
                AdDisplayListener adDisplayListener3 = startAppAd4.f6324j;
                v6.a("adHidden", adDisplayListener3 != null, stringExtra, null);
                g0.a(adDisplayListener3 != null ? new u(context, adDisplayListener3, startAppAd4) : null);
                wb.a(context).a(this);
            }
        }
        this.f6426a.f6319e = null;
    }
}
