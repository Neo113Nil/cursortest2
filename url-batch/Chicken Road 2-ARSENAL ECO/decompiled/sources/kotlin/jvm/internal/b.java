package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class b implements D5.b, Serializable {
    public static final Object NO_RECEIVER = a.f5226f;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient D5.b reflected;
    private final String signature;

    public b(Object obj, Class cls, String str, String str2, boolean z5) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z5;
    }

    @Override // D5.b
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // D5.b
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public D5.b compute() {
        D5.b bVar = this.reflected;
        if (bVar != null) {
            return bVar;
        }
        D5.b computeReflected = computeReflected();
        this.reflected = computeReflected;
        return computeReflected;
    }

    public abstract D5.b computeReflected();

    @Override // D5.a
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // D5.b
    public String getName() {
        return this.name;
    }

    public D5.d getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (!this.isTopLevel) {
            return t.a(cls);
        }
        t.f5234a.getClass();
        return new m(cls);
    }

    @Override // D5.b
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public abstract D5.b getReflected();

    @Override // D5.b
    public D5.m getReturnType() {
        getReflected().getReturnType();
        return null;
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // D5.b
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // D5.b
    public D5.n getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // D5.b
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // D5.b
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // D5.b
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // D5.b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }
}
