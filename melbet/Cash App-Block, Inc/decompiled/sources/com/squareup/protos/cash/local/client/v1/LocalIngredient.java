package com.squareup.protos.cash.local.client.v1;

import com.squareup.protos.cash.moneymap.app.RetailerType;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum LocalIngredient implements WireEnum {
    LOCAL_INGREDIENT_UNSPECIFIED(0),
    LOCAL_INGREDIENT_CELERY(1),
    LOCAL_INGREDIENT_CRUSTACEANS(2),
    LOCAL_INGREDIENT_EGGS(3),
    LOCAL_INGREDIENT_FISH(4),
    LOCAL_INGREDIENT_GLUTEN(5),
    LOCAL_INGREDIENT_LUPIN(6),
    LOCAL_INGREDIENT_MILK(7),
    LOCAL_INGREDIENT_MOLLUSCS(8),
    LOCAL_INGREDIENT_MUSTARD(9),
    LOCAL_INGREDIENT_PEANUTS(10),
    LOCAL_INGREDIENT_SESAME(11),
    LOCAL_INGREDIENT_SOY(12),
    LOCAL_INGREDIENT_SULPHITES(13),
    LOCAL_INGREDIENT_TREE_NUTS(14);

    public static final LocalIngredient$Companion$ADAPTER$1 ADAPTER;
    public static final RetailerType.Companion Companion;
    public final int value;

    static {
        LocalIngredient localIngredient = LOCAL_INGREDIENT_UNSPECIFIED;
        Companion = new RetailerType.Companion();
        ADAPTER = new LocalIngredient$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(LocalIngredient.class), Syntax.PROTO_2, localIngredient);
    }

    LocalIngredient(int i) {
        this.value = i;
    }

    public static final LocalIngredient fromValue(int i) {
        Companion.getClass();
        return RetailerType.Companion.m3904fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
