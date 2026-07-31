package com.startapp.sdk.internal;

import android.content.Context;
import android.graphics.Point;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.facebook.react.uimanager.ViewProps;
import com.onesignal.inAppMessages.internal.display.impl.WebViewManager;
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

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class hi {
    public static final List i = Arrays.asList("video/mp4", "video/3gpp");

    /* renamed from: a, reason: collision with root package name */
    public final int f267a;
    public final float b;
    public gi c;
    public VASTErrorCodes d;
    public int e;
    public int f = 10;
    public final HashSet g = new HashSet();
    public final String h;

    public hi(Context context, String str) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i2 = displayMetrics.widthPixels;
        int i3 = displayMetrics.heightPixels;
        float f = displayMetrics.density;
        f = f <= 0.0f ? 1.0f : f;
        float f2 = i2;
        this.b = f2 / i3;
        this.f267a = (int) (f2 / f);
        this.h = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02b1 A[LOOP:3: B:111:0x02af->B:112:0x02b1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ae  */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.String, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final bi a(String str, ArrayList arrayList, ci ciVar) {
        ArrayList arrayList2;
        int i2;
        int i3;
        String a2;
        bi a3;
        int size;
        int i4;
        boolean isEmpty;
        bi biVar;
        fi a4;
        Integer num;
        float f;
        if (ciVar != null && str != null) {
            ciVar.c.put(str);
        }
        String str2 = null;
        try {
            fi fiVar = new fi(str);
            if ((fiVar.b ? fiVar.f("Error") : null) != null) {
                arrayList.add(fiVar.b ? fiVar.f("Error") : null);
            }
            ArrayList a5 = fiVar.a("Ad", null, null);
            if (a5.isEmpty() && !arrayList.isEmpty()) {
                a(arrayList, this.e > 0 ? VASTErrorCodes.WrapperNoReponse : VASTErrorCodes.FileNotFound);
                return null;
            }
            int size2 = a5.size();
            int i5 = 0;
            while (i5 < size2) {
                Object obj = a5.get(i5);
                int i6 = i5 + 1;
                fi fiVar2 = (fi) obj;
                String a6 = fiVar2.a("sequence");
                char c = 2;
                if (!TextUtils.isEmpty(a6)) {
                    if (Integer.parseInt(a6) >= 2) {
                        arrayList2 = a5;
                        i2 = size2;
                        i3 = i6;
                        a5 = arrayList2;
                        size2 = i2;
                        i5 = i3;
                        str2 = null;
                    }
                }
                fi a7 = fiVar2.a("InLine", str2);
                if (a7 != null) {
                    ArrayList b = a7.b();
                    int size3 = b.size();
                    int i7 = 0;
                    ?? r4 = str2;
                    while (true) {
                        if (i7 >= size3) {
                            arrayList2 = a5;
                            i2 = size2;
                            i3 = i6;
                            a(arrayList, VASTErrorCodes.FileNotFound);
                            biVar = null;
                            break;
                        }
                        Object obj2 = b.get(i7);
                        i7++;
                        fi fiVar3 = (fi) obj2;
                        char c2 = c;
                        arrayList2 = a5;
                        Iterator it = fiVar3.a("MediaFile", "MediaFiles", r4, r4).iterator();
                        float f2 = Float.NEGATIVE_INFINITY;
                        fi fiVar4 = r4;
                        while (true) {
                            Iterator it2 = it;
                            i2 = size2;
                            if (!it.hasNext()) {
                                break;
                            }
                            int i8 = i6;
                            fi fiVar5 = (fi) it2.next();
                            float f3 = f2;
                            String a8 = fiVar5.a(WebViewManager.EVENT_TYPE_KEY);
                            String c3 = fiVar5.c();
                            ArrayList arrayList3 = b;
                            if (!i.contains(a8) || c3 == null) {
                                it2.remove();
                            } else {
                                Integer b2 = fiVar5.b(ViewProps.WIDTH);
                                Integer b3 = fiVar5.b(ViewProps.HEIGHT);
                                Integer b4 = fiVar5.b("bitrate");
                                if (b4 != null) {
                                    num = b3;
                                } else {
                                    b4 = fiVar5.b("minBitrate");
                                    num = b3;
                                    Integer b5 = fiVar5.b("maxBitrate");
                                    if (b4 != null && b5 != null) {
                                        b4 = Integer.valueOf((b5.intValue() + b4.intValue()) / 2);
                                    } else if (b4 == null) {
                                        b4 = b5;
                                    }
                                }
                                if (b2 != null && b2.intValue() > 0 && num != null && num.intValue() > 0) {
                                    float abs = Math.abs(this.b - (b2.intValue() / num.intValue()));
                                    int i9 = this.f267a;
                                    float abs2 = abs + Math.abs((i9 - r1) / i9);
                                    int intValue = (b4 == null || b4.intValue() < 0) ? 0 : b4.intValue();
                                    float min = (700 > intValue || intValue > 1500) ? Math.min(Math.abs(700 - intValue) / 700.0f, Math.abs(1500 - intValue) / 1500.0f) : 0.0f;
                                    if (a8 == null) {
                                        a8 = "";
                                    }
                                    int hashCode = a8.hashCode();
                                    if (hashCode == -1664118616) {
                                        a8.equals("video/3gpp");
                                    } else if (hashCode == 1331848029 && a8.equals("video/mp4")) {
                                        f = 1.5f;
                                        f2 = (1.0f / ((abs2 + 1.0f) + min)) * f;
                                        if (f2 > f3) {
                                            it = it2;
                                            size2 = i2;
                                            i6 = i8;
                                            fiVar4 = fiVar5;
                                            b = arrayList3;
                                            fiVar4 = fiVar4;
                                        }
                                    }
                                    f = 1.0f;
                                    f2 = (1.0f / ((abs2 + 1.0f) + min)) * f;
                                    if (f2 > f3) {
                                    }
                                }
                            }
                            f2 = f3;
                            it = it2;
                            size2 = i2;
                            i6 = i8;
                            b = arrayList3;
                            fiVar4 = fiVar4;
                        }
                        i3 = i6;
                        ArrayList arrayList4 = b;
                        if (fiVar4 == null || fiVar4.c() == null) {
                            c = c2;
                            a5 = arrayList2;
                            size2 = i2;
                            i6 = i3;
                            b = arrayList4;
                            r4 = 0;
                        } else {
                            biVar = new bi();
                            biVar.b.addAll(a7.c("Impression"));
                            a(fiVar3, biVar);
                            fi a9 = fiVar3.a("VideoClicks", null);
                            biVar.s = (a9 == null || (a4 = a9.a("ClickThrough", null)) == null) ? null : a4.c();
                            biVar.p = fiVar4.c();
                            biVar.q = fiVar4.b(ViewProps.WIDTH);
                            biVar.r = fiVar4.b(ViewProps.HEIGHT);
                            this.g.addAll(a(a7.a()));
                            arrayList.addAll(a7.c("Error"));
                            biVar.f188a.addAll(arrayList);
                        }
                    }
                    if (biVar != null) {
                        biVar.t.addAll(a(a7));
                        return biVar;
                    }
                } else {
                    arrayList2 = a5;
                    i2 = size2;
                    i3 = i6;
                }
                fi a10 = fiVar2.a("Wrapper", null);
                if (a10 != null) {
                    ArrayList arrayList5 = new ArrayList(arrayList);
                    arrayList5.addAll(a10.c("Error"));
                    String f4 = a10.f("VASTAdTagURI");
                    if (f4 != null) {
                        try {
                            a2 = a(f4);
                        } catch (SocketTimeoutException unused) {
                            if (!arrayList5.isEmpty()) {
                                a(arrayList5, VASTErrorCodes.WrapperTimeout);
                            }
                        } catch (Exception unused2) {
                            if (!arrayList5.isEmpty()) {
                                a(arrayList5, VASTErrorCodes.WrapperNoReponse);
                            }
                        }
                        if (a2 != null && (a3 = a(a2, arrayList5, ciVar)) != null) {
                            a3.b.addAll(a10.c("Impression"));
                            ArrayList b6 = a10.b();
                            size = b6.size();
                            i4 = 0;
                            while (i4 < size) {
                                Object obj3 = b6.get(i4);
                                i4++;
                                a((fi) obj3, a3);
                            }
                            isEmpty = this.g.isEmpty();
                            HashSet hashSet = this.g;
                            if (isEmpty) {
                                Iterator it3 = hashSet.iterator();
                                while (it3.hasNext()) {
                                    ai aiVar = (ai) it3.next();
                                    ArrayList a11 = a10.a();
                                    int size4 = a11.size();
                                    int i10 = 0;
                                    while (i10 < size4) {
                                        Object obj4 = a11.get(i10);
                                        i10++;
                                        fi fiVar6 = (fi) obj4;
                                        if (TextUtils.isEmpty(fiVar6.f("StaticResource")) && TextUtils.isEmpty(fiVar6.f("IFrameResource")) && TextUtils.isEmpty(fiVar6.f("HTMLResource"))) {
                                            aiVar.e.addAll(fiVar6.c("CompanionClickTracking"));
                                            ArrayList arrayList6 = new ArrayList();
                                            ArrayList d = fiVar6.d("creativeView");
                                            int size5 = d.size();
                                            int i11 = 0;
                                            while (i11 < size5) {
                                                Object obj5 = d.get(i11);
                                                i11++;
                                                String c4 = ((fi) obj5).c();
                                                if (!TextUtils.isEmpty(c4)) {
                                                    arrayList6.add(c4);
                                                }
                                            }
                                            aiVar.f.addAll(arrayList6);
                                        }
                                    }
                                }
                            } else {
                                hashSet.addAll(a(a10.a()));
                            }
                            a3.t.addAll(a(a10));
                            return a3;
                        }
                    }
                    a2 = null;
                    if (a2 != null) {
                        a3.b.addAll(a10.c("Impression"));
                        ArrayList b62 = a10.b();
                        size = b62.size();
                        i4 = 0;
                        while (i4 < size) {
                        }
                        isEmpty = this.g.isEmpty();
                        HashSet hashSet2 = this.g;
                        if (isEmpty) {
                        }
                        a3.t.addAll(a(a10));
                        return a3;
                    }
                    continue;
                } else {
                    continue;
                }
                a5 = arrayList2;
                size2 = i2;
                i5 = i3;
                str2 = null;
            }
            return str2;
        } catch (Exception unused3) {
            a(arrayList, VASTErrorCodes.XMLParsingError);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final bi a(String str, ci ciVar, String str2, Integer num) {
        VASTErrorCodes vASTErrorCodes;
        List unmodifiableList;
        this.g.clear();
        bi a2 = a(str, new ArrayList(), ciVar);
        if (a2 != null) {
            if (num == null || num.intValue() >= 1) {
                int i2 = str2 != null ? 1 : 0;
                int min = Math.min(this.g.size() + i2, (num == null || num.intValue() <= 0) ? Integer.MAX_VALUE : num.intValue());
                if (min >= 1) {
                    ArrayList arrayList = new ArrayList(min);
                    Iterator it = this.g.iterator();
                    while (it.hasNext() && arrayList.size() < min - i2) {
                        arrayList.add((ai) it.next());
                    }
                    if (str2 != null) {
                        arrayList.add(new ai(300, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, new ji(str2, VASTResource$Type.HTML_RESOURCE, VASTResource$CreativeType.NONE, 300, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION), null, new ArrayList(), new ArrayList()));
                    }
                    unmodifiableList = Collections.unmodifiableList(arrayList);
                    a2.o = unmodifiableList;
                    ArrayList arrayList2 = new ArrayList(a2.f188a);
                    VASTErrorCodes vASTErrorCodes2 = VASTErrorCodes.SAProcessSuccess;
                    a(arrayList2, vASTErrorCodes2);
                    if (ciVar != null) {
                        ciVar.a(vASTErrorCodes2);
                        return a2;
                    }
                }
            }
            unmodifiableList = null;
            a2.o = unmodifiableList;
            ArrayList arrayList22 = new ArrayList(a2.f188a);
            VASTErrorCodes vASTErrorCodes22 = VASTErrorCodes.SAProcessSuccess;
            a(arrayList22, vASTErrorCodes22);
            if (ciVar != null) {
            }
        } else if (ciVar != null && (vASTErrorCodes = this.d) != null) {
            ciVar.a(vASTErrorCodes);
        }
        return a2;
    }

    public final String a(String str) {
        Throwable th;
        HttpURLConnection httpURLConnection;
        int i2 = this.e;
        BufferedInputStream bufferedInputStream = null;
        if (i2 >= this.f) {
            return null;
        }
        this.e = i2 + 1;
        try {
            httpURLConnection = ye.a(str, this.h);
            try {
                BufferedInputStream bufferedInputStream2 = new BufferedInputStream(httpURLConnection.getInputStream());
                try {
                    String next = new Scanner(bufferedInputStream2).useDelimiter("\\A").next();
                    zh.a(bufferedInputStream2);
                    httpURLConnection.disconnect();
                    return next;
                } catch (Throwable th2) {
                    th = th2;
                    bufferedInputStream = bufferedInputStream2;
                    zh.a(bufferedInputStream);
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

    public static void a(fi fiVar, bi biVar) {
        fi a2;
        Integer num;
        fiVar.getClass();
        ArrayList arrayList = new ArrayList();
        ArrayList d = fiVar.d(ViewProps.START);
        int size = d.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = d.get(i3);
            i3++;
            String c = ((fi) obj).c();
            if (!TextUtils.isEmpty(c)) {
                arrayList.add(new ii(c, 0));
            }
        }
        ArrayList d2 = fiVar.d("progress");
        int size2 = d2.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = d2.get(i4);
            i4++;
            fi fiVar2 = (fi) obj2;
            String a3 = fiVar2.a(TypedValues.Cycle.S_WAVE_OFFSET);
            if (!TextUtils.isEmpty(a3)) {
                String trim = a3.trim();
                if (ii.c.matcher(trim).matches()) {
                    String c2 = fiVar2.c();
                    Integer a4 = ii.a(trim);
                    if (a4 != null && a4.intValue() >= 0 && !TextUtils.isEmpty(c2)) {
                        arrayList.add(new ii(c2, a4));
                    }
                }
            }
        }
        ArrayList d3 = fiVar.d("creativeView");
        int size3 = d3.size();
        int i5 = 0;
        while (i5 < size3) {
            Object obj3 = d3.get(i5);
            i5++;
            String c3 = ((fi) obj3).c();
            if (!TextUtils.isEmpty(c3)) {
                arrayList.add(new ii(c3, 0));
            }
        }
        biVar.c.addAll(arrayList);
        Collections.sort(biVar.c);
        ArrayList arrayList2 = new ArrayList();
        ArrayList d4 = fiVar.d("firstQuartile");
        int size4 = d4.size();
        int i6 = 0;
        while (i6 < size4) {
            Object obj4 = d4.get(i6);
            i6++;
            String c4 = ((fi) obj4).c();
            if (!TextUtils.isEmpty(c4)) {
                arrayList2.add(new ii(c4, Float.valueOf(0.25f)));
            }
        }
        ArrayList d5 = fiVar.d("midpoint");
        int size5 = d5.size();
        int i7 = 0;
        while (i7 < size5) {
            Object obj5 = d5.get(i7);
            i7++;
            String c5 = ((fi) obj5).c();
            if (!TextUtils.isEmpty(c5)) {
                arrayList2.add(new ii(c5, Float.valueOf(0.5f)));
            }
        }
        ArrayList d6 = fiVar.d("thirdQuartile");
        int size6 = d6.size();
        int i8 = 0;
        while (i8 < size6) {
            Object obj6 = d6.get(i8);
            i8++;
            String c6 = ((fi) obj6).c();
            if (!TextUtils.isEmpty(c6)) {
                arrayList2.add(new ii(c6, Float.valueOf(0.75f)));
            }
        }
        ArrayList d7 = fiVar.d("progress");
        int size7 = d7.size();
        int i9 = 0;
        while (i9 < size7) {
            Object obj7 = d7.get(i9);
            i9++;
            fi fiVar3 = (fi) obj7;
            String a5 = fiVar3.a(TypedValues.Cycle.S_WAVE_OFFSET);
            if (!TextUtils.isEmpty(a5)) {
                String trim2 = a5.trim();
                if (ii.d.matcher(trim2).matches()) {
                    String c7 = fiVar3.c();
                    try {
                        float parseFloat = Float.parseFloat(trim2.replace("%", "")) / 100.0f;
                        if (parseFloat >= 0.0f && !TextUtils.isEmpty(c7)) {
                            arrayList2.add(new ii(c7, Float.valueOf(parseFloat)));
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
        biVar.d.addAll(arrayList2);
        Collections.sort(biVar.d);
        biVar.e.addAll(fiVar.e("pause"));
        biVar.f.addAll(fiVar.e("resume"));
        biVar.g.addAll(fiVar.e("complete"));
        ArrayList e = fiVar.e("close");
        e.addAll(fiVar.e("closeLinear"));
        biVar.h.addAll(e);
        biVar.k.addAll(fiVar.e("skip"));
        ArrayList arrayList3 = new ArrayList();
        di diVar = null;
        ArrayList a6 = fiVar.a("ClickTracking", "VideoClicks", null, null);
        int size8 = a6.size();
        int i10 = 0;
        while (i10 < size8) {
            Object obj8 = a6.get(i10);
            i10++;
            String c8 = ((fi) obj8).c();
            if (!TextUtils.isEmpty(c8)) {
                arrayList3.add(c8);
            }
        }
        biVar.l.addAll(arrayList3);
        biVar.i.addAll(fiVar.e("mute"));
        biVar.j.addAll(fiVar.e("unmute"));
        if (biVar.m == null) {
            String a7 = fiVar.a("skipoffset");
            if (a7 == null || TextUtils.isEmpty(a7.trim()) || !ii.c.matcher(a7).matches() || (num = ii.a(a7)) == null || num.intValue() < 0) {
                num = null;
            }
            biVar.m = num;
        }
        if (biVar.n == null) {
            ArrayList a8 = fiVar.a("Icon", "Icons", null, null);
            VASTResource$Type[] values = VASTResource$Type.values();
            int length = values.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                }
                VASTResource$Type vASTResource$Type = values[i11];
                if (vASTResource$Type != VASTResource$Type.IFRAME_RESOURCE && vASTResource$Type != VASTResource$Type.HTML_RESOURCE) {
                    int size9 = a8.size();
                    int i12 = 0;
                    while (i12 < size9) {
                        Object obj9 = a8.get(i12);
                        i12++;
                        fi fiVar4 = (fi) obj9;
                        Integer b = fiVar4.b("assetWidth");
                        if (b == null) {
                            b = fiVar4.b(ViewProps.WIDTH);
                        }
                        Integer b2 = fiVar4.b("assetHeight");
                        if (b2 == null) {
                            b2 = fiVar4.b(ViewProps.HEIGHT);
                        }
                        if (b != null && b.intValue() > 0 && b.intValue() <= 300 && b2 != null && b2.intValue() > 0 && b2.intValue() <= 300 && ji.a(fiVar4, vASTResource$Type, b.intValue(), b2.intValue()) != null) {
                            String a9 = fiVar4.a(TypedValues.Cycle.S_WAVE_OFFSET);
                            if (a9 != null && ii.c.matcher(a9).matches()) {
                                ii.a(a9);
                            }
                            String a10 = fiVar4.a("duration");
                            if (a10 != null && ii.c.matcher(a10).matches()) {
                                ii.a(a10);
                            }
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList a11 = fiVar4.a("IconClickTracking", "IconClicks", null, null);
                            int size10 = a11.size();
                            while (i2 < size10) {
                                Object obj10 = a11.get(i2);
                                i2++;
                                String c9 = ((fi) obj10).c();
                                if (!TextUtils.isEmpty(c9)) {
                                    arrayList4.add(c9);
                                }
                            }
                            fi a12 = fiVar4.a("IconClicks", null);
                            if (a12 != null && (a2 = a12.a("IconClickThrough", null)) != null) {
                                a2.c();
                            }
                            fiVar4.c("IconViewTracking");
                            diVar = new di();
                        }
                    }
                }
                i11++;
            }
            biVar.n = diVar;
        }
    }

    public final void a(ArrayList arrayList, VASTErrorCodes vASTErrorCodes) {
        this.d = vASTErrorCodes;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        gi giVar = this.c;
        if (giVar != null) {
            giVar.a(arrayList2, vASTErrorCodes);
        }
    }

    public final HashSet a(ArrayList arrayList) {
        VASTResource$Type vASTResource$Type;
        HashSet hashSet = new HashSet();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            fi fiVar = (fi) obj;
            if (!TextUtils.isEmpty(fiVar.f("StaticResource")) || !TextUtils.isEmpty(fiVar.f("IFrameResource")) || !TextUtils.isEmpty(fiVar.f("HTMLResource"))) {
                if (fiVar.f("StaticResource") != null) {
                    vASTResource$Type = VASTResource$Type.STATIC_RESOURCE;
                } else if (fiVar.f("IFrameResource") != null) {
                    vASTResource$Type = VASTResource$Type.IFRAME_RESOURCE;
                } else {
                    vASTResource$Type = fiVar.f("HTMLResource") != null ? VASTResource$Type.HTML_RESOURCE : null;
                }
                if (vASTResource$Type != null) {
                    Integer b = fiVar.b("assetWidth");
                    if (b == null) {
                        b = fiVar.b(ViewProps.WIDTH);
                    }
                    Integer b2 = fiVar.b("assetHeight");
                    if (b2 == null) {
                        b2 = fiVar.b(ViewProps.HEIGHT);
                    }
                    if (vASTResource$Type != VASTResource$Type.STATIC_RESOURCE) {
                        if (b == null) {
                            b = 300;
                        }
                        if (b2 == null) {
                            b2 = Integer.valueOf(ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);
                        }
                    } else {
                        if (b == null) {
                            b = 1;
                        }
                        if (b2 == null) {
                            b2 = 1;
                        }
                    }
                    int intValue = b.intValue();
                    int intValue2 = b2.intValue();
                    Point point = new Point(intValue, intValue2);
                    int i3 = this.f267a;
                    float f = i3;
                    int i4 = (int) (f / this.b);
                    if (intValue > i3 || intValue2 > i4) {
                        if (vASTResource$Type == VASTResource$Type.HTML_RESOURCE) {
                            point.x = Math.min(i3, intValue);
                            point.y = Math.min(i4, intValue2);
                        } else {
                            float f2 = intValue;
                            float f3 = f2 / f;
                            float f4 = intValue2;
                            float f5 = f4 / i4;
                            if (f3 > f5) {
                                point.x = i3;
                                point.y = (int) (f4 / f3);
                            } else {
                                point.x = (int) (f2 / f5);
                                point.y = i4;
                            }
                        }
                    }
                    int i5 = point.x;
                    if (i5 >= 300 || point.y >= 250) {
                        ji a2 = ji.a(fiVar, vASTResource$Type, i5, point.y);
                        if (a2 != null) {
                            int i6 = point.x;
                            int i7 = point.y;
                            String f6 = fiVar.f("CompanionClickThrough");
                            ArrayList c = fiVar.c("CompanionClickTracking");
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList d = fiVar.d("creativeView");
                            int size2 = d.size();
                            int i8 = 0;
                            while (i8 < size2) {
                                Object obj2 = d.get(i8);
                                i8++;
                                String c2 = ((fi) obj2).c();
                                if (!TextUtils.isEmpty(c2)) {
                                    arrayList2.add(c2);
                                }
                            }
                            hashSet.add(new ai(i6, i7, a2, f6, c, arrayList2));
                        }
                    }
                }
            }
        }
        return hashSet;
    }

    public static ArrayList a(fi fiVar) {
        String f;
        String f2;
        ArrayList a2 = fiVar.a("Verification", "AdVerifications", null, null);
        ArrayList a3 = fiVar.a("Extension", "Extensions", WebViewManager.EVENT_TYPE_KEY, Collections.singletonList("AdVerifications"));
        int size = a3.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = a3.get(i3);
            i3++;
            a2.addAll(((fi) obj).a("Verification", "AdVerifications", null, null));
        }
        ArrayList arrayList = new ArrayList();
        int size2 = a2.size();
        while (i2 < size2) {
            Object obj2 = a2.get(i2);
            i2++;
            fi fiVar2 = (fi) obj2;
            String a4 = fiVar2.a("vendor");
            if (a4 != null && (f = fiVar2.f("JavaScriptResource")) != null && (f2 = fiVar2.f("VerificationParameters")) != null) {
                fi a5 = fiVar2.a("JavaScriptResource", "apiFramework");
                String a6 = a5 == null ? null : a5.a("apiFramework");
                if (a6 != null && a6.equalsIgnoreCase("omid")) {
                    arrayList.add(new VerificationDetails(a4, f, f2));
                }
            }
        }
        return arrayList;
    }
}
