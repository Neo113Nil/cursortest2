package kotlin.jvm.internal;

/* loaded from: classes4.dex */
public class FunctionReference extends CallableReference implements q, kotlin.reflect.h {
    private final int arity;
    private final int flags;

    public FunctionReference(int i8) {
        this(i8, CallableReference.NO_RECEIVER, null, null, null, 0);
    }

    @Override // kotlin.jvm.internal.CallableReference
    protected kotlin.reflect.c computeReflected() {
        return u.function(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FunctionReference) {
            FunctionReference functionReference = (FunctionReference) obj;
            return getName().equals(functionReference.getName()) && getSignature().equals(functionReference.getSignature()) && this.flags == functionReference.flags && this.arity == functionReference.arity && s.areEqual(getBoundReceiver(), functionReference.getBoundReceiver()) && s.areEqual(getOwner(), functionReference.getOwner());
        }
        if (obj instanceof kotlin.reflect.h) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.q
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return (((getOwner() == null ? 0 : getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // kotlin.reflect.h
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // kotlin.reflect.h
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // kotlin.reflect.h
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // kotlin.reflect.h
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.c
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        kotlin.reflect.c compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    public FunctionReference(int i8, Object obj) {
        this(i8, obj, null, null, null, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.CallableReference
    public kotlin.reflect.h getReflected() {
        return (kotlin.reflect.h) super.getReflected();
    }

    public FunctionReference(int i8, Object obj, Class cls, String str, String str2, int i9) {
        super(obj, cls, str, str2, (i9 & 1) == 1);
        this.arity = i8;
        this.flags = i9 >> 1;
    }
}
