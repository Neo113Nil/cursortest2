package com.anythink.core.express.d;

/* loaded from: classes.dex */
public enum c {
    JS("js", "application/x-javascript"),
    CSS("css", "text/css"),
    JPG("jpg", "image/jpeg"),
    JPEG("jpep", "image/jpeg"),
    PNG("png", "image/png"),
    WEBP("webp", "image/webp"),
    GIF("gif", "image/gif"),
    HTM("htm", "text/html"),
    HTML(com.onesignal.inAppMessages.internal.d.HTML, "text/html");


    /* renamed from: j, reason: collision with root package name */
    private String f17725j;

    /* renamed from: k, reason: collision with root package name */
    private String f17726k;

    c(String str, String str2) {
        this.f17725j = str;
        this.f17726k = str2;
    }

    private static /* synthetic */ c[] c() {
        return new c[]{JS, CSS, JPG, JPEG, PNG, WEBP, GIF, HTM, HTML};
    }

    public final String a() {
        return this.f17725j;
    }

    public final String b() {
        return this.f17726k;
    }

    private void a(String str) {
        this.f17725j = str;
    }

    private void b(String str) {
        this.f17726k = str;
    }
}
