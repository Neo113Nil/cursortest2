package b;

import H2.AbstractC0080b;
import android.window.BackEvent;

/* renamed from: b.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0242b {

    /* renamed from: a, reason: collision with root package name */
    public final float f4146a;

    /* renamed from: b, reason: collision with root package name */
    public final float f4147b;

    /* renamed from: c, reason: collision with root package name */
    public final float f4148c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4149d;

    public C0242b(BackEvent backEvent) {
        Z1.i.f(backEvent, "backEvent");
        C0241a c0241a = C0241a.f4145a;
        float d3 = c0241a.d(backEvent);
        float e3 = c0241a.e(backEvent);
        float b2 = c0241a.b(backEvent);
        int c3 = c0241a.c(backEvent);
        this.f4146a = d3;
        this.f4147b = e3;
        this.f4148c = b2;
        this.f4149d = c3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackEventCompat{touchX=");
        sb.append(this.f4146a);
        sb.append(", touchY=");
        sb.append(this.f4147b);
        sb.append(", progress=");
        sb.append(this.f4148c);
        sb.append(", swipeEdge=");
        return AbstractC0080b.k(sb, this.f4149d, '}');
    }
}
