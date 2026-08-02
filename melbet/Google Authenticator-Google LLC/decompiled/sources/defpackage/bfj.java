package defpackage;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bfj implements bax {
    @Override // defpackage.bax
    public final /* bridge */ /* synthetic */ boolean a(Object obj, File file, bbl bblVar) {
        try {
            blv.c((ByteBuffer) obj, file);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }
}
