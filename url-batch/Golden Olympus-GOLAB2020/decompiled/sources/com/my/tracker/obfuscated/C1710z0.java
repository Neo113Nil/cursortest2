package com.my.tracker.obfuscated;

import android.text.TextUtils;
import com.my.tracker.MyTrackerConfig;
import com.my.tracker.obfuscated.AbstractC1686t0;
import java.net.InetAddress;
import org.json.JSONObject;

/* renamed from: com.my.tracker.obfuscated.z0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1710z0 {

    /* renamed from: a, reason: collision with root package name */
    boolean f21584a = false;

    /* renamed from: b, reason: collision with root package name */
    private C1706y0 f21585b = null;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void b(String str, MyTrackerConfig.OkHttpClientProvider okHttpClientProvider) {
        String str2;
        AbstractC1708y2.a("Ipv4DataProvider: get IPv4 address");
        try {
            AbstractC1686t0.b a4 = AbstractC1686t0.a(okHttpClientProvider).a(str);
            if (a4.c()) {
                String str3 = (String) a4.b();
                if (TextUtils.isEmpty(str3)) {
                    str2 = "Ipv4DataProvider: empty response from server";
                } else {
                    String optString = new JSONObject(str3).optString("ip");
                    if (!TextUtils.isEmpty(optString)) {
                        AbstractC1708y2.a("Ipv4DataProvider: IPv4 address is received " + optString);
                        this.f21585b = new C1706y0(InetAddress.getByName(optString).getAddress());
                        return;
                    }
                    str2 = "Ipv4DataProvider: IP is empty";
                }
            } else {
                str2 = "Ipv4DataProvider: unsuccessful response from server: " + a4.a();
            }
            AbstractC1708y2.a(str2);
        } catch (Throwable th) {
            AbstractC1708y2.b("Ipv4DataProvider: failed to get IPv4 address", th);
        }
    }

    public C1706y0 a(final String str, final MyTrackerConfig.OkHttpClientProvider okHttpClientProvider) {
        if (!this.f21584a) {
            this.f21584a = true;
            AbstractC1658m.b(new Runnable() { // from class: com.my.tracker.obfuscated.D3
                @Override // java.lang.Runnable
                public final void run() {
                    C1710z0.this.b(str, okHttpClientProvider);
                }
            });
        }
        return this.f21585b;
    }
}
