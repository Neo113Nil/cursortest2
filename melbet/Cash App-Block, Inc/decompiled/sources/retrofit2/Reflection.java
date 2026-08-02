package retrofit2;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Unit;
import okhttp3.ResponseBody;

/* loaded from: classes3.dex */
public class Reflection implements Converter {
    public static final Reflection INSTANCE = new Reflection(1);
    public static final Reflection INSTANCE$1 = new Reflection(2);
    public final /* synthetic */ int $r8$classId;

    public final class Android24 extends Reflection {
        @Override // retrofit2.Reflection
        public final Object invokeDefaultMethod(Method method, Class cls, Object obj, Object[] objArr) {
            return DefaultMethodSupport.invoke(method, cls, obj, objArr);
        }

        @Override // retrofit2.Reflection
        public final boolean isDefaultMethod(Method method) {
            return method.isDefault();
        }
    }

    /* loaded from: classes9.dex */
    public final class Java8 extends Reflection {
        public Java8() {
            super(0);
        }

        @Override // retrofit2.Reflection
        public final String describeMethodParameter(Method method, int i) {
            Parameter parameter = method.getParameters()[i];
            if (!parameter.isNamePresent()) {
                return super.describeMethodParameter(method, i);
            }
            return "parameter '" + parameter.getName() + '\'';
        }

        @Override // retrofit2.Reflection
        public final Object invokeDefaultMethod(Method method, Class cls, Object obj, Object[] objArr) {
            return DefaultMethodSupport.invoke(method, cls, obj, objArr);
        }

        @Override // retrofit2.Reflection
        public final boolean isDefaultMethod(Method method) {
            return method.isDefault();
        }
    }

    public /* synthetic */ Reflection(int i) {
        this.$r8$classId = i;
    }

    @Override // retrofit2.Converter
    public Object convert(Object obj) {
        switch (this.$r8$classId) {
            case 1:
                return obj.toString();
            default:
                ((ResponseBody) obj).close();
                return Unit.INSTANCE;
        }
    }

    public List createDefaultCallAdapterFactories(Executor executor) {
        return Collections.singletonList(new DefaultCallAdapterFactory(executor, 0));
    }

    public List createDefaultConverterFactories() {
        return Collections.EMPTY_LIST;
    }

    public String describeMethodParameter(Method method, int i) {
        return "parameter #" + (i + 1);
    }

    public Object invokeDefaultMethod(Method method, Class cls, Object obj, Object[] objArr) {
        throw new AssertionError();
    }

    public boolean isDefaultMethod(Method method) {
        return false;
    }
}
