package com.appsflyer;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import com.aiming.mdt.utils.Constants;
import com.appsflyer.t;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class x extends AsyncTask<String, Void, String> {

    /* renamed from: a, reason: collision with root package name */
    Map<String, String> f3515a;

    /* renamed from: b, reason: collision with root package name */
    String f3516b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f3517c;
    private WeakReference<Context> f;
    private URL g;
    private HttpURLConnection i;

    /* renamed from: d, reason: collision with root package name */
    private String f3518d = "";
    private boolean e = false;
    private boolean h = true;
    private boolean j = true;

    @Override // android.os.AsyncTask
    protected final void onCancelled() {
    }

    x(Context context, boolean z) {
        this.f3517c = false;
        this.f = new WeakReference<>(context);
        this.f3517c = z;
    }

    @Override // android.os.AsyncTask
    protected final void onPreExecute() {
        if (this.f3516b == null) {
            this.f3516b = new JSONObject(this.f3515a).toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String doInBackground(String... strArr) {
        if (this.f3517c) {
            return null;
        }
        try {
            this.g = new URL(strArr[0]);
            if (this.h) {
                ag.a().a(this.g.toString(), this.f3516b);
                int length = this.f3516b.getBytes("UTF-8").length;
                StringBuilder sb = new StringBuilder("call = ");
                sb.append(this.g);
                sb.append("; size = ");
                sb.append(length);
                sb.append(" byte");
                sb.append(length > 1 ? com.umeng.commonsdk.proguard.d.ap : "");
                sb.append("; body = ");
                sb.append(this.f3516b);
                t.AnonymousClass3.b(sb.toString());
            }
            this.i = (HttpURLConnection) this.g.openConnection();
            this.i.setReadTimeout(30000);
            this.i.setConnectTimeout(30000);
            this.i.setRequestMethod("POST");
            this.i.setDoInput(true);
            this.i.setDoOutput(true);
            this.i.setRequestProperty(Constants.KEY_CONTENT_TYPE, "application/json");
            OutputStream outputStream = this.i.getOutputStream();
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
            bufferedWriter.write(this.f3516b);
            bufferedWriter.flush();
            bufferedWriter.close();
            outputStream.close();
            this.i.connect();
            int responseCode = this.i.getResponseCode();
            if (this.j) {
                i.c();
                this.f3518d = i.a(this.i);
            }
            if (this.h) {
                ag.a().a(this.g.toString(), responseCode, this.f3518d);
            }
            if (responseCode == 200) {
                d.d("Status 200 ok");
                Context context = this.f.get();
                if (this.g.toString().startsWith(m.b(i.f3448b)) && context != null) {
                    SharedPreferences.Editor edit = context.getSharedPreferences("appsflyer-data", 0).edit();
                    edit.putBoolean("sentRegisterRequestToAF", true);
                    edit.apply();
                    d.c("Successfully registered for Uninstall Tracking");
                }
            } else {
                this.e = true;
            }
        } catch (Throwable th) {
            StringBuilder sb2 = new StringBuilder("Error while calling ");
            sb2.append(this.g.toString());
            d.a(sb2.toString(), th);
            this.e = true;
        }
        return this.f3518d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void onPostExecute(String str) {
        if (this.e) {
            d.d("Connection error: ".concat(String.valueOf(str)));
        } else {
            d.d("Connection call succeeded: ".concat(String.valueOf(str)));
        }
    }

    final void a() {
        this.h = false;
    }
}
