package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bjg implements bbn {
    private final /* synthetic */ int a;

    public bjg(int i) {
        this.a = i;
    }

    @Override // defpackage.bbn
    public final /* synthetic */ bdv a(Object obj, int i, int i2, bbl bblVar) {
        int i3 = this.a;
        return i3 != 0 ? i3 != 1 ? new bgy((File) obj) : new bja((Bitmap) obj, 1) : bje.g((Drawable) obj);
    }

    @Override // defpackage.bbn
    public final /* synthetic */ boolean b(Object obj, bbl bblVar) {
        int i = this.a;
        if (i == 0) {
            return true;
        }
        if (i != 1) {
            return true;
        }
        return true;
    }
}
