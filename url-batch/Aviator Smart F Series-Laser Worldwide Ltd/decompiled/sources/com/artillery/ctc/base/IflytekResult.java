package com.artillery.ctc.base;

import androidx.annotation.Keep;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.r;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;

@Keep
/* loaded from: classes.dex */
public final class IflytekResult {
    private final int bg;
    private final int ed;
    private final boolean ls;
    private final String pgs;
    private final List<Integer> rg;
    private final Integer sn;
    private final JsonObject vad;
    private final List<Ws> ws;

    public IflytekResult(int i8, int i9, String str, List<Integer> list, Integer num, List<Ws> ws, boolean z7, JsonObject jsonObject) {
        s.checkNotNullParameter(ws, "ws");
        this.bg = i8;
        this.ed = i9;
        this.pgs = str;
        this.rg = list;
        this.sn = num;
        this.ws = ws;
        this.ls = z7;
        this.vad = jsonObject;
    }

    public final int component1() {
        return this.bg;
    }

    public final int component2() {
        return this.ed;
    }

    public final String component3() {
        return this.pgs;
    }

    public final List<Integer> component4() {
        return this.rg;
    }

    public final Integer component5() {
        return this.sn;
    }

    public final List<Ws> component6() {
        return this.ws;
    }

    public final boolean component7() {
        return this.ls;
    }

    public final JsonObject component8() {
        return this.vad;
    }

    public final IflytekResult copy(int i8, int i9, String str, List<Integer> list, Integer num, List<Ws> ws, boolean z7, JsonObject jsonObject) {
        s.checkNotNullParameter(ws, "ws");
        return new IflytekResult(i8, i9, str, list, num, ws, z7, jsonObject);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IflytekResult)) {
            return false;
        }
        IflytekResult iflytekResult = (IflytekResult) obj;
        return this.bg == iflytekResult.bg && this.ed == iflytekResult.ed && s.areEqual(this.pgs, iflytekResult.pgs) && s.areEqual(this.rg, iflytekResult.rg) && s.areEqual(this.sn, iflytekResult.sn) && s.areEqual(this.ws, iflytekResult.ws) && this.ls == iflytekResult.ls && s.areEqual(this.vad, iflytekResult.vad);
    }

    public final int getBg() {
        return this.bg;
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

    public final Text getText() {
        String joinToString$default;
        Integer num = this.sn;
        List<Ws> list = this.ws;
        ArrayList arrayList = new ArrayList(r.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Ws) it.next()).getCw().get(0).getW());
        }
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList, "", null, null, 0, null, null, 62, null);
        List<Integer> list2 = this.rg;
        return new Text(num, this.bg, this.ed, joinToString$default, this.pgs, list2, false, this.ls, this.vad, 64, null);
    }

    public final JsonObject getVad() {
        return this.vad;
    }

    public final List<Ws> getWs() {
        return this.ws;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int i8 = ((this.bg * 31) + this.ed) * 31;
        String str = this.pgs;
        int hashCode = (i8 + (str == null ? 0 : str.hashCode())) * 31;
        List<Integer> list = this.rg;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.sn;
        int hashCode3 = (((hashCode2 + (num == null ? 0 : num.hashCode())) * 31) + this.ws.hashCode()) * 31;
        boolean z7 = this.ls;
        int i9 = z7;
        if (z7 != 0) {
            i9 = 1;
        }
        int i10 = (hashCode3 + i9) * 31;
        JsonObject jsonObject = this.vad;
        return i10 + (jsonObject != null ? jsonObject.hashCode() : 0);
    }

    public String toString() {
        return "IflytekResult(bg=" + this.bg + ", ed=" + this.ed + ", pgs=" + this.pgs + ", rg=" + this.rg + ", sn=" + this.sn + ", ws=" + this.ws + ", ls=" + this.ls + ", vad=" + this.vad + ')';
    }

    public /* synthetic */ IflytekResult(int i8, int i9, String str, List list, Integer num, List list2, boolean z7, JsonObject jsonObject, int i10, o oVar) {
        this(i8, (i10 & 2) != 0 ? 0 : i9, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : list, (i10 & 16) != 0 ? 0 : num, list2, (i10 & 64) != 0 ? false : z7, (i10 & 128) != 0 ? null : jsonObject);
    }
}
