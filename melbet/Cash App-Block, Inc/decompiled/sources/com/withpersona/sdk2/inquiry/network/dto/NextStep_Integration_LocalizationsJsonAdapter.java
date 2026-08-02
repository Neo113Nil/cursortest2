package com.withpersona.sdk2.inquiry.network.dto;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep_Integration_LocalizationsJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$Localizations;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "nullableCancelDialogAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "nullablePendingPageAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$PendingPage;", "toString", "", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class NextStep_Integration_LocalizationsJsonAdapter extends JsonAdapter {
    private final JsonAdapter nullableCancelDialogAdapter;
    private final JsonAdapter nullablePendingPageAdapter;
    private final JsonReader.Options options;

    public NextStep_Integration_LocalizationsJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("cancelDialog", "pendingPage");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableCancelDialogAdapter = moshi.adapter(NextStep.CancelDialog.class, emptySet, "cancelDialog");
        this.nullablePendingPageAdapter = moshi.adapter(NextStep.Integration.PendingPage.class, emptySet, "pendingPage");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public NextStep.Integration.Localizations fromJson(JsonReader reader) {
        reader.getClass();
        reader.beginObject();
        NextStep.CancelDialog cancelDialog = null;
        NextStep.Integration.PendingPage pendingPage = null;
        while (reader.hasNext()) {
            int selectName = reader.selectName(this.options);
            if (selectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else if (selectName == 0) {
                cancelDialog = (NextStep.CancelDialog) this.nullableCancelDialogAdapter.fromJson(reader);
            } else if (selectName == 1) {
                pendingPage = (NextStep.Integration.PendingPage) this.nullablePendingPageAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        return new NextStep.Integration.Localizations(cancelDialog, pendingPage);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, NextStep.Integration.Localizations value_) {
        writer.getClass();
        if (value_ == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        writer.beginObject();
        writer.name("cancelDialog");
        this.nullableCancelDialogAdapter.toJson(writer, value_.getCancelDialog());
        writer.name("pendingPage");
        this.nullablePendingPageAdapter.toJson(writer, value_.getPendingPage());
        writer.endObject();
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(56, "GeneratedJsonAdapter(NextStep.Integration.Localizations)");
    }
}
