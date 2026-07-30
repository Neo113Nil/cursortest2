package com.baidu.ar.arrender;

/* loaded from: classes.dex */
public class Texture {
    public static final long NOT_CREATE_INSIDE = -1;
    public static final int NO_TEXTURE = -1;

    /* renamed from: a, reason: collision with root package name */
    public long f1735a;

    /* renamed from: b, reason: collision with root package name */
    public int f1736b;

    /* renamed from: c, reason: collision with root package name */
    public int f1737c;

    public Texture() {
        this.f1735a = -1L;
        this.f1736b = -1;
        this.f1737c = 3553;
    }

    public long getHandle() {
        return this.f1735a;
    }

    public int getId() {
        return this.f1736b;
    }

    public int getType() {
        return this.f1737c;
    }

    public void setHandle(long j8) {
        this.f1735a = j8;
    }

    public void setId(int i8) {
        this.f1736b = i8;
    }

    public void setType(int i8) {
        this.f1737c = i8;
    }

    public Texture(int i8, int i9) {
        this.f1735a = -1L;
        this.f1736b = i8;
        this.f1737c = i9;
    }
}
