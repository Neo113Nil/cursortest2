package defpackage;

import android.content.Context;
import android.graphics.ImageDecoder;
import android.net.Uri;
import java.io.InputStream;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bip implements bbn {
    private final /* synthetic */ int a;
    private final Object b;
    private final Object c;

    public bip(Context context, int i) {
        this.a = i;
        this.b = new bhd();
        this.c = context.getApplicationContext();
    }

    /* JADX WARN: Type inference failed for: r10v5, types: [bed, java.lang.Object] */
    @Override // defpackage.bbn
    public final /* synthetic */ bdv a(Object obj, int i, int i2, bbl bblVar) {
        bin binVar;
        boolean z;
        bly blyVar;
        ImageDecoder.Source createSource;
        int i3 = this.a;
        if (i3 != 0) {
            if (i3 != 1) {
                createSource = ImageDecoder.createSource(((Context) this.c).getContentResolver(), (Uri) obj);
                return ((bhd) this.b).c(createSource, i, i2, bblVar);
            }
            bdv c = ((bjf) this.b).c((Uri) obj, bblVar);
            if (c == null) {
                return null;
            }
            return bhz.a(this.c, ((bjd) c).c(), i, i2);
        }
        InputStream inputStream = (InputStream) obj;
        if (inputStream instanceof bin) {
            binVar = (bin) inputStream;
            z = false;
        } else {
            binVar = new bin(inputStream, (bek) this.c);
            z = true;
        }
        Queue queue = bly.a;
        synchronized (queue) {
            blyVar = (bly) queue.poll();
        }
        if (blyVar == null) {
            blyVar = new bly();
        }
        bly blyVar2 = blyVar;
        blyVar2.b = binVar;
        bmf bmfVar = new bmf(blyVar2);
        bio bioVar = new bio(binVar, blyVar2);
        try {
            Object obj2 = this.b;
            bdv a = ((bhx) obj2).a(new bii(bmfVar, ((bhx) obj2).g, ((bhx) obj2).h, 1), i, i2, bblVar, bioVar);
            blyVar2.a();
            if (z) {
                binVar.b();
            }
            return a;
        } finally {
        }
    }

    @Override // defpackage.bbn
    public final /* synthetic */ boolean b(Object obj, bbl bblVar) {
        int i = this.a;
        if (i == 0) {
            return true;
        }
        if (i == 1) {
            return "android.resource".equals(((Uri) obj).getScheme());
        }
        Uri uri = (Uri) obj;
        String scheme = uri.getScheme();
        if (!"content".equals(scheme) && !"file".equals(scheme) && !"android.resource".equals(scheme)) {
            return false;
        }
        String type = ((Context) this.c).getContentResolver().getType(uri);
        return type == null || !type.equals("image/gif");
    }

    public bip(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
