package io.flutter.embedding.engine.systemchannels;

import E.AbstractC0005f;
import io.flutter.Log;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugin.common.JSONMethodCodec;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class PlatformChannel {
    private static final String TAG = "PlatformChannel";
    public final MethodChannel channel;
    final MethodChannel.MethodCallHandler parsingMethodCallHandler;
    private PlatformMessageHandler platformMessageHandler;

    public static class AppSwitcherDescription {
        public final int color;
        public final String label;

        public AppSwitcherDescription(int i4, String str) {
            this.color = i4;
            this.label = str;
        }
    }

    public enum Brightness {
        LIGHT("Brightness.light"),
        DARK("Brightness.dark");

        private String encodedName;

        Brightness(String str) {
            this.encodedName = str;
        }

        public static Brightness fromValue(String str) throws NoSuchFieldException {
            for (Brightness brightness : values()) {
                if (brightness.encodedName.equals(str)) {
                    return brightness;
                }
            }
            throw new NoSuchFieldException(AbstractC0005f.n("No such Brightness: ", str));
        }
    }

    public enum ClipboardContentFormat {
        PLAIN_TEXT("text/plain");

        private String encodedName;

        ClipboardContentFormat(String str) {
            this.encodedName = str;
        }

        public static ClipboardContentFormat fromValue(String str) throws NoSuchFieldException {
            for (ClipboardContentFormat clipboardContentFormat : values()) {
                if (clipboardContentFormat.encodedName.equals(str)) {
                    return clipboardContentFormat;
                }
            }
            throw new NoSuchFieldException(AbstractC0005f.n("No such ClipboardContentFormat: ", str));
        }
    }

    public enum DeviceOrientation {
        PORTRAIT_UP("DeviceOrientation.portraitUp"),
        PORTRAIT_DOWN("DeviceOrientation.portraitDown"),
        LANDSCAPE_LEFT("DeviceOrientation.landscapeLeft"),
        LANDSCAPE_RIGHT("DeviceOrientation.landscapeRight");

        private String encodedName;

        DeviceOrientation(String str) {
            this.encodedName = str;
        }

        public static DeviceOrientation fromValue(String str) throws NoSuchFieldException {
            for (DeviceOrientation deviceOrientation : values()) {
                if (deviceOrientation.encodedName.equals(str)) {
                    return deviceOrientation;
                }
            }
            throw new NoSuchFieldException(AbstractC0005f.n("No such DeviceOrientation: ", str));
        }
    }

    public enum HapticFeedbackType {
        STANDARD(null),
        LIGHT_IMPACT("HapticFeedbackType.lightImpact"),
        MEDIUM_IMPACT("HapticFeedbackType.mediumImpact"),
        HEAVY_IMPACT("HapticFeedbackType.heavyImpact"),
        SELECTION_CLICK("HapticFeedbackType.selectionClick"),
        SUCCESS_NOTIFICATION("HapticFeedbackType.successNotification"),
        WARNING_NOTIFICATION("HapticFeedbackType.warningNotification"),
        ERROR_NOTIFICATION("HapticFeedbackType.errorNotification");

        private final String encodedName;

        HapticFeedbackType(String str) {
            this.encodedName = str;
        }

        public static HapticFeedbackType fromValue(String str) throws NoSuchFieldException {
            for (HapticFeedbackType hapticFeedbackType : values()) {
                String str2 = hapticFeedbackType.encodedName;
                if ((str2 == null && str == null) || (str2 != null && str2.equals(str))) {
                    return hapticFeedbackType;
                }
            }
            throw new NoSuchFieldException(AbstractC0005f.n("No such HapticFeedbackType: ", str));
        }
    }

    public interface PlatformMessageHandler {
        boolean clipboardHasStrings();

        CharSequence getClipboardData(ClipboardContentFormat clipboardContentFormat);

        void playSystemSound(SoundType soundType);

        void popSystemNavigator();

        void restoreSystemUiOverlays();

        void setApplicationSwitcherDescription(AppSwitcherDescription appSwitcherDescription);

        void setClipboardData(String str);

        default void setFrameworkHandlesBack(boolean z) {
        }

        void setPreferredOrientations(int i4);

        void setSystemUiChangeListener();

        void setSystemUiOverlayStyle(SystemChromeStyle systemChromeStyle);

        void share(String str);

        void showSystemOverlays(List<SystemUiOverlay> list);

        void showSystemUiMode(SystemUiMode systemUiMode);

        void vibrateHapticFeedback(HapticFeedbackType hapticFeedbackType);
    }

    public enum SoundType {
        CLICK("SystemSoundType.click"),
        TICK("SystemSoundType.tick"),
        ALERT("SystemSoundType.alert");

        private final String encodedName;

        SoundType(String str) {
            this.encodedName = str;
        }

        public static SoundType fromValue(String str) throws NoSuchFieldException {
            for (SoundType soundType : values()) {
                if (soundType.encodedName.equals(str)) {
                    return soundType;
                }
            }
            throw new NoSuchFieldException(AbstractC0005f.n("No such SoundType: ", str));
        }
    }

    public static class SystemChromeStyle {
        public final Integer statusBarColor;
        public final Brightness statusBarIconBrightness;
        public final Integer systemNavigationBarColor;
        public final Boolean systemNavigationBarContrastEnforced;
        public final Integer systemNavigationBarDividerColor;
        public final Brightness systemNavigationBarIconBrightness;
        public final Boolean systemStatusBarContrastEnforced;

        public SystemChromeStyle(Integer num, Brightness brightness, Boolean bool, Integer num2, Brightness brightness2, Integer num3, Boolean bool2) {
            this.statusBarColor = num;
            this.statusBarIconBrightness = brightness;
            this.systemStatusBarContrastEnforced = bool;
            this.systemNavigationBarColor = num2;
            this.systemNavigationBarIconBrightness = brightness2;
            this.systemNavigationBarDividerColor = num3;
            this.systemNavigationBarContrastEnforced = bool2;
        }
    }

    public enum SystemUiMode {
        LEAN_BACK("SystemUiMode.leanBack"),
        IMMERSIVE("SystemUiMode.immersive"),
        IMMERSIVE_STICKY("SystemUiMode.immersiveSticky"),
        EDGE_TO_EDGE("SystemUiMode.edgeToEdge");

        private String encodedName;

        SystemUiMode(String str) {
            this.encodedName = str;
        }

        public static SystemUiMode fromValue(String str) throws NoSuchFieldException {
            for (SystemUiMode systemUiMode : values()) {
                if (systemUiMode.encodedName.equals(str)) {
                    return systemUiMode;
                }
            }
            throw new NoSuchFieldException(AbstractC0005f.n("No such SystemUiMode: ", str));
        }
    }

    public enum SystemUiOverlay {
        TOP_OVERLAYS("SystemUiOverlay.top"),
        BOTTOM_OVERLAYS("SystemUiOverlay.bottom");

        private String encodedName;

        SystemUiOverlay(String str) {
            this.encodedName = str;
        }

        public static SystemUiOverlay fromValue(String str) throws NoSuchFieldException {
            for (SystemUiOverlay systemUiOverlay : values()) {
                if (systemUiOverlay.encodedName.equals(str)) {
                    return systemUiOverlay;
                }
            }
            throw new NoSuchFieldException(AbstractC0005f.n("No such SystemUiOverlay: ", str));
        }
    }

    public PlatformChannel(DartExecutor dartExecutor) {
        MethodChannel.MethodCallHandler methodCallHandler = new MethodChannel.MethodCallHandler() { // from class: io.flutter.embedding.engine.systemchannels.PlatformChannel.1
            /* JADX WARN: Removed duplicated region for block: B:25:0x013e A[Catch: JSONException -> 0x003f, TryCatch #8 {JSONException -> 0x003f, blocks: (B:5:0x002b, B:6:0x002f, B:11:0x00df, B:14:0x00e4, B:16:0x00f4, B:18:0x010d, B:20:0x0121, B:30:0x0125, B:23:0x0132, B:25:0x013e, B:27:0x014b, B:32:0x012a, B:33:0x0150, B:35:0x015e, B:37:0x0194, B:39:0x01a2, B:49:0x0233, B:42:0x024f, B:81:0x018b, B:88:0x01c9, B:74:0x01eb, B:60:0x020b, B:67:0x022b, B:53:0x0247, B:46:0x0263, B:90:0x0034, B:93:0x0042, B:96:0x004d, B:99:0x0059, B:102:0x0065, B:105:0x0070, B:108:0x007b, B:111:0x0085, B:114:0x008f, B:117:0x0099, B:120:0x00a3, B:123:0x00ad, B:126:0x00b8, B:129:0x00c3, B:132:0x00ce, B:56:0x01f4), top: B:4:0x002b, inners: #0, #5, #6, #10 }] */
            /* JADX WARN: Removed duplicated region for block: B:27:0x014b A[Catch: JSONException -> 0x003f, TryCatch #8 {JSONException -> 0x003f, blocks: (B:5:0x002b, B:6:0x002f, B:11:0x00df, B:14:0x00e4, B:16:0x00f4, B:18:0x010d, B:20:0x0121, B:30:0x0125, B:23:0x0132, B:25:0x013e, B:27:0x014b, B:32:0x012a, B:33:0x0150, B:35:0x015e, B:37:0x0194, B:39:0x01a2, B:49:0x0233, B:42:0x024f, B:81:0x018b, B:88:0x01c9, B:74:0x01eb, B:60:0x020b, B:67:0x022b, B:53:0x0247, B:46:0x0263, B:90:0x0034, B:93:0x0042, B:96:0x004d, B:99:0x0059, B:102:0x0065, B:105:0x0070, B:108:0x007b, B:111:0x0085, B:114:0x008f, B:117:0x0099, B:120:0x00a3, B:123:0x00ad, B:126:0x00b8, B:129:0x00c3, B:132:0x00ce, B:56:0x01f4), top: B:4:0x002b, inners: #0, #5, #6, #10 }] */
            @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
                char c4;
                ClipboardContentFormat fromValue;
                CharSequence clipboardData;
                if (PlatformChannel.this.platformMessageHandler == null) {
                    return;
                }
                String str = methodCall.method;
                Object obj = methodCall.arguments;
                Log.v(PlatformChannel.TAG, "Received '" + str + "' message.");
                try {
                    switch (str.hashCode()) {
                        case -1501580720:
                            if (str.equals("SystemNavigator.setFrameworkHandlesBack")) {
                                c4 = '\t';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -931781241:
                            if (str.equals("Share.invoke")) {
                                c4 = 14;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -766342101:
                            if (str.equals("SystemNavigator.pop")) {
                                c4 = '\n';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -720677196:
                            if (str.equals("Clipboard.setData")) {
                                c4 = '\f';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -577225884:
                            if (str.equals("SystemChrome.setSystemUIChangeListener")) {
                                c4 = 6;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -548468504:
                            if (str.equals("SystemChrome.setApplicationSwitcherDescription")) {
                                c4 = 3;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -247230243:
                            if (str.equals("HapticFeedback.vibrate")) {
                                c4 = 1;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -215273374:
                            if (str.equals("SystemSound.play")) {
                                c4 = 0;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 241845679:
                            if (str.equals("SystemChrome.restoreSystemUIOverlays")) {
                                c4 = 7;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 875995648:
                            if (str.equals("Clipboard.hasStrings")) {
                                c4 = '\r';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 1128339786:
                            if (str.equals("SystemChrome.setEnabledSystemUIMode")) {
                                c4 = 5;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 1390477857:
                            if (str.equals("SystemChrome.setSystemUIOverlayStyle")) {
                                c4 = '\b';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 1514180520:
                            if (str.equals("Clipboard.getData")) {
                                c4 = 11;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 1674312266:
                            if (str.equals("SystemChrome.setEnabledSystemUIOverlays")) {
                                c4 = 4;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 2119655719:
                            if (str.equals("SystemChrome.setPreferredOrientations")) {
                                c4 = 2;
                                break;
                            }
                            c4 = 65535;
                            break;
                        default:
                            c4 = 65535;
                            break;
                    }
                    switch (c4) {
                        case 0:
                            try {
                                PlatformChannel.this.platformMessageHandler.playSystemSound(SoundType.fromValue((String) obj));
                                result.success(null);
                                return;
                            } catch (NoSuchFieldException e4) {
                                result.error("error", e4.getMessage(), null);
                                return;
                            }
                        case 1:
                            try {
                                PlatformChannel.this.platformMessageHandler.vibrateHapticFeedback(HapticFeedbackType.fromValue((String) obj));
                                result.success(null);
                                return;
                            } catch (NoSuchFieldException e5) {
                                result.error("error", e5.getMessage(), null);
                                return;
                            }
                        case 2:
                            try {
                                PlatformChannel.this.platformMessageHandler.setPreferredOrientations(PlatformChannel.this.decodeOrientations((JSONArray) obj));
                                result.success(null);
                                return;
                            } catch (NoSuchFieldException | JSONException e6) {
                                result.error("error", e6.getMessage(), null);
                                return;
                            }
                        case 3:
                            try {
                                PlatformChannel.this.platformMessageHandler.setApplicationSwitcherDescription(PlatformChannel.this.decodeAppSwitcherDescription((JSONObject) obj));
                                result.success(null);
                                return;
                            } catch (JSONException e7) {
                                result.error("error", e7.getMessage(), null);
                                return;
                            }
                        case 4:
                            try {
                                PlatformChannel.this.platformMessageHandler.showSystemOverlays(PlatformChannel.this.decodeSystemUiOverlays((JSONArray) obj));
                                result.success(null);
                                return;
                            } catch (NoSuchFieldException | JSONException e8) {
                                result.error("error", e8.getMessage(), null);
                                return;
                            }
                        case 5:
                            try {
                                PlatformChannel.this.platformMessageHandler.showSystemUiMode(PlatformChannel.this.decodeSystemUiMode((String) obj));
                                result.success(null);
                                return;
                            } catch (NoSuchFieldException | JSONException e9) {
                                result.error("error", e9.getMessage(), null);
                                return;
                            }
                        case 6:
                            PlatformChannel.this.platformMessageHandler.setSystemUiChangeListener();
                            result.success(null);
                            return;
                        case 7:
                            PlatformChannel.this.platformMessageHandler.restoreSystemUiOverlays();
                            result.success(null);
                            return;
                        case '\b':
                            try {
                                PlatformChannel.this.platformMessageHandler.setSystemUiOverlayStyle(PlatformChannel.this.decodeSystemChromeStyle((JSONObject) obj));
                                result.success(null);
                                return;
                            } catch (NoSuchFieldException | JSONException e10) {
                                result.error("error", e10.getMessage(), null);
                                return;
                            }
                        case '\t':
                            PlatformChannel.this.platformMessageHandler.setFrameworkHandlesBack(((Boolean) obj).booleanValue());
                            result.success(null);
                            return;
                        case '\n':
                            PlatformChannel.this.platformMessageHandler.popSystemNavigator();
                            result.success(null);
                            return;
                        case 11:
                            String str2 = (String) obj;
                            if (str2 != null) {
                                try {
                                    fromValue = ClipboardContentFormat.fromValue(str2);
                                } catch (NoSuchFieldException unused) {
                                    result.error("error", "No such clipboard content format: ".concat(str2), null);
                                }
                                clipboardData = PlatformChannel.this.platformMessageHandler.getClipboardData(fromValue);
                                if (clipboardData != null) {
                                    result.success(null);
                                    return;
                                }
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("text", clipboardData);
                                result.success(jSONObject);
                                return;
                            }
                            fromValue = null;
                            clipboardData = PlatformChannel.this.platformMessageHandler.getClipboardData(fromValue);
                            if (clipboardData != null) {
                            }
                        case '\f':
                            PlatformChannel.this.platformMessageHandler.setClipboardData(((JSONObject) obj).getString("text"));
                            result.success(null);
                            return;
                        case '\r':
                            boolean clipboardHasStrings = PlatformChannel.this.platformMessageHandler.clipboardHasStrings();
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("value", clipboardHasStrings);
                            result.success(jSONObject2);
                            return;
                        case 14:
                            PlatformChannel.this.platformMessageHandler.share((String) obj);
                            result.success(null);
                            return;
                        default:
                            result.notImplemented();
                            return;
                    }
                } catch (JSONException e11) {
                    result.error("error", "JSON error: " + e11.getMessage(), null);
                }
                result.error("error", "JSON error: " + e11.getMessage(), null);
            }
        };
        this.parsingMethodCallHandler = methodCallHandler;
        MethodChannel methodChannel = new MethodChannel(dartExecutor, "flutter/platform", JSONMethodCodec.INSTANCE);
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(methodCallHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AppSwitcherDescription decodeAppSwitcherDescription(JSONObject jSONObject) throws JSONException {
        int i4 = jSONObject.getInt("primaryColor");
        if (i4 != 0) {
            i4 |= -16777216;
        }
        return new AppSwitcherDescription(i4, jSONObject.getString("label"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int decodeOrientations(JSONArray jSONArray) throws JSONException, NoSuchFieldException {
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < jSONArray.length(); i6++) {
            int ordinal = DeviceOrientation.fromValue(jSONArray.getString(i6)).ordinal();
            if (ordinal == 0) {
                i4 |= 1;
            } else if (ordinal == 1) {
                i4 |= 4;
            } else if (ordinal == 2) {
                i4 |= 2;
            } else if (ordinal == 3) {
                i4 |= 8;
            }
            if (i5 == 0) {
                i5 = i4;
            }
        }
        if (i4 == 0) {
            return -1;
        }
        switch (i4) {
            case 2:
                return 0;
            case 3:
            case 6:
            case 7:
            case 9:
            case 12:
            case 13:
            case 14:
                if (i5 != 2) {
                    if (i5 != 4) {
                        return i5 != 8 ? 1 : 8;
                    }
                    return 9;
                }
                return 0;
            case 4:
                return 9;
            case 5:
                return 12;
            case 8:
                return 8;
            case 10:
                return 11;
            case 11:
                return 2;
            case 15:
                return 13;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SystemChromeStyle decodeSystemChromeStyle(JSONObject jSONObject) throws JSONException, NoSuchFieldException {
        return new SystemChromeStyle(!jSONObject.isNull("statusBarColor") ? Integer.valueOf(jSONObject.getInt("statusBarColor")) : null, !jSONObject.isNull("statusBarIconBrightness") ? Brightness.fromValue(jSONObject.getString("statusBarIconBrightness")) : null, !jSONObject.isNull("systemStatusBarContrastEnforced") ? Boolean.valueOf(jSONObject.getBoolean("systemStatusBarContrastEnforced")) : null, !jSONObject.isNull("systemNavigationBarColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarColor")) : null, !jSONObject.isNull("systemNavigationBarIconBrightness") ? Brightness.fromValue(jSONObject.getString("systemNavigationBarIconBrightness")) : null, !jSONObject.isNull("systemNavigationBarDividerColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarDividerColor")) : null, jSONObject.isNull("systemNavigationBarContrastEnforced") ? null : Boolean.valueOf(jSONObject.getBoolean("systemNavigationBarContrastEnforced")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SystemUiMode decodeSystemUiMode(String str) throws JSONException, NoSuchFieldException {
        int ordinal = SystemUiMode.fromValue(str).ordinal();
        return ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? SystemUiMode.EDGE_TO_EDGE : SystemUiMode.EDGE_TO_EDGE : SystemUiMode.IMMERSIVE_STICKY : SystemUiMode.IMMERSIVE : SystemUiMode.LEAN_BACK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<SystemUiOverlay> decodeSystemUiOverlays(JSONArray jSONArray) throws JSONException, NoSuchFieldException {
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
            int ordinal = SystemUiOverlay.fromValue(jSONArray.getString(i4)).ordinal();
            if (ordinal == 0) {
                arrayList.add(SystemUiOverlay.TOP_OVERLAYS);
            } else if (ordinal == 1) {
                arrayList.add(SystemUiOverlay.BOTTOM_OVERLAYS);
            }
        }
        return arrayList;
    }

    public void setPlatformMessageHandler(PlatformMessageHandler platformMessageHandler) {
        this.platformMessageHandler = platformMessageHandler;
    }

    public void systemChromeChanged(boolean z) {
        Log.v(TAG, "Sending 'systemUIChange' message.");
        this.channel.invokeMethod("SystemChrome.systemUIChange", Arrays.asList(Boolean.valueOf(z)));
    }
}
