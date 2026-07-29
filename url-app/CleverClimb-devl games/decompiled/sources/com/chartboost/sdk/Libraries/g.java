package com.chartboost.sdk.Libraries;

import java.io.File;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final File f3587a;

    /* renamed from: b, reason: collision with root package name */
    public final File f3588b;

    /* renamed from: c, reason: collision with root package name */
    public final File f3589c;

    /* renamed from: d, reason: collision with root package name */
    public final File f3590d;
    public final File e;
    public final File f;
    public final File g;

    g(File file) {
        this.f3587a = new File(file, ".chartboost");
        if (!this.f3587a.exists()) {
            this.f3587a.mkdirs();
        }
        this.f3588b = a(this.f3587a, "css");
        this.f3589c = a(this.f3587a, "html");
        this.f3590d = a(this.f3587a, "images");
        this.e = a(this.f3587a, "js");
        this.f = a(this.f3587a, "templates");
        this.g = a(this.f3587a, "videos");
    }

    private static File a(File file, String str) {
        File file2 = new File(file, str);
        if (!file2.exists()) {
            file2.mkdir();
        }
        return file2;
    }
}
