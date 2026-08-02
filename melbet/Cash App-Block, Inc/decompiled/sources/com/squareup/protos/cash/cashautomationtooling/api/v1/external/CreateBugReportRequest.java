package com.squareup.protos.cash.cashautomationtooling.api.v1.external;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.badging.api.Badge;
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

/* loaded from: classes.dex */
public final class CreateBugReportRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CreateBugReportRequest> CREATOR;
    public final AppContext app_context;
    public final List attachment_identifiers;
    public final CustomerContext customer_context;
    public final String description;
    public final DeviceContext device_context;
    public final FeatureContext feature_context;
    public final String reporter_email;
    public final String title;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(CreateBugReportRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.cashautomationtooling.api.v1.external.CreateBugReportRequest$Companion$ADAPTER$1
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
                Object obj5 = null;
                Object obj6 = null;
                Object obj7 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new CreateBugReportRequest((String) obj, (String) obj2, m, (CustomerContext) obj3, (AppContext) obj4, (DeviceContext) obj5, (String) obj6, (FeatureContext) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            obj2 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            m.add(AttachmentIdentifier.ADAPTER.decode(protoReader));
                            break;
                        case 4:
                            obj3 = TransactorKt.decodeMessageOrMerge(CustomerContext.ADAPTER, protoReader, obj3);
                            break;
                        case 5:
                            obj4 = TransactorKt.decodeMessageOrMerge(AppContext.ADAPTER, protoReader, obj4);
                            break;
                        case 6:
                            obj5 = TransactorKt.decodeMessageOrMerge(DeviceContext.ADAPTER, protoReader, obj5);
                            break;
                        case 7:
                            obj6 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            obj7 = TransactorKt.decodeMessageOrMerge(FeatureContext.ADAPTER, protoReader, obj7);
                            break;
                        default:
                            protoReader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                CreateBugReportRequest createBugReportRequest = (CreateBugReportRequest) obj;
                reverseProtoWriter.getClass();
                createBugReportRequest.getClass();
                reverseProtoWriter.writeBytes(createBugReportRequest.unknownFields());
                FeatureContext.ADAPTER.encodeWithTag(reverseProtoWriter, 8, createBugReportRequest.feature_context);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 7, createBugReportRequest.reporter_email);
                DeviceContext.ADAPTER.encodeWithTag(reverseProtoWriter, 6, createBugReportRequest.device_context);
                AppContext.ADAPTER.encodeWithTag(reverseProtoWriter, 5, createBugReportRequest.app_context);
                CustomerContext.ADAPTER.encodeWithTag(reverseProtoWriter, 4, createBugReportRequest.customer_context);
                AttachmentIdentifier.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, createBugReportRequest.attachment_identifiers);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 2, createBugReportRequest.description);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 1, createBugReportRequest.title);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                CreateBugReportRequest createBugReportRequest = (CreateBugReportRequest) obj;
                createBugReportRequest.getClass();
                int size$okio = createBugReportRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return FeatureContext.ADAPTER.encodedSizeWithTag(8, createBugReportRequest.feature_context) + protoAdapter2.encodedSizeWithTag(7, createBugReportRequest.reporter_email) + DeviceContext.ADAPTER.encodedSizeWithTag(6, createBugReportRequest.device_context) + AppContext.ADAPTER.encodedSizeWithTag(5, createBugReportRequest.app_context) + CustomerContext.ADAPTER.encodedSizeWithTag(4, createBugReportRequest.customer_context) + AttachmentIdentifier.ADAPTER.asRepeated().encodedSizeWithTag(3, createBugReportRequest.attachment_identifiers) + protoAdapter2.encodedSizeWithTag(2, createBugReportRequest.description) + protoAdapter2.encodedSizeWithTag(1, createBugReportRequest.title) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                CreateBugReportRequest createBugReportRequest = (CreateBugReportRequest) obj;
                createBugReportRequest.getClass();
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(createBugReportRequest.attachment_identifiers, AttachmentIdentifier.ADAPTER);
                CustomerContext customerContext = createBugReportRequest.customer_context;
                CustomerContext customerContext2 = customerContext != null ? (CustomerContext) CustomerContext.ADAPTER.redact(customerContext) : null;
                AppContext appContext = createBugReportRequest.app_context;
                AppContext appContext2 = appContext != null ? (AppContext) AppContext.ADAPTER.redact(appContext) : null;
                DeviceContext deviceContext = createBugReportRequest.device_context;
                DeviceContext deviceContext2 = deviceContext != null ? (DeviceContext) DeviceContext.ADAPTER.redact(deviceContext) : null;
                FeatureContext featureContext = createBugReportRequest.feature_context;
                FeatureContext featureContext2 = featureContext != null ? (FeatureContext) FeatureContext.ADAPTER.redact(featureContext) : null;
                ByteString byteString = ByteString.EMPTY;
                String str = createBugReportRequest.title;
                String str2 = createBugReportRequest.description;
                byteString.getClass();
                return new CreateBugReportRequest(str, str2, m1169redactElements, customerContext2, appContext2, deviceContext2, null, featureContext2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                CreateBugReportRequest createBugReportRequest = (CreateBugReportRequest) obj;
                createBugReportRequest.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 1, createBugReportRequest.title);
                protoAdapter2.encodeWithTag(protoWriter, 2, createBugReportRequest.description);
                AttachmentIdentifier.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, createBugReportRequest.attachment_identifiers);
                CustomerContext.ADAPTER.encodeWithTag(protoWriter, 4, createBugReportRequest.customer_context);
                AppContext.ADAPTER.encodeWithTag(protoWriter, 5, createBugReportRequest.app_context);
                DeviceContext.ADAPTER.encodeWithTag(protoWriter, 6, createBugReportRequest.device_context);
                protoAdapter2.encodeWithTag(protoWriter, 7, createBugReportRequest.reporter_email);
                FeatureContext.ADAPTER.encodeWithTag(protoWriter, 8, createBugReportRequest.feature_context);
                protoWriter.writeBytes(createBugReportRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateBugReportRequest(String str, String str2, List list, CustomerContext customerContext, AppContext appContext, DeviceContext deviceContext, String str3, FeatureContext featureContext, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.title = str;
        this.description = str2;
        this.customer_context = customerContext;
        this.app_context = appContext;
        this.device_context = deviceContext;
        this.reporter_email = str3;
        this.feature_context = featureContext;
        this.attachment_identifiers = TransactorKt.immutableCopyOf("attachment_identifiers", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CreateBugReportRequest)) {
            return false;
        }
        CreateBugReportRequest createBugReportRequest = (CreateBugReportRequest) obj;
        return Intrinsics.areEqual(unknownFields(), createBugReportRequest.unknownFields()) && Intrinsics.areEqual(this.title, createBugReportRequest.title) && Intrinsics.areEqual(this.description, createBugReportRequest.description) && Intrinsics.areEqual(this.attachment_identifiers, createBugReportRequest.attachment_identifiers) && Intrinsics.areEqual(this.customer_context, createBugReportRequest.customer_context) && Intrinsics.areEqual(this.app_context, createBugReportRequest.app_context) && Intrinsics.areEqual(this.device_context, createBugReportRequest.device_context) && Intrinsics.areEqual(this.reporter_email, createBugReportRequest.reporter_email) && Intrinsics.areEqual(this.feature_context, createBugReportRequest.feature_context);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.title;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.description;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37, 37, this.attachment_identifiers);
        CustomerContext customerContext = this.customer_context;
        int hashCode3 = (m + (customerContext != null ? customerContext.hashCode() : 0)) * 37;
        AppContext appContext = this.app_context;
        int hashCode4 = (hashCode3 + (appContext != null ? appContext.hashCode() : 0)) * 37;
        DeviceContext deviceContext = this.device_context;
        int hashCode5 = (hashCode4 + (deviceContext != null ? deviceContext.hashCode() : 0)) * 37;
        String str3 = this.reporter_email;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 37;
        FeatureContext featureContext = this.feature_context;
        int hashCode7 = hashCode6 + (featureContext != null ? featureContext.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Badge.Builder builder = new Badge.Builder(9);
        builder.external_token = this.title;
        builder.customer_token = this.description;
        builder.count_groups = this.attachment_identifiers;
        builder.external_version = this.customer_context;
        builder.updated_at = this.app_context;
        builder.created_at = this.device_context;
        builder.is_badged = this.reporter_email;
        builder.item_type = this.feature_context;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
        }
        String str2 = this.description;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "description=", arrayList);
        }
        List list = this.attachment_identifiers;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("attachment_identifiers=", arrayList, list);
        }
        CustomerContext customerContext = this.customer_context;
        if (customerContext != null) {
            arrayList.add("customer_context=" + customerContext);
        }
        AppContext appContext = this.app_context;
        if (appContext != null) {
            arrayList.add("app_context=" + appContext);
        }
        DeviceContext deviceContext = this.device_context;
        if (deviceContext != null) {
            arrayList.add("device_context=" + deviceContext);
        }
        if (this.reporter_email != null) {
            arrayList.add("reporter_email=██");
        }
        FeatureContext featureContext = this.feature_context;
        if (featureContext != null) {
            arrayList.add("feature_context=" + featureContext);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CreateBugReportRequest{", "}", 0, null, null, 56);
    }
}
