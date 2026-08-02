package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
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
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0010\u000fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0005R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/StaticPickerSource;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/StaticPickerSource$Builder;", "", "prefilled_value", "Ljava/lang/String;", "Lcom/squareup/protos/cash/localization/LocalizedString;", "title", "Lcom/squareup/protos/cash/localization/LocalizedString;", "cta", "amount_field_placeholder_key", "", "Lcom/squareup/protos/cash/kgoose/api/v3/PickerOption;", "options", "Ljava/util/List;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StaticPickerSource extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<StaticPickerSource> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
    public final String amount_field_placeholder_key;

    @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 3, tag = 3)
    public final LocalizedString cta;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.PickerOption#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    public final List<PickerOption> options;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 4)
    public final String prefilled_value;

    @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 2, tag = 2)
    public final LocalizedString title;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\tJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/StaticPickerSource$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/StaticPickerSource;", "<init>", "()V", "options", "", "Lcom/squareup/protos/cash/kgoose/api/v3/PickerOption;", "prefilled_value", "", "title", "Lcom/squareup/protos/cash/localization/LocalizedString;", "cta", "amount_field_placeholder_key", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public String amount_field_placeholder_key;
        public LocalizedString cta;
        public List<PickerOption> options = EmptyList.INSTANCE;
        public String prefilled_value;
        public LocalizedString title;

        public final Builder amount_field_placeholder_key(String amount_field_placeholder_key) {
            this.amount_field_placeholder_key = amount_field_placeholder_key;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public StaticPickerSource build() {
            return new StaticPickerSource(this.options, this.prefilled_value, this.title, this.cta, this.amount_field_placeholder_key, buildUnknownFields());
        }

        public final Builder cta(LocalizedString cta) {
            this.cta = cta;
            return this;
        }

        public final Builder options(List<PickerOption> options) {
            options.getClass();
            TransactorKt.checkElementsNotNull(options);
            this.options = options;
            return this;
        }

        public final Builder prefilled_value(String prefilled_value) {
            this.prefilled_value = prefilled_value;
            return this;
        }

        public final Builder title(LocalizedString title) {
            this.title = title;
            return this;
        }
    }

    static {
        StaticPickerSource$Companion$ADAPTER$1 staticPickerSource$Companion$ADAPTER$1 = new StaticPickerSource$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(StaticPickerSource.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.StaticPickerSource", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/template_card.proto");
        ADAPTER = staticPickerSource$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(staticPickerSource$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StaticPickerSource(List list, String str, LocalizedString localizedString, LocalizedString localizedString2, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.prefilled_value = str;
        this.title = localizedString;
        this.cta = localizedString2;
        this.amount_field_placeholder_key = str2;
        this.options = TransactorKt.immutableCopyOf("options", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StaticPickerSource)) {
            return false;
        }
        StaticPickerSource staticPickerSource = (StaticPickerSource) obj;
        return Intrinsics.areEqual(unknownFields(), staticPickerSource.unknownFields()) && Intrinsics.areEqual(this.options, staticPickerSource.options) && Intrinsics.areEqual(this.prefilled_value, staticPickerSource.prefilled_value) && Intrinsics.areEqual(this.title, staticPickerSource.title) && Intrinsics.areEqual(this.cta, staticPickerSource.cta) && Intrinsics.areEqual(this.amount_field_placeholder_key, staticPickerSource.amount_field_placeholder_key);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.options);
        String str = this.prefilled_value;
        int hashCode = (m + (str != null ? str.hashCode() : 0)) * 37;
        LocalizedString localizedString = this.title;
        int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        LocalizedString localizedString2 = this.cta;
        int hashCode3 = (hashCode2 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
        String str2 = this.amount_field_placeholder_key;
        int hashCode4 = hashCode3 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.options = this.options;
        builder.prefilled_value = this.prefilled_value;
        builder.title = this.title;
        builder.cta = this.cta;
        builder.amount_field_placeholder_key = this.amount_field_placeholder_key;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.options.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("options=", arrayList, this.options);
        }
        String str = this.prefilled_value;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "prefilled_value=", arrayList);
        }
        LocalizedString localizedString = this.title;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
        }
        LocalizedString localizedString2 = this.cta;
        if (localizedString2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("cta=", localizedString2, arrayList);
        }
        String str2 = this.amount_field_placeholder_key;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "amount_field_placeholder_key=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "StaticPickerSource{", "}", 0, null, null, 56);
    }
}
