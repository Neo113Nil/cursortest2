package com.ironsource.sdk.g;

import android.os.AsyncTask;
import com.google.android.gms.games.GamesStatusCodes;
import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: IronSourceAsyncHttpRequestTask.java */
/* loaded from: classes2.dex */
public class b extends AsyncTask<String, Integer, Integer> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer doInBackground(String... strArr) {
        HttpURLConnection httpURLConnection;
        HttpURLConnection httpURLConnection2 = null;
        try {
            try {
                httpURLConnection = (HttpURLConnection) new URL(strArr[0]).openConnection();
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            httpURLConnection.setConnectTimeout(GamesStatusCodes.STATUS_ACHIEVEMENT_UNLOCK_FAILURE);
            httpURLConnection.getInputStream();
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
        } catch (Exception e2) {
            httpURLConnection2 = httpURLConnection;
            e = e2;
            e.printStackTrace();
            if (httpURLConnection2 != null) {
                httpURLConnection2.disconnect();
            }
            return 1;
        } catch (Throwable th2) {
            httpURLConnection2 = httpURLConnection;
            th = th2;
            if (httpURLConnection2 != null) {
                httpURLConnection2.disconnect();
            }
            throw th;
        }
        return 1;
    }
}
