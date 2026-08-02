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
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/SearchFilterComparison;", "Lcom/squareup/wire/WireEnum;", "", "", "value", "I", "getValue", "()I", "Companion", "COMPARISON_DEFAULT_DO_NOT_USE", "GREATER_THAN_OR_EQUAL_TO", "LESS_THAN_OR_EQUAL_TO", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SearchFilterComparison implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SearchFilterComparison[] $VALUES;
    public static final ProtoAdapter ADAPTER;
    public static final SearchFilterComparison COMPARISON_DEFAULT_DO_NOT_USE;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final SearchFilterComparison GREATER_THAN_OR_EQUAL_TO;
    public static final SearchFilterComparison LESS_THAN_OR_EQUAL_TO;
    private final int value;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/SearchFilterComparison$Companion;", "", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/activity/api/v1/SearchFilterComparison;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        SearchFilterComparison searchFilterComparison = new SearchFilterComparison("COMPARISON_DEFAULT_DO_NOT_USE", 0, 0);
        COMPARISON_DEFAULT_DO_NOT_USE = searchFilterComparison;
        SearchFilterComparison searchFilterComparison2 = new SearchFilterComparison("GREATER_THAN_OR_EQUAL_TO", 1, 1);
        GREATER_THAN_OR_EQUAL_TO = searchFilterComparison2;
        SearchFilterComparison searchFilterComparison3 = new SearchFilterComparison("LESS_THAN_OR_EQUAL_TO", 2, 2);
        LESS_THAN_OR_EQUAL_TO = searchFilterComparison3;
        SearchFilterComparison[] searchFilterComparisonArr = {searchFilterComparison, searchFilterComparison2, searchFilterComparison3};
        $VALUES = searchFilterComparisonArr;
        $ENTRIES = new EnumEntriesList(searchFilterComparisonArr);
        INSTANCE = new Companion();
        ADAPTER = new SearchFilterComparison$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(SearchFilterComparison.class), Syntax.PROTO_2, searchFilterComparison);
    }

    public SearchFilterComparison(String str, int i, int i2) {
        this.value = i2;
    }

    public static final SearchFilterComparison fromValue(int i) {
        INSTANCE.getClass();
        if (i == 0) {
            return COMPARISON_DEFAULT_DO_NOT_USE;
        }
        if (i == 1) {
            return GREATER_THAN_OR_EQUAL_TO;
        }
        if (i != 2) {
            return null;
        }
        return LESS_THAN_OR_EQUAL_TO;
    }

    public static SearchFilterComparison valueOf(String str) {
        return (SearchFilterComparison) Enum.valueOf(SearchFilterComparison.class, str);
    }

    public static SearchFilterComparison[] values() {
        return (SearchFilterComparison[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
