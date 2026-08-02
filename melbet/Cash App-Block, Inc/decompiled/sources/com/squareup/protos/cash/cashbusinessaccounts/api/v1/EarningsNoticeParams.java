package com.squareup.protos.cash.cashbusinessaccounts.api.v1;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.notifications.Op;
import com.squareup.protos.cash.aegis.core.Section;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class EarningsNoticeParams extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<EarningsNoticeParams> CREATOR;
    public final EntryPoint entry_point;
    public final Integer month;
    public final Integer year;

    public enum EntryPoint implements WireEnum {
        ENTRY_POINT_MONEY_TAB(1),
        ENTRY_POINT_MONTHLY_PUSH(2),
        ENTRY_POINT_INTRO_PUSH(3),
        ENTRY_POINT_INTRO_EMAIL(4);

        public final int value;
        public static final Op.Companion Companion = new Op.Companion();
        public static final EarningsNoticeParams$EntryPoint$Companion$ADAPTER$1 ADAPTER = new EarningsNoticeParams$EntryPoint$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(EntryPoint.class), Syntax.PROTO_2, null);

        EntryPoint(int i) {
            this.value = i;
        }

        public static final EntryPoint fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return ENTRY_POINT_MONEY_TAB;
            }
            if (i == 2) {
                return ENTRY_POINT_MONTHLY_PUSH;
            }
            if (i == 3) {
                return ENTRY_POINT_INTRO_PUSH;
            }
            if (i != 4) {
                return null;
            }
            return ENTRY_POINT_INTRO_EMAIL;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        EarningsNoticeParams$Companion$ADAPTER$1 earningsNoticeParams$Companion$ADAPTER$1 = new EarningsNoticeParams$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(EarningsNoticeParams.class), "type.googleapis.com/squareup.cash.cashbusinessaccounts.api.v1beta1.EarningsNoticeParams", Syntax.PROTO_2, null, "squareup/cash/cashbusinessaccounts/api/v1beta1/earnings_tracker.proto");
        ADAPTER = earningsNoticeParams$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(earningsNoticeParams$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EarningsNoticeParams(Integer num, Integer num2, EntryPoint entryPoint, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.month = num;
        this.year = num2;
        this.entry_point = entryPoint;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EarningsNoticeParams)) {
            return false;
        }
        EarningsNoticeParams earningsNoticeParams = (EarningsNoticeParams) obj;
        return Intrinsics.areEqual(unknownFields(), earningsNoticeParams.unknownFields()) && Intrinsics.areEqual(this.month, earningsNoticeParams.month) && Intrinsics.areEqual(this.year, earningsNoticeParams.year) && this.entry_point == earningsNoticeParams.entry_point;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Integer num = this.month;
        int hashCode2 = (hashCode + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        Integer num2 = this.year;
        int hashCode3 = (hashCode2 + (num2 != null ? Integer.hashCode(num2.intValue()) : 0)) * 37;
        EntryPoint entryPoint = this.entry_point;
        int hashCode4 = hashCode3 + (entryPoint != null ? entryPoint.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Section.Builder builder = new Section.Builder(24);
        builder.header_text = this.month;
        builder.header_button = this.year;
        builder.groups = this.entry_point;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Integer num = this.month;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("month=", num, arrayList);
        }
        Integer num2 = this.year;
        if (num2 != null) {
            re$$ExternalSyntheticOutline0.m("year=", num2, arrayList);
        }
        EntryPoint entryPoint = this.entry_point;
        if (entryPoint != null) {
            arrayList.add("entry_point=" + entryPoint);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "EarningsNoticeParams{", "}", 0, null, null, 56);
    }
}
