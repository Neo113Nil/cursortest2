package com.squareup.protos.cash.web.bridge;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.scenarios.ScenarioPlan;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \t2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\n\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/cash/web/bridge/WebBridgeBlockerResponsePayload;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/web/bridge/WebBridgeBlockerResponsePayload$Builder;", "Lcom/squareup/protos/franklin/common/scenarios/ScenarioPlan;", "scenario_plan", "Lcom/squareup/protos/franklin/common/scenarios/ScenarioPlan;", "", "flow_token", "Ljava/lang/String;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class WebBridgeBlockerResponsePayload extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<WebBridgeBlockerResponsePayload> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String flow_token;

    @WireField(adapter = "com.squareup.protos.franklin.common.scenarios.ScenarioPlan#ADAPTER", schemaIndex = 0, tag = 1)
    public final ScenarioPlan scenario_plan;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/cash/web/bridge/WebBridgeBlockerResponsePayload$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/web/bridge/WebBridgeBlockerResponsePayload;", "<init>", "()V", "scenario_plan", "Lcom/squareup/protos/franklin/common/scenarios/ScenarioPlan;", "flow_token", "", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public String flow_token;
        public ScenarioPlan scenario_plan;

        @Override // com.squareup.wire.Message.Builder
        public WebBridgeBlockerResponsePayload build() {
            return new WebBridgeBlockerResponsePayload(this.scenario_plan, this.flow_token, buildUnknownFields());
        }

        public final Builder flow_token(String flow_token) {
            this.flow_token = flow_token;
            return this;
        }

        public final Builder scenario_plan(ScenarioPlan scenario_plan) {
            this.scenario_plan = scenario_plan;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(WebBridgeBlockerResponsePayload.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.web.bridge.WebBridgeBlockerResponsePayload$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public WebBridgeBlockerResponsePayload decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new WebBridgeBlockerResponsePayload((ScenarioPlan) obj, (String) obj2, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(ScenarioPlan.ADAPTER, reader, obj);
                    } else if (nextTag != 2) {
                        reader.readUnknownField(nextTag);
                    } else {
                        obj2 = ProtoAdapter.STRING.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, WebBridgeBlockerResponsePayload value) {
                writer.getClass();
                value.getClass();
                ScenarioPlan.ADAPTER.encodeWithTag(writer, 1, value.scenario_plan);
                ProtoAdapter.STRING.encodeWithTag(writer, 2, value.flow_token);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(WebBridgeBlockerResponsePayload value) {
                value.getClass();
                return ProtoAdapter.STRING.encodedSizeWithTag(2, value.flow_token) + ScenarioPlan.ADAPTER.encodedSizeWithTag(1, value.scenario_plan) + value.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public WebBridgeBlockerResponsePayload redact(WebBridgeBlockerResponsePayload value) {
                value.getClass();
                ScenarioPlan scenarioPlan = value.scenario_plan;
                ScenarioPlan scenarioPlan2 = scenarioPlan != null ? (ScenarioPlan) ScenarioPlan.ADAPTER.redact(scenarioPlan) : null;
                ByteString byteString = ByteString.EMPTY;
                String str = value.flow_token;
                byteString.getClass();
                return new WebBridgeBlockerResponsePayload(scenarioPlan2, str, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, WebBridgeBlockerResponsePayload value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter.STRING.encodeWithTag(writer, 2, value.flow_token);
                ScenarioPlan.ADAPTER.encodeWithTag(writer, 1, value.scenario_plan);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebBridgeBlockerResponsePayload(ScenarioPlan scenarioPlan, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.scenario_plan = scenarioPlan;
        this.flow_token = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WebBridgeBlockerResponsePayload)) {
            return false;
        }
        WebBridgeBlockerResponsePayload webBridgeBlockerResponsePayload = (WebBridgeBlockerResponsePayload) obj;
        return Intrinsics.areEqual(unknownFields(), webBridgeBlockerResponsePayload.unknownFields()) && Intrinsics.areEqual(this.scenario_plan, webBridgeBlockerResponsePayload.scenario_plan) && Intrinsics.areEqual(this.flow_token, webBridgeBlockerResponsePayload.flow_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ScenarioPlan scenarioPlan = this.scenario_plan;
        int hashCode2 = (hashCode + (scenarioPlan != null ? scenarioPlan.hashCode() : 0)) * 37;
        String str = this.flow_token;
        int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.scenario_plan = this.scenario_plan;
        builder.flow_token = this.flow_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ScenarioPlan scenarioPlan = this.scenario_plan;
        if (scenarioPlan != null) {
            arrayList.add("scenario_plan=" + scenarioPlan);
        }
        String str = this.flow_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "flow_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "WebBridgeBlockerResponsePayload{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/web/bridge/WebBridgeBlockerResponsePayload$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/web/bridge/WebBridgeBlockerResponsePayload$Builder;", "", "body", "Lcom/squareup/protos/cash/web/bridge/WebBridgeBlockerResponsePayload;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/web/bridge/WebBridgeBlockerResponsePayload;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ WebBridgeBlockerResponsePayload build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
