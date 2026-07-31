package c4;

import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.util.Locale;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class l0 implements c2 {

    /* renamed from: a, reason: collision with root package name */
    private final Application f2024a;

    /* renamed from: b, reason: collision with root package name */
    private final j0 f2025b;

    /* renamed from: c, reason: collision with root package name */
    private final Handler f2026c;

    /* renamed from: d, reason: collision with root package name */
    private final Executor f2027d;

    /* renamed from: e, reason: collision with root package name */
    private final y1 f2028e;

    /* renamed from: f, reason: collision with root package name */
    private final k f2029f;

    /* renamed from: g, reason: collision with root package name */
    private final u f2030g;

    l0(Application application, j0 j0Var, Handler handler, Executor executor, y1 y1Var, k kVar, u uVar) {
        this.f2024a = application;
        this.f2025b = j0Var;
        this.f2026c = handler;
        this.f2027d = executor;
        this.f2028e = y1Var;
        this.f2029f = kVar;
        this.f2030g = uVar;
    }

    private static JSONObject b(Context context) {
        String concat;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("app_name", context.getPackageManager().getApplicationLabel(context.getApplicationInfo()).toString());
            Drawable applicationIcon = context.getPackageManager().getApplicationIcon(context.getApplicationInfo());
            if (applicationIcon == null) {
                concat = null;
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(applicationIcon.getIntrinsicWidth(), applicationIcon.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                applicationIcon.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                applicationIcon.draw(canvas);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                String valueOf = String.valueOf(Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0));
                concat = valueOf.length() != 0 ? "data:image/png;base64,".concat(valueOf) : new String("data:image/png;base64,");
            }
            jSONObject.put("app_icon", concat);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // c4.c2
    public final boolean a(String str, JSONObject jSONObject) {
        char c7;
        str.hashCode();
        int i7 = 2;
        switch (str.hashCode()) {
            case -1370505102:
                if (str.equals("load_complete")) {
                    c7 = 0;
                    break;
                }
                c7 = 65535;
                break;
            case -278739366:
                if (str.equals("configure_app_assets")) {
                    c7 = 1;
                    break;
                }
                c7 = 65535;
                break;
            case 150940456:
                if (str.equals("browser")) {
                    c7 = 2;
                    break;
                }
                c7 = 65535;
                break;
            case 1671672458:
                if (str.equals("dismiss")) {
                    c7 = 3;
                    break;
                }
                c7 = 65535;
                break;
            default:
                c7 = 65535;
                break;
        }
        switch (c7) {
            case 0:
                this.f2030g.g();
                return true;
            case 1:
                this.f2027d.execute(new Runnable(this) { // from class: c4.n0

                    /* renamed from: f, reason: collision with root package name */
                    private final l0 f2048f;

                    {
                        this.f2048f = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f2048f.e();
                    }
                });
                return true;
            case 2:
                String optString = jSONObject.optString("url");
                if (TextUtils.isEmpty(optString)) {
                    Log.d("UserMessagingPlatform", "Action[browser]: empty url.");
                }
                Uri parse = Uri.parse(optString);
                if (parse.getScheme() == null) {
                    String valueOf = String.valueOf(optString);
                    Log.d("UserMessagingPlatform", valueOf.length() != 0 ? "Action[browser]: empty scheme: ".concat(valueOf) : new String("Action[browser]: empty scheme: "));
                }
                try {
                    this.f2025b.startActivity(new Intent("android.intent.action.VIEW", parse));
                } catch (ActivityNotFoundException e7) {
                    String valueOf2 = String.valueOf(optString);
                    d1.a(valueOf2.length() != 0 ? "Action[browser]: can not open url: ".concat(valueOf2) : new String("Action[browser]: can not open url: "), e7);
                }
                return true;
            case 3:
                String optString2 = jSONObject.optString("status");
                optString2.hashCode();
                switch (optString2) {
                    case "CONSENT_SIGNAL_NON_PERSONALIZED_ADS":
                    case "non_personalized":
                        i7 = 1;
                        this.f2030g.d(3, i7);
                        return true;
                    case "personalized":
                    case "CONSENT_SIGNAL_PERSONALIZED_ADS":
                        this.f2030g.d(3, i7);
                        return true;
                    case "CONSENT_SIGNAL_SUFFICIENT":
                        i7 = 0;
                        this.f2030g.d(3, i7);
                        return true;
                    default:
                        this.f2030g.h(new e2(1, "We are getting something wrong with the webview."));
                        return true;
                }
            default:
                return false;
        }
    }

    final void c(int i7, String str, String str2) {
        this.f2030g.e(new e2(2, String.format(Locale.US, "WebResourceError(%d, %s): %s", Integer.valueOf(i7), str2, str)));
    }

    final void d(String str) {
        String valueOf = String.valueOf(str);
        Log.d("UserMessagingPlatform", valueOf.length() != 0 ? "Receive consent action: ".concat(valueOf) : new String("Receive consent action: "));
        Uri parse = Uri.parse(str);
        this.f2028e.b(parse.getQueryParameter("action"), parse.getQueryParameter("args"), this, this.f2029f);
    }

    final /* synthetic */ void e() {
        this.f2030g.c().b("UMP_configureFormWithAppAssets", b(this.f2024a));
    }

    @Override // c4.c2
    public final Executor zza() {
        Handler handler = this.f2026c;
        handler.getClass();
        return o0.a(handler);
    }
}
