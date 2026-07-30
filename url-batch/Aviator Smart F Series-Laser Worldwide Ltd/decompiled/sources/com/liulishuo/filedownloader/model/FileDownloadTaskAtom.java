package com.liulishuo.filedownloader.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.liulishuo.filedownloader.util.f;

/* loaded from: classes4.dex */
public class FileDownloadTaskAtom implements Parcelable {
    public static final Parcelable.Creator<FileDownloadTaskAtom> CREATOR = new a();
    private int id;
    private String path;
    private long totalBytes;
    private String url;

    static class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public FileDownloadTaskAtom createFromParcel(Parcel parcel) {
            return new FileDownloadTaskAtom(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public FileDownloadTaskAtom[] newArray(int i8) {
            return new FileDownloadTaskAtom[i8];
        }
    }

    public FileDownloadTaskAtom(String str, String str2, long j8) {
        setUrl(str);
        setPath(str2);
        setTotalBytes(j8);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getId() {
        int i8 = this.id;
        if (i8 != 0) {
            return i8;
        }
        int generateId = f.generateId(getUrl(), getPath());
        this.id = generateId;
        return generateId;
    }

    public String getPath() {
        return this.path;
    }

    public long getTotalBytes() {
        return this.totalBytes;
    }

    public String getUrl() {
        return this.url;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public void setTotalBytes(long j8) {
        this.totalBytes = j8;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeString(this.url);
        parcel.writeString(this.path);
        parcel.writeLong(this.totalBytes);
    }

    protected FileDownloadTaskAtom(Parcel parcel) {
        this.url = parcel.readString();
        this.path = parcel.readString();
        this.totalBytes = parcel.readLong();
    }
}
