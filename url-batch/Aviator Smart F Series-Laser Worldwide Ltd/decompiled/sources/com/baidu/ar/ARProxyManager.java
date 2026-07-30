package com.baidu.ar;

import com.baidu.ar.capture.ICapture;
import com.baidu.ar.cloud.ICloudIR;
import com.baidu.ar.digital.IDigital;
import com.baidu.ar.face.IFace;
import com.baidu.ar.marker.IMarker;
import com.baidu.ar.recg.IOnDeviceIR;
import com.baidu.ar.track2d.ITrack2D;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class ARProxyManager {

    /* renamed from: a, reason: collision with root package name */
    public HashMap<String, d0> f1451a = new HashMap<>();

    public final d0 a(String str) {
        if ("com.baidu.ar.face.FaceAR".equals(str)) {
            return new z3();
        }
        if ("com.baidu.ar.track2d.Track2DAR".equals(str)) {
            return new uc();
        }
        if ("com.baidu.ar.track3d.Track3DAR".equals(str)) {
            return new ad();
        }
        if ("com.baidu.ar.cloud.CloudAR".equals(str)) {
            return new g2();
        }
        if ("com.baidu.ar.recg.RecgAR".equals(str)) {
            return new r9();
        }
        if ("com.baidu.ar.capture.FamilyWithChildAR".equals(str)) {
            return new s1();
        }
        if ("com.baidu.ar.vps.marker.MarkerAR".equals(str)) {
            return new o8();
        }
        if ("com.baidu.ar.digital.DigitalAR".equals(str)) {
            return new i3();
        }
        return null;
    }

    public final d0 b(String str) {
        if (!c(str)) {
            return null;
        }
        if (this.f1451a == null) {
            this.f1451a = new HashMap<>();
        }
        d0 d0Var = this.f1451a.get(str);
        if (d0Var == null) {
            d0Var = a(str);
        }
        if (d0Var != null) {
            this.f1451a.put(str, d0Var);
        }
        return d0Var;
    }

    public boolean c(String str) {
        return "com.baidu.ar.face.FaceAR".equals(str) || "com.baidu.ar.track2d.Track2DAR".equals(str) || "com.baidu.ar.track3d.Track3DAR".equals(str) || "com.baidu.ar.cloud.CloudAR".equals(str) || "com.baidu.ar.recg.RecgAR".equals(str) || "com.baidu.ar.vps.marker.MarkerAR".equals(str) || "com.baidu.ar.capture.FamilyWithChildAR".equals(str) || "com.baidu.ar.digital.DigitalAR".equals(str);
    }

    public void d(String str) {
        d0 d0Var;
        HashMap<String, d0> hashMap = this.f1451a;
        if (hashMap == null || (d0Var = hashMap.get(str)) == null) {
            return;
        }
        d0Var.a(null);
    }

    public ICapture getCaptureAR() {
        return (ICapture) b("com.baidu.ar.capture.FamilyWithChildAR");
    }

    public ICloudIR getCloudIRAR() {
        return (ICloudIR) b("com.baidu.ar.cloud.CloudAR");
    }

    public IDigital getDigitalAR() {
        return (IDigital) b("com.baidu.ar.digital.DigitalAR");
    }

    public IFace getFaceAR() {
        return (IFace) b("com.baidu.ar.face.FaceAR");
    }

    public IMarker getMarkerAR() {
        return (IMarker) b("com.baidu.ar.vps.marker.MarkerAR");
    }

    public IOnDeviceIR getOnDeviceIRAR() {
        return (IOnDeviceIR) b("com.baidu.ar.recg.RecgAR");
    }

    public ITrack2D getTrack2DAR() {
        return (ITrack2D) b("com.baidu.ar.track2d.Track2DAR");
    }

    public y6 getTrack3DAR() {
        return (y6) b("com.baidu.ar.track3d.Track3DAR");
    }

    public void a() {
        b();
        HashMap<String, d0> hashMap = this.f1451a;
        if (hashMap != null) {
            Iterator<Map.Entry<String, d0>> it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().a();
            }
            this.f1451a.clear();
            this.f1451a = null;
        }
    }

    public void b() {
        HashMap<String, d0> hashMap = this.f1451a;
        if (hashMap != null) {
            Iterator<d0> it = hashMap.values().iterator();
            while (it.hasNext()) {
                it.next().a(null);
            }
        }
    }

    public void a(c0 c0Var, String str) {
        d0 b8 = b(str);
        if (b8 != null) {
            b8.a(c0Var);
        }
    }
}
