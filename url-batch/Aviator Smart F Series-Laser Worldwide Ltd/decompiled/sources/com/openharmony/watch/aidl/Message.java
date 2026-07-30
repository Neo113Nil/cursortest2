package com.openharmony.watch.aidl;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.nio.charset.StandardCharsets;

/* loaded from: classes4.dex */
public class Message implements Parcelable {
    public static final Parcelable.Creator<Message> CREATOR = new a();
    private byte[] data;
    private String description;
    private String dstFilePath;
    private String fileName;
    private ParcelFileDescriptor pfd;
    private Integer type;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public Message createFromParcel(Parcel parcel) {
            return new Message(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Message[] newArray(int i8) {
            return new Message[i8];
        }
    }

    public Message(Integer num, byte[] bArr, String str, ParcelFileDescriptor parcelFileDescriptor, String str2, String str3) {
        this.type = num;
        this.data = bArr;
        this.description = str;
        if (num.intValue() == 1) {
            this.pfd = parcelFileDescriptor;
        }
        this.fileName = str2;
        this.dstFilePath = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public byte[] getData() {
        return this.data;
    }

    public String getDescription() {
        return this.description;
    }

    public String getDstFilePath() {
        return this.dstFilePath;
    }

    public ParcelFileDescriptor getFileDescriptor() {
        return this.pfd;
    }

    public String getFileName() {
        return this.fileName;
    }

    public Integer getType() {
        return this.type;
    }

    public Message readFromParcel(Parcel parcel) {
        this.type = Integer.valueOf(parcel.readInt());
        byte[] bArr = new byte[parcel.readInt()];
        this.data = bArr;
        parcel.readByteArray(bArr);
        this.description = parcel.readString();
        if (this.type.intValue() == 1) {
            this.pfd = parcel.readFileDescriptor();
        }
        this.fileName = parcel.readString();
        this.dstFilePath = parcel.readString();
        return this;
    }

    @NonNull
    public String toString() {
        return "type:" + this.type + ",data:" + new String(this.data, StandardCharsets.UTF_8) + ",description:" + this.description + ",FileDescriptor:" + this.pfd + ",fileName:" + this.fileName + ",dstFilePath:" + this.dstFilePath;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i8) {
        parcel.writeInt(this.type.intValue());
        parcel.writeInt(this.data.length);
        parcel.writeByteArray(this.data);
        parcel.writeString(this.description);
        if (this.type.intValue() == 1) {
            parcel.writeFileDescriptor(this.pfd.getFileDescriptor());
        }
        parcel.writeString(this.fileName);
        parcel.writeString(this.dstFilePath);
    }

    protected Message(Parcel parcel) {
        this.type = Integer.valueOf(parcel.readInt());
        byte[] bArr = new byte[parcel.readInt()];
        this.data = bArr;
        parcel.readByteArray(bArr);
        this.description = parcel.readString();
        if (this.type.intValue() == 1) {
            this.pfd = parcel.readFileDescriptor();
        }
        this.fileName = parcel.readString();
        this.dstFilePath = parcel.readString();
    }
}
