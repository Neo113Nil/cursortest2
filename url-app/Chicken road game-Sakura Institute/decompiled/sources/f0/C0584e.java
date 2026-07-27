package f0;

import Z.C0323u;
import Z.S;
import java.util.ArrayList;
import n.AbstractC0864b;

/* renamed from: f0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0584e {

    /* renamed from: a, reason: collision with root package name */
    public final String f6362a;

    /* renamed from: b, reason: collision with root package name */
    public final float f6363b;

    /* renamed from: c, reason: collision with root package name */
    public final float f6364c;

    /* renamed from: d, reason: collision with root package name */
    public final float f6365d;

    /* renamed from: e, reason: collision with root package name */
    public final float f6366e;

    /* renamed from: f, reason: collision with root package name */
    public final long f6367f;

    /* renamed from: g, reason: collision with root package name */
    public final int f6368g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f6369h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f6370i;

    /* renamed from: j, reason: collision with root package name */
    public final C0583d f6371j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f6372k;

    public C0584e(String str, float f4, float f5, float f6, float f7, long j4, int i2, boolean z4, int i4) {
        String str2 = (i4 & 1) != 0 ? "" : str;
        long j5 = (i4 & 32) != 0 ? C0323u.f4547g : j4;
        int i5 = (i4 & 64) != 0 ? 5 : i2;
        this.f6362a = str2;
        this.f6363b = f4;
        this.f6364c = f5;
        this.f6365d = f6;
        this.f6366e = f7;
        this.f6367f = j5;
        this.f6368g = i5;
        this.f6369h = z4;
        ArrayList arrayList = new ArrayList();
        this.f6370i = arrayList;
        C0583d c0583d = new C0583d(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
        this.f6371j = c0583d;
        arrayList.add(c0583d);
    }

    public static void a(C0584e c0584e, ArrayList arrayList, S s4) {
        if (c0584e.f6372k) {
            AbstractC0864b.D("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            throw null;
        }
        ((C0583d) c0584e.f6370i.get(r0.size() - 1)).f6361j.add(new C0579J("", arrayList, 0, s4, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 1.0f, 0.0f));
    }

    public final C0585f b() {
        if (this.f6372k) {
            AbstractC0864b.D("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            throw null;
        }
        while (true) {
            ArrayList arrayList = this.f6370i;
            if (arrayList.size() <= 1) {
                C0583d c0583d = this.f6371j;
                C0585f c0585f = new C0585f(this.f6362a, this.f6363b, this.f6364c, this.f6365d, this.f6366e, new C0575F(c0583d.f6352a, c0583d.f6353b, c0583d.f6354c, c0583d.f6355d, c0583d.f6356e, c0583d.f6357f, c0583d.f6358g, c0583d.f6359h, c0583d.f6360i, c0583d.f6361j), this.f6367f, this.f6368g, this.f6369h);
                this.f6372k = true;
                return c0585f;
            }
            if (this.f6372k) {
                AbstractC0864b.D("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                throw null;
            }
            C0583d c0583d2 = (C0583d) arrayList.remove(arrayList.size() - 1);
            ((C0583d) arrayList.get(arrayList.size() - 1)).f6361j.add(new C0575F(c0583d2.f6352a, c0583d2.f6353b, c0583d2.f6354c, c0583d2.f6355d, c0583d2.f6356e, c0583d2.f6357f, c0583d2.f6358g, c0583d2.f6359h, c0583d2.f6360i, c0583d2.f6361j));
        }
    }
}
