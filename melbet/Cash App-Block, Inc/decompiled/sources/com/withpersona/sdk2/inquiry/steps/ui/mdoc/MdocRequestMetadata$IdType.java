package com.withpersona.sdk2.inquiry.steps.ui.mdoc;

import org.bouncycastle.asn1.ASN1Encoding;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class MdocRequestMetadata$IdType {
    public static final /* synthetic */ MdocRequestMetadata$IdType[] $VALUES;
    public static final MdocRequestMetadata$IdType DL;
    public static final MdocRequestMetadata$IdType PP;

    static {
        MdocRequestMetadata$IdType mdocRequestMetadata$IdType = new MdocRequestMetadata$IdType(ASN1Encoding.DL, 0);
        DL = mdocRequestMetadata$IdType;
        MdocRequestMetadata$IdType mdocRequestMetadata$IdType2 = new MdocRequestMetadata$IdType("PP", 1);
        PP = mdocRequestMetadata$IdType2;
        $VALUES = new MdocRequestMetadata$IdType[]{mdocRequestMetadata$IdType, mdocRequestMetadata$IdType2};
    }

    public static MdocRequestMetadata$IdType valueOf(String str) {
        return (MdocRequestMetadata$IdType) Enum.valueOf(MdocRequestMetadata$IdType.class, str);
    }

    public static MdocRequestMetadata$IdType[] values() {
        return (MdocRequestMetadata$IdType[]) $VALUES.clone();
    }
}
