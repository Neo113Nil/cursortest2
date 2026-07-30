package kotlinx.coroutines.flow;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.i0;
import kotlinx.coroutines.l1;

/* loaded from: classes5.dex */
public abstract class g {
    public static final String DEFAULT_CONCURRENCY_PROPERTY_NAME = "kotlinx.coroutines.flow.defaultConcurrency";

    public static final <T> e asFlow(f6.a aVar) {
        return FlowKt__BuildersKt.asFlow(aVar);
    }

    public static final <T> n asSharedFlow(i iVar) {
        return FlowKt__ShareKt.asSharedFlow(iVar);
    }

    public static final <T> t asStateFlow(j jVar) {
        return FlowKt__ShareKt.asStateFlow(jVar);
    }

    public static final <T> e cache(e eVar) {
        return FlowKt__MigrationKt.cache(eVar);
    }

    public static final <T> e callbackFlow(f6.p pVar) {
        return FlowKt__BuildersKt.callbackFlow(pVar);
    }

    public static final <T> e cancellable(e eVar) {
        return h.cancellable(eVar);
    }

    /* renamed from: catch, reason: not valid java name */
    public static final <T> e m1269catch(e eVar, f6.q qVar) {
        return FlowKt__ErrorsKt.m1268catch(eVar, qVar);
    }

    public static final <T> Object catchImpl(e eVar, f fVar, kotlin.coroutines.c cVar) {
        return FlowKt__ErrorsKt.catchImpl(eVar, fVar, cVar);
    }

    public static final <T> e channelFlow(f6.p pVar) {
        return FlowKt__BuildersKt.channelFlow(pVar);
    }

    public static final <T> Object collectIndexed(e eVar, f6.q qVar, kotlin.coroutines.c cVar) {
        return FlowKt__CollectKt.collectIndexed(eVar, qVar, cVar);
    }

    public static final <T> Object collectLatest(e eVar, f6.p pVar, kotlin.coroutines.c cVar) {
        return FlowKt__CollectKt.collectLatest(eVar, pVar, cVar);
    }

    public static final <T> Object collectWhile(e eVar, f6.p pVar, kotlin.coroutines.c cVar) {
        return FlowKt__LimitKt.collectWhile(eVar, pVar, cVar);
    }

    public static final <T1, T2, R> e combineLatest(e eVar, e eVar2, f6.q qVar) {
        return FlowKt__MigrationKt.combineLatest(eVar, eVar2, qVar);
    }

    public static final <T, R> e compose(e eVar, f6.l lVar) {
        return FlowKt__MigrationKt.compose(eVar, lVar);
    }

    public static final <T, R> e concatMap(e eVar, f6.l lVar) {
        return FlowKt__MigrationKt.concatMap(eVar, lVar);
    }

    public static final <T> e concatWith(e eVar, T t7) {
        return FlowKt__MigrationKt.concatWith(eVar, t7);
    }

    public static final <T> e conflate(e eVar) {
        return h.conflate(eVar);
    }

    public static final <T> e consumeAsFlow(ReceiveChannel receiveChannel) {
        return FlowKt__ChannelsKt.consumeAsFlow(receiveChannel);
    }

    public static final <T> Object count(e eVar, f6.p pVar, kotlin.coroutines.c cVar) {
        return FlowKt__CountKt.count(eVar, pVar, cVar);
    }

    public static final <T> e debounce(e eVar, long j8) {
        return FlowKt__DelayKt.debounce(eVar, j8);
    }

    /* renamed from: debounce-HG0u8IE, reason: not valid java name */
    public static final <T> e m1270debounceHG0u8IE(e eVar, long j8) {
        return FlowKt__DelayKt.m1261debounceHG0u8IE(eVar, j8);
    }

    public static final <T> e debounceDuration(e eVar, f6.l lVar) {
        return FlowKt__DelayKt.debounceDuration(eVar, lVar);
    }

    public static final <T> e delayEach(e eVar, long j8) {
        return FlowKt__MigrationKt.delayEach(eVar, j8);
    }

