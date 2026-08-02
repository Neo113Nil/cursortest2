package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.net.Uri;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bgk implements bgf {
    private final /* synthetic */ int a;
    private final Object b;

    public bgk(int i) {
        this.a = i;
        this.b = new brn((short[]) null);
    }

    /* JADX WARN: Type inference failed for: r4v11, types: [bge, java.lang.Object] */
    @Override // defpackage.bgf
    public final bge b(bgj bgjVar) {
        switch (this.a) {
            case 0:
                return new bfp(this.b, bgjVar.a(Uri.class, AssetFileDescriptor.class), 2);
            case 1:
                return new bfu(this.b, 2);
            case 2:
                return new bfp(this.b, bgjVar.a(Uri.class, InputStream.class), 2);
            case 3:
                return new bfp(this.b, bgi.a, 2);
            case 4:
                return new bgs((brn) this.b);
            case 5:
                return new bfu((Context) this.b, 4, (byte[]) null);
            case 6:
                return new bfu((Context) this.b, 5, (char[]) null);
            case 7:
                return this.b;
            default:
                return new fwe(bgjVar.a(eez.class, Bitmap.class), this.b, 0);
        }
    }

    public bgk(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
