package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.JsonReader;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.to, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC3973to extends AbstractBinderC3186f8 {

    /* renamed from: n, reason: collision with root package name */
    public final C3536li f34469n;

    /* renamed from: u, reason: collision with root package name */
    public final C3562m7 f34470u;

    /* renamed from: v, reason: collision with root package name */
    public final HashMap f34471v;

    public BinderC3973to(C3536li c3536li, C3562m7 c3562m7) {
        super("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
        this.f34471v = new HashMap();
        this.f34469n = c3536li;
        this.f34470u = c3562m7;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:95:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0164  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static q2.d1 G3(HashMap hashMap) {
        int i;
        Bundle bundle;
        Bundle bundle2;
        char c4;
        Bundle bundle3 = new Bundle();
        ArrayList arrayList = new ArrayList();
        Bundle bundle4 = new Bundle();
        Bundle bundle5 = new Bundle();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        String str = (String) hashMap.get("ad_request");
        boolean z8 = false;
        int i4 = -1;
        String str2 = null;
        int i9 = 60000;
        if (str == null) {
            return new q2.d1(8, -1L, bundle3, -1, arrayList, false, -1, false, null, null, null, null, bundle4, bundle5, arrayList2, null, null, false, null, -1, null, arrayList3, 60000, null, 0, 0L, 0L, -1);
        }
        JsonReader jsonReader = new JsonReader(new StringReader(Uri.decode(str)));
        try {
            jsonReader.beginObject();
            i = -1;
            while (jsonReader.hasNext()) {
                try {
                    String nextName = jsonReader.nextName();
                    switch (nextName.hashCode()) {
                        case -1289032093:
                            if (nextName.equals("extras")) {
                                c4 = 0;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -839117230:
                            if (nextName.equals("isTestDevice")) {
                                c4 = 2;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -733436947:
                            if (nextName.equals("tagForUnderAgeOfConsent")) {
                                c4 = 4;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -99890337:
                            if (nextName.equals("httpTimeoutMillis")) {
                                c4 = 6;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 523149226:
                            if (nextName.equals("keywords")) {
                                c4 = 1;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 597632527:
                            if (nextName.equals("maxAdContentRating")) {
                                c4 = 5;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 1411582723:
                            if (nextName.equals("tagForChildDirectedTreatment")) {
                                c4 = 3;
                                break;
                            }
                            c4 = 65535;
                            break;
                        default:
                            c4 = 65535;
                            break;
                    }
                    switch (c4) {
                        case 0:
                            jsonReader.beginObject();
                            Bundle bundle6 = new Bundle();
                            while (jsonReader.hasNext()) {
                                bundle6.putString(jsonReader.nextName(), jsonReader.nextString());
                            }
                            jsonReader.endObject();
                            bundle3 = bundle6;
                            break;
                        case 1:
                            jsonReader.beginArray();
                            ArrayList arrayList4 = new ArrayList();
                            while (jsonReader.hasNext()) {
                                arrayList4.add(jsonReader.nextString());
                            }
                            jsonReader.endArray();
                            arrayList = arrayList4;
                            break;
                        case 2:
                            z8 = jsonReader.nextBoolean();
                            break;
                        case 3:
                            if (!jsonReader.nextBoolean()) {
                                i4 = 0;
                                break;
                            } else {
                                i4 = 1;
                                break;
                            }
                        case 4:
                            if (!jsonReader.nextBoolean()) {
                                i = 0;
                                break;
                            } else {
                                i = 1;
                                break;
                            }
                        case 5:
                            String nextString = jsonReader.nextString();
                            if (!k2.r.f38726d.contains(nextString)) {
                                break;
                            } else {
                                str2 = nextString;
                                break;
                            }
                        case 6:
                            i9 = jsonReader.nextInt();
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                } catch (IOException unused) {
                    int i10 = t2.C.f40822b;
                    u2.i.a("Ad Request json was malformed, parsing ended early.");
                    int i11 = i;
                    ArrayList arrayList5 = arrayList;
                    String str3 = str2;
                    int i12 = i9;
                    new Bundle();
                    bundle = bundle4.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
                    if (bundle != null) {
                    }
                    return new q2.d1(8, -1L, bundle2, -1, arrayList5, z8, i4, false, null, null, null, null, bundle4, bundle5, arrayList2, null, null, false, null, i11, str3, arrayList3, i12, null, 0, 0L, 0L, -1);
                }
            }
            jsonReader.endObject();
        } catch (IOException unused2) {
            i = -1;
        }
        int i112 = i;
        ArrayList arrayList52 = arrayList;
        String str32 = str2;
        int i122 = i9;
        new Bundle();
        bundle = bundle4.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle != null) {
            bundle4.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundle3);
            bundle2 = bundle3;
        } else {
            bundle2 = bundle;
        }
        return new q2.d1(8, -1L, bundle2, -1, arrayList52, z8, i4, false, null, null, null, null, bundle4, bundle5, arrayList2, null, null, false, null, i112, str32, arrayList3, i122, null, 0, 0L, 0L, -1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00c2, code lost:
    
        if (r6.equals("create_interstitial_ad") != false) goto L56;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.AbstractBinderC3186f8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean F3(int i, Parcel parcel, Parcel parcel2) {
        boolean z8;
        boolean z9;
        HashMap hashMap = this.f34471v;
        char c4 = 0;
        if (i == 1) {
            String readString = parcel.readString();
            AbstractC3241g8.f(parcel);
            C3151ea c3151ea = AbstractC3368ia.qb;
            q2.r rVar = q2.r.f40116e;
            if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
                t2.C.k("Received H5 gmsg: ".concat(String.valueOf(readString)));
                Uri parse = Uri.parse(readString);
                t2.G g9 = p2.j.f39798C.f39803c;
                HashMap o9 = t2.G.o(parse);
                String str = (String) o9.get(NativeAdvancedJsUtils.f18064p);
                if (!TextUtils.isEmpty(str)) {
                    int hashCode = str.hashCode();
                    if (hashCode != 579053441) {
                        if (hashCode == 871091088 && str.equals("initialize")) {
                            z8 = false;
                        }
                        z8 = -1;
                    } else {
                        if (str.equals("dispose_all")) {
                            z8 = true;
                        }
                        z8 = -1;
                    }
                    C3562m7 c3562m7 = this.f34470u;
                    if (!z8) {
                        z9 = true;
                        hashMap.clear();
                        c3562m7.getClass();
                        c3562m7.s(new Q8("initialize"));
                    } else if (!z8) {
                        String str2 = (String) o9.get("obj_id");
                        try {
                            Objects.requireNonNull(str2);
                            long parseLong = Long.parseLong(str2);
                            switch (str.hashCode()) {
                                case -1790951212:
                                    if (str.equals("show_interstitial_ad")) {
                                        c4 = 2;
                                        break;
                                    }
                                    c4 = 65535;
                                    break;
                                case -1266374734:
                                    if (str.equals("show_rewarded_ad")) {
                                        c4 = 5;
                                        break;
                                    }
                                    c4 = 65535;
                                    break;
                                case -257098725:
                                    if (str.equals("load_rewarded_ad")) {
                                        c4 = 4;
                                        break;
                                    }
                                    c4 = 65535;
                                    break;
                                case 393881811:
                                    break;
                                case 585513149:
                                    if (str.equals("load_interstitial_ad")) {
                                        c4 = 1;
                                        break;
                                    }
                                    c4 = 65535;
                                    break;
                                case 1671767583:
                                    if (str.equals("dispose")) {
                                        c4 = 6;
                                        break;
                                    }
                                    c4 = 65535;
                                    break;
                                case 2109237041:
                                    if (str.equals("create_rewarded_ad")) {
                                        c4 = 3;
                                        break;
                                    }
                                    c4 = 65535;
                                    break;
                                default:
                                    c4 = 65535;
                                    break;
                            }
                            SharedPreferencesOnSharedPreferenceChangeListenerC3260ga sharedPreferencesOnSharedPreferenceChangeListenerC3260ga = rVar.f40119c;
                            z9 = true;
                            C3536li c3536li = this.f34469n;
                            switch (c4) {
                                case 0:
                                    if (hashMap.size() < ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.rb)).intValue()) {
                                        Long valueOf = Long.valueOf(parseLong);
                                        if (!hashMap.containsKey(valueOf)) {
                                            String str3 = (String) o9.get("ad_unit");
                                            if (!TextUtils.isEmpty(str3)) {
                                                C3536li c3536li2 = c3536li.f32578d;
                                                str3.getClass();
                                                hashMap.put(valueOf, new C4081vo(parseLong, c3536li2.f32575a, new C3562m7(21, c3536li2.f32576b), c3536li.f32577c, str3));
                                                c3562m7.getClass();
                                                Q8 q82 = new Q8("creation");
                                                q82.f27119n = Long.valueOf(parseLong);
                                                q82.f27121v = "nativeObjectCreated";
                                                c3562m7.s(q82);
                                                StringBuilder sb = new StringBuilder(String.valueOf(parseLong).length() + 39 + str3.length());
                                                com.anythink.basead.b.c.i.x(sb, "Created H5 interstitial #", parseLong, " with ad unit ");
                                                sb.append(str3);
                                                t2.C.k(sb.toString());
                                                break;
                                            } else {
                                                u2.i.f("Could not create H5 ad, missing ad unit id");
                                                c3562m7.p(parseLong);
                                                break;
                                            }
                                        } else {
                                            u2.i.a("Could not create H5 ad, object ID already exists");
                                            c3562m7.p(parseLong);
                                            break;
                                        }
                                    } else {
                                        u2.i.f("Could not create H5 ad, too many existing objects");
                                        c3562m7.p(parseLong);
                                        break;
                                    }
                                case 1:
                                    InterfaceC3919so interfaceC3919so = (InterfaceC3919so) hashMap.get(Long.valueOf(parseLong));
                                    if (interfaceC3919so != null) {
                                        interfaceC3919so.a(G3(o9));
                                        break;
                                    } else {
                                        u2.i.a("Could not load H5 ad, object ID does not exist");
                                        c3562m7.getClass();
                                        Q8 q83 = new Q8(com.anythink.expressad.foundation.g.a.f.f19280d);
                                        q83.f27119n = Long.valueOf(parseLong);
                                        q83.f27121v = "onNativeAdObjectNotAvailable";
                                        c3562m7.s(q83);
                                        break;
                                    }
                                case 2:
                                    InterfaceC3919so interfaceC3919so2 = (InterfaceC3919so) hashMap.get(Long.valueOf(parseLong));
                                    if (interfaceC3919so2 != null) {
                                        interfaceC3919so2.d();
                                        break;
                                    } else {
                                        u2.i.a("Could not show H5 ad, object ID does not exist");
                                        c3562m7.getClass();
                                        Q8 q84 = new Q8(com.anythink.expressad.foundation.g.a.f.f19280d);
                                        q84.f27119n = Long.valueOf(parseLong);
                                        q84.f27121v = "onNativeAdObjectNotAvailable";
                                        c3562m7.s(q84);
                                        break;
                                    }
                                case 3:
                                    if (hashMap.size() < ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.rb)).intValue()) {
                                        Long valueOf2 = Long.valueOf(parseLong);
                                        if (!hashMap.containsKey(valueOf2)) {
                                            String str4 = (String) o9.get("ad_unit");
                                            if (!TextUtils.isEmpty(str4)) {
                                                C3536li c3536li3 = c3536li.f32578d;
                                                str4.getClass();
                                                hashMap.put(valueOf2, new C4243yo(parseLong, c3536li3.f32575a, new C3562m7(21, c3536li3.f32576b), c3536li.f32577c, str4));
                                                c3562m7.getClass();
                                                Q8 q85 = new Q8("creation");
                                                q85.f27119n = Long.valueOf(parseLong);
                                                q85.f27121v = "nativeObjectCreated";
                                                c3562m7.s(q85);
                                                StringBuilder sb2 = new StringBuilder(String.valueOf(parseLong).length() + 35 + str4.length());
                                                com.anythink.basead.b.c.i.x(sb2, "Created H5 rewarded #", parseLong, " with ad unit ");
                                                sb2.append(str4);
                                                t2.C.k(sb2.toString());
                                                break;
                                            } else {
                                                u2.i.f("Could not create H5 ad, missing ad unit id");
                                                c3562m7.p(parseLong);
                                                break;
                                            }
                                        } else {
                                            u2.i.a("Could not create H5 ad, object ID already exists");
                                            c3562m7.p(parseLong);
                                            break;
                                        }
                                    } else {
                                        u2.i.f("Could not create H5 ad, too many existing objects");
                                        c3562m7.p(parseLong);
                                        break;
                                    }
                                case 4:
                                    InterfaceC3919so interfaceC3919so3 = (InterfaceC3919so) hashMap.get(Long.valueOf(parseLong));
                                    if (interfaceC3919so3 != null) {
                                        interfaceC3919so3.a(G3(o9));
                                        break;
                                    } else {
                                        u2.i.a("Could not load H5 ad, object ID does not exist");
                                        c3562m7.getClass();
                                        Q8 q86 = new Q8("rewarded");
                                        q86.f27119n = Long.valueOf(parseLong);
                                        q86.f27121v = "onNativeAdObjectNotAvailable";
                                        c3562m7.s(q86);
                                        break;
                                    }
                                case 5:
                                    InterfaceC3919so interfaceC3919so4 = (InterfaceC3919so) hashMap.get(Long.valueOf(parseLong));
                                    if (interfaceC3919so4 != null) {
                                        interfaceC3919so4.d();
                                        break;
                                    } else {
                                        u2.i.a("Could not show H5 ad, object ID does not exist");
                                        c3562m7.getClass();
                                        Q8 q87 = new Q8("rewarded");
                                        q87.f27119n = Long.valueOf(parseLong);
                                        q87.f27121v = "onNativeAdObjectNotAvailable";
                                        c3562m7.s(q87);
                                        break;
                                    }
                                case 6:
                                    Long valueOf3 = Long.valueOf(parseLong);
                                    InterfaceC3919so interfaceC3919so5 = (InterfaceC3919so) hashMap.get(valueOf3);
                                    if (interfaceC3919so5 != null) {
                                        interfaceC3919so5.i();
                                        hashMap.remove(valueOf3);
                                        StringBuilder sb3 = new StringBuilder(String.valueOf(parseLong).length() + 16);
                                        sb3.append("Disposed H5 ad #");
                                        sb3.append(parseLong);
                                        t2.C.k(sb3.toString());
                                        break;
                                    } else {
                                        u2.i.a("Could not dispose H5 ad, object ID does not exist");
                                        break;
                                    }
                                default:
                                    u2.i.a("H5 gmsg contained invalid action: ".concat(str));
                                    break;
                            }
                        } catch (NullPointerException | NumberFormatException unused) {
                            z9 = true;
                            u2.i.a("H5 gmsg did not contain a valid object id: ".concat(String.valueOf(str2)));
                        }
                    } else {
                        z9 = true;
                        Iterator it = hashMap.values().iterator();
                        while (it.hasNext()) {
                            ((InterfaceC3919so) it.next()).i();
                        }
                        hashMap.clear();
                    }
                    parcel2.writeNoException();
                    return z9;
                }
                u2.i.a("H5 gmsg did not contain an action");
            }
        } else {
            if (i != 2) {
                return false;
            }
            hashMap.clear();
        }
        z9 = true;
        parcel2.writeNoException();
        return z9;
    }
}
