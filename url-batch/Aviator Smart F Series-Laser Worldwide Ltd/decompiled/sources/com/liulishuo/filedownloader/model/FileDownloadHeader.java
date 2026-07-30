package com.liulishuo.filedownloader.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes4.dex */
public class FileDownloadHeader implements Parcelable {
    public static final Parcelable.Creator<FileDownloadHeader> CREATOR = new a();
    private HashMap<String, List<String>> mHeaderMap;

    static class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public FileDownloadHeader createFromParcel(Parcel parcel) {
            return new FileDownloadHeader(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public FileDownloadHeader[] newArray(int i8) {
            return new FileDownloadHeader[i8];
        }
    }

    public FileDownloadHeader() {
    }

    public void add(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (str.isEmpty()) {
            throw new IllegalArgumentException("name is empty");
        }
        if (str2 == null) {
            throw new NullPointerException("value == null");
        }
        if (this.mHeaderMap == null) {
            this.mHeaderMap = new HashMap<>();
        }
        List<String> list = this.mHeaderMap.get(str);
        if (list == null) {
            list = new ArrayList<>();
            this.mHeaderMap.put(str, list);
        }
        if (list.contains(str2)) {
            return;
        }
        list.add(str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public HashMap<String, List<String>> getHeaders() {
        return this.mHeaderMap;
    }

    public void removeAll(String str) {
        HashMap<String, List<String>> hashMap = this.mHeaderMap;
        if (hashMap == null) {
            return;
        }
        hashMap.remove(str);
    }

    public String toString() {
        return this.mHeaderMap.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeMap(this.mHeaderMap);
    }

    protected FileDownloadHeader(Parcel parcel) {
        this.mHeaderMap = parcel.readHashMap(String.class.getClassLoader());
    }

    public void add(String str) {
        String[] split = str.split(":");
        add(split[0].trim(), split[1].trim());
    }
}
