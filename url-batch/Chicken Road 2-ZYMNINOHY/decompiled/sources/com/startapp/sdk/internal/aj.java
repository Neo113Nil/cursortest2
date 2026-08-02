package com.startapp.sdk.internal;

import android.content.Context;
import android.graphics.Point;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.startapp.sdk.ads.video.vast.VASTErrorCodes;
import com.startapp.sdk.ads.video.vast.VASTResource$CreativeType;
import com.startapp.sdk.ads.video.vast.VASTResource$Type;
import com.startapp.sdk.omsdk.VerificationDetails;
import java.io.BufferedInputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/* loaded from: classes.dex */
public final class aj {

    /* renamed from: i, reason: collision with root package name */
    public static final List f6679i = Arrays.asList("video/mp4", "video/3gpp");

    /* renamed from: a, reason: collision with root package name */
    public final int f6680a;

    /* renamed from: b, reason: collision with root package name */
    public final float f6681b;

    /* renamed from: c, reason: collision with root package name */
    public zi f6682c;

    /* renamed from: d, reason: collision with root package name */
    public VASTErrorCodes f6683d;

    /* renamed from: e, reason: collision with root package name */
    public int f6684e;

    /* renamed from: f, reason: collision with root package name */
    public int f6685f = 10;

    /* renamed from: g, reason: collision with root package name */
    public final HashSet f6686g = new HashSet();

    /* renamed from: h, reason: collision with root package name */
    public final String f6687h;

