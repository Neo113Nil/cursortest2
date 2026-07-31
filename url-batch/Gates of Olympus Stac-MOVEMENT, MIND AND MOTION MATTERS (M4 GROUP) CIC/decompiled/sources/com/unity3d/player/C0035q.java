package com.unity3d.player;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;

/* renamed from: com.unity3d.player.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0035q {
    private final Context a;
    private final AudioManager b;
    private C0031o c;

    public C0035q(Context context) {
        this.a = context;
        this.b = (AudioManager) context.getSystemService("audio");
    }

    public final void a() {
        if (this.c != null) {
            this.a.getContentResolver().unregisterContentObserver(this.c);
            this.c = null;
        }
    }

    public final void a(InterfaceC0033p interfaceC0033p) {
        this.c = new C0031o(new Handler(Looper.getMainLooper()), this.b, interfaceC0033p);
        this.a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this.c);
    }
}
