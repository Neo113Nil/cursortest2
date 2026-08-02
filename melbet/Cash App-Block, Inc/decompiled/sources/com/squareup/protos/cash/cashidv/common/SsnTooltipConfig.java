package com.squareup.protos.cash.cashidv.common;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.aliases.Cashtag;
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
public final class SsnTooltipConfig extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SsnTooltipConfig> CREATOR;
    public final String main_text;
    public final String subtext;

    static {
        SsnTooltipConfig$Companion$ADAPTER$1 ssnTooltipConfig$Companion$ADAPTER$1 = new SsnTooltipConfig$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SsnTooltipConfig.class), "type.googleapis.com/squareup.cash.cashidv.common.SsnTooltipConfig", Syntax.PROTO_2, null, "squareup/cash/cashidv/common/IdvRenderConfig.proto");
        ADAPTER = ssnTooltipConfig$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(ssnTooltipConfig$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SsnTooltipConfig(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.main_text = str;
        this.subtext = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SsnTooltipConfig)) {
            return false;
        }
        SsnTooltipConfig ssnTooltipConfig = (SsnTooltipConfig) obj;
        return Intrinsics.areEqual(unknownFields(), ssnTooltipConfig.unknownFields()) && Intrinsics.areEqual(this.main_text, ssnTooltipConfig.main_text) && Intrinsics.areEqual(this.subtext, ssnTooltipConfig.subtext);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.main_text;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.subtext;
        int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Cashtag.Builder builder = new Cashtag.Builder(17);
        builder.prefix = this.main_text;
        builder.name = this.subtext;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.main_text;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "main_text=", arrayList);
        }
        String str2 = this.subtext;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "subtext=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SsnTooltipConfig{", "}", 0, null, null, 56);
    }
}
