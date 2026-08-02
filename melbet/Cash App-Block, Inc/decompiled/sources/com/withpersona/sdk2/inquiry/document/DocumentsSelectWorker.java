package com.withpersona.sdk2.inquiry.document;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.workflow1.Worker;
import com.valentinilk.shimmer.ShimmerModifierKt$shimmer$1$1;
import com.withpersona.sdk2.inquiry.shared.files.SdkFilesManager;
import com.withpersona.sdk2.inquiry.workflows.WorkflowWorker;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.io.ByteStreamsKt;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentsSelectWorker;", "Lcom/squareup/workflow1/Worker;", "Lcom/withpersona/sdk2/inquiry/document/DocumentsSelectWorker$Output;", "Lcom/withpersona/sdk2/inquiry/workflows/WorkflowWorker;", "Output", "Error", "com/fillr/n", "document_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class DocumentsSelectWorker implements Worker<Output>, WorkflowWorker {
    public final Context context;
    public final String key;
    public final Function0 launchPicker;
    public final SdkFilesManager sdkFilesManager;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Error {
        public static final /* synthetic */ Error[] $VALUES;
        public static final Error FileNotFound;
        public static final Error PermissionDenied;

        static {
            Error error = new Error("FileNotFound", 0);
            FileNotFound = error;
            Error error2 = new Error("PermissionDenied", 1);
            PermissionDenied = error2;
            $VALUES = new Error[]{error, error2};
        }

        public static Error valueOf(String str) {
            return (Error) Enum.valueOf(Error.class, str);
        }

        public static Error[] values() {
            return (Error[]) $VALUES.clone();
        }
    }

    public abstract class Output {

        public final class Cancel extends Output {
            public static final Cancel INSTANCE = new Cancel();
        }

        public final class Failure extends Output {
            public final ArrayList absoluteFilePaths;
            public final Error reason;

            public Failure(ArrayList arrayList, Error error) {
                this.absoluteFilePaths = arrayList;
                this.reason = error;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Failure)) {
                    return false;
                }
                Failure failure = (Failure) obj;
                return this.absoluteFilePaths.equals(failure.absoluteFilePaths) && this.reason == failure.reason;
            }

            public final int hashCode() {
                return this.reason.hashCode() + (this.absoluteFilePaths.hashCode() * 31);
            }

            public final String toString() {
                return "Failure(absoluteFilePaths=" + this.absoluteFilePaths + ", reason=" + this.reason + ")";
            }
        }

        public final class Success extends Output {
            public final ArrayList absoluteFilePaths;

            public Success(ArrayList arrayList) {
                this.absoluteFilePaths = arrayList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Success) && this.absoluteFilePaths.equals(((Success) obj).absoluteFilePaths);
            }

            public final int hashCode() {
                return this.absoluteFilePaths.hashCode();
            }

            public final String toString() {
                return Request$Priority$EnumUnboxingLocalUtility.m("Success(absoluteFilePaths=", ")", this.absoluteFilePaths);
            }
        }
    }

    public DocumentsSelectWorker(String str, Context context, SdkFilesManager sdkFilesManager, Function0 function0) {
        context.getClass();
        sdkFilesManager.getClass();
        this.key = str;
        this.context = context;
        this.sdkFilesManager = sdkFilesManager;
        this.launchPicker = function0;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x002b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$handleDocumentResult(DocumentsSelectWorker documentsSelectWorker, FlowCollector flowCollector, List list, Continuation continuation) {
        String str;
        File newRandomSessionFile;
        InputStream openInputStream;
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        ContentResolver contentResolver = documentsSelectWorker.context.getContentResolver();
        if (list.isEmpty()) {
            Object emit = flowCollector.emit(Output.Cancel.INSTANCE, continuation);
            return emit == CoroutineSingletons.COROUTINE_SUSPENDED ? emit : Unit.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        Error error = null;
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            try {
                String extensionFromMimeType = singleton.getExtensionFromMimeType(contentResolver.getType(uri));
                SdkFilesManager sdkFilesManager = documentsSelectWorker.sdkFilesManager;
                if (extensionFromMimeType == null) {
                    extensionFromMimeType = "jpg";
                }
                newRandomSessionFile = sdkFilesManager.newRandomSessionFile(extensionFromMimeType);
                openInputStream = contentResolver.openInputStream(uri);
            } catch (FileNotFoundException unused) {
                error = Error.FileNotFound;
                str = null;
                if (str != null) {
                }
            } catch (SecurityException unused2) {
                error = Error.PermissionDenied;
                str = null;
                if (str != null) {
                }
            }
            if (openInputStream == null) {
                throw new FileNotFoundException();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(newRandomSessionFile);
            try {
                try {
                    ByteStreamsKt.copyTo$default(openInputStream, fileOutputStream);
                    openInputStream.close();
                    fileOutputStream.close();
                    str = newRandomSessionFile.getAbsolutePath();
                    if (str != null) {
                        arrayList.add(str);
                    }
                } finally {
                }
            } finally {
            }
        }
        if (error == null) {
            Object emit2 = flowCollector.emit(new Output.Success(arrayList), continuation);
            if (emit2 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return emit2;
            }
        } else {
            Object emit3 = flowCollector.emit(new Output.Failure(arrayList, error), continuation);
            if (emit3 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return emit3;
            }
        }
        return Unit.INSTANCE;
    }

    @Override // com.squareup.workflow1.Worker
    public final boolean doesSameWorkAs(Worker worker) {
        worker.getClass();
        if (worker instanceof DocumentsSelectWorker) {
            return this.key.equals(((DocumentsSelectWorker) worker).key);
        }
        return false;
    }

    @Override // com.squareup.workflow1.Worker
    /* renamed from: run */
    public final Flow getWork() {
        SafeFlow safeFlow = new SafeFlow(new ShimmerModifierKt$shimmer$1$1(this, null, 27));
        DefaultScheduler defaultScheduler = Dispatchers.Default;
        return FlowKt.flowOn(safeFlow, DefaultIoScheduler.INSTANCE);
    }

    @Override // com.withpersona.sdk2.inquiry.workflows.WorkflowWorker
    public final boolean doesSameWorkAs(WorkflowWorker workflowWorker) {
        if (workflowWorker instanceof DocumentsSelectWorker) {
            return this.key.equals(((DocumentsSelectWorker) workflowWorker).key);
        }
        return false;
    }
}
