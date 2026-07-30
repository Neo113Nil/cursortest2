package s3;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: s3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0890a {
    private final Context context;
    private final Intent intent;
    private final boolean startApp;

    public C0890a(Context context, Intent intent, boolean z7) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.intent = intent;
        this.startApp = z7;
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
