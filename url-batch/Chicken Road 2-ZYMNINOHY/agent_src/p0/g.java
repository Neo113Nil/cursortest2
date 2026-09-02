package p0;

import T.C0093k;
import T.C0094l;
import T.C0096n;
import T.C0097o;
import T.G;
import W.J;
import a.AbstractC0124a;
import java.math.RoundingMode;
import java.util.LinkedList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class g extends d {

    /* renamed from: e, reason: collision with root package name */
    public final LinkedList f14704e;

    /* renamed from: f, reason: collision with root package name */
    public int f14705f;

    /* renamed from: g, reason: collision with root package name */
    public int f14706g;

    /* renamed from: h, reason: collision with root package name */
    public long f14707h;

    /* renamed from: i, reason: collision with root package name */
    public long f14708i;

    /* renamed from: j, reason: collision with root package name */
    public long f14709j;

    /* renamed from: k, reason: collision with root package name */
    public int f14710k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f14711l;

    /* renamed from: m, reason: collision with root package name */
    public C1343a f14712m;

    public g(String str) {
        super(null, str, "SmoothStreamingMedia");
        this.f14710k = -1;
        this.f14712m = null;
        this.f14704e = new LinkedList();
    }

    @Override // p0.d
    public final void a(Object obj) {
        if (obj instanceof b) {
            this.f14704e.add((b) obj);
        } else if (obj instanceof C1343a) {
            AbstractC0124a.t(this.f14712m == null);
            this.f14712m = (C1343a) obj;
        }
    }

    @Override // p0.d
    public final Object b() {
        C1343a c1343a;
        long U4;
        LinkedList linkedList = this.f14704e;
        int size = linkedList.size();
        b[] bVarArr = new b[size];
        linkedList.toArray(bVarArr);
        C1343a c1343a2 = this.f14712m;
        if (c1343a2 != null) {
            C0094l c0094l = new C0094l(new C0093k(c1343a2.f14671a, null, "video/mp4", c1343a2.f14672b));
            for (int i4 = 0; i4 < size; i4++) {
                b bVar = bVarArr[i4];
                int i5 = bVar.f14674a;
                if (i5 == 2 || i5 == 1) {
                    C0097o[] c0097oArr = bVar.f14683j;
                    for (int i6 = 0; i6 < c0097oArr.length; i6++) {
                        C0096n a3 = c0097oArr[i6].a();
                        a3.f2833q = c0094l;
                        c0097oArr[i6] = new C0097o(a3);
                    }
                }
            }
        }
        int i7 = this.f14705f;
        int i8 = this.f14706g;
        long j4 = this.f14707h;
        long j5 = this.f14708i;
        long j6 = this.f14709j;
        int i9 = this.f14710k;
        boolean z = this.f14711l;
        C1343a c1343a3 = this.f14712m;
        long j7 = -9223372036854775807L;
        if (j5 == 0) {
            c1343a = c1343a3;
            U4 = -9223372036854775807L;
        } else {
            String str = J.f3263a;
            c1343a = c1343a3;
            U4 = J.U(j5, 1000000L, j4, RoundingMode.DOWN);
        }
        if (j6 != 0) {
            String str2 = J.f3263a;
            j7 = J.U(j6, 1000000L, j4, RoundingMode.DOWN);
        }
        return new c(i7, i8, U4, j7, i9, z, c1343a, bVarArr);
    }

    @Override // p0.d
    public final void j(XmlPullParser xmlPullParser) {
        this.f14705f = d.i(xmlPullParser, "MajorVersion");
        this.f14706g = d.i(xmlPullParser, "MinorVersion");
        this.f14707h = d.h(xmlPullParser, "TimeScale", 10000000L);
        String attributeValue = xmlPullParser.getAttributeValue(null, "Duration");
        if (attributeValue == null) {
            throw new E0.d("Duration", 1);
        }
        try {
            this.f14708i = Long.parseLong(attributeValue);
            this.f14709j = d.h(xmlPullParser, "DVRWindowLength", 0L);
            this.f14710k = d.g(xmlPullParser, "LookaheadCount");
            String attributeValue2 = xmlPullParser.getAttributeValue(null, "IsLive");
            this.f14711l = attributeValue2 != null ? Boolean.parseBoolean(attributeValue2) : false;
            l(Long.valueOf(this.f14707h), "TimeScale");
        } catch (NumberFormatException e4) {
            throw G.b(null, e4);
        }
    }
}
