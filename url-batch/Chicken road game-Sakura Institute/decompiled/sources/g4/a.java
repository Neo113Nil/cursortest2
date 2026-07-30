package g4;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements q6.a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f4235f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f4236g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f4237h;

    public /* synthetic */ a(Object obj, int i7, Object obj2) {
        this.f4235f = i7;
        this.f4236g = obj;
        this.f4237h = obj2;
    }

    @Override // q6.a
    public final Object a() {
        String[] names;
        int i7 = this.f4235f;
        Object obj = this.f4237h;
        Object obj2 = this.f4236g;
        switch (i7) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                t3.b0 b0Var = (t3.b0) obj2;
                String str = ((a0) obj).f4244f;
                b bVar = new b(0, b0Var);
                b0Var.getClass();
                t3.d0 B = a.a.B(bVar);
                if (b0Var.f8747c == null) {
                    throw new IllegalArgumentException(("Cannot navigate to " + str + ". Navigation graph has not been set for NavController " + b0Var + '.').toString());
                }
                t3.y h3 = b0Var.h(b0Var.f8751g);
                t3.t z8 = h3.z(str, true, h3);
                if (z8 == null) {
                    throw new IllegalArgumentException("Navigation destination that matches route " + str + " cannot be found in the navigation graph " + b0Var.f8747c);
                }
                t3.v vVar = z8.f8849f;
                Bundle a3 = vVar.a(z8.f8850g);
                if (a3 == null) {
                    a3 = new Bundle();
                }
                Intent intent = new Intent();
                int i8 = t3.v.f8856n;
                String str2 = vVar.f8863l;
                Uri parse = Uri.parse(str2 != null ? "android-app://androidx.navigation/".concat(str2) : "");
                r6.k.b(parse);
                intent.setDataAndType(parse, null);
                intent.setAction(null);
                a3.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
                b0Var.j(vVar, a3, B);
                return d6.z.f2639a;
            default:
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj2;
                p7.c cVar = (p7.c) obj;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                p7.i iVar = cVar.f7215a;
                q7.f.f(serialDescriptor, cVar);
                int d8 = serialDescriptor.d();
                for (int i9 = 0; i9 < d8; i9++) {
                    List i10 = serialDescriptor.i(i9);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : i10) {
                        if (obj3 instanceof p7.r) {
                            arrayList.add(obj3);
                        }
                    }
                    p7.r rVar = (p7.r) (arrayList.size() == 1 ? arrayList.get(0) : null);
                    if (rVar != null && (names = rVar.names()) != null) {
                        for (String str3 : names) {
                            String str4 = r6.k.a(serialDescriptor.c(), m7.g.f6462h) ? "enum value" : "property";
                            if (linkedHashMap.containsKey(str3)) {
                                String str5 = "The suggested name '" + str3 + "' for " + str4 + ' ' + serialDescriptor.e(i9) + " is already one of the names for " + str4 + ' ' + serialDescriptor.e(((Number) e6.c0.i0(str3, linkedHashMap)).intValue()) + " in " + serialDescriptor;
                                r6.k.f(str5, "message");
                                throw new l7.d(str5);
                            }
                            linkedHashMap.put(str3, Integer.valueOf(i9));
                        }
                    }
                }
                return linkedHashMap.isEmpty() ? e6.v.f2827f : linkedHashMap;
        }
    }
}
