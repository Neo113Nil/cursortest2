package com.baidu.platform.base;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private int f8702a;

    /* renamed from: b, reason: collision with root package name */
    private int f8703b;

    /* renamed from: c, reason: collision with root package name */
    private int f8704c;

    public c(int i8, int i9, int i10) {
        this.f8702a = i8;
        this.f8703b = i9;
        this.f8704c = i10;
    }

    public int a() {
        return this.f8704c;
    }

    public int b() {
        return this.f8703b;
    }

    public String toString() {
        return "DownloadThreadInfo{id=" + this.f8702a + ", start=" + this.f8703b + ", end=" + this.f8704c + '}';
    }

    public void a(int i8) {
        this.f8704c = i8;
    }
}
