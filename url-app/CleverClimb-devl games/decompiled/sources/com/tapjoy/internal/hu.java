package com.tapjoy.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.tapjoy.TapjoyUtil;
import java.io.File;
import java.net.URL;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class hu {

    /* renamed from: a, reason: collision with root package name */
    public static final hu f8320a = new hu();

    /* renamed from: b, reason: collision with root package name */
    public Context f8321b;

    /* renamed from: c, reason: collision with root package name */
    public SharedPreferences f8322c = null;

    /* renamed from: d, reason: collision with root package name */
    public SharedPreferences f8323d = null;
    ExecutorService e = new ThreadPoolExecutor(0, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue());
    private File f;

    public static boolean a(long j) {
        return j >= 3600;
    }

    private hu() {
    }

    public final void a() {
        this.e.submit(new Runnable() { // from class: com.tapjoy.internal.hu.1
            @Override // java.lang.Runnable
            public final void run() {
                if (hu.this.f8321b == null) {
                    return;
                }
                hu.this.c();
            }
        });
    }

    public final File a(URL url) {
        if (this.f8321b == null) {
            return null;
        }
        synchronized (this) {
            String b2 = b(url);
            File a2 = a(b2);
            if (!a2.exists()) {
                return null;
            }
            long b3 = v.b();
            long j = this.f8322c.getLong(b2, 0L);
            if (j >= b3) {
                Object[] objArr = {b2, url};
                return a2;
            }
            Object[] objArr2 = {b2, Long.valueOf(b3), Long.valueOf(j)};
            if (j != 0) {
                this.f8322c.edit().remove(b2).commit();
                this.f8323d.edit().remove(b2).commit();
            }
            a2.delete();
            return null;
        }
    }

    final synchronized String b(URL url) {
        String str;
        String string;
        String url2 = url.toString();
        String convertToHex = TapjoyUtil.convertToHex(ch.a(url2.getBytes()));
        String string2 = this.f8323d.getString(convertToHex, null);
        if (string2 == null) {
            this.f8323d.edit().putString(convertToHex, url2).commit();
            return convertToHex;
        }
        if (string2.equals(url2)) {
            return convertToHex;
        }
        int i = 0;
        do {
            i++;
            str = convertToHex + "_" + i;
            string = this.f8323d.getString(str, null);
            if (string == null) {
                break;
            }
        } while (!string.equals(url2));
        this.f8323d.edit().putString(str, url2).commit();
        return str;
    }

    final File b() {
        File file = this.f;
        if (file == null) {
            file = new File(this.f8321b.getCacheDir(), "tapjoy_mm_cache");
            this.f = file;
        }
        if (!file.isDirectory()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    final File a(String str) {
        return new File(b(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void c() {
        long b2 = v.b();
        File[] listFiles = b().listFiles();
        HashMap hashMap = new HashMap();
        if (listFiles != null) {
            for (File file : listFiles) {
                hashMap.put(file.getName(), file);
            }
        }
        SharedPreferences.Editor edit = this.f8322c.edit();
        SharedPreferences.Editor edit2 = this.f8323d.edit();
        HashMap hashMap2 = new HashMap(this.f8322c.getAll());
        HashMap hashMap3 = new HashMap(this.f8323d.getAll());
        Iterator it = hashMap2.entrySet().iterator();
        boolean z = false;
        while (it.hasNext()) {
            String str = (String) ((Map.Entry) it.next()).getKey();
            if (!hashMap3.containsKey(str)) {
                it.remove();
                edit.remove(str);
                new Object[1][0] = str;
                z = true;
            }
        }
        Iterator it2 = hashMap3.entrySet().iterator();
        while (it2.hasNext()) {
            String str2 = (String) ((Map.Entry) it2.next()).getKey();
            if (!hashMap2.containsKey(str2)) {
                it2.remove();
                edit2.remove(str2);
                new Object[1][0] = str2;
                z = true;
            }
        }
        Iterator it3 = hashMap2.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry entry = (Map.Entry) it3.next();
            String str3 = (String) entry.getKey();
            if (((Long) entry.getValue()).longValue() < b2) {
                it3.remove();
                edit.remove(str3);
                edit2.remove(str3);
                z = true;
            } else {
                hashMap.remove(str3);
            }
        }
        Iterator it4 = hashMap.entrySet().iterator();
        while (it4.hasNext()) {
            File file2 = (File) ((Map.Entry) it4.next()).getValue();
            file2.delete();
            new Object[1][0] = file2;
        }
        if (hashMap2.size() > 30) {
            int size = hashMap2.size() - 30;
            LinkedList linkedList = new LinkedList(hashMap2.entrySet());
            Collections.sort(linkedList, new Comparator() { // from class: com.tapjoy.internal.hu.3
                @Override // java.util.Comparator
                public final /* synthetic */ int compare(Object obj, Object obj2) {
                    return ((Long) ((Map.Entry) obj).getValue()).compareTo((Long) ((Map.Entry) obj2).getValue());
                }
            });
            Iterator it5 = linkedList.iterator();
            for (int i = 0; i < size && it5.hasNext(); i++) {
                Map.Entry entry2 = (Map.Entry) it5.next();
                String str4 = (String) entry2.getKey();
                Long l = (Long) entry2.getValue();
                edit.remove(str4);
                edit2.remove(str4);
                File a2 = a(str4);
                a2.delete();
                Object[] objArr = {a2, l};
            }
            z = true;
        }
        if (z) {
            edit.commit();
            edit2.commit();
        }
    }
}
