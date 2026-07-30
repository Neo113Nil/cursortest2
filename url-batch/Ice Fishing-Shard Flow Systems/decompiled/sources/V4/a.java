package V4;

import C4.b;
import C4.f;
import C4.j;
import H4.e;
import I4.i;
import K4.h;
import java.util.ArrayList;
import java.util.Comparator;
import v5.C0975a;

/* loaded from: classes.dex */
public final class a implements A5.a {

    /* renamed from: a, reason: collision with root package name */
    public final M5.a f2748a;

    /* renamed from: b, reason: collision with root package name */
    public final C0975a f2749b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2750c;

    /* renamed from: d, reason: collision with root package name */
    public final long f2751d;

    /* renamed from: e, reason: collision with root package name */
    public final H4.a f2752e;

    /* renamed from: f, reason: collision with root package name */
    public final i f2753f;

    /* renamed from: g, reason: collision with root package name */
    public final String f2754g;

    /* renamed from: h, reason: collision with root package name */
    public final int f2755h;

    /* renamed from: i, reason: collision with root package name */
    public final b f2756i;
    public final j j;

    /* renamed from: k, reason: collision with root package name */
    public final String f2757k;

    public a(M5.a aVar, C0975a c0975a, long j, long j7, H4.a aVar2, i iVar, String str, int i2, b bVar, j jVar, String str2) {
        this.f2748a = aVar;
        this.f2749b = c0975a;
        this.f2750c = j;
        this.f2751d = j7;
        this.f2752e = aVar2;
        this.f2753f = iVar;
        this.f2754g = str;
        this.f2755h = i2;
        this.f2756i = bVar;
        this.j = jVar;
        this.f2757k = str2;
    }

    @Override // z5.InterfaceC1060a
    public final int a() {
        return this.f2755h;
    }

    @Override // z5.InterfaceC1060a
    public final String b() {
        return this.f2757k;
    }

    @Override // A5.a
    public final D4.b c() {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (true) {
            Object[] objArr = this.f2756i.f987d;
            if (i2 >= objArr.length) {
                break;
            }
            Object obj = objArr[i2];
            Object obj2 = objArr[i2 + 1];
            e eVar = (e) obj;
            if (eVar != null && !eVar.f991b.isEmpty() && obj2 != null) {
                E4.a c7 = E4.a.c(eVar);
                if (!c7.f701b.isEmpty()) {
                    arrayList.add(c7);
                    arrayList.add(obj2);
                }
            }
            i2 += 2;
        }
        if (arrayList.size() == 2 && arrayList.get(0) != null) {
            return new D4.a(arrayList.toArray());
        }
        Object[] array = arrayList.toArray();
        Comparator comparator = D4.a.f354l;
        for (int i5 = 0; i5 < array.length; i5 += 2) {
            E4.a aVar = (E4.a) array[i5];
            if (aVar != null && aVar.f701b.isEmpty()) {
                array[i5] = null;
            }
        }
        return new D4.a(array, D4.a.f354l);
    }

    @Override // z5.InterfaceC1060a
    public final h d() {
        return this.f2752e;
    }

    @Override // z5.InterfaceC1060a
    public final i e() {
        return this.f2753f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        M5.a aVar2 = aVar.f2748a;
        String str = aVar.f2757k;
        j jVar = aVar.j;
        String str2 = aVar.f2754g;
        if (!this.f2748a.equals(aVar2) || !this.f2749b.equals(aVar.f2749b) || this.f2750c != aVar.f2750c || this.f2751d != aVar.f2751d || !this.f2752e.equals(aVar.f2752e) || !this.f2753f.equals(aVar.f2753f)) {
            return false;
        }
        String str3 = this.f2754g;
        if (str3 == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str3.equals(str2)) {
            return false;
        }
        if (this.f2755h != aVar.f2755h || !this.f2756i.equals(aVar.f2756i)) {
            return false;
        }
        j jVar2 = this.j;
        if (jVar2 == null) {
            if (jVar != null) {
                return false;
            }
        } else if (!jVar2.equals(jVar)) {
            return false;
        }
        String str4 = this.f2757k;
        return str4 == null ? str == null : str4.equals(str);
    }

    @Override // z5.InterfaceC1060a
    public final String f() {
        return this.f2754g;
    }

    @Override // z5.InterfaceC1060a
    public final long g() {
        return this.f2750c;
    }

    @Override // A5.a, z5.InterfaceC1060a
    public final f getAttributes() {
        return this.f2756i;
    }

    @Override // z5.InterfaceC1060a
    public final j h() {
        return this.j;
    }

    public final int hashCode() {
        int hashCode = (((this.f2748a.hashCode() ^ 1000003) * 1000003) ^ this.f2749b.hashCode()) * 1000003;
        long j = this.f2750c;
        int i2 = (hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j7 = this.f2751d;
        int hashCode2 = (((((i2 ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003) ^ this.f2752e.hashCode()) * 1000003) ^ this.f2753f.hashCode()) * 1000003;
        String str = this.f2754g;
        int hashCode3 = (((((hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f2755h) * 1000003) ^ this.f2756i.hashCode()) * 1000003;
        j jVar = this.j;
        int hashCode4 = (hashCode3 ^ (jVar == null ? 0 : jVar.hashCode())) * 1000003;
        String str2 = this.f2757k;
        return hashCode4 ^ (str2 != null ? str2.hashCode() : 0);
    }

    @Override // z5.InterfaceC1060a
    public final M5.a i() {
        return this.f2748a;
    }

    @Override // z5.InterfaceC1060a
    public final long j() {
        return this.f2751d;
    }

    @Override // z5.InterfaceC1060a
    public final C0975a k() {
        return this.f2749b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogRecordDataImpl{resource=");
        sb.append(this.f2748a);
        sb.append(", instrumentationScopeInfo=");
        sb.append(this.f2749b);
        sb.append(", timestampEpochNanos=");
        sb.append(this.f2750c);
        sb.append(", observedTimestampEpochNanos=");
        sb.append(this.f2751d);
        sb.append(", spanContext=");
        sb.append(this.f2752e);
        sb.append(", severity=");
        sb.append(this.f2753f);
        sb.append(", severityText=");
        sb.append(this.f2754g);
        sb.append(", totalAttributeCount=");
        sb.append(this.f2755h);
        sb.append(", attributes=");
        sb.append(this.f2756i);
        sb.append(", bodyValue=");
        sb.append(this.j);
        sb.append(", eventName=");
        return r4.f.f(sb, this.f2757k, "}");
    }
}
