package com.baidu.location.b;

import android.annotation.TargetApi;
import android.location.GnssNavigationMessage;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.realsil.sdk.dfu.DfuException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    private static final double[] f4892a = {1999.0d, 8.0d, 22.0d, com.github.mikephil.charting.utils.i.DOUBLE_EPSILON, com.github.mikephil.charting.utils.i.DOUBLE_EPSILON, com.github.mikephil.charting.utils.i.DOUBLE_EPSILON};

    /* renamed from: b, reason: collision with root package name */
    private HashMap<String, c> f4893b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private HashMap<String, String> f4894c = new HashMap<>();

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private static v f4895a = new v();
    }

    private class b {

        /* renamed from: a, reason: collision with root package name */
        int f4896a = 0;

        /* renamed from: b, reason: collision with root package name */
        double f4897b = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;

        public b() {
        }
    }

    private class c {

        /* renamed from: a, reason: collision with root package name */
        private boolean f4899a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f4900b;

        /* renamed from: c, reason: collision with root package name */
        private long f4901c;

        /* renamed from: d, reason: collision with root package name */
        private int f4902d;

        /* renamed from: e, reason: collision with root package name */
        private int f4903e;

        /* renamed from: f, reason: collision with root package name */
        private ArrayList<String> f4904f;

        /* renamed from: g, reason: collision with root package name */
        private ArrayList<Integer> f4905g;

        /* renamed from: h, reason: collision with root package name */
        private int f4906h;

        /* renamed from: i, reason: collision with root package name */
        private double f4907i;

        /* renamed from: j, reason: collision with root package name */
        private double f4908j;

        /* renamed from: k, reason: collision with root package name */
        private double f4909k;

        /* renamed from: l, reason: collision with root package name */
        private int f4910l;

        /* renamed from: m, reason: collision with root package name */
        private int f4911m;

        /* renamed from: n, reason: collision with root package name */
        private b f4912n;

        public c(int i8, int i9) {
            a(i8, i9);
            this.f4906h = 0;
            this.f4907i = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
            this.f4908j = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
            this.f4909k = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
            this.f4910l = 0;
            this.f4911m = 0;
            this.f4912n = v.this.new b();
        }

        private b a(int i8, double d8) {
            b a8 = a(v.f4892a);
            if (d8 < -1.0E9d || 1.0E9d < d8) {
                d8 = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
            }
            int i9 = (int) d8;
            a8.f4896a += (i8 * 604800) + i9;
            a8.f4897b = d8 - i9;
            return a8;
        }

        @TargetApi(24)
        private String b(GnssNavigationMessage gnssNavigationMessage) {
            byte[] data;
            StringBuilder sb = new StringBuilder();
            data = gnssNavigationMessage.getData();
            int length = data.length;
            for (int i8 = 0; i8 < length; i8++) {
                String replace = String.format("%8s", Integer.toBinaryString(data[i8] & 255)).replace(' ', '0');
                if (i8 % 4 == 0) {
                    replace = replace.substring(2, 8);
                }
                sb.append(replace);
            }
            return sb.toString();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String c() {
            StringBuilder sb = new StringBuilder();
            if (!this.f4900b) {
                return sb.toString();
            }
            if (this.f4903e == 1537) {
                d();
            }
            sb.append(this.f4912n.f4896a);
            sb.append('|');
            boolean z7 = true;
            for (int i8 = 0; i8 < this.f4904f.size(); i8++) {
                if (z7) {
                    z7 = false;
                } else {
                    sb.append(',');
                }
                sb.append(this.f4904f.get(i8));
            }
            this.f4899a = true;
            return sb.toString();
        }

        private void d() {
            int i8;
            b a8 = a(this.f4906h, this.f4907i);
            double d8 = ((r1.f4896a - a8.f4896a) + a(this.f4906h, this.f4908j).f4897b) - a8.f4897b;
            if (d8 <= 302400.0d) {
                if (d8 < -302400.0d) {
                    i8 = this.f4906h + 1;
                }
                this.f4912n = a(this.f4906h, this.f4909k);
                this.f4911m = this.f4906h + 1024;
            }
            i8 = this.f4906h - 1;
            this.f4906h = i8;
            this.f4912n = a(this.f4906h, this.f4909k);
            this.f4911m = this.f4906h + 1024;
        }

        private void e(String str) {
            this.f4910l = Integer.parseInt(str.substring(42, 46), 2);
        }

        private b a(double[] dArr) {
            int[] iArr = {1, 32, 60, 91, 121, 152, 182, 213, 244, DfuException.ERROR_USER_NOT_ACTIVE_IMAGE_ERROR, 305, 335};
            b bVar = v.this.new b();
            int i8 = 0;
            int i9 = (int) dArr[0];
            int i10 = (int) dArr[1];
            int i11 = (int) dArr[2];
            if (i9 >= 1970 && 2099 >= i9 && i10 >= 1 && 12 >= i10) {
                int i12 = (((((i9 - 1970) * 365) + ((i9 - 1969) / 4)) + iArr[i10 - 1]) + i11) - 2;
                if (i9 % 4 == 0 && i10 >= 3) {
                    i8 = 1;
                }
                int floor = (int) Math.floor(dArr[5]);
                bVar.f4896a = ((i12 + i8) * 86400) + (((int) dArr[3]) * 3600) + (((int) dArr[4]) * 60) + floor;
                bVar.f4897b = dArr[5] - floor;
            }
            return bVar;
        }

        private void b(String str) {
            this.f4906h = Integer.parseInt(str.substring(96, 108), 2);
            this.f4907i = Long.parseLong(str.substring(108, 128), 2);
        }

        private void c(String str) {
            this.f4908j = Long.parseLong(str.substring(16, 30), 2) * 60.0d;
        }

        private void d(String str) {
            this.f4909k = Long.parseLong(str.substring(54, 68), 2) * 60;
        }

        @TargetApi(24)
        private String a(GnssNavigationMessage gnssNavigationMessage) {
            byte[] data;
            StringBuilder sb = new StringBuilder();
            data = gnssNavigationMessage.getData();
            for (byte b8 : data) {
                sb.append(String.format("%8s", Integer.toBinaryString(b8 & 255)).replace(' ', '0'));
            }
            return sb.toString();
        }

        private boolean b() {
            if (this.f4905g == null) {
                return false;
            }
            for (int i8 = 0; i8 < this.f4905g.size(); i8++) {
                if (this.f4905g.get(i8).intValue() != i8) {
                    return false;
                }
            }
            return true;
        }

        private void a() {
            if (this.f4904f.size() != 0) {
                for (int i8 = 0; i8 < this.f4904f.size(); i8++) {
                    if (!this.f4904f.get(i8).contains("None")) {
                    }
                }
                this.f4900b = true;
                return;
            }
            this.f4900b = false;
        }

        private void a(int i8, int i9) {
            int i10 = this.f4903e;
            int i11 = (i10 == 257 || i10 == 769) ? 5 : i10 != 1537 ? i10 != 1281 ? i10 != 1282 ? 0 : 10 : 3 : 6;
            ArrayList<String> arrayList = this.f4904f;
            if (arrayList != null) {
                arrayList.clear();
            } else {
                this.f4904f = new ArrayList<>();
            }
            ArrayList<Integer> arrayList2 = this.f4905g;
            if (arrayList2 != null) {
                arrayList2.clear();
            } else {
                this.f4905g = new ArrayList<>();
            }
            for (int i12 = 0; i12 < i11; i12++) {
                this.f4904f.add("None");
            }
            this.f4902d = i8;
            this.f4903e = i9;
            this.f4899a = false;
            this.f4900b = false;
            this.f4901c = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @TargetApi(24)
        public void a(GnssNavigationMessage gnssNavigationMessage, long j8) {
            int type;
            int svid;
            int submessageId;
            byte[] data;
            type = gnssNavigationMessage.getType();
            svid = gnssNavigationMessage.getSvid();
            submessageId = gnssNavigationMessage.getSubmessageId();
            data = gnssNavigationMessage.getData();
            if (j8 - this.f4901c > 1200 || this.f4899a || this.f4904f.size() == 0 || type != this.f4903e || svid != this.f4902d) {
                a(svid, type);
            }
            if ((type == 1282 || type == 1281) && !b()) {
                a(svid, type);
            }
            if (this.f4904f.size() == 0) {
                return;
            }
            int i8 = this.f4903e;
            boolean z7 = true;
            int i9 = i8 == 1537 ? 0 : 1;
            if (i8 == 1282) {
                if (submessageId != 1) {
                    return;
                }
                e(b(gnssNavigationMessage));
                submessageId = this.f4910l;
            }
            int i10 = submessageId - i9;
            if (i10 >= this.f4904f.size()) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            for (byte b8 : data) {
                if (z7) {
                    z7 = false;
                } else {
                    sb.append(',');
                }
                sb.append((int) b8);
            }
            this.f4904f.set(i10, sb.toString());
            if (type == 1281 || type == 1282) {
                this.f4905g.add(Integer.valueOf(i10));
            }
            if (this.f4903e == 1537) {
                a(a(gnssNavigationMessage));
            }
            a();
            this.f4901c = j8;
        }

        private void a(String str) {
            StringBuilder sb;
            int i8;
            char charAt = str.charAt(0);
            char charAt2 = str.charAt(120);
            if (charAt == '1' && charAt2 == '0') {
                sb = new StringBuilder();
                sb.append(str.substring(2, 18));
                i8 = 234;
            } else {
                if (charAt != '0' || charAt2 != '1') {
                    return;
                }
                sb = new StringBuilder();
                sb.append(str.substring(2, 114));
                i8 = TsExtractor.TS_STREAM_TYPE_DTS;
            }
            sb.append(str.substring(122, i8));
            String sb2 = sb.toString();
            int parseInt = Integer.parseInt(sb2.substring(0, 6), 2);
            if (parseInt == 0) {
                b(sb2);
            } else if (parseInt == 1) {
                c(sb2);
            } else if (parseInt == 4) {
                d(sb2);
            }
        }
    }

    public static v a() {
        return a.f4895a;
    }

    public ArrayList<String> b() {
        ArrayList<String> arrayList = new ArrayList<>();
        for (Map.Entry<String, c> entry : this.f4893b.entrySet()) {
            String key = entry.getKey();
            String c8 = entry.getValue().c();
            if (c8 != null && c8.length() != 0) {
                if (this.f4894c.containsKey(key)) {
                    if (c8.substring(0, 100).equals(this.f4894c.get(key).substring(0, 100))) {
                    }
                } else {
                    this.f4894c.put(key, c8);
                }
                arrayList.add(key + '|' + c8);
            }
        }
        return arrayList;
    }

    @TargetApi(24)
    public void a(GnssNavigationMessage gnssNavigationMessage, long j8) {
        int svid;
        int type;
        HashMap<String, c> hashMap;
        svid = gnssNavigationMessage.getSvid();
        type = gnssNavigationMessage.getType();
        String str = (type != 257 ? type != 769 ? type != 1537 ? type != 1281 ? type != 1282 ? "none" : "CT" : "CO" : ExifInterface.LONGITUDE_EAST : "R" : "G") + svid;
        if (str.contains("none") || (hashMap = this.f4893b) == null) {
            return;
        }
        if (!hashMap.containsKey(str)) {
            this.f4893b.put(str, new c(svid, type));
        }
        this.f4893b.get(str).a(gnssNavigationMessage, j8);
    }
}
