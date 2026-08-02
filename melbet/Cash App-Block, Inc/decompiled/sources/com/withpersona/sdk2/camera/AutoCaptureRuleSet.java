package com.withpersona.sdk2.camera;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.withpersona.sdk2.camera.ExtractedTexts;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class AutoCaptureRuleSet implements Parcelable {
    public static final Parcelable.Creator<AutoCaptureRuleSet> CREATOR = new ExtractedTexts.Creator(6);
    public final List rules;

    public AutoCaptureRuleSet(List list) {
        list.getClass();
        this.rules = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AutoCaptureRuleSet) && Intrinsics.areEqual(this.rules, ((AutoCaptureRuleSet) obj).rules);
    }

    public final int hashCode() {
        return this.rules.hashCode();
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m("AutoCaptureRuleSet(rules=", ")", this.rules);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.rules, parcel);
        while (m.hasNext()) {
            parcel.writeParcelable((Parcelable) m.next(), i);
        }
    }
}
