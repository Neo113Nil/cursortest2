package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.ConditionVariable;

/* loaded from: classes.dex */
final class w14 extends Thread {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ AudioTrack f13662f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ h24 f13663g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w14(h24 h24Var, String str, AudioTrack audioTrack) {
        super("ExoPlayer:AudioTrackReleaseThread");
        this.f13663g = h24Var;
        this.f13662f = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ConditionVariable conditionVariable;
        try {
            this.f13662f.flush();
            this.f13662f.release();
        } finally {
            conditionVariable = this.f13663g.f6019e;
            conditionVariable.open();
        }
    }
}
