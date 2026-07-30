package com.realsil.sdk.dfu.exception;

import com.realsil.sdk.dfu.DfuException;

/* loaded from: classes4.dex */
public class LoadFileException extends DfuException {
    public static final int ERROR_CODE_IMAGE_VERSION_LOW = 4114;
    public static final int ERROR_COMBINE_PACK_MISSING_BUD = 4105;
    public static final int ERROR_COMBINE_PACK_NOT_SUPPORTED = 4103;
    public static final int ERROR_COMBINE_PACK_SUB_FILE_INVALID = 4106;
    public static final int ERROR_COMPRESS_PACK_NOT_SUPPORTED = 4120;
    public static final int ERROR_DATA_IMAGE_VERSION_LOW = 4113;
    public static final int ERROR_IMAGE_FILE_LOAD_FAILED = 4097;
    public static final int ERROR_IMAGE_FILE_NOT_EXIST = 4100;
    public static final int ERROR_IMAGE_FILE_TYPE_CONFLICT = 4102;
    public static final int ERROR_IMAGE_IC_TYPE_CONFLICT = 4101;
    public static final int ERROR_IMAGE_INVALID_PATH = 4098;
    public static final int ERROR_IMAGE_SUFFIX_INVALID = 4099;
    public static final int ERROR_INCOMPLETE_MISS_OTA_HEADER = 4115;
    public static final int ERROR_MASK = 4096;
    public static final int ERROR_MERGE_BANK_PACK_NOT_SUPPORTED = 4119;
    public static final int ERROR_NAND_FLASH_NOT_SUPPORTED = 4122;
    public static final int ERROR_NON_DUAL_BANK_NS_OTA_HEADER = 4112;
    public static final int ERROR_NOR_FLASH_NOT_SUPPORTED = 4121;
    public static final int ERROR_NO_AVAILABLE_FILE_TO_UPDATE = 4123;
    public static final int ERROR_PACK_EMPTY = 4110;
    public static final int ERROR_PACK_INCORRECT_FORMAT = 4117;
    public static final int ERROR_PACK_MP_NOT_SUPPORTED = 4116;
    public static final int ERROR_PACK_NOT_SUPPORTED = 4107;
    public static final int ERROR_PACK_NS_DUALBANK = 4111;
    public static final int ERROR_SECTION_SIZE_CHECK_FAILED = 4109;
    public static final int ERROR_SINGLE_NOT_COMMON_IMAGE = 4118;
    public static final int ERROR_SINGLE_NOT_SUPPORT = 4108;
    public static final int ERROR_VERSION_CHECK_LOW = 4104;
    public static final int SUCCESS = 4096;

    public LoadFileException(int i8) {
        super(i8);
    }

    public LoadFileException(String str, int i8) {
        super(str, i8);
    }
}
