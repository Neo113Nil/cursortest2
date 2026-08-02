package com.stripe.android.uicore.image;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.reflect.full.KClasses$$Lambda$2;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class NetworkImageDecoder {
    public static final NetworkImageDecoder INSTANCE = new NetworkImageDecoder();

    public static Object decodeStream(BitmapFactory.Options options, URL url, NetworkImageDecoder$decode$1 networkImageDecoder$decode$1) {
        Object failure;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(networkImageDecoder$decode$1));
        cancellableContinuationImpl.initCancellability();
        try {
            Result.Companion companion = Result.Companion;
            URLConnection openConnection = url.openConnection();
            openConnection.getClass();
            openConnection.setConnectTimeout(10000);
            openConnection.setReadTimeout(10000);
            InputStream inputStream = openConnection.getInputStream();
            inputStream.getClass();
            cancellableContinuationImpl.invokeOnCancellation(new KClasses$$Lambda$2(options, inputStream));
            failure = null;
            try {
                Bitmap decodeStream = BitmapFactory.decodeStream(inputStream, null, options);
                inputStream.close();
                if (decodeStream != null) {
                    String str = options.outMimeType;
                    str.getClass();
                    failure = new LoadedImage(str, decodeStream);
                }
            } finally {
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            failure = new Result.Failure(th);
        }
        Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
        if (m4120exceptionOrNullimpl == null) {
            cancellableContinuationImpl.resumeWith((LoadedImage) failure);
        } else {
            cancellableContinuationImpl.resumeWith(new Result.Failure(m4120exceptionOrNullimpl));
        }
        Object result = cancellableContinuationImpl.getResult();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return result;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0089, code lost:
    
        if (r9 != r13) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object decode(URL url, int i, int i2, ContinuationImpl continuationImpl) {
        NetworkImageDecoder$decode$1 networkImageDecoder$decode$1;
        int i3;
        int i4;
        BitmapFactory.Options options;
        int i5;
        int i6;
        int i7;
        int i8;
        if (continuationImpl instanceof NetworkImageDecoder$decode$1) {
            networkImageDecoder$decode$1 = (NetworkImageDecoder$decode$1) continuationImpl;
            int i9 = networkImageDecoder$decode$1.label;
            if ((i9 & PKIFailureInfo.systemUnavail) != 0) {
                networkImageDecoder$decode$1.label = i9 - PKIFailureInfo.systemUnavail;
                Object obj = networkImageDecoder$decode$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i3 = networkImageDecoder$decode$1.label;
                i4 = 1;
                if (i3 != 0) {
                    SafeTrace.throwOnFailure(obj);
                    options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    networkImageDecoder$decode$1.L$0 = url;
                    networkImageDecoder$decode$1.L$1 = options;
                    networkImageDecoder$decode$1.I$0 = i;
                    networkImageDecoder$decode$1.I$1 = i2;
                    networkImageDecoder$decode$1.I$2 = 0;
                    networkImageDecoder$decode$1.label = 1;
                    if (decodeStream(options, url, networkImageDecoder$decode$1) != coroutineSingletons) {
                        i5 = 0;
                    }
                    return coroutineSingletons;
                }
                if (i3 != 1) {
                    if (i3 == 2) {
                        SafeTrace.throwOnFailure(obj);
                        return (LoadedImage) obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i10 = networkImageDecoder$decode$1.I$2;
                i2 = networkImageDecoder$decode$1.I$1;
                i = networkImageDecoder$decode$1.I$0;
                options = networkImageDecoder$decode$1.L$1;
                URL url2 = networkImageDecoder$decode$1.L$0;
                SafeTrace.throwOnFailure(obj);
                i5 = i10;
                url = url2;
                i6 = options.outHeight;
                i7 = options.outWidth;
                if (i6 <= i2 || i7 > i) {
                    i8 = i6 / 2;
                    int i11 = i7 / 2;
                    while (i8 / i4 >= i2 && i11 / i4 >= i) {
                        i4 *= 2;
                    }
                }
                options.inSampleSize = i4;
                options.inJustDecodeBounds = false;
                networkImageDecoder$decode$1.L$0 = null;
                networkImageDecoder$decode$1.L$1 = null;
                networkImageDecoder$decode$1.I$0 = i;
                networkImageDecoder$decode$1.I$1 = i2;
                networkImageDecoder$decode$1.I$2 = i5;
                networkImageDecoder$decode$1.label = 2;
                obj = decodeStream(options, url, networkImageDecoder$decode$1);
            }
        }
        networkImageDecoder$decode$1 = new NetworkImageDecoder$decode$1(this, continuationImpl);
        Object obj2 = networkImageDecoder$decode$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i3 = networkImageDecoder$decode$1.label;
        i4 = 1;
        if (i3 != 0) {
        }
        i6 = options.outHeight;
        i7 = options.outWidth;
        if (i6 <= i2) {
        }
        i8 = i6 / 2;
        int i112 = i7 / 2;
        while (i8 / i4 >= i2) {
            i4 *= 2;
        }
        options.inSampleSize = i4;
        options.inJustDecodeBounds = false;
        networkImageDecoder$decode$1.L$0 = null;
        networkImageDecoder$decode$1.L$1 = null;
        networkImageDecoder$decode$1.I$0 = i;
        networkImageDecoder$decode$1.I$1 = i2;
        networkImageDecoder$decode$1.I$2 = i5;
        networkImageDecoder$decode$1.label = 2;
        obj2 = decodeStream(options, url, networkImageDecoder$decode$1);
    }
}
