package com.withpersona.sdk2.inquiry.ui;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.workflow1.Worker;
import com.withpersona.sdk2.inquiry.steps.ui.components.SelectedFile;
import com.withpersona.sdk2.inquiry.workflows.WorkflowWorker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.rx3.RxConvertKt$asFlow$1;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import okhttp3.internal.http2.Http2Connection$$ExternalSyntheticLambda3;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/UiStepFileSelectWorker;", "Lcom/squareup/workflow1/Worker;", "Lcom/withpersona/sdk2/inquiry/ui/UiStepFileSelectWorker$Output;", "Lcom/withpersona/sdk2/inquiry/workflows/WorkflowWorker;", "Output", "io/noties/markwon/MarkwonImpl", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class UiStepFileSelectWorker implements Worker<Output>, WorkflowWorker {
    public final UiStepFileSelectWorker$Factory$create$2 checkPendingResult;
    public final UiStepFileSelectWorker$Factory$create$2 collectResult;
    public final Context context;
    public final String key;
    public final Http2Connection$$ExternalSyntheticLambda3 launchPicker;

    public abstract class Output {

        public final class Cancel extends Output {
            public static final Cancel INSTANCE = new Cancel();
        }

        public final class Error extends Output {
            public static final Error INSTANCE = new Error();
        }

        public final class Success extends Output {
            public final ArrayList files;

            public Success(ArrayList arrayList) {
                this.files = arrayList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Success) && this.files.equals(((Success) obj).files);
            }

            public final int hashCode() {
                return this.files.hashCode();
            }

            public final String toString() {
                return Request$Priority$EnumUnboxingLocalUtility.m("Success(files=", ")", this.files);
            }
        }
    }

    public UiStepFileSelectWorker(String str, Context context, Http2Connection$$ExternalSyntheticLambda3 http2Connection$$ExternalSyntheticLambda3, UiStepFileSelectWorker$Factory$create$2 uiStepFileSelectWorker$Factory$create$2, UiStepFileSelectWorker$Factory$create$2 uiStepFileSelectWorker$Factory$create$22) {
        context.getClass();
        this.key = str;
        this.context = context;
        this.launchPicker = http2Connection$$ExternalSyntheticLambda3;
        this.collectResult = uiStepFileSelectWorker$Factory$create$2;
        this.checkPendingResult = uiStepFileSelectWorker$Factory$create$22;
    }

    public static final Object access$handleResult(UiStepFileSelectWorker uiStepFileSelectWorker, FlowCollector flowCollector, List list, RxConvertKt$asFlow$1 rxConvertKt$asFlow$1) {
        String str;
        int columnIndex;
        if (list.isEmpty()) {
            Object emit = flowCollector.emit(Output.Cancel.INSTANCE, rxConvertKt$asFlow$1);
            return emit == CoroutineSingletons.COROUTINE_SUSPENDED ? emit : Unit.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            Cursor query = uiStepFileSelectWorker.context.getContentResolver().query(uri, null, null, null, null);
            if (query != null) {
                try {
                    str = null;
                    if (query.moveToFirst() && (columnIndex = query.getColumnIndex("_display_name")) >= 0) {
                        str = query.getString(columnIndex);
                    }
                    query.close();
                    if (str != null) {
                        arrayList.add(new SelectedFile(uri, str));
                    }
                } finally {
                }
            }
            str = uri.getLastPathSegment();
            if (str == null) {
                str = "file";
            }
            arrayList.add(new SelectedFile(uri, str));
        }
        if (arrayList.isEmpty()) {
            Object emit2 = flowCollector.emit(Output.Error.INSTANCE, rxConvertKt$asFlow$1);
            return emit2 == CoroutineSingletons.COROUTINE_SUSPENDED ? emit2 : Unit.INSTANCE;
        }
        Object emit3 = flowCollector.emit(new Output.Success(arrayList), rxConvertKt$asFlow$1);
        return emit3 == CoroutineSingletons.COROUTINE_SUSPENDED ? emit3 : Unit.INSTANCE;
    }

    @Override // com.squareup.workflow1.Worker
    public final boolean doesSameWorkAs(Worker worker) {
        worker.getClass();
        if (worker instanceof UiStepFileSelectWorker) {
            return this.key.equals(((UiStepFileSelectWorker) worker).key);
        }
        return false;
    }

    @Override // com.squareup.workflow1.Worker
    /* renamed from: run */
    public final Flow getWork() {
        SafeFlow safeFlow = new SafeFlow(new RxConvertKt$asFlow$1(this, null, 2));
        DefaultScheduler defaultScheduler = Dispatchers.Default;
        return FlowKt.flowOn(safeFlow, DefaultIoScheduler.INSTANCE);
    }

    @Override // com.withpersona.sdk2.inquiry.workflows.WorkflowWorker
    public final boolean doesSameWorkAs(WorkflowWorker workflowWorker) {
        if (workflowWorker instanceof UiStepFileSelectWorker) {
            return this.key.equals(((UiStepFileSelectWorker) workflowWorker).key);
        }
        return false;
    }
}
