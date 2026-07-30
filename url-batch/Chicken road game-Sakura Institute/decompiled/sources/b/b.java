package b;

import android.window.BackEvent;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final float f1134a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1135b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1136c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1137d;

    public b(BackEvent backEvent) {
        a aVar = a.f1131a;
        float d8 = aVar.d(backEvent);
        float e9 = aVar.e(backEvent);
        float b9 = aVar.b(backEvent);
        int c4 = aVar.c(backEvent);
        this.f1134a = d8;
        this.f1135b = e9;
        this.f1136c = b9;
        this.f1137d = c4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackEventCompat{touchX=");
        sb.append(this.f1134a);
        sb.append(", touchY=");
        sb.append(this.f1135b);
        sb.append(", progress=");
        sb.append(this.f1136c);
        sb.append(", swipeEdge=");
        return a0.m.l(sb, this.f1137d, '}');
    }
}
