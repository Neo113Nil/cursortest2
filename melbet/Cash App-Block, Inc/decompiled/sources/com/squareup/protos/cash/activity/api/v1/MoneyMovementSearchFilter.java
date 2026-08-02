package com.squareup.protos.cash.activity.api.v1;

import android.os.Parcelable;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0007\u0006\bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/MoneyMovementSearchFilter;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/activity/api/v1/MoneyMovementSearchFilter$Builder;", "Lcom/squareup/protos/cash/activity/api/v1/MoneyMovementSearchFilter$Direction;", "direction", "Lcom/squareup/protos/cash/activity/api/v1/MoneyMovementSearchFilter$Direction;", "Companion", "Builder", "Direction", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MoneyMovementSearchFilter extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<MoneyMovementSearchFilter> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.activity.api.v1.MoneyMovementSearchFilter$Direction#ADAPTER", schemaIndex = 0, tag = 1)
    public final Direction direction;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/MoneyMovementSearchFilter$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/activity/api/v1/MoneyMovementSearchFilter;", "<init>", "()V", "direction", "Lcom/squareup/protos/cash/activity/api/v1/MoneyMovementSearchFilter$Direction;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Direction direction;

        @Override // com.squareup.wire.Message.Builder
        public MoneyMovementSearchFilter build() {
            return new MoneyMovementSearchFilter(this.direction, buildUnknownFields());
        }

        public final Builder direction(Direction direction) {
            this.direction = direction;
            return this;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/MoneyMovementSearchFilter$Direction;", "Lcom/squareup/wire/WireEnum;", "", "", "value", "I", "getValue", "()I", "Companion", "DIRECTION_DEFAULT_DO_NOT_USE", "MONEY_IN", "MONEY_OUT", "MONEY_ANY", "MONEY_INTERNAL", "MONEY_EXTERNAL", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Direction implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Direction[] $VALUES;
        public static final ProtoAdapter ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Direction DIRECTION_DEFAULT_DO_NOT_USE;
        public static final Direction MONEY_ANY;
        public static final Direction MONEY_EXTERNAL;
        public static final Direction MONEY_IN;
        public static final Direction MONEY_INTERNAL;
        public static final Direction MONEY_OUT;
        private final int value;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/MoneyMovementSearchFilter$Direction$Companion;", "", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/activity/api/v1/MoneyMovementSearchFilter$Direction;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public static Direction fromValue(int i) {
                if (i == 0) {
                    return Direction.DIRECTION_DEFAULT_DO_NOT_USE;
                }
                if (i == 1) {
                    return Direction.MONEY_IN;
                }
                if (i == 2) {
                    return Direction.MONEY_OUT;
                }
                if (i == 3) {
                    return Direction.MONEY_ANY;
                }
                if (i == 4) {
                    return Direction.MONEY_INTERNAL;
                }
                if (i != 5) {
                    return null;
                }
                return Direction.MONEY_EXTERNAL;
            }
        }

        static {
            Direction direction = new Direction("DIRECTION_DEFAULT_DO_NOT_USE", 0, 0);
            DIRECTION_DEFAULT_DO_NOT_USE = direction;
            Direction direction2 = new Direction("MONEY_IN", 1, 1);
            MONEY_IN = direction2;
            Direction direction3 = new Direction("MONEY_OUT", 2, 2);
            MONEY_OUT = direction3;
            Direction direction4 = new Direction("MONEY_ANY", 3, 3);
            MONEY_ANY = direction4;
            Direction direction5 = new Direction("MONEY_INTERNAL", 4, 4);
            MONEY_INTERNAL = direction5;
            Direction direction6 = new Direction("MONEY_EXTERNAL", 5, 5);
            MONEY_EXTERNAL = direction6;
            Direction[] directionArr = {direction, direction2, direction3, direction4, direction5, direction6};
            $VALUES = directionArr;
            $ENTRIES = new EnumEntriesList(directionArr);
            INSTANCE = new Companion();
            ADAPTER = new MoneyMovementSearchFilter$Direction$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Direction.class), Syntax.PROTO_2, direction);
        }

        public Direction(String str, int i, int i2) {
            this.value = i2;
        }

        public static final Direction fromValue(int i) {
            INSTANCE.getClass();
            return Companion.fromValue(i);
        }

        public static Direction valueOf(String str) {
            return (Direction) Enum.valueOf(Direction.class, str);
        }

        public static Direction[] values() {
            return (Direction[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        MoneyMovementSearchFilter$Companion$ADAPTER$1 moneyMovementSearchFilter$Companion$ADAPTER$1 = new MoneyMovementSearchFilter$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(MoneyMovementSearchFilter.class), "type.googleapis.com/squareup.cash.activity.api.v1.MoneyMovementSearchFilter", Syntax.PROTO_2, null, "squareup/cash/activity/api/v1/search.proto");
        ADAPTER = moneyMovementSearchFilter$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(moneyMovementSearchFilter$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoneyMovementSearchFilter(Direction direction, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.direction = direction;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MoneyMovementSearchFilter)) {
            return false;
        }
        MoneyMovementSearchFilter moneyMovementSearchFilter = (MoneyMovementSearchFilter) obj;
        return Intrinsics.areEqual(unknownFields(), moneyMovementSearchFilter.unknownFields()) && this.direction == moneyMovementSearchFilter.direction;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Direction direction = this.direction;
        int hashCode2 = hashCode + (direction != null ? direction.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.direction = this.direction;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Direction direction = this.direction;
        if (direction != null) {
            arrayList.add("direction=" + direction);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "MoneyMovementSearchFilter{", "}", 0, null, null, 56);
    }
}
