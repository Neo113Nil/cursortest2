package androidx.compose.ui.input.nestedscroll;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* compiled from: NestedScrollModifierLocal.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u0019H\u0096@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u0019H\u0096@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010%R/\u0010-\u001a\u0004\u0018\u00010\u00002\b\u0010&\u001a\u0004\u0018\u00010\u00008B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u001c\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0000028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0014\u00107\u001a\u00020\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u0010*\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00068"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollModifierLocal;", "Landroidx/compose/ui/modifier/ModifierLocalConsumer;", "Landroidx/compose/ui/modifier/ModifierLocalProvider;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "dispatcher", "connection", "<init>", "(Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;)V", "Landroidx/compose/ui/modifier/ModifierLocalReadScope;", "scope", "", "onModifierLocalsUpdated", "(Landroidx/compose/ui/modifier/ModifierLocalReadScope;)V", "Landroidx/compose/ui/geometry/Offset;", "available", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "onPreScroll-OzD1aCk", "(JI)J", "onPreScroll", "consumed", "onPostScroll-DzOQY0M", "(JJI)J", "onPostScroll", "Landroidx/compose/ui/unit/Velocity;", "onPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPreFling", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostFling", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "getDispatcher", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "getConnection", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "<set-?>", "parent$delegate", "Landroidx/compose/runtime/MutableState;", "getParent", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollModifierLocal;", "setParent", "(Landroidx/compose/ui/input/nestedscroll/NestedScrollModifierLocal;)V", "parent", "Lkotlinx/coroutines/CoroutineScope;", "getNestedCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "nestedCoroutineScope", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "getKey", "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "key", "getValue", "value", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class NestedScrollModifierLocal implements ModifierLocalConsumer, ModifierLocalProvider<NestedScrollModifierLocal>, NestedScrollConnection {
    private final NestedScrollConnection connection;
    private final NestedScrollDispatcher dispatcher;

    /* renamed from: parent$delegate, reason: from kotlin metadata */
    private final MutableState parent;

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    public NestedScrollModifierLocal getValue() {
        return this;
    }

    public NestedScrollModifierLocal(NestedScrollDispatcher dispatcher, NestedScrollConnection connection) {
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(connection, "connection");
        this.dispatcher = dispatcher;
        this.connection = connection;
        dispatcher.setCalculateNestedScrollScope$ui_release(new Function0() { // from class: androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: invoke */
            public final CoroutineScope mo4828invoke() {
                return NestedScrollModifierLocal.this.getNestedCoroutineScope();
            }
        });
        this.parent = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    private final NestedScrollModifierLocal getParent() {
        return (NestedScrollModifierLocal) this.parent.getValue();
    }

    private final void setParent(NestedScrollModifierLocal nestedScrollModifierLocal) {
        this.parent.setValue(nestedScrollModifierLocal);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CoroutineScope getNestedCoroutineScope() {
        CoroutineScope originNestedScrollScope;
        NestedScrollModifierLocal parent = getParent();
        if ((parent == null || (originNestedScrollScope = parent.getNestedCoroutineScope()) == null) && (originNestedScrollScope = this.dispatcher.getOriginNestedScrollScope()) == null) {
            throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        }
        return originNestedScrollScope;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    public ProvidableModifierLocal getKey() {
        return NestedScrollModifierLocalKt.getModifierLocalNestedScroll();
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalConsumer
    public void onModifierLocalsUpdated(ModifierLocalReadScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        setParent((NestedScrollModifierLocal) scope.getCurrent(NestedScrollModifierLocalKt.getModifierLocalNestedScroll()));
        this.dispatcher.setParent$ui_release(getParent());
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public long mo374onPreScrollOzD1aCk(long available, int source) {
        NestedScrollModifierLocal parent = getParent();
        long mo374onPreScrollOzD1aCk = parent != null ? parent.mo374onPreScrollOzD1aCk(available, source) : Offset.INSTANCE.m1308getZeroF1C5BW0();
        return Offset.m1302plusMKHz9U(mo374onPreScrollOzD1aCk, this.connection.mo374onPreScrollOzD1aCk(Offset.m1301minusMKHz9U(available, mo374onPreScrollOzD1aCk), source));
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo277onPostScrollDzOQY0M(long consumed, long available, int source) {
        long mo277onPostScrollDzOQY0M = this.connection.mo277onPostScrollDzOQY0M(consumed, available, source);
        NestedScrollModifierLocal parent = getParent();
        return Offset.m1302plusMKHz9U(mo277onPostScrollDzOQY0M, parent != null ? parent.mo277onPostScrollDzOQY0M(Offset.m1302plusMKHz9U(consumed, mo277onPostScrollDzOQY0M), Offset.m1301minusMKHz9U(available, mo277onPostScrollDzOQY0M), source) : Offset.INSTANCE.m1308getZeroF1C5BW0());
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreFling-QWom1Mo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo373onPreFlingQWom1Mo(long j, Continuation continuation) {
        NestedScrollModifierLocal$onPreFling$1 nestedScrollModifierLocal$onPreFling$1;
        Object obj;
        Object coroutine_suspended;
        int i;
        long m2612getZero9UxMQ8M;
        NestedScrollModifierLocal nestedScrollModifierLocal;
        long j2;
        if (continuation instanceof NestedScrollModifierLocal$onPreFling$1) {
            nestedScrollModifierLocal$onPreFling$1 = (NestedScrollModifierLocal$onPreFling$1) continuation;
            int i2 = nestedScrollModifierLocal$onPreFling$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nestedScrollModifierLocal$onPreFling$1.label = i2 - Integer.MIN_VALUE;
                obj = nestedScrollModifierLocal$onPreFling$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = nestedScrollModifierLocal$onPreFling$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    NestedScrollModifierLocal parent = getParent();
                    if (parent == null) {
                        m2612getZero9UxMQ8M = Velocity.INSTANCE.m2612getZero9UxMQ8M();
                        nestedScrollModifierLocal = this;
                        long j3 = j;
                        j2 = m2612getZero9UxMQ8M;
                        NestedScrollConnection nestedScrollConnection = nestedScrollModifierLocal.connection;
                        long m2608minusAH228Gc = Velocity.m2608minusAH228Gc(j3, j2);
                        nestedScrollModifierLocal$onPreFling$1.L$0 = null;
                        nestedScrollModifierLocal$onPreFling$1.J$0 = j2;
                        nestedScrollModifierLocal$onPreFling$1.label = 2;
                        obj = nestedScrollConnection.mo373onPreFlingQWom1Mo(m2608minusAH228Gc, nestedScrollModifierLocal$onPreFling$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Velocity.m2599boximpl(Velocity.m2609plusAH228Gc(j2, ((Velocity) obj).getPackedValue()));
                    }
                    nestedScrollModifierLocal$onPreFling$1.L$0 = this;
                    nestedScrollModifierLocal$onPreFling$1.J$0 = j;
                    nestedScrollModifierLocal$onPreFling$1.label = 1;
                    obj = parent.mo373onPreFlingQWom1Mo(j, nestedScrollModifierLocal$onPreFling$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    nestedScrollModifierLocal = this;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            j2 = nestedScrollModifierLocal$onPreFling$1.J$0;
                            ResultKt.throwOnFailure(obj);
                            return Velocity.m2599boximpl(Velocity.m2609plusAH228Gc(j2, ((Velocity) obj).getPackedValue()));
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j = nestedScrollModifierLocal$onPreFling$1.J$0;
                    nestedScrollModifierLocal = (NestedScrollModifierLocal) nestedScrollModifierLocal$onPreFling$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                m2612getZero9UxMQ8M = ((Velocity) obj).getPackedValue();
                long j32 = j;
                j2 = m2612getZero9UxMQ8M;
                NestedScrollConnection nestedScrollConnection2 = nestedScrollModifierLocal.connection;
                long m2608minusAH228Gc2 = Velocity.m2608minusAH228Gc(j32, j2);
                nestedScrollModifierLocal$onPreFling$1.L$0 = null;
                nestedScrollModifierLocal$onPreFling$1.J$0 = j2;
                nestedScrollModifierLocal$onPreFling$1.label = 2;
                obj = nestedScrollConnection2.mo373onPreFlingQWom1Mo(m2608minusAH228Gc2, nestedScrollModifierLocal$onPreFling$1);
                if (obj == coroutine_suspended) {
                }
                return Velocity.m2599boximpl(Velocity.m2609plusAH228Gc(j2, ((Velocity) obj).getPackedValue()));
            }
        }
        nestedScrollModifierLocal$onPreFling$1 = new NestedScrollModifierLocal$onPreFling$1(this, continuation);
        obj = nestedScrollModifierLocal$onPreFling$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = nestedScrollModifierLocal$onPreFling$1.label;
        if (i != 0) {
        }
        m2612getZero9UxMQ8M = ((Velocity) obj).getPackedValue();
        long j322 = j;
        j2 = m2612getZero9UxMQ8M;
        NestedScrollConnection nestedScrollConnection22 = nestedScrollModifierLocal.connection;
        long m2608minusAH228Gc22 = Velocity.m2608minusAH228Gc(j322, j2);
        nestedScrollModifierLocal$onPreFling$1.L$0 = null;
        nestedScrollModifierLocal$onPreFling$1.J$0 = j2;
        nestedScrollModifierLocal$onPreFling$1.label = 2;
        obj = nestedScrollConnection22.mo373onPreFlingQWom1Mo(m2608minusAH228Gc22, nestedScrollModifierLocal$onPreFling$1);
        if (obj == coroutine_suspended) {
        }
        return Velocity.m2599boximpl(Velocity.m2609plusAH228Gc(j2, ((Velocity) obj).getPackedValue()));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostFling-RZ2iAVY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo276onPostFlingRZ2iAVY(long j, long j2, Continuation continuation) {
        NestedScrollModifierLocal$onPostFling$1 nestedScrollModifierLocal$onPostFling$1;
        int i;
        long j3;
        long j4;
        NestedScrollModifierLocal nestedScrollModifierLocal;
        NestedScrollModifierLocal parent;
        long j5;
        long m2612getZero9UxMQ8M;
        long j6;
        if (continuation instanceof NestedScrollModifierLocal$onPostFling$1) {
            nestedScrollModifierLocal$onPostFling$1 = (NestedScrollModifierLocal$onPostFling$1) continuation;
            int i2 = nestedScrollModifierLocal$onPostFling$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nestedScrollModifierLocal$onPostFling$1.label = i2 - Integer.MIN_VALUE;
                Object obj = nestedScrollModifierLocal$onPostFling$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = nestedScrollModifierLocal$onPostFling$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    NestedScrollConnection nestedScrollConnection = this.connection;
                    nestedScrollModifierLocal$onPostFling$1.L$0 = this;
                    j3 = j;
                    nestedScrollModifierLocal$onPostFling$1.J$0 = j3;
                    j4 = j2;
                    nestedScrollModifierLocal$onPostFling$1.J$1 = j4;
                    nestedScrollModifierLocal$onPostFling$1.label = 1;
                    obj = nestedScrollConnection.mo276onPostFlingRZ2iAVY(j, j2, nestedScrollModifierLocal$onPostFling$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    nestedScrollModifierLocal = this;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            j6 = nestedScrollModifierLocal$onPostFling$1.J$0;
                            ResultKt.throwOnFailure(obj);
                            m2612getZero9UxMQ8M = ((Velocity) obj).getPackedValue();
                            j5 = j6;
                            return Velocity.m2599boximpl(Velocity.m2609plusAH228Gc(j5, m2612getZero9UxMQ8M));
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    long j7 = nestedScrollModifierLocal$onPostFling$1.J$1;
                    long j8 = nestedScrollModifierLocal$onPostFling$1.J$0;
                    nestedScrollModifierLocal = (NestedScrollModifierLocal) nestedScrollModifierLocal$onPostFling$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    j4 = j7;
                    j3 = j8;
                }
                long packedValue = ((Velocity) obj).getPackedValue();
                parent = nestedScrollModifierLocal.getParent();
                if (parent != null) {
                    j5 = packedValue;
                    m2612getZero9UxMQ8M = Velocity.INSTANCE.m2612getZero9UxMQ8M();
                    return Velocity.m2599boximpl(Velocity.m2609plusAH228Gc(j5, m2612getZero9UxMQ8M));
                }
                long m2609plusAH228Gc = Velocity.m2609plusAH228Gc(j3, packedValue);
                long m2608minusAH228Gc = Velocity.m2608minusAH228Gc(j4, packedValue);
                nestedScrollModifierLocal$onPostFling$1.L$0 = null;
                nestedScrollModifierLocal$onPostFling$1.J$0 = packedValue;
                nestedScrollModifierLocal$onPostFling$1.label = 2;
                obj = parent.mo276onPostFlingRZ2iAVY(m2609plusAH228Gc, m2608minusAH228Gc, nestedScrollModifierLocal$onPostFling$1);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                j6 = packedValue;
                m2612getZero9UxMQ8M = ((Velocity) obj).getPackedValue();
                j5 = j6;
                return Velocity.m2599boximpl(Velocity.m2609plusAH228Gc(j5, m2612getZero9UxMQ8M));
            }
        }
        nestedScrollModifierLocal$onPostFling$1 = new NestedScrollModifierLocal$onPostFling$1(this, continuation);
        Object obj2 = nestedScrollModifierLocal$onPostFling$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = nestedScrollModifierLocal$onPostFling$1.label;
        if (i != 0) {
        }
        long packedValue2 = ((Velocity) obj2).getPackedValue();
        parent = nestedScrollModifierLocal.getParent();
        if (parent != null) {
        }
    }
}
