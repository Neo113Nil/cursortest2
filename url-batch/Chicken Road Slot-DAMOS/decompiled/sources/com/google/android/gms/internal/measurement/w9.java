package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.Arrays;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class w9 extends d7.a implements Comparable {
    public static final Parcelable.Creator<w9> CREATOR = new o6(6);

    /* renamed from: d, reason: collision with root package name */
    public final String f2936d;

    /* renamed from: e, reason: collision with root package name */
    public final long f2937e;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f2938i;

    /* renamed from: r, reason: collision with root package name */
    public final double f2939r;

    /* renamed from: s, reason: collision with root package name */
    public final String f2940s;

    /* renamed from: t, reason: collision with root package name */
    public final byte[] f2941t;

    /* renamed from: u, reason: collision with root package name */
    public final int f2942u;

    /* renamed from: v, reason: collision with root package name */
    public final int f2943v;

    /* renamed from: w, reason: collision with root package name */
    public final int f2944w;

    public w9(String str, long j, boolean z10, double d10, String str2, byte[] bArr, int i3, int i10, int i11) {
        this.f2936d = str;
        this.f2937e = j;
        this.f2938i = z10;
        this.f2939r = d10;
        this.f2940s = str2;
        this.f2941t = bArr;
        this.f2942u = i3;
        this.f2943v = i10;
        this.f2944w = i11;
    }

    public final void b(StringBuilder sb2) {
        sb2.append("Flag(");
        String str = this.f2936d;
        sb2.append(str);
        sb2.append(", ");
        int i3 = this.f2942u;
        if (i3 == 1) {
            sb2.append(this.f2937e);
        } else if (i3 == 2) {
            sb2.append(this.f2938i);
        } else if (i3 == 3) {
            sb2.append(this.f2939r);
        } else if (i3 == 4) {
            sb2.append("'");
            String str2 = this.f2940s;
            c7.c0.g(str2);
            sb2.append(str2);
            sb2.append("'");
        } else {
            if (i3 != 5) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 16 + String.valueOf(i3).length());
                sb3.append("Invalid type: ");
                sb3.append(str);
                sb3.append(", ");
                sb3.append(i3);
                throw new AssertionError(sb3.toString());
            }
            sb2.append("'");
            byte[] bArr = this.f2941t;
            c7.c0.g(bArr);
            sb2.append(Base64.encodeToString(bArr, 3));
            sb2.append("'");
        }
        sb2.append(", ");
        sb2.append(i3);
        sb2.append(", ");
        sb2.append(this.f2943v);
        sb2.append(", ");
        sb2.append(this.f2944w);
        sb2.append(")");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a5 A[RETURN] */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compareTo(Object obj) {
        w9 w9Var = (w9) obj;
        int compareTo = this.f2936d.compareTo(w9Var.f2936d);
        if (compareTo != 0) {
            return compareTo;
        }
        int i3 = w9Var.f2942u;
        int i10 = this.f2942u;
        int i11 = i10 < i3 ? -1 : i10 != i3 ? 1 : 0;
        if (i11 != 0) {
            return i11;
        }
        if (i10 == 1) {
            long j = this.f2937e;
            long j3 = w9Var.f2937e;
            if (j >= j3) {
                if (j == j3) {
                    return 0;
                }
            }
        }
        if (i10 == 2) {
            boolean z10 = w9Var.f2938i;
            boolean z11 = this.f2938i;
            if (z11 != z10) {
                return z11 ? 1 : -1;
            }
            return 0;
        }
        if (i10 == 3) {
            return Double.compare(this.f2939r, w9Var.f2939r);
        }
        if (i10 == 4) {
            String str = w9Var.f2940s;
            String str2 = this.f2940s;
            if (str2 != str) {
                if (str2 != null) {
                    if (str != null) {
                        return str2.compareTo(str);
                    }
                }
            }
            return 0;
        }
        if (i10 != 5) {
            throw new AssertionError(v4.a.n(new StringBuilder(String.valueOf(i10).length() + 20), "Invalid enum value: ", i10));
        }
        byte[] bArr = w9Var.f2941t;
        byte[] bArr2 = this.f2941t;
        if (bArr2 != bArr) {
            if (bArr2 != null) {
                if (bArr != null) {
                    int i12 = 0;
                    while (true) {
                        int length = bArr.length;
                        int length2 = bArr2.length;
                        if (i12 >= Math.min(length2, length)) {
                            if (length2 < length) {
                                return -1;
                            }
                            return length2 != length ? 1 : 0;
                        }
                        int i13 = bArr2[i12] - bArr[i12];
                        if (i13 != 0) {
                            return i13;
                        }
                        i12++;
                    }
                }
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w9) {
            w9 w9Var = (w9) obj;
            if (hg.c(this.f2936d, w9Var.f2936d)) {
                int i3 = w9Var.f2942u;
                int i10 = this.f2942u;
                if (i10 == i3 && this.f2943v == w9Var.f2943v && this.f2944w == w9Var.f2944w) {
                    if (i10 == 1) {
                        return this.f2937e == w9Var.f2937e;
                    }
                    if (i10 == 2) {
                        return this.f2938i == w9Var.f2938i;
                    }
                    if (i10 == 3) {
                        return this.f2939r == w9Var.f2939r;
                    }
                    if (i10 == 4) {
                        return hg.c(this.f2940s, w9Var.f2940s);
                    }
                    if (i10 == 5) {
                        return Arrays.equals(this.f2941t, w9Var.f2941t);
                    }
                    throw new AssertionError(v4.a.n(new StringBuilder(String.valueOf(i10).length() + 20), "Invalid enum value: ", i10));
                }
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        b(sb2);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        String str = this.f2936d;
        boolean z10 = str == null;
        int Z = cf.c.Z(parcel, 20293);
        if (!z10) {
            cf.c.V(parcel, 2, str);
        }
        long j = this.f2937e;
        if (j != 0) {
            cf.c.Y(parcel, 3, 8);
            parcel.writeLong(j);
        }
        if (this.f2938i) {
            cf.c.Y(parcel, 4, 4);
            parcel.writeInt(1);
        }
        double d10 = this.f2939r;
        if (d10 != 0.0d) {
            cf.c.Y(parcel, 5, 8);
            parcel.writeDouble(d10);
        }
        String str2 = this.f2940s;
        if (str2 != null) {
            cf.c.V(parcel, 6, str2);
        }
        byte[] bArr = this.f2941t;
        if (bArr != null) {
            cf.c.Q(parcel, 7, bArr);
        }
        int i10 = this.f2942u;
        if (i10 != 0) {
            cf.c.Y(parcel, 8, 4);
            parcel.writeInt(i10);
        }
        int i11 = this.f2943v;
        if (i11 != 0) {
            cf.c.Y(parcel, 9, 4);
            parcel.writeInt(i11);
        }
        int i12 = this.f2944w;
        if (i12 != 0) {
            cf.c.Y(parcel, 10, 4);
            parcel.writeInt(i12);
        }
        cf.c.a0(parcel, Z);
    }
}
