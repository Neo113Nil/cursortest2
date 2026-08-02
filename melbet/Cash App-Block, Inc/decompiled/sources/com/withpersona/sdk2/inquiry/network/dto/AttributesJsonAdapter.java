package com.withpersona.sdk2.inquiry.network.dto;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0011\u001a\u00020\u000eH\u0016J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u001a\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/AttributesJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/network/dto/Attributes;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "nullableGpsCollectionRequirementAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/GpsCollectionRequirement;", "nullableGpsPrecisionRequirementAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/GpsPrecisionRequirement;", "nullableStringAdapter", "", "constructorRef", "Ljava/lang/reflect/Constructor;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class AttributesJsonAdapter extends JsonAdapter {
    private volatile Constructor<Attributes> constructorRef;
    private final JsonAdapter nullableGpsCollectionRequirementAdapter;
    private final JsonAdapter nullableGpsPrecisionRequirementAdapter;
    private final JsonAdapter nullableStringAdapter;
    private final JsonReader.Options options;

    public AttributesJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("gpsCollectionRequirement", "gpsPrecisionRequirement", "playIntegrityProjectId");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableGpsCollectionRequirementAdapter = moshi.adapter(GpsCollectionRequirement.class, emptySet, "gpsCollectionRequirement");
        this.nullableGpsPrecisionRequirementAdapter = moshi.adapter(GpsPrecisionRequirement.class, emptySet, "gpsPrecisionRequirement");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "playIntegrityProjectId");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public Attributes fromJson(JsonReader reader) {
        reader.getClass();
        reader.beginObject();
        GpsCollectionRequirement gpsCollectionRequirement = null;
        GpsPrecisionRequirement gpsPrecisionRequirement = null;
        String str = null;
        int i = -1;
        while (reader.hasNext()) {
            int selectName = reader.selectName(this.options);
            if (selectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else if (selectName == 0) {
                gpsCollectionRequirement = (GpsCollectionRequirement) this.nullableGpsCollectionRequirementAdapter.fromJson(reader);
                i &= -2;
            } else if (selectName == 1) {
                gpsPrecisionRequirement = (GpsPrecisionRequirement) this.nullableGpsPrecisionRequirementAdapter.fromJson(reader);
                i &= -3;
            } else if (selectName == 2) {
                str = (String) this.nullableStringAdapter.fromJson(reader);
                i &= -5;
            }
        }
        reader.endObject();
        if (i == -8) {
            return new Attributes(gpsCollectionRequirement, gpsPrecisionRequirement, str);
        }
        Constructor<Attributes> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = Attributes.class.getDeclaredConstructor(GpsCollectionRequirement.class, GpsPrecisionRequirement.class, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
            constructor.getClass();
        }
        Attributes newInstance = constructor.newInstance(gpsCollectionRequirement, gpsPrecisionRequirement, str, Integer.valueOf(i), null);
        newInstance.getClass();
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, Attributes value_) {
        writer.getClass();
        if (value_ == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        writer.beginObject();
        writer.name("gpsCollectionRequirement");
        this.nullableGpsCollectionRequirementAdapter.toJson(writer, value_.getGpsCollectionRequirement());
        writer.name("gpsPrecisionRequirement");
        this.nullableGpsPrecisionRequirementAdapter.toJson(writer, value_.getGpsPrecisionRequirement());
        writer.name("playIntegrityProjectId");
        this.nullableStringAdapter.toJson(writer, value_.getPlayIntegrityProjectId());
        writer.endObject();
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(32, "GeneratedJsonAdapter(Attributes)");
    }
}
