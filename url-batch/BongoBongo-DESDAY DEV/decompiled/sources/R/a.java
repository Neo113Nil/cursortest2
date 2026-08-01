package R;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f764a;

    /* renamed from: b, reason: collision with root package name */
    public int f765b;

    /* renamed from: c, reason: collision with root package name */
    public float f766c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public long f767e;

    /* renamed from: f, reason: collision with root package name */
    public long f768f;

    /* renamed from: g, reason: collision with root package name */
    public long f769g;

    /* renamed from: h, reason: collision with root package name */
    public float f770h;
    public int i;

    public final float a(long j2) {
        if (j2 < this.f767e) {
            return RecyclerView.A0;
        }
        long j3 = this.f769g;
        if (j3 < 0 || j2 < j3) {
            return g.b((j2 - r0) / this.f764a, RecyclerView.A0, 1.0f) * 0.5f;
        }
        float f2 = this.f770h;
        return (g.b((j2 - j3) / this.i, RecyclerView.A0, 1.0f) * f2) + (1.0f - f2);
    }
}
