package t0;

import T.U;
import W.AbstractC0108a;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final U f15374a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f15375b;

    public s(int i4, U u4, int[] iArr) {
        if (iArr.length == 0) {
            AbstractC0108a.f("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.f15374a = u4;
        this.f15375b = iArr;
    }
}
