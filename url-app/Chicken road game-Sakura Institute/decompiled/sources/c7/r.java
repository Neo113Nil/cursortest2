package c7;

import com.android.installreferrer.api.InstallReferrerClient;
import com.chicken.road.whale.store.GroceryItem;
import com.chicken.road.whale.store.Meal;
import java.util.Arrays;
import java.util.Map;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final /* synthetic */ class r implements q6.c {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1736f;

    public /* synthetic */ r(int i7) {
        this.f1736f = i7;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        CharSequence string$lambda$1;
        switch (this.f1736f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                h6.g gVar = (h6.g) obj;
                if (gVar instanceof t) {
                    return (t) gVar;
                }
                return null;
            case 1:
                Byte b9 = (Byte) obj;
                b9.byteValue();
                return String.format("%02x", Arrays.copyOf(new Object[]{b9}, 1));
            case 2:
                t3.z zVar = (t3.z) obj;
                r6.k.f(zVar, "$this$NavHost");
                u3.r.d(zVar, g4.a0.f4238i.f4244f, g4.s.f4373a);
                u3.r.d(zVar, g4.a0.f4239j.f4244f, g4.s.f4374b);
                u3.r.d(zVar, g4.a0.f4240k.f4244f, g4.s.f4375c);
                u3.r.d(zVar, g4.a0.f4241l.f4244f, g4.s.f4376d);
                return d6.z.f2639a;
            case 3:
                Meal meal = (Meal) obj;
                r6.k.f(meal, "it");
                return Long.valueOf(meal.getId());
            case 4:
                GroceryItem groceryItem = (GroceryItem) obj;
                r6.k.f(groceryItem, "it");
                return Long.valueOf(groceryItem.getId());
            case 5:
                Meal meal2 = (Meal) obj;
                r6.k.f(meal2, "it");
                return Long.valueOf(meal2.getId());
            case 6:
                m7.a aVar = (m7.a) obj;
                r6.k.f(aVar, "$this$buildSerialDescriptor");
                m7.a.a(aVar, "JsonPrimitive", new p7.n(new o7.l0(1)));
                m7.a.a(aVar, "JsonNull", new p7.n(new o7.l0(2)));
                m7.a.a(aVar, "JsonLiteral", new p7.n(new o7.l0(3)));
                m7.a.a(aVar, "JsonObject", new p7.n(new o7.l0(4)));
                m7.a.a(aVar, "JsonArray", new p7.n(new o7.l0(5)));
                return d6.z.f2639a;
            default:
                string$lambda$1 = p7.v.toString$lambda$1((Map.Entry) obj);
                return string$lambda$1;
        }
    }
}
