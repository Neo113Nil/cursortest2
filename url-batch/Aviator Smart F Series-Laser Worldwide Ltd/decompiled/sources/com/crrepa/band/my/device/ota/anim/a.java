package com.crrepa.band.my.device.ota.anim;

import android.widget.ImageView;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public class a {
    private int[] BAND_UPGRADE_RES = {R.drawable.upgrade_00000, R.drawable.upgrade_00001, R.drawable.upgrade_00002, R.drawable.upgrade_00003, R.drawable.upgrade_00004, R.drawable.upgrade_00005, R.drawable.upgrade_00006, R.drawable.upgrade_00007, R.drawable.upgrade_00008, R.drawable.upgrade_00009, R.drawable.upgrade_00010, R.drawable.upgrade_00011, R.drawable.upgrade_00012, R.drawable.upgrade_00013, R.drawable.upgrade_00014, R.drawable.upgrade_00015, R.drawable.upgrade_00016, R.drawable.upgrade_00017, R.drawable.upgrade_00018, R.drawable.upgrade_00019, R.drawable.upgrade_00020, R.drawable.upgrade_00021, R.drawable.upgrade_00022, R.drawable.upgrade_00023, R.drawable.upgrade_00024, R.drawable.upgrade_00025, R.drawable.upgrade_00026, R.drawable.upgrade_00027, R.drawable.upgrade_00028, R.drawable.upgrade_00029, R.drawable.upgrade_00030, R.drawable.upgrade_00031, R.drawable.upgrade_00032, R.drawable.upgrade_00033, R.drawable.upgrade_00034, R.drawable.upgrade_00035, R.drawable.upgrade_00036, R.drawable.upgrade_00037, R.drawable.upgrade_00038, R.drawable.upgrade_00039, R.drawable.upgrade_00040, R.drawable.upgrade_00041, R.drawable.upgrade_00042, R.drawable.upgrade_00043, R.drawable.upgrade_00044, R.drawable.upgrade_00045, R.drawable.upgrade_00046, R.drawable.upgrade_00047, R.drawable.upgrade_00048, R.drawable.upgrade_00049};
    private b mSceneAnimation;

    public void play(ImageView imageView) {
        if (this.mSceneAnimation == null) {
            this.mSceneAnimation = new b(imageView, this.BAND_UPGRADE_RES, 40);
        }
        if (this.mSceneAnimation.isRun()) {
            return;
        }
        this.mSceneAnimation.play(false);
    }

    public void stop() {
        b bVar = this.mSceneAnimation;
        if (bVar == null) {
            return;
        }
        bVar.stop();
    }
}
