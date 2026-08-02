package org.bouncycastle.operator.jcajce;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.security.Key;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.operator.GenericKey;

/* loaded from: classes9.dex */
class OperatorUtils {
    public static Key getJceKey(GenericKey genericKey) {
        if (genericKey.getRepresentation() instanceof Key) {
            return (Key) genericKey.getRepresentation();
        }
        if (genericKey.getRepresentation() instanceof byte[]) {
            return new SecretKeySpec((byte[]) genericKey.getRepresentation(), "ENC");
        }
        a$$ExternalSyntheticBUOutline0.m$3("unknown generic key type");
        return null;
    }
}
