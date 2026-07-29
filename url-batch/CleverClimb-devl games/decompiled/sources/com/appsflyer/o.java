package com.appsflyer;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.sdk.AppLovinEventTypes;

/* loaded from: classes.dex */
final class o {

    /* renamed from: a, reason: collision with root package name */
    private IntentFilter f3479a = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    static final class b {

        /* renamed from: a, reason: collision with root package name */
        static final o f3482a = new o();
    }

    o() {
    }

    final a a(Context context) {
        String str;
        String str2 = null;
        float f = 0.0f;
        try {
            Intent registerReceiver = context.registerReceiver(null, this.f3479a);
            if (registerReceiver != null) {
                if (2 == registerReceiver.getIntExtra("status", -1)) {
                    int intExtra = registerReceiver.getIntExtra("plugged", -1);
                    if (intExtra != 4) {
                        switch (intExtra) {
                            case 1:
                                str = "ac";
                                break;
                            case 2:
                                str = "usb";
                                break;
                            default:
                                str = "other";
                                break;
                        }
                    } else {
                        str = "wireless";
                    }
                } else {
                    str = "no";
                }
                str2 = str;
                int intExtra2 = registerReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1);
                int intExtra3 = registerReceiver.getIntExtra("scale", -1);
                if (-1 != intExtra2 && -1 != intExtra3) {
                    f = (intExtra2 * 100.0f) / intExtra3;
                }
            }
        } catch (Throwable unused) {
        }
        return new a(f, str2);
    }

    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final float f3480a;

        /* renamed from: b, reason: collision with root package name */
        private final String f3481b;

        a(float f, String str) {
            this.f3480a = f;
            this.f3481b = str;
        }

        final float a() {
            return this.f3480a;
        }

        final String b() {
            return this.f3481b;
        }

        a() {
        }
    }
}
