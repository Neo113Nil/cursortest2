package io.appmetrica.analytics.networktasks.internal;

import io.appmetrica.analytics.coreapi.internal.io.Compressor;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import io.appmetrica.analytics.networktasks.internal.DefaultResponseParser;
import java.io.IOException;

/* loaded from: classes.dex */
public class SendingDataTaskHelper {

    /* renamed from: a, reason: collision with root package name */
    private final RequestBodyEncrypter f13343a;

    /* renamed from: b, reason: collision with root package name */
    private final Compressor f13344b;

    /* renamed from: c, reason: collision with root package name */
    private final TimeProvider f13345c;

    /* renamed from: d, reason: collision with root package name */
    private final RequestDataHolder f13346d;

    /* renamed from: e, reason: collision with root package name */
    private final ResponseDataHolder f13347e;

    /* renamed from: f, reason: collision with root package name */
    private final NetworkResponseHandler f13348f;

    public SendingDataTaskHelper(RequestBodyEncrypter requestBodyEncrypter, Compressor compressor, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, NetworkResponseHandler<DefaultResponseParser.Response> networkResponseHandler) {
        this(requestBodyEncrypter, compressor, new SystemTimeProvider(), requestDataHolder, responseDataHolder, networkResponseHandler);
    }

    public boolean isResponseValid() {
        DefaultResponseParser.Response response = (DefaultResponseParser.Response) this.f13348f.handle(this.f13347e);
        return response != null && "accepted".equals(response.mStatus);
    }

    public void onPerformRequest() {
        this.f13346d.applySendTime(this.f13345c.currentTimeMillis());
    }

    public boolean prepareAndSetPostData(byte[] bArr) {
        byte[] encrypt;
        try {
            byte[] compress = this.f13344b.compress(bArr);
            if (compress != null && (encrypt = this.f13343a.encrypt(compress)) != null) {
                this.f13346d.setPostData(encrypt);
                return true;
            }
        } catch (IOException unused) {
        }
        return false;
    }

    public SendingDataTaskHelper(RequestBodyEncrypter requestBodyEncrypter, Compressor compressor, TimeProvider timeProvider, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, NetworkResponseHandler<DefaultResponseParser.Response> networkResponseHandler) {
        this.f13343a = requestBodyEncrypter;
        this.f13344b = compressor;
        this.f13345c = timeProvider;
        this.f13346d = requestDataHolder;
        this.f13347e = responseDataHolder;
        this.f13348f = networkResponseHandler;
    }
}
