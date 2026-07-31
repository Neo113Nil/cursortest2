package com.unity3d.player;

/* renamed from: com.unity3d.player.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC1743g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final IAssetPackManagerStatusQueryCallback f22170a;

    /* renamed from: b, reason: collision with root package name */
    public final long f22171b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f22172c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f22173d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f22174e;

    public RunnableC1743g(IAssetPackManagerStatusQueryCallback iAssetPackManagerStatusQueryCallback, long j4, String[] strArr, int[] iArr, int[] iArr2) {
        this.f22170a = iAssetPackManagerStatusQueryCallback;
        this.f22171b = j4;
        this.f22172c = strArr;
        this.f22173d = iArr;
        this.f22174e = iArr2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f22170a.onStatusResult(this.f22171b, this.f22172c, this.f22173d, this.f22174e);
    }
}
