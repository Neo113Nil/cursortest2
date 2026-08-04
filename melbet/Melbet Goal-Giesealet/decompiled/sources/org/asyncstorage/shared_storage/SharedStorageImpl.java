package org.asyncstorage.shared_storage;

import co.touchlab.kermit.Logger;
import co.touchlab.kermit.Severity;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.asyncstorage.shared_storage.database.DatabaseFiles;
import org.asyncstorage.shared_storage.database.StorageDao;
import org.asyncstorage.shared_storage.database.StorageDatabase;
import org.asyncstorage.shared_storage.database.StorageEntry;

/* compiled from: SharedStorageImpl.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000fH\u0096@¢\u0006\u0002\u0010\u0013J\"\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u00152\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000fH\u0016J\"\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0096@¢\u0006\u0002\u0010\u0013J\u001c\u0010\u0018\u001a\u00020\u00192\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000fH\u0096@¢\u0006\u0002\u0010\u0013J\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00120\u000fH\u0096@¢\u0006\u0002\u0010\u001bJ\u0014\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u000f0\u0015H\u0016J\u000e\u0010\u001d\u001a\u00020\u0019H\u0096@¢\u0006\u0002\u0010\u001bJ&\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f*\b\u0012\u0004\u0012\u00020\u001f0\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000fH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lorg/asyncstorage/shared_storage/SharedStorageImpl;", "Lorg/asyncstorage/shared_storage/SharedStorage;", "database", "Lorg/asyncstorage/shared_storage/database/StorageDatabase;", "files", "Lorg/asyncstorage/shared_storage/database/DatabaseFiles;", "<init>", "(Lorg/asyncstorage/shared_storage/database/StorageDatabase;Lorg/asyncstorage/shared_storage/database/DatabaseFiles;)V", "getDatabase", "()Lorg/asyncstorage/shared_storage/database/StorageDatabase;", "storage", "Lorg/asyncstorage/shared_storage/database/StorageDao;", "log", "Lco/touchlab/kermit/Logger;", "getValues", "", "Lorg/asyncstorage/shared_storage/Entry;", "keys", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getValuesFlow", "Lkotlinx/coroutines/flow/Flow;", "setValues", "entries", "removeValues", "", "getKeys", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getKeysFlow", "clear", "toRequestedEntry", "Lorg/asyncstorage/shared_storage/database/StorageEntry;", "shared-storage"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SharedStorageImpl implements SharedStorage {
    private final StorageDatabase database;
    private final Logger log;
    private final StorageDao storage;

    public SharedStorageImpl(StorageDatabase database, DatabaseFiles files) {
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(files, "files");
        this.database = database;
        this.storage = database.storageDao$shared_storage();
        Logger withTag = Logger.INSTANCE.withTag("AsyncStorage:" + files.getDatabaseName());
        this.log = withTag;
        String tag = withTag.getTag();
        Logger logger = withTag;
        Severity severity = Severity.Info;
        if (logger.getConfig().get_minSeverity().compareTo(severity) <= 0) {
            logger.processLog(severity, tag, null, "Storage opened at " + files.getDirectoryAbsolutePath());
        }
    }

    public final StorageDatabase getDatabase() {
        return this.database;
    }

    @Override // org.asyncstorage.shared_storage.SharedStorage
    public Object getValues(List<String> list, Continuation<? super List<Entry>> continuation) {
        return StorageExceptionKt.catchStorageException(this.log, new SharedStorageImpl$getValues$2(this, list, null), continuation);
    }

    @Override // org.asyncstorage.shared_storage.SharedStorage
    public Flow<List<Entry>> getValuesFlow(final List<String> keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        final Flow<List<StorageEntry>> valuesFlow = this.storage.getValuesFlow(keys);
        return StorageExceptionKt.catchStorageException(FlowKt.distinctUntilChanged(new Flow<List<? extends Entry>>() { // from class: org.asyncstorage.shared_storage.SharedStorageImpl$getValuesFlow$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            /* renamed from: org.asyncstorage.shared_storage.SharedStorageImpl$getValuesFlow$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ List $keys$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ SharedStorageImpl this$0;

                @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
                @DebugMetadata(c = "org.asyncstorage.shared_storage.SharedStorageImpl$getValuesFlow$$inlined$map$1$2", f = "SharedStorageImpl.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {AppMeasurementSdk.ConditionalUserProperty.VALUE, "$completion", AppMeasurementSdk.ConditionalUserProperty.VALUE, "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
                /* renamed from: org.asyncstorage.shared_storage.SharedStorageImpl$getValuesFlow$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, SharedStorageImpl sharedStorageImpl, List list) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = sharedStorageImpl;
                    this.$keys$inlined = list;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    int i;
                    List requestedEntry;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                requestedEntry = this.this$0.toRequestedEntry((List) obj, this.$keys$inlined);
                                anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                                anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(flowCollector);
                                anonymousClass1.I$0 = 0;
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(requestedEntry, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                int i2 = anonymousClass1.I$0;
                                Object obj3 = anonymousClass1.L$2;
                                Object obj4 = anonymousClass1.L$0;
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj22 = anonymousClass1.result;
                    Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super List<? extends Entry>> flowCollector, Continuation continuation) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, this, keys), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }
        }), this.log);
    }

    @Override // org.asyncstorage.shared_storage.SharedStorage
    public Object setValues(List<Entry> list, Continuation<? super List<Entry>> continuation) {
        return StorageExceptionKt.catchStorageException(this.log, new SharedStorageImpl$setValues$2(list, this, null), continuation);
    }

    @Override // org.asyncstorage.shared_storage.SharedStorage
    public Object removeValues(List<String> list, Continuation<? super Unit> continuation) {
        Object catchStorageException = StorageExceptionKt.catchStorageException(this.log, new SharedStorageImpl$removeValues$2(this, list, null), continuation);
        return catchStorageException == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? catchStorageException : Unit.INSTANCE;
    }

    @Override // org.asyncstorage.shared_storage.SharedStorage
    public Object getKeys(Continuation<? super List<String>> continuation) {
        return StorageExceptionKt.catchStorageException(this.log, new SharedStorageImpl$getKeys$2(this, null), continuation);
    }

    @Override // org.asyncstorage.shared_storage.SharedStorage
    public Flow<List<String>> getKeysFlow() {
        return StorageExceptionKt.catchStorageException(this.storage.getKeysFlow(), this.log);
    }

    @Override // org.asyncstorage.shared_storage.SharedStorage
    public Object clear(Continuation<? super Unit> continuation) {
        Object catchStorageException = StorageExceptionKt.catchStorageException(this.log, new SharedStorageImpl$clear$2(this, null), continuation);
        return catchStorageException == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? catchStorageException : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Entry> toRequestedEntry(List<StorageEntry> list, List<String> list2) {
        Entry entry;
        List<StorageEntry> list3 = list;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list3, 10)), 16));
        for (Object obj : list3) {
            linkedHashMap.put(((StorageEntry) obj).getKey(), obj);
        }
        List<String> list4 = list2;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
        for (String str : list4) {
            StorageEntry storageEntry = (StorageEntry) linkedHashMap.get(str);
            if (storageEntry == null || (entry = EntryKt.toEntry(storageEntry)) == null) {
                entry = new Entry(str, null);
            }
            arrayList.add(entry);
        }
        return arrayList;
    }
}
