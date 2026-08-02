package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashapproxy.api.GetAfterpayCheckoutTokensResponse;
import com.squareup.protos.cash.local.client.v1.TextInputSpec;
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

/* loaded from: classes.dex */
public final class Stamp extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Stamp> CREATOR;
    public final String accessibility_text;
    public final Integer min_scale;
    public final String name;
    public final String svg;

    /* loaded from: classes7.dex */
    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public String accessibility_text;
        public Integer min_scale;
        public String name;
        public String svg;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new Stamp(this.min_scale, this.name, this.accessibility_text, this.svg, buildUnknownFields());
                case 1:
                    return new GetAfterpayCheckoutTokensResponse.CheckoutToken(this.min_scale, this.name, this.accessibility_text, this.svg, buildUnknownFields());
                default:
                    return new TextInputSpec(this.min_scale, this.name, this.accessibility_text, this.svg, buildUnknownFields());
            }
        }
    }

    static {
        Stamp$Companion$ADAPTER$1 stamp$Companion$ADAPTER$1 = new Stamp$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Stamp.class), "type.googleapis.com/squareup.franklin.common.Stamp", Syntax.PROTO_2, null, "squareup/franklin/common/stamp.proto");
        ADAPTER = stamp$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(stamp$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Stamp(Integer num, String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.name = str;
        this.accessibility_text = str2;
        this.svg = str3;
        this.min_scale = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Stamp)) {
            return false;
        }
        Stamp stamp = (Stamp) obj;
        return Intrinsics.areEqual(unknownFields(), stamp.unknownFields()) && Intrinsics.areEqual(this.name, stamp.name) && Intrinsics.areEqual(this.accessibility_text, stamp.accessibility_text) && Intrinsics.areEqual(this.svg, stamp.svg) && Intrinsics.areEqual(this.min_scale, stamp.min_scale);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.name;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.accessibility_text;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.svg;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Integer num = this.min_scale;
        int hashCode5 = hashCode4 + (num != null ? Integer.hashCode(num.intValue()) : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.name = this.name;
        builder.accessibility_text = this.accessibility_text;
        builder.svg = this.svg;
        builder.min_scale = this.min_scale;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.name;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "name=", arrayList);
        }
        if (this.accessibility_text != null) {
            arrayList.add("accessibility_text=██");
        }
        if (this.svg != null) {
            arrayList.add("svg=██");
        }
        Integer num = this.min_scale;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("min_scale=", num, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Stamp{", "}", 0, null, null, 56);
    }

    public /* synthetic */ Stamp(String str, String str2) {
        this(2, str, null, str2, ByteString.EMPTY);
    }
}
