package org.bouncycastle.its;

import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import org.bouncycastle.oer.its.ieee1609dot2.PKRecipientInfo;
import org.bouncycastle.oer.its.ieee1609dot2.RecipientInfo;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.HashedId8;

/* loaded from: classes9.dex */
public class ETSIRecipientInfoBuilder {
    private final ETSIKeyWrapper keyWrapper;
    private final byte[] recipientID;

    public ETSIRecipientInfoBuilder(ETSIKeyWrapper eTSIKeyWrapper, byte[] bArr) {
        this.keyWrapper = eTSIKeyWrapper;
        this.recipientID = bArr;
    }

    public RecipientInfo build(byte[] bArr) {
        try {
            return RecipientInfo.certRecipInfo(PKRecipientInfo.builder().setRecipientId(new HashedId8(this.recipientID)).setEncKey(this.keyWrapper.wrap(bArr)).createPKRecipientInfo());
        } catch (Exception e) {
            OptionalProvider$$ExternalSyntheticLambda0.m(e.getMessage(), (Throwable) e);
            return null;
        }
    }
}
