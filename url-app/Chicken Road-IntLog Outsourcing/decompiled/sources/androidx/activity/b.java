package androidx.activity;

import android.window.BackEvent;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final float f4042a;

    /* renamed from: b, reason: collision with root package name */
    public final float f4043b;

    /* renamed from: c, reason: collision with root package name */
    public final float f4044c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4045d;

    public b(BackEvent backEvent) {
        kotlin.jvm.internal.i.e(backEvent, "backEvent");
        a aVar = a.f4041a;
        float d6 = aVar.d(backEvent);
        float e3 = aVar.e(backEvent);
        float b6 = aVar.b(backEvent);
        int c2 = aVar.c(backEvent);
        this.f4042a = d6;
        this.f4043b = e3;
        this.f4044c = b6;
        this.f4045d = c2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackEventCompat{touchX=");
        sb.append(this.f4042a);
        sb.append(", touchY=");
        sb.append(this.f4043b);
        sb.append(", progress=");
        sb.append(this.f4044c);
        sb.append(", swipeEdge=");
        return B0.o.k(sb, this.f4045d, '}');
    }
}