    public static final <T> e delayFlow(e eVar, long j8) {
        return FlowKt__MigrationKt.delayFlow(eVar, j8);
    }

    public static final <T> e distinctUntilChanged(e eVar) {
        return FlowKt__DistinctKt.distinctUntilChanged(eVar);
    }

    public static final <T, K> e distinctUntilChangedBy(e eVar, f6.l lVar) {
        return FlowKt__DistinctKt.distinctUntilChangedBy(eVar, lVar);
    }

    public static final <T> e drop(e eVar, int i8) {
        return FlowKt__LimitKt.drop(eVar, i8);
    }

    public static final <T> e dropWhile(e eVar, f6.p pVar) {
        return FlowKt__LimitKt.dropWhile(eVar, pVar);
    }

    public static final <T> Object emitAll(f fVar, ReceiveChannel receiveChannel, kotlin.coroutines.c cVar) {
        return FlowKt__ChannelsKt.emitAll(fVar, receiveChannel, cVar);
    }

    public static final <T> e emptyFlow() {
        return FlowKt__BuildersKt.emptyFlow();
    }

    public static final void ensureActive(f fVar) {
        FlowKt__EmittersKt.ensureActive(fVar);
    }

    public static final <T> e filter(e eVar, f6.p pVar) {
        return FlowKt__TransformKt.filter(eVar, pVar);
    }

    public static final <T> e filterNot(e eVar, f6.p pVar) {
        return FlowKt__TransformKt.filterNot(eVar, pVar);
    }

    public static final <T> e filterNotNull(e eVar) {
        return FlowKt__TransformKt.filterNotNull(eVar);
    }

    public static final <T> Object first(e eVar, f6.p pVar, kotlin.coroutines.c cVar) {
        return FlowKt__ReduceKt.first(eVar, pVar, cVar);
    }

    public static final <T> Object firstOrNull(e eVar, f6.p pVar, kotlin.coroutines.c cVar) {
        return FlowKt__ReduceKt.firstOrNull(eVar, pVar, cVar);
    }

    public static final ReceiveChannel fixedPeriodTicker(i0 i0Var, long j8, long j9) {
        return FlowKt__DelayKt.fixedPeriodTicker(i0Var, j8, j9);
    }

    public static final <T, R> e flatMap(e eVar, f6.p pVar) {
        return FlowKt__MigrationKt.flatMap(eVar, pVar);
    }

    public static final <T, R> e flatMapConcat(e eVar, f6.p pVar) {
        return FlowKt__MergeKt.flatMapConcat(eVar, pVar);
    }

    public static final <T, R> e flatMapLatest(e eVar, f6.p pVar) {
        return FlowKt__MergeKt.flatMapLatest(eVar, pVar);
    }

    public static final <T, R> e flatMapMerge(e eVar, int i8, f6.p pVar) {
        return FlowKt__MergeKt.flatMapMerge(eVar, i8, pVar);
    }

    public static final <T> e flatten(e eVar) {
        return FlowKt__MigrationKt.flatten(eVar);
    }

    public static final <T> e flattenConcat(e eVar) {
        return FlowKt__MergeKt.flattenConcat(eVar);
    }

    public static final <T> e flattenMerge(e eVar, int i8) {
        return FlowKt__MergeKt.flattenMerge(eVar, i8);
    }

    public static final <T> e flow(f6.p pVar) {
        return FlowKt__BuildersKt.flow(pVar);
    }

    public static final <T1, T2, R> e flowCombine(e eVar, e eVar2, f6.q qVar) {
        return FlowKt__ZipKt.flowCombine(eVar, eVar2, qVar);
    }

    public static final <T1, T2, R> e flowCombineTransform(e eVar, e eVar2, f6.r rVar) {
        return FlowKt__ZipKt.flowCombineTransform(eVar, eVar2, rVar);
    }

    public static final <T> e flowOf(T t7) {
        return FlowKt__BuildersKt.flowOf(t7);
    }

    public static final <T> e flowOn(e eVar, CoroutineContext coroutineContext) {
        return h.flowOn(eVar, coroutineContext);
    }

