package com.squareup.cash.work.tinygraph.job;

import android.content.Context;
import com.squareup.cash.work.tinygraph.EntityStore;
import com.squareup.cash.work.tinygraph.EntityStoreModule;
import com.squareup.cash.work.tinygraph.setting.SettingDao;
import com.squareup.util.android.RealCarrierInfo;
import com.squareup.util.android.RealPendingIntentFactory;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;

/* loaded from: classes7.dex */
public final class JobDao {
    public final EntityStore entityStore;

    /* loaded from: classes.dex */
    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId;
        public final Provider entityStore;

        public /* synthetic */ MetroFactory(DoubleCheck doubleCheck, int i) {
            this.$r8$classId = i;
            this.entityStore = doubleCheck;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = this.$r8$classId;
            Provider provider = this.entityStore;
            switch (i) {
                case 0:
                    EntityStore entityStore = (EntityStore) provider.invoke();
                    entityStore.getClass();
                    return new JobDao(entityStore);
                case 1:
                    EntityStore entityStore2 = (EntityStore) provider.invoke();
                    entityStore2.getClass();
                    return EntityStoreModule.provideMerchantDao(entityStore2);
                case 2:
                    EntityStore entityStore3 = (EntityStore) provider.invoke();
                    entityStore3.getClass();
                    return EntityStoreModule.providePersonDao(entityStore3);
                case 3:
                    EntityStore entityStore4 = (EntityStore) provider.invoke();
                    entityStore4.getClass();
                    return new SettingDao(entityStore4);
                case 4:
                    Context context = (Context) provider.invoke();
                    context.getClass();
                    return new RealPendingIntentFactory(context);
                default:
                    Context context2 = (Context) provider.invoke();
                    context2.getClass();
                    return new RealCarrierInfo(context2);
            }
        }
    }

    public /* synthetic */ JobDao(EntityStore entityStore) {
        this.entityStore = entityStore;
    }
}
