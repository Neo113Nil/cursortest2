package com.baidu.mshield.x6.e;

import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import android.util.Base64;
import androidx.exifinterface.media.ExifInterface;
import com.baidu.ar.pd;
import com.baidu.mshield.x6.EngineImpl;
import com.baidu.mshield.x6.f.j;
import com.baidu.mshield.x6.f.l;
import com.crrepa.band.my.model.storage.BaseParamNames;
import com.google.android.exoplayer2.ExoPlayer;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public Context f8536a;

    /* renamed from: b, reason: collision with root package name */
    public com.baidu.mshield.x6.b.c f8537b;

    /* renamed from: c, reason: collision with root package name */
    public int f8538c;

    /* renamed from: d, reason: collision with root package name */
    public int f8539d;

    public e(Context context, int i8) {
        this(context, i8, 0);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(56:12|(53:101|(3:105|106|(1:108))|20|(1:100)(1:24)|25|26|27|28|29|30|31|32|33|34|(1:36)|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|(3:55|56|57)|58|59|60|(1:62)(1:99)|63|(1:65)(2:94|95)|66|67|68|69|70|71|(1:73)|74|(2:79|75)|(2:82|(1:84))(1:89)|85|86|87|88)(55:16|(1:18)|20|(1:22)|100|25|26|27|28|29|30|31|32|33|34|(0)|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|(0)|58|59|60|(0)(0)|63|(0)(0)|66|67|68|69|70|71|(0)|74|(3:77|79|75)|90|(0)(0)|85|86|87|88)|19|20|(0)|100|25|26|27|28|29|30|31|32|33|34|(0)|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|(0)|58|59|60|(0)(0)|63|(0)(0)|66|67|68|69|70|71|(0)|74|(1:75)|90|(0)(0)|85|86|87|88) */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x00a0, code lost:
    
        if (android.text.TextUtils.isEmpty(r6) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x020c, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x020d, code lost:
    
        com.baidu.mshield.x6.f.f.b(r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ae A[Catch: all -> 0x0013, TryCatch #1 {all -> 0x0013, blocks: (B:6:0x0004, B:8:0x000c, B:9:0x0011, B:12:0x0016, B:14:0x0077, B:16:0x007d, B:20:0x00a8, B:22:0x00ae, B:25:0x00b6, B:27:0x00ca, B:29:0x00db, B:31:0x00fd, B:33:0x010e, B:37:0x0125, B:39:0x012c, B:41:0x0146, B:43:0x014f, B:45:0x015d, B:47:0x016c, B:49:0x017d, B:51:0x018a, B:53:0x0197, B:55:0x01a8, B:57:0x01b2, B:58:0x01b9, B:60:0x01c4, B:63:0x01cf, B:65:0x01de, B:66:0x01fd, B:71:0x0212, B:74:0x021a, B:79:0x0239, B:82:0x024f, B:84:0x025a, B:85:0x026d, B:89:0x0267, B:93:0x020d, B:98:0x01fa, B:101:0x0084, B:103:0x008a, B:112:0x00a5, B:106:0x0090, B:108:0x009c, B:95:0x01e6, B:69:0x0205), top: B:5:0x0004, outer: #0, inners: #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01a8 A[Catch: all -> 0x0013, TRY_LEAVE, TryCatch #1 {all -> 0x0013, blocks: (B:6:0x0004, B:8:0x000c, B:9:0x0011, B:12:0x0016, B:14:0x0077, B:16:0x007d, B:20:0x00a8, B:22:0x00ae, B:25:0x00b6, B:27:0x00ca, B:29:0x00db, B:31:0x00fd, B:33:0x010e, B:37:0x0125, B:39:0x012c, B:41:0x0146, B:43:0x014f, B:45:0x015d, B:47:0x016c, B:49:0x017d, B:51:0x018a, B:53:0x0197, B:55:0x01a8, B:57:0x01b2, B:58:0x01b9, B:60:0x01c4, B:63:0x01cf, B:65:0x01de, B:66:0x01fd, B:71:0x0212, B:74:0x021a, B:79:0x0239, B:82:0x024f, B:84:0x025a, B:85:0x026d, B:89:0x0267, B:93:0x020d, B:98:0x01fa, B:101:0x0084, B:103:0x008a, B:112:0x00a5, B:106:0x0090, B:108:0x009c, B:95:0x01e6, B:69:0x0205), top: B:5:0x0004, outer: #0, inners: #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01de A[Catch: all -> 0x0013, TRY_LEAVE, TryCatch #1 {all -> 0x0013, blocks: (B:6:0x0004, B:8:0x000c, B:9:0x0011, B:12:0x0016, B:14:0x0077, B:16:0x007d, B:20:0x00a8, B:22:0x00ae, B:25:0x00b6, B:27:0x00ca, B:29:0x00db, B:31:0x00fd, B:33:0x010e, B:37:0x0125, B:39:0x012c, B:41:0x0146, B:43:0x014f, B:45:0x015d, B:47:0x016c, B:49:0x017d, B:51:0x018a, B:53:0x0197, B:55:0x01a8, B:57:0x01b2, B:58:0x01b9, B:60:0x01c4, B:63:0x01cf, B:65:0x01de, B:66:0x01fd, B:71:0x0212, B:74:0x021a, B:79:0x0239, B:82:0x024f, B:84:0x025a, B:85:0x026d, B:89:0x0267, B:93:0x020d, B:98:0x01fa, B:101:0x0084, B:103:0x008a, B:112:0x00a5, B:106:0x0090, B:108:0x009c, B:95:0x01e6, B:69:0x0205), top: B:5:0x0004, outer: #0, inners: #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x024f A[Catch: all -> 0x0013, TryCatch #1 {all -> 0x0013, blocks: (B:6:0x0004, B:8:0x000c, B:9:0x0011, B:12:0x0016, B:14:0x0077, B:16:0x007d, B:20:0x00a8, B:22:0x00ae, B:25:0x00b6, B:27:0x00ca, B:29:0x00db, B:31:0x00fd, B:33:0x010e, B:37:0x0125, B:39:0x012c, B:41:0x0146, B:43:0x014f, B:45:0x015d, B:47:0x016c, B:49:0x017d, B:51:0x018a, B:53:0x0197, B:55:0x01a8, B:57:0x01b2, B:58:0x01b9, B:60:0x01c4, B:63:0x01cf, B:65:0x01de, B:66:0x01fd, B:71:0x0212, B:74:0x021a, B:79:0x0239, B:82:0x024f, B:84:0x025a, B:85:0x026d, B:89:0x0267, B:93:0x020d, B:98:0x01fa, B:101:0x0084, B:103:0x008a, B:112:0x00a5, B:106:0x0090, B:108:0x009c, B:95:0x01e6, B:69:0x0205), top: B:5:0x0004, outer: #0, inners: #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0267 A[Catch: all -> 0x0013, TryCatch #1 {all -> 0x0013, blocks: (B:6:0x0004, B:8:0x000c, B:9:0x0011, B:12:0x0016, B:14:0x0077, B:16:0x007d, B:20:0x00a8, B:22:0x00ae, B:25:0x00b6, B:27:0x00ca, B:29:0x00db, B:31:0x00fd, B:33:0x010e, B:37:0x0125, B:39:0x012c, B:41:0x0146, B:43:0x014f, B:45:0x015d, B:47:0x016c, B:49:0x017d, B:51:0x018a, B:53:0x0197, B:55:0x01a8, B:57:0x01b2, B:58:0x01b9, B:60:0x01c4, B:63:0x01cf, B:65:0x01de, B:66:0x01fd, B:71:0x0212, B:74:0x021a, B:79:0x0239, B:82:0x024f, B:84:0x025a, B:85:0x026d, B:89:0x0267, B:93:0x020d, B:98:0x01fa, B:101:0x0084, B:103:0x008a, B:112:0x00a5, B:106:0x0090, B:108:0x009c, B:95:0x01e6, B:69:0x0205), top: B:5:0x0004, outer: #0, inners: #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01e6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a() {
        String h8;
        String d8;
        String str;
        JSONObject a8;
        int a9;
        int i8;
        try {
        } catch (Throwable th) {
            com.baidu.mshield.x6.f.f.b(th);
        }
        synchronized (e.class) {
            try {
                if (!com.baidu.mshield.b.e.a.d(this.f8536a)) {
                    com.baidu.mshield.b.c.a.a("run isCanRequestNetBackground=false");
                    return;
                }
                com.baidu.mshield.b.c.a.a("startzidcheck===" + this.f8538c + ";" + h.f8546b);
                h.f8546b = true;
                Object b8 = com.baidu.mshield.x6.f.b.b(this.f8536a);
                String b9 = this.f8537b.b();
                String e8 = this.f8537b.e();
                String c8 = this.f8537b.c();
                String f8 = this.f8537b.f();
                String d9 = this.f8537b.d();
                Object obj = b9 + "#" + c8;
                if (TextUtils.isEmpty(f8) && !TextUtils.isEmpty(d9)) {
                    if (!TextUtils.isEmpty(c8)) {
                    }
                    if (TextUtils.isEmpty(b9)) {
                    }
                    e8 = b9;
                    Object b10 = com.baidu.mshield.utility.c.b(this.f8536a);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(BaseParamNames.TOKEN, e8);
                    jSONObject.put("ut", com.baidu.mshield.x6.f.f.g(this.f8536a));
                    jSONObject.put("magic", b8);
                    jSONObject.put("token_rt", this.f8537b.f());
                    com.baidu.mshield.x6.b.b bVar = new com.baidu.mshield.x6.b.b(this.f8536a);
                    bVar.k(this.f8538c);
                    Object b11 = com.baidu.mshield.utility.c.b(this.f8536a);
                    jSONObject.put("mz", b10);
                    jSONObject.put("ds", com.baidu.mshield.x6.f.b.a(this.f8536a));
                    jSONObject.put("zid", b11);
                    jSONObject.put("act_st", String.valueOf(this.f8539d));
                    jSONObject.put("chn_st", com.baidu.mshield.x6.f.f.a(this.f8536a, "plc95", false) ? "1" : "0");
                    jSONObject.put("os_ver", EngineImpl.getInstance(this.f8536a).getPropertyByType("arl"));
                    long currentTimeMillis = System.currentTimeMillis();
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("1", bVar.J());
                    jSONObject2.put("2", bVar.K());
                    jSONObject2.put(ExifInterface.GPS_MEASUREMENT_3D, currentTimeMillis);
                    jSONObject2.put("4", bVar.m());
                    jSONObject.put("reason", jSONObject2);
                    jSONObject.put("tp", String.valueOf(this.f8538c));
                    jSONObject.put("tk", obj);
                    jSONObject.put(pd.f2955l, String.valueOf(Process.myPid()));
                    jSONObject.put("lrc", String.valueOf(bVar.F()));
                    jSONObject.put("cc", bVar.B());
                    h8 = bVar.h();
                    if (!TextUtils.isEmpty(h8)) {
                    }
                    jSONObject.put("lre", bVar.j());
                    jSONObject.put("ipo", bVar.z() ? "1" : "0");
                    d8 = com.baidu.mshield.x6.f.f.d(this.f8536a);
                    if (TextUtils.isEmpty(d8)) {
                    }
                    a(jSONObject);
                    bVar.d(0);
                    str = "";
                    str = com.baidu.mshield.utility.c.b(this.f8536a);
                    if (TextUtils.isEmpty(str)) {
                    }
                    jSONObject.put("cuid", str);
                    a8 = com.baidu.mshield.x6.f.f.a(this.f8536a, jSONObject, com.baidu.mshield.x6.f.g.f8564d, false);
                    a9 = l.a(this.f8536a, a8.toString(), this.f8539d);
                    while (a9 == -100) {
                        Thread.sleep(ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);
                        a9 = l.a(this.f8536a, a8.toString(), this.f8539d);
                    }
                    if (a9 == -100) {
                    }
                    h.f8546b = false;
                }
                if (!TextUtils.isEmpty(f8) && !TextUtils.isEmpty(d9)) {
                    try {
                        if (Long.parseLong(d9) > Long.parseLong(f8)) {
                        }
                    } catch (Throwable th2) {
                        com.baidu.mshield.x6.f.f.b(th2);
                    }
                }
                if (TextUtils.isEmpty(b9) || TextUtils.isEmpty(e8)) {
                    e8 = b9;
                }
                Object b102 = com.baidu.mshield.utility.c.b(this.f8536a);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(BaseParamNames.TOKEN, e8);
                jSONObject3.put("ut", com.baidu.mshield.x6.f.f.g(this.f8536a));
                jSONObject3.put("magic", b8);
                jSONObject3.put("token_rt", this.f8537b.f());
                com.baidu.mshield.x6.b.b bVar2 = new com.baidu.mshield.x6.b.b(this.f8536a);
                bVar2.k(this.f8538c);
                Object b112 = com.baidu.mshield.utility.c.b(this.f8536a);
                jSONObject3.put("mz", b102);
                jSONObject3.put("ds", com.baidu.mshield.x6.f.b.a(this.f8536a));
                jSONObject3.put("zid", b112);
                jSONObject3.put("act_st", String.valueOf(this.f8539d));
                jSONObject3.put("chn_st", com.baidu.mshield.x6.f.f.a(this.f8536a, "plc95", false) ? "1" : "0");
                jSONObject3.put("os_ver", EngineImpl.getInstance(this.f8536a).getPropertyByType("arl"));
                long currentTimeMillis2 = System.currentTimeMillis();
                JSONObject jSONObject22 = new JSONObject();
                jSONObject22.put("1", bVar2.J());
                jSONObject22.put("2", bVar2.K());
                jSONObject22.put(ExifInterface.GPS_MEASUREMENT_3D, currentTimeMillis2);
                jSONObject22.put("4", bVar2.m());
                jSONObject3.put("reason", jSONObject22);
                jSONObject3.put("tp", String.valueOf(this.f8538c));
                jSONObject3.put("tk", obj);
                jSONObject3.put(pd.f2955l, String.valueOf(Process.myPid()));
                jSONObject3.put("lrc", String.valueOf(bVar2.F()));
                jSONObject3.put("cc", bVar2.B());
                h8 = bVar2.h();
                if (!TextUtils.isEmpty(h8)) {
                    jSONObject3.put("dc", String.valueOf(com.baidu.mshield.x6.f.d.a(bVar2.i(), h8)));
                }
                jSONObject3.put("lre", bVar2.j());
                jSONObject3.put("ipo", bVar2.z() ? "1" : "0");
                d8 = com.baidu.mshield.x6.f.f.d(this.f8536a);
                if (TextUtils.isEmpty(d8)) {
                    jSONObject3.put("rmf", "");
                } else {
                    try {
                        jSONObject3.put("rmf", new JSONObject(d8).optString("2", ""));
                    } catch (Throwable th3) {
                        com.baidu.mshield.x6.f.f.b(th3);
                    }
                }
                a(jSONObject3);
                bVar2.d(0);
                str = "";
                str = com.baidu.mshield.utility.c.b(this.f8536a);
                if (TextUtils.isEmpty(str)) {
                    str = "";
                }
                jSONObject3.put("cuid", str);
                a8 = com.baidu.mshield.x6.f.f.a(this.f8536a, jSONObject3, com.baidu.mshield.x6.f.g.f8564d, false);
                a9 = l.a(this.f8536a, a8.toString(), this.f8539d);
                for (i8 = 1; a9 == -100 && i8 < 3; i8++) {
                    Thread.sleep(ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);
                    a9 = l.a(this.f8536a, a8.toString(), this.f8539d);
                }
                if (a9 == -100) {
                    bVar2.g(false);
                    if (com.baidu.mshield.b.a.d.b(this.f8536a)) {
                        f.b(this.f8536a).a(300000L);
                    }
                } else {
                    bVar2.c(currentTimeMillis2);
                    bVar2.d(1);
                }
                h.f8546b = false;
                b9 = c8;
                if (TextUtils.isEmpty(b9)) {
                }
                e8 = b9;
                Object b1022 = com.baidu.mshield.utility.c.b(this.f8536a);
                JSONObject jSONObject32 = new JSONObject();
                jSONObject32.put(BaseParamNames.TOKEN, e8);
                jSONObject32.put("ut", com.baidu.mshield.x6.f.f.g(this.f8536a));
                jSONObject32.put("magic", b8);
                jSONObject32.put("token_rt", this.f8537b.f());
                com.baidu.mshield.x6.b.b bVar22 = new com.baidu.mshield.x6.b.b(this.f8536a);
                bVar22.k(this.f8538c);
                Object b1122 = com.baidu.mshield.utility.c.b(this.f8536a);
                jSONObject32.put("mz", b1022);
                jSONObject32.put("ds", com.baidu.mshield.x6.f.b.a(this.f8536a));
                jSONObject32.put("zid", b1122);
                jSONObject32.put("act_st", String.valueOf(this.f8539d));
                jSONObject32.put("chn_st", com.baidu.mshield.x6.f.f.a(this.f8536a, "plc95", false) ? "1" : "0");
                jSONObject32.put("os_ver", EngineImpl.getInstance(this.f8536a).getPropertyByType("arl"));
                long currentTimeMillis22 = System.currentTimeMillis();
                JSONObject jSONObject222 = new JSONObject();
                jSONObject222.put("1", bVar22.J());
                jSONObject222.put("2", bVar22.K());
                jSONObject222.put(ExifInterface.GPS_MEASUREMENT_3D, currentTimeMillis22);
                jSONObject222.put("4", bVar22.m());
                jSONObject32.put("reason", jSONObject222);
                jSONObject32.put("tp", String.valueOf(this.f8538c));
                jSONObject32.put("tk", obj);
                jSONObject32.put(pd.f2955l, String.valueOf(Process.myPid()));
                jSONObject32.put("lrc", String.valueOf(bVar22.F()));
                jSONObject32.put("cc", bVar22.B());
                h8 = bVar22.h();
                if (!TextUtils.isEmpty(h8)) {
                }
                jSONObject32.put("lre", bVar22.j());
                jSONObject32.put("ipo", bVar22.z() ? "1" : "0");
                d8 = com.baidu.mshield.x6.f.f.d(this.f8536a);
                if (TextUtils.isEmpty(d8)) {
                }
                a(jSONObject32);
                bVar22.d(0);
                str = "";
                str = com.baidu.mshield.utility.c.b(this.f8536a);
                if (TextUtils.isEmpty(str)) {
                }
                jSONObject32.put("cuid", str);
                a8 = com.baidu.mshield.x6.f.f.a(this.f8536a, jSONObject32, com.baidu.mshield.x6.f.g.f8564d, false);
                a9 = l.a(this.f8536a, a8.toString(), this.f8539d);
                while (a9 == -100) {
                }
                if (a9 == -100) {
                }
                h.f8546b = false;
            } finally {
            }
        }
    }

    public e(Context context, int i8, int i9) {
        this.f8536a = context;
        this.f8538c = i8;
        this.f8539d = i9;
        this.f8537b = new com.baidu.mshield.x6.b.c(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0103 A[Catch: all -> 0x0109, TryCatch #1 {all -> 0x0109, blocks: (B:15:0x007b, B:19:0x0086, B:23:0x009d, B:26:0x00d0, B:30:0x00fa, B:32:0x0103, B:35:0x010c, B:39:0x011b, B:41:0x015d, B:48:0x0067, B:54:0x0075, B:51:0x006c), top: B:47:0x0067, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010c A[Catch: all -> 0x0109, TRY_LEAVE, TryCatch #1 {all -> 0x0109, blocks: (B:15:0x007b, B:19:0x0086, B:23:0x009d, B:26:0x00d0, B:30:0x00fa, B:32:0x0103, B:35:0x010c, B:39:0x011b, B:41:0x015d, B:48:0x0067, B:54:0x0075, B:51:0x006c), top: B:47:0x0067, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(JSONObject jSONObject) {
        String str;
        Throwable th;
        String str2;
        String str3;
        String str4;
        String E;
        String G;
        String d8;
        String str5 = "";
        try {
            d8 = com.baidu.mshield.x6.f.f.d(this.f8536a);
        } catch (Throwable th2) {
            str = "";
            th = th2;
            str2 = str;
        }
        if (!TextUtils.isEmpty(d8)) {
            JSONObject jSONObject2 = new JSONObject(d8);
            String optString = jSONObject2.optString("1");
            if (TextUtils.isEmpty(optString)) {
                str = "";
            } else {
                str = new String(com.baidu.mshield.b.a.c.b(Base64.decode(optString.getBytes(), 0)), "utf-8");
                com.baidu.mshield.b.c.a.a("doRmfDetect ungzDrf : " + str);
            }
            try {
                str2 = jSONObject2.optString(ExifInterface.GPS_MEASUREMENT_3D);
                try {
                    str5 = jSONObject2.optString("2");
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        com.baidu.mshield.x6.f.f.b(th);
                        try {
                            jSONObject.put("15094", com.baidu.mshield.x6.f.f.a(th));
                        } catch (Throwable th4) {
                            com.baidu.mshield.x6.f.f.b(th4);
                        }
                        str3 = str2;
                        str4 = str5;
                        str5 = str;
                        jSONObject.put("15091", !TextUtils.isEmpty(str5) ? "1" : "0");
                        com.baidu.mshield.x6.b.b bVar = new com.baidu.mshield.x6.b.b(this.f8536a);
                        E = bVar.E();
                        if (TextUtils.isEmpty(E)) {
                        }
                        boolean a8 = com.baidu.mshield.x6.f.f.a(this.f8536a, false);
                        jSONObject.put("15082", str4 + "#" + E + "#" + (a8 ? 1 : 0));
                        jSONObject.put("15083", str3);
                        G = bVar.G();
                        if (TextUtils.isEmpty(G)) {
                        }
                        jSONObject.put("15112", str4 + "#" + G + "#" + (a8 ? 1 : 0));
                        boolean f8 = com.baidu.xclient.gdid.a.f(this.f8536a);
                        jSONObject.put("15006", f8 ? "1" : "0");
                        if (TextUtils.isEmpty(str5)) {
                        }
                    } catch (Throwable th5) {
                        com.baidu.mshield.x6.f.f.b(th5);
                        return;
                    }
                }
            } catch (Throwable th6) {
                th = th6;
                str2 = "";
            }
            str3 = str2;
            str4 = str5;
            str5 = str;
            jSONObject.put("15091", !TextUtils.isEmpty(str5) ? "1" : "0");
            com.baidu.mshield.x6.b.b bVar2 = new com.baidu.mshield.x6.b.b(this.f8536a);
            E = bVar2.E();
            if (TextUtils.isEmpty(E)) {
                E = "#";
            }
            boolean a82 = com.baidu.mshield.x6.f.f.a(this.f8536a, false);
            jSONObject.put("15082", str4 + "#" + E + "#" + (a82 ? 1 : 0));
            jSONObject.put("15083", str3);
            G = bVar2.G();
            if (TextUtils.isEmpty(G)) {
                G = "#";
            }
            jSONObject.put("15112", str4 + "#" + G + "#" + (a82 ? 1 : 0));
            boolean f82 = com.baidu.xclient.gdid.a.f(this.f8536a);
            jSONObject.put("15006", f82 ? "1" : "0");
            if (TextUtils.isEmpty(str5)) {
                com.baidu.mshield.b.c.a.a("real machine sig is empty");
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (f82) {
                String a9 = a(str5, true);
                long currentTimeMillis2 = System.currentTimeMillis();
                com.baidu.mshield.b.c.a.a("cpp param 2 result : " + a9);
                jSONObject.put("d0006", String.valueOf(currentTimeMillis2 - currentTimeMillis));
                jSONObject.put("15085", a9);
                jSONObject.put("isj", "0");
                jSONObject.put("ise", "1");
                com.baidu.mshield.b.c.a.b("native cpp=" + a9);
                return;
            }
            String a10 = a(str5, false);
            long currentTimeMillis3 = System.currentTimeMillis();
            com.baidu.mshield.b.c.a.a("java param 2 result : " + a10);
            jSONObject.put("d0006", String.valueOf(currentTimeMillis3 - currentTimeMillis));
            jSONObject.put("15085", a10);
            jSONObject.put("isj", "1");
            jSONObject.put("ise", "0");
            return;
        }
        str4 = "";
        str3 = str4;
        jSONObject.put("15091", !TextUtils.isEmpty(str5) ? "1" : "0");
        com.baidu.mshield.x6.b.b bVar22 = new com.baidu.mshield.x6.b.b(this.f8536a);
        E = bVar22.E();
        if (TextUtils.isEmpty(E)) {
        }
        boolean a822 = com.baidu.mshield.x6.f.f.a(this.f8536a, false);
        jSONObject.put("15082", str4 + "#" + E + "#" + (a822 ? 1 : 0));
        jSONObject.put("15083", str3);
        G = bVar22.G();
        if (TextUtils.isEmpty(G)) {
        }
        jSONObject.put("15112", str4 + "#" + G + "#" + (a822 ? 1 : 0));
        boolean f822 = com.baidu.xclient.gdid.a.f(this.f8536a);
        jSONObject.put("15006", f822 ? "1" : "0");
        if (TextUtils.isEmpty(str5)) {
        }
    }

    public final String a(String str, boolean z7) {
        int optInt;
        int optInt2;
        String optString;
        String optString2;
        String valueOf;
        String str2;
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i8 = 0; i8 < jSONArray.length(); i8++) {
                try {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i8);
                    optInt = optJSONObject.optInt("eid");
                    optInt2 = optJSONObject.optInt("pattern");
                    optString = optJSONObject.optString("item");
                    optString2 = optJSONObject.optString("value");
                } catch (Throwable th) {
                    com.baidu.mshield.x6.f.f.b(th);
                }
                if (optInt2 != 0) {
                    str2 = "";
                    if (optInt2 == 2 || optInt2 == 3) {
                        String[] split = optString.split("\\|");
                        String str3 = split[0];
                        String str4 = split[1];
                        str2 = split.length == 3 ? split[2] : "";
                        if (optInt2 == 2) {
                            if (z7) {
                                valueOf = (String) com.baidu.xclient.gdid.a.a(25, optString, optString2, (Object) null);
                            } else {
                                valueOf = j.b(str3, str4, str2, optString2);
                            }
                        } else if (z7) {
                            valueOf = (String) com.baidu.xclient.gdid.a.a(26, optString, optString2, (Object) null);
                        } else {
                            valueOf = j.a(str3, str4, str2, optString2);
                        }
                    }
                    jSONObject.put(String.valueOf(optInt), str2);
                } else if (z7) {
                    valueOf = (String) com.baidu.xclient.gdid.a.a(24, optString, optString2, (Object) null);
                } else {
                    valueOf = String.valueOf(com.baidu.mshield.x6.f.f.c(optString));
                }
                str2 = valueOf;
                jSONObject.put(String.valueOf(optInt), str2);
            }
        } catch (Throwable th2) {
            com.baidu.mshield.x6.f.f.b(th2);
        }
        return jSONObject.toString();
    }
}
