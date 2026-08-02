package com.squareup.protos.cash.spendinginsights;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.taply.app.v1.Allowed;
import com.squareup.protos.cash.ui.ColoredButton;
import com.squareup.protos.cash.ui.Image;
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

/* loaded from: classes8.dex */
public final class SpendingAnalysisCategory extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SpendingAnalysisCategory> CREATOR;
    public final ColoredButton button;
    public final Image icon;
    public final LocalizedString text;
    public final LocalizedString title;

    static {
        SpendingAnalysisCategory$Companion$ADAPTER$1 spendingAnalysisCategory$Companion$ADAPTER$1 = new SpendingAnalysisCategory$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SpendingAnalysisCategory.class), "type.googleapis.com/squareup.cash.spendinginsights.SpendingAnalysisCategory", Syntax.PROTO_2, null, "squareup/cash/spendinginsights/card_spending_insight.proto");
        ADAPTER = spendingAnalysisCategory$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(spendingAnalysisCategory$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpendingAnalysisCategory(LocalizedString localizedString, LocalizedString localizedString2, Image image, ColoredButton coloredButton, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.title = localizedString;
        this.text = localizedString2;
        this.icon = image;
        this.button = coloredButton;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SpendingAnalysisCategory)) {
            return false;
        }
        SpendingAnalysisCategory spendingAnalysisCategory = (SpendingAnalysisCategory) obj;
        return Intrinsics.areEqual(unknownFields(), spendingAnalysisCategory.unknownFields()) && Intrinsics.areEqual(this.title, spendingAnalysisCategory.title) && Intrinsics.areEqual(this.text, spendingAnalysisCategory.text) && Intrinsics.areEqual(this.icon, spendingAnalysisCategory.icon) && Intrinsics.areEqual(this.button, spendingAnalysisCategory.button);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        LocalizedString localizedString = this.title;
        int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        LocalizedString localizedString2 = this.text;
        int hashCode3 = (hashCode2 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
        Image image = this.icon;
        int hashCode4 = (hashCode3 + (image != null ? image.hashCode() : 0)) * 37;
        ColoredButton coloredButton = this.button;
        int hashCode5 = hashCode4 + (coloredButton != null ? coloredButton.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Allowed.Builder builder = new Allowed.Builder(21);
        builder.card_encryption_data = this.title;
        builder.customer_token_hash_email = this.text;
        builder.device_metadata = this.icon;
        builder.success_screen = this.button;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        LocalizedString localizedString = this.title;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
        }
        LocalizedString localizedString2 = this.text;
        if (localizedString2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("text=", localizedString2, arrayList);
        }
        Image image = this.icon;
        if (image != null) {
            SizeMode$EnumUnboxingLocalUtility.m("icon=", image, arrayList);
        }
        ColoredButton coloredButton = this.button;
        if (coloredButton != null) {
            arrayList.add("button=" + coloredButton);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SpendingAnalysisCategory{", "}", 0, null, null, 56);
    }
}
