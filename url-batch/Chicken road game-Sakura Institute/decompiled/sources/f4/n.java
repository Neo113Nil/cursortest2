package f4;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Base64;
import android.webkit.JavascriptInterface;
import com.chicken.road.whale.plate.PlatePageActivity;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PlatePageActivity f3339a;

    public n(PlatePageActivity platePageActivity) {
        this.f3339a = platePageActivity;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    @JavascriptInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void save(String str, String str2, String str3) {
        Object b9;
        String N;
        byte[] decode;
        r6.v vVar;
        Uri uri;
        r6.k.f(str, "mimeHeader");
        r6.k.f(str2, "base64");
        r6.k.f(str3, "filename");
        PlatePageActivity platePageActivity = this.f3339a;
        m mVar = PlatePageActivity.Companion;
        try {
            N = z6.h.N(str, "data:");
            int E = z6.h.E(N, ";", 0, 6);
            if (E != -1) {
                N = N.substring(0, E);
                r6.k.e(N, "substring(...)");
            }
            if (z6.h.G(N)) {
                N = "application/octet-stream";
            }
            decode = Base64.decode(str2, 0);
            vVar = new r6.v();
            vVar.f7968f = str3;
            if (z6.h.G(str3) || r6.k.a(vVar.f7968f, "download")) {
                vVar.f7968f = "download_" + new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.US).format(new Date()) + "." + PlatePageActivity.l(N);
            }
        } catch (Throwable th) {
            b9 = d6.a.b(th);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("_display_name", (String) vVar.f7968f);
            contentValues.put("mime_type", N);
            contentValues.put("relative_path", Environment.DIRECTORY_DOWNLOADS);
            ContentResolver contentResolver = platePageActivity.getContentResolver();
            uri = MediaStore.Downloads.EXTERNAL_CONTENT_URI;
            Uri insert = contentResolver.insert(uri, contentValues);
            if (insert == null) {
                b9 = d6.z.f2639a;
                if (d6.m.a(b9) == null) {
                    platePageActivity.runOnUiThread(new h(platePageActivity, 1));
                    return;
                }
                return;
            }
            OutputStream openOutputStream = contentResolver.openOutputStream(insert);
            if (openOutputStream != null) {
                try {
                    openOutputStream.write(decode);
                    openOutputStream.close();
                } finally {
                }
            }
        } else {
            File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
            if (!externalStoragePublicDirectory.exists()) {
                externalStoragePublicDirectory.mkdirs();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(new File(externalStoragePublicDirectory, (String) vVar.f7968f));
            try {
                fileOutputStream.write(decode);
                fileOutputStream.close();
            } finally {
            }
        }
        platePageActivity.runOnUiThread(new androidx.room.b0(platePageActivity, 4, vVar));
        b9 = d6.z.f2639a;
        if (d6.m.a(b9) == null) {
        }
    }
}
