package com.squareup.cash.work.views;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$lambda$0$$inlined$map$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.browsersdk.model.FillrWidgetFactory;
import com.squareup.cash.R;
import com.squareup.cash.account.presenters.documents.AccountDocumentsPresenter;
import com.squareup.cash.account.presenters.documents.AccountDocumentsPresenter$statementsForMonthViewModel$$inlined$map$3$2$1;
import com.squareup.cash.account.settings.viewmodels.documents.AccountDocumentsViewEvent$RecordPayload$StandardPayload;
import com.squareup.cash.account.settings.viewmodels.documents.AccountDocumentsViewModel;
import com.squareup.cash.data.profile.documents.ProfileDocumentModel;
import com.squareup.cash.data.profile.documents.ProfileDocumentModel$TitleNamingConvention$AppendName;
import com.squareup.cash.resource.text.AndroidStringManager;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SafeFlow;
import okhttp3.Headers;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class ScheduleCalendarKt$ScheduleCalendar$2$3$1$invokeSuspend$$inlined$map$1 implements Flow {
    public final /* synthetic */ Object $baseMonth$inlined;
    public final /* synthetic */ int $initialPage$inlined;
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Flow $this_unsafeTransform$inlined;

    public ScheduleCalendarKt$ScheduleCalendar$2$3$1$invokeSuspend$$inlined$map$1(PageFetcherSnapshot$collectAsGenerationalViewportHints$lambda$0$$inlined$map$1 pageFetcherSnapshot$collectAsGenerationalViewportHints$lambda$0$$inlined$map$1, int i, AccountDocumentsPresenter accountDocumentsPresenter) {
        this.$this_unsafeTransform$inlined = pageFetcherSnapshot$collectAsGenerationalViewportHints$lambda$0$$inlined$map$1;
        this.$initialPage$inlined = i;
        this.$baseMonth$inlined = accountDocumentsPresenter;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj = this.$baseMonth$inlined;
        int i2 = this.$initialPage$inlined;
        Flow flow = this.$this_unsafeTransform$inlined;
        switch (i) {
            case 0:
                Object collect = ((SafeFlow) flow).collect(new AnonymousClass2(flowCollector, (YearMonth) obj, i2), continuation);
                if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object collect2 = ((PageFetcherSnapshot$collectAsGenerationalViewportHints$lambda$0$$inlined$map$1) flow).collect(new AnonymousClass2(i2, (AccountDocumentsPresenter) obj, flowCollector), continuation);
                if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: com.squareup.cash.work.views.ScheduleCalendarKt$ScheduleCalendar$2$3$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
    public final class AnonymousClass2 implements FlowCollector {
        public final /* synthetic */ Object $baseMonth$inlined;
        public final /* synthetic */ int $initialPage$inlined;
        public final /* synthetic */ int $r8$classId = 1;
        public final /* synthetic */ FlowCollector $this_unsafeFlow;

        /* renamed from: com.squareup.cash.work.views.ScheduleCalendarKt$ScheduleCalendar$2$3$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends ContinuationImpl {
            public int label;
            public /* synthetic */ Object result;

            public AnonymousClass1(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= PKIFailureInfo.systemUnavail;
                return AnonymousClass2.this.emit(null, this);
            }
        }

        public AnonymousClass2(int i, AccountDocumentsPresenter accountDocumentsPresenter, FlowCollector flowCollector) {
            this.$this_unsafeFlow = flowCollector;
            this.$initialPage$inlined = i;
            this.$baseMonth$inlined = accountDocumentsPresenter;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00fd  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0107  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1;
            int i;
            AccountDocumentsPresenter$statementsForMonthViewModel$$inlined$map$3$2$1 accountDocumentsPresenter$statementsForMonthViewModel$$inlined$map$3$2$1;
            int i2;
            int i3 = this.$r8$classId;
            Object obj2 = this.$baseMonth$inlined;
            int i4 = this.$initialPage$inlined;
            FlowCollector flowCollector = this.$this_unsafeFlow;
            switch (i3) {
                case 0:
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i5 = anonymousClass1.label;
                        if ((i5 & PKIFailureInfo.systemUnavail) != 0) {
                            anonymousClass1.label = i5 - PKIFailureInfo.systemUnavail;
                            Object obj3 = anonymousClass1.result;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i = anonymousClass1.label;
                            if (i != 0) {
                                SafeTrace.throwOnFailure(obj3);
                                YearMonth plusMonths = ((YearMonth) obj2).plusMonths(((Number) obj).intValue() - i4);
                                plusMonths.getClass();
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(plusMonths, anonymousClass1) == coroutineSingletons) {
                                    break;
                                }
                            } else if (i != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj3);
                            }
                            break;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj32 = anonymousClass1.result;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                default:
                    if (continuation instanceof AccountDocumentsPresenter$statementsForMonthViewModel$$inlined$map$3$2$1) {
                        accountDocumentsPresenter$statementsForMonthViewModel$$inlined$map$3$2$1 = (AccountDocumentsPresenter$statementsForMonthViewModel$$inlined$map$3$2$1) continuation;
                        int i6 = accountDocumentsPresenter$statementsForMonthViewModel$$inlined$map$3$2$1.label;
                        if ((i6 & PKIFailureInfo.systemUnavail) != 0) {
                            accountDocumentsPresenter$statementsForMonthViewModel$$inlined$map$3$2$1.label = i6 - PKIFailureInfo.systemUnavail;
                            Object obj4 = accountDocumentsPresenter$statementsForMonthViewModel$$inlined$map$3$2$1.result;
                            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i2 = accountDocumentsPresenter$statementsForMonthViewModel$$inlined$map$3$2$1.label;
                            if (i2 != 0) {
                                SafeTrace.throwOnFailure(obj4);
                                List list = (List) obj;
                                Headers.Builder builder = new Headers.Builder(2);
                                builder.add(new AccountDocumentsViewModel.DocumentModel.HeaderModel(String.valueOf(i4)));
                                list.getClass();
                                List<ProfileDocumentModel> list2 = list;
                                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                                for (ProfileDocumentModel profileDocumentModel : list2) {
                                    FillrWidgetFactory fillrWidgetFactory = profileDocumentModel.titleNamingConvention;
                                    String str = profileDocumentModel.name;
                                    if (fillrWidgetFactory instanceof ProfileDocumentModel$TitleNamingConvention$AppendName) {
                                        AndroidStringManager androidStringManager = ((AccountDocumentsPresenter) obj2).stringManager;
                                        String str2 = ((ProfileDocumentModel$TitleNamingConvention$AppendName) fillrWidgetFactory).dependentName;
                                        str.getClass();
                                        Object[] objArr = {str2, str};
                                        Resources resources = androidStringManager.resources;
                                        resources.getClass();
                                        str = new MessageFormat(resources.getString(R.string.documents_full_name_dependents)).format(objArr);
                                        str.getClass();
                                    }
                                    arrayList.add(new AccountDocumentsViewModel.DocumentModel.RecordModel(str, new AccountDocumentsViewEvent$RecordPayload$StandardPayload(profileDocumentModel.token, profileDocumentModel.url, profileDocumentModel.emailForwardable, profileDocumentModel.category)));
                                }
                                builder.addSpread(arrayList.toArray(new AccountDocumentsViewModel.DocumentModel.RecordModel[0]));
                                ArrayList arrayList2 = builder.namesAndValues;
                                List listOf = CollectionsKt__CollectionsKt.listOf(arrayList2.toArray(new AccountDocumentsViewModel.DocumentModel[arrayList2.size()]));
                                accountDocumentsPresenter$statementsForMonthViewModel$$inlined$map$3$2$1.label = 1;
                                if (flowCollector.emit(listOf, accountDocumentsPresenter$statementsForMonthViewModel$$inlined$map$3$2$1) == coroutineSingletons3) {
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
                    accountDocumentsPresenter$statementsForMonthViewModel$$inlined$map$3$2$1 = new AccountDocumentsPresenter$statementsForMonthViewModel$$inlined$map$3$2$1(this, continuation);
                    Object obj42 = accountDocumentsPresenter$statementsForMonthViewModel$$inlined$map$3$2$1.result;
                    CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i2 = accountDocumentsPresenter$statementsForMonthViewModel$$inlined$map$3$2$1.label;
                    if (i2 != 0) {
                    }
            }
            return Unit.INSTANCE;
        }

        public AnonymousClass2(FlowCollector flowCollector, YearMonth yearMonth, int i) {
            this.$this_unsafeFlow = flowCollector;
            this.$baseMonth$inlined = yearMonth;
            this.$initialPage$inlined = i;
        }
    }

    public ScheduleCalendarKt$ScheduleCalendar$2$3$1$invokeSuspend$$inlined$map$1(SafeFlow safeFlow, YearMonth yearMonth, int i) {
        this.$this_unsafeTransform$inlined = safeFlow;
        this.$baseMonth$inlined = yearMonth;
        this.$initialPage$inlined = i;
    }
}
