package p2;

import b3.t;
import java.util.ArrayList;

/* renamed from: p2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0994a implements InterfaceC0995b {

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f9083a;

    /* renamed from: b, reason: collision with root package name */
    public int f9084b;

    @Override // p2.InterfaceC0995b
    public boolean a(byte[] bArr) {
        this.f9083a.add(bArr);
        this.f9084b += bArr.length;
        return true;
    }

    @Override // p2.InterfaceC0995b
    public t b() {
        byte[] bArr = new byte[this.f9084b];
        int i2 = 0;
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f9083a;
            if (i2 >= arrayList.size()) {
                return new t(3);
            }
            byte[] bArr2 = (byte[]) arrayList.get(i2);
            System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
            i4 += bArr2.length;
            i2++;
        }
    }

    public boolean c() {
        return this.f9084b < this.f9083a.size();
    }
}
