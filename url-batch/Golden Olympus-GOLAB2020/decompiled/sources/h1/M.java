package h1;

import android.content.Context;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.OutputConfiguration;
import com.unity3d.player.C1766o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

/* loaded from: classes2.dex */
public class M extends C1766o {

    /* renamed from: F, reason: collision with root package name */
    public static HashMap f36711F;

    /* renamed from: E, reason: collision with root package name */
    public String f36712E;

    public M(P p4) {
        super(p4);
        this.f36712E = null;
    }

    public static String[] h(Context context) {
        Set<String> physicalCameraIds;
        String[] cameraIdList = C1766o.getCameraManager(context).getCameraIdList();
        ArrayList arrayList = new ArrayList();
        f36711F = new HashMap();
        for (String str : cameraIdList) {
            arrayList.add(str);
            f36711F.put(str, str);
        }
        for (String str2 : cameraIdList) {
            CameraCharacteristics cameraCharacteristics = C1766o.getCameraManager(context).getCameraCharacteristics(str2);
            int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            int length = iArr.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    T.a(4, "Camera2 " + str2 + " is a simple camera");
                    break;
                }
                if (iArr[i4] == 11) {
                    T.a(4, "Camera2 " + str2 + " is a logical camera backed by two or more physical cameras");
                    physicalCameraIds = cameraCharacteristics.getPhysicalCameraIds();
                    for (String str3 : physicalCameraIds) {
                        if (arrayList.indexOf(str3) == -1) {
                            arrayList.add(str3);
                            f36711F.put(str3, str2);
                        }
                        T.a(4, "Physical camera2 found : " + str3);
                    }
                } else {
                    i4++;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    @Override // com.unity3d.player.C1766o
    public void createCaptureSession(CameraCaptureSession.StateCallback stateCallback) {
        OutputConfiguration outputConfiguration = new OutputConfiguration(this.f22225w);
        String str = this.f36712E;
        if (str != null) {
            outputConfiguration.setPhysicalCameraId(str);
        }
        CameraDevice cameraDevice = this.f22204b;
        L.a();
        cameraDevice.createCaptureSession(K.a(0, Collections.singletonList(outputConfiguration), new G(this.f22206d), stateCallback));
    }

    @Override // com.unity3d.player.C1766o
    public String getCameraIdToOpen(Context context, int i4) {
        String str = C1766o.getCameraIds(context)[i4];
        String str2 = (String) f36711F.get(str);
        if (str2.equals(str)) {
            this.f36712E = null;
            return str;
        }
        this.f36712E = str;
        return str2;
    }

    @Override // com.unity3d.player.C1766o
    public CameraCaptureSession.CaptureCallback getCaptureCallback() {
        if (this.f22221s == null) {
            this.f22221s = new F(this);
        }
        return this.f22221s;
    }
}
