package org.bouncycastle.math.ec;

/* loaded from: classes5.dex */
class u implements q {
    static final String PRECOMP_NAME = "bc_validity";
    private boolean failed = false;
    private boolean curveEquationPassed = false;
    private boolean orderPassed = false;

    u() {
    }

    boolean hasCurveEquationPassed() {
        return this.curveEquationPassed;
    }

    boolean hasFailed() {
        return this.failed;
    }

    boolean hasOrderPassed() {
        return this.orderPassed;
    }

    void reportCurveEquationPassed() {
        this.curveEquationPassed = true;
    }

    void reportFailed() {
        this.failed = true;
    }

    void reportOrderPassed() {
        this.orderPassed = true;
    }
}
