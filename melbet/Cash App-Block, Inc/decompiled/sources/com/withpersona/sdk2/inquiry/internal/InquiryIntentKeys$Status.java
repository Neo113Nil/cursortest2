package com.withpersona.sdk2.inquiry.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class InquiryIntentKeys$Status {
    public static final /* synthetic */ InquiryIntentKeys$Status[] $VALUES;
    public static final InquiryIntentKeys$Status INQUIRY_CANCELED;
    public static final InquiryIntentKeys$Status INQUIRY_ERROR;

    /* JADX INFO: Fake field, exist only in values array */
    InquiryIntentKeys$Status EF0;

    static {
        InquiryIntentKeys$Status inquiryIntentKeys$Status = new InquiryIntentKeys$Status("INQUIRY_COMPLETE", 0);
        InquiryIntentKeys$Status inquiryIntentKeys$Status2 = new InquiryIntentKeys$Status("INQUIRY_CANCELED", 1);
        INQUIRY_CANCELED = inquiryIntentKeys$Status2;
        InquiryIntentKeys$Status inquiryIntentKeys$Status3 = new InquiryIntentKeys$Status("INQUIRY_ERROR", 2);
        INQUIRY_ERROR = inquiryIntentKeys$Status3;
        $VALUES = new InquiryIntentKeys$Status[]{inquiryIntentKeys$Status, inquiryIntentKeys$Status2, inquiryIntentKeys$Status3};
    }

    public static InquiryIntentKeys$Status valueOf(String str) {
        return (InquiryIntentKeys$Status) Enum.valueOf(InquiryIntentKeys$Status.class, str);
    }

    public static InquiryIntentKeys$Status[] values() {
        return (InquiryIntentKeys$Status[]) $VALUES.clone();
    }
}
