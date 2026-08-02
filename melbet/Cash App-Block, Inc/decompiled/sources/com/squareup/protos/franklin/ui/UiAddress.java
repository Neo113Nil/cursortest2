package com.squareup.protos.franklin.ui;

import android.os.Parcelable;
import com.squareup.protos.common.location.GlobalAddress;
import com.squareup.protos.franklin.app.SubmitFormRequest;
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
public final class UiAddress extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UiAddress> CREATOR;
    public final GlobalAddress postal_address;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public GlobalAddress postal_address;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new UiAddress(this.postal_address, buildUnknownFields());
                default:
                    return new SubmitFormRequest.ElementResult.AddressResult(this.postal_address, buildUnknownFields());
            }
        }
    }

    static {
        UiAddress$Companion$ADAPTER$1 uiAddress$Companion$ADAPTER$1 = new UiAddress$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UiAddress.class), "type.googleapis.com/squareup.franklin.ui.UiAddress", Syntax.PROTO_2, null, "squareup/franklin/ui/address.proto");
        ADAPTER = uiAddress$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(uiAddress$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UiAddress(GlobalAddress globalAddress, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.postal_address = globalAddress;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UiAddress)) {
            return false;
        }
        UiAddress uiAddress = (UiAddress) obj;
        return Intrinsics.areEqual(unknownFields(), uiAddress.unknownFields()) && Intrinsics.areEqual(this.postal_address, uiAddress.postal_address);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        GlobalAddress globalAddress = this.postal_address;
        int hashCode2 = hashCode + (globalAddress != null ? globalAddress.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.postal_address = this.postal_address;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        GlobalAddress globalAddress = this.postal_address;
        if (globalAddress != null) {
            arrayList.add("postal_address=" + globalAddress);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UiAddress{", "}", 0, null, null, 56);
    }
}
