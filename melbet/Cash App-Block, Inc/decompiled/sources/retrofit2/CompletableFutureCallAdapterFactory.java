package retrofit2;

import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import retrofit2.CallAdapter;

/* loaded from: classes3.dex */
public final class CompletableFutureCallAdapterFactory extends CallAdapter.Factory {
    public final /* synthetic */ int $r8$classId;

    /* loaded from: classes9.dex */
    public final class CallCancelCompletableFuture extends CompletableFuture {
        public final Call call;

        public CallCancelCompletableFuture(Call call) {
            this.call = call;
        }

        @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
        public final boolean cancel(boolean z) {
            if (z) {
                this.call.cancel();
            }
            return super.cancel(z);
        }
    }

    public /* synthetic */ CompletableFutureCallAdapterFactory(int i) {
        this.$r8$classId = i;
    }

    @Override // retrofit2.CallAdapter.Factory
    public final CallAdapter get(Type type2, Annotation[] annotationArr, Retrofit retrofit) {
        int i = 0;
        switch (this.$r8$classId) {
            case 0:
                if (CallAdapter.Factory.getRawType(type2) == CompletableFuture.class) {
                    if (!(type2 instanceof ParameterizedType)) {
                        a$$ExternalSyntheticBUOutline0.m$1("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
                        break;
                    } else {
                        Type parameterUpperBound = CallAdapter.Factory.getParameterUpperBound(0, (ParameterizedType) type2);
                        if (CallAdapter.Factory.getRawType(parameterUpperBound) == Response.class) {
                            if (!(parameterUpperBound instanceof ParameterizedType)) {
                                a$$ExternalSyntheticBUOutline0.m$1("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
                                break;
                            } else {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                break;
            default:
                type2.getClass();
                annotationArr.getClass();
                Class<?> rawType = CallAdapter.Factory.getRawType(type2);
                rawType.getClass();
                if (rawType == Call.class) {
                    if (!(type2 instanceof ParameterizedType)) {
                        a$$ExternalSyntheticBUOutline0.m$1("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
                        break;
                    } else {
                        Type parameterUpperBound2 = CallAdapter.Factory.getParameterUpperBound(0, (ParameterizedType) type2);
                        parameterUpperBound2.getClass();
                        Class<?> rawType2 = CallAdapter.Factory.getRawType(parameterUpperBound2);
                        rawType2.getClass();
                        if (rawType2.equals(ApiResult.class)) {
                            if (!(parameterUpperBound2 instanceof ParameterizedType)) {
                                a$$ExternalSyntheticBUOutline0.m$1("ApiResult must be parameterized as ApiResult<Foo> or ApiResult<? extends Foo>");
                                break;
                            } else {
                                Type parameterUpperBound3 = CallAdapter.Factory.getParameterUpperBound(0, (ParameterizedType) parameterUpperBound2);
                                parameterUpperBound3.getClass();
                                break;
                            }
                        }
                    }
                }
                break;
        }
        return null;
    }
}
