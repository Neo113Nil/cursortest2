package com.tencent.bugly.crashreport.biz;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.proguard.am;
import com.tencent.bugly.proguard.ar;
import com.tencent.bugly.proguard.k;
import com.tencent.bugly.proguard.o;
import com.tencent.bugly.proguard.p;
import com.tencent.bugly.proguard.t;
import com.tencent.bugly.proguard.u;
import com.tencent.bugly.proguard.w;
import com.tencent.bugly.proguard.x;
import com.tencent.bugly.proguard.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: BUGLY */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private Context f8575a;

    /* renamed from: b, reason: collision with root package name */
    private long f8576b;

    /* renamed from: c, reason: collision with root package name */
    private int f8577c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f8578d;

    static /* synthetic */ void a(a aVar, UserInfoBean userInfoBean, boolean z) {
        List<UserInfoBean> a2;
        if (userInfoBean != null) {
            if (!z && userInfoBean.f8572b != 1 && (a2 = aVar.a(com.tencent.bugly.crashreport.common.info.a.a(aVar.f8575a).f8601d)) != null && a2.size() >= 20) {
                x.a("[UserInfo] There are too many user info in local: %d", Integer.valueOf(a2.size()));
                return;
            }
            long a3 = p.a().a("t_ui", a(userInfoBean), (o) null, true);
            if (a3 >= 0) {
                x.c("[Database] insert %s success with ID: %d", "t_ui", Long.valueOf(a3));
                userInfoBean.f8571a = a3;
            }
        }
    }

    public a(Context context, boolean z) {
        this.f8578d = true;
        this.f8575a = context;
        this.f8578d = z;
    }

    public final void a(int i, boolean z, long j) {
        com.tencent.bugly.crashreport.common.strategy.a a2 = com.tencent.bugly.crashreport.common.strategy.a.a();
        if (a2 != null && !a2.c().h && i != 1 && i != 3) {
            x.e("UserInfo is disable", new Object[0]);
            return;
        }
        if (i == 1 || i == 3) {
            this.f8577c++;
        }
        com.tencent.bugly.crashreport.common.info.a a3 = com.tencent.bugly.crashreport.common.info.a.a(this.f8575a);
        UserInfoBean userInfoBean = new UserInfoBean();
        userInfoBean.f8572b = i;
        userInfoBean.f8573c = a3.f8601d;
        userInfoBean.f8574d = a3.g();
        userInfoBean.e = System.currentTimeMillis();
        userInfoBean.f = -1L;
        userInfoBean.n = a3.j;
        userInfoBean.o = i == 1 ? 1 : 0;
        userInfoBean.l = a3.a();
        userInfoBean.m = a3.p;
        userInfoBean.g = a3.q;
        userInfoBean.h = a3.r;
        userInfoBean.i = a3.s;
        userInfoBean.k = a3.t;
        userInfoBean.r = a3.z();
        userInfoBean.s = a3.E();
        userInfoBean.p = a3.F();
        userInfoBean.q = a3.G();
        w.a().a(new RunnableC0391a(userInfoBean, z), 0L);
    }

    public final void a() {
        this.f8576b = z.b() + 86400000;
        w.a().a(new b(), (this.f8576b - System.currentTimeMillis()) + 5000);
    }

    /* compiled from: BUGLY */
    /* renamed from: com.tencent.bugly.crashreport.biz.a$a, reason: collision with other inner class name */
    class RunnableC0391a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private boolean f8582a;

        /* renamed from: b, reason: collision with root package name */
        private UserInfoBean f8583b;

        public RunnableC0391a(UserInfoBean userInfoBean, boolean z) {
            this.f8583b = userInfoBean;
            this.f8582a = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.tencent.bugly.crashreport.common.info.a b2;
            try {
                if (this.f8583b != null) {
                    UserInfoBean userInfoBean = this.f8583b;
                    if (userInfoBean != null && (b2 = com.tencent.bugly.crashreport.common.info.a.b()) != null) {
                        userInfoBean.j = b2.e();
                    }
                    x.c("[UserInfo] Record user info.", new Object[0]);
                    a.a(a.this, this.f8583b, false);
                }
                if (this.f8582a) {
                    a aVar = a.this;
                    w a2 = w.a();
                    if (a2 != null) {
                        a2.a(aVar.new AnonymousClass2());
                    }
                }
            } catch (Throwable th) {
                if (x.a(th)) {
                    return;
                }
                th.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f2 A[Catch: all -> 0x018b, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x0007, B:12:0x000f, B:16:0x0017, B:18:0x001d, B:22:0x0027, B:24:0x003c, B:27:0x0045, B:29:0x004c, B:30:0x004f, B:32:0x0055, B:34:0x0069, B:36:0x0079, B:43:0x0081, B:45:0x008b, B:46:0x0090, B:48:0x0096, B:50:0x00a4, B:52:0x00b1, B:53:0x00b4, B:56:0x00c2, B:58:0x00c6, B:60:0x00cb, B:63:0x00d0, B:73:0x00d7, B:74:0x00ec, B:76:0x00f2, B:78:0x00f7, B:81:0x00ff, B:84:0x0117, B:86:0x011d, B:89:0x0126, B:91:0x012c, B:94:0x0135, B:97:0x013e, B:99:0x0146, B:102:0x014f, B:104:0x0160, B:105:0x0165, B:107:0x016a, B:108:0x016f, B:111:0x017d, B:115:0x016d, B:116:0x0163, B:119:0x0182, B:123:0x00e6), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x011d A[Catch: all -> 0x018b, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x0007, B:12:0x000f, B:16:0x0017, B:18:0x001d, B:22:0x0027, B:24:0x003c, B:27:0x0045, B:29:0x004c, B:30:0x004f, B:32:0x0055, B:34:0x0069, B:36:0x0079, B:43:0x0081, B:45:0x008b, B:46:0x0090, B:48:0x0096, B:50:0x00a4, B:52:0x00b1, B:53:0x00b4, B:56:0x00c2, B:58:0x00c6, B:60:0x00cb, B:63:0x00d0, B:73:0x00d7, B:74:0x00ec, B:76:0x00f2, B:78:0x00f7, B:81:0x00ff, B:84:0x0117, B:86:0x011d, B:89:0x0126, B:91:0x012c, B:94:0x0135, B:97:0x013e, B:99:0x0146, B:102:0x014f, B:104:0x0160, B:105:0x0165, B:107:0x016a, B:108:0x016f, B:111:0x017d, B:115:0x016d, B:116:0x0163, B:119:0x0182, B:123:0x00e6), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0126 A[Catch: all -> 0x018b, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x0007, B:12:0x000f, B:16:0x0017, B:18:0x001d, B:22:0x0027, B:24:0x003c, B:27:0x0045, B:29:0x004c, B:30:0x004f, B:32:0x0055, B:34:0x0069, B:36:0x0079, B:43:0x0081, B:45:0x008b, B:46:0x0090, B:48:0x0096, B:50:0x00a4, B:52:0x00b1, B:53:0x00b4, B:56:0x00c2, B:58:0x00c6, B:60:0x00cb, B:63:0x00d0, B:73:0x00d7, B:74:0x00ec, B:76:0x00f2, B:78:0x00f7, B:81:0x00ff, B:84:0x0117, B:86:0x011d, B:89:0x0126, B:91:0x012c, B:94:0x0135, B:97:0x013e, B:99:0x0146, B:102:0x014f, B:104:0x0160, B:105:0x0165, B:107:0x016a, B:108:0x016f, B:111:0x017d, B:115:0x016d, B:116:0x0163, B:119:0x0182, B:123:0x00e6), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized void c() {
        boolean z;
        ar a2;
        if (this.f8578d) {
            u a3 = u.a();
            if (a3 == null) {
                return;
            }
            com.tencent.bugly.crashreport.common.strategy.a a4 = com.tencent.bugly.crashreport.common.strategy.a.a();
            if (a4 == null) {
                return;
            }
            if (!a4.b() || a3.b(1001)) {
                String str = com.tencent.bugly.crashreport.common.info.a.a(this.f8575a).f8601d;
                ArrayList arrayList = new ArrayList();
                final List<UserInfoBean> a5 = a(str);
                if (a5 != null) {
                    int size = a5.size() - 20;
                    if (size > 0) {
                        int i = 0;
                        while (i < a5.size() - 1) {
                            int i2 = i + 1;
                            for (int i3 = i2; i3 < a5.size(); i3++) {
                                if (a5.get(i).e > a5.get(i3).e) {
                                    UserInfoBean userInfoBean = a5.get(i);
                                    a5.set(i, a5.get(i3));
                                    a5.set(i3, userInfoBean);
                                }
                            }
                            i = i2;
                        }
                        for (int i4 = 0; i4 < size; i4++) {
                            arrayList.add(a5.get(i4));
                        }
                    }
                    Iterator<UserInfoBean> it = a5.iterator();
                    int i5 = 0;
                    while (it.hasNext()) {
                        UserInfoBean next = it.next();
                        if (next.f != -1) {
                            it.remove();
                            if (next.e < z.b()) {
                                arrayList.add(next);
                            }
                        }
                        if (next.e > System.currentTimeMillis() - 600000 && (next.f8572b == 1 || next.f8572b == 4 || next.f8572b == 3)) {
                            i5++;
                        }
                    }
                    if (i5 > 15) {
                        x.d("[UserInfo] Upload user info too many times in 10 min: %d", Integer.valueOf(i5));
                        z = false;
                        if (arrayList.size() > 0) {
                            a(arrayList);
                        }
                        if (z && a5.size() != 0) {
                            x.c("[UserInfo] Upload user info(size: %d)", Integer.valueOf(a5.size()));
                            a2 = com.tencent.bugly.proguard.a.a(a5, this.f8577c != 1 ? 1 : 2);
                            if (a2 != null) {
                                x.d("[UserInfo] Failed to create UserInfoPackage.", new Object[0]);
                                return;
                            }
                            byte[] a6 = com.tencent.bugly.proguard.a.a((k) a2);
                            if (a6 == null) {
                                x.d("[UserInfo] Failed to encode data.", new Object[0]);
                                return;
                            }
                            am a7 = com.tencent.bugly.proguard.a.a(this.f8575a, a3.f8784a ? 840 : 640, a6);
                            if (a7 == null) {
                                x.d("[UserInfo] Request package is null.", new Object[0]);
                                return;
                            }
                            t tVar = new t() { // from class: com.tencent.bugly.crashreport.biz.a.1
                                @Override // com.tencent.bugly.proguard.t
                                public final void a(boolean z2) {
                                    if (z2) {
                                        x.c("[UserInfo] Successfully uploaded user info.", new Object[0]);
                                        long currentTimeMillis = System.currentTimeMillis();
                                        for (UserInfoBean userInfoBean2 : a5) {
                                            userInfoBean2.f = currentTimeMillis;
                                            a.a(a.this, userInfoBean2, true);
                                        }
                                    }
                                }
                            };
                            StrategyBean c2 = com.tencent.bugly.crashreport.common.strategy.a.a().c();
                            u.a().a(1001, a7, a3.f8784a ? c2.r : c2.t, a3.f8784a ? StrategyBean.f8605b : StrategyBean.f8604a, tVar, this.f8577c == 1);
                            return;
                        }
                        x.c("[UserInfo] There is no user info in local database.", new Object[0]);
                    }
                } else {
                    a5 = new ArrayList<>();
                }
                z = true;
                if (arrayList.size() > 0) {
                }
                if (z) {
                    x.c("[UserInfo] Upload user info(size: %d)", Integer.valueOf(a5.size()));
                    a2 = com.tencent.bugly.proguard.a.a(a5, this.f8577c != 1 ? 1 : 2);
                    if (a2 != null) {
                    }
                }
                x.c("[UserInfo] There is no user info in local database.", new Object[0]);
            }
        }
    }

    public final void b() {
        w a2 = w.a();
        if (a2 != null) {
            a2.a(new AnonymousClass2());
        }
    }

    /* compiled from: BUGLY */
    /* renamed from: com.tencent.bugly.crashreport.biz.a$2, reason: invalid class name */
    final class AnonymousClass2 implements Runnable {
        AnonymousClass2() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                a.this.c();
            } catch (Throwable th) {
                x.a(th);
            }
        }
    }

    /* compiled from: BUGLY */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis < a.this.f8576b) {
                w.a().a(a.this.new b(), (a.this.f8576b - currentTimeMillis) + 5000);
            } else {
                a.this.a(3, false, 0L);
                a.this.a();
            }
        }
    }

    /* compiled from: BUGLY */
    class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private long f8586a;

        public c(long j) {
            this.f8586a = 21600000L;
            this.f8586a = j;
        }

        @Override // java.lang.Runnable
        public final void run() {
            a aVar = a.this;
            w a2 = w.a();
            if (a2 != null) {
                a2.a(aVar.new AnonymousClass2());
            }
            a aVar2 = a.this;
            long j = this.f8586a;
            w.a().a(aVar2.new c(j), j);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<UserInfoBean> a(String str) {
        Throwable th;
        Cursor cursor;
        String str2;
        try {
            if (z.a(str)) {
                str2 = null;
            } else {
                str2 = "_pc = '" + str + "'";
            }
            cursor = p.a().a("t_ui", null, str2, null, null, true);
            if (cursor == null) {
                if (cursor != null) {
                    cursor.close();
                }
                return null;
            }
            try {
                try {
                    StringBuilder sb = new StringBuilder();
                    ArrayList arrayList = new ArrayList();
                    while (cursor.moveToNext()) {
                        UserInfoBean a2 = a(cursor);
                        if (a2 != null) {
                            arrayList.add(a2);
                        } else {
                            try {
                                long j = cursor.getLong(cursor.getColumnIndex("_id"));
                                sb.append(" or _id");
                                sb.append(" = ");
                                sb.append(j);
                            } catch (Throwable unused) {
                                x.d("[Database] unknown id.", new Object[0]);
                            }
                        }
                    }
                    String sb2 = sb.toString();
                    if (sb2.length() > 0) {
                        x.d("[Database] deleted %s error data %d", "t_ui", Integer.valueOf(p.a().a("t_ui", sb2.substring(4), (String[]) null, (o) null, true)));
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
                    return null;
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
            if (cursor != null) {
            }
            throw th;
        }
    }

    private static void a(List<UserInfoBean> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size() && i < 50; i++) {
            UserInfoBean userInfoBean = list.get(i);
            sb.append(" or _id");
            sb.append(" = ");
            sb.append(userInfoBean.f8571a);
        }
        String sb2 = sb.toString();
        if (sb2.length() > 0) {
            sb2 = sb2.substring(4);
        }
        String str = sb2;
        sb.setLength(0);
        try {
            x.c("[Database] deleted %s data %d", "t_ui", Integer.valueOf(p.a().a("t_ui", str, (String[]) null, (o) null, true)));
        } catch (Throwable th) {
            if (x.a(th)) {
                return;
            }
            th.printStackTrace();
        }
    }

    private static ContentValues a(UserInfoBean userInfoBean) {
        if (userInfoBean == null) {
            return null;
        }
        try {
            ContentValues contentValues = new ContentValues();
            if (userInfoBean.f8571a > 0) {
                contentValues.put("_id", Long.valueOf(userInfoBean.f8571a));
            }
            contentValues.put("_tm", Long.valueOf(userInfoBean.e));
            contentValues.put("_ut", Long.valueOf(userInfoBean.f));
            contentValues.put("_tp", Integer.valueOf(userInfoBean.f8572b));
            contentValues.put("_pc", userInfoBean.f8573c);
            contentValues.put("_dt", z.a(userInfoBean));
            return contentValues;
        } catch (Throwable th) {
            if (!x.a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    private static UserInfoBean a(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        try {
            byte[] blob = cursor.getBlob(cursor.getColumnIndex("_dt"));
            if (blob == null) {
                return null;
            }
            long j = cursor.getLong(cursor.getColumnIndex("_id"));
            UserInfoBean userInfoBean = (UserInfoBean) z.a(blob, UserInfoBean.CREATOR);
            if (userInfoBean != null) {
                userInfoBean.f8571a = j;
            }
            return userInfoBean;
        } catch (Throwable th) {
            if (!x.a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }
}
