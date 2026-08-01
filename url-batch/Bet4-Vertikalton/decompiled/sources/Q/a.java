package Q;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f720a;

    /* renamed from: b, reason: collision with root package name */
    public int f721b;

    /* renamed from: c, reason: collision with root package name */
    public float f722c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public long f723e;

    /* renamed from: f, reason: collision with root package name */
    public long f724f;

    /* renamed from: g, reason: collision with root package name */
    public long f725g;
    public float h;
    public int i;

    public final float a(long j2) {
        if (j2 < this.f723e) {
            return RecyclerView.f1530C0;
        }
        long j3 = this.f725g;
        if (j3 < 0 || j2 < j3) {
            return g.b((j2 - r0) / this.f720a, RecyclerView.f1530C0, 1.0f) * 0.5f;
        }
        float f2 = this.h;
        return (g.b((j2 - j3) / this.i, RecyclerView.f1530C0, 1.0f) * f2) + (1.0f - f2);
    }
}
