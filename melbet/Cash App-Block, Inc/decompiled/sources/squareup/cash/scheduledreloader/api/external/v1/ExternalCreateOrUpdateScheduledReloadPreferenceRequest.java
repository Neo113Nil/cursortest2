package squareup.cash.scheduledreloader.api.external.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.scheduledreloader.resources.v1.ScheduledReloadPreference;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import squareup.cash.bills.BillsConfig;

/* loaded from: classes3.dex */
public final class ExternalCreateOrUpdateScheduledReloadPreferenceRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ExternalCreateOrUpdateScheduledReloadPreferenceRequest> CREATOR;
    public final RequestContext request_context;
    public final ScheduledReloadPreference scheduled_reload_preference;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ExternalCreateOrUpdateScheduledReloadPreferenceRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: squareup.cash.scheduledreloader.api.external.v1.ExternalCreateOrUpdateScheduledReloadPreferenceRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                protoReader.getClass();
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new ExternalCreateOrUpdateScheduledReloadPreferenceRequest((ScheduledReloadPreference) obj, (RequestContext) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(ScheduledReloadPreference.ADAPTER, protoReader, obj);
                    } else if (nextTag != 2) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj2 = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj2);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                ExternalCreateOrUpdateScheduledReloadPreferenceRequest externalCreateOrUpdateScheduledReloadPreferenceRequest = (ExternalCreateOrUpdateScheduledReloadPreferenceRequest) obj;
                reverseProtoWriter.getClass();
                externalCreateOrUpdateScheduledReloadPreferenceRequest.getClass();
                reverseProtoWriter.writeBytes(externalCreateOrUpdateScheduledReloadPreferenceRequest.unknownFields());
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 2, externalCreateOrUpdateScheduledReloadPreferenceRequest.request_context);
                ScheduledReloadPreference.ADAPTER.encodeWithTag(reverseProtoWriter, 1, externalCreateOrUpdateScheduledReloadPreferenceRequest.scheduled_reload_preference);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                ExternalCreateOrUpdateScheduledReloadPreferenceRequest externalCreateOrUpdateScheduledReloadPreferenceRequest = (ExternalCreateOrUpdateScheduledReloadPreferenceRequest) obj;
                externalCreateOrUpdateScheduledReloadPreferenceRequest.getClass();
                return RequestContext.ADAPTER.encodedSizeWithTag(2, externalCreateOrUpdateScheduledReloadPreferenceRequest.request_context) + ScheduledReloadPreference.ADAPTER.encodedSizeWithTag(1, externalCreateOrUpdateScheduledReloadPreferenceRequest.scheduled_reload_preference) + externalCreateOrUpdateScheduledReloadPreferenceRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                ExternalCreateOrUpdateScheduledReloadPreferenceRequest externalCreateOrUpdateScheduledReloadPreferenceRequest = (ExternalCreateOrUpdateScheduledReloadPreferenceRequest) obj;
                externalCreateOrUpdateScheduledReloadPreferenceRequest.getClass();
                ScheduledReloadPreference scheduledReloadPreference = externalCreateOrUpdateScheduledReloadPreferenceRequest.scheduled_reload_preference;
                ScheduledReloadPreference scheduledReloadPreference2 = scheduledReloadPreference != null ? (ScheduledReloadPreference) ScheduledReloadPreference.ADAPTER.redact(scheduledReloadPreference) : null;
                RequestContext requestContext = externalCreateOrUpdateScheduledReloadPreferenceRequest.request_context;
                RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new ExternalCreateOrUpdateScheduledReloadPreferenceRequest(scheduledReloadPreference2, requestContext2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                ExternalCreateOrUpdateScheduledReloadPreferenceRequest externalCreateOrUpdateScheduledReloadPreferenceRequest = (ExternalCreateOrUpdateScheduledReloadPreferenceRequest) obj;
                externalCreateOrUpdateScheduledReloadPreferenceRequest.getClass();
                ScheduledReloadPreference.ADAPTER.encodeWithTag(protoWriter, 1, externalCreateOrUpdateScheduledReloadPreferenceRequest.scheduled_reload_preference);
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 2, externalCreateOrUpdateScheduledReloadPreferenceRequest.request_context);
                protoWriter.writeBytes(externalCreateOrUpdateScheduledReloadPreferenceRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExternalCreateOrUpdateScheduledReloadPreferenceRequest(ScheduledReloadPreference scheduledReloadPreference, RequestContext requestContext, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.scheduled_reload_preference = scheduledReloadPreference;
        this.request_context = requestContext;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ExternalCreateOrUpdateScheduledReloadPreferenceRequest)) {
            return false;
        }
        ExternalCreateOrUpdateScheduledReloadPreferenceRequest externalCreateOrUpdateScheduledReloadPreferenceRequest = (ExternalCreateOrUpdateScheduledReloadPreferenceRequest) obj;
        return Intrinsics.areEqual(unknownFields(), externalCreateOrUpdateScheduledReloadPreferenceRequest.unknownFields()) && Intrinsics.areEqual(this.scheduled_reload_preference, externalCreateOrUpdateScheduledReloadPreferenceRequest.scheduled_reload_preference) && Intrinsics.areEqual(this.request_context, externalCreateOrUpdateScheduledReloadPreferenceRequest.request_context);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ScheduledReloadPreference scheduledReloadPreference = this.scheduled_reload_preference;
        int hashCode2 = (hashCode + (scheduledReloadPreference != null ? scheduledReloadPreference.hashCode() : 0)) * 37;
        RequestContext requestContext = this.request_context;
        int hashCode3 = hashCode2 + (requestContext != null ? requestContext.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BillsConfig.Builder builder = new BillsConfig.Builder(27);
        builder.bills_applet_default_action = this.scheduled_reload_preference;
        builder.half_applet_content = this.request_context;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ScheduledReloadPreference scheduledReloadPreference = this.scheduled_reload_preference;
        if (scheduledReloadPreference != null) {
            arrayList.add("scheduled_reload_preference=" + scheduledReloadPreference);
        }
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ExternalCreateOrUpdateScheduledReloadPreferenceRequest{", "}", 0, null, null, 56);
    }
}
