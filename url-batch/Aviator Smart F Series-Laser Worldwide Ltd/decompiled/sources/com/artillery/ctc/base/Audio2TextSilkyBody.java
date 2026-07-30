package com.artillery.ctc.base;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.io.File;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;

@Keep
/* loaded from: classes.dex */
public final class Audio2TextSilkyBody implements Parcelable {
    public static final Parcelable.Creator<Audio2TextSilkyBody> CREATOR = new a();
    public File file;
    public AsrSilkyModel model;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Audio2TextSilkyBody createFromParcel(Parcel parcel) {
            s.checkNotNullParameter(parcel, "parcel");
            return new Audio2TextSilkyBody((File) parcel.readSerializable(), parcel.readInt() == 0 ? null : AsrSilkyModel.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Audio2TextSilkyBody[] newArray(int i8) {
            return new Audio2TextSilkyBody[i8];
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Audio2TextSilkyBody(File file) {
        this(file, null, 2, 0 == true ? 1 : 0);
        s.checkNotNullParameter(file, "file");
    }

    public static /* synthetic */ Audio2TextSilkyBody copy$default(Audio2TextSilkyBody audio2TextSilkyBody, File file, AsrSilkyModel asrSilkyModel, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            file = audio2TextSilkyBody.file;
        }
        if ((i8 & 2) != 0) {
            asrSilkyModel = audio2TextSilkyBody.model;
        }
        return audio2TextSilkyBody.copy(file, asrSilkyModel);
    }

    public final File component1() {
        return this.file;
    }

    public final AsrSilkyModel component2() {
        return this.model;
    }

    public final Audio2TextSilkyBody copy(File file, AsrSilkyModel asrSilkyModel) {
        s.checkNotNullParameter(file, "file");
        return new Audio2TextSilkyBody(file, asrSilkyModel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Audio2TextSilkyBody)) {
            return false;
        }
        Audio2TextSilkyBody audio2TextSilkyBody = (Audio2TextSilkyBody) obj;
        return s.areEqual(this.file, audio2TextSilkyBody.file) && s.areEqual(this.model, audio2TextSilkyBody.model);
    }

    public int hashCode() {
        int hashCode = this.file.hashCode() * 31;
        AsrSilkyModel asrSilkyModel = this.model;
        return hashCode + (asrSilkyModel == null ? 0 : asrSilkyModel.hashCode());
    }

    public String toString() {
        return "Audio2TextSilkyBody(file=" + this.file + ", model=" + this.model + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        s.checkNotNullParameter(out, "out");
        out.writeSerializable(this.file);
        AsrSilkyModel asrSilkyModel = this.model;
        if (asrSilkyModel == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            asrSilkyModel.writeToParcel(out, i8);
        }
    }

    public Audio2TextSilkyBody(File file, AsrSilkyModel asrSilkyModel) {
        s.checkNotNullParameter(file, "file");
        this.file = file;
        this.model = asrSilkyModel;
    }

    public /* synthetic */ Audio2TextSilkyBody(File file, AsrSilkyModel asrSilkyModel, int i8, o oVar) {
        this(file, (i8 & 2) != 0 ? null : asrSilkyModel);
    }
}
