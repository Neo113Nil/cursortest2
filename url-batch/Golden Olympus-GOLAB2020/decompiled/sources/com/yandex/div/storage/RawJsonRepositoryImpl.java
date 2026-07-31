package com.yandex.div.storage;

import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.storage.DivStorage;
import com.yandex.div.storage.RawJsonRepository;
import com.yandex.div.storage.database.StorageException;
import com.yandex.div.storage.rawjson.RawJson;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.T;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class RawJsonRepositoryImpl implements RawJsonRepository {

    @NotNull
    private final DivStorage divStorage;

    @NotNull
    private final Map<String, RawJson> inMemoryData;

    @NotNull
    private Set<String> jsonIdsWithErrors;

    public RawJsonRepositoryImpl(@NotNull DivStorage divStorage) {
        Intrinsics.checkNotNullParameter(divStorage, "divStorage");
        this.divStorage = divStorage;
        this.inMemoryData = new LinkedHashMap();
        this.jsonIdsWithErrors = T.e();
    }

    private final RawJsonRepositoryResult loadFromStorage(Set<String> set) {
        ArrayList arrayList = new ArrayList();
        DivStorage.LoadDataResult<RawJson> readRawJsons = this.divStorage.readRawJsons(set);
        List<RawJson> component1 = readRawJsons.component1();
        arrayList.addAll(toRawJsonRepositoryExceptions(readRawJsons.component2()));
        return new RawJsonRepositoryResult(component1, arrayList);
    }

    private final void removeFromInMemory(Set<String> set) {
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            this.inMemoryData.remove((String) it.next());
        }
    }

    private final List<RawJsonRepositoryException> toRawJsonRepositoryExceptions(List<? extends StorageException> list) {
        List<? extends StorageException> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new RawJsonRepositoryException((StorageException) it.next()));
        }
        return arrayList;
    }

    @Override // com.yandex.div.storage.RawJsonRepository
    @NotNull
    public RawJsonRepositoryResult get(@NotNull List<String> ids) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        KAssert kAssert = KAssert.INSTANCE;
        if (Assert.isEnabled()) {
            Assert.assertMainThread();
        }
        if (ids.isEmpty()) {
            return RawJsonRepositoryResult.Companion.getEMPTY();
        }
        List<String> list = ids;
        Set<String> mutableSet = CollectionsKt.toMutableSet(list);
        ArrayList arrayList = new ArrayList(ids.size());
        for (String str : list) {
            RawJson rawJson = this.inMemoryData.get(str);
            if (rawJson != null) {
                arrayList.add(rawJson);
                mutableSet.remove(str);
            }
        }
        if (mutableSet.isEmpty()) {
            return new RawJsonRepositoryResult(arrayList, CollectionsKt.emptyList());
        }
        RawJsonRepositoryResult loadFromStorage = loadFromStorage(mutableSet);
        for (RawJson rawJson2 : loadFromStorage.getResultData()) {
            this.inMemoryData.put(rawJson2.getId(), rawJson2);
        }
        return loadFromStorage.addData(arrayList);
    }

    @Override // com.yandex.div.storage.RawJsonRepository
    @NotNull
    public RawJsonRepositoryResult put(@NotNull RawJsonRepository.Payload payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        KAssert kAssert = KAssert.INSTANCE;
        if (Assert.isEnabled()) {
            Assert.assertMainThread();
        }
        List<RawJson> jsons = payload.getJsons();
        for (RawJson rawJson : jsons) {
            this.inMemoryData.put(rawJson.getId(), rawJson);
        }
        List<StorageException> errors = this.divStorage.saveRawJsons(jsons, payload.getActionOnError()).getErrors();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(toRawJsonRepositoryExceptions(errors));
        return new RawJsonRepositoryResult(jsons, arrayList);
    }

    @Override // com.yandex.div.storage.RawJsonRepository
    @NotNull
    public RawJsonRepositoryRemoveResult remove(@NotNull Function1<? super RawJson, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        KAssert kAssert = KAssert.INSTANCE;
        if (Assert.isEnabled()) {
            Assert.assertMainThread();
        }
        DivStorage.RemoveResult removeRawJsons = this.divStorage.removeRawJsons(predicate);
        Set<String> component1 = removeRawJsons.component1();
        List<RawJsonRepositoryException> rawJsonRepositoryExceptions = toRawJsonRepositoryExceptions(removeRawJsons.component2());
        removeFromInMemory(component1);
        return new RawJsonRepositoryRemoveResult(component1, rawJsonRepositoryExceptions);
    }
}
