package com.withpersona.sdk2.inquiry.network.dto;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep_Document_LocalizationsJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Localizations;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "pendingPageAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$PendingPage;", "promptPageAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$PromptPage;", "nullableCancelDialogAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "toString", "", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class NextStep_Document_LocalizationsJsonAdapter extends JsonAdapter {
    private final JsonAdapter nullableCancelDialogAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter pendingPageAdapter;
    private final JsonAdapter promptPageAdapter;

    public NextStep_Document_LocalizationsJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("pendingPage", "promptPage", "cancelDialog");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.pendingPageAdapter = moshi.adapter(NextStep.Document.PendingPage.class, emptySet, "pendingPage");
        this.promptPageAdapter = moshi.adapter(NextStep.Document.PromptPage.class, emptySet, "promptPage");
        this.nullableCancelDialogAdapter = moshi.adapter(NextStep.CancelDialog.class, emptySet, "cancelDialog");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public NextStep.Document.Localizations fromJson(JsonReader reader) {
        reader.getClass();
        reader.beginObject();
        NextStep.Document.PendingPage pendingPage = null;
        NextStep.Document.PromptPage promptPage = null;
        NextStep.CancelDialog cancelDialog = null;
        while (reader.hasNext()) {
            int selectName = reader.selectName(this.options);
            if (selectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else if (selectName == 0) {
                pendingPage = (NextStep.Document.PendingPage) this.pendingPageAdapter.fromJson(reader);
                if (pendingPage == null) {
                    throw Util.unexpectedNull("pendingPage", "pendingPage", reader);
                }
            } else if (selectName == 1) {
                promptPage = (NextStep.Document.PromptPage) this.promptPageAdapter.fromJson(reader);
                if (promptPage == null) {
                    throw Util.unexpectedNull("promptPage", "promptPage", reader);
                }
            } else if (selectName == 2) {
                cancelDialog = (NextStep.CancelDialog) this.nullableCancelDialogAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (pendingPage == null) {
            throw Util.missingProperty("pendingPage", "pendingPage", reader);
        }
        if (promptPage != null) {
            return new NextStep.Document.Localizations(pendingPage, promptPage, cancelDialog);
        }
        throw Util.missingProperty("promptPage", "promptPage", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, NextStep.Document.Localizations value_) {
        writer.getClass();
        if (value_ == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        writer.beginObject();
        writer.name("pendingPage");
        this.pendingPageAdapter.toJson(writer, value_.getPendingPage());
        writer.name("promptPage");
        this.promptPageAdapter.toJson(writer, value_.getPromptPage());
        writer.name("cancelDialog");
        this.nullableCancelDialogAdapter.toJson(writer, value_.getCancelDialog());
        writer.endObject();
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(53, "GeneratedJsonAdapter(NextStep.Document.Localizations)");
    }
}
