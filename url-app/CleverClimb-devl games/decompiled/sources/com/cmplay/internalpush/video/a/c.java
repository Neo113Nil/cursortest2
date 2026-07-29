package com.cmplay.internalpush.video.a;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.cmplay.base.util.h;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.util.Deque;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: VideoDownloaderTask.java */
/* loaded from: classes.dex */
public class c extends AsyncTask<String, Void, Integer> {

    /* renamed from: a, reason: collision with root package name */
    private Deque<WeakReference<c>> f4370a;

    /* renamed from: b, reason: collision with root package name */
    private a f4371b;

    /* renamed from: d, reason: collision with root package name */
    private String f4373d;
    private CopyOnWriteArrayList<String> e;
    private String f;
    private Context i;
    private long g = 0;
    private long h = -1;

    /* renamed from: c, reason: collision with root package name */
    private WeakReference<c> f4372c = new WeakReference<>(this);

    /* compiled from: VideoDownloaderTask.java */
    public interface a {
        void a(int i, String str);
    }

    public void a(long j, Context context) {
        this.h = j;
        this.i = context;
    }

    public c(CopyOnWriteArrayList<String> copyOnWriteArrayList, Deque<WeakReference<c>> deque, a aVar) {
        this.e = copyOnWriteArrayList;
        this.f4371b = aVar;
        this.f4370a = deque;
        this.f4370a.add(this.f4372c);
    }

    public void a(File file) {
        if (file.exists()) {
            file.delete();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer doInBackground(String... strArr) {
        this.g = h.b();
        if (strArr == null || strArr.length < 2 || strArr[0] == null || TextUtils.isEmpty(strArr[1])) {
            return 1;
        }
        String str = strArr[0];
        String str2 = strArr[1];
        String str3 = strArr.length > 2 ? strArr[2] : "";
        this.f = str;
        h.a("开始下载----" + str2);
        try {
            File file = new File(str2);
            this.f4373d = str2;
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
            HttpURLConnection a2 = d.a(str);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(a2.getInputStream());
            try {
                int responseCode = a2.getResponseCode();
                if (responseCode >= 200 && responseCode < 300) {
                    long contentLength = a2.getContentLength();
                    if (contentLength > 20971520) {
                        return 3;
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        String packageName = this.i.getPackageName();
                        Intent intent = new Intent();
                        intent.setPackage(packageName);
                        intent.setAction("video_size_save");
                        intent.putExtra("videoFileName", str3);
                        intent.putExtra("contentLength", contentLength);
                        if (this.i != null) {
                            this.i.sendBroadcast(intent);
                            h.a("zzb_video", "发送 长度 =" + contentLength);
                        }
                    }
                    if (this.h != -1 && contentLength >= this.h) {
                        return 7;
                    }
                    byte[] bArr = new byte[4096];
                    long j = 0;
                    while (true) {
                        int read = bufferedInputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        j += read;
                        bufferedOutputStream.write(bArr, 0, read);
                    }
                    bufferedOutputStream.flush();
                    if (contentLength != 0 && j >= contentLength) {
                        h.a("请求逻辑走完 ---");
                        return 0;
                    }
                    return 6;
                }
                return 2;
            } finally {
                h.a("close资源----");
                bufferedOutputStream.close();
                bufferedInputStream.close();
                a2.disconnect();
            }
        } catch (Exception e) {
            e.printStackTrace();
            h.a("网络异常----4");
            return 4;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(Integer num) {
        h.a(this.g, this.f + " 下载");
        h.a("下载返回0为成功，实际=" + num);
        if (isCancelled()) {
            num = 5;
        }
        this.f4370a.remove(this.f4372c);
        if (num.intValue() == 0) {
            this.f4371b.a(num.intValue(), this.f4373d);
            return;
        }
        try {
            if (!TextUtils.isEmpty(this.f4373d)) {
                a(new File(this.f4373d));
            }
        } catch (Exception unused) {
            h.a("删除文件异常: " + this.f4373d);
        }
        this.f4371b.a(num.intValue(), "文件未下载成功! errorCode=" + num);
    }
}
