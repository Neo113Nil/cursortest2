package defpackage;

import android.content.Intent;
import com.google.firebase.installations.FirebaseInstallations;
import com.majelw.libystne.MainActivity;
import com.majelw.libystne.MainActivity2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class em0 implements Runnable {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ boolean o;

    public /* synthetic */ em0(int i, Object obj, boolean z) {
        this.m = i;
        this.n = obj;
        this.o = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.m;
        boolean z = this.o;
        Object obj = this.n;
        switch (i) {
            case 0:
                ((FirebaseInstallations) obj).lambda$doRegistrationOrRefresh$3(z);
                break;
            case 1:
                ((FirebaseInstallations) obj).lambda$getToken$2(z);
                break;
            default:
                MainActivity mainActivity = (MainActivity) obj;
                int i2 = MainActivity.w;
                Intent intent = new Intent(mainActivity, (Class<?>) MainActivity2.class);
                if (z) {
                    intent.putExtra("extra_open_main", true);
                }
                mainActivity.startActivity(intent);
                mainActivity.finish();
                break;
        }
    }
}
