package defpackage;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fjn implements TypeEvaluator {
    private final Rect a;

    public fjn(Rect rect) {
        this.a = rect;
    }

    @Override // android.animation.TypeEvaluator
    public final /* bridge */ /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        Rect rect = (Rect) obj;
        Rect rect2 = (Rect) obj2;
        int i = rect.left + ((int) ((rect2.left - rect.left) * f));
        int i2 = rect.top + ((int) ((rect2.top - rect.top) * f));
        int i3 = rect.right + ((int) ((rect2.right - rect.right) * f));
        int i4 = rect.bottom + ((int) ((rect2.bottom - rect.bottom) * f));
        Rect rect3 = this.a;
        rect3.set(i, i2, i3, i4);
        return rect3;
    }
}
