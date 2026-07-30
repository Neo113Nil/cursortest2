package defpackage;

import android.content.Context;
import com.facebook.appevents.ondeviceprocessing.OnDeviceProcessingManager;
import com.facebook.internal.FetchedAppGateKeepersManager;
import com.facebook.internal.FetchedAppSettingsManager;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class ok0 implements Runnable {
    public final /* synthetic */ int m;
    public final /* synthetic */ Context n;
    public final /* synthetic */ String o;
    public final /* synthetic */ String p;

    public /* synthetic */ ok0(Context context, String str, String str2) {
        this.m = 0;
        this.o = str;
        this.n = context;
        this.p = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.m;
        String str = this.p;
        String str2 = this.o;
        Context context = this.n;
        switch (i) {
            case 0:
                FetchedAppGateKeepersManager.loadAppGateKeepersAsync$lambda$0(str2, context, str);
                break;
            case 1:
                FetchedAppSettingsManager.loadAppSettingsAsync$lambda$0(context, str2, str);
                break;
            default:
                OnDeviceProcessingManager.sendInstallEventAsync$lambda$0(context, str2, str);
                break;
        }
    }

    public /* synthetic */ ok0(Context context, String str, String str2, int i) {
        this.m = i;
        this.n = context;
        this.o = str;
        this.p = str2;
    }
}
