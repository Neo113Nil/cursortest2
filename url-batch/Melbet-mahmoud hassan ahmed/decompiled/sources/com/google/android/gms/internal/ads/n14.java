package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class n14 extends Exception {

    /* renamed from: f, reason: collision with root package name */
    public final boolean f8880f;

    /* renamed from: g, reason: collision with root package name */
    public final c0 f8881g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public n14(int i7, c0 c0Var, boolean z6) {
        super(r0.toString());
        StringBuilder sb = new StringBuilder(36);
        sb.append("AudioTrack write failed: ");
        sb.append(i7);
        this.f8880f = z6;
        this.f8881g = c0Var;
    }
}
