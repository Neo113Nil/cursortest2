package defpackage;

import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bbd implements bbe {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public bbd(bci bciVar, bek bekVar, int i) {
        this.c = i;
        this.b = bciVar;
        this.a = bekVar;
    }

    @Override // defpackage.bbe
    public final boolean a(baz bazVar) {
        bin binVar;
        int i = this.c;
        if (i == 0) {
            try {
                return bazVar.e((InputStream) this.a, (bek) this.b);
            } finally {
                ((InputStream) this.a).reset();
            }
        }
        if (i == 1) {
            try {
                return bazVar.f((ByteBuffer) this.a, (bek) this.b);
            } finally {
                blv.b((ByteBuffer) this.a);
            }
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(((bci) this.b).a().getFileDescriptor());
            Object obj = this.a;
            binVar = new bin(fileInputStream, (bek) obj);
            try {
                boolean e = bazVar.e(binVar, (bek) obj);
                binVar.b();
                ((bci) this.b).a();
                return e;
            } catch (Throwable th) {
                th = th;
                if (binVar != null) {
                    binVar.b();
                }
                ((bci) this.b).a();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            binVar = null;
        }
    }

    public bbd(Object obj, bek bekVar, int i) {
        this.c = i;
        this.a = obj;
        this.b = bekVar;
    }
}
