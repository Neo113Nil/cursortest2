package com.startapp.sdk.adsbase;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.startapp.sdk.adsbase.adlisteners.AdDisplayListener;
import com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason;
import com.startapp.sdk.internal.db;
import com.startapp.sdk.internal.e0;
import com.startapp.sdk.internal.u;
import com.startapp.sdk.internal.u6;
import com.startapp.sdk.internal.ui;
import com.startapp.sdk.internal.v;
import com.startapp.sdk.internal.w;
import com.startapp.sdk.internal.y;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class h extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ StartAppAd f143a;

    public h(StartAppAd startAppAd) {
        this.f143a = startAppAd;
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
                this.f143a.setNotDisplayedReason((NotDisplayedReason) extras.getSerializable("showFailedReason"));
            }
            StartAppAd startAppAd = this.f143a;
            y.a(context, startAppAd.h, startAppAd);
            db.a(context).a(this);
        } else {
            if (action.equals("com.startapp.android.ShowDisplayBroadcastListener")) {
                StartAppAd startAppAd2 = this.f143a;
                AdDisplayListener adDisplayListener = startAppAd2.h;
                u6.a("onShow", adDisplayListener != null, stringExtra, null);
                e0.a(adDisplayListener != null ? new v(context, adDisplayListener, startAppAd2) : null);
            } else if (action.equals("com.startapp.android.OnClickCallback")) {
                StartAppAd startAppAd3 = this.f143a;
                AdDisplayListener adDisplayListener2 = startAppAd3.h;
                u6.a("onClicked", adDisplayListener2 != null, stringExtra, null);
                e0.a(adDisplayListener2 != null ? new w(context, adDisplayListener2, startAppAd3) : null);
            } else {
                boolean equals = action.equals("com.startapp.android.OnVideoCompleted");
                StartAppAd startAppAd4 = this.f143a;
                if (equals) {
                    com.startapp.sdk.adsbase.adlisteners.VideoListener videoListener = startAppAd4.g;
                    u6.a("onVideoCompleted", videoListener != null, stringExtra, null);
                    e0.a(videoListener != null ? new ui(videoListener, context) : null);
                } else {
                    AdDisplayListener adDisplayListener3 = startAppAd4.h;
                    u6.a("adHidden", adDisplayListener3 != null, stringExtra, null);
                    e0.a(adDisplayListener3 != null ? new u(context, adDisplayListener3, startAppAd4) : null);
                    db.a(context).a(this);
                }
            }
        }
        this.f143a.d = null;
    }
}
