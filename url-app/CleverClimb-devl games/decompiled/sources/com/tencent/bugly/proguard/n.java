package com.tencent.bugly.proguard;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: BUGLY */
/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final long f8756a = System.currentTimeMillis();

    /* renamed from: b, reason: collision with root package name */
    private static n f8757b;

    /* renamed from: c, reason: collision with root package name */
    private Context f8758c;
    private SharedPreferences f;
    private Map<Integer, Map<String, m>> e = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private String f8759d = com.tencent.bugly.crashreport.common.info.a.b().f8601d;

    private n(Context context) {
        this.f8758c = context;
        this.f = context.getSharedPreferences("crashrecord", 0);
    }

    public static synchronized n a(Context context) {
        n nVar;
        synchronized (n.class) {
            if (f8757b == null) {
                f8757b = new n(context);
            }
            nVar = f8757b;
        }
        return nVar;
    }

    public static synchronized n a() {
        n nVar;
        synchronized (n.class) {
            nVar = f8757b;
        }
        return nVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean b(int i) {
        try {
            List<m> c2 = c(i);
            if (c2 == null) {
                return false;
            }
            long currentTimeMillis = System.currentTimeMillis();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (m mVar : c2) {
                if (mVar.f8753b != null && mVar.f8753b.equalsIgnoreCase(this.f8759d) && mVar.f8755d > 0) {
                    arrayList.add(mVar);
                }
                if (mVar.f8754c + 86400000 < currentTimeMillis) {
                    arrayList2.add(mVar);
                }
            }
            Collections.sort(arrayList);
            if (arrayList.size() >= 2) {
                if (arrayList.size() <= 0 || ((m) arrayList.get(arrayList.size() - 1)).f8754c + 86400000 >= currentTimeMillis) {
                    return true;
                }
                c2.clear();
                a(i, (int) c2);
                return false;
            }
            c2.removeAll(arrayList2);
            a(i, (int) c2);
            return false;
        } catch (Exception unused) {
            x.e("isFrequentCrash failed", new Object[0]);
            return false;
        }
    }

    public final synchronized void a(int i, final int i2) {
        final int i3 = 1004;
        w.a().a(new Runnable() { // from class: com.tencent.bugly.proguard.n.1
            @Override // java.lang.Runnable
            public final void run() {
                m mVar;
                try {
                    if (TextUtils.isEmpty(n.this.f8759d)) {
                        return;
                    }
                    List<m> c2 = n.this.c(i3);
                    if (c2 == null) {
                        c2 = new ArrayList();
                    }
                    if (n.this.e.get(Integer.valueOf(i3)) == null) {
                        n.this.e.put(Integer.valueOf(i3), new HashMap());
                    }
                    if (((Map) n.this.e.get(Integer.valueOf(i3))).get(n.this.f8759d) != null) {
                        mVar = (m) ((Map) n.this.e.get(Integer.valueOf(i3))).get(n.this.f8759d);
                        mVar.f8755d = i2;
                    } else {
                        mVar = new m();
                        mVar.f8752a = i3;
                        mVar.g = n.f8756a;
                        mVar.f8753b = n.this.f8759d;
                        mVar.f = com.tencent.bugly.crashreport.common.info.a.b().j;
                        com.tencent.bugly.crashreport.common.info.a.b().getClass();
                        mVar.e = "2.6.5";
                        mVar.f8754c = System.currentTimeMillis();
                        mVar.f8755d = i2;
                        ((Map) n.this.e.get(Integer.valueOf(i3))).put(n.this.f8759d, mVar);
                    }
                    ArrayList arrayList = new ArrayList();
                    boolean z = false;
                    for (m mVar2 : c2) {
                        if (mVar2.g == mVar.g && mVar2.f8753b != null && mVar2.f8753b.equalsIgnoreCase(mVar.f8753b)) {
                            z = true;
                            mVar2.f8755d = mVar.f8755d;
                        }
                        if ((mVar2.e != null && !mVar2.e.equalsIgnoreCase(mVar.e)) || ((mVar2.f != null && !mVar2.f.equalsIgnoreCase(mVar.f)) || mVar2.f8755d <= 0)) {
                            arrayList.add(mVar2);
                        }
                    }
                    c2.removeAll(arrayList);
                    if (!z) {
                        c2.add(mVar);
                    }
                    n.this.a(i3, (int) c2);
                } catch (Exception unused) {
                    x.e("saveCrashRecord failed", new Object[0]);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
    
        if (r6 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0046, code lost:
    
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0044, code lost:
    
        if (r6 == null) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.io.ObjectInputStream] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized <T extends List<?>> T c(int i) {
        ObjectInputStream objectInputStream;
        try {
            File dir = this.f8758c.getDir("crashrecord", 0);
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            File file = new File(dir, sb.toString());
            ?? exists = file.exists();
            try {
                if (exists == 0) {
                    return null;
                }
                try {
                    objectInputStream = new ObjectInputStream(new FileInputStream(file));
                    try {
                        T t = (T) objectInputStream.readObject();
                        objectInputStream.close();
                        return t;
                    } catch (IOException unused) {
                        x.a("open record file error", new Object[0]);
                    } catch (ClassNotFoundException unused2) {
                        x.a("get object error", new Object[0]);
                    }
                } catch (IOException unused3) {
                    objectInputStream = null;
                } catch (ClassNotFoundException unused4) {
                    objectInputStream = null;
                } catch (Throwable th) {
                    th = th;
                    exists = 0;
                    if (exists != 0) {
                        exists.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception unused5) {
            x.e("readCrashRecord error", new Object[0]);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized <T extends List<?>> void a(int i, T t) {
        ObjectOutputStream objectOutputStream;
        ObjectOutputStream objectOutputStream2;
        if (t == null) {
            return;
        }
        try {
            File dir = this.f8758c.getDir("crashrecord", 0);
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            objectOutputStream = null;
            try {
                try {
                    objectOutputStream2 = new ObjectOutputStream(new FileOutputStream(new File(dir, sb.toString())));
                } catch (Throwable th) {
                    th = th;
                }
            } catch (IOException e) {
                e = e;
            }
        } catch (Exception unused) {
            x.e("writeCrashRecord error", new Object[0]);
        }
        try {
            objectOutputStream2.writeObject(t);
            objectOutputStream2.close();
        } catch (IOException e2) {
            e = e2;
            objectOutputStream = objectOutputStream2;
            e.printStackTrace();
            x.a("open record file error", new Object[0]);
            if (objectOutputStream != null) {
                objectOutputStream.close();
            }
        } catch (Throwable th2) {
            th = th2;
            objectOutputStream = objectOutputStream2;
            if (objectOutputStream != null) {
                objectOutputStream.close();
            }
            throw th;
        }
    }

    public final synchronized boolean a(final int i) {
        boolean z;
        boolean z2 = true;
        try {
            z = this.f.getBoolean(i + "_" + this.f8759d, true);
        } catch (Exception unused) {
        }
        try {
            w.a().a(new Runnable() { // from class: com.tencent.bugly.proguard.n.2
                @Override // java.lang.Runnable
                public final void run() {
                    boolean b2 = n.this.b(i);
                    n.this.f.edit().putBoolean(i + "_" + n.this.f8759d, !b2).commit();
                }
            });
            return z;
        } catch (Exception unused2) {
            z2 = z;
            x.e("canInit error", new Object[0]);
            return z2;
        }
    }
}
