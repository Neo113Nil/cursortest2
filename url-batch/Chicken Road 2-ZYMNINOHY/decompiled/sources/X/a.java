package X;

import C3.v;
import E.AbstractC0005f;
import T.D;
import W.J;
import W.u;
import a.AbstractC0124a;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a implements D {

    /* renamed from: a, reason: collision with root package name */
    public final String f3486a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f3487b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3488c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3489d;

    public a(String str, byte[] bArr, int i4, int i5) {
        boolean z;
        byte b4;
        str.getClass();
        switch (str) {
            case "com.android.capture.fps":
                if (i5 == 23 && bArr.length == 4) {
                    z = true;
                }
                AbstractC0124a.h(z);
                break;
            case "auxiliary.tracks.interleaved":
                if (i5 == 75 && bArr.length == 1 && ((b4 = bArr[0]) == 0 || b4 == 1)) {
                    z = true;
                }
                AbstractC0124a.h(z);
                break;
            case "auxiliary.tracks.length":
            case "auxiliary.tracks.offset":
                if (i5 == 78 && bArr.length == 8) {
                    z = true;
                }
                AbstractC0124a.h(z);
                break;
            case "auxiliary.tracks.map":
                AbstractC0124a.h(i5 == 0);
                break;
        }
        this.f3486a = str;
        this.f3487b = bArr;
        this.f3488c = i4;
        this.f3489d = i5;
    }

    public final ArrayList d() {
        AbstractC0124a.s("Metadata is not an auxiliary tracks map", this.f3486a.equals("auxiliary.tracks.map"));
        byte[] bArr = this.f3487b;
        byte b4 = bArr[1];
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < b4; i4++) {
            arrayList.add(Integer.valueOf(bArr[i4 + 2]));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f3486a.equals(aVar.f3486a) && Arrays.equals(this.f3487b, aVar.f3487b) && this.f3488c == aVar.f3488c && this.f3489d == aVar.f3489d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f3487b) + AbstractC0005f.f(527, 31, this.f3486a)) * 31) + this.f3488c) * 31) + this.f3489d;
    }

    public final String toString() {
        String sb;
        String str = this.f3486a;
        byte[] bArr = this.f3487b;
        int i4 = this.f3489d;
        if (i4 == 0) {
            if (str.equals("auxiliary.tracks.map")) {
                ArrayList d4 = d();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("track types = ");
                new v(String.valueOf(',')).a(sb2, d4.iterator());
                sb = sb2.toString();
            }
            sb = J.Y(bArr);
        } else if (i4 == 1) {
            sb = J.p(bArr);
        } else if (i4 == 23) {
            AbstractC0124a.e(bArr.length, 4, "array too small: %s < %s", bArr.length >= 4);
            sb = String.valueOf(Float.intBitsToFloat(O3.d.n(bArr[0], bArr[1], bArr[2], bArr[3])));
        } else if (i4 == 67) {
            AbstractC0124a.e(bArr.length, 4, "array too small: %s < %s", bArr.length >= 4);
            sb = String.valueOf(O3.d.n(bArr[0], bArr[1], bArr[2], bArr[3]));
        } else if (i4 != 75) {
            if (i4 == 78) {
                sb = String.valueOf(new u(bArr).F());
            }
            sb = J.Y(bArr);
        } else {
            sb = String.valueOf(bArr[0] & 255);
        }
        return "mdta: key=" + str + ", value=" + sb;
    }
}
