package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class hb extends RuntimeException {

    /* renamed from: d, reason: collision with root package name */
    public final int f2375d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public hb(int i3, String str, a7.e eVar) {
        super(r5, eVar);
        String valueOf;
        if (str != null) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i3).length() + 2 + str.length());
            sb2.append(i3);
            sb2.append(": ");
            sb2.append(str);
            valueOf = sb2.toString();
        } else {
            valueOf = String.valueOf(i3);
        }
        this.f2375d = i3;
    }
}
