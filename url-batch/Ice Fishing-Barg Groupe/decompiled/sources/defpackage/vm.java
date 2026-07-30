package defpackage;

import com.ice.fishing.grenza.MainActivity;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final /* synthetic */ class vm implements Runnable {
    public final /* synthetic */ MainActivity OPXfSBeufaJ8;
    public final /* synthetic */ int rtx2ld2ELZv4;

    public /* synthetic */ vm(MainActivity mainActivity, int i) {
        this.rtx2ld2ELZv4 = i;
        this.OPXfSBeufaJ8 = mainActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.rtx2ld2ELZv4;
        MainActivity mainActivity = this.OPXfSBeufaJ8;
        switch (i) {
            case 0:
                hn.OPXfSBeufaJ8(mainActivity);
                break;
            default:
                mainActivity.invalidateOptionsMenu();
                break;
        }
    }
}
