package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.moshi.Json;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.steps.ui.components.Option;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import io.noties.markwon.MarkwonImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlowImpl;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003R(\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputFileUploadComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/DisableableComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/HideableComponent;", "Lio/noties/markwon/MarkwonImpl;", "fileUploadController", "Lio/noties/markwon/MarkwonImpl;", "getFileUploadController", "()Lio/noties/markwon/MarkwonImpl;", "setFileUploadController", "(Lio/noties/markwon/MarkwonImpl;)V", "getFileUploadController$annotations", "()V", "ui-step-renderer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class InputFileUploadComponent implements UiComponent, DisableableComponent, HideableComponent {
    public static final Parcelable.Creator<InputFileUploadComponent> CREATOR = new Option.Creator(17);
    public final ArrayList associatedViews;
    public final JsonLogicBoolean disabled;
    public MarkwonImpl fileUploadController;
    public final boolean hasPrefill;
    public final JsonLogicBoolean hidden;
    public final String name;
    public final List selectedFiles;

    public InputFileUploadComponent(String str, List list, boolean z, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2) {
        str.getClass();
        list.getClass();
        this.name = str;
        this.selectedFiles = list;
        this.hasPrefill = z;
        this.hidden = jsonLogicBoolean;
        this.disabled = jsonLogicBoolean2;
        this.associatedViews = new ArrayList();
        this.fileUploadController = new MarkwonImpl(list);
    }

    @Json(ignore = true)
    public static /* synthetic */ void getFileUploadController$annotations() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InputFileUploadComponent)) {
            return false;
        }
        InputFileUploadComponent inputFileUploadComponent = (InputFileUploadComponent) obj;
        return Intrinsics.areEqual(this.name, inputFileUploadComponent.name) && Intrinsics.areEqual(this.selectedFiles, inputFileUploadComponent.selectedFiles) && this.hasPrefill == inputFileUploadComponent.hasPrefill && Intrinsics.areEqual(this.hidden, inputFileUploadComponent.hidden) && Intrinsics.areEqual(this.disabled, inputFileUploadComponent.disabled);
    }

    @Override // com.withpersona.sdk2.inquiry.steps.ui.components.HideableComponent
    public final ArrayList getAssociatedViews() {
        return this.associatedViews;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.ui.components.DisableableComponent
    public final JsonLogicBoolean getDisabled() {
        return this.disabled;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.ui.components.HideableComponent
    public final JsonLogicBoolean getHidden() {
        return this.hidden;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent
    public final String getName() {
        return this.name;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(this.name.hashCode() * 31, 31, this.selectedFiles), 31, this.hasPrefill);
        JsonLogicBoolean jsonLogicBoolean = this.hidden;
        int hashCode = (m + (jsonLogicBoolean == null ? 0 : jsonLogicBoolean.hashCode())) * 31;
        JsonLogicBoolean jsonLogicBoolean2 = this.disabled;
        return hashCode + (jsonLogicBoolean2 != null ? jsonLogicBoolean2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("InputFileUploadComponent(name=", this.name, ", selectedFiles=", ", hasPrefill=", this.selectedFiles);
        m.append(this.hasPrefill);
        m.append(", hidden=");
        m.append(this.hidden);
        m.append(", disabled=");
        m.append(this.disabled);
        m.append(")");
        return m.toString();
    }

    public final InputFileUploadComponent updateFiles(ArrayList arrayList) {
        String str = this.name;
        str.getClass();
        InputFileUploadComponent inputFileUploadComponent = new InputFileUploadComponent(str, arrayList, false, this.hidden, this.disabled);
        MarkwonImpl markwonImpl = this.fileUploadController;
        inputFileUploadComponent.fileUploadController = markwonImpl;
        markwonImpl.getClass();
        StateFlowImpl stateFlowImpl = (StateFlowImpl) markwonImpl.parser;
        stateFlowImpl.getClass();
        stateFlowImpl.updateState(null, arrayList);
        return inputFileUploadComponent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.name);
        Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.selectedFiles, parcel);
        while (m.hasNext()) {
            ((SelectedFile) m.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.hasPrefill ? 1 : 0);
        parcel.writeParcelable(this.hidden, i);
        parcel.writeParcelable(this.disabled, i);
    }
}
