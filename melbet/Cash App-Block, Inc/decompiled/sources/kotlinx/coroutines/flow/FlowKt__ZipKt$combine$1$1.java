package kotlinx.coroutines.flow;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.account.types.SignedInState;
import com.squareup.cash.clientsync.EntitySyncerKt$hasSyncedFlow$1;
import com.squareup.cash.db2.TreehouseAppConfig;
import com.squareup.cash.e2ee.signature.RealSignatureManager;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options;
import com.squareup.cash.treehouse.android.configuration.RealTreehouseConfigurationStore;
import com.squareup.cash.treehouse.android.configuration.TreehouseAppConfigurations;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.List;
import kotlin.Function;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function6;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class FlowKt__ZipKt$combine$1$1 extends SuspendLambda implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $transform;
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public Object L$2;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FlowKt__ZipKt$combine$1$1(Object obj, Object obj2, Continuation continuation, int i) {
        super(3, continuation);
        this.$r8$classId = i;
        this.L$1 = obj;
        this.$transform = obj2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        Object obj4 = this.$transform;
        switch (i) {
            case 0:
                FlowKt__ZipKt$combine$1$1 flowKt__ZipKt$combine$1$1 = new FlowKt__ZipKt$combine$1$1((Function3) obj4, (Continuation) obj3, 0);
                flowKt__ZipKt$combine$1$1.L$0 = (FlowCollector) obj;
                flowKt__ZipKt$combine$1$1.L$1 = (Object[]) obj2;
                return flowKt__ZipKt$combine$1$1.invokeSuspend(Unit.INSTANCE);
            case 1:
                FlowKt__ZipKt$combine$1$1 flowKt__ZipKt$combine$1$12 = new FlowKt__ZipKt$combine$1$1((RealSignatureManager) this.L$1, (CoroutineScope) obj4, (Continuation) obj3, 1);
                flowKt__ZipKt$combine$1$12.L$2 = (SignedInState) obj;
                flowKt__ZipKt$combine$1$12.L$0 = (FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options) obj2;
                return flowKt__ZipKt$combine$1$12.invokeSuspend(Unit.INSTANCE);
            case 2:
                FlowKt__ZipKt$combine$1$1 flowKt__ZipKt$combine$1$13 = new FlowKt__ZipKt$combine$1$1((RealTreehouseConfigurationStore) this.L$1, (String) obj4, (Continuation) obj3, 2);
                flowKt__ZipKt$combine$1$13.L$2 = (TreehouseAppConfigurations) obj;
                flowKt__ZipKt$combine$1$13.L$0 = (List) obj2;
                return flowKt__ZipKt$combine$1$13.invokeSuspend(Unit.INSTANCE);
            case 3:
                FlowKt__ZipKt$combine$1$1 flowKt__ZipKt$combine$1$14 = new FlowKt__ZipKt$combine$1$1((Function2) obj4, (Continuation) obj3, 3);
                flowKt__ZipKt$combine$1$14.L$0 = (FlowCollector) obj;
                flowKt__ZipKt$combine$1$14.L$1 = obj2;
                return flowKt__ZipKt$combine$1$14.invokeSuspend(Unit.INSTANCE);
            case 4:
                FlowKt__ZipKt$combine$1$1 flowKt__ZipKt$combine$1$15 = new FlowKt__ZipKt$combine$1$1((Continuation) obj3, (Function4) obj4, 4);
                flowKt__ZipKt$combine$1$15.L$0 = (FlowCollector) obj;
                flowKt__ZipKt$combine$1$15.L$1 = (Object[]) obj2;
                return flowKt__ZipKt$combine$1$15.invokeSuspend(Unit.INSTANCE);
            default:
                FlowKt__ZipKt$combine$1$1 flowKt__ZipKt$combine$1$16 = new FlowKt__ZipKt$combine$1$1((Continuation) obj3, (Function6) obj4, 5);
                flowKt__ZipKt$combine$1$16.L$0 = (FlowCollector) obj;
                flowKt__ZipKt$combine$1$16.L$1 = (Object[]) obj2;
                return flowKt__ZipKt$combine$1$16.invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x020d, code lost:
    
        if (r0.emit(r1, r13) == r9) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01fe, code lost:
    
        if (r1 == r9) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0064, code lost:
    
        if (r9.emit(r0, r13) == r10) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
    
        if (r0 == r10) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b4, code lost:
    
        if (r0.emit(r1, r13) == r9) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a5, code lost:
    
        if (r1 == r9) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00fc, code lost:
    
        if (r0.emit(r1, r13) == r2) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ed, code lost:
    
        if (r1 == r2) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0189, code lost:
    
        if (com.squareup.cash.e2ee.signature.RealSignatureManager.access$deleteSignature(r0, r13) == r9) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01bf, code lost:
    
        if (r0 == r9) goto L88;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object invoke;
        Unit unit;
        Object obj2;
        Object invoke2;
        Object invoke3;
        Object invoke4;
        int i = this.$r8$classId;
        Object obj3 = this.$transform;
        Continuation continuation = null;
        switch (i) {
            case 0:
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                Object[] objArr = (Object[]) this.L$1;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Object obj4 = objArr[0];
                    Object obj5 = objArr[1];
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = flowCollector;
                    this.label = 1;
                    invoke = ((Function3) obj3).invoke(obj4, obj5, this);
                    break;
                } else if (i2 == 1) {
                    flowCollector = (FlowCollector) this.L$2;
                    SafeTrace.throwOnFailure(obj);
                    invoke = obj;
                } else if (i2 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    break;
                }
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 2;
                break;
            case 1:
                RealSignatureManager realSignatureManager = (RealSignatureManager) this.L$1;
                SignedInState signedInState = (SignedInState) this.L$2;
                FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options featureFlag$EnabledDisabledUnassignedFeatureFlag$Options = (FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options) this.L$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    int ordinal = signedInState.ordinal();
                    if (ordinal == 0) {
                        CoroutineScope coroutineScope = (CoroutineScope) obj3;
                        this.L$2 = null;
                        this.L$0 = null;
                        this.label = 1;
                        if (!featureFlag$EnabledDisabledUnassignedFeatureFlag$Options.enabled()) {
                            unit = Unit.INSTANCE;
                            break;
                        } else {
                            StandaloneCoroutine standaloneCoroutine = (StandaloneCoroutine) realSignatureManager.checkJob;
                            if (standaloneCoroutine != null && standaloneCoroutine.isActive()) {
                                unit = Unit.INSTANCE;
                                break;
                            } else {
                                realSignatureManager.checkJob = JobKt.launch$default(coroutineScope, null, null, new EntitySyncerKt$hasSyncedFlow$1(realSignatureManager, continuation, 27), 3);
                                unit = Unit.INSTANCE;
                                break;
                            }
                        }
                    } else if (ordinal != 1) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        this.L$2 = null;
                        this.L$0 = null;
                        this.label = 2;
                        break;
                    }
                } else if (i3 != 1 && i3 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 2:
                TreehouseAppConfigurations treehouseAppConfigurations = (TreehouseAppConfigurations) this.L$2;
                List list = (List) this.L$0;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealTreehouseConfigurationStore realTreehouseConfigurationStore = (RealTreehouseConfigurationStore) this.L$1;
                    String str = (String) obj3;
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            if (str.equals(((TreehouseAppConfig) obj2).app_name)) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    this.L$2 = null;
                    this.L$0 = null;
                    this.label = 1;
                    Object access$toModel = RealTreehouseConfigurationStore.access$toModel(realTreehouseConfigurationStore, str, treehouseAppConfigurations, (TreehouseAppConfig) obj2, this);
                    if (access$toModel == coroutineSingletons3) {
                        break;
                    }
                } else if (i4 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    break;
                }
                break;
            case 3:
                FlowCollector flowCollector2 = (FlowCollector) this.L$0;
                Object obj6 = this.L$1;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = flowCollector2;
                    this.label = 1;
                    invoke2 = ((Function2) obj3).invoke(obj6, this);
                    break;
                } else if (i5 == 1) {
                    flowCollector2 = (FlowCollector) this.L$2;
                    SafeTrace.throwOnFailure(obj);
                    invoke2 = obj;
                } else if (i5 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    break;
                }
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 2;
                break;
            case 4:
                FlowCollector flowCollector3 = (FlowCollector) this.L$0;
                Object[] objArr2 = (Object[]) this.L$1;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Object obj7 = objArr2[0];
                    Object obj8 = objArr2[1];
                    Object obj9 = objArr2[2];
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = flowCollector3;
                    this.label = 1;
                    invoke3 = ((Function4) obj3).invoke(obj7, obj8, obj9, this);
                    break;
                } else if (i6 == 1) {
                    flowCollector3 = (FlowCollector) this.L$2;
                    SafeTrace.throwOnFailure(obj);
                    invoke3 = obj;
                } else if (i6 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    break;
                }
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 2;
                break;
            default:
                FlowCollector flowCollector4 = (FlowCollector) this.L$0;
                Object[] objArr3 = (Object[]) this.L$1;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Function6 function6 = (Function6) obj3;
                    Object obj10 = objArr3[0];
                    Object obj11 = objArr3[1];
                    Object obj12 = objArr3[2];
                    Object obj13 = objArr3[3];
                    Object obj14 = objArr3[4];
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = flowCollector4;
                    this.label = 1;
                    invoke4 = function6.invoke(obj10, obj11, obj12, obj13, obj14, this);
                    break;
                } else if (i7 == 1) {
                    flowCollector4 = (FlowCollector) this.L$2;
                    SafeTrace.throwOnFailure(obj);
                    invoke4 = obj;
                } else if (i7 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    break;
                }
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 2;
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FlowKt__ZipKt$combine$1$1(Function function, Continuation continuation, int i) {
        super(3, continuation);
        this.$r8$classId = i;
        this.$transform = function;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FlowKt__ZipKt$combine$1$1(Continuation continuation, Function function, int i) {
        super(3, continuation);
        this.$r8$classId = i;
        this.$transform = function;
    }
}
