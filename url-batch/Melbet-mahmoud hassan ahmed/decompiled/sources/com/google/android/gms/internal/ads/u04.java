package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class u04 {

    /* renamed from: e, reason: collision with root package name */
    public static final u04 f12545e = new u04(-1, -1, -1);

    /* renamed from: a, reason: collision with root package name */
    public final int f12546a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12547b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12548c;

    /* renamed from: d, reason: collision with root package name */
    public final int f12549d;

    public u04(int i7, int i8, int i9) {
        this.f12546a = i7;
        this.f12547b = i8;
        this.f12548c = i9;
        this.f12549d = n13.r(i9) ? n13.S(i9, i8) : -1;
    }

    public final String toString() {
        int i7 = this.f12546a;
        int i8 = this.f12547b;
        int i9 = this.f12548c;
        StringBuilder sb = new StringBuilder(83);
        sb.append("AudioFormat[sampleRate=");
        sb.append(i7);
        sb.append(", channelCount=");
        sb.append(i8);
        sb.append(", encoding=");
        sb.append(i9);
        sb.append(']');
        return sb.toString();
    }
}
