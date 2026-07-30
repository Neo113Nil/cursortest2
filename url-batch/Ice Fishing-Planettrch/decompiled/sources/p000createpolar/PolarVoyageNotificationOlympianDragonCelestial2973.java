package p000createpolar;

import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageNotificationOlympianDragonCelestial2973 {
    public static final byte[] PolarVoyageActivityInfoBetaQuantum8726;
    public static final Set PolarVoyageAlarmManagerShadowHyperBeta8339;
    public static final byte[] PolarVoyageAlertDialogCyberHeroQuantum3938;
    public static final byte[] PolarVoyageAnimatorSetSparkUltraMax8233;
    public static final byte[] PolarVoyageBitmapMaxTitanTitan7960;
    public static final boolean PolarVoyageCameraPixelBlaze2629 = Log.isLoggable("ExifInterface", 3);
    public static final byte[] PolarVoyageCameraViewSpectraMaxSpectra2824;
    public static final byte[] PolarVoyageCanvasElitePhoenix4750;
    public static final PolarVoyageMaterialCardViewNeoMaster7211[][] PolarVoyageCardViewAlphaVortexCelestial9747;
    public static final Charset PolarVoyageConfigurationMaxSpectraForce5418;
    public static final byte[] PolarVoyageContentProviderHyperSpark3838;
    public static final int[] PolarVoyageDiffUtilDragonSpeedEclipse6225;
    public static final byte[] PolarVoyageDisplayMetricsVortexDragon9516;
    public static final int[] PolarVoyageDrawableDeltaHyperion5742;
    public static final byte[] PolarVoyageFCMCelestialCosmosPixel3711;
    public static final HashMap[] PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149;
    public static final PolarVoyageMaterialCardViewNeoMaster7211[] PolarVoyageFlingGestureEclipsePrimeMax1376;
    public static final HashMap PolarVoyageGuidelineStormSolar2850;
    public static final byte[] PolarVoyageLayerDrawableShadowTitaniumOmega1942;
    public static final byte[] PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803;
    public static final String[] PolarVoyageLifecycleOlympianOmega3762;
    public static final byte[] PolarVoyageLooperThreadAlphaPrime1279;
    public static final byte[] PolarVoyageMotionLayoutForceEpicAurora7183;
    public static final byte[] PolarVoyageNavigationViewHyperHyperHyperion1793;
    public static final byte[] PolarVoyagePackageManagerCelestialPhoenix8393;
    public static final byte[] PolarVoyageRemoteModelManagerOlympianCelestial9141;
    public static final int[] PolarVoyageSnackbarGammaEclipse2140;
    public static final HashMap[] PolarVoyageToolbarEclipseInfernoHero6368;
    public static final PolarVoyageMaterialCardViewNeoMaster7211 PolarVoyageViewBindingPulseHeroSpeed5705;
    public final HashMap[] PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public final HashSet PolarVoyageBitmapVisionAuroraPixel4705;
    public int PolarVoyageBottomSheetOmegaNeo1907;
    public ByteOrder PolarVoyageDiffUtilTurboStrike5735;
    public int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public int PolarVoyageKotlinBetaPulseBeta3653;
    public final AssetManager.AssetInputStream PolarVoyageMotionLayoutTransitionHeroVision4068;
    public int PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public int PolarVoyageStrictModeLegendEpic1532;
    public boolean PolarVoyageTextInputEditTextNebulaHero6651;
    public PolarVoyageSQLiteVortexPulsePrime3106 PolarVoyageViewRogueMaster4778;
    public final FileDescriptor PolarVoyageZipVortexCelestial6185;

    static {
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        PolarVoyageDrawableDeltaHyperion5742 = new int[]{8, 8, 8};
        PolarVoyageSnackbarGammaEclipse2140 = new int[]{8};
        PolarVoyageContentProviderHyperSpark3838 = new byte[]{-1, -40, -1};
        PolarVoyageRemoteModelManagerOlympianCelestial9141 = new byte[]{102, 116, 121, 112};
        PolarVoyageNavigationViewHyperHyperHyperion1793 = new byte[]{109, 105, 102, 49};
        PolarVoyageAnimatorSetSparkUltraMax8233 = new byte[]{104, 101, 105, 99};
        PolarVoyageBitmapMaxTitanTitan7960 = new byte[]{97, 118, 105, 102};
        PolarVoyageDisplayMetricsVortexDragon9516 = new byte[]{97, 118, 105, 115};
        PolarVoyageLayerDrawableShadowTitaniumOmega1942 = new byte[]{79, 76, 89, 77, 80, 0};
        PolarVoyageMotionLayoutForceEpicAurora7183 = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        PolarVoyageAlertDialogCyberHeroQuantum3938 = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
        PolarVoyageCameraViewSpectraMaxSpectra2824 = "XML:com.adobe.xmp\u0000\u0000\u0000\u0000\u0000".getBytes(StandardCharsets.UTF_8);
        PolarVoyagePackageManagerCelestialPhoenix8393 = new byte[]{82, 73, 70, 70};
        PolarVoyageLooperThreadAlphaPrime1279 = new byte[]{87, 69, 66, 80};
        PolarVoyageActivityInfoBetaQuantum8726 = new byte[]{69, 88, 73, 70};
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        PolarVoyageLifecycleOlympianOmega3762 = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        PolarVoyageDiffUtilDragonSpeedEclipse6225 = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        PolarVoyageFCMCelestialCosmosPixel3711 = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        PolarVoyageMaterialCardViewNeoMaster7211[] polarVoyageMaterialCardViewNeoMaster7211Arr = {new PolarVoyageMaterialCardViewNeoMaster7211("NewSubfileType", 254, 4), new PolarVoyageMaterialCardViewNeoMaster7211("SubfileType", 255, 4), new PolarVoyageMaterialCardViewNeoMaster7211("ImageWidth", 256, 3, 4), new PolarVoyageMaterialCardViewNeoMaster7211("ImageLength", 257, 3, 4), new PolarVoyageMaterialCardViewNeoMaster7211("BitsPerSample", 258, 3), new PolarVoyageMaterialCardViewNeoMaster7211("Compression", 259, 3), new PolarVoyageMaterialCardViewNeoMaster7211("PhotometricInterpretation", 262, 3), new PolarVoyageMaterialCardViewNeoMaster7211("ImageDescription", 270, 2), new PolarVoyageMaterialCardViewNeoMaster7211("Make", 271, 2), new PolarVoyageMaterialCardViewNeoMaster7211("Model", 272, 2), new PolarVoyageMaterialCardViewNeoMaster7211("StripOffsets", 273, 3, 4), new PolarVoyageMaterialCardViewNeoMaster7211("Orientation", 274, 3), new PolarVoyageMaterialCardViewNeoMaster7211("SamplesPerPixel", 277, 3), new PolarVoyageMaterialCardViewNeoMaster7211("RowsPerStrip", 278, 3, 4), new PolarVoyageMaterialCardViewNeoMaster7211("StripByteCounts", 279, 3, 4), new PolarVoyageMaterialCardViewNeoMaster7211("XResolution", 282, 5), new PolarVoyageMaterialCardViewNeoMaster7211("YResolution", 283, 5), new PolarVoyageMaterialCardViewNeoMaster7211("PlanarConfiguration", 284, 3), new PolarVoyageMaterialCardViewNeoMaster7211("ResolutionUnit", 296, 3), new PolarVoyageMaterialCardViewNeoMaster7211("TransferFunction", 301, 3), new PolarVoyageMaterialCardViewNeoMaster7211("Software", 305, 2), new PolarVoyageMaterialCardViewNeoMaster7211("DateTime", 306, 2), new PolarVoyageMaterialCardViewNeoMaster7211("Artist", 315, 2), new PolarVoyageMaterialCardViewNeoMaster7211("WhitePoint", 318, 5), new PolarVoyageMaterialCardViewNeoMaster7211("PrimaryChromaticities", 319, 5), new PolarVoyageMaterialCardViewNeoMaster7211("SubIFDPointer", 330, 4), new PolarVoyageMaterialCardViewNeoMaster7211("JPEGInterchangeFormat", 513, 4), new PolarVoyageMaterialCardViewNeoMaster7211("JPEGInterchangeFormatLength", 514, 4), new PolarVoyageMaterialCardViewNeoMaster7211("YCbCrCoefficients", 529, 5), new PolarVoyageMaterialCardViewNeoMaster7211("YCbCrSubSampling", 530, 3), new PolarVoyageMaterialCardViewNeoMaster7211("YCbCrPositioning", 531, 3), new PolarVoyageMaterialCardViewNeoMaster7211("ReferenceBlackWhite", 532, 5), new PolarVoyageMaterialCardViewNeoMaster7211("Copyright", 33432, 2), new PolarVoyageMaterialCardViewNeoMaster7211("ExifIFDPointer", 34665, 4), new PolarVoyageMaterialCardViewNeoMaster7211("GPSInfoIFDPointer", 34853, 4), new PolarVoyageMaterialCardViewNeoMaster7211("SensorTopBorder", 4, 4), new PolarVoyageMaterialCardViewNeoMaster7211("SensorLeftBorder", 5, 4), new PolarVoyageMaterialCardViewNeoMaster7211("SensorBottomBorder", 6, 4), new PolarVoyageMaterialCardViewNeoMaster7211("SensorRightBorder", 7, 4), new PolarVoyageMaterialCardViewNeoMaster7211("ISO", 23, 3), new PolarVoyageMaterialCardViewNeoMaster7211("JpgFromRaw", 46, 7), new PolarVoyageMaterialCardViewNeoMaster7211("Xmp", 700, 1)};
        PolarVoyageMaterialCardViewNeoMaster7211[] polarVoyageMaterialCardViewNeoMaster7211Arr2 = {new PolarVoyageMaterialCardViewNeoMaster7211("ExposureTime", 33434, 5), new PolarVoyageMaterialCardViewNeoMaster7211("FNumber", 33437, 5), new PolarVoyageMaterialCardViewNeoMaster7211("ExposureProgram", 34850, 3), new PolarVoyageMaterialCardViewNeoMaster7211("SpectralSensitivity", 34852, 2), new PolarVoyageMaterialCardViewNeoMaster7211("PhotographicSensitivity", 34855, 3), new PolarVoyageMaterialCardViewNeoMaster7211("OECF", 34856, 7), new PolarVoyageMaterialCardViewNeoMaster7211("SensitivityType", 34864, 3), new PolarVoyageMaterialCardViewNeoMaster7211("StandardOutputSensitivity", 34865, 4), new PolarVoyageMaterialCardViewNeoMaster7211("RecommendedExposureIndex", 34866, 4), new PolarVoyageMaterialCardViewNeoMaster7211("ISOSpeed", 34867, 4), new PolarVoyageMaterialCardViewNeoMaster7211("ISOSpeedLatitudeyyy", 34868, 4), new PolarVoyageMaterialCardViewNeoMaster7211("ISOSpeedLatitudezzz", 34869, 4), new PolarVoyageMaterialCardViewNeoMaster7211("ExifVersion", 36864, 2), new PolarVoyageMaterialCardViewNeoMaster7211("DateTimeOriginal", 36867, 2), new PolarVoyageMaterialCardViewNeoMaster7211("DateTimeDigitized", 36868, 2), new PolarVoyageMaterialCardViewNeoMaster7211("OffsetTime", 36880, 2), new PolarVoyageMaterialCardViewNeoMaster7211("OffsetTimeOriginal", 36881, 2), new PolarVoyageMaterialCardViewNeoMaster7211("OffsetTimeDigitized", 36882, 2), new PolarVoyageMaterialCardViewNeoMaster7211("ComponentsConfiguration", 37121, 7), new PolarVoyageMaterialCardViewNeoMaster7211("CompressedBitsPerPixel", 37122, 5), new PolarVoyageMaterialCardViewNeoMaster7211("ShutterSpeedValue", 37377, 10), new PolarVoyageMaterialCardViewNeoMaster7211("ApertureValue", 37378, 5), new PolarVoyageMaterialCardViewNeoMaster7211("BrightnessValue", 37379, 10), new PolarVoyageMaterialCardViewNeoMaster7211("ExposureBiasValue", 37380, 10), new PolarVoyageMaterialCardViewNeoMaster7211("MaxApertureValue", 37381, 5), new PolarVoyageMaterialCardViewNeoMaster7211("SubjectDistance", 37382, 5), new PolarVoyageMaterialCardViewNeoMaster7211("MeteringMode", 37383, 3), new PolarVoyageMaterialCardViewNeoMaster7211("LightSource", 37384, 3), new PolarVoyageMaterialCardViewNeoMaster7211("Flash", 37385, 3), new PolarVoyageMaterialCardViewNeoMaster7211("FocalLength", 37386, 5), new PolarVoyageMaterialCardViewNeoMaster7211("SubjectArea", 37396, 3), new PolarVoyageMaterialCardViewNeoMaster7211("MakerNote", 37500, 7), new PolarVoyageMaterialCardViewNeoMaster7211("UserComment", 37510, 7), new PolarVoyageMaterialCardViewNeoMaster7211("SubSecTime", 37520, 2), new PolarVoyageMaterialCardViewNeoMaster7211("SubSecTimeOriginal", 37521, 2), new PolarVoyageMaterialCardViewNeoMaster7211("SubSecTimeDigitized", 37522, 2), new PolarVoyageMaterialCardViewNeoMaster7211("FlashpixVersion", 40960, 7), new PolarVoyageMaterialCardViewNeoMaster7211("ColorSpace", 40961, 3), new PolarVoyageMaterialCardViewNeoMaster7211("PixelXDimension", 40962, 3, 4), new PolarVoyageMaterialCardViewNeoMaster7211("PixelYDimension", 40963, 3, 4), new PolarVoyageMaterialCardViewNeoMaster7211("RelatedSoundFile", 40964, 2), new PolarVoyageMaterialCardViewNeoMaster7211("InteroperabilityIFDPointer", 40965, 4), new PolarVoyageMaterialCardViewNeoMaster7211("FlashEnergy", 41483, 5), new PolarVoyageMaterialCardViewNeoMaster7211("SpatialFrequencyResponse", 41484, 7), new PolarVoyageMaterialCardViewNeoMaster7211("FocalPlaneXResolution", 41486, 5), new PolarVoyageMaterialCardViewNeoMaster7211("FocalPlaneYResolution", 41487, 5), new PolarVoyageMaterialCardViewNeoMaster7211("FocalPlaneResolutionUnit", 41488, 3), new PolarVoyageMaterialCardViewNeoMaster7211("SubjectLocation", 41492, 3), new PolarVoyageMaterialCardViewNeoMaster7211("ExposureIndex", 41493, 5), new PolarVoyageMaterialCardViewNeoMaster7211("SensingMethod", 41495, 3), new PolarVoyageMaterialCardViewNeoMaster7211("FileSource", 41728, 7), new PolarVoyageMaterialCardViewNeoMaster7211("SceneType", 41729, 7), new PolarVoyageMaterialCardViewNeoMaster7211("CFAPattern", 41730, 7), new PolarVoyageMaterialCardViewNeoMaster7211("CustomRendered", 41985, 3), new PolarVoyageMaterialCardViewNeoMaster7211("ExposureMode", 41986, 3), new PolarVoyageMaterialCardViewNeoMaster7211("WhiteBalance", 41987, 3), new PolarVoyageMaterialCardViewNeoMaster7211("DigitalZoomRatio", 41988, 5), new PolarVoyageMaterialCardViewNeoMaster7211("FocalLengthIn35mmFilm", 41989, 3), new PolarVoyageMaterialCardViewNeoMaster7211("SceneCaptureType", 41990, 3), new PolarVoyageMaterialCardViewNeoMaster7211("GainControl", 41991, 3), new PolarVoyageMaterialCardViewNeoMaster7211("Contrast", 41992, 3), new PolarVoyageMaterialCardViewNeoMaster7211("Saturation", 41993, 3), new PolarVoyageMaterialCardViewNeoMaster7211("Sharpness", 41994, 3), new PolarVoyageMaterialCardViewNeoMaster7211("DeviceSettingDescription", 41995, 7), new PolarVoyageMaterialCardViewNeoMaster7211("SubjectDistanceRange", 41996, 3), new PolarVoyageMaterialCardViewNeoMaster7211("ImageUniqueID", 42016, 2), new PolarVoyageMaterialCardViewNeoMaster7211("CameraOwnerName", 42032, 2), new PolarVoyageMaterialCardViewNeoMaster7211("BodySerialNumber", 42033, 2), new PolarVoyageMaterialCardViewNeoMaster7211("LensSpecification", 42034, 5), new PolarVoyageMaterialCardViewNeoMaster7211("LensMake", 42035, 2), new PolarVoyageMaterialCardViewNeoMaster7211("LensModel", 42036, 2), new PolarVoyageMaterialCardViewNeoMaster7211("Gamma", 42240, 5), new PolarVoyageMaterialCardViewNeoMaster7211("DNGVersion", 50706, 1), new PolarVoyageMaterialCardViewNeoMaster7211("DefaultCropSize", 50720, 3, 4)};
        PolarVoyageMaterialCardViewNeoMaster7211[] polarVoyageMaterialCardViewNeoMaster7211Arr3 = {new PolarVoyageMaterialCardViewNeoMaster7211("GPSVersionID", 0, 1), new PolarVoyageMaterialCardViewNeoMaster7211("GPSLatitudeRef", 1, 2), new PolarVoyageMaterialCardViewNeoMaster7211("GPSLatitude", 2, 5, 10), new PolarVoyageMaterialCardViewNeoMaster7211("GPSLongitudeRef", 3, 2), new PolarVoyageMaterialCardViewNeoMaster7211("GPSLongitude", 4, 5, 10), new PolarVoyageMaterialCardViewNeoMaster7211("GPSAltitudeRef", 5, 1), new PolarVoyageMaterialCardViewNeoMaster7211("GPSAltitude", 6, 5), new PolarVoyageMaterialCardViewNeoMaster7211("GPSTimeStamp", 7, 5), new PolarVoyageMaterialCardViewNeoMaster7211("GPSSatellites", 8, 2), new PolarVoyageMaterialCardViewNeoMaster7211("GPSStatus", 9, 2), new PolarVoyageMaterialCardViewNeoMaster7211("GPSMeasureMode", 10, 2), new PolarVoyageMaterialCardViewNeoMaster7211("GPSDOP", 11, 5), new PolarVoyageMaterialCardViewNeoMaster7211("GPSSpeedRef", 12, 2), new PolarVoyageMaterialCardViewNeoMaster7211("GPSSpeed", 13, 5), new PolarVoyageMaterialCardViewNeoMaster7211("GPSTrackRef", 14, 2), new PolarVoyageMaterialCardViewNeoMaster7211("GPSTrack", 15, 5), new PolarVoyageMaterialCardViewNeoMaster7211("GPSImgDirectionRef", 16, 2), new PolarVoyageMaterialCardViewNeoMaster7211("GPSImgDirection", 17, 5), new PolarVoyageMaterialCardViewNeoMaster7211("GPSMapDatum", 18, 2), new PolarVoyageMaterialCardViewNeoMaster7211("GPSDestLatitudeRef", 19, 2), new PolarVoyageMaterialCardViewNeoMaster7211("GPSDestLatitude", 20, 5), new PolarVoyageMaterialCardViewNeoMaster7211("GPSDestLongitudeRef", 21, 2), new PolarVoyageMaterialCardViewNeoMaster7211("GPSDestLongitude", 22, 5), new PolarVoyageMaterialCardViewNeoMaster7211("GPSDestBearingRef", 23, 2), new PolarVoyageMaterialCardViewNeoMaster7211("GPSDestBearing", 24, 5), new PolarVoyageMaterialCardViewNeoMaster7211("GPSDestDistanceRef", 25, 2), new PolarVoyageMaterialCardViewNeoMaster7211("GPSDestDistance", 26, 5), new PolarVoyageMaterialCardViewNeoMaster7211("GPSProcessingMethod", 27, 7), new PolarVoyageMaterialCardViewNeoMaster7211("GPSAreaInformation", 28, 7), new PolarVoyageMaterialCardViewNeoMaster7211("GPSDateStamp", 29, 2), new PolarVoyageMaterialCardViewNeoMaster7211("GPSDifferential", 30, 3), new PolarVoyageMaterialCardViewNeoMaster7211("GPSHPositioningError", 31, 5)};
        PolarVoyageMaterialCardViewNeoMaster7211[] polarVoyageMaterialCardViewNeoMaster7211Arr4 = {new PolarVoyageMaterialCardViewNeoMaster7211("InteroperabilityIndex", 1, 2)};
        PolarVoyageMaterialCardViewNeoMaster7211[] polarVoyageMaterialCardViewNeoMaster7211Arr5 = {new PolarVoyageMaterialCardViewNeoMaster7211("NewSubfileType", 254, 4), new PolarVoyageMaterialCardViewNeoMaster7211("SubfileType", 255, 4), new PolarVoyageMaterialCardViewNeoMaster7211("ThumbnailImageWidth", 256, 3, 4), new PolarVoyageMaterialCardViewNeoMaster7211("ThumbnailImageLength", 257, 3, 4), new PolarVoyageMaterialCardViewNeoMaster7211("BitsPerSample", 258, 3), new PolarVoyageMaterialCardViewNeoMaster7211("Compression", 259, 3), new PolarVoyageMaterialCardViewNeoMaster7211("PhotometricInterpretation", 262, 3), new PolarVoyageMaterialCardViewNeoMaster7211("ImageDescription", 270, 2), new PolarVoyageMaterialCardViewNeoMaster7211("Make", 271, 2), new PolarVoyageMaterialCardViewNeoMaster7211("Model", 272, 2), new PolarVoyageMaterialCardViewNeoMaster7211("StripOffsets", 273, 3, 4), new PolarVoyageMaterialCardViewNeoMaster7211("ThumbnailOrientation", 274, 3), new PolarVoyageMaterialCardViewNeoMaster7211("SamplesPerPixel", 277, 3), new PolarVoyageMaterialCardViewNeoMaster7211("RowsPerStrip", 278, 3, 4), new PolarVoyageMaterialCardViewNeoMaster7211("StripByteCounts", 279, 3, 4), new PolarVoyageMaterialCardViewNeoMaster7211("XResolution", 282, 5), new PolarVoyageMaterialCardViewNeoMaster7211("YResolution", 283, 5), new PolarVoyageMaterialCardViewNeoMaster7211("PlanarConfiguration", 284, 3), new PolarVoyageMaterialCardViewNeoMaster7211("ResolutionUnit", 296, 3), new PolarVoyageMaterialCardViewNeoMaster7211("TransferFunction", 301, 3), new PolarVoyageMaterialCardViewNeoMaster7211("Software", 305, 2), new PolarVoyageMaterialCardViewNeoMaster7211("DateTime", 306, 2), new PolarVoyageMaterialCardViewNeoMaster7211("Artist", 315, 2), new PolarVoyageMaterialCardViewNeoMaster7211("WhitePoint", 318, 5), new PolarVoyageMaterialCardViewNeoMaster7211("PrimaryChromaticities", 319, 5), new PolarVoyageMaterialCardViewNeoMaster7211("SubIFDPointer", 330, 4), new PolarVoyageMaterialCardViewNeoMaster7211("JPEGInterchangeFormat", 513, 4), new PolarVoyageMaterialCardViewNeoMaster7211("JPEGInterchangeFormatLength", 514, 4), new PolarVoyageMaterialCardViewNeoMaster7211("YCbCrCoefficients", 529, 5), new PolarVoyageMaterialCardViewNeoMaster7211("YCbCrSubSampling", 530, 3), new PolarVoyageMaterialCardViewNeoMaster7211("YCbCrPositioning", 531, 3), new PolarVoyageMaterialCardViewNeoMaster7211("ReferenceBlackWhite", 532, 5), new PolarVoyageMaterialCardViewNeoMaster7211("Copyright", 33432, 2), new PolarVoyageMaterialCardViewNeoMaster7211("ExifIFDPointer", 34665, 4), new PolarVoyageMaterialCardViewNeoMaster7211("GPSInfoIFDPointer", 34853, 4), new PolarVoyageMaterialCardViewNeoMaster7211("DNGVersion", 50706, 1), new PolarVoyageMaterialCardViewNeoMaster7211("DefaultCropSize", 50720, 3, 4)};
        PolarVoyageViewBindingPulseHeroSpeed5705 = new PolarVoyageMaterialCardViewNeoMaster7211("StripOffsets", 273, 3);
        PolarVoyageCardViewAlphaVortexCelestial9747 = new PolarVoyageMaterialCardViewNeoMaster7211[][]{polarVoyageMaterialCardViewNeoMaster7211Arr, polarVoyageMaterialCardViewNeoMaster7211Arr2, polarVoyageMaterialCardViewNeoMaster7211Arr3, polarVoyageMaterialCardViewNeoMaster7211Arr4, polarVoyageMaterialCardViewNeoMaster7211Arr5, polarVoyageMaterialCardViewNeoMaster7211Arr, new PolarVoyageMaterialCardViewNeoMaster7211[]{new PolarVoyageMaterialCardViewNeoMaster7211("ThumbnailImage", 256, 7), new PolarVoyageMaterialCardViewNeoMaster7211("CameraSettingsIFDPointer", 8224, 4), new PolarVoyageMaterialCardViewNeoMaster7211("ImageProcessingIFDPointer", 8256, 4)}, new PolarVoyageMaterialCardViewNeoMaster7211[]{new PolarVoyageMaterialCardViewNeoMaster7211("PreviewImageStart", 257, 4), new PolarVoyageMaterialCardViewNeoMaster7211("PreviewImageLength", 258, 4)}, new PolarVoyageMaterialCardViewNeoMaster7211[]{new PolarVoyageMaterialCardViewNeoMaster7211("AspectFrame", 4371, 3)}, new PolarVoyageMaterialCardViewNeoMaster7211[]{new PolarVoyageMaterialCardViewNeoMaster7211("ColorSpace", 55, 3)}};
        PolarVoyageFlingGestureEclipsePrimeMax1376 = new PolarVoyageMaterialCardViewNeoMaster7211[]{new PolarVoyageMaterialCardViewNeoMaster7211("SubIFDPointer", 330, 4), new PolarVoyageMaterialCardViewNeoMaster7211("ExifIFDPointer", 34665, 4), new PolarVoyageMaterialCardViewNeoMaster7211("GPSInfoIFDPointer", 34853, 4), new PolarVoyageMaterialCardViewNeoMaster7211("InteroperabilityIFDPointer", 40965, 4), new PolarVoyageMaterialCardViewNeoMaster7211("CameraSettingsIFDPointer", 8224, 1), new PolarVoyageMaterialCardViewNeoMaster7211("ImageProcessingIFDPointer", 8256, 1)};
        PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149 = new HashMap[10];
        PolarVoyageToolbarEclipseInfernoHero6368 = new HashMap[10];
        PolarVoyageAlarmManagerShadowHyperBeta8339 = Collections.unmodifiableSet(new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance")));
        PolarVoyageGuidelineStormSolar2850 = new HashMap();
        Charset forName = Charset.forName("US-ASCII");
        PolarVoyageConfigurationMaxSpectraForce5418 = forName;
        PolarVoyageCanvasElitePhoenix4750 = "Exif\u0000\u0000".getBytes(forName);
        PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            PolarVoyageMaterialCardViewNeoMaster7211[][] polarVoyageMaterialCardViewNeoMaster7211Arr6 = PolarVoyageCardViewAlphaVortexCelestial9747;
            if (i >= polarVoyageMaterialCardViewNeoMaster7211Arr6.length) {
                HashMap hashMap = PolarVoyageGuidelineStormSolar2850;
                PolarVoyageMaterialCardViewNeoMaster7211[] polarVoyageMaterialCardViewNeoMaster7211Arr7 = PolarVoyageFlingGestureEclipsePrimeMax1376;
                hashMap.put(Integer.valueOf(polarVoyageMaterialCardViewNeoMaster7211Arr7[0].PolarVoyageZipVortexCelestial6185), 5);
                hashMap.put(Integer.valueOf(polarVoyageMaterialCardViewNeoMaster7211Arr7[1].PolarVoyageZipVortexCelestial6185), 1);
                hashMap.put(Integer.valueOf(polarVoyageMaterialCardViewNeoMaster7211Arr7[2].PolarVoyageZipVortexCelestial6185), 2);
                hashMap.put(Integer.valueOf(polarVoyageMaterialCardViewNeoMaster7211Arr7[3].PolarVoyageZipVortexCelestial6185), 3);
                hashMap.put(Integer.valueOf(polarVoyageMaterialCardViewNeoMaster7211Arr7[4].PolarVoyageZipVortexCelestial6185), 7);
                hashMap.put(Integer.valueOf(polarVoyageMaterialCardViewNeoMaster7211Arr7[5].PolarVoyageZipVortexCelestial6185), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149[i] = new HashMap();
            PolarVoyageToolbarEclipseInfernoHero6368[i] = new HashMap();
            for (PolarVoyageMaterialCardViewNeoMaster7211 polarVoyageMaterialCardViewNeoMaster7211 : polarVoyageMaterialCardViewNeoMaster7211Arr6[i]) {
                PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149[i].put(Integer.valueOf(polarVoyageMaterialCardViewNeoMaster7211.PolarVoyageZipVortexCelestial6185), polarVoyageMaterialCardViewNeoMaster7211);
                PolarVoyageToolbarEclipseInfernoHero6368[i].put(polarVoyageMaterialCardViewNeoMaster7211.PolarVoyageMotionLayoutTransitionHeroVision4068, polarVoyageMaterialCardViewNeoMaster7211);
            }
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00f2 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00dd A[Catch: all -> 0x005e, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x005e, blocks: (B:6:0x004f, B:8:0x0052, B:10:0x0067, B:16:0x0084, B:23:0x0097, B:24:0x00aa, B:33:0x009f, B:34:0x00a3, B:35:0x00a7, B:36:0x00b4, B:38:0x00bd, B:40:0x00c3, B:42:0x00c9, B:44:0x00cf, B:54:0x00dd), top: B:5:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PolarVoyageNotificationOlympianDragonCelestial2973(InputStream inputStream) {
        PolarVoyageMaterialCardViewNeoMaster7211[][] polarVoyageMaterialCardViewNeoMaster7211Arr = PolarVoyageCardViewAlphaVortexCelestial9747;
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = new HashMap[polarVoyageMaterialCardViewNeoMaster7211Arr.length];
        this.PolarVoyageBitmapVisionAuroraPixel4705 = new HashSet(polarVoyageMaterialCardViewNeoMaster7211Arr.length);
        this.PolarVoyageDiffUtilTurboStrike5735 = ByteOrder.BIG_ENDIAN;
        boolean z = inputStream instanceof AssetManager.AssetInputStream;
        boolean z2 = PolarVoyageCameraPixelBlaze2629;
        if (z) {
            this.PolarVoyageMotionLayoutTransitionHeroVision4068 = (AssetManager.AssetInputStream) inputStream;
            this.PolarVoyageZipVortexCelestial6185 = null;
        } else {
            if (inputStream instanceof FileInputStream) {
                FileInputStream fileInputStream = (FileInputStream) inputStream;
                try {
                    Os.lseek(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                    this.PolarVoyageMotionLayoutTransitionHeroVision4068 = null;
                    this.PolarVoyageZipVortexCelestial6185 = fileInputStream.getFD();
                } catch (Exception unused) {
                    if (z2) {
                        Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                    }
                }
            }
            this.PolarVoyageMotionLayoutTransitionHeroVision4068 = null;
            this.PolarVoyageZipVortexCelestial6185 = null;
        }
        for (int i = 0; i < polarVoyageMaterialCardViewNeoMaster7211Arr.length; i++) {
            try {
                try {
                    this.PolarVoyageBarcodeScannerInfernoSolarSpark7767[i] = new HashMap();
                } catch (Throwable th) {
                    PolarVoyageZipVortexCelestial6185();
                    if (z2) {
                        PolarVoyageContentProviderHyperSpark3838();
                    }
                    throw th;
                }
            } catch (IOException e) {
                e = e;
                if (z2) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file (ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                PolarVoyageZipVortexCelestial6185();
                if (!z2) {
                    return;
                }
                PolarVoyageContentProviderHyperSpark3838();
            } catch (UnsupportedOperationException e2) {
                e = e2;
                if (z2) {
                }
                PolarVoyageZipVortexCelestial6185();
                if (!z2) {
                }
                PolarVoyageContentProviderHyperSpark3838();
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
        int PolarVoyageDiffUtilTurboStrike5735 = PolarVoyageDiffUtilTurboStrike5735(bufferedInputStream);
        this.PolarVoyageKotlinBetaPulseBeta3653 = PolarVoyageDiffUtilTurboStrike5735;
        if (PolarVoyageDiffUtilTurboStrike5735 != 4 && PolarVoyageDiffUtilTurboStrike5735 != 9 && PolarVoyageDiffUtilTurboStrike5735 != 13 && PolarVoyageDiffUtilTurboStrike5735 != 14) {
            PolarVoyageDrawableCompatSpectraPhoenixStrike3679 polarVoyageDrawableCompatSpectraPhoenixStrike3679 = new PolarVoyageDrawableCompatSpectraPhoenixStrike3679(bufferedInputStream);
            int i2 = this.PolarVoyageKotlinBetaPulseBeta3653;
            if (i2 != 12 && i2 != 15) {
                if (i2 == 7) {
                    PolarVoyageTextInputEditTextNebulaHero6651(polarVoyageDrawableCompatSpectraPhoenixStrike3679);
                } else if (i2 == 10) {
                    PolarVoyageBottomSheetOmegaNeo1907(polarVoyageDrawableCompatSpectraPhoenixStrike3679);
                } else {
                    PolarVoyageRotateAnimationCyberCelestialDelta4768(polarVoyageDrawableCompatSpectraPhoenixStrike3679);
                }
                polarVoyageDrawableCompatSpectraPhoenixStrike3679.PolarVoyageBarcodeScannerInfernoSolarSpark7767(this.PolarVoyageItemDecorationUltraDeltaEpic7485);
                PolarVoyageDisplayMetricsVortexDragon9516(polarVoyageDrawableCompatSpectraPhoenixStrike3679);
                PolarVoyageZipVortexCelestial6185();
                if (!z2) {
                    return;
                }
                PolarVoyageContentProviderHyperSpark3838();
            }
            PolarVoyageBarcodeScannerInfernoSolarSpark7767(polarVoyageDrawableCompatSpectraPhoenixStrike3679, i2);
            polarVoyageDrawableCompatSpectraPhoenixStrike3679.PolarVoyageBarcodeScannerInfernoSolarSpark7767(this.PolarVoyageItemDecorationUltraDeltaEpic7485);
            PolarVoyageDisplayMetricsVortexDragon9516(polarVoyageDrawableCompatSpectraPhoenixStrike3679);
            PolarVoyageZipVortexCelestial6185();
            if (!z2) {
            }
            PolarVoyageContentProviderHyperSpark3838();
        }
        PolarVoyageZipStrikeStrike1055 polarVoyageZipStrikeStrike1055 = new PolarVoyageZipStrikeStrike1055(bufferedInputStream);
        int i3 = this.PolarVoyageKotlinBetaPulseBeta3653;
        if (i3 == 4) {
            PolarVoyageBitmapVisionAuroraPixel4705(polarVoyageZipStrikeStrike1055, 0, 0);
        } else if (i3 == 13) {
            PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyageZipStrikeStrike1055);
        } else if (i3 == 9) {
            PolarVoyageStrictModeLegendEpic1532(polarVoyageZipStrikeStrike1055);
        } else if (i3 == 14) {
            PolarVoyageViewRogueMaster4778(polarVoyageZipStrikeStrike1055);
        }
        PolarVoyageZipVortexCelestial6185();
        if (!z2) {
        }
        PolarVoyageContentProviderHyperSpark3838();
    }

    public static ByteOrder PolarVoyageRemoteModelManagerOlympianCelestial9141(PolarVoyageZipStrikeStrike1055 polarVoyageZipStrikeStrike1055) {
        short readShort = polarVoyageZipStrikeStrike1055.readShort();
        boolean z = PolarVoyageCameraPixelBlaze2629;
        if (readShort == 18761) {
            if (z) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort != 19789) {
            PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageSnackbarGammaEclipse2140(Integer.toHexString(readShort), "Invalid byte order: ");
            return null;
        }
        if (z) {
            Log.d("ExifInterface", "readExifSegment: Byte Align MM");
        }
        return ByteOrder.BIG_ENDIAN;
    }

    public final void PolarVoyageAlertDialogCyberHeroQuantum3938() {
        PolarVoyageLayerDrawableShadowTitaniumOmega1942(0, 5);
        PolarVoyageLayerDrawableShadowTitaniumOmega1942(0, 4);
        PolarVoyageLayerDrawableShadowTitaniumOmega1942(5, 4);
        HashMap[] hashMapArr = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        PolarVoyageSQLiteVortexPulsePrime3106 polarVoyageSQLiteVortexPulsePrime3106 = (PolarVoyageSQLiteVortexPulsePrime3106) hashMapArr[1].get("PixelXDimension");
        PolarVoyageSQLiteVortexPulsePrime3106 polarVoyageSQLiteVortexPulsePrime31062 = (PolarVoyageSQLiteVortexPulsePrime3106) hashMapArr[1].get("PixelYDimension");
        if (polarVoyageSQLiteVortexPulsePrime3106 != null && polarVoyageSQLiteVortexPulsePrime31062 != null) {
            hashMapArr[0].put("ImageWidth", polarVoyageSQLiteVortexPulsePrime3106);
            hashMapArr[0].put("ImageLength", polarVoyageSQLiteVortexPulsePrime31062);
        }
        if (hashMapArr[4].isEmpty() && PolarVoyageDrawableDeltaHyperion5742(hashMapArr[5])) {
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        if (!PolarVoyageDrawableDeltaHyperion5742(hashMapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        PolarVoyageBitmapMaxTitanTitan7960("ThumbnailOrientation", 0, "Orientation");
        PolarVoyageBitmapMaxTitanTitan7960("ThumbnailImageLength", 0, "ImageLength");
        PolarVoyageBitmapMaxTitanTitan7960("ThumbnailImageWidth", 0, "ImageWidth");
        PolarVoyageBitmapMaxTitanTitan7960("ThumbnailOrientation", 5, "Orientation");
        PolarVoyageBitmapMaxTitanTitan7960("ThumbnailImageLength", 5, "ImageLength");
        PolarVoyageBitmapMaxTitanTitan7960("ThumbnailImageWidth", 5, "ImageWidth");
        PolarVoyageBitmapMaxTitanTitan7960("Orientation", 4, "ThumbnailOrientation");
        PolarVoyageBitmapMaxTitanTitan7960("ImageLength", 4, "ThumbnailImageLength");
        PolarVoyageBitmapMaxTitanTitan7960("ImageWidth", 4, "ThumbnailImageWidth");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0299  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void PolarVoyageAnimatorSetSparkUltraMax8233(PolarVoyageDrawableCompatSpectraPhoenixStrike3679 polarVoyageDrawableCompatSpectraPhoenixStrike3679, int i) {
        HashMap[] hashMapArr;
        HashSet hashSet;
        boolean z;
        short s;
        HashMap[] hashMapArr2;
        long j;
        long j2;
        boolean z2;
        int i2;
        long j3;
        int i3;
        PolarVoyageMaterialCardViewNeoMaster7211 polarVoyageMaterialCardViewNeoMaster7211;
        HashSet hashSet2;
        int readUnsignedShort;
        long j4;
        int i4 = i;
        int i5 = polarVoyageDrawableCompatSpectraPhoenixStrike3679.PolarVoyageStrictModeLegendEpic1532;
        int i6 = polarVoyageDrawableCompatSpectraPhoenixStrike3679.PolarVoyageViewRogueMaster4778;
        Integer valueOf = Integer.valueOf(i5);
        HashSet hashSet3 = this.PolarVoyageBitmapVisionAuroraPixel4705;
        hashSet3.add(valueOf);
        short readShort = polarVoyageDrawableCompatSpectraPhoenixStrike3679.readShort();
        boolean z3 = PolarVoyageCameraPixelBlaze2629;
        if (z3) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + ((int) readShort));
        }
        if (readShort <= 0) {
            return;
        }
        short s2 = 0;
        while (true) {
            hashMapArr = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
            if (s2 >= readShort) {
                break;
            }
            int readUnsignedShort2 = polarVoyageDrawableCompatSpectraPhoenixStrike3679.readUnsignedShort();
            int readUnsignedShort3 = polarVoyageDrawableCompatSpectraPhoenixStrike3679.readUnsignedShort();
            int readInt = polarVoyageDrawableCompatSpectraPhoenixStrike3679.readInt();
            long j5 = polarVoyageDrawableCompatSpectraPhoenixStrike3679.PolarVoyageStrictModeLegendEpic1532 + 4;
            short s3 = readShort;
            PolarVoyageMaterialCardViewNeoMaster7211 polarVoyageMaterialCardViewNeoMaster72112 = (PolarVoyageMaterialCardViewNeoMaster7211) PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149[i4].get(Integer.valueOf(readUnsignedShort2));
            if (z3) {
                z = z3;
                s = s2;
                hashMapArr2 = hashMapArr;
                hashSet = hashSet3;
                Log.d("ExifInterface", String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i4), Integer.valueOf(readUnsignedShort2), polarVoyageMaterialCardViewNeoMaster72112 != null ? polarVoyageMaterialCardViewNeoMaster72112.PolarVoyageMotionLayoutTransitionHeroVision4068 : null, Integer.valueOf(readUnsignedShort3), Integer.valueOf(readInt)));
            } else {
                hashSet = hashSet3;
                z = z3;
                s = s2;
                hashMapArr2 = hashMapArr;
            }
            if (polarVoyageMaterialCardViewNeoMaster72112 != null) {
                if (readUnsignedShort3 > 0) {
                    if (readUnsignedShort3 < PolarVoyageDiffUtilDragonSpeedEclipse6225.length) {
                        int i7 = polarVoyageMaterialCardViewNeoMaster72112.PolarVoyageKotlinBetaPulseBeta3653;
                        if (i7 == 7 || readUnsignedShort3 == 7 || i7 == readUnsignedShort3 || (i2 = polarVoyageMaterialCardViewNeoMaster72112.PolarVoyageBarcodeScannerInfernoSolarSpark7767) == readUnsignedShort3 || (((i7 == 4 || i2 == 4) && readUnsignedShort3 == 3) || (((i7 == 9 || i2 == 9) && readUnsignedShort3 == 8) || ((i7 == 12 || i2 == 12) && readUnsignedShort3 == 11)))) {
                            if (readUnsignedShort3 == 7) {
                                readUnsignedShort3 = i7;
                            }
                            j = j5;
                            j2 = readInt * r7[readUnsignedShort3];
                            if (j2 < 0 || j2 > 2147483647L) {
                                if (z) {
                                    Log.d("ExifInterface", "Skip the tag entry since the number of components is invalid: " + readInt);
                                }
                                z2 = false;
                                if (z2) {
                                    polarVoyageDrawableCompatSpectraPhoenixStrike3679.PolarVoyageBarcodeScannerInfernoSolarSpark7767(j);
                                    hashSet2 = hashSet;
                                } else {
                                    long j6 = j;
                                    if (j2 > 4) {
                                        int readInt2 = polarVoyageDrawableCompatSpectraPhoenixStrike3679.readInt();
                                        if (z) {
                                            i3 = readUnsignedShort2;
                                            Log.d("ExifInterface", "seek to data offset: " + readInt2);
                                        } else {
                                            i3 = readUnsignedShort2;
                                        }
                                        if (this.PolarVoyageKotlinBetaPulseBeta3653 == 7) {
                                            if ("MakerNote".equals(polarVoyageMaterialCardViewNeoMaster72112.PolarVoyageMotionLayoutTransitionHeroVision4068)) {
                                                this.PolarVoyageStrictModeLegendEpic1532 = readInt2;
                                            } else if (i4 == 6 && "ThumbnailImage".equals(polarVoyageMaterialCardViewNeoMaster72112.PolarVoyageMotionLayoutTransitionHeroVision4068)) {
                                                this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = readInt2;
                                                this.PolarVoyageBottomSheetOmegaNeo1907 = readInt;
                                                PolarVoyageSQLiteVortexPulsePrime3106 PolarVoyageKotlinBetaPulseBeta3653 = PolarVoyageSQLiteVortexPulsePrime3106.PolarVoyageKotlinBetaPulseBeta3653(6, this.PolarVoyageDiffUtilTurboStrike5735);
                                                j3 = j6;
                                                PolarVoyageSQLiteVortexPulsePrime3106 PolarVoyageZipVortexCelestial6185 = PolarVoyageSQLiteVortexPulsePrime3106.PolarVoyageZipVortexCelestial6185(this.PolarVoyageRotateAnimationCyberCelestialDelta4768, this.PolarVoyageDiffUtilTurboStrike5735);
                                                polarVoyageMaterialCardViewNeoMaster7211 = polarVoyageMaterialCardViewNeoMaster72112;
                                                PolarVoyageSQLiteVortexPulsePrime3106 PolarVoyageZipVortexCelestial61852 = PolarVoyageSQLiteVortexPulsePrime3106.PolarVoyageZipVortexCelestial6185(this.PolarVoyageBottomSheetOmegaNeo1907, this.PolarVoyageDiffUtilTurboStrike5735);
                                                hashMapArr2[4].put("Compression", PolarVoyageKotlinBetaPulseBeta3653);
                                                hashMapArr2[4].put("JPEGInterchangeFormat", PolarVoyageZipVortexCelestial6185);
                                                hashMapArr2[4].put("JPEGInterchangeFormatLength", PolarVoyageZipVortexCelestial61852);
                                                polarVoyageDrawableCompatSpectraPhoenixStrike3679.PolarVoyageBarcodeScannerInfernoSolarSpark7767(readInt2);
                                            }
                                        }
                                        polarVoyageMaterialCardViewNeoMaster7211 = polarVoyageMaterialCardViewNeoMaster72112;
                                        j3 = j6;
                                        polarVoyageDrawableCompatSpectraPhoenixStrike3679.PolarVoyageBarcodeScannerInfernoSolarSpark7767(readInt2);
                                    } else {
                                        j3 = j6;
                                        i3 = readUnsignedShort2;
                                        polarVoyageMaterialCardViewNeoMaster7211 = polarVoyageMaterialCardViewNeoMaster72112;
                                    }
                                    Integer num = (Integer) PolarVoyageGuidelineStormSolar2850.get(Integer.valueOf(i3));
                                    if (z) {
                                        Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j2);
                                    }
                                    if (num != null) {
                                        if (readUnsignedShort3 != 3) {
                                            if (readUnsignedShort3 == 4) {
                                                j4 = polarVoyageDrawableCompatSpectraPhoenixStrike3679.readInt() & 4294967295L;
                                            } else if (readUnsignedShort3 == 8) {
                                                readUnsignedShort = polarVoyageDrawableCompatSpectraPhoenixStrike3679.readShort();
                                            } else if (readUnsignedShort3 == 9 || readUnsignedShort3 == 13) {
                                                readUnsignedShort = polarVoyageDrawableCompatSpectraPhoenixStrike3679.readInt();
                                            } else {
                                                j4 = -1;
                                            }
                                            if (z) {
                                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j4), polarVoyageMaterialCardViewNeoMaster7211.PolarVoyageMotionLayoutTransitionHeroVision4068));
                                            }
                                            if (j4 > 0 || (i6 != -1 && j4 >= i6)) {
                                                hashSet2 = hashSet;
                                                if (z) {
                                                    String PolarVoyageRotateAnimationCyberCelestialDelta4768 = PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageRotateAnimationCyberCelestialDelta4768("Skip jump into the IFD since its offset is invalid: ", j4);
                                                    if (i6 != -1) {
                                                        PolarVoyageRotateAnimationCyberCelestialDelta4768 = PolarVoyageRotateAnimationCyberCelestialDelta4768 + " (total length: " + i6 + ")";
                                                    }
                                                    Log.d("ExifInterface", PolarVoyageRotateAnimationCyberCelestialDelta4768);
                                                }
                                            } else {
                                                hashSet2 = hashSet;
                                                if (!hashSet2.contains(Integer.valueOf((int) j4))) {
                                                    polarVoyageDrawableCompatSpectraPhoenixStrike3679.PolarVoyageBarcodeScannerInfernoSolarSpark7767(j4);
                                                    PolarVoyageAnimatorSetSparkUltraMax8233(polarVoyageDrawableCompatSpectraPhoenixStrike3679, num.intValue());
                                                } else if (z) {
                                                    Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j4 + ")");
                                                }
                                            }
                                            polarVoyageDrawableCompatSpectraPhoenixStrike3679.PolarVoyageBarcodeScannerInfernoSolarSpark7767(j3);
                                        } else {
                                            readUnsignedShort = polarVoyageDrawableCompatSpectraPhoenixStrike3679.readUnsignedShort();
                                        }
                                        j4 = readUnsignedShort;
                                        if (z) {
                                        }
                                        if (j4 > 0) {
                                        }
                                        hashSet2 = hashSet;
                                        if (z) {
                                        }
                                        polarVoyageDrawableCompatSpectraPhoenixStrike3679.PolarVoyageBarcodeScannerInfernoSolarSpark7767(j3);
                                    } else {
                                        hashSet2 = hashSet;
                                        long j7 = j3;
                                        int i8 = polarVoyageDrawableCompatSpectraPhoenixStrike3679.PolarVoyageStrictModeLegendEpic1532 + this.PolarVoyageItemDecorationUltraDeltaEpic7485;
                                        byte[] bArr = new byte[(int) j2];
                                        polarVoyageDrawableCompatSpectraPhoenixStrike3679.readFully(bArr);
                                        PolarVoyageSQLiteVortexPulsePrime3106 polarVoyageSQLiteVortexPulsePrime3106 = new PolarVoyageSQLiteVortexPulsePrime3106(i8, bArr, readUnsignedShort3, readInt);
                                        HashMap hashMap = hashMapArr2[i];
                                        String str = polarVoyageMaterialCardViewNeoMaster7211.PolarVoyageMotionLayoutTransitionHeroVision4068;
                                        hashMap.put(str, polarVoyageSQLiteVortexPulsePrime3106);
                                        if ("DNGVersion".equals(str)) {
                                            this.PolarVoyageKotlinBetaPulseBeta3653 = 3;
                                        }
                                        if ((("Make".equals(str) || "Model".equals(str)) && polarVoyageSQLiteVortexPulsePrime3106.PolarVoyageDiffUtilTurboStrike5735(this.PolarVoyageDiffUtilTurboStrike5735).contains("PENTAX")) || ("Compression".equals(str) && polarVoyageSQLiteVortexPulsePrime3106.PolarVoyageBitmapVisionAuroraPixel4705(this.PolarVoyageDiffUtilTurboStrike5735) == 65535)) {
                                            this.PolarVoyageKotlinBetaPulseBeta3653 = 8;
                                        }
                                        if (polarVoyageDrawableCompatSpectraPhoenixStrike3679.PolarVoyageStrictModeLegendEpic1532 != j7) {
                                            polarVoyageDrawableCompatSpectraPhoenixStrike3679.PolarVoyageBarcodeScannerInfernoSolarSpark7767(j7);
                                        }
                                    }
                                }
                                s2 = (short) (s + 1);
                                i4 = i;
                                hashSet3 = hashSet2;
                                readShort = s3;
                                z3 = z;
                            } else {
                                z2 = true;
                                if (z2) {
                                }
                                s2 = (short) (s + 1);
                                i4 = i;
                                hashSet3 = hashSet2;
                                readShort = s3;
                                z3 = z;
                            }
                        } else if (z) {
                            Log.d("ExifInterface", "Skip the tag entry since data format (" + PolarVoyageLifecycleOlympianOmega3762[readUnsignedShort3] + ") is unexpected for tag: " + polarVoyageMaterialCardViewNeoMaster72112.PolarVoyageMotionLayoutTransitionHeroVision4068);
                        }
                    }
                }
                j = j5;
                if (z) {
                    Log.d("ExifInterface", "Skip the tag entry since data format is invalid: " + readUnsignedShort3);
                }
                j2 = 0;
                z2 = false;
                if (z2) {
                }
                s2 = (short) (s + 1);
                i4 = i;
                hashSet3 = hashSet2;
                readShort = s3;
                z3 = z;
            } else if (z) {
                Log.d("ExifInterface", "Skip the tag entry since tag number is not defined: " + readUnsignedShort2);
            }
            j = j5;
            j2 = 0;
            z2 = false;
            if (z2) {
            }
            s2 = (short) (s + 1);
            i4 = i;
            hashSet3 = hashSet2;
            readShort = s3;
            z3 = z;
        }
        HashSet hashSet4 = hashSet3;
        boolean z4 = z3;
        int readInt3 = polarVoyageDrawableCompatSpectraPhoenixStrike3679.readInt();
        if (z4) {
            Log.d("ExifInterface", String.format("nextIfdOffset: %d", Integer.valueOf(readInt3)));
        }
        long j8 = readInt3;
        if (j8 <= 0) {
            if (z4) {
                Log.d("ExifInterface", "Stop reading file since a wrong offset may cause an infinite loop: " + readInt3);
                return;
            }
            return;
        }
        if (hashSet4.contains(Integer.valueOf(readInt3))) {
            if (z4) {
                Log.d("ExifInterface", "Stop reading file since re-reading an IFD may cause an infinite loop: " + readInt3);
                return;
            }
            return;
        }
        polarVoyageDrawableCompatSpectraPhoenixStrike3679.PolarVoyageBarcodeScannerInfernoSolarSpark7767(j8);
        if (hashMapArr[4].isEmpty()) {
            PolarVoyageAnimatorSetSparkUltraMax8233(polarVoyageDrawableCompatSpectraPhoenixStrike3679, 4);
        } else if (hashMapArr[5].isEmpty()) {
            PolarVoyageAnimatorSetSparkUltraMax8233(polarVoyageDrawableCompatSpectraPhoenixStrike3679, 5);
        }
    }

    public final void PolarVoyageBarcodeScannerInfernoSolarSpark7767(PolarVoyageDrawableCompatSpectraPhoenixStrike3679 polarVoyageDrawableCompatSpectraPhoenixStrike3679, int i) {
        String str;
        String str2;
        String str3;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIC files is supported from SDK 28 and above");
        }
        if (i == 15 && i2 < 31) {
            throw new UnsupportedOperationException("Reading EXIF from AVIF files is supported from SDK 31 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                mediaMetadataRetriever.setDataSource(new PolarVoyageRecyclerViewTurboQuantum2253(polarVoyageDrawableCompatSpectraPhoenixStrike3679));
                String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
                String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
                String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
                String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(extractMetadata3)) {
                    str = mediaMetadataRetriever.extractMetadata(29);
                    str3 = mediaMetadataRetriever.extractMetadata(30);
                    str2 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(extractMetadata4)) {
                    str = mediaMetadataRetriever.extractMetadata(18);
                    str3 = mediaMetadataRetriever.extractMetadata(19);
                    str2 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                }
                HashMap[] hashMapArr = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                if (str != null) {
                    hashMapArr[0].put("ImageWidth", PolarVoyageSQLiteVortexPulsePrime3106.PolarVoyageKotlinBetaPulseBeta3653(Integer.parseInt(str), this.PolarVoyageDiffUtilTurboStrike5735));
                }
                if (str3 != null) {
                    hashMapArr[0].put("ImageLength", PolarVoyageSQLiteVortexPulsePrime3106.PolarVoyageKotlinBetaPulseBeta3653(Integer.parseInt(str3), this.PolarVoyageDiffUtilTurboStrike5735));
                }
                if (str2 != null) {
                    int parseInt = Integer.parseInt(str2);
                    hashMapArr[0].put("Orientation", PolarVoyageSQLiteVortexPulsePrime3106.PolarVoyageKotlinBetaPulseBeta3653(parseInt != 90 ? parseInt != 180 ? parseInt != 270 ? 1 : 8 : 3 : 6, this.PolarVoyageDiffUtilTurboStrike5735));
                }
                if (extractMetadata != null && extractMetadata2 != null) {
                    int parseInt2 = Integer.parseInt(extractMetadata);
                    int parseInt3 = Integer.parseInt(extractMetadata2);
                    if (parseInt3 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    polarVoyageDrawableCompatSpectraPhoenixStrike3679.PolarVoyageBarcodeScannerInfernoSolarSpark7767(parseInt2);
                    byte[] bArr = new byte[6];
                    polarVoyageDrawableCompatSpectraPhoenixStrike3679.readFully(bArr);
                    int i3 = parseInt2 + 6;
                    int i4 = parseInt3 - 6;
                    if (!Arrays.equals(bArr, PolarVoyageCanvasElitePhoenix4750)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i4];
                    polarVoyageDrawableCompatSpectraPhoenixStrike3679.readFully(bArr2);
                    this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i3;
                    PolarVoyageNavigationViewHyperHyperHyperion1793(bArr2, 0);
                }
                String extractMetadata5 = mediaMetadataRetriever.extractMetadata(41);
                String extractMetadata6 = mediaMetadataRetriever.extractMetadata(42);
                if (extractMetadata5 != null && extractMetadata6 != null) {
                    int parseInt4 = Integer.parseInt(extractMetadata5);
                    int parseInt5 = Integer.parseInt(extractMetadata6);
                    long j = parseInt4;
                    polarVoyageDrawableCompatSpectraPhoenixStrike3679.PolarVoyageBarcodeScannerInfernoSolarSpark7767(j);
                    byte[] bArr3 = new byte[parseInt5];
                    polarVoyageDrawableCompatSpectraPhoenixStrike3679.readFully(bArr3);
                    this.PolarVoyageViewRogueMaster4778 = new PolarVoyageSQLiteVortexPulsePrime3106(j, bArr3, 1, parseInt5);
                }
                if (PolarVoyageCameraPixelBlaze2629) {
                    Log.d("ExifInterface", "Heif meta: " + str + "x" + str3 + ", rotation " + str2);
                }
                try {
                    mediaMetadataRetriever.release();
                } catch (IOException unused) {
                }
            } catch (RuntimeException e) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.", e);
            }
        } finally {
        }
    }

    public final void PolarVoyageBitmapMaxTitanTitan7960(String str, int i, String str2) {
        HashMap[] hashMapArr = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        if (hashMapArr[i].isEmpty() || hashMapArr[i].get(str) == null) {
            return;
        }
        HashMap hashMap = hashMapArr[i];
        hashMap.put(str2, (PolarVoyageSQLiteVortexPulsePrime3106) hashMap.get(str));
        hashMapArr[i].remove(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x016e, code lost:
    
        r23.PolarVoyageRotateAnimationCyberCelestialDelta4768 = r22.PolarVoyageDiffUtilTurboStrike5735;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0172, code lost:
    
        return;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x00a2. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x00a5. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x00a8. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:35:0x015f A[LOOP:0: B:9:0x0034->B:35:0x015f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0166 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b0 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void PolarVoyageBitmapVisionAuroraPixel4705(PolarVoyageZipStrikeStrike1055 polarVoyageZipStrikeStrike1055, int i, int i2) {
        boolean z = PolarVoyageCameraPixelBlaze2629;
        if (z) {
            Log.d("ExifInterface", "getJpegAttributes starting with: " + polarVoyageZipStrikeStrike1055);
        }
        polarVoyageZipStrikeStrike1055.PolarVoyageRotateAnimationCyberCelestialDelta4768 = ByteOrder.BIG_ENDIAN;
        byte readByte = polarVoyageZipStrikeStrike1055.readByte();
        byte b = -1;
        if (readByte != -1) {
            PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageSnackbarGammaEclipse2140(Integer.toHexString(readByte & 255), "Invalid marker: ");
            return;
        }
        if (polarVoyageZipStrikeStrike1055.readByte() != -40) {
            PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageSnackbarGammaEclipse2140(Integer.toHexString(readByte & 255), "Invalid marker: ");
            return;
        }
        int i3 = 2;
        while (true) {
            byte readByte2 = polarVoyageZipStrikeStrike1055.readByte();
            if (readByte2 != b) {
                PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageSnackbarGammaEclipse2140(Integer.toHexString(readByte2 & 255), "Invalid marker:");
                return;
            }
            while (true) {
                int i4 = i3 + 1;
                byte readByte3 = polarVoyageZipStrikeStrike1055.readByte();
                if (readByte3 != b) {
                    if (z) {
                        Log.d("ExifInterface", "Found JPEG segment indicator: " + Integer.toHexString(readByte3 & 255));
                    }
                    if (readByte3 != -39 && readByte3 != -38) {
                        int readUnsignedShort = polarVoyageZipStrikeStrike1055.readUnsignedShort();
                        int i5 = readUnsignedShort - 2;
                        int i6 = i3 + 4;
                        if (z) {
                            Log.d("ExifInterface", "JPEG segment: " + Integer.toHexString(readByte3 & 255) + " (length: " + readUnsignedShort + ")");
                        }
                        if (i5 < 0) {
                            PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageViewRogueMaster4778("Invalid length");
                            return;
                        }
                        if (readByte3 != -31) {
                            HashMap[] hashMapArr = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                            if (readByte3 != -2) {
                                switch (readByte3) {
                                    default:
                                        switch (readByte3) {
                                            default:
                                                switch (readByte3) {
                                                    default:
                                                        switch (readByte3) {
                                                        }
                                                    case -55:
                                                    case -54:
                                                    case -53:
                                                        polarVoyageZipStrikeStrike1055.PolarVoyageMotionLayoutTransitionHeroVision4068(1);
                                                        hashMapArr[i2].put(i2 != 4 ? "ImageLength" : "ThumbnailImageLength", PolarVoyageSQLiteVortexPulsePrime3106.PolarVoyageZipVortexCelestial6185(polarVoyageZipStrikeStrike1055.readUnsignedShort(), this.PolarVoyageDiffUtilTurboStrike5735));
                                                        hashMapArr[i2].put(i2 != 4 ? "ImageWidth" : "ThumbnailImageWidth", PolarVoyageSQLiteVortexPulsePrime3106.PolarVoyageZipVortexCelestial6185(polarVoyageZipStrikeStrike1055.readUnsignedShort(), this.PolarVoyageDiffUtilTurboStrike5735));
                                                        i5 = readUnsignedShort - 7;
                                                        break;
                                                }
                                            case -59:
                                            case -58:
                                            case -57:
                                                break;
                                        }
                                    case -64:
                                    case -63:
                                    case -62:
                                    case -61:
                                        break;
                                }
                                if (i5 >= 0) {
                                    PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageViewRogueMaster4778("Invalid length");
                                    return;
                                } else {
                                    polarVoyageZipStrikeStrike1055.PolarVoyageMotionLayoutTransitionHeroVision4068(i5);
                                    i3 = i6 + i5;
                                    b = -1;
                                }
                            } else {
                                byte[] bArr = new byte[i5];
                                polarVoyageZipStrikeStrike1055.readFully(bArr);
                                if (PolarVoyageMotionLayoutTransitionHeroVision4068("UserComment") == null) {
                                    HashMap hashMap = hashMapArr[1];
                                    Charset charset = PolarVoyageConfigurationMaxSpectraForce5418;
                                    byte[] bytes = new String(bArr, charset).concat("\u0000").getBytes(charset);
                                    hashMap.put("UserComment", new PolarVoyageSQLiteVortexPulsePrime3106(bytes, 2, bytes.length));
                                }
                            }
                        } else {
                            byte[] bArr2 = new byte[i5];
                            polarVoyageZipStrikeStrike1055.readFully(bArr2);
                            int i7 = i6 + i5;
                            byte[] bArr3 = PolarVoyageCanvasElitePhoenix4750;
                            if (PolarVoyageConstraintSetClonePixelVortex4921.PolarVoyageMapTurboRogueTitan9291(bArr2, bArr3)) {
                                byte[] copyOfRange = Arrays.copyOfRange(bArr2, bArr3.length, i5);
                                this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i + i6 + bArr3.length;
                                PolarVoyageNavigationViewHyperHyperHyperion1793(copyOfRange, i2);
                                PolarVoyageDisplayMetricsVortexDragon9516(new PolarVoyageZipStrikeStrike1055(copyOfRange));
                            } else {
                                byte[] bArr4 = PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803;
                                if (PolarVoyageConstraintSetClonePixelVortex4921.PolarVoyageMapTurboRogueTitan9291(bArr2, bArr4)) {
                                    int length = i6 + bArr4.length;
                                    byte[] copyOfRange2 = Arrays.copyOfRange(bArr2, bArr4.length, i5);
                                    this.PolarVoyageViewRogueMaster4778 = new PolarVoyageSQLiteVortexPulsePrime3106(length, copyOfRange2, 1, copyOfRange2.length);
                                }
                            }
                            i6 = i7;
                        }
                        i5 = 0;
                        if (i5 >= 0) {
                        }
                    }
                } else {
                    i3 = i4;
                }
            }
        }
    }

    public final void PolarVoyageBottomSheetOmegaNeo1907(PolarVoyageDrawableCompatSpectraPhoenixStrike3679 polarVoyageDrawableCompatSpectraPhoenixStrike3679) {
        if (PolarVoyageCameraPixelBlaze2629) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + polarVoyageDrawableCompatSpectraPhoenixStrike3679);
        }
        PolarVoyageRotateAnimationCyberCelestialDelta4768(polarVoyageDrawableCompatSpectraPhoenixStrike3679);
        HashMap[] hashMapArr = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        PolarVoyageSQLiteVortexPulsePrime3106 polarVoyageSQLiteVortexPulsePrime3106 = (PolarVoyageSQLiteVortexPulsePrime3106) hashMapArr[0].get("JpgFromRaw");
        if (polarVoyageSQLiteVortexPulsePrime3106 != null) {
            PolarVoyageBitmapVisionAuroraPixel4705(new PolarVoyageZipStrikeStrike1055(polarVoyageSQLiteVortexPulsePrime3106.PolarVoyageBarcodeScannerInfernoSolarSpark7767), (int) polarVoyageSQLiteVortexPulsePrime3106.PolarVoyageKotlinBetaPulseBeta3653, 5);
        }
        PolarVoyageSQLiteVortexPulsePrime3106 polarVoyageSQLiteVortexPulsePrime31062 = (PolarVoyageSQLiteVortexPulsePrime3106) hashMapArr[0].get("ISO");
        PolarVoyageSQLiteVortexPulsePrime3106 polarVoyageSQLiteVortexPulsePrime31063 = (PolarVoyageSQLiteVortexPulsePrime3106) hashMapArr[1].get("PhotographicSensitivity");
        if (polarVoyageSQLiteVortexPulsePrime31062 == null || polarVoyageSQLiteVortexPulsePrime31063 != null) {
            return;
        }
        hashMapArr[1].put("PhotographicSensitivity", polarVoyageSQLiteVortexPulsePrime31062);
    }

    public final void PolarVoyageCameraPixelBlaze2629(PolarVoyageZipStrikeStrike1055 polarVoyageZipStrikeStrike1055, HashMap hashMap) {
        PolarVoyageSQLiteVortexPulsePrime3106 polarVoyageSQLiteVortexPulsePrime3106 = (PolarVoyageSQLiteVortexPulsePrime3106) hashMap.get("JPEGInterchangeFormat");
        PolarVoyageSQLiteVortexPulsePrime3106 polarVoyageSQLiteVortexPulsePrime31062 = (PolarVoyageSQLiteVortexPulsePrime3106) hashMap.get("JPEGInterchangeFormatLength");
        if (polarVoyageSQLiteVortexPulsePrime3106 == null || polarVoyageSQLiteVortexPulsePrime31062 == null) {
            return;
        }
        int PolarVoyageBitmapVisionAuroraPixel4705 = polarVoyageSQLiteVortexPulsePrime3106.PolarVoyageBitmapVisionAuroraPixel4705(this.PolarVoyageDiffUtilTurboStrike5735);
        int PolarVoyageBitmapVisionAuroraPixel47052 = polarVoyageSQLiteVortexPulsePrime31062.PolarVoyageBitmapVisionAuroraPixel4705(this.PolarVoyageDiffUtilTurboStrike5735);
        if (this.PolarVoyageKotlinBetaPulseBeta3653 == 7) {
            PolarVoyageBitmapVisionAuroraPixel4705 += this.PolarVoyageStrictModeLegendEpic1532;
        }
        if (PolarVoyageBitmapVisionAuroraPixel4705 > 0 && PolarVoyageBitmapVisionAuroraPixel47052 > 0 && this.PolarVoyageMotionLayoutTransitionHeroVision4068 == null && this.PolarVoyageZipVortexCelestial6185 == null) {
            polarVoyageZipStrikeStrike1055.PolarVoyageMotionLayoutTransitionHeroVision4068(PolarVoyageBitmapVisionAuroraPixel4705);
            polarVoyageZipStrikeStrike1055.readFully(new byte[PolarVoyageBitmapVisionAuroraPixel47052]);
        }
        if (PolarVoyageCameraPixelBlaze2629) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + PolarVoyageBitmapVisionAuroraPixel4705 + ", length: " + PolarVoyageBitmapVisionAuroraPixel47052);
        }
    }

    public final void PolarVoyageContentProviderHyperSpark3838() {
        int i = 0;
        while (true) {
            HashMap[] hashMapArr = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
            if (i >= hashMapArr.length) {
                return;
            }
            StringBuilder PolarVoyageContentProviderHyperSpark38382 = PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageContentProviderHyperSpark3838("The size of tag group[", i, "]: ");
            PolarVoyageContentProviderHyperSpark38382.append(hashMapArr[i].size());
            Log.d("ExifInterface", PolarVoyageContentProviderHyperSpark38382.toString());
            for (Map.Entry entry : hashMapArr[i].entrySet()) {
                PolarVoyageSQLiteVortexPulsePrime3106 polarVoyageSQLiteVortexPulsePrime3106 = (PolarVoyageSQLiteVortexPulsePrime3106) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + polarVoyageSQLiteVortexPulsePrime3106.toString() + ", tagValue: '" + polarVoyageSQLiteVortexPulsePrime3106.PolarVoyageDiffUtilTurboStrike5735(this.PolarVoyageDiffUtilTurboStrike5735) + "'");
            }
            i++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:157:0x00f4, code lost:
    
        if (r7 != null) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0132 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0134 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0166 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0169  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int PolarVoyageDiffUtilTurboStrike5735(BufferedInputStream bufferedInputStream) {
        int i;
        PolarVoyageZipStrikeStrike1055 polarVoyageZipStrikeStrike1055;
        int i2;
        PolarVoyageZipStrikeStrike1055 polarVoyageZipStrikeStrike10552;
        int i3;
        int i4;
        int i5;
        long readInt;
        byte[] bArr;
        long j;
        bufferedInputStream.mark(5000);
        byte[] bArr2 = new byte[5000];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i6 = 0;
        while (true) {
            byte[] bArr3 = PolarVoyageContentProviderHyperSpark3838;
            if (i6 >= bArr3.length) {
                return 4;
            }
            if (bArr2[i6] != bArr3[i6]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i7 = 0; i7 < bytes.length; i7++) {
                    if (bArr2[i7] != bytes[i7]) {
                        PolarVoyageZipStrikeStrike1055 polarVoyageZipStrikeStrike10553 = null;
                        int i8 = 1;
                        try {
                            polarVoyageZipStrikeStrike1055 = new PolarVoyageZipStrikeStrike1055(bArr2);
                            try {
                                try {
                                    readInt = polarVoyageZipStrikeStrike1055.readInt();
                                    bArr = new byte[4];
                                    polarVoyageZipStrikeStrike1055.readFully(bArr);
                                } catch (Exception e) {
                                    e = e;
                                    i = 0;
                                }
                            } catch (Throwable th) {
                                th = th;
                                polarVoyageZipStrikeStrike10553 = polarVoyageZipStrikeStrike1055;
                                if (polarVoyageZipStrikeStrike10553 != null) {
                                    polarVoyageZipStrikeStrike10553.close();
                                }
                                throw th;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            i = 0;
                            polarVoyageZipStrikeStrike1055 = null;
                        } catch (Throwable th2) {
                            th = th2;
                            if (polarVoyageZipStrikeStrike10553 != null) {
                            }
                            throw th;
                        }
                        if (Arrays.equals(bArr, PolarVoyageRemoteModelManagerOlympianCelestial9141)) {
                            if (readInt == 1) {
                                readInt = polarVoyageZipStrikeStrike1055.readLong();
                                j = 16;
                                if (readInt < 16) {
                                }
                            } else {
                                j = 8;
                            }
                            if (readInt > 5000) {
                                readInt = 5000;
                            }
                            long j2 = readInt - j;
                            if (j2 >= 8) {
                                byte[] bArr4 = new byte[4];
                                boolean z = false;
                                boolean z2 = false;
                                boolean z3 = false;
                                for (long j3 = 0; j3 < j2 / 4; j3++) {
                                    try {
                                        polarVoyageZipStrikeStrike1055.readFully(bArr4);
                                        if (j3 != 1) {
                                            i = 0;
                                            try {
                                                if (Arrays.equals(bArr4, PolarVoyageNavigationViewHyperHyperHyperion1793)) {
                                                    z = true;
                                                } else if (Arrays.equals(bArr4, PolarVoyageAnimatorSetSparkUltraMax8233)) {
                                                    z2 = true;
                                                } else if (Arrays.equals(bArr4, PolarVoyageBitmapMaxTitanTitan7960) || Arrays.equals(bArr4, PolarVoyageDisplayMetricsVortexDragon9516)) {
                                                    z3 = true;
                                                }
                                                if (z) {
                                                    if (z2) {
                                                        polarVoyageZipStrikeStrike1055.close();
                                                        i2 = 12;
                                                        break;
                                                    }
                                                    if (z3) {
                                                        polarVoyageZipStrikeStrike1055.close();
                                                        i2 = 15;
                                                        break;
                                                    }
                                                } else {
                                                    continue;
                                                }
                                            } catch (Exception e3) {
                                                e = e3;
                                                if (PolarVoyageCameraPixelBlaze2629) {
                                                    Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                                                }
                                            }
                                        }
                                    } catch (EOFException unused) {
                                        i = 0;
                                    }
                                }
                                i = 0;
                                polarVoyageZipStrikeStrike1055.close();
                                i2 = i;
                                if (i2 == 0) {
                                    return i2;
                                }
                                try {
                                    polarVoyageZipStrikeStrike10552 = new PolarVoyageZipStrikeStrike1055(bArr2);
                                    try {
                                        ByteOrder PolarVoyageRemoteModelManagerOlympianCelestial91412 = PolarVoyageRemoteModelManagerOlympianCelestial9141(polarVoyageZipStrikeStrike10552);
                                        this.PolarVoyageDiffUtilTurboStrike5735 = PolarVoyageRemoteModelManagerOlympianCelestial91412;
                                        polarVoyageZipStrikeStrike10552.PolarVoyageRotateAnimationCyberCelestialDelta4768 = PolarVoyageRemoteModelManagerOlympianCelestial91412;
                                        short readShort = polarVoyageZipStrikeStrike10552.readShort();
                                        i3 = (readShort == 20306 || readShort == 21330) ? 1 : i;
                                        polarVoyageZipStrikeStrike10552.close();
                                    } catch (Exception unused2) {
                                        if (polarVoyageZipStrikeStrike10552 != null) {
                                            polarVoyageZipStrikeStrike10552.close();
                                        }
                                        i3 = i;
                                        if (i3 == 0) {
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        polarVoyageZipStrikeStrike10553 = polarVoyageZipStrikeStrike10552;
                                        if (polarVoyageZipStrikeStrike10553 != null) {
                                            polarVoyageZipStrikeStrike10553.close();
                                        }
                                        throw th;
                                    }
                                } catch (Exception unused3) {
                                    polarVoyageZipStrikeStrike10552 = null;
                                } catch (Throwable th4) {
                                    th = th4;
                                }
                                if (i3 == 0) {
                                    return 7;
                                }
                                try {
                                    PolarVoyageZipStrikeStrike1055 polarVoyageZipStrikeStrike10554 = new PolarVoyageZipStrikeStrike1055(bArr2);
                                    try {
                                        ByteOrder PolarVoyageRemoteModelManagerOlympianCelestial91413 = PolarVoyageRemoteModelManagerOlympianCelestial9141(polarVoyageZipStrikeStrike10554);
                                        this.PolarVoyageDiffUtilTurboStrike5735 = PolarVoyageRemoteModelManagerOlympianCelestial91413;
                                        polarVoyageZipStrikeStrike10554.PolarVoyageRotateAnimationCyberCelestialDelta4768 = PolarVoyageRemoteModelManagerOlympianCelestial91413;
                                        i4 = polarVoyageZipStrikeStrike10554.readShort() == 85 ? 1 : i;
                                        polarVoyageZipStrikeStrike10554.close();
                                    } catch (Exception unused4) {
                                        polarVoyageZipStrikeStrike10553 = polarVoyageZipStrikeStrike10554;
                                        if (polarVoyageZipStrikeStrike10553 != null) {
                                            polarVoyageZipStrikeStrike10553.close();
                                        }
                                        i4 = i;
                                        if (i4 == 0) {
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        polarVoyageZipStrikeStrike10553 = polarVoyageZipStrikeStrike10554;
                                        if (polarVoyageZipStrikeStrike10553 != null) {
                                            polarVoyageZipStrikeStrike10553.close();
                                        }
                                        throw th;
                                    }
                                } catch (Exception unused5) {
                                } catch (Throwable th6) {
                                    th = th6;
                                }
                                if (i4 == 0) {
                                    return 10;
                                }
                                int i9 = i;
                                while (true) {
                                    byte[] bArr5 = PolarVoyageAlertDialogCyberHeroQuantum3938;
                                    if (i9 >= bArr5.length) {
                                        i5 = 1;
                                        break;
                                    }
                                    if (bArr2[i9] != bArr5[i9]) {
                                        i5 = i;
                                        break;
                                    }
                                    i9++;
                                }
                                if (i5 != 0) {
                                    return 13;
                                }
                                int i10 = i;
                                while (true) {
                                    byte[] bArr6 = PolarVoyagePackageManagerCelestialPhoenix8393;
                                    if (i10 >= bArr6.length) {
                                        int i11 = i;
                                        while (true) {
                                            byte[] bArr7 = PolarVoyageLooperThreadAlphaPrime1279;
                                            if (i11 >= bArr7.length) {
                                                break;
                                            }
                                            if (bArr2[bArr6.length + i11 + 4] != bArr7[i11]) {
                                                break;
                                            }
                                            i11++;
                                        }
                                    } else {
                                        if (bArr2[i10] != bArr6[i10]) {
                                            break;
                                        }
                                        i10++;
                                    }
                                }
                                i8 = i;
                                if (i8 != 0) {
                                    return 14;
                                }
                                return i;
                            }
                        }
                        polarVoyageZipStrikeStrike1055.close();
                        i = 0;
                        i2 = 0;
                        if (i2 == 0) {
                        }
                    }
                }
                return 9;
            }
            i6++;
        }
    }

    public final void PolarVoyageDisplayMetricsVortexDragon9516(PolarVoyageZipStrikeStrike1055 polarVoyageZipStrikeStrike1055) {
        PolarVoyageSQLiteVortexPulsePrime3106 polarVoyageSQLiteVortexPulsePrime3106;
        int PolarVoyageBitmapVisionAuroraPixel4705;
        HashMap hashMap = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767[4];
        PolarVoyageSQLiteVortexPulsePrime3106 polarVoyageSQLiteVortexPulsePrime31062 = (PolarVoyageSQLiteVortexPulsePrime3106) hashMap.get("Compression");
        if (polarVoyageSQLiteVortexPulsePrime31062 == null) {
            PolarVoyageCameraPixelBlaze2629(polarVoyageZipStrikeStrike1055, hashMap);
            return;
        }
        int PolarVoyageBitmapVisionAuroraPixel47052 = polarVoyageSQLiteVortexPulsePrime31062.PolarVoyageBitmapVisionAuroraPixel4705(this.PolarVoyageDiffUtilTurboStrike5735);
        if (PolarVoyageBitmapVisionAuroraPixel47052 != 1) {
            if (PolarVoyageBitmapVisionAuroraPixel47052 == 6) {
                PolarVoyageCameraPixelBlaze2629(polarVoyageZipStrikeStrike1055, hashMap);
                return;
            } else if (PolarVoyageBitmapVisionAuroraPixel47052 != 7) {
                return;
            }
        }
        PolarVoyageSQLiteVortexPulsePrime3106 polarVoyageSQLiteVortexPulsePrime31063 = (PolarVoyageSQLiteVortexPulsePrime3106) hashMap.get("BitsPerSample");
        if (polarVoyageSQLiteVortexPulsePrime31063 != null) {
            int[] iArr = (int[]) polarVoyageSQLiteVortexPulsePrime31063.PolarVoyageTextInputEditTextNebulaHero6651(this.PolarVoyageDiffUtilTurboStrike5735);
            int[] iArr2 = PolarVoyageDrawableDeltaHyperion5742;
            if (Arrays.equals(iArr2, iArr) || (this.PolarVoyageKotlinBetaPulseBeta3653 == 3 && (polarVoyageSQLiteVortexPulsePrime3106 = (PolarVoyageSQLiteVortexPulsePrime3106) hashMap.get("PhotometricInterpretation")) != null && (((PolarVoyageBitmapVisionAuroraPixel4705 = polarVoyageSQLiteVortexPulsePrime3106.PolarVoyageBitmapVisionAuroraPixel4705(this.PolarVoyageDiffUtilTurboStrike5735)) == 1 && Arrays.equals(iArr, PolarVoyageSnackbarGammaEclipse2140)) || (PolarVoyageBitmapVisionAuroraPixel4705 == 6 && Arrays.equals(iArr, iArr2))))) {
                PolarVoyageSQLiteVortexPulsePrime3106 polarVoyageSQLiteVortexPulsePrime31064 = (PolarVoyageSQLiteVortexPulsePrime3106) hashMap.get("StripOffsets");
                PolarVoyageSQLiteVortexPulsePrime3106 polarVoyageSQLiteVortexPulsePrime31065 = (PolarVoyageSQLiteVortexPulsePrime3106) hashMap.get("StripByteCounts");
                if (polarVoyageSQLiteVortexPulsePrime31064 == null || polarVoyageSQLiteVortexPulsePrime31065 == null) {
                    return;
                }
                long[] PolarVoyageSnackbarGammaEclipse21402 = PolarVoyageConstraintSetClonePixelVortex4921.PolarVoyageSnackbarGammaEclipse2140(polarVoyageSQLiteVortexPulsePrime31064.PolarVoyageTextInputEditTextNebulaHero6651(this.PolarVoyageDiffUtilTurboStrike5735));
                long[] PolarVoyageSnackbarGammaEclipse21403 = PolarVoyageConstraintSetClonePixelVortex4921.PolarVoyageSnackbarGammaEclipse2140(polarVoyageSQLiteVortexPulsePrime31065.PolarVoyageTextInputEditTextNebulaHero6651(this.PolarVoyageDiffUtilTurboStrike5735));
                if (PolarVoyageSnackbarGammaEclipse21402 == null || PolarVoyageSnackbarGammaEclipse21402.length == 0) {
                    Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                    return;
                }
                if (PolarVoyageSnackbarGammaEclipse21403 == null || PolarVoyageSnackbarGammaEclipse21403.length == 0) {
                    Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if (PolarVoyageSnackbarGammaEclipse21402.length != PolarVoyageSnackbarGammaEclipse21403.length) {
                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j = 0;
                for (long j2 : PolarVoyageSnackbarGammaEclipse21403) {
                    j += j2;
                }
                byte[] bArr = new byte[(int) j];
                this.PolarVoyageTextInputEditTextNebulaHero6651 = true;
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < PolarVoyageSnackbarGammaEclipse21402.length; i3++) {
                    int i4 = (int) PolarVoyageSnackbarGammaEclipse21402[i3];
                    int i5 = (int) PolarVoyageSnackbarGammaEclipse21403[i3];
                    if (i3 < PolarVoyageSnackbarGammaEclipse21402.length - 1 && i4 + i5 != PolarVoyageSnackbarGammaEclipse21402[i3 + 1]) {
                        this.PolarVoyageTextInputEditTextNebulaHero6651 = false;
                    }
                    int i6 = i4 - i;
                    if (i6 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                        return;
                    }
                    try {
                        polarVoyageZipStrikeStrike1055.PolarVoyageMotionLayoutTransitionHeroVision4068(i6);
                        int i7 = i + i6;
                        byte[] bArr2 = new byte[i5];
                        try {
                            polarVoyageZipStrikeStrike1055.readFully(bArr2);
                            i = i7 + i5;
                            System.arraycopy(bArr2, 0, bArr, i2, i5);
                            i2 += i5;
                        } catch (EOFException unused) {
                            Log.d("ExifInterface", "Failed to read " + i5 + " bytes.");
                            return;
                        }
                    } catch (EOFException unused2) {
                        Log.d("ExifInterface", "Failed to skip " + i6 + " bytes.");
                        return;
                    }
                }
                if (this.PolarVoyageTextInputEditTextNebulaHero6651) {
                    long j3 = PolarVoyageSnackbarGammaEclipse21402[0];
                    return;
                }
                return;
            }
        }
        if (PolarVoyageCameraPixelBlaze2629) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    public final boolean PolarVoyageDrawableDeltaHyperion5742(HashMap hashMap) {
        PolarVoyageSQLiteVortexPulsePrime3106 polarVoyageSQLiteVortexPulsePrime3106 = (PolarVoyageSQLiteVortexPulsePrime3106) hashMap.get("ImageLength");
        PolarVoyageSQLiteVortexPulsePrime3106 polarVoyageSQLiteVortexPulsePrime31062 = (PolarVoyageSQLiteVortexPulsePrime3106) hashMap.get("ImageWidth");
        if (polarVoyageSQLiteVortexPulsePrime3106 == null || polarVoyageSQLiteVortexPulsePrime31062 == null) {
            return false;
        }
        return polarVoyageSQLiteVortexPulsePrime3106.PolarVoyageBitmapVisionAuroraPixel4705(this.PolarVoyageDiffUtilTurboStrike5735) <= 512 && polarVoyageSQLiteVortexPulsePrime31062.PolarVoyageBitmapVisionAuroraPixel4705(this.PolarVoyageDiffUtilTurboStrike5735) <= 512;
    }

    public final void PolarVoyageItemDecorationUltraDeltaEpic7485(PolarVoyageZipStrikeStrike1055 polarVoyageZipStrikeStrike1055) {
        if (PolarVoyageCameraPixelBlaze2629) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + polarVoyageZipStrikeStrike1055);
        }
        polarVoyageZipStrikeStrike1055.PolarVoyageRotateAnimationCyberCelestialDelta4768 = ByteOrder.BIG_ENDIAN;
        int i = polarVoyageZipStrikeStrike1055.PolarVoyageStrictModeLegendEpic1532;
        polarVoyageZipStrikeStrike1055.PolarVoyageMotionLayoutTransitionHeroVision4068(PolarVoyageAlertDialogCyberHeroQuantum3938.length);
        boolean z = false;
        boolean z2 = false;
        while (true) {
            if (z && z2) {
                return;
            }
            try {
                int readInt = polarVoyageZipStrikeStrike1055.readInt();
                int readInt2 = polarVoyageZipStrikeStrike1055.readInt();
                int i2 = polarVoyageZipStrikeStrike1055.PolarVoyageStrictModeLegendEpic1532;
                int i3 = i2 + readInt + 4;
                int i4 = i2 - i;
                if (i4 == 16 && readInt2 != 1229472850) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appear as the first chunk");
                }
                if (readInt2 == 1229278788) {
                    return;
                }
                if (readInt2 == 1700284774 && !z) {
                    this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i4;
                    byte[] bArr = new byte[readInt];
                    polarVoyageZipStrikeStrike1055.readFully(bArr);
                    int readInt3 = polarVoyageZipStrikeStrike1055.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(readInt2 >>> 24);
                    crc32.update(readInt2 >>> 16);
                    crc32.update(readInt2 >>> 8);
                    crc32.update(readInt2);
                    crc32.update(bArr);
                    if (((int) crc32.getValue()) != readInt3) {
                        throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt3 + ", calculated CRC value: " + crc32.getValue());
                    }
                    PolarVoyageNavigationViewHyperHyperHyperion1793(bArr, 0);
                    PolarVoyageAlertDialogCyberHeroQuantum3938();
                    PolarVoyageDisplayMetricsVortexDragon9516(new PolarVoyageZipStrikeStrike1055(bArr));
                    z = true;
                } else if (readInt2 == 1767135348 && !z2) {
                    byte[] bArr2 = PolarVoyageCameraViewSpectraMaxSpectra2824;
                    if (readInt >= bArr2.length) {
                        int length = bArr2.length;
                        byte[] bArr3 = new byte[length];
                        polarVoyageZipStrikeStrike1055.readFully(bArr3);
                        if (Arrays.equals(bArr3, bArr2)) {
                            int i5 = polarVoyageZipStrikeStrike1055.PolarVoyageStrictModeLegendEpic1532 - i;
                            int i6 = readInt - length;
                            byte[] bArr4 = new byte[i6];
                            polarVoyageZipStrikeStrike1055.readFully(bArr4);
                            this.PolarVoyageViewRogueMaster4778 = new PolarVoyageSQLiteVortexPulsePrime3106(i5, bArr4, 1, i6);
                            z2 = true;
                        }
                    }
                }
                polarVoyageZipStrikeStrike1055.PolarVoyageMotionLayoutTransitionHeroVision4068(i3 - polarVoyageZipStrikeStrike1055.PolarVoyageStrictModeLegendEpic1532);
            } catch (EOFException e) {
                throw new IOException("Encountered corrupt PNG file.", e);
            }
        }
    }

    public final PolarVoyageSQLiteVortexPulsePrime3106 PolarVoyageKotlinBetaPulseBeta3653(String str) {
        PolarVoyageSQLiteVortexPulsePrime3106 polarVoyageSQLiteVortexPulsePrime3106;
        int i;
        PolarVoyageSQLiteVortexPulsePrime3106 polarVoyageSQLiteVortexPulsePrime31062;
        if ("ISOSpeedRatings".equals(str)) {
            if (PolarVoyageCameraPixelBlaze2629) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        if ("Xmp".equals(str) && (i = this.PolarVoyageKotlinBetaPulseBeta3653) != 4 && ((i == 9 || i == 15 || i == 12 || i == 13) && (polarVoyageSQLiteVortexPulsePrime31062 = this.PolarVoyageViewRogueMaster4778) != null)) {
            return polarVoyageSQLiteVortexPulsePrime31062;
        }
        for (int i2 = 0; i2 < PolarVoyageCardViewAlphaVortexCelestial9747.length; i2++) {
            PolarVoyageSQLiteVortexPulsePrime3106 polarVoyageSQLiteVortexPulsePrime31063 = (PolarVoyageSQLiteVortexPulsePrime3106) this.PolarVoyageBarcodeScannerInfernoSolarSpark7767[i2].get(str);
            if (polarVoyageSQLiteVortexPulsePrime31063 != null) {
                return polarVoyageSQLiteVortexPulsePrime31063;
            }
        }
        if (!"Xmp".equals(str) || (polarVoyageSQLiteVortexPulsePrime3106 = this.PolarVoyageViewRogueMaster4778) == null) {
            return null;
        }
        return polarVoyageSQLiteVortexPulsePrime3106;
    }

    public final void PolarVoyageLayerDrawableShadowTitaniumOmega1942(int i, int i2) {
        HashMap[] hashMapArr = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        boolean isEmpty = hashMapArr[i].isEmpty();
        boolean z = PolarVoyageCameraPixelBlaze2629;
        if (isEmpty || hashMapArr[i2].isEmpty()) {
            if (z) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        PolarVoyageSQLiteVortexPulsePrime3106 polarVoyageSQLiteVortexPulsePrime3106 = (PolarVoyageSQLiteVortexPulsePrime3106) hashMapArr[i].get("ImageLength");
        PolarVoyageSQLiteVortexPulsePrime3106 polarVoyageSQLiteVortexPulsePrime31062 = (PolarVoyageSQLiteVortexPulsePrime3106) hashMapArr[i].get("ImageWidth");
        PolarVoyageSQLiteVortexPulsePrime3106 polarVoyageSQLiteVortexPulsePrime31063 = (PolarVoyageSQLiteVortexPulsePrime3106) hashMapArr[i2].get("ImageLength");
        PolarVoyageSQLiteVortexPulsePrime3106 polarVoyageSQLiteVortexPulsePrime31064 = (PolarVoyageSQLiteVortexPulsePrime3106) hashMapArr[i2].get("ImageWidth");
        if (polarVoyageSQLiteVortexPulsePrime3106 == null || polarVoyageSQLiteVortexPulsePrime31062 == null) {
            if (z) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (polarVoyageSQLiteVortexPulsePrime31063 == null || polarVoyageSQLiteVortexPulsePrime31064 == null) {
            if (z) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int PolarVoyageBitmapVisionAuroraPixel4705 = polarVoyageSQLiteVortexPulsePrime3106.PolarVoyageBitmapVisionAuroraPixel4705(this.PolarVoyageDiffUtilTurboStrike5735);
        int PolarVoyageBitmapVisionAuroraPixel47052 = polarVoyageSQLiteVortexPulsePrime31062.PolarVoyageBitmapVisionAuroraPixel4705(this.PolarVoyageDiffUtilTurboStrike5735);
        int PolarVoyageBitmapVisionAuroraPixel47053 = polarVoyageSQLiteVortexPulsePrime31063.PolarVoyageBitmapVisionAuroraPixel4705(this.PolarVoyageDiffUtilTurboStrike5735);
        int PolarVoyageBitmapVisionAuroraPixel47054 = polarVoyageSQLiteVortexPulsePrime31064.PolarVoyageBitmapVisionAuroraPixel4705(this.PolarVoyageDiffUtilTurboStrike5735);
        if (PolarVoyageBitmapVisionAuroraPixel4705 >= PolarVoyageBitmapVisionAuroraPixel47053 || PolarVoyageBitmapVisionAuroraPixel47052 >= PolarVoyageBitmapVisionAuroraPixel47054) {
            return;
        }
        HashMap hashMap = hashMapArr[i];
        hashMapArr[i] = hashMapArr[i2];
        hashMapArr[i2] = hashMap;
    }

    public final void PolarVoyageMotionLayoutForceEpicAurora7183(PolarVoyageDrawableCompatSpectraPhoenixStrike3679 polarVoyageDrawableCompatSpectraPhoenixStrike3679, int i) {
        PolarVoyageSQLiteVortexPulsePrime3106 PolarVoyageKotlinBetaPulseBeta3653;
        PolarVoyageSQLiteVortexPulsePrime3106 PolarVoyageKotlinBetaPulseBeta36532;
        HashMap[] hashMapArr = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        PolarVoyageSQLiteVortexPulsePrime3106 polarVoyageSQLiteVortexPulsePrime3106 = (PolarVoyageSQLiteVortexPulsePrime3106) hashMapArr[i].get("DefaultCropSize");
        PolarVoyageSQLiteVortexPulsePrime3106 polarVoyageSQLiteVortexPulsePrime31062 = (PolarVoyageSQLiteVortexPulsePrime3106) hashMapArr[i].get("SensorTopBorder");
        PolarVoyageSQLiteVortexPulsePrime3106 polarVoyageSQLiteVortexPulsePrime31063 = (PolarVoyageSQLiteVortexPulsePrime3106) hashMapArr[i].get("SensorLeftBorder");
        PolarVoyageSQLiteVortexPulsePrime3106 polarVoyageSQLiteVortexPulsePrime31064 = (PolarVoyageSQLiteVortexPulsePrime3106) hashMapArr[i].get("SensorBottomBorder");
        PolarVoyageSQLiteVortexPulsePrime3106 polarVoyageSQLiteVortexPulsePrime31065 = (PolarVoyageSQLiteVortexPulsePrime3106) hashMapArr[i].get("SensorRightBorder");
        if (polarVoyageSQLiteVortexPulsePrime3106 != null) {
            int i2 = polarVoyageSQLiteVortexPulsePrime3106.PolarVoyageZipVortexCelestial6185;
            ByteOrder byteOrder = this.PolarVoyageDiffUtilTurboStrike5735;
            if (i2 == 5) {
                PolarVoyagePaintFlagsDrawFilterVisionPrimeThunder6273[] polarVoyagePaintFlagsDrawFilterVisionPrimeThunder6273Arr = (PolarVoyagePaintFlagsDrawFilterVisionPrimeThunder6273[]) polarVoyageSQLiteVortexPulsePrime3106.PolarVoyageTextInputEditTextNebulaHero6651(byteOrder);
                if (polarVoyagePaintFlagsDrawFilterVisionPrimeThunder6273Arr == null || polarVoyagePaintFlagsDrawFilterVisionPrimeThunder6273Arr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(polarVoyagePaintFlagsDrawFilterVisionPrimeThunder6273Arr));
                    return;
                }
                PolarVoyageKotlinBetaPulseBeta3653 = PolarVoyageSQLiteVortexPulsePrime3106.PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyagePaintFlagsDrawFilterVisionPrimeThunder6273Arr[0], this.PolarVoyageDiffUtilTurboStrike5735);
                PolarVoyageKotlinBetaPulseBeta36532 = PolarVoyageSQLiteVortexPulsePrime3106.PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyagePaintFlagsDrawFilterVisionPrimeThunder6273Arr[1], this.PolarVoyageDiffUtilTurboStrike5735);
            } else {
                int[] iArr = (int[]) polarVoyageSQLiteVortexPulsePrime3106.PolarVoyageTextInputEditTextNebulaHero6651(byteOrder);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                PolarVoyageKotlinBetaPulseBeta3653 = PolarVoyageSQLiteVortexPulsePrime3106.PolarVoyageKotlinBetaPulseBeta3653(iArr[0], this.PolarVoyageDiffUtilTurboStrike5735);
                PolarVoyageKotlinBetaPulseBeta36532 = PolarVoyageSQLiteVortexPulsePrime3106.PolarVoyageKotlinBetaPulseBeta3653(iArr[1], this.PolarVoyageDiffUtilTurboStrike5735);
            }
            hashMapArr[i].put("ImageWidth", PolarVoyageKotlinBetaPulseBeta3653);
            hashMapArr[i].put("ImageLength", PolarVoyageKotlinBetaPulseBeta36532);
            return;
        }
        if (polarVoyageSQLiteVortexPulsePrime31062 != null && polarVoyageSQLiteVortexPulsePrime31063 != null && polarVoyageSQLiteVortexPulsePrime31064 != null && polarVoyageSQLiteVortexPulsePrime31065 != null) {
            int PolarVoyageBitmapVisionAuroraPixel4705 = polarVoyageSQLiteVortexPulsePrime31062.PolarVoyageBitmapVisionAuroraPixel4705(this.PolarVoyageDiffUtilTurboStrike5735);
            int PolarVoyageBitmapVisionAuroraPixel47052 = polarVoyageSQLiteVortexPulsePrime31064.PolarVoyageBitmapVisionAuroraPixel4705(this.PolarVoyageDiffUtilTurboStrike5735);
            int PolarVoyageBitmapVisionAuroraPixel47053 = polarVoyageSQLiteVortexPulsePrime31065.PolarVoyageBitmapVisionAuroraPixel4705(this.PolarVoyageDiffUtilTurboStrike5735);
            int PolarVoyageBitmapVisionAuroraPixel47054 = polarVoyageSQLiteVortexPulsePrime31063.PolarVoyageBitmapVisionAuroraPixel4705(this.PolarVoyageDiffUtilTurboStrike5735);
            if (PolarVoyageBitmapVisionAuroraPixel47052 <= PolarVoyageBitmapVisionAuroraPixel4705 || PolarVoyageBitmapVisionAuroraPixel47053 <= PolarVoyageBitmapVisionAuroraPixel47054) {
                return;
            }
            PolarVoyageSQLiteVortexPulsePrime3106 PolarVoyageKotlinBetaPulseBeta36533 = PolarVoyageSQLiteVortexPulsePrime3106.PolarVoyageKotlinBetaPulseBeta3653(PolarVoyageBitmapVisionAuroraPixel47052 - PolarVoyageBitmapVisionAuroraPixel4705, this.PolarVoyageDiffUtilTurboStrike5735);
            PolarVoyageSQLiteVortexPulsePrime3106 PolarVoyageKotlinBetaPulseBeta36534 = PolarVoyageSQLiteVortexPulsePrime3106.PolarVoyageKotlinBetaPulseBeta3653(PolarVoyageBitmapVisionAuroraPixel47053 - PolarVoyageBitmapVisionAuroraPixel47054, this.PolarVoyageDiffUtilTurboStrike5735);
            hashMapArr[i].put("ImageLength", PolarVoyageKotlinBetaPulseBeta36533);
            hashMapArr[i].put("ImageWidth", PolarVoyageKotlinBetaPulseBeta36534);
            return;
        }
        PolarVoyageSQLiteVortexPulsePrime3106 polarVoyageSQLiteVortexPulsePrime31066 = (PolarVoyageSQLiteVortexPulsePrime3106) hashMapArr[i].get("ImageLength");
        PolarVoyageSQLiteVortexPulsePrime3106 polarVoyageSQLiteVortexPulsePrime31067 = (PolarVoyageSQLiteVortexPulsePrime3106) hashMapArr[i].get("ImageWidth");
        if (polarVoyageSQLiteVortexPulsePrime31066 == null || polarVoyageSQLiteVortexPulsePrime31067 == null) {
            PolarVoyageSQLiteVortexPulsePrime3106 polarVoyageSQLiteVortexPulsePrime31068 = (PolarVoyageSQLiteVortexPulsePrime3106) hashMapArr[i].get("JPEGInterchangeFormat");
            PolarVoyageSQLiteVortexPulsePrime3106 polarVoyageSQLiteVortexPulsePrime31069 = (PolarVoyageSQLiteVortexPulsePrime3106) hashMapArr[i].get("JPEGInterchangeFormatLength");
            if (polarVoyageSQLiteVortexPulsePrime31068 == null || polarVoyageSQLiteVortexPulsePrime31069 == null) {
                return;
            }
            int PolarVoyageBitmapVisionAuroraPixel47055 = polarVoyageSQLiteVortexPulsePrime31068.PolarVoyageBitmapVisionAuroraPixel4705(this.PolarVoyageDiffUtilTurboStrike5735);
            int PolarVoyageBitmapVisionAuroraPixel47056 = polarVoyageSQLiteVortexPulsePrime31068.PolarVoyageBitmapVisionAuroraPixel4705(this.PolarVoyageDiffUtilTurboStrike5735);
            polarVoyageDrawableCompatSpectraPhoenixStrike3679.PolarVoyageBarcodeScannerInfernoSolarSpark7767(PolarVoyageBitmapVisionAuroraPixel47055);
            byte[] bArr = new byte[PolarVoyageBitmapVisionAuroraPixel47056];
            polarVoyageDrawableCompatSpectraPhoenixStrike3679.readFully(bArr);
            PolarVoyageBitmapVisionAuroraPixel4705(new PolarVoyageZipStrikeStrike1055(bArr), PolarVoyageBitmapVisionAuroraPixel47055, i);
        }
    }

    public final String PolarVoyageMotionLayoutTransitionHeroVision4068(String str) {
        PolarVoyageSQLiteVortexPulsePrime3106 PolarVoyageKotlinBetaPulseBeta3653 = PolarVoyageKotlinBetaPulseBeta3653(str);
        if (PolarVoyageKotlinBetaPulseBeta3653 != null) {
            int i = PolarVoyageKotlinBetaPulseBeta3653.PolarVoyageZipVortexCelestial6185;
            if (str.equals("GPSTimeStamp")) {
                if (i != 5 && i != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i);
                    return null;
                }
                PolarVoyagePaintFlagsDrawFilterVisionPrimeThunder6273[] polarVoyagePaintFlagsDrawFilterVisionPrimeThunder6273Arr = (PolarVoyagePaintFlagsDrawFilterVisionPrimeThunder6273[]) PolarVoyageKotlinBetaPulseBeta3653.PolarVoyageTextInputEditTextNebulaHero6651(this.PolarVoyageDiffUtilTurboStrike5735);
                if (polarVoyagePaintFlagsDrawFilterVisionPrimeThunder6273Arr == null || polarVoyagePaintFlagsDrawFilterVisionPrimeThunder6273Arr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(polarVoyagePaintFlagsDrawFilterVisionPrimeThunder6273Arr));
                    return null;
                }
                PolarVoyagePaintFlagsDrawFilterVisionPrimeThunder6273 polarVoyagePaintFlagsDrawFilterVisionPrimeThunder6273 = polarVoyagePaintFlagsDrawFilterVisionPrimeThunder6273Arr[0];
                Integer valueOf = Integer.valueOf((int) (polarVoyagePaintFlagsDrawFilterVisionPrimeThunder6273.PolarVoyageZipVortexCelestial6185 / polarVoyagePaintFlagsDrawFilterVisionPrimeThunder6273.PolarVoyageMotionLayoutTransitionHeroVision4068));
                PolarVoyagePaintFlagsDrawFilterVisionPrimeThunder6273 polarVoyagePaintFlagsDrawFilterVisionPrimeThunder62732 = polarVoyagePaintFlagsDrawFilterVisionPrimeThunder6273Arr[1];
                Integer valueOf2 = Integer.valueOf((int) (polarVoyagePaintFlagsDrawFilterVisionPrimeThunder62732.PolarVoyageZipVortexCelestial6185 / polarVoyagePaintFlagsDrawFilterVisionPrimeThunder62732.PolarVoyageMotionLayoutTransitionHeroVision4068));
                PolarVoyagePaintFlagsDrawFilterVisionPrimeThunder6273 polarVoyagePaintFlagsDrawFilterVisionPrimeThunder62733 = polarVoyagePaintFlagsDrawFilterVisionPrimeThunder6273Arr[2];
                return String.format("%02d:%02d:%02d", valueOf, valueOf2, Integer.valueOf((int) (polarVoyagePaintFlagsDrawFilterVisionPrimeThunder62733.PolarVoyageZipVortexCelestial6185 / polarVoyagePaintFlagsDrawFilterVisionPrimeThunder62733.PolarVoyageMotionLayoutTransitionHeroVision4068)));
            }
            boolean contains = PolarVoyageAlarmManagerShadowHyperBeta8339.contains(str);
            ByteOrder byteOrder = this.PolarVoyageDiffUtilTurboStrike5735;
            if (!contains) {
                return PolarVoyageKotlinBetaPulseBeta3653.PolarVoyageDiffUtilTurboStrike5735(byteOrder);
            }
            try {
                return Double.toString(PolarVoyageKotlinBetaPulseBeta3653.PolarVoyageBarcodeScannerInfernoSolarSpark7767(byteOrder));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final void PolarVoyageNavigationViewHyperHyperHyperion1793(byte[] bArr, int i) {
        PolarVoyageDrawableCompatSpectraPhoenixStrike3679 polarVoyageDrawableCompatSpectraPhoenixStrike3679 = new PolarVoyageDrawableCompatSpectraPhoenixStrike3679(bArr);
        PolarVoyageSnackbarGammaEclipse2140(polarVoyageDrawableCompatSpectraPhoenixStrike3679);
        PolarVoyageAnimatorSetSparkUltraMax8233(polarVoyageDrawableCompatSpectraPhoenixStrike3679, i);
    }

    public final void PolarVoyageRotateAnimationCyberCelestialDelta4768(PolarVoyageDrawableCompatSpectraPhoenixStrike3679 polarVoyageDrawableCompatSpectraPhoenixStrike3679) {
        PolarVoyageSnackbarGammaEclipse2140(polarVoyageDrawableCompatSpectraPhoenixStrike3679);
        PolarVoyageAnimatorSetSparkUltraMax8233(polarVoyageDrawableCompatSpectraPhoenixStrike3679, 0);
        PolarVoyageMotionLayoutForceEpicAurora7183(polarVoyageDrawableCompatSpectraPhoenixStrike3679, 0);
        PolarVoyageMotionLayoutForceEpicAurora7183(polarVoyageDrawableCompatSpectraPhoenixStrike3679, 5);
        PolarVoyageMotionLayoutForceEpicAurora7183(polarVoyageDrawableCompatSpectraPhoenixStrike3679, 4);
        PolarVoyageAlertDialogCyberHeroQuantum3938();
        if (this.PolarVoyageKotlinBetaPulseBeta3653 == 8) {
            HashMap[] hashMapArr = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
            PolarVoyageSQLiteVortexPulsePrime3106 polarVoyageSQLiteVortexPulsePrime3106 = (PolarVoyageSQLiteVortexPulsePrime3106) hashMapArr[1].get("MakerNote");
            if (polarVoyageSQLiteVortexPulsePrime3106 != null) {
                PolarVoyageDrawableCompatSpectraPhoenixStrike3679 polarVoyageDrawableCompatSpectraPhoenixStrike36792 = new PolarVoyageDrawableCompatSpectraPhoenixStrike3679(polarVoyageSQLiteVortexPulsePrime3106.PolarVoyageBarcodeScannerInfernoSolarSpark7767);
                polarVoyageDrawableCompatSpectraPhoenixStrike36792.PolarVoyageRotateAnimationCyberCelestialDelta4768 = this.PolarVoyageDiffUtilTurboStrike5735;
                polarVoyageDrawableCompatSpectraPhoenixStrike36792.PolarVoyageMotionLayoutTransitionHeroVision4068(6);
                PolarVoyageAnimatorSetSparkUltraMax8233(polarVoyageDrawableCompatSpectraPhoenixStrike36792, 9);
                PolarVoyageSQLiteVortexPulsePrime3106 polarVoyageSQLiteVortexPulsePrime31062 = (PolarVoyageSQLiteVortexPulsePrime3106) hashMapArr[9].get("ColorSpace");
                if (polarVoyageSQLiteVortexPulsePrime31062 != null) {
                    hashMapArr[1].put("ColorSpace", polarVoyageSQLiteVortexPulsePrime31062);
                }
            }
        }
    }

    public final void PolarVoyageSnackbarGammaEclipse2140(PolarVoyageDrawableCompatSpectraPhoenixStrike3679 polarVoyageDrawableCompatSpectraPhoenixStrike3679) {
        ByteOrder PolarVoyageRemoteModelManagerOlympianCelestial91412 = PolarVoyageRemoteModelManagerOlympianCelestial9141(polarVoyageDrawableCompatSpectraPhoenixStrike3679);
        this.PolarVoyageDiffUtilTurboStrike5735 = PolarVoyageRemoteModelManagerOlympianCelestial91412;
        polarVoyageDrawableCompatSpectraPhoenixStrike3679.PolarVoyageRotateAnimationCyberCelestialDelta4768 = PolarVoyageRemoteModelManagerOlympianCelestial91412;
        int readUnsignedShort = polarVoyageDrawableCompatSpectraPhoenixStrike3679.readUnsignedShort();
        int i = this.PolarVoyageKotlinBetaPulseBeta3653;
        if (i != 7 && i != 10 && readUnsignedShort != 42) {
            PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageSnackbarGammaEclipse2140(Integer.toHexString(readUnsignedShort), "Invalid start code: ");
            return;
        }
        int readInt = polarVoyageDrawableCompatSpectraPhoenixStrike3679.readInt();
        if (readInt < 8) {
            PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageViewRogueMaster4778(PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageItemDecorationUltraDeltaEpic7485("Invalid first Ifd offset: ", readInt));
            return;
        }
        int i2 = readInt - 8;
        if (i2 > 0) {
            polarVoyageDrawableCompatSpectraPhoenixStrike3679.PolarVoyageMotionLayoutTransitionHeroVision4068(i2);
        }
    }

    public final void PolarVoyageStrictModeLegendEpic1532(PolarVoyageZipStrikeStrike1055 polarVoyageZipStrikeStrike1055) {
        boolean z = PolarVoyageCameraPixelBlaze2629;
        if (z) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + polarVoyageZipStrikeStrike1055);
        }
        polarVoyageZipStrikeStrike1055.PolarVoyageMotionLayoutTransitionHeroVision4068(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        polarVoyageZipStrikeStrike1055.readFully(bArr);
        polarVoyageZipStrikeStrike1055.readFully(bArr2);
        polarVoyageZipStrikeStrike1055.readFully(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        polarVoyageZipStrikeStrike1055.PolarVoyageMotionLayoutTransitionHeroVision4068(i - polarVoyageZipStrikeStrike1055.PolarVoyageStrictModeLegendEpic1532);
        polarVoyageZipStrikeStrike1055.readFully(bArr4);
        PolarVoyageBitmapVisionAuroraPixel4705(new PolarVoyageZipStrikeStrike1055(bArr4), i, 5);
        polarVoyageZipStrikeStrike1055.PolarVoyageMotionLayoutTransitionHeroVision4068(i3 - polarVoyageZipStrikeStrike1055.PolarVoyageStrictModeLegendEpic1532);
        polarVoyageZipStrikeStrike1055.PolarVoyageRotateAnimationCyberCelestialDelta4768 = ByteOrder.BIG_ENDIAN;
        int readInt = polarVoyageZipStrikeStrike1055.readInt();
        if (z) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i4 = 0; i4 < readInt; i4++) {
            int readUnsignedShort = polarVoyageZipStrikeStrike1055.readUnsignedShort();
            int readUnsignedShort2 = polarVoyageZipStrikeStrike1055.readUnsignedShort();
            if (readUnsignedShort == PolarVoyageViewBindingPulseHeroSpeed5705.PolarVoyageZipVortexCelestial6185) {
                short readShort = polarVoyageZipStrikeStrike1055.readShort();
                short readShort2 = polarVoyageZipStrikeStrike1055.readShort();
                PolarVoyageSQLiteVortexPulsePrime3106 PolarVoyageKotlinBetaPulseBeta3653 = PolarVoyageSQLiteVortexPulsePrime3106.PolarVoyageKotlinBetaPulseBeta3653(readShort, this.PolarVoyageDiffUtilTurboStrike5735);
                PolarVoyageSQLiteVortexPulsePrime3106 PolarVoyageKotlinBetaPulseBeta36532 = PolarVoyageSQLiteVortexPulsePrime3106.PolarVoyageKotlinBetaPulseBeta3653(readShort2, this.PolarVoyageDiffUtilTurboStrike5735);
                HashMap[] hashMapArr = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                hashMapArr[0].put("ImageLength", PolarVoyageKotlinBetaPulseBeta3653);
                hashMapArr[0].put("ImageWidth", PolarVoyageKotlinBetaPulseBeta36532);
                if (z) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) readShort) + ", width: " + ((int) readShort2));
                    return;
                }
                return;
            }
            polarVoyageZipStrikeStrike1055.PolarVoyageMotionLayoutTransitionHeroVision4068(readUnsignedShort2);
        }
    }

    public final void PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageDrawableCompatSpectraPhoenixStrike3679 polarVoyageDrawableCompatSpectraPhoenixStrike3679) {
        int i;
        int i2;
        PolarVoyageRotateAnimationCyberCelestialDelta4768(polarVoyageDrawableCompatSpectraPhoenixStrike3679);
        HashMap[] hashMapArr = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        PolarVoyageSQLiteVortexPulsePrime3106 polarVoyageSQLiteVortexPulsePrime3106 = (PolarVoyageSQLiteVortexPulsePrime3106) hashMapArr[1].get("MakerNote");
        if (polarVoyageSQLiteVortexPulsePrime3106 != null) {
            PolarVoyageDrawableCompatSpectraPhoenixStrike3679 polarVoyageDrawableCompatSpectraPhoenixStrike36792 = new PolarVoyageDrawableCompatSpectraPhoenixStrike3679(polarVoyageSQLiteVortexPulsePrime3106.PolarVoyageBarcodeScannerInfernoSolarSpark7767);
            polarVoyageDrawableCompatSpectraPhoenixStrike36792.PolarVoyageRotateAnimationCyberCelestialDelta4768 = this.PolarVoyageDiffUtilTurboStrike5735;
            byte[] bArr = PolarVoyageLayerDrawableShadowTitaniumOmega1942;
            byte[] bArr2 = new byte[bArr.length];
            polarVoyageDrawableCompatSpectraPhoenixStrike36792.readFully(bArr2);
            polarVoyageDrawableCompatSpectraPhoenixStrike36792.PolarVoyageBarcodeScannerInfernoSolarSpark7767(0L);
            byte[] bArr3 = PolarVoyageMotionLayoutForceEpicAurora7183;
            byte[] bArr4 = new byte[bArr3.length];
            polarVoyageDrawableCompatSpectraPhoenixStrike36792.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                polarVoyageDrawableCompatSpectraPhoenixStrike36792.PolarVoyageBarcodeScannerInfernoSolarSpark7767(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                polarVoyageDrawableCompatSpectraPhoenixStrike36792.PolarVoyageBarcodeScannerInfernoSolarSpark7767(12L);
            }
            PolarVoyageAnimatorSetSparkUltraMax8233(polarVoyageDrawableCompatSpectraPhoenixStrike36792, 6);
            PolarVoyageSQLiteVortexPulsePrime3106 polarVoyageSQLiteVortexPulsePrime31062 = (PolarVoyageSQLiteVortexPulsePrime3106) hashMapArr[7].get("PreviewImageStart");
            PolarVoyageSQLiteVortexPulsePrime3106 polarVoyageSQLiteVortexPulsePrime31063 = (PolarVoyageSQLiteVortexPulsePrime3106) hashMapArr[7].get("PreviewImageLength");
            if (polarVoyageSQLiteVortexPulsePrime31062 != null && polarVoyageSQLiteVortexPulsePrime31063 != null) {
                hashMapArr[5].put("JPEGInterchangeFormat", polarVoyageSQLiteVortexPulsePrime31062);
                hashMapArr[5].put("JPEGInterchangeFormatLength", polarVoyageSQLiteVortexPulsePrime31063);
            }
            PolarVoyageSQLiteVortexPulsePrime3106 polarVoyageSQLiteVortexPulsePrime31064 = (PolarVoyageSQLiteVortexPulsePrime3106) hashMapArr[8].get("AspectFrame");
            if (polarVoyageSQLiteVortexPulsePrime31064 != null) {
                int[] iArr = (int[]) polarVoyageSQLiteVortexPulsePrime31064.PolarVoyageTextInputEditTextNebulaHero6651(this.PolarVoyageDiffUtilTurboStrike5735);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i3 = iArr[2];
                int i4 = iArr[0];
                if (i3 <= i4 || (i = iArr[3]) <= (i2 = iArr[1])) {
                    return;
                }
                int i5 = (i3 - i4) + 1;
                int i6 = (i - i2) + 1;
                if (i5 < i6) {
                    int i7 = i5 + i6;
                    i6 = i7 - i6;
                    i5 = i7 - i6;
                }
                PolarVoyageSQLiteVortexPulsePrime3106 PolarVoyageKotlinBetaPulseBeta3653 = PolarVoyageSQLiteVortexPulsePrime3106.PolarVoyageKotlinBetaPulseBeta3653(i5, this.PolarVoyageDiffUtilTurboStrike5735);
                PolarVoyageSQLiteVortexPulsePrime3106 PolarVoyageKotlinBetaPulseBeta36532 = PolarVoyageSQLiteVortexPulsePrime3106.PolarVoyageKotlinBetaPulseBeta3653(i6, this.PolarVoyageDiffUtilTurboStrike5735);
                hashMapArr[0].put("ImageWidth", PolarVoyageKotlinBetaPulseBeta3653);
                hashMapArr[0].put("ImageLength", PolarVoyageKotlinBetaPulseBeta36532);
            }
        }
    }

    public final void PolarVoyageViewRogueMaster4778(PolarVoyageZipStrikeStrike1055 polarVoyageZipStrikeStrike1055) {
        if (PolarVoyageCameraPixelBlaze2629) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + polarVoyageZipStrikeStrike1055);
        }
        polarVoyageZipStrikeStrike1055.PolarVoyageRotateAnimationCyberCelestialDelta4768 = ByteOrder.LITTLE_ENDIAN;
        polarVoyageZipStrikeStrike1055.PolarVoyageMotionLayoutTransitionHeroVision4068(PolarVoyagePackageManagerCelestialPhoenix8393.length);
        int readInt = polarVoyageZipStrikeStrike1055.readInt() + 8;
        byte[] bArr = PolarVoyageLooperThreadAlphaPrime1279;
        polarVoyageZipStrikeStrike1055.PolarVoyageMotionLayoutTransitionHeroVision4068(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                polarVoyageZipStrikeStrike1055.readFully(bArr2);
                int readInt2 = polarVoyageZipStrikeStrike1055.readInt();
                int i = length + 8;
                if (Arrays.equals(PolarVoyageActivityInfoBetaQuantum8726, bArr2)) {
                    byte[] bArr3 = new byte[readInt2];
                    polarVoyageZipStrikeStrike1055.readFully(bArr3);
                    byte[] bArr4 = PolarVoyageCanvasElitePhoenix4750;
                    if (PolarVoyageConstraintSetClonePixelVortex4921.PolarVoyageMapTurboRogueTitan9291(bArr3, bArr4)) {
                        bArr3 = Arrays.copyOfRange(bArr3, bArr4.length, readInt2);
                    }
                    this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
                    PolarVoyageNavigationViewHyperHyperHyperion1793(bArr3, 0);
                    PolarVoyageDisplayMetricsVortexDragon9516(new PolarVoyageZipStrikeStrike1055(bArr3));
                    return;
                }
                if (readInt2 % 2 == 1) {
                    readInt2++;
                }
                length = i + readInt2;
                if (length == readInt) {
                    return;
                }
                if (length > readInt) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                polarVoyageZipStrikeStrike1055.PolarVoyageMotionLayoutTransitionHeroVision4068(readInt2);
            } catch (EOFException e) {
                throw new IOException("Encountered corrupt WebP file.", e);
            }
        }
    }

    public final void PolarVoyageZipVortexCelestial6185() {
        String PolarVoyageMotionLayoutTransitionHeroVision4068 = PolarVoyageMotionLayoutTransitionHeroVision4068("DateTimeOriginal");
        HashMap[] hashMapArr = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        if (PolarVoyageMotionLayoutTransitionHeroVision4068 != null && PolarVoyageMotionLayoutTransitionHeroVision4068("DateTime") == null) {
            HashMap hashMap = hashMapArr[0];
            byte[] bytes = PolarVoyageMotionLayoutTransitionHeroVision4068.concat("\u0000").getBytes(PolarVoyageConfigurationMaxSpectraForce5418);
            hashMap.put("DateTime", new PolarVoyageSQLiteVortexPulsePrime3106(bytes, 2, bytes.length));
        }
        if (PolarVoyageMotionLayoutTransitionHeroVision4068("ImageWidth") == null) {
            hashMapArr[0].put("ImageWidth", PolarVoyageSQLiteVortexPulsePrime3106.PolarVoyageZipVortexCelestial6185(0L, this.PolarVoyageDiffUtilTurboStrike5735));
        }
        if (PolarVoyageMotionLayoutTransitionHeroVision4068("ImageLength") == null) {
            hashMapArr[0].put("ImageLength", PolarVoyageSQLiteVortexPulsePrime3106.PolarVoyageZipVortexCelestial6185(0L, this.PolarVoyageDiffUtilTurboStrike5735));
        }
        if (PolarVoyageMotionLayoutTransitionHeroVision4068("Orientation") == null) {
            hashMapArr[0].put("Orientation", PolarVoyageSQLiteVortexPulsePrime3106.PolarVoyageZipVortexCelestial6185(0L, this.PolarVoyageDiffUtilTurboStrike5735));
        }
        if (PolarVoyageMotionLayoutTransitionHeroVision4068("LightSource") == null) {
            hashMapArr[1].put("LightSource", PolarVoyageSQLiteVortexPulsePrime3106.PolarVoyageZipVortexCelestial6185(0L, this.PolarVoyageDiffUtilTurboStrike5735));
        }
    }
}
