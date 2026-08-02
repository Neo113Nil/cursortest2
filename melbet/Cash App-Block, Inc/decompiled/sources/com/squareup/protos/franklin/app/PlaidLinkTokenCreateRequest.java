package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.protos.franklin.common.scenarios.PlaidLinkingConfig;
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

/* loaded from: classes.dex */
public final class PlaidLinkTokenCreateRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PlaidLinkTokenCreateRequest> CREATOR;
    public final ClientScenario client_scenario;
    public final Boolean manual_ach_enabled;
    public final PlaidLinkingConfig plaid_linking_config;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(PlaidLinkTokenCreateRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.app.PlaidLinkTokenCreateRequest$Companion$ADAPTER$1
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
                Object obj3 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new PlaidLinkTokenCreateRequest((Boolean) obj, (ClientScenario) obj2, (PlaidLinkingConfig) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag == 2) {
                        try {
                            obj2 = ClientScenario.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (nextTag != 3) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj3 = TransactorKt.decodeMessageOrMerge(PlaidLinkingConfig.ADAPTER, protoReader, obj3);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                PlaidLinkTokenCreateRequest plaidLinkTokenCreateRequest = (PlaidLinkTokenCreateRequest) obj;
                reverseProtoWriter.getClass();
                plaidLinkTokenCreateRequest.getClass();
                reverseProtoWriter.writeBytes(plaidLinkTokenCreateRequest.unknownFields());
                PlaidLinkingConfig.ADAPTER.encodeWithTag(reverseProtoWriter, 3, plaidLinkTokenCreateRequest.plaid_linking_config);
                ClientScenario.ADAPTER.encodeWithTag(reverseProtoWriter, 2, plaidLinkTokenCreateRequest.client_scenario);
                ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 1, plaidLinkTokenCreateRequest.manual_ach_enabled);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                PlaidLinkTokenCreateRequest plaidLinkTokenCreateRequest = (PlaidLinkTokenCreateRequest) obj;
                plaidLinkTokenCreateRequest.getClass();
                return PlaidLinkingConfig.ADAPTER.encodedSizeWithTag(3, plaidLinkTokenCreateRequest.plaid_linking_config) + ClientScenario.ADAPTER.encodedSizeWithTag(2, plaidLinkTokenCreateRequest.client_scenario) + ProtoAdapter.BOOL.encodedSizeWithTag(1, plaidLinkTokenCreateRequest.manual_ach_enabled) + plaidLinkTokenCreateRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                PlaidLinkTokenCreateRequest plaidLinkTokenCreateRequest = (PlaidLinkTokenCreateRequest) obj;
                plaidLinkTokenCreateRequest.getClass();
                PlaidLinkingConfig plaidLinkingConfig = plaidLinkTokenCreateRequest.plaid_linking_config;
                PlaidLinkingConfig plaidLinkingConfig2 = plaidLinkingConfig != null ? (PlaidLinkingConfig) PlaidLinkingConfig.ADAPTER.redact(plaidLinkingConfig) : null;
                ByteString byteString = ByteString.EMPTY;
                Boolean bool = plaidLinkTokenCreateRequest.manual_ach_enabled;
                ClientScenario clientScenario = plaidLinkTokenCreateRequest.client_scenario;
                byteString.getClass();
                return new PlaidLinkTokenCreateRequest(bool, clientScenario, plaidLinkingConfig2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                PlaidLinkTokenCreateRequest plaidLinkTokenCreateRequest = (PlaidLinkTokenCreateRequest) obj;
                plaidLinkTokenCreateRequest.getClass();
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, plaidLinkTokenCreateRequest.manual_ach_enabled);
                ClientScenario.ADAPTER.encodeWithTag(protoWriter, 2, plaidLinkTokenCreateRequest.client_scenario);
                PlaidLinkingConfig.ADAPTER.encodeWithTag(protoWriter, 3, plaidLinkTokenCreateRequest.plaid_linking_config);
                protoWriter.writeBytes(plaidLinkTokenCreateRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaidLinkTokenCreateRequest(Boolean bool, ClientScenario clientScenario, PlaidLinkingConfig plaidLinkingConfig, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.manual_ach_enabled = bool;
        this.client_scenario = clientScenario;
        this.plaid_linking_config = plaidLinkingConfig;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PlaidLinkTokenCreateRequest)) {
            return false;
        }
        PlaidLinkTokenCreateRequest plaidLinkTokenCreateRequest = (PlaidLinkTokenCreateRequest) obj;
        return Intrinsics.areEqual(unknownFields(), plaidLinkTokenCreateRequest.unknownFields()) && Intrinsics.areEqual(this.manual_ach_enabled, plaidLinkTokenCreateRequest.manual_ach_enabled) && this.client_scenario == plaidLinkTokenCreateRequest.client_scenario && Intrinsics.areEqual(this.plaid_linking_config, plaidLinkTokenCreateRequest.plaid_linking_config);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.manual_ach_enabled;
        int hashCode2 = (hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        ClientScenario clientScenario = this.client_scenario;
        int hashCode3 = (hashCode2 + (clientScenario != null ? clientScenario.hashCode() : 0)) * 37;
        PlaidLinkingConfig plaidLinkingConfig = this.plaid_linking_config;
        int hashCode4 = hashCode3 + (plaidLinkingConfig != null ? plaidLinkingConfig.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiAlias.Builder builder = new UiAlias.Builder(29);
        builder.f1364type = this.manual_ach_enabled;
        builder.canonical_text = this.client_scenario;
        builder.formatted = this.plaid_linking_config;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.manual_ach_enabled;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("manual_ach_enabled=", bool, arrayList);
        }
        ClientScenario clientScenario = this.client_scenario;
        if (clientScenario != null) {
            Matcher$$ExternalSyntheticOutline0.m("client_scenario=", clientScenario, arrayList);
        }
        PlaidLinkingConfig plaidLinkingConfig = this.plaid_linking_config;
        if (plaidLinkingConfig != null) {
            arrayList.add("plaid_linking_config=" + plaidLinkingConfig);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PlaidLinkTokenCreateRequest{", "}", 0, null, null, 56);
    }
}
