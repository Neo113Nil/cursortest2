package kotlinx.coroutines;

/* loaded from: classes3.dex */
public final class c0 {
    public final f6.l onCancellation;
    public final Object result;

    public c0(Object obj, f6.l lVar) {
        this.result = obj;
        this.onCancellation = lVar;
    }

    public static /* synthetic */ c0 copy$default(c0 c0Var, Object obj, f6.l lVar, int i8, Object obj2) {
        if ((i8 & 1) != 0) {
            obj = c0Var.result;
        }
        if ((i8 & 2) != 0) {
            lVar = c0Var.onCancellation;
        }
        return c0Var.copy(obj, lVar);
    }

    public final Object component1() {
        return this.result;
    }

    public final f6.l component2() {
        return this.onCancellation;
    }

    public final c0 copy(Object obj, f6.l lVar) {
        return new c0(obj, lVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return kotlin.jvm.internal.s.areEqual(this.result, c0Var.result) && kotlin.jvm.internal.s.areEqual(this.onCancellation, c0Var.onCancellation);
    }

    public int hashCode() {
        Object obj = this.result;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.onCancellation.hashCode();
    }

    public String toString() {
        return "CompletedWithCancellation(result=" + this.result + ", onCancellation=" + this.onCancellation + ')';
    }
}
