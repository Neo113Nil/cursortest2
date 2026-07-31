package androidx.compose.ui.input.pointer.util;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VelocityTracker.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/input/pointer/util/PolynomialFit;", "", "", "", "coefficients", "confidence", "<init>", "(Ljava/util/List;F)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getCoefficients", "()Ljava/util/List;", "F", "getConfidence", "()F", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PolynomialFit {
    private final List coefficients;
    private final float confidence;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PolynomialFit)) {
            return false;
        }
        PolynomialFit polynomialFit = (PolynomialFit) other;
        return Intrinsics.areEqual(this.coefficients, polynomialFit.coefficients) && Intrinsics.areEqual((Object) Float.valueOf(this.confidence), (Object) Float.valueOf(polynomialFit.confidence));
    }

    public int hashCode() {
        return (this.coefficients.hashCode() * 31) + Float.hashCode(this.confidence);
    }

    public String toString() {
        return "PolynomialFit(coefficients=" + this.coefficients + ", confidence=" + this.confidence + ')';
    }

    public PolynomialFit(List coefficients, float f) {
        Intrinsics.checkNotNullParameter(coefficients, "coefficients");
        this.coefficients = coefficients;
        this.confidence = f;
    }

    public final List getCoefficients() {
        return this.coefficients;
    }

    public final float getConfidence() {
        return this.confidence;
    }
}
