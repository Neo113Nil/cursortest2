package org.bouncycastle.pqc.crypto.lms;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.util.Encodable;

/* loaded from: classes10.dex */
public abstract class LMSKeyParameters extends AsymmetricKeyParameter implements Encodable {
    public LMSKeyParameters(boolean z) {
        super(z);
    }

    public abstract byte[] getEncoded();
}
