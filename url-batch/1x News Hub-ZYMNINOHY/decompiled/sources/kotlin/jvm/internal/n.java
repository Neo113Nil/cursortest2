package kotlin.jvm.internal;

/* loaded from: classes.dex */
public abstract class n extends c implements q2.g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f9689a;

    public n(Object obj, Class cls, String str, String str2) {
        super(obj, cls, str, str2, true);
        this.f9689a = false;
    }

    @Override // kotlin.jvm.internal.c
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final q2.g getReflected() {
        if (this.f9689a) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        q2.b compute = compute();
        if (compute != this) {
            return (q2.g) compute;
        }
        throw new k2.a("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    @Override // kotlin.jvm.internal.c
    public final q2.b compute() {
        return this.f9689a ? this : super.compute();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            return getOwner().equals(nVar.getOwner()) && getName().equals(nVar.getName()) && getSignature().equals(nVar.getSignature()) && j.a(getBoundReceiver(), nVar.getBoundReceiver());
        }
        if (obj instanceof q2.g) {
            return obj.equals(compute());
        }
        return false;
    }

    public final int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    public final String toString() {
        q2.b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }
}
