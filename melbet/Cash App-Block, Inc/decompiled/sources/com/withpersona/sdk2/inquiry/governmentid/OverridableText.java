package com.withpersona.sdk2.inquiry.governmentid;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.RawExtraction;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class OverridableText implements Parcelable {
    public static final Parcelable.Creator<OverridableText> CREATOR = new RawExtraction.Creator(4);
    public final Map backingData;

    public OverridableText(Map map) {
        map.getClass();
        this.backingData = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OverridableText) && Intrinsics.areEqual(this.backingData, ((OverridableText) obj).backingData);
    }

    public final String getText(String str, String str2, IdConfig.Side side) {
        side.getClass();
        if (str == null) {
            str = "unpopulated";
        }
        if (Intrinsics.areEqual(str2, "auto-classification") || str2 == null) {
            str2 = "unpopulated";
        }
        String str3 = side.key;
        String m$1 = Boxes$$ExternalSyntheticOutline1.m$1(str, "-", str2, "-", str3);
        Locale locale = Locale.US;
        locale.getClass();
        String lowerCase = m$1.toLowerCase(locale);
        lowerCase.getClass();
        Map map = this.backingData;
        String str4 = (String) map.get(lowerCase);
        if (str4 != null) {
            return str4;
        }
        String lowerCase2 = ("null-" + str2 + "-" + str3).toLowerCase(locale);
        lowerCase2.getClass();
        String str5 = (String) map.get(lowerCase2);
        if (str5 != null) {
            return str5;
        }
        String lowerCase3 = "null-null-".concat(str3).toLowerCase(locale);
        lowerCase3.getClass();
        String str6 = (String) map.get(lowerCase3);
        if (str6 != null) {
            return str6;
        }
        return null;
    }

    public final int hashCode() {
        return this.backingData.hashCode();
    }

    public final String toString() {
        return NavAction$$ExternalSyntheticOutline0.m("OverridableText(backingData=", ")", this.backingData);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        Iterator m = NavAction$$ExternalSyntheticOutline0.m(this.backingData, parcel);
        while (m.hasNext()) {
            Map.Entry entry = (Map.Entry) m.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
