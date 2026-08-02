package com.withpersona.sdk2.inquiry.network.dto;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.government_id.CapturePageConfig;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep_GovernmentId_AutoClassificationConfigJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AutoClassificationConfig;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "nullableBooleanAdapter", "", "nullableCapturePageConfigAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig;", "constructorRef", "Ljava/lang/reflect/Constructor;", "toString", "", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class NextStep_GovernmentId_AutoClassificationConfigJsonAdapter extends JsonAdapter {
    private volatile Constructor<NextStep.GovernmentId.AutoClassificationConfig> constructorRef;
    private final JsonAdapter nullableBooleanAdapter;
    private final JsonAdapter nullableCapturePageConfigAdapter;
    private final JsonReader.Options options;

    public NextStep_GovernmentId_AutoClassificationConfigJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("isEnabled", "extractTextFromImage", "capturePageConfig");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableBooleanAdapter = moshi.adapter(Boolean.class, emptySet, "isEnabled");
        this.nullableCapturePageConfigAdapter = moshi.adapter(CapturePageConfig.class, emptySet, "capturePageConfig");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public NextStep.GovernmentId.AutoClassificationConfig fromJson(JsonReader reader) {
        reader.getClass();
        reader.beginObject();
        Boolean bool = null;
        Boolean bool2 = null;
        CapturePageConfig capturePageConfig = null;
        int i = -1;
        while (reader.hasNext()) {
            int selectName = reader.selectName(this.options);
            if (selectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else if (selectName == 0) {
                bool = (Boolean) this.nullableBooleanAdapter.fromJson(reader);
                i &= -2;
            } else if (selectName == 1) {
                bool2 = (Boolean) this.nullableBooleanAdapter.fromJson(reader);
                i &= -3;
            } else if (selectName == 2) {
                capturePageConfig = (CapturePageConfig) this.nullableCapturePageConfigAdapter.fromJson(reader);
                i &= -5;
            }
        }
        reader.endObject();
        if (i == -8) {
            return new NextStep.GovernmentId.AutoClassificationConfig(bool, bool2, capturePageConfig);
        }
        Constructor<NextStep.GovernmentId.AutoClassificationConfig> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = NextStep.GovernmentId.AutoClassificationConfig.class.getDeclaredConstructor(Boolean.class, Boolean.class, CapturePageConfig.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
            constructor.getClass();
        }
        NextStep.GovernmentId.AutoClassificationConfig newInstance = constructor.newInstance(bool, bool2, capturePageConfig, Integer.valueOf(i), null);
        newInstance.getClass();
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, NextStep.GovernmentId.AutoClassificationConfig value_) {
        writer.getClass();
        if (value_ == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        writer.beginObject();
        writer.name("isEnabled");
        this.nullableBooleanAdapter.toJson(writer, value_.isEnabled());
        writer.name("extractTextFromImage");
        this.nullableBooleanAdapter.toJson(writer, value_.getExtractTextFromImage());
        writer.name("capturePageConfig");
        this.nullableCapturePageConfigAdapter.toJson(writer, value_.getCapturePageConfig());
        writer.endObject();
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(68, "GeneratedJsonAdapter(NextStep.GovernmentId.AutoClassificationConfig)");
    }
}
