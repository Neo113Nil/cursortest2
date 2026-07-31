package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class cf2 implements ij2<df2> {

    /* renamed from: a, reason: collision with root package name */
    private final dc3 f3836a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f3837b;

    public cf2(dc3 dc3Var, Context context) {
        this.f3836a = dc3Var;
        this.f3837b = context;
    }

    @Override // com.google.android.gms.internal.ads.ij2
    public final cc3<df2> a() {
        return this.f3836a.E(new Callable() { // from class: com.google.android.gms.internal.ads.bf2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return cf2.this.b();
            }
        });
    }

    final /* synthetic */ df2 b() {
        AudioManager audioManager = (AudioManager) this.f3837b.getSystemService("audio");
        return new df2(audioManager.getMode(), audioManager.isMusicActive(), audioManager.isSpeakerphoneOn(), audioManager.getStreamVolume(3), audioManager.getRingerMode(), audioManager.getStreamVolume(2), y2.t.s().a(), y2.t.s().e());
    }
}
