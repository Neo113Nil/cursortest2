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
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/TokenType;", "Lcom/squareup/wire/WireEnum;", "", "", "value", "I", "getValue", "()I", "Companion", "TOKEN_TYPE_DO_NOT_USER", "TOKEN_TYPE_CASH_CUSTOMER", "TOKEN_TYPE_SQUARE_CUSTOMER", "TOKEN_TYPE_BLOCK_INTERNAL", "TOKEN_TYPE_CASH_ADVOCATE", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TokenType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TokenType[] $VALUES;
    public static final ProtoAdapter ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final TokenType TOKEN_TYPE_BLOCK_INTERNAL;
    public static final TokenType TOKEN_TYPE_CASH_ADVOCATE;
    public static final TokenType TOKEN_TYPE_CASH_CUSTOMER;
    public static final TokenType TOKEN_TYPE_DO_NOT_USER;
    public static final TokenType TOKEN_TYPE_SQUARE_CUSTOMER;
    private final int value;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/TokenType$Companion;", "", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/TokenType;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public static TokenType fromValue(int i) {
            if (i == 0) {
                return TokenType.TOKEN_TYPE_DO_NOT_USER;
            }
            if (i == 1) {
                return TokenType.TOKEN_TYPE_CASH_CUSTOMER;
            }
            if (i == 2) {
                return TokenType.TOKEN_TYPE_SQUARE_CUSTOMER;
            }
            if (i == 3) {
                return TokenType.TOKEN_TYPE_BLOCK_INTERNAL;
            }
            if (i != 4) {
                return null;
            }
            return TokenType.TOKEN_TYPE_CASH_ADVOCATE;
        }
    }

    static {
        TokenType tokenType = new TokenType("TOKEN_TYPE_DO_NOT_USER", 0, 0);
        TOKEN_TYPE_DO_NOT_USER = tokenType;
        TokenType tokenType2 = new TokenType("TOKEN_TYPE_CASH_CUSTOMER", 1, 1);
        TOKEN_TYPE_CASH_CUSTOMER = tokenType2;
        TokenType tokenType3 = new TokenType("TOKEN_TYPE_SQUARE_CUSTOMER", 2, 2);
        TOKEN_TYPE_SQUARE_CUSTOMER = tokenType3;
        TokenType tokenType4 = new TokenType("TOKEN_TYPE_BLOCK_INTERNAL", 3, 3);
        TOKEN_TYPE_BLOCK_INTERNAL = tokenType4;
        TokenType tokenType5 = new TokenType("TOKEN_TYPE_CASH_ADVOCATE", 4, 4);
        TOKEN_TYPE_CASH_ADVOCATE = tokenType5;
        TokenType[] tokenTypeArr = {tokenType, tokenType2, tokenType3, tokenType4, tokenType5};
        $VALUES = tokenTypeArr;
        $ENTRIES = new EnumEntriesList(tokenTypeArr);
        INSTANCE = new Companion();
        ADAPTER = new TokenType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(TokenType.class), Syntax.PROTO_2, tokenType);
    }

    public TokenType(String str, int i, int i2) {
        this.value = i2;
    }

    public static final TokenType fromValue(int i) {
        INSTANCE.getClass();
        return Companion.fromValue(i);
    }

    public static TokenType valueOf(String str) {
        return (TokenType) Enum.valueOf(TokenType.class, str);
    }

    public static TokenType[] values() {
        return (TokenType[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
