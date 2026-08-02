package com.squareup.protos.cash.kgoose.api.v3;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesList;
import kotlin.jvm.internal.Reflection;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/Role;", "Lcom/squareup/wire/WireEnum;", "", "", "value", "I", "getValue", "()I", "Companion", "ROLE_UNSPECIFIED", "ROLE_USER", "ROLE_ASSISTANT", "ROLE_SYSTEM", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class Role implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Role[] $VALUES;
    public static final ProtoAdapter ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final Role ROLE_ASSISTANT;
    public static final Role ROLE_SYSTEM;
    public static final Role ROLE_UNSPECIFIED;
    public static final Role ROLE_USER;
    private final int value;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/Role$Companion;", "", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/Role;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        Role role = new Role("ROLE_UNSPECIFIED", 0, 0);
        ROLE_UNSPECIFIED = role;
        Role role2 = new Role("ROLE_USER", 1, 1);
        ROLE_USER = role2;
        Role role3 = new Role("ROLE_ASSISTANT", 2, 2);
        ROLE_ASSISTANT = role3;
        Role role4 = new Role("ROLE_SYSTEM", 3, 3);
        ROLE_SYSTEM = role4;
        Role[] roleArr = {role, role2, role3, role4};
        $VALUES = roleArr;
        $ENTRIES = new EnumEntriesList(roleArr);
        INSTANCE = new Companion();
        ADAPTER = new Role$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Role.class), Syntax.PROTO_2, role);
    }

    public Role(String str, int i, int i2) {
        this.value = i2;
    }

    public static final Role fromValue(int i) {
        INSTANCE.getClass();
        if (i == 0) {
            return ROLE_UNSPECIFIED;
        }
        if (i == 1) {
            return ROLE_USER;
        }
        if (i == 2) {
            return ROLE_ASSISTANT;
        }
        if (i != 3) {
            return null;
        }
        return ROLE_SYSTEM;
    }

    public static Role valueOf(String str) {
        return (Role) Enum.valueOf(Role.class, str);
    }

    public static Role[] values() {
        return (Role[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
