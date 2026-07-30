package com.crrepa.y;

import android.os.Handler;
import android.os.Looper;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/* loaded from: classes3.dex */
public abstract class a {
    public static Handler mMainHandler = new Handler(Looper.getMainLooper());

    /* renamed from: com.crrepa.y.a$a, reason: collision with other inner class name */
    class RunnableC0251a implements Runnable {

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ com.crrepa.x.c f14038h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ String f14039i;

        RunnableC0251a(com.crrepa.x.c cVar, String str) {
            this.f14038h = cVar;
            this.f14039i = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.onFailure(this.f14038h.f13990c, this.f14039i);
        }
    }

    class b implements Runnable {

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Object f14041h;

        b(Object obj) {
            this.f14041h = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.onResponse(this.f14041h);
        }
    }

    protected static String getRetString(InputStream inputStream) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    inputStream.close();
                    return sb.toString();
                }
                sb.append(readLine + "\n");
            }
        } catch (Exception unused) {
            return null;
        }
    }

    public void onError(com.crrepa.x.c cVar) {
        String retString;
        InputStream inputStream = cVar.f13988a;
        if (inputStream == null && (inputStream = cVar.f13989b) == null) {
            Exception exc = cVar.f13992e;
            retString = exc != null ? exc.getMessage() : "";
        } else {
            retString = getRetString(inputStream);
        }
        mMainHandler.post(new RunnableC0251a(cVar, retString));
    }

    public abstract void onFailure(int i8, String str);

    public abstract Object onParseResponse(com.crrepa.x.c cVar);

    public void onProgress(float f8, long j8) {
    }

    public abstract void onResponse(Object obj);

    public void onSeccess(com.crrepa.x.c cVar) {
        mMainHandler.post(new b(onParseResponse(cVar)));
    }
}
