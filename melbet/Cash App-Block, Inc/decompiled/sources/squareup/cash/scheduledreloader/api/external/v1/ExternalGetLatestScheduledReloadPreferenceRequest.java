package squareup.cash.scheduledreloader.api.external.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.scheduledreloader.resources.v1.ScheduledReloadPreference;
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
public final class ExternalGetLatestScheduledReloadPreferenceRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ExternalGetLatestScheduledReloadPreferenceRequest> CREATOR;
    public final String target_identifier_token;

    /* renamed from: type, reason: collision with root package name */
    public final ScheduledReloadPreference.Type f1646type;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ExternalGetLatestScheduledReloadPreferenceRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: squareup.cash.scheduledreloader.api.external.v1.ExternalGetLatestScheduledReloadPreferenceRequest$Companion$ADAPTER$1
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
                        return new ExternalGetLatestScheduledReloadPreferenceRequest((ScheduledReloadPreference.Type) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        try {
                            obj = ScheduledReloadPreference.Type.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (nextTag != 2) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj2 = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                ExternalGetLatestScheduledReloadPreferenceRequest externalGetLatestScheduledReloadPreferenceRequest = (ExternalGetLatestScheduledReloadPreferenceRequest) obj;
                reverseProtoWriter.getClass();
                externalGetLatestScheduledReloadPreferenceRequest.getClass();
                reverseProtoWriter.writeBytes(externalGetLatestScheduledReloadPreferenceRequest.unknownFields());
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, externalGetLatestScheduledReloadPreferenceRequest.target_identifier_token);
                ScheduledReloadPreference.Type.ADAPTER.encodeWithTag(reverseProtoWriter, 1, externalGetLatestScheduledReloadPreferenceRequest.f1646type);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                ExternalGetLatestScheduledReloadPreferenceRequest externalGetLatestScheduledReloadPreferenceRequest = (ExternalGetLatestScheduledReloadPreferenceRequest) obj;
                externalGetLatestScheduledReloadPreferenceRequest.getClass();
                return ProtoAdapter.STRING.encodedSizeWithTag(2, externalGetLatestScheduledReloadPreferenceRequest.target_identifier_token) + ScheduledReloadPreference.Type.ADAPTER.encodedSizeWithTag(1, externalGetLatestScheduledReloadPreferenceRequest.f1646type) + externalGetLatestScheduledReloadPreferenceRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                ExternalGetLatestScheduledReloadPreferenceRequest externalGetLatestScheduledReloadPreferenceRequest = (ExternalGetLatestScheduledReloadPreferenceRequest) obj;
                externalGetLatestScheduledReloadPreferenceRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                ScheduledReloadPreference.Type type2 = externalGetLatestScheduledReloadPreferenceRequest.f1646type;
                String str = externalGetLatestScheduledReloadPreferenceRequest.target_identifier_token;
                byteString.getClass();
                return new ExternalGetLatestScheduledReloadPreferenceRequest(type2, str, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                ExternalGetLatestScheduledReloadPreferenceRequest externalGetLatestScheduledReloadPreferenceRequest = (ExternalGetLatestScheduledReloadPreferenceRequest) obj;
                externalGetLatestScheduledReloadPreferenceRequest.getClass();
                ScheduledReloadPreference.Type.ADAPTER.encodeWithTag(protoWriter, 1, externalGetLatestScheduledReloadPreferenceRequest.f1646type);
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, externalGetLatestScheduledReloadPreferenceRequest.target_identifier_token);
                protoWriter.writeBytes(externalGetLatestScheduledReloadPreferenceRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExternalGetLatestScheduledReloadPreferenceRequest(ScheduledReloadPreference.Type type2, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.f1646type = type2;
        this.target_identifier_token = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ExternalGetLatestScheduledReloadPreferenceRequest)) {
            return false;
        }
        ExternalGetLatestScheduledReloadPreferenceRequest externalGetLatestScheduledReloadPreferenceRequest = (ExternalGetLatestScheduledReloadPreferenceRequest) obj;
        return Intrinsics.areEqual(unknownFields(), externalGetLatestScheduledReloadPreferenceRequest.unknownFields()) && this.f1646type == externalGetLatestScheduledReloadPreferenceRequest.f1646type && Intrinsics.areEqual(this.target_identifier_token, externalGetLatestScheduledReloadPreferenceRequest.target_identifier_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ScheduledReloadPreference.Type type2 = this.f1646type;
        int hashCode2 = (hashCode + (type2 != null ? type2.hashCode() : 0)) * 37;
        String str = this.target_identifier_token;
        int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BillsConfig.Builder builder = new BillsConfig.Builder(28);
        builder.bills_applet_default_action = this.f1646type;
        builder.half_applet_content = this.target_identifier_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ScheduledReloadPreference.Type type2 = this.f1646type;
        if (type2 != null) {
            arrayList.add("type=" + type2);
        }
        String str = this.target_identifier_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "target_identifier_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ExternalGetLatestScheduledReloadPreferenceRequest{", "}", 0, null, null, 56);
    }
}
