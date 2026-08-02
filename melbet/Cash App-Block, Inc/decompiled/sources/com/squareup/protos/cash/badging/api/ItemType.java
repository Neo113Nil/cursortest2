package com.squareup.protos.cash.badging.api;

import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;
import okio.internal.ResourceFileSystem;

/* loaded from: classes.dex */
public enum ItemType implements WireEnum {
    ITEM_TYPE_DO_NOT_USE(0),
    TESTING(1),
    ACTIVITY(2),
    PROFILE_PENDING_REFERRAL(3),
    PROFILE_IDENTITY_HUB(4),
    PROFILE_LIMITS(5),
    PROFILE_PERSONAL_INFO(6),
    PROFILE_SUPPORT_CHAT(7),
    PROFILE_LINKED_INSTRUMENTS(8),
    MARKETING_MESSAGES(9);

    public static final ItemType$Companion$ADAPTER$1 ADAPTER;
    public static final ResourceFileSystem.Companion Companion;
    public final int value;

    static {
        ItemType itemType = ITEM_TYPE_DO_NOT_USE;
        Companion = new ResourceFileSystem.Companion();
        ADAPTER = new ItemType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ItemType.class), Syntax.PROTO_2, itemType);
    }

    ItemType(int i) {
        this.value = i;
    }

    public static final ItemType fromValue(int i) {
        Companion.getClass();
        return ResourceFileSystem.Companion.fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
