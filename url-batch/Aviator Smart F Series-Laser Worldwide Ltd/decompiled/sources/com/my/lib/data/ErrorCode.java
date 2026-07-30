package com.my.lib.data;

import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class ErrorCode {
    public static final Companion Companion = new Companion(null);
    public static final String NO_ACCESS_SERVER = "1102";
    public static final String PARAMETER_ERROR = "5";
    public static final String TIME_OUT = "1101";
    public static final String UNKNOWN_ERROR = "1103";
    public static final String UPLOAD_FILE_ERROR = "1104";
    private final String code;
    private final String message;

    public static final class Companion {
        public /* synthetic */ Companion(o oVar) {
            this();
        }

        private Companion() {
        }
    }

    public ErrorCode(String code, String message) {
        s.checkNotNullParameter(code, "code");
        s.checkNotNullParameter(message, "message");
        this.code = code;
        this.message = message;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getMessage() {
        return this.message;
    }
}
