package b;

import A.AbstractC0017m;
import android.window.BackEvent;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: b.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0487b {

    /* renamed from: a, reason: collision with root package name */
    public final float f5529a;

    /* renamed from: b, reason: collision with root package name */
    public final float f5530b;

    /* renamed from: c, reason: collision with root package name */
    public final float f5531c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5532d;

    public C0487b(BackEvent backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        C0486a c0486a = C0486a.f5528a;
        float d4 = c0486a.d(backEvent);
        float e4 = c0486a.e(backEvent);
        float b4 = c0486a.b(backEvent);
        int c4 = c0486a.c(backEvent);
        this.f5529a = d4;
        this.f5530b = e4;
        this.f5531c = b4;
        this.f5532d = c4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackEventCompat{touchX=");
        sb.append(this.f5529a);
        sb.append(", touchY=");
        sb.append(this.f5530b);
        sb.append(", progress=");
        sb.append(this.f5531c);
        sb.append(", swipeEdge=");
        return AbstractC0017m.l(sb, this.f5532d, '}');
    }
}
