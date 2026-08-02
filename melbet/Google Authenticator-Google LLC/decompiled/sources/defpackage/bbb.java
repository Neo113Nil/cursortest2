package defpackage;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.FileInputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bbb implements bbg {
    final /* synthetic */ bci a;
    final /* synthetic */ bek b;

    public bbb(bci bciVar, bek bekVar) {
        this.a = bciVar;
        this.b = bekVar;
    }

    @Override // defpackage.bbg
    public final ImageHeaderParser$ImageType a(baz bazVar) {
        bin binVar;
        try {
            binVar = new bin(new FileInputStream(this.a.a().getFileDescriptor()), this.b);
            try {
                ImageHeaderParser$ImageType a = bazVar.a(binVar);
                binVar.b();
                this.a.a();
                return a;
            } catch (Throwable th) {
                th = th;
                if (binVar != null) {
                    binVar.b();
                }
                this.a.a();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            binVar = null;
        }
    }
}
