package org.apache.commons.imaging.internal;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.plaid.internal.EnumC0170g;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.awt.color.ICC_Profile;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes9.dex */
public final class Debug {
    private static final Logger LOGGER = Logger.getLogger(Debug.class.getName());
    private static final String NEWLINE = "\r\n";
    private static long counter;

    private Debug() {
    }

    private static String byteQuadToString(int i) {
        byte b = (byte) ((i >> 24) & 255);
        byte b2 = (byte) ((i >> 16) & 255);
        byte b3 = (byte) ((i >> 8) & 255);
        byte b4 = (byte) (i & 255);
        StringBuilder sb = new StringBuilder(31);
        Boxes$$ExternalSyntheticOutline1.m(sb, new String(new char[]{(char) b, (char) b2, (char) b3, (char) b4}), " bytequad: ", i, " b1: ");
        Recorder$$ExternalSyntheticOutline1.m105m((int) b, (int) b2, " b2: ", " b3: ", sb);
        return Recorder$$ExternalSyntheticOutline2.m(b3, b4, " b4: ", sb);
    }

    public static void debug(String str, Object obj) {
        if (obj == null) {
            debug(str, "null");
            return;
        }
        if (obj instanceof char[]) {
            debug(str, (char[]) obj);
            return;
        }
        if (obj instanceof byte[]) {
            debug(str, (byte[]) obj);
            return;
        }
        if (obj instanceof int[]) {
            debug(str, (int[]) obj);
            return;
        }
        if (obj instanceof String) {
            debug(str, (String) obj);
            return;
        }
        if (obj instanceof List) {
            debug(str, (List<?>) obj);
            return;
        }
        if (obj instanceof Map) {
            debug(str, (Map<?, ?>) obj);
            return;
        }
        if (obj instanceof ICC_Profile) {
            debug(str, (ICC_Profile) obj);
            return;
        }
        if (obj instanceof File) {
            debug(str, (File) obj);
            return;
        }
        if (obj instanceof Date) {
            debug(str, (Date) obj);
        } else if (obj instanceof Calendar) {
            debug(str, (Calendar) obj);
        } else {
            debug(str, obj.toString());
        }
    }

