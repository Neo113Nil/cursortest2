package com.chicken.road.cerman.fixs;

import android.app.Application;
import com.chicken.road.cerman.fixs.data.AppDatabase;
import com.chicken.road.cerman.fixs.data.Repository;
import com.chicken.road.cerman.fixs.notifications.VaccineReminders;
import com.chicken.road.cerman.fixs.roost.RoostSky;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: BroilerApp.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\t\u001a\u00020\nH\u0016R\u001e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@BX\u0086.¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/chicken/road/cerman/fixs/BroilerApp;", "Landroid/app/Application;", "<init>", "()V", "value", "Lcom/chicken/road/cerman/fixs/data/Repository;", "repository", "getRepository", "()Lcom/chicken/road/cerman/fixs/data/Repository;", "onCreate", "", "Companion", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public class BroilerApp extends Application {
    private static BroilerApp INSTANCE;
    private Repository repository;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public final Repository getRepository() {
        Repository repository = this.repository;
        if (repository != null) {
            return repository;
        }
        Intrinsics.throwUninitializedPropertyAccessException("repository");
        return null;
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        RoostSky.INSTANCE.initialize(this);
        BroilerApp broilerApp = this;
        this.repository = new Repository(AppDatabase.INSTANCE.get(broilerApp));
        INSTANCE = this;
        VaccineReminders.INSTANCE.ensureChannel(broilerApp);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new BroilerApp$onCreate$1(this, null), 3, null);
    }

    /* compiled from: BroilerApp.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@BX\u0086.¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/chicken/road/cerman/fixs/BroilerApp$Companion;", "", "<init>", "()V", "value", "Lcom/chicken/road/cerman/fixs/BroilerApp;", "INSTANCE", "getINSTANCE", "()Lcom/chicken/road/cerman/fixs/BroilerApp;", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final BroilerApp getINSTANCE() {
            BroilerApp broilerApp = BroilerApp.INSTANCE;
            if (broilerApp != null) {
                return broilerApp;
            }
            Intrinsics.throwUninitializedPropertyAccessException("INSTANCE");
            return null;
        }
    }
}
