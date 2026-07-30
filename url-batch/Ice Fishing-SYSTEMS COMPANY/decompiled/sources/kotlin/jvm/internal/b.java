package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class b implements K7.b, Serializable {
    public static final Object NO_RECEIVER = a.f38852n;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient K7.b reflected;
    private final String signature;

    public b(Object obj, Class cls, String str, String str2, boolean z8) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z8;
    }

    @Override // K7.b
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // K7.b
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public K7.b compute() {
        K7.b bVar = this.reflected;
        if (bVar != null) {
            return bVar;
        }
        K7.b computeReflected = computeReflected();
        this.reflected = computeReflected;
        return computeReflected;
    }

    public abstract K7.b computeReflected();

    @Override // K7.a
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // K7.b
    public String getName() {
        return this.name;
    }

    public K7.d getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (!this.isTopLevel) {
            return s.a(cls);
        }
        s.f38862a.getClass();
        return new l(cls);
    }

    @Override // K7.b
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public K7.b getReflected() {
        K7.b compute = compute();
        if (compute != this) {
            return compute;
        }
        throw new D7.a("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    @Override // K7.b
    public K7.m getReturnType() {
        getReflected().getReturnType();
        return null;
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // K7.b
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // K7.b
    public K7.n getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // K7.b
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // K7.b
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // K7.b
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // K7.b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }
}
