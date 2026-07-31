package w0;

import android.text.TextUtils;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.SecretKey;
import v0.InterfaceC3464d;

/* loaded from: classes.dex */
public class g implements InterfaceC3464d {

    /* renamed from: a, reason: collision with root package name */
    private SecretKey f46597a;

    /* renamed from: b, reason: collision with root package name */
    private final e f46598b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f46599c = false;

    public g(e eVar) {
        this.f46598b = eVar;
    }

    private void b() {
        try {
            this.f46597a = k.a(this.f46598b);
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e4) {
            Log.e("AGC_LocalResource", "Exception when reading the 'K&I' for 'Config'. error is " + e4.getMessage());
            this.f46597a = null;
        }
        this.f46599c = true;
    }

    @Override // v0.InterfaceC3464d
    public String a(String str, String str2) {
        StringBuilder sb;
        if (!this.f46599c) {
            b();
        }
        if (this.f46597a == null || TextUtils.isEmpty(str)) {
            sb = new StringBuilder();
            sb.append("decrypt exception: secretKey = ");
            sb.append(this.f46597a);
            sb.append("raw = ");
        } else {
            try {
                return new String(k.b(this.f46597a, AbstractC3483a.b(str)), "UTF-8");
            } catch (UnsupportedEncodingException | IllegalArgumentException | GeneralSecurityException e4) {
                sb = new StringBuilder();
                sb.append("decrypt exception:");
                str = e4.getMessage();
            }
        }
        sb.append(str);
        Log.e("AGC_LocalResource", sb.toString());
        return str2;
    }
}
