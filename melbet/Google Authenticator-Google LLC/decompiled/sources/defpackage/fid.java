package defpackage;

import android.graphics.Matrix;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class fid extends fev {
    final /* synthetic */ fif a;

    public fid(fif fifVar) {
        this.a = fifVar;
    }

    @Override // defpackage.fev
    /* renamed from: a */
    public final Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
        this.a.y = f;
        return super.evaluate(f, matrix, matrix2);
    }

    @Override // defpackage.fev, android.animation.TypeEvaluator
    public final /* bridge */ /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        return evaluate(f, (Matrix) obj, (Matrix) obj2);
    }
}
