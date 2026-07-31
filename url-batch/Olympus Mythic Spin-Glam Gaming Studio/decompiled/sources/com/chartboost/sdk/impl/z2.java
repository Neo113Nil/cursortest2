package com.chartboost.sdk.impl;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.safedk.android.internal.partials.ChartboostNetworkBridge;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.TimeoutKt;

/* loaded from: classes10.dex */
public final class z2 {
    public final CoroutineDispatcher a;
    public final Function1 b;
    public final Function1 c;
    public final long d;

    public static final class a extends Lambda implements Function1 {
        public static final a b = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final URL invoke(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new URL(it);
        }
    }

    public static final class b extends Lambda implements Function1 {
        public static final b b = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bitmap invoke(InputStream it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return BitmapFactory.decodeStream(it);
        }
    }

    public static final class c extends SuspendLambda implements Function2 {
        public Object b;
        public Object c;
        public Object d;
        public int e;
        public final /* synthetic */ String g;

        public static final class a extends SuspendLambda implements Function2 {
            public int b;
            public final /* synthetic */ Ref$ObjectRef c;
            public final /* synthetic */ URL d;
            public final /* synthetic */ Ref$ObjectRef e;
            public final /* synthetic */ Ref$ObjectRef f;
            public final /* synthetic */ z2 g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Ref$ObjectRef ref$ObjectRef, URL url, Ref$ObjectRef ref$ObjectRef2, Ref$ObjectRef ref$ObjectRef3, z2 z2Var, Continuation continuation) {
                super(2, continuation);
                this.c = ref$ObjectRef;
                this.d = url;
                this.e = ref$ObjectRef2;
                this.f = ref$ObjectRef3;
                this.g = z2Var;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.c, this.d, this.e, this.f, this.g, continuation);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v10, types: [T, android.graphics.Bitmap] */
            /* JADX WARN: Type inference failed for: r0v4, types: [T, java.net.URLConnection, javax.net.ssl.HttpsURLConnection] */
            /* JADX WARN: Type inference failed for: r2v1, types: [T, java.io.InputStream] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                ?? r0;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.b != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Ref$ObjectRef ref$ObjectRef = this.c;
                URLConnection openConnection = this.d.openConnection();
                Intrinsics.checkNotNull(openConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                ?? r02 = (HttpsURLConnection) openConnection;
                Ref$ObjectRef ref$ObjectRef2 = this.f;
                r02.setDoInput(true);
                ref$ObjectRef2.element = ChartboostNetworkBridge.urlConnectionGetInputStream(r02);
                ref$ObjectRef.element = r02;
                Ref$ObjectRef ref$ObjectRef3 = this.e;
                InputStream inputStream = (InputStream) this.f.element;
                if (inputStream == null || (r0 = (Bitmap) this.g.c.invoke(inputStream)) == 0) {
                    throw new IOException("Bitmap decoded to null");
                }
                ref$ObjectRef3.element = r0;
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, Continuation continuation) {
            super(2, continuation);
            this.g = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return z2.this.new c(this.g, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0079, code lost:
        
            if (r15 != null) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x009b, code lost:
        
            return r2.element;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0096, code lost:
        
            com.safedk.android.internal.partials.ChartboostNetworkBridge.httpUrlConnectionDisconnect(r15);
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0094, code lost:
        
            if (r15 != null) goto L35;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:21:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00a3  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00ac  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Ref$ObjectRef ref$ObjectRef;
            Ref$ObjectRef ref$ObjectRef2;
            Ref$ObjectRef ref$ObjectRef3;
            Exception e;
            Ref$ObjectRef ref$ObjectRef4;
            InputStream inputStream;
            HttpsURLConnection httpsURLConnection;
            InputStream inputStream2;
            HttpsURLConnection httpsURLConnection2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.e;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Ref$ObjectRef ref$ObjectRef5 = new Ref$ObjectRef();
                ref$ObjectRef = new Ref$ObjectRef();
                ref$ObjectRef2 = new Ref$ObjectRef();
                try {
                    URL url = (URL) z2.this.b.invoke(this.g);
                    long j = z2.this.d;
                    a aVar = new a(ref$ObjectRef, url, ref$ObjectRef5, ref$ObjectRef2, z2.this, null);
                    this.b = ref$ObjectRef5;
                    this.c = ref$ObjectRef;
                    this.d = ref$ObjectRef2;
                    this.e = 1;
                    if (TimeoutKt.withTimeout(j, aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    ref$ObjectRef3 = ref$ObjectRef5;
                    ref$ObjectRef4 = ref$ObjectRef2;
                } catch (Exception e2) {
                    ref$ObjectRef3 = ref$ObjectRef5;
                    e = e2;
                    ref$ObjectRef4 = ref$ObjectRef2;
                    xb.e("Unable to download the info icon image", e);
                    inputStream2 = (InputStream) ref$ObjectRef4.element;
                    if (inputStream2 != null) {
                    }
                    httpsURLConnection2 = (HttpsURLConnection) ref$ObjectRef.element;
                } catch (Throwable th) {
                    th = th;
                    inputStream = (InputStream) ref$ObjectRef2.element;
                    if (inputStream != null) {
                    }
                    httpsURLConnection = (HttpsURLConnection) ref$ObjectRef.element;
                    if (httpsURLConnection != null) {
                    }
                    throw th;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ref$ObjectRef4 = (Ref$ObjectRef) this.d;
                ref$ObjectRef = (Ref$ObjectRef) this.c;
                ref$ObjectRef3 = (Ref$ObjectRef) this.b;
                try {
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Exception e3) {
                        e = e3;
                        xb.e("Unable to download the info icon image", e);
                        inputStream2 = (InputStream) ref$ObjectRef4.element;
                        if (inputStream2 != null) {
                            inputStream2.close();
                        }
                        httpsURLConnection2 = (HttpsURLConnection) ref$ObjectRef.element;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    ref$ObjectRef2 = ref$ObjectRef4;
                    inputStream = (InputStream) ref$ObjectRef2.element;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    httpsURLConnection = (HttpsURLConnection) ref$ObjectRef.element;
                    if (httpsURLConnection != null) {
                        ChartboostNetworkBridge.httpUrlConnectionDisconnect(httpsURLConnection);
                    }
                    throw th;
                }
            }
            InputStream inputStream3 = (InputStream) ref$ObjectRef4.element;
            if (inputStream3 != null) {
                inputStream3.close();
            }
            httpsURLConnection2 = (HttpsURLConnection) ref$ObjectRef.element;
        }
    }

    public z2(CoroutineDispatcher ioDispatcher, Function1 urlFactory, Function1 bitmapFactory) {
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        Intrinsics.checkNotNullParameter(urlFactory, "urlFactory");
        Intrinsics.checkNotNullParameter(bitmapFactory, "bitmapFactory");
        this.a = ioDispatcher;
        this.b = urlFactory;
        this.c = bitmapFactory;
        this.d = 1000L;
    }

    public /* synthetic */ z2(CoroutineDispatcher coroutineDispatcher, Function1 function1, Function1 function12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Dispatchers.getIO() : coroutineDispatcher, (i & 2) != 0 ? a.b : function1, (i & 4) != 0 ? b.b : function12);
    }

    public final Object a(String str, Continuation continuation) {
        return BuildersKt.withContext(this.a, new c(str, null), continuation);
    }
}
