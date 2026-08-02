package com.withpersona.sdk2.inquiry.integration;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.steps.ui.NestedUiStep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class IntegrationPage implements NestedUiStep {
    public static final Parcelable.Creator<IntegrationPage> CREATOR = new Creator();
    public final List componentConfigs;
    public final List components;
    public final String openBrowserButton;
    public final StepStyles.UiStepStyle styles;

    public final class Creator implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            int readInt = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt) {
                i2 = CameraState$Type$EnumUnboxingLocalUtility.m(IntegrationPage.class, parcel, arrayList2, i2, 1);
            }
            StepStyles.UiStepStyle uiStepStyle = (StepStyles.UiStepStyle) parcel.readParcelable(IntegrationPage.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt2);
                while (i != readInt2) {
                    i = CameraState$Type$EnumUnboxingLocalUtility.m(IntegrationPage.class, parcel, arrayList3, i, 1);
                }
                arrayList = arrayList3;
            }
            return new IntegrationPage(arrayList2, uiStepStyle, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new IntegrationPage[i];
        }
    }

    public IntegrationPage(List list, StepStyles.UiStepStyle uiStepStyle, ArrayList arrayList, String str) {
        this.componentConfigs = list;
        this.styles = uiStepStyle;
        this.components = arrayList;
        this.openBrowserButton = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.ui.NestedUiStep
    public final List getComponentConfigs() {
        return this.componentConfigs;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.ui.NestedUiStep
    public final List getComponents() {
        return this.components;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.ui.NestedUiStep
    public final StepStyles.UiStepStyle getStyles() {
        return this.styles;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.componentConfigs, parcel);
        while (m.hasNext()) {
            parcel.writeParcelable((Parcelable) m.next(), i);
        }
        parcel.writeParcelable(this.styles, i);
        List list = this.components;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator m2 = SVG$Unit$EnumUnboxingLocalUtility.m(parcel, 1, list);
            while (m2.hasNext()) {
                parcel.writeParcelable((Parcelable) m2.next(), i);
            }
        }
        parcel.writeString(this.openBrowserButton);
    }
}
