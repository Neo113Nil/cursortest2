package com.squareup.protos.cash.taply.app.v1;

import android.os.Parcelable;
import com.squareup.protos.cash.profiles.ProfileDetails;
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
public final class FidesmoEncryptionData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<FidesmoEncryptionData> CREATOR;
    public final String service_key;

    static {
        FidesmoEncryptionData$Companion$ADAPTER$1 fidesmoEncryptionData$Companion$ADAPTER$1 = new FidesmoEncryptionData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(FidesmoEncryptionData.class), "type.googleapis.com/squareup.cash.taply.app.v1beta1.FidesmoEncryptionData", Syntax.PROTO_2, null, "squareup/cash/taply/app/v1beta1/on_fidesmo_provisioning_start.proto");
        ADAPTER = fidesmoEncryptionData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(fidesmoEncryptionData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FidesmoEncryptionData(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.service_key = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FidesmoEncryptionData)) {
            return false;
        }
        FidesmoEncryptionData fidesmoEncryptionData = (FidesmoEncryptionData) obj;
        return Intrinsics.areEqual(unknownFields(), fidesmoEncryptionData.unknownFields()) && Intrinsics.areEqual(this.service_key, fidesmoEncryptionData.service_key);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.service_key;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ProfileDetails.Builder builder = new ProfileDetails.Builder(27);
        builder.bio = this.service_key;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.service_key != null) {
            arrayList.add("service_key=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "FidesmoEncryptionData{", "}", 0, null, null, 56);
    }
}
