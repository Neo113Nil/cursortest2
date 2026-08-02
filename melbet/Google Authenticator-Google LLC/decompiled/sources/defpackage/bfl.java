package defpackage;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bfl implements bbu {
    private final String a;
    private Object b;

    public bfl(String str) {
        this.a = str;
    }

    @Override // defpackage.bbu
    public final Class a() {
        return InputStream.class;
    }

    @Override // defpackage.bbu
    public final void d() {
        try {
            ((InputStream) this.b).close();
        } catch (IOException unused) {
        }
    }

    @Override // defpackage.bbu
    public final void f(azw azwVar, bbt bbtVar) {
        try {
            String str = this.a;
            if (!str.startsWith("data:image")) {
                throw new IllegalArgumentException("Not a valid image data URL.");
            }
            int indexOf = str.indexOf(44);
            if (indexOf == -1) {
                throw new IllegalArgumentException("Missing comma in data URL.");
            }
            if (!str.substring(0, indexOf).endsWith(";base64")) {
                throw new IllegalArgumentException("Not a base64 image data URL.");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
            this.b = byteArrayInputStream;
            bbtVar.b(byteArrayInputStream);
        } catch (IllegalArgumentException e) {
            bbtVar.e(e);
        }
    }

    @Override // defpackage.bbu
    public final int g() {
        return 1;
    }

    @Override // defpackage.bbu
    public final void bo() {
    }
}
