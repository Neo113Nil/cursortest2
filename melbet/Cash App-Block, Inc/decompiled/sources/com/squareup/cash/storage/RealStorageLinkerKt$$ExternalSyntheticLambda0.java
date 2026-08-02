package com.squareup.cash.storage;

import androidx.room.TransactorKt;
import app.cash.sqldelight.SimpleQuery;
import app.cash.sqldelight.TransactionWrapper;
import app.cash.sqldelight.db.SqlDriver;
import bo.app.c7$$ExternalSyntheticLambda6;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticLambda9;
import com.squareup.cash.db.SessionQueries;
import com.squareup.cash.db.SessionQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.db.StorageLinkQueries$$ExternalSyntheticLambda8;
import com.squareup.cash.db.StorageLinkQueries$SelectByIdQuery;
import com.squareup.cash.db.StorageLinkQueries$selectById$2;
import com.squareup.cash.db.Storage_link;
import com.squareup.cash.storage.StorageLink;
import com.squareup.util.cash.Countries;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class RealStorageLinkerKt$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SessionQueries f$0;

    public /* synthetic */ RealStorageLinkerKt$$ExternalSyntheticLambda0(SessionQueries sessionQueries, int i) {
        this.$r8$classId = i;
        this.f$0 = sessionQueries;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        int i2 = 0;
        ((TransactionWrapper) obj).getClass();
        switch (i) {
            case 0:
                SessionQueries sessionQueries = this.f$0;
                sessionQueries.getClass();
                SqlDriver sqlDriver = sessionQueries.driver;
                List list = (List) TransactorKt.transactionWithResult$default(sessionQueries, new RealStorageLinkerKt$$ExternalSyntheticLambda0(sessionQueries, 1));
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (obj2 instanceof StorageLink.Sandboxed) {
                        arrayList.add(obj2);
                    }
                }
                Matcher$$ExternalSyntheticLambda9 matcher$$ExternalSyntheticLambda9 = new Matcher$$ExternalSyntheticLambda9(29);
                sqlDriver.getClass();
                long longValue = ((Number) new SimpleQuery(-103132231, new String[]{"storage_link"}, sqlDriver, "StorageLink.sq", "activeSignInGroupId", "SELECT coalesce(max(signin_group_id), 1)\nFROM storage_link", matcher$$ExternalSyntheticLambda9).executeAsOne()).longValue();
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (((StorageLink.Sandboxed) next).signInGroupId != longValue) {
                        arrayList2.add(next);
                    }
                }
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    int i3 = 10;
                    if (!it2.hasNext()) {
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it3 = arrayList.iterator();
                        while (it3.hasNext()) {
                            Object next2 = it3.next();
                            if (((StorageLink.Sandboxed) next2).signInGroupId == longValue) {
                                arrayList3.add(next2);
                            }
                        }
                        ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10));
                        Iterator it4 = arrayList3.iterator();
                        while (it4.hasNext()) {
                            arrayList4.add(Long.valueOf(((StorageLink.Sandboxed) it4.next()).id));
                        }
                        return CollectionsKt.toSet(arrayList4);
                    }
                    sqlDriver.execute(491158304, "DELETE FROM storage_link WHERE id = ?", new c7$$ExternalSyntheticLambda6(((StorageLink.Sandboxed) it2.next()).id, i3));
                    sessionQueries.notifyQueries(491158304, new SessionQueries$$ExternalSyntheticLambda1(11, false));
                }
            default:
                RealStorageLinkerKt$$ExternalSyntheticLambda2 realStorageLinkerKt$$ExternalSyntheticLambda2 = new RealStorageLinkerKt$$ExternalSyntheticLambda2(i2);
                SessionQueries sessionQueries2 = this.f$0;
                sessionQueries2.getClass();
                SqlDriver sqlDriver2 = sessionQueries2.driver;
                StorageLinkQueries$$ExternalSyntheticLambda8 storageLinkQueries$$ExternalSyntheticLambda8 = new StorageLinkQueries$$ExternalSyntheticLambda8(realStorageLinkerKt$$ExternalSyntheticLambda2, 0);
                sqlDriver2.getClass();
                List executeAsList = new SimpleQuery(-928543147, new String[]{"storage_link"}, sqlDriver2, "StorageLink.sq", "select", "SELECT storage_link.account_token, storage_link.id, storage_link.signin_group_id, storage_link.created_at_ms FROM storage_link", storageLinkQueries$$ExternalSyntheticLambda8).executeAsList();
                List<StorageLink.Sandboxed> list2 = executeAsList;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    for (StorageLink.Sandboxed sandboxed : list2) {
                        sandboxed.getClass();
                        String str = null;
                        long j = sandboxed.id;
                        StorageLinkQueries$selectById$2 storageLinkQueries$selectById$2 = StorageLinkQueries$selectById$2.INSTANCE;
                        Storage_link storage_link = (Storage_link) new StorageLinkQueries$SelectByIdQuery(sessionQueries2, j, new Matcher$$ExternalSyntheticLambda9(28), 0).executeAsOneOrNull();
                        if (storage_link != null) {
                            str = storage_link.account_token;
                        }
                        if (str == null) {
                            return executeAsList;
                        }
                    }
                }
                return CollectionsKt.plus((Collection) executeAsList, (Object) Countries.getOrCreateOnboardingLink(sessionQueries2));
        }
    }
}
