package h0;

import b0.C0352v;
import b0.T;
import java.util.ArrayList;
import n.z0;

/* renamed from: h0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0462e {

    /* renamed from: a, reason: collision with root package name */
    public final String f5938a;

    /* renamed from: b, reason: collision with root package name */
    public final float f5939b;

    /* renamed from: c, reason: collision with root package name */
    public final float f5940c;

    /* renamed from: d, reason: collision with root package name */
    public final float f5941d;

    /* renamed from: e, reason: collision with root package name */
    public final float f5942e;

    /* renamed from: f, reason: collision with root package name */
    public final long f5943f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5944g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f5945h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f5946i;

    /* renamed from: j, reason: collision with root package name */
    public final C0461d f5947j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f5948k;

    public C0462e(String str, float f3, float f4, float f5, float f6, long j3, int i3, boolean z3, int i4) {
        String str2 = (i4 & 1) != 0 ? "" : str;
        long j4 = (i4 & 32) != 0 ? C0352v.f5439g : j3;
        int i5 = (i4 & 64) != 0 ? 5 : i3;
        this.f5938a = str2;
        this.f5939b = f3;
        this.f5940c = f4;
        this.f5941d = f5;
        this.f5942e = f6;
        this.f5943f = j4;
        this.f5944g = i5;
        this.f5945h = z3;
        ArrayList arrayList = new ArrayList();
        this.f5946i = arrayList;
        C0461d c0461d = new C0461d(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
        this.f5947j = c0461d;
        arrayList.add(c0461d);
    }

    public static void a(C0462e c0462e, ArrayList arrayList, T t3) {
        if (c0462e.f5948k) {
            z0.o("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            throw null;
        }
        ((C0461d) c0462e.f5946i.get(r0.size() - 1)).f5937j.add(new C0457J("", arrayList, 0, t3, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 1.0f, 0.0f));
    }

    public final C0463f b() {
        if (this.f5948k) {
            z0.o("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            throw null;
        }
        while (true) {
            ArrayList arrayList = this.f5946i;
            if (arrayList.size() <= 1) {
                C0461d c0461d = this.f5947j;
                C0463f c0463f = new C0463f(this.f5938a, this.f5939b, this.f5940c, this.f5941d, this.f5942e, new C0453F(c0461d.f5928a, c0461d.f5929b, c0461d.f5930c, c0461d.f5931d, c0461d.f5932e, c0461d.f5933f, c0461d.f5934g, c0461d.f5935h, c0461d.f5936i, c0461d.f5937j), this.f5943f, this.f5944g, this.f5945h);
                this.f5948k = true;
                return c0463f;
            }
            if (this.f5948k) {
                z0.o("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                throw null;
            }
            C0461d c0461d2 = (C0461d) arrayList.remove(arrayList.size() - 1);
            ((C0461d) arrayList.get(arrayList.size() - 1)).f5937j.add(new C0453F(c0461d2.f5928a, c0461d2.f5929b, c0461d2.f5930c, c0461d2.f5931d, c0461d2.f5932e, c0461d2.f5933f, c0461d2.f5934g, c0461d2.f5935h, c0461d2.f5936i, c0461d2.f5937j));
        }
    }
}
