package defpackage;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class tr implements g71, Serializable {
    public static final Object NO_RECEIVER = sr.m;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient g71 reflected;
    private final String signature;

    public tr(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }

    @Override // defpackage.g71
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // defpackage.g71
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public g71 compute() {
        g71 g71Var = this.reflected;
        if (g71Var != null) {
            return g71Var;
        }
        g71 computeReflected = computeReflected();
        this.reflected = computeReflected;
        return computeReflected;
    }

    public abstract g71 computeReflected();

    @Override // defpackage.f71
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public i71 getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (!this.isTopLevel) {
            return d82.a(cls);
        }
        d82.a.getClass();
        return new vx1(cls);
    }

    @Override // defpackage.g71
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public g71 getReflected() {
        g71 compute = compute();
        if (compute != this) {
            return compute;
        }
        throw new l81();
    }

    @Override // defpackage.g71
    public u71 getReturnType() {
        getReflected().getReturnType();
        return null;
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // defpackage.g71
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // defpackage.g71
    public v71 getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // defpackage.g71
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // defpackage.g71
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // defpackage.g71
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // defpackage.g71
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public tr() {
        this(NO_RECEIVER, null, null, null, false);
    }
}
