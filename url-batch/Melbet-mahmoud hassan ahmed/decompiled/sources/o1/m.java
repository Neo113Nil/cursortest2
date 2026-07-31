package o1;

import android.os.Parcel;
import android.os.Parcelable;
import c4.w0;
import java.util.ArrayList;
import java.util.List;
import o2.m0;
import r0.f2;

/* loaded from: classes.dex */
public final class m extends i {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* renamed from: g, reason: collision with root package name */
    public final String f19684g;

    /* renamed from: h, reason: collision with root package name */
    public final String f19685h;

    class a implements Parcelable.Creator<m> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public m createFromParcel(Parcel parcel) {
            return new m(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public m[] newArray(int i7) {
            return new m[i7];
        }
    }

    m(Parcel parcel) {
        super((String) m0.j(parcel.readString()));
        this.f19684g = parcel.readString();
        this.f19685h = (String) m0.j(parcel.readString());
    }

    public m(String str, String str2, String str3) {
        super(str);
        this.f19684g = str2;
        this.f19685h = str3;
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

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // o1.i, j1.a.b
    public void e(f2.b bVar) {
        String str = this.f19673f;
        str.hashCode();
        char c7 = 65535;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c7 = 0;
                    break;
                }
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c7 = 1;
                    break;
                }
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c7 = 2;
                    break;
                }
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c7 = 3;
                    break;
                }
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c7 = 4;
                    break;
                }
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c7 = 5;
                    break;
                }
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c7 = 6;
                    break;
                }
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c7 = 7;
                    break;
                }
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c7 = '\b';
                    break;
                }
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c7 = '\t';
                    break;
                }
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c7 = '\n';
                    break;
                }
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c7 = 11;
                    break;
                }
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c7 = '\f';
                    break;
                }
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c7 = '\r';
                    break;
                }
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c7 = 14;
                    break;
                }
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c7 = 15;
                    break;
                }
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c7 = 16;
                    break;
                }
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c7 = 17;
                    break;
                }
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c7 = 18;
                    break;
                }
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c7 = 19;
                    break;
                }
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c7 = 20;
                    break;
                }
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c7 = 21;
                    break;
                }
                break;
        }
        try {
            switch (c7) {
                case 0:
                case '\n':
                    bVar.L(this.f19685h);
                    break;
                case 1:
                case 11:
                    bVar.Q(this.f19685h);
                    break;
                case 2:
                case '\f':
                    bVar.b0(Integer.valueOf(Integer.parseInt(this.f19685h.substring(2, 4)))).a0(Integer.valueOf(Integer.parseInt(this.f19685h.substring(0, 2))));
                    break;
                case 3:
                case 17:
                    bVar.M(this.f19685h);
                    break;
                case 4:
                case 18:
                    bVar.K(this.f19685h);
                    break;
                case 5:
                case 19:
                    bVar.R(this.f19685h);
                    break;
                case 6:
                case 20:
                    String[] Q0 = m0.Q0(this.f19685h, "/");
                    bVar.l0(Integer.valueOf(Integer.parseInt(Q0[0]))).k0(Q0.length > 1 ? Integer.valueOf(Integer.parseInt(Q0[1])) : null);
                    break;
                case w0.f2149o /* 7 */:
                case 16:
                    bVar.i0(this.f19685h);
                    break;
                case w0.f2150p /* 8 */:
                case 15:
                    bVar.n0(this.f19685h);
                    break;
                case '\t':
                case 21:
                    bVar.c0(Integer.valueOf(Integer.parseInt(this.f19685h)));
                    break;
                case '\r':
                    List<Integer> a7 = a(this.f19685h);
                    int size = a7.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                bVar.a0(a7.get(2));
                            }
                        }
                        bVar.b0(a7.get(1));
                    }
                    bVar.c0(a7.get(0));
                    break;
                case 14:
                    List<Integer> a8 = a(this.f19685h);
                    int size2 = a8.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                bVar.d0(a8.get(2));
                            }
                        }
                        bVar.e0(a8.get(1));
                    }
                    bVar.f0(a8.get(0));
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        return m0.c(this.f19673f, mVar.f19673f) && m0.c(this.f19684g, mVar.f19684g) && m0.c(this.f19685h, mVar.f19685h);
    }

    public int hashCode() {
        int hashCode = (527 + this.f19673f.hashCode()) * 31;
        String str = this.f19684g;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f19685h;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // o1.i
    public String toString() {
        return this.f19673f + ": description=" + this.f19684g + ": value=" + this.f19685h;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f19673f);
        parcel.writeString(this.f19684g);
        parcel.writeString(this.f19685h);
    }
}
