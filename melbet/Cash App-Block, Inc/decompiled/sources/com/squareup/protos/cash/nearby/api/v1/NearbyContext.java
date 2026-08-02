package com.squareup.protos.cash.nearby.api.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.groups.SliceStatus;
import com.squareup.protos.cash.postcard.CardModule;
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

/* loaded from: classes7.dex */
public final class NearbyContext extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<NearbyContext> CREATOR;
    public final String context_token;
    public final NearbyIntent intent;

    public enum NearbyIntent implements WireEnum {
        NEARBY_INTENT_UNSPECIFIED(0),
        NEARBY_INTENT_P2P_REQUEST(1),
        NEARBY_INTENT_SHARE_PROFILE(2);

        public static final NearbyContext$NearbyIntent$Companion$ADAPTER$1 ADAPTER;
        public static final SliceStatus.Companion Companion;
        public final int value;

        static {
            NearbyIntent nearbyIntent = NEARBY_INTENT_UNSPECIFIED;
            Companion = new SliceStatus.Companion();
            ADAPTER = new NearbyContext$NearbyIntent$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(NearbyIntent.class), Syntax.PROTO_2, nearbyIntent);
        }

        NearbyIntent(int i) {
            this.value = i;
        }

        public static final NearbyIntent fromValue(int i) {
            Companion.getClass();
            return SliceStatus.Companion.m3877fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        NearbyContext$Companion$ADAPTER$1 nearbyContext$Companion$ADAPTER$1 = new NearbyContext$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(NearbyContext.class), "type.googleapis.com/squareup.cash.nearby.api.v1beta1.NearbyContext", Syntax.PROTO_2, null, "squareup/cash/nearby/api/v1beta1/nearby_session.proto");
        ADAPTER = nearbyContext$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(nearbyContext$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NearbyContext(NearbyIntent nearbyIntent, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.intent = nearbyIntent;
        this.context_token = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NearbyContext)) {
            return false;
        }
        NearbyContext nearbyContext = (NearbyContext) obj;
        return Intrinsics.areEqual(unknownFields(), nearbyContext.unknownFields()) && this.intent == nearbyContext.intent && Intrinsics.areEqual(this.context_token, nearbyContext.context_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        NearbyIntent nearbyIntent = this.intent;
        int hashCode2 = (hashCode + (nearbyIntent != null ? nearbyIntent.hashCode() : 0)) * 37;
        String str = this.context_token;
        int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        CardModule.Builder builder = new CardModule.Builder(1);
        builder.f1329type = this.intent;
        builder.use_case = this.context_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        NearbyIntent nearbyIntent = this.intent;
        if (nearbyIntent != null) {
            arrayList.add("intent=" + nearbyIntent);
        }
        String str = this.context_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "context_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "NearbyContext{", "}", 0, null, null, 56);
    }
}
