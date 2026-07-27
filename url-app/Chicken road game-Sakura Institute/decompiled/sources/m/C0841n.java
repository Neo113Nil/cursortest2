package m;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

/* renamed from: m.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0841n {

    /* renamed from: a, reason: collision with root package name */
    public static final C0841n f8146a = new C0841n();

    public final EdgeEffect a(Context context, AttributeSet attributeSet) {
        try {
            return new EdgeEffect(context, attributeSet);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    public final float b(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    public final float c(EdgeEffect edgeEffect, float f4, float f5) {
        try {
            return edgeEffect.onPullDistance(f4, f5);
        } catch (Throwable unused) {
            edgeEffect.onPull(f4, f5);
            return 0.0f;
        }
    }
}
