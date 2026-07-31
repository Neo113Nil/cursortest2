package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class k14 extends Exception {

    /* renamed from: f, reason: collision with root package name */
    public final boolean f7332f;

    /* renamed from: g, reason: collision with root package name */
    public final c0 f7333g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k14(int i7, int i8, int i9, int i10, c0 c0Var, boolean z6, Exception exc) {
        super(r7.toString(), exc);
        StringBuilder sb = new StringBuilder(80);
        sb.append("AudioTrack init failed ");
        sb.append(i7);
        sb.append(" Config(");
        sb.append(i8);
        sb.append(", ");
        sb.append(i9);
        sb.append(", ");
        sb.append(i10);
        sb.append(")");
        sb.append("");
        this.f7332f = false;
        this.f7333g = c0Var;
    }
}
