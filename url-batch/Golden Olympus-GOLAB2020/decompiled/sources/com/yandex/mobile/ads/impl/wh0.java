package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.yandex.mobile.ads.impl.uv0;
import com.yandex.mobile.ads.impl.wz0;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class wh0 implements wz0.b {
    public static final Parcelable.Creator<wh0> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f34065b;

    /* renamed from: c, reason: collision with root package name */
    public final String f34066c;

    /* renamed from: d, reason: collision with root package name */
    public final String f34067d;

    /* renamed from: e, reason: collision with root package name */
    public final String f34068e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f34069f;

    /* renamed from: g, reason: collision with root package name */
    public final int f34070g;

    final class a implements Parcelable.Creator<wh0> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public final wh0 createFromParcel(Parcel parcel) {
            return new wh0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final wh0[] newArray(int i4) {
            return new wh0[i4];
        }
    }

    public wh0(int i4, String str, String str2, String str3, boolean z4, int i5) {
        C2253tf.a(i5 == -1 || i5 > 0);
        this.f34065b = i4;
        this.f34066c = str;
        this.f34067d = str2;
        this.f34068e = str3;
        this.f34069f = z4;
        this.f34070g = i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static wh0 a(Map<String, List<String>> map) {
        boolean z4;
        int i4;
        List<String> list;
        String str;
        List<String> list2;
        String str2;
        List<String> list3;
        String str3;
        List<String> list4;
        boolean z5;
        List<String> list5;
        int i5;
        int parseInt;
        int i6;
        List<String> list6 = map.get("icy-br");
        boolean z6 = true;
        int i7 = -1;
        if (list6 != null) {
            String str4 = list6.get(0);
            try {
                i6 = Integer.parseInt(str4) * 1000;
            } catch (NumberFormatException unused) {
                i6 = -1;
            }
            if (i6 > 0) {
                z4 = true;
                i4 = i6;
                list = map.get("icy-genre");
                if (list != null) {
                    str = list.get(0);
                    z4 = true;
                } else {
                    str = null;
                }
                list2 = map.get("icy-name");
                if (list2 != null) {
                    str2 = list2.get(0);
                    z4 = true;
                } else {
                    str2 = null;
                }
                list3 = map.get("icy-url");
                if (list3 != null) {
                    str3 = list3.get(0);
                    z4 = true;
                } else {
                    str3 = null;
                }
                list4 = map.get("icy-pub");
                if (list4 != null) {
                    z5 = list4.get(0).equals("1");
                    z4 = true;
                } else {
                    z5 = false;
                }
                list5 = map.get("icy-metaint");
                if (list5 != null) {
                    String str5 = list5.get(0);
                    try {
                        parseInt = Integer.parseInt(str5);
                    } catch (NumberFormatException unused2) {
                    }
                    if (parseInt > 0) {
                        i5 = parseInt;
                        if (z6) {
                            return new wh0(i4, str, str2, str3, z5, i5);
                        }
                        return null;
                    }
                    try {
                        ms0.d("IcyHeaders", "Invalid metadata interval: " + str5);
                    } catch (NumberFormatException unused3) {
                        i7 = parseInt;
                        zu0.a("Invalid metadata interval: ", str5, "IcyHeaders");
                        z6 = z4;
                        i5 = i7;
                        if (z6) {
                        }
                    }
                }
                z6 = z4;
                i5 = i7;
                if (z6) {
                }
            } else {
                try {
                    ms0.d("IcyHeaders", "Invalid bitrate: " + str4);
                } catch (NumberFormatException unused4) {
                    zu0.a("Invalid bitrate header: ", str4, "IcyHeaders");
                    z4 = false;
                    i4 = i6;
                    list = map.get("icy-genre");
                    if (list != null) {
                    }
                    list2 = map.get("icy-name");
                    if (list2 != null) {
                    }
                    list3 = map.get("icy-url");
                    if (list3 != null) {
                    }
                    list4 = map.get("icy-pub");
                    if (list4 != null) {
                    }
                    list5 = map.get("icy-metaint");
                    if (list5 != null) {
                    }
                    z6 = z4;
                    i5 = i7;
                    if (z6) {
                    }
                }
            }
        }
        z4 = false;
        i4 = -1;
        list = map.get("icy-genre");
        if (list != null) {
        }
        list2 = map.get("icy-name");
        if (list2 != null) {
        }
        list3 = map.get("icy-url");
        if (list3 != null) {
        }
        list4 = map.get("icy-pub");
        if (list4 != null) {
        }
        list5 = map.get("icy-metaint");
        if (list5 != null) {
        }
        z6 = z4;
        i5 = i7;
        if (z6) {
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && wh0.class == obj.getClass()) {
            wh0 wh0Var = (wh0) obj;
            if (this.f34065b == wh0Var.f34065b && u82.a(this.f34066c, wh0Var.f34066c) && u82.a(this.f34067d, wh0Var.f34067d) && u82.a(this.f34068e, wh0Var.f34068e) && this.f34069f == wh0Var.f34069f && this.f34070g == wh0Var.f34070g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i4 = (this.f34065b + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str = this.f34066c;
        int hashCode = (i4 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f34067d;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f34068e;
        return ((((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f34069f ? 1 : 0)) * 31) + this.f34070g;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.f34067d + "\", genre=\"" + this.f34066c + "\", bitrate=" + this.f34065b + ", metadataInterval=" + this.f34070g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f34065b);
        parcel.writeString(this.f34066c);
        parcel.writeString(this.f34067d);
        parcel.writeString(this.f34068e);
        boolean z4 = this.f34069f;
        int i5 = u82.f32873a;
        parcel.writeInt(z4 ? 1 : 0);
        parcel.writeInt(this.f34070g);
    }

    wh0(Parcel parcel) {
        this.f34065b = parcel.readInt();
        this.f34066c = parcel.readString();
        this.f34067d = parcel.readString();
        this.f34068e = parcel.readString();
        this.f34069f = u82.a(parcel);
        this.f34070g = parcel.readInt();
    }

    @Override // com.yandex.mobile.ads.impl.wz0.b
    public final void a(uv0.a aVar) {
        String str = this.f34067d;
        if (str != null) {
            aVar.h(str);
        }
        String str2 = this.f34066c;
        if (str2 != null) {
            aVar.g(str2);
        }
    }
}
