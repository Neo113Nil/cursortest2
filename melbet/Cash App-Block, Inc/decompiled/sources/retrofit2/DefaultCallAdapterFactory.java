package retrofit2;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.crypto.tink.KeysetHandle;
import com.squareup.util.logging.NoOpRetrofitLogger;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.ResponseBody;
import okhttp3.ResponseBody$Companion$asResponseBody$1;
import okio.RealBufferedSource;
import okio.Timeout;
import retrofit2.CallAdapter;
import retrofit2.OkHttpCall;

/* loaded from: classes3.dex */
public final class DefaultCallAdapterFactory extends CallAdapter.Factory {
    public final /* synthetic */ int $r8$classId;
    public final Object callbackExecutor;

    public /* synthetic */ DefaultCallAdapterFactory(Object obj, int i) {
        this.$r8$classId = i;
        this.callbackExecutor = obj;
    }

    @Override // retrofit2.CallAdapter.Factory
    public final CallAdapter get(Type type2, Annotation[] annotationArr, Retrofit retrofit) {
        int i = this.$r8$classId;
        Object obj = this.callbackExecutor;
        switch (i) {
            case 0:
                if (CallAdapter.Factory.getRawType(type2) != Call.class) {
                    return null;
                }
                if (type2 instanceof ParameterizedType) {
                    return new OkHttpCall.AnonymousClass1(24, Utils.getParameterUpperBound(0, (ParameterizedType) type2), Utils.isAnnotationPresent(annotationArr, SkipCallbackExecutor.class) ? null : (Executor) obj);
                }
                a$$ExternalSyntheticBUOutline0.m$3("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
                return null;
            default:
                return new KeysetHandle(13, retrofit.nextCallAdapter(this, type2, annotationArr), (NoOpRetrofitLogger) obj);
        }
    }

    public final class ExecutorCallbackCall implements Call {
        public final /* synthetic */ int $r8$classId;
        public final Object callbackExecutor;
        public final Call delegate;

        public /* synthetic */ ExecutorCallbackCall(Object obj, Call call, int i) {
            this.$r8$classId = i;
            this.callbackExecutor = obj;
            this.delegate = call;
        }

        @Override // retrofit2.Call
        public final void cancel() {
            switch (this.$r8$classId) {
                case 0:
                    this.delegate.cancel();
                    break;
                default:
                    this.delegate.cancel();
                    break;
            }
        }

        @Override // retrofit2.Call
        /* renamed from: clone */
        public final Call m2176clone() {
            int i = this.$r8$classId;
            Call call = this.delegate;
            Object obj = this.callbackExecutor;
            switch (i) {
                case 0:
                    return new ExecutorCallbackCall((Executor) obj, call.m2176clone(), 0);
                default:
                    return new ExecutorCallbackCall((NoOpRetrofitLogger) obj, call.m2176clone(), 1);
            }
        }

        @Override // retrofit2.Call
        public final void enqueue(Callback callback) {
            int i = this.$r8$classId;
            Call call = this.delegate;
            switch (i) {
                case 0:
                    call.enqueue(new FormBody.Builder(this, callback));
                    break;
                default:
                    call.enqueue(new KeysetHandle(this, callback));
                    break;
            }
        }

        @Override // retrofit2.Call
        public final Response execute() {
            int i = this.$r8$classId;
            Call call = this.delegate;
            switch (i) {
                case 0:
                    return call.execute();
                default:
                    try {
                        Response execute = call.execute();
                        logResponse(execute);
                        return execute;
                    } catch (Throwable th) {
                        if (!(th instanceof VirtualMachineError) && !(th instanceof ThreadDeath)) {
                            boolean z = th instanceof LinkageError;
                        }
                        throw th;
                    }
            }
        }

        @Override // retrofit2.Call
        public final boolean isCanceled() {
            switch (this.$r8$classId) {
            }
            return this.delegate.isCanceled();
        }

        @Override // retrofit2.Call
        public final boolean isExecuted() {
            switch (this.$r8$classId) {
            }
            return this.delegate.isExecuted();
        }

        public void logResponse(Response response) {
            if (response.rawResponse.isSuccessful) {
                return;
            }
            ResponseBody responseBody = response.errorBody;
            RealBufferedSource peek = responseBody.source().peek();
            MediaType contentType = responseBody.contentType();
            long contentLength = responseBody.contentLength();
            ResponseBody$Companion$asResponseBody$1 responseBody$Companion$asResponseBody$1 = ResponseBody.EMPTY;
            Response.error(new ResponseBody$Companion$asResponseBody$1(contentType, contentLength, peek), response.rawResponse);
        }

        @Override // retrofit2.Call
        public final Request request() {
            switch (this.$r8$classId) {
            }
            return this.delegate.request();
        }

        @Override // retrofit2.Call
        public final Timeout timeout() {
            switch (this.$r8$classId) {
            }
            return this.delegate.timeout();
        }

        public final /* bridge */ /* synthetic */ Object clone() {
            switch (this.$r8$classId) {
            }
            return m2176clone();
        }
    }
}
