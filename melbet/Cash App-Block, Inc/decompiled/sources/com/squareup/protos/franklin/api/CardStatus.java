package com.squareup.protos.franklin.api;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okhttp3.internal.Tags;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, d2 = {"Lcom/squareup/protos/franklin/api/CardStatus;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "VALID", "NOT_LINKED", "INVALID", "EXPIRED", "UNSUPPORTED_FOR_ROLE", "UNSUPPORTED_FOR_DEPOSIT_PREFERENCE", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CardStatus implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CardStatus[] $VALUES;
    public static final ProtoAdapter ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int value;
    public static final CardStatus VALID = new CardStatus("VALID", 0, 1);
    public static final CardStatus NOT_LINKED = new CardStatus("NOT_LINKED", 1, 2);
    public static final CardStatus INVALID = new CardStatus("INVALID", 2, 3);
    public static final CardStatus EXPIRED = new CardStatus("EXPIRED", 3, 4);
    public static final CardStatus UNSUPPORTED_FOR_ROLE = new CardStatus("UNSUPPORTED_FOR_ROLE", 4, 5);
    public static final CardStatus UNSUPPORTED_FOR_DEPOSIT_PREFERENCE = new CardStatus("UNSUPPORTED_FOR_DEPOSIT_PREFERENCE", 5, 6);

    private static final /* synthetic */ CardStatus[] $values() {
        return new CardStatus[]{VALID, NOT_LINKED, INVALID, EXPIRED, UNSUPPORTED_FOR_ROLE, UNSUPPORTED_FOR_DEPOSIT_PREFERENCE};
    }

    static {
        CardStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = Tags.enumEntries($values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(CardStatus.class);
        final Syntax syntax = Syntax.PROTO_2;
        ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.CardStatus$Companion$ADAPTER$1
            @Override // com.squareup.wire.EnumAdapter
            public CardStatus fromValue(int value) {
                return CardStatus.INSTANCE.fromValue(value);
            }
        };
    }

    private CardStatus(String str, int i, int i2) {
        this.value = i2;
    }

    public static final CardStatus fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static CardStatus valueOf(String str) {
        return (CardStatus) Enum.valueOf(CardStatus.class, str);
    }

    public static CardStatus[] values() {
        return (CardStatus[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/CardStatus$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/api/CardStatus;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CardStatus fromValue(int value) {
            switch (value) {
                case 1:
                    return CardStatus.VALID;
                case 2:
                    return CardStatus.NOT_LINKED;
                case 3:
                    return CardStatus.INVALID;
                case 4:
                    return CardStatus.EXPIRED;
                case 5:
                    return CardStatus.UNSUPPORTED_FOR_ROLE;
                case 6:
                    return CardStatus.UNSUPPORTED_FOR_DEPOSIT_PREFERENCE;
                default:
                    return null;
            }
        }

        private Companion() {
        }
    }
}
