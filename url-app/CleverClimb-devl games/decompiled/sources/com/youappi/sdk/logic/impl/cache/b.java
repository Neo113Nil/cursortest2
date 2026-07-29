package com.youappi.sdk.logic.impl.cache;

import com.a.a.a.e;
import com.a.a.a.f;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

/* loaded from: classes2.dex */
public class b implements com.a.a.a.b<InputStream> {

    /* renamed from: a, reason: collision with root package name */
    private final String f9447a;

    /* renamed from: b, reason: collision with root package name */
    private String f9448b;

    public b(String str, String str2) {
        this.f9448b = str;
        this.f9447a = str2;
    }

    private File a(InputStream inputStream, String str) {
        File file;
        try {
            try {
                file = new File(this.f9448b + File.separator + str + ".tmp");
            } finally {
                try {
                    inputStream.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e2) {
            e = e2;
            file = null;
        }
        try {
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[8192];
            while (true) {
                int read = inputStream.read(bArr);
                if (read < 0) {
                    break;
                }
                fileOutputStream.write(bArr, 0, read);
            }
            fileOutputStream.close();
            inputStream.close();
            file.renameTo(new File(this.f9448b + File.separator + str));
            return file;
        } catch (Exception e3) {
            e = e3;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
            }
            e.printStackTrace();
            try {
                inputStream.close();
                return null;
            } catch (Exception e5) {
                e5.printStackTrace();
                return null;
            }
        }
    }

    public e a(String str, com.a.a.a.b<File> bVar) {
        e a2 = e.a(InputStream.class).a("Referer", "sdk.android." + this.f9447a).b("GET").c(str).b(30000).c(30000).a((com.a.a.a.b) bVar).a((com.a.a.a.b) this).a();
        com.a.a.a.c.a().a(a2);
        return a2;
    }

    public File a(String str) {
        File file = new File(this.f9448b + File.separator + str.hashCode() + "");
        if (file.exists()) {
            return file;
        }
        return null;
    }

    @Override // com.a.a.a.b
    public boolean onNetError(com.a.a.a.d dVar) {
        return false;
    }

    @Override // com.a.a.a.b
    public boolean onNetFinished(f<InputStream> fVar) {
        if (fVar.b() == null) {
            return false;
        }
        InputStream b2 = fVar.b();
        String str = fVar.a().k().hashCode() + "";
        if (a(b2, str) != null) {
            com.a.a.a.b e = fVar.a().e();
            if (e == null) {
                return false;
            }
            e.onNetFinished(new f(fVar.a(), fVar.c(), new File(str)));
            return false;
        }
        com.a.a.a.b e2 = fVar.a().e();
        if (e2 == null) {
            return true;
        }
        e2.onNetError(new com.a.a.a.d(fVar.a(), -1, null));
        return true;
    }
}
