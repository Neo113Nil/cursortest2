package com.baidu.ar;

import android.app.Activity;
import android.util.Log;
import com.baidu.ar.arrender.Texture;
import com.baidu.ar.i1;
import com.google.ar.core.ArCoreApk;
import com.google.ar.core.Camera;
import com.google.ar.core.CameraIntrinsics;
import com.google.ar.core.Config;
import com.google.ar.core.Session;
import com.google.ar.core.TrackingState;
import com.google.ar.core.exceptions.CameraNotAvailableException;

/* loaded from: classes.dex */
public class d extends i1 {

    /* renamed from: b, reason: collision with root package name */
    public Session f2005b;

    /* renamed from: c, reason: collision with root package name */
    public Activity f2006c;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2007a;

        static {
            int[] iArr = new int[ArCoreApk.InstallStatus.values().length];
            f2007a = iArr;
            try {
                iArr[ArCoreApk.InstallStatus.INSTALL_REQUESTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2007a[ArCoreApk.InstallStatus.INSTALLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public d(Activity activity) {
        this.f2006c = activity;
    }

    @Override // com.baidu.ar.i1
    public void a() {
        super.a();
        Session session = this.f2005b;
        if (session == null) {
            return;
        }
        try {
            Camera camera = session.update().getCamera();
            CameraIntrinsics imageIntrinsics = camera.getImageIntrinsics();
            float[] principalPoint = imageIntrinsics.getPrincipalPoint();
            float[] focalLength = imageIntrinsics.getFocalLength();
            float[] fArr = {focalLength[0], 0.0f, principalPoint[0], 0.0f, focalLength[1], principalPoint[1], 0.0f, 0.0f, 1.0f};
            float[] fArr2 = new float[16];
            camera.getPose().toMatrix(fArr2, 0);
            float atan = (float) (((Math.atan(principalPoint[0] / focalLength[0]) * 2.0d) / 3.141592653589793d) * 180.0d);
            int i8 = camera.getTrackingState() == TrackingState.TRACKING ? 0 : 1;
            float[] fArr3 = {fArr2[0], fArr2[4], fArr2[8], fArr2[1], fArr2[5], fArr2[9], fArr2[2], fArr2[6], fArr2[10], fArr2[12], fArr2[13], fArr2[14]};
            i1.a aVar = this.f2437a;
            if (aVar != null) {
                aVar.a(i8, fArr, atan, fArr3, fArr2);
            }
        } catch (Exception e8) {
            Log.e("ARCoreAbility", "onFrameUpdate: arcore update error.");
            e8.printStackTrace();
        }
    }

    public final void b(boolean z7) {
        Config config = this.f2005b.getConfig();
        config.setFocusMode(z7 ? Config.FocusMode.AUTO : Config.FocusMode.FIXED);
        this.f2005b.configure(config);
    }

    @Override // com.baidu.ar.i1
    public void c() {
        this.f2437a = null;
        Session session = this.f2005b;
        if (session != null) {
            session.close();
            this.f2005b = null;
        }
    }

    @Override // com.baidu.ar.i1
    public boolean d() {
        Session session = this.f2005b;
        if (session == null) {
            return true;
        }
        try {
            session.resume();
            return true;
        } catch (CameraNotAvailableException e8) {
            e8.printStackTrace();
            return false;
        }
    }

    @Override // com.baidu.ar.b7
    public void a(Texture texture) {
        Session session = this.f2005b;
        if (session == null || texture == null) {
            return;
        }
        session.setCameraTextureName(texture.getId());
    }

    @Override // com.baidu.ar.i1
    public boolean b() {
        Session session = this.f2005b;
        if (session != null) {
            session.pause();
        }
        return super.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0031 A[Catch: Exception -> 0x0052, TryCatch #0 {Exception -> 0x0052, blocks: (B:7:0x002c, B:9:0x0031, B:11:0x0045), top: B:6:0x002c }] */
    @Override // com.baidu.ar.i1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean a(boolean z7) {
        String str;
        ArCoreApk.Availability checkAvailability = ArCoreApk.getInstance().checkAvailability(this.f2006c);
        try {
            if (checkAvailability == ArCoreApk.Availability.SUPPORTED_APK_TOO_OLD) {
                str = "SUPPORTED_APK_TOO_OLD";
            } else if (checkAvailability == ArCoreApk.Availability.SUPPORTED_INSTALLED) {
                str = "SUPPORTED_INSTALLED";
            } else {
                if (checkAvailability != ArCoreApk.Availability.SUPPORTED_NOT_INSTALLED) {
                    if (checkAvailability == ArCoreApk.Availability.UNSUPPORTED_DEVICE_NOT_CAPABLE) {
                        str = "UNSUPPORTED_DEVICE_NOT_CAPABLE";
                    }
                    if (this.f2005b == null) {
                        if (a.f2007a[ArCoreApk.getInstance().requestInstall(this.f2006c, false).ordinal()] == 1) {
                            return false;
                        }
                        this.f2005b = new Session(this.f2006c);
                        b(z7);
                    }
                    return true;
                }
                str = "SUPPORTED_NOT_INSTALLED";
            }
            if (this.f2005b == null) {
            }
            return true;
        } catch (Exception e8) {
            e8.printStackTrace();
            Session session = this.f2005b;
            if (session != null) {
                session.close();
                this.f2005b = null;
            }
            return false;
        }
        Log.e("ARCoreAbility", str);
    }
}
