package C4;

import D6.y;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements BiConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f298a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f299b;

    public /* synthetic */ c(int i2, Object obj) {
        this.f298a = i2;
        this.f299b = obj;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.f298a) {
            case 0:
                ((d) this.f299b).e((H4.e) obj, obj2);
                break;
            case 1:
                E4.a aVar = (E4.a) obj;
                ArrayList arrayList = ((d) this.f299b).f300a;
                if (aVar != null && !aVar.f701b.isEmpty() && obj2 != null) {
                    arrayList.add(aVar);
                    arrayList.add(obj2);
                    break;
                }
                break;
            case 2:
                ((y5.d) this.f299b).l((H4.e) obj, obj2);
                break;
            case 3:
                ((I4.e) this.f299b).f((H4.e) obj, obj2);
                break;
            default:
                final y yVar = (y) this.f299b;
                final String str = (String) obj;
                ((List) obj2).forEach(new Consumer() { // from class: p5.a
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj3) {
                        String value = (String) obj3;
                        String name = str;
                        Intrinsics.checkNotNullParameter(name, "name");
                        Intrinsics.checkNotNullParameter(value, "value");
                        C4.d dVar = (C4.d) y.this.f635i;
                        dVar.getClass();
                        Intrinsics.checkNotNullParameter(name, "name");
                        Intrinsics.checkNotNullParameter(value, "value");
                        Intrinsics.checkNotNullParameter(dVar, "<this>");
                        Intrinsics.checkNotNullParameter(name, "name");
                        Intrinsics.checkNotNullParameter(value, "value");
                        P0.f.v(name);
                        P0.f.w(value, name);
                        P0.f.m(dVar, name, value);
                    }
                });
                break;
        }
    }
}
