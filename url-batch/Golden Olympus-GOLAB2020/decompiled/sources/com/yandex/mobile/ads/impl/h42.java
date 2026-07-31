package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.yandex.mobile.ads.impl.uv0;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class h42 extends zh0 {
    public static final Parcelable.Creator<h42> CREATOR = new a();

    /* renamed from: c, reason: collision with root package name */
    public final String f26552c;

    /* renamed from: d, reason: collision with root package name */
    public final String f26553d;

    final class a implements Parcelable.Creator<h42> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public final h42 createFromParcel(Parcel parcel) {
            return new h42(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final h42[] newArray(int i4) {
            return new h42[i4];
        }
    }

    h42(Parcel parcel) {
        super((String) u82.a(parcel.readString()));
        this.f26552c = parcel.readString();
        this.f26553d = (String) u82.a(parcel.readString());
    }

    private static ArrayList a(String str) {
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h42.class == obj.getClass()) {
            h42 h42Var = (h42) obj;
            if (u82.a(this.f35592b, h42Var.f35592b) && u82.a(this.f26552c, h42Var.f26552c) && u82.a(this.f26553d, h42Var.f26553d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int a4 = C1842c3.a(this.f35592b, IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31);
        String str = this.f26552c;
        int hashCode = (a4 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f26553d;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.yandex.mobile.ads.impl.zh0
    public final String toString() {
        return this.f35592b + ": description=" + this.f26552c + ": value=" + this.f26553d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.f35592b);
        parcel.writeString(this.f26552c);
        parcel.writeString(this.f26553d);
    }

    public h42(String str, String str2, String str3) {
        super(str);
        this.f26552c = str2;
        this.f26553d = str3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.yandex.mobile.ads.impl.wz0.b
    public final void a(uv0.a aVar) {
        char c4;
        String str = this.f35592b;
        str.getClass();
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
            case 2569891:
                if (str.equals("TDAT")) {
                    c4 = '\f';
                    break;
                }
                c4 = 65535;
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c4 = '\r';
                    break;
                }
                c4 = 65535;
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c4 = 14;
                    break;
                }
                c4 = 65535;
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c4 = 15;
                    break;
                }
                c4 = 65535;
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c4 = 16;
                    break;
                }
                c4 = 65535;
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c4 = 17;
                    break;
                }
                c4 = 65535;
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c4 = 18;
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
                    c4 = 20;
                    break;
                }
                c4 = 65535;
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c4 = 21;
                    break;
                }
                c4 = 65535;
                break;
            default:
                c4 = 65535;
                break;
        }
        try {
            switch (c4) {
                case 0:
                case '\n':
                    aVar.b(this.f26553d);
                    break;
                case 1:
                case 11:
                    aVar.d(this.f26553d);
                    break;
                case 2:
                case '\f':
                    aVar.b(Integer.valueOf(Integer.parseInt(this.f26553d.substring(2, 4)))).a(Integer.valueOf(Integer.parseInt(this.f26553d.substring(0, 2))));
                    break;
                case 3:
                case 17:
                    aVar.c(this.f26553d);
                    break;
                case 4:
                case 18:
                    aVar.a(this.f26553d);
                    break;
                case 5:
                case 19:
                    aVar.e(this.f26553d);
                    break;
                case 6:
                case 20:
                    String str2 = this.f26553d;
                    int i4 = u82.f32873a;
                    String[] split = str2.split("/", -1);
                    aVar.h(Integer.valueOf(Integer.parseInt(split[0]))).g(split.length > 1 ? Integer.valueOf(Integer.parseInt(split[1])) : null);
                    break;
                case 7:
                case 16:
                    aVar.i(this.f26553d);
                    break;
                case '\b':
                case 15:
                    aVar.j(this.f26553d);
                    break;
                case '\t':
                case 21:
                    aVar.c(Integer.valueOf(Integer.parseInt(this.f26553d)));
                    break;
                case '\r':
                    ArrayList a4 = a(this.f26553d);
                    int size = a4.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                aVar.a((Integer) a4.get(2));
                            }
                        }
                        aVar.b((Integer) a4.get(1));
                    }
                    aVar.c((Integer) a4.get(0));
                    break;
                case 14:
                    ArrayList a5 = a(this.f26553d);
                    int size2 = a5.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                aVar.d((Integer) a5.get(2));
                            }
                        }
                        aVar.e((Integer) a5.get(1));
                    }
                    aVar.f((Integer) a5.get(0));
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }
}
