package com.squareup.cash.storage;

import android.content.Context;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticLambda9;
import com.squareup.cash.db.SessionQueries;
import com.squareup.cash.db.SessionQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.db.StorageLinkQueries$SelectByIdQuery;
import com.squareup.cash.db.StorageLinkQueries$selectById$2;
import com.squareup.cash.db.Storage_link;
import com.squareup.cash.db.db.CashAppDatabaseImpl;
import com.squareup.cash.storage.StorageLink;
import com.squareup.cash.storage.context.KeyedStorageContextWrapper;

/* loaded from: classes.dex */
public final class RealStorageLinker implements StorageLinker {
    public final RealSandboxer sandboxer;
    public final SessionQueries storageLinkQueries;

    public RealStorageLinker(RealSandboxer realSandboxer, CashAppDatabaseImpl cashAppDatabaseImpl) {
        this.sandboxer = realSandboxer;
        this.storageLinkQueries = cashAppDatabaseImpl.storageLinkQueries;
    }

    @Override // com.squareup.cash.storage.StorageLinker
    public final void clean() {
        SessionQueries sessionQueries = this.storageLinkQueries;
        sessionQueries.getClass();
        sessionQueries.transactionWithWrapper(new StorageLinkQueriesKt$$ExternalSyntheticLambda0(sessionQueries, 0));
        vacuum();
        sessionQueries.driver.execute(-1282173955, "DELETE FROM storage_link", null);
        sessionQueries.notifyQueries(-1282173955, new SessionQueries$$ExternalSyntheticLambda1(6, false));
    }

    @Override // com.squareup.cash.storage.StorageLinker
    public final String getLinkedAccountToken(StorageLink storageLink) {
        if (storageLink instanceof StorageLink.Legacy) {
            return null;
        }
        Long id = storageLink.getId();
        id.getClass();
        long longValue = id.longValue();
        SessionQueries sessionQueries = this.storageLinkQueries;
        sessionQueries.getClass();
        StorageLinkQueries$selectById$2 storageLinkQueries$selectById$2 = StorageLinkQueries$selectById$2.INSTANCE;
        Storage_link storage_link = (Storage_link) new StorageLinkQueries$SelectByIdQuery(sessionQueries, longValue, new Matcher$$ExternalSyntheticLambda9(28), 0).executeAsOneOrNull();
        if (storage_link != null) {
            return storage_link.account_token;
        }
        return null;
    }

    @Override // com.squareup.cash.storage.StorageLinker
    public final Context getStorageContext(StorageLink storageLink) {
        boolean z = storageLink instanceof StorageLink.Sandboxed;
        Context context = this.sandboxer.baseContext;
        return z ? new KeyedStorageContextWrapper(context, String.valueOf(((StorageLink.Sandboxed) storageLink).id)) : context;
    }

    @Override // com.squareup.cash.storage.StorageLinker
    public final int vacuum() {
        return PlatformKt.vacuum(this.storageLinkQueries, this.sandboxer);
    }
}
