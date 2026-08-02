package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bfm implements bgf, bfo {
    private final Context a;
    private final /* synthetic */ int b;

    public bfm(Context context, int i) {
        this.b = i;
        this.a = context;
    }

    @Override // defpackage.bfo
    public final Class a() {
        int i = this.b;
        return i != 0 ? i != 1 ? InputStream.class : AssetFileDescriptor.class : Drawable.class;
    }

    @Override // defpackage.bgf
    public final bge b(bgj bgjVar) {
        int i = this.b;
        return i != 0 ? i != 1 ? new bfp(this.a, (bfo) this, 0) : new bfp(this.a, (bfo) this, 0) : new bfp(this.a, (bfo) this, 0);
    }

    @Override // defpackage.bfo
    public final /* synthetic */ Object c(Resources.Theme theme, Resources resources, int i) {
        int i2 = this.b;
        if (i2 != 0) {
            return i2 != 1 ? resources.openRawResource(i) : resources.openRawResourceFd(i);
        }
        Context context = this.a;
        return bjc.a(context, context, i, theme);
    }

    @Override // defpackage.bfo
    public final /* synthetic */ void d(Object obj) {
        int i = this.b;
        if (i == 0) {
        } else if (i != 1) {
            ((InputStream) obj).close();
        } else {
            ((AssetFileDescriptor) obj).close();
        }
    }
}
