package com.iab.omid.library.startio.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.iab.omid.library.startio.adsession.DeviceCategory;
import com.iab.omid.library.startio.adsession.OutputDeviceStatus;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private static OutputDeviceStatus f56a = OutputDeviceStatus.UNKNOWN;

    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            OutputDeviceStatus outputDeviceStatus;
            if (intent.getAction() == "android.media.action.HDMI_AUDIO_PLUG") {
                int intExtra = intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", -1);
                if (intExtra == 0) {
                    outputDeviceStatus = OutputDeviceStatus.NOT_DETECTED;
                } else if (intExtra != 1) {
                    return;
                } else {
                    outputDeviceStatus = OutputDeviceStatus.UNKNOWN;
                }
                OutputDeviceStatus unused = e.f56a = outputDeviceStatus;
            }
        }
    }

    public static OutputDeviceStatus a() {
        return com.iab.omid.library.startio.utils.a.a() != DeviceCategory.CTV ? OutputDeviceStatus.UNKNOWN : f56a;
    }

    public static void a(Context context) {
        context.registerReceiver(new a(), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
    }
}
