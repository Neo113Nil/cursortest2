package o4;

import N.p;
import V3.c;
import V3.g;
import W3.b;
import a4.C0228a;
import a4.e;
import b4.i;
import d4.InterfaceC0326h;
import f5.C0387a;
import java.util.ArrayList;
import java.util.Comparator;

/* renamed from: o4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0560a implements T4.a {

    /* renamed from: a, reason: collision with root package name */
    public final C0387a f5604a;

    /* renamed from: b, reason: collision with root package name */
    public final O4.a f5605b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5606c;

    /* renamed from: d, reason: collision with root package name */
    public final long f5607d;

    /* renamed from: e, reason: collision with root package name */
    public final C0228a f5608e;

    /* renamed from: f, reason: collision with root package name */
    public final i f5609f;

    /* renamed from: g, reason: collision with root package name */
    public final String f5610g;

    /* renamed from: h, reason: collision with root package name */
    public final int f5611h;

    /* renamed from: i, reason: collision with root package name */
    public final V3.a f5612i;

    /* renamed from: j, reason: collision with root package name */
    public final g f5613j;

    /* renamed from: k, reason: collision with root package name */
    public final String f5614k;

    public C0560a(C0387a c0387a, O4.a aVar, long j4, long j7, C0228a c0228a, i iVar, String str, int i7, V3.a aVar2, g gVar, String str2) {
        this.f5604a = c0387a;
        this.f5605b = aVar;
        this.f5606c = j4;
        this.f5607d = j7;
        this.f5608e = c0228a;
        this.f5609f = iVar;
        this.f5610g = str;
        this.f5611h = i7;
        this.f5612i = aVar2;
        this.f5613j = gVar;
        this.f5614k = str2;
    }

    @Override // S4.a
    public final int a() {
        return this.f5611h;
    }

    @Override // S4.a
    public final String b() {
        return this.f5614k;
    }

    @Override // T4.a
    public final b c() {
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        while (true) {
            Object[] objArr = this.f5612i.f3136f;
            if (i7 >= objArr.length) {
                break;
            }
            Object obj = objArr[i7];
            Object obj2 = objArr[i7 + 1];
            e eVar = (e) obj;
            if (eVar != null && !eVar.f3140b.isEmpty() && obj2 != null) {
                X3.a c7 = X3.a.c(eVar);
                if (!c7.f2864b.isEmpty()) {
                    arrayList.add(c7);
                    arrayList.add(obj2);
                }
            }
            i7 += 2;
        }
        if (arrayList.size() == 2 && arrayList.get(0) != null) {
            return new W3.a(arrayList.toArray());
        }
        Object[] array = arrayList.toArray();
        Comparator comparator = W3.a.f2799i;
        for (int i8 = 0; i8 < array.length; i8 += 2) {
            X3.a aVar = (X3.a) array[i8];
            if (aVar != null && aVar.f2864b.isEmpty()) {
                array[i8] = null;
            }
        }
        return new W3.a(array, W3.a.f2799i);
    }

    @Override // S4.a
    public final InterfaceC0326h d() {
        return this.f5608e;
    }

    @Override // S4.a
    public final i e() {
        return this.f5609f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0560a)) {
            return false;
        }
        C0560a c0560a = (C0560a) obj;
        C0387a c0387a = c0560a.f5604a;
        String str = c0560a.f5614k;
        g gVar = c0560a.f5613j;
        String str2 = c0560a.f5610g;
        if (!this.f5604a.equals(c0387a) || !this.f5605b.equals(c0560a.f5605b) || this.f5606c != c0560a.f5606c || this.f5607d != c0560a.f5607d || !this.f5608e.equals(c0560a.f5608e) || !this.f5609f.equals(c0560a.f5609f)) {
            return false;
        }
        String str3 = this.f5610g;
        if (str3 == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str3.equals(str2)) {
            return false;
        }
        if (this.f5611h != c0560a.f5611h || !this.f5612i.equals(c0560a.f5612i)) {
            return false;
        }
        g gVar2 = this.f5613j;
        if (gVar2 == null) {
            if (gVar != null) {
                return false;
            }
        } else if (!gVar2.equals(gVar)) {
            return false;
        }
        String str4 = this.f5614k;
        return str4 == null ? str == null : str4.equals(str);
    }

    @Override // S4.a
    public final String f() {
        return this.f5610g;
    }

    @Override // S4.a
    public final long g() {
        return this.f5606c;
    }

    @Override // T4.a, S4.a
    public final c getAttributes() {
        return this.f5612i;
    }

    @Override // S4.a
    public final g h() {
        return this.f5613j;
    }

    public final int hashCode() {
        int hashCode = (((this.f5604a.hashCode() ^ 1000003) * 1000003) ^ this.f5605b.hashCode()) * 1000003;
        long j4 = this.f5606c;
        int i7 = (hashCode ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003;
        long j7 = this.f5607d;
        int hashCode2 = (((((i7 ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003) ^ this.f5608e.hashCode()) * 1000003) ^ this.f5609f.hashCode()) * 1000003;
        String str = this.f5610g;
        int hashCode3 = (((((hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f5611h) * 1000003) ^ this.f5612i.hashCode()) * 1000003;
        g gVar = this.f5613j;
        int hashCode4 = (hashCode3 ^ (gVar == null ? 0 : gVar.hashCode())) * 1000003;
        String str2 = this.f5614k;
        return hashCode4 ^ (str2 != null ? str2.hashCode() : 0);
    }

    @Override // S4.a
    public final C0387a i() {
        return this.f5604a;
    }

    @Override // S4.a
    public final long j() {
        return this.f5607d;
    }

    @Override // S4.a
    public final O4.a k() {
        return this.f5605b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogRecordDataImpl{resource=");
        sb.append(this.f5604a);
        sb.append(", instrumentationScopeInfo=");
        sb.append(this.f5605b);
        sb.append(", timestampEpochNanos=");
        sb.append(this.f5606c);
        sb.append(", observedTimestampEpochNanos=");
        sb.append(this.f5607d);
        sb.append(", spanContext=");
        sb.append(this.f5608e);
        sb.append(", severity=");
        sb.append(this.f5609f);
        sb.append(", severityText=");
        sb.append(this.f5610g);
        sb.append(", totalAttributeCount=");
        sb.append(this.f5611h);
        sb.append(", attributes=");
        sb.append(this.f5612i);
        sb.append(", bodyValue=");
        sb.append(this.f5613j);
        sb.append(", eventName=");
        return p.b(sb, this.f5614k, "}");
    }
}