    public aj(Context context, String str) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i4 = displayMetrics.widthPixels;
        int i5 = displayMetrics.heightPixels;
        float f4 = displayMetrics.density;
        f4 = f4 <= 0.0f ? 1.0f : f4;
        float f5 = i4;
        this.f6681b = f5 / i5;
        this.f6680a = (int) (f5 / f4);
        this.f6687h = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x030b A[LOOP:5: B:133:0x0309->B:134:0x030b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01da  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.String, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ui a(String str, ArrayList arrayList, vi viVar) {
        ArrayList arrayList2;
        int i4;
        int i5;
        String str2;
        String a3;
        ui a4;
        int size;
        int i6;
        int size2;
        int i7;
        ui uiVar;
        yi a5;
        Integer num;
        float f4;
        if (viVar != null && str != null) {
            viVar.f7770c.put(str);
        }
        ui uiVar2 = 0;
        try {
            yi yiVar = new yi(str);
            if ((yiVar.f7969b ? yiVar.f("Error") : null) != null) {
                arrayList.add(yiVar.f7969b ? yiVar.f("Error") : null);
            }
            ArrayList a6 = yiVar.a("Ad", null, null);
            if (a6.isEmpty() && !arrayList.isEmpty()) {
                a(arrayList, this.f6684e > 0 ? VASTErrorCodes.WrapperNoReponse : VASTErrorCodes.FileNotFound);
                return null;
            }
            int size3 = a6.size();
            int i8 = 0;
            while (i8 < size3) {
                Object obj = a6.get(i8);
                i8++;
                yi yiVar2 = (yi) obj;
                String a7 = yiVar2.a("sequence");
                if (!TextUtils.isEmpty(a7)) {
                    if (Integer.parseInt(a7) >= 2) {
                        continue;
                    }
                }
                yi a8 = yiVar2.a("InLine", uiVar2);
                String str3 = "Linear";
                if (a8 != 0) {
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList a9 = a8.a("Creative", "Creatives", uiVar2, uiVar2);
                    int size4 = a9.size();
                    arrayList2 = a6;
                    int i9 = 0;
                    while (i9 < size4) {
                        Object obj2 = a9.get(i9);
                        int i10 = i9 + 1;
                        yi yiVar3 = (yi) obj2;
                        int i11 = size4;
                        yi a10 = yiVar3.a("Linear", null);
                        if (a10 != null) {
                            arrayList3.add(a10);
                        }
                        size4 = i11;
                        i9 = i10;
                    }
                    int size5 = arrayList3.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size5) {
                            i4 = size3;
                            i5 = i8;
                            str2 = str3;
                            a(arrayList, VASTErrorCodes.FileNotFound);
                            uiVar = null;
                            break;
                        }
                        Object obj3 = arrayList3.get(i12);
                        int i13 = i12 + 1;
                        yi yiVar4 = (yi) obj3;
                        int i14 = size5;
                        i4 = size3;
                        Iterator it = yiVar4.a("MediaFile", "MediaFiles", null, null).iterator();
                        float f5 = Float.NEGATIVE_INFINITY;
                        yi yiVar5 = null;
                        while (true) {
                            Iterator it2 = it;
                            float f6 = f5;
                            if (!it.hasNext()) {
                                break;
                            }
                            ArrayList arrayList4 = arrayList3;
                            yi yiVar6 = (yi) it2.next();
                            int i15 = i8;
                            String a11 = yiVar6.a("type");
                            String b4 = yiVar6.b();
                            String str4 = str3;
                            if (!f6679i.contains(a11) || b4 == null) {
                                it2.remove();
                            } else {
                                Integer b5 = yiVar6.b("width");
                                Integer b6 = yiVar6.b("height");
                                Integer b7 = yiVar6.b("bitrate");
                                if (b7 != null) {
                                    num = b6;
                                } else {
                                    b7 = yiVar6.b("minBitrate");
                                    num = b6;
                                    Integer b8 = yiVar6.b("maxBitrate");
                                    if (b7 != null && b8 != null) {
                                        b7 = Integer.valueOf((b8.intValue() + b7.intValue()) / 2);
                                    } else if (b7 == null) {
                                        b7 = b8;
                                    }
                                }
                                if (b5 != null && b5.intValue() > 0 && num != null && num.intValue() > 0) {
                                    float abs = Math.abs(this.f6681b - (b5.intValue() / num.intValue()));
                                    int i16 = this.f6680a;
                                    float abs2 = abs + Math.abs((i16 - r1) / i16);
                                    int intValue = (b7 == null || b7.intValue() < 0) ? 0 : b7.intValue();
                                    float min = (700 > intValue || intValue > 1500) ? Math.min(Math.abs(700 - intValue) / 700.0f, Math.abs(1500 - intValue) / 1500.0f) : 0.0f;
                                    if (a11 == null) {
                                        a11 = "";
                                    }
                                    int hashCode = a11.hashCode();
                                    if (hashCode == -1664118616) {
                                        a11.equals("video/3gpp");
                                    } else if (hashCode == 1331848029 && a11.equals("video/mp4")) {
                                        f4 = 1.5f;
                                        f5 = (1.0f / ((abs2 + 1.0f) + min)) * f4;
                                        if (f5 > f6) {
                                            i8 = i15;
                                            it = it2;
                                            arrayList3 = arrayList4;
                                            yiVar5 = yiVar6;
                                            str3 = str4;
                                        }
                                    }
                                    f4 = 1.0f;
                                    f5 = (1.0f / ((abs2 + 1.0f) + min)) * f4;
                                    if (f5 > f6) {
                                    }
                                }
                            }
                            i8 = i15;
                            it = it2;
                            f5 = f6;
                            arrayList3 = arrayList4;
                            str3 = str4;
                        }
                        ArrayList arrayList5 = arrayList3;
                        i5 = i8;
                        str2 = str3;
                        if (yiVar5 == null || yiVar5.b() == null) {
                            size5 = i14;
                            i12 = i13;
                            size3 = i4;
                            i8 = i5;
                            arrayList3 = arrayList5;
                            str3 = str2;
                        } else {
                            uiVar = new ui();
                            uiVar.f7713b.addAll(a8.c("Impression"));
                            a(yiVar4, uiVar);
                            yi a12 = yiVar4.a("VideoClicks", null);
                            uiVar.f7728s = (a12 == null || (a5 = a12.a("ClickThrough", null)) == null) ? null : a5.b();
                            uiVar.f7725p = yiVar5.b();
                            uiVar.f7726q = yiVar5.b("width");
                            uiVar.f7727r = yiVar5.b("height");
                            this.f6686g.addAll(a(a8.a()));
                            arrayList.addAll(a8.c("Error"));
                            uiVar.f7712a.addAll(arrayList);
                        }
                    }
                    if (uiVar != null) {
                        uiVar.f7729t.addAll(a(a8));
                        return uiVar;
                    }
                } else {
                    arrayList2 = a6;
                    i4 = size3;
                    i5 = i8;
                    str2 = "Linear";
                }
                yi a13 = yiVar2.a("Wrapper", null);
                if (a13 != null) {
                    ArrayList arrayList6 = new ArrayList(arrayList);
                    arrayList6.addAll(a13.c("Error"));
                    String f7 = a13.f("VASTAdTagURI");
                    if (f7 != null) {
                        try {
                            a3 = a(f7);
                        } catch (SocketTimeoutException unused) {
                            if (!arrayList6.isEmpty()) {
                                a(arrayList6, VASTErrorCodes.WrapperTimeout);
                            }
                        } catch (Exception unused2) {
                            if (!arrayList6.isEmpty()) {
                                a(arrayList6, VASTErrorCodes.WrapperNoReponse);
                            }
                        }
                        if (a3 != null && (a4 = a(a3, arrayList6, viVar)) != null) {
                            a4.f7713b.addAll(a13.c("Impression"));
                            ArrayList arrayList7 = new ArrayList();
                            String str5 = null;
                            ArrayList a14 = a13.a("Creative", "Creatives", null, null);
                            size = a14.size();
                            i6 = 0;
                            while (i6 < size) {
                                Object obj4 = a14.get(i6);
                                i6++;
                                String str6 = str2;
                                yi a15 = ((yi) obj4).a(str6, str5);
                                if (a15 != null) {
                                    arrayList7.add(a15);
                                }
                                str2 = str6;
                                str5 = null;
                            }
                            size2 = arrayList7.size();
                            i7 = 0;
                            while (i7 < size2) {
                                Object obj5 = arrayList7.get(i7);
                                i7++;
                                a((yi) obj5, a4);
                            }
                            if (this.f6686g.isEmpty()) {
                                Iterator it3 = this.f6686g.iterator();
                                while (it3.hasNext()) {
                                    ti tiVar = (ti) it3.next();
                                    ArrayList a16 = a13.a();
                                    int size6 = a16.size();
                                    int i17 = 0;
                                    while (i17 < size6) {
                                        Object obj6 = a16.get(i17);
                                        i17++;
                                        yi yiVar7 = (yi) obj6;
                                        if (TextUtils.isEmpty(yiVar7.f("StaticResource")) && TextUtils.isEmpty(yiVar7.f("IFrameResource")) && TextUtils.isEmpty(yiVar7.f("HTMLResource"))) {
                                            tiVar.f7631e.addAll(yiVar7.c("CompanionClickTracking"));
                                            ArrayList arrayList8 = new ArrayList();
                                            ArrayList d4 = yiVar7.d("creativeView");
                                            int size7 = d4.size();
                                            int i18 = 0;
                                            while (i18 < size7) {
                                                Object obj7 = d4.get(i18);
                                                i18++;
                                                String b9 = ((yi) obj7).b();
                                                if (!TextUtils.isEmpty(b9)) {
                                                    arrayList8.add(b9);
                                                }
                                            }
                                            tiVar.f7632f.addAll(arrayList8);
                                        }
                                    }
                                }
                            } else {
                                this.f6686g.addAll(a(a13.a()));
                            }
                            a4.f7729t.addAll(a(a13));
                            return a4;
                        }
                    }
                    a3 = null;
                    if (a3 != null) {
                        a4.f7713b.addAll(a13.c("Impression"));
                        ArrayList arrayList72 = new ArrayList();
                        String str52 = null;
                        ArrayList a142 = a13.a("Creative", "Creatives", null, null);
                        size = a142.size();
                        i6 = 0;
                        while (i6 < size) {
                        }
                        size2 = arrayList72.size();
                        i7 = 0;
                        while (i7 < size2) {
                        }
                        if (this.f6686g.isEmpty()) {
                        }
                        a4.f7729t.addAll(a(a13));
                        return a4;
                    }
                }
                a6 = arrayList2;
                size3 = i4;
                i8 = i5;
                uiVar2 = 0;
            }
            return uiVar2;
        } catch (Exception unused3) {
            a(arrayList, VASTErrorCodes.XMLParsingError);
            return null;
        }
    }

    public final ui a(String str, vi viVar, String str2, Integer num) {
        VASTErrorCodes vASTErrorCodes;
        List unmodifiableList;
        this.f6686g.clear();
        ui a3 = a(str, new ArrayList(), viVar);
        if (a3 != null) {
            int i4 = str2 != null ? 1 : 0;
            int min = Math.min(this.f6686g.size() + i4, (num == null || num.intValue() <= 0) ? Integer.MAX_VALUE : num.intValue());
            if (min < 1) {
                unmodifiableList = null;
            } else {
                ArrayList arrayList = new ArrayList(min);
                Iterator it = this.f6686g.iterator();
                while (it.hasNext() && arrayList.size() < min - i4) {
                    arrayList.add((ti) it.next());
                }
                if (str2 != null) {
                    arrayList.add(new ti(300, 250, new cj(str2, VASTResource$Type.HTML_RESOURCE, VASTResource$CreativeType.NONE, 300, 250), null, new ArrayList(), new ArrayList()));
                }
                unmodifiableList = Collections.unmodifiableList(arrayList);
            }
            a3.o = unmodifiableList;
            ArrayList arrayList2 = new ArrayList(a3.f7712a);
            VASTErrorCodes vASTErrorCodes2 = VASTErrorCodes.SAProcessSuccess;
            a(arrayList2, vASTErrorCodes2);
            if (viVar != null) {
                viVar.a(vASTErrorCodes2);
                return a3;
            }
        } else if (viVar != null && (vASTErrorCodes = this.f6683d) != null) {
            viVar.a(vASTErrorCodes);
        }
        return a3;
    }

    public final String a(String str) {
        Throwable th;
        HttpURLConnection httpURLConnection;
        int i4 = this.f6684e;
        BufferedInputStream bufferedInputStream = null;
        if (i4 >= this.f6685f) {
            return null;
        }
        this.f6684e = i4 + 1;
        try {
            httpURLConnection = qf.a(str, this.f6687h);
            try {
                BufferedInputStream bufferedInputStream2 = new BufferedInputStream(httpURLConnection.getInputStream());
                try {
                    String next = new Scanner(bufferedInputStream2).useDelimiter("\\A").next();
                    si.a(bufferedInputStream2);
                    httpURLConnection.disconnect();
                    return next;
                } catch (Throwable th2) {
                    th = th2;
                    bufferedInputStream = bufferedInputStream2;
                    si.a(bufferedInputStream);
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                        throw th;
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            httpURLConnection = null;
        }
    }

    public static void a(yi yiVar, ui uiVar) {
        yi a3;
        Integer num;
        yiVar.getClass();
        ArrayList arrayList = new ArrayList();
        ArrayList d4 = yiVar.d("start");
        int i4 = 0;
        int size = d4.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = d4.get(i5);
            i5++;
            String b4 = ((yi) obj).b();
            if (!TextUtils.isEmpty(b4)) {
                arrayList.add(new bj(b4, 0));
            }
        }
        ArrayList d5 = yiVar.d("progress");
        int size2 = d5.size();
        int i6 = 0;
        while (i6 < size2) {
            Object obj2 = d5.get(i6);
            i6++;
            yi yiVar2 = (yi) obj2;
            String a4 = yiVar2.a("offset");
            if (!TextUtils.isEmpty(a4)) {
                String trim = a4.trim();
                if (bj.f6721c.matcher(trim).matches()) {
                    String b5 = yiVar2.b();
                    Integer a5 = bj.a(trim);
                    if (a5 != null && a5.intValue() >= 0 && !TextUtils.isEmpty(b5)) {
                        arrayList.add(new bj(b5, a5));
                    }
                }
            }
        }
        ArrayList d6 = yiVar.d("creativeView");
        int size3 = d6.size();
        int i7 = 0;
        while (i7 < size3) {
            Object obj3 = d6.get(i7);
            i7++;
            String b6 = ((yi) obj3).b();
            if (!TextUtils.isEmpty(b6)) {
                arrayList.add(new bj(b6, 0));
            }
        }
        uiVar.f7714c.addAll(arrayList);
        Collections.sort(uiVar.f7714c);
        ArrayList arrayList2 = new ArrayList();
        ArrayList d7 = yiVar.d("firstQuartile");
        int size4 = d7.size();
        int i8 = 0;
        while (i8 < size4) {
            Object obj4 = d7.get(i8);
            i8++;
            String b7 = ((yi) obj4).b();
            if (!TextUtils.isEmpty(b7)) {
                arrayList2.add(new bj(b7, Float.valueOf(0.25f)));
            }
        }
        ArrayList d8 = yiVar.d("midpoint");
        int size5 = d8.size();
        int i9 = 0;
        while (i9 < size5) {
            Object obj5 = d8.get(i9);
            i9++;
            String b8 = ((yi) obj5).b();
            if (!TextUtils.isEmpty(b8)) {
                arrayList2.add(new bj(b8, Float.valueOf(0.5f)));
            }
        }
        ArrayList d9 = yiVar.d("thirdQuartile");
        int size6 = d9.size();
        int i10 = 0;
        while (i10 < size6) {
            Object obj6 = d9.get(i10);
            i10++;
            String b9 = ((yi) obj6).b();
            if (!TextUtils.isEmpty(b9)) {
                arrayList2.add(new bj(b9, Float.valueOf(0.75f)));
            }
        }
        ArrayList d10 = yiVar.d("progress");
        int size7 = d10.size();
        int i11 = 0;
        while (i11 < size7) {
            Object obj7 = d10.get(i11);
            i11++;
            yi yiVar3 = (yi) obj7;
            String a6 = yiVar3.a("offset");
            if (!TextUtils.isEmpty(a6)) {
                String trim2 = a6.trim();
                if (bj.f6722d.matcher(trim2).matches()) {
                    String b10 = yiVar3.b();
                    try {
                        float parseFloat = Float.parseFloat(trim2.replace("%", "")) / 100.0f;
                        if (parseFloat >= 0.0f && !TextUtils.isEmpty(b10)) {
                            arrayList2.add(new bj(b10, Float.valueOf(parseFloat)));
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
        uiVar.f7715d.addAll(arrayList2);
        Collections.sort(uiVar.f7715d);
        uiVar.f7716e.addAll(yiVar.e("pause"));
        uiVar.f7717f.addAll(yiVar.e("resume"));
        uiVar.f7718g.addAll(yiVar.e("complete"));
        ArrayList e4 = yiVar.e("close");
        e4.addAll(yiVar.e("closeLinear"));
        uiVar.f7719h.addAll(e4);
        uiVar.f7722k.addAll(yiVar.e("skip"));
        ArrayList arrayList3 = new ArrayList();
        wi wiVar = null;
        ArrayList a7 = yiVar.a("ClickTracking", "VideoClicks", null, null);
        int size8 = a7.size();
        int i12 = 0;
        while (i12 < size8) {
            Object obj8 = a7.get(i12);
            i12++;
            String b11 = ((yi) obj8).b();
            if (!TextUtils.isEmpty(b11)) {
                arrayList3.add(b11);
            }
        }
        uiVar.f7723l.addAll(arrayList3);
        uiVar.f7720i.addAll(yiVar.e("mute"));
        uiVar.f7721j.addAll(yiVar.e("unmute"));
        if (uiVar.f7724m == null) {
            String a8 = yiVar.a("skipoffset");
            if (a8 == null || TextUtils.isEmpty(a8.trim()) || !bj.f6721c.matcher(a8).matches() || (num = bj.a(a8)) == null || num.intValue() < 0) {
                num = null;
            }
            uiVar.f7724m = num;
        }
        if (uiVar.n == null) {
            ArrayList a9 = yiVar.a("Icon", "Icons", null, null);
            VASTResource$Type[] values = VASTResource$Type.values();
            int length = values.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    break;
                }
                VASTResource$Type vASTResource$Type = values[i13];
                if (vASTResource$Type != VASTResource$Type.IFRAME_RESOURCE && vASTResource$Type != VASTResource$Type.HTML_RESOURCE) {
                    int size9 = a9.size();
                    int i14 = 0;
                    while (i14 < size9) {
                        Object obj9 = a9.get(i14);
                        i14++;
                        yi yiVar4 = (yi) obj9;
                        Integer b12 = yiVar4.b("assetWidth");
                        if (b12 == null) {
                            b12 = yiVar4.b("width");
                        }
                        Integer b13 = yiVar4.b("assetHeight");
                        if (b13 == null) {
                            b13 = yiVar4.b("height");
                        }
                        if (b12 != null && b12.intValue() > 0 && b12.intValue() <= 300 && b13 != null && b13.intValue() > 0 && b13.intValue() <= 300 && cj.a(yiVar4, vASTResource$Type, b12.intValue(), b13.intValue()) != null) {
                            String a10 = yiVar4.a("offset");
                            if (a10 != null && bj.f6721c.matcher(a10).matches()) {
                                bj.a(a10);
                            }
                            String a11 = yiVar4.a("duration");
                            if (a11 != null && bj.f6721c.matcher(a11).matches()) {
                                bj.a(a11);
                            }
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList a12 = yiVar4.a("IconClickTracking", "IconClicks", null, null);
                            int size10 = a12.size();
                            while (i4 < size10) {
                                Object obj10 = a12.get(i4);
                                i4++;
                                String b14 = ((yi) obj10).b();
                                if (!TextUtils.isEmpty(b14)) {
                                    arrayList4.add(b14);
                                }
                            }
                            yi a13 = yiVar4.a("IconClicks", null);
                            if (a13 != null && (a3 = a13.a("IconClickThrough", null)) != null) {
                                a3.b();
                            }
                            yiVar4.c("IconViewTracking");
                            wiVar = new wi();
                        }
                    }
                }
                i13++;
            }
            uiVar.n = wiVar;
        }
    }

    public final void a(ArrayList arrayList, VASTErrorCodes vASTErrorCodes) {
        this.f6683d = vASTErrorCodes;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        zi ziVar = this.f6682c;
        if (ziVar != null) {
            ziVar.a(arrayList2, vASTErrorCodes);
        }
    }

    public final HashSet a(ArrayList arrayList) {
        VASTResource$Type vASTResource$Type;
        HashSet hashSet = new HashSet();
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            yi yiVar = (yi) obj;
            if (!TextUtils.isEmpty(yiVar.f("StaticResource")) || !TextUtils.isEmpty(yiVar.f("IFrameResource")) || !TextUtils.isEmpty(yiVar.f("HTMLResource"))) {
                if (yiVar.f("StaticResource") != null) {
                    vASTResource$Type = VASTResource$Type.STATIC_RESOURCE;
                } else if (yiVar.f("IFrameResource") != null) {
                    vASTResource$Type = VASTResource$Type.IFRAME_RESOURCE;
                } else {
                    vASTResource$Type = yiVar.f("HTMLResource") != null ? VASTResource$Type.HTML_RESOURCE : null;
                }
                if (vASTResource$Type != null) {
                    Integer b4 = yiVar.b("assetWidth");
                    if (b4 == null) {
                        b4 = yiVar.b("width");
                    }
                    Integer b5 = yiVar.b("assetHeight");
                    if (b5 == null) {
                        b5 = yiVar.b("height");
                    }
                    if (vASTResource$Type != VASTResource$Type.STATIC_RESOURCE) {
                        if (b4 == null) {
                            b4 = 300;
                        }
                        if (b5 == null) {
                            b5 = 250;
                        }
                    } else {
                        if (b4 == null) {
                            b4 = 1;
                        }
                        if (b5 == null) {
                            b5 = 1;
                        }
                    }
                    int intValue = b4.intValue();
                    int intValue2 = b5.intValue();
                    Point point = new Point(intValue, intValue2);
                    int i5 = this.f6680a;
                    float f4 = i5;
                    int i6 = (int) (f4 / this.f6681b);
                    if (intValue > i5 || intValue2 > i6) {
                        if (vASTResource$Type == VASTResource$Type.HTML_RESOURCE) {
                            point.x = Math.min(i5, intValue);
                            point.y = Math.min(i6, intValue2);
                        } else {
                            float f5 = intValue;
                            float f6 = f5 / f4;
                            float f7 = intValue2;
                            float f8 = f7 / i6;
                            if (f6 > f8) {
                                point.x = i5;
                                point.y = (int) (f7 / f6);
                            } else {
                                point.x = (int) (f5 / f8);
                                point.y = i6;
                            }
                        }
                    }
                    int i7 = point.x;
                    if (i7 >= 300 || point.y >= 250) {
                        cj a3 = cj.a(yiVar, vASTResource$Type, i7, point.y);
                        if (a3 != null) {
                            int i8 = point.x;
                            int i9 = point.y;
                            String f9 = yiVar.f("CompanionClickThrough");
                            ArrayList c4 = yiVar.c("CompanionClickTracking");
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList d4 = yiVar.d("creativeView");
                            int size2 = d4.size();
                            int i10 = 0;
                            while (i10 < size2) {
                                Object obj2 = d4.get(i10);
                                i10++;
                                String b6 = ((yi) obj2).b();
                                if (!TextUtils.isEmpty(b6)) {
                                    arrayList2.add(b6);
                                }
                            }
                            hashSet.add(new ti(i8, i9, a3, f9, c4, arrayList2));
                        }
                    }
                }
            }
        }
        return hashSet;
    }

    public static ArrayList a(yi yiVar) {
        String f4;
        String f5;
        ArrayList a3 = yiVar.a("Verification", "AdVerifications", null, null);
        ArrayList a4 = yiVar.a("Extension", "Extensions", "type", Collections.singletonList("AdVerifications"));
        int size = a4.size();
        int i4 = 0;
        int i5 = 0;
        while (i5 < size) {
            Object obj = a4.get(i5);
            i5++;
            a3.addAll(((yi) obj).a("Verification", "AdVerifications", null, null));
        }
        ArrayList arrayList = new ArrayList();
        int size2 = a3.size();
        while (i4 < size2) {
            Object obj2 = a3.get(i4);
            i4++;
            yi yiVar2 = (yi) obj2;
            String a5 = yiVar2.a("vendor");
            if (a5 != null && (f4 = yiVar2.f("JavaScriptResource")) != null && (f5 = yiVar2.f("VerificationParameters")) != null) {
                yi a6 = yiVar2.a("JavaScriptResource", "apiFramework");
                String a7 = a6 == null ? null : a6.a("apiFramework");
                if (a7 != null && a7.equalsIgnoreCase("omid")) {
                    arrayList.add(new VerificationDetails(a5, f4, f5));
                }
            }
        }
        return arrayList;
    }
}
