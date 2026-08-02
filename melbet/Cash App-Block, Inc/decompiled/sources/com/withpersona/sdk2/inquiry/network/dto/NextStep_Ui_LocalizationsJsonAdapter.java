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

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep_Ui_LocalizationsJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$Localizations;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "nullablePromptPageAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$PromptPage;", "nullableCancelDialogAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "nullableWebViewPendingPageAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$WebViewPendingPage;", "toString", "", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class NextStep_Ui_LocalizationsJsonAdapter extends JsonAdapter {
    private final JsonAdapter nullableCancelDialogAdapter;
    private final JsonAdapter nullablePromptPageAdapter;
    private final JsonAdapter nullableWebViewPendingPageAdapter;
    private final JsonReader.Options options;

    public NextStep_Ui_LocalizationsJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("promptPage", "cancelDialog", "webviewPage");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullablePromptPageAdapter = moshi.adapter(NextStep.Ui.PromptPage.class, emptySet, "promptPage");
        this.nullableCancelDialogAdapter = moshi.adapter(NextStep.CancelDialog.class, emptySet, "cancelDialog");
        this.nullableWebViewPendingPageAdapter = moshi.adapter(NextStep.WebViewPendingPage.class, emptySet, "webviewPendingPage");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public NextStep.Ui.Localizations fromJson(JsonReader reader) {
        reader.getClass();
        reader.beginObject();
        NextStep.Ui.PromptPage promptPage = null;
        NextStep.CancelDialog cancelDialog = null;
        NextStep.WebViewPendingPage webViewPendingPage = null;
        while (reader.hasNext()) {
            int selectName = reader.selectName(this.options);
            if (selectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else if (selectName == 0) {
                promptPage = (NextStep.Ui.PromptPage) this.nullablePromptPageAdapter.fromJson(reader);
            } else if (selectName == 1) {
                cancelDialog = (NextStep.CancelDialog) this.nullableCancelDialogAdapter.fromJson(reader);
            } else if (selectName == 2) {
                webViewPendingPage = (NextStep.WebViewPendingPage) this.nullableWebViewPendingPageAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        return new NextStep.Ui.Localizations(promptPage, cancelDialog, webViewPendingPage);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, NextStep.Ui.Localizations value_) {
        writer.getClass();
        if (value_ == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        writer.beginObject();
        writer.name("promptPage");
        this.nullablePromptPageAdapter.toJson(writer, value_.getPromptPage());
        writer.name("cancelDialog");
        this.nullableCancelDialogAdapter.toJson(writer, value_.getCancelDialog());
        writer.name("webviewPage");
        this.nullableWebViewPendingPageAdapter.toJson(writer, value_.getWebviewPendingPage());
        writer.endObject();
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(47, "GeneratedJsonAdapter(NextStep.Ui.Localizations)");
    }
}
