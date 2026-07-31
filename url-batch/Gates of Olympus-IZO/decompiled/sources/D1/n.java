package D1;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Base64;
import android.webkit.JavascriptInterface;
import com.gates.olympus.miruv.tenon.TenonPageActivity;
import h2.AbstractC0447i;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TenonPageActivity f563a;

    public n(TenonPageActivity tenonPageActivity) {
        this.f563a = tenonPageActivity;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    @JavascriptInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void save(String str, String str2, String str3) {
        Object t3;
        String z02;
        byte[] decode;
        Z1.t tVar;
        Uri uri;
        Z1.i.f(str, "mimeHeader");
        Z1.i.f(str2, "base64");
        Z1.i.f(str3, "filename");
        m mVar = TenonPageActivity.Companion;
        TenonPageActivity tenonPageActivity = this.f563a;
        tenonPageActivity.getClass();
        try {
            z02 = AbstractC0447i.z0(str, "data:");
            int r02 = AbstractC0447i.r0(z02, ";", 0, false, 6);
            if (r02 != -1) {
                z02 = z02.substring(0, r02);
                Z1.i.e(z02, "substring(...)");
            }
            if (AbstractC0447i.t0(z02)) {
                z02 = "application/octet-stream";
            }
            decode = Base64.decode(str2, 0);
            tVar = new Z1.t();
            tVar.f3480d = str3;
            if (AbstractC0447i.t0(str3) || Z1.i.a(tVar.f3480d, "download")) {
                tVar.f3480d = "download_" + new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.US).format(new Date()) + "." + TenonPageActivity.l(z02);
            }
        } catch (Throwable th) {
            t3 = I2.l.t(th);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("_display_name", (String) tVar.f3480d);
            contentValues.put("mime_type", z02);
            contentValues.put("relative_path", Environment.DIRECTORY_DOWNLOADS);
            ContentResolver contentResolver = tenonPageActivity.getContentResolver();
            uri = MediaStore.Downloads.EXTERNAL_CONTENT_URI;
            Uri insert = contentResolver.insert(uri, contentValues);
            if (insert == null) {
                t3 = L1.z.f2729a;
                if (L1.m.a(t3) == null) {
                    tenonPageActivity.runOnUiThread(new i(tenonPageActivity, 1));
                    return;
                }
                return;
            }
            OutputStream openOutputStream = contentResolver.openOutputStream(insert);
            if (openOutputStream != null) {
                try {
                    openOutputStream.write(decode);
                    I2.d.u(openOutputStream, null);
                } finally {
                }
            }
        } else {
            File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
            if (!externalStoragePublicDirectory.exists()) {
                externalStoragePublicDirectory.mkdirs();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(new File(externalStoragePublicDirectory, (String) tVar.f3480d));
            try {
                fileOutputStream.write(decode);
                I2.d.u(fileOutputStream, null);
            } finally {
            }
        }
        tenonPageActivity.runOnUiThread(new j(tenonPageActivity, 0, tVar));
        t3 = L1.z.f2729a;
        if (L1.m.a(t3) == null) {
        }
    }
}
