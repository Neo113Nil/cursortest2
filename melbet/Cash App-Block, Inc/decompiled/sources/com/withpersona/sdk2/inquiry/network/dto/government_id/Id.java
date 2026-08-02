package com.withpersona.sdk2.inquiry.network.dto.government_id;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonClass;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.adapters.EnumJsonAdapter;
import com.withpersona.sdk2.inquiry.network.dto.government_id.CapturePageConfig;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Tags;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0003'()B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005HÆ\u0003JA\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0013\u0010\u001d\u001a\u00020\u00142\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u001cHÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0015¨\u0006*"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id;", "Landroid/os/Parcelable;", "class", "", "requiresSides", "", "icon", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id$IdIcon;", "capturePageConfigs", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig;", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id$IdIcon;Ljava/util/List;)V", "getClass", "()Ljava/lang/String;", "getRequiresSides", "()Ljava/util/List;", "getIcon", "()Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id$IdIcon;", "getCapturePageConfigs", "isDynamicGovId", "", "()Z", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "IdIcon", "IdLocalIcon", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class Id implements Parcelable {
    private final List<CapturePageConfig> capturePageConfigs;
    private final String class;
    private final IdIcon icon;
    private final List<String> requiresSides;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<Id> CREATOR = new Creator();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @JsonClass(generateAdapter = false)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id$IdLocalIcon;", "", "<init>", "(Ljava/lang/String;I)V", "WORLD", "CARD", "FLAG", "HOUSE", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class IdLocalIcon {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ IdLocalIcon[] $VALUES;

        @Json(name = "world")
        public static final IdLocalIcon WORLD = new IdLocalIcon("WORLD", 0);

        @Json(name = "card")
        public static final IdLocalIcon CARD = new IdLocalIcon("CARD", 1);

        @Json(name = "flag")
        public static final IdLocalIcon FLAG = new IdLocalIcon("FLAG", 2);

        @Json(name = "house")
        public static final IdLocalIcon HOUSE = new IdLocalIcon("HOUSE", 3);

        private static final /* synthetic */ IdLocalIcon[] $values() {
            return new IdLocalIcon[]{WORLD, CARD, FLAG, HOUSE};
        }

        static {
            IdLocalIcon[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
        }

        private IdLocalIcon(String str, int i) {
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static IdLocalIcon valueOf(String str) {
            return (IdLocalIcon) Enum.valueOf(IdLocalIcon.class, str);
        }

        public static IdLocalIcon[] values() {
            return (IdLocalIcon[]) $VALUES.clone();
        }
    }

    public Id(String str, List<String> list, IdIcon idIcon, List<CapturePageConfig> list2) {
        str.getClass();
        list.getClass();
        this.class = str;
        this.requiresSides = list;
        this.icon = idIcon;
        this.capturePageConfigs = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Id copy$default(Id id, String str, List list, IdIcon idIcon, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = id.class;
        }
        if ((i & 2) != 0) {
            list = id.requiresSides;
        }
        if ((i & 4) != 0) {
            idIcon = id.icon;
        }
        if ((i & 8) != 0) {
            list2 = id.capturePageConfigs;
        }
        return id.copy(str, list, idIcon, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getClass() {
        return this.class;
    }

    public final List<String> component2() {
        return this.requiresSides;
    }

    /* renamed from: component3, reason: from getter */
    public final IdIcon getIcon() {
        return this.icon;
    }

    public final List<CapturePageConfig> component4() {
        return this.capturePageConfigs;
    }

    public final Id copy(String r1, List<String> requiresSides, IdIcon icon, List<CapturePageConfig> capturePageConfigs) {
        r1.getClass();
        requiresSides.getClass();
        return new Id(r1, requiresSides, icon, capturePageConfigs);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Id)) {
            return false;
        }
        Id id = (Id) other;
        return Intrinsics.areEqual(this.class, id.class) && Intrinsics.areEqual(this.requiresSides, id.requiresSides) && Intrinsics.areEqual(this.icon, id.icon) && Intrinsics.areEqual(this.capturePageConfigs, id.capturePageConfigs);
    }

    public final List<CapturePageConfig> getCapturePageConfigs() {
        return this.capturePageConfigs;
    }

    public final String getClass() {
        return this.class;
    }

    public final IdIcon getIcon() {
        return this.icon;
    }

    public final List<String> getRequiresSides() {
        return this.requiresSides;
    }

    public int hashCode() {
        int m = Recorder$$ExternalSyntheticOutline2.m(this.class.hashCode() * 31, 31, this.requiresSides);
        IdIcon idIcon = this.icon;
        int hashCode = (m + (idIcon == null ? 0 : idIcon.hashCode())) * 31;
        List<CapturePageConfig> list = this.capturePageConfigs;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final boolean isDynamicGovId() {
        return this.capturePageConfigs != null;
    }

    public String toString() {
        String str = this.class;
        List<String> list = this.requiresSides;
        IdIcon idIcon = this.icon;
        List<CapturePageConfig> list2 = this.capturePageConfigs;
        StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("Id(class=", str, ", requiresSides=", ", icon=", list);
        m.append(idIcon);
        m.append(", capturePageConfigs=");
        m.append(list2);
        m.append(")");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.class);
        dest.writeStringList(this.requiresSides);
        IdIcon idIcon = this.icon;
        if (idIcon == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            idIcon.writeToParcel(dest, flags);
        }
        List<CapturePageConfig> list = this.capturePageConfigs;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        Iterator m = SVG$Unit$EnumUnboxingLocalUtility.m(dest, 1, list);
        while (m.hasNext()) {
            ((CapturePageConfig) m.next()).writeToParcel(dest, flags);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id$Companion;", "", "<init>", "()V", "createAdapter", "Lcom/squareup/moshi/JsonAdapter$Factory;", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final JsonAdapter createAdapter$lambda$0(Type type2, Set set, Moshi moshi) {
            if (Intrinsics.areEqual(type2, CapturePageConfig.RuleType.class)) {
                new EnumJsonAdapter(CapturePageConfig.RuleType.class, false);
                return new EnumJsonAdapter(CapturePageConfig.RuleType.class, true);
            }
            if (Intrinsics.areEqual(type2, CapturePageConfig.OverlayLocalIcon.class)) {
                new EnumJsonAdapter(CapturePageConfig.OverlayLocalIcon.class, false);
                return new EnumJsonAdapter(CapturePageConfig.OverlayLocalIcon.class, true);
            }
            if (!Intrinsics.areEqual(type2, IdLocalIcon.class)) {
                return null;
            }
            new EnumJsonAdapter(IdLocalIcon.class, false);
            return new EnumJsonAdapter(IdLocalIcon.class, true);
        }

        public final JsonAdapter.Factory createAdapter() {
            return new Id$Companion$$ExternalSyntheticLambda0(0);
        }

        private Companion() {
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id$IdIcon;", "Landroid/os/Parcelable;", "iconFallback", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id$IdLocalIcon;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id$IdLocalIcon;)V", "getIconFallback", "()Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id$IdLocalIcon;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class IdIcon implements Parcelable {
        public static final Parcelable.Creator<IdIcon> CREATOR = new Creator();
        private final IdLocalIcon iconFallback;

        public IdIcon(IdLocalIcon idLocalIcon) {
            this.iconFallback = idLocalIcon;
        }

        public static /* synthetic */ IdIcon copy$default(IdIcon idIcon, IdLocalIcon idLocalIcon, int i, Object obj) {
            if ((i & 1) != 0) {
                idLocalIcon = idIcon.iconFallback;
            }
            return idIcon.copy(idLocalIcon);
        }

        /* renamed from: component1, reason: from getter */
        public final IdLocalIcon getIconFallback() {
            return this.iconFallback;
        }

        public final IdIcon copy(IdLocalIcon iconFallback) {
            return new IdIcon(iconFallback);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof IdIcon) && this.iconFallback == ((IdIcon) other).iconFallback;
        }

        public final IdLocalIcon getIconFallback() {
            return this.iconFallback;
        }

        public int hashCode() {
            IdLocalIcon idLocalIcon = this.iconFallback;
            if (idLocalIcon == null) {
                return 0;
            }
            return idLocalIcon.hashCode();
        }

        public String toString() {
            return "IdIcon(iconFallback=" + this.iconFallback + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            IdLocalIcon idLocalIcon = this.iconFallback;
            if (idLocalIcon == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(idLocalIcon.name());
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<IdIcon> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IdIcon createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new IdIcon(parcel.readInt() == 0 ? null : IdLocalIcon.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IdIcon[] newArray(int i) {
                return new IdIcon[i];
            }
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Id> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Id createFromParcel(Parcel parcel) {
            parcel.getClass();
            String readString = parcel.readString();
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            ArrayList arrayList = null;
            IdIcon createFromParcel = parcel.readInt() == 0 ? null : IdIcon.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = CameraState$Type$EnumUnboxingLocalUtility.m(CapturePageConfig.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new Id(readString, createStringArrayList, createFromParcel, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Id[] newArray(int i) {
            return new Id[i];
        }
    }
}
