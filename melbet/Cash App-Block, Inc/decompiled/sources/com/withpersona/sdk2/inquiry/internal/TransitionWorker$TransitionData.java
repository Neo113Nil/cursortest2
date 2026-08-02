package com.withpersona.sdk2.inquiry.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.withpersona.sdk2.inquiry.nfc.MrzKey;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class TransitionWorker$TransitionData implements Parcelable {
    public static final Parcelable.Creator<TransitionWorker$TransitionData> CREATOR = new MrzKey.Creator(21);
    public final Map componentParams;
    public final UiComponent fromComponent;
    public final String fromStep;

    public TransitionWorker$TransitionData(UiComponent uiComponent, Map map, String str) {
        uiComponent.getClass();
        map.getClass();
        str.getClass();
        this.fromComponent = uiComponent;
        this.componentParams = map;
        this.fromStep = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransitionWorker$TransitionData)) {
            return false;
        }
        TransitionWorker$TransitionData transitionWorker$TransitionData = (TransitionWorker$TransitionData) obj;
        return Intrinsics.areEqual(this.fromComponent, transitionWorker$TransitionData.fromComponent) && Intrinsics.areEqual(this.componentParams, transitionWorker$TransitionData.componentParams) && Intrinsics.areEqual(this.fromStep, transitionWorker$TransitionData.fromStep);
    }

    public final int hashCode() {
        return this.fromStep.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.fromComponent.hashCode() * 31, this.componentParams, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransitionData(fromComponent=");
        sb.append(this.fromComponent);
        sb.append(", componentParams=");
        sb.append(this.componentParams);
        sb.append(", fromStep=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.fromStep, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.fromComponent, i);
        Iterator m = NavAction$$ExternalSyntheticOutline0.m(this.componentParams, parcel);
        while (m.hasNext()) {
            Map.Entry entry = (Map.Entry) m.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeParcelable((Parcelable) entry.getValue(), i);
        }
        parcel.writeString(this.fromStep);
    }
}
