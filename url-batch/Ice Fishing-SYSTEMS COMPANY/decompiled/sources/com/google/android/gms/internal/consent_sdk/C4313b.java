package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.JsonWriter;
import android.util.Pair;
import android.webkit.WebSettings;
import com.anythink.basead.webtemplet.a.b;
import com.anythink.core.api.ATAdConst;
import com.google.android.gms.internal.ads.AbstractC2655Lg;
import com.google.android.gms.internal.ads.AbstractC2720Pd;
import com.google.android.gms.internal.ads.AbstractC3194fG;
import com.google.android.gms.internal.ads.AbstractC3548lu;
import com.google.android.gms.internal.ads.As;
import com.google.android.gms.internal.ads.BP;
import com.google.android.gms.internal.ads.C2478Aq;
import com.google.android.gms.internal.ads.C2777Sj;
import com.google.android.gms.internal.ads.C2906a1;
import com.google.android.gms.internal.ads.C2985bP;
import com.google.android.gms.internal.ads.C3093dO;
import com.google.android.gms.internal.ads.C3094dP;
import com.google.android.gms.internal.ads.C3148eP;
import com.google.android.gms.internal.ads.C3203fP;
import com.google.android.gms.internal.ads.C3258gP;
import com.google.android.gms.internal.ads.C3312hP;
import com.google.android.gms.internal.ads.C3332hs;
import com.google.android.gms.internal.ads.C3366iP;
import com.google.android.gms.internal.ads.C3474ka;
import com.google.android.gms.internal.ads.C3582ma;
import com.google.android.gms.internal.ads.C3597mp;
import com.google.android.gms.internal.ads.C3675oC;
import com.google.android.gms.internal.ads.C4086vt;
import com.google.android.gms.internal.ads.C4119wP;
import com.google.android.gms.internal.ads.C4139ws;
import com.google.android.gms.internal.ads.C4164xG;
import com.google.android.gms.internal.ads.C4236yh;
import com.google.android.gms.internal.ads.C4287ze;
import com.google.android.gms.internal.ads.Es;
import com.google.android.gms.internal.ads.K4;
import com.google.android.gms.internal.ads.L7;
import com.google.android.gms.internal.ads.Ms;
import com.google.android.gms.internal.ads.PA;
import com.google.android.gms.internal.ads.RunnableC3873rw;
import com.google.android.gms.internal.ads.TP;
import com.google.android.gms.internal.ads.VN;
import com.google.android.gms.internal.ads.XO;
import com.google.android.gms.internal.ads.YO;
import com.google.android.gms.internal.ads.ZO;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.math.RoundingMode;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.consent_sdk.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4313b {

    /* renamed from: j, reason: collision with root package name */
    public static C4313b f35810j;

    /* renamed from: a, reason: collision with root package name */
    public Object f35811a;

    /* renamed from: b, reason: collision with root package name */
    public Object f35812b;

    /* renamed from: c, reason: collision with root package name */
    public Object f35813c;

    /* renamed from: d, reason: collision with root package name */
    public Object f35814d;

    /* renamed from: e, reason: collision with root package name */
    public Object f35815e;

    /* renamed from: f, reason: collision with root package name */
    public Object f35816f;

    /* renamed from: g, reason: collision with root package name */
    public Object f35817g;

    /* renamed from: h, reason: collision with root package name */
    public Object f35818h;
    public Object i;

    public C4313b(Application application) {
        this.f35811a = this;
        C4399w2 c4399w2 = new C4399w2(8, application);
        this.f35812b = c4399w2;
        Z2 a9 = Z2.a(new C4325e(c4399w2, 1));
        this.f35813c = a9;
        Z2 a10 = Z2.a(AbstractC4404y.f35958b);
        this.f35814d = a10;
        Z2 a11 = Z2.a(new C4399w2(4, new C4399w2(this)));
        this.f35815e = a11;
        E1 e12 = new E1(c4399w2, a9, 1);
        Z2 a12 = Z2.a(new J1(24));
        this.f35816f = a12;
        C4329f c4329f = new C4329f(c4399w2, a9, Z2.a(new E1(c4399w2, Z2.a(new C4325e(c4399w2, 0)), 0)));
        this.i = c4329f;
        Z2 a13 = Z2.a(new C4329f(a10, c4399w2, Z2.a(new C4325e(c4399w2, 3))));
        this.f35817g = a13;
        this.f35818h = Z2.a(new f4.p(a9, new C4236yh(c4399w2, a10, a9, a11, e12, new f4.p(a12, c4329f, a9, a13, 3), a12, a13), a11, a13, 4));
    }

    public static C4313b b(Context context) {
        C4313b c4313b;
        synchronized (C4313b.class) {
            try {
                if (f35810j == null) {
                    Application application = (Application) context.getApplicationContext();
                    application.getClass();
                    f35810j = new C4313b(application);
                }
                c4313b = f35810j;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4313b;
    }

    public C3258gP a(C3148eP c3148eP) {
        C2985bP c2985bP;
        int i;
        boolean booleanValue;
        int i4;
        boolean isOffloadedPlaybackSupported;
        int playbackOffloadSupport;
        int directPlaybackSupport;
        h(c3148eP);
        C4164xG c4164xG = (C4164xG) this.i;
        c4164xG.getClass();
        TP tp = (TP) c3148eP.f30348a;
        tp.getClass();
        C2777Sj c2777Sj = (C2777Sj) c3148eP.f30349b;
        c2777Sj.getClass();
        int i9 = Build.VERSION.SDK_INT;
        int i10 = 0;
        String str = tp.f27776o;
        if (i9 < 29 || (i = tp.f27756I) == -1) {
            c2985bP = C2985bP.f29486d;
        } else {
            Boolean bool = (Boolean) c4164xG.f35133v;
            if (bool != null) {
                booleanValue = bool.booleanValue();
            } else {
                Context context = (Context) c4164xG.f35132u;
                if (context != null) {
                    String parameters = AbstractC2655Lg.b(context).getParameters("offloadVariableRateSupported");
                    c4164xG.f35133v = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
                } else {
                    c4164xG.f35133v = Boolean.FALSE;
                }
                booleanValue = ((Boolean) c4164xG.f35133v).booleanValue();
            }
            str.getClass();
            int g9 = K4.g(str, tp.f27772k);
            if (g9 != 0) {
                switch (g9) {
                    case 2:
                    case 3:
                        i4 = 3;
                        break;
                    case 4:
                    case 5:
                    case 6:
                        i4 = 21;
                        break;
                    case 7:
                    case 8:
                        i4 = 23;
                        break;
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                        i4 = 28;
                        break;
                    case 13:
                    case 19:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    default:
                        i4 = Integer.MAX_VALUE;
                        break;
                    case 14:
                        i4 = 25;
                        break;
                    case 20:
                        i4 = 30;
                        break;
                    case 21:
                    case 22:
                        i4 = 31;
                        break;
                    case 30:
                    case 31:
                        i4 = 34;
                        break;
                }
                if (i9 >= i4) {
                    int i11 = tp.f27755H;
                    if (i11 == -1) {
                        i11 = AbstractC3548lu.e(tp.f27754G);
                    }
                    if (i11 != 0) {
                        try {
                            AudioFormat build = new AudioFormat.Builder().setSampleRate(i).setChannelMask(i11).setEncoding(g9).build();
                            if (i9 >= 33) {
                                directPlaybackSupport = AudioManager.getDirectPlaybackSupport(build, c2777Sj.a());
                                if ((directPlaybackSupport & 1) == 0) {
                                    c2985bP = C2985bP.f29486d;
                                } else {
                                    boolean z8 = (directPlaybackSupport & 3) == 3;
                                    com.google.android.gms.internal.ads.G2 g22 = new com.google.android.gms.internal.ads.G2();
                                    g22.f25091a = true;
                                    g22.f25092b = z8;
                                    g22.f25093c = booleanValue;
                                    c2985bP = g22.b();
                                }
                            } else if (i9 >= 31) {
                                playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(build, c2777Sj.a());
                                if (playbackOffloadSupport == 0) {
                                    c2985bP = C2985bP.f29486d;
                                } else {
                                    com.google.android.gms.internal.ads.G2 g23 = new com.google.android.gms.internal.ads.G2();
                                    boolean z9 = i9 > 32 && playbackOffloadSupport == 2;
                                    g23.f25091a = true;
                                    g23.f25092b = z9;
                                    g23.f25093c = booleanValue;
                                    c2985bP = g23.b();
                                }
                            } else {
                                isOffloadedPlaybackSupported = AudioManager.isOffloadedPlaybackSupported(build, c2777Sj.a());
                                if (isOffloadedPlaybackSupported) {
                                    com.google.android.gms.internal.ads.G2 g24 = new com.google.android.gms.internal.ads.G2();
                                    g24.f25091a = true;
                                    g24.f25093c = booleanValue;
                                    c2985bP = g24.b();
                                } else {
                                    c2985bP = C2985bP.f29486d;
                                }
                            }
                        } catch (IllegalArgumentException unused) {
                            c2985bP = C2985bP.f29486d;
                        }
                    } else {
                        c2985bP = C2985bP.f29486d;
                    }
                }
            }
            c2985bP = C2985bP.f29486d;
        }
        C3203fP c3203fP = new C3203fP();
        if (!Objects.equals(str, com.anythink.basead.exoplayer.k.o.f8622w) ? ((XO) this.f35815e).b(tp, c2777Sj) != null : tp.J == 2) {
            i10 = 2;
        }
        c3203fP.f30698a = i10;
        c3203fP.f30699b = c2985bP.f29487a;
        c3203fP.f30700c = c2985bP.f29488b;
        c3203fP.f30701d = c2985bP.f29489c;
        return c3203fP.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3366iP c(C3148eP c3148eP) {
        int intValue;
        int intValue2;
        boolean z8;
        int i;
        C2777Sj c2777Sj;
        int max;
        int i4;
        int i9;
        h(c3148eP);
        TP tp = (TP) c3148eP.f30348a;
        String str = tp.f27776o;
        boolean equals = Objects.equals(str, com.anythink.basead.exoplayer.k.o.f8622w);
        C2777Sj c2777Sj2 = (C2777Sj) c3148eP.f30349b;
        if (equals) {
            int i10 = tp.J;
            PA.n(AbstractC3548lu.d(i10));
            int i11 = tp.f27754G;
            int i12 = tp.f27755H;
            if (i12 == -1) {
                i12 = AbstractC3548lu.e(i11);
            }
            i = AbstractC3548lu.f(i10) * i11;
            intValue2 = i12;
            z8 = false;
            intValue = i10;
        } else {
            C2985bP c2985bP = C2985bP.f29486d;
            Pair b9 = ((XO) this.f35815e).b(tp, c2777Sj2);
            if (b9 == null) {
                throw new C3094dP("Unable to configure passthrough for: ".concat(String.valueOf(tp)));
            }
            intValue = ((Integer) b9.first).intValue();
            intValue2 = ((Integer) b9.second).intValue();
            z8 = 2;
            i = -1;
        }
        boolean equals2 = Objects.equals(str, com.anythink.basead.exoplayer.k.o.f8582F);
        int i13 = tp.f27771j;
        if (equals2 && i13 == -1) {
            i13 = 768000;
        }
        int i14 = tp.f27756I;
        int i15 = c3148eP.f30353f;
        if (i15 != -1) {
            c2777Sj = c2777Sj2;
        } else {
            int minBufferSize = AudioTrack.getMinBufferSize(i14, intValue2, intValue);
            PA.T(minBufferSize != -2);
            if (i == -1) {
                i = 1;
            }
            int i16 = 250000;
            if (z8) {
                if (!z8) {
                    if (intValue == 5) {
                        i16 = 500000;
                    } else if (intValue == 8) {
                        i16 = 1000000;
                        i4 = 8;
                        if (i13 == -1) {
                            RoundingMode roundingMode = RoundingMode.CEILING;
                            i9 = AbstractC2655Lg.n(i13, 8);
                        } else {
                            int M8 = AbstractC2720Pd.M(i4);
                            PA.T(M8 != -2147483647);
                            i9 = M8;
                        }
                        max = AbstractC3194fG.c((i16 * i9) / 1000000);
                    }
                    i4 = intValue;
                    if (i13 == -1) {
                    }
                    max = AbstractC3194fG.c((i16 * i9) / 1000000);
                } else {
                    int M9 = AbstractC2720Pd.M(intValue);
                    PA.T(M9 != -2147483647);
                    max = AbstractC3194fG.c((M9 * 50000000) / 1000000);
                }
                c2777Sj = c2777Sj2;
            } else {
                long j9 = i14;
                long j10 = i;
                int c4 = AbstractC3194fG.c(((250000 * j9) * j10) / 1000000);
                c2777Sj = c2777Sj2;
                int c9 = AbstractC3194fG.c(((750000 * j9) * j10) / 1000000);
                String str2 = AbstractC3548lu.f32613a;
                max = Math.max(c4, Math.min(minBufferSize * 4, c9));
            }
            i15 = (((Math.max(minBufferSize, max) + i) - 1) / i) * i;
        }
        C2906a1 c2906a1 = new C2906a1();
        C2777Sj c2777Sj3 = C2777Sj.f27609b;
        c2906a1.f29154b = i14;
        c2906a1.f29155c = intValue2;
        c2906a1.f29153a = intValue;
        c2906a1.f29156d = i15;
        c2906a1.f29157e = c3148eP.f30351d;
        c2906a1.f29159g = c2777Sj;
        c2906a1.f29158f = c3148eP.f30352e;
        return new C3366iP(c2906a1);
    }

    public LinkedHashMap d(LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(linkedHashMap);
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            String str3 = (String) linkedHashMap3.get(str);
            C3474ka c3474ka = (C3474ka) ((HashMap) this.f35813c).get(str);
            if (c3474ka == null) {
                c3474ka = C3474ka.f32307b;
            }
            linkedHashMap3.put(str, c3474ka.a(str3, str2));
        }
        return linkedHashMap3;
    }

    public BP e(C4313b c4313b) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://fundingchoicesmessages.google.com/a/consent").openConnection();
            httpURLConnection.setRequestProperty("User-Agent", WebSettings.getDefaultUserAgent((Application) this.f35811a));
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(30000);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", com.anythink.core.common.m.a.f14561q);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnection.getOutputStream(), "UTF-8");
            try {
                JsonWriter jsonWriter = new JsonWriter(outputStreamWriter);
                try {
                    jsonWriter.beginObject();
                    String str = (String) c4313b.f35811a;
                    if (str != null) {
                        jsonWriter.name("admob_app_id");
                        jsonWriter.value(str);
                    }
                    F.d dVar = (F.d) c4313b.f35812b;
                    if (dVar != null) {
                        jsonWriter.name(b.c.f11594d);
                        jsonWriter.beginObject();
                        int i = dVar.f908b;
                        if (i != 1) {
                            jsonWriter.name("os_type");
                            int i4 = i - 1;
                            if (i4 == 0) {
                                jsonWriter.value("UNKNOWN");
                            } else if (i4 == 1) {
                                jsonWriter.value("ANDROID");
                            }
                        }
                        String str2 = (String) dVar.f909c;
                        if (str2 != null) {
                            jsonWriter.name("model");
                            jsonWriter.value(str2);
                        }
                        Integer num = (Integer) dVar.f910d;
                        if (num != null) {
                            jsonWriter.name("android_api_level");
                            jsonWriter.value(num);
                        }
                        jsonWriter.endObject();
                    }
                    String str3 = (String) c4313b.f35813c;
                    if (str3 != null) {
                        jsonWriter.name("language_code");
                        jsonWriter.value(str3);
                    }
                    Boolean bool = (Boolean) c4313b.f35814d;
                    if (bool != null) {
                        jsonWriter.name("tag_for_under_age_of_consent");
                        jsonWriter.value(bool.booleanValue());
                    }
                    Map map = (Map) c4313b.f35815e;
                    if (!map.isEmpty()) {
                        jsonWriter.name("stored_infos_map");
                        jsonWriter.beginObject();
                        for (Map.Entry entry : map.entrySet()) {
                            jsonWriter.name((String) entry.getKey());
                            jsonWriter.value((String) entry.getValue());
                        }
                        jsonWriter.endObject();
                    }
                    S0.n nVar = (S0.n) c4313b.f35816f;
                    if (nVar != null) {
                        jsonWriter.name("screen_info");
                        jsonWriter.beginObject();
                        Integer num2 = (Integer) nVar.f2914n;
                        if (num2 != null) {
                            jsonWriter.name("width");
                            jsonWriter.value(num2);
                        }
                        Integer num3 = (Integer) nVar.f2915u;
                        if (num3 != null) {
                            jsonWriter.name("height");
                            jsonWriter.value(num3);
                        }
                        Double d2 = (Double) nVar.f2916v;
                        if (d2 != null) {
                            jsonWriter.name("density");
                            jsonWriter.value(d2);
                        }
                        List<C4388u> list = (List) nVar.f2917w;
                        if (!list.isEmpty()) {
                            jsonWriter.name("screen_insets");
                            jsonWriter.beginArray();
                            for (C4388u c4388u : list) {
                                jsonWriter.beginObject();
                                Integer num4 = c4388u.f35927a;
                                if (num4 != null) {
                                    jsonWriter.name("top");
                                    jsonWriter.value(num4);
                                }
                                Integer num5 = c4388u.f35928b;
                                if (num5 != null) {
                                    jsonWriter.name("left");
                                    jsonWriter.value(num5);
                                }
                                Integer num6 = c4388u.f35929c;
                                if (num6 != null) {
                                    jsonWriter.name("right");
                                    jsonWriter.value(num6);
                                }
                                Integer num7 = c4388u.f35930d;
                                if (num7 != null) {
                                    jsonWriter.name("bottom");
                                    jsonWriter.value(num7);
                                }
                                jsonWriter.endObject();
                            }
                            jsonWriter.endArray();
                        }
                        jsonWriter.endObject();
                    }
                    Y2.e eVar = (Y2.e) c4313b.f35817g;
                    if (eVar != null) {
                        jsonWriter.name("app_info");
                        jsonWriter.beginObject();
                        String str4 = (String) eVar.f3963u;
                        if (str4 != null) {
                            jsonWriter.name("package_name");
                            jsonWriter.value(str4);
                        }
                        String str5 = (String) eVar.f3964v;
                        if (str5 != null) {
                            jsonWriter.name("publisher_display_name");
                            jsonWriter.value(str5);
                        }
                        String str6 = (String) eVar.f3965w;
                        if (str6 != null) {
                            jsonWriter.name(com.anythink.expressad.foundation.g.a.i);
                            jsonWriter.value(str6);
                        }
                        jsonWriter.endObject();
                    }
                    if (((J1) c4313b.f35818h) != null) {
                        jsonWriter.name(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.SDK_INFO);
                        jsonWriter.beginObject();
                        jsonWriter.name(com.anythink.expressad.foundation.g.a.i);
                        jsonWriter.value("4.0.0");
                        jsonWriter.endObject();
                    }
                    List list2 = (List) c4313b.i;
                    if (!list2.isEmpty()) {
                        jsonWriter.name("debug_params");
                        jsonWriter.beginArray();
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            switch (((EnumC4384t) it.next()).ordinal()) {
                                case 0:
                                    jsonWriter.value("DEBUG_PARAM_UNKNOWN");
                                    break;
                                case 1:
                                    jsonWriter.value("ALWAYS_SHOW");
                                    break;
                                case 2:
                                    jsonWriter.value("GEO_OVERRIDE_EEA");
                                    break;
                                case 3:
                                    jsonWriter.value("GEO_OVERRIDE_REGULATED_US_STATE");
                                    break;
                                case 4:
                                    jsonWriter.value("GEO_OVERRIDE_OTHER");
                                    break;
                                case 5:
                                    jsonWriter.value("GEO_OVERRIDE_NON_EEA");
                                    break;
                                case 6:
                                    jsonWriter.value("PREVIEWING_DEBUG_MESSAGES");
                                    break;
                                case 7:
                                    jsonWriter.value("GEO_OVERRIDE_USFL");
                                    break;
                            }
                        }
                        jsonWriter.endArray();
                    }
                    jsonWriter.endObject();
                    jsonWriter.close();
                    outputStreamWriter.close();
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 200) {
                        throw new IOException("Http error code - " + responseCode + ".\n" + new Scanner(httpURLConnection.getErrorStream()).useDelimiter("\\A").next());
                    }
                    String headerField = httpURLConnection.getHeaderField("x-ump-using-header");
                    if (headerField != null) {
                        BP l9 = BP.l(new JsonReader(new StringReader(headerField)));
                        l9.f24037c = new Scanner(httpURLConnection.getInputStream()).useDelimiter("\\A").next();
                        return l9;
                    }
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
                    try {
                        bufferedReader.readLine();
                        JsonReader jsonReader = new JsonReader(bufferedReader);
                        try {
                            BP l10 = BP.l(jsonReader);
                            jsonReader.close();
                            bufferedReader.close();
                            return l10;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (SocketTimeoutException e6) {
            throw new C4354l0(4, e6, "The server timed out.");
        } catch (IOException e9) {
            throw new C4354l0(2, e9, "Error making request.");
        }
    }

    public C4119wP f(C3366iP c3366iP) {
        Context context;
        Context createDeviceContext;
        int deviceId;
        try {
            int i = c3366iP.f31389f;
            int i4 = c3366iP.f31390g;
            Context context2 = null;
            if (i4 != -1 && (context = (Context) this.f35811a) != null && Build.VERSION.SDK_INT >= 34) {
                Context context3 = (Context) this.f35818h;
                if (context3 != null) {
                    deviceId = context3.getDeviceId();
                    if (deviceId != i4) {
                    }
                    context2 = (Context) this.f35818h;
                    i = 0;
                }
                createDeviceContext = context.createDeviceContext(i4);
                this.f35818h = createDeviceContext;
                context2 = (Context) this.f35818h;
                i = 0;
            }
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(c3366iP.f31388e.a()).setAudioFormat(new AudioFormat.Builder().setSampleRate(c3366iP.f31385b).setChannelMask(c3366iP.f31386c).setEncoding(c3366iP.f31384a).build()).setTransferMode(1).setBufferSizeInBytes(c3366iP.f31387d).setSessionId(i);
            int i9 = Build.VERSION.SDK_INT;
            if (i9 >= 29) {
                sessionId.setOffloadedPlayback(false);
            }
            if (i9 >= 34 && context2 != null) {
                sessionId.setContext(context2);
            }
            AudioTrack build = sessionId.build();
            if (build.getState() == 1) {
                return new C4119wP(build, c3366iP, (C4086vt) this.f35812b, (com.google.android.gms.internal.ads.T2) this.f35814d);
            }
            try {
                build.release();
            } catch (Exception unused) {
            }
            throw new C3312hP();
        } catch (IllegalArgumentException e6) {
            e = e6;
            throw new C3312hP(e);
        } catch (UnsupportedOperationException e9) {
            e = e9;
            throw new C3312hP(e);
        }
    }

    public void g(LinkedHashMap linkedHashMap, C3582ma c3582ma) {
        FileOutputStream fileOutputStream;
        Uri.Builder buildUpon = Uri.parse((String) this.f35814d).buildUpon();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        String uri = buildUpon.build().toString();
        if (c3582ma != null) {
            StringBuilder sb = new StringBuilder(uri);
            String str = c3582ma.f32700u;
            if (!TextUtils.isEmpty(str)) {
                sb.append("&it=");
                sb.append(str);
            }
            String str2 = c3582ma.f32701v;
            if (!TextUtils.isEmpty(str2)) {
                sb.append("&blat=");
                sb.append(str2);
            }
            uri = sb.toString();
        }
        FileOutputStream fileOutputStream2 = null;
        if (!((AtomicBoolean) this.f35818h).get()) {
            t2.G g9 = p2.j.f39798C.f39803c;
            new t2.v((Context) this.f35815e, (String) this.f35816f, uri, null).l();
            return;
        }
        File file = (File) this.i;
        try {
            if (file == null) {
                int i = t2.C.f40822b;
                u2.i.f("CsiReporter: File doesn't exist. Cannot write CSI data to file.");
                return;
            }
            try {
                fileOutputStream = new FileOutputStream(file, true);
            } catch (IOException e6) {
                e = e6;
            }
            try {
                fileOutputStream.write(uri.getBytes());
                fileOutputStream.write(10);
                try {
                    fileOutputStream.close();
                } catch (IOException e9) {
                    int i4 = t2.C.f40822b;
                    u2.i.g("CsiReporter: Cannot close file: sdk_csi_data.txt.", e9);
                }
            } catch (IOException e10) {
                e = e10;
                fileOutputStream2 = fileOutputStream;
                int i9 = t2.C.f40822b;
                u2.i.g("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e);
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e11) {
                        u2.i.g("CsiReporter: Cannot close file: sdk_csi_data.txt.", e11);
                    }
                }
            } catch (Throwable th) {
                th = th;
                fileOutputStream2 = fileOutputStream;
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e12) {
                        int i10 = t2.C.f40822b;
                        u2.i.g("CsiReporter: Cannot close file: sdk_csi_data.txt.", e12);
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public void h(C3148eP c3148eP) {
        Context context;
        XO a9;
        i();
        C4287ze c4287ze = (C4287ze) this.f35816f;
        AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) c3148eP.f30350c;
        C2777Sj c2777Sj = (C2777Sj) c3148eP.f30349b;
        if (c4287ze == null && (context = (Context) this.f35811a) != null) {
            C4287ze c4287ze2 = new C4287ze(context, new C2478Aq(19, this), c2777Sj, audioDeviceInfo);
            this.f35816f = c4287ze2;
            if (c4287ze2.f35573u) {
                a9 = (XO) c4287ze2.f35569B;
                a9.getClass();
            } else {
                c4287ze2.f35573u = true;
                ZO zo = (ZO) c4287ze2.f35578z;
                if (zo != null) {
                    zo.f28984a.registerContentObserver(zo.f28985b, false, zo);
                }
                Handler handler = (Handler) c4287ze2.f35575w;
                Context context2 = c4287ze2.f35572n;
                AbstractC2655Lg.b(context2).registerAudioDeviceCallback((YO) c4287ze2.f35576x, handler);
                if (Build.VERSION.SDK_INT >= 32 && ((com.google.android.gms.internal.ads.L) c4287ze2.f35568A) == null) {
                    c4287ze2.f35568A = new com.google.android.gms.internal.ads.L(context2, new RunnableC3873rw(16, c4287ze2), Boolean.valueOf(AbstractC3548lu.j(context2)));
                }
                a9 = XO.a(context2, context2.registerReceiver((Q0.d) c4287ze2.f35577y, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), (C2777Sj) c4287ze2.f35571D, (AudioDeviceInfo) c4287ze2.f35570C, c4287ze2.j());
                c4287ze2.f35569B = a9;
            }
            this.f35815e = a9;
        } else if (c4287ze != null) {
            if (audioDeviceInfo != null && !audioDeviceInfo.equals((AudioDeviceInfo) c4287ze.f35570C)) {
                c4287ze.f35570C = audioDeviceInfo;
                C2777Sj c2777Sj2 = (C2777Sj) c4287ze.f35571D;
                List j9 = c4287ze.j();
                C3675oC c3675oC = XO.f28641e;
                IntentFilter intentFilter = new IntentFilter("android.media.action.HDMI_AUDIO_PLUG");
                Context context3 = c4287ze.f35572n;
                c4287ze.k(XO.a(context3, context3.registerReceiver(null, intentFilter), c2777Sj2, audioDeviceInfo, j9));
            }
            C4287ze c4287ze3 = (C4287ze) this.f35816f;
            if (!Objects.equals(c2777Sj, (C2777Sj) c4287ze3.f35571D)) {
                c4287ze3.f35571D = c2777Sj;
                AudioDeviceInfo audioDeviceInfo2 = (AudioDeviceInfo) c4287ze3.f35570C;
                List j10 = c4287ze3.j();
                C3675oC c3675oC2 = XO.f28641e;
                IntentFilter intentFilter2 = new IntentFilter("android.media.action.HDMI_AUDIO_PLUG");
                Context context4 = c4287ze3.f35572n;
                c4287ze3.k(XO.a(context4, context4.registerReceiver(null, intentFilter2), c2777Sj, audioDeviceInfo2, j10));
            }
        }
        ((XO) this.f35815e).getClass();
    }

    public void i() {
        if (((Context) this.f35811a) == null) {
            return;
        }
        Looper myLooper = Looper.myLooper();
        Looper looper = (Looper) this.f35817g;
        boolean z8 = true;
        if (looper != null && looper != myLooper) {
            z8 = false;
        }
        String name = looper == null ? "null" : looper.getThread().getName();
        String name2 = myLooper != null ? myLooper.getThread().getName() : "null";
        if (!z8) {
            throw new IllegalStateException(AbstractC3194fG.u("AudioTrackAudioOutputProvider accessed on multiple threads: %s and %s", name, name2));
        }
        this.f35817g = myLooper;
    }

    public C4313b() {
        this.f35811a = new ArrayBlockingQueue(100);
        this.f35812b = new LinkedHashMap();
        this.f35813c = new HashMap();
        this.f35817g = new HashSet(Arrays.asList("noop", "activeViewPingSent", "viewabilityChanged", "visibilityChanged"));
    }

    public C4313b(C3093dO c3093dO, VN vn, com.google.android.gms.internal.ads.T2 t22, int i, int i4, int i9, int i10) {
        this.f35811a = c3093dO;
        this.f35813c = vn;
        this.f35814d = new L7();
        this.f35815e = t22.A(c3093dO.f30022M, new C3597mp(1, this));
        this.f35816f = new C4139ws(this, i);
        this.f35817g = new As(this, i4);
        this.f35818h = new Es(this, i9);
        this.i = new Ms(this, i10);
        C3332hs c3332hs = new C3332hs(this);
        this.f35812b = c3332hs;
        c3093dO.f30013G.a(c3332hs);
    }
}
