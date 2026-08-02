package io.appmetrica.analytics.networktasks.internal;

import io.appmetrica.analytics.coreapi.internal.io.Compressor;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import io.appmetrica.analytics.networktasks.internal.DefaultResponseParser;
import java.io.IOException;

/* loaded from: classes.dex */
public class SendingDataTaskHelper {

    /* renamed from: a, reason: collision with root package name */
    private final RequestBodyEncrypter f8924a;

    /* renamed from: b, reason: collision with root package name */
    private final Compressor f8925b;

    /* renamed from: c, reason: collision with root package name */
    private final TimeProvider f8926c;

    /* renamed from: d, reason: collision with root package name */
    private final RequestDataHolder f8927d;

    /* renamed from: e, reason: collision with root package name */
    private final ResponseDataHolder f8928e;
    private final NetworkResponseHandler f;

    public SendingDataTaskHelper(RequestBodyEncrypter requestBodyEncrypter, Compressor compressor, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, NetworkResponseHandler<DefaultResponseParser.Response> networkResponseHandler) {
        this(requestBodyEncrypter, compressor, new SystemTimeProvider(), requestDataHolder, responseDataHolder, networkResponseHandler);
    }

    public boolean isResponseValid() {
        DefaultResponseParser.Response response = (DefaultResponseParser.Response) this.f.handle(this.f8928e);
        return response != null && "accepted".equals(response.mStatus);
    }

    public void onPerformRequest() {
        this.f8927d.applySendTime(this.f8926c.currentTimeMillis());
    }

    public boolean prepareAndSetPostData(byte[] bArr) {
        byte[] encrypt;
        try {
            byte[] compress = this.f8925b.compress(bArr);
            if (compress != null && (encrypt = this.f8924a.encrypt(compress)) != null) {
                this.f8927d.setPostData(encrypt);
                return true;
            }
        } catch (IOException unused) {
        }
        return false;
    }

    public SendingDataTaskHelper(RequestBodyEncrypter requestBodyEncrypter, Compressor compressor, TimeProvider timeProvider, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, NetworkResponseHandler<DefaultResponseParser.Response> networkResponseHandler) {
        this.f8924a = requestBodyEncrypter;
        this.f8925b = compressor;
        this.f8926c = timeProvider;
        this.f8927d = requestDataHolder;
        this.f8928e = responseDataHolder;
        this.f = networkResponseHandler;
    }
}
