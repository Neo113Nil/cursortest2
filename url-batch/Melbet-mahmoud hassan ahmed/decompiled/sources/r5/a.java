package r5;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import m5.j;
import m5.k;

/* loaded from: classes.dex */
class a implements k.c {

    /* renamed from: f, reason: collision with root package name */
    private final SharedPreferences f21368f;

    /* renamed from: g, reason: collision with root package name */
    private final ExecutorService f21369g = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: h, reason: collision with root package name */
    private final Handler f21370h = new Handler(Looper.getMainLooper());

    /* renamed from: r5.a$a, reason: collision with other inner class name */
    class RunnableC0132a implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ SharedPreferences.Editor f21371f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ k.d f21372g;

        /* renamed from: r5.a$a$a, reason: collision with other inner class name */
        class RunnableC0133a implements Runnable {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ boolean f21374f;

            RunnableC0133a(boolean z6) {
                this.f21374f = z6;
            }

            @Override // java.lang.Runnable
            public void run() {
                RunnableC0132a.this.f21372g.a(Boolean.valueOf(this.f21374f));
            }
        }

        RunnableC0132a(SharedPreferences.Editor editor, k.d dVar) {
            this.f21371f = editor;
            this.f21372g = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.f21370h.post(new RunnableC0133a(this.f21371f.commit()));
        }
    }

    a(Context context) {
        this.f21368f = context.getSharedPreferences("FlutterSharedPreferences", 0);
    }

    private void b(SharedPreferences.Editor editor, k.d dVar) {
        this.f21369g.execute(new RunnableC0132a(editor, dVar));
    }

    private List<String> c(String str) {
        ObjectInputStream objectInputStream;
        ObjectInputStream objectInputStream2 = null;
        try {
            try {
                objectInputStream = new ObjectInputStream(new ByteArrayInputStream(Base64.decode(str, 0)));
            } catch (Throwable th) {
                th = th;
            }
        } catch (ClassNotFoundException e7) {
            e = e7;
        }
        try {
            List<String> list = (List) objectInputStream.readObject();
            objectInputStream.close();
            return list;
        } catch (ClassNotFoundException e8) {
            e = e8;
            throw new IOException(e);
        } catch (Throwable th2) {
            th = th2;
            objectInputStream2 = objectInputStream;
            if (objectInputStream2 != null) {
                objectInputStream2.close();
            }
            throw th;
        }
    }

    private String d(List<String> list) {
        ByteArrayOutputStream byteArrayOutputStream;
        ObjectOutputStream objectOutputStream;
        ObjectOutputStream objectOutputStream2 = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        } catch (Throwable th) {
            th = th;
        }
        try {
            objectOutputStream.writeObject(list);
            objectOutputStream.flush();
            String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
            objectOutputStream.close();
            return encodeToString;
        } catch (Throwable th2) {
            th = th2;
            objectOutputStream2 = objectOutputStream;
            if (objectOutputStream2 != null) {
                objectOutputStream2.close();
            }
            throw th;
        }
    }

    private Map<String, Object> e() {
        Object obj;
        Map<String, ?> all = this.f21368f.getAll();
        HashMap hashMap = new HashMap();
        for (String str : all.keySet()) {
            if (str.startsWith("flutter.")) {
                Object obj2 = all.get(str);
                if (obj2 instanceof String) {
                    String str2 = (String) obj2;
                    if (str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu")) {
                        obj2 = c(str2.substring(40));
                    } else if (str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy")) {
                        obj = new BigInteger(str2.substring(44), 36);
                        obj2 = obj;
                    } else if (str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
                        obj2 = Double.valueOf(str2.substring(40));
                    }
                    hashMap.put(str, obj2);
                } else {
                    if (obj2 instanceof Set) {
                        ArrayList arrayList = new ArrayList((Set) obj2);
                        obj = arrayList;
                        if (!this.f21368f.edit().remove(str).putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + d(arrayList)).commit()) {
                            throw new IOException("Could not migrate set to list");
                        }
                        obj2 = obj;
                    }
                    hashMap.put(str, obj2);
                }
            }
        }
        return hashMap;
    }

    @Override // m5.k.c
    public void C(j jVar, k.d dVar) {
        SharedPreferences.Editor putBoolean;
        String str = (String) jVar.a("key");
        try {
            switch (jVar.f19247a) {
                case "setBool":
                    putBoolean = this.f21368f.edit().putBoolean(str, ((Boolean) jVar.a("value")).booleanValue());
                    break;
                case "setDouble":
                    String d7 = Double.toString(((Number) jVar.a("value")).doubleValue());
                    putBoolean = this.f21368f.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d7);
                    break;
                case "setInt":
                    Number number = (Number) jVar.a("value");
                    if (!(number instanceof BigInteger)) {
                        putBoolean = this.f21368f.edit().putLong(str, number.longValue());
                        break;
                    } else {
                        putBoolean = this.f21368f.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy" + ((BigInteger) number).toString(36));
                        break;
                    }
                case "setString":
                    String str2 = (String) jVar.a("value");
                    if (!str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") && !str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy") && !str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
                        putBoolean = this.f21368f.edit().putString(str, str2);
                        break;
                    }
                    dVar.b("StorageError", "This string cannot be stored as it clashes with special identifier prefixes.", null);
                    return;
                case "setStringList":
                    List<String> list = (List) jVar.a("value");
                    putBoolean = this.f21368f.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + d(list));
                    break;
                case "commit":
                    dVar.a(Boolean.TRUE);
                    return;
                case "getAll":
                    dVar.a(e());
                    return;
                case "remove":
                    putBoolean = this.f21368f.edit().remove(str);
                    break;
                case "clear":
                    Set<String> keySet = e().keySet();
                    SharedPreferences.Editor edit = this.f21368f.edit();
                    Iterator<String> it = keySet.iterator();
                    while (it.hasNext()) {
                        edit.remove(it.next());
                    }
                    b(edit, dVar);
                    return;
                default:
                    dVar.c();
                    return;
            }
            b(putBoolean, dVar);
        } catch (IOException e7) {
            dVar.b("IOException encountered", jVar.f19247a, e7);
        }
    }

    public void f() {
        this.f21370h.removeCallbacksAndMessages(null);
        this.f21369g.shutdown();
    }
}
