package com.withpersona.sdk2.camera;

import android.util.Size;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.knotapi.knot.utilities.Constants;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.tracking.model.CameraInfoEventData;
import com.withpersona.sdk2.inquiry.tracking.model.CameraSize;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes9.dex */
public abstract class CameraPropertiesKt {
    public static final CameraInfoEventData toCameraInfoEventData(CameraProperties cameraProperties) {
        String str;
        cameraProperties.getClass();
        CameraProperties.FacingMode facingMode = cameraProperties.facingMode;
        Size size = cameraProperties.size;
        int ordinal = facingMode.ordinal();
        if (ordinal == 0) {
            str = "Front";
        } else if (ordinal == 1) {
            str = Constants.META_BACK_BUTTON;
        } else {
            if (ordinal != 2) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            str = "Unspecified";
        }
        return new CameraInfoEventData(cameraProperties.label, str, new CameraSize(Integer.valueOf(size.getWidth()), Integer.valueOf(size.getHeight())), Double.valueOf(cameraProperties.frameRate), Double.valueOf(cameraProperties.getAspectRatio()), null, null, 96, null);
    }

    public static String zza(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String m;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                m = "null";
            } else {
                try {
                    m = obj.toString();
                } catch (Exception e) {
                    String m2 = Recorder$$ExternalSyntheticOutline2.m(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(m2), (Throwable) e);
                    m = Boxes$$ExternalSyntheticOutline1.m("<", m2, " threw ", e.getClass().getName(), ">");
                }
            }
            objArr[i2] = m;
            i2++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (indexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i3, indexOf);
            sb.append(objArr[i]);
            i++;
            i3 = indexOf + 2;
        }
        sb.append((CharSequence) str, i3, str.length());
        if (i < length2) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static boolean zzb(String str) {
        return str == null || str.isEmpty();
    }
}
