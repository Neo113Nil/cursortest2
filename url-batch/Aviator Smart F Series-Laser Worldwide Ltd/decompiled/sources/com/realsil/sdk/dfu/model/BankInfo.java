package com.realsil.sdk.dfu.model;

/* loaded from: classes4.dex */
public final class BankInfo {
    public static final int BANK_NUMBER_0 = 0;
    public static final int BANK_NUMBER_1 = 1;
    public static final int BANK_NUMBER_F = 15;
    public static final int UPDATE_INDICATOR_BANK_0 = 1;
    public static final int UPDATE_INDICATOR_BANK_1 = 2;
    public static final int UPDATE_INDICATOR_STANDALONE = 0;

    /* renamed from: a, reason: collision with root package name */
    public boolean f16111a = false;
    public int bankIndicator = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f16112b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f16113c = 0;

    public int getActiveBankNumber() {
        return this.f16112b;
    }

    public int getUpdateBankNumber() {
        return this.f16113c;
    }

    public boolean isBankSupported() {
        return this.f16111a;
    }

    public void setActiveBankNumberIndicator(int i8) {
        if (i8 != 0) {
            this.f16111a = true;
        } else {
            this.f16111a = false;
        }
        this.bankIndicator = i8;
        if (!this.f16111a) {
            this.f16112b = 0;
            this.f16113c = 0;
        } else if (i8 == 1) {
            this.f16112b = 0;
            this.f16113c = 1;
        } else if (i8 == 2) {
            this.f16112b = 1;
            this.f16113c = 0;
        } else {
            this.f16112b = 0;
            this.f16113c = 0;
        }
    }

    public String toString() {
        return String.format("activeBankNumber=%d, updateBankNumber=%d", Integer.valueOf(this.f16112b), Integer.valueOf(this.f16113c));
    }
}
