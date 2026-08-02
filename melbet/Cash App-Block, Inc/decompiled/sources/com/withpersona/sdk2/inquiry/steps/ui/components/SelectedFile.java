package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.PhoneNumberSna;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class SelectedFile implements Parcelable {
    public static final Parcelable.Creator<SelectedFile> CREATOR = new Creator(0);
    public final String fileName;
    public final Uri uri;

    public final class Creator implements Parcelable.Creator {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ Creator(int i) {
            this.$r8$classId = i;
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            switch (this.$r8$classId) {
                case 0:
                    parcel.getClass();
                    return new SelectedFile((Uri) parcel.readParcelable(SelectedFile.class.getClassLoader()), parcel.readString());
                case 1:
                    parcel.getClass();
                    Integer num = null;
                    String readString = parcel.readString();
                    PhoneNumberSna phoneNumberSna = (PhoneNumberSna) parcel.readParcelable(PhoneNumberSnaComponent.class.getClassLoader());
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    String readString4 = parcel.readString();
                    String readString5 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        num = Integer.valueOf(parcel.readInt());
                    }
                    return new PhoneNumberSnaComponent(readString, phoneNumberSna, readString2, readString3, readString4, readString5, num);
                case 2:
                    parcel.getClass();
                    return new PrivacyPolicyComponent(parcel.readString());
                case 3:
                    parcel.getClass();
                    return new QRCodeComponent(parcel.readString(), (JsonLogicBoolean) parcel.readParcelable(QRCodeComponent.class.getClassLoader()), parcel.readInt());
                case 4:
                    parcel.getClass();
                    return new RemoteImageComponent(parcel.readString(), (JsonLogicBoolean) parcel.readParcelable(RemoteImageComponent.class.getClassLoader()));
                case 5:
                    parcel.getClass();
                    return new SpacerComponent(parcel.readString(), (JsonLogicBoolean) parcel.readParcelable(SpacerComponent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
                case 6:
                    parcel.getClass();
                    return new SubmitButtonComponent(parcel.readString(), (JsonLogicBoolean) parcel.readParcelable(SubmitButtonComponent.class.getClassLoader()), (JsonLogicBoolean) parcel.readParcelable(SubmitButtonComponent.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
                case 7:
                    parcel.getClass();
                    return new TextComponent(parcel.readString(), (JsonLogicBoolean) parcel.readParcelable(TextComponent.class.getClassLoader()), (JsonLogicBoolean) parcel.readParcelable(TextComponent.class.getClassLoader()));
                case 8:
                    parcel.getClass();
                    return new TitleComponent(parcel.readString(), (JsonLogicBoolean) parcel.readParcelable(TitleComponent.class.getClassLoader()), (JsonLogicBoolean) parcel.readParcelable(TitleComponent.class.getClassLoader()));
                default:
                    parcel.getClass();
                    return new VerifyPersonaButtonComponent(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, (JsonLogicBoolean) parcel.readParcelable(VerifyPersonaButtonComponent.class.getClassLoader()), (JsonLogicBoolean) parcel.readParcelable(VerifyPersonaButtonComponent.class.getClassLoader()));
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            switch (this.$r8$classId) {
                case 0:
                    return new SelectedFile[i];
                case 1:
                    return new PhoneNumberSnaComponent[i];
                case 2:
                    return new PrivacyPolicyComponent[i];
                case 3:
                    return new QRCodeComponent[i];
                case 4:
                    return new RemoteImageComponent[i];
                case 5:
                    return new SpacerComponent[i];
                case 6:
                    return new SubmitButtonComponent[i];
                case 7:
                    return new TextComponent[i];
                case 8:
                    return new TitleComponent[i];
                default:
                    return new VerifyPersonaButtonComponent[i];
            }
        }
    }

    public SelectedFile(Uri uri, String str) {
        uri.getClass();
        str.getClass();
        this.uri = uri;
        this.fileName = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectedFile)) {
            return false;
        }
        SelectedFile selectedFile = (SelectedFile) obj;
        return Intrinsics.areEqual(this.uri, selectedFile.uri) && Intrinsics.areEqual(this.fileName, selectedFile.fileName);
    }

    public final int hashCode() {
        return this.fileName.hashCode() + (this.uri.hashCode() * 31);
    }

    public final String toString() {
        return "SelectedFile(uri=" + this.uri + ", fileName=" + this.fileName + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.uri, i);
        parcel.writeString(this.fileName);
    }
}
