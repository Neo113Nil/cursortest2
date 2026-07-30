package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import okhttp3.Call;
import okhttp3.Response;
import retrofit2.z;

/* loaded from: classes5.dex */
abstract class m extends w {
    private final Call.Factory callFactory;
    private final t requestFactory;
    private final i responseConverter;

    static final class a extends m {
        private final retrofit2.c callAdapter;

        a(t tVar, Call.Factory factory, i iVar, retrofit2.c cVar) {
            super(tVar, factory, iVar);
            this.callAdapter = cVar;
        }

        @Override // retrofit2.m
        protected Object adapt(retrofit2.b bVar, Object[] objArr) {
            return this.callAdapter.adapt(bVar);
        }
    }

    static final class b extends m {
        private final retrofit2.c callAdapter;
        private final boolean isNullable;

        b(t tVar, Call.Factory factory, i iVar, retrofit2.c cVar, boolean z7) {
            super(tVar, factory, iVar);
            this.callAdapter = cVar;
            this.isNullable = z7;
        }

        @Override // retrofit2.m
        protected Object adapt(retrofit2.b bVar, Object[] objArr) {
            retrofit2.b bVar2 = (retrofit2.b) this.callAdapter.adapt(bVar);
            kotlin.coroutines.c cVar = (kotlin.coroutines.c) objArr[objArr.length - 1];
            try {
                return this.isNullable ? KotlinExtensions.awaitNullable(bVar2, cVar) : KotlinExtensions.await(bVar2, cVar);
            } catch (Exception e8) {
                return KotlinExtensions.suspendAndThrow(e8, cVar);
            }
        }
    }

    static final class c extends m {
        private final retrofit2.c callAdapter;

        c(t tVar, Call.Factory factory, i iVar, retrofit2.c cVar) {
            super(tVar, factory, iVar);
            this.callAdapter = cVar;
        }

        @Override // retrofit2.m
        protected Object adapt(retrofit2.b bVar, Object[] objArr) {
            retrofit2.b bVar2 = (retrofit2.b) this.callAdapter.adapt(bVar);
            kotlin.coroutines.c cVar = (kotlin.coroutines.c) objArr[objArr.length - 1];
            try {
                return KotlinExtensions.awaitResponse(bVar2, cVar);
            } catch (Exception e8) {
                return KotlinExtensions.suspendAndThrow(e8, cVar);
            }
        }
    }

    m(t tVar, Call.Factory factory, i iVar) {
        this.requestFactory = tVar;
        this.callFactory = factory;
        this.responseConverter = iVar;
    }

    private static <ResponseT, ReturnT> retrofit2.c createCallAdapter(v vVar, Method method, Type type, Annotation[] annotationArr) {
        try {
            return vVar.callAdapter(type, annotationArr);
        } catch (RuntimeException e8) {
            throw z.methodError(method, e8, "Unable to create call adapter for %s", type);
        }
    }

    private static <ResponseT> i createResponseConverter(v vVar, Method method, Type type) {
        try {
            return vVar.responseBodyConverter(type, method.getAnnotations());
        } catch (RuntimeException e8) {
            throw z.methodError(method, e8, "Unable to create converter for %s", type);
        }
    }

    static <ResponseT, ReturnT> m parseAnnotations(v vVar, Method method, t tVar) {
        Type genericReturnType;
        boolean z7;
        boolean z8 = tVar.isKotlinSuspendFunction;
        Annotation[] annotations = method.getAnnotations();
        if (z8) {
            Type[] genericParameterTypes = method.getGenericParameterTypes();
            Type parameterLowerBound = z.getParameterLowerBound(0, (ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]);
            if (z.getRawType(parameterLowerBound) == u.class && (parameterLowerBound instanceof ParameterizedType)) {
                parameterLowerBound = z.getParameterUpperBound(0, (ParameterizedType) parameterLowerBound);
                z7 = true;
            } else {
                z7 = false;
            }
            genericReturnType = new z.b(null, retrofit2.b.class, parameterLowerBound);
            annotations = y.ensurePresent(annotations);
        } else {
            genericReturnType = method.getGenericReturnType();
            z7 = false;
        }
        retrofit2.c createCallAdapter = createCallAdapter(vVar, method, genericReturnType, annotations);
        Type responseType = createCallAdapter.responseType();
        if (responseType == Response.class) {
            throw z.methodError(method, "'" + z.getRawType(responseType).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
        }
        if (responseType == u.class) {
            throw z.methodError(method, "Response must include generic type (e.g., Response<String>)", new Object[0]);
        }
        if (tVar.httpMethod.equals("HEAD") && !Void.class.equals(responseType)) {
            throw z.methodError(method, "HEAD method must use Void as response type.", new Object[0]);
        }
        i createResponseConverter = createResponseConverter(vVar, method, responseType);
        Call.Factory factory = vVar.callFactory;
        return !z8 ? new a(tVar, factory, createResponseConverter, createCallAdapter) : z7 ? new c(tVar, factory, createResponseConverter, createCallAdapter) : new b(tVar, factory, createResponseConverter, createCallAdapter, false);
    }

    @Nullable
    protected abstract Object adapt(retrofit2.b bVar, Object[] objArr);

    @Override // retrofit2.w
    @Nullable
    final Object invoke(Object[] objArr) {
        return adapt(new o(this.requestFactory, objArr, this.callFactory, this.responseConverter), objArr);
    }
}
