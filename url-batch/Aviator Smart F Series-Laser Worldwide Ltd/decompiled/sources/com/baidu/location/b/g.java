package com.baidu.location.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import android.util.Base64;
import com.baidu.ar.util.SystemInfoUtil;
import com.baidu.location.BDLocation;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes2.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private SharedPreferences f4684a = null;

    /* renamed from: b, reason: collision with root package name */
    private boolean f4685b = false;

    /* renamed from: c, reason: collision with root package name */
    private Deque<String> f4686c = new LinkedList();

    /* renamed from: d, reason: collision with root package name */
    private Deque<String> f4687d = new LinkedList();

    /* renamed from: e, reason: collision with root package name */
    private Deque<String> f4688e = new LinkedList();

    /* renamed from: f, reason: collision with root package name */
    private int f4689f = 5;

    /* renamed from: g, reason: collision with root package name */
    private int f4690g = 5;

    /* renamed from: h, reason: collision with root package name */
    private int f4691h = 1;

    /* renamed from: i, reason: collision with root package name */
    private int f4692i = 1;

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private static g f4693a = new g();
    }

    public static g a() {
        return a.f4693a;
    }

    public String b() {
        return a(this.f4692i, this.f4691h);
    }

    public synchronized String c() {
        return a(this.f4692i, this.f4691h);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String a(int i8, int i9) {
        String str;
        if (i8 == 1) {
            String c8 = c(this.f4688e);
            if (!"".equals(c8)) {
                str = "&ll_pre=" + c8;
                if (i9 == 1) {
                    return str;
                }
                String b8 = b(this.f4686c);
                if (!"".equals(b8)) {
                    str = str + "&cl_pre=" + b8;
                }
                String b9 = b(this.f4687d);
                if ("".equals(b9)) {
                    return str;
                }
                return str + "&wf_pre=" + b9;
            }
        }
        str = "";
        if (i9 == 1) {
        }
    }

    private String b(Deque<String> deque) {
        if (deque == null || deque.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        String peekFirst = deque.peekFirst();
        if (peekFirst != null) {
            try {
                String[] split = peekFirst.split(SystemInfoUtil.COMMA);
                int i8 = 0;
                for (String str : deque) {
                    if (split.length != 3) {
                        break;
                    }
                    String[] split2 = str.split(SystemInfoUtil.COMMA);
                    if (i8 == 0) {
                        sb.append(peekFirst);
                    } else if (split2.length != 3) {
                        i8++;
                    } else {
                        try {
                            sb.append((int) ((Double.parseDouble(split[0]) - Double.parseDouble(split2[0])) * Math.pow(10.0d, 6.0d)));
                            sb.append(SystemInfoUtil.COMMA);
                            sb.append((int) ((Double.parseDouble(split[1]) - Double.parseDouble(split2[1])) * Math.pow(10.0d, 6.0d)));
                            sb.append(SystemInfoUtil.COMMA);
                            sb.append(Long.parseLong(split[2]) - Long.parseLong(split2[2]));
                        } catch (Exception unused) {
                        }
                    }
                    if (i8 != deque.size() - 1) {
                        sb.append(b5.b.VERTICAL);
                    }
                    i8++;
                }
            } catch (Exception unused2) {
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0105 A[Catch: Exception -> 0x0110, TRY_LEAVE, TryCatch #0 {Exception -> 0x0110, blocks: (B:11:0x0019, B:12:0x0023, B:14:0x0029, B:16:0x0035, B:18:0x003c, B:20:0x00fd, B:22:0x0105, B:26:0x0042), top: B:10:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x010b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String c(Deque<String> deque) {
        int i8;
        if (deque == null || deque.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        String peekFirst = deque.peekFirst();
        if (peekFirst != null) {
            try {
                String[] split = peekFirst.split(SystemInfoUtil.COMMA);
                char c8 = 0;
                int i9 = 0;
                for (String str : deque) {
                    if (split.length != 7) {
                        break;
                    }
                    String[] split2 = str.split(SystemInfoUtil.COMMA);
                    if (i9 == 0) {
                        sb.append(peekFirst);
                    } else if (split2.length != 7) {
                        i9++;
                        c8 = 0;
                    } else {
                        try {
                            sb.append(Integer.parseInt(split[c8]) - Integer.parseInt(split2[c8]));
                            sb.append(SystemInfoUtil.COMMA);
                            sb.append(Integer.parseInt(split[1]) - Integer.parseInt(split2[1]));
                            sb.append(SystemInfoUtil.COMMA);
                            sb.append(new BigDecimal(split[2]).subtract(new BigDecimal(split2[2])));
                            sb.append(SystemInfoUtil.COMMA);
                            sb.append(Long.parseLong(split[3]) - Long.parseLong(split2[3]));
                            sb.append(SystemInfoUtil.COMMA);
                            sb.append(new BigDecimal(split[4]).subtract(new BigDecimal(split2[4])));
                            sb.append(SystemInfoUtil.COMMA);
                            double doubleValue = new BigDecimal(split[5]).subtract(new BigDecimal(split2[5])).doubleValue();
                            double doubleValue2 = new BigDecimal(split[6]).subtract(new BigDecimal(split2[6])).doubleValue();
                            i8 = i9;
                            try {
                                sb.append((int) (doubleValue * Math.pow(10.0d, 6.0d)));
                                sb.append(SystemInfoUtil.COMMA);
                                sb.append((int) (doubleValue2 * Math.pow(10.0d, 6.0d)));
                            } catch (Exception unused) {
                            }
                        } catch (Exception unused2) {
                        }
                        i9 = i8;
                        if (i9 == deque.size() - 1) {
                            sb.append(b5.b.VERTICAL);
                        }
                        i9++;
                        c8 = 0;
                    }
                    i8 = i9;
                    i9 = i8;
                    if (i9 == deque.size() - 1) {
                    }
                    i9++;
                    c8 = 0;
                }
            } catch (Exception unused3) {
            }
        }
        return sb.toString();
    }

    private void b(String str, Deque<String> deque) {
        if (str == null || "".equals(str)) {
            return;
        }
        deque.addAll(Arrays.asList(new String(Base64.decode(str.getBytes(), 0)).split("\\|")));
    }

    public void a(Context context) {
        if (this.f4684a == null) {
            this.f4684a = u.a().b(context);
        }
        SharedPreferences sharedPreferences = this.f4684a;
        if (sharedPreferences == null || this.f4685b) {
            return;
        }
        try {
            String string = sharedPreferences.getString("cl_pre", "");
            String string2 = this.f4684a.getString("wf_pre", "");
            String string3 = this.f4684a.getString("ll_pre", "");
            a(string, this.f4686c);
            a(string2, this.f4687d);
            b(string3, this.f4688e);
        } catch (Exception unused) {
        }
        this.f4685b = true;
    }

    public synchronized void a(BDLocation bDLocation, String str, Location location) {
        Deque<String> deque;
        String str2;
        if (bDLocation != null) {
            if ("gcj02".equals(str)) {
                String networkLocationType = bDLocation.getNetworkLocationType();
                int locType = bDLocation.getLocType();
                if (locType == 61 || locType == 161) {
                    if (networkLocationType == null) {
                        networkLocationType = "null";
                    }
                    if (networkLocationType.contains(com.crrepa.b1.g.f10873s) && this.f4691h == 1) {
                        this.f4687d.offerFirst(bDLocation.getLongitude() + SystemInfoUtil.COMMA + bDLocation.getLatitude() + SystemInfoUtil.COMMA + com.baidu.location.e.i.c(bDLocation.getTime()));
                        deque = this.f4687d;
                        str2 = com.crrepa.b1.g.f10873s;
                    } else {
                        if (!networkLocationType.contains("cl") || this.f4691h != 1) {
                            if (locType == 61 && this.f4692i == 1 && location != null) {
                                int radius = (int) bDLocation.getRadius();
                                DecimalFormat decimalFormat = new DecimalFormat("0.00");
                                DecimalFormat decimalFormat2 = new DecimalFormat("0.0");
                                DecimalFormat decimalFormat3 = new DecimalFormat("0.000000");
                                this.f4688e.offerFirst(bDLocation.getSatelliteNumber() + SystemInfoUtil.COMMA + radius + SystemInfoUtil.COMMA + decimalFormat.format(bDLocation.getAltitude()) + SystemInfoUtil.COMMA + com.baidu.location.e.i.c(bDLocation.getTime()) + SystemInfoUtil.COMMA + decimalFormat2.format(bDLocation.getSpeed()) + SystemInfoUtil.COMMA + decimalFormat3.format(location.getLongitude()) + SystemInfoUtil.COMMA + decimalFormat3.format(location.getLatitude()));
                                a(this.f4688e);
                            }
                        }
                        this.f4686c.offerFirst(bDLocation.getLongitude() + SystemInfoUtil.COMMA + bDLocation.getLatitude() + SystemInfoUtil.COMMA + com.baidu.location.e.i.c(bDLocation.getTime()));
                        deque = this.f4686c;
                        str2 = "cl";
                    }
                    a(deque, str2);
                }
            }
        }
    }

    private void a(String str, Deque<String> deque) {
        if (str == null || "".equals(str)) {
            return;
        }
        deque.addAll(Arrays.asList(new String(Base64.decode(str.getBytes(), 0)).split("\\|")));
    }

    private void a(Deque<String> deque) {
        if (deque == null || deque.isEmpty()) {
            return;
        }
        while (deque.size() > this.f4690g) {
            deque.pollLast();
        }
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = deque.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            sb.append(it.next());
            if (i8 != deque.size() - 1) {
                sb.append(b5.b.VERTICAL);
            }
            i8++;
        }
        try {
            String str = new String(Base64.encode(sb.toString().getBytes(), 0));
            SharedPreferences.Editor edit = this.f4684a.edit();
            edit.putString("ll_pre", str);
            edit.apply();
        } catch (Exception unused) {
        }
    }

    private void a(Deque<String> deque, String str) {
        if (deque == null || deque.isEmpty()) {
            return;
        }
        while (deque.size() > this.f4689f) {
            deque.pollLast();
        }
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = deque.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            sb.append(it.next());
            if (i8 != deque.size() - 1) {
                sb.append(b5.b.VERTICAL);
            }
            i8++;
        }
        try {
            String str2 = new String(Base64.encode(sb.toString().getBytes(), 0));
            SharedPreferences.Editor edit = this.f4684a.edit();
            edit.putString(str + "_pre", str2);
            edit.apply();
        } catch (Exception unused) {
        }
    }
}
