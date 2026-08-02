package defpackage;

import android.graphics.drawable.BitmapDrawable;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bhb implements bbo {
    private final bed a;
    private final bbo b;

    public bhb(bed bedVar, bbo bboVar) {
        this.a = bedVar;
        this.b = bboVar;
    }

    @Override // defpackage.bax
    public final /* bridge */ /* synthetic */ boolean a(Object obj, File file, bbl bblVar) {
        return this.b.a(new bil(((BitmapDrawable) ((bdv) obj).c()).getBitmap(), this.a, 1), file, bblVar);
    }

    @Override // defpackage.bbo
    public final int b() {
        return 2;
    }
}
