package com.squareup.protos.franklin.ui;

import android.os.Parcelable;
import com.squareup.protos.lending.Toggle;
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
public final class UiInvitation extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UiInvitation> CREATOR;
    public final ByteString hashed_alias;

    static {
        UiInvitation$Companion$ADAPTER$1 uiInvitation$Companion$ADAPTER$1 = new UiInvitation$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UiInvitation.class), "type.googleapis.com/squareup.franklin.ui.UiInvitation", Syntax.PROTO_2, null, "squareup/franklin/ui/invitation.proto");
        ADAPTER = uiInvitation$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(uiInvitation$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UiInvitation(ByteString byteString, ByteString byteString2) {
        super(ADAPTER, byteString2);
        byteString2.getClass();
        this.hashed_alias = byteString;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UiInvitation)) {
            return false;
        }
        UiInvitation uiInvitation = (UiInvitation) obj;
        return Intrinsics.areEqual(unknownFields(), uiInvitation.unknownFields()) && Intrinsics.areEqual(this.hashed_alias, uiInvitation.hashed_alias);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ByteString byteString = this.hashed_alias;
        int hashCode2 = hashCode + (byteString != null ? byteString.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Toggle.Builder builder = new Toggle.Builder(3);
        builder.opaque_request_data = this.hashed_alias;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.hashed_alias != null) {
            arrayList.add("hashed_alias=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UiInvitation{", "}", 0, null, null, 56);
    }
}
