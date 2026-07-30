package kotlinx.coroutines;

/* loaded from: classes3.dex */
final class a0 {
    public final Throwable cancelCause;
    public final l cancelHandler;
    public final Object idempotentResume;
    public final f6.l onCancellation;
    public final Object result;

    public a0(Object obj, l lVar, f6.l lVar2, Object obj2, Throwable th) {
        this.result = obj;
        this.cancelHandler = lVar;
        this.onCancellation = lVar2;
        this.idempotentResume = obj2;
        this.cancelCause = th;
    }

    public static /* synthetic */ a0 copy$default(a0 a0Var, Object obj, l lVar, f6.l lVar2, Object obj2, Throwable th, int i8, Object obj3) {
        if ((i8 & 1) != 0) {
            obj = a0Var.result;
        }
        if ((i8 & 2) != 0) {
            lVar = a0Var.cancelHandler;
        }
        l lVar3 = lVar;
        if ((i8 & 4) != 0) {
            lVar2 = a0Var.onCancellation;
        }
        f6.l lVar4 = lVar2;
        if ((i8 & 8) != 0) {
            obj2 = a0Var.idempotentResume;
        }
        Object obj4 = obj2;
        if ((i8 & 16) != 0) {
            th = a0Var.cancelCause;
        }
        return a0Var.copy(obj, lVar3, lVar4, obj4, th);
    }

    public final Object component1() {
        return this.result;
    }

    public final l component2() {
        return this.cancelHandler;
    }

    public final f6.l component3() {
        return this.onCancellation;
    }

    public final Object component4() {
        return this.idempotentResume;
    }

    public final Throwable component5() {
        return this.cancelCause;
    }

    public final a0 copy(Object obj, l lVar, f6.l lVar2, Object obj2, Throwable th) {
        return new a0(obj, lVar, lVar2, obj2, th);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return kotlin.jvm.internal.s.areEqual(this.result, a0Var.result) && kotlin.jvm.internal.s.areEqual(this.cancelHandler, a0Var.cancelHandler) && kotlin.jvm.internal.s.areEqual(this.onCancellation, a0Var.onCancellation) && kotlin.jvm.internal.s.areEqual(this.idempotentResume, a0Var.idempotentResume) && kotlin.jvm.internal.s.areEqual(this.cancelCause, a0Var.cancelCause);
    }

    public final boolean getCancelled() {
        return this.cancelCause != null;
    }

    public int hashCode() {
        Object obj = this.result;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        l lVar = this.cancelHandler;
        int hashCode2 = (hashCode + (lVar == null ? 0 : lVar.hashCode())) * 31;
        f6.l lVar2 = this.onCancellation;
        int hashCode3 = (hashCode2 + (lVar2 == null ? 0 : lVar2.hashCode())) * 31;
        Object obj2 = this.idempotentResume;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.cancelCause;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final void invokeHandlers(o oVar, Throwable th) {
        l lVar = this.cancelHandler;
        if (lVar != null) {
            oVar.callCancelHandler(lVar, th);
        }
        f6.l lVar2 = this.onCancellation;
        if (lVar2 != null) {
            oVar.callOnCancellation(lVar2, th);
        }
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.result + ", cancelHandler=" + this.cancelHandler + ", onCancellation=" + this.onCancellation + ", idempotentResume=" + this.idempotentResume + ", cancelCause=" + this.cancelCause + ')';
    }

    public /* synthetic */ a0(Object obj, l lVar, f6.l lVar2, Object obj2, Throwable th, int i8, kotlin.jvm.internal.o oVar) {
        this(obj, (i8 & 2) != 0 ? null : lVar, (i8 & 4) != 0 ? null : lVar2, (i8 & 8) != 0 ? null : obj2, (i8 & 16) != 0 ? null : th);
    }
}
