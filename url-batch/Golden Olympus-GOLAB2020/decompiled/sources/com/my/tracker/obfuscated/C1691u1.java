package com.my.tracker.obfuscated;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;

/* renamed from: com.my.tracker.obfuscated.u1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1691u1 {

    /* renamed from: com.my.tracker.obfuscated.u1$a */
    private static class a extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        final InterfaceC1685t f21540a;

        public a(InterfaceC1685t interfaceC1685t) {
            this.f21540a = interfaceC1685t;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("ru.rustore.sdk.remoteconfig.SEGMENT_HANDLED".equals(intent.getAction())) {
                try {
                    String stringExtra = intent.getStringExtra("payload");
                    if (stringExtra == null) {
                        stringExtra = "";
                    }
                    AbstractC1708y2.a("RuStoreRemoteConfigHandler: received: action=" + intent.getAction() + ", payload=" + stringExtra);
                    this.f21540a.a(stringExtra);
                } catch (Exception e4) {
                    AbstractC1708y2.a("RuStoreRemoteConfigHandler: error " + e4);
                }
            }
        }
    }

    private C1691u1() {
    }

    public void a(Context context, InterfaceC1685t interfaceC1685t) {
        a aVar = new a(interfaceC1685t);
        IntentFilter intentFilter = new IntentFilter("ru.rustore.sdk.remoteconfig.SEGMENT_HANDLED");
        if (Build.VERSION.SDK_INT < 33) {
            context.registerReceiver(aVar, intentFilter);
        } else {
            context.registerReceiver(aVar, intentFilter, 4);
        }
    }

    public static C1691u1 a() {
        return new C1691u1();
    }
}
