package kotlin.jvm.internal;

import d6.C0367a;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import k6.EnumC0621p;
import k6.InterfaceC0607b;
import k6.InterfaceC0609d;
import k6.InterfaceC0619n;
import kotlin.text.StringsKt;

/* renamed from: kotlin.jvm.internal.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0639d implements InterfaceC0607b, Serializable {
    public static final Object NO_RECEIVER = C0638c.f6158d;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient InterfaceC0607b reflected;
    private final String signature;

    public AbstractC0639d() {
        this(NO_RECEIVER, null, null, null, false);
    }

    @Override // k6.InterfaceC0607b
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // k6.InterfaceC0607b
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public InterfaceC0607b compute() {
        InterfaceC0607b interfaceC0607b = this.reflected;
        if (interfaceC0607b != null) {
            return interfaceC0607b;
        }
        InterfaceC0607b computeReflected = computeReflected();
        this.reflected = computeReflected;
        return computeReflected;
    }

    public abstract InterfaceC0607b computeReflected();

    public GenericDeclaration findJavaDeclaration() {
        String substring;
        InterfaceC0609d owner = getOwner();
        String missingDelimiterValue = getSignature();
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "signature");
        if (!(owner instanceof InterfaceC0641f)) {
            return null;
        }
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int x7 = StringsKt.x(missingDelimiterValue, '(', 0, 6);
        if (x7 == -1) {
            substring = missingDelimiterValue;
        } else {
            substring = missingDelimiterValue.substring(0, x7);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        }
        if (Intrinsics.a(substring, "<init>")) {
            throw new UnsupportedOperationException("Generic Java constructors are not supported: " + owner + '/' + missingDelimiterValue);
        }
        Method[] declaredMethods = ((InterfaceC0641f) owner).a().getDeclaredMethods();
        Intrinsics.checkNotNullExpressionValue(declaredMethods, "getDeclaredMethods(...)");
        for (Method method : declaredMethods) {
            if (Intrinsics.a(method.getName(), substring)) {
                StringBuilder sb = new StringBuilder();
                sb.append(method.getName());
                sb.append("(");
                Class<?>[] parameterTypes = method.getParameterTypes();
                Intrinsics.checkNotNullExpressionValue(parameterTypes, "getParameterTypes(...)");
                for (Class<?> cls : parameterTypes) {
                    Intrinsics.b(cls);
                    AbstractC0644i.a(sb, cls);
                }
                sb.append(")");
                Class<?> returnType = method.getReturnType();
                Intrinsics.checkNotNullExpressionValue(returnType, "getReturnType(...)");
                AbstractC0644i.a(sb, returnType);
                if (Intrinsics.a(sb.toString(), missingDelimiterValue)) {
                    return method;
                }
            }
        }
        return null;
    }

    @Override // k6.InterfaceC0606a
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // k6.InterfaceC0607b
    public String getName() {
        return this.name;
    }

    public InterfaceC0609d getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (!this.isTopLevel) {
            return E.a(cls);
        }
        E.f6153a.getClass();
        return new u(cls);
    }

    @Override // k6.InterfaceC0607b
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public InterfaceC0607b getReflected() {
        InterfaceC0607b compute = compute();
        if (compute != this) {
            return compute;
        }
        throw new C0367a();
    }

    @Override // k6.InterfaceC0607b
    public InterfaceC0619n getReturnType() {
        getReflected().getReturnType();
        return null;
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // k6.InterfaceC0607b
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // k6.InterfaceC0607b
    public EnumC0621p getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // k6.InterfaceC0607b
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // k6.InterfaceC0607b
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // k6.InterfaceC0607b
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // k6.InterfaceC0607b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public AbstractC0639d(Object obj, Class cls, String str, String str2, boolean z7) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z7;
    }
}
