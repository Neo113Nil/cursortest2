package defpackage;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ceo {
    public final String a;
    public final Integer b;
    public final cem c;
    public final long d;
    public final long e;
    public final Map f;
    public final Integer g;
    public final String h;
    public final byte[] i;
    public final byte[] j;
    public final List k;
    public final String l;

    public ceo(String str, Integer num, cem cemVar, long j, long j2, Map map, Integer num2, String str2, byte[] bArr, byte[] bArr2, List list, String str3) {
        this.a = str;
        this.b = num;
        this.c = cemVar;
        this.d = j;
        this.e = j2;
        this.f = map;
        this.g = num2;
        this.h = str2;
        this.i = bArr;
        this.j = bArr2;
        this.k = list;
        this.l = str3;
    }

    public static cen b() {
        cen cenVar = new cen();
        cenVar.b = new HashMap();
        return cenVar;
    }

    public final int a(String str) {
        String str2 = (String) this.f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final cen c() {
        cen cenVar = new cen();
        cenVar.g(this.a);
        cenVar.a = this.b;
        cenVar.c = this.g;
        cenVar.d = this.h;
        cenVar.e = this.i;
        cenVar.f = this.j;
        cenVar.g = this.k;
        cenVar.h = this.l;
        cenVar.e(this.c);
        cenVar.f(this.d);
        cenVar.h(this.e);
        cenVar.b = new HashMap(this.f);
        return cenVar;
    }

    public final String d(String str) {
        String str2 = (String) this.f.get(str);
        return str2 == null ? "" : str2;
    }

    public final boolean equals(Object obj) {
        Integer num;
        Integer num2;
        String str;
        List list;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ceo) {
            ceo ceoVar = (ceo) obj;
            if (this.a.equals(ceoVar.a) && ((num = this.b) != null ? num.equals(ceoVar.b) : ceoVar.b == null) && this.c.equals(ceoVar.c) && this.d == ceoVar.d && this.e == ceoVar.e && this.f.equals(ceoVar.f) && ((num2 = this.g) != null ? num2.equals(ceoVar.g) : ceoVar.g == null) && ((str = this.h) != null ? str.equals(ceoVar.h) : ceoVar.h == null)) {
                boolean z = ceoVar instanceof ceo;
                if (Arrays.equals(this.i, z ? ceoVar.i : ceoVar.i)) {
                    if (Arrays.equals(this.j, z ? ceoVar.j : ceoVar.j) && ((list = this.k) != null ? list.equals(ceoVar.k) : ceoVar.k == null) && ((str2 = this.l) != null ? str2.equals(ceoVar.l) : ceoVar.l == null)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        Integer num = this.b;
        int hashCode2 = ((((hashCode * 1000003) ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003;
        long j = this.d;
        int i = (hashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.e;
        int hashCode3 = (((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f.hashCode()) * 1000003;
        Integer num2 = this.g;
        int hashCode4 = (hashCode3 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        String str = this.h;
        int hashCode5 = (((((hashCode4 ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ Arrays.hashCode(this.i)) * 1000003) ^ Arrays.hashCode(this.j)) * 1000003;
        List list = this.k;
        int hashCode6 = (hashCode5 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        String str2 = this.l;
        return hashCode6 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        List list = this.k;
        byte[] bArr = this.j;
        byte[] bArr2 = this.i;
        Map map = this.f;
        return "EventInternal{transportName=" + this.a + ", code=" + this.b + ", encodedPayload=" + String.valueOf(this.c) + ", eventMillis=" + this.d + ", uptimeMillis=" + this.e + ", autoMetadata=" + String.valueOf(map) + ", productId=" + this.g + ", pseudonymousId=" + this.h + ", experimentIdsClear=" + Arrays.toString(bArr2) + ", experimentIdsEncrypted=" + Arrays.toString(bArr) + ", experimentIdsEncryptedList=" + String.valueOf(list) + ", pseudonymousIdUpdateReceiverClassName=" + this.l + "}";
    }

    public ceo() {
        throw null;
    }
}