    public static final <T, R> Object fold(e eVar, R r8, f6.q qVar, kotlin.coroutines.c cVar) {
        return FlowKt__ReduceKt.fold(eVar, r8, qVar, cVar);
    }

    public static final <T> void forEach(e eVar, f6.p pVar) {
        FlowKt__MigrationKt.forEach(eVar, pVar);
    }

    public static final int getDEFAULT_CONCURRENCY() {
        return FlowKt__MergeKt.getDEFAULT_CONCURRENCY();
    }

    public static final <T> Object last(e eVar, kotlin.coroutines.c cVar) {
        return FlowKt__ReduceKt.last(eVar, cVar);
    }

    public static final <T> Object lastOrNull(e eVar, kotlin.coroutines.c cVar) {
        return FlowKt__ReduceKt.lastOrNull(eVar, cVar);
    }

    public static final <T> l1 launchIn(e eVar, i0 i0Var) {
        return FlowKt__CollectKt.launchIn(eVar, i0Var);
    }

    public static final <T, R> e map(e eVar, f6.p pVar) {
        return FlowKt__TransformKt.map(eVar, pVar);
    }

    public static final <T, R> e mapLatest(e eVar, f6.p pVar) {
        return FlowKt__MergeKt.mapLatest(eVar, pVar);
    }

    public static final <T, R> e mapNotNull(e eVar, f6.p pVar) {
        return FlowKt__TransformKt.mapNotNull(eVar, pVar);
    }

    public static final <T> e merge(Iterable<? extends e> iterable) {
        return FlowKt__MergeKt.merge(iterable);
    }

    public static final Void noImpl() {
        return FlowKt__MigrationKt.noImpl();
    }

    public static final <T> e observeOn(e eVar, CoroutineContext coroutineContext) {
        return FlowKt__MigrationKt.observeOn(eVar, coroutineContext);
    }

    public static final <T> e onCompletion(e eVar, f6.q qVar) {
        return FlowKt__EmittersKt.onCompletion(eVar, qVar);
    }

    public static final <T> e onEach(e eVar, f6.p pVar) {
        return FlowKt__TransformKt.onEach(eVar, pVar);
    }

    public static final <T> e onEmpty(e eVar, f6.p pVar) {
        return FlowKt__EmittersKt.onEmpty(eVar, pVar);
    }

    public static final <T> e onErrorResume(e eVar, e eVar2) {
        return FlowKt__MigrationKt.onErrorResume(eVar, eVar2);
    }

    public static final <T> e onErrorResumeNext(e eVar, e eVar2) {
        return FlowKt__MigrationKt.onErrorResumeNext(eVar, eVar2);
    }

    public static final <T> e onErrorReturn(e eVar, T t7) {
        return FlowKt__MigrationKt.onErrorReturn(eVar, t7);
    }

    public static final <T> e onStart(e eVar, f6.p pVar) {
        return FlowKt__EmittersKt.onStart(eVar, pVar);
    }

    public static final <T> n onSubscription(n nVar, f6.p pVar) {
        return FlowKt__ShareKt.onSubscription(nVar, pVar);
    }

    public static final <T> ReceiveChannel produceIn(e eVar, i0 i0Var) {
        return FlowKt__ChannelsKt.produceIn(eVar, i0Var);
    }

    public static final <T> e publish(e eVar) {
        return FlowKt__MigrationKt.publish(eVar);
    }

    public static final <T> e publishOn(e eVar, CoroutineContext coroutineContext) {
        return FlowKt__MigrationKt.publishOn(eVar, coroutineContext);
    }

    public static final <T> e receiveAsFlow(ReceiveChannel receiveChannel) {
        return FlowKt__ChannelsKt.receiveAsFlow(receiveChannel);
    }

    public static final <S, T extends S> Object reduce(e eVar, f6.q qVar, kotlin.coroutines.c cVar) {
        return FlowKt__ReduceKt.reduce(eVar, qVar, cVar);
    }

    public static final <T> e replay(e eVar) {
        return FlowKt__MigrationKt.replay(eVar);
    }

