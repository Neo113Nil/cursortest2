package B1;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Base64;
import android.webkit.JavascriptInterface;
import com.chicken.road.kedro.laqer.village.VillagePageActivity;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import y2.AbstractC1341p;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ VillagePageActivity f1020a;

    public r(VillagePageActivity villagePageActivity) {
        this.f1020a = villagePageActivity;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    @JavascriptInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void save(String mimeHeader, String base64, String filename) {
        Object a4;
        String missingDelimiterValue;
        byte[] decode;
        M2.E e4;
        Uri uri;
        int i2 = 0;
        Intrinsics.checkNotNullParameter(mimeHeader, "mimeHeader");
        Intrinsics.checkNotNullParameter(base64, "base64");
        Intrinsics.checkNotNullParameter(filename, "filename");
        q qVar = VillagePageActivity.Companion;
        VillagePageActivity villagePageActivity = this.f1020a;
        villagePageActivity.getClass();
        try {
            AbstractC1341p.a aVar = AbstractC1341p.f11673d;
            missingDelimiterValue = kotlin.text.y.D(mimeHeader, "data:");
            Intrinsics.checkNotNullParameter(missingDelimiterValue, "<this>");
            Intrinsics.checkNotNullParameter(";", "delimiter");
            Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
            int v4 = kotlin.text.y.v(missingDelimiterValue, ";", 0, false, 6);
            if (v4 != -1) {
                missingDelimiterValue = missingDelimiterValue.substring(0, v4);
                Intrinsics.checkNotNullExpressionValue(missingDelimiterValue, "substring(...)");
            }
            if (kotlin.text.y.x(missingDelimiterValue)) {
                missingDelimiterValue = "application/octet-stream";
            }
            decode = Base64.decode(base64, 0);
            e4 = new M2.E();
            e4.f3580d = filename;
            if (kotlin.text.y.x(filename) || Intrinsics.a(e4.f3580d, "download")) {
                e4.f3580d = "download_" + new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.US).format(new Date()) + "." + VillagePageActivity.o(missingDelimiterValue);
            }
        } catch (Throwable th) {
            AbstractC1341p.a aVar2 = AbstractC1341p.f11673d;
            a4 = AbstractC1343r.a(th);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("_display_name", (String) e4.f3580d);
            contentValues.put("mime_type", missingDelimiterValue);
            contentValues.put("relative_path", Environment.DIRECTORY_DOWNLOADS);
            ContentResolver contentResolver = villagePageActivity.getContentResolver();
            uri = MediaStore.Downloads.EXTERNAL_CONTENT_URI;
            Uri insert = contentResolver.insert(uri, contentValues);
            if (insert == null) {
                a4 = Unit.f7487a;
                if (AbstractC1341p.a(a4) == null) {
                    villagePageActivity.runOnUiThread(new RunnableC0105l(villagePageActivity, 1));
                    return;
                }
                return;
            }
            OutputStream openOutputStream = contentResolver.openOutputStream(insert);
            if (openOutputStream != null) {
                try {
                    openOutputStream.write(decode);
                    Unit unit = Unit.f7487a;
                    J2.q.a(openOutputStream, null);
                } finally {
                }
            }
        } else {
            File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
            if (!externalStoragePublicDirectory.exists()) {
                externalStoragePublicDirectory.mkdirs();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(new File(externalStoragePublicDirectory, (String) e4.f3580d));
            try {
                fileOutputStream.write(decode);
                Unit unit2 = Unit.f7487a;
                J2.q.a(fileOutputStream, null);
            } finally {
            }
        }
        villagePageActivity.runOnUiThread(new o(villagePageActivity, i2, e4));
        a4 = Unit.f7487a;
        if (AbstractC1341p.a(a4) == null) {
        }
    }
}
