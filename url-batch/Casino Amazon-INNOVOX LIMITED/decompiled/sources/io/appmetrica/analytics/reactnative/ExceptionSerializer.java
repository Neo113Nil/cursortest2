package io.appmetrica.analytics.reactnative;

import android.util.Log;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import io.appmetrica.analytics.plugins.StackTraceItem;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes3.dex */
final class ExceptionSerializer {
    private static final String TAG = "ExceptionSerializer";

    private ExceptionSerializer() {
    }

    public static PluginErrorDetails fromObject(ReadableMap readableMap) {
        PluginErrorDetails.Builder builder = new PluginErrorDetails.Builder();
        builder.withPlatform(PluginErrorDetails.Platform.REACT_NATIVE);
        if (readableMap.hasKey("errorName")) {
            builder.withExceptionClass(readableMap.getString("errorName"));
        }
        if (readableMap.hasKey("message")) {
            builder.withMessage(readableMap.getString("message"));
        }
        if (readableMap.hasKey("stackTrace")) {
            builder.withStacktrace(getStackTrace(readableMap.getArray("stackTrace")));
        }
        if (readableMap.hasKey("virtualMachineVersion")) {
            builder.withVirtualMachineVersion(readableMap.getString("virtualMachineVersion"));
        }
        if (readableMap.hasKey("pluginEnvironment")) {
            builder.withPluginEnvironment(Utils.toMapOfStrings(readableMap.getMap("pluginEnvironment")));
        }
        return builder.build();
    }

    private static List<StackTraceItem> getStackTrace(ReadableArray readableArray) {
        if (readableArray == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < readableArray.toArrayList().size(); i++) {
            linkedList.add(getStackTraceItem(readableArray.getMap(i)));
        }
        return linkedList;
    }

    private static StackTraceItem getStackTraceItem(ReadableMap readableMap) {
        StackTraceItem.Builder builder = new StackTraceItem.Builder();
        if (readableMap == null) {
            return builder.build();
        }
        if (readableMap.hasKey("fileName")) {
            builder.withFileName(readableMap.getString("fileName"));
        }
        if (readableMap.hasKey("className")) {
            builder.withClassName(readableMap.getString("className"));
        }
        if (readableMap.hasKey("methodName")) {
            builder.withMethodName(readableMap.getString("methodName"));
        }
        if (readableMap.hasKey("line")) {
            builder.withLine(parseInt(readableMap.getString("line")));
        }
        if (readableMap.hasKey("column")) {
            builder.withColumn(parseInt(readableMap.getString("column")));
        }
        return builder.build();
    }

    private static Integer parseInt(String str) {
        if (str == null) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            Log.w(TAG, "uncorrected number in the stacktrace line or column: " + str);
            return null;
        }
    }
}