    public static final <T> e retry(e eVar, long j8, f6.p pVar) {
        return FlowKt__ErrorsKt.retry(eVar, j8, pVar);
    }

    public static final <T> e retryWhen(e eVar, f6.r rVar) {
        return FlowKt__ErrorsKt.retryWhen(eVar, rVar);
    }

    public static final <T, R> e runningFold(e eVar, R r8, f6.q qVar) {
        return FlowKt__TransformKt.runningFold(eVar, r8, qVar);
    }

    public static final <T> e runningReduce(e eVar, f6.q qVar) {
        return FlowKt__TransformKt.runningReduce(eVar, qVar);
    }

    public static final <T> e sample(e eVar, long j8) {
        return FlowKt__DelayKt.sample(eVar, j8);
    }

    /* renamed from: sample-HG0u8IE, reason: not valid java name */
    public static final <T> e m1271sampleHG0u8IE(e eVar, long j8) {
        return FlowKt__DelayKt.m1262sampleHG0u8IE(eVar, j8);
    }

    public static final <T, R> e scan(e eVar, R r8, f6.q qVar) {
        return FlowKt__TransformKt.scan(eVar, r8, qVar);
    }

    public static final <T, R> e scanFold(e eVar, R r8, f6.q qVar) {
        return FlowKt__MigrationKt.scanFold(eVar, r8, qVar);
    }

    public static final <T> e scanReduce(e eVar, f6.q qVar) {
        return FlowKt__MigrationKt.scanReduce(eVar, qVar);
    }

    public static final <T> n shareIn(e eVar, i0 i0Var, r rVar, int i8) {
        return FlowKt__ShareKt.shareIn(eVar, i0Var, rVar, i8);
    }

    public static final <T> Object single(e eVar, kotlin.coroutines.c cVar) {
        return FlowKt__ReduceKt.single(eVar, cVar);
    }

    public static final <T> Object singleOrNull(e eVar, kotlin.coroutines.c cVar) {
        return FlowKt__ReduceKt.singleOrNull(eVar, cVar);
    }

    public static final <T> e skip(e eVar, int i8) {
        return FlowKt__MigrationKt.skip(eVar, i8);
    }

    public static final <T> e startWith(e eVar, T t7) {
        return FlowKt__MigrationKt.startWith(eVar, t7);
    }

    public static final <T> Object stateIn(e eVar, i0 i0Var, kotlin.coroutines.c cVar) {
        return FlowKt__ShareKt.stateIn(eVar, i0Var, cVar);
    }

    public static final <T> void subscribe(e eVar) {
        FlowKt__MigrationKt.subscribe(eVar);
    }

    public static final <T> e subscribeOn(e eVar, CoroutineContext coroutineContext) {
        return FlowKt__MigrationKt.subscribeOn(eVar, coroutineContext);
    }

    public static final <T, R> e switchMap(e eVar, f6.p pVar) {
        return FlowKt__MigrationKt.switchMap(eVar, pVar);
    }

    public static final <T> e take(e eVar, int i8) {
        return FlowKt__LimitKt.take(eVar, i8);
    }

    public static final <T> e takeWhile(e eVar, f6.p pVar) {
        return FlowKt__LimitKt.takeWhile(eVar, pVar);
    }

    /* renamed from: timeout-HG0u8IE, reason: not valid java name */
    public static final <T> e m1272timeoutHG0u8IE(e eVar, long j8) {
        return FlowKt__DelayKt.m1263timeoutHG0u8IE(eVar, j8);
    }

    public static final <T, C extends Collection<? super T>> Object toCollection(e eVar, C c8, kotlin.coroutines.c cVar) {
        return FlowKt__CollectionKt.toCollection(eVar, c8, cVar);
    }

    public static final <T> Object toList(e eVar, List<T> list, kotlin.coroutines.c cVar) {
        return FlowKt__CollectionKt.toList(eVar, list, cVar);
    }

    public static final <T> Object toSet(e eVar, Set<T> set, kotlin.coroutines.c cVar) {
        return FlowKt__CollectionKt.toSet(eVar, set, cVar);
    }

