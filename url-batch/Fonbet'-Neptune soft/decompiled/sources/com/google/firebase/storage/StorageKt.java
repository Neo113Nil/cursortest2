package com.google.firebase.storage;

import android.net.Uri;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.Firebase;
import com.google.firebase.FirebaseApp;
import com.google.firebase.storage.FileDownloadTask;
import com.google.firebase.storage.StorageMetadata;
import com.google.firebase.storage.StreamDownloadTask;
import com.google.firebase.storage.UploadTask;
import java.io.InputStream;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: Storage.kt */
@Metadata(d1 = {"\u0000~\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\b\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u001f\u0010\t\u001a\u00020\n2\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000f\u001a\u0011\u0010\u0010\u001a\u00020\u0011*\u00060\u0012R\u00020\u0013H\u0086\u0002\u001a\u0011\u0010\u0014\u001a\u00020\u0011*\u00060\u0012R\u00020\u0013H\u0086\u0002\u001a\u0013\u0010\u0015\u001a\u0004\u0018\u00010\n*\u00060\u0012R\u00020\u0013H\u0086\u0002\u001a\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017*\u00060\u0012R\u00020\u0013H\u0086\u0002\u001a\u0011\u0010\u0010\u001a\u00020\u0011*\u00060\u0018R\u00020\u0019H\u0086\u0002\u001a\u0011\u0010\u0014\u001a\u00020\u0011*\u00060\u0018R\u00020\u0019H\u0086\u0002\u001a\u0011\u0010\u0015\u001a\u00020\u001a*\u00060\u0018R\u00020\u0019H\u0086\u0002\u001a\u0011\u0010\u0010\u001a\u00020\u0011*\u00060\u001bR\u00020\u001cH\u0086\u0002\u001a\u0011\u0010\u0014\u001a\u00020\u0011*\u00060\u001bR\u00020\u001cH\u0086\u0002\u001a\u0013\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d*\u00020\u001fH\u0086\u0002\u001a\u0013\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d*\u00020\u001fH\u0086\u0002\u001a\u000f\u0010\u0015\u001a\u0004\u0018\u00010\u0006*\u00020\u001fH\u0086\u0002\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\";\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H#0\"0!\"\u0012\b\u0000\u0010#*\f0$R\b\u0012\u0004\u0012\u0002H#0%*\b\u0012\u0004\u0012\u0002H#0%8F¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"storage", "Lcom/google/firebase/storage/FirebaseStorage;", "Lcom/google/firebase/Firebase;", "getStorage", "(Lcom/google/firebase/Firebase;)Lcom/google/firebase/storage/FirebaseStorage;", ImagesContract.URL, "", "app", "Lcom/google/firebase/FirebaseApp;", "storageMetadata", "Lcom/google/firebase/storage/StorageMetadata;", "init", "Lkotlin/Function1;", "Lcom/google/firebase/storage/StorageMetadata$Builder;", "", "Lkotlin/ExtensionFunctionType;", "component1", "", "Lcom/google/firebase/storage/UploadTask$TaskSnapshot;", "Lcom/google/firebase/storage/UploadTask;", "component2", "component3", "component4", "Landroid/net/Uri;", "Lcom/google/firebase/storage/StreamDownloadTask$TaskSnapshot;", "Lcom/google/firebase/storage/StreamDownloadTask;", "Ljava/io/InputStream;", "Lcom/google/firebase/storage/FileDownloadTask$TaskSnapshot;", "Lcom/google/firebase/storage/FileDownloadTask;", "", "Lcom/google/firebase/storage/StorageReference;", "Lcom/google/firebase/storage/ListResult;", "taskState", "Lkotlinx/coroutines/flow/Flow;", "Lcom/google/firebase/storage/TaskState;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcom/google/firebase/storage/StorageTask$SnapshotBase;", "Lcom/google/firebase/storage/StorageTask;", "getTaskState", "(Lcom/google/firebase/storage/StorageTask;)Lkotlinx/coroutines/flow/Flow;", "com.google.firebase-firebase-storage"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class StorageKt {
    public static final FirebaseStorage getStorage(Firebase firebase) {
        Intrinsics.checkNotNullParameter(firebase, "<this>");
        FirebaseStorage firebaseStorage = FirebaseStorage.getInstance();
        Intrinsics.checkNotNullExpressionValue(firebaseStorage, "getInstance(...)");
        return firebaseStorage;
    }

    public static final FirebaseStorage storage(Firebase firebase, String url) {
        Intrinsics.checkNotNullParameter(firebase, "<this>");
        Intrinsics.checkNotNullParameter(url, "url");
        FirebaseStorage firebaseStorage = FirebaseStorage.getInstance(url);
        Intrinsics.checkNotNullExpressionValue(firebaseStorage, "getInstance(...)");
        return firebaseStorage;
    }

    public static final FirebaseStorage storage(Firebase firebase, FirebaseApp app) {
        Intrinsics.checkNotNullParameter(firebase, "<this>");
        Intrinsics.checkNotNullParameter(app, "app");
        FirebaseStorage firebaseStorage = FirebaseStorage.getInstance(app);
        Intrinsics.checkNotNullExpressionValue(firebaseStorage, "getInstance(...)");
        return firebaseStorage;
    }

    public static final FirebaseStorage storage(Firebase firebase, FirebaseApp app, String url) {
        Intrinsics.checkNotNullParameter(firebase, "<this>");
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(url, "url");
        FirebaseStorage firebaseStorage = FirebaseStorage.getInstance(app, url);
        Intrinsics.checkNotNullExpressionValue(firebaseStorage, "getInstance(...)");
        return firebaseStorage;
    }

    public static final StorageMetadata storageMetadata(Function1<? super StorageMetadata.Builder, Unit> init) {
        Intrinsics.checkNotNullParameter(init, "init");
        StorageMetadata.Builder builder = new StorageMetadata.Builder();
        init.invoke(builder);
        StorageMetadata build = builder.build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    public static final long component1(UploadTask.TaskSnapshot taskSnapshot) {
        Intrinsics.checkNotNullParameter(taskSnapshot, "<this>");
        return taskSnapshot.getBytesTransferred();
    }

    public static final long component2(UploadTask.TaskSnapshot taskSnapshot) {
        Intrinsics.checkNotNullParameter(taskSnapshot, "<this>");
        return taskSnapshot.getTotalByteCount();
    }

    public static final StorageMetadata component3(UploadTask.TaskSnapshot taskSnapshot) {
        Intrinsics.checkNotNullParameter(taskSnapshot, "<this>");
        return taskSnapshot.getMetadata();
    }

    public static final Uri component4(UploadTask.TaskSnapshot taskSnapshot) {
        Intrinsics.checkNotNullParameter(taskSnapshot, "<this>");
        return taskSnapshot.getUploadSessionUri();
    }

    public static final long component1(StreamDownloadTask.TaskSnapshot taskSnapshot) {
        Intrinsics.checkNotNullParameter(taskSnapshot, "<this>");
        return taskSnapshot.getBytesTransferred();
    }

    public static final long component2(StreamDownloadTask.TaskSnapshot taskSnapshot) {
        Intrinsics.checkNotNullParameter(taskSnapshot, "<this>");
        return taskSnapshot.getTotalByteCount();
    }

    public static final InputStream component3(StreamDownloadTask.TaskSnapshot taskSnapshot) {
        Intrinsics.checkNotNullParameter(taskSnapshot, "<this>");
        InputStream stream = taskSnapshot.getStream();
        Intrinsics.checkNotNullExpressionValue(stream, "getStream(...)");
        return stream;
    }

    public static final long component1(FileDownloadTask.TaskSnapshot taskSnapshot) {
        Intrinsics.checkNotNullParameter(taskSnapshot, "<this>");
        return taskSnapshot.getBytesTransferred();
    }

    public static final long component2(FileDownloadTask.TaskSnapshot taskSnapshot) {
        Intrinsics.checkNotNullParameter(taskSnapshot, "<this>");
        return taskSnapshot.getTotalByteCount();
    }

    public static final List<StorageReference> component1(ListResult listResult) {
        Intrinsics.checkNotNullParameter(listResult, "<this>");
        List<StorageReference> items = listResult.getItems();
        Intrinsics.checkNotNullExpressionValue(items, "getItems(...)");
        return items;
    }

    public static final List<StorageReference> component2(ListResult listResult) {
        Intrinsics.checkNotNullParameter(listResult, "<this>");
        List<StorageReference> prefixes = listResult.getPrefixes();
        Intrinsics.checkNotNullExpressionValue(prefixes, "getPrefixes(...)");
        return prefixes;
    }

    public static final String component3(ListResult listResult) {
        Intrinsics.checkNotNullParameter(listResult, "<this>");
        return listResult.getPageToken();
    }

    public static final <T extends StorageTask<T>.SnapshotBase> Flow<TaskState<T>> getTaskState(StorageTask<T> storageTask) {
        Intrinsics.checkNotNullParameter(storageTask, "<this>");
        return FlowKt.callbackFlow(new StorageKt$taskState$1(storageTask, null));
    }
}
