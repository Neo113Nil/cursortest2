package y2;

import a3.g2;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.ji0;
import com.google.android.gms.internal.ads.ml0;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final Context f23388a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f23389b;

    /* renamed from: c, reason: collision with root package name */
    private final ml0 f23390c;

    /* renamed from: d, reason: collision with root package name */
    private final ji0 f23391d = new ji0(false, Collections.emptyList());

    public b(Context context, ml0 ml0Var, ji0 ji0Var) {
        this.f23388a = context;
        this.f23390c = ml0Var;
    }

    private final boolean d() {
        ml0 ml0Var = this.f23390c;
        return (ml0Var != null && ml0Var.zza().f7165k) || this.f23391d.f7126f;
    }

    public final void a() {
        this.f23389b = true;
    }

    public final void b(String str) {
        List<String> list;
        if (d()) {
            if (str == null) {
                str = "";
            }
            ml0 ml0Var = this.f23390c;
            if (ml0Var != null) {
                ml0Var.a(str, null, 3);
                return;
            }
            ji0 ji0Var = this.f23391d;
            if (!ji0Var.f7126f || (list = ji0Var.f7127g) == null) {
                return;
            }
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2)) {
                    String replace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                    t.q();
                    g2.o(this.f23388a, "", replace);
                }
            }
        }
    }

    public final boolean c() {
        return !d() || this.f23389b;
    }
}
