package com.baidu.mapapi.http.wrapper;

import java.io.File;

/* loaded from: classes2.dex */
public class FileWrapper {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f5486a;

    /* renamed from: b, reason: collision with root package name */
    private String f5487b;

    /* renamed from: c, reason: collision with root package name */
    private String f5488c;

    /* renamed from: d, reason: collision with root package name */
    private File f5489d;

    public FileWrapper(File file) {
        this.f5489d = file;
    }

    public byte[] getFile() {
        return this.f5486a;
    }

    public String getMimeType() {
        return this.f5488c;
    }

    public String getName() {
        return this.f5487b;
    }

    public File getRawFile() {
        return this.f5489d;
    }

    public void setFile(byte[] bArr) {
        this.f5486a = bArr;
    }

    public void setMimeType(String str) {
        this.f5488c = str;
    }

    public void setName(String str) {
        this.f5487b = str;
    }

    public void setRawFile(File file) {
        this.f5489d = file;
    }

    public FileWrapper(byte[] bArr, String str, String str2) {
        this.f5486a = bArr;
        this.f5487b = str;
        this.f5488c = str2;
    }
}
