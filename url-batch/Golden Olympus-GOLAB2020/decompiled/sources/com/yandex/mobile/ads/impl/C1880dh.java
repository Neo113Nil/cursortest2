package com.yandex.mobile.ads.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.yandex.mobile.ads.impl.h60;

/* renamed from: com.yandex.mobile.ads.impl.dh, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1880dh {

    /* renamed from: a, reason: collision with root package name */
    private final Context f24618a;

    /* renamed from: b, reason: collision with root package name */
    private final a f24619b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f24620c;

    /* renamed from: com.yandex.mobile.ads.impl.dh$a */
    private final class a extends BroadcastReceiver implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private final b f24621b;

        /* renamed from: c, reason: collision with root package name */
        private final Handler f24622c;

        public a(Handler handler, b bVar) {
            this.f24622c = handler;
            this.f24621b = bVar;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f24622c.post(this);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (C1880dh.this.f24620c) {
                ((h60.b) this.f24621b).c();
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.dh$b */
    public interface b {
    }

    public C1880dh(Context context, Handler handler, b bVar) {
        this.f24618a = context.getApplicationContext();
        this.f24619b = new a(handler, bVar);
    }

    public final void a() {
        if (this.f24620c) {
            this.f24618a.unregisterReceiver(this.f24619b);
            this.f24620c = false;
        }
    }
}
