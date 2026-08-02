package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.moshi.JsonClass;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.ui.UiComponentAttributes;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000  2\u00020\u0001:\u0005 !\"#$B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u001a\u001a\u00020\u0011J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0011R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017¨\u0006%"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CreatePersonaSheet;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "name", "", "attributes", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CreatePersonaSheet$Attributes;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CreatePersonaSheet$CreatePersonaSheetStyle;", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CreatePersonaSheet$Attributes;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CreatePersonaSheet$CreatePersonaSheetStyle;)V", "getName", "()Ljava/lang/String;", "getAttributes", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CreatePersonaSheet$Attributes;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CreatePersonaSheet$CreatePersonaSheetStyle;", "backgroundColor", "", "getBackgroundColor", "()Ljava/lang/Integer;", "padding", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;", "getPadding", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;", "borderWidth", "getBorderWidth", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "CreatePersonaSheetStyle", "Attributes", "Pages", "CardCtaPage", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CreatePersonaSheet implements UiComponentConfig {

    /* renamed from: type, reason: collision with root package name */
    public static final String f1483type = "button_create_persona";
    private final Attributes attributes;
    private final String name;
    private final CreatePersonaSheetStyle styles;
    public static final Parcelable.Creator<CreatePersonaSheet> CREATOR = new Creator();

    public CreatePersonaSheet(String str, Attributes attributes, CreatePersonaSheetStyle createPersonaSheetStyle) {
        str.getClass();
        this.name = str;
        this.attributes = attributes;
        this.styles = createPersonaSheetStyle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer getBackgroundColor() {
        AttributeStyles.FooterColorStyle backgroundColor;
        StyleElements.SimpleElementColor base;
        StyleElements.SimpleElementColorValue base2;
        CreatePersonaSheetStyle createPersonaSheetStyle = this.styles;
        if (createPersonaSheetStyle == null || (backgroundColor = createPersonaSheetStyle.getBackgroundColor()) == null || (base = backgroundColor.getBase()) == null || (base2 = base.getBase()) == null) {
            return null;
        }
        return base2.getValue();
    }

    public final StyleElements.SizeSet getBorderWidth() {
        AttributeStyles.FooterBorderWidthStyle borderWidth;
        StyleElements.MeasurementSet base;
        CreatePersonaSheetStyle createPersonaSheetStyle = this.styles;
        if (createPersonaSheetStyle == null || (borderWidth = createPersonaSheetStyle.getBorderWidth()) == null || (base = borderWidth.getBase()) == null) {
            return null;
        }
        return base.getBase();
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig
    public String getName() {
        return this.name;
    }

    public final StyleElements.SizeSet getPadding() {
        AttributeStyles.FooterPaddingStyle padding;
        StyleElements.MeasurementSet base;
        CreatePersonaSheetStyle createPersonaSheetStyle = this.styles;
        if (createPersonaSheetStyle == null || (padding = createPersonaSheetStyle.getPadding()) == null || (base = padding.getBase()) == null) {
            return null;
        }
        return base.getBase();
    }

    public final CreatePersonaSheetStyle getStyles() {
        return this.styles;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.name);
        Attributes attributes = this.attributes;
        if (attributes == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            attributes.writeToParcel(dest, flags);
        }
        CreatePersonaSheetStyle createPersonaSheetStyle = this.styles;
        if (createPersonaSheetStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            createPersonaSheetStyle.writeToParcel(dest, flags);
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0013B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CreatePersonaSheet$CardCtaPage;", "Landroid/os/Parcelable;", "uiStep", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui;", "componentNameMapping", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CreatePersonaSheet$CardCtaPage$ComponentNameMapping;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CreatePersonaSheet$CardCtaPage$ComponentNameMapping;)V", "getUiStep", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui;", "getComponentNameMapping", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CreatePersonaSheet$CardCtaPage$ComponentNameMapping;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ComponentNameMapping", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CardCtaPage implements Parcelable {
        public static final Parcelable.Creator<CardCtaPage> CREATOR = new Creator();
        private final ComponentNameMapping componentNameMapping;
        private final NextStep.Ui uiStep;

        public CardCtaPage(NextStep.Ui ui, ComponentNameMapping componentNameMapping) {
            ui.getClass();
            this.uiStep = ui;
            this.componentNameMapping = componentNameMapping;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final ComponentNameMapping getComponentNameMapping() {
            return this.componentNameMapping;
        }

        public final NextStep.Ui getUiStep() {
            return this.uiStep;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            this.uiStep.writeToParcel(dest, flags);
            ComponentNameMapping componentNameMapping = this.componentNameMapping;
            if (componentNameMapping == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                componentNameMapping.writeToParcel(dest, flags);
            }
        }

        @JsonClass(generateAdapter = true)
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CreatePersonaSheet$CardCtaPage$ComponentNameMapping;", "Landroid/os/Parcelable;", "startButton", "", "dismissButton", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getStartButton", "()Ljava/lang/String;", "getDismissButton", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ComponentNameMapping implements Parcelable {
            public static final Parcelable.Creator<ComponentNameMapping> CREATOR = new Creator();
            private final String dismissButton;
            private final String startButton;

            public /* synthetic */ ComponentNameMapping(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
            }

            public static /* synthetic */ ComponentNameMapping copy$default(ComponentNameMapping componentNameMapping, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = componentNameMapping.startButton;
                }
                if ((i & 2) != 0) {
                    str2 = componentNameMapping.dismissButton;
                }
                return componentNameMapping.copy(str, str2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getStartButton() {
                return this.startButton;
            }

            /* renamed from: component2, reason: from getter */
            public final String getDismissButton() {
                return this.dismissButton;
            }

            public final ComponentNameMapping copy(String startButton, String dismissButton) {
                return new ComponentNameMapping(startButton, dismissButton);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ComponentNameMapping)) {
                    return false;
                }
                ComponentNameMapping componentNameMapping = (ComponentNameMapping) other;
                return Intrinsics.areEqual(this.startButton, componentNameMapping.startButton) && Intrinsics.areEqual(this.dismissButton, componentNameMapping.dismissButton);
            }

            public final String getDismissButton() {
                return this.dismissButton;
            }

            public final String getStartButton() {
                return this.startButton;
            }

            public int hashCode() {
                String str = this.startButton;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.dismissButton;
                return hashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                return Boxes$$ExternalSyntheticOutline1.m("ComponentNameMapping(startButton=", this.startButton, ", dismissButton=", this.dismissButton, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.getClass();
                dest.writeString(this.startButton);
                dest.writeString(this.dismissButton);
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ComponentNameMapping> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ComponentNameMapping createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new ComponentNameMapping(parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ComponentNameMapping[] newArray(int i) {
                    return new ComponentNameMapping[i];
                }
            }

            public ComponentNameMapping(String str, String str2) {
                this.startButton = str;
                this.dismissButton = str2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public ComponentNameMapping() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<CardCtaPage> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CardCtaPage createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new CardCtaPage(NextStep.Ui.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ComponentNameMapping.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CardCtaPage[] newArray(int i) {
                return new CardCtaPage[i];
            }
        }

        public /* synthetic */ CardCtaPage(NextStep.Ui ui, ComponentNameMapping componentNameMapping, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(ui, (i & 2) != 0 ? null : componentNameMapping);
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CreatePersonaSheet$Attributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentAttributes;", "pages", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CreatePersonaSheet$Pages;", "url", "", "autoCompleteOnDismiss", "", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CreatePersonaSheet$Pages;Ljava/lang/String;Ljava/lang/Boolean;)V", "getPages", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CreatePersonaSheet$Pages;", "getUrl", "()Ljava/lang/String;", "getAutoCompleteOnDismiss", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Attributes implements UiComponentAttributes {
        public static final Parcelable.Creator<Attributes> CREATOR = new Creator();
        private final Boolean autoCompleteOnDismiss;
        private final Pages pages;
        private final String url;

        public Attributes(Pages pages, String str, Boolean bool) {
            pages.getClass();
            this.pages = pages;
            this.url = str;
            this.autoCompleteOnDismiss = bool;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final Boolean getAutoCompleteOnDismiss() {
            return this.autoCompleteOnDismiss;
        }

        public final Pages getPages() {
            return this.pages;
        }

        public final String getUrl() {
            return this.url;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            this.pages.writeToParcel(dest, flags);
            dest.writeString(this.url);
            Boolean bool = this.autoCompleteOnDismiss;
            if (bool == null) {
                dest.writeInt(0);
            } else {
                CameraState$Type$EnumUnboxingLocalUtility.m(dest, 1, bool);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Attributes> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Attributes createFromParcel(Parcel parcel) {
                Boolean valueOf;
                parcel.getClass();
                Pages createFromParcel = Pages.CREATOR.createFromParcel(parcel);
                String readString = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Attributes(createFromParcel, readString, valueOf);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Attributes[] newArray(int i) {
                return new Attributes[i];
            }
        }

        public /* synthetic */ Attributes(Pages pages, String str, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(pages, str, (i & 4) != 0 ? null : bool);
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CreatePersonaSheet$CreatePersonaSheetStyle;", "Landroid/os/Parcelable;", "backgroundColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$FooterColorStyle;", "padding", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$FooterPaddingStyle;", "borderWidth", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$FooterBorderWidthStyle;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$FooterColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$FooterPaddingStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$FooterBorderWidthStyle;)V", "getBackgroundColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$FooterColorStyle;", "getPadding", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$FooterPaddingStyle;", "getBorderWidth", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$FooterBorderWidthStyle;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CreatePersonaSheetStyle implements Parcelable {
        public static final Parcelable.Creator<CreatePersonaSheetStyle> CREATOR = new Creator();
        private final AttributeStyles.FooterColorStyle backgroundColor;
        private final AttributeStyles.FooterBorderWidthStyle borderWidth;
        private final AttributeStyles.FooterPaddingStyle padding;

        public CreatePersonaSheetStyle(AttributeStyles.FooterColorStyle footerColorStyle, AttributeStyles.FooterPaddingStyle footerPaddingStyle, AttributeStyles.FooterBorderWidthStyle footerBorderWidthStyle) {
            this.backgroundColor = footerColorStyle;
            this.padding = footerPaddingStyle;
            this.borderWidth = footerBorderWidthStyle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final AttributeStyles.FooterColorStyle getBackgroundColor() {
            return this.backgroundColor;
        }

        public final AttributeStyles.FooterBorderWidthStyle getBorderWidth() {
            return this.borderWidth;
        }

        public final AttributeStyles.FooterPaddingStyle getPadding() {
            return this.padding;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            AttributeStyles.FooterColorStyle footerColorStyle = this.backgroundColor;
            if (footerColorStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                footerColorStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.FooterPaddingStyle footerPaddingStyle = this.padding;
            if (footerPaddingStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                footerPaddingStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.FooterBorderWidthStyle footerBorderWidthStyle = this.borderWidth;
            if (footerBorderWidthStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                footerBorderWidthStyle.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<CreatePersonaSheetStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CreatePersonaSheetStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new CreatePersonaSheetStyle(parcel.readInt() == 0 ? null : AttributeStyles.FooterColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.FooterPaddingStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AttributeStyles.FooterBorderWidthStyle.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CreatePersonaSheetStyle[] newArray(int i) {
                return new CreatePersonaSheetStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CreatePersonaSheet$Pages;", "Landroid/os/Parcelable;", "ctaCard", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CreatePersonaSheet$CardCtaPage;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CreatePersonaSheet$CardCtaPage;)V", "getCtaCard", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CreatePersonaSheet$CardCtaPage;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Pages implements Parcelable {
        public static final Parcelable.Creator<Pages> CREATOR = new Creator();
        private final CardCtaPage ctaCard;

        public Pages(CardCtaPage cardCtaPage) {
            this.ctaCard = cardCtaPage;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final CardCtaPage getCtaCard() {
            return this.ctaCard;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            CardCtaPage cardCtaPage = this.ctaCard;
            if (cardCtaPage == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                cardCtaPage.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Pages> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Pages createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new Pages(parcel.readInt() == 0 ? null : CardCtaPage.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Pages[] newArray(int i) {
                return new Pages[i];
            }
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CreatePersonaSheet> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreatePersonaSheet createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new CreatePersonaSheet(parcel.readString(), parcel.readInt() == 0 ? null : Attributes.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? CreatePersonaSheetStyle.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreatePersonaSheet[] newArray(int i) {
            return new CreatePersonaSheet[i];
        }
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig
    public Attributes getAttributes() {
        return this.attributes;
    }
}
