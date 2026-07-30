package com.jieli.jl_audio_decode.constant;

import java.util.Locale;

/* loaded from: classes4.dex */
public class ErrorCode {
    public static final int ERR_ALLOC_FAIL = -7;
    public static final int ERR_BAD_ARGS = -1;
    public static final int ERR_BUFFER_TOO_SMALL = -2;
    public static final int ERR_ENC_FAILURE = -129;
    public static final int ERR_FILE_NOT_EXIST = -1002;
    public static final int ERR_INTERNAL_ERROR = -3;
    public static final int ERR_INVALID_PACKET = -4;
    public static final int ERR_INVALID_STATE = -6;
    public static final int ERR_IN_PROCESS = -1003;
    public static final int ERR_IO_EXCEPTION = -2000;
    public static final int ERR_NONE = 0;
    public static final int ERR_NONE_INIT = -1000;
    public static final int ERR_NOT_SUPPORT_FUNCTION = -1001;
    public static final int ERR_OPEN_FILE = -130;
    public static final int ERR_OP_FAIL = -1004;
    public static final int ERR_OUTPUT_EXCEPTION = -128;
    public static final int ERR_UNIMPLEMENTED = -5;

    public static String getErrorMsg(int i8) {
        if (i8 == -2000) {
            return "IO exception";
        }
        switch (i8) {
            case -1004:
                return "Operation Failed";
            case -1003:
                return "Operation in progress";
            case -1002:
                return "File does not exist";
            case -1001:
                return "Function not supported";
            case -1000:
                return "Not initialized";
            default:
                switch (i8) {
                    case ERR_OPEN_FILE /* -130 */:
                        return "Failed to open file.";
                    case ERR_ENC_FAILURE /* -129 */:
                        return "Encoding failed";
                    case ERR_OUTPUT_EXCEPTION /* -128 */:
                        return "Abnormal output data";
                    default:
                        switch (i8) {
                            case -7:
                                return "Memory allocation failed";
                            case -6:
                                return "Invalid state";
                            case -5:
                                return "Request not implemented";
                            case -4:
                                return "Corrupted stream";
                            case -3:
                                return "Internal error";
                            case -2:
                                return "Buffer too small";
                            case -1:
                                return "Invalid Argument";
                            case 0:
                                return "Success";
                            default:
                                return String.format(Locale.ENGLISH, "Unknown Error(%d)", Integer.valueOf(i8));
                        }
                }
        }
    }
}
