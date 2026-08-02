package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class hbx implements BiConsumer {
    private final /* synthetic */ int a;

    public /* synthetic */ hbx(int i) {
        this.a = i;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        int i = this.a;
        if (i == 0) {
            ((hfk) obj).c(obj2);
            return;
        }
        if (i == 1) {
            ((heg) obj).h(obj2);
            return;
        }
        if (i == 2) {
            ((brn) obj).n((hip) obj2);
            return;
        }
        if (i == 3) {
            ((hhs) obj).b(obj2);
            return;
        }
        hhs hhsVar = (hhs) obj;
        Object obj3 = hht.a;
        if (obj2 == null) {
            obj2 = hht.a;
        }
        hhsVar.b(obj2);
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        int i = this.a;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? BiConsumer$CC.$default$andThen(this, biConsumer) : BiConsumer$CC.$default$andThen(this, biConsumer) : BiConsumer$CC.$default$andThen(this, biConsumer) : BiConsumer$CC.$default$andThen(this, biConsumer) : BiConsumer$CC.$default$andThen(this, biConsumer);
    }
}
