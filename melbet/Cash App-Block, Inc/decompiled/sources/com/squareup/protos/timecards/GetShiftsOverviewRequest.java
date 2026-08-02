package com.squareup.protos.timecards;

import android.os.Parcelable;
import com.datadog.android.rum.model.ViewEvent;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
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
import kotlin.reflect.full.KClasses$$Lambda$1;
import okio.ByteString;
import squareup.cash.paychecks.Deduction;

/* loaded from: classes8.dex */
public final class GetShiftsOverviewRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetShiftsOverviewRequest> CREATOR;
    public final String _accept_language;
    public final APIVersion api_version;
    public final ViewEvent.Companion date_time;
    public final String merchant_token;

    public enum APIVersion implements WireEnum {
        DO_NOT_USE(0),
        V1(1),
        V2(2);

        public static final GetShiftsOverviewRequest$APIVersion$Companion$ADAPTER$1 ADAPTER;
        public static final KClasses$$Lambda$1 Companion;
        public final int value;

        static {
            APIVersion aPIVersion = DO_NOT_USE;
            Companion = new KClasses$$Lambda$1(4);
            ADAPTER = new GetShiftsOverviewRequest$APIVersion$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(APIVersion.class), Syntax.PROTO_2, aPIVersion);
        }

        APIVersion(int i) {
            this.value = i;
        }

        public static final APIVersion fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return DO_NOT_USE;
            }
            if (i == 1) {
                return V1;
            }
            if (i != 2) {
                return null;
            }
            return V2;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        KClasses$$Lambda$1 kClasses$$Lambda$1 = APIVersion.Companion;
        GetShiftsOverviewRequest$Companion$ADAPTER$1 getShiftsOverviewRequest$Companion$ADAPTER$1 = new GetShiftsOverviewRequest$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetShiftsOverviewRequest.class), "type.googleapis.com/squareup.timecards.GetShiftsOverviewRequest", Syntax.PROTO_2, null, "squareup/timecards/timecards_service.proto");
        ADAPTER = getShiftsOverviewRequest$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getShiftsOverviewRequest$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetShiftsOverviewRequest(ViewEvent.Companion companion, String str, String str2, APIVersion aPIVersion, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.date_time = companion;
        this.merchant_token = str;
        this._accept_language = str2;
        this.api_version = aPIVersion;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetShiftsOverviewRequest)) {
            return false;
        }
        GetShiftsOverviewRequest getShiftsOverviewRequest = (GetShiftsOverviewRequest) obj;
        return Intrinsics.areEqual(unknownFields(), getShiftsOverviewRequest.unknownFields()) && Intrinsics.areEqual(this.date_time, getShiftsOverviewRequest.date_time) && Intrinsics.areEqual(this.merchant_token, getShiftsOverviewRequest.merchant_token) && Intrinsics.areEqual(this._accept_language, getShiftsOverviewRequest._accept_language) && this.api_version == getShiftsOverviewRequest.api_version;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ViewEvent.Companion companion = this.date_time;
        int hashCode2 = (hashCode + (companion != null ? companion.hashCode() : 0)) * 37;
        String str = this.merchant_token;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this._accept_language;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        APIVersion aPIVersion = this.api_version;
        int hashCode5 = hashCode4 + (aPIVersion != null ? aPIVersion.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Deduction.Builder builder = new Deduction.Builder(3);
        builder.amount = this.date_time;
        builder.description = this.merchant_token;
        builder.note = this._accept_language;
        builder.tint_color = this.api_version;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ViewEvent.Companion companion = this.date_time;
        if (companion != null) {
            arrayList.add("date_time=" + companion);
        }
        String str = this.merchant_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "merchant_token=", arrayList);
        }
        String str2 = this._accept_language;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "_accept_language=", arrayList);
        }
        APIVersion aPIVersion = this.api_version;
        if (aPIVersion != null) {
            arrayList.add("api_version=" + aPIVersion);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetShiftsOverviewRequest{", "}", 0, null, null, 56);
    }
}
