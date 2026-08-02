package defpackage;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class gfl implements Consumer {
    public final /* synthetic */ gfo a;
    public final /* synthetic */ hrz b;
    private final /* synthetic */ int c;

    public /* synthetic */ gfl(gfo gfoVar, hrz hrzVar, int i) {
        this.c = i;
        this.a = gfoVar;
        this.b = hrzVar;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        if (this.c != 0) {
            hrz hrzVar = this.b;
            this.a.b(hrzVar, (hvi) obj);
        } else {
            hrz hrzVar2 = this.b;
            this.a.b(hrzVar2, (hvi) obj);
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return this.c != 0 ? Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer);
    }
}
