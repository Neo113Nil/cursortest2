package com.withpersona.sdk2.inquiry.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.withpersona.sdk2.inquiry.nfc.MrzKey;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes9.dex */
public final class UiStepSavedStateHelper {
    public final File configFile;
    public final ContextScope coroutineScope;
    public UiStepUiComponentConfig savedData;

    public final class UiStepUiComponentConfig implements Parcelable {
        public static final Parcelable.Creator<UiStepUiComponentConfig> CREATOR = new MrzKey.Creator(22);
        public final String inquiryId;
        public final String sessionToken;
        public final String stepName;
        public final List uiComponentConfig;

        public UiStepUiComponentConfig(String str, String str2, String str3, List list) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            list.getClass();
            this.sessionToken = str;
            this.inquiryId = str2;
            this.stepName = str3;
            this.uiComponentConfig = list;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.sessionToken);
            parcel.writeString(this.inquiryId);
            parcel.writeString(this.stepName);
            Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.uiComponentConfig, parcel);
            while (m.hasNext()) {
                parcel.writeParcelable((Parcelable) m.next(), i);
            }
        }
    }

    public UiStepSavedStateHelper(Context context) {
        context.getClass();
        this.coroutineScope = JobKt.CoroutineScope(Dispatchers.Default.plus(JobKt.SupervisorJob$default()));
        this.configFile = new File(new File(context.getFilesDir(), ".com.withpersona.sdk2.inquiry"), "ui_step_config");
    }
}
