package com.squareup.protos.cash.portfolios;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.portfolios.syncvalues.PortfoliosPerformanceValue;
import com.squareup.protos.common.time.DateTime;
import com.squareup.protos.invest.ui.Section;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/portfolios/GetPortfoliosPerformanceResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/common/time/DateTime$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GetPortfoliosPerformanceResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetPortfoliosPerformanceResponse> CREATOR;
    public final String entity_id;
    public final PortfoliosPerformanceValue portfolios_performance_value;
    public final List sections;
    public final String title;
    public final Long version;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(GetPortfoliosPerformanceResponse.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.portfolios.GetPortfoliosPerformanceResponse$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new GetPortfoliosPerformanceResponse(m, (String) obj, (PortfoliosPerformanceValue) obj2, (String) obj3, (Long) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        m.add(Section.ADAPTER.decode(protoReader));
                    } else if (nextTag == 2) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 3) {
                        obj2 = TransactorKt.decodeMessageOrMerge(PortfoliosPerformanceValue.ADAPTER, protoReader, obj2);
                    } else if (nextTag == 4) {
                        obj3 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 5) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj4 = ProtoAdapter.INT64.decode(protoReader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                GetPortfoliosPerformanceResponse getPortfoliosPerformanceResponse = (GetPortfoliosPerformanceResponse) obj;
                reverseProtoWriter.getClass();
                getPortfoliosPerformanceResponse.getClass();
                reverseProtoWriter.writeBytes(getPortfoliosPerformanceResponse.unknownFields());
                ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 5, getPortfoliosPerformanceResponse.version);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 4, getPortfoliosPerformanceResponse.entity_id);
                PortfoliosPerformanceValue.ADAPTER.encodeWithTag(reverseProtoWriter, 3, getPortfoliosPerformanceResponse.portfolios_performance_value);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 2, getPortfoliosPerformanceResponse.title);
                Section.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, getPortfoliosPerformanceResponse.sections);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                GetPortfoliosPerformanceResponse getPortfoliosPerformanceResponse = (GetPortfoliosPerformanceResponse) obj;
                getPortfoliosPerformanceResponse.getClass();
                int encodedSizeWithTag = Section.ADAPTER.asRepeated().encodedSizeWithTag(1, getPortfoliosPerformanceResponse.sections) + getPortfoliosPerformanceResponse.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return ProtoAdapter.INT64.encodedSizeWithTag(5, getPortfoliosPerformanceResponse.version) + protoAdapter2.encodedSizeWithTag(4, getPortfoliosPerformanceResponse.entity_id) + PortfoliosPerformanceValue.ADAPTER.encodedSizeWithTag(3, getPortfoliosPerformanceResponse.portfolios_performance_value) + protoAdapter2.encodedSizeWithTag(2, getPortfoliosPerformanceResponse.title) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                GetPortfoliosPerformanceResponse getPortfoliosPerformanceResponse = (GetPortfoliosPerformanceResponse) obj;
                getPortfoliosPerformanceResponse.getClass();
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(getPortfoliosPerformanceResponse.sections, Section.ADAPTER);
                PortfoliosPerformanceValue portfoliosPerformanceValue = getPortfoliosPerformanceResponse.portfolios_performance_value;
                PortfoliosPerformanceValue portfoliosPerformanceValue2 = portfoliosPerformanceValue != null ? (PortfoliosPerformanceValue) PortfoliosPerformanceValue.ADAPTER.redact(portfoliosPerformanceValue) : null;
                ByteString byteString = ByteString.EMPTY;
                String str = getPortfoliosPerformanceResponse.title;
                String str2 = getPortfoliosPerformanceResponse.entity_id;
                Long l = getPortfoliosPerformanceResponse.version;
                byteString.getClass();
                return new GetPortfoliosPerformanceResponse(m1169redactElements, str, portfoliosPerformanceValue2, str2, l, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                GetPortfoliosPerformanceResponse getPortfoliosPerformanceResponse = (GetPortfoliosPerformanceResponse) obj;
                getPortfoliosPerformanceResponse.getClass();
                Section.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getPortfoliosPerformanceResponse.sections);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 2, getPortfoliosPerformanceResponse.title);
                PortfoliosPerformanceValue.ADAPTER.encodeWithTag(protoWriter, 3, getPortfoliosPerformanceResponse.portfolios_performance_value);
                protoAdapter2.encodeWithTag(protoWriter, 4, getPortfoliosPerformanceResponse.entity_id);
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, getPortfoliosPerformanceResponse.version);
                protoWriter.writeBytes(getPortfoliosPerformanceResponse.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetPortfoliosPerformanceResponse(List list, String str, PortfoliosPerformanceValue portfoliosPerformanceValue, String str2, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.title = str;
        this.portfolios_performance_value = portfoliosPerformanceValue;
        this.entity_id = str2;
        this.version = l;
        this.sections = TransactorKt.immutableCopyOf("sections", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetPortfoliosPerformanceResponse)) {
            return false;
        }
        GetPortfoliosPerformanceResponse getPortfoliosPerformanceResponse = (GetPortfoliosPerformanceResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getPortfoliosPerformanceResponse.unknownFields()) && Intrinsics.areEqual(this.sections, getPortfoliosPerformanceResponse.sections) && Intrinsics.areEqual(this.title, getPortfoliosPerformanceResponse.title) && Intrinsics.areEqual(this.portfolios_performance_value, getPortfoliosPerformanceResponse.portfolios_performance_value) && Intrinsics.areEqual(this.entity_id, getPortfoliosPerformanceResponse.entity_id) && Intrinsics.areEqual(this.version, getPortfoliosPerformanceResponse.version);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.sections);
        String str = this.title;
        int hashCode = (m + (str != null ? str.hashCode() : 0)) * 37;
        PortfoliosPerformanceValue portfoliosPerformanceValue = this.portfolios_performance_value;
        int hashCode2 = (hashCode + (portfoliosPerformanceValue != null ? portfoliosPerformanceValue.hashCode() : 0)) * 37;
        String str2 = this.entity_id;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Long l = this.version;
        int hashCode4 = hashCode3 + (l != null ? Long.hashCode(l.longValue()) : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        DateTime.Builder builder = new DateTime.Builder(5);
        builder.tz_name = this.sections;
        builder.posix_tz = this.title;
        builder.ordinal = this.portfolios_performance_value;
        builder.timezone_offset_min = this.entity_id;
        builder.instant_usec = this.version;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.sections;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("sections=", arrayList, list);
        }
        String str = this.title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
        }
        PortfoliosPerformanceValue portfoliosPerformanceValue = this.portfolios_performance_value;
        if (portfoliosPerformanceValue != null) {
            arrayList.add("portfolios_performance_value=" + portfoliosPerformanceValue);
        }
        String str2 = this.entity_id;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "entity_id=", arrayList);
        }
        Long l = this.version;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("version=", l, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetPortfoliosPerformanceResponse{", "}", 0, null, null, 56);
    }
}
