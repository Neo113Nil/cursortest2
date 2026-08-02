package defpackage;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bba implements bbg {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public bba(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.bbg
    public final ImageHeaderParser$ImageType a(baz bazVar) {
        int i = this.b;
        Object obj = this.a;
        if (i != 0) {
            try {
                return bazVar.a((InputStream) obj);
            } finally {
                ((InputStream) this.a).reset();
            }
        }
        try {
            return bazVar.b((ByteBuffer) obj);
        } finally {
            blv.b((ByteBuffer) this.a);
        }
    }
}
