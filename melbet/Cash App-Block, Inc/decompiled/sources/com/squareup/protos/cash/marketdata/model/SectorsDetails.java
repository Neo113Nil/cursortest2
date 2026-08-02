package com.squareup.protos.cash.marketdata.model;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.disputron.Pagination;
import com.squareup.protos.cash.money.content.MoneyTab;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SectorsDetails extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SectorsDetails> CREATOR;
    public final List sectors;

    public final class Sector extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Sector> CREATOR;
        public final String name;
        public final Long weight;

        static {
            SectorsDetails$Sector$Companion$ADAPTER$1 sectorsDetails$Sector$Companion$ADAPTER$1 = new SectorsDetails$Sector$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Sector.class), "type.googleapis.com/squareup.cash.marketdata.model.SectorsDetails.Sector", Syntax.PROTO_2, null, "squareup/cash/marketdata/model/investment_metrics.proto");
            ADAPTER = sectorsDetails$Sector$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(sectorsDetails$Sector$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Sector(String str, Long l, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.name = str;
            this.weight = l;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Sector)) {
                return false;
            }
            Sector sector = (Sector) obj;
            return Intrinsics.areEqual(unknownFields(), sector.unknownFields()) && Intrinsics.areEqual(this.name, sector.name) && Intrinsics.areEqual(this.weight, sector.weight);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.name;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            Long l = this.weight;
            int hashCode3 = hashCode2 + (l != null ? Long.hashCode(l.longValue()) : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Pagination.Builder builder = new Pagination.Builder(4);
            builder.offset = this.name;
            builder.limit = this.weight;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.name;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "name=", arrayList);
            }
            Long l = this.weight;
            if (l != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("weight=", l, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Sector{", "}", 0, null, null, 56);
        }
    }

    static {
        SectorsDetails$Companion$ADAPTER$1 sectorsDetails$Companion$ADAPTER$1 = new SectorsDetails$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SectorsDetails.class), "type.googleapis.com/squareup.cash.marketdata.model.SectorsDetails", Syntax.PROTO_2, null, "squareup/cash/marketdata/model/investment_metrics.proto");
        ADAPTER = sectorsDetails$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(sectorsDetails$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SectorsDetails(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.sectors = TransactorKt.immutableCopyOf("sectors", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SectorsDetails)) {
            return false;
        }
        SectorsDetails sectorsDetails = (SectorsDetails) obj;
        return Intrinsics.areEqual(unknownFields(), sectorsDetails.unknownFields()) && Intrinsics.areEqual(this.sectors, sectorsDetails.sectors);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.sectors.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        MoneyTab.Builder builder = new MoneyTab.Builder(18, false);
        builder.applets = this.sectors;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.sectors;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("sectors=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SectorsDetails{", "}", 0, null, null, 56);
    }
}
