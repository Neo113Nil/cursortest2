package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.SessionStatus;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import xyz.block.protos.genie.Expression;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/franklin/app/InitiateSessionResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lxyz/block/protos/genie/Expression$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class InitiateSessionResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InitiateSessionResponse> CREATOR;
    public final AccountListConfig account_list_config;
    public final String app_attest_challenge;
    public final AppIntroData app_intro_data;
    public final String app_token;
    public final String backup_tag;
    public final List login_feature_flags;
    public final String play_integrity_nonce;
    public final ProfileListConfig profile_list_config;
    public final String safety_net_api_key;
    public final String safety_net_nonce;
    public final SessionStatus session_status;
    public final String session_token;

    static {
        InitiateSessionResponse$Companion$ADAPTER$1 initiateSessionResponse$Companion$ADAPTER$1 = new InitiateSessionResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InitiateSessionResponse.class), "type.googleapis.com/squareup.franklin.app.InitiateSessionResponse", Syntax.PROTO_2, null, "squareup/franklin/app/initiateSession.proto");
        ADAPTER = initiateSessionResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(initiateSessionResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitiateSessionResponse(String str, SessionStatus sessionStatus, String str2, List list, String str3, String str4, String str5, AccountListConfig accountListConfig, AppIntroData appIntroData, String str6, ProfileListConfig profileListConfig, String str7, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.session_token = str;
        this.session_status = sessionStatus;
        this.app_token = str2;
        this.backup_tag = str3;
        this.safety_net_nonce = str4;
        this.safety_net_api_key = str5;
        this.account_list_config = accountListConfig;
        this.app_intro_data = appIntroData;
        this.play_integrity_nonce = str6;
        this.profile_list_config = profileListConfig;
        this.app_attest_challenge = str7;
        this.login_feature_flags = TransactorKt.immutableCopyOf("login_feature_flags", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InitiateSessionResponse)) {
            return false;
        }
        InitiateSessionResponse initiateSessionResponse = (InitiateSessionResponse) obj;
        return Intrinsics.areEqual(unknownFields(), initiateSessionResponse.unknownFields()) && Intrinsics.areEqual(this.session_token, initiateSessionResponse.session_token) && this.session_status == initiateSessionResponse.session_status && Intrinsics.areEqual(this.app_token, initiateSessionResponse.app_token) && Intrinsics.areEqual(this.login_feature_flags, initiateSessionResponse.login_feature_flags) && Intrinsics.areEqual(this.backup_tag, initiateSessionResponse.backup_tag) && Intrinsics.areEqual(this.safety_net_nonce, initiateSessionResponse.safety_net_nonce) && Intrinsics.areEqual(this.safety_net_api_key, initiateSessionResponse.safety_net_api_key) && Intrinsics.areEqual(this.account_list_config, initiateSessionResponse.account_list_config) && Intrinsics.areEqual(this.app_intro_data, initiateSessionResponse.app_intro_data) && Intrinsics.areEqual(this.play_integrity_nonce, initiateSessionResponse.play_integrity_nonce) && Intrinsics.areEqual(this.profile_list_config, initiateSessionResponse.profile_list_config) && Intrinsics.areEqual(this.app_attest_challenge, initiateSessionResponse.app_attest_challenge);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.session_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        SessionStatus sessionStatus = this.session_status;
        int hashCode3 = (hashCode2 + (sessionStatus != null ? sessionStatus.hashCode() : 0)) * 37;
        String str2 = this.app_token;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37, 37, this.login_feature_flags);
        String str3 = this.backup_tag;
        int hashCode4 = (m + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.safety_net_nonce;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.safety_net_api_key;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 37;
        AccountListConfig accountListConfig = this.account_list_config;
        int hashCode7 = (hashCode6 + (accountListConfig != null ? accountListConfig.hashCode() : 0)) * 37;
        AppIntroData appIntroData = this.app_intro_data;
        int hashCode8 = (hashCode7 + (appIntroData != null ? appIntroData.hashCode() : 0)) * 37;
        String str6 = this.play_integrity_nonce;
        int hashCode9 = (hashCode8 + (str6 != null ? str6.hashCode() : 0)) * 37;
        ProfileListConfig profileListConfig = this.profile_list_config;
        int hashCode10 = (hashCode9 + (profileListConfig != null ? profileListConfig.hashCode() : 0)) * 37;
        String str7 = this.app_attest_challenge;
        int hashCode11 = hashCode10 + (str7 != null ? str7.hashCode() : 0);
        this.hashCode = hashCode11;
        return hashCode11;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Expression.Builder builder = new Expression.Builder(19);
        builder.string_literal = this.session_token;
        builder.key_path_ref = this.session_status;
        builder.int_literal = this.app_token;
        builder.float_literal = this.login_feature_flags;
        builder.bool_literal = this.backup_tag;
        builder.blob_literal = this.safety_net_nonce;
        builder.unary_op = this.safety_net_api_key;
        builder.binary_op = this.account_list_config;
        builder.conditional_op = this.app_intro_data;
        builder.filter_op = this.play_integrity_nonce;
        builder.collection_literal = this.profile_list_config;
        builder.format_string_op = this.app_attest_challenge;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.session_token != null) {
            arrayList.add("session_token=██");
        }
        SessionStatus sessionStatus = this.session_status;
        if (sessionStatus != null) {
            arrayList.add("session_status=" + sessionStatus);
        }
        String str = this.app_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "app_token=", arrayList);
        }
        List list = this.login_feature_flags;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("login_feature_flags=", arrayList, list);
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
        AccountListConfig accountListConfig = this.account_list_config;
        if (accountListConfig != null) {
            arrayList.add("account_list_config=" + accountListConfig);
        }
        AppIntroData appIntroData = this.app_intro_data;
        if (appIntroData != null) {
            arrayList.add("app_intro_data=" + appIntroData);
        }
        if (this.play_integrity_nonce != null) {
            arrayList.add("play_integrity_nonce=██");
        }
        ProfileListConfig profileListConfig = this.profile_list_config;
        if (profileListConfig != null) {
            arrayList.add("profile_list_config=" + profileListConfig);
        }
        if (this.app_attest_challenge != null) {
            arrayList.add("app_attest_challenge=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InitiateSessionResponse{", "}", 0, null, null, 56);
    }
}
