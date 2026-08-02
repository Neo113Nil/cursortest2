package org.bouncycastle.cms;

/* loaded from: classes9.dex */
public interface SignerInformationVerifierProvider {
    SignerInformationVerifier get(SignerId signerId);
}
