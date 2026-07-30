package u5;

import h7.s;
import java.util.ArrayList;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f9056a;

    /* renamed from: b, reason: collision with root package name */
    public int f9057b;

    @Override // u5.b
    public boolean a(byte[] bArr) {
        this.f9056a.add(bArr);
        this.f9057b += bArr.length;
        return true;
    }

    @Override // u5.b
    public s b() {
        ArrayList arrayList = this.f9056a;
        byte[] bArr = new byte[this.f9057b];
        int i7 = 0;
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            byte[] bArr2 = (byte[]) arrayList.get(i8);
            System.arraycopy(bArr2, 0, bArr, i7, bArr2.length);
            i7 += bArr2.length;
        }
        return new s();
    }

    public boolean c() {
        return this.f9057b < this.f9056a.size();
    }
}
