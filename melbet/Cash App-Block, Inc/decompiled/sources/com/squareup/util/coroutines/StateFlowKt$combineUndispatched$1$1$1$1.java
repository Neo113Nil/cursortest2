package com.squareup.util.coroutines;

import androidx.paging.GenerationalViewportHint;
import androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$lambda$0$$inlined$map$1$2$1;
import androidx.paging.ViewportHint;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.account.presenters.documents.AccountDocumentsPresenter$statementsForMonthViewModel$$inlined$map$2$2$1;
import com.squareup.cash.clientsync.RealRawSyncValueService$getSyncValues$$inlined$map$1$2$1;
import com.squareup.cash.clientsync.models.SyncEntity;
import com.squareup.cash.clientsync.models.SyncValueType;
import com.squareup.cash.integration.contacts.ContactBook$ContactsQuery;
import com.squareup.cash.integration.contacts.RealContactBook$getAliases$$inlined$map$1$2$1;
import com.squareup.cash.integration.contacts.RealContactBook$getAliases$1$1;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlinx.coroutines.flow.FlowCollector;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class StateFlowKt$combineUndispatched$1$1$1$1 implements FlowCollector {
    public final /* synthetic */ int $i;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $resultChannel;

    public /* synthetic */ StateFlowKt$combineUndispatched$1$1$1$1(Object obj, int i, int i2) {
        this.$r8$classId = i2;
        this.$resultChannel = obj;
        this.$i = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x018f, code lost:
    
        if (kotlinx.coroutines.JobKt.yield(r0) != r11) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0186, code lost:
    
        if (((kotlinx.coroutines.channels.BufferedChannel) r2).send(r9, r0) == r11) goto L94;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0166  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        StateFlowKt$combineUndispatched$1$1$1$1$emit$1 stateFlowKt$combineUndispatched$1$1$1$1$emit$1;
        int i;
        PageFetcherSnapshot$collectAsGenerationalViewportHints$lambda$0$$inlined$map$1$2$1 pageFetcherSnapshot$collectAsGenerationalViewportHints$lambda$0$$inlined$map$1$2$1;
        int i2;
        AccountDocumentsPresenter$statementsForMonthViewModel$$inlined$map$2$2$1 accountDocumentsPresenter$statementsForMonthViewModel$$inlined$map$2$2$1;
        int i3;
        RealRawSyncValueService$getSyncValues$$inlined$map$1$2$1 realRawSyncValueService$getSyncValues$$inlined$map$1$2$1;
        int i4;
        RealContactBook$getAliases$$inlined$map$1$2$1 realContactBook$getAliases$$inlined$map$1$2$1;
        int i5;
        int i6 = this.$r8$classId;
        int i7 = this.$i;
        Object obj2 = this.$resultChannel;
        switch (i6) {
            case 0:
                if (continuation instanceof StateFlowKt$combineUndispatched$1$1$1$1$emit$1) {
                    stateFlowKt$combineUndispatched$1$1$1$1$emit$1 = (StateFlowKt$combineUndispatched$1$1$1$1$emit$1) continuation;
                    int i8 = stateFlowKt$combineUndispatched$1$1$1$1$emit$1.label;
                    if ((i8 & PKIFailureInfo.systemUnavail) != 0) {
                        stateFlowKt$combineUndispatched$1$1$1$1$emit$1.label = i8 - PKIFailureInfo.systemUnavail;
                        Object obj3 = stateFlowKt$combineUndispatched$1$1$1$1$emit$1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = stateFlowKt$combineUndispatched$1$1$1$1$emit$1.label;
                        if (i == 0) {
                            if (i != 1) {
                                if (i == 2) {
                                    SafeTrace.throwOnFailure(obj3);
                                    break;
                                } else {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    break;
                                }
                            } else {
                                SafeTrace.throwOnFailure(obj3);
                            }
                        } else {
                            SafeTrace.throwOnFailure(obj3);
                            IndexedValue indexedValue = new IndexedValue(i7, obj);
                            stateFlowKt$combineUndispatched$1$1$1$1$emit$1.label = 1;
                            break;
                        }
                        stateFlowKt$combineUndispatched$1$1$1$1$emit$1.label = 2;
                        break;
                    }
                }
                stateFlowKt$combineUndispatched$1$1$1$1$emit$1 = new StateFlowKt$combineUndispatched$1$1$1$1$emit$1(this, continuation);
                Object obj32 = stateFlowKt$combineUndispatched$1$1$1$1$emit$1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = stateFlowKt$combineUndispatched$1$1$1$1$emit$1.label;
                if (i == 0) {
                }
                stateFlowKt$combineUndispatched$1$1$1$1$emit$1.label = 2;
            case 1:
                if (continuation instanceof PageFetcherSnapshot$collectAsGenerationalViewportHints$lambda$0$$inlined$map$1$2$1) {
                    pageFetcherSnapshot$collectAsGenerationalViewportHints$lambda$0$$inlined$map$1$2$1 = (PageFetcherSnapshot$collectAsGenerationalViewportHints$lambda$0$$inlined$map$1$2$1) continuation;
                    int i9 = pageFetcherSnapshot$collectAsGenerationalViewportHints$lambda$0$$inlined$map$1$2$1.label;
                    if ((i9 & PKIFailureInfo.systemUnavail) != 0) {
                        pageFetcherSnapshot$collectAsGenerationalViewportHints$lambda$0$$inlined$map$1$2$1.label = i9 - PKIFailureInfo.systemUnavail;
                        Object obj4 = pageFetcherSnapshot$collectAsGenerationalViewportHints$lambda$0$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i2 = pageFetcherSnapshot$collectAsGenerationalViewportHints$lambda$0$$inlined$map$1$2$1.label;
                        if (i2 != 0) {
                            SafeTrace.throwOnFailure(obj4);
                            GenerationalViewportHint generationalViewportHint = new GenerationalViewportHint(i7, (ViewportHint) obj);
                            pageFetcherSnapshot$collectAsGenerationalViewportHints$lambda$0$$inlined$map$1$2$1.label = 1;
                            if (((FlowCollector) obj2).emit(generationalViewportHint, pageFetcherSnapshot$collectAsGenerationalViewportHints$lambda$0$$inlined$map$1$2$1) == coroutineSingletons3) {
                                break;
                            }
                        } else if (i2 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj4);
                        }
                        break;
                    }
                }
                pageFetcherSnapshot$collectAsGenerationalViewportHints$lambda$0$$inlined$map$1$2$1 = new PageFetcherSnapshot$collectAsGenerationalViewportHints$lambda$0$$inlined$map$1$2$1(this, continuation);
                Object obj42 = pageFetcherSnapshot$collectAsGenerationalViewportHints$lambda$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = pageFetcherSnapshot$collectAsGenerationalViewportHints$lambda$0$$inlined$map$1$2$1.label;
                if (i2 != 0) {
                }
            case 2:
                if (continuation instanceof AccountDocumentsPresenter$statementsForMonthViewModel$$inlined$map$2$2$1) {
                    accountDocumentsPresenter$statementsForMonthViewModel$$inlined$map$2$2$1 = (AccountDocumentsPresenter$statementsForMonthViewModel$$inlined$map$2$2$1) continuation;
                    int i10 = accountDocumentsPresenter$statementsForMonthViewModel$$inlined$map$2$2$1.label;
                    if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                        accountDocumentsPresenter$statementsForMonthViewModel$$inlined$map$2$2$1.label = i10 - PKIFailureInfo.systemUnavail;
                        Object obj5 = accountDocumentsPresenter$statementsForMonthViewModel$$inlined$map$2$2$1.result;
                        CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i3 = accountDocumentsPresenter$statementsForMonthViewModel$$inlined$map$2$2$1.label;
                        if (i3 != 0) {
                            SafeTrace.throwOnFailure(obj5);
                            Object obj6 = ((Map) obj).get(new Integer(i7));
                            accountDocumentsPresenter$statementsForMonthViewModel$$inlined$map$2$2$1.label = 1;
                            if (((FlowCollector) obj2).emit(obj6, accountDocumentsPresenter$statementsForMonthViewModel$$inlined$map$2$2$1) == coroutineSingletons4) {
                                break;
                            }
                        } else if (i3 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj5);
                        }
                        break;
                    }
                }
                accountDocumentsPresenter$statementsForMonthViewModel$$inlined$map$2$2$1 = new AccountDocumentsPresenter$statementsForMonthViewModel$$inlined$map$2$2$1(this, continuation);
                Object obj52 = accountDocumentsPresenter$statementsForMonthViewModel$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons42 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i3 = accountDocumentsPresenter$statementsForMonthViewModel$$inlined$map$2$2$1.label;
                if (i3 != 0) {
                }
            case 3:
                if (continuation instanceof RealRawSyncValueService$getSyncValues$$inlined$map$1$2$1) {
                    realRawSyncValueService$getSyncValues$$inlined$map$1$2$1 = (RealRawSyncValueService$getSyncValues$$inlined$map$1$2$1) continuation;
                    int i11 = realRawSyncValueService$getSyncValues$$inlined$map$1$2$1.label;
                    if ((i11 & PKIFailureInfo.systemUnavail) != 0) {
                        realRawSyncValueService$getSyncValues$$inlined$map$1$2$1.label = i11 - PKIFailureInfo.systemUnavail;
                        Object obj7 = realRawSyncValueService$getSyncValues$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i4 = realRawSyncValueService$getSyncValues$$inlined$map$1$2$1.label;
                        if (i4 != 0) {
                            SafeTrace.throwOnFailure(obj7);
                            FlowCollector flowCollector = (FlowCollector) obj2;
                            ArrayList arrayList = new ArrayList();
                            for (Object obj8 : (List) obj) {
                                SyncValueType syncValueType = ((SyncEntity) obj8).valueType;
                                if (syncValueType != null && syncValueType.value == i7) {
                                    arrayList.add(obj8);
                                }
                            }
                            realRawSyncValueService$getSyncValues$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(arrayList, realRawSyncValueService$getSyncValues$$inlined$map$1$2$1) == coroutineSingletons5) {
                                break;
                            }
                        } else if (i4 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj7);
                        }
                        break;
                    }
                }
                realRawSyncValueService$getSyncValues$$inlined$map$1$2$1 = new RealRawSyncValueService$getSyncValues$$inlined$map$1$2$1(this, continuation);
                Object obj72 = realRawSyncValueService$getSyncValues$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons52 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i4 = realRawSyncValueService$getSyncValues$$inlined$map$1$2$1.label;
                if (i4 != 0) {
                }
                break;
            default:
                if (continuation instanceof RealContactBook$getAliases$$inlined$map$1$2$1) {
                    realContactBook$getAliases$$inlined$map$1$2$1 = (RealContactBook$getAliases$$inlined$map$1$2$1) continuation;
                    int i12 = realContactBook$getAliases$$inlined$map$1$2$1.label;
                    if ((i12 & PKIFailureInfo.systemUnavail) != 0) {
                        realContactBook$getAliases$$inlined$map$1$2$1.label = i12 - PKIFailureInfo.systemUnavail;
                        Object obj9 = realContactBook$getAliases$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i5 = realContactBook$getAliases$$inlined$map$1$2$1.label;
                        if (i5 != 0) {
                            SafeTrace.throwOnFailure(obj9);
                            Set set = SequencesKt___SequencesKt.toSet(SequencesKt___SequencesKt.take(SequencesKt___SequencesKt.mapNotNull(SequencesKt__SequencesKt.asSequence(((ContactBook$ContactsQuery) obj).execute()), RealContactBook$getAliases$1$1.INSTANCE), i7));
                            realContactBook$getAliases$$inlined$map$1$2$1.label = 1;
                            if (((FlowCollector) obj2).emit(set, realContactBook$getAliases$$inlined$map$1$2$1) == coroutineSingletons6) {
                                break;
                            }
                        } else if (i5 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj9);
                        }
                        break;
                    }
                }
                realContactBook$getAliases$$inlined$map$1$2$1 = new RealContactBook$getAliases$$inlined$map$1$2$1(this, continuation);
                Object obj92 = realContactBook$getAliases$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons62 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i5 = realContactBook$getAliases$$inlined$map$1$2$1.label;
                if (i5 != 0) {
                }
        }
        return Unit.INSTANCE;
    }
}
