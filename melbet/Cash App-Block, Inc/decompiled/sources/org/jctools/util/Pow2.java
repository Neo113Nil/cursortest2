package org.jctools.util;

import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes10.dex */
public abstract class Pow2 {
    public static int roundToPowerOfTwo(int i) {
        if (i > 1073741824) {
            a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "There is no larger power of 2 int for value:", " since it exceeds 2^31."));
            return 0;
        }
        if (i >= 0) {
            return 1 << (32 - Integer.numberOfLeadingZeros(i - 1));
        }
        a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Given value:", ". Expecting value >= 0."));
        return 0;
    }
}
