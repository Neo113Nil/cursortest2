package squareup.cash.lynx.api.app.v1_0;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.lynx.api.v1_0.EnrichmentType;
import com.squareup.cash.lynx.api.v1_0.model.InstrumentScope;
import com.squareup.cash.lynx.api.v1_0.model.InstrumentType;
import com.squareup.cash.lynx.api.v1_0.model.LinkStatusType;
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
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import squareup.cash.savings.GoalFolder;

/* loaded from: classes3.dex */
public final class GetEnrichedInstrumentLinksAppRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetEnrichedInstrumentLinksAppRequest> CREATOR;
    public final String cursor;
    public final List enrichment_types;
    public final Boolean include_defaults_only;
    public final Boolean include_expired_links;
    public final List instrument_scopes;
    public final List instrument_types;
    public final Integer limit;
    public final List link_statuses;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(GetEnrichedInstrumentLinksAppRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: squareup.cash.lynx.api.app.v1_0.GetEnrichedInstrumentLinksAppRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new GetEnrichedInstrumentLinksAppRequest(m, arrayList, arrayList2, (Boolean) obj, (String) obj2, (Integer) obj3, arrayList3, (Boolean) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            try {
                                LinkStatusType.ADAPTER.tryDecode(protoReader, m);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                        case 2:
                            try {
                                InstrumentType.ADAPTER.tryDecode(protoReader, arrayList);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                break;
                            }
                        case 3:
                            try {
                                EnrichmentType.ADAPTER.tryDecode(protoReader, arrayList2);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                break;
                            }
                        case 4:
                            obj = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 5:
                            obj2 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            obj3 = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            try {
                                InstrumentScope.ADAPTER.tryDecode(protoReader, arrayList3);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                                break;
                            }
                        case 8:
                            obj4 = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        default:
                            protoReader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                GetEnrichedInstrumentLinksAppRequest getEnrichedInstrumentLinksAppRequest = (GetEnrichedInstrumentLinksAppRequest) obj;
                reverseProtoWriter.getClass();
                getEnrichedInstrumentLinksAppRequest.getClass();
                reverseProtoWriter.writeBytes(getEnrichedInstrumentLinksAppRequest.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 8, getEnrichedInstrumentLinksAppRequest.include_defaults_only);
                InstrumentScope.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 7, getEnrichedInstrumentLinksAppRequest.instrument_scopes);
                ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 6, getEnrichedInstrumentLinksAppRequest.limit);
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 5, getEnrichedInstrumentLinksAppRequest.cursor);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 4, getEnrichedInstrumentLinksAppRequest.include_expired_links);
                EnrichmentType.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, getEnrichedInstrumentLinksAppRequest.enrichment_types);
                InstrumentType.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, getEnrichedInstrumentLinksAppRequest.instrument_types);
                LinkStatusType.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, getEnrichedInstrumentLinksAppRequest.link_statuses);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                GetEnrichedInstrumentLinksAppRequest getEnrichedInstrumentLinksAppRequest = (GetEnrichedInstrumentLinksAppRequest) obj;
                getEnrichedInstrumentLinksAppRequest.getClass();
                int encodedSizeWithTag = EnrichmentType.ADAPTER.asRepeated().encodedSizeWithTag(3, getEnrichedInstrumentLinksAppRequest.enrichment_types) + InstrumentType.ADAPTER.asRepeated().encodedSizeWithTag(2, getEnrichedInstrumentLinksAppRequest.instrument_types) + LinkStatusType.ADAPTER.asRepeated().encodedSizeWithTag(1, getEnrichedInstrumentLinksAppRequest.link_statuses) + getEnrichedInstrumentLinksAppRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
                return protoAdapter2.encodedSizeWithTag(8, getEnrichedInstrumentLinksAppRequest.include_defaults_only) + InstrumentScope.ADAPTER.asRepeated().encodedSizeWithTag(7, getEnrichedInstrumentLinksAppRequest.instrument_scopes) + ProtoAdapter.INT32.encodedSizeWithTag(6, getEnrichedInstrumentLinksAppRequest.limit) + ProtoAdapter.STRING.encodedSizeWithTag(5, getEnrichedInstrumentLinksAppRequest.cursor) + protoAdapter2.encodedSizeWithTag(4, getEnrichedInstrumentLinksAppRequest.include_expired_links) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                GetEnrichedInstrumentLinksAppRequest getEnrichedInstrumentLinksAppRequest = (GetEnrichedInstrumentLinksAppRequest) obj;
                getEnrichedInstrumentLinksAppRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                List list = getEnrichedInstrumentLinksAppRequest.link_statuses;
                List list2 = getEnrichedInstrumentLinksAppRequest.instrument_types;
                List list3 = getEnrichedInstrumentLinksAppRequest.enrichment_types;
                Boolean bool = getEnrichedInstrumentLinksAppRequest.include_expired_links;
                String str = getEnrichedInstrumentLinksAppRequest.cursor;
                Integer num = getEnrichedInstrumentLinksAppRequest.limit;
                List list4 = getEnrichedInstrumentLinksAppRequest.instrument_scopes;
                Boolean bool2 = getEnrichedInstrumentLinksAppRequest.include_defaults_only;
                list.getClass();
                list2.getClass();
                list3.getClass();
                list4.getClass();
                byteString.getClass();
                return new GetEnrichedInstrumentLinksAppRequest(list, list2, list3, bool, str, num, list4, bool2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                GetEnrichedInstrumentLinksAppRequest getEnrichedInstrumentLinksAppRequest = (GetEnrichedInstrumentLinksAppRequest) obj;
                getEnrichedInstrumentLinksAppRequest.getClass();
                LinkStatusType.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getEnrichedInstrumentLinksAppRequest.link_statuses);
                InstrumentType.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, getEnrichedInstrumentLinksAppRequest.instrument_types);
                EnrichmentType.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, getEnrichedInstrumentLinksAppRequest.enrichment_types);
                ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
                protoAdapter2.encodeWithTag(protoWriter, 4, getEnrichedInstrumentLinksAppRequest.include_expired_links);
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, getEnrichedInstrumentLinksAppRequest.cursor);
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, getEnrichedInstrumentLinksAppRequest.limit);
                InstrumentScope.ADAPTER.asRepeated().encodeWithTag(protoWriter, 7, getEnrichedInstrumentLinksAppRequest.instrument_scopes);
                protoAdapter2.encodeWithTag(protoWriter, 8, getEnrichedInstrumentLinksAppRequest.include_defaults_only);
                protoWriter.writeBytes(getEnrichedInstrumentLinksAppRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetEnrichedInstrumentLinksAppRequest(List list, List list2, List list3, Boolean bool, String str, Integer num, List list4, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        byteString.getClass();
        this.include_expired_links = bool;
        this.cursor = str;
        this.limit = num;
        this.include_defaults_only = bool2;
        this.link_statuses = TransactorKt.immutableCopyOf("link_statuses", list);
        this.instrument_types = TransactorKt.immutableCopyOf("instrument_types", list2);
        this.enrichment_types = TransactorKt.immutableCopyOf("enrichment_types", list3);
        this.instrument_scopes = TransactorKt.immutableCopyOf("instrument_scopes", list4);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetEnrichedInstrumentLinksAppRequest)) {
            return false;
        }
        GetEnrichedInstrumentLinksAppRequest getEnrichedInstrumentLinksAppRequest = (GetEnrichedInstrumentLinksAppRequest) obj;
        return Intrinsics.areEqual(unknownFields(), getEnrichedInstrumentLinksAppRequest.unknownFields()) && Intrinsics.areEqual(this.link_statuses, getEnrichedInstrumentLinksAppRequest.link_statuses) && Intrinsics.areEqual(this.instrument_types, getEnrichedInstrumentLinksAppRequest.instrument_types) && Intrinsics.areEqual(this.enrichment_types, getEnrichedInstrumentLinksAppRequest.enrichment_types) && Intrinsics.areEqual(this.include_expired_links, getEnrichedInstrumentLinksAppRequest.include_expired_links) && Intrinsics.areEqual(this.cursor, getEnrichedInstrumentLinksAppRequest.cursor) && Intrinsics.areEqual(this.limit, getEnrichedInstrumentLinksAppRequest.limit) && Intrinsics.areEqual(this.instrument_scopes, getEnrichedInstrumentLinksAppRequest.instrument_scopes) && Intrinsics.areEqual(this.include_defaults_only, getEnrichedInstrumentLinksAppRequest.include_defaults_only);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.link_statuses), 37, this.instrument_types), 37, this.enrichment_types);
        Boolean bool = this.include_expired_links;
        int hashCode = (m + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        String str = this.cursor;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Integer num = this.limit;
        int m2 = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37, 37, this.instrument_scopes);
        Boolean bool2 = this.include_defaults_only;
        int hashCode3 = m2 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GoalFolder.Builder builder = new GoalFolder.Builder();
        builder.icon_unicode = this.link_statuses;
        builder.completion_token = this.instrument_types;
        builder.label = this.enrichment_types;
        builder.met_goal = this.include_expired_links;
        builder.token = this.cursor;
        builder.goal_progress_percentage = this.limit;
        builder.goal_flow_parameters = this.instrument_scopes;
        builder.goal_amount = this.include_defaults_only;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.link_statuses;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("link_statuses=", arrayList, list);
        }
        List list2 = this.instrument_types;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("instrument_types=", arrayList, list2);
        }
        List list3 = this.enrichment_types;
        if (!list3.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("enrichment_types=", arrayList, list3);
        }
        Boolean bool = this.include_expired_links;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("include_expired_links=", bool, arrayList);
        }
        String str = this.cursor;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "cursor=", arrayList);
        }
        Integer num = this.limit;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("limit=", num, arrayList);
        }
        List list4 = this.instrument_scopes;
        if (!list4.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("instrument_scopes=", arrayList, list4);
        }
        Boolean bool2 = this.include_defaults_only;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("include_defaults_only=", bool2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetEnrichedInstrumentLinksAppRequest{", "}", 0, null, null, 56);
    }
}