    public static final <T, R> e transform(e eVar, f6.q qVar) {
        return FlowKt__EmittersKt.transform(eVar, qVar);
    }

    public static final <T, R> e transformLatest(e eVar, f6.q qVar) {
        return FlowKt__MergeKt.transformLatest(eVar, qVar);
    }

    public static final <T, R> e transformWhile(e eVar, f6.q qVar) {
        return FlowKt__LimitKt.transformWhile(eVar, qVar);
    }

    public static final <T, R> e unsafeTransform(e eVar, f6.q qVar) {
        return FlowKt__EmittersKt.unsafeTransform(eVar, qVar);
    }

    public static final <T> e withIndex(e eVar) {
        return FlowKt__TransformKt.withIndex(eVar);
    }

    public static final <T1, T2, R> e zip(e eVar, e eVar2, f6.q qVar) {
        return FlowKt__ZipKt.zip(eVar, eVar2, qVar);
    }

    public static final <T> e asFlow(f6.l lVar) {
        return FlowKt__BuildersKt.asFlow(lVar);
    }

    public static final <T> e buffer(e eVar, int i8, BufferOverflow bufferOverflow) {
        return h.buffer(eVar, i8, bufferOverflow);
    }

    public static final Object collect(e eVar, kotlin.coroutines.c cVar) {
        return FlowKt__CollectKt.collect(eVar, cVar);
    }

    public static final <T1, T2, R> e combine(e eVar, e eVar2, f6.q qVar) {
        return FlowKt__ZipKt.combine(eVar, eVar2, qVar);
    }

    public static final <T1, T2, T3, R> e combineLatest(e eVar, e eVar2, e eVar3, f6.r rVar) {
        return FlowKt__MigrationKt.combineLatest(eVar, eVar2, eVar3, rVar);
    }

    public static final <T1, T2, R> e combineTransform(e eVar, e eVar2, f6.r rVar) {
        return FlowKt__ZipKt.combineTransform(eVar, eVar2, rVar);
    }

    public static final <T> e concatWith(e eVar, e eVar2) {
        return FlowKt__MigrationKt.concatWith(eVar, eVar2);
    }

    public static final <T> Object count(e eVar, kotlin.coroutines.c cVar) {
        return FlowKt__CountKt.count(eVar, cVar);
    }

    public static final <T> e debounce(e eVar, f6.l lVar) {
        return FlowKt__DelayKt.debounce(eVar, lVar);
    }

    public static final <T> e distinctUntilChanged(e eVar, f6.p pVar) {
        return FlowKt__DistinctKt.distinctUntilChanged(eVar, pVar);
    }

    public static final <T> Object emitAll(f fVar, e eVar, kotlin.coroutines.c cVar) {
        return FlowKt__CollectKt.emitAll(fVar, eVar, cVar);
    }

    public static final <R> e filterIsInstance(e eVar, kotlin.reflect.d dVar) {
        return FlowKt__TransformKt.filterIsInstance(eVar, dVar);
    }

    public static final <T> Object first(e eVar, kotlin.coroutines.c cVar) {
        return FlowKt__ReduceKt.first(eVar, cVar);
    }

    public static final <T> Object firstOrNull(e eVar, kotlin.coroutines.c cVar) {
        return FlowKt__ReduceKt.firstOrNull(eVar, cVar);
    }

    public static final <T> e flowOf(T... tArr) {
        return FlowKt__BuildersKt.flowOf((Object[]) tArr);
    }

    public static final <T> e merge(e eVar) {
        return FlowKt__MigrationKt.merge(eVar);
    }

    public static final <T> e onErrorReturn(e eVar, T t7, f6.l lVar) {
        return FlowKt__MigrationKt.onErrorReturn(eVar, t7, lVar);
    }

    public static final <T> e publish(e eVar, int i8) {
        return FlowKt__MigrationKt.publish(eVar, i8);
    }

    public static final <T> e replay(e eVar, int i8) {
        return FlowKt__MigrationKt.replay(eVar, i8);
    }

