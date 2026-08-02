package com.withpersona.sdk2.inquiry.network.dto;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u000f\u001a\u00020\nH\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001a\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep_GovernmentIdJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "", "configAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Config;", "nullableGovernmentIdStepStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class NextStep_GovernmentIdJsonAdapter extends JsonAdapter {
    private final JsonAdapter configAdapter;
    private final JsonAdapter nullableGovernmentIdStepStyleAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter stringAdapter;

    public NextStep_GovernmentIdJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("name", "config", "styles");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "name");
        this.configAdapter = moshi.adapter(NextStep.GovernmentId.Config.class, emptySet, "config");
        this.nullableGovernmentIdStepStyleAdapter = moshi.adapter(StepStyles.GovernmentIdStepStyle.class, emptySet, "styles");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public NextStep.GovernmentId fromJson(JsonReader reader) {
        reader.getClass();
        reader.beginObject();
        String str = null;
        NextStep.GovernmentId.Config config = null;
        StepStyles.GovernmentIdStepStyle governmentIdStepStyle = null;
        while (reader.hasNext()) {
            int selectName = reader.selectName(this.options);
            if (selectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else if (selectName == 0) {
                str = (String) this.stringAdapter.fromJson(reader);
                if (str == null) {
                    throw Util.unexpectedNull("name", "name", reader);
                }
            } else if (selectName == 1) {
                config = (NextStep.GovernmentId.Config) this.configAdapter.fromJson(reader);
                if (config == null) {
                    throw Util.unexpectedNull("config", "config", reader);
                }
            } else if (selectName == 2) {
                governmentIdStepStyle = (StepStyles.GovernmentIdStepStyle) this.nullableGovernmentIdStepStyleAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (str == null) {
            throw Util.missingProperty("name", "name", reader);
        }
        if (config != null) {
            return new NextStep.GovernmentId(str, config, governmentIdStepStyle);
        }
        throw Util.missingProperty("config", "config", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, NextStep.GovernmentId value_) {
        writer.getClass();
        if (value_ == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        writer.beginObject();
        writer.name("name");
        this.stringAdapter.toJson(writer, value_.getName());
        writer.name("config");
        this.configAdapter.toJson(writer, value_.getConfig());
        writer.name("styles");
        this.nullableGovernmentIdStepStyleAdapter.toJson(writer, value_.getStyles());
        writer.endObject();
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(43, "GeneratedJsonAdapter(NextStep.GovernmentId)");
    }
}
