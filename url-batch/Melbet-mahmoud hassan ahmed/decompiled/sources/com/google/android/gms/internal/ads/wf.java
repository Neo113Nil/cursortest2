package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.ConditionVariable;

/* loaded from: classes.dex */
final class wf extends Thread {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ AudioTrack f13805f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ gg f13806g;

    wf(gg ggVar, AudioTrack audioTrack) {
        this.f13806g = ggVar;
        this.f13805f = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ConditionVariable conditionVariable;
        try {
            this.f13805f.flush();
            this.f13805f.release();
        } finally {
            conditionVariable = this.f13806g.f5602e;
            conditionVariable.open();
        }
    }
}
