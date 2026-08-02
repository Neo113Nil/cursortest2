package com.secrethq.store.util;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmInline;

/* compiled from: BillingDataSource.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0083@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0005J\u0010\u0010\u001a\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\r\u0010\tR\u0011\u0010\u000e\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\tR\u0011\u0010\u0010\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\tR\u0011\u0010\u0012\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\t\u0088\u0001\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Lcom/secrethq/store/util/BillingResponse;", "", "code", "", "constructor-impl", "(I)I", "canFailGracefully", "", "getCanFailGracefully-impl", "(I)Z", "getCode", "()I", "isNonrecoverableError", "isNonrecoverableError-impl", "isOk", "isOk-impl", "isRecoverableError", "isRecoverableError-impl", "isTerribleFailure", "isTerribleFailure-impl", "equals", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "app_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmInline
/* loaded from: classes3.dex */
final class BillingResponse {
    private final int code;

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ BillingResponse m355boximpl(int i) {
        return new BillingResponse(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m356constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m357equalsimpl(int i, Object obj) {
        return (obj instanceof BillingResponse) && i == ((BillingResponse) obj).m366unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m358equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: getCanFailGracefully-impl, reason: not valid java name */
    public static final boolean m359getCanFailGracefullyimpl(int i) {
        return i == 7;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m360hashCodeimpl(int i) {
        return i;
    }

    /* renamed from: isOk-impl, reason: not valid java name */
    public static final boolean m362isOkimpl(int i) {
        return i == 0;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m365toStringimpl(int i) {
        return "BillingResponse(code=" + i + ")";
    }

    public boolean equals(Object obj) {
        return m357equalsimpl(this.code, obj);
    }

    public int hashCode() {
        return m360hashCodeimpl(this.code);
    }

    public String toString() {
        return m365toStringimpl(this.code);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m366unboximpl() {
        return this.code;
    }

    private /* synthetic */ BillingResponse(int i) {
        this.code = i;
    }

    public final int getCode() {
        return this.code;
    }

    /* renamed from: isRecoverableError-impl, reason: not valid java name */
    public static final boolean m363isRecoverableErrorimpl(int i) {
        return SetsKt.setOf((Object[]) new Integer[]{6, -1}).contains(Integer.valueOf(i));
    }

    /* renamed from: isNonrecoverableError-impl, reason: not valid java name */
    public static final boolean m361isNonrecoverableErrorimpl(int i) {
        return SetsKt.setOf((Object[]) new Integer[]{2, 3, 5}).contains(Integer.valueOf(i));
    }

    /* renamed from: isTerribleFailure-impl, reason: not valid java name */
    public static final boolean m364isTerribleFailureimpl(int i) {
        return SetsKt.setOf((Object[]) new Integer[]{4, -2, 8, 1}).contains(Integer.valueOf(i));
    }
}
