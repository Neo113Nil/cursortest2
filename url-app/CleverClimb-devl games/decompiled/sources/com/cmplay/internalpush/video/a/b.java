package com.cmplay.internalpush.video.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.support.v4.app.NotificationCompat;
import android.text.TextUtils;
import com.cmplay.base.util.h;
import com.cmplay.base.util.s;
import com.cmplay.base.util.x;
import com.cmplay.internalpush.a.e;
import com.cmplay.internalpush.o;
import com.cmplay.internalpush.video.a.c;
import java.io.File;
import java.io.FilenameFilter;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: VideoDownloadTaskManager.java */
/* loaded from: classes.dex */
public class b {
    private static b k;

    /* renamed from: b, reason: collision with root package name */
    private Context f4359b;

    /* renamed from: d, reason: collision with root package name */
    private File f4361d;

    /* renamed from: a, reason: collision with root package name */
    private final String f4358a = "InnerPushVideoCache";

    /* renamed from: c, reason: collision with root package name */
    private final Deque<WeakReference<c>> f4360c = new ArrayDeque();
    private boolean e = false;
    private boolean f = false;
    private boolean g = false;
    private a h = null;
    private CopyOnWriteArrayList<com.cmplay.internalpush.video.a.a> i = new CopyOnWriteArrayList<>();
    private CopyOnWriteArrayList<String> j = new CopyOnWriteArrayList<>();

    private b() {
    }

    public static b a() {
        if (k == null) {
            k = new b();
        }
        return k;
    }

    public void a(Context context) {
        File externalCacheDir;
        if (context == null) {
            return;
        }
        this.f = true;
        this.f4359b = context.getApplicationContext();
        this.e = false;
        if (this.f4359b.getFilesDir() != null) {
            this.f4361d = new File(this.f4359b.getFilesDir().getPath());
        }
        if (Build.VERSION.SDK_INT <= 18 || (externalCacheDir = this.f4359b.getExternalCacheDir()) == null) {
            return;
        }
        this.f4361d = new File(externalCacheDir.getAbsolutePath(), "InnerPushVideoCache");
        this.e = true;
        if (this.f4361d.mkdirs()) {
            h.a("InnerPushVideoCache dirs create ok");
        }
    }

