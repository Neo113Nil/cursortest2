package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bil implements bdv, bds {
    private final /* synthetic */ int a;
    private final Object b;
    private final Object c;

    public bil(Bitmap bitmap, bed bedVar, int i) {
        this.a = i;
        a.v(bitmap, "Bitmap must not be null");
        this.b = bitmap;
        this.c = bedVar;
    }

    public static bdv f(Resources resources, bdv bdvVar) {
        if (bdvVar == null) {
            return null;
        }
        return new bil(resources, bdvVar, 0);
    }

    public static bil g(Bitmap bitmap, bed bedVar) {
        if (bitmap == null) {
            return null;
        }
        return new bil(bitmap, bedVar, 1);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [bdv, java.lang.Object] */
    @Override // defpackage.bdv
    public final int a() {
        return this.a != 0 ? bmi.a((Bitmap) this.b) : this.c.a();
    }

    @Override // defpackage.bdv
    public final Class b() {
        return this.a != 0 ? Bitmap.class : BitmapDrawable.class;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [bdv, java.lang.Object] */
    @Override // defpackage.bdv
    public final /* synthetic */ Object c() {
        if (this.a != 0) {
            return this.b;
        }
        return new BitmapDrawable((Resources) this.b, (Bitmap) this.c.c());
    }

    @Override // defpackage.bds
    public final void d() {
        if (this.a != 0) {
            ((Bitmap) this.b).prepareToDraw();
            return;
        }
        Object obj = this.c;
        if (obj instanceof bds) {
            ((bds) obj).d();
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [bdv, bed, java.lang.Object] */
    @Override // defpackage.bdv
    public final void e() {
        int i = this.a;
        ?? r1 = this.c;
        if (i != 0) {
            r1.d((Bitmap) this.b);
        } else {
            r1.e();
        }
    }

    private bil(Resources resources, bdv bdvVar, int i) {
        this.a = i;
        a.v(resources, "Argument must not be null");
        this.b = resources;
        this.c = bdvVar;
    }
}
