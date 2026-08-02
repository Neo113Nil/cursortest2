package com.squareup.protos.cash.aegis.sync_values;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.cash.woodrow.syncvalues.PerformanceDetailsUiFooter;
import com.squareup.protos.franklin.common.GenericNonPaymentRenderData;
import com.squareup.protos.franklin.common.InstantPayRenderData;
import com.squareup.protos.franklin.ui.UiControl;
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
import squareup.cash.savings.SavingsHome;

/* loaded from: classes7.dex */
public final class Text extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Text> CREATOR;
    public final LocalizableString localizable_text;
    public final String text;

    /* loaded from: classes8.dex */
    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public LocalizableString localizable_text;
        public String text;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new Text(this.text, this.localizable_text, buildUnknownFields());
                case 1:
                    return new LockCardWarning(this.text, this.localizable_text, buildUnknownFields());
                case 2:
                    return new PerformanceDetailsUiFooter(this.text, this.localizable_text, buildUnknownFields());
                case 3:
                    return new GenericNonPaymentRenderData.TertiaryLabelSuffix(this.text, this.localizable_text, buildUnknownFields());
                case 4:
                    return new InstantPayRenderData.Paycheck(this.text, this.localizable_text, buildUnknownFields());
                case 5:
                    return new UiControl.TextButton(this.text, this.localizable_text, buildUnknownFields());
                default:
                    return new SavingsHome.ActivitySection(this.text, this.localizable_text, buildUnknownFields());
            }
        }
    }

    static {
        Text$Companion$ADAPTER$1 text$Companion$ADAPTER$1 = new Text$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Text.class), "type.googleapis.com/squareup.cash.aegis.sync_values.Text", Syntax.PROTO_2, null, "squareup/cash/aegis/sync_values/UiFamilyAccount.proto");
        ADAPTER = text$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(text$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Text(String str, LocalizableString localizableString, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.text = str;
        this.localizable_text = localizableString;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Text)) {
            return false;
        }
        Text text = (Text) obj;
        return Intrinsics.areEqual(unknownFields(), text.unknownFields()) && Intrinsics.areEqual(this.text, text.text) && Intrinsics.areEqual(this.localizable_text, text.localizable_text);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.text;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        LocalizableString localizableString = this.localizable_text;
        int hashCode3 = hashCode2 + (localizableString != null ? localizableString.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.text = this.text;
        builder.localizable_text = this.localizable_text;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.text;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "text=", arrayList);
        }
        LocalizableString localizableString = this.localizable_text;
        if (localizableString != null) {
            Matcher$$ExternalSyntheticOutline0.m("localizable_text=", localizableString, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Text{", "}", 0, null, null, 56);
    }
}
