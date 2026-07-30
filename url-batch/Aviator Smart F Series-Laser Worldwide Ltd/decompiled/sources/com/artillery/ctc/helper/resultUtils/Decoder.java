package com.artillery.ctc.helper.resultUtils;

import androidx.annotation.Keep;
import com.artillery.ctc.base.Text;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.s;

@Keep
/* loaded from: classes.dex */
public final class Decoder {
    private int defc = 10;
    private List<Text> texts = ArraysKt___ArraysKt.toMutableList(new Text[10]);

    public final synchronized void decode(Text text) {
        List<Integer> rg;
        int intValue;
        int intValue2;
        try {
            s.checkNotNullParameter(text, "text");
            Integer sn = text.getSn();
            if ((sn != null ? sn.intValue() : 0) >= this.defc) {
                resize();
            }
            if (s.areEqual("rpl", text.getPgs()) && (rg = text.getRg()) != null && (intValue = rg.get(0).intValue()) <= (intValue2 = rg.get(1).intValue())) {
                while (true) {
                    List<Text> list = this.texts;
                    Text text2 = list.get(intValue);
                    list.set(intValue, text2 != null ? text2.copy((r20 & 1) != 0 ? text2.sn : null, (r20 & 2) != 0 ? text2.bg : 0, (r20 & 4) != 0 ? text2.ed : 0, (r20 & 8) != 0 ? text2.text : null, (r20 & 16) != 0 ? text2.pgs : null, (r20 & 32) != 0 ? text2.rg : null, (r20 & 64) != 0 ? text2.deleted : true, (r20 & 128) != 0 ? text2.ls : false, (r20 & 256) != 0 ? text2.vad : null) : null);
                    if (intValue == intValue2) {
                        break;
                    } else {
                        intValue++;
                    }
                }
            }
            List<Text> list2 = this.texts;
            Integer sn2 = text.getSn();
            list2.set(sn2 != null ? sn2.intValue() : 0, text);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void discard() {
        int size = this.texts.size();
        for (int i8 = 0; i8 < size; i8++) {
            this.texts.set(i8, null);
        }
    }

    public final void resize() {
        int i8 = this.defc;
        int i9 = i8 << 1;
        this.defc = i9;
        List<Text> list = this.texts;
        this.texts = ArraysKt___ArraysKt.toMutableList(new Text[i9]);
        for (int i10 = 0; i10 < i8; i10++) {
            this.texts.set(i10, list.get(i10));
        }
    }

    public final String toResultString() {
        StringBuilder sb = new StringBuilder();
        for (Text text : this.texts) {
            if (text != null && !text.getDeleted()) {
                sb.append(text.getText());
            }
        }
        String sb2 = sb.toString();
        s.checkNotNullExpressionValue(sb2, "sb.toString()");
        return sb2;
    }
}
