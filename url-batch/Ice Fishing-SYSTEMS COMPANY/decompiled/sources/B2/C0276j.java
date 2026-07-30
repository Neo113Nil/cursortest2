package B2;

import com.google.android.gms.internal.ads.XA;
import java.util.ArrayList;
import org.json.JSONObject;

/* renamed from: B2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0276j implements XA {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ C0276j f235b = new C0276j(0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ C0276j f236c = new C0276j(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f237a;

    public /* synthetic */ C0276j(int i) {
        this.f237a = i;
    }

    @Override // com.google.android.gms.internal.ads.XA
    public final /* synthetic */ Object apply(Object obj) {
        switch (this.f237a) {
            case 0:
                ArrayList arrayList = BinderC0278l.f241n0;
                return ((JSONObject) obj).optString("nas");
            default:
                ArrayList arrayList2 = BinderC0278l.f241n0;
                int i = t2.C.f40822b;
                u2.i.d("", (Exception) obj);
                return null;
        }
    }
}
