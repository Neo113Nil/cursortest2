package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

@Deprecated
/* loaded from: classes.dex */
public final class r10 {

    /* renamed from: d, reason: collision with root package name */
    String f10968d;

    /* renamed from: e, reason: collision with root package name */
    Context f10969e;

    /* renamed from: f, reason: collision with root package name */
    String f10970f;

    /* renamed from: h, reason: collision with root package name */
    private AtomicBoolean f10972h;

    /* renamed from: i, reason: collision with root package name */
    private File f10973i;

    /* renamed from: a, reason: collision with root package name */
    final BlockingQueue<b20> f10965a = new ArrayBlockingQueue(100);

    /* renamed from: b, reason: collision with root package name */
    final LinkedHashMap<String, String> f10966b = new LinkedHashMap<>();

    /* renamed from: c, reason: collision with root package name */
    final Map<String, x10> f10967c = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    private final HashSet<String> f10971g = new HashSet<>(Arrays.asList("noop", "activeViewPingSent", "viewabilityChanged", "visibilityChanged"));

    public static /* synthetic */ void c(r10 r10Var) {
        while (true) {
            try {
                b20 take = r10Var.f10965a.take();
                a20 a7 = take.a();
                if (!TextUtils.isEmpty(a7.b())) {
                    r10Var.g(r10Var.b(r10Var.f10966b, take.b()), a7);
                }
            } catch (InterruptedException e7) {
                io0.h("CsiReporter:reporter interrupted", e7);
                return;
            }
        }
    }

    private final void g(Map<String, String> map, a20 a20Var) {
        FileOutputStream fileOutputStream;
        Uri.Builder buildUpon = Uri.parse(this.f10968d).buildUpon();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        String uri = buildUpon.build().toString();
        if (a20Var != null) {
            StringBuilder sb = new StringBuilder(uri);
            if (!TextUtils.isEmpty(a20Var.b())) {
                sb.append("&it=");
                sb.append(a20Var.b());
            }
            if (!TextUtils.isEmpty(a20Var.a())) {
                sb.append("&blat=");
                sb.append(a20Var.a());
            }
            uri = sb.toString();
        }
        if (!this.f10972h.get()) {
            y2.t.q();
            a3.g2.o(this.f10969e, this.f10970f, uri);
            return;
        }
        File file = this.f10973i;
        if (file == null) {
            io0.g("CsiReporter: File doesn't exists. Cannot write CSI data to file.");
            return;
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, true);
            } catch (IOException e7) {
                e = e7;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            fileOutputStream.write(uri.getBytes());
            fileOutputStream.write(10);
            try {
                fileOutputStream.close();
            } catch (IOException e8) {
                io0.h("CsiReporter: Cannot close file: sdk_csi_data.txt.", e8);
            }
        } catch (IOException e9) {
            e = e9;
            fileOutputStream2 = fileOutputStream;
            io0.h("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e);
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException e10) {
                    io0.h("CsiReporter: Cannot close file: sdk_csi_data.txt.", e10);
                }
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException e11) {
                    io0.h("CsiReporter: Cannot close file: sdk_csi_data.txt.", e11);
                }
            }
            throw th;
        }
    }

    public final x10 a(String str) {
        x10 x10Var = this.f10967c.get(str);
        return x10Var != null ? x10Var : x10.f13986a;
    }

    final Map<String, String> b(Map<String, String> map, Map<String, String> map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        for (Map.Entry<String, String> entry : map2.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            linkedHashMap.put(key, a(key).a((String) linkedHashMap.get(key), value));
        }
        return linkedHashMap;
    }

    public final void d(Context context, String str, String str2, Map<String, String> map) {
        File externalStorageDirectory;
        this.f10969e = context;
        this.f10970f = str;
        this.f10968d = str2;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f10972h = atomicBoolean;
        atomicBoolean.set(x20.f14007c.e().booleanValue());
        if (this.f10972h.get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            this.f10973i = new File(externalStorageDirectory, "sdk_csi_data.txt");
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            this.f10966b.put(entry.getKey(), entry.getValue());
        }
        wo0.f13894a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.q10
            @Override // java.lang.Runnable
            public final void run() {
                r10.c(r10.this);
            }
        });
        Map<String, x10> map2 = this.f10967c;
        x10 x10Var = x10.f13987b;
        map2.put("action", x10Var);
        this.f10967c.put("ad_format", x10Var);
        this.f10967c.put("e", x10.f13988c);
    }

    public final void e(String str) {
        if (this.f10971g.contains(str)) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("sdkVersion", this.f10970f);
        linkedHashMap.put("ue", str);
        g(b(this.f10966b, linkedHashMap), null);
    }

    public final boolean f(b20 b20Var) {
        return this.f10965a.offer(b20Var);
    }
}
