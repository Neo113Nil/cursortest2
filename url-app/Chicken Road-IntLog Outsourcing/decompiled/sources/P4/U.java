package P4;

import f4.C0437n;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class U extends K {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f2346a;

    /* renamed from: b, reason: collision with root package name */
    public int f2347b;

    @Override // P4.K
    public final Object a() {
        byte[] copyOf = Arrays.copyOf(this.f2346a, this.f2347b);
        kotlin.jvm.internal.i.d(copyOf, "copyOf(...)");
        return new C0437n(copyOf);
    }

    @Override // P4.K
    public final void b(int i2) {
        byte[] bArr = this.f2346a;
        if (bArr.length < i2) {
            int length = bArr.length * 2;
            if (i2 < length) {
                i2 = length;
            }
            byte[] copyOf = Arrays.copyOf(bArr, i2);
            kotlin.jvm.internal.i.d(copyOf, "copyOf(...)");
            this.f2346a = copyOf;
        }
    }

    @Override // P4.K
    public final int d() {
        return this.f2347b;
    }
}
