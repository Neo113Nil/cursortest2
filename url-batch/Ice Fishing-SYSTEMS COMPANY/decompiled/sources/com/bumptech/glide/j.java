package com.bumptech.glide;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: n, reason: collision with root package name */
    public static final j f23557n;

    /* renamed from: u, reason: collision with root package name */
    public static final j f23558u;

    /* renamed from: v, reason: collision with root package name */
    public static final j f23559v;

    /* renamed from: w, reason: collision with root package name */
    public static final j f23560w;

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ j[] f23561x;

    static {
        j jVar = new j("IMMEDIATE", 0);
        f23557n = jVar;
        j jVar2 = new j("HIGH", 1);
        f23558u = jVar2;
        j jVar3 = new j("NORMAL", 2);
        f23559v = jVar3;
        j jVar4 = new j("LOW", 3);
        f23560w = jVar4;
        f23561x = new j[]{jVar, jVar2, jVar3, jVar4};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f23561x.clone();
    }
}
