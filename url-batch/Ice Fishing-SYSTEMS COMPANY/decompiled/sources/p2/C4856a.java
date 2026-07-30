package p2;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.C2517De;
import com.google.android.gms.internal.ads.C4072vf;
import com.google.android.gms.internal.ads.InterfaceC4180xf;
import java.util.Collections;
import java.util.List;
import t2.G;
import t2.v;

/* renamed from: p2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4856a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f39757a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f39758b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC4180xf f39759c;

    /* renamed from: d, reason: collision with root package name */
    public final C2517De f39760d = new C2517De(false, Collections.EMPTY_LIST);

    public C4856a(Context context, InterfaceC4180xf interfaceC4180xf) {
        this.f39757a = context;
        this.f39759c = interfaceC4180xf;
    }

    public final boolean a() {
        InterfaceC4180xf interfaceC4180xf = this.f39759c;
        return ((interfaceC4180xf == null || !((C4072vf) interfaceC4180xf).f34826g.f35013y) && !this.f39760d.f24449n) || this.f39758b;
    }

    public final void b(String str) {
        List<String> list;
        C2517De c2517De = this.f39760d;
        InterfaceC4180xf interfaceC4180xf = this.f39759c;
        if ((interfaceC4180xf == null || !((C4072vf) interfaceC4180xf).f34826g.f35013y) && !c2517De.f24449n) {
            return;
        }
        if (str == null) {
            str = "";
        }
        if (interfaceC4180xf != null) {
            ((C4072vf) interfaceC4180xf).b(3, str, null);
            return;
        }
        if (!c2517De.f24449n || (list = c2517De.f24450u) == null) {
            return;
        }
        for (String str2 : list) {
            if (!TextUtils.isEmpty(str2)) {
                String replace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                G g9 = j.f39798C.f39803c;
                new v(this.f39757a, "", replace, null).l();
            }
        }
    }
}
