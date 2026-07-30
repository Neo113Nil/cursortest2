package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.android.installreferrer.api.InstallReferrerClient;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import p000createpolar.PolarVoyageBroadcastDragonShadowRogue6783;
import p000createpolar.PolarVoyageCamera2MasterPulse1881;
import p000createpolar.PolarVoyageDigitalInkRecognitionCelestialPixel7898;
import p000createpolar.PolarVoyageHandlerDragonInferno8931;
import p000createpolar.PolarVoyageObjectDetectionCosmosDragonNebula8799;
import p000createpolar.PolarVoyageR8UltraEliteBeta8736;
import p000createpolar.PolarVoyageValueAnimatorEclipseInfernoSolar2543;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {
    public static final PorterDuff.Mode PolarVoyageBottomSheetOmegaNeo1907 = PorterDuff.Mode.SRC_IN;
    public Object PolarVoyageMotionLayoutTransitionHeroVision4068;
    public String PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public int PolarVoyageZipVortexCelestial6185;
    public byte[] PolarVoyageKotlinBetaPulseBeta3653 = null;
    public Parcelable PolarVoyageBarcodeScannerInfernoSolarSpark7767 = null;
    public int PolarVoyageBitmapVisionAuroraPixel4705 = 0;
    public int PolarVoyageDiffUtilTurboStrike5735 = 0;
    public ColorStateList PolarVoyageTextInputEditTextNebulaHero6651 = null;
    public PorterDuff.Mode PolarVoyageItemDecorationUltraDeltaEpic7485 = PolarVoyageBottomSheetOmegaNeo1907;
    public String PolarVoyageStrictModeLegendEpic1532 = null;

    public IconCompat(int i) {
        this.PolarVoyageZipVortexCelestial6185 = i;
    }

    public static IconCompat PolarVoyageMotionLayoutTransitionHeroVision4068(int i) {
        if (i == 0) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageViewRogueMaster4778("Drawable resource ID must not be 0");
            return null;
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.PolarVoyageBitmapVisionAuroraPixel4705 = i;
        iconCompat.PolarVoyageMotionLayoutTransitionHeroVision4068 = "";
        iconCompat.PolarVoyageRotateAnimationCyberCelestialDelta4768 = "";
        return iconCompat;
    }

    public static Bitmap PolarVoyageZipVortexCelestial6185(Bitmap bitmap, boolean z) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f = min;
        float f2 = 0.5f * f;
        float f3 = 0.9166667f * f2;
        if (z) {
            float f4 = 0.010416667f * f;
            paint.setColor(0);
            paint.setShadowLayer(f4, 0.0f, f * 0.020833334f, 1023410176);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.setShadowLayer(f4, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2.0f, (-(bitmap.getHeight() - min)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f2, f2, f3, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    public final int PolarVoyageBarcodeScannerInfernoSolarSpark7767() {
        int i = this.PolarVoyageZipVortexCelestial6185;
        if (i != -1) {
            return i;
        }
        Object obj = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        if (Build.VERSION.SDK_INT >= 28) {
            return PolarVoyageValueAnimatorEclipseInfernoSolar2543.PolarVoyageStrictModeLegendEpic1532(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e);
            return -1;
        } catch (NoSuchMethodException e2) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e2);
            return -1;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e3);
            return -1;
        }
    }

    public final Uri PolarVoyageBitmapVisionAuroraPixel4705() {
        int i = this.PolarVoyageZipVortexCelestial6185;
        if (i != -1) {
            if (i == 4 || i == 6) {
                return Uri.parse((String) this.PolarVoyageMotionLayoutTransitionHeroVision4068);
            }
            PolarVoyageR8UltraEliteBeta8736.PolarVoyageBitmapMaxTitanTitan7960(this, "called getUri() on ");
            return null;
        }
        Object obj = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        if (Build.VERSION.SDK_INT >= 28) {
            return PolarVoyageValueAnimatorEclipseInfernoSolar2543.PolarVoyageRotateAnimationCyberCelestialDelta4768(obj);
        }
        try {
            return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon uri", e);
            return null;
        } catch (NoSuchMethodException e2) {
            Log.e("IconCompat", "Unable to get icon uri", e2);
            return null;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon uri", e3);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Icon PolarVoyageDiffUtilTurboStrike5735(Context context) {
        Icon createWithBitmap;
        InputStream openInputStream;
        int i = this.PolarVoyageZipVortexCelestial6185;
        String str = null;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                return (Icon) this.PolarVoyageMotionLayoutTransitionHeroVision4068;
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
            default:
                PolarVoyageCamera2MasterPulse1881.PolarVoyageViewRogueMaster4778("Unknown type");
                return null;
            case 1:
                createWithBitmap = Icon.createWithBitmap((Bitmap) this.PolarVoyageMotionLayoutTransitionHeroVision4068);
                break;
            case 2:
                if (i == -1) {
                    Object obj = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
                    if (Build.VERSION.SDK_INT >= 28) {
                        str = PolarVoyageValueAnimatorEclipseInfernoSolar2543.PolarVoyageBarcodeScannerInfernoSolarSpark7767(obj);
                    } else {
                        try {
                            str = (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
                        } catch (IllegalAccessException e) {
                            Log.e("IconCompat", "Unable to get icon package", e);
                        } catch (NoSuchMethodException e2) {
                            Log.e("IconCompat", "Unable to get icon package", e2);
                        } catch (InvocationTargetException e3) {
                            Log.e("IconCompat", "Unable to get icon package", e3);
                        }
                    }
                } else {
                    if (i != 2) {
                        PolarVoyageR8UltraEliteBeta8736.PolarVoyageBitmapMaxTitanTitan7960(this, "called getResPackage() on ");
                        return null;
                    }
                    String str2 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                    str = (str2 == null || TextUtils.isEmpty(str2)) ? ((String) this.PolarVoyageMotionLayoutTransitionHeroVision4068).split(":", -1)[0] : this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                }
                createWithBitmap = Icon.createWithResource(str, this.PolarVoyageBitmapVisionAuroraPixel4705);
                break;
            case 3:
                createWithBitmap = Icon.createWithData((byte[]) this.PolarVoyageMotionLayoutTransitionHeroVision4068, this.PolarVoyageBitmapVisionAuroraPixel4705, this.PolarVoyageDiffUtilTurboStrike5735);
                break;
            case 4:
                createWithBitmap = Icon.createWithContentUri((String) this.PolarVoyageMotionLayoutTransitionHeroVision4068);
                break;
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_FIELD_NUMBER /* 5 */:
                int i2 = Build.VERSION.SDK_INT;
                Object obj2 = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
                if (i2 < 26) {
                    createWithBitmap = Icon.createWithBitmap(PolarVoyageZipVortexCelestial6185((Bitmap) obj2, false));
                    break;
                } else {
                    createWithBitmap = PolarVoyageHandlerDragonInferno8931.PolarVoyageKotlinBetaPulseBeta3653((Bitmap) obj2);
                    break;
                }
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_SET_FIELD_NUMBER /* 6 */:
                if (Build.VERSION.SDK_INT >= 30) {
                    createWithBitmap = PolarVoyageObjectDetectionCosmosDragonNebula8799.PolarVoyageZipVortexCelestial6185(PolarVoyageBitmapVisionAuroraPixel4705());
                    break;
                } else {
                    if (context == null) {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + PolarVoyageBitmapVisionAuroraPixel4705());
                    }
                    Uri PolarVoyageBitmapVisionAuroraPixel4705 = PolarVoyageBitmapVisionAuroraPixel4705();
                    String scheme = PolarVoyageBitmapVisionAuroraPixel4705.getScheme();
                    if ("content".equals(scheme) || "file".equals(scheme)) {
                        try {
                            openInputStream = context.getContentResolver().openInputStream(PolarVoyageBitmapVisionAuroraPixel4705);
                        } catch (Exception e4) {
                            Log.w("IconCompat", "Unable to load image from URI: " + PolarVoyageBitmapVisionAuroraPixel4705, e4);
                            openInputStream = null;
                            if (openInputStream == null) {
                            }
                        }
                    } else {
                        try {
                            openInputStream = new FileInputStream(new File((String) this.PolarVoyageMotionLayoutTransitionHeroVision4068));
                        } catch (FileNotFoundException e5) {
                            Log.w("IconCompat", "Unable to load image from path: " + PolarVoyageBitmapVisionAuroraPixel4705, e5);
                            openInputStream = null;
                            if (openInputStream == null) {
                            }
                        }
                    }
                    if (openInputStream == null) {
                        PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageContentProviderHyperSpark3838(PolarVoyageBitmapVisionAuroraPixel4705(), "Cannot load adaptive icon from uri: ");
                        return null;
                    }
                    if (Build.VERSION.SDK_INT < 26) {
                        createWithBitmap = Icon.createWithBitmap(PolarVoyageZipVortexCelestial6185(BitmapFactory.decodeStream(openInputStream), false));
                        break;
                    } else {
                        createWithBitmap = PolarVoyageHandlerDragonInferno8931.PolarVoyageKotlinBetaPulseBeta3653(BitmapFactory.decodeStream(openInputStream));
                        break;
                    }
                }
        }
        ColorStateList colorStateList = this.PolarVoyageTextInputEditTextNebulaHero6651;
        if (colorStateList != null) {
            createWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        if (mode != PolarVoyageBottomSheetOmegaNeo1907) {
            createWithBitmap.setTintMode(mode);
        }
        return createWithBitmap;
    }

    public final int PolarVoyageKotlinBetaPulseBeta3653() {
        int i = this.PolarVoyageZipVortexCelestial6185;
        if (i != -1) {
            if (i == 2) {
                return this.PolarVoyageBitmapVisionAuroraPixel4705;
            }
            PolarVoyageR8UltraEliteBeta8736.PolarVoyageBitmapMaxTitanTitan7960(this, "called getResId() on ");
            return 0;
        }
        Object obj = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        if (Build.VERSION.SDK_INT >= 28) {
            return PolarVoyageValueAnimatorEclipseInfernoSolar2543.PolarVoyageKotlinBetaPulseBeta3653(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon resource", e);
            return 0;
        } catch (NoSuchMethodException e2) {
            Log.e("IconCompat", "Unable to get icon resource", e2);
            return 0;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon resource", e3);
            return 0;
        }
    }

    public final String toString() {
        String str;
        if (this.PolarVoyageZipVortexCelestial6185 == -1) {
            return String.valueOf(this.PolarVoyageMotionLayoutTransitionHeroVision4068);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.PolarVoyageZipVortexCelestial6185) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_FIELD_NUMBER /* 5 */:
                str = "BITMAP_MASKABLE";
                break;
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.PolarVoyageZipVortexCelestial6185) {
            case 1:
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_FIELD_NUMBER /* 5 */:
                sb.append(" size=");
                sb.append(((Bitmap) this.PolarVoyageMotionLayoutTransitionHeroVision4068).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.PolarVoyageMotionLayoutTransitionHeroVision4068).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.PolarVoyageRotateAnimationCyberCelestialDelta4768);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(PolarVoyageKotlinBetaPulseBeta3653())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.PolarVoyageBitmapVisionAuroraPixel4705);
                if (this.PolarVoyageDiffUtilTurboStrike5735 != 0) {
                    sb.append(" off=");
                    sb.append(this.PolarVoyageDiffUtilTurboStrike5735);
                    break;
                }
                break;
            case 4:
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_SET_FIELD_NUMBER /* 6 */:
                sb.append(" uri=");
                sb.append(this.PolarVoyageMotionLayoutTransitionHeroVision4068);
                break;
        }
        if (this.PolarVoyageTextInputEditTextNebulaHero6651 != null) {
            sb.append(" tint=");
            sb.append(this.PolarVoyageTextInputEditTextNebulaHero6651);
        }
        if (this.PolarVoyageItemDecorationUltraDeltaEpic7485 != PolarVoyageBottomSheetOmegaNeo1907) {
            sb.append(" mode=");
            sb.append(this.PolarVoyageItemDecorationUltraDeltaEpic7485);
        }
        sb.append(")");
        return sb.toString();
    }
}
