package com.squareup.protos.cash.nearby.api.v1;

import android.os.Parcelable;
import com.squareup.protos.cash.postcard.CardModule;
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
public final class NearbySession extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<NearbySession> CREATOR;
    public final BroadcasterProfileData broadcaster_profile_data;
    public final NearbyContext nearby_context;

    static {
        NearbySession$Companion$ADAPTER$1 nearbySession$Companion$ADAPTER$1 = new NearbySession$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(NearbySession.class), "type.googleapis.com/squareup.cash.nearby.api.v1beta1.NearbySession", Syntax.PROTO_2, null, "squareup/cash/nearby/api/v1beta1/nearby_session.proto");
        ADAPTER = nearbySession$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(nearbySession$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NearbySession(NearbyContext nearbyContext, BroadcasterProfileData broadcasterProfileData, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.nearby_context = nearbyContext;
        this.broadcaster_profile_data = broadcasterProfileData;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NearbySession)) {
            return false;
        }
        NearbySession nearbySession = (NearbySession) obj;
        return Intrinsics.areEqual(unknownFields(), nearbySession.unknownFields()) && Intrinsics.areEqual(this.nearby_context, nearbySession.nearby_context) && Intrinsics.areEqual(this.broadcaster_profile_data, nearbySession.broadcaster_profile_data);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        NearbyContext nearbyContext = this.nearby_context;
        int hashCode2 = (hashCode + (nearbyContext != null ? nearbyContext.hashCode() : 0)) * 37;
        BroadcasterProfileData broadcasterProfileData = this.broadcaster_profile_data;
        int hashCode3 = hashCode2 + (broadcasterProfileData != null ? broadcasterProfileData.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        CardModule.Builder builder = new CardModule.Builder(2);
        builder.f1329type = this.nearby_context;
        builder.use_case = this.broadcaster_profile_data;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        NearbyContext nearbyContext = this.nearby_context;
        if (nearbyContext != null) {
            arrayList.add("nearby_context=" + nearbyContext);
        }
        BroadcasterProfileData broadcasterProfileData = this.broadcaster_profile_data;
        if (broadcasterProfileData != null) {
            arrayList.add("broadcaster_profile_data=" + broadcasterProfileData);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "NearbySession{", "}", 0, null, null, 56);
    }
}
