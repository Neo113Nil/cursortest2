package M0;

import E.AbstractC0005f;
import T.B;
import W.J;
import a.AbstractC0124a;
import com.startapp.sdk.adsbase.model.AdPreferences;
import io.appmetrica.analytics.impl.C0583e9;
import io.flutter.Build;
import java.util.ArrayList;
import java.util.Objects;
import v2.I;
import v2.a0;

/* loaded from: classes.dex */
public final class n extends i {

    /* renamed from: b, reason: collision with root package name */
    public final String f1733b;

    /* renamed from: c, reason: collision with root package name */
    public final I f1734c;

    public n(String str, String str2, a0 a0Var) {
        super(str);
        AbstractC0124a.h(!a0Var.isEmpty());
        this.f1733b = str2;
        I k4 = I.k(a0Var);
        this.f1734c = k4;
    }

    public static ArrayList d(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // T.D
    public final void c(B b4) {
        char c4;
        String str = this.f1721a;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c4 = 0;
                    break;
                }
                c4 = 65535;
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c4 = 1;
                    break;
                }
                c4 = 65535;
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c4 = 2;
                    break;
                }
                c4 = 65535;
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c4 = 3;
                    break;
                }
                c4 = 65535;
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c4 = 4;
                    break;
                }
                c4 = 65535;
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c4 = 5;
                    break;
                }
                c4 = 65535;
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c4 = 6;
                    break;
                }
                c4 = 65535;
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c4 = 7;
                    break;
                }
                c4 = 65535;
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c4 = '\b';
                    break;
                }
                c4 = 65535;
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c4 = '\t';
                    break;
                }
                c4 = 65535;
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c4 = '\n';
                    break;
                }
                c4 = 65535;
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c4 = 11;
                    break;
                }
                c4 = 65535;
                break;
            case 2569358:
                if (str.equals("TCON")) {
                    c4 = '\f';
                    break;
                }
                c4 = 65535;
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c4 = '\r';
                    break;
                }
                c4 = 65535;
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c4 = 14;
                    break;
                }
                c4 = 65535;
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c4 = 15;
                    break;
                }
                c4 = 65535;
                break;
            case 2571565:
                if (str.equals(AdPreferences.TYPE_TEXT)) {
                    c4 = 16;
                    break;
                }
                c4 = 65535;
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c4 = 17;
                    break;
                }
                c4 = 65535;
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c4 = 18;
                    break;
                }
                c4 = 65535;
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c4 = 19;
                    break;
                }
                c4 = 65535;
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c4 = 20;
                    break;
                }
                c4 = 65535;
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c4 = 21;
                    break;
                }
                c4 = 65535;
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c4 = 22;
                    break;
                }
                c4 = 65535;
                break;
            default:
                c4 = 65535;
                break;
        }
        I i4 = this.f1734c;
        try {
            switch (c4) {
                case 0:
                case '\n':
                    b4.f2611c = (CharSequence) i4.get(0);
                    break;
                case 1:
                case 11:
                    b4.f2625s = (CharSequence) i4.get(0);
                    break;
                case 2:
                case '\r':
                    String str2 = (String) i4.get(0);
                    int parseInt = Integer.parseInt(str2.substring(2, 4));
                    int parseInt2 = Integer.parseInt(str2.substring(0, 2));
                    b4.f2621m = Integer.valueOf(parseInt);
                    b4.n = Integer.valueOf(parseInt2);
                    break;
                case 3:
                case 18:
                    b4.f2610b = (CharSequence) i4.get(0);
                    break;
                case 4:
                case C0583e9.f11743C /* 19 */:
                    b4.f2612d = (CharSequence) i4.get(0);
                    break;
                case 5:
                case C0583e9.f11744D /* 20 */:
                    b4.f2626t = (CharSequence) i4.get(0);
                    break;
                case 6:
                case 21:
                    String str3 = (String) i4.get(0);
                    String str4 = J.f3263a;
                    String[] split = str3.split("/", -1);
                    int parseInt3 = Integer.parseInt(split[0]);
                    Integer valueOf = split.length > 1 ? Integer.valueOf(Integer.parseInt(split[1])) : null;
                    b4.f2616h = Integer.valueOf(parseInt3);
                    b4.f2617i = valueOf;
                    break;
                case 7:
                case 17:
                    b4.f2609a = (CharSequence) i4.get(0);
                    break;
                case '\b':
                case 16:
                    b4.f2624r = (CharSequence) i4.get(0);
                    break;
                case '\t':
                case Build.API_LEVELS.API_22 /* 22 */:
                    b4.f2620l = Integer.valueOf(Integer.parseInt((String) i4.get(0)));
                    break;
                case '\f':
                    Integer G4 = O3.d.G((String) i4.get(0));
                    if (G4 != null) {
                        String a3 = j.a(G4.intValue());
                        if (a3 != null) {
                            b4.f2628w = a3;
                            break;
                        }
                    } else {
                        b4.f2628w = (CharSequence) i4.get(0);
                        break;
                    }
                    break;
                case 14:
                    ArrayList d4 = d((String) i4.get(0));
                    int size = d4.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                b4.n = (Integer) d4.get(2);
                            }
                        }
                        b4.f2621m = (Integer) d4.get(1);
                    }
                    b4.f2620l = (Integer) d4.get(0);
                    break;
                case 15:
                    ArrayList d5 = d((String) i4.get(0));
                    int size2 = d5.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                b4.f2623q = (Integer) d5.get(2);
                            }
                        }
                        b4.f2622p = (Integer) d5.get(1);
                    }
                    b4.o = (Integer) d5.get(0);
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            if (Objects.equals(this.f1721a, nVar.f1721a) && Objects.equals(this.f1733b, nVar.f1733b) && this.f1734c.equals(nVar.f1734c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int f4 = AbstractC0005f.f(527, 31, this.f1721a);
        String str = this.f1733b;
        return this.f1734c.hashCode() + ((f4 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // M0.i
    public final String toString() {
        return this.f1721a + ": description=" + this.f1733b + ": values=" + this.f1734c;
    }
}
