package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import com.squareup.protos.person.Alias;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/squareup/protos/franklin/app/RefreshSessionResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/person/Alias$Builder;", "Builder", "Status", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RefreshSessionResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RefreshSessionResponse> CREATOR;
    public final String app_attest_challenge;
    public final String backup_tag;
    public final String play_integrity_nonce;
    public final String safety_net_api_key;
    public final String safety_net_nonce;
    public final String session_token;
    public final Status status;

    /* loaded from: classes.dex */
    public enum Status implements WireEnum {
        INVALID(0),
        SUCCESS(1);

        public static final RefreshSessionResponse$Status$Companion$ADAPTER$1 ADAPTER;
        public static final ByteString.Companion Companion;
        public final int value;

        static {
            Status status = INVALID;
            Companion = new ByteString.Companion();
            ADAPTER = new RefreshSessionResponse$Status$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Status.class), Syntax.PROTO_2, status);
        }

        Status(int i) {
            this.value = i;
        }

        public static final Status fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return INVALID;
            }
            if (i != 1) {
                return null;
            }
            return SUCCESS;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        RefreshSessionResponse$Companion$ADAPTER$1 refreshSessionResponse$Companion$ADAPTER$1 = new RefreshSessionResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RefreshSessionResponse.class), "type.googleapis.com/squareup.franklin.app.RefreshSessionResponse", Syntax.PROTO_2, null, "squareup/franklin/app/session.proto");
        ADAPTER = refreshSessionResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(refreshSessionResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RefreshSessionResponse(Status status, String str, String str2, String str3, String str4, String str5, String str6, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.status = status;
        this.session_token = str;
        this.backup_tag = str2;
        this.safety_net_nonce = str3;
        this.safety_net_api_key = str4;
        this.play_integrity_nonce = str5;
        this.app_attest_challenge = str6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RefreshSessionResponse)) {
            return false;
        }
        RefreshSessionResponse refreshSessionResponse = (RefreshSessionResponse) obj;
        return Intrinsics.areEqual(unknownFields(), refreshSessionResponse.unknownFields()) && this.status == refreshSessionResponse.status && Intrinsics.areEqual(this.session_token, refreshSessionResponse.session_token) && Intrinsics.areEqual(this.backup_tag, refreshSessionResponse.backup_tag) && Intrinsics.areEqual(this.safety_net_nonce, refreshSessionResponse.safety_net_nonce) && Intrinsics.areEqual(this.safety_net_api_key, refreshSessionResponse.safety_net_api_key) && Intrinsics.areEqual(this.play_integrity_nonce, refreshSessionResponse.play_integrity_nonce) && Intrinsics.areEqual(this.app_attest_challenge, refreshSessionResponse.app_attest_challenge);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Status status = this.status;
        int hashCode2 = (hashCode + (status != null ? status.hashCode() : 0)) * 37;
        String str = this.session_token;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.backup_tag;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.safety_net_nonce;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.safety_net_api_key;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.play_integrity_nonce;
        int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.app_attest_challenge;
        int hashCode8 = hashCode7 + (str6 != null ? str6.hashCode() : 0);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Alias.Builder builder = new Alias.Builder(3, false);
        builder.f1407type = this.status;
        builder.scope = this.session_token;
        builder.value = this.backup_tag;
        builder.first_verified_at_ms = this.safety_net_nonce;
        builder.last_verified_at_ms = this.safety_net_api_key;
        builder.created_at = this.play_integrity_nonce;
        builder.updated_at = this.app_attest_challenge;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Status status = this.status;
        if (status != null) {
            arrayList.add("status=" + status);
        }
        if (this.session_token != null) {
            arrayList.add("session_token=██");
        }
        if (this.backup_tag != null) {
            arrayList.add("backup_tag=██");
        }
        if (this.safety_net_nonce != null) {
            arrayList.add("safety_net_nonce=██");
        }
        if (this.safety_net_api_key != null) {
            arrayList.add("safety_net_api_key=██");
        }
        if (this.play_integrity_nonce != null) {
            arrayList.add("play_integrity_nonce=██");
        }
        if (this.app_attest_challenge != null) {
            arrayList.add("app_attest_challenge=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RefreshSessionResponse{", "}", 0, null, null, 56);
    }
}
