package com.anythink.basead.exoplayer.k;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private String[] f8571a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f8572b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f8573c;

    private l(String... strArr) {
        this.f8571a = strArr;
    }

    private void a(String... strArr) {
        C0544a.b(!this.f8572b, "Cannot set libraries after loading");
        this.f8571a = strArr;
    }

    private boolean a() {
        if (this.f8572b) {
            return this.f8573c;
        }
        this.f8572b = true;
        try {
            for (String str : this.f8571a) {
                System.loadLibrary(str);
            }
            this.f8573c = true;
        } catch (UnsatisfiedLinkError unused) {
        }
        return this.f8573c;
    }
}
