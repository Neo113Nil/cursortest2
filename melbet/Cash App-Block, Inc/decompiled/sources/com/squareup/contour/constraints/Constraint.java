package com.squareup.contour.constraints;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.contour.ContourLayout;
import com.squareup.contour.errors.CircularReferenceDetected;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public class Constraint {
    public ContourLayout.LayoutSpec container;
    public boolean isResolving;
    public Function1 lambda;
    public int value = PKIFailureInfo.systemUnavail;
    public int mode = 1;

    public final int resolve() {
        if (this.value == Integer.MIN_VALUE) {
            ContourLayout.LayoutSpec layoutSpec = this.container;
            if (layoutSpec == null) {
                a$$ExternalSyntheticBUOutline0.m$1("Constraint called before LayoutContainer attached");
                return 0;
            }
            Function1 function1 = this.lambda;
            if (function1 == null) {
                a$$ExternalSyntheticBUOutline0.m$1("Constraint not set");
                return 0;
            }
            try {
                if (this.isResolving) {
                    throw new CircularReferenceDetected();
                }
                this.isResolving = true;
                this.value = ((Number) function1.invoke(layoutSpec)).intValue();
            } finally {
                this.isResolving = false;
            }
        }
        return this.value;
    }

    public final void setMode(int i) {
        CameraSelector$$ExternalSyntheticOutline0.checkNotZero(i);
        this.mode = i;
    }
}
