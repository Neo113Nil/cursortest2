package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'A02' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: com.facebook.ads.redexgen.X.Ae, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class EnumC0295Ae implements InterfaceC1481ip<Map.Entry<?, ?>, Object> {
    public static byte[] A00;
    public static final /* synthetic */ EnumC0295Ae[] A01;
    public static final EnumC0295Ae A02;
    public static final EnumC0295Ae A03;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 64);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-61, -67, -47, 4, -17, -6, 3, -13};
    }

    static {
        A02();
        final String A012 = A01(0, 3, 56);
        final int i = 0;
        A02 = new EnumC0295Ae(A012, i) { // from class: com.facebook.ads.redexgen.X.1e
            {
                C0297Ag c0297Ag = null;
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.InterfaceC1481ip
            @CheckForNull
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final Object A43(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        };
        final String A013 = A01(3, 5, 110);
        final int i2 = 1;
        A03 = new EnumC0295Ae(A013, i2) { // from class: com.facebook.ads.redexgen.X.1d
            {
                C0297Ag c0297Ag = null;
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.InterfaceC1481ip
            @CheckForNull
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final Object A43(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        };
        A01 = A03();
    }

    public EnumC0295Ae(String $enum$name, int $enum$ordinal) {
    }

    public /* synthetic */ EnumC0295Ae(String str, int i, C0297Ag c0297Ag) {
        this(str, i);
    }

    public static /* synthetic */ EnumC0295Ae[] A03() {
        return new EnumC0295Ae[]{A02, A03};
    }

    public static EnumC0295Ae valueOf(String name) {
        return (EnumC0295Ae) Enum.valueOf(EnumC0295Ae.class, name);
    }

    public static EnumC0295Ae[] values() {
        return (EnumC0295Ae[]) A01.clone();
    }
}
