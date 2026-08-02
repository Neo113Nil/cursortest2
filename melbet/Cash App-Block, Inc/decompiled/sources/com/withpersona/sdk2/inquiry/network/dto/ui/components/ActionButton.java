package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.JsonClass;
import com.withpersona.sdk2.inquiry.network.dto.ui.BasicButtonAttributes;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonActionComponentStyle;
import kotlin.Metadata;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ActionButton;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Button;", "name", "", "attributes", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/BasicButtonAttributes;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonActionComponentStyle;", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/BasicButtonAttributes;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonActionComponentStyle;)V", "getName", "()Ljava/lang/String;", "getAttributes", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/BasicButtonAttributes;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonActionComponentStyle;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ActionButton implements Button {

    /* renamed from: type, reason: collision with root package name */
    public static final String f1477type = "button_action";
    private final BasicButtonAttributes attributes;
    private final String name;
    private final ButtonActionComponentStyle styles;
    public static final Parcelable.Creator<ActionButton> CREATOR = new Creator();

    public ActionButton(String str, BasicButtonAttributes basicButtonAttributes, ButtonActionComponentStyle buttonActionComponentStyle) {
        str.getClass();
        this.name = str;
        this.attributes = basicButtonAttributes;
        this.styles = buttonActionComponentStyle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig
    public String getName() {
        return this.name;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.name);
        BasicButtonAttributes basicButtonAttributes = this.attributes;
        if (basicButtonAttributes == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            basicButtonAttributes.writeToParcel(dest, flags);
        }
        ButtonActionComponentStyle buttonActionComponentStyle = this.styles;
        if (buttonActionComponentStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            buttonActionComponentStyle.writeToParcel(dest, flags);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ActionButton> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ActionButton createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new ActionButton(parcel.readString(), parcel.readInt() == 0 ? null : BasicButtonAttributes.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ButtonActionComponentStyle.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ActionButton[] newArray(int i) {
            return new ActionButton[i];
        }
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.components.Button
    public ButtonActionComponentStyle getStyles() {
        return this.styles;
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig
    public BasicButtonAttributes getAttributes() {
        return this.attributes;
    }
}
