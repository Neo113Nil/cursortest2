package com.king.zxing.camera;

import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.Camera;
import android.os.Build;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;

/* loaded from: classes4.dex */
public final class c {
    private static final int AREA_PER_1000 = 400;
    private static final double MAX_ASPECT_DISTORTION = 0.05d;
    private static final float MAX_EXPOSURE_COMPENSATION = 1.5f;
    private static final int MAX_FPS = 20;
    private static final float MIN_EXPOSURE_COMPENSATION = 0.0f;
    private static final int MIN_FPS = 10;
    private static final int MIN_PREVIEW_PIXELS = 153600;
    private static final Pattern SEMICOLON = Pattern.compile(";");

    private c() {
    }

    private static List<Camera.Area> buildMiddleArea(int i8) {
        int i9 = -i8;
        return Collections.singletonList(new Camera.Area(new Rect(i9, i9, i8, i8), 1));
    }

    public static String collectStats(Camera.Parameters parameters) {
        return collectStats(parameters.flatten());
    }

    public static Point findBestPreviewSizeValue(Camera.Parameters parameters, Point point) {
        Camera.Size size;
        Iterator<Camera.Size> it;
        String str;
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        String str2 = "Parameters contained no preview size!";
        if (supportedPreviewSizes == null) {
            b5.b.w("Device returned no supported preview sizes; using default");
            Camera.Size previewSize = parameters.getPreviewSize();
            if (previewSize != null) {
                return new Point(previewSize.width, previewSize.height);
            }
            throw new IllegalStateException("Parameters contained no preview size!");
        }
        if (b5.b.isShowLog()) {
            StringBuilder sb = new StringBuilder();
            for (Camera.Size size2 : supportedPreviewSizes) {
                sb.append(size2.width);
                sb.append('x');
                sb.append(size2.height);
                sb.append(' ');
            }
            b5.b.d("Supported preview sizes: " + ((Object) sb));
        }
        int i8 = point.x;
        int i9 = point.y;
        double d8 = i8 < i9 ? i8 / i9 : i9 / i8;
        b5.b.d("screenAspectRatio: " + d8);
        Iterator<Camera.Size> it2 = supportedPreviewSizes.iterator();
        char c8 = 0;
        Camera.Size size3 = null;
        int i10 = 0;
        while (it2.hasNext()) {
            Camera.Size next = it2.next();
            int i11 = next.width;
            int i12 = next.height;
            int i13 = i11 * i12;
            if (i13 < MIN_PREVIEW_PIXELS) {
                it = it2;
                str = str2;
                size = size3;
            } else {
                boolean z7 = i11 < i12;
                int i14 = z7 ? i11 : i12;
                int i15 = z7 ? i12 : i11;
                Object[] objArr = new Object[2];
                objArr[c8] = Integer.valueOf(i14);
                objArr[1] = Integer.valueOf(i15);
                b5.b.d(String.format("maybeFlipped:%d * %d", objArr));
                size = size3;
                it = it2;
                str = str2;
                double d9 = i14 / i15;
                b5.b.d("aspectRatio: " + d9);
                double abs = Math.abs(d9 - d8);
                b5.b.d("distortion: " + abs);
                if (abs <= MAX_ASPECT_DISTORTION) {
                    if (i14 == point.x && i15 == point.y) {
                        Point point2 = new Point(i11, i12);
                        b5.b.d("Found preview size exactly matching screen size: " + point2);
                        return point2;
                    }
                    if (i13 > i10) {
                        size3 = next;
                        i10 = i13;
                        str2 = str;
                        it2 = it;
                        c8 = 0;
                    }
                }
            }
            size3 = size;
            str2 = str;
            it2 = it;
            c8 = 0;
        }
        String str3 = str2;
        Camera.Size size4 = size3;
        if (size4 != null) {
            Point point3 = new Point(size4.width, size4.height);
            b5.b.d("Using largest suitable preview size: " + point3);
            return point3;
        }
        Camera.Size previewSize2 = parameters.getPreviewSize();
        if (previewSize2 == null) {
            throw new IllegalStateException(str3);
        }
        Point point4 = new Point(previewSize2.width, previewSize2.height);
        b5.b.d("No suitable preview sizes, using default: " + point4);
        return point4;
    }

