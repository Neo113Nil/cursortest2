package com.artillery.ctc.base;

import androidx.annotation.Keep;
import com.google.gson.JsonObject;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;

@Keep
/* loaded from: classes.dex */
public final class Text {
    private final int bg;
    private final boolean deleted;
    private final int ed;
    private final boolean ls;
    private final String pgs;
    private final List<Integer> rg;
    private final Integer sn;
    private final String text;
    private final JsonObject vad;

    public Text() {
        this(null, 0, 0, null, null, null, false, false, null, 511, null);
    }

    public final Integer component1() {
        return this.sn;
    }

    public final int component2() {
        return this.bg;
    }

    public final int component3() {
        return this.ed;
    }

    public final String component4() {
        return this.text;
    }

    public final String component5() {
        return this.pgs;
    }

    public final List<Integer> component6() {
        return this.rg;
    }

    public final boolean component7() {
        return this.deleted;
    }

    public final boolean component8() {
        return this.ls;
    }

    public final JsonObject component9() {
        return this.vad;
    }

    public final Text copy(Integer num, int i8, int i9, String str, String str2, List<Integer> list, boolean z7, boolean z8, JsonObject jsonObject) {
        return new Text(num, i8, i9, str, str2, list, z7, z8, jsonObject);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Text)) {
            return false;
        }
        Text text = (Text) obj;
        return s.areEqual(this.sn, text.sn) && this.bg == text.bg && this.ed == text.ed && s.areEqual(this.text, text.text) && s.areEqual(this.pgs, text.pgs) && s.areEqual(this.rg, text.rg) && this.deleted == text.deleted && this.ls == text.ls && s.areEqual(this.vad, text.vad);
    }

    public final int getBg() {
        return this.bg;
    }

    public final boolean getDeleted() {
        return this.deleted;
    }

    public final int getEd() {
        return this.ed;
    }

    public final boolean getLs() {
        return this.ls;
    }

    public final String getPgs() {
        return this.pgs;
    }

    public final List<Integer> getRg() {
        return this.rg;
    }

    public final Integer getSn() {
        return this.sn;
    }

    public final String getText() {
        return this.text;
    }

    public final JsonObject getVad() {
        return this.vad;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        Integer num = this.sn;
        int hashCode = (((((num == null ? 0 : num.hashCode()) * 31) + this.bg) * 31) + this.ed) * 31;
        String str = this.text;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.pgs;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<Integer> list = this.rg;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        boolean z7 = this.deleted;
        int i8 = z7;
        if (z7 != 0) {
            i8 = 1;
        }
        int i9 = (hashCode4 + i8) * 31;
        boolean z8 = this.ls;
        int i10 = (i9 + (z8 ? 1 : z8 ? 1 : 0)) * 31;
        JsonObject jsonObject = this.vad;
        return i10 + (jsonObject != null ? jsonObject.hashCode() : 0);
    }

    public String toString() {
        return "Text(sn=" + this.sn + ", bg=" + this.bg + ", ed=" + this.ed + ", text=" + this.text + ", pgs=" + this.pgs + ", rg=" + this.rg + ", deleted=" + this.deleted + ", ls=" + this.ls + ", vad=" + this.vad + ')';
    }

    public Text(Integer num, int i8, int i9, String str, String str2, List<Integer> list, boolean z7, boolean z8, JsonObject jsonObject) {
        this.sn = num;
        this.bg = i8;
        this.ed = i9;
        this.text = str;
        this.pgs = str2;
        this.rg = list;
        this.deleted = z7;
        this.ls = z8;
        this.vad = jsonObject;
    }

    public /* synthetic */ Text(Integer num, int i8, int i9, String str, String str2, List list, boolean z7, boolean z8, JsonObject jsonObject, int i10, o oVar) {
        this((i10 & 1) != 0 ? 0 : num, (i10 & 2) != 0 ? 0 : i8, (i10 & 4) != 0 ? 0 : i9, (i10 & 8) != 0 ? null : str, (i10 & 16) != 0 ? null : str2, (i10 & 32) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i10 & 64) != 0 ? false : z7, (i10 & 128) == 0 ? z8 : false, (i10 & 256) == 0 ? jsonObject : null);
    }
}
