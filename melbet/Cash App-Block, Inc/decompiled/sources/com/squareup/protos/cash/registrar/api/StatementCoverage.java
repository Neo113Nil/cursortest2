package com.squareup.protos.cash.registrar.api;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_common.zzko;
import com.squareup.protos.cash.pools.ListPoolsRequest;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import squareup.cash.earnings.EarningsYearMonth;
import squareup.cash.earnings.EarningsYearToDate;

/* loaded from: classes.dex */
public final class StatementCoverage extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<StatementCoverage> CREATOR;

    /* renamed from: type, reason: collision with root package name */
    public final zzko f1334type;

    /* loaded from: classes7.dex */
    public final class Annual extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Annual> CREATOR;
        public final Integer year;

        static {
            StatementCoverage$Annual$Companion$ADAPTER$1 statementCoverage$Annual$Companion$ADAPTER$1 = new StatementCoverage$Annual$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Annual.class), "type.googleapis.com/squareup.cash.registrar.api.StatementCoverage.Annual", Syntax.PROTO_2, null, "squareup/cash/registrar/api/statement_coverage.proto");
            ADAPTER = statementCoverage$Annual$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(statementCoverage$Annual$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Annual(Integer num, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.year = num;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Annual)) {
                return false;
            }
            Annual annual = (Annual) obj;
            return Intrinsics.areEqual(unknownFields(), annual.unknownFields()) && Intrinsics.areEqual(this.year, annual.year);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Integer num = this.year;
            int hashCode2 = hashCode + (num != null ? Integer.hashCode(num.intValue()) : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            EarningsYearToDate.Builder builder = new EarningsYearToDate.Builder(5);
            builder.year = this.year;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Integer num = this.year;
            if (num != null) {
                re$$ExternalSyntheticOutline0.m("year=", num, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Annual{", "}", 0, null, null, 56);
        }
    }

    /* loaded from: classes7.dex */
    public final class Monthly extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Monthly> CREATOR;
        public final Integer month;
        public final Integer year;

        static {
            StatementCoverage$Monthly$Companion$ADAPTER$1 statementCoverage$Monthly$Companion$ADAPTER$1 = new StatementCoverage$Monthly$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Monthly.class), "type.googleapis.com/squareup.cash.registrar.api.StatementCoverage.Monthly", Syntax.PROTO_2, null, "squareup/cash/registrar/api/statement_coverage.proto");
            ADAPTER = statementCoverage$Monthly$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(statementCoverage$Monthly$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Monthly(Integer num, Integer num2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.year = num;
            this.month = num2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Monthly)) {
                return false;
            }
            Monthly monthly = (Monthly) obj;
            return Intrinsics.areEqual(unknownFields(), monthly.unknownFields()) && Intrinsics.areEqual(this.year, monthly.year) && Intrinsics.areEqual(this.month, monthly.month);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Integer num = this.year;
            int hashCode2 = (hashCode + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
            Integer num2 = this.month;
            int hashCode3 = hashCode2 + (num2 != null ? Integer.hashCode(num2.intValue()) : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            EarningsYearMonth.Builder builder = new EarningsYearMonth.Builder(5);
            builder.year = this.year;
            builder.month = this.month;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Integer num = this.year;
            if (num != null) {
                re$$ExternalSyntheticOutline0.m("year=", num, arrayList);
            }
            Integer num2 = this.month;
            if (num2 != null) {
                re$$ExternalSyntheticOutline0.m("month=", num2, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Monthly{", "}", 0, null, null, 56);
        }
    }

    static {
        StatementCoverage$Companion$ADAPTER$1 statementCoverage$Companion$ADAPTER$1 = new StatementCoverage$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(StatementCoverage.class), "type.googleapis.com/squareup.cash.registrar.api.StatementCoverage", Syntax.PROTO_2, null, "squareup/cash/registrar/api/statement_coverage.proto");
        ADAPTER = statementCoverage$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(statementCoverage$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatementCoverage(zzko zzkoVar, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.f1334type = zzkoVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StatementCoverage)) {
            return false;
        }
        StatementCoverage statementCoverage = (StatementCoverage) obj;
        return Intrinsics.areEqual(unknownFields(), statementCoverage.unknownFields()) && Intrinsics.areEqual(this.f1334type, statementCoverage.f1334type);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        zzko zzkoVar = this.f1334type;
        int hashCode2 = hashCode + (zzkoVar != null ? zzkoVar.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ListPoolsRequest.Builder builder = new ListPoolsRequest.Builder(14);
        builder.pool_lifecycle_filter = this.f1334type;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        zzko zzkoVar = this.f1334type;
        if (zzkoVar != null) {
            arrayList.add("type=" + zzkoVar);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "StatementCoverage{", "}", 0, null, null, 56);
    }
}
