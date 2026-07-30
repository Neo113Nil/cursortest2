package y1;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import s1.InterfaceC4989b;

/* renamed from: y1.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5221A implements InterfaceC5245t, InterfaceC4989b {

    /* renamed from: u, reason: collision with root package name */
    public static final C5221A f41812u = new C5221A(0);

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f41813n;

    public /* synthetic */ C5221A(int i) {
        this.f41813n = i;
    }

    public static ByteArrayInputStream a(String str) {
        if (!str.startsWith("data:image")) {
            throw new IllegalArgumentException("Not a valid image data URL.");
        }
        int indexOf = str.indexOf(44);
        if (indexOf == -1) {
            throw new IllegalArgumentException("Missing comma in data URL.");
        }
        if (str.substring(0, indexOf).endsWith(";base64")) {
            return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
        }
        throw new IllegalArgumentException("Not a base64 image data URL.");
    }

    @Override // s1.InterfaceC4989b
    public boolean b(Object obj, File file, s1.h hVar) {
        try {
            N1.b.d((ByteBuffer) obj, file);
            return true;
        } catch (IOException e6) {
            if (!Log.isLoggable("ByteBufferEncoder", 3)) {
                return false;
            }
            Log.d("ByteBufferEncoder", "Failed to write data", e6);
            return false;
        }
    }

    public Class c() {
        switch (this.f41813n) {
            case 1:
                return ByteBuffer.class;
            case 3:
                return InputStream.class;
            case 8:
                return ParcelFileDescriptor.class;
            default:
                return InputStream.class;
        }
    }

    @Override // y1.InterfaceC5245t
    public InterfaceC5244s i(y yVar) {
        switch (this.f41813n) {
            case 0:
                return C5222B.f41814b;
            case 2:
                return new C5228c(0, new C5221A(1));
            case 4:
                return new C5228c(0, new C5221A(3));
            case 6:
                return new C5222B(1);
            case 11:
                return new z(yVar.b(Uri.class, AssetFileDescriptor.class), 0);
            case 12:
                return new z(yVar.b(Uri.class, ParcelFileDescriptor.class), 0);
            case 13:
                return new z(yVar.b(Uri.class, InputStream.class), 0);
            default:
                return new C5225E(yVar.b(C5234i.class, InputStream.class));
        }
    }
}