    private static String findSettableValue(String str, Collection<String> collection, String... strArr) {
        b5.b.d("Requesting " + str + " value from among: " + Arrays.toString(strArr));
        b5.b.d("Supported " + str + " values: " + collection);
        if (collection != null) {
            for (String str2 : strArr) {
                if (collection.contains(str2)) {
                    b5.b.d("Can set " + str + " to: " + str2);
                    return str2;
                }
            }
        }
        b5.b.d("No supported values match");
        return null;
    }

    private static Integer indexOfClosestZoom(Camera.Parameters parameters, double d8) {
        List<Integer> zoomRatios = parameters.getZoomRatios();
        b5.b.d("Zoom ratios: " + zoomRatios);
        int maxZoom = parameters.getMaxZoom();
        if (zoomRatios == null || zoomRatios.isEmpty() || zoomRatios.size() != maxZoom + 1) {
            b5.b.w("Invalid zoom ratios!");
            return null;
        }
        double d9 = d8 * 100.0d;
        double d10 = Double.POSITIVE_INFINITY;
        int i8 = 0;
        for (int i9 = 0; i9 < zoomRatios.size(); i9++) {
            double abs = Math.abs(zoomRatios.get(i9).intValue() - d9);
            if (abs < d10) {
                i8 = i9;
                d10 = abs;
            }
        }
        b5.b.d("Chose zoom ratio of " + (zoomRatios.get(i8).intValue() / 100.0d));
        return Integer.valueOf(i8);
    }

    public static void setBarcodeSceneMode(Camera.Parameters parameters) {
        if ("barcode".equals(parameters.getSceneMode())) {
            b5.b.d("Barcode scene mode already set");
            return;
        }
        String findSettableValue = findSettableValue("scene mode", parameters.getSupportedSceneModes(), "barcode");
        if (findSettableValue != null) {
            parameters.setSceneMode(findSettableValue);
        }
    }

    public static void setBestExposure(Camera.Parameters parameters, boolean z7) {
        int minExposureCompensation = parameters.getMinExposureCompensation();
        int maxExposureCompensation = parameters.getMaxExposureCompensation();
        float exposureCompensationStep = parameters.getExposureCompensationStep();
        if (minExposureCompensation != 0 || maxExposureCompensation != 0) {
            if (exposureCompensationStep > 0.0f) {
                int round = Math.round((z7 ? 0.0f : MAX_EXPOSURE_COMPENSATION) / exposureCompensationStep);
                float f8 = exposureCompensationStep * round;
                int max = Math.max(Math.min(round, maxExposureCompensation), minExposureCompensation);
                if (parameters.getExposureCompensation() == max) {
                    b5.b.d("Exposure compensation already set to " + max + " / " + f8);
                    return;
                }
                b5.b.d("Setting exposure compensation to " + max + " / " + f8);
                parameters.setExposureCompensation(max);
                return;
            }
        }
        b5.b.d("Camera does not support exposure compensation");
    }

    public static void setBestPreviewFPS(Camera.Parameters parameters) {
        setBestPreviewFPS(parameters, 10, 20);
    }

