package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_face.zzde;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.pools.PoolVisibility;
import com.squareup.protos.franklin.app.BankingConfig;
import com.squareup.protos.franklin.app.ClaimData;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.lending.OpaqueRoute;
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
import okio.ByteString;

/* loaded from: classes8.dex */
public final class P2pInstrumentSelectionRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<P2pInstrumentSelectionRequest> CREATOR;
    public final zzde option;
    public final RequestContext request_context;

    public final class ExistingInstrumentOption extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ExistingInstrumentOption> CREATOR;
        public final String instrument_token;

        static {
            P2pInstrumentSelectionRequest$ExistingInstrumentOption$Companion$ADAPTER$1 p2pInstrumentSelectionRequest$ExistingInstrumentOption$Companion$ADAPTER$1 = new P2pInstrumentSelectionRequest$ExistingInstrumentOption$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ExistingInstrumentOption.class), "type.googleapis.com/squareup.franklin.app.P2pInstrumentSelectionRequest.ExistingInstrumentOption", Syntax.PROTO_2, null, "squareup/franklin/app/p2p_instrument_selection.proto");
            ADAPTER = p2pInstrumentSelectionRequest$ExistingInstrumentOption$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(p2pInstrumentSelectionRequest$ExistingInstrumentOption$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ExistingInstrumentOption(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.instrument_token = str;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ExistingInstrumentOption)) {
                return false;
            }
            ExistingInstrumentOption existingInstrumentOption = (ExistingInstrumentOption) obj;
            return Intrinsics.areEqual(unknownFields(), existingInstrumentOption.unknownFields()) && Intrinsics.areEqual(this.instrument_token, existingInstrumentOption.instrument_token);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.instrument_token;
            int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            OpaqueRoute.Builder builder = new OpaqueRoute.Builder(10);
            builder.client_route = this.instrument_token;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.instrument_token;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "instrument_token=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ExistingInstrumentOption{", "}", 0, null, null, 56);
        }
    }

    public final class NewLinkOption extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<NewLinkOption> CREATOR;
        public final LinkType link_type;

        public enum LinkType implements WireEnum {
            LINK_TYPE_UNSPECIFIED(0),
            LINK_TYPE_DEBIT_CARD(1);

            public static final P2pInstrumentSelectionRequest$NewLinkOption$LinkType$Companion$ADAPTER$1 ADAPTER;
            public static final PoolVisibility.Companion Companion;
            public final int value;

            static {
                LinkType linkType = LINK_TYPE_UNSPECIFIED;
                Companion = new PoolVisibility.Companion();
                ADAPTER = new P2pInstrumentSelectionRequest$NewLinkOption$LinkType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(LinkType.class), Syntax.PROTO_2, linkType);
            }

            LinkType(int i) {
                this.value = i;
            }

            public static final LinkType fromValue(int i) {
                Companion.getClass();
                if (i == 0) {
                    return LINK_TYPE_UNSPECIFIED;
                }
                if (i != 1) {
                    return null;
                }
                return LINK_TYPE_DEBIT_CARD;
            }

            @Override // com.squareup.wire.WireEnum
            public final int getValue() {
                return this.value;
            }
        }

        static {
            P2pInstrumentSelectionRequest$NewLinkOption$Companion$ADAPTER$1 p2pInstrumentSelectionRequest$NewLinkOption$Companion$ADAPTER$1 = new P2pInstrumentSelectionRequest$NewLinkOption$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(NewLinkOption.class), "type.googleapis.com/squareup.franklin.app.P2pInstrumentSelectionRequest.NewLinkOption", Syntax.PROTO_2, null, "squareup/franklin/app/p2p_instrument_selection.proto");
            ADAPTER = p2pInstrumentSelectionRequest$NewLinkOption$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(p2pInstrumentSelectionRequest$NewLinkOption$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NewLinkOption(LinkType linkType, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.link_type = linkType;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof NewLinkOption)) {
                return false;
            }
            NewLinkOption newLinkOption = (NewLinkOption) obj;
            return Intrinsics.areEqual(unknownFields(), newLinkOption.unknownFields()) && this.link_type == newLinkOption.link_type;
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LinkType linkType = this.link_type;
            int hashCode2 = hashCode + (linkType != null ? linkType.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            ClaimData.Builder builder = new ClaimData.Builder(16);
            builder.claimable_payment = this.link_type;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            LinkType linkType = this.link_type;
            if (linkType != null) {
                arrayList.add("link_type=" + linkType);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "NewLinkOption{", "}", 0, null, null, 56);
        }
    }

    static {
        P2pInstrumentSelectionRequest$Companion$ADAPTER$1 p2pInstrumentSelectionRequest$Companion$ADAPTER$1 = new P2pInstrumentSelectionRequest$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(P2pInstrumentSelectionRequest.class), "type.googleapis.com/squareup.franklin.app.P2pInstrumentSelectionRequest", Syntax.PROTO_2, null, "squareup/franklin/app/p2p_instrument_selection.proto");
        ADAPTER = p2pInstrumentSelectionRequest$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(p2pInstrumentSelectionRequest$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P2pInstrumentSelectionRequest(RequestContext requestContext, zzde zzdeVar, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.request_context = requestContext;
        this.option = zzdeVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof P2pInstrumentSelectionRequest)) {
            return false;
        }
        P2pInstrumentSelectionRequest p2pInstrumentSelectionRequest = (P2pInstrumentSelectionRequest) obj;
        return Intrinsics.areEqual(unknownFields(), p2pInstrumentSelectionRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, p2pInstrumentSelectionRequest.request_context) && Intrinsics.areEqual(this.option, p2pInstrumentSelectionRequest.option);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        zzde zzdeVar = this.option;
        int hashCode3 = hashCode2 + (zzdeVar != null ? zzdeVar.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BankingConfig.Builder builder = new BankingConfig.Builder(21);
        builder.strings = this.request_context;
        builder.recurring_deposits_dda_upsell = this.option;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        zzde zzdeVar = this.option;
        if (zzdeVar != null) {
            arrayList.add("option=" + zzdeVar);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "P2pInstrumentSelectionRequest{", "}", 0, null, null, 56);
    }
}