    private static String getDebug(Throwable th, int i) {
        String str;
        StringBuilder sb = new StringBuilder(35);
        String lowerCase = new SimpleDateFormat("yyyy-MM-dd kk:mm:ss:SSS", Locale.ENGLISH).format(new Date()).toLowerCase();
        sb.append(NEWLINE);
        StringBuilder sb2 = new StringBuilder("Throwable: ");
        if (th == null) {
            str = "";
        } else {
            str = "(" + th.getClass().getName() + ")";
        }
        sb.append(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb2, str, ":", lowerCase, NEWLINE));
        StringBuilder sb3 = new StringBuilder("Throwable: ");
        sb3.append(th == null ? "null" : th.getLocalizedMessage());
        sb3.append(NEWLINE);
        sb.append(sb3.toString());
        sb.append(NEWLINE);
        sb.append(getStackTrace(th, i));
        sb.append("Caught here:\r\n");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, getStackTrace(new Exception(), i, 1), NEWLINE);
    }

    private static String getStackTrace(Throwable th, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        if (th != null) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            if (stackTrace != null) {
                while (i2 < stackTrace.length && (i < 0 || i2 < i)) {
                    StackTraceElement stackTraceElement = stackTrace[i2];
                    sb.append("\tat " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + "(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ")\r\n");
                    i2++;
                }
                if (i >= 0 && stackTrace.length > i) {
                    sb.append("\t...\r\n");
                }
            }
            sb.append(NEWLINE);
        }
        return sb.toString();
    }

    private static String getStackTrace(Throwable th, int i) {
        return getStackTrace(th, i, 0);
    }

    public static void debug() {
        Logger logger = LOGGER;
        if (logger.isLoggable(Level.FINEST)) {
            logger.finest(NEWLINE);
        }
    }

    private static void debug(String str, Map<?, ?> map) {
        debug(getDebug(str, map));
    }

    public static void debug(String str) {
        Logger logger = LOGGER;
        if (logger.isLoggable(Level.FINEST)) {
            logger.finest(str);
        }
    }

    private static void debug(String str, byte[] bArr) {
        debug(getDebug(str, bArr));
    }

    private static void debug(String str, char[] cArr) {
        debug(getDebug(str, cArr));
    }

    private static void debug(String str, Calendar calendar) {
        debug(str, calendar == null ? "null" : new SimpleDateFormat("MM/dd/yyyy HH:mm:ss", Locale.ENGLISH).format(calendar.getTime()));
    }

    private static void debug(String str, Date date) {
        debug(str, date == null ? "null" : new SimpleDateFormat("MM/dd/yyyy HH:mm:ss", Locale.ENGLISH).format(date));
    }

    private static void debug(String str, File file) {
        StringBuilder m108m = Recorder$$ExternalSyntheticOutline2.m108m(str, ": ");
        m108m.append(file == null ? "null" : file.getPath());
        debug(m108m.toString());
    }

    private static void debug(String str, ICC_Profile iCC_Profile) {
        StringBuilder m3m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("ICC_Profile ", str, ": ");
        m3m.append(iCC_Profile == null ? "null" : iCC_Profile.toString());
        debug(m3m.toString());
        if (iCC_Profile != null) {
            debug("\t getProfileClass: " + byteQuadToString(iCC_Profile.getProfileClass()));
            debug("\t getPCSType: " + byteQuadToString(iCC_Profile.getPCSType()));
            debug("\t getColorSpaceType() : " + byteQuadToString(iCC_Profile.getColorSpaceType()));
        }
    }

    private static void debug(String str, int[] iArr) {
        debug(getDebug(str, iArr));
    }

    private static void debug(String str, List<?> list) {
        StringBuilder sb = new StringBuilder(" [");
        long j = counter;
        counter = 1 + j;
        String m = CameraState$Type$EnumUnboxingLocalUtility.m(j, "]", sb);
        StringBuilder m108m = Recorder$$ExternalSyntheticOutline2.m108m(str, " (");
        m108m.append(list.size());
        m108m.append(")");
        m108m.append(m);
        debug(m108m.toString());
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            debug("\t" + it.next().toString() + m);
        }
        debug();
    }

    private static String getDebug(String str, byte[] bArr) {
        return getDebug(str, bArr, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE);
    }

    private static String getDebug(String str, byte[] bArr, int i) {
        StringBuilder sb = new StringBuilder();
        if (bArr == null) {
            sb.append(str + " (null)\r\n");
        } else {
            StringBuilder m108m = Recorder$$ExternalSyntheticOutline2.m108m(str, " (");
            m108m.append(bArr.length);
            m108m.append(")\r\n");
            sb.append(m108m.toString());
            for (int i2 = 0; i2 < i && i2 < bArr.length; i2++) {
                int i3 = bArr[i2] & 255;
                char c = (i3 == 0 || i3 == 10 || i3 == 11 || i3 == 13) ? ' ' : (char) i3;
                StringBuilder m107m = Recorder$$ExternalSyntheticOutline2.m107m(i2, i3, "\t", ": ", " (");
                m107m.append(c);
                m107m.append(", 0x");
                m107m.append(Integer.toHexString(i3));
                m107m.append(")\r\n");
                sb.append(m107m.toString());
            }
            if (bArr.length > i) {
                sb.append("\t...\r\n");
            }
            sb.append(NEWLINE);
        }
        return sb.toString();
    }

    private static void debug(String str, String str2) {
        debug(str + " " + str2);
    }

    public static void debug(Throwable th) {
        debug(getDebug(th));
    }

    public static void debug(Throwable th, int i) {
        debug(getDebug(th, i));
    }

    private static String getDebug(String str, char[] cArr) {
        StringBuilder sb = new StringBuilder();
        if (cArr == null) {
            sb.append(str + " (null)\r\n");
        } else {
            StringBuilder m108m = Recorder$$ExternalSyntheticOutline2.m108m(str, " (");
            m108m.append(cArr.length);
            m108m.append(")\r\n");
            sb.append(m108m.toString());
            for (char c : cArr) {
                sb.append("\t" + c + " (" + (c & 255) + ")\r\n");
            }
            sb.append(NEWLINE);
        }
        return sb.toString();
    }

    private static String getDebug(String str, Map<?, ?> map) {
        StringBuilder sb = new StringBuilder();
        if (map == null) {
            return Recorder$$ExternalSyntheticOutline2.m$1(str, " map: null");
        }
        ArrayList arrayList = new ArrayList(map.keySet());
        StringBuilder m108m = Recorder$$ExternalSyntheticOutline2.m108m(str, " map: ");
        m108m.append(arrayList.size());
        m108m.append(NEWLINE);
        sb.append(m108m.toString());
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            sb.append("\t" + i + ": '" + obj + "' -> '" + map.get(obj) + "'\r\n");
        }
        sb.append(NEWLINE);
        return sb.toString();
    }

    private static String getDebug(Throwable th) {
        return getDebug(th, -1);
    }

    private static String getDebug(String str, int[] iArr) {
        StringBuilder sb = new StringBuilder();
        if (iArr == null) {
            sb.append(str + " (null)\r\n");
        } else {
            StringBuilder m108m = Recorder$$ExternalSyntheticOutline2.m108m(str, " (");
            m108m.append(iArr.length);
            m108m.append(")\r\n");
            sb.append(m108m.toString());
            for (int i : iArr) {
                sb.append("\t" + i + NEWLINE);
            }
            sb.append(NEWLINE);
        }
        return sb.toString();
    }
}
