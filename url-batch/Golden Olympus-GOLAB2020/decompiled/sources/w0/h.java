package w0;

import android.content.Context;
import android.util.Log;
import com.ironsource.b9;
import v0.InterfaceC3462b;
import v0.InterfaceC3464d;

/* loaded from: classes.dex */
public class h implements InterfaceC3462b {

    /* renamed from: a, reason: collision with root package name */
    private final Context f46600a;

    /* renamed from: b, reason: collision with root package name */
    private final String f46601b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC3464d f46602c;

    public h(Context context, String str) {
        Log.d("AGC_FixedDecrypt", b9.a.f15292f);
        this.f46600a = context;
        this.f46601b = str;
    }

    @Override // v0.InterfaceC3462b
    public String a(String str, String str2) {
        if (this.f46602c == null) {
            this.f46602c = b();
        }
        return this.f46602c.a(m.b(this.f46600a, this.f46601b, "agc_", str), str2);
    }

    public InterfaceC3464d b() {
        return new g(new e(m.b(this.f46600a, this.f46601b, "agc_", "/AD91D45E3E72DB6989DDCB13287E75061FABCB933D886E6C6ABEF0939B577138"), m.b(this.f46600a, this.f46601b, "agc_", "/B314B3BF013DF5AC4134E880AF3D2B7C9FFBE8F0305EAC1C898145E2BCF1F21C"), m.b(this.f46600a, this.f46601b, "agc_", "/C767BD8FDF53E53D059BE95B09E2A71056F5F180AECC62836B287ACA5793421B"), m.b(this.f46600a, this.f46601b, "agc_", "/DCB3E6D4C2CF80F30D89CDBC412C964DA8381BB84668769391FBCC3E329AD0FD"), "PBKDF2WithHmacSHA1", 5000));
    }
}
