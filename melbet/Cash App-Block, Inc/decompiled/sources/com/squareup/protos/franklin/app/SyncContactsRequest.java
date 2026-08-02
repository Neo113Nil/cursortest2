package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.bankingbenefits.api.v1_0.app.BenefitsHub;
import com.squareup.cash.mosaic.resources.api.v1.GetAllResourcesResponse;
import com.squareup.protos.cash.cashlimitsxp.api.v1.GetCustomerLimitsResponse;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletSearchRequest;
import com.squareup.protos.cash.customersearch.api.RecipientSelectorSearchResponse;
import com.squareup.protos.cash.familynotifications.api.v1.ListNotificationSettingsRequest;
import com.squareup.protos.cash.piggybank.appapi.AutomationSection;
import com.squareup.protos.lending.sync_values.GlobalBorrowData;
import com.squareup.protos.timecards.MerchantEmployeeRequestFilter;
import com.squareup.protos.timecards.scheduling.GetShiftSchedulesResponse;
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
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class SyncContactsRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SyncContactsRequest> CREATOR;
    public final List add_hashed_aliases;
    public final List remove_hashed_aliases;
    public final String sync_token;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SyncContactsRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.app.SyncContactsRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
                ArrayList arrayList = new ArrayList();
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new SyncContactsRequest((String) obj, m, arrayList, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 3) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 4) {
                        m.add(ProtoAdapter.BYTES.decode(protoReader));
                    } else if (nextTag != 5) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        arrayList.add(ProtoAdapter.BYTES.decode(protoReader));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                SyncContactsRequest syncContactsRequest = (SyncContactsRequest) obj;
                reverseProtoWriter.getClass();
                syncContactsRequest.getClass();
                reverseProtoWriter.writeBytes(syncContactsRequest.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.BYTES;
                protoAdapter2.asRepeated().encodeWithTag(reverseProtoWriter, 5, syncContactsRequest.remove_hashed_aliases);
                protoAdapter2.asRepeated().encodeWithTag(reverseProtoWriter, 4, syncContactsRequest.add_hashed_aliases);
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, syncContactsRequest.sync_token);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                SyncContactsRequest syncContactsRequest = (SyncContactsRequest) obj;
                syncContactsRequest.getClass();
                int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(3, syncContactsRequest.sync_token) + syncContactsRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.BYTES;
                return protoAdapter2.asRepeated().encodedSizeWithTag(5, syncContactsRequest.remove_hashed_aliases) + protoAdapter2.asRepeated().encodedSizeWithTag(4, syncContactsRequest.add_hashed_aliases) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                SyncContactsRequest syncContactsRequest = (SyncContactsRequest) obj;
                syncContactsRequest.getClass();
                EmptyList emptyList = EmptyList.INSTANCE;
                ByteString byteString = ByteString.EMPTY;
                String str = syncContactsRequest.sync_token;
                emptyList.getClass();
                byteString.getClass();
                return new SyncContactsRequest(str, emptyList, emptyList, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                SyncContactsRequest syncContactsRequest = (SyncContactsRequest) obj;
                syncContactsRequest.getClass();
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, syncContactsRequest.sync_token);
                ProtoAdapter protoAdapter2 = ProtoAdapter.BYTES;
                protoAdapter2.asRepeated().encodeWithTag(protoWriter, 4, syncContactsRequest.add_hashed_aliases);
                protoAdapter2.asRepeated().encodeWithTag(protoWriter, 5, syncContactsRequest.remove_hashed_aliases);
                protoWriter.writeBytes(syncContactsRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncContactsRequest(String str, List list, List list2, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.sync_token = str;
        this.add_hashed_aliases = TransactorKt.immutableCopyOf("add_hashed_aliases", list);
        this.remove_hashed_aliases = TransactorKt.immutableCopyOf("remove_hashed_aliases", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SyncContactsRequest)) {
            return false;
        }
        SyncContactsRequest syncContactsRequest = (SyncContactsRequest) obj;
        return Intrinsics.areEqual(unknownFields(), syncContactsRequest.unknownFields()) && Intrinsics.areEqual(this.sync_token, syncContactsRequest.sync_token) && Intrinsics.areEqual(this.add_hashed_aliases, syncContactsRequest.add_hashed_aliases) && Intrinsics.areEqual(this.remove_hashed_aliases, syncContactsRequest.remove_hashed_aliases);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.sync_token;
        int hashCode2 = this.remove_hashed_aliases.hashCode() + Recorder$$ExternalSyntheticOutline2.m((hashCode + (str != null ? str.hashCode() : 0)) * 37, 37, this.add_hashed_aliases);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.sync_token = this.sync_token;
        builder.add_hashed_aliases = this.add_hashed_aliases;
        builder.remove_hashed_aliases = this.remove_hashed_aliases;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.sync_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "sync_token=", arrayList);
        }
        if (!this.add_hashed_aliases.isEmpty()) {
            arrayList.add("add_hashed_aliases=██");
        }
        if (!this.remove_hashed_aliases.isEmpty()) {
            arrayList.add("remove_hashed_aliases=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SyncContactsRequest{", "}", 0, null, null, 56);
    }

    /* loaded from: classes7.dex */
    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public List add_hashed_aliases;
        public List remove_hashed_aliases;
        public String sync_token;

        public Builder(int i) {
            this.$r8$classId = i;
            switch (i) {
                case 4:
                    EmptyList emptyList = EmptyList.INSTANCE;
                    this.add_hashed_aliases = emptyList;
                    this.remove_hashed_aliases = emptyList;
                    break;
                case 5:
                default:
                    EmptyList emptyList2 = EmptyList.INSTANCE;
                    this.add_hashed_aliases = emptyList2;
                    this.remove_hashed_aliases = emptyList2;
                    break;
                case 6:
                    EmptyList emptyList3 = EmptyList.INSTANCE;
                    this.add_hashed_aliases = emptyList3;
                    this.remove_hashed_aliases = emptyList3;
                    break;
            }
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new SyncContactsRequest(this.sync_token, this.add_hashed_aliases, this.remove_hashed_aliases, buildUnknownFields());
                case 1:
                    return new BenefitsHub.BenefitsBreakdown.LearnMore.BenefitsExplanationScreen(this.sync_token, this.add_hashed_aliases, this.remove_hashed_aliases, buildUnknownFields());
                case 2:
                    return new GetAllResourcesResponse(this.sync_token, this.add_hashed_aliases, this.remove_hashed_aliases, buildUnknownFields());
                case 3:
                    return new GetCustomerLimitsResponse.LimitsSection.LimitsCategory(this.sync_token, this.add_hashed_aliases, this.remove_hashed_aliases, buildUnknownFields());
                case 4:
                    return new AfterpayAppletSearchRequest(this.sync_token, this.add_hashed_aliases, this.remove_hashed_aliases, buildUnknownFields());
                case 5:
                    return new RecipientSelectorSearchResponse.Section(this.sync_token, this.add_hashed_aliases, this.remove_hashed_aliases, buildUnknownFields());
                case 6:
                    return new ListNotificationSettingsRequest(this.sync_token, this.add_hashed_aliases, this.remove_hashed_aliases, buildUnknownFields());
                case 7:
                    return new AutomationSection(this.sync_token, this.add_hashed_aliases, this.remove_hashed_aliases, buildUnknownFields());
                case 8:
                    return new GlobalBorrowData(this.sync_token, this.add_hashed_aliases, this.remove_hashed_aliases, buildUnknownFields());
                case 9:
                    return new MerchantEmployeeRequestFilter(this.sync_token, this.add_hashed_aliases, this.remove_hashed_aliases, buildUnknownFields());
                default:
                    return new GetShiftSchedulesResponse(this.sync_token, this.add_hashed_aliases, this.remove_hashed_aliases, buildUnknownFields());
            }
        }

        public /* synthetic */ Builder(int i, boolean z) {
            this.$r8$classId = i;
        }
    }
}
