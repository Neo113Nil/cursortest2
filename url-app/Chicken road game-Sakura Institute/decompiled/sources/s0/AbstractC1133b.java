package s0;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: s0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1133b {

    /* renamed from: a, reason: collision with root package name */
    public String f10173a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f10174b = new int[2];

    public abstract int[] a(int i2);

    public final int[] b(int i2, int i4) {
        if (i2 < 0 || i4 < 0 || i2 == i4) {
            return null;
        }
        int[] iArr = this.f10174b;
        iArr[0] = i2;
        iArr[1] = i4;
        return iArr;
    }

    public final String c() {
        String str = this.f10173a;
        if (str != null) {
            return str;
        }
        Intrinsics.g("text");
        throw null;
    }

    public abstract int[] d(int i2);
}
