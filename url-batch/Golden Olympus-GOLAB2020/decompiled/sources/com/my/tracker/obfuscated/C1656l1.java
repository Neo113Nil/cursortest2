package com.my.tracker.obfuscated;

import android.text.TextUtils;
import com.my.tracker.MyTrackerConfig;
import com.my.tracker.obfuscated.AbstractC1686t0;
import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPOutputStream;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* renamed from: com.my.tracker.obfuscated.l1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1656l1 extends AbstractC1686t0 {

    /* renamed from: d, reason: collision with root package name */
    static final MediaType f21410d = MediaType.e("application/octet-stream");

    /* renamed from: a, reason: collision with root package name */
    final AbstractC1686t0.a f21411a;

    /* renamed from: b, reason: collision with root package name */
    final MyTrackerConfig.OkHttpClientProvider f21412b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f21413c;

    C1656l1(AbstractC1686t0.a aVar, MyTrackerConfig.OkHttpClientProvider okHttpClientProvider, boolean z4) {
        this.f21411a = aVar;
        this.f21412b = okHttpClientProvider;
        this.f21413c = z4;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00bd A[Catch: all -> 0x00ae, TryCatch #5 {all -> 0x00ae, blocks: (B:17:0x008a, B:22:0x0097, B:24:0x00bd, B:26:0x00c8, B:27:0x00cc, B:29:0x00d2, B:30:0x00d5, B:34:0x00b3), top: B:16:0x008a }] */
    @Override // com.my.tracker.obfuscated.AbstractC1686t0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC1686t0.b a(String str) {
        ByteArrayOutputStream byteArrayOutputStream;
        GZIPOutputStream gZIPOutputStream;
        int J3;
        AbstractC1686t0.b d4 = AbstractC1686t0.b.d();
        Response response = null;
        try {
            AbstractC1708y2.a("OkHttpPostRequest: send request to " + str);
        } catch (Throwable th) {
            th = th;
        }
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                if (this.f21413c) {
                    AbstractC1708y2.a("OkHttpPostRequest: populating post request body using gzip");
                    gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    try {
                        this.f21411a.a(gZIPOutputStream);
                        gZIPOutputStream.finish();
                    } catch (Throwable th2) {
                        th = th2;
                        if (gZIPOutputStream != null) {
                            gZIPOutputStream.close();
                        }
                        if (byteArrayOutputStream != null) {
                            byteArrayOutputStream.close();
                        }
                        throw th;
                    }
                } else {
                    AbstractC1708y2.a("OkHttpPostRequest: populating post request body without using gzip");
                    this.f21411a.a(byteArrayOutputStream);
                    byteArrayOutputStream.flush();
                    gZIPOutputStream = null;
                }
                Request a4 = new Request.Builder().i(str).d("Content-Encoding", "gzip").g(RequestBody.c(byteArrayOutputStream.toByteArray(), f21410d)).a();
                if (gZIPOutputStream != null) {
                    gZIPOutputStream.close();
                }
                byteArrayOutputStream.close();
                Response response2 = this.f21412b.getOkHttpClient().a(a4).execute();
                try {
                    J3 = response2.J();
                } catch (Throwable th3) {
                    response = response2;
                    th = th3;
                    try {
                        AbstractC1708y2.a("OkHttpPostRequest error: error while sending data", th);
                        d4.f21529a = false;
                        d4.f21531c = "OkHttpPostRequest error: error while sending data";
                        if (response != null) {
                            response2 = response;
                            response2.close();
                        }
                        return d4;
                    } catch (Throwable th4) {
                        if (response != null) {
                            response.close();
                        }
                        throw th4;
                    }
                }
                if (J3 != 200 && J3 != 204) {
                    AbstractC1708y2.a("OkHttpPostRequest error: response code " + J3);
                    d4.f21529a = false;
                    if (J3 == 200) {
                        AbstractC1708y2.a("OkHttpPostRequest: processing server response");
                        ResponseBody m4 = response2.m();
                        String N3 = m4 != null ? m4.N() : null;
                        if (TextUtils.isEmpty(N3)) {
                            AbstractC1708y2.a("OkHttpPostRequest: response data is empty");
                        } else {
                            d4.f21530b = N3;
                        }
                    }
                    response2.close();
                    return d4;
                }
                AbstractC1708y2.a("OkHttpPostRequest: response successfully received");
                d4.f21529a = true;
                if (J3 == 200) {
                }
                response2.close();
                return d4;
            } catch (Throwable th5) {
                th = th5;
                gZIPOutputStream = null;
            }
        } catch (Throwable th6) {
            th = th6;
            byteArrayOutputStream = null;
            gZIPOutputStream = null;
        }
    }
}
