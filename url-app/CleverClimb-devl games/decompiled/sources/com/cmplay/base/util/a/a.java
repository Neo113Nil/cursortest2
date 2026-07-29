package com.cmplay.base.util.a;

import android.app.DownloadManager;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import android.widget.Toast;
import com.cmplay.base.util.h;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: ApkDownloadManager.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static a f3953a;

    /* renamed from: b, reason: collision with root package name */
    private Context f3954b;

    /* renamed from: d, reason: collision with root package name */
    private DownloadManager f3956d;
    private String f;

    /* renamed from: c, reason: collision with root package name */
    private boolean f3955c = false;
    private ArrayList<C0322a> e = new ArrayList<>();
    private BroadcastReceiver g = new BroadcastReceiver() { // from class: com.cmplay.base.util.a.a.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("android.intent.action.DOWNLOAD_COMPLETE")) {
                long longExtra = intent.getLongExtra("extra_download_id", 0L);
                Iterator it = a.this.e.iterator();
                while (it.hasNext()) {
                    C0322a c0322a = (C0322a) it.next();
                    if (c0322a != null && c0322a.f3960b == longExtra) {
                        h.a("APK_DOWNLOAD", "download complete   downloadId:" + longExtra);
                        Toast.makeText(a.this.f3954b, a.this.f + "已下载完成", 0).show();
                        a.this.a(longExtra);
                    }
                }
            }
        }
    };

    private a(Context context) {
        b(context);
    }

    public static a a(Context context) {
        if (f3953a == null) {
            f3953a = new a(context);
        }
        return f3953a;
    }

    public void b(Context context) {
        this.f3954b = context;
        if (!this.f3955c) {
            h.a("APK_DOWNLOAD", "ApkDownloadManager.init");
            b.a(this.f3954b);
            this.f3956d = (DownloadManager) this.f3954b.getSystemService("download");
            this.f3954b.registerReceiver(this.g, new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"));
            this.e.addAll(a());
        }
        this.f3955c = true;
    }

    public void a(String str, String str2) {
        if (TextUtils.isEmpty(str) || a(str.hashCode())) {
            return;
        }
        this.f = str2;
        int lastIndexOf = str.lastIndexOf("/");
        String substring = lastIndexOf >= 0 ? str.substring(lastIndexOf + 1, str.length()) : "";
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
        request.setAllowedNetworkTypes(3);
        request.setNotificationVisibility(1);
        request.setVisibleInDownloadsUi(true);
        request.setDestinationInExternalFilesDir(this.f3954b, Environment.DIRECTORY_DOWNLOADS, substring);
        request.setMimeType("application/vnd.android.package-archive");
        request.setTitle(substring);
        long enqueue = this.f3956d.enqueue(request);
        this.e.add(new C0322a(str.hashCode(), enqueue));
        a(this.e);
        Toast.makeText(this.f3954b, "开始下载" + str2, 1).show();
        h.a("APK_DOWNLOAD", "download start   downloadId:" + enqueue + "  apkUrl:" + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setDataAndType(this.f3956d.getUriForDownloadedFile(j), "application/vnd.android.package-archive");
        h.a("APK_DOWNLOAD", "installFile  Build.VERSION.SDK_INT:" + Build.VERSION.SDK_INT);
        if (Build.VERSION.SDK_INT >= 24) {
            h.a("APK_DOWNLOAD", "installFile  Build.VERSION.SDK_INT >= 24");
            intent.addFlags(1);
        } else {
            intent.setFlags(268435456);
        }
        try {
            this.f3954b.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            e.printStackTrace();
        }
    }

    private int[] b(long j) {
        Throwable th;
        Cursor cursor;
        int[] iArr = {-1, -1, 0};
        try {
            cursor = this.f3956d.query(new DownloadManager.Query().setFilterById(j));
            if (cursor != null) {
                try {
                    if (cursor.moveToFirst()) {
                        iArr[0] = cursor.getInt(cursor.getColumnIndexOrThrow("bytes_so_far"));
                        iArr[1] = cursor.getInt(cursor.getColumnIndexOrThrow("total_size"));
                        iArr[2] = cursor.getInt(cursor.getColumnIndex("status"));
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            return iArr;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
    }

    private boolean a(int i) {
        Iterator<C0322a> it = this.e.iterator();
        boolean z = false;
        while (it.hasNext()) {
            C0322a next = it.next();
            if (next != null && next.f3959a == i) {
                long j = next.f3960b;
                int[] b2 = b(j);
                h.a("APK_DOWNLOAD", "downloadApk  已经存在于下载列表   downloadId:" + j + "  bytesAndStatus[0]:" + b2[0] + "  bytesAndStatus[1]:" + b2[1] + "  bytesAndStatus[2]:" + b2[2]);
                if (b2[0] > 0 && b2[1] > 0) {
                    if (b2[0] == b2[1]) {
                        h.a("APK_DOWNLOAD", "downloadApk 已经下载完成，直接安装");
                        a(j);
                    } else {
                        h.a("APK_DOWNLOAD", "downloadApk 正在下载当中");
                        Toast.makeText(this.f3954b, "应用正在下载中，请稍候", 1).show();
                    }
                    z = true;
                }
            }
        }
        return z;
    }

    /* compiled from: ApkDownloadManager.java */
    /* renamed from: com.cmplay.base.util.a.a$a, reason: collision with other inner class name */
    private class C0322a {

        /* renamed from: a, reason: collision with root package name */
        public int f3959a;

        /* renamed from: b, reason: collision with root package name */
        public long f3960b;

        public C0322a() {
        }

        public C0322a(int i, long j) {
            this.f3959a = i;
            this.f3960b = j;
        }
    }

    public void a(ArrayList<C0322a> arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        int size = arrayList2.size();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < size) {
            C0322a c0322a = (C0322a) arrayList2.get(i);
            if (c0322a != null) {
                try {
                    sb.append(String.format(i == 0 ? "%d|%d" : ";%d|%d", Integer.valueOf(c0322a.f3959a), Long.valueOf(c0322a.f3960b)));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            i++;
        }
        h.a("APK_DOWNLOAD", "saveDownloadStatus:" + sb.toString());
        b.b("download_status", sb.toString());
    }

    public ArrayList<C0322a> a() {
        ArrayList<C0322a> arrayList = new ArrayList<>();
        String a2 = b.a("download_status", "");
        if (!TextUtils.isEmpty(a2)) {
            h.a("APK_DOWNLOAD", "parseDownloadStatus strStatus=" + a2);
            for (String str : a2.split(";")) {
                String[] split = str.split("\\|");
                C0322a c0322a = new C0322a();
                for (int i = 0; i < split.length; i++) {
                    if (i == 0) {
                        try {
                            c0322a.f3959a = Integer.parseInt(split[i]);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    if (1 == i) {
                        c0322a.f3960b = Integer.parseInt(split[i]);
                    }
                }
                arrayList.add(c0322a);
                h.a("APK_DOWNLOAD", "\nurlHashCode:" + c0322a.f3959a + "  downloadId:" + c0322a.f3960b);
            }
        }
        return arrayList;
    }
}
