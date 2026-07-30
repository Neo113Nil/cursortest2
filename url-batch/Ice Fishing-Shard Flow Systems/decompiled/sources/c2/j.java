package c2;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.Unit;
import kotlin.collections.AbstractC0622a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import v6.C0980b;

/* loaded from: classes.dex */
public final /* synthetic */ class j implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4193d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4194e;

    public /* synthetic */ j(int i2, Collection collection) {
        this.f4193d = i2;
        this.f4194e = collection;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f4193d) {
            case 0:
                String str = (String) this.f4194e;
                T.b bVar = (T.b) obj;
                bVar.e(l.f4198d, str);
                l.d(bVar, str);
                return null;
            case 1:
                ArrayList arrayList = (ArrayList) this.f4194e;
                String it = (String) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                arrayList.add(it);
                return Unit.f6114a;
            case 2:
                return obj == ((AbstractC0622a) this.f4194e) ? "(this Collection)" : String.valueOf(obj);
            default:
                ((v6.c) this.f4194e).e(null);
                return Unit.f6114a;
        }
    }

    public /* synthetic */ j(l lVar, String str) {
        this.f4193d = 0;
        this.f4194e = str;
    }

    public /* synthetic */ j(v6.c cVar, C0980b c0980b) {
        this.f4193d = 3;
        this.f4194e = cVar;
    }
}
