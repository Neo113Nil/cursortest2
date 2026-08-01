package Q;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f861a;

    /* renamed from: b, reason: collision with root package name */
    public int f862b;

    /* renamed from: c, reason: collision with root package name */
    public float f863c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public long f864e;

    /* renamed from: f, reason: collision with root package name */
    public long f865f;

    /* renamed from: g, reason: collision with root package name */
    public long f866g;
    public float h;
    public int i;

    public final float a(long j2) {
        if (j2 < this.f864e) {
            return RecyclerView.f1937A0;
        }
        long j3 = this.f866g;
        if (j3 < 0 || j2 < j3) {
            return g.b((j2 - r0) / this.f861a, RecyclerView.f1937A0, 1.0f) * 0.5f;
        }
        float f2 = this.h;
        return (g.b((j2 - j3) / this.i, RecyclerView.f1937A0, 1.0f) * f2) + (1.0f - f2);
    }
}
