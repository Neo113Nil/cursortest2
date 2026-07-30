package com.baidu.location.b;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.wifi.WifiInfo;
import android.os.Bundle;
import com.baidu.location.Jni;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class m {

    /* renamed from: b, reason: collision with root package name */
    private static m f4783b;

    /* renamed from: d, reason: collision with root package name */
    private SQLiteDatabase f4785d = null;

    /* renamed from: e, reason: collision with root package name */
    private boolean f4786e = false;

    /* renamed from: f, reason: collision with root package name */
    a f4787f = null;

    /* renamed from: g, reason: collision with root package name */
    a f4788g = null;

    /* renamed from: h, reason: collision with root package name */
    private String f4789h = null;

    /* renamed from: i, reason: collision with root package name */
    private int f4790i = -2;

    /* renamed from: a, reason: collision with root package name */
    private static Object f4782a = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static final String f4784c = com.baidu.location.e.i.g() + "/hst.db";

    class a extends com.baidu.location.e.g {

        /* renamed from: o, reason: collision with root package name */
        private String f4791o = null;

        /* renamed from: p, reason: collision with root package name */
        private String f4792p = null;

        /* renamed from: q, reason: collision with root package name */
        private boolean f4793q = true;

        /* renamed from: r, reason: collision with root package name */
        private boolean f4794r = false;

        a() {
            this.f5229g = new HashMap();
        }

        @Override // com.baidu.location.e.g
        public void a() {
            this.f5226d = 1;
            String q8 = com.baidu.location.c.h.a().q();
            if (q8 != null) {
                this.f5235m = Jni.encodeTp4(q8);
            }
            String encodeTp4 = Jni.encodeTp4(this.f4792p);
            this.f4792p = null;
            this.f5229g.put("bloc", encodeTp4);
        }

        public void a(String str, String str2) {
            if (m.this.f4786e) {
                return;
            }
            m.this.f4786e = true;
            this.f4791o = str;
            if (p.a().b()) {
                this.f4792p = str2 + "&enc=2";
            } else {
                this.f4792p = str2;
            }
            ExecutorService c8 = z.a().c();
            if (c8 != null) {
                a(c8, com.baidu.location.e.e.f5203b);
            } else {
                b(com.baidu.location.e.e.f5203b);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:3:0x000c, code lost:
        
            r11 = r10.f5227e;
         */
        @Override // com.baidu.location.e.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void a(boolean z7) {
            String str;
            if (z7 && str != null) {
                try {
                    if (str.contains("enc") && p.a().b()) {
                        try {
                            JSONObject jSONObject = new JSONObject(str);
                            if (jSONObject.has("enc")) {
                                str = p.a().b(jSONObject.getString("enc"));
                            }
                        } catch (Exception e8) {
                            e8.printStackTrace();
                        }
                    }
                    if (str.contains("enc3")) {
                        str = com.baidu.location.e.i.d(str);
                    }
                    if (this.f4793q) {
                        JSONObject jSONObject2 = new JSONObject(str);
                        JSONObject jSONObject3 = jSONObject2.has(FirebaseAnalytics.Param.CONTENT) ? jSONObject2.getJSONObject(FirebaseAnalytics.Param.CONTENT) : null;
                        if (jSONObject3 != null && jSONObject3.has("imo")) {
                            Long valueOf = Long.valueOf(jSONObject3.getJSONObject("imo").getString("mac"));
                            int i8 = jSONObject3.getJSONObject("imo").getInt("mv");
                            if (Jni.encode3(this.f4791o).longValue() == valueOf.longValue()) {
                                ContentValues contentValues = new ContentValues();
                                contentValues.put(TtmlNode.TAG_TT, Integer.valueOf((int) (System.currentTimeMillis() / 1000)));
                                contentValues.put("hst", Integer.valueOf(i8));
                                try {
                                    if (m.this.f4785d.update("hstdata", contentValues, "id = \"" + valueOf + "\"", null) <= 0) {
                                        contentValues.put("id", valueOf);
                                        m.this.f4785d.insert("hstdata", null, contentValues);
                                    }
                                } catch (Exception unused) {
                                }
                                Bundle bundle = new Bundle();
                                bundle.putByteArray("mac", this.f4791o.getBytes());
                                bundle.putInt("hotspot", i8);
                                m.this.a(bundle);
                            }
                        }
                    }
                } catch (Exception unused2) {
                }
            } else if (this.f4793q) {
                m.this.f();
            }
            Map<String, Object> map = this.f5229g;
            if (map != null) {
                map.clear();
            }
            m.this.f4786e = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        Bundle bundle = new Bundle();
        bundle.putInt("hotspot", -1);
        a(bundle);
    }

    public void b() {
        try {
            File file = new File(f4784c);
            if (!file.exists()) {
                file.createNewFile();
            }
            if (file.exists()) {
                SQLiteDatabase openOrCreateDatabase = SQLiteDatabase.openOrCreateDatabase(file, (SQLiteDatabase.CursorFactory) null);
                this.f4785d = openOrCreateDatabase;
                openOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS hstdata(id Long PRIMARY KEY,hst INT,tt INT);");
                this.f4785d.setVersion(1);
            }
        } catch (Exception unused) {
            this.f4785d = null;
        }
    }

    public void c() {
        SQLiteDatabase sQLiteDatabase = this.f4785d;
        if (sQLiteDatabase != null) {
            try {
                sQLiteDatabase.close();
            } catch (Exception unused) {
            } catch (Throwable th) {
                this.f4785d = null;
                throw th;
            }
            this.f4785d = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0072, code lost:
    
        if (r3 != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007d, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007b, code lost:
    
        if (r3 == null) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized int d() {
        int i8;
        int i9 = -3;
        if (this.f4786e) {
            return -3;
        }
        try {
            if (com.baidu.location.c.h.a().l() && this.f4785d != null) {
                WifiInfo p8 = com.baidu.location.c.h.a().p();
                Cursor cursor = null;
                String a8 = com.baidu.location.c.h.a().a(p8, (String) null);
                if (p8 != null && a8 != null) {
                    String replace = a8.replace(":", "");
                    Long encode3 = Jni.encode3(replace);
                    String str = this.f4789h;
                    if (str == null || !replace.equals(str) || (i8 = this.f4790i) <= -2) {
                        try {
                            cursor = this.f4785d.rawQuery("select * from hstdata where id = ?", new String[]{String.valueOf(encode3)});
                            if (cursor == null || !cursor.moveToFirst()) {
                                i9 = -2;
                            } else {
                                i9 = cursor.getInt(1);
                                this.f4789h = replace;
                                this.f4790i = i9;
                            }
                        } catch (Exception unused) {
                        } catch (Throwable th) {
                            if (cursor != null) {
                                try {
                                    cursor.close();
                                } catch (Exception unused2) {
                                }
                            }
                            throw th;
                        }
                    } else {
                        i9 = i8;
                    }
                }
            }
        } catch (Exception unused3) {
        }
        this.f4790i = i9;
        return i9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0084, code lost:
    
        if (r4 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008f, code lost:
    
        r4.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void e() {
        WifiInfo p8;
        String replace;
        boolean z7;
        if (this.f4786e) {
            return;
        }
        try {
            if (!com.baidu.location.c.h.a().l() || this.f4785d == null || (p8 = com.baidu.location.c.h.a().p()) == null || p8.getBSSID() == null) {
                f();
                return;
            }
            replace = p8.getBSSID().replace(":", "");
            z7 = false;
            Cursor cursor = null;
            try {
                cursor = this.f4785d.rawQuery("select * from hstdata where id = ?", new String[]{String.valueOf(Jni.encode3(replace))});
                if (cursor != null && cursor.moveToFirst()) {
                    int i8 = cursor.getInt(1);
                    if ((System.currentTimeMillis() / 1000) - cursor.getInt(2) <= 259200) {
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("mac", replace.getBytes());
                        bundle.putInt("hotspot", i8);
                        a(bundle);
                    }
                }
                z7 = true;
            } catch (Exception unused) {
                if (cursor == null) {
                    return;
                }
            } catch (Throwable th) {
                if (cursor != null) {
                    try {
                        cursor.close();
                    } catch (Exception unused2) {
                    }
                }
                throw th;
            }
        } catch (Exception unused3) {
            return;
        }
        if (z7) {
            if (this.f4787f == null) {
                this.f4787f = new a();
            }
            a aVar = this.f4787f;
            if (aVar != null) {
                aVar.a(replace, a(true));
            }
        }
    }

    public static m a() {
        m mVar;
        synchronized (f4782a) {
            try {
                if (f4783b == null) {
                    f4783b = new m();
                }
                mVar = f4783b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return mVar;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v3 java.lang.String, still in use, count: 2, list:
          (r1v3 java.lang.String) from 0x004c: IF  (r1v3 java.lang.String) != (null java.lang.String)  -> B:11:0x0040 A[HIDDEN]
          (r1v3 java.lang.String) from 0x0040: PHI (r1v10 java.lang.String) = (r1v3 java.lang.String), (r1v11 java.lang.String) binds: [B:31:0x004c, B:10:0x0034] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    private java.lang.String a(boolean r8) {
        /*
            r7 = this;
            com.baidu.location.c.h r0 = com.baidu.location.c.h.a()
            com.baidu.location.c.b r0 = r0.f()
            com.baidu.location.c.h r1 = com.baidu.location.c.h.a()
            com.baidu.location.c.m r1 = r1.r()
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r3 = 1024(0x400, float:1.435E-42)
            r2.<init>(r3)
            if (r0 == 0) goto L2a
            boolean r3 = r0.b()
            if (r3 == 0) goto L2a
            com.baidu.location.c.h r3 = com.baidu.location.c.h.a()
            java.lang.String r0 = r3.b(r0)
            r2.append(r0)
        L2a:
            r0 = 1
            r3 = 0
            if (r1 == 0) goto L44
            int r4 = r1.a()
            if (r4 <= r0) goto L44
            com.baidu.location.c.h r4 = com.baidu.location.c.h.a()
            int r5 = com.baidu.location.e.i.L
            r6 = 15
            java.lang.String r1 = r4.a(r6, r3, r1, r5)
        L40:
            r2.append(r1)
            goto L4f
        L44:
            com.baidu.location.c.h r1 = com.baidu.location.c.h.a()
            java.lang.String r1 = r1.o()
            if (r1 == 0) goto L4f
            goto L40
        L4f:
            if (r8 == 0) goto L56
            java.lang.String r8 = "&imo=1"
            r2.append(r8)
        L56:
            com.baidu.location.c.f r8 = com.baidu.location.c.f.a()
            java.lang.String r8 = r8.m()
            r2.append(r8)
            com.baidu.location.e.c r8 = com.baidu.location.e.c.a()
            java.lang.String r8 = r8.a(r3)
            r2.append(r8)
            com.baidu.location.b.d r8 = com.baidu.location.b.d.a()
            java.lang.String r8 = r8.c()
            r2.append(r8)
            com.baidu.location.b.g r8 = com.baidu.location.b.g.a()
            java.lang.String r8 = r8.c()
            r2.append(r8)
            android.content.Context r8 = com.baidu.location.f.getServiceContext()
            java.lang.String r8 = com.baidu.location.e.i.d(r8)
            r2.append(r8)
            android.content.Context r8 = com.baidu.location.f.getServiceContext()
            int r8 = com.baidu.location.e.i.b(r8)
            if (r8 < 0) goto L9f
            java.lang.String r1 = "&lmd="
            r2.append(r1)
            r2.append(r8)
        L9f:
            java.lang.String r8 = "&cnloc="
            r2.append(r8)
            com.baidu.location.b.n r8 = com.baidu.location.b.n.a()
            int r8 = r8.b()
            r2.append(r8)
            java.lang.String r8 = r2.toString()
            int r1 = r8.length()
            int r2 = com.baidu.location.e.i.f5256a0
            if (r1 <= r2) goto Lfc
            java.lang.String r1 = "&cl_list="
            java.lang.String[] r1 = r8.split(r1)
            int r2 = r1.length
            r4 = 2
            if (r2 != r4) goto Lfc
            r8 = r1[r0]
            java.lang.String r2 = "&"
            java.lang.String[] r8 = r8.split(r2, r4)
            int r2 = r8.length
            if (r2 != r4) goto Le9
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r1 = r1[r3]
            r2.append(r1)
            java.lang.String r1 = "&cl_list=null&"
            r2.append(r1)
            r8 = r8[r0]
            r2.append(r8)
            java.lang.String r8 = r2.toString()
            goto Lfc
        Le9:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r0 = r1[r3]
            r8.append(r0)
            java.lang.String r0 = "&cl_list=null"
            r8.append(r0)
            java.lang.String r8 = r8.toString()
        Lfc:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.location.b.m.a(boolean):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Bundle bundle) {
        d.a().a(bundle, 406);
    }

    public void a(String str) {
        if (this.f4786e) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = jSONObject.has(FirebaseAnalytics.Param.CONTENT) ? jSONObject.getJSONObject(FirebaseAnalytics.Param.CONTENT) : null;
            if (jSONObject2 == null || !jSONObject2.has("imo")) {
                return;
            }
            Long valueOf = Long.valueOf(jSONObject2.getJSONObject("imo").getString("mac"));
            int i8 = jSONObject2.getJSONObject("imo").getInt("mv");
            ContentValues contentValues = new ContentValues();
            contentValues.put(TtmlNode.TAG_TT, Integer.valueOf((int) (System.currentTimeMillis() / 1000)));
            contentValues.put("hst", Integer.valueOf(i8));
            if (this.f4785d.update("hstdata", contentValues, "id = \"" + valueOf + "\"", null) <= 0) {
                contentValues.put("id", valueOf);
                this.f4785d.insert("hstdata", null, contentValues);
            }
        } catch (Exception unused) {
        }
    }
}