    public void a(ArrayList<String> arrayList) {
        File[] listFiles;
        long b2 = h.b();
        if (this.f4361d == null || arrayList == null || arrayList.size() == 0) {
            return;
        }
        if (!this.f4361d.isDirectory()) {
            h.a("not directory 不是目录");
        } else {
            try {
                if (this.f4361d.getAbsolutePath().endsWith("InnerPushVideoCache")) {
                    listFiles = this.f4361d.listFiles();
                } else {
                    listFiles = this.f4361d.listFiles(new FilenameFilter() { // from class: com.cmplay.internalpush.video.a.b.1
                        @Override // java.io.FilenameFilter
                        public boolean accept(File file, String str) {
                            return str.startsWith("innerpush_");
                        }
                    });
                }
                ArrayList arrayList2 = new ArrayList();
                for (File file : listFiles) {
                    String name = file.getName();
                    if (!arrayList.contains(name)) {
                        boolean delete = file.delete();
                        e.a(name);
                        h.a("新数据不包含，干掉：" + name);
                        if (!delete) {
                            h.a("没干掉------：" + name);
                        }
                    } else {
                        arrayList2.add(name);
                    }
                }
                Set<String> a2 = e.a();
                ArrayList arrayList3 = new ArrayList();
                if (a2 != null) {
                    for (String str : a2) {
                        if (str.startsWith("innerpush_")) {
                            arrayList3.add(str);
                        }
                    }
                }
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    if (!arrayList2.contains(str2)) {
                        h.a("清理掉的：" + str2);
                        e.a(str2);
                    }
                }
            } catch (Exception e) {
                h.a("文件删除error " + e.getMessage());
            }
        }
        h.a(b2, "cleanCacheVideoFile()");
    }

    public String b() {
        if (this.f4361d != null) {
            return this.f4361d.getAbsolutePath();
        }
        return null;
    }

    public String a(String str) {
        return b() + "/" + str;
    }

    /* compiled from: VideoDownloadTaskManager.java */
    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                if (intent.getAction().equals("com.innerpushvideo.down_notify") && x.b()) {
                    int intExtra = intent.getIntExtra("errorCode", -1);
                    String stringExtra = intent.getStringExtra(NotificationCompat.CATEGORY_MESSAGE);
                    String stringExtra2 = intent.getStringExtra("videoUrl");
                    if (!TextUtils.isEmpty(stringExtra2)) {
                        h.a("DownTaskReceiver -----移除url");
                        b.this.j.remove(stringExtra2);
                    }
                    h.a("DownTaskReceiver -----接收：" + intExtra + ", msg=" + stringExtra);
                    b.this.a(intExtra, stringExtra2, stringExtra);
                }
                if (intent.getAction().equals("video_size_save")) {
                    String stringExtra3 = intent.getStringExtra("videoFileName");
                    long longExtra = intent.getLongExtra("contentLength", 0L);
                    h.a("zzb_video", stringExtra3 + ", 保存长度 =" + longExtra);
                    e.b(stringExtra3, longExtra);
                }
            }
        }
    }

    public synchronized void a(final String str, String str2) {
        h.a("serviceDownVideo -----");
        if (this.f4359b == null) {
            return;
        }
        if (!this.f) {
            a(this.f4359b);
        }
        h.a(x.a() ? "是service进程下载" : "不是service进程下载");
        a(3, str, str2, new c.a() { // from class: com.cmplay.internalpush.video.a.b.2
            @Override // com.cmplay.internalpush.video.a.c.a
            public void a(int i, String str3) {
                h.a("serviceDownVideo -----下载完成：" + i);
                String packageName = b.this.f4359b.getPackageName();
                Intent intent = new Intent();
                intent.setPackage(packageName);
                intent.setAction("com.innerpushvideo.down_notify");
                intent.putExtra("errorCode", i);
                intent.putExtra(NotificationCompat.CATEGORY_MESSAGE, str3);
                intent.putExtra("videoUrl", str);
                b.this.f4359b.sendBroadcast(intent);
            }
        });
    }

    public synchronized void a(long j, String str, String str2, String str3, String str4, String str5, long j2, int i, c.a aVar) {
        if (str2 == null) {
            h.a("video url is null");
            aVar.a(1, "video url is null");
            return;
        }
        a(j, str2, aVar);
        if (this.j.contains(str2)) {
            h.a("video url is contains");
            return;
        }
        this.j.add(str2);
        String a2 = a(str3);
        File file = new File(a2);
        if (file.exists()) {
            long a3 = e.a(str3, 0L);
            h.a("requestedSize ----------= " + a3);
            if (file.length() >= 1 && file.length() >= a3) {
                if (!TextUtils.isEmpty(str2) && this.j.contains(str2)) {
                    this.j.remove(str2);
                    h.a("remove :" + str2);
                }
                h.a("file exists");
                aVar.a(1000, a2);
                return;
            }
            h.a("清理掉，本地大小：" + file.length() + ", 线上大小: " + a3);
            file.delete();
        }
        if (!s.c(this.f4359b)) {
            if (!TextUtils.isEmpty(str2) && this.j.contains(str2)) {
                this.j.remove(str2);
                h.a("没网 remove :" + str2);
            }
            aVar.a(8, a2);
            return;
        }
        o.a().a(4, 6, str, j, "", 0, i, (int) j2);
        if (com.cmplay.internalpush.video.h.f4392d) {
            if (!this.g) {
                IntentFilter intentFilter = new IntentFilter();
                this.h = new a();
                intentFilter.addAction("com.innerpushvideo.down_notify");
                intentFilter.addAction("video_size_save");
                this.f4359b.registerReceiver(this.h, intentFilter);
                this.g = true;
            }
            com.cmplay.internalpush.video.h.b(str2, str3, str4, str5);
        } else {
            a(3, str2, str3, aVar);
        }
    }

    private void a(long j, String str, c.a aVar) {
        Iterator<com.cmplay.internalpush.video.a.a> it = this.i.iterator();
        boolean z = false;
        while (it.hasNext()) {
            com.cmplay.internalpush.video.a.a next = it.next();
            if (next != null && next.f4355a == j) {
                z = true;
            }
        }
        if (z) {
            return;
        }
        h.a("addDownloadInfo   proId：" + j + "    url:" + str);
        this.i.add(new com.cmplay.internalpush.video.a.a(j, str, aVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(int i, String str, String str2) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        copyOnWriteArrayList.addAll(this.i);
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            com.cmplay.internalpush.video.a.a aVar = (com.cmplay.internalpush.video.a.a) it.next();
            if (aVar != null && aVar.f4356b.compareTo(str) == 0 && aVar.f4357c != null) {
                aVar.f4357c.a(i, str2);
                h.a("notifyDownloadComplete   callback to  proId：" + aVar.f4355a + "\nurl:" + str + "\nlocal path:" + str2);
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:10:0x0054
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v4 */
    public void a(final int r11, final java.lang.String r12, final java.lang.String r13, final com.cmplay.internalpush.video.a.c.a r14) {
        /*
            r10 = this;
            com.cmplay.internalpush.video.a.c r0 = new com.cmplay.internalpush.video.a.c
            java.util.concurrent.CopyOnWriteArrayList<java.lang.String> r1 = r10.j
            java.util.Deque<java.lang.ref.WeakReference<com.cmplay.internalpush.video.a.c>> r2 = r10.f4360c
            com.cmplay.internalpush.video.a.b$3 r9 = new com.cmplay.internalpush.video.a.b$3
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r8 = r14
            r3.<init>()
            r0.<init>(r1, r2, r9)
            boolean r11 = r10.e     // Catch: java.lang.Exception -> L54
            r1 = 1024(0x400, double:5.06E-321)
            if (r11 == 0) goto L36
            long r3 = com.cmplay.internalpush.a.b.a()     // Catch: java.lang.Exception -> L54
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L54
            r11.<init>()     // Catch: java.lang.Exception -> L54
            java.lang.String r5 = "sd 卡 memSize ="
            r11.append(r5)     // Catch: java.lang.Exception -> L54
            long r5 = r3 / r1
            long r5 = r5 / r1
            r11.append(r5)     // Catch: java.lang.Exception -> L54
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Exception -> L54
            com.cmplay.base.util.h.a(r11)     // Catch: java.lang.Exception -> L54
            goto L56
        L36:
            android.content.Context r11 = r10.f4359b     // Catch: java.lang.Exception -> L54
            long r3 = com.cmplay.internalpush.a.b.a(r11)     // Catch: java.lang.Exception -> L54
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L54
            r11.<init>()     // Catch: java.lang.Exception -> L54
            java.lang.String r5 = "内存 memSize ="
            r11.append(r5)     // Catch: java.lang.Exception -> L54
            long r5 = r3 / r1
            long r5 = r5 / r1
            r11.append(r5)     // Catch: java.lang.Exception -> L54
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Exception -> L54
            com.cmplay.base.util.h.a(r11)     // Catch: java.lang.Exception -> L54
            goto L56
        L54:
            r3 = -1
        L56:
            android.content.Context r11 = r10.f4359b     // Catch: java.lang.Exception -> L6f
            r0.a(r3, r11)     // Catch: java.lang.Exception -> L6f
            r11 = 3
            java.lang.String[] r11 = new java.lang.String[r11]     // Catch: java.lang.Exception -> L6f
            r1 = 0
            r11[r1] = r12     // Catch: java.lang.Exception -> L6f
            r12 = 1
            java.lang.String r1 = r10.a(r13)     // Catch: java.lang.Exception -> L6f
            r11[r12] = r1     // Catch: java.lang.Exception -> L6f
            r12 = 2
            r11[r12] = r13     // Catch: java.lang.Exception -> L6f
            com.cmplay.internalpush.a.a.a(r0, r11)     // Catch: java.lang.Exception -> L6f
            goto L75
        L6f:
            r11 = -1
            java.lang.String r12 = "AsyncTasks Execute excption"
            r14.a(r11, r12)
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmplay.internalpush.video.a.b.a(int, java.lang.String, java.lang.String, com.cmplay.internalpush.video.a.c$a):void");
    }
}
