package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.io.Compressor;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import io.appmetrica.analytics.networktasks.internal.DefaultResponseParser;
import java.io.IOException;

/* loaded from: classes3.dex */
public class SendingDataTaskHelper {

    /* renamed from: a, reason: collision with root package name */
    private final RequestBodyEncrypter f40632a;

    /* renamed from: b, reason: collision with root package name */
    private final Compressor f40633b;

    /* renamed from: c, reason: collision with root package name */
    private final TimeProvider f40634c;

    /* renamed from: d, reason: collision with root package name */
    private final RequestDataHolder f40635d;

    /* renamed from: e, reason: collision with root package name */
    private final ResponseDataHolder f40636e;

    /* renamed from: f, reason: collision with root package name */
    private final NetworkResponseHandler f40637f;

    public SendingDataTaskHelper(@NonNull RequestBodyEncrypter requestBodyEncrypter, @NonNull Compressor compressor, @NonNull RequestDataHolder requestDataHolder, @NonNull ResponseDataHolder responseDataHolder, @NonNull NetworkResponseHandler<DefaultResponseParser.Response> networkResponseHandler) {
        this(requestBodyEncrypter, compressor, new SystemTimeProvider(), requestDataHolder, responseDataHolder, networkResponseHandler);
    }

    public boolean isResponseValid() {
        DefaultResponseParser.Response response = (DefaultResponseParser.Response) this.f40637f.handle(this.f40636e);
        return response != null && "accepted".equals(response.mStatus);
    }

    public void onPerformRequest() {
        this.f40635d.applySendTime(this.f40634c.currentTimeMillis());
    }

    public boolean prepareAndSetPostData(@NonNull byte[] bArr) {
        byte[] encrypt;
        try {
            byte[] compress = this.f40633b.compress(bArr);
            if (compress != null && (encrypt = this.f40632a.encrypt(compress)) != null) {
                this.f40635d.setPostData(encrypt);
                return true;
            }
        } catch (IOException unused) {
        }
        return false;
    }

    public SendingDataTaskHelper(@NonNull RequestBodyEncrypter requestBodyEncrypter, @NonNull Compressor compressor, @NonNull TimeProvider timeProvider, @NonNull RequestDataHolder requestDataHolder, @NonNull ResponseDataHolder responseDataHolder, @NonNull NetworkResponseHandler<DefaultResponseParser.Response> networkResponseHandler) {
        this.f40632a = requestBodyEncrypter;
        this.f40633b = compressor;
        this.f40634c = timeProvider;
        this.f40635d = requestDataHolder;
        this.f40636e = responseDataHolder;
        this.f40637f = networkResponseHandler;
    }
}
