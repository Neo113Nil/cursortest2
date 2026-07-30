package io.noties.markwon.core;

import androidx.annotation.NonNull;
import io.noties.markwon.l;
import org.commonmark.node.u;

/* loaded from: classes4.dex */
public class c implements l.c {
    @Override // io.noties.markwon.l.c
    public void visit(@NonNull l lVar, @NonNull u uVar) {
        lVar.blockStart(uVar);
        int length = lVar.length();
        lVar.visitChildren(uVar);
        lVar.setSpansForNodeOptional((l) uVar, length);
        lVar.blockEnd(uVar);
    }
}