    public static void setFocus(Camera.Parameters parameters, boolean z7, boolean z8, boolean z9) {
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        String findSettableValue = z7 ? (z9 || z8) ? findSettableValue("focus mode", supportedFocusModes, TtmlNode.TEXT_EMPHASIS_AUTO) : findSettableValue("focus mode", supportedFocusModes, "continuous-picture", "continuous-video", TtmlNode.TEXT_EMPHASIS_AUTO) : null;
        if (!z9 && findSettableValue == null) {
            findSettableValue = findSettableValue("focus mode", supportedFocusModes, "macro", "edof");
        }
        if (findSettableValue != null) {
            if (!findSettableValue.equals(parameters.getFocusMode())) {
                parameters.setFocusMode(findSettableValue);
                return;
            }
            b5.b.d("Focus mode already set to " + findSettableValue);
        }
    }

    public static void setFocusArea(Camera.Parameters parameters) {
        if (parameters.getMaxNumFocusAreas() <= 0) {
            b5.b.d("Device does not support focus areas");
            return;
        }
        b5.b.d("Old focus areas: " + toString((Iterable<Camera.Area>) parameters.getFocusAreas()));
        List<Camera.Area> buildMiddleArea = buildMiddleArea(400);
        b5.b.d("Setting focus area to : " + toString((Iterable<Camera.Area>) buildMiddleArea));
        parameters.setFocusAreas(buildMiddleArea);
    }

    public static void setInvertColor(Camera.Parameters parameters) {
        if ("negative".equals(parameters.getColorEffect())) {
            b5.b.d("Negative effect already set");
            return;
        }
        String findSettableValue = findSettableValue("color effect", parameters.getSupportedColorEffects(), "negative");
        if (findSettableValue != null) {
            parameters.setColorEffect(findSettableValue);
        }
    }

    public static void setMetering(Camera.Parameters parameters) {
        if (parameters.getMaxNumMeteringAreas() <= 0) {
            b5.b.d("Device does not support metering areas");
            return;
        }
        b5.b.d("Old metering areas: " + parameters.getMeteringAreas());
        List<Camera.Area> buildMiddleArea = buildMiddleArea(400);
        b5.b.d("Setting metering area to : " + toString((Iterable<Camera.Area>) buildMiddleArea));
        parameters.setMeteringAreas(buildMiddleArea);
    }

    public static void setTorch(Camera.Parameters parameters, boolean z7) {
        List<String> supportedFlashModes = parameters.getSupportedFlashModes();
        String findSettableValue = z7 ? findSettableValue("flash mode", supportedFlashModes, "torch", "on") : findSettableValue("flash mode", supportedFlashModes, "off");
        if (findSettableValue != null) {
            if (findSettableValue.equals(parameters.getFlashMode())) {
                b5.b.d("Flash mode already set to " + findSettableValue);
                return;
            }
            b5.b.d("Setting flash mode to " + findSettableValue);
            parameters.setFlashMode(findSettableValue);
        }
    }

    public static void setVideoStabilization(Camera.Parameters parameters) {
        if (!parameters.isVideoStabilizationSupported()) {
            b5.b.d("This device does not support video stabilization");
        } else if (parameters.getVideoStabilization()) {
            b5.b.d("Video stabilization already enabled");
        } else {
            b5.b.d("Enabling video stabilization...");
            parameters.setVideoStabilization(true);
        }
    }

    public static void setZoom(Camera.Parameters parameters, double d8) {
        if (!parameters.isZoomSupported()) {
            b5.b.d("Zoom is not supported");
            return;
        }
        Integer indexOfClosestZoom = indexOfClosestZoom(parameters, d8);
        if (indexOfClosestZoom == null) {
            return;
        }
        if (parameters.getZoom() == indexOfClosestZoom.intValue()) {
            b5.b.d("Zoom is already set to " + indexOfClosestZoom);
            return;
        }
        b5.b.d("Setting zoom to " + indexOfClosestZoom);
        parameters.setZoom(indexOfClosestZoom.intValue());
    }

