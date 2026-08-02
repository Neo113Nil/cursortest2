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

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u001a\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep_GovernmentId_LocalizationsJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Localizations;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "selectPageAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$SelectPage;", "promptPageAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$PromptPage;", "capturePageAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CapturePage;", "checkPageAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CheckPage;", "pendingPageAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$PendingPage;", "requestPageAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$RequestPage;", "reviewUploadPageAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$ReviewUploadPage;", "nullableCancelDialogAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "nullableAutoClassificationPageAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AutoClassificationPage;", "toString", "", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class NextStep_GovernmentId_LocalizationsJsonAdapter extends JsonAdapter {
    private final JsonAdapter capturePageAdapter;
    private final JsonAdapter checkPageAdapter;
    private final JsonAdapter nullableAutoClassificationPageAdapter;
    private final JsonAdapter nullableCancelDialogAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter pendingPageAdapter;
    private final JsonAdapter promptPageAdapter;
    private final JsonAdapter requestPageAdapter;
    private final JsonAdapter reviewUploadPageAdapter;
    private final JsonAdapter selectPageAdapter;

    public NextStep_GovernmentId_LocalizationsJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("selectPage", "promptPage", "capturePage", "checkPage", "pendingPage", "requestPage", "reviewUploadPage", "cancelDialog", "autoClassificationPage");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.selectPageAdapter = moshi.adapter(NextStep.GovernmentId.SelectPage.class, emptySet, "selectPage");
        this.promptPageAdapter = moshi.adapter(NextStep.GovernmentId.PromptPage.class, emptySet, "promptPage");
        this.capturePageAdapter = moshi.adapter(NextStep.GovernmentId.CapturePage.class, emptySet, "capturePage");
        this.checkPageAdapter = moshi.adapter(NextStep.GovernmentId.CheckPage.class, emptySet, "checkPage");
        this.pendingPageAdapter = moshi.adapter(NextStep.GovernmentId.PendingPage.class, emptySet, "pendingPage");
        this.requestPageAdapter = moshi.adapter(NextStep.GovernmentId.RequestPage.class, emptySet, "requestPage");
        this.reviewUploadPageAdapter = moshi.adapter(NextStep.GovernmentId.ReviewUploadPage.class, emptySet, "reviewUploadPage");
        this.nullableCancelDialogAdapter = moshi.adapter(NextStep.CancelDialog.class, emptySet, "cancelDialog");
        this.nullableAutoClassificationPageAdapter = moshi.adapter(NextStep.GovernmentId.AutoClassificationPage.class, emptySet, "autoClassificationPage");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public NextStep.GovernmentId.Localizations fromJson(JsonReader reader) {
        reader.getClass();
        reader.beginObject();
        NextStep.GovernmentId.SelectPage selectPage = null;
        NextStep.GovernmentId.PromptPage promptPage = null;
        NextStep.GovernmentId.CapturePage capturePage = null;
        NextStep.GovernmentId.CheckPage checkPage = null;
        NextStep.GovernmentId.PendingPage pendingPage = null;
        NextStep.GovernmentId.RequestPage requestPage = null;
        NextStep.GovernmentId.ReviewUploadPage reviewUploadPage = null;
        NextStep.CancelDialog cancelDialog = null;
        NextStep.GovernmentId.AutoClassificationPage autoClassificationPage = null;
        while (true) {
            NextStep.GovernmentId.SelectPage selectPage2 = selectPage;
            NextStep.GovernmentId.PromptPage promptPage2 = promptPage;
            if (!reader.hasNext()) {
                NextStep.GovernmentId.CapturePage capturePage2 = capturePage;
                reader.endObject();
                if (selectPage2 == null) {
                    throw Util.missingProperty("selectPage", "selectPage", reader);
                }
                if (promptPage2 == null) {
                    throw Util.missingProperty("promptPage", "promptPage", reader);
                }
                if (capturePage2 == null) {
                    throw Util.missingProperty("capturePage", "capturePage", reader);
                }
                if (checkPage == null) {
                    throw Util.missingProperty("checkPage", "checkPage", reader);
                }
                if (pendingPage == null) {
                    throw Util.missingProperty("pendingPage", "pendingPage", reader);
                }
                if (requestPage == null) {
                    throw Util.missingProperty("requestPage", "requestPage", reader);
                }
                if (reviewUploadPage != null) {
                    return new NextStep.GovernmentId.Localizations(selectPage2, promptPage2, capturePage2, checkPage, pendingPage, requestPage, reviewUploadPage, cancelDialog, autoClassificationPage);
                }
                throw Util.missingProperty("reviewUploadPage", "reviewUploadPage", reader);
            }
            NextStep.GovernmentId.CapturePage capturePage3 = capturePage;
            switch (reader.selectName(this.options)) {
                case -1:
                    reader.skipName();
                    reader.skipValue();
                    capturePage = capturePage3;
                    selectPage = selectPage2;
                    promptPage = promptPage2;
                case 0:
                    selectPage = (NextStep.GovernmentId.SelectPage) this.selectPageAdapter.fromJson(reader);
                    if (selectPage == null) {
                        throw Util.unexpectedNull("selectPage", "selectPage", reader);
                    }
                    capturePage = capturePage3;
                    promptPage = promptPage2;
                case 1:
                    promptPage = (NextStep.GovernmentId.PromptPage) this.promptPageAdapter.fromJson(reader);
                    if (promptPage == null) {
                        throw Util.unexpectedNull("promptPage", "promptPage", reader);
                    }
                    capturePage = capturePage3;
                    selectPage = selectPage2;
                case 2:
                    capturePage = (NextStep.GovernmentId.CapturePage) this.capturePageAdapter.fromJson(reader);
                    if (capturePage == null) {
                        throw Util.unexpectedNull("capturePage", "capturePage", reader);
                    }
                    selectPage = selectPage2;
                    promptPage = promptPage2;
                case 3:
                    checkPage = (NextStep.GovernmentId.CheckPage) this.checkPageAdapter.fromJson(reader);
                    if (checkPage == null) {
                        throw Util.unexpectedNull("checkPage", "checkPage", reader);
                    }
                    capturePage = capturePage3;
                    selectPage = selectPage2;
                    promptPage = promptPage2;
                case 4:
                    pendingPage = (NextStep.GovernmentId.PendingPage) this.pendingPageAdapter.fromJson(reader);
                    if (pendingPage == null) {
                        throw Util.unexpectedNull("pendingPage", "pendingPage", reader);
                    }
                    capturePage = capturePage3;
                    selectPage = selectPage2;
                    promptPage = promptPage2;
                case 5:
                    requestPage = (NextStep.GovernmentId.RequestPage) this.requestPageAdapter.fromJson(reader);
                    if (requestPage == null) {
                        throw Util.unexpectedNull("requestPage", "requestPage", reader);
                    }
                    capturePage = capturePage3;
                    selectPage = selectPage2;
                    promptPage = promptPage2;
                case 6:
                    reviewUploadPage = (NextStep.GovernmentId.ReviewUploadPage) this.reviewUploadPageAdapter.fromJson(reader);
                    if (reviewUploadPage == null) {
                        throw Util.unexpectedNull("reviewUploadPage", "reviewUploadPage", reader);
                    }
                    capturePage = capturePage3;
                    selectPage = selectPage2;
                    promptPage = promptPage2;
                case 7:
                    cancelDialog = (NextStep.CancelDialog) this.nullableCancelDialogAdapter.fromJson(reader);
                    capturePage = capturePage3;
                    selectPage = selectPage2;
                    promptPage = promptPage2;
                case 8:
                    autoClassificationPage = (NextStep.GovernmentId.AutoClassificationPage) this.nullableAutoClassificationPageAdapter.fromJson(reader);
                    capturePage = capturePage3;
                    selectPage = selectPage2;
                    promptPage = promptPage2;
                default:
                    capturePage = capturePage3;
                    selectPage = selectPage2;
                    promptPage = promptPage2;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, NextStep.GovernmentId.Localizations value_) {
        writer.getClass();
        if (value_ == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        writer.beginObject();
        writer.name("selectPage");
        this.selectPageAdapter.toJson(writer, value_.getSelectPage());
        writer.name("promptPage");
        this.promptPageAdapter.toJson(writer, value_.getPromptPage());
        writer.name("capturePage");
        this.capturePageAdapter.toJson(writer, value_.getCapturePage());
        writer.name("checkPage");
        this.checkPageAdapter.toJson(writer, value_.getCheckPage());
        writer.name("pendingPage");
        this.pendingPageAdapter.toJson(writer, value_.getPendingPage());
        writer.name("requestPage");
        this.requestPageAdapter.toJson(writer, value_.getRequestPage());
        writer.name("reviewUploadPage");
        this.reviewUploadPageAdapter.toJson(writer, value_.getReviewUploadPage());
        writer.name("cancelDialog");
        this.nullableCancelDialogAdapter.toJson(writer, value_.getCancelDialog());
        writer.name("autoClassificationPage");
        this.nullableAutoClassificationPageAdapter.toJson(writer, value_.getAutoClassificationPage());
        writer.endObject();
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(57, "GeneratedJsonAdapter(NextStep.GovernmentId.Localizations)");
    }
}
