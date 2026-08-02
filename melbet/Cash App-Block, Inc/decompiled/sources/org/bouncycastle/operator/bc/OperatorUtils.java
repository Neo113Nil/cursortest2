package org.bouncycastle.operator.bc;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.security.Key;
import org.bouncycastle.operator.GenericKey;

/* loaded from: classes9.dex */
class OperatorUtils {
    public static byte[] getKeyBytes(GenericKey genericKey) {
        if (genericKey.getRepresentation() instanceof Key) {
            return ((Key) genericKey.getRepresentation()).getEncoded();
        }
        if (genericKey.getRepresentation() instanceof byte[]) {
            return (byte[]) genericKey.getRepresentation();
        }
        a$$ExternalSyntheticBUOutline0.m$3("unknown generic key type");
        return null;
    }
}
