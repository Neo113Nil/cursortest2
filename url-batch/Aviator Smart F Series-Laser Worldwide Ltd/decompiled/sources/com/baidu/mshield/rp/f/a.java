package com.baidu.mshield.rp.f;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.artillery.ctc.uitls.TimeConstants;
import com.baidu.mshield.utility.b;
import com.baidu.mshield.utility.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static long f8364a;

    /* renamed from: b, reason: collision with root package name */
    public HandlerC0086a f8365b = new HandlerC0086a(e.a());

    /* renamed from: c, reason: collision with root package name */
    public com.baidu.mshield.sharedpreferences.a f8366c;

    /* renamed from: d, reason: collision with root package name */
    public Context f8367d;

    /* renamed from: e, reason: collision with root package name */
    public com.baidu.mshield.rp.e.a.a f8368e;

    /* renamed from: com.baidu.mshield.rp.f.a$a, reason: collision with other inner class name */
    public class HandlerC0086a extends Handler {
        public HandlerC0086a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            try {
                switch (message.what) {
                    case 0:
                        a.this.f();
                        break;
                    case 1:
                        com.baidu.mshield.rp.c.a.a(a.this.f8367d).a((com.baidu.mshield.rp.d.a) message.obj);
                        com.baidu.mshield.b.c.a.b("sj-trigger report f ACTION_REPORT_RECORD");
                        Message message2 = new Message();
                        message2.what = 10;
                        sendMessage(message2);
                        break;
                    case 2:
                        com.baidu.mshield.b.c.a.b("sj-trigger reportACTION_REPORT_DATA");
                        a.this.a();
                        a.this.f();
                        a.this.b(0, com.baidu.mshield.utility.a.d(a.this.f8367d));
                        break;
                    case 3:
                        com.baidu.mshield.rp.b.a aVar = (com.baidu.mshield.rp.b.a) message.obj;
                        if (aVar != null) {
                            a.this.b(aVar);
                            break;
                        }
                        break;
                    case 4:
                        String valueOf = String.valueOf(message.obj);
                        if (!TextUtils.isEmpty(valueOf)) {
                            com.baidu.mshield.rp.c.a.a(a.this.f8367d).a(com.baidu.mshield.b.f.e.a(valueOf));
                            break;
                        }
                        break;
                    case 5:
                        a.this.a();
                        a.this.d();
                        Message message3 = new Message();
                        message3.what = 10;
                        sendMessage(message3);
                        break;
                    case 6:
                        a aVar2 = a.this;
                        aVar2.b(1, com.baidu.mshield.utility.a.d(aVar2.f8367d));
                        break;
                    case 7:
                        a.this.f();
                        a aVar3 = a.this;
                        aVar3.b(1, com.baidu.mshield.utility.a.d(aVar3.f8367d));
                        break;
                    case 8:
                        a aVar4 = a.this;
                        aVar4.b(3, com.baidu.mshield.utility.a.d(aVar4.f8367d));
                        break;
                    case 9:
                        a.this.b(0, 2);
                        break;
                    case 10:
                        int d8 = com.baidu.mshield.utility.a.d(a.this.f8367d);
                        if (2 != d8) {
                            if (1 == d8) {
                                com.baidu.mshield.b.c.a.b("sj-trigger reportde re");
                                a.this.b(4, d8);
                                break;
                            }
                        } else {
                            com.baidu.mshield.b.c.a.b("sj-trigger report wifi ");
                            if (com.baidu.mshield.rp.c.a.a(a.this.f8367d).b() < com.baidu.mshield.sharedpreferences.a.a(a.this.f8367d).g()) {
                                List<com.baidu.mshield.rp.d.a> a8 = com.baidu.mshield.rp.c.a.a(a.this.f8367d).a(true, d8);
                                com.baidu.mshield.b.c.a.b("sj-trigger report Dela " + a8.size());
                                if (a8.size() > 0) {
                                    com.baidu.mshield.b.c.a.b("sj-trigger reportde condi");
                                    a.this.b(0, d8);
                                    break;
                                }
                            } else {
                                com.baidu.mshield.b.c.a.b("sj-trigger reportrc condi");
                                a.this.b(0, d8);
                                break;
                            }
                        }
                        break;
                    case 11:
                        String valueOf2 = String.valueOf(message.obj);
                        if (!a.this.f8368e.a(new JSONArray().put(com.baidu.mshield.utility.a.a(a.this.f8367d, new JSONObject(valueOf2))).toString(), a.this.a(new JSONObject(valueOf2)), ExifInterface.GPS_MEASUREMENT_3D)) {
                            com.baidu.mshield.utility.a.b(a.this.f8367d, valueOf2);
                            break;
                        }
                        break;
                }
            } catch (Throwable th) {
                com.baidu.mshield.utility.a.a(th);
            }
        }
    }

    public a(Context context) {
        this.f8367d = context.getApplicationContext();
        this.f8366c = com.baidu.mshield.sharedpreferences.a.a(context);
        this.f8368e = new com.baidu.mshield.rp.e.a.a(this.f8367d);
    }

    public final void f() {
        try {
            List<com.baidu.mshield.rp.b.a> p8 = this.f8366c.p();
            if (p8 == null) {
                return;
            }
            Iterator<com.baidu.mshield.rp.b.a> it = p8.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
        } catch (Throwable th) {
            com.baidu.mshield.utility.a.a(th);
        }
    }

    public final void b(int i8, int i9) {
        List<com.baidu.mshield.rp.d.a> b8;
        try {
            if (i9 == 0) {
                com.baidu.mshield.b.c.a.b("sj-trigger EVENT_NETWORK_NONE ");
                return;
            }
            if (i8 == 1) {
                b8 = com.baidu.mshield.rp.c.a.a(this.f8367d).c();
                if (1 == i9) {
                    com.baidu.mshield.b.c.a.b("sj-trigger report 3g " + b8.size());
                }
            } else if (i8 == 3) {
                b8 = com.baidu.mshield.rp.c.a.a(this.f8367d).a(false, i9);
            } else if (i8 == 4) {
                b8 = com.baidu.mshield.rp.c.a.a(this.f8367d).a(true, i9);
                com.baidu.mshield.b.c.a.b("sj-trigger report 3g to report " + b8.size());
            } else {
                b8 = com.baidu.mshield.rp.c.a.a(this.f8367d).b(i9);
            }
            if (b8 != null && b8.size() > 0) {
                long d8 = this.f8366c.d();
                long currentTimeMillis = System.currentTimeMillis();
                long c8 = this.f8366c.c();
                int D = this.f8366c.D();
                if (c8 == 0) {
                    this.f8366c.c(currentTimeMillis);
                    c8 = currentTimeMillis;
                }
                com.baidu.mshield.b.c.a.b("begintime : " + currentTimeMillis);
                com.baidu.mshield.b.c.a.b("last rp len : " + d8);
                if (currentTimeMillis - c8 < 86400000) {
                    if (i8 == 3) {
                        int E = this.f8366c.E();
                        if (E >= 5) {
                            return;
                        } else {
                            this.f8366c.g(E + 1);
                        }
                    }
                    if (d8 > D * 1048576) {
                        com.baidu.mshield.b.c.a.b("rp over limit : maxday :  : " + d8);
                        return;
                    }
                } else {
                    this.f8366c.d(0L);
                    this.f8366c.c(currentTimeMillis);
                    if (i8 == 3) {
                        this.f8366c.g(0);
                    }
                }
                a(b8, i9, d8);
                List<com.baidu.mshield.rp.d.a> a8 = a(i8, i9);
                while (a8 != null && a8.size() != 0) {
                    a(a8, i9, d8);
                    if (!b()) {
                        com.baidu.mshield.b.c.a.b("324 checkReportFail");
                        return;
                    }
                    a8 = a(i8, i9);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public final void c() {
        this.f8368e.a();
        this.f8366c.a(System.currentTimeMillis());
    }

    public final void d() {
        try {
            com.baidu.mshield.sharedpreferences.a a8 = com.baidu.mshield.sharedpreferences.a.a(this.f8367d);
            int J = a8.J();
            com.baidu.mshield.b.c.a.b(" 2" + Integer.toString(J));
            long currentTimeMillis = System.currentTimeMillis() - a8.G();
            long j8 = (long) (J * TimeConstants.HOUR);
            if (currentTimeMillis >= j8) {
                b.a(this.f8367d).d();
                com.baidu.mshield.utility.a.a(this.f8367d, j8);
                a8.b(System.currentTimeMillis());
            } else {
                com.baidu.mshield.utility.a.a(this.f8367d, j8 - currentTimeMillis);
            }
        } catch (Throwable th) {
            com.baidu.mshield.utility.a.a(th);
        }
    }

    public void e() {
        Message message = new Message();
        message.what = 7;
        a(message);
    }

    public void a(boolean z7) {
        Message message = new Message();
        message.what = 5;
        a(message);
    }

    public void a(Message message) {
        this.f8365b.sendMessage(message);
    }

    public final String a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("Common_section");
            if (jSONObject2 != null && jSONObject2.has("12")) {
                return jSONObject2.optString("12", "");
            }
            return null;
        } catch (Throwable th) {
            com.baidu.mshield.utility.a.a(th);
            return null;
        }
    }

    public final void a() {
        if (System.currentTimeMillis() - this.f8366c.B() < 86400000) {
            return;
        }
        c();
    }

    public final List<com.baidu.mshield.rp.d.a> a(int i8, int i9) {
        if (i8 == 0 && i9 == 2) {
            return com.baidu.mshield.rp.c.a.a(this.f8367d).b(i9);
        }
        return null;
    }

    public final void a(List<com.baidu.mshield.rp.d.a> list, int i8, long j8) {
        JSONObject jSONObject;
        int length;
        try {
            int H = this.f8366c.H();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator<com.baidu.mshield.rp.d.a> it = list.iterator();
            int i9 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.baidu.mshield.rp.d.a next = it.next();
                try {
                    String jSONObject2 = com.baidu.mshield.utility.a.a(this.f8367d, new JSONObject(next.f8353d)).toString();
                    try {
                        jSONObject = new JSONObject(jSONObject2);
                        length = jSONObject2.length() + i9;
                    } catch (Throwable th) {
                        com.baidu.mshield.utility.a.a(th);
                    }
                } catch (Throwable th2) {
                    com.baidu.mshield.utility.a.a(th2);
                }
                if (length >= 1048576 * H) {
                    com.baidu.mshield.b.c.a.b("rp once over limit : maxOnece : " + H + " : " + length);
                    break;
                }
                arrayList.add(Integer.valueOf(next.f8350a));
                arrayList2.add(new com.baidu.mshield.rp.d.b(jSONObject, next.f8359j, next.f8350a));
                i9 = length;
            }
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayList3 = new ArrayList();
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                com.baidu.mshield.rp.d.b bVar = (com.baidu.mshield.rp.d.b) arrayList2.get(i10);
                if (bVar != null) {
                    String c8 = bVar.c();
                    if (TextUtils.isEmpty(c8)) {
                        jSONArray.put(bVar.b());
                        arrayList3.add(Integer.valueOf(bVar.a()));
                    } else {
                        if (hashMap.containsKey(c8)) {
                            JSONArray jSONArray2 = (JSONArray) hashMap.get(c8);
                            if (jSONArray2 == null) {
                                jSONArray2 = new JSONArray();
                            }
                            jSONArray2.put(bVar.b());
                            hashMap.put(c8, jSONArray2);
                        } else {
                            JSONArray jSONArray3 = new JSONArray();
                            jSONArray3.put(bVar.b());
                            hashMap.put(c8, jSONArray3);
                        }
                        ArrayList arrayList4 = (ArrayList) hashMap2.get(c8);
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                        }
                        arrayList4.add(Integer.valueOf(bVar.a()));
                        hashMap2.put(c8, arrayList4);
                    }
                }
            }
            if (jSONArray.length() > 0) {
                if (this.f8368e.a(jSONArray.toString(), null, "1")) {
                    com.baidu.mshield.rp.c.a.a(this.f8367d).a(arrayList3);
                } else {
                    f8364a = System.currentTimeMillis();
                    com.baidu.mshield.b.c.a.b("427 report fail,sFailTime = " + f8364a);
                }
            }
            if (hashMap.size() > 0) {
                for (String str : hashMap.keySet()) {
                    JSONArray jSONArray4 = (JSONArray) hashMap.get(str);
                    if (jSONArray4 != null && jSONArray4.length() > 0) {
                        if (this.f8368e.a(jSONArray4.toString(), str, "2")) {
                            com.baidu.mshield.rp.c.a.a(this.f8367d).a((List<Integer>) hashMap2.get(str));
                        } else {
                            f8364a = System.currentTimeMillis();
                            com.baidu.mshield.b.c.a.b("441 report fail,sFailTime = " + f8364a);
                        }
                    }
                }
            }
            com.baidu.mshield.rp.c.a.a(this.f8367d).a();
            if (2 != i8) {
                this.f8366c.d(i9 + j8);
            }
        } catch (Throwable th3) {
            com.baidu.mshield.utility.a.a(th3);
        }
    }

    public final boolean b() {
        com.baidu.mshield.b.c.a.b("checkReportFail,sFailTime=" + f8364a);
        if (f8364a > 0) {
            if (System.currentTimeMillis() - f8364a < 300000) {
                com.baidu.mshield.b.c.a.b("checkReportFail:false");
                return false;
            }
            f8364a = 0L;
        }
        com.baidu.mshield.b.c.a.b("checkReportFail:true");
        return true;
    }

    public final void b(com.baidu.mshield.rp.b.a aVar) {
        try {
            String b8 = this.f8366c.b(aVar.f8345e);
            com.baidu.mshield.rp.d.a aVar2 = new com.baidu.mshield.rp.d.a();
            aVar2.f8351b = aVar.f8345e;
            aVar2.f8356g = 0;
            aVar2.f8352c = 1;
            aVar2.f8354e = System.currentTimeMillis();
            aVar2.f8355f = 1;
            aVar2.f8353d = com.baidu.mshield.utility.a.a(this.f8367d, aVar, b8, false).toString();
            com.baidu.mshield.rp.c.a.a(this.f8367d).a(aVar2);
            this.f8366c.a(aVar.f8345e, true);
            String a8 = com.baidu.mshield.b.f.e.a(com.baidu.mshield.utility.a.b(this.f8367d).toString());
            if (com.baidu.mshield.rp.c.a.a(this.f8367d).b(a8)) {
                aVar2.f8351b = "1067001";
                Context context = this.f8367d;
                aVar2.f8353d = com.baidu.mshield.utility.a.a(context, aVar.f8341a, aVar.f8343c, "1067001", com.baidu.mshield.utility.a.b(context).toString()).toString();
                com.baidu.mshield.rp.c.a.a(this.f8367d).a(aVar2);
                com.baidu.mshield.rp.c.a.a(this.f8367d).a(a8);
            }
        } catch (Throwable th) {
            com.baidu.mshield.utility.a.a(th);
        }
    }

    public final void a(com.baidu.mshield.rp.b.a aVar) {
        try {
            String a8 = com.baidu.mshield.utility.a.a();
            if ("4.2.6".equals(this.f8366c.C())) {
                com.baidu.mshield.b.c.a.b("same version=4.2.6");
                if (this.f8366c.d(aVar.f8344d).equals(a8)) {
                    com.baidu.mshield.b.c.a.b("same version has reported!");
                    return;
                }
                com.baidu.mshield.b.c.a.b("same version new report");
            } else {
                com.baidu.mshield.b.c.a.b("new version set=4.2.6");
                this.f8366c.n("4.2.6");
            }
            String b8 = this.f8366c.b(aVar.f8344d);
            com.baidu.mshield.rp.d.a aVar2 = new com.baidu.mshield.rp.d.a();
            aVar2.f8351b = aVar.f8344d;
            aVar2.f8356g = 0;
            aVar2.f8352c = 2;
            aVar2.f8354e = System.currentTimeMillis();
            aVar2.f8355f = 1;
            aVar2.f8358i = 5;
            aVar2.f8353d = com.baidu.mshield.utility.a.a(this.f8367d, aVar, b8, true).toString();
            com.baidu.mshield.rp.c.a.a(this.f8367d).a(aVar2);
            String a9 = com.baidu.mshield.b.f.e.a(com.baidu.mshield.utility.a.b(this.f8367d).toString());
            if (com.baidu.mshield.rp.c.a.a(this.f8367d).b(a9)) {
                aVar2.f8351b = "1067001";
                aVar2.f8358i = 0;
                Context context = this.f8367d;
                aVar2.f8353d = com.baidu.mshield.utility.a.a(context, aVar.f8341a, aVar.f8343c, "1067001", com.baidu.mshield.utility.a.b(context).toString()).toString();
                com.baidu.mshield.rp.c.a.a(this.f8367d).a(aVar2);
                com.baidu.mshield.rp.c.a.a(this.f8367d).a(a9);
            }
            this.f8366c.c(aVar.f8344d, a8);
        } catch (Throwable th) {
            com.baidu.mshield.utility.a.a(th);
        }
    }
}