    public static final <T> e startWith(e eVar, e eVar2) {
        return FlowKt__MigrationKt.startWith(eVar, eVar2);
    }

    public static final <T> t stateIn(e eVar, i0 i0Var, r rVar, T t7) {
        return FlowKt__ShareKt.stateIn(eVar, i0Var, rVar, t7);
    }

    public static final <T> void subscribe(e eVar, f6.p pVar) {
        FlowKt__MigrationKt.subscribe(eVar, pVar);
    }

    public static final e asFlow(j6.m mVar) {
        return FlowKt__BuildersKt.asFlow(mVar);
    }

    public static final <T1, T2, T3, R> e combine(e eVar, e eVar2, e eVar3, f6.r rVar) {
        return FlowKt__ZipKt.combine(eVar, eVar2, eVar3, rVar);
    }

    public static final <T1, T2, T3, T4, R> e combineLatest(e eVar, e eVar2, e eVar3, e eVar4, f6.s sVar) {
        return FlowKt__MigrationKt.combineLatest(eVar, eVar2, eVar3, eVar4, sVar);
    }

    public static final <T1, T2, T3, R> e combineTransform(e eVar, e eVar2, e eVar3, f6.s sVar) {
        return FlowKt__ZipKt.combineTransform(eVar, eVar2, eVar3, sVar);
    }

    public static final <T> e merge(e... eVarArr) {
        return FlowKt__MergeKt.merge(eVarArr);
    }

    public static final <T> void subscribe(e eVar, f6.p pVar, f6.p pVar2) {
        FlowKt__MigrationKt.subscribe(eVar, pVar, pVar2);
    }

    public static final e asFlow(j6.p pVar) {
        return FlowKt__BuildersKt.asFlow(pVar);
    }

    public static final <T1, T2, T3, T4, R> e combine(e eVar, e eVar2, e eVar3, e eVar4, f6.s sVar) {
        return FlowKt__ZipKt.combine(eVar, eVar2, eVar3, eVar4, sVar);
    }

    public static final <T1, T2, T3, T4, T5, R> e combineLatest(e eVar, e eVar2, e eVar3, e eVar4, e eVar5, f6.t tVar) {
        return FlowKt__MigrationKt.combineLatest(eVar, eVar2, eVar3, eVar4, eVar5, tVar);
    }

    public static final <T1, T2, T3, T4, R> e combineTransform(e eVar, e eVar2, e eVar3, e eVar4, f6.t tVar) {
        return FlowKt__ZipKt.combineTransform(eVar, eVar2, eVar3, eVar4, tVar);
    }

    public static final <T> e asFlow(Iterable<? extends T> iterable) {
        return FlowKt__BuildersKt.asFlow(iterable);
    }

    public static final <T1, T2, T3, T4, T5, R> e combine(e eVar, e eVar2, e eVar3, e eVar4, e eVar5, f6.t tVar) {
        return FlowKt__ZipKt.combine(eVar, eVar2, eVar3, eVar4, eVar5, tVar);
    }

    public static final <T1, T2, T3, T4, T5, R> e combineTransform(e eVar, e eVar2, e eVar3, e eVar4, e eVar5, f6.u uVar) {
        return FlowKt__ZipKt.combineTransform(eVar, eVar2, eVar3, eVar4, eVar5, uVar);
    }

    public static final <T> e asFlow(Iterator<? extends T> it) {
        return FlowKt__BuildersKt.asFlow(it);
    }

    public static final <T> e asFlow(kotlin.sequences.m mVar) {
        return FlowKt__BuildersKt.asFlow(mVar);
    }

    public static final <T> e asFlow(kotlinx.coroutines.channels.a aVar) {
        return FlowKt__ChannelsKt.asFlow(aVar);
    }

    public static final e asFlow(int[] iArr) {
        return FlowKt__BuildersKt.asFlow(iArr);
    }

    public static final e asFlow(long[] jArr) {
        return FlowKt__BuildersKt.asFlow(jArr);
    }

    public static final <T> e asFlow(T[] tArr) {
        return FlowKt__BuildersKt.asFlow(tArr);
    }
}
