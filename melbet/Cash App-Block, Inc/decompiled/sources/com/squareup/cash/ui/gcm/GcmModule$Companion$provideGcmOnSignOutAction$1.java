package com.squareup.cash.ui.gcm;

import android.content.SharedPreferences;
import com.squareup.cash.CashApp$onCreate$1;
import com.squareup.cash.biometrics.AndroidSecureStore;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticLambda9;
import com.squareup.cash.clientsync.persistence.SqlComponentMigrationStore;
import com.squareup.cash.db.SessionQueries;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.db2.WebLoginConfigQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.session.backend.OnSignOutAction;
import com.squareup.cash.session.backend.RealOnSessionChangeActionsExecutor$executeSignOut$1;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.treehouse.sqldelight.AndroidSqlDelightBridgeHolder;
import com.squareup.encryption.EllipticCurveEncryptionEngine;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.JobKt;

/* loaded from: classes.dex */
public final class GcmModule$Companion$provideGcmOnSignOutAction$1 implements OnSignOutAction {
    public final /* synthetic */ Object $gcmRegistrar;
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ GcmModule$Companion$provideGcmOnSignOutAction$1(Object obj, int i) {
        this.$r8$classId = i;
        this.$gcmRegistrar = obj;
    }

    @Override // com.squareup.cash.session.backend.OnSignOutAction
    public final Object clearData(SessionManager.DeletionMode deletionMode, RealOnSessionChangeActionsExecutor$executeSignOut$1 realOnSessionChangeActionsExecutor$executeSignOut$1) {
        int i = this.$r8$classId;
        Object obj = this.$gcmRegistrar;
        switch (i) {
            case 0:
                Object unregister = ((RealGcmRegistrar) obj).unregister(realOnSessionChangeActionsExecutor$executeSignOut$1);
                if (unregister != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                ((SharedPreferences) ((AndroidSecureStore) obj).storage.delegate).edit().clear().apply();
                break;
            case 2:
                SessionQueries sessionQueries = ((SqlComponentMigrationStore) obj).componentMigrationQueries;
                sessionQueries.driver.execute(219614869, "DELETE\nFROM component_migration", null);
                sessionQueries.notifyQueries(219614869, new Matcher$$ExternalSyntheticLambda9(3));
                break;
            case 3:
                InstrumentQueries instrumentQueries = ((CashAccountDatabaseImpl) obj).profileQueries;
                instrumentQueries.driver.execute(1184598373, "DELETE FROM profile", null);
                instrumentQueries.notifyQueries(1184598373, new WebLoginConfigQueries$$ExternalSyntheticLambda0(8));
                break;
            case 4:
                if (deletionMode == SessionManager.DeletionMode.ALL) {
                    EllipticCurveEncryptionEngine ellipticCurveEncryptionEngine = (EllipticCurveEncryptionEngine) obj;
                    ellipticCurveEncryptionEngine.register();
                    ellipticCurveEncryptionEngine.keyManager.rotateKey();
                }
                break;
            default:
                Object coroutineScope = JobKt.coroutineScope(new CashApp$onCreate$1((AndroidSqlDelightBridgeHolder) obj, null, 10), realOnSessionChangeActionsExecutor$executeSignOut$1);
                if (coroutineScope != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
