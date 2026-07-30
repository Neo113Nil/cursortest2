package com.baidu.platform.comapi.walknavi.g.i.j;

import android.os.AsyncTask;
import android.text.TextUtils;
import com.baidu.mapapi.http.wrapper.HttpManager;
import com.google.common.net.HttpHeaders;
import com.yanzhenjie.kalle.i;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class d extends AsyncTask<String, Void, String> implements c {

    /* renamed from: a, reason: collision with root package name */
    private String f10068a;

    /* renamed from: b, reason: collision with root package name */
    f<JSONObject> f10069b;

    public d(String str, f<JSONObject> fVar) {
        this.f10069b = fVar;
        this.f10068a = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public String doInBackground(String... strArr) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f10068a).openConnection();
            httpURLConnection.setConnectTimeout(20000);
            httpURLConnection.setReadTimeout(30000);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setRequestMethod(HttpManager.HTTP_POST);
            httpURLConnection.setRequestProperty("Connection", HttpHeaders.KEEP_ALIVE);
            httpURLConnection.setRequestProperty("Content-Type", i.VALUE_APPLICATION_JSON);
            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            com.baidu.platform.comapi.walknavi.g.i.k.a.a("post params = " + strArr[0]);
            dataOutputStream.write(strArr[0].getBytes());
            dataOutputStream.flush();
            dataOutputStream.close();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            String readLine = bufferedReader.readLine();
            bufferedReader.close();
            httpURLConnection.disconnect();
            return readLine;
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        if (TextUtils.isEmpty(str)) {
            f<JSONObject> fVar = this.f10069b;
            if (fVar != null) {
                fVar.a("http error! result is null");
                return;
            }
            return;
        }
        try {
            if (this.f10069b != null) {
                this.f10069b.onResponse(new JSONObject(str));
            }
        } catch (JSONException unused) {
        }
    }

    @Override // com.baidu.platform.comapi.walknavi.g.i.j.c
    public void a() {
        cancel(true);
        this.f10069b = null;
    }
}
