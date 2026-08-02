package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ggx implements Function {
    public final /* synthetic */ krt a;
    private final /* synthetic */ int b;

    public /* synthetic */ ggx(krt krtVar, int i) {
        this.b = i;
        this.a = krtVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        int i = this.b;
        return i != 0 ? i != 1 ? i != 2 ? Function$CC.$default$andThen(this, function) : Function$CC.$default$andThen(this, function) : Function$CC.$default$andThen(this, function) : Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i = this.b;
        if (i == 0) {
            return this.a.a(obj);
        }
        if (i == 1) {
            return this.a.a(obj);
        }
        krt krtVar = this.a;
        return i != 2 ? krtVar.a(obj) : krtVar.a(obj);
    }

    public final /* synthetic */ Function compose(Function function) {
        int i = this.b;
        return i != 0 ? i != 1 ? i != 2 ? Function$CC.$default$compose(this, function) : Function$CC.$default$compose(this, function) : Function$CC.$default$compose(this, function) : Function$CC.$default$compose(this, function);
    }
}
