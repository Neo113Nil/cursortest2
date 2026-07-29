package com.facebook.internal;

import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Log;
import com.facebook.FacebookContentProvider;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.UUID;

/* compiled from: NativeAppCallAttachmentStore.java */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    private static final String f6194a = "com.facebook.internal.v";

    /* renamed from: b, reason: collision with root package name */
    private static File f6195b;

    private v() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static a a(UUID uuid, Bitmap bitmap) {
        ac.a(uuid, "callId");
        ac.a(bitmap, "attachmentBitmap");
        return new a(uuid, bitmap, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static a a(UUID uuid, Uri uri) {
        ac.a(uuid, "callId");
        ac.a(uri, "attachmentUri");
        return new a(uuid, null, uri);
    }

    private static void a(Bitmap bitmap, File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
        } finally {
            ab.a(fileOutputStream);
        }
    }

    private static void a(Uri uri, boolean z, File file) throws IOException {
        InputStream openInputStream;
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            if (!z) {
                openInputStream = new FileInputStream(uri.getPath());
            } else {
                openInputStream = com.facebook.l.f().getContentResolver().openInputStream(uri);
            }
            ab.a(openInputStream, (OutputStream) fileOutputStream);
            ab.a(fileOutputStream);
        } catch (Throwable th) {
            ab.a(fileOutputStream);
            throw th;
        }
    }

    public static void a(Collection<a> collection) {
        if (collection == null || collection.size() == 0) {
            return;
        }
        if (f6195b == null) {
            c();
        }
        b();
        ArrayList arrayList = new ArrayList();
        try {
            for (a aVar : collection) {
                if (aVar.g) {
                    File a2 = a(aVar.f6196a, aVar.f6198c, true);
                    arrayList.add(a2);
                    if (aVar.f6199d != null) {
                        a(aVar.f6199d, a2);
                    } else if (aVar.e != null) {
                        a(aVar.e, aVar.f, a2);
                    }
                }
            }
        } catch (IOException e) {
            Log.e(f6194a, "Got unexpected exception:" + e);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                try {
                    ((File) it.next()).delete();
                } catch (Exception unused) {
                }
            }
            throw new com.facebook.j(e);
        }
    }

    public static void a(UUID uuid) {
        File a2 = a(uuid, false);
        if (a2 != null) {
            ab.a(a2);
        }
    }

    public static File a(UUID uuid, String str) throws FileNotFoundException {
        if (ab.a(str) || uuid == null) {
            throw new FileNotFoundException();
        }
        try {
            return a(uuid, str, false);
        } catch (IOException unused) {
            throw new FileNotFoundException();
        }
    }

    static synchronized File a() {
        File file;
        synchronized (v.class) {
            if (f6195b == null) {
                f6195b = new File(com.facebook.l.f().getCacheDir(), "com.facebook.NativeAppCallAttachmentStore.files");
            }
            file = f6195b;
        }
        return file;
    }

    static File b() {
        File a2 = a();
        a2.mkdirs();
        return a2;
    }

    static File a(UUID uuid, boolean z) {
        if (f6195b == null) {
            return null;
        }
        File file = new File(f6195b, uuid.toString());
        if (z && !file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    static File a(UUID uuid, String str, boolean z) throws IOException {
        File a2 = a(uuid, z);
        if (a2 == null) {
            return null;
        }
        try {
            return new File(a2, URLEncoder.encode(str, "UTF-8"));
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public static void c() {
        ab.a(a());
    }

    /* compiled from: NativeAppCallAttachmentStore.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final UUID f6196a;

        /* renamed from: b, reason: collision with root package name */
        private final String f6197b;

        /* renamed from: c, reason: collision with root package name */
        private final String f6198c;

        /* renamed from: d, reason: collision with root package name */
        private Bitmap f6199d;
        private Uri e;
        private boolean f;
        private boolean g;

        private a(UUID uuid, Bitmap bitmap, Uri uri) {
            this.f6196a = uuid;
            this.f6199d = bitmap;
            this.e = uri;
            if (uri != null) {
                String scheme = uri.getScheme();
                if ("content".equalsIgnoreCase(scheme)) {
                    this.f = true;
                    this.g = (uri.getAuthority() == null || uri.getAuthority().startsWith("media")) ? false : true;
                } else if ("file".equalsIgnoreCase(uri.getScheme())) {
                    this.g = true;
                } else if (!ab.b(uri)) {
                    throw new com.facebook.j("Unsupported scheme for media Uri : " + scheme);
                }
            } else if (bitmap != null) {
                this.g = true;
            } else {
                throw new com.facebook.j("Cannot share media without a bitmap or Uri set");
            }
            this.f6198c = !this.g ? null : UUID.randomUUID().toString();
            this.f6197b = !this.g ? this.e.toString() : FacebookContentProvider.a(com.facebook.l.i(), uuid, this.f6198c);
        }

        public String a() {
            return this.f6197b;
        }
    }
}
