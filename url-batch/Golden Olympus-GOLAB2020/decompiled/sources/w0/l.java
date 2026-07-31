package w0;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.cc;
import java.io.UnsupportedEncodingException;
import v0.InterfaceC3462b;

/* loaded from: classes.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3462b f46607a;

    public l(Context context, String str) {
        this.f46607a = (TextUtils.isEmpty(a(context, str)) || Build.VERSION.SDK_INT < 26) ? new h(context, str) : new i(context, str);
    }

    private String a(Context context, String str) {
        String b4 = m.b(context, str, "agc_plugin_", "crypto");
        if (b4 == null) {
            return null;
        }
        try {
            return new String(AbstractC3483a.b(b4), cc.f15721N);
        } catch (UnsupportedEncodingException | IllegalArgumentException e4) {
            Log.e("ReaderStrategy", "UnsupportedEncodingException" + e4.getMessage());
            return null;
        }
    }

    public String b(String str, String str2) {
        return this.f46607a.a(str, str2);
    }
}
