package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dbl extends cri {
    public static final Parcelable.Creator CREATOR = new dbh(3);
    public static final byte[][] a;
    public static final dbl b;
    public final String c;
    public final byte[] d;
    public final byte[][] e;
    public final byte[][] f;
    public final byte[][] g;
    public final byte[][] h;
    public final int[] i;
    public final byte[][] j;
    public final int[] k;
    public final byte[][] l;

    static {
        byte[][] bArr = new byte[0][];
        a = bArr;
        b = new dbl("", null, bArr, bArr, bArr, bArr, null, null, null, null);
    }

    public dbl(String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, int[] iArr, byte[][] bArr6, int[] iArr2, byte[][] bArr7) {
        this.c = str;
        this.d = bArr;
        this.e = bArr2;
        this.f = bArr3;
        this.g = bArr4;
        this.h = bArr5;
        this.i = iArr;
        this.j = bArr6;
        this.k = iArr2;
        this.l = bArr7;
    }

    public static byte[][] a(List list, dbk dbkVar) {
        byte[][] a2;
        byte[][] a3;
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            dbl dblVar = (dbl) it.next();
            if (dblVar != null && (a3 = dbkVar.a(dblVar)) != null) {
                i += a3.length;
            }
        }
        if (i == 0) {
            return a;
        }
        byte[][] bArr = new byte[i][];
        Iterator it2 = list.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            dbl dblVar2 = (dbl) it2.next();
            if (dblVar2 != null && (a2 = dbkVar.a(dblVar2)) != null) {
                for (byte[] bArr2 : a2) {
                    if (bArr2 != null) {
                        bArr[i2] = bArr2;
                        i2++;
                    }
                }
            }
        }
        return bArr;
    }

    private static List b(int[] iArr) {
        if (iArr == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(iArr.length >> 1);
        for (int i = 0; i < iArr.length; i += 2) {
            arrayList.add(new dbq(iArr[i], iArr[i + 1]));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private final Set c() {
        ArrayList arrayList = new ArrayList();
        byte[][] bArr = this.j;
        if (bArr != null) {
            Collections.addAll(arrayList, bArr);
        }
        byte[] bArr2 = this.d;
        if (bArr2 != null) {
            arrayList.add(bArr2);
        }
        return e((byte[][]) arrayList.toArray(new byte[0][]));
    }

    private static Set d(int[] iArr) {
        int length;
        if (iArr == null || (length = iArr.length) == 0) {
            return Collections.EMPTY_SET;
        }
        HashSet j = hnu.j(length);
        for (int i : iArr) {
            j.add(Integer.valueOf(i));
        }
        return j;
    }

    private static Set e(byte[][] bArr) {
        int length;
        if (bArr == null || (length = bArr.length) == 0) {
            return Collections.EMPTY_SET;
        }
        HashSet j = hnu.j(length);
        for (byte[] bArr2 : bArr) {
            oy.at(bArr2);
            j.add(Base64.encodeToString(bArr2, 3));
        }
        return j;
    }

    private static void f(StringBuilder sb, String str, byte[][] bArr) {
        sb.append(str);
        sb.append("=");
        if (bArr == null) {
            sb.append("null");
            return;
        }
        sb.append("(");
        boolean z = true;
        int i = 0;
        while (i < bArr.length) {
            byte[] bArr2 = bArr[i];
            if (!z) {
                sb.append(", ");
            }
            sb.append("'");
            oy.at(bArr2);
            sb.append(Base64.encodeToString(bArr2, 3));
            sb.append("'");
            i++;
            z = false;
        }
        sb.append(")");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dbl) {
            dbl dblVar = (dbl) obj;
            if (dih.y(this.c, dblVar.c) && dih.y(c(), dblVar.c()) && dih.y(e(this.e), e(dblVar.e)) && dih.y(e(this.f), e(dblVar.f)) && dih.y(e(this.g), e(dblVar.g)) && dih.y(e(this.h), e(dblVar.h)) && dih.y(d(this.i), d(dblVar.i)) && dih.y(b(this.k), b(dblVar.k)) && dih.y(e(this.l), e(dblVar.l))) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExperimentTokens");
        sb.append("(");
        String str = this.c;
        sb.append(str == null ? "null" : a.Z(str, "'", "'"));
        byte[] bArr = this.d;
        sb.append(", direct==");
        if (bArr == null) {
            sb.append("null");
        } else {
            sb.append("'");
            sb.append(Base64.encodeToString(bArr, 3));
            sb.append("'");
        }
        sb.append(", ");
        f(sb, "GAIA=", this.e);
        sb.append(", ");
        f(sb, "PSEUDO=", this.f);
        sb.append(", ");
        f(sb, "ALWAYS=", this.g);
        sb.append(", ");
        f(sb, "OTHER=", this.h);
        sb.append(", weak=");
        sb.append(Arrays.toString(this.i));
        sb.append(", ");
        f(sb, "directs=", this.j);
        sb.append(", genDims=");
        sb.append(Arrays.toString(b(this.k).toArray()));
        sb.append(", ");
        f(sb, "external=", this.l);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int q = oy.q(parcel, 20293);
        oy.I(parcel, 2, this.c);
        oy.A(parcel, 3, this.d);
        oy.B(parcel, 4, this.e);
        oy.B(parcel, 5, this.f);
        oy.B(parcel, 6, this.g);
        oy.B(parcel, 7, this.h);
        oy.D(parcel, 8, this.i);
        oy.B(parcel, 9, this.j);
        oy.D(parcel, 10, this.k);
        oy.B(parcel, 11, this.l);
        oy.r(parcel, q);
    }
}
