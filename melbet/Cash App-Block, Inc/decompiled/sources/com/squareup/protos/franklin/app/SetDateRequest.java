package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cashlynxflow.plasma.v1.UpdateDefaultInstrumentRequest;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SetDateRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SetDateRequest> CREATOR;
    public final String date;
    public final Boolean disabling_toggle_enabled;
    public final RequestContext request_context;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public String date;
        public Boolean disabling_toggle_enabled;
        public RequestContext request_context;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new SetDateRequest(this.request_context, this.disabling_toggle_enabled, this.date, buildUnknownFields());
                case 1:
                    return new UpdateDefaultInstrumentRequest(this.request_context, this.disabling_toggle_enabled, this.date, buildUnknownFields());
                case 2:
                    return new SubmitProveMobileAuthBlockerRequest(this.request_context, this.disabling_toggle_enabled, this.date, buildUnknownFields());
                default:
                    return new VerifyMagicLinkRequest(this.request_context, this.disabling_toggle_enabled, this.date, buildUnknownFields());
            }
        }
    }

    static {
        SetDateRequest$Companion$ADAPTER$1 setDateRequest$Companion$ADAPTER$1 = new SetDateRequest$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SetDateRequest.class), "type.googleapis.com/squareup.franklin.app.SetDateRequest", Syntax.PROTO_2, null, "squareup/franklin/app/date.proto");
        ADAPTER = setDateRequest$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(setDateRequest$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetDateRequest(RequestContext requestContext, Boolean bool, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.request_context = requestContext;
        this.date = str;
        this.disabling_toggle_enabled = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SetDateRequest)) {
            return false;
        }
        SetDateRequest setDateRequest = (SetDateRequest) obj;
        return Intrinsics.areEqual(unknownFields(), setDateRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, setDateRequest.request_context) && Intrinsics.areEqual(this.date, setDateRequest.date) && Intrinsics.areEqual(this.disabling_toggle_enabled, setDateRequest.disabling_toggle_enabled);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        String str = this.date;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        Boolean bool = this.disabling_toggle_enabled;
        int hashCode4 = hashCode3 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.request_context = this.request_context;
        builder.date = this.date;
        builder.disabling_toggle_enabled = this.disabling_toggle_enabled;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        String str = this.date;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "date=", arrayList);
        }
        Boolean bool = this.disabling_toggle_enabled;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("disabling_toggle_enabled=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SetDateRequest{", "}", 0, null, null, 56);
    }
}
