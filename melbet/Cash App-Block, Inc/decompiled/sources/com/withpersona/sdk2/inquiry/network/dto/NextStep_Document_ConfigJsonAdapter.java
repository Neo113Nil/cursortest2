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

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u001a\u001a\u00020\u000eH\u0016J\u0010\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u001a\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep_Document_ConfigJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Config;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "nullableBooleanAdapter", "", "intAdapter", "", "nullableStringAdapter", "", "startPageAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$StartPage;", "stringAdapter", "localizationsAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Localizations;", "nullablePagesAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages;", "nullableAssetConfigAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig;", "nullablePendingPageTextPositionAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class NextStep_Document_ConfigJsonAdapter extends JsonAdapter {
    private final JsonAdapter intAdapter;
    private final JsonAdapter localizationsAdapter;
    private final JsonAdapter nullableAssetConfigAdapter;
    private final JsonAdapter nullableBooleanAdapter;
    private final JsonAdapter nullablePagesAdapter;
    private final JsonAdapter nullablePendingPageTextPositionAdapter;
    private final JsonAdapter nullableStringAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter startPageAdapter;
    private final JsonAdapter stringAdapter;

    public NextStep_Document_ConfigJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("backStepEnabled", "cancelButtonEnabled", "documentFileLimit", "documentId", "startPage", "fieldKeyDocument", "kind", "localizations", "pages", "assets", "pendingPageTextVerticalPosition");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableBooleanAdapter = moshi.adapter(Boolean.class, emptySet, "backStepEnabled");
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, "documentFileLimit");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "documentId");
        this.startPageAdapter = moshi.adapter(NextStep.Document.StartPage.class, emptySet, "startPage");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "fieldKeyDocument");
        this.localizationsAdapter = moshi.adapter(NextStep.Document.Localizations.class, emptySet, "localizations");
        this.nullablePagesAdapter = moshi.adapter(NextStep.Document.Pages.class, emptySet, "pages");
        this.nullableAssetConfigAdapter = moshi.adapter(NextStep.Document.AssetConfig.class, emptySet, "assets");
        this.nullablePendingPageTextPositionAdapter = moshi.adapter(PendingPageTextPosition.class, emptySet, "pendingPageTextVerticalPosition");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public NextStep.Document.Config fromJson(JsonReader reader) {
        reader.getClass();
        reader.beginObject();
        Integer num = null;
        Boolean bool = null;
        Boolean bool2 = null;
        String str = null;
        NextStep.Document.StartPage startPage = null;
        String str2 = null;
        String str3 = null;
        NextStep.Document.Localizations localizations = null;
        NextStep.Document.Pages pages = null;
        NextStep.Document.AssetConfig assetConfig = null;
        PendingPageTextPosition pendingPageTextPosition = null;
        while (true) {
            Integer num2 = num;
            Boolean bool3 = bool;
            if (!reader.hasNext()) {
                Boolean bool4 = bool2;
                reader.endObject();
                if (num2 == null) {
                    throw Util.missingProperty("documentFileLimit", "documentFileLimit", reader);
                }
                int intValue = num2.intValue();
                if (startPage == null) {
                    throw Util.missingProperty("startPage", "startPage", reader);
                }
                if (str2 == null) {
                    throw Util.missingProperty("fieldKeyDocument", "fieldKeyDocument", reader);
                }
                if (str3 == null) {
                    throw Util.missingProperty("kind", "kind", reader);
                }
                if (localizations != null) {
                    return new NextStep.Document.Config(bool3, bool4, intValue, str, startPage, str2, str3, localizations, pages, assetConfig, pendingPageTextPosition);
                }
                throw Util.missingProperty("localizations", "localizations", reader);
            }
            Boolean bool5 = bool2;
            switch (reader.selectName(this.options)) {
                case -1:
                    reader.skipName();
                    reader.skipValue();
                    num = num2;
                    bool2 = bool5;
                    bool = bool3;
                case 0:
                    bool = (Boolean) this.nullableBooleanAdapter.fromJson(reader);
                    num = num2;
                    bool2 = bool5;
                case 1:
                    bool2 = (Boolean) this.nullableBooleanAdapter.fromJson(reader);
                    num = num2;
                    bool = bool3;
                case 2:
                    num = (Integer) this.intAdapter.fromJson(reader);
                    if (num == null) {
                        throw Util.unexpectedNull("documentFileLimit", "documentFileLimit", reader);
                    }
                    bool2 = bool5;
                    bool = bool3;
                case 3:
                    str = (String) this.nullableStringAdapter.fromJson(reader);
                    num = num2;
                    bool2 = bool5;
                    bool = bool3;
                case 4:
                    startPage = (NextStep.Document.StartPage) this.startPageAdapter.fromJson(reader);
                    if (startPage == null) {
                        throw Util.unexpectedNull("startPage", "startPage", reader);
                    }
                    num = num2;
                    bool2 = bool5;
                    bool = bool3;
                case 5:
                    str2 = (String) this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("fieldKeyDocument", "fieldKeyDocument", reader);
                    }
                    num = num2;
                    bool2 = bool5;
                    bool = bool3;
                case 6:
                    str3 = (String) this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw Util.unexpectedNull("kind", "kind", reader);
                    }
                    num = num2;
                    bool2 = bool5;
                    bool = bool3;
                case 7:
                    localizations = (NextStep.Document.Localizations) this.localizationsAdapter.fromJson(reader);
                    if (localizations == null) {
                        throw Util.unexpectedNull("localizations", "localizations", reader);
                    }
                    num = num2;
                    bool2 = bool5;
                    bool = bool3;
                case 8:
                    pages = (NextStep.Document.Pages) this.nullablePagesAdapter.fromJson(reader);
                    num = num2;
                    bool2 = bool5;
                    bool = bool3;
                case 9:
                    assetConfig = (NextStep.Document.AssetConfig) this.nullableAssetConfigAdapter.fromJson(reader);
                    num = num2;
                    bool2 = bool5;
                    bool = bool3;
                case 10:
                    pendingPageTextPosition = (PendingPageTextPosition) this.nullablePendingPageTextPositionAdapter.fromJson(reader);
                    num = num2;
                    bool2 = bool5;
                    bool = bool3;
                default:
                    num = num2;
                    bool2 = bool5;
                    bool = bool3;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, NextStep.Document.Config value_) {
        writer.getClass();
        if (value_ == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        writer.beginObject();
        writer.name("backStepEnabled");
        this.nullableBooleanAdapter.toJson(writer, value_.getBackStepEnabled());
        writer.name("cancelButtonEnabled");
        this.nullableBooleanAdapter.toJson(writer, value_.getCancelButtonEnabled());
        writer.name("documentFileLimit");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getDocumentFileLimit()));
        writer.name("documentId");
        this.nullableStringAdapter.toJson(writer, value_.getDocumentId());
        writer.name("startPage");
        this.startPageAdapter.toJson(writer, value_.getStartPage());
        writer.name("fieldKeyDocument");
        this.stringAdapter.toJson(writer, value_.getFieldKeyDocument());
        writer.name("kind");
        this.stringAdapter.toJson(writer, value_.getKind());
        writer.name("localizations");
        this.localizationsAdapter.toJson(writer, value_.getLocalizations());
        writer.name("pages");
        this.nullablePagesAdapter.toJson(writer, value_.getPages());
        writer.name("assets");
        this.nullableAssetConfigAdapter.toJson(writer, value_.getAssets());
        writer.name("pendingPageTextVerticalPosition");
        this.nullablePendingPageTextPositionAdapter.toJson(writer, value_.getPendingPageTextVerticalPosition());
        writer.endObject();
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(46, "GeneratedJsonAdapter(NextStep.Document.Config)");
    }
}
