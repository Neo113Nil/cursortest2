package com.baidu.location.e;

import android.content.Context;
import android.os.Build;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.io.File;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static String f5164a;

    /* renamed from: b, reason: collision with root package name */
    public static String f5165b;

    /* renamed from: c, reason: collision with root package name */
    public static String f5166c;

    /* renamed from: d, reason: collision with root package name */
    public static String f5167d;

    /* renamed from: e, reason: collision with root package name */
    public static String f5168e;

    /* renamed from: f, reason: collision with root package name */
    public String f5169f;

    /* renamed from: g, reason: collision with root package name */
    public String f5170g;

    /* renamed from: h, reason: collision with root package name */
    public String f5171h;

    /* renamed from: i, reason: collision with root package name */
    public String f5172i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f5173j;

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        public static final c f5174a = new c();
    }

    /* renamed from: com.baidu.location.e.c$c, reason: collision with other inner class name */
    public class C0055c {

        /* renamed from: a, reason: collision with root package name */
        public static final String f5175a;

        /* renamed from: b, reason: collision with root package name */
        public static final String f5176b;

        static {
            StringBuilder sb = new StringBuilder();
            sb.append(com.baidu.location.e.i.g());
            String str = File.separator;
            sb.append(str);
            sb.append("locModel");
            sb.append(str);
            sb.append("gps_checker");
            sb.append(str);
            sb.append("GPS_Checker_Model.m");
            f5175a = sb.toString();
            f5176b = com.baidu.location.e.i.g() + str + "locModel" + str + "gps_checker" + str;
        }
    }

    public class d {

        /* renamed from: a, reason: collision with root package name */
        private static final String f5177a;

        /* renamed from: b, reason: collision with root package name */
        public static final String f5178b;

        static {
            StringBuilder sb = new StringBuilder();
            sb.append("indoor");
            String str = File.separator;
            sb.append(str);
            sb.append("poiData");
            String sb2 = sb.toString();
            f5177a = sb2;
            f5178b = com.baidu.location.e.i.g() + str + "locModel" + str + sb2 + str;
        }
    }

    public class e {

        /* renamed from: a, reason: collision with root package name */
        public static final String f5179a;

        /* renamed from: b, reason: collision with root package name */
        public static final String f5180b;

        static {
            StringBuilder sb = new StringBuilder();
            sb.append(com.baidu.location.e.i.g());
            String str = File.separator;
            sb.append(str);
            sb.append("locModel");
            sb.append(str);
            sb.append("vdrModel");
            sb.append(str);
            sb.append("mobilenet_opt.nb");
            f5179a = sb.toString();
            f5180b = com.baidu.location.e.i.g() + str + "locModel" + str + "vdrModel" + str;
        }
    }

    public class f {

        /* renamed from: a, reason: collision with root package name */
        private static final String f5181a;

        /* renamed from: b, reason: collision with root package name */
        public static final String f5182b;

        static {
            StringBuilder sb = new StringBuilder();
            sb.append("outdoor");
            String str = File.separator;
            sb.append(str);
            sb.append("poiData");
            String sb2 = sb.toString();
            f5181a = sb2;
            f5182b = com.baidu.location.e.i.g() + str + "locModel" + str + sb2 + str;
        }
    }

    public class g {

        /* renamed from: a, reason: collision with root package name */
        public static final String f5183a;

        /* renamed from: b, reason: collision with root package name */
        public static final String f5184b;

        static {
            StringBuilder sb = new StringBuilder();
            sb.append(com.baidu.location.e.i.g());
            String str = File.separator;
            sb.append(str);
            sb.append("locModel");
            sb.append(str);
            sb.append("subway");
            sb.append(str);
            sb.append("State_Recognition_Model_Static.m");
            f5183a = sb.toString();
            f5184b = com.baidu.location.e.i.g() + str + "locModel" + str + "subway" + str;
        }
    }

    public class h {

        /* renamed from: a, reason: collision with root package name */
        public static final String f5185a;

        /* renamed from: b, reason: collision with root package name */
        public static final String f5186b;

        static {
            StringBuilder sb = new StringBuilder();
            sb.append(com.baidu.location.e.i.g());
            String str = File.separator;
            sb.append(str);
            sb.append("locModel");
            sb.append(str);
            sb.append("traffic");
            sb.append(str);
            sb.append("Traffic_Recognition_Model.m");
            f5185a = sb.toString();
            f5186b = com.baidu.location.e.i.g() + str + "locModel" + str + "traffic" + str;
        }
    }

    public class i {

        /* renamed from: a, reason: collision with root package name */
        private static int f5187a = -1;

        /* renamed from: b, reason: collision with root package name */
        private static int f5188b = -1;

        /* renamed from: c, reason: collision with root package name */
        private static int f5189c = -1;

        /* renamed from: d, reason: collision with root package name */
        private static int f5190d = -1;

        /* renamed from: e, reason: collision with root package name */
        private static int f5191e = -1;

        /* renamed from: f, reason: collision with root package name */
        private static int f5192f = -1;

        class a {
        }

        static /* synthetic */ class b {

            /* renamed from: a, reason: collision with root package name */
            static final /* synthetic */ int[] f5193a;

            static {
                int[] iArr = new int[d.values().length];
                f5193a = iArr;
                try {
                    iArr[d.SUBWAY_STATIC.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    f5193a[d.TRAFFIC_STATUS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    f5193a[d.VDR_INDOOR_SPEED_STATUS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    f5193a[d.INDOOR_POI_DATA_STATUS.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    f5193a[d.OUTDOOR_POI_DATA_STATUS.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    f5193a[d.GPS_CHECKER_STATUS.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
            }
        }

        /* renamed from: com.baidu.location.e.c$i$c, reason: collision with other inner class name */
        private static class C0056c {

            /* renamed from: a, reason: collision with root package name */
            private static final i f5194a = new i(null);
        }

        public enum d {
            SUBWAY_STATIC,
            TRAFFIC_STATUS,
            VDR_INDOOR_SPEED_STATUS,
            INDOOR_POI_DATA_STATUS,
            OUTDOOR_POI_DATA_STATUS,
            GPS_CHECKER_STATUS
        }

        private i() {
        }

        /* synthetic */ i(a aVar) {
            this();
        }

        public static i a() {
            return C0056c.f5194a;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public String a(d dVar) {
            switch (b.f5193a[dVar.ordinal()]) {
                case 1:
                    if (f5187a == 0) {
                        return g.f5184b;
                    }
                    return null;
                case 2:
                    if (f5188b == 0) {
                        return h.f5186b;
                    }
                    return null;
                case 3:
                    if (f5189c == 0) {
                        return e.f5180b;
                    }
                    return null;
                case 4:
                    if (f5190d == 0) {
                        return d.f5178b;
                    }
                    return null;
                case 5:
                    if (f5191e == 0) {
                        return f.f5182b;
                    }
                    return null;
                case 6:
                    if (f5192f == 0) {
                        return C0055c.f5175a;
                    }
                    return null;
                default:
                    return null;
            }
        }
    }

    private c() {
        this.f5169f = null;
        this.f5170g = null;
        this.f5171h = null;
        this.f5172i = null;
        this.f5173j = false;
        if (com.baidu.location.f.getServiceContext() != null) {
            a(com.baidu.location.f.getServiceContext());
        }
    }

    public static c a() {
        return b.f5174a;
    }

    private boolean d() {
        return false;
    }

    public String b() {
        return this.f5171h;
    }

    public String c() {
        String str;
        StringBuffer stringBuffer = new StringBuffer(200);
        if (this.f5171h != null) {
            stringBuffer.append("&cu=");
            str = this.f5171h;
        } else {
            stringBuffer.append("&im=");
            str = this.f5169f;
        }
        stringBuffer.append(str);
        try {
            stringBuffer.append("&mb=");
            stringBuffer.append(Build.MODEL);
        } catch (Exception unused) {
        }
        stringBuffer.append("&pack=");
        try {
            stringBuffer.append(f5164a);
        } catch (Exception unused2) {
        }
        stringBuffer.append("&sdk=");
        stringBuffer.append(9.653f);
        return stringBuffer.toString();
    }

    public String a(boolean z7) {
        return a(z7, (String) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String a(boolean z7, String str) {
        String str2;
        StringBuffer stringBuffer = new StringBuffer(256);
        stringBuffer.append("&sdk=");
        stringBuffer.append(9.653f);
        if (z7) {
            if (com.baidu.location.e.i.f5261d.equals(TtmlNode.COMBINE_ALL)) {
                stringBuffer.append("&addr=allj2");
            }
            if (com.baidu.location.e.i.f5267g) {
                stringBuffer.append("&adtp=n2");
            }
            if (com.baidu.location.e.i.f5265f || com.baidu.location.e.i.f5271i || com.baidu.location.e.i.f5273j || com.baidu.location.e.i.f5269h || d()) {
                stringBuffer.append("&sema=");
                if (com.baidu.location.e.i.f5265f) {
                    stringBuffer.append("aptag|");
                }
                if (com.baidu.location.e.i.f5269h || d()) {
                    stringBuffer.append("aptagd2|");
                }
                if (com.baidu.location.e.i.f5271i) {
                    stringBuffer.append("poiregion|");
                }
                if (com.baidu.location.e.i.f5273j) {
                    stringBuffer.append("regular");
                }
            }
        }
        if (z7) {
            if (str == null) {
                str = "&coor=gcj02";
            } else {
                stringBuffer.append("&coor=");
            }
            stringBuffer.append(str);
            String l8 = com.baidu.location.c.f.l();
            if (l8 != null) {
                stringBuffer.append(l8);
            }
        }
        if (this.f5171h != null) {
            stringBuffer.append("&cu=");
            stringBuffer.append(this.f5171h);
            String str3 = this.f5169f;
            str2 = (str3 == null || str3.equals("NULL") || this.f5171h.contains(new StringBuffer(this.f5169f).reverse().toString())) ? "&im=" : "&Aim=";
            if (this.f5170g != null) {
                stringBuffer.append("&snd=");
                stringBuffer.append(this.f5170g);
            }
            if (this.f5172i != null) {
                stringBuffer.append("&Aid=");
                stringBuffer.append(this.f5172i);
            }
            stringBuffer.append("&fw=");
            stringBuffer.append(com.baidu.location.f.getFrameVersion());
            stringBuffer.append("&lt=1");
            stringBuffer.append("&mb=");
            stringBuffer.append(Build.MODEL);
            stringBuffer.append("&resid=");
            stringBuffer.append("12");
            stringBuffer.append("&os=A");
            stringBuffer.append(Build.VERSION.SDK_INT);
            if (z7) {
                stringBuffer.append("&sv=");
                String str4 = Build.VERSION.RELEASE;
                if (str4 != null && str4.length() > 6) {
                    str4 = str4.substring(0, 6);
                }
                stringBuffer.append(str4);
            }
            return stringBuffer.toString();
        }
        stringBuffer.append(str2);
        stringBuffer.append(this.f5169f);
        if (this.f5170g != null) {
        }
        if (this.f5172i != null) {
        }
        stringBuffer.append("&fw=");
        stringBuffer.append(com.baidu.location.f.getFrameVersion());
        stringBuffer.append("&lt=1");
        stringBuffer.append("&mb=");
        stringBuffer.append(Build.MODEL);
        stringBuffer.append("&resid=");
        stringBuffer.append("12");
        stringBuffer.append("&os=A");
        stringBuffer.append(Build.VERSION.SDK_INT);
        if (z7) {
        }
        return stringBuffer.toString();
    }

    public void a(Context context) {
        if (context == null || this.f5173j) {
            return;
        }
        try {
            f5164a = context.getPackageName();
        } catch (Exception unused) {
            f5164a = null;
        }
        try {
            f5168e = com.baidu.location.e.i.f(context);
        } catch (Exception unused2) {
            f5168e = null;
        }
        com.baidu.location.e.i.f5277l = "" + this.f5171h;
        this.f5173j = true;
    }

    public void a(String str) {
        this.f5171h = str;
        com.baidu.location.e.i.f5277l = "" + this.f5171h;
    }

    public void a(String str, String str2) {
        f5165b = str;
        f5164a = str2;
    }
}
