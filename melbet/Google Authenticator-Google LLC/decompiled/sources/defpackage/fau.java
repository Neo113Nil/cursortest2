package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fau {
    public String a;
    private final heg f;
    public String b = "files";
    private String d = "common";
    public Account c = fav.b;
    private String e = "";

    public fau(Context context) {
        int i = hel.d;
        this.f = new heg(4);
        this.a = context.getPackageName();
    }

    public final Uri a() {
        return new Uri.Builder().scheme("android").authority(this.a).path("/" + this.b + "/" + this.d + "/" + fas.a(this.c) + "/" + this.e).encodedFragment(fbm.a(this.f.g())).build();
    }

    public final void b(String str) {
        exf.o(fav.a.matcher(str).matches(), "Module must match [a-z]+(_[a-z]+)*: %s", str);
        exf.o(!fav.c.contains(str), "Module name is reserved and cannot be used: %s", str);
        this.d = str;
    }

    public final void c(String str) {
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        Pattern pattern = fav.a;
        this.e = str;
    }
}
