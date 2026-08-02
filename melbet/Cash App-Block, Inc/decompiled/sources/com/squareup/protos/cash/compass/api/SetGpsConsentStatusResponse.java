package com.squareup.protos.cash.compass.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.ui.UiAppLock;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/compass/api/SetGpsConsentStatusResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/ui/UiAppLock$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SetGpsConsentStatusResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SetGpsConsentStatusResponse> CREATOR;
    public final Boolean consent_changed;

    static {
        SetGpsConsentStatusResponse$Companion$ADAPTER$1 setGpsConsentStatusResponse$Companion$ADAPTER$1 = new SetGpsConsentStatusResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SetGpsConsentStatusResponse.class), "type.googleapis.com/squareup.cash.compass.api.v1.SetGpsConsentStatusResponse", Syntax.PROTO_2, null, "squareup/cash/compass/api/v1/service.proto");
        ADAPTER = setGpsConsentStatusResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(setGpsConsentStatusResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetGpsConsentStatusResponse(Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.consent_changed = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SetGpsConsentStatusResponse)) {
            return false;
        }
        SetGpsConsentStatusResponse setGpsConsentStatusResponse = (SetGpsConsentStatusResponse) obj;
        return Intrinsics.areEqual(unknownFields(), setGpsConsentStatusResponse.unknownFields()) && Intrinsics.areEqual(this.consent_changed, setGpsConsentStatusResponse.consent_changed);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.consent_changed;
        int hashCode2 = hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiAppLock.Builder builder = new UiAppLock.Builder(7);
        builder.activated = this.consent_changed;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.consent_changed;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("consent_changed=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SetGpsConsentStatusResponse{", "}", 0, null, null, 56);
    }
}
