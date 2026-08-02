package com.squareup.protos.cash.activity.api.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesList;
import kotlin.jvm.internal.Reflection;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/SearchFilterContains;", "Lcom/squareup/wire/WireEnum;", "", "", "value", "I", "getValue", "()I", "Companion", "CONTAINS_DEFAULT_DO_NOT_USE", "CONTAINS", "DOES_NOT_CONTAIN", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SearchFilterContains implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SearchFilterContains[] $VALUES;
    public static final ProtoAdapter ADAPTER;
    public static final SearchFilterContains CONTAINS;
    public static final SearchFilterContains CONTAINS_DEFAULT_DO_NOT_USE;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final SearchFilterContains DOES_NOT_CONTAIN;
    private final int value;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/SearchFilterContains$Companion;", "", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/activity/api/v1/SearchFilterContains;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        SearchFilterContains searchFilterContains = new SearchFilterContains("CONTAINS_DEFAULT_DO_NOT_USE", 0, 0);
        CONTAINS_DEFAULT_DO_NOT_USE = searchFilterContains;
        SearchFilterContains searchFilterContains2 = new SearchFilterContains("CONTAINS", 1, 1);
        CONTAINS = searchFilterContains2;
        SearchFilterContains searchFilterContains3 = new SearchFilterContains("DOES_NOT_CONTAIN", 2, 2);
        DOES_NOT_CONTAIN = searchFilterContains3;
        SearchFilterContains[] searchFilterContainsArr = {searchFilterContains, searchFilterContains2, searchFilterContains3};
        $VALUES = searchFilterContainsArr;
        $ENTRIES = new EnumEntriesList(searchFilterContainsArr);
        INSTANCE = new Companion();
        ADAPTER = new SearchFilterContains$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(SearchFilterContains.class), Syntax.PROTO_2, searchFilterContains);
    }

    public SearchFilterContains(String str, int i, int i2) {
        this.value = i2;
    }

    public static final SearchFilterContains fromValue(int i) {
        INSTANCE.getClass();
        if (i == 0) {
            return CONTAINS_DEFAULT_DO_NOT_USE;
        }
        if (i == 1) {
            return CONTAINS;
        }
        if (i != 2) {
            return null;
        }
        return DOES_NOT_CONTAIN;
    }

    public static SearchFilterContains valueOf(String str) {
        return (SearchFilterContains) Enum.valueOf(SearchFilterContains.class, str);
    }

    public static SearchFilterContains[] values() {
        return (SearchFilterContains[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
