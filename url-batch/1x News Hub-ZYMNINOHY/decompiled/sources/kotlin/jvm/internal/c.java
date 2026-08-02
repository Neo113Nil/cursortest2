package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class c implements q2.b, Serializable {
    public static final Object NO_RECEIVER = b.f9682a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient q2.b reflected;
    private final String signature;

    public c(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }

    @Override // q2.b
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // q2.b
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public q2.b compute() {
        q2.b bVar = this.reflected;
        if (bVar != null) {
            return bVar;
        }
        q2.b computeReflected = computeReflected();
        this.reflected = computeReflected;
        return computeReflected;
    }

    public abstract q2.b computeReflected();

    @Override // q2.a
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public q2.d getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (!this.isTopLevel) {
            return r.a(cls);
        }
        r.f9693a.getClass();
        return new l(cls);
    }

    @Override // q2.b
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public abstract q2.b getReflected();

    @Override // q2.b
    public q2.h getReturnType() {
        getReflected().getReturnType();
        return null;
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // q2.b
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // q2.b
    public q2.i getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // q2.b
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // q2.b
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // q2.b
    public boolean isOpen() {
        return getReflected().isOpen();
    }
}
