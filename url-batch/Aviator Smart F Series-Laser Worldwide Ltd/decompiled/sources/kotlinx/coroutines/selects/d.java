package kotlinx.coroutines.selects;

import f6.q;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class d implements c {
    private final Object clauseObject;
    private final q onCancellationConstructor;
    private final q processResFunc;
    private final q regFunc;

    public d(Object obj, q qVar, q qVar2) {
        q qVar3;
        this.clauseObject = obj;
        this.regFunc = qVar;
        this.onCancellationConstructor = qVar2;
        qVar3 = SelectKt.DUMMY_PROCESS_RESULT_FUNCTION;
        this.processResFunc = qVar3;
    }

    @Override // kotlinx.coroutines.selects.c, kotlinx.coroutines.selects.i
    public Object getClauseObject() {
        return this.clauseObject;
    }

    @Override // kotlinx.coroutines.selects.c, kotlinx.coroutines.selects.i
    public q getOnCancellationConstructor() {
        return this.onCancellationConstructor;
    }

    @Override // kotlinx.coroutines.selects.c, kotlinx.coroutines.selects.i
    public q getProcessResFunc() {
        return this.processResFunc;
    }

    @Override // kotlinx.coroutines.selects.c, kotlinx.coroutines.selects.i
    public q getRegFunc() {
        return this.regFunc;
    }

    public /* synthetic */ d(Object obj, q qVar, q qVar2, int i8, o oVar) {
        this(obj, qVar, (i8 & 4) != 0 ? null : qVar2);
    }
}
