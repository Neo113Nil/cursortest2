package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Build;
import com.google.android.apps.authenticator2.main.MainActivity;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bud {
    public static final hkh a = hkh.l("com/google/android/apps/authenticator2/main/MainActivityPeer");
    public boolean b;
    public final MainActivity c;
    public final by d;
    public final frz e;
    public int f = 1;
    public int g = 1;

    public bud(MainActivity mainActivity, frz frzVar, fye fyeVar) {
        this.c = mainActivity;
        this.d = mainActivity.a();
        if (!"robolectric".equals(Build.FINGERPRINT)) {
            Intent intent = mainActivity.getIntent();
            Set<String> categories = intent.getCategories();
            ComponentName callingActivity = mainActivity.getCallingActivity();
            if ((categories == null || categories.isEmpty()) && ((callingActivity == null || mainActivity.getPackageName().equals(callingActivity.getPackageName())) && (intent.getFlags() & 268435456) == 0 && intent.getData() == null && intent.getClipData() == null && intent.getType() == null)) {
                ((hkf) ((hkf) ftt.a.g()).i("com/google/apps/tiktok/account/api/controller/Config", "forExternalActivity", 96, "Config.java")).u("External config used on invalid activity: %s", mainActivity.getClass());
            }
        }
        ggb a2 = ftt.a();
        a2.g(true);
        a2.f(fye.class);
        a2.f(fze.class);
        frz g = frzVar.g(a2.e());
        g.j(new fyd(this, 1));
        g.j(new fyd(fyeVar, 0));
        this.e = frzVar;
    }
}
