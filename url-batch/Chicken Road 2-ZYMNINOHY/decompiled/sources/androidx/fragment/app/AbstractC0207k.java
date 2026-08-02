package androidx.fragment.app;

import E.AbstractC0005f;
import android.view.View;

/* renamed from: androidx.fragment.app.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0207k {

    /* renamed from: a, reason: collision with root package name */
    public final B0 f4893a;

    public AbstractC0207k(B0 operation) {
        kotlin.jvm.internal.i.e(operation, "operation");
        this.f4893a = operation;
    }

    public final boolean a() {
        int i4;
        B0 b02 = this.f4893a;
        View view = b02.f4725c.mView;
        if (view != null) {
            i4 = 4;
            if (view.getAlpha() != 0.0f || view.getVisibility() != 0) {
                int visibility = view.getVisibility();
                if (visibility == 0) {
                    i4 = 2;
                } else if (visibility != 4) {
                    if (visibility != 8) {
                        throw new IllegalArgumentException(AbstractC0005f.j(visibility, "Unknown visibility "));
                    }
                    i4 = 3;
                }
            }
        } else {
            i4 = 0;
        }
        int i5 = b02.f4723a;
        if (i4 != i5) {
            return (i4 == 2 || i5 == 2) ? false : true;
        }
        return true;
    }
}
