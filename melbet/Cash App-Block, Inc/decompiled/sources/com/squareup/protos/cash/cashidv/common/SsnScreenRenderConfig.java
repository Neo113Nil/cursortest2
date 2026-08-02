package com.squareup.protos.cash.cashidv.common;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.app.CheckRewardCodeResponse;
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
public final class SsnScreenRenderConfig extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SsnScreenRenderConfig> CREATOR;
    public final String full_9_main_text;
    public final String full_9_subtext;
    public final String last_4_main_text;
    public final Boolean last_4_show_ssa_consent;
    public final String last_4_subtext;

    static {
        SsnScreenRenderConfig$Companion$ADAPTER$1 ssnScreenRenderConfig$Companion$ADAPTER$1 = new SsnScreenRenderConfig$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SsnScreenRenderConfig.class), "type.googleapis.com/squareup.cash.cashidv.common.SsnScreenRenderConfig", Syntax.PROTO_2, null, "squareup/cash/cashidv/common/IdvRenderConfig.proto");
        ADAPTER = ssnScreenRenderConfig$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(ssnScreenRenderConfig$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SsnScreenRenderConfig(String str, String str2, String str3, String str4, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.last_4_main_text = str;
        this.last_4_subtext = str2;
        this.last_4_show_ssa_consent = bool;
        this.full_9_main_text = str3;
        this.full_9_subtext = str4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SsnScreenRenderConfig)) {
            return false;
        }
        SsnScreenRenderConfig ssnScreenRenderConfig = (SsnScreenRenderConfig) obj;
        return Intrinsics.areEqual(unknownFields(), ssnScreenRenderConfig.unknownFields()) && Intrinsics.areEqual(this.last_4_main_text, ssnScreenRenderConfig.last_4_main_text) && Intrinsics.areEqual(this.last_4_subtext, ssnScreenRenderConfig.last_4_subtext) && Intrinsics.areEqual(this.last_4_show_ssa_consent, ssnScreenRenderConfig.last_4_show_ssa_consent) && Intrinsics.areEqual(this.full_9_main_text, ssnScreenRenderConfig.full_9_main_text) && Intrinsics.areEqual(this.full_9_subtext, ssnScreenRenderConfig.full_9_subtext);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.last_4_main_text;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.last_4_subtext;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Boolean bool = this.last_4_show_ssa_consent;
        int hashCode4 = (hashCode3 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        String str3 = this.full_9_main_text;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.full_9_subtext;
        int hashCode6 = hashCode5 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        CheckRewardCodeResponse.Builder builder = new CheckRewardCodeResponse.Builder(1);
        builder.reward_text = this.last_4_main_text;
        builder.inviter_photo_url = this.last_4_subtext;
        builder.valid = this.last_4_show_ssa_consent;
        builder.inviter_full_name = this.full_9_main_text;
        builder.inviter_customer_token = this.full_9_subtext;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.last_4_main_text;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "last_4_main_text=", arrayList);
        }
        String str2 = this.last_4_subtext;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "last_4_subtext=", arrayList);
        }
        Boolean bool = this.last_4_show_ssa_consent;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("last_4_show_ssa_consent=", bool, arrayList);
        }
        String str3 = this.full_9_main_text;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "full_9_main_text=", arrayList);
        }
        String str4 = this.full_9_subtext;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "full_9_subtext=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SsnScreenRenderConfig{", "}", 0, null, null, 56);
    }
}
