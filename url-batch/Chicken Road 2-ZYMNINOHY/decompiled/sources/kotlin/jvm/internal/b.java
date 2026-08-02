package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import u3.InterfaceC1448b;

/* loaded from: classes.dex */
public abstract class b implements InterfaceC1448b, Serializable {
    public static final Object NO_RECEIVER = a.f14151a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient InterfaceC1448b reflected;
    private final String signature;

    public b(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }

    @Override // u3.InterfaceC1448b
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // u3.InterfaceC1448b
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public InterfaceC1448b compute() {
        InterfaceC1448b interfaceC1448b = this.reflected;
        if (interfaceC1448b != null) {
            return interfaceC1448b;
        }
        InterfaceC1448b computeReflected = computeReflected();
        this.reflected = computeReflected;
        return computeReflected;
    }

    public abstract InterfaceC1448b computeReflected();

    @Override // u3.InterfaceC1447a
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public u3.d getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (!this.isTopLevel) {
            return q.a(cls);
        }
        q.f14160a.getClass();
        return new k(cls);
    }

    @Override // u3.InterfaceC1448b
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public abstract InterfaceC1448b getReflected();

    @Override // u3.InterfaceC1448b
    public u3.h getReturnType() {
        getReflected().getReturnType();
        return null;
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // u3.InterfaceC1448b
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // u3.InterfaceC1448b
    public u3.i getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // u3.InterfaceC1448b
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // u3.InterfaceC1448b
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // u3.InterfaceC1448b
    public boolean isOpen() {
        return getReflected().isOpen();
    }
}
