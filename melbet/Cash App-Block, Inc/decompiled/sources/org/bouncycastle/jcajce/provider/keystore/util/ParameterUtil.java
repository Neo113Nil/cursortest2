package org.bouncycastle.jcajce.provider.keystore.util;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.security.KeyStore;
import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.PasswordCallback;
import javax.security.auth.callback.UnsupportedCallbackException;

/* loaded from: classes9.dex */
public class ParameterUtil {
    public static char[] extractPassword(KeyStore.LoadStoreParameter loadStoreParameter) {
        KeyStore.ProtectionParameter protectionParameter = loadStoreParameter.getProtectionParameter();
        if (protectionParameter == null) {
            return null;
        }
        if (protectionParameter instanceof KeyStore.PasswordProtection) {
            return ((KeyStore.PasswordProtection) protectionParameter).getPassword();
        }
        if (!(protectionParameter instanceof KeyStore.CallbackHandlerProtection)) {
            a$$ExternalSyntheticBUOutline0.m$3("no support for protection parameter of type ".concat(protectionParameter.getClass().getName()));
            return null;
        }
        CallbackHandler callbackHandler = ((KeyStore.CallbackHandlerProtection) protectionParameter).getCallbackHandler();
        PasswordCallback passwordCallback = new PasswordCallback("password: ", false);
        try {
            callbackHandler.handle(new Callback[]{passwordCallback});
            return passwordCallback.getPassword();
        } catch (UnsupportedCallbackException e) {
            throw new IllegalArgumentException("PasswordCallback not recognised: " + e.getMessage(), e);
        }
    }
}
