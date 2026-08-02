package com.stripe.android.stripe3ds2.views;

import android.graphics.BitmapFactory;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.scannerview.TextSetter;
import com.stripe.android.stripe3ds2.observability.DefaultErrorReporter;
import com.withpersona.sdk2.inquiry.internal.InquiryViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.InputStream;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.JobKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class ImageRepository$ImageSupplier$Default {
    public final DefaultErrorReporter errorReporter;
    public final CoroutineContext workContext;

    public ImageRepository$ImageSupplier$Default(DefaultErrorReporter defaultErrorReporter, CoroutineContext coroutineContext, int i) {
        switch (i) {
            case 1:
                this.errorReporter = defaultErrorReporter;
                this.workContext = coroutineContext;
                break;
            default:
                defaultErrorReporter.getClass();
                coroutineContext.getClass();
                this.errorReporter = defaultErrorReporter;
                this.workContext = coroutineContext;
                break;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|(2:3|(11:5|6|7|(1:(2:10|11)(2:36|37))(3:38|39|(1:41))|12|(3:25|26|27)(1:14)|15|16|(1:18)|19|(1:24)(2:21|22)))|44|6|7|(0)(0)|12|(0)(0)|15|16|(0)|19|(0)(0)|(2:(0)|(1:32))) */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x002c, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0069, code lost:
    
        r8 = kotlin.Result.Companion;
        r6 = new kotlin.Result.Failure(r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0056 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getBitmap(String str, ContinuationImpl continuationImpl) {
        ImageRepository$ImageSupplier$Default$getBitmap$1 imageRepository$ImageSupplier$Default$getBitmap$1;
        int i;
        Object failure;
        Throwable m4120exceptionOrNullimpl;
        InputStream inputStream;
        if (continuationImpl instanceof ImageRepository$ImageSupplier$Default$getBitmap$1) {
            imageRepository$ImageSupplier$Default$getBitmap$1 = (ImageRepository$ImageSupplier$Default$getBitmap$1) continuationImpl;
            int i2 = imageRepository$ImageSupplier$Default$getBitmap$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                imageRepository$ImageSupplier$Default$getBitmap$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = imageRepository$ImageSupplier$Default$getBitmap$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = imageRepository$ImageSupplier$Default$getBitmap$1.label;
                DefaultErrorReporter defaultErrorReporter = this.errorReporter;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Result.Companion companion = Result.Companion;
                    CoroutineContext coroutineContext = this.workContext;
                    TextSetter textSetter = new TextSetter(str, defaultErrorReporter, coroutineContext);
                    imageRepository$ImageSupplier$Default$getBitmap$1.L$0 = str;
                    imageRepository$ImageSupplier$Default$getBitmap$1.label = 1;
                    obj = JobKt.withContext(coroutineContext, new InquiryViewModel.AnonymousClass1(textSetter, continuation, 17), imageRepository$ImageSupplier$Default$getBitmap$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = imageRepository$ImageSupplier$Default$getBitmap$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                inputStream = (InputStream) obj;
                if (inputStream == null) {
                    try {
                        failure = BitmapFactory.decodeStream(inputStream);
                        inputStream.close();
                    } finally {
                    }
                } else {
                    failure = null;
                }
                Result.Companion companion2 = Result.Companion;
                m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                if (m4120exceptionOrNullimpl != null) {
                    defaultErrorReporter.reportError(new RuntimeException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Could not get bitmap from url: ", str, "."), m4120exceptionOrNullimpl));
                }
                if (failure instanceof Result.Failure) {
                    return failure;
                }
                return null;
            }
        }
        imageRepository$ImageSupplier$Default$getBitmap$1 = new ImageRepository$ImageSupplier$Default$getBitmap$1(this, continuationImpl);
        Object obj2 = imageRepository$ImageSupplier$Default$getBitmap$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = imageRepository$ImageSupplier$Default$getBitmap$1.label;
        DefaultErrorReporter defaultErrorReporter2 = this.errorReporter;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        inputStream = (InputStream) obj2;
        if (inputStream == null) {
        }
        Result.Companion companion22 = Result.Companion;
        m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
        if (m4120exceptionOrNullimpl != null) {
        }
        if (failure instanceof Result.Failure) {
        }
    }
}
