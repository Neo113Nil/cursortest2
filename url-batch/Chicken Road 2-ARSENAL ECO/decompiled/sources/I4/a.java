package I4;

import D3.M;
import Q4.j;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements BiConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1199a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1200b;

    public /* synthetic */ a(int i7, Object obj) {
        this.f1199a = i7;
        this.f1200b = obj;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.f1199a) {
            case 0:
                final A.e eVar = (A.e) this.f1200b;
                final String str = (String) obj;
                ((List) obj2).forEach(new Consumer() { // from class: I4.b
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj3) {
                        String value = (String) obj3;
                        String name = str;
                        i.e(name, "name");
                        i.e(value, "value");
                        j jVar = (j) A.e.this.f9i;
                        jVar.getClass();
                        i6.g.o(name);
                        i6.g.p(value, name);
                        i6.g.j(jVar, name, value);
                    }
                });
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                ((M) this.f1200b).u((a4.e) obj, obj2);
                break;
            case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                X3.a aVar = (X3.a) obj;
                ArrayList arrayList = ((j) this.f1200b).f2027a;
                if (aVar != null && !aVar.f2864b.isEmpty() && obj2 != null) {
                    arrayList.add(aVar);
                    arrayList.add(obj2);
                    break;
                }
                break;
            case 3:
                ((R4.d) this.f1200b).l((a4.e) obj, obj2);
                break;
            default:
                ((b4.e) this.f1200b).d((a4.e) obj, obj2);
                break;
        }
    }
}
