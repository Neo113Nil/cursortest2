package defpackage;

import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
enum bvj {
    DISABLED(R.drawable.gs_cloud_off_vd_theme_24, R.string.syncing_disabled),
    FAILED(R.drawable.sync_failed, R.string.syncing_fail),
    IN_PROGRESS(R.drawable.gs_cloud_download_vd_theme_24, R.string.syncing_in_progress),
    SUCCESSFUL(R.drawable.sync_successful, R.string.syncing_success);

    public final int e;
    public final int f;

    bvj(int i, int i2) {
        this.f = i;
        this.e = i2;
    }
}
