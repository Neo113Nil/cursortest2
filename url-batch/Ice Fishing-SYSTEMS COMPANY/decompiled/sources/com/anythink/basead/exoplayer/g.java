package com.anythink.basead.exoplayer;

import com.anythink.basead.exoplayer.k.C0544a;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class g extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public static final int f7423a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f7424b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f7425c = 2;

    /* renamed from: d, reason: collision with root package name */
    public final int f7426d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7427e;

    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    private g(int i, String str, Throwable th, int i4) {
        super(str, th);
        this.f7426d = i;
        this.f7427e = i4;
    }

    public static g a(Exception exc, int i) {
        return new g(1, null, exc, i);
    }

    private Exception b() {
        C0544a.b(this.f7426d == 1);
        return (Exception) getCause();
    }

    private RuntimeException c() {
        C0544a.b(this.f7426d == 2);
        return (RuntimeException) getCause();
    }

    public static g a(IOException iOException) {
        return new g(0, null, iOException, -1);
    }

    public static g a(RuntimeException runtimeException) {
        return new g(2, null, runtimeException, -1);
    }

    private IOException a() {
        C0544a.b(this.f7426d == 0);
        return (IOException) getCause();
    }
}
