package C;

import G.InterfaceC0191c0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s1.C1193i;

/* loaded from: classes.dex */
public final class v extends M2.p implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1135d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0191c0 f1136e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(int i2, InterfaceC0191c0 interfaceC0191c0) {
        super(0);
        this.f1135d = i2;
        this.f1136e = interfaceC0191c0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f1135d) {
            case 0:
                return (C0113h) this.f1136e.getValue();
            case 1:
                return new r.g((Function1) this.f1136e.getValue());
            case 2:
                return (r.h) ((Function0) this.f1136e.getValue()).invoke();
            case 3:
                List list = (List) this.f1136e.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (Intrinsics.a(((C1193i) obj).f10510e.f10570d, "composable")) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            default:
                Boolean bool = (Boolean) this.f1136e.getValue();
                bool.booleanValue();
                return bool;
        }
    }
}
