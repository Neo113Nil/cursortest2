package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bfq implements bgf {
    private final /* synthetic */ int a;
    private final Object b;

    public bfq(int i) {
        this.a = i;
        this.b = new ajz(null);
    }

    @Override // defpackage.bgf
    public final bge b(bgj bgjVar) {
        int i = this.a;
        if (i == 0) {
            return new bfu(this.b, 0);
        }
        if (i == 1) {
            return new bgi(1);
        }
        Object obj = this.b;
        if (i != 2) {
            return new bfp((Context) obj, bgjVar.a(Integer.class, InputStream.class), 3);
        }
        return new bfp((Context) obj, bgjVar.a(Integer.class, AssetFileDescriptor.class), 3);
    }

    public bfq(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
