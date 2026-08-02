package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EdgeEffect;
import j$.time.Instant;
import java.lang.reflect.Method;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class kt {
    public static boolean r;
    public static Method s;

    public kt() {
    }

    public static bpc A(String str) {
        Integer valueOf;
        bpa a;
        if (TextUtils.isEmpty(str)) {
            throw new cbk("Empty display value found");
        }
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        if (scheme == null) {
            throw new cbk("Empty scheme found");
        }
        if (scheme.toLowerCase(Locale.ROOT).equals("otpauth-migration")) {
            throw new cbl();
        }
        if (scheme.toLowerCase(Locale.ROOT).equals("fido")) {
            throw new cbj(str);
        }
        if (!scheme.toLowerCase(Locale.ROOT).equals("otpauth")) {
            throw new cbk("Invalid scheme found");
        }
        String path = parse.getPath();
        if (path == null) {
            throw new cbk("Empty path found");
        }
        if (!path.startsWith("/")) {
            throw new cbk("Path doesn't start with a forward slash.");
        }
        String trim = path.substring(1).trim();
        String authority = parse.getAuthority();
        String str2 = trim.contains(":") ? (String) hnu.U(gzz.f().c(trim), 1) : trim;
        if (true == str2.isEmpty()) {
            str2 = "Untitled";
        }
        String queryParameter = parse.getQueryParameter("issuer");
        String trim2 = queryParameter != null ? queryParameter.trim() : trim.contains(":") ? ((String) hnu.U(gzz.f().c(trim), 0)).trim() : null;
        String queryParameter2 = parse.getQueryParameter("secret");
        if (queryParameter2 == null) {
            throw new cbk("Empty secret found");
        }
        if (authority == null) {
            throw new cbk("Empty otp type found");
        }
        try {
            bpt.a(authority);
            if (authority.equals("totp")) {
                valueOf = null;
            } else {
                String queryParameter3 = parse.getQueryParameter("counter");
                if (TextUtils.isEmpty(queryParameter3)) {
                    valueOf = 0;
                } else {
                    try {
                        valueOf = Integer.valueOf(Integer.parseInt(queryParameter3));
                    } catch (NumberFormatException e) {
                        throw new cbk(e);
                    }
                }
            }
            String queryParameter4 = parse.getQueryParameter("algorithm");
            if (queryParameter4 == null) {
                a = bpc.a;
            } else {
                try {
                    a = bpa.a(queryParameter4);
                } catch (boz e2) {
                    throw new cbk(e2);
                }
            }
            String queryParameter5 = parse.getQueryParameter("digits");
            int i = 6;
            if (queryParameter5 != null) {
                try {
                    int parseInt = Integer.parseInt(queryParameter5);
                    if (parseInt < 6 || parseInt > 8) {
                        throw new cbk("Invalid number of digits for the otp found");
                    }
                    i = parseInt;
                } catch (NumberFormatException e3) {
                    throw new cbk(e3);
                }
            }
            bpb bpbVar = new bpb();
            bpbVar.e(str2);
            bpbVar.a = trim2;
            bpbVar.g(queryParameter2.toUpperCase(Locale.ROOT));
            bpbVar.f(authority);
            bpbVar.b = valueOf;
            bpbVar.h(Instant.now().toEpochMilli());
            bpbVar.d(false);
            bpbVar.b(a.d);
            bpbVar.c(i);
            bpbVar.i(a.R());
            bpbVar.c = null;
            return bpbVar.a();
        } catch (bps e4) {
            throw new cbk(e4);
        }
    }

    public static jnd B(bpc bpcVar, String str) {
        jkj k = jnd.a.k();
        String str2 = bpcVar.c;
        if (true == TextUtils.isEmpty(str2)) {
            str2 = "nil";
        }
        String format = String.format("internalservices/%s/owneridnamespaces/%s/ownerids/%s/externalservices/%s/credentials/%s", "GOOGLE_AUTHENTICATOR", "GOOGLE_USER_ID", str, str2.replace("/", "%2F"), bpcVar.g);
        if (!k.b.M()) {
            k.t();
        }
        jnd jndVar = (jnd) k.b;
        format.getClass();
        jndVar.c = format;
        jkj k2 = jne.a.k();
        jjq d = bpcVar.a().d();
        if (!k2.b.M()) {
            k2.t();
        }
        ((jne) k2.b).b = d;
        jne jneVar = (jne) k2.q();
        if (!k.b.M()) {
            k.t();
        }
        jnd jndVar2 = (jnd) k.b;
        jneVar.getClass();
        jndVar2.d = jneVar;
        jndVar2.b |= 1;
        return (jnd) k.q();
    }

    public static String C(bpc bpcVar) {
        Mac mac;
        int i;
        try {
            byte[] h = hpx.f.h(bpcVar.d);
            String str = bpcVar.h;
            mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(h, str));
            int i2 = jod.a;
            i = bpcVar.i;
        } catch (IllegalArgumentException | InvalidKeyException | NoSuchAlgorithmException e) {
            e = e;
        }
        try {
            return bpcVar.e.equals("totp") ? jod.b(new byte[][]{jod.a((System.currentTimeMillis() / 1000) / 30)}, mac, i) : jod.b(new byte[][]{jod.a(bpcVar.f.intValue())}, mac, i);
        } catch (InvalidKeyException e2) {
            e = e2;
            throw new cak(e);
        } catch (NoSuchAlgorithmException e3) {
            e = e3;
            throw new cak(e);
        }
    }

    public static void D(faa faaVar, bze bzeVar) {
        hoq.X(faaVar, bzd.class, new bvn(bzeVar, 12));
    }

    public static void E(faa faaVar, byu byuVar) {
        hoq.X(faaVar, bys.class, new bvn(byuVar, 11));
    }

    public static void F(faa faaVar, byh byhVar) {
        hoq.X(faaVar, byf.class, new bvn(byhVar, 7));
        hoq.X(faaVar, byg.class, new bvn(byhVar, 8));
    }

    public static void m(View view, float f) {
        try {
            view.setFrameContentVelocity(f);
        } catch (LinkageError unused) {
        }
    }

    public static void u(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof mo) {
                editorInfo.hintText = ((mo) parent).a();
                return;
            }
        }
    }

    public static boolean v(View view) {
        return view.getLayoutDirection() == 1;
    }

    public static int w(lm lmVar, ko koVar, View view, View view2, ky kyVar, boolean z) {
        if (kyVar.at() == 0 || lmVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(ky.bl(view) - ky.bl(view2)) + 1;
        }
        return Math.min(koVar.k(), koVar.a(view2) - koVar.d(view));
    }

    public static int x(lm lmVar, ko koVar, View view, View view2, ky kyVar, boolean z, boolean z2) {
        if (kyVar.at() == 0 || lmVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z2 ? Math.max(0, (lmVar.a() - Math.max(ky.bl(view), ky.bl(view2))) - 1) : Math.max(0, Math.min(ky.bl(view), ky.bl(view2)));
        if (z) {
            return Math.round((max * (Math.abs(koVar.a(view2) - koVar.d(view)) / (Math.abs(ky.bl(view) - ky.bl(view2)) + 1))) + (koVar.j() - koVar.d(view)));
        }
        return max;
    }

    public static int y(lm lmVar, ko koVar, View view, View view2, ky kyVar, boolean z) {
        if (kyVar.at() == 0 || lmVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return lmVar.a();
        }
        return (int) (((koVar.a(view2) - koVar.d(view)) / (Math.abs(ky.bl(view) - ky.bl(view2)) + 1)) * lmVar.a());
    }

    public void L(RecyclerView recyclerView, int i, int i2) {
        throw null;
    }

    public void b(Rect rect, View view, RecyclerView recyclerView) {
        ((kz) view.getLayoutParams()).a();
        rect.set(0, 0, 0, 0);
    }

    public EdgeEffect n(RecyclerView recyclerView) {
        throw null;
    }

    public void p(int i, int i2, Object obj) {
        s();
    }

    public void q(int i, int i2) {
        throw null;
    }

    public void r(int i, int i2) {
        throw null;
    }

    public kt(short[] sArr) {
    }

    public void o() {
    }

    public void s() {
    }

    public void z(int i) {
    }

    public void c(Canvas canvas, RecyclerView recyclerView) {
    }

    public void j(Canvas canvas, RecyclerView recyclerView) {
    }

    public void t(int i, int i2) {
    }
}
