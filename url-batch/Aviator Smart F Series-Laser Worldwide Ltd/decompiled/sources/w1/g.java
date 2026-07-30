package w1;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.provider.MediaStore;

/* loaded from: classes2.dex */
public class g {
    private static final String GALLERY = "Gallery";
    private static final String GIONEE_GALLERY = "com.gionee.gallery";
    private static final String ONEPLUS_GALLERY = "com.oneplus.gallery";
    private static final String VIVO_GALLERY = "com.vivo.gallery";

    private g() {
    }

    public static Intent getGalleryIntent(Context context) {
        Intent privateGalleryIntent = getPrivateGalleryIntent(context);
        if (privateGalleryIntent != null) {
            return privateGalleryIntent;
        }
        Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
        intent.addCategory("android.intent.category.APP_GALLERY");
        return Intent.createChooser(intent, GALLERY);
    }

    private static Intent getPrivateGalleryIntent(Context context) {
        PackageManager packageManager = context.getPackageManager();
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(ONEPLUS_GALLERY);
        if (launchIntentForPackage != null) {
            return launchIntentForPackage;
        }
        Intent launchIntentForPackage2 = packageManager.getLaunchIntentForPackage(VIVO_GALLERY);
        return launchIntentForPackage2 != null ? launchIntentForPackage2 : packageManager.getLaunchIntentForPackage(GIONEE_GALLERY);
    }

    public static Intent selectImageIntent() {
        Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        Intent intent = new Intent("android.intent.action.PICK", uri);
        intent.setDataAndType(uri, com.crrepa.x.a.f13978d);
        return intent;
    }
}
