package com.withpersona.sdk2.inquiry.steps.ui;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class UiComponentScreen implements Parcelable {
    public static final Parcelable.Creator<UiComponentScreen> CREATOR = new Creator();
    public final List componentConfigs;
    public final List components;
    public final StepStyles.UiStepStyle styles;

    public final class Creator implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            int i = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = CameraState$Type$EnumUnboxingLocalUtility.m(UiComponentScreen.class, parcel, arrayList2, i2, 1);
                }
                arrayList = arrayList2;
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt2);
            while (i != readInt2) {
                i = CameraState$Type$EnumUnboxingLocalUtility.m(UiComponentScreen.class, parcel, arrayList3, i, 1);
            }
            return new UiComponentScreen(arrayList, arrayList3, (StepStyles.UiStepStyle) parcel.readParcelable(UiComponentScreen.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UiComponentScreen[i];
        }
    }

    public UiComponentScreen(List list, List list2, StepStyles.UiStepStyle uiStepStyle) {
        list2.getClass();
        this.components = list;
        this.componentConfigs = list2;
        this.styles = uiStepStyle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UiComponentScreen)) {
            return false;
        }
        UiComponentScreen uiComponentScreen = (UiComponentScreen) obj;
        return Intrinsics.areEqual(this.components, uiComponentScreen.components) && Intrinsics.areEqual(this.componentConfigs, uiComponentScreen.componentConfigs) && Intrinsics.areEqual(this.styles, uiComponentScreen.styles);
    }

    public final Integer getBackgroundColor() {
        StepStyles.StepBackgroundColorStyle backgroundColor;
        StyleElements.SimpleElementColor base;
        StyleElements.SimpleElementColorValue base2;
        StepStyles.UiStepStyle uiStepStyle = this.styles;
        if (uiStepStyle == null || (backgroundColor = uiStepStyle.getBackgroundColor()) == null || (base = backgroundColor.getBase()) == null || (base2 = base.getBase()) == null) {
            return null;
        }
        return base2.getValue();
    }

    public final int hashCode() {
        List list = this.components;
        int m = Recorder$$ExternalSyntheticOutline2.m((list == null ? 0 : list.hashCode()) * 31, 31, this.componentConfigs);
        StepStyles.UiStepStyle uiStepStyle = this.styles;
        return m + (uiStepStyle != null ? uiStepStyle.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = re$$ExternalSyntheticOutline0.m("UiComponentScreen(components=", ", componentConfigs=", ", styles=", this.components, this.componentConfigs);
        m.append(this.styles);
        m.append(")");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        List list = this.components;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator m = SVG$Unit$EnumUnboxingLocalUtility.m(parcel, 1, list);
            while (m.hasNext()) {
                parcel.writeParcelable((Parcelable) m.next(), i);
            }
        }
        Iterator m2 = CameraState$Type$EnumUnboxingLocalUtility.m(this.componentConfigs, parcel);
        while (m2.hasNext()) {
            parcel.writeParcelable((Parcelable) m2.next(), i);
        }
        parcel.writeParcelable(this.styles, i);
    }
}
