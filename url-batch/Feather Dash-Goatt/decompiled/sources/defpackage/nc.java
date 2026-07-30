package defpackage;

import android.window.BackEvent;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class nc {
    public final float a;
    public final float b;
    public final float c;
    public final int d;

    public nc(BackEvent backEvent) {
        backEvent.getClass();
        e8 e8Var = e8.a;
        float d = e8Var.d(backEvent);
        float e = e8Var.e(backEvent);
        float b = e8Var.b(backEvent);
        int c = e8Var.c(backEvent);
        this.a = d;
        this.b = e;
        this.c = b;
        this.d = c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackEventCompat{touchX=");
        sb.append(this.a);
        sb.append(", touchY=");
        sb.append(this.b);
        sb.append(", progress=");
        sb.append(this.c);
        sb.append(", swipeEdge=");
        return qy0.m(sb, this.d, '}');
    }
}
