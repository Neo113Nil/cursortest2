package defpackage;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class fz {
    public final Executor PxuCJdSBwIXG;
    public gz[] RAsUl2FVSrh6;
    public final byte[] TSizfFm2Yiuu;
    public final File Y1f8riQaR6yg;
    public boolean a92UlCVFR9N8 = false;
    public final String e9gEMXR7LXtO;
    public final rq1 lS5Rgt96tfkO;
    public byte[] rtx2ld2ELZv4;

    public fz(AssetManager assetManager, Executor executor, rq1 rq1Var, String str, File file) {
        byte[] bArr;
        this.PxuCJdSBwIXG = executor;
        this.lS5Rgt96tfkO = rq1Var;
        this.e9gEMXR7LXtO = str;
        this.Y1f8riQaR6yg = file;
        int i = Build.VERSION.SDK_INT;
        if (i < 31) {
            switch (i) {
                case 24:
                case 25:
                    bArr = bs0.EcgxDIVH5in8;
                    break;
                case 26:
                    bArr = bs0.RfyTYNmI9Srp;
                    break;
                case 27:
                    bArr = bs0.XL4ISE6Oc65B;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = bs0.BRwzKIf41E4i;
                    break;
                default:
                    bArr = null;
                    break;
            }
        } else {
            bArr = bs0.gPXPFXrUH4XX;
        }
        this.TSizfFm2Yiuu = bArr;
    }

    public final FileInputStream PxuCJdSBwIXG(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            this.lS5Rgt96tfkO.OPXfSBeufaJ8();
            return null;
        }
    }

    public final void lS5Rgt96tfkO(final int i, final Serializable serializable) {
        this.PxuCJdSBwIXG.execute(new Runnable() { // from class: ez
            @Override // java.lang.Runnable
            public final void run() {
                fz.this.lS5Rgt96tfkO.wdg6QnbFHrFF(i, serializable);
            }
        });
    }
}
