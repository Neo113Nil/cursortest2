package com.squareup.protos.lending;

import android.os.Parcelable;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.plasma.common.ExistingCustomSelectionOption;
import com.squareup.protos.cash.supportal.app.ChatMessage;
import com.squareup.protos.franklin.ui.UiInvitation;
import com.squareup.protos.multipass.service.ClientSessionToken;
import com.squareup.protos.multipass.service.OneTimeKey;
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
public final class Toggle extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Toggle> CREATOR;
    public final ByteString opaque_request_data;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public ByteString opaque_request_data;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new Toggle(this.opaque_request_data, buildUnknownFields());
                case 1:
                    return new ExistingCustomSelectionOption(this.opaque_request_data, buildUnknownFields());
                case 2:
                    return new ChatMessage.SelectTransaction(this.opaque_request_data, buildUnknownFields());
                case 3:
                    return new UiInvitation(this.opaque_request_data, buildUnknownFields());
                case 4:
                    return new ClientSessionToken(this.opaque_request_data, buildUnknownFields());
                default:
                    return new OneTimeKey(this.opaque_request_data, buildUnknownFields());
            }
        }
    }

    static {
        Toggle$Companion$ADAPTER$1 toggle$Companion$ADAPTER$1 = new Toggle$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Toggle.class), "type.googleapis.com/squareup.lending.Toggle", Syntax.PROTO_2, null, "squareup/lending/prepurchase_afterpay_applet_data.proto");
        ADAPTER = toggle$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(toggle$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Toggle(ByteString byteString, ByteString byteString2) {
        super(ADAPTER, byteString2);
        byteString2.getClass();
        this.opaque_request_data = byteString;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Toggle)) {
            return false;
        }
        Toggle toggle = (Toggle) obj;
        return Intrinsics.areEqual(unknownFields(), toggle.unknownFields()) && Intrinsics.areEqual(this.opaque_request_data, toggle.opaque_request_data);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ByteString byteString = this.opaque_request_data;
        int hashCode2 = hashCode + (byteString != null ? byteString.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.opaque_request_data = this.opaque_request_data;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ByteString byteString = this.opaque_request_data;
        if (byteString != null) {
            Request$Priority$EnumUnboxingLocalUtility.m("opaque_request_data=", byteString, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Toggle{", "}", 0, null, null, 56);
    }
}
