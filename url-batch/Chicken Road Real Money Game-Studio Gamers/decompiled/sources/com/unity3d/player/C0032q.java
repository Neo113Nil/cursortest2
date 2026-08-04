package com.unity3d.player;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;

/* renamed from: com.unity3d.player.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0032q {
    private final Context a;
    private final AudioManager b;
    private C0028o c;

    public C0032q(Context context) {
        this.a = context;
        this.b = (AudioManager) context.getSystemService("audio");
    }

    public final void a() {
        if (this.c != null) {
            this.a.getContentResolver().unregisterContentObserver(this.c);
            this.c = null;
        }
    }

    public final void a(InterfaceC0030p interfaceC0030p) {
        this.c = new C0028o(new Handler(Looper.getMainLooper()), this.b, interfaceC0030p);
        this.a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this.c);
    }
}
