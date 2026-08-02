package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.withpersona.sdk2.inquiry.steps.ui.components.Option;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class FooterComponent implements UiComponent, UiComponentGroup {
    public static final Parcelable.Creator<FooterComponent> CREATOR = new Option.Creator(7);
    public final List children;
    public final Integer firstBelowTheFoldChildIndex;
    public final String name;

    public FooterComponent(String str, List list, Integer num) {
        str.getClass();
        list.getClass();
        this.name = str;
        this.children = list;
        this.firstBelowTheFoldChildIndex = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FooterComponent)) {
            return false;
        }
        FooterComponent footerComponent = (FooterComponent) obj;
        return Intrinsics.areEqual(this.name, footerComponent.name) && Intrinsics.areEqual(this.children, footerComponent.children) && Intrinsics.areEqual(this.firstBelowTheFoldChildIndex, footerComponent.firstBelowTheFoldChildIndex);
    }

    @Override // com.withpersona.sdk2.inquiry.steps.ui.components.UiComponentGroup
    public final List getChildren() {
        return this.children;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent
    public final String getName() {
        return this.name;
    }

    public final int hashCode() {
        int m = Recorder$$ExternalSyntheticOutline2.m(this.name.hashCode() * 31, 31, this.children);
        Integer num = this.firstBelowTheFoldChildIndex;
        return m + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return NavAction$$ExternalSyntheticOutline0.m(NavAction$$ExternalSyntheticOutline0.m("FooterComponent(name=", this.name, ", children=", ", firstBelowTheFoldChildIndex=", this.children), this.firstBelowTheFoldChildIndex, ")");
    }

    @Override // com.withpersona.sdk2.inquiry.steps.ui.components.UiComponentGroup
    public final UiComponentGroup updateChildren(List list) {
        list.getClass();
        String str = this.name;
        str.getClass();
        list.getClass();
        return new FooterComponent(str, list, this.firstBelowTheFoldChildIndex);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.name);
        Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.children, parcel);
        while (m.hasNext()) {
            parcel.writeParcelable((Parcelable) m.next(), i);
        }
        Integer num = this.firstBelowTheFoldChildIndex;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            NavAction$$ExternalSyntheticOutline0.m(parcel, 1, num);
        }
    }
}
