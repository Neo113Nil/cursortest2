package defpackage;

import android.graphics.Insets;
import android.view.WindowInsetsAnimation;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yx {
    public final vb a;
    public final vb b;

    public yx(WindowInsetsAnimation.Bounds bounds) {
        Insets lowerBound;
        Insets upperBound;
        lowerBound = bounds.getLowerBound();
        this.a = vb.e(lowerBound);
        upperBound = bounds.getUpperBound();
        this.b = vb.e(upperBound);
    }

    public final String toString() {
        return "Bounds{lower=" + this.a + " upper=" + this.b + "}";
    }

    public yx(vb vbVar, vb vbVar2) {
        this.a = vbVar;
        this.b = vbVar2;
    }
}
