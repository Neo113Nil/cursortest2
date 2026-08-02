package com.squareup.cash.work.tinygraph;

import com.nimbusds.jose.jca.JCAContext;
import com.squareup.cash.R;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.work.tinygraph.job.JobDao;
import com.squareup.cash.work.tinygraph.setting.SettingDao;
import com.squareup.protos.cash.local.client.v1.LocalDietaryPreference;
import com.squareup.protos.cash.local.client.v1.LocalIngredient;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.chrisbanes.haze.Pool;
import dev.zacsweers.metro.internal.Factory;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.SharedFlowImpl;

/* loaded from: classes7.dex */
public abstract class EntityStoreModule {

    /* loaded from: classes.dex */
    public final class ProvideEntityStoreMetroFactory implements Factory {
        public static final ProvideEntityStoreMetroFactory INSTANCE = new ProvideEntityStoreMetroFactory();

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EntityStoreModule.provideEntityStore();
        }
    }

    public static final String asString(LocalIngredient localIngredient, AndroidStringManager androidStringManager) {
        localIngredient.getClass();
        switch (localIngredient) {
            case LOCAL_INGREDIENT_UNSPECIFIED:
                return null;
            case LOCAL_INGREDIENT_CELERY:
                return androidStringManager.get(R.string.local_presenters_item_ingredient_celery);
            case LOCAL_INGREDIENT_CRUSTACEANS:
                return androidStringManager.get(R.string.local_presenters_item_ingredient_crustaceans);
            case LOCAL_INGREDIENT_EGGS:
                return androidStringManager.get(R.string.local_presenters_item_ingredient_eggs);
            case LOCAL_INGREDIENT_FISH:
                return androidStringManager.get(R.string.local_presenters_item_ingredient_fish);
            case LOCAL_INGREDIENT_GLUTEN:
                return androidStringManager.get(R.string.local_presenters_item_ingredient_gluten);
            case LOCAL_INGREDIENT_LUPIN:
                return androidStringManager.get(R.string.local_presenters_item_ingredient_lupin);
            case LOCAL_INGREDIENT_MILK:
                return androidStringManager.get(R.string.local_presenters_item_ingredient_milk);
            case LOCAL_INGREDIENT_MOLLUSCS:
                return androidStringManager.get(R.string.local_presenters_item_ingredient_molluscs);
            case LOCAL_INGREDIENT_MUSTARD:
                return androidStringManager.get(R.string.local_presenters_item_ingredient_mustard);
            case LOCAL_INGREDIENT_PEANUTS:
                return androidStringManager.get(R.string.local_presenters_item_ingredient_peanuts);
            case LOCAL_INGREDIENT_SESAME:
                return androidStringManager.get(R.string.local_presenters_item_ingredient_sesame);
            case LOCAL_INGREDIENT_SOY:
                return androidStringManager.get(R.string.local_presenters_item_ingredient_soy);
            case LOCAL_INGREDIENT_SULPHITES:
                return androidStringManager.get(R.string.local_presenters_item_ingredient_sulphites);
            case LOCAL_INGREDIENT_TREE_NUTS:
                return androidStringManager.get(R.string.local_presenters_item_ingredient_tree_nuts);
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
        }
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewCardSpendingRecurringPaymentsInfo.deepLinkSpecs;
    }

    public static SharedFlowImpl provideEntityEventFlow(EntityStore entityStore) {
        return entityStore.entityEventFlow;
    }

    public static EntityStore provideEntityStore() {
        return new EntityStore();
    }

    public static SettingDao provideLocationDao(EntityStore entityStore) {
        return new SettingDao(entityStore);
    }

    public static JCAContext provideMembershipDao(EntityStore entityStore) {
        return new JCAContext(entityStore, 29);
    }

    public static Pool provideMerchantDao(EntityStore entityStore) {
        return new Pool(entityStore);
    }

    public static JobDao providePersonDao(EntityStore entityStore) {
        return new JobDao(entityStore);
    }

    public static final String asString(LocalDietaryPreference localDietaryPreference, AndroidStringManager androidStringManager) {
        localDietaryPreference.getClass();
        switch (localDietaryPreference) {
            case LOCAL_DIETARY_PREFERENCE_UNSPECIFIED:
                return null;
            case LOCAL_DIETARY_PREFERENCE_DAIRY_FREE:
                return androidStringManager.get(R.string.local_presenters_item_dietary_information_dairy_free);
            case LOCAL_DIETARY_PREFERENCE_GLUTEN_FREE:
                return androidStringManager.get(R.string.local_presenters_item_dietary_information_gluten_free);
            case LOCAL_DIETARY_PREFERENCE_HALAL:
                return androidStringManager.get(R.string.local_presenters_item_dietary_information_halal);
            case LOCAL_DIETARY_PREFERENCE_KOSHER:
                return androidStringManager.get(R.string.local_presenters_item_dietary_information_kosher);
            case LOCAL_DIETARY_PREFERENCE_NUT_FREE:
                return androidStringManager.get(R.string.local_presenters_item_dietary_information_nut_free);
            case LOCAL_DIETARY_PREFERENCE_VEGAN:
                return androidStringManager.get(R.string.local_presenters_item_dietary_information_vegan);
            case LOCAL_DIETARY_PREFERENCE_VEGETARIAN:
                return androidStringManager.get(R.string.local_presenters_item_dietary_information_vegetarian);
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
        }
    }
}
