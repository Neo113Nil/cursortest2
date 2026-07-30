package c5;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.moyoung.dafit.module.common.utils.g0;
import java.io.File;

/* loaded from: classes4.dex */
public class a {
    public static String getActionSourcePath(Context context, String str, String str2) {
        return g0.getDownloadFilePath(context, str2) + File.separator + str;
    }

    public static Uri getActionSourceUri(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(getActionSourcePath(context, str, str2));
        if (file.exists()) {
            return Uri.fromFile(file);
        }
        return null;
    }
}
