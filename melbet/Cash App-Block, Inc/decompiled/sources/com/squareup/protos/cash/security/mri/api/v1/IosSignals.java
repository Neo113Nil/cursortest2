package com.squareup.protos.cash.security.mri.api.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.document.Document;
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

/* loaded from: classes7.dex */
public final class IosSignals extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<IosSignals> CREATOR;
    public final Boolean is_location_produced_by_accessory;
    public final Boolean is_location_simulated_by_software;
    public final Boolean is_phone_call_active;
    public final Boolean is_scene_capture_state_active;
    public final Boolean is_screen_captured;
    public final Boolean is_vpn_connected;

    static {
        IosSignals$Companion$ADAPTER$1 iosSignals$Companion$ADAPTER$1 = new IosSignals$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(IosSignals.class), "type.googleapis.com/squareup.cash.security.mri.api.v1.IosSignals", Syntax.PROTO_2, null, "squareup/cash/security/mri/api/v1/mobile_runtime_integrity_messages.proto");
        ADAPTER = iosSignals$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(iosSignals$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IosSignals(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.is_screen_captured = bool;
        this.is_scene_capture_state_active = bool2;
        this.is_location_produced_by_accessory = bool3;
        this.is_location_simulated_by_software = bool4;
        this.is_phone_call_active = bool5;
        this.is_vpn_connected = bool6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IosSignals)) {
            return false;
        }
        IosSignals iosSignals = (IosSignals) obj;
        return Intrinsics.areEqual(unknownFields(), iosSignals.unknownFields()) && Intrinsics.areEqual(this.is_screen_captured, iosSignals.is_screen_captured) && Intrinsics.areEqual(this.is_scene_capture_state_active, iosSignals.is_scene_capture_state_active) && Intrinsics.areEqual(this.is_location_produced_by_accessory, iosSignals.is_location_produced_by_accessory) && Intrinsics.areEqual(this.is_location_simulated_by_software, iosSignals.is_location_simulated_by_software) && Intrinsics.areEqual(this.is_phone_call_active, iosSignals.is_phone_call_active) && Intrinsics.areEqual(this.is_vpn_connected, iosSignals.is_vpn_connected);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.is_screen_captured;
        int hashCode2 = (hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Boolean bool2 = this.is_scene_capture_state_active;
        int hashCode3 = (hashCode2 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        Boolean bool3 = this.is_location_produced_by_accessory;
        int hashCode4 = (hashCode3 + (bool3 != null ? Boolean.hashCode(bool3.booleanValue()) : 0)) * 37;
        Boolean bool4 = this.is_location_simulated_by_software;
        int hashCode5 = (hashCode4 + (bool4 != null ? Boolean.hashCode(bool4.booleanValue()) : 0)) * 37;
        Boolean bool5 = this.is_phone_call_active;
        int hashCode6 = (hashCode5 + (bool5 != null ? Boolean.hashCode(bool5.booleanValue()) : 0)) * 37;
        Boolean bool6 = this.is_vpn_connected;
        int hashCode7 = hashCode6 + (bool6 != null ? Boolean.hashCode(bool6.booleanValue()) : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Document.Builder builder = new Document.Builder(3, false);
        builder.category = this.is_screen_captured;
        builder.token = this.is_scene_capture_state_active;
        builder.title = this.is_location_produced_by_accessory;
        builder.url = this.is_location_simulated_by_software;
        builder.owner_token = this.is_phone_call_active;
        builder.document_date = this.is_vpn_connected;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.is_screen_captured;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_screen_captured=", bool, arrayList);
        }
        Boolean bool2 = this.is_scene_capture_state_active;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_scene_capture_state_active=", bool2, arrayList);
        }
        Boolean bool3 = this.is_location_produced_by_accessory;
        if (bool3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_location_produced_by_accessory=", bool3, arrayList);
        }
        Boolean bool4 = this.is_location_simulated_by_software;
        if (bool4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_location_simulated_by_software=", bool4, arrayList);
        }
        Boolean bool5 = this.is_phone_call_active;
        if (bool5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_phone_call_active=", bool5, arrayList);
        }
        Boolean bool6 = this.is_vpn_connected;
        if (bool6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_vpn_connected=", bool6, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "IosSignals{", "}", 0, null, null, 56);
    }
}
