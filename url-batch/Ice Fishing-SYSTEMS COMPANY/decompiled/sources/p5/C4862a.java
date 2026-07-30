package p5;

import android.content.Context;
import android.content.Intent;

/* renamed from: p5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4862a {
    private final Context context;
    private final Intent intent;
    private final boolean startApp;

    public C4862a(Context context, Intent intent, boolean z8) {
        kotlin.jvm.internal.h.e(context, "context");
        this.context = context;
        this.intent = intent;
        this.startApp = z8;
    }

    private final Intent getIntentAppOpen() {
        Intent launchIntentForPackage;
        if (!this.startApp || (launchIntentForPackage = this.context.getPackageManager().getLaunchIntentForPackage(this.context.getPackageName())) == null) {
            return null;
        }
        launchIntentForPackage.setPackage(null);
        launchIntentForPackage.setFlags(270532608);
        return launchIntentForPackage;
    }

    public final Intent getIntentVisible() {
        Intent intent = this.intent;
        return intent != null ? intent : getIntentAppOpen();
    }
}
