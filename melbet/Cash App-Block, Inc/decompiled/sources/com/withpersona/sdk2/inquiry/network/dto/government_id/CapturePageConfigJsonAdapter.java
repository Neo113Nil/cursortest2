package com.withpersona.sdk2.inquiry.network.dto.government_id;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.withpersona.sdk2.inquiry.network.dto.government_id.CapturePageConfig;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0011\u001a\u00020\nH\u0016J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u001a\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfigJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "nullableStringAdapter", "", "nullableManualCaptureConfigAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$ManualCaptureConfig;", "nullableAutoCaptureConfigAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$AutoCaptureConfig;", "nullableOverlayConfigAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$OverlayConfig;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CapturePageConfigJsonAdapter extends JsonAdapter {
    private final JsonAdapter nullableAutoCaptureConfigAdapter;
    private final JsonAdapter nullableManualCaptureConfigAdapter;
    private final JsonAdapter nullableOverlayConfigAdapter;
    private final JsonAdapter nullableStringAdapter;
    private final JsonReader.Options options;

    public CapturePageConfigJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("side", "manualCaptureConfig", "autoCaptureConfig", "overlay");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "side");
        this.nullableManualCaptureConfigAdapter = moshi.adapter(CapturePageConfig.ManualCaptureConfig.class, emptySet, "manualCaptureConfig");
        this.nullableAutoCaptureConfigAdapter = moshi.adapter(CapturePageConfig.AutoCaptureConfig.class, emptySet, "autoCaptureConfig");
        this.nullableOverlayConfigAdapter = moshi.adapter(CapturePageConfig.OverlayConfig.class, emptySet, "overlay");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public CapturePageConfig fromJson(JsonReader reader) {
        reader.getClass();
        reader.beginObject();
        String str = null;
        CapturePageConfig.ManualCaptureConfig manualCaptureConfig = null;
        CapturePageConfig.AutoCaptureConfig autoCaptureConfig = null;
        CapturePageConfig.OverlayConfig overlayConfig = null;
        while (reader.hasNext()) {
            int selectName = reader.selectName(this.options);
            if (selectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else if (selectName == 0) {
                str = (String) this.nullableStringAdapter.fromJson(reader);
            } else if (selectName == 1) {
                manualCaptureConfig = (CapturePageConfig.ManualCaptureConfig) this.nullableManualCaptureConfigAdapter.fromJson(reader);
            } else if (selectName == 2) {
                autoCaptureConfig = (CapturePageConfig.AutoCaptureConfig) this.nullableAutoCaptureConfigAdapter.fromJson(reader);
            } else if (selectName == 3) {
                overlayConfig = (CapturePageConfig.OverlayConfig) this.nullableOverlayConfigAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        return new CapturePageConfig(str, manualCaptureConfig, autoCaptureConfig, overlayConfig);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, CapturePageConfig value_) {
        writer.getClass();
        if (value_ == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        writer.beginObject();
        writer.name("side");
        this.nullableStringAdapter.toJson(writer, value_.getSide());
        writer.name("manualCaptureConfig");
        this.nullableManualCaptureConfigAdapter.toJson(writer, value_.getManualCaptureConfig());
        writer.name("autoCaptureConfig");
        this.nullableAutoCaptureConfigAdapter.toJson(writer, value_.getAutoCaptureConfig());
        writer.name("overlay");
        this.nullableOverlayConfigAdapter.toJson(writer, value_.getOverlay());
        writer.endObject();
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(39, "GeneratedJsonAdapter(CapturePageConfig)");
    }
}
