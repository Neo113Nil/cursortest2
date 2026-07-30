package kotlinx.coroutines.selects;

import f6.q;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class f implements e {
    private final Object clauseObject;
    private final q onCancellationConstructor;
    private final q processResFunc;
    private final q regFunc;

    public f(Object obj, q qVar, q qVar2, q qVar3) {
        this.clauseObject = obj;
        this.regFunc = qVar;
        this.processResFunc = qVar2;
        this.onCancellationConstructor = qVar3;
    }

    @Override // kotlinx.coroutines.selects.e, kotlinx.coroutines.selects.i
    public Object getClauseObject() {
        return this.clauseObject;
    }

    @Override // kotlinx.coroutines.selects.e, kotlinx.coroutines.selects.i
    public q getOnCancellationConstructor() {
        return this.onCancellationConstructor;
    }

    @Override // kotlinx.coroutines.selects.e, kotlinx.coroutines.selects.i
    public q getProcessResFunc() {
        return this.processResFunc;
    }

    @Override // kotlinx.coroutines.selects.e, kotlinx.coroutines.selects.i
    public q getRegFunc() {
        return this.regFunc;
    }

    public /* synthetic */ f(Object obj, q qVar, q qVar2, q qVar3, int i8, o oVar) {
        this(obj, qVar, qVar2, (i8 & 8) != 0 ? null : qVar3);
    }
}
