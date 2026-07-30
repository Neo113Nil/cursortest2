package kotlinx.coroutines.channels;

import f6.p;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.i0;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.n;
import kotlinx.coroutines.o;
import y5.w;

/* loaded from: classes5.dex */
public abstract class ProduceKt {
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object awaitClose(j jVar, f6.a aVar, kotlin.coroutines.c cVar) {
        ProduceKt$awaitClose$1 produceKt$awaitClose$1;
        Object coroutine_suspended;
        int i8;
        kotlin.coroutines.c intercepted;
        Object coroutine_suspended2;
        try {
            if (cVar instanceof ProduceKt$awaitClose$1) {
                produceKt$awaitClose$1 = (ProduceKt$awaitClose$1) cVar;
                int i9 = produceKt$awaitClose$1.label;
                if ((i9 & Integer.MIN_VALUE) != 0) {
                    produceKt$awaitClose$1.label = i9 - Integer.MIN_VALUE;
                    Object obj = produceKt$awaitClose$1.result;
                    coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                    i8 = produceKt$awaitClose$1.label;
                    if (i8 != 0) {
                        y5.g.throwOnFailure(obj);
                        if (produceKt$awaitClose$1.getContext().get(l1.Key) != jVar) {
                            throw new IllegalStateException("awaitClose() can only be invoked from the producer context".toString());
                        }
                        produceKt$awaitClose$1.L$0 = jVar;
                        produceKt$awaitClose$1.L$1 = aVar;
                        produceKt$awaitClose$1.label = 1;
                        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(produceKt$awaitClose$1);
                        final o oVar = new o(intercepted, 1);
                        oVar.initCancellability();
                        jVar.invokeOnClose(new f6.l() { // from class: kotlinx.coroutines.channels.ProduceKt$awaitClose$4$1
                            {
                                super(1);
                            }

                            @Override // f6.l
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                invoke((Throwable) obj2);
                                return w.INSTANCE;
                            }

                            public final void invoke(Throwable th) {
                                n nVar = n.this;
                                Result.a aVar2 = Result.Companion;
                                nVar.resumeWith(Result.m348constructorimpl(w.INSTANCE));
                            }
                        });
                        Object result = oVar.getResult();
                        coroutine_suspended2 = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                        if (result == coroutine_suspended2) {
                            kotlin.coroutines.jvm.internal.f.probeCoroutineSuspended(produceKt$awaitClose$1);
                        }
                        if (result == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i8 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar = (f6.a) produceKt$awaitClose$1.L$1;
                        y5.g.throwOnFailure(obj);
                    }
                    aVar.invoke();
                    return w.INSTANCE;
                }
            }
            if (i8 != 0) {
            }
            aVar.invoke();
            return w.INSTANCE;
        } catch (Throwable th) {
            aVar.invoke();
            throw th;
        }
        produceKt$awaitClose$1 = new ProduceKt$awaitClose$1(cVar);
        Object obj2 = produceKt$awaitClose$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        i8 = produceKt$awaitClose$1.label;
    }

    public static /* synthetic */ Object awaitClose$default(j jVar, f6.a aVar, kotlin.coroutines.c cVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            aVar = new f6.a() { // from class: kotlinx.coroutines.channels.ProduceKt$awaitClose$2
                /* renamed from: invoke, reason: collision with other method in class */
                public final void m1235invoke() {
                }

                @Override // f6.a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m1235invoke();
                    return w.INSTANCE;
                }
            };
        }
        return awaitClose(jVar, aVar, cVar);
    }

    public static final <E> ReceiveChannel produce(i0 i0Var, CoroutineContext coroutineContext, int i8, p pVar) {
        return produce(i0Var, coroutineContext, i8, BufferOverflow.SUSPEND, CoroutineStart.DEFAULT, null, pVar);
    }

    public static /* synthetic */ ReceiveChannel produce$default(i0 i0Var, CoroutineContext coroutineContext, int i8, p pVar, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i9 & 2) != 0) {
            i8 = 0;
        }
        return produce(i0Var, coroutineContext, i8, pVar);
    }

    public static final <E> ReceiveChannel produce(i0 i0Var, CoroutineContext coroutineContext, int i8, CoroutineStart coroutineStart, f6.l lVar, p pVar) {
        return produce(i0Var, coroutineContext, i8, BufferOverflow.SUSPEND, coroutineStart, lVar, pVar);
    }

    public static final <E> ReceiveChannel produce(i0 i0Var, CoroutineContext coroutineContext, int i8, BufferOverflow bufferOverflow, CoroutineStart coroutineStart, f6.l lVar, p pVar) {
        i iVar = new i(CoroutineContextKt.newCoroutineContext(i0Var, coroutineContext), d.Channel$default(i8, bufferOverflow, null, 4, null));
        if (lVar != null) {
            iVar.invokeOnCompletion(lVar);
        }
        iVar.start(coroutineStart, iVar, pVar);
        return iVar;
    }

    public static /* synthetic */ ReceiveChannel produce$default(i0 i0Var, CoroutineContext coroutineContext, int i8, CoroutineStart coroutineStart, f6.l lVar, p pVar, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        int i10 = (i9 & 2) != 0 ? 0 : i8;
        if ((i9 & 4) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        CoroutineStart coroutineStart2 = coroutineStart;
        if ((i9 & 8) != 0) {
            lVar = null;
        }
        return produce(i0Var, coroutineContext2, i10, coroutineStart2, lVar, pVar);
    }

    public static /* synthetic */ ReceiveChannel produce$default(i0 i0Var, CoroutineContext coroutineContext, int i8, BufferOverflow bufferOverflow, CoroutineStart coroutineStart, f6.l lVar, p pVar, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        int i10 = (i9 & 2) != 0 ? 0 : i8;
        if ((i9 & 4) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        BufferOverflow bufferOverflow2 = bufferOverflow;
        if ((i9 & 8) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        CoroutineStart coroutineStart2 = coroutineStart;
        if ((i9 & 16) != 0) {
            lVar = null;
        }
        return produce(i0Var, coroutineContext2, i10, bufferOverflow2, coroutineStart2, lVar, pVar);
    }
}
