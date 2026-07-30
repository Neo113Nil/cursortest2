package u0;

import java.util.Objects;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final p[] f8057a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8058b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f8059c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8060d;

    public n(String str, p[] pVarArr) {
        this.f8058b = str;
        this.f8059c = null;
        this.f8057a = pVarArr;
        this.f8060d = 0;
    }

    public final void a(int i2) {
        int i5 = this.f8060d;
        if (i2 == i5) {
            return;
        }
        StringBuilder sb = new StringBuilder("Wrong data accessor type detected. ");
        sb.append(i5 != 0 ? i5 != 1 ? "Unknown" : "ArrayBuffer" : "String");
        sb.append(" expected, but got ");
        sb.append(i2 != 0 ? i2 != 1 ? "Unknown" : "ArrayBuffer" : "String");
        throw new IllegalStateException(sb.toString());
    }

    public n(byte[] bArr, p[] pVarArr) {
        Objects.requireNonNull(bArr);
        this.f8059c = bArr;
        this.f8058b = null;
        this.f8057a = pVarArr;
        this.f8060d = 1;
    }
}
