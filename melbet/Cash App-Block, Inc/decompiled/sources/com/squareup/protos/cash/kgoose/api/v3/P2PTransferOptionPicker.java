package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \n2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000b\nR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/P2PTransferOptionPicker;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/P2PTransferOptionPicker$Builder;", "", "prefilled_instrument_token", "Ljava/lang/String;", "token_placeholder_key", "Lcom/squareup/protos/cash/localization/LocalizedString;", "title_template", "Lcom/squareup/protos/cash/localization/LocalizedString;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class P2PTransferOptionPicker extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<P2PTransferOptionPicker> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String prefilled_instrument_token;

    @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 2, tag = 3)
    public final LocalizedString title_template;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String token_placeholder_key;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/P2PTransferOptionPicker$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/P2PTransferOptionPicker;", "<init>", "()V", "prefilled_instrument_token", "", "token_placeholder_key", "title_template", "Lcom/squareup/protos/cash/localization/LocalizedString;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public String prefilled_instrument_token;
        public LocalizedString title_template;
        public String token_placeholder_key;

        @Override // com.squareup.wire.Message.Builder
        public P2PTransferOptionPicker build() {
            return new P2PTransferOptionPicker(this.prefilled_instrument_token, this.token_placeholder_key, this.title_template, buildUnknownFields());
        }

        public final Builder prefilled_instrument_token(String prefilled_instrument_token) {
            this.prefilled_instrument_token = prefilled_instrument_token;
            return this;
        }

        public final Builder title_template(LocalizedString title_template) {
            this.title_template = title_template;
            return this;
        }

        public final Builder token_placeholder_key(String token_placeholder_key) {
            this.token_placeholder_key = token_placeholder_key;
            return this;
        }
    }

    static {
        P2PTransferOptionPicker$Companion$ADAPTER$1 p2PTransferOptionPicker$Companion$ADAPTER$1 = new P2PTransferOptionPicker$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(P2PTransferOptionPicker.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.P2PTransferOptionPicker", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/template_card.proto");
        ADAPTER = p2PTransferOptionPicker$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(p2PTransferOptionPicker$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P2PTransferOptionPicker(String str, String str2, LocalizedString localizedString, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.prefilled_instrument_token = str;
        this.token_placeholder_key = str2;
        this.title_template = localizedString;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof P2PTransferOptionPicker)) {
            return false;
        }
        P2PTransferOptionPicker p2PTransferOptionPicker = (P2PTransferOptionPicker) obj;
        return Intrinsics.areEqual(unknownFields(), p2PTransferOptionPicker.unknownFields()) && Intrinsics.areEqual(this.prefilled_instrument_token, p2PTransferOptionPicker.prefilled_instrument_token) && Intrinsics.areEqual(this.token_placeholder_key, p2PTransferOptionPicker.token_placeholder_key) && Intrinsics.areEqual(this.title_template, p2PTransferOptionPicker.title_template);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.prefilled_instrument_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.token_placeholder_key;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        LocalizedString localizedString = this.title_template;
        int hashCode4 = hashCode3 + (localizedString != null ? localizedString.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.prefilled_instrument_token = this.prefilled_instrument_token;
        builder.token_placeholder_key = this.token_placeholder_key;
        builder.title_template = this.title_template;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.prefilled_instrument_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "prefilled_instrument_token=", arrayList);
        }
        String str2 = this.token_placeholder_key;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "token_placeholder_key=", arrayList);
        }
        LocalizedString localizedString = this.title_template;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("title_template=", localizedString, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "P2PTransferOptionPicker{", "}", 0, null, null, 56);
    }
}
