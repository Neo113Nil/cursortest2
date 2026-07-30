package com.artillery.ctc.base;

import androidx.annotation.Keep;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;

@Keep
/* loaded from: classes.dex */
public final class StockQueryBody {
    public final String code;
    public final String name;
    public final int page;
    public final int pageSize;

    public StockQueryBody() {
        this(0, 0, null, null, 15, null);
    }

    public static /* synthetic */ StockQueryBody copy$default(StockQueryBody stockQueryBody, int i8, int i9, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i8 = stockQueryBody.pageSize;
        }
        if ((i10 & 2) != 0) {
            i9 = stockQueryBody.page;
        }
        if ((i10 & 4) != 0) {
            str = stockQueryBody.code;
        }
        if ((i10 & 8) != 0) {
            str2 = stockQueryBody.name;
        }
        return stockQueryBody.copy(i8, i9, str, str2);
    }

    public final int component1() {
        return this.pageSize;
    }

    public final int component2() {
        return this.page;
    }

    public final String component3() {
        return this.code;
    }

    public final String component4() {
        return this.name;
    }

    public final StockQueryBody copy(int i8, int i9, String str, String str2) {
        return new StockQueryBody(i8, i9, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StockQueryBody)) {
            return false;
        }
        StockQueryBody stockQueryBody = (StockQueryBody) obj;
        return this.pageSize == stockQueryBody.pageSize && this.page == stockQueryBody.page && s.areEqual(this.code, stockQueryBody.code) && s.areEqual(this.name, stockQueryBody.name);
    }

    public int hashCode() {
        int i8 = ((this.pageSize * 31) + this.page) * 31;
        String str = this.code;
        int hashCode = (i8 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.name;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "StockQueryBody(pageSize=" + this.pageSize + ", page=" + this.page + ", code=" + this.code + ", name=" + this.name + ')';
    }

    public StockQueryBody(int i8) {
        this(i8, 0, null, null, 14, null);
    }

    public StockQueryBody(int i8, int i9) {
        this(i8, i9, null, null, 12, null);
    }

    public StockQueryBody(int i8, int i9, String str) {
        this(i8, i9, str, null, 8, null);
    }

    public StockQueryBody(int i8, int i9, String str, String str2) {
        this.pageSize = i8;
        this.page = i9;
        this.code = str;
        this.name = str2;
    }

    public /* synthetic */ StockQueryBody(int i8, int i9, String str, String str2, int i10, o oVar) {
        this((i10 & 1) != 0 ? 20 : i8, (i10 & 2) != 0 ? 1 : i9, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : str2);
    }
}
