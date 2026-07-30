package u0;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import android.webkit.WebResourceResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import v0.AbstractC0963g;
import v0.J;

/* loaded from: classes.dex */
public final class s implements t {

    /* renamed from: i, reason: collision with root package name */
    public static final String[] f8061i = {"app_webview/", "databases/", "lib/", "shared_prefs/", "code_cache/"};

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8062d;

    /* renamed from: e, reason: collision with root package name */
    public Object f8063e;

    public boolean a(Context context) {
        String b7 = J.b((File) this.f8063e);
        String b8 = J.b(context.getCacheDir());
        String b9 = J.b(AbstractC0963g.e(context));
        if ((!b7.startsWith(b8) && !b7.startsWith(b9)) || b7.equals(b8) || b7.equals(b9)) {
            return false;
        }
        for (int i2 = 0; i2 < 5; i2++) {
            if (b7.startsWith(b9 + f8061i[i2])) {
                return false;
            }
        }
        return true;
    }

    @Override // u0.t
    public final WebResourceResponse handle(String str) {
        File file;
        switch (this.f8062d) {
            case 0:
                try {
                    J j = (J) this.f8063e;
                    j.getClass();
                    String substring = (str.length() <= 1 || str.charAt(0) != '/') ? str : str.substring(1);
                    InputStream open = ((Context) j.f8180b).getAssets().open(substring, 2);
                    if (substring.endsWith(".svgz")) {
                        open = new GZIPInputStream(open);
                    }
                    break;
                } catch (IOException e7) {
                    Log.e("WebViewAssetLoader", "Error opening asset path: " + str, e7);
                    return new WebResourceResponse(null, null, null);
                }
            case 1:
                try {
                    break;
                } catch (Resources.NotFoundException e8) {
                    Log.e("WebViewAssetLoader", "Resource not found from the path: " + str, e8);
                    return new WebResourceResponse(null, null, null);
                } catch (IOException e9) {
                    Log.e("WebViewAssetLoader", "Error opening resource from the path: " + str, e9);
                    return new WebResourceResponse(null, null, null);
                }
            default:
                File file2 = (File) this.f8063e;
                try {
                    String b7 = J.b(file2);
                    String canonicalPath = new File(file2, str).getCanonicalPath();
                    file = canonicalPath.startsWith(b7) ? new File(canonicalPath) : null;
                } catch (IOException e10) {
                    Log.e("WebViewAssetLoader", "Error opening the requested path: " + str, e10);
                }
                if (file == null) {
                    Log.e("WebViewAssetLoader", String.format("The requested file: %s is outside the mounted directory: %s", str, file2));
                    break;
                } else {
                    InputStream fileInputStream = new FileInputStream(file);
                    if (file.getPath().endsWith(".svgz")) {
                        fileInputStream = new GZIPInputStream(fileInputStream);
                    }
                    break;
                }
        }
        return new WebResourceResponse(null, null, null);
    }

    public s(Context context, File file) {
        this.f8062d = 2;
        try {
            this.f8063e = new File(J.b(file));
            if (a(context)) {
                return;
            }
            throw new IllegalArgumentException("The given directory \"" + file + "\" doesn't exist under an allowed app internal storage directory");
        } catch (IOException e7) {
            throw new IllegalArgumentException("Failed to resolve the canonical path for the given directory: " + file.getPath(), e7);
        }
    }
}
