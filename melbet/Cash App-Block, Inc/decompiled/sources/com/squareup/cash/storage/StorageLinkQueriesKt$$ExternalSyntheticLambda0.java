package com.squareup.cash.storage;

import app.cash.sqldelight.SimpleQuery;
import app.cash.sqldelight.TransactionWrapper;
import app.cash.sqldelight.db.SqlDriver;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticLambda9;
import com.squareup.cash.clientsync.SyncRangeQueries$DeleteAllQuery;
import com.squareup.cash.db.SessionQueries;
import com.squareup.cash.db.SessionQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.db.StorageLinkQueries$$ExternalSyntheticLambda5;
import com.squareup.cash.db.StorageLinkQueries$createOnboardingLink$2;
import com.squareup.cash.db.StorageLinkQueries$getActiveOnboardingLink$2;
import com.squareup.cash.db.Storage_link;
import com.squareup.cash.storage.StorageLink;
import com.squareup.util.cash.Countries;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final /* synthetic */ class StorageLinkQueriesKt$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SessionQueries f$0;

    public /* synthetic */ StorageLinkQueriesKt$$ExternalSyntheticLambda0(SessionQueries sessionQueries, int i) {
        this.$r8$classId = i;
        this.f$0 = sessionQueries;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        SessionQueries sessionQueries = this.f$0;
        switch (i) {
            case 0:
                ((TransactionWrapper) obj).getClass();
                SqlDriver sqlDriver = sessionQueries.driver;
                Matcher$$ExternalSyntheticLambda9 matcher$$ExternalSyntheticLambda9 = new Matcher$$ExternalSyntheticLambda9(29);
                sqlDriver.getClass();
                long longValue = ((Number) new SimpleQuery(-103132231, new String[]{"storage_link"}, sqlDriver, "StorageLink.sq", "activeSignInGroupId", "SELECT coalesce(max(signin_group_id), 1)\nFROM storage_link", matcher$$ExternalSyntheticLambda9).executeAsOne()).longValue() + 1;
                StorageLinkQueries$getActiveOnboardingLink$2 storageLinkQueries$getActiveOnboardingLink$2 = StorageLinkQueries$getActiveOnboardingLink$2.INSTANCE;
                SqlDriver sqlDriver2 = sessionQueries.driver;
                SessionQueries$$ExternalSyntheticLambda1 sessionQueries$$ExternalSyntheticLambda1 = new SessionQueries$$ExternalSyntheticLambda1(13);
                sqlDriver2.getClass();
                Storage_link storage_link = (Storage_link) new SimpleQuery(325090712, new String[]{"storage_link"}, sqlDriver2, "StorageLink.sq", "getActiveOnboardingLink", "SELECT storage_link.account_token, storage_link.id, storage_link.signin_group_id, storage_link.created_at_ms FROM storage_link WHERE account_token IS NULL", sessionQueries$$ExternalSyntheticLambda1).executeAsOneOrNull();
                StorageLink.Sandboxed sandboxed = storage_link != null ? new StorageLink.Sandboxed(storage_link.id, storage_link.signin_group_id, storage_link.created_at_ms) : null;
                if (sandboxed == null) {
                    sandboxed = Countries.getOrCreateOnboardingLink(sessionQueries);
                    Timber.Forest.d("Created new onboarding storage: " + sandboxed, new Object[0]);
                }
                sqlDriver2.execute(1001311958, "UPDATE storage_link\nSET signin_group_id = ?\nWHERE id = ?", new StorageLinkQueries$$ExternalSyntheticLambda5(0, longValue, sandboxed.id));
                sessionQueries.notifyQueries(1001311958, new SessionQueries$$ExternalSyntheticLambda1(12, false));
                return Unit.INSTANCE;
            default:
                ((TransactionWrapper) obj).getClass();
                sessionQueries.getClass();
                StorageLinkQueries$getActiveOnboardingLink$2 storageLinkQueries$getActiveOnboardingLink$22 = StorageLinkQueries$getActiveOnboardingLink$2.INSTANCE;
                SqlDriver sqlDriver3 = sessionQueries.driver;
                SessionQueries$$ExternalSyntheticLambda1 sessionQueries$$ExternalSyntheticLambda12 = new SessionQueries$$ExternalSyntheticLambda1(13);
                sqlDriver3.getClass();
                Storage_link storage_link2 = (Storage_link) new SimpleQuery(325090712, new String[]{"storage_link"}, sqlDriver3, "StorageLink.sq", "getActiveOnboardingLink", "SELECT storage_link.account_token, storage_link.id, storage_link.signin_group_id, storage_link.created_at_ms FROM storage_link WHERE account_token IS NULL", sessionQueries$$ExternalSyntheticLambda12).executeAsOneOrNull();
                if (storage_link2 != null) {
                    return storage_link2;
                }
                StorageLinkQueries$createOnboardingLink$2 storageLinkQueries$createOnboardingLink$2 = StorageLinkQueries$createOnboardingLink$2.INSTANCE;
                Storage_link storage_link3 = (Storage_link) new SyncRangeQueries$DeleteAllQuery(sessionQueries, new SessionQueries$$ExternalSyntheticLambda1(8, false), 2).executeAsOne();
                Timber.Forest.d("Created new onboarding storage link " + storage_link3, new Object[0]);
                return storage_link3;
        }
    }
}
