package com.squareup.protos.cash.cashface.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cropview.Edge;
import com.squareup.protos.cash.api.ResponseMetadata;
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
public final class ProfileAction extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ProfileAction> CREATOR;
    public final String display_text;
    public final State state;

    public enum State implements WireEnum {
        STATE_UNKNOWN(0),
        STATE_ENABLED(1),
        STATE_DISABLED(2);

        public static final ProfileAction$State$Companion$ADAPTER$1 ADAPTER;
        public static final Edge.Companion Companion;
        public final int value;

        static {
            State state = STATE_UNKNOWN;
            Companion = new Edge.Companion(25);
            ADAPTER = new ProfileAction$State$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(State.class), Syntax.PROTO_2, state);
        }

        State(int i) {
            this.value = i;
        }

        public static final State fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return STATE_UNKNOWN;
            }
            if (i == 1) {
                return STATE_ENABLED;
            }
            if (i != 2) {
                return null;
            }
            return STATE_DISABLED;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        ProfileAction$Companion$ADAPTER$1 profileAction$Companion$ADAPTER$1 = new ProfileAction$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ProfileAction.class), "type.googleapis.com/squareup.cash.cashface.api.ProfileAction", Syntax.PROTO_2, null, "squareup/cash/cashface/api/CommerceProfileData.proto");
        ADAPTER = profileAction$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(profileAction$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileAction(String str, State state, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.display_text = str;
        this.state = state;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProfileAction)) {
            return false;
        }
        ProfileAction profileAction = (ProfileAction) obj;
        return Intrinsics.areEqual(unknownFields(), profileAction.unknownFields()) && Intrinsics.areEqual(this.display_text, profileAction.display_text) && this.state == profileAction.state;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.display_text;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        State state = this.state;
        int hashCode3 = hashCode2 + (state != null ? state.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ResponseMetadata.Builder builder = new ResponseMetadata.Builder(20);
        builder.errors = this.display_text;
        builder.result = this.state;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.display_text;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "display_text=", arrayList);
        }
        State state = this.state;
        if (state != null) {
            arrayList.add("state=" + state);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ProfileAction{", "}", 0, null, null, 56);
    }
}
