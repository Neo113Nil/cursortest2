package kotlinx.coroutines.flow;

import kotlin.KotlinNothingValueException;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes5.dex */
abstract /* synthetic */ class FlowKt__MigrationKt {
    public static final <T> e cache(e eVar) {
        g.noImpl();
        throw new KotlinNothingValueException();
    }

    public static final <T1, T2, R> e combineLatest(e eVar, e eVar2, f6.q qVar) {
        return g.combine(eVar, eVar2, qVar);
    }

    public static final <T, R> e compose(e eVar, f6.l lVar) {
        g.noImpl();
        throw new KotlinNothingValueException();
    }

    public static final <T, R> e concatMap(e eVar, f6.l lVar) {
        g.noImpl();
        throw new KotlinNothingValueException();
    }

    public static final <T> e concatWith(e eVar, T t7) {
        g.noImpl();
        throw new KotlinNothingValueException();
    }

    public static final <T> e delayEach(e eVar, long j8) {
        return g.onEach(eVar, new FlowKt__MigrationKt$delayEach$1(j8, null));
    }

    public static final <T> e delayFlow(e eVar, long j8) {
        return g.onStart(eVar, new FlowKt__MigrationKt$delayFlow$1(j8, null));
    }

    public static final <T, R> e flatMap(e eVar, f6.p pVar) {
        g.noImpl();
        throw new KotlinNothingValueException();
    }

    public static final <T> e flatten(e eVar) {
        g.noImpl();
        throw new KotlinNothingValueException();
    }

    public static final <T> void forEach(e eVar, f6.p pVar) {
        g.noImpl();
        throw new KotlinNothingValueException();
    }

    public static final <T> e merge(e eVar) {
        g.noImpl();
        throw new KotlinNothingValueException();
    }

    public static final Void noImpl() {
        throw new UnsupportedOperationException("Not implemented, should not be called");
    }

    public static final <T> e observeOn(e eVar, CoroutineContext coroutineContext) {
        g.noImpl();
        throw new KotlinNothingValueException();
    }

    public static final <T> e onErrorResume(e eVar, e eVar2) {
        g.noImpl();
        throw new KotlinNothingValueException();
    }

    public static final <T> e onErrorResumeNext(e eVar, e eVar2) {
        g.noImpl();
        throw new KotlinNothingValueException();
    }

    public static final <T> e onErrorReturn(e eVar, T t7) {
        g.noImpl();
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ e onErrorReturn$default(e eVar, Object obj, f6.l lVar, int i8, Object obj2) {
        if ((i8 & 2) != 0) {
            lVar = new f6.l() { // from class: kotlinx.coroutines.flow.FlowKt__MigrationKt$onErrorReturn$1
                @Override // f6.l
                public final Boolean invoke(Throwable th) {
                    return Boolean.TRUE;
                }
            };
        }
        return g.onErrorReturn(eVar, obj, lVar);
    }

    public static final <T> e publish(e eVar) {
        g.noImpl();
        throw new KotlinNothingValueException();
    }

    public static final <T> e publishOn(e eVar, CoroutineContext coroutineContext) {
        g.noImpl();
        throw new KotlinNothingValueException();
    }

    public static final <T> e replay(e eVar) {
        g.noImpl();
        throw new KotlinNothingValueException();
    }

    public static final <T, R> e scanFold(e eVar, R r8, f6.q qVar) {
        g.noImpl();
        throw new KotlinNothingValueException();
    }

    public static final <T> e scanReduce(e eVar, f6.q qVar) {
        return g.runningReduce(eVar, qVar);
    }

    public static final <T> e skip(e eVar, int i8) {
        g.noImpl();
        throw new KotlinNothingValueException();
    }

    public static final <T> e startWith(e eVar, T t7) {
        g.noImpl();
        throw new KotlinNothingValueException();
    }

    public static final <T> void subscribe(e eVar) {
        g.noImpl();
        throw new KotlinNothingValueException();
    }

    public static final <T> e subscribeOn(e eVar, CoroutineContext coroutineContext) {
        g.noImpl();
        throw new KotlinNothingValueException();
    }

    public static final <T, R> e switchMap(e eVar, f6.p pVar) {
        return g.transformLatest(eVar, new FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1(pVar, null));
    }

    public static final <T1, T2, T3, R> e combineLatest(e eVar, e eVar2, e eVar3, f6.r rVar) {
        return g.combine(eVar, eVar2, eVar3, rVar);
    }

    public static final <T> e concatWith(e eVar, e eVar2) {
        g.noImpl();
        throw new KotlinNothingValueException();
    }

    public static final <T> e onErrorReturn(e eVar, T t7, f6.l lVar) {
        return g.m1269catch(eVar, new FlowKt__MigrationKt$onErrorReturn$2(lVar, t7, null));
    }

    public static final <T> e publish(e eVar, int i8) {
        g.noImpl();
        throw new KotlinNothingValueException();
    }

    public static final <T> e replay(e eVar, int i8) {
        g.noImpl();
        throw new KotlinNothingValueException();
    }

    public static final <T> e startWith(e eVar, e eVar2) {
        g.noImpl();
        throw new KotlinNothingValueException();
    }

    public static final <T> void subscribe(e eVar, f6.p pVar) {
        g.noImpl();
        throw new KotlinNothingValueException();
    }

    public static final <T1, T2, T3, T4, R> e combineLatest(e eVar, e eVar2, e eVar3, e eVar4, f6.s sVar) {
        return g.combine(eVar, eVar2, eVar3, eVar4, sVar);
    }

    public static final <T> void subscribe(e eVar, f6.p pVar, f6.p pVar2) {
        g.noImpl();
        throw new KotlinNothingValueException();
    }

    public static final <T1, T2, T3, T4, T5, R> e combineLatest(e eVar, e eVar2, e eVar3, e eVar4, e eVar5, f6.t tVar) {
        return g.combine(eVar, eVar2, eVar3, eVar4, eVar5, tVar);
    }
}
