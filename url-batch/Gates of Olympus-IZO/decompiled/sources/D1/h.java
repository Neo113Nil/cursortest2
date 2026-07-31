package D1;

import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import com.gates.olympus.miruv.tenon.TenonPageActivity;
import e.C0329a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f553a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f554b;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ h(Y1.e eVar) {
        this.f553a = 2;
        this.f554b = (Z1.j) eVar;
    }

    public void a() {
        Z1.j jVar = (Z1.j) this.f554b;
        synchronized (S.q.f3235b) {
            try {
                List list = (List) S.q.f3240g;
                Z1.i.f(list, "<this>");
                ArrayList arrayList = new ArrayList(M1.n.g0(list, 10));
                boolean z3 = false;
                for (Object obj : list) {
                    boolean z4 = true;
                    if (!z3 && Z1.i.a(obj, jVar)) {
                        z3 = true;
                        z4 = false;
                    }
                    if (z4) {
                        arrayList.add(obj);
                    }
                }
                S.q.f3240g = arrayList;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b(Object obj) {
        Object obj2 = this.f554b;
        switch (this.f553a) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                TenonPageActivity tenonPageActivity = (TenonPageActivity) obj2;
                PermissionRequest permissionRequest = tenonPageActivity.f4427H;
                tenonPageActivity.f4427H = null;
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
                C0329a c0329a = (C0329a) obj;
                m mVar = TenonPageActivity.Companion;
                Z1.i.f(c0329a, "result");
                TenonPageActivity tenonPageActivity2 = (TenonPageActivity) obj2;
                ValueCallback valueCallback = tenonPageActivity2.f4428I;
                tenonPageActivity2.f4428I = null;
                if (valueCallback != null) {
                    valueCallback.onReceiveValue(WebChromeClient.FileChooserParams.parseResult(c0329a.f4454d, c0329a.f4455e));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ h(TenonPageActivity tenonPageActivity, int i3) {
        this.f553a = i3;
        this.f554b = tenonPageActivity;
    }
}
