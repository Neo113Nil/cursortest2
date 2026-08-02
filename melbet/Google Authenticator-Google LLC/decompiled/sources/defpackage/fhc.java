package defpackage;

import android.animation.TypeEvaluator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fhc implements TypeEvaluator {
    public static final TypeEvaluator a = new fhc();
    private final fhf b = new fhf();

    @Override // android.animation.TypeEvaluator
    public final /* bridge */ /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        fhf fhfVar = (fhf) obj;
        fhf fhfVar2 = (fhf) obj2;
        float f2 = 1.0f - f;
        float f3 = fhfVar.a * f2;
        float f4 = fhfVar2.a * f;
        float f5 = fhfVar.b * f2;
        float f6 = fhfVar2.b * f;
        float f7 = fhfVar.c;
        float f8 = f * fhfVar2.c;
        fhf fhfVar3 = this.b;
        fhfVar3.a = f3 + f4;
        fhfVar3.b = f5 + f6;
        fhfVar3.c = (f2 * f7) + f8;
        return fhfVar3;
    }
}
