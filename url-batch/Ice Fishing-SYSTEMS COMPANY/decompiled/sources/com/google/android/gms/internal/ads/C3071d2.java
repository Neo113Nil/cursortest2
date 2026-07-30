package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Objects;
import t0.AbstractC5051n;

/* renamed from: com.google.android.gms.internal.ads.d2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3071d2 extends Y1 {

    /* renamed from: b, reason: collision with root package name */
    public final String f29776b;

    /* renamed from: c, reason: collision with root package name */
    public final UB f29777c;

    public C3071d2(String str, String str2, C3675oC c3675oC) {
        super(str);
        PA.n(!c3675oC.isEmpty());
        this.f29776b = str2;
        UB n9 = UB.n(c3675oC);
        this.f29777c = n9;
    }

    public static ArrayList b(String str) {
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
    @Override // com.google.android.gms.internal.ads.InterfaceC4043v3
    public final void a(P2 p22) {
        char c4;
        String str = this.f28771a;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c4 = 6;
                    break;
                }
                c4 = 65535;
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c4 = 16;
                    break;
                }
                c4 = 65535;
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c4 = '\f';
                    break;
                }
                c4 = 65535;
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c4 = 2;
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
                    c4 = 18;
                    break;
                }
                c4 = 65535;
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c4 = '\b';
                    break;
                }
                c4 = 65535;
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c4 = 0;
                    break;
                }
                c4 = 65535;
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c4 = 20;
                    break;
                }
                c4 = 65535;
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c4 = '\n';
                    break;
                }
                c4 = 65535;
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c4 = 7;
                    break;
                }
                c4 = 65535;
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c4 = 17;
                    break;
                }
                c4 = 65535;
                break;
            case 2569358:
                if (str.equals("TCON")) {
                    c4 = 22;
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
                if (str.equals("TEXT")) {
                    c4 = 21;
                    break;
                }
                c4 = 65535;
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c4 = 1;
                    break;
                }
                c4 = 65535;
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c4 = 3;
                    break;
                }
                c4 = 65535;
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c4 = 5;
                    break;
                }
                c4 = 65535;
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c4 = 19;
                    break;
                }
                c4 = 65535;
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c4 = '\t';
                    break;
                }
                c4 = 65535;
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c4 = 11;
                    break;
                }
                c4 = 65535;
                break;
            default:
                c4 = 65535;
                break;
        }
        UB ub = this.f29777c;
        try {
            switch (c4) {
                case 0:
                case 1:
                    p22.f26799a = (CharSequence) ub.get(0);
                    break;
                case 2:
                case 3:
                    p22.f26800b = (CharSequence) ub.get(0);
                    break;
                case 4:
                case 5:
                    p22.f26802d = (CharSequence) ub.get(0);
                    break;
                case 6:
                case 7:
                    p22.f26801c = (CharSequence) ub.get(0);
                    break;
                case '\b':
                case '\t':
                    String str2 = (String) ub.get(0);
                    String str3 = AbstractC3548lu.f32613a;
                    String[] split = str2.split("/", -1);
                    int parseInt = Integer.parseInt(split[0]);
                    Integer valueOf = split.length > 1 ? Integer.valueOf(Integer.parseInt(split[1])) : null;
                    p22.f26806h = Integer.valueOf(parseInt);
                    p22.i = valueOf;
                    break;
                case '\n':
                case 11:
                    p22.f26809l = Integer.valueOf(Integer.parseInt((String) ub.get(0)));
                    break;
                case '\f':
                case '\r':
                    String str4 = (String) ub.get(0);
                    int parseInt2 = Integer.parseInt(str4.substring(2, 4));
                    int parseInt3 = Integer.parseInt(str4.substring(0, 2));
                    p22.f26810m = Integer.valueOf(parseInt2);
                    p22.f26811n = Integer.valueOf(parseInt3);
                    break;
                case 14:
                    ArrayList b9 = b((String) ub.get(0));
                    int size = b9.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                p22.f26811n = (Integer) b9.get(2);
                            }
                        }
                        p22.f26810m = (Integer) b9.get(1);
                    }
                    p22.f26809l = (Integer) b9.get(0);
                    break;
                case 15:
                    ArrayList b10 = b((String) ub.get(0));
                    int size2 = b10.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                p22.f26814q = (Integer) b10.get(2);
                            }
                        }
                        p22.f26813p = (Integer) b10.get(1);
                    }
                    p22.f26812o = (Integer) b10.get(0);
                    break;
                case 16:
                case 17:
                    p22.f26816s = (CharSequence) ub.get(0);
                    break;
                case 18:
                case 19:
                    p22.f26817t = (CharSequence) ub.get(0);
                    break;
                case 20:
                case 21:
                    p22.f26815r = (CharSequence) ub.get(0);
                    break;
                case 22:
                    Integer F8 = AbstractC3194fG.F((String) ub.get(0));
                    if (F8 != null) {
                        String a9 = Z1.a(F8.intValue());
                        if (a9 != null) {
                            p22.f26820w = a9;
                            break;
                        }
                    } else {
                        p22.f26820w = (CharSequence) ub.get(0);
                        break;
                    }
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3071d2.class == obj.getClass()) {
            C3071d2 c3071d2 = (C3071d2) obj;
            if (Objects.equals(this.f28771a, c3071d2.f28771a) && Objects.equals(this.f29776b, c3071d2.f29776b) && this.f29777c.equals(c3071d2.f29777c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f28771a.hashCode() + 527;
        String str = this.f29776b;
        return this.f29777c.hashCode() + (((hashCode * 31) + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.Y1
    public final String toString() {
        String valueOf = String.valueOf(this.f29777c);
        String str = this.f28771a;
        int length = String.valueOf(str).length();
        String str2 = this.f29776b;
        StringBuilder sb = new StringBuilder(length + 14 + String.valueOf(str2).length() + 9 + valueOf.length());
        AbstractC5051n.j(sb, str, ": description=", str2, ": values=");
        sb.append(valueOf);
        return sb.toString();
    }
}
