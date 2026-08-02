package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.ui.UiComponentAttributes;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\u0003\u001a\u0004\b\f\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UnknownComponentConfig;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "<init>", "()V", "name", "", "getName$annotations", "getName", "()Ljava/lang/String;", "attributes", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentAttributes;", "getAttributes$annotations", "getAttributes", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentAttributes;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class UnknownComponentConfig implements UiComponentConfig {
    private static final UiComponentAttributes attributes = null;
    public static final UnknownComponentConfig INSTANCE = new UnknownComponentConfig();
    private static final String name = "unknown";
    public static final Parcelable.Creator<UnknownComponentConfig> CREATOR = new Creator();

    private UnknownComponentConfig() {
    }

    public static /* synthetic */ void getAttributes$annotations() {
    }

    public static /* synthetic */ void getName$annotations() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        return this == other || (other instanceof UnknownComponentConfig);
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig
    public UiComponentAttributes getAttributes() {
        return attributes;
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig
    public String getName() {
        return name;
    }

    public int hashCode() {
        return -83559478;
    }

    public String toString() {
        return "UnknownComponentConfig";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeInt(1);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<UnknownComponentConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UnknownComponentConfig createFromParcel(Parcel parcel) {
            parcel.getClass();
            parcel.readInt();
            return UnknownComponentConfig.INSTANCE;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UnknownComponentConfig[] newArray(int i) {
            return new UnknownComponentConfig[i];
        }
    }
}
