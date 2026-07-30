package retrofit2;

import androidx.exifinterface.media.ExifInterface;
import java.lang.reflect.Method;
import kotlin.KotlinNullPointerException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlinx.coroutines.t0;

/* loaded from: classes5.dex */
public abstract class KotlinExtensions {

    public static final class a implements retrofit2.d {
        final /* synthetic */ kotlinx.coroutines.n $continuation;

        a(kotlinx.coroutines.n nVar) {
            this.$continuation = nVar;
        }

        @Override // retrofit2.d
        public void onFailure(retrofit2.b call, Throwable t7) {
            kotlin.jvm.internal.s.checkParameterIsNotNull(call, "call");
            kotlin.jvm.internal.s.checkParameterIsNotNull(t7, "t");
            kotlinx.coroutines.n nVar = this.$continuation;
            Result.a aVar = Result.Companion;
            nVar.resumeWith(Result.m348constructorimpl(y5.g.createFailure(t7)));
        }

        @Override // retrofit2.d
        public void onResponse(retrofit2.b call, u response) {
            kotlin.jvm.internal.s.checkParameterIsNotNull(call, "call");
            kotlin.jvm.internal.s.checkParameterIsNotNull(response, "response");
            if (!response.isSuccessful()) {
                kotlinx.coroutines.n nVar = this.$continuation;
                HttpException httpException = new HttpException(response);
                Result.a aVar = Result.Companion;
                nVar.resumeWith(Result.m348constructorimpl(y5.g.createFailure(httpException)));
                return;
            }
            Object body = response.body();
            if (body != null) {
                this.$continuation.resumeWith(Result.m348constructorimpl(body));
                return;
            }
            Object tag = call.request().tag(n.class);
            if (tag == null) {
                kotlin.jvm.internal.s.throwNpe();
            }
            kotlin.jvm.internal.s.checkExpressionValueIsNotNull(tag, "call.request().tag(Invocation::class.java)!!");
            Method method = ((n) tag).method();
            StringBuilder sb = new StringBuilder();
            sb.append("Response from ");
            kotlin.jvm.internal.s.checkExpressionValueIsNotNull(method, "method");
            Class<?> declaringClass = method.getDeclaringClass();
            kotlin.jvm.internal.s.checkExpressionValueIsNotNull(declaringClass, "method.declaringClass");
            sb.append(declaringClass.getName());
            sb.append('.');
            sb.append(method.getName());
            sb.append(" was null but response body type was declared as non-null");
            KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException(sb.toString());
            kotlinx.coroutines.n nVar2 = this.$continuation;
            Result.a aVar2 = Result.Companion;
            nVar2.resumeWith(Result.m348constructorimpl(y5.g.createFailure(kotlinNullPointerException)));
        }
    }

    public static final class b implements retrofit2.d {
        final /* synthetic */ kotlinx.coroutines.n $continuation;

        b(kotlinx.coroutines.n nVar) {
            this.$continuation = nVar;
        }

        @Override // retrofit2.d
        public void onFailure(retrofit2.b call, Throwable t7) {
            kotlin.jvm.internal.s.checkParameterIsNotNull(call, "call");
            kotlin.jvm.internal.s.checkParameterIsNotNull(t7, "t");
            kotlinx.coroutines.n nVar = this.$continuation;
            Result.a aVar = Result.Companion;
            nVar.resumeWith(Result.m348constructorimpl(y5.g.createFailure(t7)));
        }

        @Override // retrofit2.d
        public void onResponse(retrofit2.b call, u response) {
            kotlin.jvm.internal.s.checkParameterIsNotNull(call, "call");
            kotlin.jvm.internal.s.checkParameterIsNotNull(response, "response");
            if (response.isSuccessful()) {
                this.$continuation.resumeWith(Result.m348constructorimpl(response.body()));
                return;
            }
            kotlinx.coroutines.n nVar = this.$continuation;
            HttpException httpException = new HttpException(response);
            Result.a aVar = Result.Companion;
            nVar.resumeWith(Result.m348constructorimpl(y5.g.createFailure(httpException)));
        }
    }

    public static final class c implements retrofit2.d {
        final /* synthetic */ kotlinx.coroutines.n $continuation;

        c(kotlinx.coroutines.n nVar) {
            this.$continuation = nVar;
        }

        @Override // retrofit2.d
        public void onFailure(retrofit2.b call, Throwable t7) {
            kotlin.jvm.internal.s.checkParameterIsNotNull(call, "call");
            kotlin.jvm.internal.s.checkParameterIsNotNull(t7, "t");
            kotlinx.coroutines.n nVar = this.$continuation;
            Result.a aVar = Result.Companion;
            nVar.resumeWith(Result.m348constructorimpl(y5.g.createFailure(t7)));
        }

        @Override // retrofit2.d
        public void onResponse(retrofit2.b call, u response) {
            kotlin.jvm.internal.s.checkParameterIsNotNull(call, "call");
            kotlin.jvm.internal.s.checkParameterIsNotNull(response, "response");
            this.$continuation.resumeWith(Result.m348constructorimpl(response));
        }
    }

    static final class d implements Runnable {
        final /* synthetic */ kotlin.coroutines.c $continuation;
        final /* synthetic */ Exception $this_suspendAndThrow$inlined;

