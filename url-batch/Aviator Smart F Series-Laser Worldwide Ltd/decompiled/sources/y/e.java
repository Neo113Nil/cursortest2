package y;

import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.s;
import kotlin.text.t;

/* loaded from: classes.dex */
public abstract class e {
    public static final String a(String str) {
        String decodeToString;
        s.checkNotNullParameter(str, "<this>");
        Charset UTF_8 = StandardCharsets.UTF_8;
        s.checkNotNullExpressionValue(UTF_8, "UTF_8");
        byte[] bytes = "mltcloud@1234566".getBytes(UTF_8);
        s.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        SecretKeySpec secretKeySpec = new SecretKeySpec(bytes, "AES");
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(2, secretKeySpec);
        byte[] doFinal = cipher.doFinal(Base64.decode(str, 2));
        s.checkNotNullExpressionValue(doFinal, "cipher.doFinal(result)");
        decodeToString = t.decodeToString(doFinal);
        return decodeToString;
    }

    public static final byte[] a(InputStream inputStream) {
        s.checkNotNullParameter(inputStream, "<this>");
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                s.checkNotNullExpressionValue(byteArray, "byteArrayOutputStream.toByteArray()");
                return byteArray;
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }
}
