package retrofit2.adapter.rxjava2;

import io.reactivex.Completable;
import io.reactivex.Flowable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import retrofit2.c;
import retrofit2.u;
import retrofit2.v;

/* loaded from: classes5.dex */
public final class g extends c.a {
    private final boolean isAsync;

    @Nullable
    private final Scheduler scheduler;

    private g(@Nullable Scheduler scheduler, boolean z7) {
        this.scheduler = scheduler;
        this.isAsync = z7;
    }

    public static g create() {
        return new g(null, false);
    }

    public static g createAsync() {
        return new g(null, true);
    }

    public static g createWithScheduler(Scheduler scheduler) {
        if (scheduler != null) {
            return new g(scheduler, false);
        }
        throw new NullPointerException("scheduler == null");
    }

    @Override // retrofit2.c.a
    @Nullable
    public retrofit2.c get(Type type, Annotation[] annotationArr, v vVar) {
        Type type2;
        boolean z7;
        boolean z8;
        Class<?> rawType = c.a.getRawType(type);
        if (rawType == Completable.class) {
            return new f(Void.class, this.scheduler, this.isAsync, false, true, false, false, false, true);
        }
        boolean z9 = rawType == Flowable.class;
        boolean z10 = rawType == Single.class;
        boolean z11 = rawType == Maybe.class;
        if (rawType != Observable.class && !z9 && !z10 && !z11) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            String str = !z9 ? !z10 ? z11 ? "Maybe" : "Observable" : "Single" : "Flowable";
            throw new IllegalStateException(str + " return type must be parameterized as " + str + "<Foo> or " + str + "<? extends Foo>");
        }
        Type parameterUpperBound = c.a.getParameterUpperBound(0, (ParameterizedType) type);
        Class<?> rawType2 = c.a.getRawType(parameterUpperBound);
        if (rawType2 == u.class) {
            if (!(parameterUpperBound instanceof ParameterizedType)) {
                throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
            }
            type2 = c.a.getParameterUpperBound(0, (ParameterizedType) parameterUpperBound);
            z7 = false;
        } else {
            if (rawType2 != d.class) {
                type2 = parameterUpperBound;
                z7 = false;
                z8 = true;
                return new f(type2, this.scheduler, this.isAsync, z7, z8, z9, z10, z11, false);
            }
            if (!(parameterUpperBound instanceof ParameterizedType)) {
                throw new IllegalStateException("Result must be parameterized as Result<Foo> or Result<? extends Foo>");
            }
            type2 = c.a.getParameterUpperBound(0, (ParameterizedType) parameterUpperBound);
            z7 = true;
        }
        z8 = false;
        return new f(type2, this.scheduler, this.isAsync, z7, z8, z9, z10, z11, false);
    }
}
