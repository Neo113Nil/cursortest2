package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bgt implements bgf {
    private final Context a;
    private final Class b;

    public bgt(Context context, Class cls) {
        this.a = context;
        this.b = cls;
    }

    @Override // defpackage.bgf
    public final bge b(bgj bgjVar) {
        Class cls = this.b;
        return new bgv(this.a, bgjVar.a(File.class, cls), bgjVar.a(Uri.class, cls), cls);
    }
}
