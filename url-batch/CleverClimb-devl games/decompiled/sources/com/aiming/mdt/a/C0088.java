package com.aiming.mdt.a;

import android.text.TextUtils;

/* renamed from: com.aiming.mdt.a.ʻʾʿˈˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0088 extends C0144 {

    /* renamed from: ʻ, reason: contains not printable characters */
    private String f236;

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private int f237;

    /* renamed from: ʻʼʽ, reason: contains not printable characters */
    private boolean f238;

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private String f239;

    /* renamed from: ʻʾ, reason: contains not printable characters */
    private Object f240;

    /* renamed from: ʼ, reason: contains not printable characters */
    private int f241;

    /* renamed from: ʼʽ, reason: contains not printable characters */
    private int f242;

    /* renamed from: ʼʾ, reason: contains not printable characters */
    private long f243;

    /* renamed from: ʽ, reason: contains not printable characters */
    private int f244;

    public final boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        C0088 c0088 = (C0088) obj;
        return TextUtils.equals(this.f236, c0088.f236) && this.f244 == c0088.f244;
    }

    public final int hashCode() {
        return ((this.f237 + 31) * 31) + (TextUtils.isEmpty(this.f236) ? 0 : this.f236.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Ins{id=");
        sb.append(this.f244);
        sb.append(", index=");
        sb.append(this.f242);
        sb.append(", grpIndex=");
        sb.append(this.f241);
        sb.append(", mId=");
        sb.append(this.f237);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public final void m296(int i) {
        this.f244 = i;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public final void m297(Object obj) {
        this.f240 = obj;
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    public final void m298(String str) {
        this.f239 = str;
    }

    /* renamed from: ʻʼʽ, reason: contains not printable characters */
    public final void m299(int i) {
        this.f242 = i;
    }

    /* renamed from: ʻʼʽ, reason: contains not printable characters */
    public final boolean m300() {
        return this.f238;
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    public final void m301(String str) {
        this.f236 = str;
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    public final void m302(boolean z) {
        this.f238 = true;
    }

    /* renamed from: ʻʾ, reason: contains not printable characters */
    public final String m303() {
        return this.f239;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public final String m304() {
        return this.f236;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public final void m305(int i) {
        this.f237 = i;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public final void m306(long j) {
        this.f243 = j;
    }

    /* renamed from: ʼʽ, reason: contains not printable characters */
    public final int m307() {
        return this.f241;
    }

    /* renamed from: ʼʽʾ, reason: contains not printable characters */
    public final long m308() {
        return this.f243;
    }

    /* renamed from: ʼʾ, reason: contains not printable characters */
    public final int m309() {
        return this.f242;
    }

    /* renamed from: ʼʾ, reason: contains not printable characters */
    public final void m310(int i) {
        this.f241 = i;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public final int m311() {
        return this.f244;
    }

    /* renamed from: ʽʾ, reason: contains not printable characters */
    public final Object m312() {
        return this.f240;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public final int m313() {
        return this.f237;
    }
}
