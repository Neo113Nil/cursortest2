package com.my.lib;

import android.util.Base64;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* renamed from: com.my.lib.q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC0425q {
    public static final String a(File file) {
        kotlin.jvm.internal.s.checkNotNullParameter(file, "file");
        try {
            byte[] bArr = new byte[(int) file.length()];
            new FileInputStream(file).read(bArr);
            return Base64.encodeToString(bArr, 0);
        } catch (IOException e8) {
            B.a("encodeFileToBase64: ", e8, 1);
            return null;
        }
    }

    public static final String a(String base64) {
        kotlin.jvm.internal.s.checkNotNullParameter(base64, "base64");
        byte[] decode = Base64.decode(base64, 0);
        kotlin.jvm.internal.s.checkNotNull(decode);
        Charset UTF_8 = StandardCharsets.UTF_8;
        kotlin.jvm.internal.s.checkNotNullExpressionValue(UTF_8, "UTF_8");
        return new String(decode, UTF_8);
    }

    public static final String a(byte[] fileBytes) {
        kotlin.jvm.internal.s.checkNotNullParameter(fileBytes, "fileBytes");
        String encodeToString = Base64.encodeToString(fileBytes, 0);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(encodeToString, "encodeToString(...)");
        return encodeToString;
    }
}
