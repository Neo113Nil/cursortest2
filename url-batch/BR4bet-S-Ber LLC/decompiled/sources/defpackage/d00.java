package defpackage;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class d00 extends c00 {
    public final Object c;

    public d00() {
        super(12);
        this.c = new Object();
    }

    @Override // defpackage.c00
    public final Object a() {
        Object a;
        synchronized (this.c) {
            a = super.a();
        }
        return a;
    }

    @Override // defpackage.c00
    public final boolean c(Object obj) {
        boolean c;
        synchronized (this.c) {
            c = super.c(obj);
        }
        return c;
    }
}
