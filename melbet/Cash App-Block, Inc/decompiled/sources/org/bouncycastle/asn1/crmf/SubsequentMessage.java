package org.bouncycastle.asn1.crmf;

import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import org.bouncycastle.asn1.ASN1Integer;

/* loaded from: classes9.dex */
public class SubsequentMessage extends ASN1Integer {
    public static final SubsequentMessage encrCert = new SubsequentMessage(0);
    public static final SubsequentMessage challengeResp = new SubsequentMessage(1);

    private SubsequentMessage(int i) {
        super(i);
    }

    public static SubsequentMessage valueOf(int i) {
        if (i == 0) {
            return encrCert;
        }
        if (i == 1) {
            return challengeResp;
        }
        a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "unknown value: "));
        return null;
    }
}
