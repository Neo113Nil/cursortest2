package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class a implements j6.b, Serializable {
    public static final Object NO_RECEIVER = C0088a.f18299f;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient j6.b reflected;
    private final String signature;

    /* renamed from: kotlin.jvm.internal.a$a, reason: collision with other inner class name */
    private static class C0088a implements Serializable {

        /* renamed from: f, reason: collision with root package name */
        private static final C0088a f18299f = new C0088a();

        private C0088a() {
        }
    }

    public a() {
        this(NO_RECEIVER);
    }

    protected a(Object obj) {
        this(obj, null, null, null, false);
    }

    protected a(Object obj, Class cls, String str, String str2, boolean z6) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z6;
    }

    @Override // j6.b
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // j6.b
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public j6.b compute() {
        j6.b bVar = this.reflected;
        if (bVar != null) {
            return bVar;
        }
        j6.b computeReflected = computeReflected();
        this.reflected = computeReflected;
        return computeReflected;
    }

    protected abstract j6.b computeReflected();

    @Override // j6.a
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public j6.d getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? l.c(cls) : l.b(cls);
    }

    @Override // j6.b
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    protected j6.b getReflected() {
        j6.b compute = compute();
        if (compute != this) {
            return compute;
        }
        throw new e6.b();
    }

    @Override // j6.b
    public j6.f getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // j6.b
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // j6.b
    public j6.g getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // j6.b
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // j6.b
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // j6.b
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // j6.b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }
}
