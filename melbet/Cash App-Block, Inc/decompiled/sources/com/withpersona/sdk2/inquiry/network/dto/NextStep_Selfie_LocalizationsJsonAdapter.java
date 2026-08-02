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

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u001a\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep_Selfie_LocalizationsJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$Localizations;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "promptPageAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$PromptPage;", "capturePageAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CapturePage;", "pendingPageAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$PendingPage;", "nullableCancelDialogAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "nullableCheckPageAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CheckPage;", "toString", "", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class NextStep_Selfie_LocalizationsJsonAdapter extends JsonAdapter {
    private final JsonAdapter capturePageAdapter;
    private final JsonAdapter nullableCancelDialogAdapter;
    private final JsonAdapter nullableCheckPageAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter pendingPageAdapter;
    private final JsonAdapter promptPageAdapter;

    public NextStep_Selfie_LocalizationsJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("promptPage", "capturePage", "pendingPage", "cancelDialog", "checkPage");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.promptPageAdapter = moshi.adapter(NextStep.Selfie.PromptPage.class, emptySet, "promptPage");
        this.capturePageAdapter = moshi.adapter(NextStep.Selfie.CapturePage.class, emptySet, "capturePage");
        this.pendingPageAdapter = moshi.adapter(NextStep.Selfie.PendingPage.class, emptySet, "pendingPage");
        this.nullableCancelDialogAdapter = moshi.adapter(NextStep.CancelDialog.class, emptySet, "cancelDialog");
        this.nullableCheckPageAdapter = moshi.adapter(NextStep.Selfie.CheckPage.class, emptySet, "checkPage");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public NextStep.Selfie.Localizations fromJson(JsonReader reader) {
        reader.getClass();
        reader.beginObject();
        NextStep.Selfie.PromptPage promptPage = null;
        NextStep.Selfie.CapturePage capturePage = null;
        NextStep.Selfie.PendingPage pendingPage = null;
        NextStep.CancelDialog cancelDialog = null;
        NextStep.Selfie.CheckPage checkPage = null;
        while (reader.hasNext()) {
            int selectName = reader.selectName(this.options);
            if (selectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else if (selectName == 0) {
                promptPage = (NextStep.Selfie.PromptPage) this.promptPageAdapter.fromJson(reader);
                if (promptPage == null) {
                    throw Util.unexpectedNull("promptPage", "promptPage", reader);
                }
            } else if (selectName == 1) {
                capturePage = (NextStep.Selfie.CapturePage) this.capturePageAdapter.fromJson(reader);
                if (capturePage == null) {
                    throw Util.unexpectedNull("capturePage", "capturePage", reader);
                }
            } else if (selectName == 2) {
                pendingPage = (NextStep.Selfie.PendingPage) this.pendingPageAdapter.fromJson(reader);
                if (pendingPage == null) {
                    throw Util.unexpectedNull("pendingPage", "pendingPage", reader);
                }
            } else if (selectName == 3) {
                cancelDialog = (NextStep.CancelDialog) this.nullableCancelDialogAdapter.fromJson(reader);
            } else if (selectName == 4) {
                checkPage = (NextStep.Selfie.CheckPage) this.nullableCheckPageAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (promptPage == null) {
            throw Util.missingProperty("promptPage", "promptPage", reader);
        }
        if (capturePage == null) {
            throw Util.missingProperty("capturePage", "capturePage", reader);
        }
        if (pendingPage != null) {
            return new NextStep.Selfie.Localizations(promptPage, capturePage, pendingPage, cancelDialog, checkPage);
        }
        throw Util.missingProperty("pendingPage", "pendingPage", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, NextStep.Selfie.Localizations value_) {
        writer.getClass();
        if (value_ == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        writer.beginObject();
        writer.name("promptPage");
        this.promptPageAdapter.toJson(writer, value_.getPromptPage());
        writer.name("capturePage");
        this.capturePageAdapter.toJson(writer, value_.getCapturePage());
        writer.name("pendingPage");
        this.pendingPageAdapter.toJson(writer, value_.getPendingPage());
        writer.name("cancelDialog");
        this.nullableCancelDialogAdapter.toJson(writer, value_.getCancelDialog());
        writer.name("checkPage");
        this.nullableCheckPageAdapter.toJson(writer, value_.getCheckPage());
        writer.endObject();
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(51, "GeneratedJsonAdapter(NextStep.Selfie.Localizations)");
    }
}
