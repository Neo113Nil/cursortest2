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
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/LinkVisibility;", "Lcom/squareup/wire/WireEnum;", "", "", "value", "I", "getValue", "()I", "Companion", "LINK_VISIBILITY_INVALID", "LINK_VISIBILITY_EMPTY_ONLY", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LinkVisibility implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LinkVisibility[] $VALUES;
    public static final ProtoAdapter ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final LinkVisibility LINK_VISIBILITY_EMPTY_ONLY;
    public static final LinkVisibility LINK_VISIBILITY_INVALID;
    private final int value;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/LinkVisibility$Companion;", "", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/LinkVisibility;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        LinkVisibility linkVisibility = new LinkVisibility("LINK_VISIBILITY_INVALID", 0, 0);
        LINK_VISIBILITY_INVALID = linkVisibility;
        LinkVisibility linkVisibility2 = new LinkVisibility("LINK_VISIBILITY_EMPTY_ONLY", 1, 1);
        LINK_VISIBILITY_EMPTY_ONLY = linkVisibility2;
        LinkVisibility[] linkVisibilityArr = {linkVisibility, linkVisibility2};
        $VALUES = linkVisibilityArr;
        $ENTRIES = new EnumEntriesList(linkVisibilityArr);
        INSTANCE = new Companion();
        ADAPTER = new LinkVisibility$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(LinkVisibility.class), Syntax.PROTO_2, linkVisibility);
    }

    public LinkVisibility(String str, int i, int i2) {
        this.value = i2;
    }

    public static final LinkVisibility fromValue(int i) {
        INSTANCE.getClass();
        if (i == 0) {
            return LINK_VISIBILITY_INVALID;
        }
        if (i != 1) {
            return null;
        }
        return LINK_VISIBILITY_EMPTY_ONLY;
    }

    public static LinkVisibility valueOf(String str) {
        return (LinkVisibility) Enum.valueOf(LinkVisibility.class, str);
    }

    public static LinkVisibility[] values() {
        return (LinkVisibility[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
