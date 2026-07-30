package com.my.lib;

import java.util.List;
import kotlin.Pair;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.Regex;

/* loaded from: classes4.dex */
public abstract class G {
    public static Pair a(String expression) {
        kotlin.jvm.internal.s.checkNotNullParameter(expression, "expression");
        List list = SequencesKt___SequencesKt.toList(Regex.findAll$default(new Regex("\\d+"), expression, 0, 2, null));
        if (list.size() >= 2) {
            return y5.h.to(Integer.valueOf(Integer.parseInt(((kotlin.text.j) list.get(0)).getValue())), Integer.valueOf(Integer.parseInt(((kotlin.text.j) list.get(1)).getValue())));
        }
        throw new IllegalArgumentException("Not enough numbers found in expression: " + expression);
    }
}
