package ru.rustore.sdk.pay.internal;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b6 extends kotlin.jvm.internal.s implements Function1<List<? extends gc>, gc> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f43857a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b6(String str) {
        super(1);
        this.f43857a = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2;
        List keys = (List) obj;
        Intrinsics.checkNotNullParameter(keys, "keys");
        String str = this.f43857a;
        Iterator it = keys.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (Intrinsics.areEqual(((gc) obj2).f44169a, str)) {
                break;
            }
        }
        gc gcVar = (gc) obj2;
        if (gcVar != null) {
            return gcVar;
        }
        throw new IllegalStateException(("Invalid signature. Not found key by id:" + this.f43857a).toString());
    }
}
