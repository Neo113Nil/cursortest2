package com.withpersona.sdk2.camera.camera2;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.MediaRecorder;
import android.util.Range;
import android.util.Size;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.moshi.LinkedHashTreeMap;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.sandbox.SandboxFlags_Factory;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;

/* loaded from: classes9.dex */
public abstract class Camera2UtilsKt {
    public static final SandboxFlags_Factory INSTANCE = new SandboxFlags_Factory(10);

    public static final ArrayList getAllCameraChoices(Context context) {
        StreamConfigurationMap streamConfigurationMap;
        int i;
        Range range;
        CameraManager cameraManager;
        String[] strArr;
        int i2;
        double d;
        Range range2;
        Range range3;
        context.getClass();
        Object systemService = context.getSystemService("camera");
        systemService.getClass();
        CameraManager cameraManager2 = (CameraManager) systemService;
        ArrayList arrayList = new ArrayList();
        String[] cameraIdList = cameraManager2.getCameraIdList();
        cameraIdList.getClass();
        int length = cameraIdList.length;
        int i3 = 0;
        int i4 = 0;
        while (i4 < length) {
            String str = cameraIdList[i4];
            CameraCharacteristics cameraCharacteristics = cameraManager2.getCameraCharacteristics(str);
            cameraCharacteristics.getClass();
            Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
            Integer num2 = (Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION);
            int intValue = num2 != null ? num2.intValue() : i3;
            int i5 = 1;
            CameraProperties.FacingMode facingMode = (num != null && num.intValue() == 0) ? CameraProperties.FacingMode.User : (num != null && num.intValue() == 1) ? CameraProperties.FacingMode.Environment : CameraProperties.FacingMode.Unknown;
            int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr == null || (streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) == null || !ArraysKt___ArraysKt.contains(iArr, i3)) {
                cameraManager = cameraManager2;
                strArr = cameraIdList;
                i2 = length;
                i = i3;
            } else {
                Range[] rangeArr = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
                if (rangeArr == null || rangeArr.length == 0) {
                    i = i3;
                    range = null;
                } else {
                    int length2 = rangeArr.length;
                    int i6 = i3;
                    Range range4 = null;
                    while (i6 < length2) {
                        Range range5 = rangeArr[i6];
                        Object upper = range5.getUpper();
                        upper.getClass();
                        int i7 = i3;
                        int intValue2 = ((Number) upper).intValue();
                        if (intValue2 >= 30 && (range4 == null || intValue2 < ((Number) range4.getUpper()).intValue())) {
                            range4 = range5;
                        }
                        i6++;
                        i3 = i7;
                    }
                    i = i3;
                    if (range4 != null) {
                        range = range4;
                    } else {
                        if (rangeArr.length == 0) {
                            a$$ExternalSyntheticBUOutline0.m();
                            return null;
                        }
                        Range range6 = rangeArr[i];
                        int length3 = rangeArr.length - 1;
                        if (length3 != 0) {
                            Integer num3 = (Integer) range6.getUpper();
                            if (1 <= length3) {
                                while (true) {
                                    Range range7 = rangeArr[i5];
                                    Integer num4 = (Integer) range7.getUpper();
                                    if (num3.compareTo(num4) < 0) {
                                        range6 = range7;
                                        num3 = num4;
                                    }
                                    if (i5 == length3) {
                                        break;
                                    }
                                    i5++;
                                }
                            }
                        }
                        range = range6;
                    }
                }
                Class<MediaRecorder> cls = MediaRecorder.class;
                Size[] outputSizes = streamConfigurationMap.getOutputSizes(cls);
                outputSizes.getClass();
                int length4 = outputSizes.length;
                int i8 = i;
                while (i8 < length4) {
                    Size[] sizeArr = outputSizes;
                    Size size = sizeArr[i8];
                    String[] strArr2 = cameraIdList;
                    int i9 = length;
                    double outputMinFrameDuration = streamConfigurationMap.getOutputMinFrameDuration(cls, size) / 1.0E9d;
                    Class<MediaRecorder> cls2 = cls;
                    double d2 = outputMinFrameDuration > 0.0d ? 1.0d / outputMinFrameDuration : 0.0d;
                    str.getClass();
                    size.getClass();
                    CameraManager cameraManager3 = cameraManager2;
                    if (range == null) {
                        range2 = range;
                        int i10 = (int) d2;
                        d = d2;
                        range3 = new Range(Integer.valueOf(i10), Integer.valueOf(i10));
                    } else {
                        d = d2;
                        range2 = range;
                        range3 = range2;
                    }
                    arrayList.add(new CameraChoice(str, size, d, range3, intValue, facingMode, new ExtraCameraOptions()));
                    i8++;
                    outputSizes = sizeArr;
                    length4 = length4;
                    cls = cls2;
                    cameraIdList = strArr2;
                    length = i9;
                    cameraManager2 = cameraManager3;
                    range = range2;
                }
                cameraManager = cameraManager2;
                strArr = cameraIdList;
                i2 = length;
            }
            i4++;
            i3 = i;
            cameraIdList = strArr;
            length = i2;
            cameraManager2 = cameraManager;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            CameraChoice cameraChoice = (CameraChoice) next;
            if (cameraChoice.size.getWidth() < 2000 && cameraChoice.size.getHeight() < 2000) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }

    public static final CameraChoices getBestCameraChoices(Context context, CameraDirection cameraDirection) {
        CameraProperties.FacingMode facingMode;
        context.getClass();
        ArrayList allCameraChoices = getAllCameraChoices(context);
        ArrayList arrayList = new ArrayList();
        Iterator it = allCameraChoices.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            CameraProperties.FacingMode facingMode2 = ((CameraChoice) next).facingMode;
            int ordinal = cameraDirection.ordinal();
            if (ordinal == 0) {
                facingMode = CameraProperties.FacingMode.User;
            } else if (ordinal == 1) {
                facingMode = CameraProperties.FacingMode.Environment;
            } else {
                if (ordinal != 2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                facingMode = CameraProperties.FacingMode.Unknown;
            }
            if (facingMode2 == facingMode) {
                arrayList.add(next);
            }
        }
        List sortedWith = CollectionsKt.sortedWith(arrayList, new LinkedHashTreeMap.AnonymousClass1(21));
        if (sortedWith.isEmpty()) {
            return null;
        }
        return new CameraChoices((CameraChoice) CollectionsKt.first(sortedWith), CollectionsKt.take(CollectionsKt.drop(sortedWith, 1), 5));
    }
}
