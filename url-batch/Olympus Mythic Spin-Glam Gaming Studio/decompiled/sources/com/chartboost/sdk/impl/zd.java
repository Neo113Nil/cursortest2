package com.chartboost.sdk.impl;

import com.chartboost.sdk.events.ChartboostError;
import com.mbridge.msdk.foundation.download.Command;
import com.safedk.android.internal.partials.ChartboostFilesBridge;
import com.safedk.android.internal.partials.ChartboostNetworkBridge;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.NonCancellable;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* loaded from: classes3.dex */
public final class zd implements w8 {
    public static final a c = new a(null);
    public final OkHttpClient a;
    public final CoroutineDispatcher b;

    public static final class b extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ File c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(File file, Continuation continuation) {
            super(2, continuation);
            this.c = file;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new b(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                if (this.c.exists()) {
                    long length = this.c.length();
                    if (this.c.delete()) {
                        xb.d("Cleaned up temporary download file: " + this.c.getName(), null, 2, null);
                    } else {
                        xb.e("Temp file delete failed: file=" + this.c.getAbsolutePath() + ", fileSize=" + length, null, 2, null);
                    }
                }
            } catch (Exception e) {
                xb.b("Temp file cleanup error: file=" + this.c.getAbsolutePath() + ", errorType=" + e.getClass().getSimpleName(), e);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class c extends ContinuationImpl {
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public Object f;
        public /* synthetic */ Object g;
        public int i;

        public c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.g = obj;
            this.i |= Integer.MIN_VALUE;
            Object a = zd.this.a(null, null, this);
            return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Result.m8022boximpl(a);
        }
    }

