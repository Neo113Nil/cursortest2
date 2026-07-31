package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class e extends wf4 {
    public static final Parcelable.Creator<e> CREATOR = new d();

    /* renamed from: g, reason: collision with root package name */
    public final String f4407g;

    /* renamed from: h, reason: collision with root package name */
    public final String f4408h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    e(Parcel parcel) {
        super(r0);
        String readString = parcel.readString();
        int i7 = n13.f8865a;
        this.f4407g = parcel.readString();
        this.f4408h = parcel.readString();
    }

    public e(String str, String str2, String str3) {
        super(str);
        this.f4407g = str2;
        this.f4408h = str3;
    }

    private static List<Integer> a(String str) {
        int parseInt;
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                parseInt = Integer.parseInt(str.substring(8, 10));
            } else {
                if (str.length() < 7) {
                    if (str.length() >= 4) {
                        parseInt = Integer.parseInt(str.substring(0, 4));
                    }
                    return arrayList;
                }
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                parseInt = Integer.parseInt(str.substring(5, 7));
            }
            arrayList.add(Integer.valueOf(parseInt));
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.wf4, com.google.android.gms.internal.ads.b81
    public final void b(ds dsVar) {
        char c7;
        String str = this.f13818f;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c7 = 6;
                    break;
                }
                c7 = 65535;
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c7 = 16;
                    break;
                }
                c7 = 65535;
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c7 = '\f';
                    break;
                }
                c7 = 65535;
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c7 = 2;
                    break;
                }
                c7 = 65535;
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c7 = 4;
                    break;
                }
                c7 = 65535;
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c7 = 18;
                    break;
                }
                c7 = 65535;
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c7 = '\b';
                    break;
                }
                c7 = 65535;
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c7 = 0;
                    break;
                }
                c7 = 65535;
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c7 = 20;
                    break;
                }
                c7 = 65535;
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c7 = '\n';
                    break;
                }
                c7 = 65535;
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c7 = 7;
                    break;
                }
                c7 = 65535;
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c7 = 17;
                    break;
                }
                c7 = 65535;
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c7 = '\r';
                    break;
                }
                c7 = 65535;
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c7 = 14;
                    break;
                }
                c7 = 65535;
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c7 = 15;
                    break;
                }
                c7 = 65535;
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c7 = 21;
                    break;
                }
                c7 = 65535;
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c7 = 1;
                    break;
                }
                c7 = 65535;
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c7 = 3;
                    break;
                }
                c7 = 65535;
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c7 = 5;
                    break;
                }
                c7 = 65535;
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c7 = 19;
                    break;
                }
                c7 = 65535;
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c7 = '\t';
                    break;
                }
                c7 = 65535;
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c7 = 11;
                    break;
                }
                c7 = 65535;
                break;
            default:
                c7 = 65535;
                break;
        }
        switch (c7) {
            case 0:
            case 1:
                dsVar.x(this.f4408h);
                break;
            case 2:
            case 3:
                dsVar.n(this.f4408h);
                break;
            case 4:
            case 5:
                dsVar.l(this.f4408h);
                break;
            case 6:
            case c4.w0.f2149o /* 7 */:
                dsVar.m(this.f4408h);
                break;
            case c4.w0.f2150p /* 8 */:
            case '\t':
                String[] D = n13.D(this.f4408h, "/");
                try {
                    int parseInt = Integer.parseInt(D[0]);
                    Integer valueOf = D.length > 1 ? Integer.valueOf(Integer.parseInt(D[1])) : null;
                    dsVar.z(Integer.valueOf(parseInt));
                    dsVar.y(valueOf);
                    break;
                } catch (NumberFormatException unused) {
                    return;
                }
            case '\n':
            case 11:
                try {
                    dsVar.t(Integer.valueOf(Integer.parseInt(this.f4408h)));
                    break;
                } catch (NumberFormatException unused2) {
                    return;
                }
            case '\f':
            case '\r':
                try {
                    int parseInt2 = Integer.parseInt(this.f4408h.substring(2, 4));
                    int parseInt3 = Integer.parseInt(this.f4408h.substring(0, 2));
                    dsVar.s(Integer.valueOf(parseInt2));
                    dsVar.r(Integer.valueOf(parseInt3));
                    break;
                } catch (NumberFormatException | StringIndexOutOfBoundsException unused3) {
                    return;
                }
            case 14:
                List<Integer> a7 = a(this.f4408h);
                int size = a7.size();
                if (size != 1) {
                    if (size != 2) {
                        if (size == 3) {
                            dsVar.r(a7.get(2));
                        }
                    }
                    dsVar.s(a7.get(1));
                }
                dsVar.t(a7.get(0));
                break;
            case 15:
                List<Integer> a8 = a(this.f4408h);
                int size2 = a8.size();
                if (size2 != 1) {
                    if (size2 != 2) {
                        if (size2 == 3) {
                            dsVar.u(a8.get(2));
                        }
                    }
                    dsVar.v(a8.get(1));
                }
                dsVar.w(a8.get(0));
                break;
            case 16:
            case 17:
                dsVar.o(this.f4408h);
                break;
            case 18:
            case 19:
                dsVar.p(this.f4408h);
                break;
            case 20:
            case 21:
                dsVar.A(this.f4408h);
                break;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (n13.p(this.f13818f, eVar.f13818f) && n13.p(this.f4407g, eVar.f4407g) && n13.p(this.f4408h, eVar.f4408h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f13818f.hashCode() + 527) * 31;
        String str = this.f4407g;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f4408h;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.wf4
    public final String toString() {
        String str = this.f13818f;
        String str2 = this.f4407g;
        String str3 = this.f4408h;
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 22 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append(": description=");
        sb.append(str2);
        sb.append(": value=");
        sb.append(str3);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f13818f);
        parcel.writeString(this.f4407g);
        parcel.writeString(this.f4408h);
    }
}
