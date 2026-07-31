package a3;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.cc3;
import com.google.android.gms.internal.ads.io0;
import com.google.android.gms.internal.ads.m10;
import com.google.android.gms.internal.ads.sw;
import com.google.android.gms.internal.ads.ty1;
import com.google.android.gms.internal.ads.uy1;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f50a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private String f51b = "";

    /* renamed from: c, reason: collision with root package name */
    private String f52c = "";

    /* renamed from: d, reason: collision with root package name */
    private boolean f53d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f54e = false;

    /* renamed from: f, reason: collision with root package name */
    protected String f55f = "";

    /* renamed from: g, reason: collision with root package name */
    private uy1 f56g;

    protected static final String o(Context context, String str, String str2) {
        String valueOf;
        String str3;
        String str4;
        HashMap hashMap = new HashMap();
        hashMap.put("User-Agent", y2.t.q().L(context, str2));
        cc3<String> b7 = new u0(context).b(0, str, hashMap, null);
        try {
            return b7.get(((Integer) sw.c().b(m10.f8268o3)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e7) {
            e = e7;
            valueOf = String.valueOf(str);
            str3 = "Interrupted while retrieving a response from: ";
            if (valueOf.length() == 0) {
                str4 = new String("Interrupted while retrieving a response from: ");
                io0.e(str4, e);
                b7.cancel(true);
                return null;
            }
            str4 = str3.concat(valueOf);
            io0.e(str4, e);
            b7.cancel(true);
            return null;
        } catch (TimeoutException e8) {
            e = e8;
            valueOf = String.valueOf(str);
            str3 = "Timeout while retrieving a response from: ";
            if (valueOf.length() == 0) {
                str4 = new String("Timeout while retrieving a response from: ");
                io0.e(str4, e);
                b7.cancel(true);
                return null;
            }
            str4 = str3.concat(valueOf);
            io0.e(str4, e);
            b7.cancel(true);
            return null;
        } catch (Exception e9) {
            String valueOf2 = String.valueOf(str);
            io0.e(valueOf2.length() != 0 ? "Error retrieving a response from: ".concat(valueOf2) : new String("Error retrieving a response from: "), e9);
            return null;
        }
    }

    private final Uri p(Context context, String str, String str2, String str3) {
        String str4;
        String str5;
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        synchronized (this.f50a) {
            if (TextUtils.isEmpty(this.f51b)) {
                y2.t.q();
                try {
                    str5 = new String(v3.j.d(context.openFileInput("debug_signals_id.txt"), true), "UTF-8");
                } catch (IOException unused) {
                    io0.b("Error reading from internal storage.");
                    str5 = "";
                }
                this.f51b = str5;
                if (TextUtils.isEmpty(str5)) {
                    y2.t.q();
                    this.f51b = UUID.randomUUID().toString();
                    y2.t.q();
                    String str6 = this.f51b;
                    try {
                        FileOutputStream openFileOutput = context.openFileOutput("debug_signals_id.txt", 0);
                        openFileOutput.write(str6.getBytes("UTF-8"));
                        openFileOutput.close();
                    } catch (Exception e7) {
                        io0.e("Error writing to file in internal storage.", e7);
                    }
                }
            }
            str4 = this.f51b;
        }
        buildUpon.appendQueryParameter("linkedDeviceId", str4);
        buildUpon.appendQueryParameter("adSlotPath", str2);
        buildUpon.appendQueryParameter("afmaVersion", str3);
        return buildUpon.build();
    }

    public final uy1 a() {
        return this.f56g;
    }

    public final String b() {
        String str;
        synchronized (this.f50a) {
            str = this.f52c;
        }
        return str;
    }

    public final void c(Context context) {
        uy1 uy1Var;
        if (!((Boolean) sw.c().b(m10.P6)).booleanValue() || (uy1Var = this.f56g) == null) {
            return;
        }
        uy1Var.g(new y(this, context), ty1.DEBUG_MENU);
    }

    public final void d(Context context, String str, String str2) {
        y2.t.q();
        g2.y(context, p(context, (String) sw.c().b(m10.f8236k3), str, str2));
    }

    public final void e(Context context, String str, String str2, String str3) {
        Uri.Builder buildUpon = p(context, (String) sw.c().b(m10.f8260n3), str3, str).buildUpon();
        buildUpon.appendQueryParameter("debugData", str2);
        y2.t.q();
        g2.o(context, str, buildUpon.build().toString());
    }

    public final void f(boolean z6) {
        synchronized (this.f50a) {
            this.f54e = z6;
            if (((Boolean) sw.c().b(m10.P6)).booleanValue()) {
                y2.t.p().h().R(z6);
                uy1 uy1Var = this.f56g;
                if (uy1Var != null) {
                    uy1Var.i(z6);
                }
            }
        }
    }

    public final void g(uy1 uy1Var) {
        this.f56g = uy1Var;
    }

    public final void h(boolean z6) {
        synchronized (this.f50a) {
            this.f53d = z6;
        }
    }

    protected final void i(Context context, String str, boolean z6, boolean z7) {
        if (context instanceof Activity) {
            g2.f72i.post(new a0(this, context, str, z6, z7));
        } else {
            io0.f("Can not create dialog without Activity Context");
        }
    }

    public final boolean j(Context context, String str, String str2) {
        String o7 = o(context, p(context, (String) sw.c().b(m10.f8252m3), str, str2).toString(), str2);
        if (TextUtils.isEmpty(o7)) {
            io0.b("Not linked for debug signals.");
            return false;
        }
        try {
            boolean equals = "1".equals(new JSONObject(o7.trim()).optString("debug_mode"));
            f(equals);
            if (((Boolean) sw.c().b(m10.P6)).booleanValue()) {
                t1 h7 = y2.t.p().h();
                if (true != equals) {
                    str = "";
                }
                h7.P(str);
            }
            return equals;
        } catch (JSONException e7) {
            io0.h("Fail to get debug mode response json.", e7);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final boolean k(Context context, String str, String str2) {
        boolean z6;
        String o7 = o(context, p(context, (String) sw.c().b(m10.f8244l3), str, str2).toString(), str2);
        if (TextUtils.isEmpty(o7)) {
            io0.b("Not linked for in app preview.");
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(o7.trim());
            String optString = jSONObject.optString("gct");
            this.f55f = jSONObject.optString("status");
            if (((Boolean) sw.c().b(m10.P6)).booleanValue()) {
                if (!"0".equals(this.f55f) && !"2".equals(this.f55f)) {
                    z6 = false;
                    f(z6);
                    t1 h7 = y2.t.p().h();
                    if (true != z6) {
                        str = "";
                    }
                    h7.P(str);
                }
                z6 = true;
                f(z6);
                t1 h72 = y2.t.p().h();
                if (true != z6) {
                }
                h72.P(str);
            }
            synchronized (this.f50a) {
                this.f52c = optString;
            }
            return true;
        } catch (JSONException e7) {
            io0.h("Fail to get in app preview response json.", e7);
            return false;
        }
    }

    public final boolean l() {
        boolean z6;
        synchronized (this.f50a) {
            z6 = this.f54e;
        }
        return z6;
    }

    public final boolean m() {
        boolean z6;
        synchronized (this.f50a) {
            z6 = this.f53d;
        }
        return z6;
    }

    public final boolean n(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || !m()) {
            return false;
        }
        io0.b("Sending troubleshooting signals to the server.");
        e(context, str, str2, str3);
        return true;
    }
}
