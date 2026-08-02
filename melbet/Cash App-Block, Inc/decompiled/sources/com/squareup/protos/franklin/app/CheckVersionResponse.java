package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/squareup/protos/franklin/app/CheckVersionResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/UiAlias$Builder;", "Builder", "Status", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CheckVersionResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CheckVersionResponse> CREATOR;
    public final String message;
    public final Status status;
    public final String title;

    public enum Status implements WireEnum {
        INVALID(0),
        VERSION_OK(1),
        UPGRADE_SUGGESTED(2),
        UPGRADE_REQUIRED(3);

        public static final CheckVersionResponse$Status$Companion$ADAPTER$1 ADAPTER;
        public static final ByteString.Companion Companion;
        public final int value;

        static {
            Status status = INVALID;
            Companion = new ByteString.Companion();
            ADAPTER = new CheckVersionResponse$Status$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Status.class), Syntax.PROTO_2, status);
        }

        Status(int i) {
            this.value = i;
        }

        public static final Status fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return INVALID;
            }
            if (i == 1) {
                return VERSION_OK;
            }
            if (i == 2) {
                return UPGRADE_SUGGESTED;
            }
            if (i != 3) {
                return null;
            }
            return UPGRADE_REQUIRED;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        CheckVersionResponse$Companion$ADAPTER$1 checkVersionResponse$Companion$ADAPTER$1 = new CheckVersionResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CheckVersionResponse.class), "type.googleapis.com/squareup.franklin.app.CheckVersionResponse", Syntax.PROTO_2, null, "squareup/franklin/app/version.proto");
        ADAPTER = checkVersionResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(checkVersionResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckVersionResponse(Status status, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.status = status;
        this.message = str;
        this.title = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CheckVersionResponse)) {
            return false;
        }
        CheckVersionResponse checkVersionResponse = (CheckVersionResponse) obj;
        return Intrinsics.areEqual(unknownFields(), checkVersionResponse.unknownFields()) && this.status == checkVersionResponse.status && Intrinsics.areEqual(this.message, checkVersionResponse.message) && Intrinsics.areEqual(this.title, checkVersionResponse.title);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Status status = this.status;
        int hashCode2 = (hashCode + (status != null ? status.hashCode() : 0)) * 37;
        String str = this.message;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.title;
        int hashCode4 = hashCode3 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiAlias.Builder builder = new UiAlias.Builder(16);
        builder.f1364type = this.status;
        builder.canonical_text = this.message;
        builder.formatted = this.title;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Status status = this.status;
        if (status != null) {
            arrayList.add("status=" + status);
        }
        String str = this.message;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "message=", arrayList);
        }
        String str2 = this.title;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "title=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CheckVersionResponse{", "}", 0, null, null, 56);
    }
}
