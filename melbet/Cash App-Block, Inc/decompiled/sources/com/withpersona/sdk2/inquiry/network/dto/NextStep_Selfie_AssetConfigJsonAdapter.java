package com.withpersona.sdk2.inquiry.network.dto;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep_Selfie_AssetConfigJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "nullablePromptPageAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig$PromptPage;", "nullableRecordPageAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig$RecordPage;", "constructorRef", "Ljava/lang/reflect/Constructor;", "toString", "", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class NextStep_Selfie_AssetConfigJsonAdapter extends JsonAdapter {
    private volatile Constructor<NextStep.Selfie.AssetConfig> constructorRef;
    private final JsonAdapter nullablePromptPageAdapter;
    private final JsonAdapter nullableRecordPageAdapter;
    private final JsonReader.Options options;

    public NextStep_Selfie_AssetConfigJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("promptPage", "recordPage");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullablePromptPageAdapter = moshi.adapter(NextStep.Selfie.AssetConfig.PromptPage.class, emptySet, "promptPage");
        this.nullableRecordPageAdapter = moshi.adapter(NextStep.Selfie.AssetConfig.RecordPage.class, emptySet, "recordPage");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public NextStep.Selfie.AssetConfig fromJson(JsonReader reader) {
        reader.getClass();
        reader.beginObject();
        NextStep.Selfie.AssetConfig.PromptPage promptPage = null;
        NextStep.Selfie.AssetConfig.RecordPage recordPage = null;
        int i = -1;
        while (reader.hasNext()) {
            int selectName = reader.selectName(this.options);
            if (selectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else if (selectName == 0) {
                promptPage = (NextStep.Selfie.AssetConfig.PromptPage) this.nullablePromptPageAdapter.fromJson(reader);
                i &= -2;
            } else if (selectName == 1) {
                recordPage = (NextStep.Selfie.AssetConfig.RecordPage) this.nullableRecordPageAdapter.fromJson(reader);
                i &= -3;
            }
        }
        reader.endObject();
        if (i == -4) {
            return new NextStep.Selfie.AssetConfig(promptPage, recordPage);
        }
        Constructor<NextStep.Selfie.AssetConfig> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = NextStep.Selfie.AssetConfig.class.getDeclaredConstructor(NextStep.Selfie.AssetConfig.PromptPage.class, NextStep.Selfie.AssetConfig.RecordPage.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
            constructor.getClass();
        }
        NextStep.Selfie.AssetConfig newInstance = constructor.newInstance(promptPage, recordPage, Integer.valueOf(i), null);
        newInstance.getClass();
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, NextStep.Selfie.AssetConfig value_) {
        writer.getClass();
        if (value_ == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        writer.beginObject();
        writer.name("promptPage");
        this.nullablePromptPageAdapter.toJson(writer, value_.getPromptPage());
        writer.name("recordPage");
        this.nullableRecordPageAdapter.toJson(writer, value_.getRecordPage());
        writer.endObject();
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(49, "GeneratedJsonAdapter(NextStep.Selfie.AssetConfig)");
    }
}
