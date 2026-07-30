package b4;

import java.util.List;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: f, reason: collision with root package name */
    private static final int f288f = 115200;

    /* renamed from: g, reason: collision with root package name */
    private static final int f289g = 3;

    /* renamed from: h, reason: collision with root package name */
    private static final int f290h = 2;

    /* renamed from: a, reason: collision with root package name */
    private List<Integer> f291a;

    /* renamed from: b, reason: collision with root package name */
    private List<Integer> f292b;

    /* renamed from: c, reason: collision with root package name */
    private List<Integer> f293c;

    /* renamed from: d, reason: collision with root package name */
    private int f294d;

    /* renamed from: e, reason: collision with root package name */
    private int f295e;

    public c(List<Integer> list, List<Integer> list2, List<Integer> list3) {
        this.f291a = list;
        this.f292b = list2;
        this.f293c = list3;
    }

    private int b() {
        int a8 = a() * e() * 2;
        return a8 <= 0 ? f288f : a8;
    }

    private byte[] c() {
        byte[] bArr = new byte[this.f293c.size() * 2];
        for (int i8 = 0; i8 < this.f293c.size(); i8++) {
            byte[] b8 = com.crrepa.g1.c.b(this.f293c.get(i8).intValue());
            int i9 = i8 * 2;
            bArr[i9] = b8[0];
            bArr[i9 + 1] = b8[1];
        }
        return bArr;
    }

    private byte[] d() {
        List<Integer> list = this.f291a;
        if (list == null || list.isEmpty()) {
            return null;
        }
        byte[] bArr = new byte[(this.f291a.size() * 3) + 2];
        bArr[0] = 8;
        bArr[1] = 33;
        for (int i8 = 0; i8 < this.f291a.size(); i8++) {
            byte[] b8 = com.crrepa.g1.c.b(this.f291a.get(i8).intValue());
            int i9 = i8 * 3;
            bArr[i9 + 2] = b8[0];
            bArr[i9 + 3] = b8[1];
            bArr[i9 + 4] = (byte) this.f292b.get(i8).intValue();
        }
        return bArr;
    }

    public int a() {
        return this.f295e;
    }

    public int e() {
        return this.f294d;
    }

    public byte[] f() {
        byte[] d8 = d();
        return (d8 != null && b() >= d8.length) ? d8 : c();
    }

    public void a(int i8) {
        this.f295e = i8;
    }

    public void b(int i8) {
        this.f294d = i8;
    }
}
