package com.squareup.protos.cash.messagingplatformcommon.ondemand;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.messagingplatformcommon.placements.Placement;
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
import squareup.cash.bankingbenefits.ui.GreenBenefitsV1;

/* loaded from: classes.dex */
public final class GetInAppMessagesRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetInAppMessagesRequest> CREATOR;
    public final List placements;
    public final List variables;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(GetInAppMessagesRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.messagingplatformcommon.ondemand.GetInAppMessagesRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
                ArrayList arrayList = new ArrayList();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new GetInAppMessagesRequest(m, arrayList, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        try {
                            Placement.ADAPTER.tryDecode(protoReader, m);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (nextTag != 2) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        arrayList.add(Variable.ADAPTER.decode(protoReader));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                GetInAppMessagesRequest getInAppMessagesRequest = (GetInAppMessagesRequest) obj;
                reverseProtoWriter.getClass();
                getInAppMessagesRequest.getClass();
                reverseProtoWriter.writeBytes(getInAppMessagesRequest.unknownFields());
                Variable.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, getInAppMessagesRequest.variables);
                Placement.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, getInAppMessagesRequest.placements);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                GetInAppMessagesRequest getInAppMessagesRequest = (GetInAppMessagesRequest) obj;
                getInAppMessagesRequest.getClass();
                return Variable.ADAPTER.asRepeated().encodedSizeWithTag(2, getInAppMessagesRequest.variables) + Placement.ADAPTER.asRepeated().encodedSizeWithTag(1, getInAppMessagesRequest.placements) + getInAppMessagesRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                GetInAppMessagesRequest getInAppMessagesRequest = (GetInAppMessagesRequest) obj;
                getInAppMessagesRequest.getClass();
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(getInAppMessagesRequest.variables, Variable.ADAPTER);
                ByteString byteString = ByteString.EMPTY;
                List list = getInAppMessagesRequest.placements;
                list.getClass();
                byteString.getClass();
                return new GetInAppMessagesRequest(list, m1169redactElements, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                GetInAppMessagesRequest getInAppMessagesRequest = (GetInAppMessagesRequest) obj;
                getInAppMessagesRequest.getClass();
                Placement.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getInAppMessagesRequest.placements);
                Variable.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, getInAppMessagesRequest.variables);
                protoWriter.writeBytes(getInAppMessagesRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetInAppMessagesRequest(List list, List list2, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.placements = TransactorKt.immutableCopyOf("placements", list);
        this.variables = TransactorKt.immutableCopyOf("variables", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetInAppMessagesRequest)) {
            return false;
        }
        GetInAppMessagesRequest getInAppMessagesRequest = (GetInAppMessagesRequest) obj;
        return Intrinsics.areEqual(unknownFields(), getInAppMessagesRequest.unknownFields()) && Intrinsics.areEqual(this.placements, getInAppMessagesRequest.placements) && Intrinsics.areEqual(this.variables, getInAppMessagesRequest.variables);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.variables.hashCode() + Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.placements);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GreenBenefitsV1.Builder builder = new GreenBenefitsV1.Builder(12);
        builder.card_holder_benefits = this.placements;
        builder.green_status_benefits = this.variables;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.placements;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("placements=", arrayList, list);
        }
        List list2 = this.variables;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("variables=", arrayList, list2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetInAppMessagesRequest{", "}", 0, null, null, 56);
    }
}
