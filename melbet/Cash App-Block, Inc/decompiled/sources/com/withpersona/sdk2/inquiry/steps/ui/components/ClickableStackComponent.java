package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.moshi.JsonClass;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.ClickableStack;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/ClickableStackComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponentGroup;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/DisableableComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/HideableComponent;", "ui-step-renderer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ClickableStackComponent implements UiComponent, UiComponentGroup, DisableableComponent, HideableComponent {
    public static final Parcelable.Creator<ClickableStackComponent> CREATOR = new Creator();
    public final ArrayList associatedViews;
    public final List children;
    public final JsonLogicBoolean disabled;
    public final JsonLogicBoolean hidden;
    public boolean isActive;
    public final String name;
    public final ClickableStack.ClickableStackComponentStyle styles;

    public final class Creator implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = CameraState$Type$EnumUnboxingLocalUtility.m(ClickableStackComponent.class, parcel, arrayList, i, 1);
            }
            return new ClickableStackComponent(readString, arrayList, (JsonLogicBoolean) parcel.readParcelable(ClickableStackComponent.class.getClassLoader()), (JsonLogicBoolean) parcel.readParcelable(ClickableStackComponent.class.getClassLoader()), (ClickableStack.ClickableStackComponentStyle) parcel.readParcelable(ClickableStackComponent.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ClickableStackComponent[i];
        }
    }

    public ClickableStackComponent(String str, List list, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, ClickableStack.ClickableStackComponentStyle clickableStackComponentStyle, boolean z) {
        str.getClass();
        list.getClass();
        this.name = str;
        this.children = list;
        this.hidden = jsonLogicBoolean;
        this.disabled = jsonLogicBoolean2;
        this.styles = clickableStackComponentStyle;
        this.isActive = z;
        this.associatedViews = new ArrayList();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClickableStackComponent)) {
            return false;
        }
        ClickableStackComponent clickableStackComponent = (ClickableStackComponent) obj;
        return Intrinsics.areEqual(this.name, clickableStackComponent.name) && Intrinsics.areEqual(this.children, clickableStackComponent.children) && Intrinsics.areEqual(this.hidden, clickableStackComponent.hidden) && Intrinsics.areEqual(this.disabled, clickableStackComponent.disabled) && Intrinsics.areEqual(this.styles, clickableStackComponent.styles) && this.isActive == clickableStackComponent.isActive;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.ui.components.HideableComponent
    public final ArrayList getAssociatedViews() {
        return this.associatedViews;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.ui.components.UiComponentGroup
    public final List getChildren() {
        return this.children;
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
        int m = Recorder$$ExternalSyntheticOutline2.m(this.name.hashCode() * 31, 31, this.children);
        JsonLogicBoolean jsonLogicBoolean = this.hidden;
        int hashCode = (m + (jsonLogicBoolean == null ? 0 : jsonLogicBoolean.hashCode())) * 31;
        JsonLogicBoolean jsonLogicBoolean2 = this.disabled;
        int hashCode2 = (hashCode + (jsonLogicBoolean2 == null ? 0 : jsonLogicBoolean2.hashCode())) * 31;
        ClickableStack.ClickableStackComponentStyle clickableStackComponentStyle = this.styles;
        return Boolean.hashCode(this.isActive) + ((hashCode2 + (clickableStackComponentStyle != null ? clickableStackComponentStyle.hashCode() : 0)) * 31);
    }

    public final String toString() {
        boolean z = this.isActive;
        StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("ClickableStackComponent(name=", this.name, ", children=", ", hidden=", this.children);
        m.append(this.hidden);
        m.append(", disabled=");
        m.append(this.disabled);
        m.append(", styles=");
        m.append(this.styles);
        m.append(", isActive=");
        m.append(z);
        m.append(")");
        return m.toString();
    }

    @Override // com.withpersona.sdk2.inquiry.steps.ui.components.UiComponentGroup
    public final UiComponentGroup updateChildren(List list) {
        list.getClass();
        boolean z = this.isActive;
        String str = this.name;
        str.getClass();
        list.getClass();
        return new ClickableStackComponent(str, list, this.hidden, this.disabled, this.styles, z);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.name);
        Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.children, parcel);
        while (m.hasNext()) {
            parcel.writeParcelable((Parcelable) m.next(), i);
        }
        parcel.writeParcelable(this.hidden, i);
        parcel.writeParcelable(this.disabled, i);
        parcel.writeParcelable(this.styles, i);
        parcel.writeInt(this.isActive ? 1 : 0);
    }

    public /* synthetic */ ClickableStackComponent(String str, List list, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, ClickableStack.ClickableStackComponentStyle clickableStackComponentStyle, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, jsonLogicBoolean, jsonLogicBoolean2, clickableStackComponentStyle, (i & 32) != 0 ? false : z);
    }
}
