package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import j$.util.function.Function$CC;
import java.util.concurrent.Executor;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class geq implements Function {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ geq(ContentResolver contentResolver, Uri uri, int i) {
        this.c = i;
        this.b = contentResolver;
        this.a = uri;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return this.c != 0 ? Function$CC.$default$andThen(this, function) : Function$CC.$default$andThen(this, function);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [gdn, java.lang.Object] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        if (this.c != 0) {
            return new est((ContentResolver) this.b, (Uri) this.a);
        }
        ger gerVar = (ger) this.a;
        Executor executor = gerVar.f;
        gbf gbfVar = gerVar.e;
        iwq iwqVar = gerVar.h;
        return new geu(this.b, gerVar.g, iwqVar, gbfVar, executor);
    }

    public final /* synthetic */ Function compose(Function function) {
        return this.c != 0 ? Function$CC.$default$compose(this, function) : Function$CC.$default$compose(this, function);
    }

    public /* synthetic */ geq(ger gerVar, gdn gdnVar, int i) {
        this.c = i;
        this.a = gerVar;
        this.b = gdnVar;
    }
}
