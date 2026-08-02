package kotlinx.coroutines.flow.internal;

import androidx.compose.runtime.Recomposer$join$2;
import androidx.lifecycle.Lifecycle;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.clientrouting.fallback.RealSelectiveUnrecognizedURLNavigator;
import com.squareup.cash.clientsync.sync.ClientSyncSetupTeardown;
import com.squareup.cash.clientsync.sync.ClientSyncSetupTeardown$setup$1$2;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.data.db.RealAppConfigManager;
import com.squareup.cash.db2.ClientRoutingConfig;
import com.squareup.cash.google.pay.GooglePayPresenter$models$1$1;
import com.squareup.cash.gps.backend.real.GpsLocationRefresher;
import com.squareup.cash.music.presenters.MusicPresenter$models$3$1;
import com.squareup.cash.payments.presenters.PersonalizePaymentResourceRefresher;
import com.squareup.cash.pools.backend.real.PoolsRefresher;
import com.squareup.cash.profile.views.RingtoneView$playRingtone$1;
import com.squareup.cash.ui.gcm.RealGcmRegistrar$unregister$2;
import com.squareup.util.coroutines.SetupTeardown;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.Symbol;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.PapaEvent;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class CombineKt$combineInternal$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Function0 $arrayFactory;
    public final /* synthetic */ Flow[] $flows;
    public final /* synthetic */ FlowCollector $this_combineInternal;
    public final /* synthetic */ Function3 $transform;
    public int I$0;
    public int I$1;
    public int I$2;
    public /* synthetic */ Object L$0;
    public Object[] L$1;
    public Channel L$2;
    public byte[] L$4;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombineKt$combineInternal$2(Continuation continuation, Function0 function0, Function3 function3, FlowCollector flowCollector, Flow[] flowArr) {
        super(2, continuation);
        this.$flows = flowArr;
        this.$arrayFactory = function0;
        this.$transform = function3;
        this.$this_combineInternal = flowCollector;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CombineKt$combineInternal$2 combineKt$combineInternal$2 = new CombineKt$combineInternal$2(continuation, this.$arrayFactory, this.$transform, this.$this_combineInternal, this.$flows);
        combineKt$combineInternal$2.L$0 = obj;
        return combineKt$combineInternal$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CombineKt$combineInternal$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0135, code lost:
    
        if (r15.invoke(r14, r8, r19) == r3) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d0 A[LOOP:0: B:18:0x00d0->B:25:0x00f1, LOOP_START, PHI: r4 r14
      0x00d0: PHI (r4v4 int) = (r4v3 int), (r4v5 int) binds: [B:14:0x00cb, B:25:0x00f1] A[DONT_GENERATE, DONT_INLINE]
      0x00d0: PHI (r14v6 kotlin.collections.IndexedValue) = (r14v5 kotlin.collections.IndexedValue), (r14v10 kotlin.collections.IndexedValue) binds: [B:14:0x00cb, B:25:0x00f1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r2v11, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v9, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0135 -> B:7:0x002e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x013a -> B:9:0x011a). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int length;
        byte[] bArr;
        byte b;
        Object[] objArr;
        Channel channel;
        int i;
        Object obj2;
        int i2;
        int i3;
        IndexedValue indexedValue;
        Symbol symbol = CombineKt.UNINITIALIZED;
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = this.label;
        int i5 = 2;
        byte b2 = 1;
        if (i4 == 0) {
            SafeTrace.throwOnFailure(obj);
            length = this.$flows.length;
            if (length == 0) {
                return Unit.INSTANCE;
            }
            Object[] objArr2 = new Object[length];
            ArraysKt___ArraysJvmKt.fill(objArr2, 0, length, symbol);
            BufferedChannel Channel$default = PapaEvent.Channel$default(length, null, null, 6);
            AtomicInteger atomicInteger = new AtomicInteger(length);
            for (int i6 = 0; i6 < length; i6++) {
                JobKt.launch$default(coroutineScope, null, null, new AnonymousClass1(this.$flows, i6, atomicInteger, Channel$default, null), 3);
            }
            bArr = new byte[length];
            b = 0;
            objArr = objArr2;
            channel = Channel$default;
            i = length;
            b = (byte) (b + b2);
            this.L$0 = null;
            this.L$1 = objArr;
            this.L$2 = channel;
            this.L$4 = bArr;
            this.I$0 = length;
            this.I$1 = i;
            this.I$2 = b;
            this.label = b2;
            obj2 = channel.mo4187receiveCatchingJP2dKIU(this);
            if (obj2 != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i4 != 1) {
            if (i4 == 2) {
                ?? r2 = this.I$2;
                int i7 = this.I$1;
                int i8 = this.I$0;
                byte[] bArr2 = this.L$4;
                channel = this.L$2;
                Object[] objArr3 = this.L$1;
                SafeTrace.throwOnFailure(obj);
                b = r2;
                bArr = bArr2;
                objArr = objArr3;
                i = i7;
                length = i8;
                b2 = 1;
                b = (byte) (b + b2);
                this.L$0 = null;
                this.L$1 = objArr;
                this.L$2 = channel;
                this.L$4 = bArr;
                this.I$0 = length;
                this.I$1 = i;
                this.I$2 = b;
                this.label = b2;
                obj2 = channel.mo4187receiveCatchingJP2dKIU(this);
                if (obj2 != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i4 != 3) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ?? r22 = this.I$2;
            i3 = this.I$1;
            i2 = this.I$0;
            byte[] bArr3 = this.L$4;
            channel = this.L$2;
            Object[] objArr4 = this.L$1;
            SafeTrace.throwOnFailure(obj);
            b = r22;
            bArr = bArr3;
            objArr = objArr4;
            int i9 = i2;
            i = i3;
            length = i9;
            i5 = 2;
            b2 = 1;
            b = (byte) (b + b2);
            this.L$0 = null;
            this.L$1 = objArr;
            this.L$2 = channel;
            this.L$4 = bArr;
            this.I$0 = length;
            this.I$1 = i;
            this.I$2 = b;
            this.label = b2;
            obj2 = channel.mo4187receiveCatchingJP2dKIU(this);
            if (obj2 != coroutineSingletons) {
                int i10 = i;
                i2 = length;
                i3 = i10;
                indexedValue = (IndexedValue) ChannelResult.m4191getOrNullimpl(obj2);
                if (indexedValue != null) {
                    return Unit.INSTANCE;
                }
                do {
                    int i11 = indexedValue.index;
                    Object obj3 = objArr[i11];
                    objArr[i11] = indexedValue.value;
                    if (obj3 == symbol) {
                        i3--;
                    }
                    if (bArr[i11] == b) {
                        break;
                    }
                    bArr[i11] = b;
                    indexedValue = (IndexedValue) ChannelResult.m4191getOrNullimpl(channel.mo4189tryReceivePtdJZtk());
                } while (indexedValue != null);
                if (i3 == 0) {
                    Object[] objArr5 = (Object[]) this.$arrayFactory.invoke();
                    FlowCollector flowCollector = this.$this_combineInternal;
                    Function3 function3 = this.$transform;
                    if (objArr5 == null) {
                        this.L$0 = null;
                        this.L$1 = objArr;
                        this.L$2 = channel;
                        this.L$4 = bArr;
                        this.I$0 = i2;
                        this.I$1 = i3;
                        this.I$2 = b;
                        this.label = i5;
                        if (function3.invoke(flowCollector, objArr, this) != coroutineSingletons) {
                            int i12 = i2;
                            i = i3;
                            length = i12;
                        }
                    } else {
                        ArraysKt___ArraysJvmKt.copyInto$default(0, 0, 14, objArr, objArr5);
                        this.L$0 = null;
                        this.L$1 = objArr;
                        this.L$2 = channel;
                        this.L$4 = bArr;
                        this.I$0 = i2;
                        this.I$1 = i3;
                        this.I$2 = b;
                        this.label = 3;
                    }
                } else {
                    int i13 = i2;
                    i = i3;
                    length = i13;
                }
                b2 = 1;
                b = (byte) (b + b2);
                this.L$0 = null;
                this.L$1 = objArr;
                this.L$2 = channel;
                this.L$4 = bArr;
                this.I$0 = length;
                this.I$1 = i;
                this.I$2 = b;
                this.label = b2;
                obj2 = channel.mo4187receiveCatchingJP2dKIU(this);
                if (obj2 != coroutineSingletons) {
                }
            }
            return coroutineSingletons;
        }
        ?? r23 = this.I$2;
        i3 = this.I$1;
        i2 = this.I$0;
        byte[] bArr4 = this.L$4;
        channel = this.L$2;
        Object[] objArr6 = this.L$1;
        SafeTrace.throwOnFailure(obj);
        obj2 = ((ChannelResult) obj).holder;
        b = r23;
        bArr = bArr4;
        objArr = objArr6;
        indexedValue = (IndexedValue) ChannelResult.m4191getOrNullimpl(obj2);
        if (indexedValue != null) {
        }
    }

    /* renamed from: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements Function2 {
        public /* synthetic */ Object $flows;
        public int $i;
        public final /* synthetic */ Object $nonClosed;
        public final /* synthetic */ int $r8$classId;
        public Object $resultChannel;
        public int label;

        /* renamed from: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1, reason: invalid class name and collision with other inner class name */
        public final class C00781 implements FlowCollector {
            public final /* synthetic */ int $i;
            public final /* synthetic */ BufferedChannel $resultChannel;

            public C00781(BufferedChannel bufferedChannel, int i) {
                this.$resultChannel = bufferedChannel;
                this.$i = i;
            }

            /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
            
                if (kotlinx.coroutines.JobKt.yield(r0) != r1) goto L22;
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
            
                return r1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
            
                if (r5.$resultChannel.send(r7, r0) == r1) goto L21;
             */
            /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                CombineKt$combineInternal$2$1$1$emit$1 combineKt$combineInternal$2$1$1$emit$1;
                int i;
                if (continuation instanceof CombineKt$combineInternal$2$1$1$emit$1) {
                    combineKt$combineInternal$2$1$1$emit$1 = (CombineKt$combineInternal$2$1$1$emit$1) continuation;
                    int i2 = combineKt$combineInternal$2$1$1$emit$1.label;
                    if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                        combineKt$combineInternal$2$1$1$emit$1.label = i2 - PKIFailureInfo.systemUnavail;
                        Object obj2 = combineKt$combineInternal$2$1$1$emit$1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = combineKt$combineInternal$2$1$1$emit$1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj2);
                            IndexedValue indexedValue = new IndexedValue(this.$i, obj);
                            combineKt$combineInternal$2$1$1$emit$1.label = 1;
                        } else {
                            if (i != 1) {
                                if (i == 2) {
                                    SafeTrace.throwOnFailure(obj2);
                                    return Unit.INSTANCE;
                                }
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj2);
                        }
                        combineKt$combineInternal$2$1$1$emit$1.label = 2;
                    }
                }
                combineKt$combineInternal$2$1$1$emit$1 = new CombineKt$combineInternal$2$1$1$emit$1(this, continuation);
                Object obj22 = combineKt$combineInternal$2$1$1$emit$1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = combineKt$combineInternal$2$1$1$emit$1.label;
                if (i != 0) {
                }
                combineKt$combineInternal$2$1$1$emit$1.label = 2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Flow[] flowArr, int i, AtomicInteger atomicInteger, BufferedChannel bufferedChannel, Continuation continuation) {
            super(2, continuation);
            this.$r8$classId = 0;
            this.$flows = flowArr;
            this.$i = i;
            this.$nonClosed = atomicInteger;
            this.$resultChannel = bufferedChannel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            int i = this.$r8$classId;
            Object obj2 = this.$nonClosed;
            switch (i) {
                case 0:
                    return new AnonymousClass1((Flow[]) this.$flows, this.$i, (AtomicInteger) obj2, (BufferedChannel) this.$resultChannel, continuation);
                case 1:
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation, (RealSelectiveUnrecognizedURLNavigator) obj2);
                    anonymousClass1.$flows = obj;
                    return anonymousClass1;
                case 2:
                    AnonymousClass1 anonymousClass12 = new AnonymousClass1(continuation, (ClientSyncSetupTeardown) obj2, (Lifecycle) this.$resultChannel, 2);
                    anonymousClass12.$flows = obj;
                    return anonymousClass12;
                case 3:
                    AnonymousClass1 anonymousClass13 = new AnonymousClass1(continuation, (GpsLocationRefresher) obj2, (Lifecycle) this.$resultChannel, 3);
                    anonymousClass13.$flows = obj;
                    return anonymousClass13;
                case 4:
                    AnonymousClass1 anonymousClass14 = new AnonymousClass1(continuation, (PersonalizePaymentResourceRefresher) obj2, (Lifecycle) this.$resultChannel, 4);
                    anonymousClass14.$flows = obj;
                    return anonymousClass14;
                default:
                    AnonymousClass1 anonymousClass15 = new AnonymousClass1(continuation, (PoolsRefresher) obj2, (Lifecycle) this.$resultChannel, 5);
                    anonymousClass15.$flows = obj;
                    return anonymousClass15;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            CoroutineScope coroutineScope = (CoroutineScope) obj;
            Continuation continuation = (Continuation) obj2;
            switch (this.$r8$classId) {
            }
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x005f, code lost:
        
            if (androidx.lifecycle.RepeatOnLifecycleKt.repeatOnLifecycle(r10, r3, r4, r9) == r0) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:?, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.first(r10, r3, r9) == r0) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00b8, code lost:
        
            if (androidx.lifecycle.RepeatOnLifecycleKt.repeatOnLifecycle(r10, r3, r4, r9) == r0) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x009e, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.first(r10, r3, r9) == r0) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x0111, code lost:
        
            if (androidx.lifecycle.RepeatOnLifecycleKt.repeatOnLifecycle(r10, r3, r4, r9) == r0) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:?, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x00f7, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.first(r3, r9) == r0) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x0168, code lost:
        
            if (androidx.lifecycle.RepeatOnLifecycleKt.repeatOnLifecycle(r10, r4, r7, r9) == r0) goto L62;
         */
        /* JADX WARN: Code restructure failed: missing block: B:80:0x01ca, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(r10, r0, r9) == r7) goto L78;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            RealSelectiveUnrecognizedURLNavigator realSelectiveUnrecognizedURLNavigator;
            int i;
            int i2 = this.$r8$classId;
            int i3 = 2;
            int i4 = 0;
            Object obj2 = this.$nonClosed;
            Continuation continuation = null;
            switch (i2) {
                case 0:
                    AtomicInteger atomicInteger = (AtomicInteger) obj2;
                    BufferedChannel bufferedChannel = (BufferedChannel) this.$resultChannel;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i5 = this.label;
                    try {
                        if (i5 == 0) {
                            SafeTrace.throwOnFailure(obj);
                            Flow[] flowArr = (Flow[]) this.$flows;
                            int i6 = this.$i;
                            Flow flow = flowArr[i6];
                            C00781 c00781 = new C00781(bufferedChannel, i6);
                            this.label = 1;
                            if (flow.collect(c00781, this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            if (i5 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                        }
                        if (atomicInteger.decrementAndGet() == 0) {
                            bufferedChannel.close(null);
                        }
                        return Unit.INSTANCE;
                    } finally {
                        if (atomicInteger.decrementAndGet() == 0) {
                            bufferedChannel.close(null);
                        }
                    }
                case 1:
                    RealSelectiveUnrecognizedURLNavigator realSelectiveUnrecognizedURLNavigator2 = (RealSelectiveUnrecognizedURLNavigator) obj2;
                    AppConfigManager appConfigManager = realSelectiveUnrecognizedURLNavigator2.appConfig;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i7 = this.label;
                    if (i7 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        FinishSetupTileBadgeCounter clientRouteConfig = ((RealAppConfigManager) appConfigManager).clientRouteConfig();
                        this.$flows = null;
                        this.$resultChannel = realSelectiveUnrecognizedURLNavigator2;
                        this.$i = 0;
                        this.label = 1;
                        obj = FlowKt.first(clientRouteConfig, this);
                        if (obj != coroutineSingletons2) {
                            realSelectiveUnrecognizedURLNavigator = realSelectiveUnrecognizedURLNavigator2;
                        }
                        return coroutineSingletons2;
                    }
                    if (i7 != 1) {
                        if (i7 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i4 = this.$i;
                    realSelectiveUnrecognizedURLNavigator = (RealSelectiveUnrecognizedURLNavigator) this.$resultChannel;
                    SafeTrace.throwOnFailure(obj);
                    realSelectiveUnrecognizedURLNavigator.clientRoutingConfig = (ClientRoutingConfig) obj;
                    FinishSetupTileBadgeCounter clientRouteConfig2 = ((RealAppConfigManager) appConfigManager).clientRouteConfig();
                    RealGcmRegistrar$unregister$2 realGcmRegistrar$unregister$2 = new RealGcmRegistrar$unregister$2(realSelectiveUnrecognizedURLNavigator2, continuation, 15);
                    this.$flows = null;
                    this.$resultChannel = null;
                    this.$i = i4;
                    this.label = 2;
                    break;
                case 2:
                    ClientSyncSetupTeardown clientSyncSetupTeardown = (ClientSyncSetupTeardown) obj2;
                    CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i8 = this.label;
                    if (i8 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        StateFlow onboardedAccountStatus = clientSyncSetupTeardown.sessionManager.getOnboardedAccountStatus();
                        Recomposer$join$2 recomposer$join$2 = new Recomposer$join$2(i3, continuation, 3);
                        this.$flows = null;
                        this.$i = 0;
                        this.label = 1;
                        if (FlowKt.first(onboardedAccountStatus, recomposer$join$2, this) != coroutineSingletons3) {
                            i = 0;
                        }
                        return coroutineSingletons3;
                    }
                    if (i8 != 1) {
                        if (i8 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i = this.$i;
                    SafeTrace.throwOnFailure(obj);
                    Lifecycle lifecycle = (Lifecycle) this.$resultChannel;
                    Lifecycle.State state = Lifecycle.State.RESUMED;
                    ClientSyncSetupTeardown$setup$1$2 clientSyncSetupTeardown$setup$1$2 = new ClientSyncSetupTeardown$setup$1$2(clientSyncSetupTeardown, continuation, i4);
                    this.$flows = null;
                    this.$i = i;
                    this.label = 2;
                    break;
                case 3:
                    GpsLocationRefresher gpsLocationRefresher = (GpsLocationRefresher) obj2;
                    CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i9 = this.label;
                    if (i9 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        RealBadger2$setup$lambda$0$$inlined$mapNotNull$1 realBadger2$setup$lambda$0$$inlined$mapNotNull$1 = new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(gpsLocationRefresher.sessionManager.getOnboardedAccountStatus(), 13);
                        this.$flows = null;
                        this.$i = 0;
                        this.label = 1;
                        break;
                    } else {
                        if (i9 != 1) {
                            if (i9 == 2) {
                                SafeTrace.throwOnFailure(obj);
                                return Unit.INSTANCE;
                            }
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i4 = this.$i;
                        SafeTrace.throwOnFailure(obj);
                    }
                    Lifecycle lifecycle2 = (Lifecycle) this.$resultChannel;
                    Lifecycle.State state2 = Lifecycle.State.STARTED;
                    GooglePayPresenter$models$1$1 googlePayPresenter$models$1$1 = new GooglePayPresenter$models$1$1(gpsLocationRefresher, continuation, 29);
                    this.$flows = null;
                    this.$i = i4;
                    this.label = 2;
                    break;
                case 4:
                    PersonalizePaymentResourceRefresher personalizePaymentResourceRefresher = (PersonalizePaymentResourceRefresher) obj2;
                    CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i10 = this.label;
                    if (i10 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        StateFlow onboardedAccountStatus2 = personalizePaymentResourceRefresher.sessionManager.getOnboardedAccountStatus();
                        Recomposer$join$2 recomposer$join$22 = new Recomposer$join$2(i3, continuation, 8);
                        this.$flows = null;
                        this.$i = 0;
                        this.label = 1;
                        break;
                    } else {
                        if (i10 != 1) {
                            if (i10 == 2) {
                                SafeTrace.throwOnFailure(obj);
                                return Unit.INSTANCE;
                            }
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i4 = this.$i;
                        SafeTrace.throwOnFailure(obj);
                    }
                    Lifecycle lifecycle3 = (Lifecycle) this.$resultChannel;
                    Lifecycle.State state3 = Lifecycle.State.CREATED;
                    RingtoneView$playRingtone$1 ringtoneView$playRingtone$1 = new RingtoneView$playRingtone$1(personalizePaymentResourceRefresher, continuation, 11);
                    this.$flows = null;
                    this.$i = i4;
                    this.label = 2;
                    break;
                default:
                    PoolsRefresher poolsRefresher = (PoolsRefresher) obj2;
                    CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = this.label;
                    if (i11 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        StateFlow onboardedAccountStatus3 = poolsRefresher.sessionManager.getOnboardedAccountStatus();
                        Recomposer$join$2 recomposer$join$23 = new Recomposer$join$2(i3, continuation, 9);
                        this.$flows = null;
                        this.$i = 0;
                        this.label = 1;
                        break;
                    } else {
                        if (i11 != 1) {
                            if (i11 == 2) {
                                SafeTrace.throwOnFailure(obj);
                                return Unit.INSTANCE;
                            }
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i4 = this.$i;
                        SafeTrace.throwOnFailure(obj);
                    }
                    Lifecycle lifecycle4 = (Lifecycle) this.$resultChannel;
                    Lifecycle.State state4 = Lifecycle.State.STARTED;
                    MusicPresenter$models$3$1 musicPresenter$models$3$1 = new MusicPresenter$models$3$1(poolsRefresher, continuation, 27);
                    this.$flows = null;
                    this.$i = i4;
                    this.label = 2;
                    break;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(Continuation continuation, SetupTeardown setupTeardown, Lifecycle lifecycle, int i) {
            super(2, continuation);
            this.$r8$classId = i;
            this.$nonClosed = setupTeardown;
            this.$resultChannel = lifecycle;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Continuation continuation, RealSelectiveUnrecognizedURLNavigator realSelectiveUnrecognizedURLNavigator) {
            super(2, continuation);
            this.$r8$classId = 1;
            this.$nonClosed = realSelectiveUnrecognizedURLNavigator;
        }
    }
}