        d(kotlin.coroutines.c cVar, Exception exc) {
            this.$continuation = cVar;
            this.$this_suspendAndThrow$inlined = exc;
        }

        @Override // java.lang.Runnable
        public final void run() {
            kotlin.coroutines.c intercepted;
            intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(this.$continuation);
            Exception exc = this.$this_suspendAndThrow$inlined;
            Result.a aVar = Result.Companion;
            intercepted.resumeWith(Result.m348constructorimpl(y5.g.createFailure(exc)));
        }
    }

    public static final <T> Object await(final retrofit2.b bVar, kotlin.coroutines.c cVar) {
        kotlin.coroutines.c intercepted;
        Object coroutine_suspended;
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(cVar);
        kotlinx.coroutines.o oVar = new kotlinx.coroutines.o(intercepted, 1);
        oVar.invokeOnCancellation(new f6.l() { // from class: retrofit2.KotlinExtensions$await$$inlined$suspendCancellableCoroutine$lambda$1
            {
                super(1);
            }

            @Override // f6.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return y5.w.INSTANCE;
            }

            public final void invoke(Throwable th) {
                b.this.cancel();
            }
        });
        bVar.enqueue(new a(oVar));
        Object result = oVar.getResult();
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        if (result == coroutine_suspended) {
            kotlin.coroutines.jvm.internal.f.probeCoroutineSuspended(cVar);
        }
        return result;
    }

    public static final <T> Object awaitNullable(final retrofit2.b bVar, kotlin.coroutines.c cVar) {
        kotlin.coroutines.c intercepted;
        Object coroutine_suspended;
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(cVar);
        kotlinx.coroutines.o oVar = new kotlinx.coroutines.o(intercepted, 1);
        oVar.invokeOnCancellation(new f6.l() { // from class: retrofit2.KotlinExtensions$await$$inlined$suspendCancellableCoroutine$lambda$2
            {
                super(1);
            }

            @Override // f6.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return y5.w.INSTANCE;
            }

            public final void invoke(Throwable th) {
                b.this.cancel();
            }
        });
        bVar.enqueue(new b(oVar));
        Object result = oVar.getResult();
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        if (result == coroutine_suspended) {
            kotlin.coroutines.jvm.internal.f.probeCoroutineSuspended(cVar);
        }
        return result;
    }

    public static final <T> Object awaitResponse(final retrofit2.b bVar, kotlin.coroutines.c cVar) {
        kotlin.coroutines.c intercepted;
        Object coroutine_suspended;
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(cVar);
        kotlinx.coroutines.o oVar = new kotlinx.coroutines.o(intercepted, 1);
        oVar.invokeOnCancellation(new f6.l() { // from class: retrofit2.KotlinExtensions$awaitResponse$$inlined$suspendCancellableCoroutine$lambda$1
            {
                super(1);
            }

            @Override // f6.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return y5.w.INSTANCE;
            }

            public final void invoke(Throwable th) {
                b.this.cancel();
            }
        });
        bVar.enqueue(new c(oVar));
        Object result = oVar.getResult();
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        if (result == coroutine_suspended) {
            kotlin.coroutines.jvm.internal.f.probeCoroutineSuspended(cVar);
        }
        return result;
    }

    public static final /* synthetic */ <T> T create(v create) {
        kotlin.jvm.internal.s.checkParameterIsNotNull(create, "$this$create");
        kotlin.jvm.internal.s.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) create.create(Object.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object suspendAndThrow(Exception exc, kotlin.coroutines.c cVar) {
        KotlinExtensions$suspendAndThrow$1 kotlinExtensions$suspendAndThrow$1;
        Object coroutine_suspended;
        int i8;
        Object coroutine_suspended2;
        Object coroutine_suspended3;
        if (cVar instanceof KotlinExtensions$suspendAndThrow$1) {
            kotlinExtensions$suspendAndThrow$1 = (KotlinExtensions$suspendAndThrow$1) cVar;
            int i9 = kotlinExtensions$suspendAndThrow$1.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                kotlinExtensions$suspendAndThrow$1.label = i9 - Integer.MIN_VALUE;
                Object obj = kotlinExtensions$suspendAndThrow$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                i8 = kotlinExtensions$suspendAndThrow$1.label;
                if (i8 != 0) {
                    y5.g.throwOnFailure(obj);
                    kotlinExtensions$suspendAndThrow$1.L$0 = exc;
                    kotlinExtensions$suspendAndThrow$1.label = 1;
                    t0.getDefault().mo1293dispatch(kotlinExtensions$suspendAndThrow$1.getContext(), new d(kotlinExtensions$suspendAndThrow$1, exc));
                    coroutine_suspended2 = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                    coroutine_suspended3 = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                    if (coroutine_suspended2 == coroutine_suspended3) {
                        kotlin.coroutines.jvm.internal.f.probeCoroutineSuspended(kotlinExtensions$suspendAndThrow$1);
                    }
                    if (coroutine_suspended2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y5.g.throwOnFailure(obj);
                }
                return y5.w.INSTANCE;
            }
        }
        kotlinExtensions$suspendAndThrow$1 = new KotlinExtensions$suspendAndThrow$1(cVar);
        Object obj2 = kotlinExtensions$suspendAndThrow$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        i8 = kotlinExtensions$suspendAndThrow$1.label;
        if (i8 != 0) {
        }
        return y5.w.INSTANCE;
    }
}
