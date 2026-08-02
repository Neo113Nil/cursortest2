package x;

import android.content.ContentProviderClient;
import android.content.Context;
import android.net.Uri;

/* renamed from: x.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0323b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3567a;

    /* renamed from: b, reason: collision with root package name */
    public final ContentProviderClient f3568b;

    public C0323b(Context context, Uri uri, int i2) {
        this.f3567a = i2;
        switch (i2) {
            case 1:
                this.f3568b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
                break;
            default:
                this.f3568b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
                break;
        }
    }

    public final void a() {
        switch (this.f3567a) {
            case 0:
                ContentProviderClient contentProviderClient = this.f3568b;
                if (contentProviderClient != null) {
                    contentProviderClient.release();
                    break;
                }
                break;
            default:
                ContentProviderClient contentProviderClient2 = this.f3568b;
                if (contentProviderClient2 != null) {
                    contentProviderClient2.release();
                    break;
                }
                break;
        }
    }
}
