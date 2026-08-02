package defpackage;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ges implements Consumer {
    private final /* synthetic */ int a;

    public /* synthetic */ ges(int i) {
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [hvi, java.lang.Object] */
    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.a;
        if (i == 0) {
            ((gdy) obj).c();
            return;
        }
        if (i == 1) {
            ((cfe) obj).a.cancel(false);
            return;
        }
        if (i == 2) {
            ((gok) obj).a();
            return;
        }
        if (i == 3) {
            ((gbe) obj).a();
            return;
        }
        if (i == 4) {
            ((gbe) obj).b();
        } else if (i != 5) {
            ((gvh) obj).a();
        } else {
            gsp gspVar = gtk.a;
            ((gvh) obj).a();
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        int i = this.a;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer);
    }
}
