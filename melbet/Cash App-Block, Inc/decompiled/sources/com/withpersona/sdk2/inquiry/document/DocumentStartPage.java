package com.withpersona.sdk2.inquiry.document;

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
public final class DocumentStartPage implements NestedUiStep {
    public static final Parcelable.Creator<DocumentStartPage> CREATOR = new Creator();
    public final List componentConfigs;
    public final List components;
    public final String launchUploadOptionsButton;
    public final String selectDocumentButton;
    public final String selectPhotoButton;
    public final StepStyles.UiStepStyle styles;
    public final String takePhotoButton;

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
                    i2 = CameraState$Type$EnumUnboxingLocalUtility.m(DocumentStartPage.class, parcel, arrayList2, i2, 1);
                }
                arrayList = arrayList2;
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt2);
            while (i != readInt2) {
                i = CameraState$Type$EnumUnboxingLocalUtility.m(DocumentStartPage.class, parcel, arrayList3, i, 1);
            }
            return new DocumentStartPage(arrayList, arrayList3, (StepStyles.UiStepStyle) parcel.readParcelable(DocumentStartPage.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DocumentStartPage[i];
        }
    }

    public DocumentStartPage(ArrayList arrayList, List list, StepStyles.UiStepStyle uiStepStyle, String str, String str2, String str3, String str4) {
        list.getClass();
        this.components = arrayList;
        this.componentConfigs = list;
        this.styles = uiStepStyle;
        this.selectDocumentButton = str;
        this.selectPhotoButton = str2;
        this.takePhotoButton = str3;
        this.launchUploadOptionsButton = str4;
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
        parcel.writeString(this.selectDocumentButton);
        parcel.writeString(this.selectPhotoButton);
        parcel.writeString(this.takePhotoButton);
        parcel.writeString(this.launchUploadOptionsButton);
    }
}
