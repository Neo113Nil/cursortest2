package h0;

import b0.C0265P;
import b0.C0288u;
import e2.AbstractC0381e;
import java.util.ArrayList;

/* renamed from: h0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0424e {

    /* renamed from: a, reason: collision with root package name */
    public final String f4948a;

    /* renamed from: b, reason: collision with root package name */
    public final float f4949b;

    /* renamed from: c, reason: collision with root package name */
    public final float f4950c;

    /* renamed from: d, reason: collision with root package name */
    public final float f4951d;

    /* renamed from: e, reason: collision with root package name */
    public final float f4952e;

    /* renamed from: f, reason: collision with root package name */
    public final long f4953f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4954g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f4955h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f4956i;

    /* renamed from: j, reason: collision with root package name */
    public final C0423d f4957j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4958k;

    public C0424e(String str, float f3, float f4, float f5, float f6, long j3, int i3, boolean z3, int i4) {
        String str2 = (i4 & 1) != 0 ? "" : str;
        long j4 = (i4 & 32) != 0 ? C0288u.f4296f : j3;
        int i5 = (i4 & 64) != 0 ? 5 : i3;
        this.f4948a = str2;
        this.f4949b = f3;
        this.f4950c = f4;
        this.f4951d = f5;
        this.f4952e = f6;
        this.f4953f = j4;
        this.f4954g = i5;
        this.f4955h = z3;
        ArrayList arrayList = new ArrayList();
        this.f4956i = arrayList;
        C0423d c0423d = new C0423d(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
        this.f4957j = c0423d;
        arrayList.add(c0423d);
    }

    public static void a(C0424e c0424e, ArrayList arrayList, C0265P c0265p) {
        if (c0424e.f4958k) {
            AbstractC0381e.N("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            throw null;
        }
        ((C0423d) c0424e.f4956i.get(r0.size() - 1)).f4947j.add(new J("", arrayList, 0, c0265p, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 1.0f, 0.0f));
    }

    public final C0425f b() {
        if (this.f4958k) {
            AbstractC0381e.N("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            throw null;
        }
        while (true) {
            ArrayList arrayList = this.f4956i;
            if (arrayList.size() <= 1) {
                C0423d c0423d = this.f4957j;
                C0425f c0425f = new C0425f(this.f4948a, this.f4949b, this.f4950c, this.f4951d, this.f4952e, new F(c0423d.f4938a, c0423d.f4939b, c0423d.f4940c, c0423d.f4941d, c0423d.f4942e, c0423d.f4943f, c0423d.f4944g, c0423d.f4945h, c0423d.f4946i, c0423d.f4947j), this.f4953f, this.f4954g, this.f4955h);
                this.f4958k = true;
                return c0425f;
            }
            if (this.f4958k) {
                AbstractC0381e.N("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                throw null;
            }
            C0423d c0423d2 = (C0423d) arrayList.remove(arrayList.size() - 1);
            ((C0423d) arrayList.get(arrayList.size() - 1)).f4947j.add(new F(c0423d2.f4938a, c0423d2.f4939b, c0423d2.f4940c, c0423d2.f4941d, c0423d2.f4942e, c0423d2.f4943f, c0423d2.f4944g, c0423d2.f4945h, c0423d2.f4946i, c0423d2.f4947j));
        }
    }
}
