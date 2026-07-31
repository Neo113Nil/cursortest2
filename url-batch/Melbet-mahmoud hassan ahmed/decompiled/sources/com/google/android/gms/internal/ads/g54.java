package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.SparseArray;

/* loaded from: classes.dex */
public final class g54 implements e64 {

    /* renamed from: a, reason: collision with root package name */
    private final gd1 f5458a;

    /* renamed from: b, reason: collision with root package name */
    private final SparseArray<e64> f5459b;

    /* renamed from: c, reason: collision with root package name */
    private final int[] f5460c;

    public g54(Context context, vc4 vc4Var) {
        k94 k94Var = new k94(context);
        this.f5458a = k94Var;
        SparseArray<e64> sparseArray = new SparseArray<>();
        try {
            sparseArray.put(0, (e64) Class.forName("androidx.media3.exoplayer.dash.DashMediaSource$Factory").asSubclass(e64.class).getConstructor(gd1.class).newInstance(k94Var));
        } catch (Exception unused) {
        }
        try {
            sparseArray.put(1, (e64) Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(e64.class).getConstructor(gd1.class).newInstance(k94Var));
        } catch (Exception unused2) {
        }
        try {
            sparseArray.put(2, (e64) Class.forName("androidx.media3.exoplayer.hls.HlsMediaSource$Factory").asSubclass(e64.class).getConstructor(gd1.class).newInstance(k94Var));
        } catch (Exception unused3) {
        }
        try {
            sparseArray.put(3, (e64) Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(e64.class).getConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (Exception unused4) {
        }
        sparseArray.put(4, new x64(k94Var, vc4Var));
        this.f5459b = sparseArray;
        this.f5460c = new int[sparseArray.size()];
        for (int i7 = 0; i7 < this.f5459b.size(); i7++) {
            this.f5460c[i7] = this.f5459b.keyAt(i7);
        }
    }
}
