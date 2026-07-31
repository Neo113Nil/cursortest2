package io.opentelemetry.exporter.internal.grpc;

import com.google.android.gms.common.Scopes;
import io.opentelemetry.exporter.internal.marshal.CodedInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public final class GrpcExporterUtil {
    public static final int GRPC_STATUS_ABORTED = 10;
    public static final int GRPC_STATUS_CANCELLED = 1;
    public static final int GRPC_STATUS_DATA_LOSS = 15;
    public static final int GRPC_STATUS_DEADLINE_EXCEEDED = 4;
    public static final int GRPC_STATUS_OUT_OF_RANGE = 11;
    public static final int GRPC_STATUS_RESOURCE_EXHAUSTED = 8;
    public static final int GRPC_STATUS_UNAVAILABLE = 14;
    public static final int GRPC_STATUS_UNIMPLEMENTED = 12;
    public static final int GRPC_STATUS_UNKNOWN = 2;

    static void logUnimplemented(Logger logger, String str, @Nullable String str2) {
        String str3;
        if (Scopes.PROFILE.equals(str)) {
            logger.log(Level.SEVERE, "Failed to export profile. The profile signal type is still under development and the endpoint you are connecting to may not support it yet, or may support a different version. Full error message: " + str2);
            return;
        }
        str.hashCode();
        switch (str) {
            case "metric":
                str3 = "OTEL_METRICS_EXPORTER";
                break;
            case "log":
                str3 = "OTEL_LOGS_EXPORTER";
                break;
            case "span":
                str3 = "OTEL_TRACES_EXPORTER";
                break;
            default:
                throw new IllegalStateException("Unrecognized type, this is a programming bug in the OpenTelemetry SDK");
        }
        logger.log(Level.SEVERE, "Failed to export " + str + "s. Server responded with UNIMPLEMENTED. This usually means that your collector is not configured with an otlp receiver in the \"pipelines\" section of the configuration. If export is not desired and you are using OpenTelemetry autoconfiguration or the javaagent, disable export by setting " + str3 + "=none. Full error message: " + str2);
    }

    private GrpcExporterUtil() {
    }

    public static String getStatusMessage(byte[] bArr) throws IOException {
        CodedInputStream newInstance = CodedInputStream.newInstance(bArr);
        boolean z = false;
        while (!z) {
            int readTag = newInstance.readTag();
            if (readTag == 0) {
                z = true;
            } else {
                if (readTag == 18) {
                    return newInstance.readStringRequireUtf8();
                }
                newInstance.skipField(readTag);
            }
        }
        return "";
    }
}
