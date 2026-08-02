package com.squareup.util.android;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewGroupKt$children$1;
import androidx.core.view.ViewGroupKt$iterator$1;
import com.datadog.android.rum.model.ViewEvent;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonObject;
import com.squareup.cash.arcade.components.BadgeKt$$ExternalSyntheticLambda3;
import com.squareup.cash.boost.db.RewardQueries;
import com.squareup.cash.clientsync.SyncRangeQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.clientsync.logging.RealClientSyncLogger;
import com.squareup.cash.clientsync.persistence.SqlComponentMigrationStore;
import com.squareup.cash.db.SessionQueries;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.SequencesKt___SequencesKt;

/* loaded from: classes6.dex */
public abstract class ViewGroups {
    public static final Object ensureMigrated(SqlComponentMigrationStore sqlComponentMigrationStore, String str, Function0 function0, Function0 function02, RealClientSyncLogger realClientSyncLogger) {
        sqlComponentMigrationStore.getClass();
        SessionQueries sessionQueries = sqlComponentMigrationStore.componentMigrationQueries;
        sessionQueries.getClass();
        Long l = (Long) new RewardQueries.ForIdsQuery(sessionQueries, str, new SyncRangeQueries$$ExternalSyntheticLambda1(7), 12).executeAsOneOrNull();
        if (l == null || l.longValue() != 9) {
            if (realClientSyncLogger != null) {
                RealClientSyncLogger.debug$default(realClientSyncLogger, "Migrating [" + str + "] to version 9...");
            }
            function0.invoke();
            sessionQueries.getClass();
            sessionQueries.driver.execute(911304826, "INSERT OR REPLACE INTO component_migration (component_key, migration_version)\nVALUES (?, ?)", new BadgeKt$$ExternalSyntheticLambda3(str, 21));
            sessionQueries.notifyQueries(911304826, new SyncRangeQueries$$ExternalSyntheticLambda1(6));
            if (realClientSyncLogger != null) {
                RealClientSyncLogger.debug$default(realClientSyncLogger, "Migrated [" + str + "] to version 9");
            }
        }
        return function02.invoke();
    }

    public static final View findViewInTree(ViewGroup viewGroup, Function1 function1) {
        Object obj;
        viewGroup.getClass();
        Iterator it = new ViewGroupKt$children$1(viewGroup).iterator();
        while (true) {
            ViewGroupKt$iterator$1 viewGroupKt$iterator$1 = (ViewGroupKt$iterator$1) it;
            if (!viewGroupKt$iterator$1.hasNext()) {
                obj = null;
                break;
            }
            obj = viewGroupKt$iterator$1.next();
            if (((Boolean) function1.invoke(obj)).booleanValue()) {
                break;
            }
        }
        View view = (View) obj;
        return view != null ? view : (View) SequencesKt___SequencesKt.firstOrNull(SequencesKt___SequencesKt.mapNotNull(new ViewGroupKt$children$1(viewGroup), new ViewGroups$$ExternalSyntheticLambda0(0, function1)));
    }

    public static ViewEvent.FrozenFrame fromJsonObject(JsonObject jsonObject) {
        try {
            return new ViewEvent.FrozenFrame(jsonObject.get("count").getAsLong());
        } catch (IllegalStateException e) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type FrozenFrame", e);
            return null;
        } catch (NullPointerException e2) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type FrozenFrame", e2);
            return null;
        } catch (NumberFormatException e3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type FrozenFrame", e3);
            return null;
        }
    }
}