    private static String toString(Collection<int[]> collection) {
        if (collection == null || collection.isEmpty()) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        Iterator<int[]> it = collection.iterator();
        while (it.hasNext()) {
            sb.append(Arrays.toString(it.next()));
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(']');
        return sb.toString();
    }

    public static String collectStats(CharSequence charSequence) {
        StringBuilder sb = new StringBuilder(1000);
        sb.append("BOARD=");
        sb.append(Build.BOARD);
        sb.append('\n');
        sb.append("BRAND=");
        sb.append(Build.BRAND);
        sb.append('\n');
        sb.append("CPU_ABI=");
        sb.append(Build.CPU_ABI);
        sb.append('\n');
        sb.append("DEVICE=");
        sb.append(Build.DEVICE);
        sb.append('\n');
        sb.append("DISPLAY=");
        sb.append(Build.DISPLAY);
        sb.append('\n');
        sb.append("FINGERPRINT=");
        sb.append(Build.FINGERPRINT);
        sb.append('\n');
        sb.append("HOST=");
        sb.append(Build.HOST);
        sb.append('\n');
        sb.append("ID=");
        sb.append(Build.ID);
        sb.append('\n');
        sb.append("MANUFACTURER=");
        sb.append(Build.MANUFACTURER);
        sb.append('\n');
        sb.append("MODEL=");
        sb.append(Build.MODEL);
        sb.append('\n');
        sb.append("PRODUCT=");
        sb.append(Build.PRODUCT);
        sb.append('\n');
        sb.append("TAGS=");
        sb.append(Build.TAGS);
        sb.append('\n');
        sb.append("TIME=");
        sb.append(Build.TIME);
        sb.append('\n');
        sb.append("TYPE=");
        sb.append(Build.TYPE);
        sb.append('\n');
        sb.append("USER=");
        sb.append(Build.USER);
        sb.append('\n');
        sb.append("VERSION.CODENAME=");
        sb.append(Build.VERSION.CODENAME);
        sb.append('\n');
        sb.append("VERSION.INCREMENTAL=");
        sb.append(Build.VERSION.INCREMENTAL);
        sb.append('\n');
        sb.append("VERSION.RELEASE=");
        sb.append(Build.VERSION.RELEASE);
        sb.append('\n');
        sb.append("VERSION.SDK_INT=");
        sb.append(Build.VERSION.SDK_INT);
        sb.append('\n');
        if (charSequence != null) {
            String[] split = SEMICOLON.split(charSequence);
            Arrays.sort(split);
            for (String str : split) {
                sb.append(str);
                sb.append('\n');
            }
        }
        return sb.toString();
    }

    public static void setBestPreviewFPS(Camera.Parameters parameters, int i8, int i9) {
        int[] iArr;
        List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
        b5.b.d("Supported FPS ranges: " + toString((Collection<int[]>) supportedPreviewFpsRange));
        if (supportedPreviewFpsRange == null || supportedPreviewFpsRange.isEmpty()) {
            return;
        }
        Iterator<int[]> it = supportedPreviewFpsRange.iterator();
        while (true) {
            if (!it.hasNext()) {
                iArr = null;
                break;
            }
            iArr = it.next();
            int i10 = iArr[0];
            int i11 = iArr[1];
            if (i10 >= i8 * 1000 && i11 <= i9 * 1000) {
                break;
            }
        }
        if (iArr == null) {
            b5.b.d("No suitable FPS range?");
            return;
        }
        int[] iArr2 = new int[2];
        parameters.getPreviewFpsRange(iArr2);
        if (Arrays.equals(iArr2, iArr)) {
            b5.b.d("FPS range already set to " + Arrays.toString(iArr));
            return;
        }
        b5.b.d("Setting FPS range to " + Arrays.toString(iArr));
        parameters.setPreviewFpsRange(iArr[0], iArr[1]);
    }

    private static String toString(Iterable<Camera.Area> iterable) {
        if (iterable == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (Camera.Area area : iterable) {
            sb.append(area.rect);
            sb.append(':');
            sb.append(area.weight);
            sb.append(' ');
        }
        return sb.toString();
    }
}
