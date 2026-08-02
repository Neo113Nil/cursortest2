package org.bouncycastle.cms.bc;

import bo.app.a$$ExternalSyntheticBUOutline0;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.operator.GenericKey;

/* loaded from: classes9.dex */
class CMSUtils {
    public static CipherParameters getBcKey(GenericKey genericKey) {
        if (genericKey.getRepresentation() instanceof CipherParameters) {
            return (CipherParameters) genericKey.getRepresentation();
        }
        if (genericKey.getRepresentation() instanceof byte[]) {
            return new KeyParameter((byte[]) genericKey.getRepresentation());
        }
        a$$ExternalSyntheticBUOutline0.m$3("unknown generic key type");
        return null;
    }
}
