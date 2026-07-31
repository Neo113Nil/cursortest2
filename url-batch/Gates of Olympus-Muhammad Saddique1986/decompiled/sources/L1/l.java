package L1;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Base64;
import android.webkit.JavascriptInterface;
import com.gatesof.olympus.martu.marku.salon.SalonPageActivity;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import n2.AbstractC0730j;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SalonPageActivity f3379a;

    public l(SalonPageActivity salonPageActivity) {
        this.f3379a = salonPageActivity;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    @JavascriptInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void save(String str, String str2, String str3) {
        Object b3;
        String Q3;
        byte[] decode;
        f2.u uVar;
        Uri uri;
        f2.j.f(str, "mimeHeader");
        f2.j.f(str2, "base64");
        f2.j.f(str3, "filename");
        k kVar = SalonPageActivity.Companion;
        SalonPageActivity salonPageActivity = this.f3379a;
        salonPageActivity.getClass();
        try {
            Q3 = AbstractC0730j.Q(str, "data:");
            int I3 = AbstractC0730j.I(Q3, ";", 0, false, 6);
            if (I3 != -1) {
                Q3 = Q3.substring(0, I3);
                f2.j.e(Q3, "substring(...)");
            }
            if (AbstractC0730j.K(Q3)) {
                Q3 = "application/octet-stream";
            }
            decode = Base64.decode(str2, 0);
            uVar = new f2.u();
            uVar.f5832d = str3;
            if (AbstractC0730j.K(str3) || f2.j.a(uVar.f5832d, "download")) {
                uVar.f5832d = "download_" + new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.US).format(new Date()) + "." + SalonPageActivity.l(Q3);
            }
        } catch (Throwable th) {
            b3 = R1.a.b(th);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("_display_name", (String) uVar.f5832d);
            contentValues.put("mime_type", Q3);
            contentValues.put("relative_path", Environment.DIRECTORY_DOWNLOADS);
            ContentResolver contentResolver = salonPageActivity.getContentResolver();
            uri = MediaStore.Downloads.EXTERNAL_CONTENT_URI;
            Uri insert = contentResolver.insert(uri, contentValues);
            if (insert == null) {
                b3 = R1.y.f4171a;
                if (R1.l.a(b3) == null) {
                    salonPageActivity.runOnUiThread(new f(salonPageActivity, 1));
                    return;
                }
                return;
            }
            OutputStream openOutputStream = contentResolver.openOutputStream(insert);
            if (openOutputStream != null) {
                try {
                    openOutputStream.write(decode);
                    O2.d.t(openOutputStream, null);
                } finally {
                }
            }
        } else {
            File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
            if (!externalStoragePublicDirectory.exists()) {
                externalStoragePublicDirectory.mkdirs();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(new File(externalStoragePublicDirectory, (String) uVar.f5832d));
            try {
                fileOutputStream.write(decode);
                O2.d.t(fileOutputStream, null);
            } finally {
            }
        }
        salonPageActivity.runOnUiThread(new h(salonPageActivity, 0, uVar));
        b3 = R1.y.f4171a;
        if (R1.l.a(b3) == null) {
        }
    }
}
