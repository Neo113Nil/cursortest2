package com.squareup.encryption;

import android.content.SharedPreferences;
import com.google.crypto.tink.proto.Keyset;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.subtle.Hex;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import java.security.GeneralSecurityException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes.dex */
public final class DecryptingKeysetReader {
    public final String password;
    public final SharedPreferences sharedPreferences;

    public DecryptingKeysetReader(SharedPreferences sharedPreferences, String str, int i) {
        str.getClass();
        switch (i) {
            case 1:
                this.sharedPreferences = sharedPreferences;
                this.password = str;
                break;
            default:
                this.sharedPreferences = sharedPreferences;
                this.password = str;
                break;
        }
    }

    public Keyset read() {
        Cipher cipher = Cipher.getInstance("Blowfish");
        String str = this.password;
        str.getClass();
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        bytes.getClass();
        cipher.init(2, new SecretKeySpec(bytes, "Blowfish"));
        String string2 = this.sharedPreferences.getString("device_key", null);
        if (string2 == null || string2.length() == 0) {
            OptionalProvider$$ExternalSyntheticLambda0.m(Intrinsics.stringPlus("device_key", "no element "));
            return null;
        }
        byte[] decode = Hex.decode(string2);
        try {
            try {
                Keyset parseFrom = Keyset.parseFrom(cipher.doFinal(decode));
                parseFrom.getClass();
                return parseFrom;
            } catch (InvalidProtocolBufferException e) {
                throw new GeneralSecurityException("decrypted data is bogus, can't parse keyset", e);
            }
        } catch (BadPaddingException e2) {
            throw new CannotDecryptKeyException("Encoded size: " + string2.length() + " | Decoded size: " + decode.length + " | Password size: " + str.length(), e2);
        }
    }
}
