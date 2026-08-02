package defpackage;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bfi implements bgf {
    private final /* synthetic */ int a;

    public bfi(int i) {
        this.a = i;
    }

    @Override // defpackage.bgf
    public final bge b(bgj bgjVar) {
        int i = this.a;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? new bfu(bgjVar.a(Uri.class, InputStream.class), 3) : new bfu(bgjVar.a(Uri.class, ParcelFileDescriptor.class), 3) : new bfu(bgjVar.a(Uri.class, AssetFileDescriptor.class), 3) : new bfk() : new bfu(new bfh(1), 1) : new bfu(new bfh(0), 1);
    }
}
