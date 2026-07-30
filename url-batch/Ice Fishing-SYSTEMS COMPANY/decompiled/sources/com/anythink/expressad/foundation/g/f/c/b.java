package com.anythink.expressad.foundation.g.f.c;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class b implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f19404a;

    /* renamed from: b, reason: collision with root package name */
    private InputStream f19405b;

    /* renamed from: c, reason: collision with root package name */
    private File f19406c;

    /* renamed from: d, reason: collision with root package name */
    private long f19407d;

    /* renamed from: e, reason: collision with root package name */
    private String f19408e;

    /* renamed from: f, reason: collision with root package name */
    private String f19409f;

    /* renamed from: g, reason: collision with root package name */
    private String f19410g;

    private b(String str, byte[] bArr, long j9, String str2, String str3) {
        this.f19410g = "application/octet-stream";
        this.f19408e = str;
        this.f19409f = str2;
        this.f19404a = bArr;
        this.f19407d = j9;
        if (str3 != null) {
            this.f19410g = str3;
        }
    }

    public final long a() {
        return this.f19407d;
    }

    public final File b() {
        return this.f19406c;
    }

    public final InputStream c() {
        return this.f19405b;
    }

    public final byte[] d() {
        return this.f19404a;
    }

    public final String e() {
        return this.f19408e;
    }

    public final String f() {
        return this.f19409f;
    }

    public final String g() {
        return this.f19410g;
    }

    private void a(String str) {
        this.f19408e = str;
    }

    private void b(String str) {
        this.f19409f = str;
    }

    private void c(String str) {
        this.f19410g = str;
    }

    public b(String str, File file, String str2, String str3) {
        this.f19410g = "application/octet-stream";
        this.f19408e = str;
        this.f19409f = str2;
        try {
            this.f19405b = new FileInputStream(file);
        } catch (FileNotFoundException e6) {
            e6.printStackTrace();
        }
        this.f19407d = file.length();
        if (str3 != null) {
            this.f19410g = str3;
        }
        this.f19406c = file;
    }

    private b(InputStream inputStream, int i, String str, String str2, String str3) {
        this.f19408e = str;
        this.f19409f = str2;
        this.f19405b = inputStream;
        this.f19407d = i;
        this.f19410g = str3;
    }
}
