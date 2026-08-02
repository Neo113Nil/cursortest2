package com.withpersona.sdk2.inquiry.network.dto;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.FromJson;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonClass;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.ToJson;
import com.squareup.moshi.adapters.PolymorphicJsonAdapterFactory;
import com.withpersona.sdk2.camera.CameraHelper$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.inquiry.network.core.JsonReaderUtilsKt;
import com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError;
import com.withpersona.sdk2.inquiry.network.dto.government_id.CaptureOptionNativeMobile;
import com.withpersona.sdk2.inquiry.network.dto.government_id.CapturePageConfig;
import com.withpersona.sdk2.inquiry.network.dto.government_id.Id;
import com.withpersona.sdk2.inquiry.network.dto.selfie.PoseConfig;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Tags;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \b2\u00020\u0001:\n\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011B\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0007\u0012\u0013\u0014\u0015\u0016\u0017\u0018¨\u0006\u0019"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;", "", "name", "", "<init>", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "Companion", "Unknown", "Ui", "WebViewPendingPage", "GovernmentId", "Selfie", "Document", "Integration", "CancelDialog", "Complete", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Complete;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Unknown;", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class NextStep {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String name;

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0007\u0018\u0019\u001a\u001b\u001c\u001d\u001eB!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0012R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;", "Landroid/os/Parcelable;", "name", "", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "config", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Config;", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Config;)V", "getName", "()Ljava/lang/String;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "getConfig", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Config;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Config", "StartPage", "Localizations", "PromptPage", "PendingPage", "Pages", "AssetConfig", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Document extends NextStep implements Parcelable {
        public static final Parcelable.Creator<Document> CREATOR = new Creator();
        private final Config config;
        private final String name;
        private final StepStyles.DocumentStepStyle styles;

        @JsonClass(generateAdapter = true)
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u0018\u0019\u001aB\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages;", "Landroid/os/Parcelable;", "document", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$DocumentPages;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$DocumentPages;)V", "getDocument", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$DocumentPages;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "DocumentPages", "DocumentStartPage", "UploadOptionsDialog", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Pages implements Parcelable {
            public static final Parcelable.Creator<Pages> CREATOR = new Creator();
            private final DocumentPages document;

            public Pages(DocumentPages documentPages) {
                this.document = documentPages;
            }

            public static /* synthetic */ Pages copy$default(Pages pages, DocumentPages documentPages, int i, Object obj) {
                if ((i & 1) != 0) {
                    documentPages = pages.document;
                }
                return pages.copy(documentPages);
            }

            /* renamed from: component1, reason: from getter */
            public final DocumentPages getDocument() {
                return this.document;
            }

            public final Pages copy(DocumentPages document) {
                return new Pages(document);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Pages) && Intrinsics.areEqual(this.document, ((Pages) other).document);
            }

            public final DocumentPages getDocument() {
                return this.document;
            }

            public int hashCode() {
                DocumentPages documentPages = this.document;
                if (documentPages == null) {
                    return 0;
                }
                return documentPages.hashCode();
            }

            public String toString() {
                return "Pages(document=" + this.document + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.getClass();
                DocumentPages documentPages = this.document;
                if (documentPages == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    documentPages.writeToParcel(dest, flags);
                }
            }

            @JsonClass(generateAdapter = true)
            @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001dB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$DocumentStartPage;", "Landroid/os/Parcelable;", "uiStep", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui;", "componentNameMapping", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$DocumentStartPage$ComponentNameMapping;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$DocumentStartPage$ComponentNameMapping;)V", "getUiStep", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui;", "getComponentNameMapping", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$DocumentStartPage$ComponentNameMapping;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ComponentNameMapping", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class DocumentStartPage implements Parcelable {
                public static final Parcelable.Creator<DocumentStartPage> CREATOR = new Creator();
                private final ComponentNameMapping componentNameMapping;
                private final Ui uiStep;

                public DocumentStartPage(Ui ui, ComponentNameMapping componentNameMapping) {
                    ui.getClass();
                    this.uiStep = ui;
                    this.componentNameMapping = componentNameMapping;
                }

                public static /* synthetic */ DocumentStartPage copy$default(DocumentStartPage documentStartPage, Ui ui, ComponentNameMapping componentNameMapping, int i, Object obj) {
                    if ((i & 1) != 0) {
                        ui = documentStartPage.uiStep;
                    }
                    if ((i & 2) != 0) {
                        componentNameMapping = documentStartPage.componentNameMapping;
                    }
                    return documentStartPage.copy(ui, componentNameMapping);
                }

                /* renamed from: component1, reason: from getter */
                public final Ui getUiStep() {
                    return this.uiStep;
                }

                /* renamed from: component2, reason: from getter */
                public final ComponentNameMapping getComponentNameMapping() {
                    return this.componentNameMapping;
                }

                public final DocumentStartPage copy(Ui uiStep, ComponentNameMapping componentNameMapping) {
                    uiStep.getClass();
                    return new DocumentStartPage(uiStep, componentNameMapping);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof DocumentStartPage)) {
                        return false;
                    }
                    DocumentStartPage documentStartPage = (DocumentStartPage) other;
                    return Intrinsics.areEqual(this.uiStep, documentStartPage.uiStep) && Intrinsics.areEqual(this.componentNameMapping, documentStartPage.componentNameMapping);
                }

                public final ComponentNameMapping getComponentNameMapping() {
                    return this.componentNameMapping;
                }

                public final Ui getUiStep() {
                    return this.uiStep;
                }

                public int hashCode() {
                    int hashCode = this.uiStep.hashCode() * 31;
                    ComponentNameMapping componentNameMapping = this.componentNameMapping;
                    return hashCode + (componentNameMapping == null ? 0 : componentNameMapping.hashCode());
                }

                public String toString() {
                    return "DocumentStartPage(uiStep=" + this.uiStep + ", componentNameMapping=" + this.componentNameMapping + ")";
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
                @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006 "}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$DocumentStartPage$ComponentNameMapping;", "Landroid/os/Parcelable;", "buttonFilePicker", "", "buttonPhotoLibrary", "buttonCamera", "buttonUploadOptions", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getButtonFilePicker", "()Ljava/lang/String;", "getButtonPhotoLibrary", "getButtonCamera", "getButtonUploadOptions", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
                public static final /* data */ class ComponentNameMapping implements Parcelable {
                    public static final Parcelable.Creator<ComponentNameMapping> CREATOR = new Creator();
                    private final String buttonCamera;
                    private final String buttonFilePicker;
                    private final String buttonPhotoLibrary;
                    private final String buttonUploadOptions;

                    public ComponentNameMapping(String str, String str2, String str3, String str4) {
                        this.buttonFilePicker = str;
                        this.buttonPhotoLibrary = str2;
                        this.buttonCamera = str3;
                        this.buttonUploadOptions = str4;
                    }

                    public static /* synthetic */ ComponentNameMapping copy$default(ComponentNameMapping componentNameMapping, String str, String str2, String str3, String str4, int i, Object obj) {
                        if ((i & 1) != 0) {
                            str = componentNameMapping.buttonFilePicker;
                        }
                        if ((i & 2) != 0) {
                            str2 = componentNameMapping.buttonPhotoLibrary;
                        }
                        if ((i & 4) != 0) {
                            str3 = componentNameMapping.buttonCamera;
                        }
                        if ((i & 8) != 0) {
                            str4 = componentNameMapping.buttonUploadOptions;
                        }
                        return componentNameMapping.copy(str, str2, str3, str4);
                    }

                    /* renamed from: component1, reason: from getter */
                    public final String getButtonFilePicker() {
                        return this.buttonFilePicker;
                    }

                    /* renamed from: component2, reason: from getter */
                    public final String getButtonPhotoLibrary() {
                        return this.buttonPhotoLibrary;
                    }

                    /* renamed from: component3, reason: from getter */
                    public final String getButtonCamera() {
                        return this.buttonCamera;
                    }

                    /* renamed from: component4, reason: from getter */
                    public final String getButtonUploadOptions() {
                        return this.buttonUploadOptions;
                    }

                    public final ComponentNameMapping copy(String buttonFilePicker, String buttonPhotoLibrary, String buttonCamera, String buttonUploadOptions) {
                        return new ComponentNameMapping(buttonFilePicker, buttonPhotoLibrary, buttonCamera, buttonUploadOptions);
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
                        return Intrinsics.areEqual(this.buttonFilePicker, componentNameMapping.buttonFilePicker) && Intrinsics.areEqual(this.buttonPhotoLibrary, componentNameMapping.buttonPhotoLibrary) && Intrinsics.areEqual(this.buttonCamera, componentNameMapping.buttonCamera) && Intrinsics.areEqual(this.buttonUploadOptions, componentNameMapping.buttonUploadOptions);
                    }

                    public final String getButtonCamera() {
                        return this.buttonCamera;
                    }

                    public final String getButtonFilePicker() {
                        return this.buttonFilePicker;
                    }

                    public final String getButtonPhotoLibrary() {
                        return this.buttonPhotoLibrary;
                    }

                    public final String getButtonUploadOptions() {
                        return this.buttonUploadOptions;
                    }

                    public int hashCode() {
                        String str = this.buttonFilePicker;
                        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                        String str2 = this.buttonPhotoLibrary;
                        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                        String str3 = this.buttonCamera;
                        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                        String str4 = this.buttonUploadOptions;
                        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
                    }

                    public String toString() {
                        String str = this.buttonFilePicker;
                        String str2 = this.buttonPhotoLibrary;
                        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ComponentNameMapping(buttonFilePicker=", str, ", buttonPhotoLibrary=", str2, ", buttonCamera="), this.buttonCamera, ", buttonUploadOptions=", this.buttonUploadOptions, ")");
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel dest, int flags) {
                        dest.getClass();
                        dest.writeString(this.buttonFilePicker);
                        dest.writeString(this.buttonPhotoLibrary);
                        dest.writeString(this.buttonCamera);
                        dest.writeString(this.buttonUploadOptions);
                    }

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    public static final class Creator implements Parcelable.Creator<ComponentNameMapping> {
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        public final ComponentNameMapping createFromParcel(Parcel parcel) {
                            parcel.getClass();
                            return new ComponentNameMapping(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        public final ComponentNameMapping[] newArray(int i) {
                            return new ComponentNameMapping[i];
                        }
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<DocumentStartPage> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final DocumentStartPage createFromParcel(Parcel parcel) {
                        parcel.getClass();
                        return new DocumentStartPage(Ui.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ComponentNameMapping.CREATOR.createFromParcel(parcel));
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final DocumentStartPage[] newArray(int i) {
                        return new DocumentStartPage[i];
                    }
                }
            }

            @JsonClass(generateAdapter = true)
            @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001dB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$UploadOptionsDialog;", "Landroid/os/Parcelable;", "uiStep", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui;", "componentNameMapping", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$UploadOptionsDialog$ComponentNameMapping;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$UploadOptionsDialog$ComponentNameMapping;)V", "getUiStep", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui;", "getComponentNameMapping", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$UploadOptionsDialog$ComponentNameMapping;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ComponentNameMapping", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class UploadOptionsDialog implements Parcelable {
                public static final Parcelable.Creator<UploadOptionsDialog> CREATOR = new Creator();
                private final ComponentNameMapping componentNameMapping;
                private final Ui uiStep;

                public UploadOptionsDialog(Ui ui, ComponentNameMapping componentNameMapping) {
                    ui.getClass();
                    this.uiStep = ui;
                    this.componentNameMapping = componentNameMapping;
                }

                public static /* synthetic */ UploadOptionsDialog copy$default(UploadOptionsDialog uploadOptionsDialog, Ui ui, ComponentNameMapping componentNameMapping, int i, Object obj) {
                    if ((i & 1) != 0) {
                        ui = uploadOptionsDialog.uiStep;
                    }
                    if ((i & 2) != 0) {
                        componentNameMapping = uploadOptionsDialog.componentNameMapping;
                    }
                    return uploadOptionsDialog.copy(ui, componentNameMapping);
                }

                /* renamed from: component1, reason: from getter */
                public final Ui getUiStep() {
                    return this.uiStep;
                }

                /* renamed from: component2, reason: from getter */
                public final ComponentNameMapping getComponentNameMapping() {
                    return this.componentNameMapping;
                }

                public final UploadOptionsDialog copy(Ui uiStep, ComponentNameMapping componentNameMapping) {
                    uiStep.getClass();
                    return new UploadOptionsDialog(uiStep, componentNameMapping);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof UploadOptionsDialog)) {
                        return false;
                    }
                    UploadOptionsDialog uploadOptionsDialog = (UploadOptionsDialog) other;
                    return Intrinsics.areEqual(this.uiStep, uploadOptionsDialog.uiStep) && Intrinsics.areEqual(this.componentNameMapping, uploadOptionsDialog.componentNameMapping);
                }

                public final ComponentNameMapping getComponentNameMapping() {
                    return this.componentNameMapping;
                }

                public final Ui getUiStep() {
                    return this.uiStep;
                }

                public int hashCode() {
                    int hashCode = this.uiStep.hashCode() * 31;
                    ComponentNameMapping componentNameMapping = this.componentNameMapping;
                    return hashCode + (componentNameMapping == null ? 0 : componentNameMapping.hashCode());
                }

                public String toString() {
                    return "UploadOptionsDialog(uiStep=" + this.uiStep + ", componentNameMapping=" + this.componentNameMapping + ")";
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
                @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006 "}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$UploadOptionsDialog$ComponentNameMapping;", "Landroid/os/Parcelable;", "buttonFilePicker", "", "buttonPhotoLibrary", "buttonCamera", "buttonCancel", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getButtonFilePicker", "()Ljava/lang/String;", "getButtonPhotoLibrary", "getButtonCamera", "getButtonCancel", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
                public static final /* data */ class ComponentNameMapping implements Parcelable {
                    public static final Parcelable.Creator<ComponentNameMapping> CREATOR = new Creator();
                    private final String buttonCamera;
                    private final String buttonCancel;
                    private final String buttonFilePicker;
                    private final String buttonPhotoLibrary;

                    public ComponentNameMapping(String str, String str2, String str3, String str4) {
                        this.buttonFilePicker = str;
                        this.buttonPhotoLibrary = str2;
                        this.buttonCamera = str3;
                        this.buttonCancel = str4;
                    }

                    public static /* synthetic */ ComponentNameMapping copy$default(ComponentNameMapping componentNameMapping, String str, String str2, String str3, String str4, int i, Object obj) {
                        if ((i & 1) != 0) {
                            str = componentNameMapping.buttonFilePicker;
                        }
                        if ((i & 2) != 0) {
                            str2 = componentNameMapping.buttonPhotoLibrary;
                        }
                        if ((i & 4) != 0) {
                            str3 = componentNameMapping.buttonCamera;
                        }
                        if ((i & 8) != 0) {
                            str4 = componentNameMapping.buttonCancel;
                        }
                        return componentNameMapping.copy(str, str2, str3, str4);
                    }

                    /* renamed from: component1, reason: from getter */
                    public final String getButtonFilePicker() {
                        return this.buttonFilePicker;
                    }

                    /* renamed from: component2, reason: from getter */
                    public final String getButtonPhotoLibrary() {
                        return this.buttonPhotoLibrary;
                    }

                    /* renamed from: component3, reason: from getter */
                    public final String getButtonCamera() {
                        return this.buttonCamera;
                    }

                    /* renamed from: component4, reason: from getter */
                    public final String getButtonCancel() {
                        return this.buttonCancel;
                    }

                    public final ComponentNameMapping copy(String buttonFilePicker, String buttonPhotoLibrary, String buttonCamera, String buttonCancel) {
                        return new ComponentNameMapping(buttonFilePicker, buttonPhotoLibrary, buttonCamera, buttonCancel);
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
                        return Intrinsics.areEqual(this.buttonFilePicker, componentNameMapping.buttonFilePicker) && Intrinsics.areEqual(this.buttonPhotoLibrary, componentNameMapping.buttonPhotoLibrary) && Intrinsics.areEqual(this.buttonCamera, componentNameMapping.buttonCamera) && Intrinsics.areEqual(this.buttonCancel, componentNameMapping.buttonCancel);
                    }

                    public final String getButtonCamera() {
                        return this.buttonCamera;
                    }

                    public final String getButtonCancel() {
                        return this.buttonCancel;
                    }

                    public final String getButtonFilePicker() {
                        return this.buttonFilePicker;
                    }

                    public final String getButtonPhotoLibrary() {
                        return this.buttonPhotoLibrary;
                    }

                    public int hashCode() {
                        String str = this.buttonFilePicker;
                        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                        String str2 = this.buttonPhotoLibrary;
                        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                        String str3 = this.buttonCamera;
                        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                        String str4 = this.buttonCancel;
                        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
                    }

                    public String toString() {
                        String str = this.buttonFilePicker;
                        String str2 = this.buttonPhotoLibrary;
                        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ComponentNameMapping(buttonFilePicker=", str, ", buttonPhotoLibrary=", str2, ", buttonCamera="), this.buttonCamera, ", buttonCancel=", this.buttonCancel, ")");
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel dest, int flags) {
                        dest.getClass();
                        dest.writeString(this.buttonFilePicker);
                        dest.writeString(this.buttonPhotoLibrary);
                        dest.writeString(this.buttonCamera);
                        dest.writeString(this.buttonCancel);
                    }

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    public static final class Creator implements Parcelable.Creator<ComponentNameMapping> {
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        public final ComponentNameMapping createFromParcel(Parcel parcel) {
                            parcel.getClass();
                            return new ComponentNameMapping(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        public final ComponentNameMapping[] newArray(int i) {
                            return new ComponentNameMapping[i];
                        }
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<UploadOptionsDialog> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final UploadOptionsDialog createFromParcel(Parcel parcel) {
                        parcel.getClass();
                        return new UploadOptionsDialog(Ui.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ComponentNameMapping.CREATOR.createFromParcel(parcel));
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final UploadOptionsDialog[] newArray(int i) {
                        return new UploadOptionsDialog[i];
                    }
                }
            }

            @JsonClass(generateAdapter = true)
            @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$DocumentPages;", "Landroid/os/Parcelable;", "prompt", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$DocumentStartPage;", "uploadOptionsDialog", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$UploadOptionsDialog;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$DocumentStartPage;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$UploadOptionsDialog;)V", "getPrompt", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$DocumentStartPage;", "getUploadOptionsDialog", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$UploadOptionsDialog;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class DocumentPages implements Parcelable {
                public static final Parcelable.Creator<DocumentPages> CREATOR = new Creator();
                private final DocumentStartPage prompt;
                private final UploadOptionsDialog uploadOptionsDialog;

                public DocumentPages(DocumentStartPage documentStartPage, UploadOptionsDialog uploadOptionsDialog) {
                    this.prompt = documentStartPage;
                    this.uploadOptionsDialog = uploadOptionsDialog;
                }

                public static /* synthetic */ DocumentPages copy$default(DocumentPages documentPages, DocumentStartPage documentStartPage, UploadOptionsDialog uploadOptionsDialog, int i, Object obj) {
                    if ((i & 1) != 0) {
                        documentStartPage = documentPages.prompt;
                    }
                    if ((i & 2) != 0) {
                        uploadOptionsDialog = documentPages.uploadOptionsDialog;
                    }
                    return documentPages.copy(documentStartPage, uploadOptionsDialog);
                }

                /* renamed from: component1, reason: from getter */
                public final DocumentStartPage getPrompt() {
                    return this.prompt;
                }

                /* renamed from: component2, reason: from getter */
                public final UploadOptionsDialog getUploadOptionsDialog() {
                    return this.uploadOptionsDialog;
                }

                public final DocumentPages copy(DocumentStartPage prompt, UploadOptionsDialog uploadOptionsDialog) {
                    return new DocumentPages(prompt, uploadOptionsDialog);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof DocumentPages)) {
                        return false;
                    }
                    DocumentPages documentPages = (DocumentPages) other;
                    return Intrinsics.areEqual(this.prompt, documentPages.prompt) && Intrinsics.areEqual(this.uploadOptionsDialog, documentPages.uploadOptionsDialog);
                }

                public final DocumentStartPage getPrompt() {
                    return this.prompt;
                }

                public final UploadOptionsDialog getUploadOptionsDialog() {
                    return this.uploadOptionsDialog;
                }

                public int hashCode() {
                    DocumentStartPage documentStartPage = this.prompt;
                    int hashCode = (documentStartPage == null ? 0 : documentStartPage.hashCode()) * 31;
                    UploadOptionsDialog uploadOptionsDialog = this.uploadOptionsDialog;
                    return hashCode + (uploadOptionsDialog != null ? uploadOptionsDialog.hashCode() : 0);
                }

                public String toString() {
                    return "DocumentPages(prompt=" + this.prompt + ", uploadOptionsDialog=" + this.uploadOptionsDialog + ")";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int flags) {
                    dest.getClass();
                    DocumentStartPage documentStartPage = this.prompt;
                    if (documentStartPage == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        documentStartPage.writeToParcel(dest, flags);
                    }
                    UploadOptionsDialog uploadOptionsDialog = this.uploadOptionsDialog;
                    if (uploadOptionsDialog == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        uploadOptionsDialog.writeToParcel(dest, flags);
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<DocumentPages> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final DocumentPages createFromParcel(Parcel parcel) {
                        parcel.getClass();
                        return new DocumentPages(parcel.readInt() == 0 ? null : DocumentStartPage.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? UploadOptionsDialog.CREATOR.createFromParcel(parcel) : null);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final DocumentPages[] newArray(int i) {
                        return new DocumentPages[i];
                    }
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Pages> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Pages createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new Pages(parcel.readInt() == 0 ? null : DocumentPages.CREATOR.createFromParcel(parcel));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Pages[] newArray(int i) {
                    return new Pages[i];
                }
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @JsonClass(generateAdapter = false)
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$StartPage;", "", "<init>", "(Ljava/lang/String;I)V", "PROMPT", "REVIEW", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class StartPage {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ StartPage[] $VALUES;

            @Json(name = "prompt")
            public static final StartPage PROMPT = new StartPage("PROMPT", 0);

            @Json(name = "review")
            public static final StartPage REVIEW = new StartPage("REVIEW", 1);

            private static final /* synthetic */ StartPage[] $values() {
                return new StartPage[]{PROMPT, REVIEW};
            }

            static {
                StartPage[] $values = $values();
                $VALUES = $values;
                $ENTRIES = Tags.enumEntries($values);
            }

            private StartPage(String str, int i) {
            }

            public static EnumEntries getEntries() {
                return $ENTRIES;
            }

            public static StartPage valueOf(String str) {
                return (StartPage) Enum.valueOf(StartPage.class, str);
            }

            public static StartPage[] values() {
                return (StartPage[]) $VALUES.clone();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Document(String str, StepStyles.DocumentStepStyle documentStepStyle, Config config) {
            super(str, null);
            str.getClass();
            config.getClass();
            this.name = str;
            this.styles = documentStepStyle;
            this.config = config;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final Config getConfig() {
            return this.config;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.NextStep
        public String getName() {
            return this.name;
        }

        public final StepStyles.DocumentStepStyle getStyles() {
            return this.styles;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            dest.writeString(this.name);
            StepStyles.DocumentStepStyle documentStepStyle = this.styles;
            if (documentStepStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                documentStepStyle.writeToParcel(dest, flags);
            }
            this.config.writeToParcel(dest, flags);
        }

        @JsonClass(generateAdapter = true)
        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u001d\u001eB\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig;", "Landroid/os/Parcelable;", "promptPage", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig$PromptPage;", "pendingPage", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig$PendingPage;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig$PromptPage;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig$PendingPage;)V", "getPromptPage", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig$PromptPage;", "getPendingPage", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig$PendingPage;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "PendingPage", "PromptPage", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class AssetConfig implements Parcelable {
            public static final Parcelable.Creator<AssetConfig> CREATOR = new Creator();
            private final PendingPage pendingPage;
            private final PromptPage promptPage;

            public /* synthetic */ AssetConfig(PromptPage promptPage, PendingPage pendingPage, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : promptPage, (i & 2) != 0 ? null : pendingPage);
            }

            public static /* synthetic */ AssetConfig copy$default(AssetConfig assetConfig, PromptPage promptPage, PendingPage pendingPage, int i, Object obj) {
                if ((i & 1) != 0) {
                    promptPage = assetConfig.promptPage;
                }
                if ((i & 2) != 0) {
                    pendingPage = assetConfig.pendingPage;
                }
                return assetConfig.copy(promptPage, pendingPage);
            }

            /* renamed from: component1, reason: from getter */
            public final PromptPage getPromptPage() {
                return this.promptPage;
            }

            /* renamed from: component2, reason: from getter */
            public final PendingPage getPendingPage() {
                return this.pendingPage;
            }

            public final AssetConfig copy(PromptPage promptPage, PendingPage pendingPage) {
                return new AssetConfig(promptPage, pendingPage);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AssetConfig)) {
                    return false;
                }
                AssetConfig assetConfig = (AssetConfig) other;
                return Intrinsics.areEqual(this.promptPage, assetConfig.promptPage) && Intrinsics.areEqual(this.pendingPage, assetConfig.pendingPage);
            }

            public final PendingPage getPendingPage() {
                return this.pendingPage;
            }

            public final PromptPage getPromptPage() {
                return this.promptPage;
            }

            public int hashCode() {
                PromptPage promptPage = this.promptPage;
                int hashCode = (promptPage == null ? 0 : promptPage.hashCode()) * 31;
                PendingPage pendingPage = this.pendingPage;
                return hashCode + (pendingPage != null ? pendingPage.hashCode() : 0);
            }

            public String toString() {
                return "AssetConfig(promptPage=" + this.promptPage + ", pendingPage=" + this.pendingPage + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.getClass();
                PromptPage promptPage = this.promptPage;
                if (promptPage == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    promptPage.writeToParcel(dest, flags);
                }
                PendingPage pendingPage = this.pendingPage;
                if (pendingPage == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    pendingPage.writeToParcel(dest, flags);
                }
            }

            @JsonClass(generateAdapter = true)
            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig$PendingPage;", "Landroid/os/Parcelable;", "headerPictograph", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "loadingPictograph", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;)V", "getHeaderPictograph", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "getLoadingPictograph", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class PendingPage implements Parcelable {
                public static final Parcelable.Creator<PendingPage> CREATOR = new Creator();
                private final RemoteImage headerPictograph;
                private final RemoteImage loadingPictograph;

                public /* synthetic */ PendingPage(RemoteImage remoteImage, RemoteImage remoteImage2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : remoteImage, (i & 2) != 0 ? null : remoteImage2);
                }

                public static /* synthetic */ PendingPage copy$default(PendingPage pendingPage, RemoteImage remoteImage, RemoteImage remoteImage2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        remoteImage = pendingPage.headerPictograph;
                    }
                    if ((i & 2) != 0) {
                        remoteImage2 = pendingPage.loadingPictograph;
                    }
                    return pendingPage.copy(remoteImage, remoteImage2);
                }

                /* renamed from: component1, reason: from getter */
                public final RemoteImage getHeaderPictograph() {
                    return this.headerPictograph;
                }

                /* renamed from: component2, reason: from getter */
                public final RemoteImage getLoadingPictograph() {
                    return this.loadingPictograph;
                }

                public final PendingPage copy(RemoteImage headerPictograph, RemoteImage loadingPictograph) {
                    return new PendingPage(headerPictograph, loadingPictograph);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof PendingPage)) {
                        return false;
                    }
                    PendingPage pendingPage = (PendingPage) other;
                    return Intrinsics.areEqual(this.headerPictograph, pendingPage.headerPictograph) && Intrinsics.areEqual(this.loadingPictograph, pendingPage.loadingPictograph);
                }

                public final RemoteImage getHeaderPictograph() {
                    return this.headerPictograph;
                }

                public final RemoteImage getLoadingPictograph() {
                    return this.loadingPictograph;
                }

                public int hashCode() {
                    RemoteImage remoteImage = this.headerPictograph;
                    int hashCode = (remoteImage == null ? 0 : remoteImage.hashCode()) * 31;
                    RemoteImage remoteImage2 = this.loadingPictograph;
                    return hashCode + (remoteImage2 != null ? remoteImage2.hashCode() : 0);
                }

                public String toString() {
                    return "PendingPage(headerPictograph=" + this.headerPictograph + ", loadingPictograph=" + this.loadingPictograph + ")";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int flags) {
                    dest.getClass();
                    RemoteImage remoteImage = this.headerPictograph;
                    if (remoteImage == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        remoteImage.writeToParcel(dest, flags);
                    }
                    RemoteImage remoteImage2 = this.loadingPictograph;
                    if (remoteImage2 == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        remoteImage2.writeToParcel(dest, flags);
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<PendingPage> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final PendingPage createFromParcel(Parcel parcel) {
                        parcel.getClass();
                        return new PendingPage(parcel.readInt() == 0 ? null : RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? RemoteImage.CREATOR.createFromParcel(parcel) : null);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final PendingPage[] newArray(int i) {
                        return new PendingPage[i];
                    }
                }

                public PendingPage(RemoteImage remoteImage, RemoteImage remoteImage2) {
                    this.headerPictograph = remoteImage;
                    this.loadingPictograph = remoteImage2;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public PendingPage() {
                    this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                }
            }

            @JsonClass(generateAdapter = true)
            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig$PromptPage;", "Landroid/os/Parcelable;", "headerPictograph", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "documentPictograph", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;)V", "getHeaderPictograph", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "getDocumentPictograph", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class PromptPage implements Parcelable {
                public static final Parcelable.Creator<PromptPage> CREATOR = new Creator();
                private final RemoteImage documentPictograph;
                private final RemoteImage headerPictograph;

                public /* synthetic */ PromptPage(RemoteImage remoteImage, RemoteImage remoteImage2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : remoteImage, (i & 2) != 0 ? null : remoteImage2);
                }

                public static /* synthetic */ PromptPage copy$default(PromptPage promptPage, RemoteImage remoteImage, RemoteImage remoteImage2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        remoteImage = promptPage.headerPictograph;
                    }
                    if ((i & 2) != 0) {
                        remoteImage2 = promptPage.documentPictograph;
                    }
                    return promptPage.copy(remoteImage, remoteImage2);
                }

                /* renamed from: component1, reason: from getter */
                public final RemoteImage getHeaderPictograph() {
                    return this.headerPictograph;
                }

                /* renamed from: component2, reason: from getter */
                public final RemoteImage getDocumentPictograph() {
                    return this.documentPictograph;
                }

                public final PromptPage copy(RemoteImage headerPictograph, RemoteImage documentPictograph) {
                    return new PromptPage(headerPictograph, documentPictograph);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof PromptPage)) {
                        return false;
                    }
                    PromptPage promptPage = (PromptPage) other;
                    return Intrinsics.areEqual(this.headerPictograph, promptPage.headerPictograph) && Intrinsics.areEqual(this.documentPictograph, promptPage.documentPictograph);
                }

                public final RemoteImage getDocumentPictograph() {
                    return this.documentPictograph;
                }

                public final RemoteImage getHeaderPictograph() {
                    return this.headerPictograph;
                }

                public int hashCode() {
                    RemoteImage remoteImage = this.headerPictograph;
                    int hashCode = (remoteImage == null ? 0 : remoteImage.hashCode()) * 31;
                    RemoteImage remoteImage2 = this.documentPictograph;
                    return hashCode + (remoteImage2 != null ? remoteImage2.hashCode() : 0);
                }

                public String toString() {
                    return "PromptPage(headerPictograph=" + this.headerPictograph + ", documentPictograph=" + this.documentPictograph + ")";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int flags) {
                    dest.getClass();
                    RemoteImage remoteImage = this.headerPictograph;
                    if (remoteImage == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        remoteImage.writeToParcel(dest, flags);
                    }
                    RemoteImage remoteImage2 = this.documentPictograph;
                    if (remoteImage2 == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        remoteImage2.writeToParcel(dest, flags);
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<PromptPage> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final PromptPage createFromParcel(Parcel parcel) {
                        parcel.getClass();
                        return new PromptPage(parcel.readInt() == 0 ? null : RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? RemoteImage.CREATOR.createFromParcel(parcel) : null);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final PromptPage[] newArray(int i) {
                        return new PromptPage[i];
                    }
                }

                public PromptPage(RemoteImage remoteImage, RemoteImage remoteImage2) {
                    this.headerPictograph = remoteImage;
                    this.documentPictograph = remoteImage2;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public PromptPage() {
                    this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<AssetConfig> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AssetConfig createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new AssetConfig(parcel.readInt() == 0 ? null : PromptPage.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? PendingPage.CREATOR.createFromParcel(parcel) : null);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AssetConfig[] newArray(int i) {
                    return new AssetConfig[i];
                }
            }

            public AssetConfig(PromptPage promptPage, PendingPage pendingPage) {
                this.promptPage = promptPage;
                this.pendingPage = pendingPage;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public AssetConfig() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }
        }

        @JsonClass(generateAdapter = true)
        @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001Bk\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0006\u0010+\u001a\u00020\u0006J\u0016\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u0006R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001eR\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001eR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*¨\u00061"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Config;", "Landroid/os/Parcelable;", "backStepEnabled", "", "cancelButtonEnabled", "documentFileLimit", "", "documentId", "", "startPage", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$StartPage;", "fieldKeyDocument", "kind", "localizations", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Localizations;", "pages", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages;", "assets", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig;", "pendingPageTextVerticalPosition", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;ILjava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$StartPage;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Localizations;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;)V", "getBackStepEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCancelButtonEnabled", "getDocumentFileLimit", "()I", "getDocumentId", "()Ljava/lang/String;", "getStartPage", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$StartPage;", "getFieldKeyDocument", "getKind", "getLocalizations", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Localizations;", "getPages", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages;", "getAssets", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig;", "getPendingPageTextVerticalPosition", "()Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Config implements Parcelable {
            public static final Parcelable.Creator<Config> CREATOR = new Creator();
            private final AssetConfig assets;
            private final Boolean backStepEnabled;
            private final Boolean cancelButtonEnabled;
            private final int documentFileLimit;
            private final String documentId;
            private final String fieldKeyDocument;
            private final String kind;
            private final Localizations localizations;
            private final Pages pages;
            private final PendingPageTextPosition pendingPageTextVerticalPosition;
            private final StartPage startPage;

            public Config(Boolean bool, Boolean bool2, int i, String str, StartPage startPage, String str2, String str3, Localizations localizations, Pages pages, AssetConfig assetConfig, PendingPageTextPosition pendingPageTextPosition) {
                startPage.getClass();
                str2.getClass();
                str3.getClass();
                localizations.getClass();
                this.backStepEnabled = bool;
                this.cancelButtonEnabled = bool2;
                this.documentFileLimit = i;
                this.documentId = str;
                this.startPage = startPage;
                this.fieldKeyDocument = str2;
                this.kind = str3;
                this.localizations = localizations;
                this.pages = pages;
                this.assets = assetConfig;
                this.pendingPageTextVerticalPosition = pendingPageTextPosition;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final AssetConfig getAssets() {
                return this.assets;
            }

            public final Boolean getBackStepEnabled() {
                return this.backStepEnabled;
            }

            public final Boolean getCancelButtonEnabled() {
                return this.cancelButtonEnabled;
            }

            public final int getDocumentFileLimit() {
                return this.documentFileLimit;
            }

            public final String getDocumentId() {
                return this.documentId;
            }

            public final String getFieldKeyDocument() {
                return this.fieldKeyDocument;
            }

            public final String getKind() {
                return this.kind;
            }

            public final Localizations getLocalizations() {
                return this.localizations;
            }

            public final Pages getPages() {
                return this.pages;
            }

            public final PendingPageTextPosition getPendingPageTextVerticalPosition() {
                return this.pendingPageTextVerticalPosition;
            }

            public final StartPage getStartPage() {
                return this.startPage;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.getClass();
                Boolean bool = this.backStepEnabled;
                if (bool == null) {
                    dest.writeInt(0);
                } else {
                    CameraState$Type$EnumUnboxingLocalUtility.m(dest, 1, bool);
                }
                Boolean bool2 = this.cancelButtonEnabled;
                if (bool2 == null) {
                    dest.writeInt(0);
                } else {
                    CameraState$Type$EnumUnboxingLocalUtility.m(dest, 1, bool2);
                }
                dest.writeInt(this.documentFileLimit);
                dest.writeString(this.documentId);
                dest.writeString(this.startPage.name());
                dest.writeString(this.fieldKeyDocument);
                dest.writeString(this.kind);
                this.localizations.writeToParcel(dest, flags);
                Pages pages = this.pages;
                if (pages == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    pages.writeToParcel(dest, flags);
                }
                AssetConfig assetConfig = this.assets;
                if (assetConfig == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    assetConfig.writeToParcel(dest, flags);
                }
                PendingPageTextPosition pendingPageTextPosition = this.pendingPageTextVerticalPosition;
                if (pendingPageTextPosition == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dest.writeString(pendingPageTextPosition.name());
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Config> {
                /* JADX WARN: Can't rename method to resolve collision */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // android.os.Parcelable.Creator
                public final Config createFromParcel(Parcel parcel) {
                    Boolean valueOf;
                    Boolean valueOf2;
                    Parcelable parcelable;
                    parcel.getClass();
                    if (parcel.readInt() == 0) {
                        valueOf = null;
                    } else {
                        valueOf = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    if (parcel.readInt() == 0) {
                        parcelable = null;
                        valueOf2 = null;
                    } else {
                        valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                        parcelable = null;
                    }
                    return new Config(valueOf, valueOf2, parcel.readInt(), parcel.readString(), StartPage.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), Localizations.CREATOR.createFromParcel(parcel), (Pages) (parcel.readInt() == 0 ? parcelable : Pages.CREATOR.createFromParcel(parcel)), (AssetConfig) (parcel.readInt() == 0 ? parcelable : AssetConfig.CREATOR.createFromParcel(parcel)), parcel.readInt() == 0 ? parcelable : PendingPageTextPosition.valueOf(parcel.readString()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Config[] newArray(int i) {
                    return new Config[i];
                }
            }
        }

        @JsonClass(generateAdapter = true)
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Localizations;", "Landroid/os/Parcelable;", "pendingPage", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$PendingPage;", "promptPage", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$PromptPage;", "cancelDialog", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$PendingPage;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$PromptPage;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;)V", "getPendingPage", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$PendingPage;", "getPromptPage", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$PromptPage;", "getCancelDialog", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Localizations implements Parcelable {
            public static final Parcelable.Creator<Localizations> CREATOR = new Creator();
            private final CancelDialog cancelDialog;
            private final PendingPage pendingPage;
            private final PromptPage promptPage;

            public Localizations(PendingPage pendingPage, PromptPage promptPage, CancelDialog cancelDialog) {
                pendingPage.getClass();
                promptPage.getClass();
                this.pendingPage = pendingPage;
                this.promptPage = promptPage;
                this.cancelDialog = cancelDialog;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final CancelDialog getCancelDialog() {
                return this.cancelDialog;
            }

            public final PendingPage getPendingPage() {
                return this.pendingPage;
            }

            public final PromptPage getPromptPage() {
                return this.promptPage;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.getClass();
                this.pendingPage.writeToParcel(dest, flags);
                this.promptPage.writeToParcel(dest, flags);
                CancelDialog cancelDialog = this.cancelDialog;
                if (cancelDialog == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    cancelDialog.writeToParcel(dest, flags);
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Localizations> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Localizations createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new Localizations(PendingPage.CREATOR.createFromParcel(parcel), PromptPage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CancelDialog.CREATOR.createFromParcel(parcel));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Localizations[] newArray(int i) {
                    return new Localizations[i];
                }
            }
        }

        @JsonClass(generateAdapter = true)
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$PendingPage;", "Landroid/os/Parcelable;", "title", "", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class PendingPage implements Parcelable {
            public static final Parcelable.Creator<PendingPage> CREATOR = new Creator();
            private final String description;
            private final String title;

            public PendingPage(String str, String str2) {
                this.title = str;
                this.description = str2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final String getDescription() {
                return this.description;
            }

            public final String getTitle() {
                return this.title;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.getClass();
                dest.writeString(this.title);
                dest.writeString(this.description);
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<PendingPage> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PendingPage createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new PendingPage(parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PendingPage[] newArray(int i) {
                    return new PendingPage[i];
                }
            }
        }

        @JsonClass(generateAdapter = true)
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012¨\u0006%"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$PromptPage;", "Landroid/os/Parcelable;", "title", "", "prompt", "disclaimer", "captureOptionsDialogTitle", "btnCapture", "btnUpload", "btnSubmit", "cameraPermissionsTitle", "cameraPermissionsPrompt", "cameraPermissionsAllowButtonText", "cameraPermissionsCancelButtonText", "largeFileErrorPrompt", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getPrompt", "getDisclaimer", "getCaptureOptionsDialogTitle", "getBtnCapture", "getBtnUpload", "getBtnSubmit", "getCameraPermissionsTitle", "getCameraPermissionsPrompt", "getCameraPermissionsAllowButtonText", "getCameraPermissionsCancelButtonText", "getLargeFileErrorPrompt", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class PromptPage implements Parcelable {
            public static final Parcelable.Creator<PromptPage> CREATOR = new Creator();
            private final String btnCapture;
            private final String btnSubmit;
            private final String btnUpload;
            private final String cameraPermissionsAllowButtonText;
            private final String cameraPermissionsCancelButtonText;
            private final String cameraPermissionsPrompt;
            private final String cameraPermissionsTitle;
            private final String captureOptionsDialogTitle;
            private final String disclaimer;
            private final String largeFileErrorPrompt;
            private final String prompt;
            private final String title;

            public PromptPage(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, @Json(name = "cameraPermissionsBtnContinueMobile") String str10, @Json(name = "cameraPermissionsBtnCancel") String str11, String str12) {
                this.title = str;
                this.prompt = str2;
                this.disclaimer = str3;
                this.captureOptionsDialogTitle = str4;
                this.btnCapture = str5;
                this.btnUpload = str6;
                this.btnSubmit = str7;
                this.cameraPermissionsTitle = str8;
                this.cameraPermissionsPrompt = str9;
                this.cameraPermissionsAllowButtonText = str10;
                this.cameraPermissionsCancelButtonText = str11;
                this.largeFileErrorPrompt = str12;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final String getBtnCapture() {
                return this.btnCapture;
            }

            public final String getBtnSubmit() {
                return this.btnSubmit;
            }

            public final String getBtnUpload() {
                return this.btnUpload;
            }

            public final String getCameraPermissionsAllowButtonText() {
                return this.cameraPermissionsAllowButtonText;
            }

            public final String getCameraPermissionsCancelButtonText() {
                return this.cameraPermissionsCancelButtonText;
            }

            public final String getCameraPermissionsPrompt() {
                return this.cameraPermissionsPrompt;
            }

            public final String getCameraPermissionsTitle() {
                return this.cameraPermissionsTitle;
            }

            public final String getCaptureOptionsDialogTitle() {
                return this.captureOptionsDialogTitle;
            }

            public final String getDisclaimer() {
                return this.disclaimer;
            }

            public final String getLargeFileErrorPrompt() {
                return this.largeFileErrorPrompt;
            }

            public final String getPrompt() {
                return this.prompt;
            }

            public final String getTitle() {
                return this.title;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.getClass();
                dest.writeString(this.title);
                dest.writeString(this.prompt);
                dest.writeString(this.disclaimer);
                dest.writeString(this.captureOptionsDialogTitle);
                dest.writeString(this.btnCapture);
                dest.writeString(this.btnUpload);
                dest.writeString(this.btnSubmit);
                dest.writeString(this.cameraPermissionsTitle);
                dest.writeString(this.cameraPermissionsPrompt);
                dest.writeString(this.cameraPermissionsAllowButtonText);
                dest.writeString(this.cameraPermissionsCancelButtonText);
                dest.writeString(this.largeFileErrorPrompt);
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<PromptPage> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PromptPage createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new PromptPage(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PromptPage[] newArray(int i) {
                    return new PromptPage[i];
                }
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Document> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Document createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new Document(parcel.readString(), parcel.readInt() == 0 ? null : StepStyles.DocumentStepStyle.CREATOR.createFromParcel(parcel), Config.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Document[] newArray(int i) {
                return new Document[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0007\u0018\u00002\u00020\u0001:\u0012\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\""}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;", "name", "", "config", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Config;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Config;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;)V", "getName", "()Ljava/lang/String;", "getConfig", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Config;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "Config", "DigitalIdConfig", "DigitalIdRequest", "LocalizationOverride", "Localizations", "SelectPage", "PromptPage", "CapturePage", "CheckPage", "PendingPage", "RequestPage", "ReviewUploadPage", "AutoClassificationPage", "PassportNfcOption", "CaptureFileType", "VideoCaptureMethod", "AssetConfig", "AutoClassificationConfig", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class GovernmentId extends NextStep {
        private final Config config;
        private final String name;
        private final StepStyles.GovernmentIdStepStyle styles;

        @JsonClass(generateAdapter = true)
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$DigitalIdConfig;", "", "merchantId", "", "nonce", "fieldKeyMobileDriversLicense", "mobileRequests", "", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$DigitalIdRequest;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getMerchantId", "()Ljava/lang/String;", "getNonce", "getFieldKeyMobileDriversLicense", "getMobileRequests", "()Ljava/util/List;", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class DigitalIdConfig {
            private final String fieldKeyMobileDriversLicense;
            private final String merchantId;
            private final List<DigitalIdRequest> mobileRequests;
            private final String nonce;

            public DigitalIdConfig(String str, String str2, String str3, List<DigitalIdRequest> list) {
                this.merchantId = str;
                this.nonce = str2;
                this.fieldKeyMobileDriversLicense = str3;
                this.mobileRequests = list;
            }

            public final String getFieldKeyMobileDriversLicense() {
                return this.fieldKeyMobileDriversLicense;
            }

            public final String getMerchantId() {
                return this.merchantId;
            }

            public final List<DigitalIdRequest> getMobileRequests() {
                return this.mobileRequests;
            }

            public final String getNonce() {
                return this.nonce;
            }
        }

        @JsonClass(generateAdapter = true)
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001f\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$DigitalIdRequest;", "", "idType", "", "minAge", "elementToStoreLength", "", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getIdType", "()Ljava/lang/String;", "getMinAge", "getElementToStoreLength", "()Ljava/util/Map;", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class DigitalIdRequest {
            private final Map<String, Integer> elementToStoreLength;
            private final String idType;
            private final String minAge;

            public DigitalIdRequest(String str, String str2, Map<String, Integer> map) {
                this.idType = str;
                this.minAge = str2;
                this.elementToStoreLength = map;
            }

            public final Map<String, Integer> getElementToStoreLength() {
                return this.elementToStoreLength;
            }

            public final String getIdType() {
                return this.idType;
            }

            public final String getMinAge() {
                return this.minAge;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GovernmentId(String str, Config config, StepStyles.GovernmentIdStepStyle governmentIdStepStyle) {
            super(str, null);
            str.getClass();
            config.getClass();
            this.name = str;
            this.config = config;
            this.styles = governmentIdStepStyle;
        }

        public final Config getConfig() {
            return this.config;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.NextStep
        public String getName() {
            return this.name;
        }

        public final StepStyles.GovernmentIdStepStyle getStyles() {
            return this.styles;
        }

        @JsonClass(generateAdapter = true)
        @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001:\u0005,-./0BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u000bHÆ\u0003JE\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u001fHÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001J\u0016\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u001fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u00061"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig;", "Landroid/os/Parcelable;", "selectPage", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$SelectPage;", "promptPage", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$PromptPage;", "capturePage", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;", "checkPage", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CheckPage;", "pendingPage", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$PendingPage;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$SelectPage;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$PromptPage;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CheckPage;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$PendingPage;)V", "getSelectPage", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$SelectPage;", "getPromptPage", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$PromptPage;", "getCapturePage", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;", "getCheckPage", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CheckPage;", "getPendingPage", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$PendingPage;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "CapturePage", "CheckPage", "PendingPage", "PromptPage", "SelectPage", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class AssetConfig implements Parcelable {
            public static final Parcelable.Creator<AssetConfig> CREATOR = new Creator();
            private final CapturePage capturePage;
            private final CheckPage checkPage;
            private final PendingPage pendingPage;
            private final PromptPage promptPage;
            private final SelectPage selectPage;

            public /* synthetic */ AssetConfig(SelectPage selectPage, PromptPage promptPage, CapturePage capturePage, CheckPage checkPage, PendingPage pendingPage, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : selectPage, (i & 2) != 0 ? null : promptPage, (i & 4) != 0 ? null : capturePage, (i & 8) != 0 ? null : checkPage, (i & 16) != 0 ? null : pendingPage);
            }

            public static /* synthetic */ AssetConfig copy$default(AssetConfig assetConfig, SelectPage selectPage, PromptPage promptPage, CapturePage capturePage, CheckPage checkPage, PendingPage pendingPage, int i, Object obj) {
                if ((i & 1) != 0) {
                    selectPage = assetConfig.selectPage;
                }
                if ((i & 2) != 0) {
                    promptPage = assetConfig.promptPage;
                }
                if ((i & 4) != 0) {
                    capturePage = assetConfig.capturePage;
                }
                if ((i & 8) != 0) {
                    checkPage = assetConfig.checkPage;
                }
                if ((i & 16) != 0) {
                    pendingPage = assetConfig.pendingPage;
                }
                PendingPage pendingPage2 = pendingPage;
                CapturePage capturePage2 = capturePage;
                return assetConfig.copy(selectPage, promptPage, capturePage2, checkPage, pendingPage2);
            }

            /* renamed from: component1, reason: from getter */
            public final SelectPage getSelectPage() {
                return this.selectPage;
            }

            /* renamed from: component2, reason: from getter */
            public final PromptPage getPromptPage() {
                return this.promptPage;
            }

            /* renamed from: component3, reason: from getter */
            public final CapturePage getCapturePage() {
                return this.capturePage;
            }

            /* renamed from: component4, reason: from getter */
            public final CheckPage getCheckPage() {
                return this.checkPage;
            }

            /* renamed from: component5, reason: from getter */
            public final PendingPage getPendingPage() {
                return this.pendingPage;
            }

            public final AssetConfig copy(SelectPage selectPage, PromptPage promptPage, CapturePage capturePage, CheckPage checkPage, PendingPage pendingPage) {
                return new AssetConfig(selectPage, promptPage, capturePage, checkPage, pendingPage);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AssetConfig)) {
                    return false;
                }
                AssetConfig assetConfig = (AssetConfig) other;
                return Intrinsics.areEqual(this.selectPage, assetConfig.selectPage) && Intrinsics.areEqual(this.promptPage, assetConfig.promptPage) && Intrinsics.areEqual(this.capturePage, assetConfig.capturePage) && Intrinsics.areEqual(this.checkPage, assetConfig.checkPage) && Intrinsics.areEqual(this.pendingPage, assetConfig.pendingPage);
            }

            public final CapturePage getCapturePage() {
                return this.capturePage;
            }

            public final CheckPage getCheckPage() {
                return this.checkPage;
            }

            public final PendingPage getPendingPage() {
                return this.pendingPage;
            }

            public final PromptPage getPromptPage() {
                return this.promptPage;
            }

            public final SelectPage getSelectPage() {
                return this.selectPage;
            }

            public int hashCode() {
                SelectPage selectPage = this.selectPage;
                int hashCode = (selectPage == null ? 0 : selectPage.hashCode()) * 31;
                PromptPage promptPage = this.promptPage;
                int hashCode2 = (hashCode + (promptPage == null ? 0 : promptPage.hashCode())) * 31;
                CapturePage capturePage = this.capturePage;
                int hashCode3 = (hashCode2 + (capturePage == null ? 0 : capturePage.hashCode())) * 31;
                CheckPage checkPage = this.checkPage;
                int hashCode4 = (hashCode3 + (checkPage == null ? 0 : checkPage.hashCode())) * 31;
                PendingPage pendingPage = this.pendingPage;
                return hashCode4 + (pendingPage != null ? pendingPage.hashCode() : 0);
            }

            public String toString() {
                return "AssetConfig(selectPage=" + this.selectPage + ", promptPage=" + this.promptPage + ", capturePage=" + this.capturePage + ", checkPage=" + this.checkPage + ", pendingPage=" + this.pendingPage + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.getClass();
                SelectPage selectPage = this.selectPage;
                if (selectPage == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    selectPage.writeToParcel(dest, flags);
                }
                PromptPage promptPage = this.promptPage;
                if (promptPage == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    promptPage.writeToParcel(dest, flags);
                }
                CapturePage capturePage = this.capturePage;
                if (capturePage == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    capturePage.writeToParcel(dest, flags);
                }
                CheckPage checkPage = this.checkPage;
                if (checkPage == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    checkPage.writeToParcel(dest, flags);
                }
                PendingPage pendingPage = this.pendingPage;
                if (pendingPage == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    pendingPage.writeToParcel(dest, flags);
                }
            }

            @JsonClass(generateAdapter = true)
            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003Ju\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\"\u001a\u00020#J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020#HÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001J\u0016\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020#R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u00060"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;", "Landroid/os/Parcelable;", "idFrontPictograph", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "idBackPictograph", "barcodePdf417Pictograph", "passportFrontPictograph", "passportSignaturePictograph", "idFrontHelpModalPictograph", "idBackHelpModalPictograph", "barcodeHelpModalPictograph", "staticCaptureTipsIconPictograph", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;)V", "getIdFrontPictograph", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "getIdBackPictograph", "getBarcodePdf417Pictograph", "getPassportFrontPictograph", "getPassportSignaturePictograph", "getIdFrontHelpModalPictograph", "getIdBackHelpModalPictograph", "getBarcodeHelpModalPictograph", "getStaticCaptureTipsIconPictograph", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class CapturePage implements Parcelable {
                public static final Parcelable.Creator<CapturePage> CREATOR = new Creator();
                private final RemoteImage barcodeHelpModalPictograph;
                private final RemoteImage barcodePdf417Pictograph;
                private final RemoteImage idBackHelpModalPictograph;
                private final RemoteImage idBackPictograph;
                private final RemoteImage idFrontHelpModalPictograph;
                private final RemoteImage idFrontPictograph;
                private final RemoteImage passportFrontPictograph;
                private final RemoteImage passportSignaturePictograph;
                private final RemoteImage staticCaptureTipsIconPictograph;

                public /* synthetic */ CapturePage(RemoteImage remoteImage, RemoteImage remoteImage2, RemoteImage remoteImage3, RemoteImage remoteImage4, RemoteImage remoteImage5, RemoteImage remoteImage6, RemoteImage remoteImage7, RemoteImage remoteImage8, RemoteImage remoteImage9, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : remoteImage, (i & 2) != 0 ? null : remoteImage2, (i & 4) != 0 ? null : remoteImage3, (i & 8) != 0 ? null : remoteImage4, (i & 16) != 0 ? null : remoteImage5, (i & 32) != 0 ? null : remoteImage6, (i & 64) != 0 ? null : remoteImage7, (i & 128) != 0 ? null : remoteImage8, (i & 256) != 0 ? null : remoteImage9);
                }

                public static /* synthetic */ CapturePage copy$default(CapturePage capturePage, RemoteImage remoteImage, RemoteImage remoteImage2, RemoteImage remoteImage3, RemoteImage remoteImage4, RemoteImage remoteImage5, RemoteImage remoteImage6, RemoteImage remoteImage7, RemoteImage remoteImage8, RemoteImage remoteImage9, int i, Object obj) {
                    if ((i & 1) != 0) {
                        remoteImage = capturePage.idFrontPictograph;
                    }
                    if ((i & 2) != 0) {
                        remoteImage2 = capturePage.idBackPictograph;
                    }
                    if ((i & 4) != 0) {
                        remoteImage3 = capturePage.barcodePdf417Pictograph;
                    }
                    if ((i & 8) != 0) {
                        remoteImage4 = capturePage.passportFrontPictograph;
                    }
                    if ((i & 16) != 0) {
                        remoteImage5 = capturePage.passportSignaturePictograph;
                    }
                    if ((i & 32) != 0) {
                        remoteImage6 = capturePage.idFrontHelpModalPictograph;
                    }
                    if ((i & 64) != 0) {
                        remoteImage7 = capturePage.idBackHelpModalPictograph;
                    }
                    if ((i & 128) != 0) {
                        remoteImage8 = capturePage.barcodeHelpModalPictograph;
                    }
                    if ((i & 256) != 0) {
                        remoteImage9 = capturePage.staticCaptureTipsIconPictograph;
                    }
                    RemoteImage remoteImage10 = remoteImage8;
                    RemoteImage remoteImage11 = remoteImage9;
                    RemoteImage remoteImage12 = remoteImage6;
                    RemoteImage remoteImage13 = remoteImage7;
                    RemoteImage remoteImage14 = remoteImage5;
                    RemoteImage remoteImage15 = remoteImage3;
                    return capturePage.copy(remoteImage, remoteImage2, remoteImage15, remoteImage4, remoteImage14, remoteImage12, remoteImage13, remoteImage10, remoteImage11);
                }

                /* renamed from: component1, reason: from getter */
                public final RemoteImage getIdFrontPictograph() {
                    return this.idFrontPictograph;
                }

                /* renamed from: component2, reason: from getter */
                public final RemoteImage getIdBackPictograph() {
                    return this.idBackPictograph;
                }

                /* renamed from: component3, reason: from getter */
                public final RemoteImage getBarcodePdf417Pictograph() {
                    return this.barcodePdf417Pictograph;
                }

                /* renamed from: component4, reason: from getter */
                public final RemoteImage getPassportFrontPictograph() {
                    return this.passportFrontPictograph;
                }

                /* renamed from: component5, reason: from getter */
                public final RemoteImage getPassportSignaturePictograph() {
                    return this.passportSignaturePictograph;
                }

                /* renamed from: component6, reason: from getter */
                public final RemoteImage getIdFrontHelpModalPictograph() {
                    return this.idFrontHelpModalPictograph;
                }

                /* renamed from: component7, reason: from getter */
                public final RemoteImage getIdBackHelpModalPictograph() {
                    return this.idBackHelpModalPictograph;
                }

                /* renamed from: component8, reason: from getter */
                public final RemoteImage getBarcodeHelpModalPictograph() {
                    return this.barcodeHelpModalPictograph;
                }

                /* renamed from: component9, reason: from getter */
                public final RemoteImage getStaticCaptureTipsIconPictograph() {
                    return this.staticCaptureTipsIconPictograph;
                }

                public final CapturePage copy(RemoteImage idFrontPictograph, RemoteImage idBackPictograph, RemoteImage barcodePdf417Pictograph, RemoteImage passportFrontPictograph, RemoteImage passportSignaturePictograph, RemoteImage idFrontHelpModalPictograph, RemoteImage idBackHelpModalPictograph, RemoteImage barcodeHelpModalPictograph, RemoteImage staticCaptureTipsIconPictograph) {
                    return new CapturePage(idFrontPictograph, idBackPictograph, barcodePdf417Pictograph, passportFrontPictograph, passportSignaturePictograph, idFrontHelpModalPictograph, idBackHelpModalPictograph, barcodeHelpModalPictograph, staticCaptureTipsIconPictograph);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof CapturePage)) {
                        return false;
                    }
                    CapturePage capturePage = (CapturePage) other;
                    return Intrinsics.areEqual(this.idFrontPictograph, capturePage.idFrontPictograph) && Intrinsics.areEqual(this.idBackPictograph, capturePage.idBackPictograph) && Intrinsics.areEqual(this.barcodePdf417Pictograph, capturePage.barcodePdf417Pictograph) && Intrinsics.areEqual(this.passportFrontPictograph, capturePage.passportFrontPictograph) && Intrinsics.areEqual(this.passportSignaturePictograph, capturePage.passportSignaturePictograph) && Intrinsics.areEqual(this.idFrontHelpModalPictograph, capturePage.idFrontHelpModalPictograph) && Intrinsics.areEqual(this.idBackHelpModalPictograph, capturePage.idBackHelpModalPictograph) && Intrinsics.areEqual(this.barcodeHelpModalPictograph, capturePage.barcodeHelpModalPictograph) && Intrinsics.areEqual(this.staticCaptureTipsIconPictograph, capturePage.staticCaptureTipsIconPictograph);
                }

                public final RemoteImage getBarcodeHelpModalPictograph() {
                    return this.barcodeHelpModalPictograph;
                }

                public final RemoteImage getBarcodePdf417Pictograph() {
                    return this.barcodePdf417Pictograph;
                }

                public final RemoteImage getIdBackHelpModalPictograph() {
                    return this.idBackHelpModalPictograph;
                }

                public final RemoteImage getIdBackPictograph() {
                    return this.idBackPictograph;
                }

                public final RemoteImage getIdFrontHelpModalPictograph() {
                    return this.idFrontHelpModalPictograph;
                }

                public final RemoteImage getIdFrontPictograph() {
                    return this.idFrontPictograph;
                }

                public final RemoteImage getPassportFrontPictograph() {
                    return this.passportFrontPictograph;
                }

                public final RemoteImage getPassportSignaturePictograph() {
                    return this.passportSignaturePictograph;
                }

                public final RemoteImage getStaticCaptureTipsIconPictograph() {
                    return this.staticCaptureTipsIconPictograph;
                }

                public int hashCode() {
                    RemoteImage remoteImage = this.idFrontPictograph;
                    int hashCode = (remoteImage == null ? 0 : remoteImage.hashCode()) * 31;
                    RemoteImage remoteImage2 = this.idBackPictograph;
                    int hashCode2 = (hashCode + (remoteImage2 == null ? 0 : remoteImage2.hashCode())) * 31;
                    RemoteImage remoteImage3 = this.barcodePdf417Pictograph;
                    int hashCode3 = (hashCode2 + (remoteImage3 == null ? 0 : remoteImage3.hashCode())) * 31;
                    RemoteImage remoteImage4 = this.passportFrontPictograph;
                    int hashCode4 = (hashCode3 + (remoteImage4 == null ? 0 : remoteImage4.hashCode())) * 31;
                    RemoteImage remoteImage5 = this.passportSignaturePictograph;
                    int hashCode5 = (hashCode4 + (remoteImage5 == null ? 0 : remoteImage5.hashCode())) * 31;
                    RemoteImage remoteImage6 = this.idFrontHelpModalPictograph;
                    int hashCode6 = (hashCode5 + (remoteImage6 == null ? 0 : remoteImage6.hashCode())) * 31;
                    RemoteImage remoteImage7 = this.idBackHelpModalPictograph;
                    int hashCode7 = (hashCode6 + (remoteImage7 == null ? 0 : remoteImage7.hashCode())) * 31;
                    RemoteImage remoteImage8 = this.barcodeHelpModalPictograph;
                    int hashCode8 = (hashCode7 + (remoteImage8 == null ? 0 : remoteImage8.hashCode())) * 31;
                    RemoteImage remoteImage9 = this.staticCaptureTipsIconPictograph;
                    return hashCode8 + (remoteImage9 != null ? remoteImage9.hashCode() : 0);
                }

                public String toString() {
                    return "CapturePage(idFrontPictograph=" + this.idFrontPictograph + ", idBackPictograph=" + this.idBackPictograph + ", barcodePdf417Pictograph=" + this.barcodePdf417Pictograph + ", passportFrontPictograph=" + this.passportFrontPictograph + ", passportSignaturePictograph=" + this.passportSignaturePictograph + ", idFrontHelpModalPictograph=" + this.idFrontHelpModalPictograph + ", idBackHelpModalPictograph=" + this.idBackHelpModalPictograph + ", barcodeHelpModalPictograph=" + this.barcodeHelpModalPictograph + ", staticCaptureTipsIconPictograph=" + this.staticCaptureTipsIconPictograph + ")";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int flags) {
                    dest.getClass();
                    RemoteImage remoteImage = this.idFrontPictograph;
                    if (remoteImage == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        remoteImage.writeToParcel(dest, flags);
                    }
                    RemoteImage remoteImage2 = this.idBackPictograph;
                    if (remoteImage2 == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        remoteImage2.writeToParcel(dest, flags);
                    }
                    RemoteImage remoteImage3 = this.barcodePdf417Pictograph;
                    if (remoteImage3 == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        remoteImage3.writeToParcel(dest, flags);
                    }
                    RemoteImage remoteImage4 = this.passportFrontPictograph;
                    if (remoteImage4 == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        remoteImage4.writeToParcel(dest, flags);
                    }
                    RemoteImage remoteImage5 = this.passportSignaturePictograph;
                    if (remoteImage5 == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        remoteImage5.writeToParcel(dest, flags);
                    }
                    RemoteImage remoteImage6 = this.idFrontHelpModalPictograph;
                    if (remoteImage6 == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        remoteImage6.writeToParcel(dest, flags);
                    }
                    RemoteImage remoteImage7 = this.idBackHelpModalPictograph;
                    if (remoteImage7 == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        remoteImage7.writeToParcel(dest, flags);
                    }
                    RemoteImage remoteImage8 = this.barcodeHelpModalPictograph;
                    if (remoteImage8 == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        remoteImage8.writeToParcel(dest, flags);
                    }
                    RemoteImage remoteImage9 = this.staticCaptureTipsIconPictograph;
                    if (remoteImage9 == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        remoteImage9.writeToParcel(dest, flags);
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<CapturePage> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final CapturePage createFromParcel(Parcel parcel) {
                        parcel.getClass();
                        return new CapturePage(parcel.readInt() == 0 ? null : RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? RemoteImage.CREATOR.createFromParcel(parcel) : null);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final CapturePage[] newArray(int i) {
                        return new CapturePage[i];
                    }
                }

                public CapturePage(RemoteImage remoteImage, RemoteImage remoteImage2, RemoteImage remoteImage3, RemoteImage remoteImage4, RemoteImage remoteImage5, RemoteImage remoteImage6, RemoteImage remoteImage7, RemoteImage remoteImage8, RemoteImage remoteImage9) {
                    this.idFrontPictograph = remoteImage;
                    this.idBackPictograph = remoteImage2;
                    this.barcodePdf417Pictograph = remoteImage3;
                    this.passportFrontPictograph = remoteImage4;
                    this.passportSignaturePictograph = remoteImage5;
                    this.idFrontHelpModalPictograph = remoteImage6;
                    this.idBackHelpModalPictograph = remoteImage7;
                    this.barcodeHelpModalPictograph = remoteImage8;
                    this.staticCaptureTipsIconPictograph = remoteImage9;
                }

                public CapturePage() {
                    this(null, null, null, null, null, null, null, null, null, 511, null);
                }
            }

            @JsonClass(generateAdapter = true)
            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CheckPage;", "Landroid/os/Parcelable;", "iconFile", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;)V", "getIconFile", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class CheckPage implements Parcelable {
                public static final Parcelable.Creator<CheckPage> CREATOR = new Creator();
                private final RemoteImage iconFile;

                public /* synthetic */ CheckPage(RemoteImage remoteImage, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : remoteImage);
                }

                public static /* synthetic */ CheckPage copy$default(CheckPage checkPage, RemoteImage remoteImage, int i, Object obj) {
                    if ((i & 1) != 0) {
                        remoteImage = checkPage.iconFile;
                    }
                    return checkPage.copy(remoteImage);
                }

                /* renamed from: component1, reason: from getter */
                public final RemoteImage getIconFile() {
                    return this.iconFile;
                }

                public final CheckPage copy(RemoteImage iconFile) {
                    return new CheckPage(iconFile);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof CheckPage) && Intrinsics.areEqual(this.iconFile, ((CheckPage) other).iconFile);
                }

                public final RemoteImage getIconFile() {
                    return this.iconFile;
                }

                public int hashCode() {
                    RemoteImage remoteImage = this.iconFile;
                    if (remoteImage == null) {
                        return 0;
                    }
                    return remoteImage.hashCode();
                }

                public String toString() {
                    return "CheckPage(iconFile=" + this.iconFile + ")";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int flags) {
                    dest.getClass();
                    RemoteImage remoteImage = this.iconFile;
                    if (remoteImage == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        remoteImage.writeToParcel(dest, flags);
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<CheckPage> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final CheckPage createFromParcel(Parcel parcel) {
                        parcel.getClass();
                        return new CheckPage(parcel.readInt() == 0 ? null : RemoteImage.CREATOR.createFromParcel(parcel));
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final CheckPage[] newArray(int i) {
                        return new CheckPage[i];
                    }
                }

                public CheckPage(RemoteImage remoteImage) {
                    this.iconFile = remoteImage;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public CheckPage() {
                    this(null, 1, 0 == true ? 1 : 0);
                }
            }

            @JsonClass(generateAdapter = true)
            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$PendingPage;", "Landroid/os/Parcelable;", "headerPictograph", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "loadingPictograph", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;)V", "getHeaderPictograph", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "getLoadingPictograph", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class PendingPage implements Parcelable {
                public static final Parcelable.Creator<PendingPage> CREATOR = new Creator();
                private final RemoteImage headerPictograph;
                private final RemoteImage loadingPictograph;

                public /* synthetic */ PendingPage(RemoteImage remoteImage, RemoteImage remoteImage2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : remoteImage, (i & 2) != 0 ? null : remoteImage2);
                }

                public static /* synthetic */ PendingPage copy$default(PendingPage pendingPage, RemoteImage remoteImage, RemoteImage remoteImage2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        remoteImage = pendingPage.headerPictograph;
                    }
                    if ((i & 2) != 0) {
                        remoteImage2 = pendingPage.loadingPictograph;
                    }
                    return pendingPage.copy(remoteImage, remoteImage2);
                }

                /* renamed from: component1, reason: from getter */
                public final RemoteImage getHeaderPictograph() {
                    return this.headerPictograph;
                }

                /* renamed from: component2, reason: from getter */
                public final RemoteImage getLoadingPictograph() {
                    return this.loadingPictograph;
                }

                public final PendingPage copy(RemoteImage headerPictograph, RemoteImage loadingPictograph) {
                    return new PendingPage(headerPictograph, loadingPictograph);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof PendingPage)) {
                        return false;
                    }
                    PendingPage pendingPage = (PendingPage) other;
                    return Intrinsics.areEqual(this.headerPictograph, pendingPage.headerPictograph) && Intrinsics.areEqual(this.loadingPictograph, pendingPage.loadingPictograph);
                }

                public final RemoteImage getHeaderPictograph() {
                    return this.headerPictograph;
                }

                public final RemoteImage getLoadingPictograph() {
                    return this.loadingPictograph;
                }

                public int hashCode() {
                    RemoteImage remoteImage = this.headerPictograph;
                    int hashCode = (remoteImage == null ? 0 : remoteImage.hashCode()) * 31;
                    RemoteImage remoteImage2 = this.loadingPictograph;
                    return hashCode + (remoteImage2 != null ? remoteImage2.hashCode() : 0);
                }

                public String toString() {
                    return "PendingPage(headerPictograph=" + this.headerPictograph + ", loadingPictograph=" + this.loadingPictograph + ")";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int flags) {
                    dest.getClass();
                    RemoteImage remoteImage = this.headerPictograph;
                    if (remoteImage == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        remoteImage.writeToParcel(dest, flags);
                    }
                    RemoteImage remoteImage2 = this.loadingPictograph;
                    if (remoteImage2 == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        remoteImage2.writeToParcel(dest, flags);
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<PendingPage> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final PendingPage createFromParcel(Parcel parcel) {
                        parcel.getClass();
                        return new PendingPage(parcel.readInt() == 0 ? null : RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? RemoteImage.CREATOR.createFromParcel(parcel) : null);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final PendingPage[] newArray(int i) {
                        return new PendingPage[i];
                    }
                }

                public PendingPage(RemoteImage remoteImage, RemoteImage remoteImage2) {
                    this.headerPictograph = remoteImage;
                    this.loadingPictograph = remoteImage2;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public PendingPage() {
                    this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                }
            }

            @JsonClass(generateAdapter = true)
            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001aHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001aR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006'"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$PromptPage;", "Landroid/os/Parcelable;", "headerPictograph", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "idFrontPictograph", "idBackPictograph", "barcodePdf417Pictograph", "passportFrontPictograph", "passportSignaturePictograph", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;)V", "getHeaderPictograph", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "getIdFrontPictograph", "getIdBackPictograph", "getBarcodePdf417Pictograph", "getPassportFrontPictograph", "getPassportSignaturePictograph", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class PromptPage implements Parcelable {
                public static final Parcelable.Creator<PromptPage> CREATOR = new Creator();
                private final RemoteImage barcodePdf417Pictograph;
                private final RemoteImage headerPictograph;
                private final RemoteImage idBackPictograph;
                private final RemoteImage idFrontPictograph;
                private final RemoteImage passportFrontPictograph;
                private final RemoteImage passportSignaturePictograph;

                public /* synthetic */ PromptPage(RemoteImage remoteImage, RemoteImage remoteImage2, RemoteImage remoteImage3, RemoteImage remoteImage4, RemoteImage remoteImage5, RemoteImage remoteImage6, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : remoteImage, (i & 2) != 0 ? null : remoteImage2, (i & 4) != 0 ? null : remoteImage3, (i & 8) != 0 ? null : remoteImage4, (i & 16) != 0 ? null : remoteImage5, (i & 32) != 0 ? null : remoteImage6);
                }

                public static /* synthetic */ PromptPage copy$default(PromptPage promptPage, RemoteImage remoteImage, RemoteImage remoteImage2, RemoteImage remoteImage3, RemoteImage remoteImage4, RemoteImage remoteImage5, RemoteImage remoteImage6, int i, Object obj) {
                    if ((i & 1) != 0) {
                        remoteImage = promptPage.headerPictograph;
                    }
                    if ((i & 2) != 0) {
                        remoteImage2 = promptPage.idFrontPictograph;
                    }
                    if ((i & 4) != 0) {
                        remoteImage3 = promptPage.idBackPictograph;
                    }
                    if ((i & 8) != 0) {
                        remoteImage4 = promptPage.barcodePdf417Pictograph;
                    }
                    if ((i & 16) != 0) {
                        remoteImage5 = promptPage.passportFrontPictograph;
                    }
                    if ((i & 32) != 0) {
                        remoteImage6 = promptPage.passportSignaturePictograph;
                    }
                    RemoteImage remoteImage7 = remoteImage5;
                    RemoteImage remoteImage8 = remoteImage6;
                    return promptPage.copy(remoteImage, remoteImage2, remoteImage3, remoteImage4, remoteImage7, remoteImage8);
                }

                /* renamed from: component1, reason: from getter */
                public final RemoteImage getHeaderPictograph() {
                    return this.headerPictograph;
                }

                /* renamed from: component2, reason: from getter */
                public final RemoteImage getIdFrontPictograph() {
                    return this.idFrontPictograph;
                }

                /* renamed from: component3, reason: from getter */
                public final RemoteImage getIdBackPictograph() {
                    return this.idBackPictograph;
                }

                /* renamed from: component4, reason: from getter */
                public final RemoteImage getBarcodePdf417Pictograph() {
                    return this.barcodePdf417Pictograph;
                }

                /* renamed from: component5, reason: from getter */
                public final RemoteImage getPassportFrontPictograph() {
                    return this.passportFrontPictograph;
                }

                /* renamed from: component6, reason: from getter */
                public final RemoteImage getPassportSignaturePictograph() {
                    return this.passportSignaturePictograph;
                }

                public final PromptPage copy(RemoteImage headerPictograph, RemoteImage idFrontPictograph, RemoteImage idBackPictograph, RemoteImage barcodePdf417Pictograph, RemoteImage passportFrontPictograph, RemoteImage passportSignaturePictograph) {
                    return new PromptPage(headerPictograph, idFrontPictograph, idBackPictograph, barcodePdf417Pictograph, passportFrontPictograph, passportSignaturePictograph);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof PromptPage)) {
                        return false;
                    }
                    PromptPage promptPage = (PromptPage) other;
                    return Intrinsics.areEqual(this.headerPictograph, promptPage.headerPictograph) && Intrinsics.areEqual(this.idFrontPictograph, promptPage.idFrontPictograph) && Intrinsics.areEqual(this.idBackPictograph, promptPage.idBackPictograph) && Intrinsics.areEqual(this.barcodePdf417Pictograph, promptPage.barcodePdf417Pictograph) && Intrinsics.areEqual(this.passportFrontPictograph, promptPage.passportFrontPictograph) && Intrinsics.areEqual(this.passportSignaturePictograph, promptPage.passportSignaturePictograph);
                }

                public final RemoteImage getBarcodePdf417Pictograph() {
                    return this.barcodePdf417Pictograph;
                }

                public final RemoteImage getHeaderPictograph() {
                    return this.headerPictograph;
                }

                public final RemoteImage getIdBackPictograph() {
                    return this.idBackPictograph;
                }

                public final RemoteImage getIdFrontPictograph() {
                    return this.idFrontPictograph;
                }

                public final RemoteImage getPassportFrontPictograph() {
                    return this.passportFrontPictograph;
                }

                public final RemoteImage getPassportSignaturePictograph() {
                    return this.passportSignaturePictograph;
                }

                public int hashCode() {
                    RemoteImage remoteImage = this.headerPictograph;
                    int hashCode = (remoteImage == null ? 0 : remoteImage.hashCode()) * 31;
                    RemoteImage remoteImage2 = this.idFrontPictograph;
                    int hashCode2 = (hashCode + (remoteImage2 == null ? 0 : remoteImage2.hashCode())) * 31;
                    RemoteImage remoteImage3 = this.idBackPictograph;
                    int hashCode3 = (hashCode2 + (remoteImage3 == null ? 0 : remoteImage3.hashCode())) * 31;
                    RemoteImage remoteImage4 = this.barcodePdf417Pictograph;
                    int hashCode4 = (hashCode3 + (remoteImage4 == null ? 0 : remoteImage4.hashCode())) * 31;
                    RemoteImage remoteImage5 = this.passportFrontPictograph;
                    int hashCode5 = (hashCode4 + (remoteImage5 == null ? 0 : remoteImage5.hashCode())) * 31;
                    RemoteImage remoteImage6 = this.passportSignaturePictograph;
                    return hashCode5 + (remoteImage6 != null ? remoteImage6.hashCode() : 0);
                }

                public String toString() {
                    return "PromptPage(headerPictograph=" + this.headerPictograph + ", idFrontPictograph=" + this.idFrontPictograph + ", idBackPictograph=" + this.idBackPictograph + ", barcodePdf417Pictograph=" + this.barcodePdf417Pictograph + ", passportFrontPictograph=" + this.passportFrontPictograph + ", passportSignaturePictograph=" + this.passportSignaturePictograph + ")";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int flags) {
                    dest.getClass();
                    RemoteImage remoteImage = this.headerPictograph;
                    if (remoteImage == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        remoteImage.writeToParcel(dest, flags);
                    }
                    RemoteImage remoteImage2 = this.idFrontPictograph;
                    if (remoteImage2 == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        remoteImage2.writeToParcel(dest, flags);
                    }
                    RemoteImage remoteImage3 = this.idBackPictograph;
                    if (remoteImage3 == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        remoteImage3.writeToParcel(dest, flags);
                    }
                    RemoteImage remoteImage4 = this.barcodePdf417Pictograph;
                    if (remoteImage4 == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        remoteImage4.writeToParcel(dest, flags);
                    }
                    RemoteImage remoteImage5 = this.passportFrontPictograph;
                    if (remoteImage5 == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        remoteImage5.writeToParcel(dest, flags);
                    }
                    RemoteImage remoteImage6 = this.passportSignaturePictograph;
                    if (remoteImage6 == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        remoteImage6.writeToParcel(dest, flags);
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<PromptPage> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final PromptPage createFromParcel(Parcel parcel) {
                        parcel.getClass();
                        return new PromptPage(parcel.readInt() == 0 ? null : RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? RemoteImage.CREATOR.createFromParcel(parcel) : null);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final PromptPage[] newArray(int i) {
                        return new PromptPage[i];
                    }
                }

                public PromptPage(RemoteImage remoteImage, RemoteImage remoteImage2, RemoteImage remoteImage3, RemoteImage remoteImage4, RemoteImage remoteImage5, RemoteImage remoteImage6) {
                    this.headerPictograph = remoteImage;
                    this.idFrontPictograph = remoteImage2;
                    this.idBackPictograph = remoteImage3;
                    this.barcodePdf417Pictograph = remoteImage4;
                    this.passportFrontPictograph = remoteImage5;
                    this.passportSignaturePictograph = remoteImage6;
                }

                public PromptPage() {
                    this(null, null, null, null, null, null, 63, null);
                }
            }

            @JsonClass(generateAdapter = true)
            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0016\u001a\u00020\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0017R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006$"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$SelectPage;", "Landroid/os/Parcelable;", "headerPictograph", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "iconDriversLicense", "iconPassport", "iconNationalId", "iconGovernmentId", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;)V", "getHeaderPictograph", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "getIconDriversLicense", "getIconPassport", "getIconNationalId", "getIconGovernmentId", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class SelectPage implements Parcelable {
                public static final Parcelable.Creator<SelectPage> CREATOR = new Creator();
                private final RemoteImage headerPictograph;
                private final RemoteImage iconDriversLicense;
                private final RemoteImage iconGovernmentId;
                private final RemoteImage iconNationalId;
                private final RemoteImage iconPassport;

                public /* synthetic */ SelectPage(RemoteImage remoteImage, RemoteImage remoteImage2, RemoteImage remoteImage3, RemoteImage remoteImage4, RemoteImage remoteImage5, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : remoteImage, (i & 2) != 0 ? null : remoteImage2, (i & 4) != 0 ? null : remoteImage3, (i & 8) != 0 ? null : remoteImage4, (i & 16) != 0 ? null : remoteImage5);
                }

                public static /* synthetic */ SelectPage copy$default(SelectPage selectPage, RemoteImage remoteImage, RemoteImage remoteImage2, RemoteImage remoteImage3, RemoteImage remoteImage4, RemoteImage remoteImage5, int i, Object obj) {
                    if ((i & 1) != 0) {
                        remoteImage = selectPage.headerPictograph;
                    }
                    if ((i & 2) != 0) {
                        remoteImage2 = selectPage.iconDriversLicense;
                    }
                    if ((i & 4) != 0) {
                        remoteImage3 = selectPage.iconPassport;
                    }
                    if ((i & 8) != 0) {
                        remoteImage4 = selectPage.iconNationalId;
                    }
                    if ((i & 16) != 0) {
                        remoteImage5 = selectPage.iconGovernmentId;
                    }
                    RemoteImage remoteImage6 = remoteImage5;
                    RemoteImage remoteImage7 = remoteImage3;
                    return selectPage.copy(remoteImage, remoteImage2, remoteImage7, remoteImage4, remoteImage6);
                }

                /* renamed from: component1, reason: from getter */
                public final RemoteImage getHeaderPictograph() {
                    return this.headerPictograph;
                }

                /* renamed from: component2, reason: from getter */
                public final RemoteImage getIconDriversLicense() {
                    return this.iconDriversLicense;
                }

                /* renamed from: component3, reason: from getter */
                public final RemoteImage getIconPassport() {
                    return this.iconPassport;
                }

                /* renamed from: component4, reason: from getter */
                public final RemoteImage getIconNationalId() {
                    return this.iconNationalId;
                }

                /* renamed from: component5, reason: from getter */
                public final RemoteImage getIconGovernmentId() {
                    return this.iconGovernmentId;
                }

                public final SelectPage copy(RemoteImage headerPictograph, RemoteImage iconDriversLicense, RemoteImage iconPassport, RemoteImage iconNationalId, RemoteImage iconGovernmentId) {
                    return new SelectPage(headerPictograph, iconDriversLicense, iconPassport, iconNationalId, iconGovernmentId);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof SelectPage)) {
                        return false;
                    }
                    SelectPage selectPage = (SelectPage) other;
                    return Intrinsics.areEqual(this.headerPictograph, selectPage.headerPictograph) && Intrinsics.areEqual(this.iconDriversLicense, selectPage.iconDriversLicense) && Intrinsics.areEqual(this.iconPassport, selectPage.iconPassport) && Intrinsics.areEqual(this.iconNationalId, selectPage.iconNationalId) && Intrinsics.areEqual(this.iconGovernmentId, selectPage.iconGovernmentId);
                }

                public final RemoteImage getHeaderPictograph() {
                    return this.headerPictograph;
                }

                public final RemoteImage getIconDriversLicense() {
                    return this.iconDriversLicense;
                }

                public final RemoteImage getIconGovernmentId() {
                    return this.iconGovernmentId;
                }

                public final RemoteImage getIconNationalId() {
                    return this.iconNationalId;
                }

                public final RemoteImage getIconPassport() {
                    return this.iconPassport;
                }

                public int hashCode() {
                    RemoteImage remoteImage = this.headerPictograph;
                    int hashCode = (remoteImage == null ? 0 : remoteImage.hashCode()) * 31;
                    RemoteImage remoteImage2 = this.iconDriversLicense;
                    int hashCode2 = (hashCode + (remoteImage2 == null ? 0 : remoteImage2.hashCode())) * 31;
                    RemoteImage remoteImage3 = this.iconPassport;
                    int hashCode3 = (hashCode2 + (remoteImage3 == null ? 0 : remoteImage3.hashCode())) * 31;
                    RemoteImage remoteImage4 = this.iconNationalId;
                    int hashCode4 = (hashCode3 + (remoteImage4 == null ? 0 : remoteImage4.hashCode())) * 31;
                    RemoteImage remoteImage5 = this.iconGovernmentId;
                    return hashCode4 + (remoteImage5 != null ? remoteImage5.hashCode() : 0);
                }

                public String toString() {
                    return "SelectPage(headerPictograph=" + this.headerPictograph + ", iconDriversLicense=" + this.iconDriversLicense + ", iconPassport=" + this.iconPassport + ", iconNationalId=" + this.iconNationalId + ", iconGovernmentId=" + this.iconGovernmentId + ")";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int flags) {
                    dest.getClass();
                    RemoteImage remoteImage = this.headerPictograph;
                    if (remoteImage == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        remoteImage.writeToParcel(dest, flags);
                    }
                    RemoteImage remoteImage2 = this.iconDriversLicense;
                    if (remoteImage2 == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        remoteImage2.writeToParcel(dest, flags);
                    }
                    RemoteImage remoteImage3 = this.iconPassport;
                    if (remoteImage3 == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        remoteImage3.writeToParcel(dest, flags);
                    }
                    RemoteImage remoteImage4 = this.iconNationalId;
                    if (remoteImage4 == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        remoteImage4.writeToParcel(dest, flags);
                    }
                    RemoteImage remoteImage5 = this.iconGovernmentId;
                    if (remoteImage5 == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        remoteImage5.writeToParcel(dest, flags);
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<SelectPage> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final SelectPage createFromParcel(Parcel parcel) {
                        parcel.getClass();
                        return new SelectPage(parcel.readInt() == 0 ? null : RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? RemoteImage.CREATOR.createFromParcel(parcel) : null);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final SelectPage[] newArray(int i) {
                        return new SelectPage[i];
                    }
                }

                public SelectPage(RemoteImage remoteImage, RemoteImage remoteImage2, RemoteImage remoteImage3, RemoteImage remoteImage4, RemoteImage remoteImage5) {
                    this.headerPictograph = remoteImage;
                    this.iconDriversLicense = remoteImage2;
                    this.iconPassport = remoteImage3;
                    this.iconNationalId = remoteImage4;
                    this.iconGovernmentId = remoteImage5;
                }

                public SelectPage() {
                    this(null, null, null, null, null, 31, null);
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<AssetConfig> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AssetConfig createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new AssetConfig(parcel.readInt() == 0 ? null : SelectPage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : PromptPage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CapturePage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CheckPage.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? PendingPage.CREATOR.createFromParcel(parcel) : null);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AssetConfig[] newArray(int i) {
                    return new AssetConfig[i];
                }
            }

            public AssetConfig(SelectPage selectPage, PromptPage promptPage, CapturePage capturePage, CheckPage checkPage, PendingPage pendingPage) {
                this.selectPage = selectPage;
                this.promptPage = promptPage;
                this.capturePage = capturePage;
                this.checkPage = checkPage;
                this.pendingPage = pendingPage;
            }

            public AssetConfig() {
                this(null, null, null, null, null, 31, null);
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @JsonClass(generateAdapter = false)
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CaptureFileType;", "", "<init>", "(Ljava/lang/String;I)V", "Image", "Video", "Unknown", "Companion", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class CaptureFileType {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ CaptureFileType[] $VALUES;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            public static final CaptureFileType Image = new CaptureFileType("Image", 0);
            public static final CaptureFileType Video = new CaptureFileType("Video", 1);
            public static final CaptureFileType Unknown = new CaptureFileType("Unknown", 2);

            private static final /* synthetic */ CaptureFileType[] $values() {
                return new CaptureFileType[]{Image, Video, Unknown};
            }

            static {
                CaptureFileType[] $values = $values();
                $VALUES = $values;
                $ENTRIES = Tags.enumEntries($values);
                INSTANCE = new Companion(null);
            }

            private CaptureFileType(String str, int i) {
            }

            public static EnumEntries getEntries() {
                return $ENTRIES;
            }

            public static CaptureFileType valueOf(String str) {
                return (CaptureFileType) Enum.valueOf(CaptureFileType.class, str);
            }

            public static CaptureFileType[] values() {
                return (CaptureFileType[]) $VALUES.clone();
            }

            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0017J\u001a\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0017¨\u0006\r"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CaptureFileType$Companion;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CaptureFileType;", "<init>", "()V", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Companion extends JsonAdapter {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                @Override // com.squareup.moshi.JsonAdapter
                @FromJson
                public CaptureFileType fromJson(JsonReader reader) {
                    reader.getClass();
                    Object readJsonValue = reader.readJsonValue();
                    return Intrinsics.areEqual(readJsonValue, "video") ? CaptureFileType.Video : Intrinsics.areEqual(readJsonValue, "image") ? CaptureFileType.Image : CaptureFileType.Unknown;
                }

                private Companion() {
                }

                @Override // com.squareup.moshi.JsonAdapter
                @ToJson
                public void toJson(JsonWriter writer, CaptureFileType value) {
                    writer.getClass();
                }
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @JsonClass(generateAdapter = false)
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$PassportNfcOption;", "", "<init>", "(Ljava/lang/String;I)V", "REQUIRED", "OPTIONAL", "REQUIRED_IF_SUPPORTED", "Companion", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class PassportNfcOption {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ PassportNfcOption[] $VALUES;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            public static final PassportNfcOption REQUIRED = new PassportNfcOption("REQUIRED", 0);
            public static final PassportNfcOption OPTIONAL = new PassportNfcOption("OPTIONAL", 1);
            public static final PassportNfcOption REQUIRED_IF_SUPPORTED = new PassportNfcOption("REQUIRED_IF_SUPPORTED", 2);

            private static final /* synthetic */ PassportNfcOption[] $values() {
                return new PassportNfcOption[]{REQUIRED, OPTIONAL, REQUIRED_IF_SUPPORTED};
            }

            static {
                PassportNfcOption[] $values = $values();
                $VALUES = $values;
                $ENTRIES = Tags.enumEntries($values);
                INSTANCE = new Companion(null);
            }

            private PassportNfcOption(String str, int i) {
            }

            public static EnumEntries getEntries() {
                return $ENTRIES;
            }

            public static PassportNfcOption valueOf(String str) {
                return (PassportNfcOption) Enum.valueOf(PassportNfcOption.class, str);
            }

            public static PassportNfcOption[] values() {
                return (PassportNfcOption[]) $VALUES.clone();
            }

            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0017J\u001a\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0017¨\u0006\r"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$PassportNfcOption$Companion;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$PassportNfcOption;", "<init>", "()V", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Companion extends JsonAdapter {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                @Override // com.squareup.moshi.JsonAdapter
                @FromJson
                public PassportNfcOption fromJson(JsonReader reader) {
                    reader.getClass();
                    Object readJsonValue = reader.readJsonValue();
                    if (Intrinsics.areEqual(readJsonValue, "required")) {
                        return PassportNfcOption.REQUIRED;
                    }
                    if (!Intrinsics.areEqual(readJsonValue, "optional") && Intrinsics.areEqual(readJsonValue, "required_if_supported")) {
                        return PassportNfcOption.REQUIRED_IF_SUPPORTED;
                    }
                    return PassportNfcOption.OPTIONAL;
                }

                private Companion() {
                }

                @Override // com.squareup.moshi.JsonAdapter
                @ToJson
                public void toJson(JsonWriter writer, PassportNfcOption value) {
                    writer.getClass();
                }
            }
        }

        @JsonClass(generateAdapter = false)
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\b¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0012\u001a\u00020\u0013J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001a"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$SelectPage;", "Landroid/os/Parcelable;", "title", "", "prompt", "choose", "disclaimer", "idClassToName", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getTitle", "()Ljava/lang/String;", "getPrompt", "getChoose", "getDisclaimer", "getIdClassToName", "()Ljava/util/Map;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class SelectPage implements Parcelable {
            private final String choose;
            private final String disclaimer;
            private final Map<String, String> idClassToName;
            private final String prompt;
            private final String title;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            public static final Parcelable.Creator<SelectPage> CREATOR = new Creator();

            public SelectPage(String str, String str2, String str3, String str4, Map<String, String> map) {
                str.getClass();
                str2.getClass();
                str3.getClass();
                map.getClass();
                this.title = str;
                this.prompt = str2;
                this.choose = str3;
                this.disclaimer = str4;
                this.idClassToName = map;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final String getChoose() {
                return this.choose;
            }

            public final String getDisclaimer() {
                return this.disclaimer;
            }

            public final Map<String, String> getIdClassToName() {
                return this.idClassToName;
            }

            public final String getPrompt() {
                return this.prompt;
            }

            public final String getTitle() {
                return this.title;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.getClass();
                dest.writeString(this.title);
                dest.writeString(this.prompt);
                dest.writeString(this.choose);
                dest.writeString(this.disclaimer);
                Iterator m = NavAction$$ExternalSyntheticOutline0.m(this.idClassToName, dest);
                while (m.hasNext()) {
                    Map.Entry entry = (Map.Entry) m.next();
                    dest.writeString((String) entry.getKey());
                    dest.writeString((String) entry.getValue());
                }
            }

            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0017J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0017¨\u0006\r"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$SelectPage$Companion;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$SelectPage;", "<init>", "()V", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Companion extends JsonAdapter {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
                java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
                	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
                	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
                 */
                @Override // com.squareup.moshi.JsonAdapter
                @FromJson
                public SelectPage fromJson(JsonReader reader) {
                    reader.getClass();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    reader.beginObject();
                    String str = "";
                    String str2 = str;
                    String str3 = str2;
                    String str4 = null;
                    while (reader.hasNext()) {
                        String nextName = reader.nextName();
                        if (nextName != null) {
                            switch (nextName.hashCode()) {
                                case -979805852:
                                    if (!nextName.equals("prompt")) {
                                        break;
                                    } else {
                                        str2 = reader.nextString();
                                        str2.getClass();
                                        break;
                                    }
                                case 110371416:
                                    if (!nextName.equals("title")) {
                                        break;
                                    } else {
                                        str = reader.nextString();
                                        str.getClass();
                                        break;
                                    }
                                case 432371099:
                                    if (!nextName.equals("disclaimer")) {
                                        break;
                                    } else {
                                        str4 = JsonReaderUtilsKt.nextStringOrNull(reader);
                                        break;
                                    }
                                case 1282023341:
                                    if (!nextName.equals("optionNotice")) {
                                        break;
                                    } else {
                                        str3 = reader.nextString();
                                        str3.getClass();
                                        break;
                                    }
                            }
                        }
                        if (reader.hasNext() && reader.peek() == JsonReader.Token.STRING) {
                            linkedHashMap.put(nextName, reader.nextString());
                        } else {
                            reader.skipValue();
                        }
                    }
                    reader.endObject();
                    return new SelectPage(str, str2, str3, str4, linkedHashMap);
                }

                private Companion() {
                }

                @Override // com.squareup.moshi.JsonAdapter
                @ToJson
                public void toJson(JsonWriter writer, SelectPage value) {
                    writer.getClass();
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<SelectPage> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SelectPage createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    String readString4 = parcel.readString();
                    int readInt = parcel.readInt();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
                    for (int i = 0; i != readInt; i++) {
                        linkedHashMap.put(parcel.readString(), parcel.readString());
                    }
                    return new SelectPage(readString, readString2, readString3, readString4, linkedHashMap);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SelectPage[] newArray(int i) {
                    return new SelectPage[i];
                }
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @JsonClass(generateAdapter = false)
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$VideoCaptureMethod;", "", "<init>", "(Ljava/lang/String;I)V", "Stream", "Upload", "None", "Companion", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class VideoCaptureMethod {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ VideoCaptureMethod[] $VALUES;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            public static final VideoCaptureMethod Stream = new VideoCaptureMethod("Stream", 0);
            public static final VideoCaptureMethod Upload = new VideoCaptureMethod("Upload", 1);
            public static final VideoCaptureMethod None = new VideoCaptureMethod("None", 2);

            private static final /* synthetic */ VideoCaptureMethod[] $values() {
                return new VideoCaptureMethod[]{Stream, Upload, None};
            }

            static {
                VideoCaptureMethod[] $values = $values();
                $VALUES = $values;
                $ENTRIES = Tags.enumEntries($values);
                INSTANCE = new Companion(null);
            }

            private VideoCaptureMethod(String str, int i) {
            }

            public static EnumEntries getEntries() {
                return $ENTRIES;
            }

            public static VideoCaptureMethod valueOf(String str) {
                return (VideoCaptureMethod) Enum.valueOf(VideoCaptureMethod.class, str);
            }

            public static VideoCaptureMethod[] values() {
                return (VideoCaptureMethod[]) $VALUES.clone();
            }

            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0017J\u001a\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0017¨\u0006\r"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$VideoCaptureMethod$Companion;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$VideoCaptureMethod;", "<init>", "()V", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Companion extends JsonAdapter {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                @Override // com.squareup.moshi.JsonAdapter
                @FromJson
                public VideoCaptureMethod fromJson(JsonReader reader) {
                    reader.getClass();
                    Object readJsonValue = reader.readJsonValue();
                    return Intrinsics.areEqual(readJsonValue, "stream") ? VideoCaptureMethod.Stream : Intrinsics.areEqual(readJsonValue, "upload") ? VideoCaptureMethod.Upload : VideoCaptureMethod.None;
                }

                private Companion() {
                }

                @Override // com.squareup.moshi.JsonAdapter
                @ToJson
                public void toJson(JsonWriter writer, VideoCaptureMethod value) {
                    writer.getClass();
                }
            }
        }

        @JsonClass(generateAdapter = true)
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J2\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u0002\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006 "}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AutoClassificationConfig;", "Landroid/os/Parcelable;", "isEnabled", "", "extractTextFromImage", "capturePageConfig", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig;", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getExtractTextFromImage", "getCapturePageConfig", "()Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig;", "component1", "component2", "component3", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig;)Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AutoClassificationConfig;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class AutoClassificationConfig implements Parcelable {
            public static final Parcelable.Creator<AutoClassificationConfig> CREATOR = new Creator();
            private final CapturePageConfig capturePageConfig;
            private final Boolean extractTextFromImage;
            private final Boolean isEnabled;

            public /* synthetic */ AutoClassificationConfig(Boolean bool, Boolean bool2, CapturePageConfig capturePageConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : capturePageConfig);
            }

            public static /* synthetic */ AutoClassificationConfig copy$default(AutoClassificationConfig autoClassificationConfig, Boolean bool, Boolean bool2, CapturePageConfig capturePageConfig, int i, Object obj) {
                if ((i & 1) != 0) {
                    bool = autoClassificationConfig.isEnabled;
                }
                if ((i & 2) != 0) {
                    bool2 = autoClassificationConfig.extractTextFromImage;
                }
                if ((i & 4) != 0) {
                    capturePageConfig = autoClassificationConfig.capturePageConfig;
                }
                return autoClassificationConfig.copy(bool, bool2, capturePageConfig);
            }

            /* renamed from: component1, reason: from getter */
            public final Boolean getIsEnabled() {
                return this.isEnabled;
            }

            /* renamed from: component2, reason: from getter */
            public final Boolean getExtractTextFromImage() {
                return this.extractTextFromImage;
            }

            /* renamed from: component3, reason: from getter */
            public final CapturePageConfig getCapturePageConfig() {
                return this.capturePageConfig;
            }

            public final AutoClassificationConfig copy(Boolean isEnabled, Boolean extractTextFromImage, CapturePageConfig capturePageConfig) {
                return new AutoClassificationConfig(isEnabled, extractTextFromImage, capturePageConfig);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AutoClassificationConfig)) {
                    return false;
                }
                AutoClassificationConfig autoClassificationConfig = (AutoClassificationConfig) other;
                return Intrinsics.areEqual(this.isEnabled, autoClassificationConfig.isEnabled) && Intrinsics.areEqual(this.extractTextFromImage, autoClassificationConfig.extractTextFromImage) && Intrinsics.areEqual(this.capturePageConfig, autoClassificationConfig.capturePageConfig);
            }

            public final CapturePageConfig getCapturePageConfig() {
                return this.capturePageConfig;
            }

            public final Boolean getExtractTextFromImage() {
                return this.extractTextFromImage;
            }

            public int hashCode() {
                Boolean bool = this.isEnabled;
                int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                Boolean bool2 = this.extractTextFromImage;
                int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                CapturePageConfig capturePageConfig = this.capturePageConfig;
                return hashCode2 + (capturePageConfig != null ? capturePageConfig.hashCode() : 0);
            }

            public final Boolean isEnabled() {
                return this.isEnabled;
            }

            public String toString() {
                return "AutoClassificationConfig(isEnabled=" + this.isEnabled + ", extractTextFromImage=" + this.extractTextFromImage + ", capturePageConfig=" + this.capturePageConfig + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.getClass();
                Boolean bool = this.isEnabled;
                if (bool == null) {
                    dest.writeInt(0);
                } else {
                    CameraState$Type$EnumUnboxingLocalUtility.m(dest, 1, bool);
                }
                Boolean bool2 = this.extractTextFromImage;
                if (bool2 == null) {
                    dest.writeInt(0);
                } else {
                    CameraState$Type$EnumUnboxingLocalUtility.m(dest, 1, bool2);
                }
                CapturePageConfig capturePageConfig = this.capturePageConfig;
                if (capturePageConfig == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    capturePageConfig.writeToParcel(dest, flags);
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<AutoClassificationConfig> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AutoClassificationConfig createFromParcel(Parcel parcel) {
                    Boolean valueOf;
                    Boolean valueOf2;
                    parcel.getClass();
                    if (parcel.readInt() == 0) {
                        valueOf = null;
                    } else {
                        valueOf = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    if (parcel.readInt() == 0) {
                        valueOf2 = null;
                    } else {
                        valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    return new AutoClassificationConfig(valueOf, valueOf2, parcel.readInt() != 0 ? CapturePageConfig.CREATOR.createFromParcel(parcel) : null);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AutoClassificationConfig[] newArray(int i) {
                    return new AutoClassificationConfig[i];
                }
            }

            public AutoClassificationConfig(Boolean bool, Boolean bool2, CapturePageConfig capturePageConfig) {
                this.isEnabled = bool;
                this.extractTextFromImage = bool2;
                this.capturePageConfig = capturePageConfig;
            }

            public AutoClassificationConfig() {
                this(null, null, null, 7, null);
            }
        }

        @JsonClass(generateAdapter = true)
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001Ba\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0018\u001a\u00020\u0019J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0019R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006\u001f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AutoClassificationPage;", "Landroid/os/Parcelable;", "unableToClassifyDocumentTitle", "", "unableToClassifyDocumentContinueButtonText", "idClassRejectedTitle", "idClassRejectedContinueButtonText", "countryInputTitle", "idClassInputTitle", "manualClassificationTitle", "manualClassificationContinueButtonText", "autoClassificationCaptureTipText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getUnableToClassifyDocumentTitle", "()Ljava/lang/String;", "getUnableToClassifyDocumentContinueButtonText", "getIdClassRejectedTitle", "getIdClassRejectedContinueButtonText", "getCountryInputTitle", "getIdClassInputTitle", "getManualClassificationTitle", "getManualClassificationContinueButtonText", "getAutoClassificationCaptureTipText", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class AutoClassificationPage implements Parcelable {
            public static final Parcelable.Creator<AutoClassificationPage> CREATOR = new Creator();
            private final String autoClassificationCaptureTipText;
            private final String countryInputTitle;
            private final String idClassInputTitle;
            private final String idClassRejectedContinueButtonText;
            private final String idClassRejectedTitle;
            private final String manualClassificationContinueButtonText;
            private final String manualClassificationTitle;
            private final String unableToClassifyDocumentContinueButtonText;
            private final String unableToClassifyDocumentTitle;

            public AutoClassificationPage(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
                this.unableToClassifyDocumentTitle = str;
                this.unableToClassifyDocumentContinueButtonText = str2;
                this.idClassRejectedTitle = str3;
                this.idClassRejectedContinueButtonText = str4;
                this.countryInputTitle = str5;
                this.idClassInputTitle = str6;
                this.manualClassificationTitle = str7;
                this.manualClassificationContinueButtonText = str8;
                this.autoClassificationCaptureTipText = str9;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final String getAutoClassificationCaptureTipText() {
                return this.autoClassificationCaptureTipText;
            }

            public final String getCountryInputTitle() {
                return this.countryInputTitle;
            }

            public final String getIdClassInputTitle() {
                return this.idClassInputTitle;
            }

            public final String getIdClassRejectedContinueButtonText() {
                return this.idClassRejectedContinueButtonText;
            }

            public final String getIdClassRejectedTitle() {
                return this.idClassRejectedTitle;
            }

            public final String getManualClassificationContinueButtonText() {
                return this.manualClassificationContinueButtonText;
            }

            public final String getManualClassificationTitle() {
                return this.manualClassificationTitle;
            }

            public final String getUnableToClassifyDocumentContinueButtonText() {
                return this.unableToClassifyDocumentContinueButtonText;
            }

            public final String getUnableToClassifyDocumentTitle() {
                return this.unableToClassifyDocumentTitle;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.getClass();
                dest.writeString(this.unableToClassifyDocumentTitle);
                dest.writeString(this.unableToClassifyDocumentContinueButtonText);
                dest.writeString(this.idClassRejectedTitle);
                dest.writeString(this.idClassRejectedContinueButtonText);
                dest.writeString(this.countryInputTitle);
                dest.writeString(this.idClassInputTitle);
                dest.writeString(this.manualClassificationTitle);
                dest.writeString(this.manualClassificationContinueButtonText);
                dest.writeString(this.autoClassificationCaptureTipText);
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<AutoClassificationPage> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AutoClassificationPage createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new AutoClassificationPage(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AutoClassificationPage[] newArray(int i) {
                    return new AutoClassificationPage[i];
                }
            }
        }

        @JsonClass(generateAdapter = true)
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b7\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001Bý\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0006\u0010:\u001a\u00020;J\u0016\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020;R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010 R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010 R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010 R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010 R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010 R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010 R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010 R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010 R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010 R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010 R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010 R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010 R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010 R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010 R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010 R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010 R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010 R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010 R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010 R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u0010 R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u0010 R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u0010 R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010 ¨\u0006A"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CapturePage;", "Landroid/os/Parcelable;", "title", "", "scanFront", "scanBack", "scanPdf417", "scanFrontOrBack", "scanSignature", "capturing", "confirmCapture", "disclaimer", "hintHoldStill", "hintLowLight", "btnHelp", "barcodeHelpModalTitle", "barcodeHelpModalPrompt", "barcodeHelpModalHints", "barcodeHelpModalContinueBtn", "idFrontHelpModalTitle", "idFrontHelpModalPrompt", "idFrontHelpModalHintsMobile", "idFrontHelpModalContinueBtn", "idBackHelpModalTitle", "idBackHelpModalPrompt", "idBackHelpModalHintsMobile", "idBackHelpModalContinueBtn", "staticCaptureTipsTitle", "staticCaptureTipsSubtext", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getScanFront", "getScanBack", "getScanPdf417", "getScanFrontOrBack", "getScanSignature", "getCapturing", "getConfirmCapture", "getDisclaimer", "getHintHoldStill", "getHintLowLight", "getBtnHelp", "getBarcodeHelpModalTitle", "getBarcodeHelpModalPrompt", "getBarcodeHelpModalHints", "getBarcodeHelpModalContinueBtn", "getIdFrontHelpModalTitle", "getIdFrontHelpModalPrompt", "getIdFrontHelpModalHintsMobile", "getIdFrontHelpModalContinueBtn", "getIdBackHelpModalTitle", "getIdBackHelpModalPrompt", "getIdBackHelpModalHintsMobile", "getIdBackHelpModalContinueBtn", "getStaticCaptureTipsTitle", "getStaticCaptureTipsSubtext", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class CapturePage implements Parcelable {
            public static final Parcelable.Creator<CapturePage> CREATOR = new Creator();
            private final String barcodeHelpModalContinueBtn;
            private final String barcodeHelpModalHints;
            private final String barcodeHelpModalPrompt;
            private final String barcodeHelpModalTitle;
            private final String btnHelp;
            private final String capturing;
            private final String confirmCapture;
            private final String disclaimer;
            private final String hintHoldStill;
            private final String hintLowLight;
            private final String idBackHelpModalContinueBtn;
            private final String idBackHelpModalHintsMobile;
            private final String idBackHelpModalPrompt;
            private final String idBackHelpModalTitle;
            private final String idFrontHelpModalContinueBtn;
            private final String idFrontHelpModalHintsMobile;
            private final String idFrontHelpModalPrompt;
            private final String idFrontHelpModalTitle;
            private final String scanBack;
            private final String scanFront;
            private final String scanFrontOrBack;
            private final String scanPdf417;
            private final String scanSignature;
            private final String staticCaptureTipsSubtext;
            private final String staticCaptureTipsTitle;
            private final String title;

            public CapturePage(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, str3, str4, str5, str6);
                str7.getClass();
                str8.getClass();
                this.title = str;
                this.scanFront = str2;
                this.scanBack = str3;
                this.scanPdf417 = str4;
                this.scanFrontOrBack = str5;
                this.scanSignature = str6;
                this.capturing = str7;
                this.confirmCapture = str8;
                this.disclaimer = str9;
                this.hintHoldStill = str10;
                this.hintLowLight = str11;
                this.btnHelp = str12;
                this.barcodeHelpModalTitle = str13;
                this.barcodeHelpModalPrompt = str14;
                this.barcodeHelpModalHints = str15;
                this.barcodeHelpModalContinueBtn = str16;
                this.idFrontHelpModalTitle = str17;
                this.idFrontHelpModalPrompt = str18;
                this.idFrontHelpModalHintsMobile = str19;
                this.idFrontHelpModalContinueBtn = str20;
                this.idBackHelpModalTitle = str21;
                this.idBackHelpModalPrompt = str22;
                this.idBackHelpModalHintsMobile = str23;
                this.idBackHelpModalContinueBtn = str24;
                this.staticCaptureTipsTitle = str25;
                this.staticCaptureTipsSubtext = str26;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final String getBarcodeHelpModalContinueBtn() {
                return this.barcodeHelpModalContinueBtn;
            }

            public final String getBarcodeHelpModalHints() {
                return this.barcodeHelpModalHints;
            }

            public final String getBarcodeHelpModalPrompt() {
                return this.barcodeHelpModalPrompt;
            }

            public final String getBarcodeHelpModalTitle() {
                return this.barcodeHelpModalTitle;
            }

            public final String getBtnHelp() {
                return this.btnHelp;
            }

            public final String getCapturing() {
                return this.capturing;
            }

            public final String getConfirmCapture() {
                return this.confirmCapture;
            }

            public final String getDisclaimer() {
                return this.disclaimer;
            }

            public final String getHintHoldStill() {
                return this.hintHoldStill;
            }

            public final String getHintLowLight() {
                return this.hintLowLight;
            }

            public final String getIdBackHelpModalContinueBtn() {
                return this.idBackHelpModalContinueBtn;
            }

            public final String getIdBackHelpModalHintsMobile() {
                return this.idBackHelpModalHintsMobile;
            }

            public final String getIdBackHelpModalPrompt() {
                return this.idBackHelpModalPrompt;
            }

            public final String getIdBackHelpModalTitle() {
                return this.idBackHelpModalTitle;
            }

            public final String getIdFrontHelpModalContinueBtn() {
                return this.idFrontHelpModalContinueBtn;
            }

            public final String getIdFrontHelpModalHintsMobile() {
                return this.idFrontHelpModalHintsMobile;
            }

            public final String getIdFrontHelpModalPrompt() {
                return this.idFrontHelpModalPrompt;
            }

            public final String getIdFrontHelpModalTitle() {
                return this.idFrontHelpModalTitle;
            }

            public final String getScanBack() {
                return this.scanBack;
            }

            public final String getScanFront() {
                return this.scanFront;
            }

            public final String getScanFrontOrBack() {
                return this.scanFrontOrBack;
            }

            public final String getScanPdf417() {
                return this.scanPdf417;
            }

            public final String getScanSignature() {
                return this.scanSignature;
            }

            public final String getStaticCaptureTipsSubtext() {
                return this.staticCaptureTipsSubtext;
            }

            public final String getStaticCaptureTipsTitle() {
                return this.staticCaptureTipsTitle;
            }

            public final String getTitle() {
                return this.title;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.getClass();
                dest.writeString(this.title);
                dest.writeString(this.scanFront);
                dest.writeString(this.scanBack);
                dest.writeString(this.scanPdf417);
                dest.writeString(this.scanFrontOrBack);
                dest.writeString(this.scanSignature);
                dest.writeString(this.capturing);
                dest.writeString(this.confirmCapture);
                dest.writeString(this.disclaimer);
                dest.writeString(this.hintHoldStill);
                dest.writeString(this.hintLowLight);
                dest.writeString(this.btnHelp);
                dest.writeString(this.barcodeHelpModalTitle);
                dest.writeString(this.barcodeHelpModalPrompt);
                dest.writeString(this.barcodeHelpModalHints);
                dest.writeString(this.barcodeHelpModalContinueBtn);
                dest.writeString(this.idFrontHelpModalTitle);
                dest.writeString(this.idFrontHelpModalPrompt);
                dest.writeString(this.idFrontHelpModalHintsMobile);
                dest.writeString(this.idFrontHelpModalContinueBtn);
                dest.writeString(this.idBackHelpModalTitle);
                dest.writeString(this.idBackHelpModalPrompt);
                dest.writeString(this.idBackHelpModalHintsMobile);
                dest.writeString(this.idBackHelpModalContinueBtn);
                dest.writeString(this.staticCaptureTipsTitle);
                dest.writeString(this.staticCaptureTipsSubtext);
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<CapturePage> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CapturePage createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new CapturePage(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CapturePage[] newArray(int i) {
                    return new CapturePage[i];
                }
            }
        }

        @JsonClass(generateAdapter = true)
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CheckPage;", "Landroid/os/Parcelable;", "buttonSubmit", "", "buttonRetake", "titleConfirmCapture", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getButtonSubmit", "()Ljava/lang/String;", "getButtonRetake", "getTitleConfirmCapture", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class CheckPage implements Parcelable {
            public static final Parcelable.Creator<CheckPage> CREATOR = new Creator();
            private final String buttonRetake;
            private final String buttonSubmit;
            private final String titleConfirmCapture;

            public CheckPage(@Json(name = "btnSubmit") String str, @Json(name = "btnRetake") String str2, String str3) {
                str.getClass();
                str2.getClass();
                this.buttonSubmit = str;
                this.buttonRetake = str2;
                this.titleConfirmCapture = str3;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final String getButtonRetake() {
                return this.buttonRetake;
            }

            public final String getButtonSubmit() {
                return this.buttonSubmit;
            }

            public final String getTitleConfirmCapture() {
                return this.titleConfirmCapture;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.getClass();
                dest.writeString(this.buttonSubmit);
                dest.writeString(this.buttonRetake);
                dest.writeString(this.titleConfirmCapture);
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<CheckPage> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CheckPage createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new CheckPage(parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CheckPage[] newArray(int i) {
                    return new CheckPage[i];
                }
            }
        }

        @JsonClass(generateAdapter = true)
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B=\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u0000H\u0096\u0002J\u0006\u0010\u001d\u001a\u00020\u0014J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0014R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR!\u0010\u0013\u001a\u00020\u00148FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006#"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$LocalizationOverride;", "Landroid/os/Parcelable;", "", "countryCode", "", "idClass", "side", "page", "key", "text", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCountryCode", "()Ljava/lang/String;", "getIdClass", "getSide", "getPage", "getKey", "getText", "precedenceScore", "", "getPrecedenceScore$annotations", "()V", "getPrecedenceScore", "()I", "precedenceScore$delegate", "Lkotlin/Lazy;", "compareTo", "other", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class LocalizationOverride implements Parcelable, Comparable<LocalizationOverride> {
            public static final Parcelable.Creator<LocalizationOverride> CREATOR = new Creator();
            private final String countryCode;
            private final String idClass;
            private final String key;
            private final String page;

            /* renamed from: precedenceScore$delegate, reason: from kotlin metadata */
            private final Lazy precedenceScore;
            private final String side;
            private final String text;

            public LocalizationOverride(String str, String str2, String str3, String str4, String str5, String str6) {
                re$$ExternalSyntheticOutline0.m1432m(str4, str5, str6);
                this.countryCode = str;
                this.idClass = str2;
                this.side = str3;
                this.page = str4;
                this.key = str5;
                this.text = str6;
                this.precedenceScore = LazyKt.lazy(new CameraHelper$$ExternalSyntheticLambda0(this, 26));
            }

            public static /* synthetic */ void getPrecedenceScore$annotations() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final int precedenceScore_delegate$lambda$3(LocalizationOverride localizationOverride) {
                int i = (localizationOverride.countryCode != null ? 1 : 0) * 2;
                if (localizationOverride.idClass != null) {
                    i++;
                }
                int i2 = i * 2;
                return localizationOverride.side != null ? i2 + 1 : i2;
            }

            @Override // java.lang.Comparable
            public int compareTo(LocalizationOverride other) {
                other.getClass();
                return Intrinsics.compare(getPrecedenceScore(), other.getPrecedenceScore());
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final String getCountryCode() {
                return this.countryCode;
            }

            public final String getIdClass() {
                return this.idClass;
            }

            public final String getKey() {
                return this.key;
            }

            public final String getPage() {
                return this.page;
            }

            public final int getPrecedenceScore() {
                return ((Number) this.precedenceScore.getValue()).intValue();
            }

            public final String getSide() {
                return this.side;
            }

            public final String getText() {
                return this.text;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.getClass();
                dest.writeString(this.countryCode);
                dest.writeString(this.idClass);
                dest.writeString(this.side);
                dest.writeString(this.page);
                dest.writeString(this.key);
                dest.writeString(this.text);
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<LocalizationOverride> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final LocalizationOverride createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new LocalizationOverride(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final LocalizationOverride[] newArray(int i) {
                    return new LocalizationOverride[i];
                }
            }
        }

        @JsonClass(generateAdapter = true)
        @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0006\u0010(\u001a\u00020)J\u0016\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020)R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u0006/"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Localizations;", "Landroid/os/Parcelable;", "selectPage", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$SelectPage;", "promptPage", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$PromptPage;", "capturePage", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CapturePage;", "checkPage", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CheckPage;", "pendingPage", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$PendingPage;", "requestPage", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$RequestPage;", "reviewUploadPage", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$ReviewUploadPage;", "cancelDialog", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "autoClassificationPage", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AutoClassificationPage;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$SelectPage;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$PromptPage;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CapturePage;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CheckPage;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$PendingPage;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$RequestPage;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$ReviewUploadPage;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AutoClassificationPage;)V", "getSelectPage", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$SelectPage;", "getPromptPage", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$PromptPage;", "getCapturePage", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CapturePage;", "getCheckPage", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CheckPage;", "getPendingPage", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$PendingPage;", "getRequestPage", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$RequestPage;", "getReviewUploadPage", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$ReviewUploadPage;", "getCancelDialog", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "getAutoClassificationPage", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AutoClassificationPage;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Localizations implements Parcelable {
            public static final Parcelable.Creator<Localizations> CREATOR = new Creator();
            private final AutoClassificationPage autoClassificationPage;
            private final CancelDialog cancelDialog;
            private final CapturePage capturePage;
            private final CheckPage checkPage;
            private final PendingPage pendingPage;
            private final PromptPage promptPage;
            private final RequestPage requestPage;
            private final ReviewUploadPage reviewUploadPage;
            private final SelectPage selectPage;

            public Localizations(SelectPage selectPage, PromptPage promptPage, CapturePage capturePage, CheckPage checkPage, PendingPage pendingPage, RequestPage requestPage, ReviewUploadPage reviewUploadPage, CancelDialog cancelDialog, AutoClassificationPage autoClassificationPage) {
                selectPage.getClass();
                promptPage.getClass();
                capturePage.getClass();
                checkPage.getClass();
                pendingPage.getClass();
                requestPage.getClass();
                reviewUploadPage.getClass();
                this.selectPage = selectPage;
                this.promptPage = promptPage;
                this.capturePage = capturePage;
                this.checkPage = checkPage;
                this.pendingPage = pendingPage;
                this.requestPage = requestPage;
                this.reviewUploadPage = reviewUploadPage;
                this.cancelDialog = cancelDialog;
                this.autoClassificationPage = autoClassificationPage;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final AutoClassificationPage getAutoClassificationPage() {
                return this.autoClassificationPage;
            }

            public final CancelDialog getCancelDialog() {
                return this.cancelDialog;
            }

            public final CapturePage getCapturePage() {
                return this.capturePage;
            }

            public final CheckPage getCheckPage() {
                return this.checkPage;
            }

            public final PendingPage getPendingPage() {
                return this.pendingPage;
            }

            public final PromptPage getPromptPage() {
                return this.promptPage;
            }

            public final RequestPage getRequestPage() {
                return this.requestPage;
            }

            public final ReviewUploadPage getReviewUploadPage() {
                return this.reviewUploadPage;
            }

            public final SelectPage getSelectPage() {
                return this.selectPage;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.getClass();
                this.selectPage.writeToParcel(dest, flags);
                this.promptPage.writeToParcel(dest, flags);
                this.capturePage.writeToParcel(dest, flags);
                this.checkPage.writeToParcel(dest, flags);
                this.pendingPage.writeToParcel(dest, flags);
                this.requestPage.writeToParcel(dest, flags);
                this.reviewUploadPage.writeToParcel(dest, flags);
                CancelDialog cancelDialog = this.cancelDialog;
                if (cancelDialog == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    cancelDialog.writeToParcel(dest, flags);
                }
                AutoClassificationPage autoClassificationPage = this.autoClassificationPage;
                if (autoClassificationPage == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    autoClassificationPage.writeToParcel(dest, flags);
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Localizations> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Localizations createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new Localizations(SelectPage.CREATOR.createFromParcel(parcel), PromptPage.CREATOR.createFromParcel(parcel), CapturePage.CREATOR.createFromParcel(parcel), CheckPage.CREATOR.createFromParcel(parcel), PendingPage.CREATOR.createFromParcel(parcel), RequestPage.CREATOR.createFromParcel(parcel), ReviewUploadPage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CancelDialog.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AutoClassificationPage.CREATOR.createFromParcel(parcel) : null);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Localizations[] newArray(int i) {
                    return new Localizations[i];
                }
            }
        }

        @JsonClass(generateAdapter = true)
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$PendingPage;", "Landroid/os/Parcelable;", "title", "", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class PendingPage implements Parcelable {
            public static final Parcelable.Creator<PendingPage> CREATOR = new Creator();
            private final String description;
            private final String title;

            public PendingPage(String str, String str2) {
                str.getClass();
                str2.getClass();
                this.title = str;
                this.description = str2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final String getDescription() {
                return this.description;
            }

            public final String getTitle() {
                return this.title;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.getClass();
                dest.writeString(this.title);
                dest.writeString(this.description);
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<PendingPage> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PendingPage createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new PendingPage(parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PendingPage[] newArray(int i) {
                    return new PendingPage[i];
                }
            }
        }

        @JsonClass(generateAdapter = true)
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B[\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u0016\u001a\u00020\u0017J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0017R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006\u001d"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$PromptPage;", "Landroid/os/Parcelable;", "cameraPermissionsTitle", "", "cameraPermissionsPrompt", "cameraPermissionsAllowButtonText", "cameraPermissionsCancelButtonText", "microphonePermissionsBtnCancel", "microphonePermissionsBtnContinueMobile", "microphonePermissionsPrompt", "microphonePermissionsTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCameraPermissionsTitle", "()Ljava/lang/String;", "getCameraPermissionsPrompt", "getCameraPermissionsAllowButtonText", "getCameraPermissionsCancelButtonText", "getMicrophonePermissionsBtnCancel", "getMicrophonePermissionsBtnContinueMobile", "getMicrophonePermissionsPrompt", "getMicrophonePermissionsTitle", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class PromptPage implements Parcelable {
            public static final Parcelable.Creator<PromptPage> CREATOR = new Creator();
            private final String cameraPermissionsAllowButtonText;
            private final String cameraPermissionsCancelButtonText;
            private final String cameraPermissionsPrompt;
            private final String cameraPermissionsTitle;
            private final String microphonePermissionsBtnCancel;
            private final String microphonePermissionsBtnContinueMobile;
            private final String microphonePermissionsPrompt;
            private final String microphonePermissionsTitle;

            public PromptPage(String str, String str2, @Json(name = "cameraPermissionsBtnContinueMobile") String str3, @Json(name = "cameraPermissionsBtnCancel") String str4, String str5, String str6, String str7, String str8) {
                this.cameraPermissionsTitle = str;
                this.cameraPermissionsPrompt = str2;
                this.cameraPermissionsAllowButtonText = str3;
                this.cameraPermissionsCancelButtonText = str4;
                this.microphonePermissionsBtnCancel = str5;
                this.microphonePermissionsBtnContinueMobile = str6;
                this.microphonePermissionsPrompt = str7;
                this.microphonePermissionsTitle = str8;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final String getCameraPermissionsAllowButtonText() {
                return this.cameraPermissionsAllowButtonText;
            }

            public final String getCameraPermissionsCancelButtonText() {
                return this.cameraPermissionsCancelButtonText;
            }

            public final String getCameraPermissionsPrompt() {
                return this.cameraPermissionsPrompt;
            }

            public final String getCameraPermissionsTitle() {
                return this.cameraPermissionsTitle;
            }

            public final String getMicrophonePermissionsBtnCancel() {
                return this.microphonePermissionsBtnCancel;
            }

            public final String getMicrophonePermissionsBtnContinueMobile() {
                return this.microphonePermissionsBtnContinueMobile;
            }

            public final String getMicrophonePermissionsPrompt() {
                return this.microphonePermissionsPrompt;
            }

            public final String getMicrophonePermissionsTitle() {
                return this.microphonePermissionsTitle;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.getClass();
                dest.writeString(this.cameraPermissionsTitle);
                dest.writeString(this.cameraPermissionsPrompt);
                dest.writeString(this.cameraPermissionsAllowButtonText);
                dest.writeString(this.cameraPermissionsCancelButtonText);
                dest.writeString(this.microphonePermissionsBtnCancel);
                dest.writeString(this.microphonePermissionsBtnContinueMobile);
                dest.writeString(this.microphonePermissionsPrompt);
                dest.writeString(this.microphonePermissionsTitle);
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<PromptPage> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PromptPage createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new PromptPage(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PromptPage[] newArray(int i) {
                    return new PromptPage[i];
                }
            }
        }

        @JsonClass(generateAdapter = true)
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u001a\u001a\u00020\u001bJ\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010¨\u0006!"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$RequestPage;", "Landroid/os/Parcelable;", "titleFront", "", "titleBack", "titlePdf417", "titlePassportSignature", "descriptionFront", "descriptionBack", "descriptionPdf417", "descriptionPassportSignature", "choosePhotoButtonText", "liveUploadButtonText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitleFront", "()Ljava/lang/String;", "getTitleBack", "getTitlePdf417", "getTitlePassportSignature", "getDescriptionFront", "getDescriptionBack", "getDescriptionPdf417", "getDescriptionPassportSignature", "getChoosePhotoButtonText", "getLiveUploadButtonText", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class RequestPage implements Parcelable {
            public static final Parcelable.Creator<RequestPage> CREATOR = new Creator();
            private final String choosePhotoButtonText;
            private final String descriptionBack;
            private final String descriptionFront;
            private final String descriptionPassportSignature;
            private final String descriptionPdf417;
            private final String liveUploadButtonText;
            private final String titleBack;
            private final String titleFront;
            private final String titlePassportSignature;
            private final String titlePdf417;

            public RequestPage(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, str2, str3, str4, str5);
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, str7, str8, str9, str10);
                this.titleFront = str;
                this.titleBack = str2;
                this.titlePdf417 = str3;
                this.titlePassportSignature = str4;
                this.descriptionFront = str5;
                this.descriptionBack = str6;
                this.descriptionPdf417 = str7;
                this.descriptionPassportSignature = str8;
                this.choosePhotoButtonText = str9;
                this.liveUploadButtonText = str10;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final String getChoosePhotoButtonText() {
                return this.choosePhotoButtonText;
            }

            public final String getDescriptionBack() {
                return this.descriptionBack;
            }

            public final String getDescriptionFront() {
                return this.descriptionFront;
            }

            public final String getDescriptionPassportSignature() {
                return this.descriptionPassportSignature;
            }

            public final String getDescriptionPdf417() {
                return this.descriptionPdf417;
            }

            public final String getLiveUploadButtonText() {
                return this.liveUploadButtonText;
            }

            public final String getTitleBack() {
                return this.titleBack;
            }

            public final String getTitleFront() {
                return this.titleFront;
            }

            public final String getTitlePassportSignature() {
                return this.titlePassportSignature;
            }

            public final String getTitlePdf417() {
                return this.titlePdf417;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.getClass();
                dest.writeString(this.titleFront);
                dest.writeString(this.titleBack);
                dest.writeString(this.titlePdf417);
                dest.writeString(this.titlePassportSignature);
                dest.writeString(this.descriptionFront);
                dest.writeString(this.descriptionBack);
                dest.writeString(this.descriptionPdf417);
                dest.writeString(this.descriptionPassportSignature);
                dest.writeString(this.choosePhotoButtonText);
                dest.writeString(this.liveUploadButtonText);
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<RequestPage> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final RequestPage createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new RequestPage(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final RequestPage[] newArray(int i) {
                    return new RequestPage[i];
                }
            }
        }

        @JsonClass(generateAdapter = true)
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u001a\u001a\u00020\u001bJ\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010¨\u0006!"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$ReviewUploadPage;", "Landroid/os/Parcelable;", "titleFront", "", "titleBack", "titlePdf417", "titlePassportSignature", "descriptionFront", "descriptionBack", "descriptionPdf417", "descriptionPassportSignature", "confirmButtonText", "chooseAnotherButtonText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitleFront", "()Ljava/lang/String;", "getTitleBack", "getTitlePdf417", "getTitlePassportSignature", "getDescriptionFront", "getDescriptionBack", "getDescriptionPdf417", "getDescriptionPassportSignature", "getConfirmButtonText", "getChooseAnotherButtonText", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ReviewUploadPage implements Parcelable {
            public static final Parcelable.Creator<ReviewUploadPage> CREATOR = new Creator();
            private final String chooseAnotherButtonText;
            private final String confirmButtonText;
            private final String descriptionBack;
            private final String descriptionFront;
            private final String descriptionPassportSignature;
            private final String descriptionPdf417;
            private final String titleBack;
            private final String titleFront;
            private final String titlePassportSignature;
            private final String titlePdf417;

            public ReviewUploadPage(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, str2, str3, str4, str5);
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, str7, str8, str9, str10);
                this.titleFront = str;
                this.titleBack = str2;
                this.titlePdf417 = str3;
                this.titlePassportSignature = str4;
                this.descriptionFront = str5;
                this.descriptionBack = str6;
                this.descriptionPdf417 = str7;
                this.descriptionPassportSignature = str8;
                this.confirmButtonText = str9;
                this.chooseAnotherButtonText = str10;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final String getChooseAnotherButtonText() {
                return this.chooseAnotherButtonText;
            }

            public final String getConfirmButtonText() {
                return this.confirmButtonText;
            }

            public final String getDescriptionBack() {
                return this.descriptionBack;
            }

            public final String getDescriptionFront() {
                return this.descriptionFront;
            }

            public final String getDescriptionPassportSignature() {
                return this.descriptionPassportSignature;
            }

            public final String getDescriptionPdf417() {
                return this.descriptionPdf417;
            }

            public final String getTitleBack() {
                return this.titleBack;
            }

            public final String getTitleFront() {
                return this.titleFront;
            }

            public final String getTitlePassportSignature() {
                return this.titlePassportSignature;
            }

            public final String getTitlePdf417() {
                return this.titlePdf417;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.getClass();
                dest.writeString(this.titleFront);
                dest.writeString(this.titleBack);
                dest.writeString(this.titlePdf417);
                dest.writeString(this.titlePassportSignature);
                dest.writeString(this.descriptionFront);
                dest.writeString(this.descriptionBack);
                dest.writeString(this.descriptionPdf417);
                dest.writeString(this.descriptionPassportSignature);
                dest.writeString(this.confirmButtonText);
                dest.writeString(this.chooseAnotherButtonText);
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ReviewUploadPage> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ReviewUploadPage createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new ReviewUploadPage(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ReviewUploadPage[] newArray(int i) {
                    return new ReviewUploadPage[i];
                }
            }
        }

        @JsonClass(generateAdapter = true)
        @Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b1\b\u0007\u0018\u00002\u00020\u0001B«\u0002\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0003\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\b\u0010!\u001a\u0004\u0018\u00010\"\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010$\u001a\u0004\u0018\u00010%\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010'\u001a\u0004\u0018\u00010\r\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b,\u0010-R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u00102\u001a\u0004\b0\u00101R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u00102\u001a\u0004\b3\u00101R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u0010/R\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u00109\u001a\u0004\b7\u00108R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010<\u001a\u0004\b:\u0010;R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0011\u0010\u0012\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b?\u0010>R\u0019\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b@\u0010/R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u00102\u001a\u0004\bA\u00101R\u0019\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bB\u0010/R\u0019\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bC\u0010/R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\bD\u0010>R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0013\u0010\u001f\u001a\u0004\u0018\u00010 ¢\u0006\b\n\u0000\u001a\u0004\bI\u0010JR\u0013\u0010!\u001a\u0004\u0018\u00010\"¢\u0006\b\n\u0000\u001a\u0004\bK\u0010LR\u0015\u0010#\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u00102\u001a\u0004\bM\u00101R\u0013\u0010$\u001a\u0004\u0018\u00010%¢\u0006\b\n\u0000\u001a\u0004\bN\u0010OR\u0015\u0010&\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u00102\u001a\u0004\bP\u00101R\u0015\u0010'\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u00109\u001a\u0004\bQ\u00108R\u0013\u0010(\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\bR\u0010>R\u0013\u0010)\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\bS\u0010>R\u0013\u0010*\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\bT\u0010>R\u0015\u0010+\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u00109\u001a\u0004\bU\u00108¨\u0006V"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Config;", "", "idclasses", "", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id;", "backStepEnabled", "", "cancelButtonEnabled", "localizations", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Localizations;", "enabledCaptureOptionsNativeMobile", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CaptureOptionNativeMobile;", "imageCaptureCount", "", "nativeMobileCameraManualCaptureDelayMs", "", "fieldKeyDocument", "", "fieldKeyIdclass", "localizationOverrides", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$LocalizationOverride;", "shouldSkipReviewScreen", "enabledCaptureFileTypes", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CaptureFileType;", "videoCaptureMethods", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$VideoCaptureMethod;", "videoSessionJwt", "assets", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig;", "autoClassificationConfig", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AutoClassificationConfig;", "reviewCaptureButtonsAxis", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;", "pendingPageTextVerticalPosition", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "audioEnabled", "mobileDriversLicense", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$DigitalIdConfig;", "staticCaptureTipsEnabled", "holographicTorchEnabledDurationMs", "govidDesignVersion", "flowWatermarkText", "silentNetworkAuthenticationCheckUrl", "silentNetworkAuthenticationBackgroundTimeoutSeconds", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Localizations;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AutoClassificationConfig;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;Ljava/lang/Boolean;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$DigitalIdConfig;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getIdclasses", "()Ljava/util/List;", "getBackStepEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCancelButtonEnabled", "getLocalizations", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Localizations;", "getEnabledCaptureOptionsNativeMobile", "getImageCaptureCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getNativeMobileCameraManualCaptureDelayMs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getFieldKeyDocument", "()Ljava/lang/String;", "getFieldKeyIdclass", "getLocalizationOverrides", "getShouldSkipReviewScreen", "getEnabledCaptureFileTypes", "getVideoCaptureMethods", "getVideoSessionJwt", "getAssets", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig;", "getAutoClassificationConfig", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AutoClassificationConfig;", "getReviewCaptureButtonsAxis", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;", "getPendingPageTextVerticalPosition", "()Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "getAudioEnabled", "getMobileDriversLicense", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$DigitalIdConfig;", "getStaticCaptureTipsEnabled", "getHolographicTorchEnabledDurationMs", "getGovidDesignVersion", "getFlowWatermarkText", "getSilentNetworkAuthenticationCheckUrl", "getSilentNetworkAuthenticationBackgroundTimeoutSeconds", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Config {
            private final AssetConfig assets;
            private final Boolean audioEnabled;
            private final AutoClassificationConfig autoClassificationConfig;
            private final Boolean backStepEnabled;
            private final Boolean cancelButtonEnabled;
            private final List<CaptureFileType> enabledCaptureFileTypes;
            private final List<CaptureOptionNativeMobile> enabledCaptureOptionsNativeMobile;
            private final String fieldKeyDocument;
            private final String fieldKeyIdclass;
            private final String flowWatermarkText;
            private final String govidDesignVersion;
            private final Integer holographicTorchEnabledDurationMs;
            private final List<Id> idclasses;
            private final Integer imageCaptureCount;
            private final List<LocalizationOverride> localizationOverrides;
            private final Localizations localizations;
            private final DigitalIdConfig mobileDriversLicense;
            private final Long nativeMobileCameraManualCaptureDelayMs;
            private final PendingPageTextPosition pendingPageTextVerticalPosition;
            private final StyleElements.Axis reviewCaptureButtonsAxis;
            private final Boolean shouldSkipReviewScreen;
            private final Integer silentNetworkAuthenticationBackgroundTimeoutSeconds;
            private final String silentNetworkAuthenticationCheckUrl;
            private final Boolean staticCaptureTipsEnabled;
            private final List<VideoCaptureMethod> videoCaptureMethods;
            private final String videoSessionJwt;

            /* JADX WARN: Multi-variable type inference failed */
            public Config(List<Id> list, Boolean bool, Boolean bool2, Localizations localizations, List<? extends CaptureOptionNativeMobile> list2, Integer num, Long l, String str, String str2, List<LocalizationOverride> list3, Boolean bool3, List<? extends CaptureFileType> list4, List<? extends VideoCaptureMethod> list5, @Json(name = "videoSessionJWT") String str3, AssetConfig assetConfig, AutoClassificationConfig autoClassificationConfig, StyleElements.Axis axis, PendingPageTextPosition pendingPageTextPosition, Boolean bool4, DigitalIdConfig digitalIdConfig, Boolean bool5, Integer num2, String str4, String str5, String str6, Integer num3) {
                localizations.getClass();
                str.getClass();
                str2.getClass();
                this.idclasses = list;
                this.backStepEnabled = bool;
                this.cancelButtonEnabled = bool2;
                this.localizations = localizations;
                this.enabledCaptureOptionsNativeMobile = list2;
                this.imageCaptureCount = num;
                this.nativeMobileCameraManualCaptureDelayMs = l;
                this.fieldKeyDocument = str;
                this.fieldKeyIdclass = str2;
                this.localizationOverrides = list3;
                this.shouldSkipReviewScreen = bool3;
                this.enabledCaptureFileTypes = list4;
                this.videoCaptureMethods = list5;
                this.videoSessionJwt = str3;
                this.assets = assetConfig;
                this.autoClassificationConfig = autoClassificationConfig;
                this.reviewCaptureButtonsAxis = axis;
                this.pendingPageTextVerticalPosition = pendingPageTextPosition;
                this.audioEnabled = bool4;
                this.mobileDriversLicense = digitalIdConfig;
                this.staticCaptureTipsEnabled = bool5;
                this.holographicTorchEnabledDurationMs = num2;
                this.govidDesignVersion = str4;
                this.flowWatermarkText = str5;
                this.silentNetworkAuthenticationCheckUrl = str6;
                this.silentNetworkAuthenticationBackgroundTimeoutSeconds = num3;
            }

            public final AssetConfig getAssets() {
                return this.assets;
            }

            public final Boolean getAudioEnabled() {
                return this.audioEnabled;
            }

            public final AutoClassificationConfig getAutoClassificationConfig() {
                return this.autoClassificationConfig;
            }

            public final Boolean getBackStepEnabled() {
                return this.backStepEnabled;
            }

            public final Boolean getCancelButtonEnabled() {
                return this.cancelButtonEnabled;
            }

            public final List<CaptureFileType> getEnabledCaptureFileTypes() {
                return this.enabledCaptureFileTypes;
            }

            public final List<CaptureOptionNativeMobile> getEnabledCaptureOptionsNativeMobile() {
                return this.enabledCaptureOptionsNativeMobile;
            }

            public final String getFieldKeyDocument() {
                return this.fieldKeyDocument;
            }

            public final String getFieldKeyIdclass() {
                return this.fieldKeyIdclass;
            }

            public final String getFlowWatermarkText() {
                return this.flowWatermarkText;
            }

            public final String getGovidDesignVersion() {
                return this.govidDesignVersion;
            }

            public final Integer getHolographicTorchEnabledDurationMs() {
                return this.holographicTorchEnabledDurationMs;
            }

            public final List<Id> getIdclasses() {
                return this.idclasses;
            }

            public final Integer getImageCaptureCount() {
                return this.imageCaptureCount;
            }

            public final List<LocalizationOverride> getLocalizationOverrides() {
                return this.localizationOverrides;
            }

            public final Localizations getLocalizations() {
                return this.localizations;
            }

            public final DigitalIdConfig getMobileDriversLicense() {
                return this.mobileDriversLicense;
            }

            public final Long getNativeMobileCameraManualCaptureDelayMs() {
                return this.nativeMobileCameraManualCaptureDelayMs;
            }

            public final PendingPageTextPosition getPendingPageTextVerticalPosition() {
                return this.pendingPageTextVerticalPosition;
            }

            public final StyleElements.Axis getReviewCaptureButtonsAxis() {
                return this.reviewCaptureButtonsAxis;
            }

            public final Boolean getShouldSkipReviewScreen() {
                return this.shouldSkipReviewScreen;
            }

            public final Integer getSilentNetworkAuthenticationBackgroundTimeoutSeconds() {
                return this.silentNetworkAuthenticationBackgroundTimeoutSeconds;
            }

            public final String getSilentNetworkAuthenticationCheckUrl() {
                return this.silentNetworkAuthenticationCheckUrl;
            }

            public final Boolean getStaticCaptureTipsEnabled() {
                return this.staticCaptureTipsEnabled;
            }

            public final List<VideoCaptureMethod> getVideoCaptureMethods() {
                return this.videoCaptureMethods;
            }

            public final String getVideoSessionJwt() {
                return this.videoSessionJwt;
            }

            public /* synthetic */ Config(List list, Boolean bool, Boolean bool2, Localizations localizations, List list2, Integer num, Long l, String str, String str2, List list3, Boolean bool3, List list4, List list5, String str3, AssetConfig assetConfig, AutoClassificationConfig autoClassificationConfig, StyleElements.Axis axis, PendingPageTextPosition pendingPageTextPosition, Boolean bool4, DigitalIdConfig digitalIdConfig, Boolean bool5, Integer num2, String str4, String str5, String str6, Integer num3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(list, bool, bool2, localizations, list2, num, l, str, str2, list3, bool3, list4, list5, str3, assetConfig, autoClassificationConfig, axis, pendingPageTextPosition, bool4, digitalIdConfig, bool5, num2, str4, (i & 8388608) != 0 ? null : str5, (i & 16777216) != 0 ? null : str6, (i & 33554432) != 0 ? null : num3);
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001:\u000b\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001aB!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;", "name", "", "config", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$Config;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$Config;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;)V", "getName", "()Ljava/lang/String;", "getConfig", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$Config;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "Config", "CaptureMethod", "CaptureFileType", "VideoCaptureMethod", "Localizations", "CapturePage", "PendingPage", "CheckPage", "PromptPage", "AssetConfig", "SelfiePose", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Selfie extends NextStep {
        private final Config config;
        private final String name;
        private final StepStyles.SelfieStepStyle styles;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @JsonClass(generateAdapter = false)
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CaptureMethod;", "", "<init>", "(Ljava/lang/String;I)V", "ONLY_CENTER", "PROFILE_AND_CENTER", "CONFIGURABLE_POSES", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class CaptureMethod {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ CaptureMethod[] $VALUES;

            @Json(name = "only_center")
            public static final CaptureMethod ONLY_CENTER = new CaptureMethod("ONLY_CENTER", 0);

            @Json(name = "profile_and_center")
            public static final CaptureMethod PROFILE_AND_CENTER = new CaptureMethod("PROFILE_AND_CENTER", 1);

            @Json(name = "configurable_poses")
            public static final CaptureMethod CONFIGURABLE_POSES = new CaptureMethod("CONFIGURABLE_POSES", 2);

            private static final /* synthetic */ CaptureMethod[] $values() {
                return new CaptureMethod[]{ONLY_CENTER, PROFILE_AND_CENTER, CONFIGURABLE_POSES};
            }

            static {
                CaptureMethod[] $values = $values();
                $VALUES = $values;
                $ENTRIES = Tags.enumEntries($values);
            }

            private CaptureMethod(String str, int i) {
            }

            public static EnumEntries getEntries() {
                return $ENTRIES;
            }

            public static CaptureMethod valueOf(String str) {
                return (CaptureMethod) Enum.valueOf(CaptureMethod.class, str);
            }

            public static CaptureMethod[] values() {
                return (CaptureMethod[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @JsonClass(generateAdapter = false)
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;", "", "<init>", "(Ljava/lang/String;I)V", "CENTER", "LEFT", "RIGHT", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class SelfiePose {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ SelfiePose[] $VALUES;

            @Json(name = "center")
            public static final SelfiePose CENTER = new SelfiePose("CENTER", 0);

            @Json(name = "left")
            public static final SelfiePose LEFT = new SelfiePose("LEFT", 1);

            @Json(name = "right")
            public static final SelfiePose RIGHT = new SelfiePose("RIGHT", 2);

            private static final /* synthetic */ SelfiePose[] $values() {
                return new SelfiePose[]{CENTER, LEFT, RIGHT};
            }

            static {
                SelfiePose[] $values = $values();
                $VALUES = $values;
                $ENTRIES = Tags.enumEntries($values);
            }

            private SelfiePose(String str, int i) {
            }

            public static EnumEntries getEntries() {
                return $ENTRIES;
            }

            public static SelfiePose valueOf(String str) {
                return (SelfiePose) Enum.valueOf(SelfiePose.class, str);
            }

            public static SelfiePose[] values() {
                return (SelfiePose[]) $VALUES.clone();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Selfie(String str, Config config, StepStyles.SelfieStepStyle selfieStepStyle) {
            super(str, null);
            str.getClass();
            config.getClass();
            this.name = str;
            this.config = config;
            this.styles = selfieStepStyle;
        }

        public final Config getConfig() {
            return this.config;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.NextStep
        public String getName() {
            return this.name;
        }

        public final StepStyles.SelfieStepStyle getStyles() {
            return this.styles;
        }

        @JsonClass(generateAdapter = true)
        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u001d\u001eB\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig;", "Landroid/os/Parcelable;", "promptPage", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig$PromptPage;", "recordPage", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig$RecordPage;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig$PromptPage;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig$RecordPage;)V", "getPromptPage", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig$PromptPage;", "getRecordPage", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig$RecordPage;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "PromptPage", "RecordPage", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class AssetConfig implements Parcelable {
            public static final Parcelable.Creator<AssetConfig> CREATOR = new Creator();
            private final PromptPage promptPage;
            private final RecordPage recordPage;

            public /* synthetic */ AssetConfig(PromptPage promptPage, RecordPage recordPage, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : promptPage, (i & 2) != 0 ? null : recordPage);
            }

            public static /* synthetic */ AssetConfig copy$default(AssetConfig assetConfig, PromptPage promptPage, RecordPage recordPage, int i, Object obj) {
                if ((i & 1) != 0) {
                    promptPage = assetConfig.promptPage;
                }
                if ((i & 2) != 0) {
                    recordPage = assetConfig.recordPage;
                }
                return assetConfig.copy(promptPage, recordPage);
            }

            /* renamed from: component1, reason: from getter */
            public final PromptPage getPromptPage() {
                return this.promptPage;
            }

            /* renamed from: component2, reason: from getter */
            public final RecordPage getRecordPage() {
                return this.recordPage;
            }

            public final AssetConfig copy(PromptPage promptPage, RecordPage recordPage) {
                return new AssetConfig(promptPage, recordPage);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AssetConfig)) {
                    return false;
                }
                AssetConfig assetConfig = (AssetConfig) other;
                return Intrinsics.areEqual(this.promptPage, assetConfig.promptPage) && Intrinsics.areEqual(this.recordPage, assetConfig.recordPage);
            }

            public final PromptPage getPromptPage() {
                return this.promptPage;
            }

            public final RecordPage getRecordPage() {
                return this.recordPage;
            }

            public int hashCode() {
                PromptPage promptPage = this.promptPage;
                int hashCode = (promptPage == null ? 0 : promptPage.hashCode()) * 31;
                RecordPage recordPage = this.recordPage;
                return hashCode + (recordPage != null ? recordPage.hashCode() : 0);
            }

            public String toString() {
                return "AssetConfig(promptPage=" + this.promptPage + ", recordPage=" + this.recordPage + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.getClass();
                PromptPage promptPage = this.promptPage;
                if (promptPage == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    promptPage.writeToParcel(dest, flags);
                }
                RecordPage recordPage = this.recordPage;
                if (recordPage == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    recordPage.writeToParcel(dest, flags);
                }
            }

            @JsonClass(generateAdapter = true)
            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0016\u001a\u00020\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0017R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006$"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig$PromptPage;", "Landroid/os/Parcelable;", "headerPictograph", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "selfiePictograph", "selfieCenterPictograph", "selfieLeftPictograph", "selfieRightPictograph", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;)V", "getHeaderPictograph", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "getSelfiePictograph", "getSelfieCenterPictograph", "getSelfieLeftPictograph", "getSelfieRightPictograph", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class PromptPage implements Parcelable {
                public static final Parcelable.Creator<PromptPage> CREATOR = new Creator();
                private final RemoteImage headerPictograph;
                private final RemoteImage selfieCenterPictograph;
                private final RemoteImage selfieLeftPictograph;
                private final RemoteImage selfiePictograph;
                private final RemoteImage selfieRightPictograph;

                public /* synthetic */ PromptPage(RemoteImage remoteImage, RemoteImage remoteImage2, RemoteImage remoteImage3, RemoteImage remoteImage4, RemoteImage remoteImage5, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : remoteImage, (i & 2) != 0 ? null : remoteImage2, (i & 4) != 0 ? null : remoteImage3, (i & 8) != 0 ? null : remoteImage4, (i & 16) != 0 ? null : remoteImage5);
                }

                public static /* synthetic */ PromptPage copy$default(PromptPage promptPage, RemoteImage remoteImage, RemoteImage remoteImage2, RemoteImage remoteImage3, RemoteImage remoteImage4, RemoteImage remoteImage5, int i, Object obj) {
                    if ((i & 1) != 0) {
                        remoteImage = promptPage.headerPictograph;
                    }
                    if ((i & 2) != 0) {
                        remoteImage2 = promptPage.selfiePictograph;
                    }
                    if ((i & 4) != 0) {
                        remoteImage3 = promptPage.selfieCenterPictograph;
                    }
                    if ((i & 8) != 0) {
                        remoteImage4 = promptPage.selfieLeftPictograph;
                    }
                    if ((i & 16) != 0) {
                        remoteImage5 = promptPage.selfieRightPictograph;
                    }
                    RemoteImage remoteImage6 = remoteImage5;
                    RemoteImage remoteImage7 = remoteImage3;
                    return promptPage.copy(remoteImage, remoteImage2, remoteImage7, remoteImage4, remoteImage6);
                }

                /* renamed from: component1, reason: from getter */
                public final RemoteImage getHeaderPictograph() {
                    return this.headerPictograph;
                }

                /* renamed from: component2, reason: from getter */
                public final RemoteImage getSelfiePictograph() {
                    return this.selfiePictograph;
                }

                /* renamed from: component3, reason: from getter */
                public final RemoteImage getSelfieCenterPictograph() {
                    return this.selfieCenterPictograph;
                }

                /* renamed from: component4, reason: from getter */
                public final RemoteImage getSelfieLeftPictograph() {
                    return this.selfieLeftPictograph;
                }

                /* renamed from: component5, reason: from getter */
                public final RemoteImage getSelfieRightPictograph() {
                    return this.selfieRightPictograph;
                }

                public final PromptPage copy(RemoteImage headerPictograph, RemoteImage selfiePictograph, RemoteImage selfieCenterPictograph, RemoteImage selfieLeftPictograph, RemoteImage selfieRightPictograph) {
                    return new PromptPage(headerPictograph, selfiePictograph, selfieCenterPictograph, selfieLeftPictograph, selfieRightPictograph);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof PromptPage)) {
                        return false;
                    }
                    PromptPage promptPage = (PromptPage) other;
                    return Intrinsics.areEqual(this.headerPictograph, promptPage.headerPictograph) && Intrinsics.areEqual(this.selfiePictograph, promptPage.selfiePictograph) && Intrinsics.areEqual(this.selfieCenterPictograph, promptPage.selfieCenterPictograph) && Intrinsics.areEqual(this.selfieLeftPictograph, promptPage.selfieLeftPictograph) && Intrinsics.areEqual(this.selfieRightPictograph, promptPage.selfieRightPictograph);
                }

                public final RemoteImage getHeaderPictograph() {
                    return this.headerPictograph;
                }

                public final RemoteImage getSelfieCenterPictograph() {
                    return this.selfieCenterPictograph;
                }

                public final RemoteImage getSelfieLeftPictograph() {
                    return this.selfieLeftPictograph;
                }

                public final RemoteImage getSelfiePictograph() {
                    return this.selfiePictograph;
                }

                public final RemoteImage getSelfieRightPictograph() {
                    return this.selfieRightPictograph;
                }

                public int hashCode() {
                    RemoteImage remoteImage = this.headerPictograph;
                    int hashCode = (remoteImage == null ? 0 : remoteImage.hashCode()) * 31;
                    RemoteImage remoteImage2 = this.selfiePictograph;
                    int hashCode2 = (hashCode + (remoteImage2 == null ? 0 : remoteImage2.hashCode())) * 31;
                    RemoteImage remoteImage3 = this.selfieCenterPictograph;
                    int hashCode3 = (hashCode2 + (remoteImage3 == null ? 0 : remoteImage3.hashCode())) * 31;
                    RemoteImage remoteImage4 = this.selfieLeftPictograph;
                    int hashCode4 = (hashCode3 + (remoteImage4 == null ? 0 : remoteImage4.hashCode())) * 31;
                    RemoteImage remoteImage5 = this.selfieRightPictograph;
                    return hashCode4 + (remoteImage5 != null ? remoteImage5.hashCode() : 0);
                }

                public String toString() {
                    return "PromptPage(headerPictograph=" + this.headerPictograph + ", selfiePictograph=" + this.selfiePictograph + ", selfieCenterPictograph=" + this.selfieCenterPictograph + ", selfieLeftPictograph=" + this.selfieLeftPictograph + ", selfieRightPictograph=" + this.selfieRightPictograph + ")";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int flags) {
                    dest.getClass();
                    RemoteImage remoteImage = this.headerPictograph;
                    if (remoteImage == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        remoteImage.writeToParcel(dest, flags);
                    }
                    RemoteImage remoteImage2 = this.selfiePictograph;
                    if (remoteImage2 == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        remoteImage2.writeToParcel(dest, flags);
                    }
                    RemoteImage remoteImage3 = this.selfieCenterPictograph;
                    if (remoteImage3 == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        remoteImage3.writeToParcel(dest, flags);
                    }
                    RemoteImage remoteImage4 = this.selfieLeftPictograph;
                    if (remoteImage4 == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        remoteImage4.writeToParcel(dest, flags);
                    }
                    RemoteImage remoteImage5 = this.selfieRightPictograph;
                    if (remoteImage5 == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        remoteImage5.writeToParcel(dest, flags);
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<PromptPage> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final PromptPage createFromParcel(Parcel parcel) {
                        parcel.getClass();
                        return new PromptPage(parcel.readInt() == 0 ? null : RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? RemoteImage.CREATOR.createFromParcel(parcel) : null);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final PromptPage[] newArray(int i) {
                        return new PromptPage[i];
                    }
                }

                public PromptPage(RemoteImage remoteImage, RemoteImage remoteImage2, RemoteImage remoteImage3, RemoteImage remoteImage4, RemoteImage remoteImage5) {
                    this.headerPictograph = remoteImage;
                    this.selfiePictograph = remoteImage2;
                    this.selfieCenterPictograph = remoteImage3;
                    this.selfieLeftPictograph = remoteImage4;
                    this.selfieRightPictograph = remoteImage5;
                }

                public PromptPage() {
                    this(null, null, null, null, null, 31, null);
                }
            }

            @JsonClass(generateAdapter = true)
            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001e"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig$RecordPage;", "Landroid/os/Parcelable;", "loadingPictograph", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "selfieLeftPictograph", "selfieRightPictograph", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;)V", "getLoadingPictograph", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "getSelfieLeftPictograph", "getSelfieRightPictograph", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class RecordPage implements Parcelable {
                public static final Parcelable.Creator<RecordPage> CREATOR = new Creator();
                private final RemoteImage loadingPictograph;
                private final RemoteImage selfieLeftPictograph;
                private final RemoteImage selfieRightPictograph;

                public /* synthetic */ RecordPage(RemoteImage remoteImage, RemoteImage remoteImage2, RemoteImage remoteImage3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : remoteImage, (i & 2) != 0 ? null : remoteImage2, (i & 4) != 0 ? null : remoteImage3);
                }

                public static /* synthetic */ RecordPage copy$default(RecordPage recordPage, RemoteImage remoteImage, RemoteImage remoteImage2, RemoteImage remoteImage3, int i, Object obj) {
                    if ((i & 1) != 0) {
                        remoteImage = recordPage.loadingPictograph;
                    }
                    if ((i & 2) != 0) {
                        remoteImage2 = recordPage.selfieLeftPictograph;
                    }
                    if ((i & 4) != 0) {
                        remoteImage3 = recordPage.selfieRightPictograph;
                    }
                    return recordPage.copy(remoteImage, remoteImage2, remoteImage3);
                }

                /* renamed from: component1, reason: from getter */
                public final RemoteImage getLoadingPictograph() {
                    return this.loadingPictograph;
                }

                /* renamed from: component2, reason: from getter */
                public final RemoteImage getSelfieLeftPictograph() {
                    return this.selfieLeftPictograph;
                }

                /* renamed from: component3, reason: from getter */
                public final RemoteImage getSelfieRightPictograph() {
                    return this.selfieRightPictograph;
                }

                public final RecordPage copy(RemoteImage loadingPictograph, RemoteImage selfieLeftPictograph, RemoteImage selfieRightPictograph) {
                    return new RecordPage(loadingPictograph, selfieLeftPictograph, selfieRightPictograph);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof RecordPage)) {
                        return false;
                    }
                    RecordPage recordPage = (RecordPage) other;
                    return Intrinsics.areEqual(this.loadingPictograph, recordPage.loadingPictograph) && Intrinsics.areEqual(this.selfieLeftPictograph, recordPage.selfieLeftPictograph) && Intrinsics.areEqual(this.selfieRightPictograph, recordPage.selfieRightPictograph);
                }

                public final RemoteImage getLoadingPictograph() {
                    return this.loadingPictograph;
                }

                public final RemoteImage getSelfieLeftPictograph() {
                    return this.selfieLeftPictograph;
                }

                public final RemoteImage getSelfieRightPictograph() {
                    return this.selfieRightPictograph;
                }

                public int hashCode() {
                    RemoteImage remoteImage = this.loadingPictograph;
                    int hashCode = (remoteImage == null ? 0 : remoteImage.hashCode()) * 31;
                    RemoteImage remoteImage2 = this.selfieLeftPictograph;
                    int hashCode2 = (hashCode + (remoteImage2 == null ? 0 : remoteImage2.hashCode())) * 31;
                    RemoteImage remoteImage3 = this.selfieRightPictograph;
                    return hashCode2 + (remoteImage3 != null ? remoteImage3.hashCode() : 0);
                }

                public String toString() {
                    return "RecordPage(loadingPictograph=" + this.loadingPictograph + ", selfieLeftPictograph=" + this.selfieLeftPictograph + ", selfieRightPictograph=" + this.selfieRightPictograph + ")";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int flags) {
                    dest.getClass();
                    RemoteImage remoteImage = this.loadingPictograph;
                    if (remoteImage == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        remoteImage.writeToParcel(dest, flags);
                    }
                    RemoteImage remoteImage2 = this.selfieLeftPictograph;
                    if (remoteImage2 == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        remoteImage2.writeToParcel(dest, flags);
                    }
                    RemoteImage remoteImage3 = this.selfieRightPictograph;
                    if (remoteImage3 == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        remoteImage3.writeToParcel(dest, flags);
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<RecordPage> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final RecordPage createFromParcel(Parcel parcel) {
                        parcel.getClass();
                        return new RecordPage(parcel.readInt() == 0 ? null : RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? RemoteImage.CREATOR.createFromParcel(parcel) : null);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final RecordPage[] newArray(int i) {
                        return new RecordPage[i];
                    }
                }

                public RecordPage(RemoteImage remoteImage, RemoteImage remoteImage2, RemoteImage remoteImage3) {
                    this.loadingPictograph = remoteImage;
                    this.selfieLeftPictograph = remoteImage2;
                    this.selfieRightPictograph = remoteImage3;
                }

                public RecordPage() {
                    this(null, null, null, 7, null);
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<AssetConfig> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AssetConfig createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new AssetConfig(parcel.readInt() == 0 ? null : PromptPage.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? RecordPage.CREATOR.createFromParcel(parcel) : null);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AssetConfig[] newArray(int i) {
                    return new AssetConfig[i];
                }
            }

            public AssetConfig(PromptPage promptPage, RecordPage recordPage) {
                this.promptPage = promptPage;
                this.recordPage = recordPage;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public AssetConfig() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @JsonClass(generateAdapter = false)
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CaptureFileType;", "", "<init>", "(Ljava/lang/String;I)V", "Image", "Video", "Unknown", "Companion", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class CaptureFileType {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ CaptureFileType[] $VALUES;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            public static final CaptureFileType Image = new CaptureFileType("Image", 0);
            public static final CaptureFileType Video = new CaptureFileType("Video", 1);
            public static final CaptureFileType Unknown = new CaptureFileType("Unknown", 2);

            private static final /* synthetic */ CaptureFileType[] $values() {
                return new CaptureFileType[]{Image, Video, Unknown};
            }

            static {
                CaptureFileType[] $values = $values();
                $VALUES = $values;
                $ENTRIES = Tags.enumEntries($values);
                INSTANCE = new Companion(null);
            }

            private CaptureFileType(String str, int i) {
            }

            public static EnumEntries getEntries() {
                return $ENTRIES;
            }

            public static CaptureFileType valueOf(String str) {
                return (CaptureFileType) Enum.valueOf(CaptureFileType.class, str);
            }

            public static CaptureFileType[] values() {
                return (CaptureFileType[]) $VALUES.clone();
            }

            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0017J\u001a\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0017¨\u0006\r"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CaptureFileType$Companion;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CaptureFileType;", "<init>", "()V", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Companion extends JsonAdapter {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                @Override // com.squareup.moshi.JsonAdapter
                @FromJson
                public CaptureFileType fromJson(JsonReader reader) {
                    reader.getClass();
                    Object readJsonValue = reader.readJsonValue();
                    return Intrinsics.areEqual(readJsonValue, "video") ? CaptureFileType.Video : Intrinsics.areEqual(readJsonValue, "image") ? CaptureFileType.Image : CaptureFileType.Unknown;
                }

                private Companion() {
                }

                @Override // com.squareup.moshi.JsonAdapter
                @ToJson
                public void toJson(JsonWriter writer, CaptureFileType value) {
                    writer.getClass();
                }
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @JsonClass(generateAdapter = false)
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$VideoCaptureMethod;", "", "<init>", "(Ljava/lang/String;I)V", "Stream", "Upload", "None", "Companion", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class VideoCaptureMethod {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ VideoCaptureMethod[] $VALUES;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            public static final VideoCaptureMethod Stream = new VideoCaptureMethod("Stream", 0);
            public static final VideoCaptureMethod Upload = new VideoCaptureMethod("Upload", 1);
            public static final VideoCaptureMethod None = new VideoCaptureMethod("None", 2);

            private static final /* synthetic */ VideoCaptureMethod[] $values() {
                return new VideoCaptureMethod[]{Stream, Upload, None};
            }

            static {
                VideoCaptureMethod[] $values = $values();
                $VALUES = $values;
                $ENTRIES = Tags.enumEntries($values);
                INSTANCE = new Companion(null);
            }

            private VideoCaptureMethod(String str, int i) {
            }

            public static EnumEntries getEntries() {
                return $ENTRIES;
            }

            public static VideoCaptureMethod valueOf(String str) {
                return (VideoCaptureMethod) Enum.valueOf(VideoCaptureMethod.class, str);
            }

            public static VideoCaptureMethod[] values() {
                return (VideoCaptureMethod[]) $VALUES.clone();
            }

            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0017J\u001a\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0017¨\u0006\r"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$VideoCaptureMethod$Companion;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$VideoCaptureMethod;", "<init>", "()V", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Companion extends JsonAdapter {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                @Override // com.squareup.moshi.JsonAdapter
                @FromJson
                public VideoCaptureMethod fromJson(JsonReader reader) {
                    reader.getClass();
                    Object readJsonValue = reader.readJsonValue();
                    return Intrinsics.areEqual(readJsonValue, "stream") ? VideoCaptureMethod.Stream : Intrinsics.areEqual(readJsonValue, "upload") ? VideoCaptureMethod.Upload : VideoCaptureMethod.None;
                }

                private Companion() {
                }

                @Override // com.squareup.moshi.JsonAdapter
                @ToJson
                public void toJson(JsonWriter writer, VideoCaptureMethod value) {
                    writer.getClass();
                }
            }
        }

        @JsonClass(generateAdapter = true)
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b)\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B±\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0006\u0010,\u001a\u00020-J\u0016\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020-R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0019R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0019R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0019R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0019R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0019R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0019R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0019R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0019R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0019¨\u00063"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CapturePage;", "Landroid/os/Parcelable;", "title", "", "selfieHintTakePhoto", "selfieHintCenterFace", "selfieHintFaceTooClose", "selfieHintFaceTooFar", "selfieHintMultipleFaces", "selfieHintFaceIncomplete", "selfieHintPoseNotCenter", "selfieHintLookLeft", "selfieHintLookRight", "selfieHintHoldStill", "autoCaptureOn", "captureSuccess", "selfieHintCenterFaceDescription", "selfieHintLookLeftDescription", "selfieHintLookRightDescription", "cameraLoadingTitle", "selfieHintVerifying", "selfieHintAutoCaptureTimeout", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getSelfieHintTakePhoto", "getSelfieHintCenterFace", "getSelfieHintFaceTooClose", "getSelfieHintFaceTooFar", "getSelfieHintMultipleFaces", "getSelfieHintFaceIncomplete", "getSelfieHintPoseNotCenter", "getSelfieHintLookLeft", "getSelfieHintLookRight", "getSelfieHintHoldStill", "getAutoCaptureOn", "getCaptureSuccess", "getSelfieHintCenterFaceDescription", "getSelfieHintLookLeftDescription", "getSelfieHintLookRightDescription", "getCameraLoadingTitle", "getSelfieHintVerifying", "getSelfieHintAutoCaptureTimeout", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class CapturePage implements Parcelable {
            public static final Parcelable.Creator<CapturePage> CREATOR = new Creator();
            private final String autoCaptureOn;
            private final String cameraLoadingTitle;
            private final String captureSuccess;
            private final String selfieHintAutoCaptureTimeout;
            private final String selfieHintCenterFace;
            private final String selfieHintCenterFaceDescription;
            private final String selfieHintFaceIncomplete;
            private final String selfieHintFaceTooClose;
            private final String selfieHintFaceTooFar;
            private final String selfieHintHoldStill;
            private final String selfieHintLookLeft;
            private final String selfieHintLookLeftDescription;
            private final String selfieHintLookRight;
            private final String selfieHintLookRightDescription;
            private final String selfieHintMultipleFaces;
            private final String selfieHintPoseNotCenter;
            private final String selfieHintTakePhoto;
            private final String selfieHintVerifying;
            private final String title;

            public CapturePage(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, str3, str4, str5, str6);
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str7, str8, str9, str10, str11);
                this.title = str;
                this.selfieHintTakePhoto = str2;
                this.selfieHintCenterFace = str3;
                this.selfieHintFaceTooClose = str4;
                this.selfieHintFaceTooFar = str5;
                this.selfieHintMultipleFaces = str6;
                this.selfieHintFaceIncomplete = str7;
                this.selfieHintPoseNotCenter = str8;
                this.selfieHintLookLeft = str9;
                this.selfieHintLookRight = str10;
                this.selfieHintHoldStill = str11;
                this.autoCaptureOn = str12;
                this.captureSuccess = str13;
                this.selfieHintCenterFaceDescription = str14;
                this.selfieHintLookLeftDescription = str15;
                this.selfieHintLookRightDescription = str16;
                this.cameraLoadingTitle = str17;
                this.selfieHintVerifying = str18;
                this.selfieHintAutoCaptureTimeout = str19;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final String getAutoCaptureOn() {
                return this.autoCaptureOn;
            }

            public final String getCameraLoadingTitle() {
                return this.cameraLoadingTitle;
            }

            public final String getCaptureSuccess() {
                return this.captureSuccess;
            }

            public final String getSelfieHintAutoCaptureTimeout() {
                return this.selfieHintAutoCaptureTimeout;
            }

            public final String getSelfieHintCenterFace() {
                return this.selfieHintCenterFace;
            }

            public final String getSelfieHintCenterFaceDescription() {
                return this.selfieHintCenterFaceDescription;
            }

            public final String getSelfieHintFaceIncomplete() {
                return this.selfieHintFaceIncomplete;
            }

            public final String getSelfieHintFaceTooClose() {
                return this.selfieHintFaceTooClose;
            }

            public final String getSelfieHintFaceTooFar() {
                return this.selfieHintFaceTooFar;
            }

            public final String getSelfieHintHoldStill() {
                return this.selfieHintHoldStill;
            }

            public final String getSelfieHintLookLeft() {
                return this.selfieHintLookLeft;
            }

            public final String getSelfieHintLookLeftDescription() {
                return this.selfieHintLookLeftDescription;
            }

            public final String getSelfieHintLookRight() {
                return this.selfieHintLookRight;
            }

            public final String getSelfieHintLookRightDescription() {
                return this.selfieHintLookRightDescription;
            }

            public final String getSelfieHintMultipleFaces() {
                return this.selfieHintMultipleFaces;
            }

            public final String getSelfieHintPoseNotCenter() {
                return this.selfieHintPoseNotCenter;
            }

            public final String getSelfieHintTakePhoto() {
                return this.selfieHintTakePhoto;
            }

            public final String getSelfieHintVerifying() {
                return this.selfieHintVerifying;
            }

            public final String getTitle() {
                return this.title;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.getClass();
                dest.writeString(this.title);
                dest.writeString(this.selfieHintTakePhoto);
                dest.writeString(this.selfieHintCenterFace);
                dest.writeString(this.selfieHintFaceTooClose);
                dest.writeString(this.selfieHintFaceTooFar);
                dest.writeString(this.selfieHintMultipleFaces);
                dest.writeString(this.selfieHintFaceIncomplete);
                dest.writeString(this.selfieHintPoseNotCenter);
                dest.writeString(this.selfieHintLookLeft);
                dest.writeString(this.selfieHintLookRight);
                dest.writeString(this.selfieHintHoldStill);
                dest.writeString(this.autoCaptureOn);
                dest.writeString(this.captureSuccess);
                dest.writeString(this.selfieHintCenterFaceDescription);
                dest.writeString(this.selfieHintLookLeftDescription);
                dest.writeString(this.selfieHintLookRightDescription);
                dest.writeString(this.cameraLoadingTitle);
                dest.writeString(this.selfieHintVerifying);
                dest.writeString(this.selfieHintAutoCaptureTimeout);
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<CapturePage> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CapturePage createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new CapturePage(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CapturePage[] newArray(int i) {
                    return new CapturePage[i];
                }
            }
        }

        @JsonClass(generateAdapter = true)
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0015R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CheckPage;", "Landroid/os/Parcelable;", "title", "", "description", "selfieLabelFront", "selfieLabelLeft", "selfieLabelRight", "btnSubmit", "btnRetake", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getSelfieLabelFront", "getSelfieLabelLeft", "getSelfieLabelRight", "getBtnSubmit", "getBtnRetake", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class CheckPage implements Parcelable {
            public static final Parcelable.Creator<CheckPage> CREATOR = new Creator();
            private final String btnRetake;
            private final String btnSubmit;
            private final String description;
            private final String selfieLabelFront;
            private final String selfieLabelLeft;
            private final String selfieLabelRight;
            private final String title;

            public CheckPage(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
                this.title = str;
                this.description = str2;
                this.selfieLabelFront = str3;
                this.selfieLabelLeft = str4;
                this.selfieLabelRight = str5;
                this.btnSubmit = str6;
                this.btnRetake = str7;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final String getBtnRetake() {
                return this.btnRetake;
            }

            public final String getBtnSubmit() {
                return this.btnSubmit;
            }

            public final String getDescription() {
                return this.description;
            }

            public final String getSelfieLabelFront() {
                return this.selfieLabelFront;
            }

            public final String getSelfieLabelLeft() {
                return this.selfieLabelLeft;
            }

            public final String getSelfieLabelRight() {
                return this.selfieLabelRight;
            }

            public final String getTitle() {
                return this.title;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.getClass();
                dest.writeString(this.title);
                dest.writeString(this.description);
                dest.writeString(this.selfieLabelFront);
                dest.writeString(this.selfieLabelLeft);
                dest.writeString(this.selfieLabelRight);
                dest.writeString(this.btnSubmit);
                dest.writeString(this.btnRetake);
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<CheckPage> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CheckPage createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new CheckPage(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CheckPage[] newArray(int i) {
                    return new CheckPage[i];
                }
            }
        }

        @JsonClass(generateAdapter = true)
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0018\u001a\u00020\u0019J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$Localizations;", "Landroid/os/Parcelable;", "promptPage", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$PromptPage;", "capturePage", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CapturePage;", "pendingPage", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$PendingPage;", "cancelDialog", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "checkPage", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CheckPage;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$PromptPage;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CapturePage;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$PendingPage;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CheckPage;)V", "getPromptPage", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$PromptPage;", "getCapturePage", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CapturePage;", "getPendingPage", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$PendingPage;", "getCancelDialog", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "getCheckPage", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CheckPage;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Localizations implements Parcelable {
            public static final Parcelable.Creator<Localizations> CREATOR = new Creator();
            private final CancelDialog cancelDialog;
            private final CapturePage capturePage;
            private final CheckPage checkPage;
            private final PendingPage pendingPage;
            private final PromptPage promptPage;

            public Localizations(PromptPage promptPage, CapturePage capturePage, PendingPage pendingPage, CancelDialog cancelDialog, CheckPage checkPage) {
                promptPage.getClass();
                capturePage.getClass();
                pendingPage.getClass();
                this.promptPage = promptPage;
                this.capturePage = capturePage;
                this.pendingPage = pendingPage;
                this.cancelDialog = cancelDialog;
                this.checkPage = checkPage;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final CancelDialog getCancelDialog() {
                return this.cancelDialog;
            }

            public final CapturePage getCapturePage() {
                return this.capturePage;
            }

            public final CheckPage getCheckPage() {
                return this.checkPage;
            }

            public final PendingPage getPendingPage() {
                return this.pendingPage;
            }

            public final PromptPage getPromptPage() {
                return this.promptPage;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.getClass();
                this.promptPage.writeToParcel(dest, flags);
                this.capturePage.writeToParcel(dest, flags);
                this.pendingPage.writeToParcel(dest, flags);
                CancelDialog cancelDialog = this.cancelDialog;
                if (cancelDialog == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    cancelDialog.writeToParcel(dest, flags);
                }
                CheckPage checkPage = this.checkPage;
                if (checkPage == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    checkPage.writeToParcel(dest, flags);
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Localizations> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Localizations createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new Localizations(PromptPage.CREATOR.createFromParcel(parcel), CapturePage.CREATOR.createFromParcel(parcel), PendingPage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CancelDialog.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? CheckPage.CREATOR.createFromParcel(parcel) : null);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Localizations[] newArray(int i) {
                    return new Localizations[i];
                }
            }
        }

        @JsonClass(generateAdapter = true)
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$PendingPage;", "Landroid/os/Parcelable;", "title", "", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class PendingPage implements Parcelable {
            public static final Parcelable.Creator<PendingPage> CREATOR = new Creator();
            private final String description;
            private final String title;

            public PendingPage(String str, String str2) {
                str.getClass();
                str2.getClass();
                this.title = str;
                this.description = str2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final String getDescription() {
                return this.description;
            }

            public final String getTitle() {
                return this.title;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.getClass();
                dest.writeString(this.title);
                dest.writeString(this.description);
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<PendingPage> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PendingPage createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new PendingPage(parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PendingPage[] newArray(int i) {
                    return new PendingPage[i];
                }
            }
        }

        @JsonClass(generateAdapter = true)
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010 \u001a\u00020!J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020!R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013¨\u0006'"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$PromptPage;", "Landroid/os/Parcelable;", "title", "", "prompt", "promptCenter", "disclosure", "buttonSubmit", "cameraPermissionsTitle", "cameraPermissionsPrompt", "cameraPermissionsAllowButtonText", "cameraPermissionsCancelButtonText", "microphonePermissionsBtnCancel", "microphonePermissionsBtnContinueMobile", "microphonePermissionsPrompt", "microphonePermissionsTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getPrompt", "getPromptCenter", "getDisclosure", "getButtonSubmit", "getCameraPermissionsTitle", "getCameraPermissionsPrompt", "getCameraPermissionsAllowButtonText", "getCameraPermissionsCancelButtonText", "getMicrophonePermissionsBtnCancel", "getMicrophonePermissionsBtnContinueMobile", "getMicrophonePermissionsPrompt", "getMicrophonePermissionsTitle", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class PromptPage implements Parcelable {
            public static final Parcelable.Creator<PromptPage> CREATOR = new Creator();
            private final String buttonSubmit;
            private final String cameraPermissionsAllowButtonText;
            private final String cameraPermissionsCancelButtonText;
            private final String cameraPermissionsPrompt;
            private final String cameraPermissionsTitle;
            private final String disclosure;
            private final String microphonePermissionsBtnCancel;
            private final String microphonePermissionsBtnContinueMobile;
            private final String microphonePermissionsPrompt;
            private final String microphonePermissionsTitle;
            private final String prompt;
            private final String promptCenter;
            private final String title;

            public PromptPage(@Json(name = "selfieTitle") String str, @Json(name = "selfiePrompt") String str2, @Json(name = "selfiePromptCenter") String str3, @Json(name = "agreeToPolicy") String str4, @Json(name = "btnSubmit") String str5, String str6, String str7, @Json(name = "cameraPermissionsBtnContinueMobile") String str8, @Json(name = "cameraPermissionsBtnCancel") String str9, String str10, String str11, String str12, String str13) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, str2, str3, str4, str5);
                this.title = str;
                this.prompt = str2;
                this.promptCenter = str3;
                this.disclosure = str4;
                this.buttonSubmit = str5;
                this.cameraPermissionsTitle = str6;
                this.cameraPermissionsPrompt = str7;
                this.cameraPermissionsAllowButtonText = str8;
                this.cameraPermissionsCancelButtonText = str9;
                this.microphonePermissionsBtnCancel = str10;
                this.microphonePermissionsBtnContinueMobile = str11;
                this.microphonePermissionsPrompt = str12;
                this.microphonePermissionsTitle = str13;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final String getButtonSubmit() {
                return this.buttonSubmit;
            }

            public final String getCameraPermissionsAllowButtonText() {
                return this.cameraPermissionsAllowButtonText;
            }

            public final String getCameraPermissionsCancelButtonText() {
                return this.cameraPermissionsCancelButtonText;
            }

            public final String getCameraPermissionsPrompt() {
                return this.cameraPermissionsPrompt;
            }

            public final String getCameraPermissionsTitle() {
                return this.cameraPermissionsTitle;
            }

            public final String getDisclosure() {
                return this.disclosure;
            }

            public final String getMicrophonePermissionsBtnCancel() {
                return this.microphonePermissionsBtnCancel;
            }

            public final String getMicrophonePermissionsBtnContinueMobile() {
                return this.microphonePermissionsBtnContinueMobile;
            }

            public final String getMicrophonePermissionsPrompt() {
                return this.microphonePermissionsPrompt;
            }

            public final String getMicrophonePermissionsTitle() {
                return this.microphonePermissionsTitle;
            }

            public final String getPrompt() {
                return this.prompt;
            }

            public final String getPromptCenter() {
                return this.promptCenter;
            }

            public final String getTitle() {
                return this.title;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.getClass();
                dest.writeString(this.title);
                dest.writeString(this.prompt);
                dest.writeString(this.promptCenter);
                dest.writeString(this.disclosure);
                dest.writeString(this.buttonSubmit);
                dest.writeString(this.cameraPermissionsTitle);
                dest.writeString(this.cameraPermissionsPrompt);
                dest.writeString(this.cameraPermissionsAllowButtonText);
                dest.writeString(this.cameraPermissionsCancelButtonText);
                dest.writeString(this.microphonePermissionsBtnCancel);
                dest.writeString(this.microphonePermissionsBtnContinueMobile);
                dest.writeString(this.microphonePermissionsPrompt);
                dest.writeString(this.microphonePermissionsTitle);
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<PromptPage> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PromptPage createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new PromptPage(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PromptPage[] newArray(int i) {
                    return new PromptPage[i];
                }
            }
        }

        @JsonClass(generateAdapter = true)
        @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\"\b\u0007\u0018\u00002\u00020\u0001Bç\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u000e\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u000e\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!¢\u0006\u0004\b\"\u0010#R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010(\u001a\u0004\b&\u0010'R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010(\u001a\u0004\b)\u0010'R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010(\u001a\u0004\b0\u0010'R\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b3\u00102R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b6\u0010-R\u0019\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b7\u00102R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010(\u001a\u0004\b:\u0010'R\u0019\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b;\u00102R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b<\u0010-R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b=\u0010-R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b>\u0010-R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b?\u0010-R\u0015\u0010 \u001a\u0004\u0018\u00010!¢\u0006\n\n\u0002\u0010B\u001a\u0004\b@\u0010A¨\u0006C"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$Config;", "", "selfieType", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CaptureMethod;", "backStepEnabled", "", "cancelButtonEnabled", "localizations", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$Localizations;", "fieldKeySelfie", "", "requireStrictSelfieCapture", "skipPromptPage", "enabledCaptureFileTypes", "", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CaptureFileType;", "videoCaptureMethods", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$VideoCaptureMethod;", "assets", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig;", "videoSessionJwt", "orderedPoses", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;", "pendingPageTextVerticalPosition", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "audioEnabled", "poseConfigs", "Lcom/withpersona/sdk2/inquiry/network/dto/selfie/PoseConfig;", "designVersion", "imageUploadUrl", "flowWatermarkText", "silentNetworkAuthenticationCheckUrl", "silentNetworkAuthenticationBackgroundTimeoutSeconds", "", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CaptureMethod;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$Localizations;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/util/List;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getSelfieType", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CaptureMethod;", "getBackStepEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCancelButtonEnabled", "getLocalizations", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$Localizations;", "getFieldKeySelfie", "()Ljava/lang/String;", "getRequireStrictSelfieCapture", "()Z", "getSkipPromptPage", "getEnabledCaptureFileTypes", "()Ljava/util/List;", "getVideoCaptureMethods", "getAssets", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig;", "getVideoSessionJwt", "getOrderedPoses", "getPendingPageTextVerticalPosition", "()Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "getAudioEnabled", "getPoseConfigs", "getDesignVersion", "getImageUploadUrl", "getFlowWatermarkText", "getSilentNetworkAuthenticationCheckUrl", "getSilentNetworkAuthenticationBackgroundTimeoutSeconds", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Config {
            private final AssetConfig assets;
            private final Boolean audioEnabled;
            private final Boolean backStepEnabled;
            private final Boolean cancelButtonEnabled;
            private final String designVersion;
            private final List<CaptureFileType> enabledCaptureFileTypes;
            private final String fieldKeySelfie;
            private final String flowWatermarkText;
            private final String imageUploadUrl;
            private final Localizations localizations;
            private final List<SelfiePose> orderedPoses;
            private final PendingPageTextPosition pendingPageTextVerticalPosition;
            private final List<PoseConfig> poseConfigs;
            private final boolean requireStrictSelfieCapture;
            private final CaptureMethod selfieType;
            private final Integer silentNetworkAuthenticationBackgroundTimeoutSeconds;
            private final String silentNetworkAuthenticationCheckUrl;
            private final Boolean skipPromptPage;
            private final List<VideoCaptureMethod> videoCaptureMethods;
            private final String videoSessionJwt;

            public /* synthetic */ Config(CaptureMethod captureMethod, Boolean bool, Boolean bool2, Localizations localizations, String str, boolean z, Boolean bool3, List list, List list2, AssetConfig assetConfig, String str2, List list3, PendingPageTextPosition pendingPageTextPosition, Boolean bool4, List list4, String str3, String str4, String str5, String str6, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(captureMethod, bool, bool2, localizations, str, z, bool3, list, list2, assetConfig, str2, list3, pendingPageTextPosition, bool4, list4, str3, str4, (i & PKIFailureInfo.unsupportedVersion) != 0 ? null : str5, (i & PKIFailureInfo.transactionIdInUse) != 0 ? null : str6, (i & PKIFailureInfo.signerNotTrusted) != 0 ? null : num);
            }

            public final AssetConfig getAssets() {
                return this.assets;
            }

            public final Boolean getAudioEnabled() {
                return this.audioEnabled;
            }

            public final Boolean getBackStepEnabled() {
                return this.backStepEnabled;
            }

            public final Boolean getCancelButtonEnabled() {
                return this.cancelButtonEnabled;
            }

            public final String getDesignVersion() {
                return this.designVersion;
            }

            public final List<CaptureFileType> getEnabledCaptureFileTypes() {
                return this.enabledCaptureFileTypes;
            }

            public final String getFieldKeySelfie() {
                return this.fieldKeySelfie;
            }

            public final String getFlowWatermarkText() {
                return this.flowWatermarkText;
            }

            public final String getImageUploadUrl() {
                return this.imageUploadUrl;
            }

            public final Localizations getLocalizations() {
                return this.localizations;
            }

            public final List<SelfiePose> getOrderedPoses() {
                return this.orderedPoses;
            }

            public final PendingPageTextPosition getPendingPageTextVerticalPosition() {
                return this.pendingPageTextVerticalPosition;
            }

            public final List<PoseConfig> getPoseConfigs() {
                return this.poseConfigs;
            }

            public final boolean getRequireStrictSelfieCapture() {
                return this.requireStrictSelfieCapture;
            }

            public final CaptureMethod getSelfieType() {
                return this.selfieType;
            }

            public final Integer getSilentNetworkAuthenticationBackgroundTimeoutSeconds() {
                return this.silentNetworkAuthenticationBackgroundTimeoutSeconds;
            }

            public final String getSilentNetworkAuthenticationCheckUrl() {
                return this.silentNetworkAuthenticationCheckUrl;
            }

            public final Boolean getSkipPromptPage() {
                return this.skipPromptPage;
            }

            public final List<VideoCaptureMethod> getVideoCaptureMethods() {
                return this.videoCaptureMethods;
            }

            public final String getVideoSessionJwt() {
                return this.videoSessionJwt;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Config(CaptureMethod captureMethod, Boolean bool, Boolean bool2, Localizations localizations, String str, boolean z, Boolean bool3, List<? extends CaptureFileType> list, List<? extends VideoCaptureMethod> list2, AssetConfig assetConfig, @Json(name = "videoSessionJWT") String str2, List<? extends SelfiePose> list3, PendingPageTextPosition pendingPageTextPosition, Boolean bool4, List<PoseConfig> list4, String str3, @Json(name = "imageUploadUrl") String str4, String str5, String str6, Integer num) {
                captureMethod.getClass();
                localizations.getClass();
                str.getClass();
                assetConfig.getClass();
                this.selfieType = captureMethod;
                this.backStepEnabled = bool;
                this.cancelButtonEnabled = bool2;
                this.localizations = localizations;
                this.fieldKeySelfie = str;
                this.requireStrictSelfieCapture = z;
                this.skipPromptPage = bool3;
                this.enabledCaptureFileTypes = list;
                this.videoCaptureMethods = list2;
                this.assets = assetConfig;
                this.videoSessionJwt = str2;
                this.orderedPoses = list3;
                this.pendingPageTextVerticalPosition = pendingPageTextPosition;
                this.audioEnabled = bool4;
                this.poseConfigs = list4;
                this.designVersion = str3;
                this.imageUploadUrl = str4;
                this.flowWatermarkText = str5;
                this.silentNetworkAuthenticationCheckUrl = str6;
                this.silentNetworkAuthenticationBackgroundTimeoutSeconds = num;
            }
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Unknown;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Unknown extends NextStep {
        public static final Unknown INSTANCE = new Unknown();

        private Unknown() {
            super("unknown", null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Unknown);
        }

        public int hashCode() {
            return -1141780238;
        }

        public String toString() {
            return "Unknown";
        }
    }

    private NextStep(String str) {
        this.name = str;
    }

    public String getName() {
        return this.name;
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0004\u0018\u0019\u001a\u001bB#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0012R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;", "Landroid/os/Parcelable;", "name", "", "config", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$Config;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$IntegrationStepStyle;", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$Config;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$IntegrationStepStyle;)V", "getName", "()Ljava/lang/String;", "getConfig", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$Config;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$IntegrationStepStyle;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Config", "IntegrationStepBrowserType", "Localizations", "PendingPage", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Integration extends NextStep implements Parcelable {
        public static final Parcelable.Creator<Integration> CREATOR = new Creator();
        private final Config config;
        private final String name;
        private final StepStyles.IntegrationStepStyle styles;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$IntegrationStepBrowserType;", "", "<init>", "(Ljava/lang/String;I)V", "External", "AuthSession", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class IntegrationStepBrowserType {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ IntegrationStepBrowserType[] $VALUES;

            @Json(name = "external")
            public static final IntegrationStepBrowserType External = new IntegrationStepBrowserType("External", 0);

            @Json(name = "auth_session")
            public static final IntegrationStepBrowserType AuthSession = new IntegrationStepBrowserType("AuthSession", 1);

            private static final /* synthetic */ IntegrationStepBrowserType[] $values() {
                return new IntegrationStepBrowserType[]{External, AuthSession};
            }

            static {
                IntegrationStepBrowserType[] $values = $values();
                $VALUES = $values;
                $ENTRIES = Tags.enumEntries($values);
            }

            private IntegrationStepBrowserType(String str, int i) {
            }

            public static EnumEntries getEntries() {
                return $ENTRIES;
            }

            public static IntegrationStepBrowserType valueOf(String str) {
                return (IntegrationStepBrowserType) Enum.valueOf(IntegrationStepBrowserType.class, str);
            }

            public static IntegrationStepBrowserType[] values() {
                return (IntegrationStepBrowserType[]) $VALUES.clone();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Integration(String str, Config config, StepStyles.IntegrationStepStyle integrationStepStyle) {
            super(str, null);
            str.getClass();
            config.getClass();
            this.name = str;
            this.config = config;
            this.styles = integrationStepStyle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final Config getConfig() {
            return this.config;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.NextStep
        public String getName() {
            return this.name;
        }

        public final StepStyles.IntegrationStepStyle getStyles() {
            return this.styles;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            dest.writeString(this.name);
            this.config.writeToParcel(dest, flags);
            StepStyles.IntegrationStepStyle integrationStepStyle = this.styles;
            if (integrationStepStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                integrationStepStyle.writeToParcel(dest, flags);
            }
        }

        @JsonClass(generateAdapter = true)
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BQ\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u001b\u001a\u00020\u001cJ\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u001cR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006\""}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$Config;", "Landroid/os/Parcelable;", "backStepEnabled", "", "cancelButtonEnabled", "type", "", "flowUrl", "redirectPath", "integrationStepBrowserType", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$IntegrationStepBrowserType;", "localizations", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$Localizations;", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$IntegrationStepBrowserType;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$Localizations;)V", "getBackStepEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCancelButtonEnabled", "getType", "()Ljava/lang/String;", "getFlowUrl", "getRedirectPath", "getIntegrationStepBrowserType", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$IntegrationStepBrowserType;", "getLocalizations", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$Localizations;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Config implements Parcelable {
            public static final Parcelable.Creator<Config> CREATOR = new Creator();
            private final Boolean backStepEnabled;
            private final Boolean cancelButtonEnabled;
            private final String flowUrl;
            private final IntegrationStepBrowserType integrationStepBrowserType;
            private final Localizations localizations;
            private final String redirectPath;
            private final String type;

            public /* synthetic */ Config(Boolean bool, Boolean bool2, String str, String str2, String str3, IntegrationStepBrowserType integrationStepBrowserType, Localizations localizations, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, str, str2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? IntegrationStepBrowserType.AuthSession : integrationStepBrowserType, (i & 64) != 0 ? null : localizations);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final Boolean getBackStepEnabled() {
                return this.backStepEnabled;
            }

            public final Boolean getCancelButtonEnabled() {
                return this.cancelButtonEnabled;
            }

            public final String getFlowUrl() {
                return this.flowUrl;
            }

            public final IntegrationStepBrowserType getIntegrationStepBrowserType() {
                return this.integrationStepBrowserType;
            }

            public final Localizations getLocalizations() {
                return this.localizations;
            }

            public final String getRedirectPath() {
                return this.redirectPath;
            }

            public final String getType() {
                return this.type;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.getClass();
                Boolean bool = this.backStepEnabled;
                if (bool == null) {
                    dest.writeInt(0);
                } else {
                    CameraState$Type$EnumUnboxingLocalUtility.m(dest, 1, bool);
                }
                Boolean bool2 = this.cancelButtonEnabled;
                if (bool2 == null) {
                    dest.writeInt(0);
                } else {
                    CameraState$Type$EnumUnboxingLocalUtility.m(dest, 1, bool2);
                }
                dest.writeString(this.type);
                dest.writeString(this.flowUrl);
                dest.writeString(this.redirectPath);
                IntegrationStepBrowserType integrationStepBrowserType = this.integrationStepBrowserType;
                if (integrationStepBrowserType == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dest.writeString(integrationStepBrowserType.name());
                }
                Localizations localizations = this.localizations;
                if (localizations == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    localizations.writeToParcel(dest, flags);
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Config> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Config createFromParcel(Parcel parcel) {
                    Boolean valueOf;
                    Boolean valueOf2;
                    IntegrationStepBrowserType integrationStepBrowserType;
                    parcel.getClass();
                    if (parcel.readInt() == 0) {
                        valueOf = null;
                    } else {
                        valueOf = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    if (parcel.readInt() == 0) {
                        integrationStepBrowserType = null;
                        valueOf2 = null;
                    } else {
                        valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                        integrationStepBrowserType = null;
                    }
                    return new Config(valueOf, valueOf2, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? integrationStepBrowserType : IntegrationStepBrowserType.valueOf(parcel.readString()), (Localizations) (parcel.readInt() == 0 ? integrationStepBrowserType : Localizations.CREATOR.createFromParcel(parcel)));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Config[] newArray(int i) {
                    return new Config[i];
                }
            }

            public Config(Boolean bool, Boolean bool2, String str, String str2, String str3, @Json(name = "integrationStepMobileSdkBrowserType") IntegrationStepBrowserType integrationStepBrowserType, Localizations localizations) {
                re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
                this.backStepEnabled = bool;
                this.cancelButtonEnabled = bool2;
                this.type = str;
                this.flowUrl = str2;
                this.redirectPath = str3;
                this.integrationStepBrowserType = integrationStepBrowserType;
                this.localizations = localizations;
            }
        }

        @JsonClass(generateAdapter = true)
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$Localizations;", "Landroid/os/Parcelable;", "cancelDialog", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "pendingPage", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$PendingPage;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$PendingPage;)V", "getCancelDialog", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "getPendingPage", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$PendingPage;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Localizations implements Parcelable {
            public static final Parcelable.Creator<Localizations> CREATOR = new Creator();
            private final CancelDialog cancelDialog;
            private final PendingPage pendingPage;

            public Localizations(CancelDialog cancelDialog, PendingPage pendingPage) {
                this.cancelDialog = cancelDialog;
                this.pendingPage = pendingPage;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final CancelDialog getCancelDialog() {
                return this.cancelDialog;
            }

            public final PendingPage getPendingPage() {
                return this.pendingPage;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.getClass();
                CancelDialog cancelDialog = this.cancelDialog;
                if (cancelDialog == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    cancelDialog.writeToParcel(dest, flags);
                }
                PendingPage pendingPage = this.pendingPage;
                if (pendingPage == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    pendingPage.writeToParcel(dest, flags);
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Localizations> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Localizations createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new Localizations(parcel.readInt() == 0 ? null : CancelDialog.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? PendingPage.CREATOR.createFromParcel(parcel) : null);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Localizations[] newArray(int i) {
                    return new Localizations[i];
                }
            }
        }

        @JsonClass(generateAdapter = true)
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$PendingPage;", "Landroid/os/Parcelable;", "title", "", "descriptionMobile", "btnLaunchMobile", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getDescriptionMobile", "getBtnLaunchMobile", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class PendingPage implements Parcelable {
            public static final Parcelable.Creator<PendingPage> CREATOR = new Creator();
            private final String btnLaunchMobile;
            private final String descriptionMobile;
            private final String title;

            public PendingPage(String str, String str2, String str3) {
                re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
                this.title = str;
                this.descriptionMobile = str2;
                this.btnLaunchMobile = str3;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final String getBtnLaunchMobile() {
                return this.btnLaunchMobile;
            }

            public final String getDescriptionMobile() {
                return this.descriptionMobile;
            }

            public final String getTitle() {
                return this.title;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.getClass();
                dest.writeString(this.title);
                dest.writeString(this.descriptionMobile);
                dest.writeString(this.btnLaunchMobile);
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<PendingPage> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PendingPage createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new PendingPage(parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PendingPage[] newArray(int i) {
                    return new PendingPage[i];
                }
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Integration> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Integration createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new Integration(parcel.readString(), Config.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepStyles.IntegrationStepStyle.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Integration[] newArray(int i) {
                return new Integration[i];
            }
        }

        public /* synthetic */ Integration(String str, Config config, StepStyles.IntegrationStepStyle integrationStepStyle, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, config, (i & 4) != 0 ? null : integrationStepStyle);
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0018\u0019\u001aB#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0012R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;", "Landroid/os/Parcelable;", "name", "", "config", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$Config;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$Config;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;)V", "getName", "()Ljava/lang/String;", "getConfig", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$Config;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Config", "Localizations", "PromptPage", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Ui extends NextStep implements Parcelable {
        public static final Parcelable.Creator<Ui> CREATOR = new Creator();
        private final Config config;
        private final String name;
        private final StepStyles.UiStepStyle styles;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ui(String str, Config config, StepStyles.UiStepStyle uiStepStyle) {
            super(str, null);
            str.getClass();
            config.getClass();
            this.name = str;
            this.config = config;
            this.styles = uiStepStyle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final Config getConfig() {
            return this.config;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.NextStep
        public String getName() {
            return this.name;
        }

        public final StepStyles.UiStepStyle getStyles() {
            return this.styles;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            dest.writeString(this.name);
            this.config.writeToParcel(dest, flags);
            StepStyles.UiStepStyle uiStepStyle = this.styles;
            if (uiStepStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                uiStepStyle.writeToParcel(dest, flags);
            }
        }

        @JsonClass(generateAdapter = true)
        @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001Be\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010\u001d\u001a\u00020\u001eJ\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001eR\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\u0014R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0017\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006$"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$Config;", "Landroid/os/Parcelable;", "components", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "backStepEnabled", "", "cancelButtonEnabled", "terminal", "localizations", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$Localizations;", "serverComponentErrors", "Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError;", "webviewUrl", "", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$Localizations;Ljava/util/List;Ljava/lang/String;)V", "getComponents", "()Ljava/util/List;", "getBackStepEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCancelButtonEnabled", "getTerminal", "getLocalizations", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$Localizations;", "getServerComponentErrors", "getWebviewUrl", "()Ljava/lang/String;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Config implements Parcelable {
            public static final Parcelable.Creator<Config> CREATOR = new Creator();
            private final Boolean backStepEnabled;
            private final Boolean cancelButtonEnabled;
            private final List<UiComponentConfig> components;
            private final Localizations localizations;
            private final List<UiComponentError> serverComponentErrors;
            private final Boolean terminal;
            private final String webviewUrl;

            public /* synthetic */ Config(List list, Boolean bool, Boolean bool2, Boolean bool3, Localizations localizations, List list2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(list, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : bool3, (i & 16) != 0 ? null : localizations, (i & 32) != 0 ? null : list2, (i & 64) != 0 ? null : str);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final Boolean getBackStepEnabled() {
                return this.backStepEnabled;
            }

            public final Boolean getCancelButtonEnabled() {
                return this.cancelButtonEnabled;
            }

            public final List<UiComponentConfig> getComponents() {
                return this.components;
            }

            public final Localizations getLocalizations() {
                return this.localizations;
            }

            public final List<UiComponentError> getServerComponentErrors() {
                return this.serverComponentErrors;
            }

            public final Boolean getTerminal() {
                return this.terminal;
            }

            public final String getWebviewUrl() {
                return this.webviewUrl;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.getClass();
                List<UiComponentConfig> list = this.components;
                if (list == null) {
                    dest.writeInt(0);
                } else {
                    Iterator m = SVG$Unit$EnumUnboxingLocalUtility.m(dest, 1, list);
                    while (m.hasNext()) {
                        dest.writeParcelable((Parcelable) m.next(), flags);
                    }
                }
                Boolean bool = this.backStepEnabled;
                if (bool == null) {
                    dest.writeInt(0);
                } else {
                    CameraState$Type$EnumUnboxingLocalUtility.m(dest, 1, bool);
                }
                Boolean bool2 = this.cancelButtonEnabled;
                if (bool2 == null) {
                    dest.writeInt(0);
                } else {
                    CameraState$Type$EnumUnboxingLocalUtility.m(dest, 1, bool2);
                }
                Boolean bool3 = this.terminal;
                if (bool3 == null) {
                    dest.writeInt(0);
                } else {
                    CameraState$Type$EnumUnboxingLocalUtility.m(dest, 1, bool3);
                }
                Localizations localizations = this.localizations;
                if (localizations == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    localizations.writeToParcel(dest, flags);
                }
                List<UiComponentError> list2 = this.serverComponentErrors;
                if (list2 == null) {
                    dest.writeInt(0);
                } else {
                    Iterator m2 = SVG$Unit$EnumUnboxingLocalUtility.m(dest, 1, list2);
                    while (m2.hasNext()) {
                        dest.writeParcelable((Parcelable) m2.next(), flags);
                    }
                }
                dest.writeString(this.webviewUrl);
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Config> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Config createFromParcel(Parcel parcel) {
                    ArrayList arrayList;
                    Boolean valueOf;
                    Boolean valueOf2;
                    Boolean valueOf3;
                    parcel.getClass();
                    int i = 0;
                    ArrayList arrayList2 = null;
                    if (parcel.readInt() == 0) {
                        arrayList = null;
                    } else {
                        int readInt = parcel.readInt();
                        ArrayList arrayList3 = new ArrayList(readInt);
                        int i2 = 0;
                        while (i2 != readInt) {
                            i2 = CameraState$Type$EnumUnboxingLocalUtility.m(Config.class, parcel, arrayList3, i2, 1);
                        }
                        arrayList = arrayList3;
                    }
                    if (parcel.readInt() == 0) {
                        valueOf = null;
                    } else {
                        valueOf = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    if (parcel.readInt() == 0) {
                        valueOf2 = null;
                    } else {
                        valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    if (parcel.readInt() == 0) {
                        valueOf3 = null;
                    } else {
                        valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    Localizations createFromParcel = parcel.readInt() == 0 ? null : Localizations.CREATOR.createFromParcel(parcel);
                    if (parcel.readInt() != 0) {
                        int readInt2 = parcel.readInt();
                        arrayList2 = new ArrayList(readInt2);
                        while (i != readInt2) {
                            i = CameraState$Type$EnumUnboxingLocalUtility.m(Config.class, parcel, arrayList2, i, 1);
                        }
                    }
                    return new Config(arrayList, valueOf, valueOf2, valueOf3, createFromParcel, arrayList2, parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Config[] newArray(int i) {
                    return new Config[i];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Config(List<? extends UiComponentConfig> list, Boolean bool, Boolean bool2, Boolean bool3, Localizations localizations, List<? extends UiComponentError> list2, String str) {
                this.components = list;
                this.backStepEnabled = bool;
                this.cancelButtonEnabled = bool2;
                this.terminal = bool3;
                this.localizations = localizations;
                this.serverComponentErrors = list2;
                this.webviewUrl = str;
            }
        }

        @JsonClass(generateAdapter = true)
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$Localizations;", "Landroid/os/Parcelable;", "promptPage", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$PromptPage;", "cancelDialog", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "webviewPendingPage", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$WebViewPendingPage;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$PromptPage;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$WebViewPendingPage;)V", "getPromptPage", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$PromptPage;", "getCancelDialog", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "getWebviewPendingPage", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$WebViewPendingPage;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Localizations implements Parcelable {
            public static final Parcelable.Creator<Localizations> CREATOR = new Creator();
            private final CancelDialog cancelDialog;
            private final PromptPage promptPage;
            private final WebViewPendingPage webviewPendingPage;

            public Localizations(PromptPage promptPage, CancelDialog cancelDialog, @Json(name = "webviewPage") WebViewPendingPage webViewPendingPage) {
                this.promptPage = promptPage;
                this.cancelDialog = cancelDialog;
                this.webviewPendingPage = webViewPendingPage;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final CancelDialog getCancelDialog() {
                return this.cancelDialog;
            }

            public final PromptPage getPromptPage() {
                return this.promptPage;
            }

            public final WebViewPendingPage getWebviewPendingPage() {
                return this.webviewPendingPage;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.getClass();
                PromptPage promptPage = this.promptPage;
                if (promptPage == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    promptPage.writeToParcel(dest, flags);
                }
                CancelDialog cancelDialog = this.cancelDialog;
                if (cancelDialog == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    cancelDialog.writeToParcel(dest, flags);
                }
                WebViewPendingPage webViewPendingPage = this.webviewPendingPage;
                if (webViewPendingPage == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    webViewPendingPage.writeToParcel(dest, flags);
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Localizations> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Localizations createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new Localizations(parcel.readInt() == 0 ? null : PromptPage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CancelDialog.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? WebViewPendingPage.CREATOR.createFromParcel(parcel) : null);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Localizations[] newArray(int i) {
                    return new Localizations[i];
                }
            }
        }

        @JsonClass(generateAdapter = true)
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BQ\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0015R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$PromptPage;", "Landroid/os/Parcelable;", "gpsPermissionsBtnCancel", "", "gpsPermissionsAllowButtonText", "gpsFeatureTurnOnText", "gpsPermissionsPrompt", "gpsPermissionsTitle", "gpsFeaturePrompt", "gpsFeatureTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getGpsPermissionsBtnCancel", "()Ljava/lang/String;", "getGpsPermissionsAllowButtonText", "getGpsFeatureTurnOnText", "getGpsPermissionsPrompt", "getGpsPermissionsTitle", "getGpsFeaturePrompt", "getGpsFeatureTitle", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class PromptPage implements Parcelable {
            public static final Parcelable.Creator<PromptPage> CREATOR = new Creator();
            private final String gpsFeaturePrompt;
            private final String gpsFeatureTitle;
            private final String gpsFeatureTurnOnText;
            private final String gpsPermissionsAllowButtonText;
            private final String gpsPermissionsBtnCancel;
            private final String gpsPermissionsPrompt;
            private final String gpsPermissionsTitle;

            public PromptPage(String str, @Json(name = "gpsPermissionsBtnContinueMobile") String str2, @Json(name = "gpsDeviceFeatureBtnContinueMobile") String str3, String str4, String str5, String str6, String str7) {
                this.gpsPermissionsBtnCancel = str;
                this.gpsPermissionsAllowButtonText = str2;
                this.gpsFeatureTurnOnText = str3;
                this.gpsPermissionsPrompt = str4;
                this.gpsPermissionsTitle = str5;
                this.gpsFeaturePrompt = str6;
                this.gpsFeatureTitle = str7;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final String getGpsFeaturePrompt() {
                return this.gpsFeaturePrompt;
            }

            public final String getGpsFeatureTitle() {
                return this.gpsFeatureTitle;
            }

            public final String getGpsFeatureTurnOnText() {
                return this.gpsFeatureTurnOnText;
            }

            public final String getGpsPermissionsAllowButtonText() {
                return this.gpsPermissionsAllowButtonText;
            }

            public final String getGpsPermissionsBtnCancel() {
                return this.gpsPermissionsBtnCancel;
            }

            public final String getGpsPermissionsPrompt() {
                return this.gpsPermissionsPrompt;
            }

            public final String getGpsPermissionsTitle() {
                return this.gpsPermissionsTitle;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.getClass();
                dest.writeString(this.gpsPermissionsBtnCancel);
                dest.writeString(this.gpsPermissionsAllowButtonText);
                dest.writeString(this.gpsFeatureTurnOnText);
                dest.writeString(this.gpsPermissionsPrompt);
                dest.writeString(this.gpsPermissionsTitle);
                dest.writeString(this.gpsFeaturePrompt);
                dest.writeString(this.gpsFeatureTitle);
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<PromptPage> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PromptPage createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new PromptPage(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PromptPage[] newArray(int i) {
                    return new PromptPage[i];
                }
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Ui> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Ui createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new Ui(parcel.readString(), Config.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepStyles.UiStepStyle.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Ui[] newArray(int i) {
                return new Ui[i];
            }
        }

        public /* synthetic */ Ui(String str, Config config, StepStyles.UiStepStyle uiStepStyle, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, config, (i & 4) != 0 ? null : uiStepStyle);
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "Landroid/os/Parcelable;", "title", "", "prompt", "btnSubmit", "btnResume", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getPrompt", "getBtnSubmit", "getBtnResume", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CancelDialog implements Parcelable {
        public static final Parcelable.Creator<CancelDialog> CREATOR = new Creator();
        private final String btnResume;
        private final String btnSubmit;
        private final String prompt;
        private final String title;

        public CancelDialog(String str, String str2, String str3, String str4) {
            this.title = str;
            this.prompt = str2;
            this.btnSubmit = str3;
            this.btnResume = str4;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String getBtnResume() {
            return this.btnResume;
        }

        public final String getBtnSubmit() {
            return this.btnSubmit;
        }

        public final String getPrompt() {
            return this.prompt;
        }

        public final String getTitle() {
            return this.title;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            dest.writeString(this.title);
            dest.writeString(this.prompt);
            dest.writeString(this.btnSubmit);
            dest.writeString(this.btnResume);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<CancelDialog> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CancelDialog createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new CancelDialog(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CancelDialog[] newArray(int i) {
                return new CancelDialog[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Companion;", "", "<init>", "()V", "createAdapter", "Lcom/squareup/moshi/JsonAdapter$Factory;", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final JsonAdapter.Factory createAdapter() {
            List list = Collections.EMPTY_LIST;
            PolymorphicJsonAdapterFactory polymorphicJsonAdapterFactory = new PolymorphicJsonAdapterFactory(NextStep.class, "type", list, list, null);
            return polymorphicJsonAdapterFactory.withFallbackJsonAdapter(new JsonAdapter.AnonymousClass4(polymorphicJsonAdapterFactory, Unknown.INSTANCE, false, 1)).withSubtype(Ui.class, "ui").withSubtype(GovernmentId.class, "government_id").withSubtype(Selfie.class, "selfie").withSubtype(Document.class, "document").withSubtype(Complete.class, "complete").withSubtype(Integration.class, "integration");
        }

        private Companion() {
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Complete;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;", "Landroid/os/Parcelable;", "name", "", "<init>", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Complete extends NextStep implements Parcelable {
        public static final Parcelable.Creator<Complete> CREATOR = new Creator();
        private final String name;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Complete(String str) {
            super(str, null);
            str.getClass();
            this.name = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.NextStep
        public String getName() {
            return this.name;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            dest.writeString(this.name);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Complete> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Complete createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new Complete(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Complete[] newArray(int i) {
                return new Complete[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$WebViewPendingPage;", "Landroid/os/Parcelable;", "title", "", "description", "launchButtonTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getLaunchButtonTitle", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class WebViewPendingPage implements Parcelable {
        public static final Parcelable.Creator<WebViewPendingPage> CREATOR = new Creator();
        private final String description;
        private final String launchButtonTitle;
        private final String title;

        public WebViewPendingPage(String str, @Json(name = "descriptionMobile") String str2, @Json(name = "btnLaunchMobile") String str3) {
            this.title = str;
            this.description = str2;
            this.launchButtonTitle = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getLaunchButtonTitle() {
            return this.launchButtonTitle;
        }

        public final String getTitle() {
            return this.title;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            dest.writeString(this.title);
            dest.writeString(this.description);
            dest.writeString(this.launchButtonTitle);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<WebViewPendingPage> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WebViewPendingPage createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new WebViewPendingPage(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WebViewPendingPage[] newArray(int i) {
                return new WebViewPendingPage[i];
            }
        }
    }

    public /* synthetic */ NextStep(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
