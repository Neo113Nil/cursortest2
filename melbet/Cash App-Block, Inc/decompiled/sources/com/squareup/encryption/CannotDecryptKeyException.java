package com.squareup.encryption;

import java.security.GeneralSecurityException;
import javax.crypto.BadPaddingException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/encryption/CannotDecryptKeyException;", "Ljava/security/GeneralSecurityException;", "encryption_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes5.dex */
public final class CannotDecryptKeyException extends GeneralSecurityException {
    public CannotDecryptKeyException(String str, BadPaddingException badPaddingException) {
        super(str, badPaddingException);
    }
}
