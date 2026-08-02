package P0;

import E.AbstractC0005f;
import O3.d;
import T.B;
import T.D;
import U.i;

/* loaded from: classes.dex */
public final class a implements D {

    /* renamed from: a, reason: collision with root package name */
    public final String f2085a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2086b;

    public a(String str, String str2) {
        this.f2085a = i.E(str);
        this.f2086b = str2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // T.D
    public final void c(B b4) {
        String str = this.f2085a;
        str.getClass();
        char c4 = 65535;
        switch (str.hashCode()) {
            case -1935137620:
                if (str.equals("TOTALTRACKS")) {
                    c4 = 0;
                    break;
                }
                break;
            case -215998278:
                if (str.equals("TOTALDISCS")) {
                    c4 = 1;
                    break;
                }
                break;
            case -113312716:
                if (str.equals("TRACKNUMBER")) {
                    c4 = 2;
                    break;
                }
                break;
            case 62359119:
                if (str.equals("ALBUM")) {
                    c4 = 3;
                    break;
                }
                break;
            case 67703139:
                if (str.equals("GENRE")) {
                    c4 = 4;
                    break;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    c4 = 5;
                    break;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c4 = 6;
                    break;
                }
                break;
            case 993300766:
                if (str.equals("DISCNUMBER")) {
                    c4 = 7;
                    break;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c4 = '\b';
                    break;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c4 = '\t';
                    break;
                }
                break;
        }
        String str2 = this.f2086b;
        switch (c4) {
            case 0:
                Integer G4 = d.G(str2);
                if (G4 != null) {
                    b4.f2617i = G4;
                    break;
                }
                break;
            case 1:
                Integer G5 = d.G(str2);
                if (G5 != null) {
                    b4.v = G5;
                    break;
                }
                break;
            case 2:
                Integer G6 = d.G(str2);
                if (G6 != null) {
                    b4.f2616h = G6;
                    break;
                }
                break;
            case 3:
                b4.f2611c = str2;
                break;
            case 4:
                b4.f2628w = str2;
                break;
            case 5:
                b4.f2609a = str2;
                break;
            case 6:
                b4.f2613e = str2;
                break;
            case 7:
                Integer G7 = d.G(str2);
                if (G7 != null) {
                    b4.f2627u = G7;
                    break;
                }
                break;
            case '\b':
                b4.f2612d = str2;
                break;
            case '\t':
                b4.f2610b = str2;
                break;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f2085a.equals(aVar.f2085a) && this.f2086b.equals(aVar.f2086b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f2086b.hashCode() + AbstractC0005f.f(527, 31, this.f2085a);
    }

    public final String toString() {
        return "VC: " + this.f2085a + "=" + this.f2086b;
    }
}
