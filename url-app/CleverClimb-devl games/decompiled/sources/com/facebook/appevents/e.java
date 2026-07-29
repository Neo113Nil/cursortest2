package com.facebook.appevents;

import android.content.Context;
import android.util.Log;
import com.facebook.appevents.a;
import com.facebook.appevents.b;
import com.facebook.internal.ab;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.util.HashMap;

/* compiled from: AppEventStore.java */
/* loaded from: classes.dex */
class e {

    /* renamed from: a, reason: collision with root package name */
    private static final String f5969a = "com.facebook.appevents.e";

    private static void b() {
    }

    e() {
    }

    public static synchronized void a(com.facebook.appevents.a aVar, l lVar) {
        synchronized (e.class) {
            b();
            k a2 = a();
            if (a2.containsKey(aVar)) {
                a2.get(aVar).addAll(lVar.b());
            } else {
                a2.put(aVar, lVar.b());
            }
            a(a2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00f0 A[Catch: all -> 0x00f7, TRY_LEAVE, TryCatch #3 {, blocks: (B:4:0x0003, B:11:0x0021, B:13:0x0024, B:15:0x002f, B:20:0x00f0, B:26:0x0038, B:27:0x004f, B:38:0x0076, B:40:0x0079, B:43:0x0084, B:45:0x009d, B:47:0x00a0, B:48:0x00c5, B:51:0x00ab, B:30:0x00c7, B:32:0x00ca, B:35:0x00d5), top: B:3:0x0003, inners: #0, #4, #7, #10 }] */
    /* JADX WARN: Type inference failed for: r1v22, types: [com.facebook.appevents.k] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static synchronized k a() {
        k kVar;
        a aVar;
        Throwable th;
        a aVar2;
        String str;
        String str2;
        synchronized (e.class) {
            b();
            Context d2 = f.d();
            kVar = null;
            try {
                try {
                    aVar2 = new a(new BufferedInputStream(d2.openFileInput("AppEventsLogger.persistedevents")));
                } catch (Throwable th2) {
                    th = th2;
                    ab.a((Closeable) aVar);
                    try {
                        d2.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                    } catch (Exception e) {
                        Log.w(f5969a, "Got unexpected exception when removing events file: " + e.toString());
                    }
                    throw th;
                }
            } catch (FileNotFoundException unused) {
                aVar2 = null;
            } catch (Exception e2) {
                e = e2;
                aVar2 = null;
            } catch (Throwable th3) {
                aVar = null;
                th = th3;
                ab.a((Closeable) aVar);
                d2.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                throw th;
            }
            try {
                HashMap hashMap = (HashMap) aVar2.readObject();
                ab.a((Closeable) aVar2);
                try {
                    ?? r4 = "AppEventsLogger.persistedevents";
                    File fileStreamPath = d2.getFileStreamPath("AppEventsLogger.persistedevents");
                    fileStreamPath.delete();
                    d2 = fileStreamPath;
                    aVar = r4;
                    if (hashMap != null) {
                        ?? kVar2 = new k(hashMap);
                        kVar = kVar2;
                        d2 = kVar2;
                        aVar = r4;
                    }
                } catch (Exception e3) {
                    str = f5969a;
                    str2 = "Got unexpected exception when removing events file: " + e3.toString();
                    Log.w(str, str2);
                    if (kVar == null) {
                    }
                    return kVar;
                }
            } catch (FileNotFoundException unused2) {
                ab.a((Closeable) aVar2);
                try {
                    d2.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                } catch (Exception e4) {
                    str = f5969a;
                    str2 = "Got unexpected exception when removing events file: " + e4.toString();
                    Log.w(str, str2);
                    if (kVar == null) {
                    }
                    return kVar;
                }
                if (kVar == null) {
                }
                return kVar;
            } catch (Exception e5) {
                e = e5;
                Log.w(f5969a, "Got unexpected exception while reading events: " + e.toString());
                ab.a((Closeable) aVar2);
                try {
                    File fileStreamPath2 = d2.getFileStreamPath("AppEventsLogger.persistedevents");
                    fileStreamPath2.delete();
                    d2 = fileStreamPath2;
                    aVar = aVar2;
                } catch (Exception e6) {
                    str = f5969a;
                    str2 = "Got unexpected exception when removing events file: " + e6.toString();
                    Log.w(str, str2);
                    if (kVar == null) {
                    }
                    return kVar;
                }
                if (kVar == null) {
                }
                return kVar;
            }
            if (kVar == null) {
                kVar = new k();
            }
        }
        return kVar;
    }

    private static void a(k kVar) {
        ObjectOutputStream objectOutputStream;
        ObjectOutputStream objectOutputStream2 = null;
        try {
            try {
                objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(f.d().openFileOutput("AppEventsLogger.persistedevents", 0)));
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            objectOutputStream.writeObject(kVar);
            ab.a(objectOutputStream);
        } catch (Exception e2) {
            e = e2;
            objectOutputStream2 = objectOutputStream;
            Log.w(f5969a, "Got unexpected exception while persisting events: " + e.toString());
            ab.a(objectOutputStream2);
        } catch (Throwable th2) {
            th = th2;
            objectOutputStream2 = objectOutputStream;
            ab.a(objectOutputStream2);
            throw th;
        }
    }

    /* compiled from: AppEventStore.java */
    private static class a extends ObjectInputStream {
        public a(InputStream inputStream) throws IOException {
            super(inputStream);
        }

        @Override // java.io.ObjectInputStream
        protected ObjectStreamClass readClassDescriptor() throws IOException, ClassNotFoundException {
            ObjectStreamClass readClassDescriptor = super.readClassDescriptor();
            if (readClassDescriptor.getName().equals("com.facebook.appevents.AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1")) {
                return ObjectStreamClass.lookup(a.C0360a.class);
            }
            return readClassDescriptor.getName().equals("com.facebook.appevents.AppEventsLogger$AppEvent$SerializationProxyV1") ? ObjectStreamClass.lookup(b.a.class) : readClassDescriptor;
        }
    }
}
