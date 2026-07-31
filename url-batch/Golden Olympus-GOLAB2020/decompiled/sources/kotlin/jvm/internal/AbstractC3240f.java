package kotlin.jvm.internal;

import g2.C2430b;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import m2.InterfaceC3262b;

/* renamed from: kotlin.jvm.internal.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3240f implements InterfaceC3262b, Serializable {
    public static final Object NO_RECEIVER = a.f41149b;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient InterfaceC3262b reflected;
    private final String signature;

    /* renamed from: kotlin.jvm.internal.f$a */
    private static class a implements Serializable {

        /* renamed from: b, reason: collision with root package name */
        private static final a f41149b = new a();

        private a() {
        }
    }

    public AbstractC3240f() {
        this(NO_RECEIVER);
    }

    @Override // m2.InterfaceC3262b
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // m2.InterfaceC3262b
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public InterfaceC3262b compute() {
        InterfaceC3262b interfaceC3262b = this.reflected;
        if (interfaceC3262b != null) {
            return interfaceC3262b;
        }
        InterfaceC3262b computeReflected = computeReflected();
        this.reflected = computeReflected;
        return computeReflected;
    }

    protected abstract InterfaceC3262b computeReflected();

    @Override // m2.InterfaceC3261a
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // m2.InterfaceC3262b
    public String getName() {
        return this.name;
    }

    public m2.e getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? H.c(cls) : H.b(cls);
    }

    @Override // m2.InterfaceC3262b
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    protected InterfaceC3262b getReflected() {
        InterfaceC3262b compute = compute();
        if (compute != this) {
            return compute;
        }
        throw new C2430b();
    }

    @Override // m2.InterfaceC3262b
    public m2.k getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // m2.InterfaceC3262b
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // m2.InterfaceC3262b
    public m2.m getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // m2.InterfaceC3262b
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // m2.InterfaceC3262b
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // m2.InterfaceC3262b
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // m2.InterfaceC3262b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    protected AbstractC3240f(Object obj) {
        this(obj, null, null, null, false);
    }

    protected AbstractC3240f(Object obj, Class cls, String str, String str2, boolean z4) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z4;
    }
}
