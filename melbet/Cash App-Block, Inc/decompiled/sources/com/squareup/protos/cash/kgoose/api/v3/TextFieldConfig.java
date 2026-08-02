package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
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

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\r\fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/TextFieldConfig;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/TextFieldConfig$Builder;", "", "prefilled_text", "Ljava/lang/String;", "Lcom/squareup/protos/cash/localization/LocalizedString;", "empty_placeholder_text", "Lcom/squareup/protos/cash/localization/LocalizedString;", "", "max_length", "Ljava/lang/Integer;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TextFieldConfig extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<TextFieldConfig> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 1, tag = 1)
    public final LocalizedString empty_placeholder_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 2, tag = 2)
    public final Integer max_length;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 3)
    public final String prefilled_text;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0015\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/TextFieldConfig$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/TextFieldConfig;", "<init>", "()V", "prefilled_text", "", "empty_placeholder_text", "Lcom/squareup/protos/cash/localization/LocalizedString;", "max_length", "", "Ljava/lang/Integer;", "(Ljava/lang/Integer;)Lcom/squareup/protos/cash/kgoose/api/v3/TextFieldConfig$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public LocalizedString empty_placeholder_text;
        public Integer max_length;
        public String prefilled_text;

        @Override // com.squareup.wire.Message.Builder
        public TextFieldConfig build() {
            return new TextFieldConfig(this.prefilled_text, this.empty_placeholder_text, this.max_length, buildUnknownFields());
        }

        public final Builder empty_placeholder_text(LocalizedString empty_placeholder_text) {
            this.empty_placeholder_text = empty_placeholder_text;
            return this;
        }

        public final Builder max_length(Integer max_length) {
            this.max_length = max_length;
            return this;
        }

        public final Builder prefilled_text(String prefilled_text) {
            this.prefilled_text = prefilled_text;
            return this;
        }
    }

    static {
        TextFieldConfig$Companion$ADAPTER$1 textFieldConfig$Companion$ADAPTER$1 = new TextFieldConfig$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TextFieldConfig.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.TextFieldConfig", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/template_card.proto");
        ADAPTER = textFieldConfig$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(textFieldConfig$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldConfig(String str, LocalizedString localizedString, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.prefilled_text = str;
        this.empty_placeholder_text = localizedString;
        this.max_length = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TextFieldConfig)) {
            return false;
        }
        TextFieldConfig textFieldConfig = (TextFieldConfig) obj;
        return Intrinsics.areEqual(unknownFields(), textFieldConfig.unknownFields()) && Intrinsics.areEqual(this.prefilled_text, textFieldConfig.prefilled_text) && Intrinsics.areEqual(this.empty_placeholder_text, textFieldConfig.empty_placeholder_text) && Intrinsics.areEqual(this.max_length, textFieldConfig.max_length);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.prefilled_text;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        LocalizedString localizedString = this.empty_placeholder_text;
        int hashCode3 = (hashCode2 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        Integer num = this.max_length;
        int hashCode4 = hashCode3 + (num != null ? Integer.hashCode(num.intValue()) : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.prefilled_text = this.prefilled_text;
        builder.empty_placeholder_text = this.empty_placeholder_text;
        builder.max_length = this.max_length;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.prefilled_text;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "prefilled_text=", arrayList);
        }
        LocalizedString localizedString = this.empty_placeholder_text;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("empty_placeholder_text=", localizedString, arrayList);
        }
        Integer num = this.max_length;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("max_length=", num, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TextFieldConfig{", "}", 0, null, null, 56);
    }
}
