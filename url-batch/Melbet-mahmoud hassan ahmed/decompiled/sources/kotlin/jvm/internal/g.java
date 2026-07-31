package kotlin.jvm.internal;

/* loaded from: classes.dex */
public class g extends a implements f, j6.e {
    private final int arity;
    private final int flags;

    public g(int i7) {
        this(i7, a.NO_RECEIVER, null, null, null, 0);
    }

    public g(int i7, Object obj) {
        this(i7, obj, null, null, null, 0);
    }

    public g(int i7, Object obj, Class cls, String str, String str2, int i8) {
        super(obj, cls, str, str2, (i8 & 1) == 1);
        this.arity = i7;
        this.flags = i8 >> 1;
    }

    @Override // kotlin.jvm.internal.a
    protected j6.b computeReflected() {
        return l.a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return getName().equals(gVar.getName()) && getSignature().equals(gVar.getSignature()) && this.flags == gVar.flags && this.arity == gVar.arity && i.a(getBoundReceiver(), gVar.getBoundReceiver()) && i.a(getOwner(), gVar.getOwner());
        }
        if (obj instanceof j6.e) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.f
    public int getArity() {
        return this.arity;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.a
    public j6.e getReflected() {
        return (j6.e) super.getReflected();
    }

    public int hashCode() {
        return (((getOwner() == null ? 0 : getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // j6.e
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // j6.e
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // j6.e
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // j6.e
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // kotlin.jvm.internal.a, j6.b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        j6.b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }
}
