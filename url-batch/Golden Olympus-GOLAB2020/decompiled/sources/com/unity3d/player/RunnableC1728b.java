package com.unity3d.player;

import java.util.Iterator;
import java.util.Set;

/* renamed from: com.unity3d.player.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC1728b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final Set f22137a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22138b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22139c;

    /* renamed from: d, reason: collision with root package name */
    public final long f22140d;

    /* renamed from: e, reason: collision with root package name */
    public final long f22141e;

    /* renamed from: f, reason: collision with root package name */
    public final int f22142f;

    /* renamed from: g, reason: collision with root package name */
    public final int f22143g;

    public RunnableC1728b(Set set, String str, int i4, long j4, long j5, int i5, int i6) {
        this.f22137a = set;
        this.f22138b = str;
        this.f22139c = i4;
        this.f22140d = j4;
        this.f22141e = j5;
        this.f22142f = i5;
        this.f22143g = i6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.f22137a.iterator();
        while (it.hasNext()) {
            ((IAssetPackManagerDownloadStatusCallback) it.next()).onStatusUpdate(this.f22138b, this.f22139c, this.f22140d, this.f22141e, this.f22142f, this.f22143g);
        }
    }
}
