package com.my.tracker.obfuscated;

import android.text.TextUtils;
import com.my.tracker.MyTrackerConfig;
import com.my.tracker.obfuscated.AbstractC1686t0;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* renamed from: com.my.tracker.obfuscated.k1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1652k1 extends AbstractC1686t0 {

    /* renamed from: a, reason: collision with root package name */
    final MyTrackerConfig.OkHttpClientProvider f21400a;

    C1652k1(MyTrackerConfig.OkHttpClientProvider okHttpClientProvider) {
        this.f21400a = okHttpClientProvider;
    }

    @Override // com.my.tracker.obfuscated.AbstractC1686t0
    public AbstractC1686t0.b a(String str) {
        Throwable th;
        Response response;
        AbstractC1686t0.b d4 = AbstractC1686t0.b.d();
        try {
            AbstractC1708y2.a("OkHttpGetRequest: send request to " + str);
            response = this.f21400a.getOkHttpClient().a(new Request.Builder().i(str).c().a()).execute();
        } catch (Throwable th2) {
            th = th2;
            response = null;
        }
        try {
            int J3 = response.J();
            if (J3 == 200) {
                AbstractC1708y2.a("OkHttpGetRequest: response successfully received");
                d4.f21529a = true;
            } else {
                AbstractC1708y2.a("OkHttpGetRequest error: response code " + J3);
                d4.f21529a = false;
            }
            if (J3 == 200) {
                AbstractC1708y2.a("OkHttpGetRequest: processing server response");
                ResponseBody m4 = response.m();
                String N3 = m4 != null ? m4.N() : null;
                if (TextUtils.isEmpty(N3)) {
                    AbstractC1708y2.a("OkHttpGetRequest: response data is empty");
                } else {
                    d4.f21530b = N3;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            try {
                AbstractC1708y2.a("OkHttpGetRequest error: error while sending data", th);
                d4.f21529a = false;
                d4.f21531c = "OkHttpGetRequest error: error while sending data";
            } finally {
                if (response != null) {
                    response.close();
                }
            }
        }
        return d4;
    }
}
