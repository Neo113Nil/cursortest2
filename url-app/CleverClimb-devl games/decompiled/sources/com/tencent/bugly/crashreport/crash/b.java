package com.tencent.bugly.crashreport.crash;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.facebook.ads.AudienceNetworkActivity;
import com.tencent.bugly.BuglyStrategy;
import com.tencent.bugly.crashreport.common.info.PlugInBean;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.proguard.ah;
import com.tencent.bugly.proguard.aj;
import com.tencent.bugly.proguard.ak;
import com.tencent.bugly.proguard.al;
import com.tencent.bugly.proguard.am;
import com.tencent.bugly.proguard.k;
import com.tencent.bugly.proguard.o;
import com.tencent.bugly.proguard.p;
import com.tencent.bugly.proguard.r;
import com.tencent.bugly.proguard.t;
import com.tencent.bugly.proguard.u;
import com.tencent.bugly.proguard.x;
import com.tencent.bugly.proguard.z;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: BUGLY */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static int f8645a;

    /* renamed from: b, reason: collision with root package name */
    private Context f8646b;

    /* renamed from: c, reason: collision with root package name */
    private u f8647c;

    /* renamed from: d, reason: collision with root package name */
    private p f8648d;
    private com.tencent.bugly.crashreport.common.strategy.a e;
    private o f;
    private BuglyStrategy.a g;

    public b(int i, Context context, u uVar, p pVar, com.tencent.bugly.crashreport.common.strategy.a aVar, BuglyStrategy.a aVar2, o oVar) {
        f8645a = i;
        this.f8646b = context;
        this.f8647c = uVar;
        this.f8648d = pVar;
        this.e = aVar;
        this.g = aVar2;
        this.f = oVar;
    }

    private static List<a> a(List<a> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        for (a aVar : list) {
            if (aVar.f8626d && aVar.f8624b <= currentTimeMillis - 86400000) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    private CrashDetailBean a(List<a> list, CrashDetailBean crashDetailBean) {
        List<CrashDetailBean> b2;
        String[] split;
        if (list == null || list.size() == 0) {
            return crashDetailBean;
        }
        CrashDetailBean crashDetailBean2 = null;
        ArrayList arrayList = new ArrayList(10);
        for (a aVar : list) {
            if (aVar.e) {
                arrayList.add(aVar);
            }
        }
        if (arrayList.size() > 0 && (b2 = b(arrayList)) != null && b2.size() > 0) {
            Collections.sort(b2);
            CrashDetailBean crashDetailBean3 = null;
            for (int i = 0; i < b2.size(); i++) {
                CrashDetailBean crashDetailBean4 = b2.get(i);
                if (i == 0) {
                    crashDetailBean3 = crashDetailBean4;
                } else if (crashDetailBean4.s != null && (split = crashDetailBean4.s.split("\n")) != null) {
                    for (String str : split) {
                        if (!crashDetailBean3.s.contains(str)) {
                            crashDetailBean3.t++;
                            crashDetailBean3.s += str + "\n";
                        }
                    }
                }
            }
            crashDetailBean2 = crashDetailBean3;
        }
        if (crashDetailBean2 == null) {
            crashDetailBean.j = true;
            crashDetailBean.t = 0;
            crashDetailBean.s = "";
            crashDetailBean2 = crashDetailBean;
        }
        for (a aVar2 : list) {
            if (!aVar2.e && !aVar2.f8626d) {
                String str2 = crashDetailBean2.s;
                StringBuilder sb = new StringBuilder();
                sb.append(aVar2.f8624b);
                if (!str2.contains(sb.toString())) {
                    crashDetailBean2.t++;
                    crashDetailBean2.s += aVar2.f8624b + "\n";
                }
            }
        }
        if (crashDetailBean2.r != crashDetailBean.r) {
            String str3 = crashDetailBean2.s;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(crashDetailBean.r);
            if (!str3.contains(sb2.toString())) {
                crashDetailBean2.t++;
                crashDetailBean2.s += crashDetailBean.r + "\n";
            }
        }
        return crashDetailBean2;
    }

    public final boolean a(CrashDetailBean crashDetailBean) {
        return a(crashDetailBean, -123456789);
    }

    public final boolean a(CrashDetailBean crashDetailBean, int i) {
        if (crashDetailBean == null) {
            return true;
        }
        if (c.m != null && !c.m.isEmpty()) {
            x.c("Crash filter for crash stack is: %s", c.m);
            if (crashDetailBean.q.contains(c.m)) {
                x.d("This crash contains the filter string set. It will not be record and upload.", new Object[0]);
                return true;
            }
        }
        if (c.n != null && !c.n.isEmpty()) {
            x.c("Crash regular filter for crash stack is: %s", c.n);
            if (Pattern.compile(c.n).matcher(crashDetailBean.q).find()) {
                x.d("This crash matches the regular filter string set. It will not be record and upload.", new Object[0]);
                return true;
            }
        }
        int i2 = crashDetailBean.f8620b;
        String str = crashDetailBean.n;
        String str2 = crashDetailBean.p;
        String str3 = crashDetailBean.q;
        long j = crashDetailBean.r;
        String str4 = crashDetailBean.m;
        String str5 = crashDetailBean.e;
        String str6 = crashDetailBean.f8621c;
        if (this.f != null) {
            o oVar = this.f;
            String str7 = crashDetailBean.z;
            if (!oVar.c()) {
                x.d("Crash listener 'onCrashSaving' return 'false' thus will not handle this crash.", new Object[0]);
                return true;
            }
        }
        if (crashDetailBean.f8620b != 2) {
            r rVar = new r();
            rVar.f8777b = 1;
            rVar.f8778c = crashDetailBean.z;
            rVar.f8779d = crashDetailBean.A;
            rVar.e = crashDetailBean.r;
            this.f8648d.b(1);
            this.f8648d.a(rVar);
            x.b("[crash] a crash occur, handling...", new Object[0]);
        } else {
            x.b("[crash] a caught exception occur, handling...", new Object[0]);
        }
        List<a> b2 = b();
        ArrayList arrayList = null;
        if (b2 != null && b2.size() > 0) {
            arrayList = new ArrayList(10);
            ArrayList arrayList2 = new ArrayList(10);
            arrayList.addAll(a(b2));
            b2.removeAll(arrayList);
            if (!com.tencent.bugly.b.f8566c && c.f8654d) {
                boolean z = false;
                for (a aVar : b2) {
                    if (crashDetailBean.u.equals(aVar.f8625c)) {
                        if (aVar.e) {
                            z = true;
                        }
                        arrayList2.add(aVar);
                    }
                }
                if (z || arrayList2.size() >= c.f8653c) {
                    x.a("same crash occur too much do merged!", new Object[0]);
                    CrashDetailBean a2 = a(arrayList2, crashDetailBean);
                    for (a aVar2 : arrayList2) {
                        if (aVar2.f8623a != a2.f8619a) {
                            arrayList.add(aVar2);
                        }
                    }
                    d(a2);
                    c(arrayList);
                    x.b("[crash] save crash success. For this device crash many times, it will not upload crashes immediately", new Object[0]);
                    return true;
                }
            }
        }
        d(crashDetailBean);
        if (arrayList != null && !arrayList.isEmpty()) {
            c(arrayList);
        }
        x.b("[crash] save crash success", new Object[0]);
        return false;
    }

    public final List<CrashDetailBean> a() {
        StrategyBean c2 = com.tencent.bugly.crashreport.common.strategy.a.a().c();
        if (c2 == null) {
            x.d("have not synced remote!", new Object[0]);
            return null;
        }
        if (!c2.g) {
            x.d("Crashreport remote closed, please check your APP ID correct and Version available, then uninstall and reinstall your app.", new Object[0]);
            x.b("[init] WARNING! Crashreport closed by server, please check your APP ID correct and Version available, then uninstall and reinstall your app.", new Object[0]);
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long b2 = z.b();
        List<a> b3 = b();
        if (b3 == null || b3.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<a> it = b3.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (next.f8624b < b2 - c.g) {
                it.remove();
                arrayList.add(next);
            } else if (next.f8626d) {
                if (next.f8624b >= currentTimeMillis - 86400000) {
                    it.remove();
                } else if (!next.e) {
                    it.remove();
                    arrayList.add(next);
                }
            } else if (next.f >= 3 && next.f8624b < currentTimeMillis - 86400000) {
                it.remove();
                arrayList.add(next);
            }
        }
        if (arrayList.size() > 0) {
            c(arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        List<CrashDetailBean> b4 = b(b3);
        if (b4 != null && b4.size() > 0) {
            String str = com.tencent.bugly.crashreport.common.info.a.b().j;
            Iterator<CrashDetailBean> it2 = b4.iterator();
            while (it2.hasNext()) {
                CrashDetailBean next2 = it2.next();
                if (!str.equals(next2.f)) {
                    it2.remove();
                    arrayList2.add(next2);
                }
            }
        }
        if (arrayList2.size() > 0) {
            d(arrayList2);
        }
        return b4;
    }

    public final void b(CrashDetailBean crashDetailBean) {
        if (this.f != null) {
            o oVar = this.f;
            int i = crashDetailBean.f8620b;
        }
    }

    public final void a(CrashDetailBean crashDetailBean, long j, boolean z) {
        if (c.l) {
            x.a("try to upload right now", new Object[0]);
            ArrayList arrayList = new ArrayList();
            arrayList.add(crashDetailBean);
            a(arrayList, 3000L, z, crashDetailBean.f8620b == 7, z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00a9 A[Catch: Throwable -> 0x00eb, TryCatch #0 {Throwable -> 0x00eb, blocks: (B:20:0x0043, B:22:0x0049, B:23:0x004e, B:25:0x0055, B:26:0x005a, B:29:0x0066, B:32:0x0070, B:36:0x0079, B:37:0x0089, B:39:0x008f, B:42:0x00a9, B:44:0x00b1, B:46:0x00b7, B:48:0x00bf, B:50:0x00c7, B:52:0x00cf, B:54:0x00d6, B:56:0x00e2, B:58:0x009f, B:60:0x0058, B:61:0x004c), top: B:19:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1 A[Catch: Throwable -> 0x00eb, TryCatch #0 {Throwable -> 0x00eb, blocks: (B:20:0x0043, B:22:0x0049, B:23:0x004e, B:25:0x0055, B:26:0x005a, B:29:0x0066, B:32:0x0070, B:36:0x0079, B:37:0x0089, B:39:0x008f, B:42:0x00a9, B:44:0x00b1, B:46:0x00b7, B:48:0x00bf, B:50:0x00c7, B:52:0x00cf, B:54:0x00d6, B:56:0x00e2, B:58:0x009f, B:60:0x0058, B:61:0x004c), top: B:19:0x0043 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(final List<CrashDetailBean> list, long j, boolean z, boolean z2, boolean z3) {
        al alVar;
        if (!com.tencent.bugly.crashreport.common.info.a.a(this.f8646b).e || this.f8647c == null) {
            return;
        }
        if (!z3 && !this.f8647c.b(c.f8651a)) {
            return;
        }
        StrategyBean c2 = this.e.c();
        if (!c2.g) {
            x.d("remote report is disable!", new Object[0]);
            x.b("[crash] server closed bugly in this app. please check your appid if is correct, and re-install it", new Object[0]);
            return;
        }
        if (list == null || list.size() == 0) {
            return;
        }
        try {
            String str = this.f8647c.f8784a ? c2.s : c2.t;
            String str2 = this.f8647c.f8784a ? StrategyBean.f8606c : StrategyBean.f8604a;
            int i = this.f8647c.f8784a ? 830 : 630;
            Context context = this.f8646b;
            com.tencent.bugly.crashreport.common.info.a b2 = com.tencent.bugly.crashreport.common.info.a.b();
            if (context != null && list != null && list.size() != 0 && b2 != null) {
                alVar = new al();
                alVar.f8715a = new ArrayList<>();
                Iterator<CrashDetailBean> it = list.iterator();
                while (it.hasNext()) {
                    alVar.f8715a.add(a(context, it.next(), b2));
                }
                if (alVar != null) {
                    x.d("create eupPkg fail!", new Object[0]);
                    return;
                }
                byte[] a2 = com.tencent.bugly.proguard.a.a((k) alVar);
                if (a2 == null) {
                    x.d("send encode fail!", new Object[0]);
                    return;
                }
                am a3 = com.tencent.bugly.proguard.a.a(this.f8646b, i, a2);
                if (a3 == null) {
                    x.d("request package is null.", new Object[0]);
                    return;
                }
                t tVar = new t() { // from class: com.tencent.bugly.crashreport.crash.b.1
                    @Override // com.tencent.bugly.proguard.t
                    public final void a(boolean z4) {
                        b bVar = b.this;
                        b.a(z4, (List<CrashDetailBean>) list);
                    }
                };
                if (z) {
                    this.f8647c.a(f8645a, a3, str, str2, tVar, j, z2);
                    return;
                } else {
                    this.f8647c.a(f8645a, a3, str, str2, tVar, false);
                    return;
                }
            }
            x.d("enEXPPkg args == null!", new Object[0]);
            alVar = null;
            if (alVar != null) {
            }
        } catch (Throwable th) {
            x.e("req cr error %s", th.toString());
            if (x.b(th)) {
                return;
            }
            th.printStackTrace();
        }
    }

    public static void a(boolean z, List<CrashDetailBean> list) {
        if (list != null && list.size() > 0) {
            x.c("up finish update state %b", Boolean.valueOf(z));
            for (CrashDetailBean crashDetailBean : list) {
                x.c("pre uid:%s uc:%d re:%b me:%b", crashDetailBean.f8621c, Integer.valueOf(crashDetailBean.l), Boolean.valueOf(crashDetailBean.f8622d), Boolean.valueOf(crashDetailBean.j));
                crashDetailBean.l++;
                crashDetailBean.f8622d = z;
                x.c("set uid:%s uc:%d re:%b me:%b", crashDetailBean.f8621c, Integer.valueOf(crashDetailBean.l), Boolean.valueOf(crashDetailBean.f8622d), Boolean.valueOf(crashDetailBean.j));
            }
            Iterator<CrashDetailBean> it = list.iterator();
            while (it.hasNext()) {
                c.a().a(it.next());
            }
            x.c("update state size %d", Integer.valueOf(list.size()));
        }
        if (z) {
            return;
        }
        x.b("[crash] upload fail.", new Object[0]);
    }

    public final void c(CrashDetailBean crashDetailBean) {
        int i;
        Map<String, String> onCrashHandleStart;
        String str;
        HashMap hashMap;
        if (crashDetailBean == null) {
            return;
        }
        if (this.g == null && this.f == null) {
            return;
        }
        try {
            x.a("[crash callback] start user's callback:onCrashHandleStart()", new Object[0]);
            switch (crashDetailBean.f8620b) {
                case 0:
                    i = 0;
                    break;
                case 1:
                    i = 2;
                    break;
                case 2:
                    i = 1;
                    break;
                case 3:
                    i = 4;
                    break;
                case 4:
                    i = 3;
                    break;
                case 5:
                    i = 5;
                    break;
                case 6:
                    i = 6;
                    break;
                case 7:
                    i = 7;
                    break;
                default:
                    return;
            }
            int i2 = crashDetailBean.f8620b;
            String str2 = crashDetailBean.n;
            String str3 = crashDetailBean.p;
            String str4 = crashDetailBean.q;
            long j = crashDetailBean.r;
            byte[] bArr = null;
            if (this.f != null) {
                o oVar = this.f;
                String b2 = this.f.b();
                if (b2 != null) {
                    hashMap = new HashMap(1);
                    hashMap.put("userData", b2);
                } else {
                    hashMap = null;
                }
                onCrashHandleStart = hashMap;
            } else {
                onCrashHandleStart = this.g != null ? this.g.onCrashHandleStart(i, crashDetailBean.n, crashDetailBean.o, crashDetailBean.q) : null;
            }
            if (onCrashHandleStart != null && onCrashHandleStart.size() > 0) {
                crashDetailBean.N = new LinkedHashMap(onCrashHandleStart.size());
                for (Map.Entry<String, String> entry : onCrashHandleStart.entrySet()) {
                    if (!z.a(entry.getKey())) {
                        String key = entry.getKey();
                        if (key.length() > 100) {
                            key = key.substring(0, 100);
                            x.d("setted key length is over limit %d substring to %s", 100, key);
                        }
                        if (!z.a(entry.getValue()) && entry.getValue().length() > 30000) {
                            str = entry.getValue().substring(entry.getValue().length() - 30000);
                            x.d("setted %s value length is over limit %d substring", key, 30000);
                        } else {
                            str = entry.getValue();
                        }
                        crashDetailBean.N.put(key, str);
                        x.a("add setted key %s value size:%d", key, Integer.valueOf(str.length()));
                    }
                }
            }
            x.a("[crash callback] start user's callback:onCrashHandleStart2GetExtraDatas()", new Object[0]);
            if (this.f != null) {
                bArr = this.f.a();
            } else if (this.g != null) {
                bArr = this.g.onCrashHandleStart2GetExtraDatas(i, crashDetailBean.n, crashDetailBean.o, crashDetailBean.q);
            }
            crashDetailBean.S = bArr;
            if (crashDetailBean.S != null) {
                if (crashDetailBean.S.length > 30000) {
                    x.d("extra bytes size %d is over limit %d will drop over part", Integer.valueOf(crashDetailBean.S.length), 30000);
                }
                x.a("add extra bytes %d ", Integer.valueOf(crashDetailBean.S.length));
            }
        } catch (Throwable th) {
            x.d("crash handle callback somthing wrong! %s", th.getClass().getName());
            if (x.a(th)) {
                return;
            }
            th.printStackTrace();
        }
    }

    private static ContentValues e(CrashDetailBean crashDetailBean) {
        if (crashDetailBean == null) {
            return null;
        }
        try {
            ContentValues contentValues = new ContentValues();
            if (crashDetailBean.f8619a > 0) {
                contentValues.put("_id", Long.valueOf(crashDetailBean.f8619a));
            }
            contentValues.put("_tm", Long.valueOf(crashDetailBean.r));
            contentValues.put("_s1", crashDetailBean.u);
            contentValues.put("_up", Integer.valueOf(crashDetailBean.f8622d ? 1 : 0));
            contentValues.put("_me", Integer.valueOf(crashDetailBean.j ? 1 : 0));
            contentValues.put("_uc", Integer.valueOf(crashDetailBean.l));
            contentValues.put("_dt", z.a(crashDetailBean));
            return contentValues;
        } catch (Throwable th) {
            if (!x.a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    private static CrashDetailBean a(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        try {
            byte[] blob = cursor.getBlob(cursor.getColumnIndex("_dt"));
            if (blob == null) {
                return null;
            }
            long j = cursor.getLong(cursor.getColumnIndex("_id"));
            CrashDetailBean crashDetailBean = (CrashDetailBean) z.a(blob, CrashDetailBean.CREATOR);
            if (crashDetailBean != null) {
                crashDetailBean.f8619a = j;
            }
            return crashDetailBean;
        } catch (Throwable th) {
            if (!x.a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    public final void d(CrashDetailBean crashDetailBean) {
        ContentValues e;
        if (crashDetailBean == null || (e = e(crashDetailBean)) == null) {
            return;
        }
        long a2 = p.a().a("t_cr", e, (o) null, true);
        if (a2 >= 0) {
            x.c("insert %s success!", "t_cr");
            crashDetailBean.f8619a = a2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private List<CrashDetailBean> b(List<a> list) {
        Cursor cursor;
        if (list == null || list.size() == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (a aVar : list) {
            sb.append(" or _id");
            sb.append(" = ");
            sb.append(aVar.f8623a);
        }
        String sb2 = sb.toString();
        if (sb2.length() > 0) {
            sb2 = sb2.substring(4);
        }
        String str = sb2;
        sb.setLength(0);
        try {
            cursor = p.a().a("t_cr", null, str, null, null, true);
            if (cursor == null) {
                if (cursor != null) {
                    cursor.close();
                }
                return null;
            }
            try {
                try {
                    ArrayList arrayList = new ArrayList();
                    while (cursor.moveToNext()) {
                        CrashDetailBean a2 = a(cursor);
                        if (a2 != null) {
                            arrayList.add(a2);
                        } else {
                            try {
                                long j = cursor.getLong(cursor.getColumnIndex("_id"));
                                sb.append(" or _id");
                                sb.append(" = ");
                                sb.append(j);
                            } catch (Throwable unused) {
                                x.d("unknown id!", new Object[0]);
                            }
                        }
                    }
                    String sb3 = sb.toString();
                    if (sb3.length() > 0) {
                        x.d("deleted %s illegle data %d", "t_cr", Integer.valueOf(p.a().a("t_cr", sb3.substring(4), (String[]) null, (o) null, true)));
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    return arrayList;
                } catch (Throwable th) {
                    th = th;
                    if (!x.a(th)) {
                        th.printStackTrace();
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
    }

    private static a b(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        try {
            a aVar = new a();
            aVar.f8623a = cursor.getLong(cursor.getColumnIndex("_id"));
            aVar.f8624b = cursor.getLong(cursor.getColumnIndex("_tm"));
            aVar.f8625c = cursor.getString(cursor.getColumnIndex("_s1"));
            aVar.f8626d = cursor.getInt(cursor.getColumnIndex("_up")) == 1;
            aVar.e = cursor.getInt(cursor.getColumnIndex("_me")) == 1;
            aVar.f = cursor.getInt(cursor.getColumnIndex("_uc"));
            return aVar;
        } catch (Throwable th) {
            if (!x.a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private List<a> b() {
        Throwable th;
        Cursor cursor;
        ArrayList arrayList = new ArrayList();
        try {
            cursor = p.a().a("t_cr", new String[]{"_id", "_tm", "_s1", "_up", "_me", "_uc"}, null, null, null, true);
            if (cursor == null) {
                if (cursor != null) {
                    cursor.close();
                }
                return null;
            }
            try {
                try {
                    StringBuilder sb = new StringBuilder();
                    while (cursor.moveToNext()) {
                        a b2 = b(cursor);
                        if (b2 != null) {
                            arrayList.add(b2);
                        } else {
                            try {
                                long j = cursor.getLong(cursor.getColumnIndex("_id"));
                                sb.append(" or _id");
                                sb.append(" = ");
                                sb.append(j);
                            } catch (Throwable unused) {
                                x.d("unknown id!", new Object[0]);
                            }
                        }
                    }
                    String sb2 = sb.toString();
                    if (sb2.length() > 0) {
                        x.d("deleted %s illegle data %d", "t_cr", Integer.valueOf(p.a().a("t_cr", sb2.substring(4), (String[]) null, (o) null, true)));
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    return arrayList;
                } catch (Throwable th2) {
                    th = th2;
                    if (!x.a(th)) {
                        th.printStackTrace();
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    return arrayList;
                }
            } catch (Throwable th3) {
                th = th3;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            cursor = null;
        }
    }

    private static void c(List<a> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (a aVar : list) {
            sb.append(" or _id");
            sb.append(" = ");
            sb.append(aVar.f8623a);
        }
        String sb2 = sb.toString();
        if (sb2.length() > 0) {
            sb2 = sb2.substring(4);
        }
        String str = sb2;
        sb.setLength(0);
        try {
            x.c("deleted %s data %d", "t_cr", Integer.valueOf(p.a().a("t_cr", str, (String[]) null, (o) null, true)));
        } catch (Throwable th) {
            if (x.a(th)) {
                return;
            }
            th.printStackTrace();
        }
    }

    private static void d(List<CrashDetailBean> list) {
        if (list != null) {
            try {
                if (list.size() == 0) {
                    return;
                }
                StringBuilder sb = new StringBuilder();
                for (CrashDetailBean crashDetailBean : list) {
                    sb.append(" or _id");
                    sb.append(" = ");
                    sb.append(crashDetailBean.f8619a);
                }
                String sb2 = sb.toString();
                if (sb2.length() > 0) {
                    sb2 = sb2.substring(4);
                }
                sb.setLength(0);
                x.c("deleted %s data %d", "t_cr", Integer.valueOf(p.a().a("t_cr", sb2, (String[]) null, (o) null, true)));
            } catch (Throwable th) {
                if (x.a(th)) {
                    return;
                }
                th.printStackTrace();
            }
        }
    }

    private static ak a(Context context, CrashDetailBean crashDetailBean, com.tencent.bugly.crashreport.common.info.a aVar) {
        aj a2;
        aj a3;
        aj ajVar;
        if (context == null || crashDetailBean == null || aVar == null) {
            x.d("enExp args == null", new Object[0]);
            return null;
        }
        ak akVar = new ak();
        switch (crashDetailBean.f8620b) {
            case 0:
                akVar.f8710a = crashDetailBean.j ? "200" : "100";
                break;
            case 1:
                akVar.f8710a = crashDetailBean.j ? "201" : "101";
                break;
            case 2:
                akVar.f8710a = crashDetailBean.j ? "202" : "102";
                break;
            case 3:
                akVar.f8710a = crashDetailBean.j ? "203" : "103";
                break;
            case 4:
                akVar.f8710a = crashDetailBean.j ? "204" : "104";
                break;
            case 5:
                akVar.f8710a = crashDetailBean.j ? "207" : "107";
                break;
            case 6:
                akVar.f8710a = crashDetailBean.j ? "206" : "106";
                break;
            case 7:
                akVar.f8710a = crashDetailBean.j ? "208" : "108";
                break;
            default:
                x.e("crash type error! %d", Integer.valueOf(crashDetailBean.f8620b));
                break;
        }
        akVar.f8711b = crashDetailBean.r;
        akVar.f8712c = crashDetailBean.n;
        akVar.f8713d = crashDetailBean.o;
        akVar.e = crashDetailBean.p;
        akVar.g = crashDetailBean.q;
        akVar.h = crashDetailBean.y;
        akVar.i = crashDetailBean.f8621c;
        akVar.j = null;
        akVar.l = crashDetailBean.m;
        akVar.m = crashDetailBean.e;
        akVar.f = crashDetailBean.A;
        akVar.t = com.tencent.bugly.crashreport.common.info.a.b().i();
        akVar.n = null;
        if (crashDetailBean.i != null && crashDetailBean.i.size() > 0) {
            akVar.o = new ArrayList<>();
            for (Map.Entry<String, PlugInBean> entry : crashDetailBean.i.entrySet()) {
                ah ahVar = new ah();
                ahVar.f8699a = entry.getValue().f8595a;
                ahVar.f8701c = entry.getValue().f8597c;
                ahVar.f8702d = entry.getValue().f8596b;
                ahVar.f8700b = aVar.r();
                akVar.o.add(ahVar);
            }
        }
        if (crashDetailBean.h != null && crashDetailBean.h.size() > 0) {
            akVar.p = new ArrayList<>();
            for (Map.Entry<String, PlugInBean> entry2 : crashDetailBean.h.entrySet()) {
                ah ahVar2 = new ah();
                ahVar2.f8699a = entry2.getValue().f8595a;
                ahVar2.f8701c = entry2.getValue().f8597c;
                ahVar2.f8702d = entry2.getValue().f8596b;
                akVar.p.add(ahVar2);
            }
        }
        if (crashDetailBean.j) {
            akVar.k = crashDetailBean.t;
            if (crashDetailBean.s != null && crashDetailBean.s.length() > 0) {
                if (akVar.q == null) {
                    akVar.q = new ArrayList<>();
                }
                try {
                    akVar.q.add(new aj((byte) 1, "alltimes.txt", crashDetailBean.s.getBytes(AudienceNetworkActivity.WEBVIEW_ENCODING)));
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                    akVar.q = null;
                }
            }
            Object[] objArr = new Object[2];
            objArr[0] = Integer.valueOf(akVar.k);
            objArr[1] = Integer.valueOf(akVar.q != null ? akVar.q.size() : 0);
            x.c("crashcount:%d sz:%d", objArr);
        }
        if (crashDetailBean.w != null) {
            if (akVar.q == null) {
                akVar.q = new ArrayList<>();
            }
            try {
                akVar.q.add(new aj((byte) 1, "log.txt", crashDetailBean.w.getBytes(AudienceNetworkActivity.WEBVIEW_ENCODING)));
            } catch (UnsupportedEncodingException e2) {
                e2.printStackTrace();
                akVar.q = null;
            }
        }
        if (!z.a(crashDetailBean.T)) {
            if (akVar.q == null) {
                akVar.q = new ArrayList<>();
            }
            try {
                ajVar = new aj((byte) 1, "crashInfos.txt", crashDetailBean.T.getBytes(AudienceNetworkActivity.WEBVIEW_ENCODING));
            } catch (UnsupportedEncodingException e3) {
                e3.printStackTrace();
                ajVar = null;
            }
            if (ajVar != null) {
                x.c("attach crash infos", new Object[0]);
                akVar.q.add(ajVar);
            }
        }
        if (crashDetailBean.U != null) {
            if (akVar.q == null) {
                akVar.q = new ArrayList<>();
            }
            aj a4 = a("backupRecord.zip", context, crashDetailBean.U);
            if (a4 != null) {
                x.c("attach backup record", new Object[0]);
                akVar.q.add(a4);
            }
        }
        if (crashDetailBean.x != null && crashDetailBean.x.length > 0) {
            aj ajVar2 = new aj((byte) 2, "buglylog.zip", crashDetailBean.x);
            x.c("attach user log", new Object[0]);
            if (akVar.q == null) {
                akVar.q = new ArrayList<>();
            }
            akVar.q.add(ajVar2);
        }
        if (crashDetailBean.f8620b == 3) {
            if (akVar.q == null) {
                akVar.q = new ArrayList<>();
            }
            if (crashDetailBean.N != null && crashDetailBean.N.containsKey("BUGLY_CR_01")) {
                try {
                    akVar.q.add(new aj((byte) 1, "anrMessage.txt", crashDetailBean.N.get("BUGLY_CR_01").getBytes(AudienceNetworkActivity.WEBVIEW_ENCODING)));
                    x.c("attach anr message", new Object[0]);
                } catch (UnsupportedEncodingException e4) {
                    e4.printStackTrace();
                    akVar.q = null;
                }
                crashDetailBean.N.remove("BUGLY_CR_01");
            }
            if (crashDetailBean.v != null && (a3 = a("trace.zip", context, crashDetailBean.v)) != null) {
                x.c("attach traces", new Object[0]);
                akVar.q.add(a3);
            }
        }
        if (crashDetailBean.f8620b == 1) {
            if (akVar.q == null) {
                akVar.q = new ArrayList<>();
            }
            if (crashDetailBean.v != null && (a2 = a("tomb.zip", context, crashDetailBean.v)) != null) {
                x.c("attach tombs", new Object[0]);
                akVar.q.add(a2);
            }
        }
        if (aVar.C != null && !aVar.C.isEmpty()) {
            if (akVar.q == null) {
                akVar.q = new ArrayList<>();
            }
            StringBuilder sb = new StringBuilder();
            Iterator<String> it = aVar.C.iterator();
            while (it.hasNext()) {
                sb.append(it.next());
            }
            try {
                akVar.q.add(new aj((byte) 1, "martianlog.txt", sb.toString().getBytes(AudienceNetworkActivity.WEBVIEW_ENCODING)));
                x.c("attach pageTracingList", new Object[0]);
            } catch (UnsupportedEncodingException e5) {
                e5.printStackTrace();
            }
        }
        if (crashDetailBean.S != null && crashDetailBean.S.length > 0) {
            if (akVar.q == null) {
                akVar.q = new ArrayList<>();
            }
            akVar.q.add(new aj((byte) 1, "userExtraByteData", crashDetailBean.S));
            x.c("attach extraData", new Object[0]);
        }
        akVar.r = new HashMap();
        Map<String, String> map = akVar.r;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(crashDetailBean.B);
        map.put("A9", sb2.toString());
        Map<String, String> map2 = akVar.r;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(crashDetailBean.C);
        map2.put("A11", sb3.toString());
        Map<String, String> map3 = akVar.r;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(crashDetailBean.D);
        map3.put("A10", sb4.toString());
        akVar.r.put("A23", crashDetailBean.f);
        akVar.r.put("A7", aVar.f);
        akVar.r.put("A6", aVar.s());
        akVar.r.put("A5", aVar.r());
        akVar.r.put("A22", aVar.h());
        Map<String, String> map4 = akVar.r;
        StringBuilder sb5 = new StringBuilder();
        sb5.append(crashDetailBean.F);
        map4.put("A2", sb5.toString());
        Map<String, String> map5 = akVar.r;
        StringBuilder sb6 = new StringBuilder();
        sb6.append(crashDetailBean.E);
        map5.put("A1", sb6.toString());
        akVar.r.put("A24", aVar.h);
        Map<String, String> map6 = akVar.r;
        StringBuilder sb7 = new StringBuilder();
        sb7.append(crashDetailBean.G);
        map6.put("A17", sb7.toString());
        akVar.r.put("A3", aVar.k());
        akVar.r.put("A16", aVar.m());
        akVar.r.put("A25", aVar.n());
        akVar.r.put("A14", aVar.l());
        akVar.r.put("A15", aVar.w());
        Map<String, String> map7 = akVar.r;
        StringBuilder sb8 = new StringBuilder();
        sb8.append(aVar.x());
        map7.put("A13", sb8.toString());
        akVar.r.put("A34", crashDetailBean.z);
        if (aVar.x != null) {
            akVar.r.put("productIdentify", aVar.x);
        }
        try {
            akVar.r.put("A26", URLEncoder.encode(crashDetailBean.H, AudienceNetworkActivity.WEBVIEW_ENCODING));
        } catch (UnsupportedEncodingException e6) {
            e6.printStackTrace();
        }
        if (crashDetailBean.f8620b == 1) {
            akVar.r.put("A27", crashDetailBean.J);
            akVar.r.put("A28", crashDetailBean.I);
            Map<String, String> map8 = akVar.r;
            StringBuilder sb9 = new StringBuilder();
            sb9.append(crashDetailBean.k);
            map8.put("A29", sb9.toString());
        }
        akVar.r.put("A30", crashDetailBean.K);
        Map<String, String> map9 = akVar.r;
        StringBuilder sb10 = new StringBuilder();
        sb10.append(crashDetailBean.L);
        map9.put("A18", sb10.toString());
        Map<String, String> map10 = akVar.r;
        StringBuilder sb11 = new StringBuilder();
        sb11.append(!crashDetailBean.M);
        map10.put("A36", sb11.toString());
        Map<String, String> map11 = akVar.r;
        StringBuilder sb12 = new StringBuilder();
        sb12.append(aVar.q);
        map11.put("F02", sb12.toString());
        Map<String, String> map12 = akVar.r;
        StringBuilder sb13 = new StringBuilder();
        sb13.append(aVar.r);
        map12.put("F03", sb13.toString());
        akVar.r.put("F04", aVar.e());
        Map<String, String> map13 = akVar.r;
        StringBuilder sb14 = new StringBuilder();
        sb14.append(aVar.s);
        map13.put("F05", sb14.toString());
        akVar.r.put("F06", aVar.p);
        akVar.r.put("F08", aVar.v);
        akVar.r.put("F09", aVar.w);
        Map<String, String> map14 = akVar.r;
        StringBuilder sb15 = new StringBuilder();
        sb15.append(aVar.t);
        map14.put("F10", sb15.toString());
        if (crashDetailBean.O >= 0) {
            Map<String, String> map15 = akVar.r;
            StringBuilder sb16 = new StringBuilder();
            sb16.append(crashDetailBean.O);
            map15.put("C01", sb16.toString());
        }
        if (crashDetailBean.P >= 0) {
            Map<String, String> map16 = akVar.r;
            StringBuilder sb17 = new StringBuilder();
            sb17.append(crashDetailBean.P);
            map16.put("C02", sb17.toString());
        }
        if (crashDetailBean.Q != null && crashDetailBean.Q.size() > 0) {
            for (Map.Entry<String, String> entry3 : crashDetailBean.Q.entrySet()) {
                akVar.r.put("C03_" + entry3.getKey(), entry3.getValue());
            }
        }
        if (crashDetailBean.R != null && crashDetailBean.R.size() > 0) {
            for (Map.Entry<String, String> entry4 : crashDetailBean.R.entrySet()) {
                akVar.r.put("C04_" + entry4.getKey(), entry4.getValue());
            }
        }
        akVar.s = null;
        if (crashDetailBean.N != null && crashDetailBean.N.size() > 0) {
            akVar.s = crashDetailBean.N;
            x.a("setted message size %d", Integer.valueOf(akVar.s.size()));
        }
        Object[] objArr2 = new Object[12];
        objArr2[0] = crashDetailBean.n;
        objArr2[1] = crashDetailBean.f8621c;
        objArr2[2] = aVar.e();
        objArr2[3] = Long.valueOf((crashDetailBean.r - crashDetailBean.L) / 1000);
        objArr2[4] = Boolean.valueOf(crashDetailBean.k);
        objArr2[5] = Boolean.valueOf(crashDetailBean.M);
        objArr2[6] = Boolean.valueOf(crashDetailBean.j);
        objArr2[7] = Boolean.valueOf(crashDetailBean.f8620b == 1);
        objArr2[8] = Integer.valueOf(crashDetailBean.t);
        objArr2[9] = crashDetailBean.s;
        objArr2[10] = Boolean.valueOf(crashDetailBean.f8622d);
        objArr2[11] = Integer.valueOf(akVar.r.size());
        x.c("%s rid:%s sess:%s ls:%ds isR:%b isF:%b isM:%b isN:%b mc:%d ,%s ,isUp:%b ,vm:%d", objArr2);
        return akVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.io.FileInputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static aj a(String str, Context context, String str2) {
        FileInputStream fileInputStream;
        if (str2 == null || context == null) {
            x.d("rqdp{  createZipAttachment sourcePath == null || context == null ,pls check}", new Object[0]);
            return null;
        }
        x.c("zip %s", str2);
        File file = new File(str2);
        ?? cacheDir = context.getCacheDir();
        File file2 = new File((File) cacheDir, str);
        if (!z.a(file, file2, 5000)) {
            x.d("zip fail!", new Object[0]);
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                fileInputStream = new FileInputStream(file2);
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int read = fileInputStream.read(bArr);
                        if (read <= 0) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                        byteArrayOutputStream.flush();
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    x.c("read bytes :%d", Integer.valueOf(byteArray.length));
                    aj ajVar = new aj((byte) 2, file2.getName(), byteArray);
                    try {
                        fileInputStream.close();
                    } catch (IOException e) {
                        if (!x.a(e)) {
                            e.printStackTrace();
                        }
                    }
                    if (file2.exists()) {
                        x.c("del tmp", new Object[0]);
                        file2.delete();
                    }
                    return ajVar;
                } catch (Throwable th) {
                    th = th;
                    if (!x.a(th)) {
                        th.printStackTrace();
                    }
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e2) {
                            if (!x.a(e2)) {
                                e2.printStackTrace();
                            }
                        }
                    }
                    if (file2.exists()) {
                        x.c("del tmp", new Object[0]);
                        file2.delete();
                    }
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                if (cacheDir != 0) {
                    try {
                        cacheDir.close();
                    } catch (IOException e3) {
                        if (!x.a(e3)) {
                            e3.printStackTrace();
                        }
                    }
                }
                if (file2.exists()) {
                    x.c("del tmp", new Object[0]);
                    file2.delete();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            cacheDir = 0;
            if (cacheDir != 0) {
            }
            if (file2.exists()) {
            }
            throw th;
        }
    }

    public static void a(String str, String str2, String str3, Thread thread, String str4, CrashDetailBean crashDetailBean) {
        String str5;
        com.tencent.bugly.crashreport.common.info.a b2 = com.tencent.bugly.crashreport.common.info.a.b();
        if (b2 == null) {
            return;
        }
        x.e("#++++++++++Record By Bugly++++++++++#", new Object[0]);
        x.e("# You can use Bugly(http:\\\\bugly.qq.com) to get more Crash Detail!", new Object[0]);
        x.e("# PKG NAME: %s", b2.f8600c);
        x.e("# APP VER: %s", b2.j);
        x.e("# LAUNCH TIME: %s", z.a(new Date(com.tencent.bugly.crashreport.common.info.a.b().f8598a)));
        x.e("# CRASH TYPE: %s", str);
        x.e("# CRASH TIME: %s", str2);
        x.e("# CRASH PROCESS: %s", str3);
        if (thread != null) {
            x.e("# CRASH THREAD: %s", thread.getName());
        }
        if (crashDetailBean != null) {
            x.e("# REPORT ID: %s", crashDetailBean.f8621c);
            Object[] objArr = new Object[2];
            objArr[0] = b2.g;
            objArr[1] = b2.x().booleanValue() ? "ROOTED" : "UNROOT";
            x.e("# CRASH DEVICE: %s %s", objArr);
            x.e("# RUNTIME AVAIL RAM:%d ROM:%d SD:%d", Long.valueOf(crashDetailBean.B), Long.valueOf(crashDetailBean.C), Long.valueOf(crashDetailBean.D));
            x.e("# RUNTIME TOTAL RAM:%d ROM:%d SD:%d", Long.valueOf(crashDetailBean.E), Long.valueOf(crashDetailBean.F), Long.valueOf(crashDetailBean.G));
            if (!z.a(crashDetailBean.J)) {
                x.e("# EXCEPTION FIRED BY %s %s", crashDetailBean.J, crashDetailBean.I);
            } else if (crashDetailBean.f8620b == 3) {
                Object[] objArr2 = new Object[1];
                if (crashDetailBean.N == null) {
                    str5 = "null";
                } else {
                    str5 = crashDetailBean.N.get("BUGLY_CR_01");
                }
                objArr2[0] = str5;
                x.e("# EXCEPTION ANR MESSAGE:\n %s", objArr2);
            }
        }
        if (!z.a(str4)) {
            x.e("# CRASH STACK: ", new Object[0]);
            x.e(str4, new Object[0]);
        }
        x.e("#++++++++++++++++++++++++++++++++++++++++++#", new Object[0]);
    }
}
