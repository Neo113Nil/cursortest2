package t1;

import k.AbstractC0725A;
import kotlin.jvm.functions.Function1;
import l.AbstractC0779e;
import s1.C1193i;

/* loaded from: classes.dex */
public final class x extends M2.p implements Function1 {

    /* renamed from: e, reason: collision with root package name */
    public static final x f10718e = new x(1, 0);

    /* renamed from: i, reason: collision with root package name */
    public static final x f10719i = new x(1, 1);

    /* renamed from: j, reason: collision with root package name */
    public static final x f10720j = new x(1, 2);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10721d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(int i2, int i4) {
        super(i2);
        this.f10721d = i4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f10721d) {
            case 0:
                return ((C1193i) obj).f10514l;
            case 1:
                return AbstractC0725A.a(AbstractC0779e.j(700, 0, null, 6));
            default:
                return AbstractC0725A.b(AbstractC0779e.j(700, 0, null, 6));
        }
    }
}
