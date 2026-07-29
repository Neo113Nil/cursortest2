package com.facebook.appevents;

import android.content.Context;
import android.os.Bundle;
import com.facebook.GraphRequest;
import com.facebook.internal.ab;
import com.facebook.internal.b;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: SessionEventsState.java */
/* loaded from: classes.dex */
class l {

    /* renamed from: c, reason: collision with root package name */
    private int f6006c;

    /* renamed from: d, reason: collision with root package name */
    private com.facebook.internal.c f6007d;
    private String e;

    /* renamed from: a, reason: collision with root package name */
    private List<b> f6004a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private List<b> f6005b = new ArrayList();
    private final int f = 1000;

    public l(com.facebook.internal.c cVar, String str) {
        this.f6007d = cVar;
        this.e = str;
    }

    public synchronized void a(b bVar) {
        if (this.f6004a.size() + this.f6005b.size() >= 1000) {
            this.f6006c++;
        } else {
            this.f6004a.add(bVar);
        }
    }

    public synchronized int a() {
        return this.f6004a.size();
    }

    public synchronized void a(boolean z) {
        if (z) {
            try {
                this.f6004a.addAll(this.f6005b);
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f6005b.clear();
        this.f6006c = 0;
    }

    public int a(GraphRequest graphRequest, Context context, boolean z, boolean z2) {
        synchronized (this) {
            int i = this.f6006c;
            this.f6005b.addAll(this.f6004a);
            this.f6004a.clear();
            JSONArray jSONArray = new JSONArray();
            for (b bVar : this.f6005b) {
                if (z || !bVar.b()) {
                    jSONArray.put(bVar.c());
                }
            }
            if (jSONArray.length() == 0) {
                return 0;
            }
            a(graphRequest, context, i, jSONArray, z2);
            return jSONArray.length();
        }
    }

    public synchronized List<b> b() {
        List<b> list;
        list = this.f6004a;
        this.f6004a = new ArrayList();
        return list;
    }

    private void a(GraphRequest graphRequest, Context context, int i, JSONArray jSONArray, boolean z) {
        JSONObject jSONObject;
        try {
            jSONObject = com.facebook.internal.b.a(b.a.CUSTOM_APP_EVENTS, this.f6007d, this.e, z, context);
            if (this.f6006c > 0) {
                jSONObject.put("num_skipped_events", i);
            }
        } catch (JSONException unused) {
            jSONObject = new JSONObject();
        }
        graphRequest.a(jSONObject);
        Bundle e = graphRequest.e();
        if (e == null) {
            e = new Bundle();
        }
        String jSONArray2 = jSONArray.toString();
        if (jSONArray2 != null) {
            e.putByteArray("custom_events_file", a(jSONArray2));
            graphRequest.a((Object) jSONArray2);
        }
        graphRequest.a(e);
    }

    private byte[] a(String str) {
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            ab.a("Encoding exception: ", (Exception) e);
            return null;
        }
    }
}
