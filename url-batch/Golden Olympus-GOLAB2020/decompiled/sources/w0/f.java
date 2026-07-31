package w0;

import android.text.TextUtils;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.SecretKey;
import v0.InterfaceC3463c;
import v0.InterfaceC3464d;

/* loaded from: classes.dex */
public class f implements InterfaceC3464d {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3463c f46594a;

    /* renamed from: b, reason: collision with root package name */
    private SecretKey f46595b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f46596c = false;

    public f(InterfaceC3463c interfaceC3463c) {
        this.f46594a = interfaceC3463c;
    }

    private void b() {
        try {
            this.f46595b = k.a(new e(this.f46594a.getString("/code/code1", null), this.f46594a.getString("/code/code2", null), this.f46594a.getString("/code/code3", null), this.f46594a.getString("/code/code4", null), "PBKDF2WithHmacSHA1", 10000));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException unused) {
            Log.e("AGC_Mark", "Exception when reading the 'K&I' for 'Config'.");
            this.f46595b = null;
        }
        this.f46596c = true;
    }

    public static boolean c(String str) {
        return !TextUtils.isEmpty(str) && Pattern.matches("^\\[!([A-Fa-f0-9]*)]", str);
    }

    private String d(String str) {
        try {
            Matcher matcher = Pattern.compile("^\\[!([A-Fa-f0-9]*)]").matcher(str);
            return matcher.find() ? matcher.group(1) : "";
        } catch (IllegalStateException | IndexOutOfBoundsException unused) {
            Log.e("AGC_Mark", "getRawString exception");
            return "";
        }
    }

    @Override // v0.InterfaceC3464d
    public String a(String str, String str2) {
        String str3;
        if (!this.f46596c) {
            b();
        }
        if (this.f46595b == null) {
            str3 = "mKey is null, return default value";
        } else {
            if (!c(str)) {
                return str2;
            }
            try {
                return new String(k.b(this.f46595b, AbstractC3483a.b(d(str))), "UTF-8");
            } catch (UnsupportedEncodingException | IllegalArgumentException | GeneralSecurityException unused) {
                str3 = "UnsupportedEncodingException||GeneralSecurityException||IllegalArgumentException";
            }
        }
        Log.e("AGC_Mark", str3);
        return str2;
    }
}