    public static final class d extends SuspendLambda implements Function2 {
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ ResponseBody d;
        public final /* synthetic */ File e;
        public final /* synthetic */ Ref$LongRef f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ResponseBody responseBody, File file, Ref$LongRef ref$LongRef, Continuation continuation) {
            super(2, continuation);
            this.d = responseBody;
            this.e = file;
            this.f = ref$LongRef;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            d dVar = new d(this.d, this.e, this.f, continuation);
            dVar.c = obj;
            return dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.c;
            InputStream byteStream = this.d.byteStream();
            File file = this.e;
            Ref$LongRef ref$LongRef = this.f;
            try {
                FileOutputStream fileOutputStreamCtor = ChartboostFilesBridge.fileOutputStreamCtor(file);
                try {
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int read = byteStream.read(bArr);
                        if (read == -1) {
                            fileOutputStreamCtor.flush();
                            Unit unit = Unit.INSTANCE;
                            CloseableKt.closeFinally(fileOutputStreamCtor, null);
                            CloseableKt.closeFinally(byteStream, null);
                            return unit;
                        }
                        CoroutineScopeKt.ensureActive(coroutineScope);
                        fileOutputStreamCtor.write(bArr, 0, read);
                        ref$LongRef.element += read;
                    }
                } finally {
                }
            } finally {
            }
        }
    }

    public static final class e extends ContinuationImpl {
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public Object f;
        public Object g;
        public /* synthetic */ Object h;
        public int j;

        public e(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.h = obj;
            this.j |= Integer.MIN_VALUE;
            Object a = zd.this.a(null, null, 0L, 0L, this);
            return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Result.m8022boximpl(a);
        }
    }

    public static final class f extends SuspendLambda implements Function2 {
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ ResponseBody d;
        public final /* synthetic */ File e;
        public final /* synthetic */ long f;
        public final /* synthetic */ long g;
        public final /* synthetic */ Ref$LongRef h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ResponseBody responseBody, File file, long j, long j2, Ref$LongRef ref$LongRef, Continuation continuation) {
            super(2, continuation);
            this.d = responseBody;
            this.e = file;
            this.f = j;
            this.g = j2;
            this.h = ref$LongRef;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            f fVar = new f(this.d, this.e, this.f, this.g, this.h, continuation);
            fVar.c = obj;
            return fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            long j;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.c;
            InputStream byteStream = this.d.byteStream();
            File file = this.e;
            long j2 = this.f;
            long j3 = this.g;
            Ref$LongRef ref$LongRef = this.h;
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file, true);
                try {
                    byte[] bArr = new byte[8192];
                    Ref$IntRef ref$IntRef = new Ref$IntRef();
                    long j4 = (j2 - j3) + 1;
                    do {
                        int read = byteStream.read(bArr);
                        ref$IntRef.element = read;
                        if (read == -1) {
                            break;
                        }
                        CoroutineScopeKt.ensureActive(coroutineScope);
                        long j5 = ref$LongRef.element;
                        int i = ref$IntRef.element;
                        if (i + j5 > j4) {
                            i = (int) (j4 - j5);
                        }
                        if (i <= 0) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, i);
                        j = ref$LongRef.element + i;
                        ref$LongRef.element = j;
                    } while (j < j4);
                    fileOutputStream.flush();
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(fileOutputStream, null);
                    CloseableKt.closeFinally(byteStream, null);
                    return unit;
                } finally {
                }
            } finally {
            }
        }
    }

    public zd(OkHttpClient okHttpClient, CoroutineDispatcher ioDispatcher) {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        this.a = okHttpClient;
        this.b = ioDispatcher;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(1:(1:(7:12|13|14|(5:16|(1:18)|27|20|(1:26))|28|(1:30)|33)(2:35|36))(5:37|38|39|(1:41)|33))(4:43|44|45|46))(6:83|84|85|86|87|(2:89|(2:91|(1:93)(1:94))(2:95|96))(2:97|98))|47|48|(1:50)|33))|119|6|7|(0)(0)|47|48|(0)|33|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x021b, code lost:
    
        if (r0 == null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x024c, code lost:
    
        if (r2 != null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0298, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0296, code lost:
    
        if (r2 != null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x012e, code lost:
    
        if (r2 != null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0137, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0138, code lost:
    
        r1 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0135, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x0183: MOVE (r11 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]), block:B:116:0x0183 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x020a A[Catch: all -> 0x0043, TryCatch #3 {all -> 0x0043, blocks: (B:13:0x003e, B:14:0x0206, B:16:0x020a, B:18:0x0210, B:20:0x021f, B:22:0x022a, B:24:0x0232, B:26:0x023a, B:28:0x023c, B:38:0x0056, B:39:0x0286, B:45:0x006f), top: B:7:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0283 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0193 A[Catch: all -> 0x0182, TryCatch #1 {all -> 0x0182, blocks: (B:60:0x017b, B:63:0x018f, B:65:0x0193, B:67:0x019a, B:68:0x01a6, B:74:0x0186, B:55:0x0252), top: B:7:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x019a A[Catch: all -> 0x0182, TryCatch #1 {all -> 0x0182, blocks: (B:60:0x017b, B:63:0x018f, B:65:0x0193, B:67:0x019a, B:68:0x01a6, B:74:0x0186, B:55:0x0252), top: B:7:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0203 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0186 A[Catch: all -> 0x0182, TryCatch #1 {all -> 0x0182, blocks: (B:60:0x017b, B:63:0x018f, B:65:0x0193, B:67:0x019a, B:68:0x01a6, B:74:0x0186, B:55:0x0252), top: B:7:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v12, types: [okhttp3.Response] */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [okhttp3.Response] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.lang.Object, okhttp3.Response] */
    @Override // com.chartboost.sdk.impl.w8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(URL url, File file, Continuation continuation) {
        c cVar;
        int i;
        Object obj;
        ?? r12;
        Object obj2;
        ResponseBody okhttp3Response_body;
        Ref$LongRef ref$LongRef;
        zd zdVar;
        com.chartboost.sdk.internal.Networking.okhttp.a aVar;
        zd zdVar2;
        Integer num;
        Exception exc;
        Response response;
        CancellationException cancellationException;
        Response response2;
        Object m8023constructorimpl;
        ResponseBody okhttp3Response_body2;
        String str;
        zd zdVar3 = this;
        URL url2 = url;
        File file2 = file;
        try {
            try {
                if (continuation instanceof c) {
                    cVar = (c) continuation;
                    int i2 = cVar.i;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        cVar.i = i2 - Integer.MIN_VALUE;
                        Object obj3 = cVar.g;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = cVar.i;
                        obj = null;
                        if (i != 0) {
                            ResultKt.throwOnFailure(obj3);
                            Request build = new Request.Builder().url(url2).get().build();
                            ref$LongRef = new Ref$LongRef();
                            try {
                                xb.d("Starting OkHttp download for " + url2 + " to " + file.getAbsolutePath(), null, 2, null);
                                r12 = ChartboostNetworkBridge.okhttp3CallExecute(zdVar3.a.newCall(build));
                                try {
                                    try {
                                        if (!r12.isSuccessful()) {
                                            com.chartboost.sdk.internal.Networking.okhttp.a b2 = com.chartboost.sdk.internal.Networking.okhttp.a.c.b(r12.code());
                                            String url3 = url.toString();
                                            Intrinsics.checkNotNullExpressionValue(url3, "toString(...)");
                                            throw h9.a(b2, url3);
                                        }
                                        ResponseBody okhttp3Response_body3 = ChartboostNetworkBridge.okhttp3Response_body(r12);
                                        if (okhttp3Response_body3 == null) {
                                            throw new IOException("Response body was null for " + url2);
                                        }
                                        CoroutineDispatcher coroutineDispatcher = zdVar3.b;
                                        d dVar = new d(okhttp3Response_body3, file2, ref$LongRef, null);
                                        cVar.b = zdVar3;
                                        cVar.c = url2;
                                        cVar.d = file2;
                                        cVar.e = r12;
                                        cVar.f = ref$LongRef;
                                        cVar.i = 1;
                                        if (BuildersKt.withContext(coroutineDispatcher, dVar, cVar) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        zdVar = zdVar3;
                                        r12 = r12;
                                    } catch (Throwable th) {
                                        th = th;
                                        if (r12 != 0 && (okhttp3Response_body = ChartboostNetworkBridge.okhttp3Response_body(r12)) != null) {
                                            okhttp3Response_body.close();
                                        }
                                        throw th;
                                    }
                                } catch (CancellationException e2) {
                                    e = e2;
                                    xb.e("Download cancelled: url=" + url2 + ", bytesDownloaded=" + ref$LongRef.element, null, 2, null);
                                    cVar.b = r12;
                                    cVar.c = e;
                                    cVar.d = null;
                                    cVar.e = null;
                                    cVar.f = null;
                                    cVar.i = 2;
                                    if (zdVar3.a(file2, cVar) == coroutine_suspended) {
                                    }
                                } catch (Exception e3) {
                                    e = e3;
                                    zdVar = zdVar3;
                                    if (e instanceof com.chartboost.sdk.internal.Networking.okhttp.a) {
                                    }
                                    if (e instanceof com.chartboost.sdk.internal.Networking.okhttp.a) {
                                    }
                                    if (aVar != null) {
                                    }
                                    xb.b("Download failed: url=" + url2 + ", bytesDownloaded=" + ref$LongRef.element + ", errorCategory=" + r13 + ", httpCode=" + num + ", errorType=" + e.getClass().getSimpleName() + ", message=" + e.getMessage(), e);
                                    cVar.b = r12;
                                    cVar.c = e;
                                    cVar.d = null;
                                    cVar.e = null;
                                    cVar.f = null;
                                    cVar.i = 3;
                                    if (zdVar2.a(file2, cVar) == coroutine_suspended) {
                                    }
                                }
                            } catch (CancellationException e4) {
                                e = e4;
                                r12 = 0;
                                zdVar3 = this;
                            } catch (Exception e5) {
                                e = e5;
                                zdVar = zdVar3;
                                r12 = 0;
                            } catch (Throwable th2) {
                                th = th2;
                                r12 = obj;
                                if (r12 != 0) {
                                    okhttp3Response_body.close();
                                }
                                throw th;
                            }
                        } else {
                            if (i != 1) {
                                if (i == 2) {
                                    cancellationException = (CancellationException) cVar.c;
                                    response2 = (Response) cVar.b;
                                    ResultKt.throwOnFailure(obj3);
                                    Result.Companion companion = Result.INSTANCE;
                                    m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(cancellationException));
                                    if (response2 != null) {
                                        okhttp3Response_body2 = ChartboostNetworkBridge.okhttp3Response_body(response2);
                                    }
                                    return m8023constructorimpl;
                                }
                                if (i != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                exc = (Exception) cVar.c;
                                response = (Response) cVar.b;
                                ResultKt.throwOnFailure(obj3);
                                if (exc instanceof IOException) {
                                    String message = exc.getMessage();
                                    if (message != null) {
                                        str = message.toLowerCase(Locale.ROOT);
                                        Intrinsics.checkNotNullExpressionValue(str, "toLowerCase(...)");
                                    }
                                    str = "";
                                    if (StringsKt.contains$default((CharSequence) str, (CharSequence) "no space left", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "insufficient storage", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "disk full", false, 2, (Object) null)) {
                                        exc = ChartboostError.Load.NoStorage.INSTANCE;
                                    }
                                }
                                Result.Companion companion2 = Result.INSTANCE;
                                m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(exc));
                                if (response != null) {
                                    okhttp3Response_body2 = ChartboostNetworkBridge.okhttp3Response_body(response);
                                }
                                return m8023constructorimpl;
                            }
                            Ref$LongRef ref$LongRef2 = (Ref$LongRef) cVar.f;
                            Response response3 = (Response) cVar.e;
                            File file3 = (File) cVar.d;
                            URL url4 = (URL) cVar.c;
                            zd zdVar4 = (zd) cVar.b;
                            try {
                                ResultKt.throwOnFailure(obj3);
                                ref$LongRef = ref$LongRef2;
                                url2 = url4;
                                zdVar = zdVar4;
                                r12 = response3;
                                file2 = file3;
                            } catch (CancellationException e6) {
                                e = e6;
                                zdVar3 = zdVar4;
                                r12 = response3;
                                file2 = file3;
                                ref$LongRef = ref$LongRef2;
                                url2 = url4;
                                xb.e("Download cancelled: url=" + url2 + ", bytesDownloaded=" + ref$LongRef.element, null, 2, null);
                                cVar.b = r12;
                                cVar.c = e;
                                cVar.d = null;
                                cVar.e = null;
                                cVar.f = null;
                                cVar.i = 2;
                                if (zdVar3.a(file2, cVar) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                cancellationException = e;
                                response2 = r12;
                                Result.Companion companion3 = Result.INSTANCE;
                                m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(cancellationException));
                                if (response2 != null) {
                                }
                                return m8023constructorimpl;
                            } catch (Exception e7) {
                                e = e7;
                                ref$LongRef = ref$LongRef2;
                                url2 = url4;
                                zdVar = zdVar4;
                                r12 = response3;
                                file2 = file3;
                                String str2 = e instanceof com.chartboost.sdk.internal.Networking.okhttp.a ? "HTTP_ERROR" : e instanceof IOException ? "IO_ERROR" : "UNEXPECTED";
                                aVar = e instanceof com.chartboost.sdk.internal.Networking.okhttp.a ? (com.chartboost.sdk.internal.Networking.okhttp.a) e : null;
                                if (aVar != null) {
                                    num = Boxing.boxInt(aVar.b());
                                    zdVar2 = zdVar;
                                } else {
                                    zdVar2 = zdVar;
                                    num = null;
                                }
                                xb.b("Download failed: url=" + url2 + ", bytesDownloaded=" + ref$LongRef.element + ", errorCategory=" + str2 + ", httpCode=" + num + ", errorType=" + e.getClass().getSimpleName() + ", message=" + e.getMessage(), e);
                                cVar.b = r12;
                                cVar.c = e;
                                cVar.d = null;
                                cVar.e = null;
                                cVar.f = null;
                                cVar.i = 3;
                                if (zdVar2.a(file2, cVar) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                exc = e;
                                response = r12;
                                if (exc instanceof IOException) {
                                }
                                Result.Companion companion22 = Result.INSTANCE;
                                m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(exc));
                                if (response != null) {
                                }
                                return m8023constructorimpl;
                            }
                        }
                        xb.d("OkHttp download complete for " + url2 + " (" + ref$LongRef.element + " bytes)", null, 2, null);
                        Result.Companion companion4 = Result.INSTANCE;
                        m8023constructorimpl = Result.m8023constructorimpl(Boxing.boxLong(ref$LongRef.element));
                        if (r12 != 0) {
                            okhttp3Response_body2 = ChartboostNetworkBridge.okhttp3Response_body(r12);
                        }
                        return m8023constructorimpl;
                    }
                }
                if (i != 0) {
                }
                xb.d("OkHttp download complete for " + url2 + " (" + ref$LongRef.element + " bytes)", null, 2, null);
                Result.Companion companion42 = Result.INSTANCE;
                m8023constructorimpl = Result.m8023constructorimpl(Boxing.boxLong(ref$LongRef.element));
                if (r12 != 0) {
                }
                return m8023constructorimpl;
            } catch (Throwable th3) {
                th = th3;
                obj = obj2;
            }
        } catch (Throwable th4) {
            th = th4;
            r12 = file2;
        }
        cVar = zdVar3.new c(continuation);
        Object obj32 = cVar.g;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cVar.i;
        obj = null;
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:0|1|(2:3|(12:5|6|7|8|(2:10|(2:12|(2:14|(7:16|17|18|(5:20|(1:22)|31|24|(1:30))|32|(1:34)|37)(2:39|40))(5:41|42|43|(1:45)|37))(4:47|48|49|50))(2:96|(2:98|99)(2:100|(2:102|103)(13:104|105|106|107|108|109|110|111|112|114|115|116|(4:118|119|120|(3:138|139|(20:141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|(1:161)(1:162))(3:201|202|203))(5:123|124|125|126|127))(2:207|208))))|51|52|53|54|55|(1:57)|37))|243|6|7|8|(0)(0)|51|52|53|54|55|(0)|37|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0437, code lost:
    
        if (r0 == null) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0468, code lost:
    
        if (r2 != null) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x04c4, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x04c2, code lost:
    
        if (r2 != null) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x026d, code lost:
    
        if (r2 != null) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0276, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0287, code lost:
    
        r1 = r33;
        r5 = r2;
        r2 = r8;
        r8 = r21;
        r3 = r3;
        r4 = r4;
        r6 = r6;
        r9 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0274, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0280, code lost:
    
        r25 = r2;
        r2 = r0;
        r0 = r25;
        r3 = r3;
        r4 = r4;
        r6 = r6;
        r9 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x027c, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0278, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0279, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0426 A[Catch: all -> 0x004e, TryCatch #27 {all -> 0x004e, blocks: (B:17:0x0049, B:18:0x0422, B:20:0x0426, B:22:0x042c, B:24:0x043b, B:26:0x0446, B:28:0x044e, B:30:0x0456, B:32:0x0458, B:42:0x0062, B:43:0x04b2), top: B:8:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x04af A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x03a7 A[Catch: all -> 0x0271, TryCatch #14 {all -> 0x0271, blocks: (B:49:0x0080, B:52:0x0230, B:55:0x0258, B:68:0x0393, B:71:0x03a3, B:73:0x03a7, B:75:0x03ae, B:76:0x03b8, B:82:0x039a, B:62:0x0476), top: B:8:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03ae A[Catch: all -> 0x0271, TryCatch #14 {all -> 0x0271, blocks: (B:49:0x0080, B:52:0x0230, B:55:0x0258, B:68:0x0393, B:71:0x03a3, B:73:0x03a7, B:75:0x03ae, B:76:0x03b8, B:82:0x039a, B:62:0x0476), top: B:8:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0420 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x039a A[Catch: all -> 0x0271, TryCatch #14 {all -> 0x0271, blocks: (B:49:0x0080, B:52:0x0230, B:55:0x0258, B:68:0x0393, B:71:0x03a3, B:73:0x03a7, B:75:0x03ae, B:76:0x03b8, B:82:0x039a, B:62:0x0476), top: B:8:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00a9  */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [com.chartboost.sdk.internal.Networking.okhttp.a] */
    /* JADX WARN: Type inference failed for: r3v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    /* JADX WARN: Type inference failed for: r3v51 */
    /* JADX WARN: Type inference failed for: r3v56, types: [okhttp3.Response] */
    /* JADX WARN: Type inference failed for: r3v65, types: [okhttp3.Response] */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v29, types: [okhttp3.Response] */
    /* JADX WARN: Type inference failed for: r4v33, types: [okhttp3.Response] */
    /* JADX WARN: Type inference failed for: r4v34, types: [int] */
    /* JADX WARN: Type inference failed for: r4v35, types: [int] */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [okhttp3.OkHttpClient] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v11, types: [okhttp3.Response] */
    @Override // com.chartboost.sdk.impl.w8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(URL url, File file, long j, long j2, Continuation continuation) {
        e eVar;
        Response response;
        ?? r3;
        ResponseBody okhttp3Response_body;
        String str;
        ?? r10;
        File file2;
        String str2;
        String str3;
        Ref$LongRef ref$LongRef;
        File file3;
        String str4;
        String str5;
        Ref$LongRef ref$LongRef2;
        zd zdVar;
        URL url2;
        Exception exc;
        String str6;
        String str7;
        zd zdVar2;
        String str8;
        Response response2;
        File file4;
        String str9;
        String str10;
        Ref$LongRef ref$LongRef3;
        String str11;
        File file5;
        Ref$LongRef ref$LongRef4;
        Ref$LongRef ref$LongRef5;
        File file6;
        Ref$LongRef ref$LongRef6;
        File file7;
        File file8;
        String str12;
        String str13;
        zd zdVar3;
        String str14;
        ?? r4;
        Ref$LongRef ref$LongRef7;
        File file9;
        String str15;
        ?? r32;
        Ref$LongRef ref$LongRef8;
        File file10;
        CancellationException cancellationException;
        Response response3;
        Ref$LongRef ref$LongRef9;
        File file11;
        Object m8023constructorimpl;
        ResponseBody okhttp3Response_body2;
        String str16;
        ?? r42;
        URL url3 = url;
        try {
            try {
                if (continuation instanceof e) {
                    eVar = (e) continuation;
                    r42 = eVar.j;
                    if ((r42 & Integer.MIN_VALUE) != 0) {
                        ?? r43 = r42 - Integer.MIN_VALUE;
                        eVar.j = r43;
                        response = r43;
                        e eVar2 = eVar;
                        Object obj = eVar2.h;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        r3 = eVar2.j;
                        String str17 = " (";
                        if (r3 != 0) {
                            ResultKt.throwOnFailure(obj);
                            if (j < 0) {
                                Result.Companion companion = Result.INSTANCE;
                                return Result.m8023constructorimpl(ResultKt.createFailure(new IllegalArgumentException("startByte must be non-negative, got: " + j)));
                            }
                            if (j2 < j) {
                                Result.Companion companion2 = Result.INSTANCE;
                                return Result.m8023constructorimpl(ResultKt.createFailure(new IllegalArgumentException("endByte (" + j2 + ") must be >= startByte (" + j + ")")));
                            }
                            String str18 = "bytes=" + j + "-" + j2;
                            str = ")";
                            Request build = new Request.Builder().url(url3).header(Command.HTTP_HEADER_RANGE, str18).get().build();
                            Ref$LongRef ref$LongRef10 = new Ref$LongRef();
                            try {
                                try {
                                    try {
                                        str11 = null;
                                    } catch (CancellationException e2) {
                                        e = e2;
                                        file4 = file;
                                        str9 = ", bytesDownloaded=";
                                        str10 = ", range=";
                                        ref$LongRef3 = ref$LongRef10;
                                    }
                                } catch (CancellationException e3) {
                                    e = e3;
                                    file3 = file;
                                    str4 = ", bytesDownloaded=";
                                    str5 = ", range=";
                                    ref$LongRef2 = ref$LongRef10;
                                }
                                try {
                                    xb.d("Starting OkHttp partial download for " + url3 + " (" + str18 + ") to " + file.getAbsolutePath(), null, 2, null);
                                    ?? r5 = this.a;
                                    ?? okhttp3CallExecute = ChartboostNetworkBridge.okhttp3CallExecute(r5.newCall(build));
                                    try {
                                        try {
                                            ?? isSuccessful = okhttp3CallExecute.isSuccessful();
                                            try {
                                                try {
                                                    if (isSuccessful != 0) {
                                                        char c2 = 206;
                                                        try {
                                                            try {
                                                                if (okhttp3CallExecute.code() != 206 && j > 0) {
                                                                    try {
                                                                        xb.e("Range request unsupported: url=" + url3 + ", httpCode=" + okhttp3CallExecute.code() + ", requestedRange=" + str18, null, 2, null);
                                                                        throw new IOException("Server doesn't support range requests for partial download");
                                                                    } catch (CancellationException e4) {
                                                                        e = e4;
                                                                        c2 = 2;
                                                                        str11 = null;
                                                                        file7 = file;
                                                                        str3 = ", bytesDownloaded=";
                                                                        str = ", range=";
                                                                        r5 = okhttp3CallExecute;
                                                                        ref$LongRef6 = ref$LongRef10;
                                                                        zdVar2 = this;
                                                                        str4 = str3;
                                                                        str5 = str;
                                                                        Response response4 = r5;
                                                                        str8 = str18;
                                                                        response2 = response4;
                                                                        file10 = file7;
                                                                        ref$LongRef8 = ref$LongRef6;
                                                                        xb.e("Partial download cancelled: url=" + url3 + str5 + str8 + str4 + ref$LongRef8.element, null, 2, null);
                                                                        eVar2.b = response2;
                                                                        eVar2.c = e;
                                                                        eVar2.d = null;
                                                                        eVar2.e = null;
                                                                        eVar2.f = null;
                                                                        eVar2.g = null;
                                                                        eVar2.j = 2;
                                                                        if (zdVar2.a(file10, eVar2) != coroutine_suspended) {
                                                                        }
                                                                    } catch (Exception e5) {
                                                                        e = e5;
                                                                        c2 = 2;
                                                                        str11 = null;
                                                                        file8 = file;
                                                                        str17 = str11;
                                                                        str2 = ", httpCode=";
                                                                        str3 = ", bytesDownloaded=";
                                                                        str = ", range=";
                                                                        r5 = okhttp3CallExecute;
                                                                        ref$LongRef5 = ref$LongRef10;
                                                                        file6 = file8;
                                                                        zdVar = this;
                                                                        url2 = url3;
                                                                        exc = e;
                                                                        str6 = str18;
                                                                        str7 = r5;
                                                                        file9 = file6;
                                                                        ref$LongRef7 = ref$LongRef5;
                                                                        if (exc instanceof com.chartboost.sdk.internal.Networking.okhttp.a) {
                                                                        }
                                                                        if (exc instanceof com.chartboost.sdk.internal.Networking.okhttp.a) {
                                                                        }
                                                                        if (r11 != 0) {
                                                                        }
                                                                        xb.b("Partial download failed: url=" + url2 + str + str6 + str3 + ref$LongRef7.element + ", errorCategory=" + str15 + str2 + r11 + ", errorType=" + exc.getClass().getSimpleName() + ", message=" + exc.getMessage(), exc);
                                                                        eVar2.b = str7;
                                                                        eVar2.c = exc;
                                                                        eVar2.d = null;
                                                                        eVar2.e = null;
                                                                        eVar2.f = null;
                                                                        eVar2.g = null;
                                                                        eVar2.j = 3;
                                                                        if (zdVar.a(file9, eVar2) == coroutine_suspended) {
                                                                        }
                                                                    }
                                                                } else {
                                                                    c2 = 2;
                                                                    ResponseBody okhttp3Response_body3 = ChartboostNetworkBridge.okhttp3Response_body(okhttp3CallExecute);
                                                                    if (okhttp3Response_body3 != null) {
                                                                        CoroutineDispatcher coroutineDispatcher = this.b;
                                                                        try {
                                                                            str3 = ", bytesDownloaded=";
                                                                            str = ", range=";
                                                                            str12 = " (";
                                                                            str13 = str;
                                                                            str2 = ", httpCode=";
                                                                            try {
                                                                                try {
                                                                                    f fVar = new f(okhttp3Response_body3, file, j2, j, ref$LongRef10, null);
                                                                                    eVar2.b = this;
                                                                                    eVar2.c = url3;
                                                                                    file5 = file;
                                                                                    try {
                                                                                        eVar2.d = file5;
                                                                                        str18 = str18;
                                                                                        try {
                                                                                            eVar2.e = str18;
                                                                                            r5 = okhttp3CallExecute;
                                                                                            try {
                                                                                                eVar2.f = r5;
                                                                                                ref$LongRef4 = ref$LongRef10;
                                                                                            } catch (CancellationException e6) {
                                                                                                e = e6;
                                                                                                ref$LongRef4 = ref$LongRef10;
                                                                                                file7 = file5;
                                                                                                ref$LongRef6 = ref$LongRef4;
                                                                                                zdVar2 = this;
                                                                                                str4 = str3;
                                                                                                str5 = str;
                                                                                                Response response42 = r5;
                                                                                                str8 = str18;
                                                                                                response2 = response42;
                                                                                                file10 = file7;
                                                                                                ref$LongRef8 = ref$LongRef6;
                                                                                                xb.e("Partial download cancelled: url=" + url3 + str5 + str8 + str4 + ref$LongRef8.element, null, 2, null);
                                                                                                eVar2.b = response2;
                                                                                                eVar2.c = e;
                                                                                                eVar2.d = null;
                                                                                                eVar2.e = null;
                                                                                                eVar2.f = null;
                                                                                                eVar2.g = null;
                                                                                                eVar2.j = 2;
                                                                                                if (zdVar2.a(file10, eVar2) != coroutine_suspended) {
                                                                                                    return coroutine_suspended;
                                                                                                }
                                                                                                cancellationException = e;
                                                                                                response3 = response2;
                                                                                                Result.Companion companion3 = Result.INSTANCE;
                                                                                                m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(cancellationException));
                                                                                                if (response3 != null) {
                                                                                                }
                                                                                                return m8023constructorimpl;
                                                                                            } catch (Exception e7) {
                                                                                                e = e7;
                                                                                                ref$LongRef4 = ref$LongRef10;
                                                                                                str17 = null;
                                                                                                file6 = file5;
                                                                                                ref$LongRef5 = ref$LongRef4;
                                                                                                zdVar = this;
                                                                                                url2 = url3;
                                                                                                exc = e;
                                                                                                str6 = str18;
                                                                                                str7 = r5;
                                                                                                file9 = file6;
                                                                                                ref$LongRef7 = ref$LongRef5;
                                                                                                if (exc instanceof com.chartboost.sdk.internal.Networking.okhttp.a) {
                                                                                                }
                                                                                                if (exc instanceof com.chartboost.sdk.internal.Networking.okhttp.a) {
                                                                                                }
                                                                                                if (r11 != 0) {
                                                                                                }
                                                                                                xb.b("Partial download failed: url=" + url2 + str + str6 + str3 + ref$LongRef7.element + ", errorCategory=" + str15 + str2 + r11 + ", errorType=" + exc.getClass().getSimpleName() + ", message=" + exc.getMessage(), exc);
                                                                                                eVar2.b = str7;
                                                                                                eVar2.c = exc;
                                                                                                eVar2.d = null;
                                                                                                eVar2.e = null;
                                                                                                eVar2.f = null;
                                                                                                eVar2.g = null;
                                                                                                eVar2.j = 3;
                                                                                                if (zdVar.a(file9, eVar2) == coroutine_suspended) {
                                                                                                }
                                                                                            }
                                                                                        } catch (CancellationException e8) {
                                                                                            e = e8;
                                                                                            ref$LongRef4 = ref$LongRef10;
                                                                                            file5 = file5;
                                                                                            r5 = okhttp3CallExecute;
                                                                                            file7 = file5;
                                                                                            ref$LongRef6 = ref$LongRef4;
                                                                                            zdVar2 = this;
                                                                                            str4 = str3;
                                                                                            str5 = str;
                                                                                            Response response422 = r5;
                                                                                            str8 = str18;
                                                                                            response2 = response422;
                                                                                            file10 = file7;
                                                                                            ref$LongRef8 = ref$LongRef6;
                                                                                            xb.e("Partial download cancelled: url=" + url3 + str5 + str8 + str4 + ref$LongRef8.element, null, 2, null);
                                                                                            eVar2.b = response2;
                                                                                            eVar2.c = e;
                                                                                            eVar2.d = null;
                                                                                            eVar2.e = null;
                                                                                            eVar2.f = null;
                                                                                            eVar2.g = null;
                                                                                            eVar2.j = 2;
                                                                                            if (zdVar2.a(file10, eVar2) != coroutine_suspended) {
                                                                                            }
                                                                                        } catch (Exception e9) {
                                                                                            e = e9;
                                                                                            ref$LongRef4 = ref$LongRef10;
                                                                                            file5 = file5;
                                                                                            r5 = okhttp3CallExecute;
                                                                                            str17 = null;
                                                                                            file6 = file5;
                                                                                            ref$LongRef5 = ref$LongRef4;
                                                                                            zdVar = this;
                                                                                            url2 = url3;
                                                                                            exc = e;
                                                                                            str6 = str18;
                                                                                            str7 = r5;
                                                                                            file9 = file6;
                                                                                            ref$LongRef7 = ref$LongRef5;
                                                                                            if (exc instanceof com.chartboost.sdk.internal.Networking.okhttp.a) {
                                                                                            }
                                                                                            if (exc instanceof com.chartboost.sdk.internal.Networking.okhttp.a) {
                                                                                            }
                                                                                            if (r11 != 0) {
                                                                                            }
                                                                                            xb.b("Partial download failed: url=" + url2 + str + str6 + str3 + ref$LongRef7.element + ", errorCategory=" + str15 + str2 + r11 + ", errorType=" + exc.getClass().getSimpleName() + ", message=" + exc.getMessage(), exc);
                                                                                            eVar2.b = str7;
                                                                                            eVar2.c = exc;
                                                                                            eVar2.d = null;
                                                                                            eVar2.e = null;
                                                                                            eVar2.f = null;
                                                                                            eVar2.g = null;
                                                                                            eVar2.j = 3;
                                                                                            if (zdVar.a(file9, eVar2) == coroutine_suspended) {
                                                                                            }
                                                                                        }
                                                                                        try {
                                                                                            eVar2.g = ref$LongRef4;
                                                                                            eVar2.j = 1;
                                                                                            if (BuildersKt.withContext(coroutineDispatcher, fVar, eVar2) == coroutine_suspended) {
                                                                                                return coroutine_suspended;
                                                                                            }
                                                                                            zdVar3 = this;
                                                                                            url2 = url3;
                                                                                            str14 = str18;
                                                                                            r4 = r5;
                                                                                            file11 = file5;
                                                                                            ref$LongRef9 = ref$LongRef4;
                                                                                        } catch (CancellationException e10) {
                                                                                            e = e10;
                                                                                            file7 = file5;
                                                                                            ref$LongRef6 = ref$LongRef4;
                                                                                            zdVar2 = this;
                                                                                            str4 = str3;
                                                                                            str5 = str;
                                                                                            Response response4222 = r5;
                                                                                            str8 = str18;
                                                                                            response2 = response4222;
                                                                                            file10 = file7;
                                                                                            ref$LongRef8 = ref$LongRef6;
                                                                                            xb.e("Partial download cancelled: url=" + url3 + str5 + str8 + str4 + ref$LongRef8.element, null, 2, null);
                                                                                            eVar2.b = response2;
                                                                                            eVar2.c = e;
                                                                                            eVar2.d = null;
                                                                                            eVar2.e = null;
                                                                                            eVar2.f = null;
                                                                                            eVar2.g = null;
                                                                                            eVar2.j = 2;
                                                                                            if (zdVar2.a(file10, eVar2) != coroutine_suspended) {
                                                                                            }
                                                                                        } catch (Exception e11) {
                                                                                            e = e11;
                                                                                            str17 = null;
                                                                                            file6 = file5;
                                                                                            ref$LongRef5 = ref$LongRef4;
                                                                                            zdVar = this;
                                                                                            url2 = url3;
                                                                                            exc = e;
                                                                                            str6 = str18;
                                                                                            str7 = r5;
                                                                                            file9 = file6;
                                                                                            ref$LongRef7 = ref$LongRef5;
                                                                                            if (exc instanceof com.chartboost.sdk.internal.Networking.okhttp.a) {
                                                                                            }
                                                                                            if (exc instanceof com.chartboost.sdk.internal.Networking.okhttp.a) {
                                                                                            }
                                                                                            if (r11 != 0) {
                                                                                            }
                                                                                            xb.b("Partial download failed: url=" + url2 + str + str6 + str3 + ref$LongRef7.element + ", errorCategory=" + str15 + str2 + r11 + ", errorType=" + exc.getClass().getSimpleName() + ", message=" + exc.getMessage(), exc);
                                                                                            eVar2.b = str7;
                                                                                            eVar2.c = exc;
                                                                                            eVar2.d = null;
                                                                                            eVar2.e = null;
                                                                                            eVar2.f = null;
                                                                                            eVar2.g = null;
                                                                                            eVar2.j = 3;
                                                                                            if (zdVar.a(file9, eVar2) == coroutine_suspended) {
                                                                                            }
                                                                                        }
                                                                                    } catch (CancellationException e12) {
                                                                                        e = e12;
                                                                                        ref$LongRef4 = ref$LongRef10;
                                                                                        str18 = str18;
                                                                                        file5 = file5;
                                                                                        r5 = okhttp3CallExecute;
                                                                                        file7 = file5;
                                                                                        ref$LongRef6 = ref$LongRef4;
                                                                                        zdVar2 = this;
                                                                                        str4 = str3;
                                                                                        str5 = str;
                                                                                        Response response42222 = r5;
                                                                                        str8 = str18;
                                                                                        response2 = response42222;
                                                                                        file10 = file7;
                                                                                        ref$LongRef8 = ref$LongRef6;
                                                                                        xb.e("Partial download cancelled: url=" + url3 + str5 + str8 + str4 + ref$LongRef8.element, null, 2, null);
                                                                                        eVar2.b = response2;
                                                                                        eVar2.c = e;
                                                                                        eVar2.d = null;
                                                                                        eVar2.e = null;
                                                                                        eVar2.f = null;
                                                                                        eVar2.g = null;
                                                                                        eVar2.j = 2;
                                                                                        if (zdVar2.a(file10, eVar2) != coroutine_suspended) {
                                                                                        }
                                                                                    } catch (Exception e13) {
                                                                                        e = e13;
                                                                                        ref$LongRef4 = ref$LongRef10;
                                                                                        str18 = str18;
                                                                                        file5 = file5;
                                                                                        r5 = okhttp3CallExecute;
                                                                                        str17 = null;
                                                                                        file6 = file5;
                                                                                        ref$LongRef5 = ref$LongRef4;
                                                                                        zdVar = this;
                                                                                        url2 = url3;
                                                                                        exc = e;
                                                                                        str6 = str18;
                                                                                        str7 = r5;
                                                                                        file9 = file6;
                                                                                        ref$LongRef7 = ref$LongRef5;
                                                                                        if (exc instanceof com.chartboost.sdk.internal.Networking.okhttp.a) {
                                                                                        }
                                                                                        if (exc instanceof com.chartboost.sdk.internal.Networking.okhttp.a) {
                                                                                        }
                                                                                        if (r11 != 0) {
                                                                                        }
                                                                                        xb.b("Partial download failed: url=" + url2 + str + str6 + str3 + ref$LongRef7.element + ", errorCategory=" + str15 + str2 + r11 + ", errorType=" + exc.getClass().getSimpleName() + ", message=" + exc.getMessage(), exc);
                                                                                        eVar2.b = str7;
                                                                                        eVar2.c = exc;
                                                                                        eVar2.d = null;
                                                                                        eVar2.e = null;
                                                                                        eVar2.f = null;
                                                                                        eVar2.g = null;
                                                                                        eVar2.j = 3;
                                                                                        if (zdVar.a(file9, eVar2) == coroutine_suspended) {
                                                                                        }
                                                                                    }
                                                                                } catch (Throwable th) {
                                                                                    th = th;
                                                                                    r5 = okhttp3CallExecute;
                                                                                    response = r5;
                                                                                    if (response != null && (okhttp3Response_body = ChartboostNetworkBridge.okhttp3Response_body(response)) != null) {
                                                                                        okhttp3Response_body.close();
                                                                                    }
                                                                                    throw th;
                                                                                }
                                                                            } catch (CancellationException e14) {
                                                                                e = e14;
                                                                                file5 = file;
                                                                            } catch (Exception e15) {
                                                                                e = e15;
                                                                                file5 = file;
                                                                            }
                                                                        } catch (Exception e16) {
                                                                            e = e16;
                                                                            file8 = file;
                                                                            str17 = null;
                                                                            str3 = ", bytesDownloaded=";
                                                                            str = ", range=";
                                                                            str2 = ", httpCode=";
                                                                            r5 = okhttp3CallExecute;
                                                                            ref$LongRef5 = ref$LongRef10;
                                                                            file6 = file8;
                                                                            zdVar = this;
                                                                            url2 = url3;
                                                                            exc = e;
                                                                            str6 = str18;
                                                                            str7 = r5;
                                                                            file9 = file6;
                                                                            ref$LongRef7 = ref$LongRef5;
                                                                            if (exc instanceof com.chartboost.sdk.internal.Networking.okhttp.a) {
                                                                                str15 = "HTTP_ERROR";
                                                                            } else {
                                                                                str15 = exc instanceof IOException ? "IO_ERROR" : "UNEXPECTED";
                                                                            }
                                                                            ?? r11 = exc instanceof com.chartboost.sdk.internal.Networking.okhttp.a ? (com.chartboost.sdk.internal.Networking.okhttp.a) exc : str17;
                                                                            Object boxInt = r11 != 0 ? Boxing.boxInt(r11.b()) : str17;
                                                                            xb.b("Partial download failed: url=" + url2 + str + str6 + str3 + ref$LongRef7.element + ", errorCategory=" + str15 + str2 + boxInt + ", errorType=" + exc.getClass().getSimpleName() + ", message=" + exc.getMessage(), exc);
                                                                            eVar2.b = str7;
                                                                            eVar2.c = exc;
                                                                            eVar2.d = null;
                                                                            eVar2.e = null;
                                                                            eVar2.f = null;
                                                                            eVar2.g = null;
                                                                            eVar2.j = 3;
                                                                            if (zdVar.a(file9, eVar2) == coroutine_suspended) {
                                                                                return coroutine_suspended;
                                                                            }
                                                                            r32 = str7;
                                                                            if (exc instanceof IOException) {
                                                                            }
                                                                            Result.Companion companion4 = Result.INSTANCE;
                                                                            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(exc));
                                                                            if (r32 != null) {
                                                                            }
                                                                            return m8023constructorimpl;
                                                                        }
                                                                    } else {
                                                                        throw new IOException("Response body was null for " + url3);
                                                                    }
                                                                }
                                                            } catch (Exception e17) {
                                                                e = e17;
                                                            }
                                                        } catch (CancellationException e18) {
                                                            e = e18;
                                                        }
                                                    } else {
                                                        com.chartboost.sdk.internal.Networking.okhttp.a b2 = com.chartboost.sdk.internal.Networking.okhttp.a.c.b(okhttp3CallExecute.code());
                                                        String url4 = url.toString();
                                                        Intrinsics.checkNotNullExpressionValue(url4, "toString(...)");
                                                        throw h9.a(b2, url4);
                                                    }
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                }
                                            } catch (CancellationException e19) {
                                                e = e19;
                                                file7 = isSuccessful;
                                                ref$LongRef6 = okhttp3CallExecute;
                                            } catch (Exception e20) {
                                                e = e20;
                                                file6 = isSuccessful;
                                                ref$LongRef5 = okhttp3CallExecute;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            r5 = okhttp3CallExecute;
                                        }
                                    } catch (CancellationException e21) {
                                        e = e21;
                                        file5 = file;
                                        r5 = okhttp3CallExecute;
                                        str3 = ", bytesDownloaded=";
                                        str = ", range=";
                                    } catch (Exception e22) {
                                        e = e22;
                                        file5 = file;
                                        r5 = okhttp3CallExecute;
                                        str2 = ", httpCode=";
                                        str3 = ", bytesDownloaded=";
                                        str = ", range=";
                                    }
                                } catch (CancellationException e23) {
                                    e = e23;
                                    file4 = file;
                                    str9 = ", bytesDownloaded=";
                                    str10 = ", range=";
                                    ref$LongRef3 = ref$LongRef10;
                                    str5 = str10;
                                    str4 = str9;
                                    file3 = file4;
                                    ref$LongRef2 = ref$LongRef3;
                                    zdVar2 = this;
                                    str8 = str18;
                                    response2 = null;
                                    file10 = file3;
                                    ref$LongRef8 = ref$LongRef2;
                                    xb.e("Partial download cancelled: url=" + url3 + str5 + str8 + str4 + ref$LongRef8.element, null, 2, null);
                                    eVar2.b = response2;
                                    eVar2.c = e;
                                    eVar2.d = null;
                                    eVar2.e = null;
                                    eVar2.f = null;
                                    eVar2.g = null;
                                    eVar2.j = 2;
                                    if (zdVar2.a(file10, eVar2) != coroutine_suspended) {
                                    }
                                } catch (Exception e24) {
                                    e = e24;
                                    file2 = file;
                                    str17 = null;
                                    str2 = ", httpCode=";
                                    str3 = ", bytesDownloaded=";
                                    str = ", range=";
                                    ref$LongRef = ref$LongRef10;
                                    zdVar = this;
                                    url2 = url3;
                                    exc = e;
                                    str6 = str18;
                                    str7 = str17;
                                    file9 = file2;
                                    ref$LongRef7 = ref$LongRef;
                                    if (exc instanceof com.chartboost.sdk.internal.Networking.okhttp.a) {
                                    }
                                    if (exc instanceof com.chartboost.sdk.internal.Networking.okhttp.a) {
                                    }
                                    if (r11 != 0) {
                                    }
                                    xb.b("Partial download failed: url=" + url2 + str + str6 + str3 + ref$LongRef7.element + ", errorCategory=" + str15 + str2 + boxInt + ", errorType=" + exc.getClass().getSimpleName() + ", message=" + exc.getMessage(), exc);
                                    eVar2.b = str7;
                                    eVar2.c = exc;
                                    eVar2.d = null;
                                    eVar2.e = null;
                                    eVar2.f = null;
                                    eVar2.g = null;
                                    eVar2.j = 3;
                                    if (zdVar.a(file9, eVar2) == coroutine_suspended) {
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    r10 = null;
                                    response = r10;
                                    if (response != null) {
                                        okhttp3Response_body.close();
                                    }
                                    throw th;
                                }
                            } catch (Exception e25) {
                                e = e25;
                                file2 = file;
                                str2 = ", httpCode=";
                                str3 = ", bytesDownloaded=";
                                str = ", range=";
                                ref$LongRef = ref$LongRef10;
                                str17 = null;
                            } catch (Throwable th5) {
                                th = th5;
                                r10 = null;
                            }
                        } else {
                            if (r3 != 1) {
                                if (r3 == 2) {
                                    cancellationException = (CancellationException) eVar2.c;
                                    response3 = (Response) eVar2.b;
                                    ResultKt.throwOnFailure(obj);
                                    Result.Companion companion32 = Result.INSTANCE;
                                    m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(cancellationException));
                                    if (response3 != null) {
                                        okhttp3Response_body2 = ChartboostNetworkBridge.okhttp3Response_body(response3);
                                    }
                                    return m8023constructorimpl;
                                }
                                if (r3 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                exc = (Exception) eVar2.c;
                                r32 = (Response) eVar2.b;
                                ResultKt.throwOnFailure(obj);
                                if (exc instanceof IOException) {
                                    String message = exc.getMessage();
                                    if (message != null) {
                                        str16 = message.toLowerCase(Locale.ROOT);
                                        Intrinsics.checkNotNullExpressionValue(str16, "toLowerCase(...)");
                                    }
                                    str16 = "";
                                    if (StringsKt.contains$default((CharSequence) str16, (CharSequence) "no space left", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str16, (CharSequence) "insufficient storage", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str16, (CharSequence) "disk full", false, 2, (Object) null)) {
                                        exc = ChartboostError.Load.NoStorage.INSTANCE;
                                    }
                                }
                                Result.Companion companion42 = Result.INSTANCE;
                                m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(exc));
                                if (r32 != null) {
                                    okhttp3Response_body2 = ChartboostNetworkBridge.okhttp3Response_body(r32);
                                }
                                return m8023constructorimpl;
                            }
                            Ref$LongRef ref$LongRef11 = (Ref$LongRef) eVar2.g;
                            ?? r44 = (Response) eVar2.f;
                            String str19 = (String) eVar2.e;
                            File file12 = (File) eVar2.d;
                            url2 = (URL) eVar2.c;
                            zd zdVar4 = (zd) eVar2.b;
                            try {
                                ResultKt.throwOnFailure(obj);
                                str13 = ")";
                                str14 = str19;
                                str2 = ", httpCode=";
                                str3 = ", bytesDownloaded=";
                                str = ", range=";
                                ref$LongRef9 = ref$LongRef11;
                                file11 = file12;
                                str12 = " (";
                                r4 = r44;
                                zdVar3 = zdVar4;
                            } catch (CancellationException e26) {
                                e = e26;
                                str8 = str19;
                                url3 = url2;
                                str4 = ", bytesDownloaded=";
                                str5 = ", range=";
                                ref$LongRef8 = ref$LongRef11;
                                file10 = file12;
                                response2 = r44;
                                zdVar2 = zdVar4;
                                xb.e("Partial download cancelled: url=" + url3 + str5 + str8 + str4 + ref$LongRef8.element, null, 2, null);
                                eVar2.b = response2;
                                eVar2.c = e;
                                eVar2.d = null;
                                eVar2.e = null;
                                eVar2.f = null;
                                eVar2.g = null;
                                eVar2.j = 2;
                                if (zdVar2.a(file10, eVar2) != coroutine_suspended) {
                                }
                            } catch (Exception e27) {
                                exc = e27;
                                str6 = str19;
                                str2 = ", httpCode=";
                                str3 = ", bytesDownloaded=";
                                str = ", range=";
                                str17 = null;
                                ref$LongRef7 = ref$LongRef11;
                                file9 = file12;
                                str7 = r44;
                                zdVar = zdVar4;
                                if (exc instanceof com.chartboost.sdk.internal.Networking.okhttp.a) {
                                }
                                if (exc instanceof com.chartboost.sdk.internal.Networking.okhttp.a) {
                                }
                                if (r11 != 0) {
                                }
                                xb.b("Partial download failed: url=" + url2 + str + str6 + str3 + ref$LongRef7.element + ", errorCategory=" + str15 + str2 + boxInt + ", errorType=" + exc.getClass().getSimpleName() + ", message=" + exc.getMessage(), exc);
                                eVar2.b = str7;
                                eVar2.c = exc;
                                eVar2.d = null;
                                eVar2.e = null;
                                eVar2.f = null;
                                eVar2.g = null;
                                eVar2.j = 3;
                                if (zdVar.a(file9, eVar2) == coroutine_suspended) {
                                }
                            }
                        }
                        str17 = null;
                        xb.d("OkHttp partial download complete for " + url2 + str12 + ref$LongRef9.element + " bytes, range: " + str14 + str13, null, 2, null);
                        Result.Companion companion5 = Result.INSTANCE;
                        m8023constructorimpl = Result.m8023constructorimpl(Boxing.boxLong(ref$LongRef9.element));
                        if (r4 != 0) {
                            okhttp3Response_body2 = ChartboostNetworkBridge.okhttp3Response_body(r4);
                        }
                        return m8023constructorimpl;
                    }
                }
                if (r3 != 0) {
                }
                str17 = null;
                xb.d("OkHttp partial download complete for " + url2 + str12 + ref$LongRef9.element + " bytes, range: " + str14 + str13, null, 2, null);
                Result.Companion companion52 = Result.INSTANCE;
                m8023constructorimpl = Result.m8023constructorimpl(Boxing.boxLong(ref$LongRef9.element));
                if (r4 != 0) {
                }
                return m8023constructorimpl;
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Throwable th7) {
            th = th7;
            response = r3;
        }
        eVar = new e(continuation);
        response = r42;
        e eVar22 = eVar;
        Object obj2 = eVar22.h;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r3 = eVar22.j;
        String str172 = " (";
    }

    public final Object a(File file, Continuation continuation) {
        Object withContext = BuildersKt.withContext(NonCancellable.INSTANCE.plus(this.b), new b(file, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }
}
