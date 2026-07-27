package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import z4.InterfaceC1585b;
import z4.InterfaceC1587d;

/* loaded from: classes.dex */
public abstract class b implements InterfaceC1585b, Serializable {
    public static final Object NO_RECEIVER = a.f10734a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient InterfaceC1585b reflected;
    private final String signature;

    public b(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }

    @Override // z4.InterfaceC1585b
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // z4.InterfaceC1585b
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public InterfaceC1585b compute() {
        InterfaceC1585b interfaceC1585b = this.reflected;
        if (interfaceC1585b != null) {
            return interfaceC1585b;
        }
        InterfaceC1585b computeReflected = computeReflected();
        this.reflected = computeReflected;
        return computeReflected;
    }

    public abstract InterfaceC1585b computeReflected();

    @Override // z4.InterfaceC1584a
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // z4.InterfaceC1585b
    public String getName() {
        return this.name;
    }

    public InterfaceC1587d getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (!this.isTopLevel) {
            return t.a(cls);
        }
        t.f10742a.getClass();
        return new m(cls);
    }

    @Override // z4.InterfaceC1585b
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public abstract InterfaceC1585b getReflected();

    @Override // z4.InterfaceC1585b
    public z4.m getReturnType() {
        getReflected().getReturnType();
        return null;
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // z4.InterfaceC1585b
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // z4.InterfaceC1585b
    public z4.n getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // z4.InterfaceC1585b
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // z4.InterfaceC1585b
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // z4.InterfaceC1585b
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // z4.InterfaceC1585b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }
}
