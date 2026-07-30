package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.i;

/* loaded from: classes5.dex */
final class a extends i.a {
    private boolean checkForKotlinUnit = true;

    /* renamed from: retrofit2.a$a, reason: collision with other inner class name */
    static final class C0403a implements i {
        static final C0403a INSTANCE = new C0403a();

        C0403a() {
        }

        @Override // retrofit2.i
        public ResponseBody convert(ResponseBody responseBody) {
            try {
                return z.buffer(responseBody);
            } finally {
                responseBody.close();
            }
        }
    }

    static final class b implements i {
        static final b INSTANCE = new b();

        b() {
        }

        @Override // retrofit2.i
        public RequestBody convert(RequestBody requestBody) {
            return requestBody;
        }
    }

    static final class c implements i {
        static final c INSTANCE = new c();

        c() {
        }

        @Override // retrofit2.i
        public ResponseBody convert(ResponseBody responseBody) {
            return responseBody;
        }
    }

    static final class d implements i {
        static final d INSTANCE = new d();

        d() {
        }

        @Override // retrofit2.i
        public String convert(Object obj) {
            return obj.toString();
        }
    }

    static final class e implements i {
        static final e INSTANCE = new e();

        e() {
        }

        @Override // retrofit2.i
        public y5.w convert(ResponseBody responseBody) {
            responseBody.close();
            return y5.w.INSTANCE;
        }
    }

    static final class f implements i {
        static final f INSTANCE = new f();

        f() {
        }

        @Override // retrofit2.i
        public Void convert(ResponseBody responseBody) {
            responseBody.close();
            return null;
        }
    }

    a() {
    }

    @Override // retrofit2.i.a
    @Nullable
    public i requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, v vVar) {
        if (RequestBody.class.isAssignableFrom(z.getRawType(type))) {
            return b.INSTANCE;
        }
        return null;
    }

    @Override // retrofit2.i.a
    @Nullable
    public i responseBodyConverter(Type type, Annotation[] annotationArr, v vVar) {
        if (type == ResponseBody.class) {
            return z.isAnnotationPresent(annotationArr, r7.w.class) ? c.INSTANCE : C0403a.INSTANCE;
        }
        if (type == Void.class) {
            return f.INSTANCE;
        }
        if (!this.checkForKotlinUnit || type != y5.w.class) {
            return null;
        }
        try {
            return e.INSTANCE;
        } catch (NoClassDefFoundError unused) {
            this.checkForKotlinUnit = false;
            return null;
        }
    }
}
