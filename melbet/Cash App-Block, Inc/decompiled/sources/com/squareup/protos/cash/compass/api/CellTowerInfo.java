package com.squareup.protos.cash.compass.api;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.badging.api.Badge;
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

/* loaded from: classes7.dex */
public final class CellTowerInfo extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CellTowerInfo> CREATOR;
    public final Integer area_code;
    public final Long cell_id;
    public final Boolean is_registered;
    public final Integer mcc;
    public final Integer mnc;
    public final Integer physical_cell_id;
    public final RadioType radio_type;
    public final Integer signal_strength_dbm;

    static {
        CellTowerInfo$Companion$ADAPTER$1 cellTowerInfo$Companion$ADAPTER$1 = new CellTowerInfo$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CellTowerInfo.class), "type.googleapis.com/squareup.cash.compass.api.v1.CellTowerInfo", Syntax.PROTO_2, null, "squareup/cash/compass/api/v1/cell_tower_context.proto");
        ADAPTER = cellTowerInfo$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cellTowerInfo$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CellTowerInfo(Integer num, Integer num2, Long l, Integer num3, Integer num4, Integer num5, Boolean bool, RadioType radioType, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.mcc = num;
        this.mnc = num2;
        this.cell_id = l;
        this.area_code = num3;
        this.physical_cell_id = num4;
        this.signal_strength_dbm = num5;
        this.is_registered = bool;
        this.radio_type = radioType;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CellTowerInfo)) {
            return false;
        }
        CellTowerInfo cellTowerInfo = (CellTowerInfo) obj;
        return Intrinsics.areEqual(unknownFields(), cellTowerInfo.unknownFields()) && Intrinsics.areEqual(this.mcc, cellTowerInfo.mcc) && Intrinsics.areEqual(this.mnc, cellTowerInfo.mnc) && Intrinsics.areEqual(this.cell_id, cellTowerInfo.cell_id) && Intrinsics.areEqual(this.area_code, cellTowerInfo.area_code) && Intrinsics.areEqual(this.physical_cell_id, cellTowerInfo.physical_cell_id) && Intrinsics.areEqual(this.signal_strength_dbm, cellTowerInfo.signal_strength_dbm) && Intrinsics.areEqual(this.is_registered, cellTowerInfo.is_registered) && this.radio_type == cellTowerInfo.radio_type;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Integer num = this.mcc;
        int hashCode2 = (hashCode + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        Integer num2 = this.mnc;
        int hashCode3 = (hashCode2 + (num2 != null ? Integer.hashCode(num2.intValue()) : 0)) * 37;
        Long l = this.cell_id;
        int hashCode4 = (hashCode3 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Integer num3 = this.area_code;
        int hashCode5 = (hashCode4 + (num3 != null ? Integer.hashCode(num3.intValue()) : 0)) * 37;
        Integer num4 = this.physical_cell_id;
        int hashCode6 = (hashCode5 + (num4 != null ? Integer.hashCode(num4.intValue()) : 0)) * 37;
        Integer num5 = this.signal_strength_dbm;
        int hashCode7 = (hashCode6 + (num5 != null ? Integer.hashCode(num5.intValue()) : 0)) * 37;
        Boolean bool = this.is_registered;
        int hashCode8 = (hashCode7 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        RadioType radioType = this.radio_type;
        int hashCode9 = hashCode8 + (radioType != null ? radioType.hashCode() : 0);
        this.hashCode = hashCode9;
        return hashCode9;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Badge.Builder builder = new Badge.Builder(16, false);
        builder.external_token = this.mcc;
        builder.customer_token = this.mnc;
        builder.external_version = this.cell_id;
        builder.updated_at = this.area_code;
        builder.created_at = this.physical_cell_id;
        builder.item_type = this.signal_strength_dbm;
        builder.is_badged = this.is_registered;
        builder.count_groups = this.radio_type;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.mcc != null) {
            arrayList.add("mcc=██");
        }
        if (this.mnc != null) {
            arrayList.add("mnc=██");
        }
        if (this.cell_id != null) {
            arrayList.add("cell_id=██");
        }
        if (this.area_code != null) {
            arrayList.add("area_code=██");
        }
        if (this.physical_cell_id != null) {
            arrayList.add("physical_cell_id=██");
        }
        Integer num = this.signal_strength_dbm;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("signal_strength_dbm=", num, arrayList);
        }
        Boolean bool = this.is_registered;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_registered=", bool, arrayList);
        }
        RadioType radioType = this.radio_type;
        if (radioType != null) {
            arrayList.add("radio_type=" + radioType);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CellTowerInfo{", "}", 0, null, null, 56);
    }

    public /* synthetic */ CellTowerInfo(Integer num, Integer num2, Long l, Integer num3, Integer num4, Integer num5, Boolean bool, RadioType radioType) {
        this(num, num2, l, num3, num4, num5, bool, radioType, ByteString.EMPTY);
    }
}
