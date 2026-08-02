package com.withpersona.sdk2.inquiry.types.collected_data;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import net.oneformapp.schema.Element;

/* loaded from: classes9.dex */
public final class DocumentFile implements Parcelable {
    public static final Parcelable.Creator<DocumentFile> CREATOR = new Element.AnonymousClass1(6);
    public final File data;

    public DocumentFile(File file) {
        file.getClass();
        this.data = file;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DocumentFile) && Intrinsics.areEqual(this.data, ((DocumentFile) obj).data);
    }

    public final int hashCode() {
        return this.data.hashCode();
    }

    public final String toString() {
        return "DocumentFile(data=" + this.data + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeSerializable(this.data);
    }
}
