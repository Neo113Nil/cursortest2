package com.ironsource.a;

import android.os.AsyncTask;
import com.aiming.mdt.utils.Constants;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

/* compiled from: EventsSender.java */
/* loaded from: classes2.dex */
public class c extends AsyncTask<Object, Void, Boolean> {

    /* renamed from: a, reason: collision with root package name */
    private final int f6709a = 15000;

    /* renamed from: b, reason: collision with root package name */
    private final String f6710b = "POST";

    /* renamed from: c, reason: collision with root package name */
    private final String f6711c = "UTF-8";

    /* renamed from: d, reason: collision with root package name */
    private final String f6712d = Constants.KEY_CONTENT_TYPE;
    private final String e = "application/json";
    private ArrayList f;
    private d g;

    public c() {
    }

    public c(d dVar) {
        this.g = dVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Boolean doInBackground(Object... objArr) {
        try {
            boolean z = true;
            URL url = new URL((String) objArr[1]);
            this.f = (ArrayList) objArr[2];
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setReadTimeout(15000);
            httpURLConnection.setConnectTimeout(15000);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty(Constants.KEY_CONTENT_TYPE, "application/json");
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);
            OutputStream outputStream = httpURLConnection.getOutputStream();
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
            bufferedWriter.write((String) objArr[0]);
            bufferedWriter.flush();
            bufferedWriter.close();
            outputStream.close();
            int responseCode = httpURLConnection.getResponseCode();
            httpURLConnection.disconnect();
            if (responseCode != 200) {
                z = false;
            }
            return Boolean.valueOf(z);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(Boolean bool) {
        if (this.g != null) {
            this.g.a(this.f, bool.booleanValue());
        }
    }
}
