package b4;

import java.util.List;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: d, reason: collision with root package name */
    private static final int f283d = 2;

    /* renamed from: a, reason: collision with root package name */
    private List<Integer> f284a;

    /* renamed from: b, reason: collision with root package name */
    private int f285b;

    /* renamed from: c, reason: collision with root package name */
    private int f286c;

    public a(List<Integer> list) {
        this.f284a = list;
    }

    public int a() {
        return this.f286c;
    }

    public int b() {
        return this.f285b;
    }

    public byte[] c() {
        byte[] bArr = new byte[this.f284a.size() * 2];
        for (int i8 = 0; i8 < this.f284a.size(); i8++) {
            byte[] a8 = com.crrepa.g1.c.a(this.f284a.get(i8).intValue());
            int i9 = i8 * 2;
            bArr[i9] = a8[0];
            bArr[i9 + 1] = a8[1];
        }
        return bArr;
    }

    public void a(int i8) {
        this.f286c = i8;
    }

    public void b(int i8) {
        this.f285b = i8;
    }
}
