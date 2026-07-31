package L1;

import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import com.gatesof.olympus.martu.marku.salon.SalonPageActivity;
import e.C0409a;
import e2.InterfaceC0426e;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3371a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3372b;

    public /* synthetic */ g(SalonPageActivity salonPageActivity, int i3) {
        this.f3371a = i3;
        this.f3372b = salonPageActivity;
    }

    public void a() {
        f2.k kVar = (f2.k) this.f3372b;
        synchronized (S.p.f4241b) {
            try {
                List list = (List) S.p.f4246g;
                f2.j.f(list, "<this>");
                ArrayList arrayList = new ArrayList(S1.n.E0(list, 10));
                boolean z3 = false;
                for (Object obj : list) {
                    boolean z4 = true;
                    if (!z3 && f2.j.a(obj, kVar)) {
                        z3 = true;
                        z4 = false;
                    }
                    if (z4) {
                        arrayList.add(obj);
                    }
                }
                S.p.f4246g = arrayList;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b(Object obj) {
        Object obj2 = this.f3372b;
        switch (this.f3371a) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                SalonPageActivity salonPageActivity = (SalonPageActivity) obj2;
                PermissionRequest permissionRequest = salonPageActivity.f5632H;
                salonPageActivity.f5632H = null;
                if (permissionRequest != null) {
                    if (!booleanValue) {
                        permissionRequest.deny();
                        break;
                    } else {
                        permissionRequest.grant(permissionRequest.getResources());
                        break;
                    }
                }
                break;
            default:
                C0409a c0409a = (C0409a) obj;
                k kVar = SalonPageActivity.Companion;
                f2.j.f(c0409a, "result");
                SalonPageActivity salonPageActivity2 = (SalonPageActivity) obj2;
                ValueCallback valueCallback = salonPageActivity2.f5633I;
                salonPageActivity2.f5633I = null;
                if (valueCallback != null) {
                    valueCallback.onReceiveValue(WebChromeClient.FileChooserParams.parseResult(c0409a.f5676d, c0409a.f5677e));
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ g(InterfaceC0426e interfaceC0426e) {
        this.f3371a = 2;
        this.f3372b = (f2.k) interfaceC0426e;
    }
}
