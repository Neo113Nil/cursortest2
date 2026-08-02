package com.withpersona.sdk2.inquiry.network.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.FromJson;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonClass;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.ToJson;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Tags;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@JsonClass(generateAdapter = false)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bj\u0002\b\u0005j\u0002\b\u0006¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/GpsPrecisionRequirement;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "ROUGH", "PRECISE", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class GpsPrecisionRequirement implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ GpsPrecisionRequirement[] $VALUES;
    public static final Parcelable.Creator<GpsPrecisionRequirement> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final GpsPrecisionRequirement ROUGH = new GpsPrecisionRequirement("ROUGH", 0);
    public static final GpsPrecisionRequirement PRECISE = new GpsPrecisionRequirement("PRECISE", 1);

    private static final /* synthetic */ GpsPrecisionRequirement[] $values() {
        return new GpsPrecisionRequirement[]{ROUGH, PRECISE};
    }

    static {
        GpsPrecisionRequirement[] $values = $values();
        $VALUES = $values;
        $ENTRIES = Tags.enumEntries($values);
        INSTANCE = new Companion(null);
        CREATOR = new Parcelable.Creator<GpsPrecisionRequirement>() { // from class: com.withpersona.sdk2.inquiry.network.dto.GpsPrecisionRequirement.Creator
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GpsPrecisionRequirement createFromParcel(Parcel parcel) {
                parcel.getClass();
                return GpsPrecisionRequirement.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GpsPrecisionRequirement[] newArray(int i) {
                return new GpsPrecisionRequirement[i];
            }
        };
    }

    private GpsPrecisionRequirement(String str, int i) {
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static GpsPrecisionRequirement valueOf(String str) {
        return (GpsPrecisionRequirement) Enum.valueOf(GpsPrecisionRequirement.class, str);
    }

    public static GpsPrecisionRequirement[] values() {
        return (GpsPrecisionRequirement[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(name());
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0017J\u001a\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0017¨\u0006\r"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/GpsPrecisionRequirement$Companion;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/network/dto/GpsPrecisionRequirement;", "<init>", "()V", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion extends JsonAdapter {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.squareup.moshi.JsonAdapter
        @FromJson
        public GpsPrecisionRequirement fromJson(JsonReader reader) {
            reader.getClass();
            return Intrinsics.areEqual(reader.readJsonValue(), "rough") ? GpsPrecisionRequirement.ROUGH : GpsPrecisionRequirement.PRECISE;
        }

        private Companion() {
        }

        @Override // com.squareup.moshi.JsonAdapter
        @ToJson
        public void toJson(JsonWriter writer, GpsPrecisionRequirement value) {
            writer.getClass();
        }
    }
}
